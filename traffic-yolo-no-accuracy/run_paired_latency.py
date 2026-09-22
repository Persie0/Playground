from __future__ import annotations

import argparse
import json
import math
import random
import shutil
import subprocess
import sys
import time
from pathlib import Path
from statistics import median

import cv2
import numpy as np

from run_experiments import Candidate, Runner, decode_array, optimize_model, patch_first_conv


def percentile(values: list[float], p: float) -> float:
    ordered = sorted(values)
    if not ordered:
        return 0.0
    index = max(0, min(len(ordered) - 1, math.ceil(p * len(ordered)) - 1))
    return float(ordered[index])


def deterministic_frame() -> np.ndarray:
    yy, xx = np.indices((288, 384), dtype=np.uint16)
    image = np.empty((288, 384, 3), dtype=np.uint8)
    image[..., 0] = (xx % 251).astype(np.uint8)
    image[..., 1] = (yy % 251).astype(np.uint8)
    image[..., 2] = ((xx + yy) % 251).astype(np.uint8)
    return image


def timed_batch(runner: Runner, image: np.ndarray, class_aware_nms_indices, iterations: int) -> float:
    started = time.perf_counter_ns()
    for _ in range(iterations):
        arr = runner.infer_array(image)
        decode_array(arr, class_aware_nms_indices, 0.10)
    return (time.perf_counter_ns() - started) / 1_000_000.0 / iterations


def paired_candidate(
    name: str,
    baseline: Runner,
    candidate: Runner,
    image: np.ndarray,
    class_aware_nms_indices,
    *,
    warmup: int,
    blocks: int,
    iterations: int,
    seed: int,
) -> dict:
    for _ in range(warmup):
        baseline.infer_array(image)
        candidate.infer_array(image)

    rng = random.Random(seed)
    baseline_ms: list[float] = []
    candidate_ms: list[float] = []
    deltas_ms: list[float] = []
    deltas_percent: list[float] = []

    for block in range(blocks):
        candidate_first = bool(rng.getrandbits(1))
        if candidate_first:
            c_ms = timed_batch(candidate, image, class_aware_nms_indices, iterations)
            b_ms = timed_batch(baseline, image, class_aware_nms_indices, iterations)
        else:
            b_ms = timed_batch(baseline, image, class_aware_nms_indices, iterations)
            c_ms = timed_batch(candidate, image, class_aware_nms_indices, iterations)

        baseline_ms.append(b_ms)
        candidate_ms.append(c_ms)
        delta = c_ms - b_ms
        deltas_ms.append(delta)
        deltas_percent.append((c_ms / b_ms - 1.0) * 100.0)
        print(
            f"{name} block {block + 1:02d}/{blocks}: "
            f"baseline={b_ms:.4f} ms candidate={c_ms:.4f} ms "
            f"delta={deltas_percent[-1]:+.3f}%",
            flush=True,
        )

    negative_blocks = sum(delta < 0.0 for delta in deltas_ms)
    result = {
        "baseline_median_ms": median(baseline_ms),
        "candidate_median_ms": median(candidate_ms),
        "paired_delta_ms_median": median(deltas_ms),
        "paired_delta_percent_median": median(deltas_percent),
        "paired_delta_percent_p05": percentile(deltas_percent, 0.05),
        "paired_delta_percent_p95": percentile(deltas_percent, 0.95),
        "candidate_faster_blocks": negative_blocks,
        "candidate_faster_fraction": negative_blocks / blocks,
        "blocks": blocks,
        "iterations_per_side_per_block": iterations,
        "baseline_rounds_ms": baseline_ms,
        "candidate_rounds_ms": candidate_ms,
        "paired_delta_percent_rounds": deltas_percent,
    }
    # Conservative hosted classification: require a >0.5% median gain and wins in >=70% of blocks.
    if result["paired_delta_percent_median"] <= -0.5 and result["candidate_faster_fraction"] >= 0.70:
        result["hosted_verdict"] = "stable hosted win"
    elif result["paired_delta_percent_median"] >= 0.5 and result["candidate_faster_fraction"] <= 0.30:
        result["hosted_verdict"] = "stable hosted regression"
    else:
        result["hosted_verdict"] = "noise / no stable hosted difference"
    return result


