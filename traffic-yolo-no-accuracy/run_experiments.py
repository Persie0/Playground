from __future__ import annotations

import argparse
import gc
import hashlib
import json
import math
import random
import shutil
import struct
import subprocess
import sys
import tempfile
import time
import zipfile
from dataclasses import dataclass
from pathlib import Path
from statistics import median

import cv2
import ncnn
import numpy as np
import requests

COCO_ANNOTATIONS_URL = "http://images.cocodataset.org/annotations/annotations_trainval2017.zip"
COCO_IMAGE_BASE_URL = "http://images.cocodataset.org/val2017"

COCO_GROUPS = {
    "pedestrian": {1},
    "bicycle": {2},
    "vehicle": {3, 4, 6, 8},
}
MODEL_CLASS_TO_GROUP = {
    0: "pedestrian",
    1: "bicycle",
    2: "vehicle",
    3: "vehicle",
    5: "vehicle",
    7: "vehicle",
}
ROAD_CLASS_IDS = np.array([0, 1, 2, 3, 5, 7], dtype=np.int64)


@dataclass(frozen=True)
class EvalBox:
    x: float
    y: float
    width: float
    height: float
    score: float = 1.0


@dataclass(frozen=True)
class SelectedSample:
    image_id: int
    file_name: str
    width: int
    height: int
    annotations: dict[str, list[EvalBox]]


@dataclass(frozen=True)
class Candidate:
    name: str
    model_dir: Path
    bgr_to_rgb: bool = True
    normalize: bool = True
    pooled: bool = False
    reuse_extractor: bool = False


def percentile(values: list[float], p: float) -> float:
    if not values:
        return 0.0
    ordered = sorted(values)
    index = max(0, min(len(ordered) - 1, math.ceil(p * len(ordered)) - 1))
    return float(ordered[index])


