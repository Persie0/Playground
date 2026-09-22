from __future__ import annotations

import argparse
import copy
import json
import os
import shutil
import subprocess
import sys
import tempfile
import time
from pathlib import Path
from statistics import median

import cv2
import numpy as np
import torch
from torch import nn
from ultralytics import YOLO

HELPER_DIR = Path(__file__).resolve().parents[1] / "traffic-yolo-no-accuracy"
sys.path.insert(0, str(HELPER_DIR))
from run_experiments import (  # noqa: E402
    Candidate,
    ROAD_CLASS_IDS,
    Runner,
    compare_detections,
    decode_array,
    download_images,
    finalize_stats,
    init_stats,
    letterbox,
    load_coco_annotations,
    select_samples,
    update_accuracy,
)

SELECTED = [0, 1, 2, 3, 5, 7]
NAMES = {
    0: "person",
    1: "bicycle",
    2: "car",
    3: "motorcycle",
    4: "bus",
    5: "truck",
}


def patch_detect_head_to_six(yolo: YOLO) -> dict:
    detect = yolo.model.model[-1]
    if int(getattr(detect, "nc", -1)) != 80:
        raise RuntimeError(f"Expected 80-class Detect head, got nc={getattr(detect, 'nc', None)}")
    if not hasattr(detect, "cv3"):
        raise RuntimeError(f"Detect head {type(detect).__name__} has no cv3 classification branches")

    branch_info = []
    for branch_index, branch in enumerate(detect.cv3):
        old = branch[-1]
        if not isinstance(old, nn.Conv2d):
            raise RuntimeError(
                f"cv3[{branch_index}][-1] is {type(old).__name__}, expected torch.nn.Conv2d"
            )
        if old.out_channels != 80 or old.kernel_size != (1, 1):
            raise RuntimeError(
                f"Unexpected final classifier shape at branch {branch_index}: "
                f"out={old.out_channels}, kernel={old.kernel_size}"
            )

        new = nn.Conv2d(
            in_channels=old.in_channels,
            out_channels=len(SELECTED),
            kernel_size=old.kernel_size,
            stride=old.stride,
            padding=old.padding,
            dilation=old.dilation,
            groups=old.groups,
            bias=old.bias is not None,
            padding_mode=old.padding_mode,
            device=old.weight.device,
            dtype=old.weight.dtype,
        )
        with torch.no_grad():
            new.weight.copy_(old.weight[SELECTED])
            if old.bias is not None:
                new.bias.copy_(old.bias[SELECTED])
        branch[-1] = new
        branch_info.append(
            {
                "branch": branch_index,
                "in_channels": old.in_channels,
                "old_out_channels": old.out_channels,
                "new_out_channels": new.out_channels,
                "selected_original_class_ids": SELECTED,
            }
        )

    detect.nc = len(SELECTED)
    # Ultralytics Detect stores total per-anchor output width in no.
    detect.no = int(detect.nc + detect.reg_max * 4)

    # Keep model metadata consistent with the changed output.
    yolo.model.names = dict(NAMES)
    if isinstance(getattr(yolo.model, "yaml", None), dict):
        yolo.model.yaml["nc"] = len(SELECTED)
        yolo.model.yaml["names"] = dict(NAMES)

    return {
        "detect_type": type(detect).__name__,
        "reg_max": int(detect.reg_max),
        "new_nc": int(detect.nc),
        "new_no": int(detect.no),
        "branches": branch_info,
    }


def export_ncnn(yolo: YOLO, target: Path) -> Path:
    target.parent.mkdir(parents=True, exist_ok=True)
    exported = Path(
        yolo.export(
            format="ncnn",
            imgsz=(288, 384),
            batch=1,
            half=False,
            device="cpu",
            verbose=False,
        )
    ).resolve()
    if not exported.is_dir():
        raise RuntimeError(f"Ultralytics export did not return a model directory: {exported}")
    if target.exists():
        shutil.rmtree(target)
    shutil.move(str(exported), str(target))
    return target


def expand_pruned_output(arr: np.ndarray) -> np.ndarray:
    if arr.ndim != 2 or arr.shape[0] != 4 + len(SELECTED):
        raise RuntimeError(f"Expected pruned output [10,N], got {arr.shape}")
    expanded = np.zeros((84, arr.shape[1]), dtype=np.float32)
    expanded[:4] = arr[:4]
    for local_id, original_id in enumerate(SELECTED):
        expanded[4 + original_id] = arr[4 + local_id]
    return expanded