def render_markdown(payload: dict) -> str:
    lines = [
        "# YOLO11n NCNN interleaved paired latency",
        "",
        f"- Baseline SHA: `{payload['baseline_sha']}`",
        f"- Blocks per candidate: {payload['blocks']}",
        f"- Inferences per side per block: {payload['iterations']}",
        "- Each block runs baseline/candidate back-to-back with randomized order.",
        "- Hosted x86 results are filters for Pi experiments, not Raspberry Pi performance claims.",
        "",
        "| Candidate | paired median delta | faster blocks | p05..p95 | verdict |",
        "| --- | ---: | ---: | ---: | --- |",
    ]
    for name, result in payload["candidates"].items():
        lines.append(
            f"| {name} | {result['paired_delta_percent_median']:+.3f}% "
            f"({result['paired_delta_ms_median']:+.4f} ms) | "
            f"{result['candidate_faster_blocks']}/{result['blocks']} | "
            f"{result['paired_delta_percent_p05']:+.2f}% .. {result['paired_delta_percent_p95']:+.2f}% | "
            f"{result['hosted_verdict']} |"
        )
    return "\n".join(lines) + "\n"


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--private-repo", type=Path, required=True)
    parser.add_argument("--output-dir", type=Path, required=True)
    parser.add_argument("--ncnnoptimize", type=Path, required=True)
    parser.add_argument("--threads", type=int, default=4)
    parser.add_argument("--warmup", type=int, default=8)
    parser.add_argument("--blocks", type=int, default=25)
    parser.add_argument("--iterations", type=int, default=12)
    parser.add_argument("--seed", type=int, default=20260922)
    args = parser.parse_args()

    private_repo = args.private_repo.resolve()
    output_dir = args.output_dir.resolve()
    output_dir.mkdir(parents=True, exist_ok=True)
    model_out = output_dir / "models"
    model_out.mkdir(parents=True, exist_ok=True)
    baseline_dir = private_repo / "edge/models/yolo11n_384x288_ncnn_model"

    sys.path.insert(0, str(private_repo / "edge/src"))
    from detectors.nms import class_aware_nms_indices

    baseline_sha = subprocess.check_output(
        ["git", "-C", str(private_repo), "rev-parse", "HEAD"], text=True
    ).strip()

    patch_first_conv(
        baseline_dir,
        model_out / "norm_fold",
        divide_by_255=True,
        swap_rgb_to_bgr=False,
    )
    patch_first_conv(
        baseline_dir,
        model_out / "bgr_fold",
        divide_by_255=False,
        swap_rgb_to_bgr=True,
    )
    patch_first_conv(
        baseline_dir,
        model_out / "input_fold",
        divide_by_255=True,
        swap_rgb_to_bgr=True,
    )
    optimize_model(
        args.ncnnoptimize.resolve(),
        baseline_dir,
        model_out / "ncnnoptimize_fp32",
    )
    optimize_model(
        args.ncnnoptimize.resolve(),
        model_out / "input_fold",
        model_out / "input_fold_ncnnoptimize",
    )

    candidate_specs = {
        "pooled_allocators": Candidate("pooled_allocators", baseline_dir, pooled=True),
        "norm_fold": Candidate(
            "norm_fold",
            model_out / "norm_fold",
            bgr_to_rgb=True,
            normalize=False,
        ),
        "bgr_fold": Candidate(
            "bgr_fold",
            model_out / "bgr_fold",
            bgr_to_rgb=False,
            normalize=True,
        ),
        "input_fold": Candidate(
            "input_fold",
            model_out / "input_fold",
            bgr_to_rgb=False,
            normalize=False,
        ),
        "ncnnoptimize_fp32": Candidate(
            "ncnnoptimize_fp32",
            model_out / "ncnnoptimize_fp32",
        ),
        "input_fold_ncnnoptimize": Candidate(
            "input_fold_ncnnoptimize",
            model_out / "input_fold_ncnnoptimize",
            bgr_to_rgb=False,
            normalize=False,
        ),
        "numpy_asarray": Candidate(
            "numpy_asarray",
            baseline_dir,
            array_view=True,
        ),
        "input_fold_pooled": Candidate(
            "input_fold_pooled",
            model_out / "input_fold",
            bgr_to_rgb=False,
            normalize=False,
            pooled=True,
        ),
    }

    image = deterministic_frame()
    results = {}
    for index, (name, spec) in enumerate(candidate_specs.items()):
        print(f"\n=== paired {name} ===", flush=True)
        baseline = Runner(Candidate(f"baseline_for_{name}", baseline_dir), args.threads)
        candidate = Runner(spec, args.threads)
        try:
            results[name] = paired_candidate(
                name,
                baseline,
                candidate,
                image,
                class_aware_nms_indices,
                warmup=args.warmup,
                blocks=args.blocks,
                iterations=args.iterations,
                seed=args.seed + index,
            )
        finally:
            candidate.close()
            baseline.close()

    payload = {
        "baseline_sha": baseline_sha,
        "threads": args.threads,
        "blocks": args.blocks,
        "iterations": args.iterations,
        "seed": args.seed,
        "candidates": results,
    }
    (output_dir / "paired_latency.json").write_text(
        json.dumps(payload, indent=2, sort_keys=True),
        encoding="utf-8",
    )
    markdown = render_markdown(payload)
    (output_dir / "paired_latency.md").write_text(markdown, encoding="utf-8")
    print(markdown, flush=True)
    shutil.rmtree(model_out, ignore_errors=True)


if __name__ == "__main__":
    main()
