from __future__ import annotations

import argparse
import json
import random
import sys
import tempfile
import time
import zipfile
from concurrent.futures import ThreadPoolExecutor, as_completed
from dataclasses import dataclass
from pathlib import Path

import cv2
import requests
import yaml

COCO_ANNOTATIONS_URL = "https://images.cocodataset.org/annotations/annotations_trainval2017.zip"
COCO_IMAGE_BASE_URL = "https://images.cocodataset.org/val2017"

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


@dataclass(frozen=True)
class ModelSpec:
    name: str
    model_dir: Path
    width: int
    height: int
    yolox: bool


@dataclass(frozen=True)
class EvalBox:
    x: float
    y: float
    width: float
    height: float
    score: float = 1.0


@dataclass
class ClassStats:
    ground_truth: int = 0
    predictions: int = 0
    true_positives: int = 0
    false_positives: int = 0
    false_negatives: int = 0
    matched_iou_sum: float = 0.0

    def to_dict(self) -> dict[str, float | int]:
        precision = safe_div(self.true_positives, self.true_positives + self.false_positives)
        recall = safe_div(self.true_positives, self.true_positives + self.false_negatives)
        f1 = safe_div(2.0 * precision * recall, precision + recall)
        return {
            "ground_truth": self.ground_truth,
            "predictions": self.predictions,
            "true_positives": self.true_positives,
            "false_positives": self.false_positives,
            "false_negatives": self.false_negatives,
            "precision": precision,
            "recall": recall,
            "f1": f1,
            "mean_matched_iou": safe_div(self.matched_iou_sum, self.true_positives),
        }


@dataclass(frozen=True)
class SelectedSample:
    image_id: int
    file_name: str
    width: int
    height: int
    annotations: dict[str, list[EvalBox]]


def safe_div(numerator: float, denominator: float) -> float:
    return float(numerator) / float(denominator) if denominator else 0.0


def box_iou(a: EvalBox, b: EvalBox) -> float:
    ax2 = a.x + a.width
    ay2 = a.y + a.height
    bx2 = b.x + b.width
    by2 = b.y + b.height

    ix1 = max(a.x, b.x)
    iy1 = max(a.y, b.y)
    ix2 = min(ax2, bx2)
    iy2 = min(ay2, by2)

    iw = max(0.0, ix2 - ix1)
    ih = max(0.0, iy2 - iy1)
    intersection = iw * ih
    if intersection <= 0.0:
        return 0.0

    union = max(0.0, a.width * a.height) + max(0.0, b.width * b.height) - intersection
    return safe_div(intersection, union)


def match_boxes(predictions: list[EvalBox], ground_truth: list[EvalBox], iou_threshold: float = 0.5) -> tuple[int, int, int, float]:
    predictions = sorted(predictions, key=lambda box: box.score, reverse=True)
    matched_gt: set[int] = set()
    true_positives = 0
    iou_sum = 0.0

    for pred in predictions:
        best_idx = -1
        best_iou = 0.0
        for idx, gt in enumerate(ground_truth):
            if idx in matched_gt:
                continue
            iou = box_iou(pred, gt)
            if iou > best_iou:
                best_iou = iou
                best_idx = idx
        if best_idx >= 0 and best_iou >= iou_threshold:
            matched_gt.add(best_idx)
            true_positives += 1
            iou_sum += best_iou

    false_positives = len(predictions) - true_positives
    false_negatives = len(ground_truth) - true_positives
    return true_positives, false_positives, false_negatives, iou_sum


def letterbox(image, width: int, height: int):
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


def _download(url: str, target: Path) -> Path:
    if target.is_file() and target.stat().st_size > 0:
        return target
    target.parent.mkdir(parents=True, exist_ok=True)
    partial = target.with_suffix(target.suffix + ".part")
    with requests.get(url, stream=True, timeout=(20, 180)) as response:
        response.raise_for_status()
        with open(partial, "wb") as f:
            for chunk in response.iter_content(chunk_size=1024 * 1024):
                if chunk:
                    f.write(chunk)
    partial.replace(target)
    return target


def load_coco_annotations(cache_dir: Path) -> dict:
    archive_path = _download(COCO_ANNOTATIONS_URL, cache_dir / "annotations_trainval2017.zip")
    with zipfile.ZipFile(archive_path) as archive:
        with archive.open("annotations/instances_val2017.json") as f:
            return json.load(f)