def sha256_file(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as f:
        for chunk in iter(lambda: f.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def safe_div(a: float, b: float) -> float:
    return float(a) / float(b) if b else 0.0


def box_iou(a: EvalBox, b: EvalBox) -> float:
    ax2, ay2 = a.x + a.width, a.y + a.height
    bx2, by2 = b.x + b.width, b.y + b.height
    ix1, iy1 = max(a.x, b.x), max(a.y, b.y)
    ix2, iy2 = min(ax2, bx2), min(ay2, by2)
    iw, ih = max(0.0, ix2 - ix1), max(0.0, iy2 - iy1)
    intersection = iw * ih
    if intersection <= 0.0:
        return 0.0
    union = a.width * a.height + b.width * b.height - intersection
    return safe_div(intersection, union)


def match_boxes(predictions: list[EvalBox], ground_truth: list[EvalBox], iou_threshold: float = 0.5):
    predictions = sorted(predictions, key=lambda box: box.score, reverse=True)
    matched: set[int] = set()
    tp = 0
    iou_sum = 0.0
    for pred in predictions:
        best_idx = -1
        best_iou = 0.0
        for idx, gt in enumerate(ground_truth):
            if idx in matched:
                continue
            value = box_iou(pred, gt)
            if value > best_iou:
                best_iou = value
                best_idx = idx
        if best_idx >= 0 and best_iou >= iou_threshold:
            matched.add(best_idx)
            tp += 1
            iou_sum += best_iou
    return tp, len(predictions) - tp, len(ground_truth) - tp, iou_sum


def letterbox(image: np.ndarray, width: int = 384, height: int = 288):
    src_h, src_w = image.shape[:2]
    scale = min(width / float(src_w), height / float(src_h))
    resized_w = max(1, int(round(src_w * scale)))
    resized_h = max(1, int(round(src_h * scale)))
    resized = cv2.resize(
        image,
        (resized_w, resized_h),
        interpolation=cv2.INTER_AREA if scale < 1.0 else cv2.INTER_LINEAR,
    )
    pad_x = (width - resized_w) // 2
    pad_y = (height - resized_h) // 2
    padded = cv2.copyMakeBorder(
        resized,
        pad_y,
        height - resized_h - pad_y,
        pad_x,
        width - resized_w - pad_x,
        cv2.BORDER_CONSTANT,
        value=(114, 114, 114),
    )
    return padded, resized_w / float(src_w), resized_h / float(src_h), pad_x, pad_y


def transform_box(box: EvalBox, scale_x: float, scale_y: float, pad_x: int, pad_y: int) -> EvalBox:
    return EvalBox(
        x=(box.x * scale_x) + pad_x,
        y=(box.y * scale_y) + pad_y,
        width=box.width * scale_x,
        height=box.height * scale_y,
        score=box.score,
    )


def download(url: str, target: Path) -> Path:
    if target.is_file() and target.stat().st_size > 0:
        return target
    target.parent.mkdir(parents=True, exist_ok=True)
    partial = target.with_suffix(target.suffix + ".part")
    with requests.get(url, stream=True, timeout=(20, 180)) as response:
        response.raise_for_status()
        with partial.open("wb") as f:
            for chunk in response.iter_content(chunk_size=1024 * 1024):
                if chunk:
                    f.write(chunk)
    partial.replace(target)
    return target


def load_coco_annotations(cache_dir: Path) -> dict:
    archive_path = download(COCO_ANNOTATIONS_URL, cache_dir / "annotations_trainval2017.zip")
    with zipfile.ZipFile(archive_path) as archive:
        with archive.open("annotations/instances_val2017.json") as f:
            return json.load(f)


def select_samples(coco: dict, num_images: int, seed: int, min_aspect: float = 1.15, max_aspect: float = 1.55):
    images = {int(item["id"]): item for item in coco["images"]}
    grouped: dict[int, dict[str, list[EvalBox]]] = {}
    for ann in coco["annotations"]:
        if int(ann.get("iscrowd", 0)) != 0:
            continue
        image_id = int(ann["image_id"])
        info = images.get(image_id)
        if info is None:
            continue
        aspect = int(info["width"]) / float(int(info["height"]))
        if not min_aspect <= aspect <= max_aspect:
            continue
        category_id = int(ann["category_id"])
        group = next((name for name, ids in COCO_GROUPS.items() if category_id in ids), None)
        if group is None:
            continue
        x, y, w, h = [float(value) for value in ann["bbox"]]
        if w <= 1.0 or h <= 1.0:
            continue
        grouped.setdefault(image_id, {name: [] for name in COCO_GROUPS})[group].append(EvalBox(x, y, w, h))

    per_group = {name: [] for name in COCO_GROUPS}
    for image_id, groups in grouped.items():
        for name, boxes in groups.items():
            if boxes:
                per_group[name].append(image_id)

    rng = random.Random(seed)
    for ids in per_group.values():
        ids.sort()
        rng.shuffle(ids)

    selected: list[int] = []
    seen: set[int] = set()
    positions = {name: 0 for name in COCO_GROUPS}
    names = list(COCO_GROUPS)
    while len(selected) < num_images:
        progressed = False
        for name in names:
            ids = per_group[name]
            while positions[name] < len(ids):
                image_id = ids[positions[name]]
                positions[name] += 1
                if image_id in seen:
                    continue
                seen.add(image_id)
                selected.append(image_id)
                progressed = True
                break
            if len(selected) >= num_images:
                break
        if not progressed:
            break
    if len(selected) < num_images:
        raise RuntimeError(f"Only selected {len(selected)} images")

    return [
        SelectedSample(
            image_id=image_id,
            file_name=str(images[image_id]["file_name"]),
            width=int(images[image_id]["width"]),
            height=int(images[image_id]["height"]),
            annotations=grouped[image_id],
        )
        for image_id in selected
    ]


def download_images(samples: list[SelectedSample], target_dir: Path) -> None:
    target_dir.mkdir(parents=True, exist_ok=True)
    for index, sample in enumerate(samples, 1):
        download(f"{COCO_IMAGE_BASE_URL}/{sample.file_name}", target_dir / sample.file_name)
        if index % 30 == 0:
            print(f"Downloaded {index}/{len(samples)} images", flush=True)


def parse_layer_count(param_path: Path) -> tuple[int, int]:
    lines = param_path.read_text(encoding="utf-8").splitlines()
    layer_count, blob_count = [int(value) for value in lines[1].split()[:2]]
    return layer_count, blob_count


def patch_first_conv(
    source_dir: Path,
    target_dir: Path,
    *,
    divide_by_255: bool,
    swap_rgb_to_bgr: bool,
) -> dict:
    target_dir.mkdir(parents=True, exist_ok=True)
    shutil.copy2(source_dir / "model.ncnn.param", target_dir / "model.ncnn.param")
    if (source_dir / "metadata.yaml").is_file():
        shutil.copy2(source_dir / "metadata.yaml", target_dir / "metadata.yaml")

    data = bytearray((source_dir / "model.ncnn.bin").read_bytes())
    first_word = struct.unpack_from("<I", data, 0)[0]
    if first_word == 0x01306B47:
        raise RuntimeError("Unexpected fp16 first-layer storage in FP32 production model")
    offset = 4 if first_word == 0 else 0
    count = 16 * 3 * 3 * 3
    weights = np.frombuffer(data, dtype="<f4", count=count, offset=offset).copy().reshape(16, 3, 3, 3)
    original_stats = {
        "offset": offset,
        "first_word_hex": hex(first_word),
        "min": float(weights.min()),
        "max": float(weights.max()),
        "mean": float(weights.mean()),
    }
    if swap_rgb_to_bgr:
        weights = weights[:, [2, 1, 0], :, :]
    if divide_by_255:
        weights = weights / np.float32(255.0)

    payload = weights.astype("<f4", copy=False).tobytes()
    data[offset : offset + len(payload)] = payload
    (target_dir / "model.ncnn.bin").write_bytes(data)
    return original_stats


def optimize_model(tool: Path, source_dir: Path, target_dir: Path) -> dict:
    target_dir.mkdir(parents=True, exist_ok=True)
    subprocess.run(
        [
            str(tool),
            str(source_dir / "model.ncnn.param"),
            str(source_dir / "model.ncnn.bin"),
            str(target_dir / "model.ncnn.param"),
            str(target_dir / "model.ncnn.bin"),
            "0",
        ],
        check=True,
    )
    return {
        "source_layers": parse_layer_count(source_dir / "model.ncnn.param"),
        "target_layers": parse_layer_count(target_dir / "model.ncnn.param"),
        "source_param_bytes": (source_dir / "model.ncnn.param").stat().st_size,
        "target_param_bytes": (target_dir / "model.ncnn.param").stat().st_size,
        "source_bin_bytes": (source_dir / "model.ncnn.bin").stat().st_size,
        "target_bin_bytes": (target_dir / "model.ncnn.bin").stat().st_size,
    }


class Runner:
    def __init__(self, candidate: Candidate, threads: int):
        self.candidate = candidate
        self.blob_pool = None
        self.workspace_pool = None

        opt = ncnn.Option()
        opt.num_threads = threads
        if candidate.pooled:
            self.blob_pool = ncnn.UnlockedPoolAllocator()
            self.workspace_pool = ncnn.PoolAllocator()
            self.blob_pool.set_size_compare_ratio(0.0)
            self.workspace_pool.set_size_compare_ratio(0.5)
            opt.blob_allocator = self.blob_pool
            opt.workspace_allocator = self.workspace_pool

        self.net = ncnn.Net()
        self.net.opt = opt
        if int(self.net.load_param(str(candidate.model_dir / "model.ncnn.param"))) != 0:
            raise RuntimeError(f"Failed loading param for {candidate.name}")
        if int(self.net.load_model(str(candidate.model_dir / "model.ncnn.bin"))) != 0:
            raise RuntimeError(f"Failed loading model for {candidate.name}")
        self.extractor = self.net.create_extractor() if candidate.reuse_extractor else None

    def make_input(self, image: np.ndarray):
        pixel_type = (
            ncnn.Mat.PixelType.PIXEL_BGR2RGB
            if self.candidate.bgr_to_rgb
            else ncnn.Mat.PixelType.PIXEL_BGR
        )
        mat = ncnn.Mat.from_pixels(image, pixel_type, 384, 288)
        if self.candidate.normalize:
            mat.substract_mean_normalize([], [1.0 / 255.0, 1.0 / 255.0, 1.0 / 255.0])
        return mat

    def infer_output(self, image: np.ndarray):
        mat = self.make_input(image)
        ex = self.extractor if self.extractor is not None else self.net.create_extractor()
        if int(ex.input("in0", mat)) != 0:
            raise RuntimeError(f"input() failed for {self.candidate.name}")
        ret, output = ex.extract("out0")
        if int(ret) != 0:
            raise RuntimeError(f"extract() failed for {self.candidate.name}")
        return output

    def infer_array(self, image: np.ndarray) -> np.ndarray:
        output = self.infer_output(image)
        return np.array(output, dtype=np.float32)


def decode_array(arr: np.ndarray, class_aware_nms_indices, conf_threshold: float, road_only_argmax: bool = False):
    if arr.ndim != 2 or arr.shape[0] < 6:
        return []
    x, y, w, h = arr[0], arr[1], arr[2], arr[3]
    class_scores = arr[4:]
    if road_only_argmax:
        road_scores = class_scores[ROAD_CLASS_IDS]
        local_ids = np.argmax(road_scores, axis=0)
        class_ids = ROAD_CLASS_IDS[local_ids]
        confidences = road_scores[local_ids, np.arange(road_scores.shape[1])]
    else:
        class_ids = np.argmax(class_scores, axis=0)
        confidences = class_scores[class_ids, np.arange(class_scores.shape[1])]

    keep = confidences >= conf_threshold
    if not np.any(keep):
        return []
    x, y, w, h = x[keep], y[keep], w[keep], h[keep]
    class_ids, confidences = class_ids[keep], confidences[keep]
    x1 = x - (w / 2.0)
    y1 = y - (h / 2.0)

    boxes: list[list[int]] = []
    scores: list[float] = []
    labels: list[int] = []
    for i in range(len(confidences)):
        boxes.append(
            [
                int(round(float(x1[i]))),
                int(round(float(y1[i]))),
                max(1, int(round(float(w[i])))),
                max(1, int(round(float(h[i])))),
            ]
        )
        scores.append(float(confidences[i]))
        labels.append(int(class_ids[i]))

    selected = class_aware_nms_indices(
        boxes,
        scores,
        labels,
        score_threshold=conf_threshold,
        nms_threshold=0.5,
    )
    result = []
    for idx in selected:
        class_id = labels[idx]
        if class_id not in MODEL_CLASS_TO_GROUP:
            continue
        bx, by, bw, bh = boxes[idx]
        result.append((bx, by, bw, bh, float(scores[idx]), class_id))
    return result


def detections_equal(left, right, score_tolerance: float = 1e-6):
    if len(left) != len(right):
        return False, float("inf")
    max_score_delta = 0.0
    for a, b in zip(left, right):
        if a[:4] != b[:4] or a[5] != b[5]:
            return False, float("inf")
        max_score_delta = max(max_score_delta, abs(float(a[4]) - float(b[4])))
    return max_score_delta <= score_tolerance, max_score_delta


def init_stats():
    return {
        group: {
            "ground_truth": 0,
            "predictions": 0,
            "true_positives": 0,
            "false_positives": 0,
            "false_negatives": 0,
            "matched_iou_sum": 0.0,
        }
        for group in COCO_GROUPS
    }


def finalize_stats(stats: dict) -> dict:
    per_class = {}
    for group, item in stats.items():
        precision = safe_div(item["true_positives"], item["true_positives"] + item["false_positives"])
        recall = safe_div(item["true_positives"], item["true_positives"] + item["false_negatives"])
        f1 = safe_div(2.0 * precision * recall, precision + recall)
        per_class[group] = {
            **item,
            "precision": precision,
            "recall": recall,
            "f1": f1,
            "mean_matched_iou": safe_div(item["matched_iou_sum"], item["true_positives"]),
        }
    return {
        "macro_precision": sum(v["precision"] for v in per_class.values()) / len(per_class),
        "macro_recall": sum(v["recall"] for v in per_class.values()) / len(per_class),
        "macro_f1": sum(v["f1"] for v in per_class.values()) / len(per_class),
        "per_class": per_class,
    }


def update_accuracy(stats: dict, detections, sample: SelectedSample, transform) -> None:
    scale_x, scale_y, pad_x, pad_y = transform
    predicted = {name: [] for name in COCO_GROUPS}
    for x, y, w, h, score, class_id in detections:
        group = MODEL_CLASS_TO_GROUP.get(int(class_id))
        if group is not None:
            predicted[group].append(EvalBox(float(x), float(y), float(w), float(h), float(score)))
    for group in COCO_GROUPS:
        gt = [transform_box(box, scale_x, scale_y, pad_x, pad_y) for box in sample.annotations[group]]
        tp, fp, fn, iou_sum = match_boxes(predicted[group], gt)
        item = stats[group]
        item["ground_truth"] += len(gt)
        item["predictions"] += len(predicted[group])
        item["true_positives"] += tp
        item["false_positives"] += fp
        item["false_negatives"] += fn
        item["matched_iou_sum"] += iou_sum


def benchmark_runner(runner: Runner, image: np.ndarray, class_aware_nms_indices, warmup: int, iterations: int, rounds: int):
    for _ in range(warmup):
        arr = runner.infer_array(image)
        decode_array(arr, class_aware_nms_indices, 0.10)
    round_ms: list[float] = []
    for _ in range(rounds):
        started = time.perf_counter()
        for _ in range(iterations):
            arr = runner.infer_array(image)
            decode_array(arr, class_aware_nms_indices, 0.10)
        round_ms.append((time.perf_counter() - started) * 1000.0 / iterations)
    return {
        "median_ms": median(round_ms),
        "min_ms": min(round_ms),
        "max_ms": max(round_ms),
        "round_ms": round_ms,
    }


def profile_stages(runner: Runner, image: np.ndarray, class_aware_nms_indices, iterations: int):
    timings = {name: [] for name in ["from_pixels", "normalize", "create_extractor", "input", "extract", "numpy_copy", "decode"]}
    pixel_type = ncnn.Mat.PixelType.PIXEL_BGR2RGB
    for _ in range(iterations):
        t0 = time.perf_counter_ns()
        mat = ncnn.Mat.from_pixels(image, pixel_type, 384, 288)
        t1 = time.perf_counter_ns()
        mat.substract_mean_normalize([], [1.0 / 255.0, 1.0 / 255.0, 1.0 / 255.0])
        t2 = time.perf_counter_ns()
        ex = runner.net.create_extractor()
        t3 = time.perf_counter_ns()
        ret = int(ex.input("in0", mat))
        if ret != 0:
            raise RuntimeError("profile input failed")
        t4 = time.perf_counter_ns()
        ret, output = ex.extract("out0")
        if int(ret) != 0:
            raise RuntimeError("profile extract failed")
        t5 = time.perf_counter_ns()
        arr = np.array(output, dtype=np.float32)
        t6 = time.perf_counter_ns()
        decode_array(arr, class_aware_nms_indices, 0.10)
        t7 = time.perf_counter_ns()
        for name, start, end in [
            ("from_pixels", t0, t1),
            ("normalize", t1, t2),
            ("create_extractor", t2, t3),
            ("input", t3, t4),
            ("extract", t4, t5),
            ("numpy_copy", t5, t6),
            ("decode", t6, t7),
        ]:
            timings[name].append((end - start) / 1_000_000.0)
    return {
        name: {
            "median_ms": median(values),
            "p95_ms": percentile(values, 0.95),
            "p99_ms": percentile(values, 0.99),
        }
        for name, values in timings.items()
    }


def benchmark_numpy_conversion(output, iterations: int = 1000):
    expected = np.array(output, dtype=np.float32)
    methods = {}
    for name, fn in [
        ("np_array", lambda: np.array(output, dtype=np.float32)),
        ("np_asarray", lambda: np.asarray(output, dtype=np.float32)),
    ]:
        values = []
        last = None
        for _ in range(iterations):
            t0 = time.perf_counter_ns()
            last = fn()
            values.append((time.perf_counter_ns() - t0) / 1_000.0)
        assert last is not None
        methods[name] = {
            "median_us": median(values),
            "p95_us": percentile(values, 0.95),
            "equal": bool(np.array_equal(last, expected)),
            "owns_data": bool(last.flags.owndata),
            "base_type": type(last.base).__name__ if last.base is not None else None,
        }
    return methods


def compare_raw(candidate: np.ndarray, baseline: np.ndarray):
    if candidate.shape != baseline.shape:
        return {"same_shape": False}
    diff = np.abs(candidate.astype(np.float64) - baseline.astype(np.float64))
    return {
        "same_shape": True,
        "exact_equal": bool(np.array_equal(candidate, baseline)),
        "allclose_1e_6": bool(np.allclose(candidate, baseline, rtol=0.0, atol=1e-6)),
        "allclose_1e_5": bool(np.allclose(candidate, baseline, rtol=0.0, atol=1e-5)),
        "max_abs_diff": float(diff.max(initial=0.0)),
        "mean_abs_diff": float(diff.mean()),
    }


def build_markdown(payload: dict) -> str:
    lines = [
        "# YOLO11n NCNN no-accuracy-loss Playground experiments",
        "",
        f"- Baseline SHA: `{payload['baseline_sha']}`",
        f"- Images: {payload['dataset']['num_images']}",
        f"- Threads: {payload['threads']}",
        "- Platform: GitHub-hosted x86 runner. Speed deltas are candidate filters, not Raspberry Pi claims.",
        "",
        "## Candidate summary",
        "",
        "| Candidate | median ms | delta vs baseline | changed images | Macro F1 | decision |",
        "| --- | ---: | ---: | ---: | ---: | --- |",
    ]
    baseline_ms = payload["benchmarks"]["baseline"]["median_ms"]
    baseline_f1 = payload["accuracy"]["baseline"]["macro_f1"]
    for name, bench in payload["benchmarks"].items():
        accuracy = payload["accuracy"].get(name)
        changed = payload["equivalence"].get(name, {}).get("changed_detection_images", 0)
        delta = (bench["median_ms"] / baseline_ms - 1.0) * 100.0
        f1 = accuracy["macro_f1"] if accuracy else baseline_f1
        decision = payload["decisions"].get(name, "")
        lines.append(f"| {name} | {bench['median_ms']:.3f} | {delta:+.2f}% | {changed} | {f1:.6f} | {decision} |")

    lines += [
        "",
        "## Baseline stage profile",
        "",
        "| Stage | median ms | p95 ms |",
        "| --- | ---: | ---: |",
    ]
    for name, data in payload["stage_profile"].items():
        lines.append(f"| {name} | {data['median_ms']:.4f} | {data['p95_ms']:.4f} |")

    lines += [
        "",
        "## NumPy output conversion",
        "",
        "| Method | median µs | p95 µs | owns data | equal |",
        "| --- | ---: | ---: | --- | --- |",
    ]
    for name, data in payload["numpy_conversion"].items():
        lines.append(f"| {name} | {data['median_us']:.3f} | {data['p95_us']:.3f} | {data['owns_data']} | {data['equal']} |")

    pruning = payload["road_only_argmax"]
    lines += [
        "",
        "## Road-class-only argmax / class-head pruning semantics",
        "",
        f"- Images whose traffic detections change: **{pruning['changed_images']} / {payload['dataset']['num_images']}**",
        f"- Added/removed/reclassified traffic detections: **{pruning['changed_detection_count']}**",
        f"- Decision: **{pruning['decision']}**",
        "",
        "## ncnnoptimize",
        "",
        f"- Baseline graph: {payload['ncnnoptimize']['baseline']['source_layers']} -> {payload['ncnnoptimize']['baseline']['target_layers']}",
        f"- Input-fold graph: {payload['ncnnoptimize']['input_fold']['source_layers']} -> {payload['ncnnoptimize']['input_fold']['target_layers']}",
        "",
    ]
    return "\n".join(lines) + "\n"


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--private-repo", type=Path, required=True)
    parser.add_argument("--output-dir", type=Path, required=True)
    parser.add_argument("--ncnnoptimize", type=Path, required=True)
    parser.add_argument("--threads", type=int, default=4)
    parser.add_argument("--num-images", type=int, default=180)
    parser.add_argument("--seed", type=int, default=20260915)
    parser.add_argument("--warmup", type=int, default=10)
    parser.add_argument("--iterations", type=int, default=50)
    parser.add_argument("--rounds", type=int, default=5)
    args = parser.parse_args()

    private_repo = args.private_repo.resolve()
    output_dir = args.output_dir.resolve()
    output_dir.mkdir(parents=True, exist_ok=True)
    models_dir = output_dir / "models"
    models_dir.mkdir(parents=True, exist_ok=True)
    baseline_dir = private_repo / "edge" / "models" / "yolo11n_384x288_ncnn_model"

    sys.path.insert(0, str(private_repo / "edge" / "src"))
    from detectors.nms import class_aware_nms_indices

    baseline_sha = subprocess.check_output(["git", "-C", str(private_repo), "rev-parse", "HEAD"], text=True).strip()

    transform_meta = {}
    transform_meta["norm_fold"] = patch_first_conv(
        baseline_dir, models_dir / "norm_fold", divide_by_255=True, swap_rgb_to_bgr=False
    )
    transform_meta["bgr_fold"] = patch_first_conv(
        baseline_dir, models_dir / "bgr_fold", divide_by_255=False, swap_rgb_to_bgr=True
    )
    transform_meta["input_fold"] = patch_first_conv(
        baseline_dir, models_dir / "input_fold", divide_by_255=True, swap_rgb_to_bgr=True
    )

    optimizer_meta = {
        "baseline": optimize_model(args.ncnnoptimize.resolve(), baseline_dir, models_dir / "ncnnoptimize_fp32"),
        "input_fold": optimize_model(
            args.ncnnoptimize.resolve(), models_dir / "input_fold", models_dir / "input_fold_ncnnoptimize"
        ),
    }

    candidates = [
        Candidate("baseline", baseline_dir),
        Candidate("pooled_allocators", baseline_dir, pooled=True),
        Candidate("norm_fold", models_dir / "norm_fold", bgr_to_rgb=True, normalize=False),
        Candidate("bgr_fold", models_dir / "bgr_fold", bgr_to_rgb=False, normalize=True),
        Candidate("input_fold", models_dir / "input_fold", bgr_to_rgb=False, normalize=False),
        Candidate("ncnnoptimize_fp32", models_dir / "ncnnoptimize_fp32"),
        Candidate(
            "input_fold_ncnnoptimize",
            models_dir / "input_fold_ncnnoptimize",
            bgr_to_rgb=False,
            normalize=False,
        ),
        Candidate("extractor_reuse", baseline_dir, reuse_extractor=True),
        Candidate(
            "input_fold_pooled",
            models_dir / "input_fold",
            bgr_to_rgb=False,
            normalize=False,
            pooled=True,
        ),
    ]

    smoke_path = private_repo / "tools" / "camera_calibration" / "docs" / "example1_dewarped.jpg"
    smoke = cv2.imread(str(smoke_path))
    if smoke is None:
        raise RuntimeError(f"Missing smoke image {smoke_path}")
    smoke_processed = letterbox(smoke)[0]

    runners = {candidate.name: Runner(candidate, args.threads) for candidate in candidates}

    print("Benchmarking candidates...", flush=True)
    benchmarks = {}
    for candidate in candidates:
        benchmarks[candidate.name] = benchmark_runner(
            runners[candidate.name],
            smoke_processed,
            class_aware_nms_indices,
            args.warmup,
            args.iterations,
            args.rounds,
        )
        print(candidate.name, benchmarks[candidate.name], flush=True)

    print("Profiling baseline stages...", flush=True)
    stage_profile = profile_stages(runners["baseline"], smoke_processed, class_aware_nms_indices, 50)
    output_mat = runners["baseline"].infer_output(smoke_processed)
    numpy_conversion = benchmark_numpy_conversion(output_mat, 500)

    print("Preparing COCO traffic subset...", flush=True)
    cache_dir = output_dir / "_coco_cache"
    coco = load_coco_annotations(cache_dir)
    samples = select_samples(coco, args.num_images, args.seed)
    images_dir = cache_dir / "val2017"
    download_images(samples, images_dir)

    processed_cache = {}
    transforms = {}
    for sample in samples:
        image = cv2.imread(str(images_dir / sample.file_name))
        if image is None:
            raise RuntimeError(f"Could not read {sample.file_name}")
        processed, sx, sy, px, py = letterbox(image)
        processed_cache[sample.image_id] = processed
        transforms[sample.image_id] = (sx, sy, px, py)

    baseline_raw = {}
    baseline_dets = {}
    baseline_stats = init_stats()
    road_only_changed_images = 0
    road_only_changed_detection_count = 0
    print("Running baseline accuracy/reference pass...", flush=True)
    for index, sample in enumerate(samples, 1):
        arr = runners["baseline"].infer_array(processed_cache[sample.image_id])
        baseline_raw[sample.image_id] = arr
        dets = decode_array(arr, class_aware_nms_indices, 0.30)
        baseline_dets[sample.image_id] = dets
        update_accuracy(baseline_stats, dets, sample, transforms[sample.image_id])

        road = decode_array(arr, class_aware_nms_indices, 0.30, road_only_argmax=True)
        equal, _ = detections_equal(dets, road)
        if not equal:
            road_only_changed_images += 1
            road_only_changed_detection_count += abs(len(dets) - len(road)) + sum(
                1 for a, b in zip(dets, road) if a[:4] != b[:4] or a[5] != b[5]
            )
        if index % 30 == 0:
            print(f"Baseline {index}/{len(samples)}", flush=True)

    accuracy = {"baseline": finalize_stats(baseline_stats)}
    equivalence = {
        "baseline": {
            "changed_detection_images": 0,
            "max_score_delta": 0.0,
            "max_raw_abs_diff": 0.0,
            "exact_raw_images": len(samples),
        }
    }

    for candidate in candidates:
        if candidate.name == "baseline":
            continue
        print(f"Evaluating {candidate.name}...", flush=True)
        stats = init_stats()
        changed_images = 0
        max_score_delta = 0.0
        max_raw_abs_diff = 0.0
        exact_raw_images = 0
        allclose_1e5_images = 0
        for sample in samples:
            arr = runners[candidate.name].infer_array(processed_cache[sample.image_id])
            raw_cmp = compare_raw(arr, baseline_raw[sample.image_id])
            if raw_cmp.get("exact_equal"):
                exact_raw_images += 1
            if raw_cmp.get("allclose_1e_5"):
                allclose_1e5_images += 1
            max_raw_abs_diff = max(max_raw_abs_diff, float(raw_cmp.get("max_abs_diff", float("inf"))))
            dets = decode_array(arr, class_aware_nms_indices, 0.30)
            equal, score_delta = detections_equal(baseline_dets[sample.image_id], dets)
            if not equal:
                changed_images += 1
            if math.isfinite(score_delta):
                max_score_delta = max(max_score_delta, score_delta)
            update_accuracy(stats, dets, sample, transforms[sample.image_id])
        accuracy[candidate.name] = finalize_stats(stats)
        equivalence[candidate.name] = {
            "changed_detection_images": changed_images,
            "max_score_delta": max_score_delta,
            "max_raw_abs_diff": max_raw_abs_diff,
            "exact_raw_images": exact_raw_images,
            "allclose_1e5_images": allclose_1e5_images,
        }
        print(candidate.name, equivalence[candidate.name], accuracy[candidate.name], flush=True)

    baseline_f1 = accuracy["baseline"]["macro_f1"]
    decisions = {}
    for candidate in candidates:
        name = candidate.name
        if name == "baseline":
            decisions[name] = "baseline"
            continue
        eq = equivalence[name]
        same_f1 = abs(accuracy[name]["macro_f1"] - baseline_f1) < 1e-12
        faster = benchmarks[name]["median_ms"] < benchmarks["baseline"]["median_ms"] * 0.995
        if eq["changed_detection_images"] == 0 and same_f1 and faster:
            if name == "extractor_reuse":
                decisions[name] = "measured win, but API-lifetime/support review required"
            else:
                decisions[name] = "Playground winner; send to Pi confirmation"
        elif eq["changed_detection_images"] == 0 and same_f1:
            decisions[name] = "accuracy-safe but no stable hosted speed win"
        else:
            decisions[name] = "reject: detector outputs/accuracy changed"

    payload = {
        "baseline_sha": baseline_sha,
        "model": {
            "param_sha256": sha256_file(baseline_dir / "model.ncnn.param"),
            "bin_sha256": sha256_file(baseline_dir / "model.ncnn.bin"),
            "bin_bytes": (baseline_dir / "model.ncnn.bin").stat().st_size,
        },
        "dataset": {
            "num_images": len(samples),
            "seed": args.seed,
            "ground_truth_objects": {
                group: sum(len(sample.annotations[group]) for sample in samples)
                for group in COCO_GROUPS
            },
        },
        "threads": args.threads,
        "benchmarks": benchmarks,
        "accuracy": accuracy,
        "equivalence": equivalence,
        "decisions": decisions,
        "stage_profile": stage_profile,
        "numpy_conversion": numpy_conversion,
        "road_only_argmax": {
            "changed_images": road_only_changed_images,
            "changed_detection_count": road_only_changed_detection_count,
            "decision": (
                "reject exact class-head pruning: restricting argmax changes traffic semantics"
                if road_only_changed_images
                else "no semantic difference observed on this dataset; physical pruning still requires implementation"
            ),
        },
        "ncnnoptimize": optimizer_meta,
        "first_conv_patch": transform_meta,
        "candidate_models": {
            candidate.name: {
                "model_dir": str(candidate.model_dir),
                "bgr_to_rgb": candidate.bgr_to_rgb,
                "normalize": candidate.normalize,
                "pooled": candidate.pooled,
                "reuse_extractor": candidate.reuse_extractor,
            }
            for candidate in candidates
        },
    }

    (output_dir / "results.json").write_text(json.dumps(payload, indent=2, sort_keys=True), encoding="utf-8")
    (output_dir / "summary.md").write_text(build_markdown(payload), encoding="utf-8")
    print(build_markdown(payload), flush=True)

    shutil.rmtree(cache_dir, ignore_errors=True)


if __name__ == "__main__":
    main()