def benchmark(runner: Runner, image: np.ndarray, class_aware_nms_indices, *, rounds=7, warmup=10, iterations=50):
    for _ in range(warmup):
        arr = runner.infer_array(image)
        decode_array(arr, class_aware_nms_indices, 0.10)
    values = []
    for _ in range(rounds):
        started = time.perf_counter()
        for _ in range(iterations):
            arr = runner.infer_array(image)
            decode_array(arr, class_aware_nms_indices, 0.10)
        values.append((time.perf_counter() - started) * 1000.0 / iterations)
    return {
        "median_ms": median(values),
        "min_ms": min(values),
        "max_ms": max(values),
        "round_ms": values,
    }


def benchmark_pruned(runner: Runner, image: np.ndarray, class_aware_nms_indices, *, rounds=7, warmup=10, iterations=50):
    for _ in range(warmup):
        arr = expand_pruned_output(runner.infer_array(image))
        decode_array(arr, class_aware_nms_indices, 0.10)
    values = []
    for _ in range(rounds):
        started = time.perf_counter()
        for _ in range(iterations):
            arr = expand_pruned_output(runner.infer_array(image))
            decode_array(arr, class_aware_nms_indices, 0.10)
        values.append((time.perf_counter() - started) * 1000.0 / iterations)
    return {
        "median_ms": median(values),
        "min_ms": min(values),
        "max_ms": max(values),
        "round_ms": values,
    }


def paired_pruned_latency(
    full: Runner,
    pruned: Runner,
    image: np.ndarray,
    class_aware_nms_indices,
    *,
    blocks: int = 25,
    iterations: int = 12,
) -> dict:
    import random

    for _ in range(8):
        decode_array(full.infer_array(image), class_aware_nms_indices, 0.10)
        decode_array(expand_pruned_output(pruned.infer_array(image)), class_aware_nms_indices, 0.10)

    rng = random.Random(20260922)
    deltas_percent: list[float] = []
    deltas_ms: list[float] = []
    faster = 0

    def run_full() -> float:
        started = time.perf_counter_ns()
        for _ in range(iterations):
            decode_array(full.infer_array(image), class_aware_nms_indices, 0.10)
        return (time.perf_counter_ns() - started) / 1_000_000.0 / iterations

    def run_pruned() -> float:
        started = time.perf_counter_ns()
        for _ in range(iterations):
            decode_array(
                expand_pruned_output(pruned.infer_array(image)),
                class_aware_nms_indices,
                0.10,
            )
        return (time.perf_counter_ns() - started) / 1_000_000.0 / iterations

    for block in range(blocks):
        if rng.getrandbits(1):
            p_ms = run_pruned()
            f_ms = run_full()
        else:
            f_ms = run_full()
            p_ms = run_pruned()
        delta_ms = p_ms - f_ms
        delta_percent = (p_ms / f_ms - 1.0) * 100.0
        deltas_ms.append(delta_ms)
        deltas_percent.append(delta_percent)
        faster += int(delta_ms < 0.0)
        print(
            f"class-head paired {block + 1:02d}/{blocks}: "
            f"full80={f_ms:.4f} ms pruned6={p_ms:.4f} ms delta={delta_percent:+.3f}%",
            flush=True,
        )

    return {
        "blocks": blocks,
        "iterations_per_side_per_block": iterations,
        "paired_delta_ms_median": median(deltas_ms),
        "paired_delta_percent_median": median(deltas_percent),
        "faster_blocks": faster,
        "faster_fraction": faster / blocks,
        "round_delta_percent": deltas_percent,
    }