def select_samples(coco: dict, num_images: int, seed: int, min_aspect: float, max_aspect: float) -> list[SelectedSample]:
    images = {int(item["id"]): item for item in coco["images"]}
    grouped_annotations: dict[int, dict[str, list[EvalBox]]] = {}

    for ann in coco["annotations"]:
        if int(ann.get("iscrowd", 0)) != 0:
            continue
        image_id = int(ann["image_id"])
        image_info = images.get(image_id)
        if image_info is None:
            continue
        width = int(image_info["width"])
        height = int(image_info["height"])
        aspect = width / float(height)
        if not min_aspect <= aspect <= max_aspect:
            continue

        category_id = int(ann["category_id"])
        group = next((name for name, ids in COCO_GROUPS.items() if category_id in ids), None)
        if group is None:
            continue

        x, y, w, h = [float(value) for value in ann["bbox"]]
        if w <= 1.0 or h <= 1.0:
            continue
        grouped_annotations.setdefault(image_id, {name: [] for name in COCO_GROUPS})[group].append(
            EvalBox(x=x, y=y, width=w, height=h)
        )

    per_group: dict[str, list[int]] = {name: [] for name in COCO_GROUPS}
    for image_id, groups in grouped_annotations.items():
        for group_name, boxes in groups.items():
            if boxes:
                per_group[group_name].append(image_id)

    rng = random.Random(seed)
    for ids in per_group.values():
        ids.sort()
        rng.shuffle(ids)

    selected_ids: list[int] = []
    selected_set: set[int] = set()
    positions = {name: 0 for name in COCO_GROUPS}
    group_names = list(COCO_GROUPS)

    while len(selected_ids) < num_images:
        made_progress = False
        for group_name in group_names:
            ids = per_group[group_name]
            while positions[group_name] < len(ids):
                image_id = ids[positions[group_name]]
                positions[group_name] += 1
                if image_id in selected_set:
                    continue
                selected_set.add(image_id)
                selected_ids.append(image_id)
                made_progress = True
                break
            if len(selected_ids) >= num_images:
                break
        if not made_progress:
            break

    if len(selected_ids) < num_images:
        raise RuntimeError(f"Only found {len(selected_ids)} eligible COCO val images; requested {num_images}")

    result: list[SelectedSample] = []
    for image_id in selected_ids:
        info = images[image_id]
        result.append(
            SelectedSample(
                image_id=image_id,
                file_name=str(info["file_name"]),
                width=int(info["width"]),
                height=int(info["height"]),
                annotations=grouped_annotations[image_id],
            )
        )
    return result


def download_selected_images(samples: list[SelectedSample], target_dir: Path, workers: int = 16) -> None:
    target_dir.mkdir(parents=True, exist_ok=True)

    def _one(sample: SelectedSample) -> Path:
        return _download(f"{COCO_IMAGE_BASE_URL}/{sample.file_name}", target_dir / sample.file_name)

    with ThreadPoolExecutor(max_workers=workers) as executor:
        futures = [executor.submit(_one, sample) for sample in samples]
        for future in as_completed(futures):
            future.result()


def _write_detector_config(path: Path, spec: ModelSpec, threads: int) -> None:
    path.write_text(
        yaml.safe_dump(
            {
                "detector": {
                    "type": "ncnn",
                    "half": False,
                    "device": "cpu",
                    "img_width": spec.width,
                    "img_height": spec.height,
                    "conf_threshold": 0.3,
                    "iou_threshold": 0.5,
                    "ncnn": {
                        "model": str(spec.model_dir.resolve()),
                        "num_threads": threads,
                        "yolox": spec.yolox,
                    },
                }
            },
            sort_keys=False,
        ),
        encoding="utf-8",
    )