def render(payload: dict) -> str:
    prod = payload["latency"]["production"]
    full = payload["latency"]["reexport_full80"]
    pruned = payload["latency"]["pruned6"]
    vs_full = (pruned["median_ms"] / full["median_ms"] - 1.0) * 100.0
    vs_prod = (pruned["median_ms"] / prod["median_ms"] - 1.0) * 100.0
    eq = payload["equivalence"]
    paired = payload["paired_latency"]
    lines = [
        "# YOLO11n final class-head 80→6 pruning experiment",
        "",
        f"- Private baseline SHA: `{payload['baseline_sha']}`",
        f"- Dataset: {payload['dataset']['num_images']} COCO val traffic images",
        f"- Selected original COCO IDs: {SELECTED}",
        "",
        "## Latency",
        "",
        "| Model | median ms | relative | model.bin |",
        "| --- | ---: | ---: | ---: |",
        f"| exact production | {prod['median_ms']:.3f} | baseline reference | {payload['model_bytes']['production']:,} B |",
        f"| same-run 80-class re-export | {full['median_ms']:.3f} | same-toolchain control | {payload['model_bytes']['reexport_full80']:,} B |",
        f"| pruned 6-class final head | {pruned['median_ms']:.3f} | {vs_full:+.2f}% vs re-export / {vs_prod:+.2f}% vs production | {payload['model_bytes']['pruned6']:,} B |",
        "",
        f"Interleaved paired full80→pruned median: **{paired['paired_delta_percent_median']:+.3f}%** "
        f"({paired['paired_delta_ms_median']:+.4f} ms), pruned faster in "
        f"**{paired['faster_blocks']}/{paired['blocks']}** blocks.",
        "",
        "## Equivalence",
        "",
        f"- Pruned vs same-run full80 structure-changed images: **{eq['pruned_vs_reexport']['structure_changed_images']} / {payload['dataset']['num_images']}**",
        f"- Max score delta vs same-run full80: **{eq['pruned_vs_reexport']['max_score_delta']:.9g}**",
        f"- Pruned vs exact production structure-changed images: **{eq['pruned_vs_production']['structure_changed_images']} / {payload['dataset']['num_images']}**",
        f"- Full re-export vs exact production structure-changed images: **{eq['reexport_vs_production']['structure_changed_images']} / {payload['dataset']['num_images']}**",
        "",
        "## Accuracy",
        "",
        "| Model | Macro P | Macro R | Macro F1 | Vehicle F1 | Pedestrian F1 | Bicycle F1 |",
        "| --- | ---: | ---: | ---: | ---: | ---: | ---: |",
    ]
    for key in ["production", "reexport_full80", "pruned6"]:
        a = payload["accuracy"][key]
        pc = a["per_class"]
        lines.append(
            f"| {key} | {a['macro_precision']:.6f} | {a['macro_recall']:.6f} | {a['macro_f1']:.6f} | "
            f"{pc['vehicle']['f1']:.6f} | {pc['pedestrian']['f1']:.6f} | {pc['bicycle']['f1']:.6f} |"
        )
    lines += [
        "",
        "## Decision",
        "",
        payload["decision"],
        "",
        "Only the three final 1×1 class-output convolutions were reduced from 80 outputs to 6. The preceding classification feature branches were left intact so selected class logits remain directly copied from the original head.",
        "",
    ]
    return "\n".join(lines)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--private-repo", type=Path, required=True)
    parser.add_argument("--output-dir", type=Path, required=True)
    parser.add_argument("--num-images", type=int, default=180)
    parser.add_argument("--seed", type=int, default=20260915)
    parser.add_argument("--threads", type=int, default=4)
    args = parser.parse_args()

    private_repo = args.private_repo.resolve()
    output_dir = args.output_dir.resolve()
    output_dir.mkdir(parents=True, exist_ok=True)
    models_dir = output_dir / "models"
    models_dir.mkdir(parents=True, exist_ok=True)

    sys.path.insert(0, str(private_repo / "edge/src"))
    from detectors.nms import class_aware_nms_indices

    baseline_sha = subprocess.check_output(
        ["git", "-C", str(private_repo), "rev-parse", "HEAD"], text=True
    ).strip()
    production_dir = private_repo / "edge/models/yolo11n_384x288_ncnn_model"

    with tempfile.TemporaryDirectory(prefix="yolo11-prune-export-") as temp_dir:
        old_cwd = Path.cwd()
        os.chdir(temp_dir)
        try:
            print("Loading/exporting same-run full 80-class YOLO11n...", flush=True)
            full_yolo = YOLO("yolo11n.pt")
            export_ncnn(full_yolo, models_dir / "reexport_full80")

            print("Loading/pruning/exporting 6-class final head...", flush=True)
            pruned_yolo = YOLO("yolo11n.pt")
            patch_info = patch_detect_head_to_six(pruned_yolo)
            export_ncnn(pruned_yolo, models_dir / "pruned6")
        finally:
            os.chdir(old_cwd)

    production = Runner(Candidate("production", production_dir), args.threads)
    full = Runner(Candidate("reexport_full80", models_dir / "reexport_full80"), args.threads)
    pruned = Runner(Candidate("pruned6", models_dir / "pruned6"), args.threads)

    yy, xx = np.indices((288, 384), dtype=np.uint16)
    smoke = np.empty((288, 384, 3), dtype=np.uint8)
    smoke[..., 0] = (xx % 251).astype(np.uint8)
    smoke[..., 1] = (yy % 251).astype(np.uint8)
    smoke[..., 2] = ((xx + yy) % 251).astype(np.uint8)

    latency = {
        "production": benchmark(production, smoke, class_aware_nms_indices),
        "reexport_full80": benchmark(full, smoke, class_aware_nms_indices),
        "pruned6": benchmark_pruned(pruned, smoke, class_aware_nms_indices),
    }
    paired_latency = paired_pruned_latency(
        full,
        pruned,
        smoke,
        class_aware_nms_indices,
    )

    cache_dir = output_dir / "_coco_cache"
    coco = load_coco_annotations(cache_dir)
    samples = select_samples(coco, args.num_images, args.seed)
    images_dir = cache_dir / "val2017"
    download_images(samples, images_dir)

    stats = {
        "production": init_stats(),
        "reexport_full80": init_stats(),
        "pruned6": init_stats(),
    }
    eq = {
        "reexport_vs_production": {"structure_changed_images": 0, "max_score_delta": 0.0},
        "pruned_vs_reexport": {"structure_changed_images": 0, "max_score_delta": 0.0},
        "pruned_vs_production": {"structure_changed_images": 0, "max_score_delta": 0.0},
    }

    for index, sample in enumerate(samples, 1):
        image = cv2.imread(str(images_dir / sample.file_name))
        if image is None:
            raise RuntimeError(f"Cannot read {sample.file_name}")
        processed, sx, sy, px, py = letterbox(image)
        transform = (sx, sy, px, py)

        prod_dets = decode_array(production.infer_array(processed), class_aware_nms_indices, 0.30)
        full_dets = decode_array(full.infer_array(processed), class_aware_nms_indices, 0.30)
        pruned_raw = pruned.infer_array(processed)
        pruned_dets = decode_array(expand_pruned_output(pruned_raw), class_aware_nms_indices, 0.30)

        update_accuracy(stats["production"], prod_dets, sample, transform)
        update_accuracy(stats["reexport_full80"], full_dets, sample, transform)
        update_accuracy(stats["pruned6"], pruned_dets, sample, transform)

        for key, left, right in [
            ("reexport_vs_production", prod_dets, full_dets),
            ("pruned_vs_reexport", full_dets, pruned_dets),
            ("pruned_vs_production", prod_dets, pruned_dets),
        ]:
            cmp = compare_detections(left, right)
            if not cmp["structure_equal"]:
                eq[key]["structure_changed_images"] += 1
            if np.isfinite(cmp["max_score_delta"]):
                eq[key]["max_score_delta"] = max(
                    eq[key]["max_score_delta"],
                    float(cmp["max_score_delta"]),
                )

        if index % 30 == 0:
            print(f"Evaluated {index}/{len(samples)} images", flush=True)

    accuracy = {name: finalize_stats(value) for name, value in stats.items()}
    same_accuracy = all(
        abs(accuracy["pruned6"][metric] - accuracy["production"][metric]) < 1e-12
        for metric in ["macro_precision", "macro_recall", "macro_f1"]
    )
    same_structure = eq["pruned_vs_production"]["structure_changed_images"] == 0
    speed_delta = (
        latency["pruned6"]["median_ms"] / latency["reexport_full80"]["median_ms"] - 1.0
    ) * 100.0

    if same_accuracy and same_structure and speed_delta <= -0.5:
        decision = (
            "**Playground winner:** the physically pruned 6-class final head preserved all "
            "traffic detections and held-out metrics while producing a measurable same-run speedup. "
            "Confirm on Raspberry Pi before production."
        )
    elif same_accuracy and same_structure:
        decision = (
            "**Accuracy-safe on this benchmark, but no meaningful hosted speed win.** "
            "The final class-output convolutions are too small a share of total inference to justify "
            "production complexity unless Pi measurements show otherwise."
        )
    else:
        decision = (
            "**Reject:** physical class-head pruning changed traffic detection structure or held-out metrics."
        )

    payload = {
        "baseline_sha": baseline_sha,
        "dataset": {"num_images": len(samples), "seed": args.seed},
        "patch": patch_info,
        "latency": latency,
        "paired_latency": paired_latency,
        "accuracy": accuracy,
        "equivalence": eq,
        "model_bytes": {
            "production": (production_dir / "model.ncnn.bin").stat().st_size,
            "reexport_full80": (models_dir / "reexport_full80/model.ncnn.bin").stat().st_size,
            "pruned6": (models_dir / "pruned6/model.ncnn.bin").stat().st_size,
        },
        "decision": decision,
    }
    (output_dir / "class_head_pruning.json").write_text(
        json.dumps(payload, indent=2, sort_keys=True), encoding="utf-8"
    )
    markdown = render(payload)
    (output_dir / "class_head_pruning.md").write_text(markdown, encoding="utf-8")
    print(markdown, flush=True)

    pruned.close()
    full.close()
    production.close()
    shutil.rmtree(cache_dir, ignore_errors=True)


if __name__ == "__main__":
    main()