def evaluate_model(spec: ModelSpec, samples: list[SelectedSample], images_dir: Path, private_repo: Path, threads: int) -> dict:
    edge_dir = private_repo / "edge"
    edge_src = edge_dir / "src"
    if str(edge_src) not in sys.path:
        sys.path.insert(0, str(edge_src))

    from detectors.ncnn_detector import NcnnDetector
    from interfaces.image_loader import ProcessedImage
    from utils.config import Config

    class_stats = {name: ClassStats() for name in COCO_GROUPS}
    elapsed_s = 0.0

    with tempfile.TemporaryDirectory(prefix="traffic-coco-eval-") as temp_dir:
        config_path = Path(temp_dir) / f"{spec.name}.yaml"
        _write_detector_config(config_path, spec, threads)
        Config.load(config_path)
        detector = NcnnDetector()

        for sample_index, sample in enumerate(samples):
            image = cv2.imread(str(images_dir / sample.file_name))
            if image is None:
                raise RuntimeError(f"Could not read {sample.file_name}")

            processed, scale_x, scale_y, pad_x, pad_y = letterbox(image, spec.width, spec.height)
            processed_image = ProcessedImage(
                original_image=image,
                image=processed,
                original_width=image.shape[1],
                original_height=image.shape[0],
                width=spec.width,
                height=spec.height,
                scale_x=scale_x,
                scale_y=scale_y,
                pad_x=pad_x,
                pad_y=pad_y,
            )

            if sample_index == 0:
                detector.detect(processed_image)

            started = time.perf_counter()
            detections = detector.detect(processed_image)
            elapsed_s += time.perf_counter() - started

            predicted: dict[str, list[EvalBox]] = {name: [] for name in COCO_GROUPS}
            for box in list(detections.cars) + list(detections.pedestrians):
                group = MODEL_CLASS_TO_GROUP.get(int(box.class_id))
                if group is None:
                    continue
                predicted[group].append(
                    EvalBox(
                        x=float(box.x),
                        y=float(box.y),
                        width=float(box.width),
                        height=float(box.height),
                        score=float(box.score),
                    )
                )

            for group_name in COCO_GROUPS:
                gt = [transform_box(box, scale_x, scale_y, pad_x, pad_y) for box in sample.annotations[group_name]]
                pred = predicted[group_name]
                tp, fp, fn, iou_sum = match_boxes(pred, gt)
                stats = class_stats[group_name]
                stats.ground_truth += len(gt)
                stats.predictions += len(pred)
                stats.true_positives += tp
                stats.false_positives += fp
                stats.false_negatives += fn
                stats.matched_iou_sum += iou_sum

    per_class = {name: stats.to_dict() for name, stats in class_stats.items()}
    macro_precision = sum(float(item["precision"]) for item in per_class.values()) / len(per_class)
    macro_recall = sum(float(item["recall"]) for item in per_class.values()) / len(per_class)
    macro_f1 = sum(float(item["f1"]) for item in per_class.values()) / len(per_class)

    return {
        "input_width": spec.width,
        "input_height": spec.height,
        "tensor_pixels": spec.width * spec.height,
        "model_bin_bytes": (spec.model_dir / "model.ncnn.bin").stat().st_size,
        "num_images": len(samples),
        "average_detection_ms": (elapsed_s * 1000.0) / len(samples),
        "fps": len(samples) / elapsed_s,
        "macro_precision": macro_precision,
        "macro_recall": macro_recall,
        "macro_f1": macro_f1,
        "per_class": per_class,
    }


def recommend_model(results: dict[str, dict]) -> str:
    fastest_ms = min(float(result["average_detection_ms"]) for result in results.values())
    speed_limit = fastest_ms * 1.20
    eligible = {name: result for name, result in results.items() if float(result["average_detection_ms"]) <= speed_limit}
    return max(
        eligible,
        key=lambda name: (
            float(eligible[name]["macro_f1"]),
            float(eligible[name]["macro_recall"]),
            -float(eligible[name]["average_detection_ms"]),
        ),
    )


def write_markdown(output_path: Path, payload: dict) -> None:
    lines = [
        "# Detector accuracy benchmark",
        "",
        "Held-out benchmark on a deterministic subset of **COCO val2017** containing traffic-relevant objects.",
        "Only images with aspect ratio 1.15–1.55 are used to better approximate the 4:3 ZeroCam scene.",
        "Metrics use the production confidence threshold (0.30) and IoU=0.50, so these are operational precision/recall/F1 metrics rather than COCO mAP.",
        "",
        f"- Images: {payload['dataset']['num_images']}",
        f"- Seed: {payload['dataset']['seed']}",
        f"- Recommended model: **{payload['recommended_model']}**",
        "- Promotion rule: highest macro F1 among models within 20% of the fastest measured detector latency.",
        "",
        "| Model | Input | ms/image | FPS | Macro P | Macro R | Macro F1 | Vehicle F1 | Pedestrian F1 | Bicycle F1 |",
        "| --- | ---: | ---: | ---: | ---: | ---: | ---: | ---: | ---: | ---: |",
    ]
    for name, result in sorted(payload["models"].items()):
        pc = result["per_class"]
        lines.append(
            f"| {name} | {result['input_width']}×{result['input_height']} | "
            f"{result['average_detection_ms']:.2f} | {result['fps']:.1f} | "
            f"{result['macro_precision']:.3f} | {result['macro_recall']:.3f} | {result['macro_f1']:.3f} | "
            f"{pc['vehicle']['f1']:.3f} | {pc['pedestrian']['f1']:.3f} | {pc['bicycle']['f1']:.3f} |"
        )

    lines += [
        "",
        "## Per-class recall",
        "",
        "| Model | Vehicle | Pedestrian | Bicycle |",
        "| --- | ---: | ---: | ---: |",
    ]
    for name, result in sorted(payload["models"].items()):
        pc = result["per_class"]
        lines.append(
            f"| {name} | {pc['vehicle']['recall']:.3f} | {pc['pedestrian']['recall']:.3f} | {pc['bicycle']['recall']:.3f} |"
        )

    lines += [
        "",
        "## Notes",
        "",
        "- The dataset is independent COCO **validation** data, not the COCO training subset.",
        "- GitHub-hosted x86 timing is only a relative CPU comparison; Raspberry Pi 5 timing must still be measured on-device.",
        "- `bicycle` measures bicycle-object detection, not rider+bicycle association.",
        "- The production detector preserves the COCO class id in each returned box, which lets this benchmark separate people and bicycles even though both feed the existing pedestrian/wheel tracking path.",
        "",
    ]
    output_path.write_text("\n".join(lines), encoding="utf-8")


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(description="Evaluate traffic detector candidates on held-out COCO val2017 images.")
    parser.add_argument("--private-repo", type=Path, required=True)
    parser.add_argument("--generated-models", type=Path, required=True)
    parser.add_argument("--output-dir", type=Path, required=True)
    parser.add_argument("--num-images", type=int, default=180)
    parser.add_argument("--seed", type=int, default=20260915)
    parser.add_argument("--threads", type=int, default=4)
    parser.add_argument("--min-aspect", type=float, default=1.15)
    parser.add_argument("--max-aspect", type=float, default=1.55)
    return parser.parse_args()


def main() -> None:
    args = parse_args()
    private_repo = args.private_repo.resolve()
    edge_dir = private_repo / "edge"
    generated_models = args.generated_models.resolve()
    output_dir = args.output_dir.resolve()
    output_dir.mkdir(parents=True, exist_ok=True)

    specs = [
        ModelSpec(
            "yolo11n_384x288_production",
            edge_dir / "models" / "yolo11n_384x288_ncnn_model",
            384,
            288,
            False,
        ),
        ModelSpec(
            "yolo26n_384x288",
            generated_models / "yolo26n_384x288_ncnn_model",
            384,
            288,
            False,
        ),
    ]

    for spec in specs:
        for required in ("model.ncnn.param", "model.ncnn.bin"):
            if not (spec.model_dir / required).is_file():
                raise FileNotFoundError(f"{spec.name}: missing {spec.model_dir / required}")

    cache_dir = output_dir / "_coco_cache"
    coco = load_coco_annotations(cache_dir)
    samples = select_samples(coco, args.num_images, args.seed, args.min_aspect, args.max_aspect)
    images_dir = cache_dir / "val2017"
    download_selected_images(samples, images_dir)

    group_counts = {group_name: sum(len(sample.annotations[group_name]) for sample in samples) for group_name in COCO_GROUPS}
    results = {}
    for spec in specs:
        print(f"Evaluating {spec.name} on {len(samples)} images...", flush=True)
        results[spec.name] = evaluate_model(spec, samples, images_dir, private_repo, args.threads)
        print(json.dumps(results[spec.name], indent=2, sort_keys=True), flush=True)

    payload = {
        "dataset": {
            "name": "COCO val2017 traffic-relevant deterministic subset",
            "num_images": len(samples),
            "seed": args.seed,
            "aspect_ratio_range": [args.min_aspect, args.max_aspect],
            "ground_truth_objects": group_counts,
            "iou_threshold": 0.5,
            "confidence_threshold": 0.3,
        },
        "models": results,
    }
    payload["recommended_model"] = recommend_model(results)

    json_path = output_dir / "accuracy_benchmark.json"
    json_path.write_text(json.dumps(payload, indent=2, sort_keys=True), encoding="utf-8")
    write_markdown(output_dir / "accuracy_benchmark.md", payload)

    if cache_dir.exists():
        import shutil
        shutil.rmtree(cache_dir)

    print(f"Recommended model: {payload['recommended_model']}", flush=True)


if __name__ == "__main__":
    main()
