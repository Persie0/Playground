#!/usr/bin/env python3
"""Comparative ARM64 benchmarks for traffic-counting-light-main.

This runs the same synthetic workload against a baseline checkout and an
optimized checkout. It is intentionally hardware-agnostic: GitHub's ARM64
runner is useful for A/B comparisons, but its absolute timings are not Pi 5
FPS claims.
"""
from __future__ import annotations

import argparse
import hashlib
import json
import math
import os
import platform
import statistics
import subprocess
import sys
import time
from pathlib import Path
from typing import Any


def summarize_ms(values: list[float]) -> dict[str, float | int]:
    if not values:
        raise ValueError("values must not be empty")
    ordered = sorted(float(v) for v in values)
    p95_index = max(0, math.ceil(len(ordered) * 0.95) - 1)
    result: dict[str, float | int] = {
        "count": len(ordered),
        "min_ms": ordered[0],
        "median_ms": statistics.median(ordered),
        "mean_ms": statistics.fmean(ordered),
        "p95_ms": ordered[p95_index],
        "max_ms": ordered[-1],
    }
    return result


def speedup(baseline_ms: float, optimized_ms: float) -> float:
    if optimized_ms <= 0:
        raise ValueError("optimized_ms must be positive")
    return baseline_ms / optimized_ms


def write_json(path: Path, payload: Any) -> None:
    path.parent.mkdir(parents=True, exist_ok=True)
    path.write_text(json.dumps(payload, indent=2, sort_keys=True) + "\n", encoding="utf-8")


def _repo_src(repo: Path) -> Path:
    src = repo / "src"
    if not src.is_dir():
        raise FileNotFoundError(f"missing src directory: {src}")
    return src


def _activate_repo(repo: Path) -> Path:
    src = _repo_src(repo)
    sys.path.insert(0, str(src))
    os.chdir(src)
    return src


def _digest_array(array) -> str:
    return hashlib.sha256(array.tobytes()).hexdigest()


def worker_masked_median(repo: Path) -> dict[str, Any]:
    _activate_repo(repo)
    import numpy as np
    from analysis.background.masked_median import compute_masked_median
    from analysis.background.models import BoundingBox

    rng = np.random.default_rng(20261004)
    sample_count, height, width = 60, 288, 384
    samples = rng.integers(0, 256, size=(sample_count, height, width, 3), dtype=np.uint8)
    boxes_by_sample = []
    for _ in range(sample_count):
        boxes = []
        for _ in range(7):
            bw = int(rng.integers(18, 70))
            bh = int(rng.integers(18, 70))
            x = int(rng.integers(0, width - bw))
            y = int(rng.integers(0, height - bh))
            boxes.append(BoundingBox(x=x, y=y, width=bw, height=bh))
        boxes_by_sample.append(boxes)

    # One warmup keeps import/page-fault noise out of the measured samples.
    output = compute_masked_median(samples, boxes_by_sample, tile_rows=32)
    timings: list[float] = []
    for _ in range(5):
        start = time.perf_counter()
        output = compute_masked_median(samples, boxes_by_sample, tile_rows=32)
        timings.append((time.perf_counter() - start) * 1000.0)
    return {
        "timing": summarize_ms(timings),
        "sha256": _digest_array(output),
        "shape": list(output.shape),
        "dtype": str(output.dtype),
        "workload": {"samples": sample_count, "height": height, "width": width, "boxes_per_sample": 7},
    }


def _lmeds_workload(np):
    rng = np.random.default_rng(20261004)
    timestamps = np.linspace(0.0, 2.8, 52, dtype=np.float64)
    velocity = np.array([3.25, 10.5], dtype=np.float64)
    positions = timestamps[:, None] * velocity[None, :]
    positions += rng.normal(0.0, 0.035, size=positions.shape)
    outliers = np.array([8, 17, 31, 44])
    positions[outliers] += rng.normal(0.0, 1.2, size=(len(outliers), 2))
    return timestamps, positions


def worker_lmeds(repo: Path) -> dict[str, Any]:
    _activate_repo(repo)
    import numpy as np
    from speed_measurement.homography_speed_measurement import HomographySpeedMeasurement

    obj = HomographySpeedMeasurement.__new__(HomographySpeedMeasurement)
    obj.max_speed_ms = 70.0
    obj.min_object_visibility_seconds = 1.0
    obj.min_object_distance_traveled_meters = 0.1
    timestamps, positions = _lmeds_workload(np)

    timings: list[float] = []
    digest = hashlib.sha256()
    none_count = 0
    for i in range(500):
        np.random.seed(100000 + i)
        start = time.perf_counter()
        value = obj._fit_velocity_lmeds(timestamps, positions)
        timings.append((time.perf_counter() - start) * 1000.0)
        if value is None:
            digest.update(b"NONE")
            none_count += 1
        else:
            digest.update(np.asarray(value, dtype=np.float64).tobytes())
    return {
        "timing": summarize_ms(timings),
        "sha256": digest.hexdigest(),
        "none_count": none_count,
        "workload": {"points": len(timestamps), "iterations": len(timings), "random_hypotheses_per_fit": 30},
    }


def _stable_detection_digest(result: Any) -> str:
    encoded = json.dumps(result, sort_keys=True, separators=(",", ":"), allow_nan=False).encode("utf-8")
    return hashlib.sha256(encoded).hexdigest()


def worker_ncnn(repo: Path) -> dict[str, Any]:
    _activate_repo(repo)
    import numpy as np
    from inference.ncnn_inference import NcnnInference

    model_name = "libreyolo9t-288x384-ncnn"
    rng = np.random.default_rng(20261004)
    frame = rng.integers(0, 256, size=(288, 384, 3), dtype=np.uint8)
    model = NcnnInference(model_name, conf_threshold=0.20, iou_threshold=0.45)
    try:
        result = None
        for _ in range(5):
            result = model.run(frame)
        timings: list[float] = []
        for _ in range(40):
            start = time.perf_counter()
            result = model.run(frame)
            timings.append((time.perf_counter() - start) * 1000.0)
        assert result is not None
        return {
            "timing": summarize_ms(timings),
            "sha256": _stable_detection_digest(result),
            "detections": len(result),
            "model": model_name,
            "input_shape": list(frame.shape),
            "threads": 4,
        }
    finally:
        model.close()


def run_worker(mode: str, repo: Path) -> dict[str, Any]:
    cmd = [sys.executable, str(Path(__file__).resolve()), "--worker", mode, "--repo", str(repo)]
    completed = subprocess.run(cmd, capture_output=True, text=True, check=True)
    lines = [line for line in completed.stdout.splitlines() if line.strip()]
    if not lines:
        raise RuntimeError(f"worker {mode} produced no output; stderr={completed.stderr}")
    try:
        return json.loads(lines[-1])
    except json.JSONDecodeError as exc:
        raise RuntimeError(f"worker {mode} did not end with JSON. stdout={completed.stdout!r} stderr={completed.stderr!r}") from exc


def run_tool(cmd: list[str], cwd: Path, output_path: Path) -> dict[str, Any]:
    start = time.perf_counter()
    completed = subprocess.run(cmd, cwd=cwd, capture_output=True, text=True)
    elapsed = time.perf_counter() - start
    text = completed.stdout
    if completed.stderr:
        text += "\n--- stderr ---\n" + completed.stderr
    output_path.write_text(text, encoding="utf-8")
    return {"returncode": completed.returncode, "elapsed_s": elapsed, "output_file": output_path.name}


def render_readme(payload: dict[str, Any]) -> str:
    lines = [
        "# ARM64 GitHub Actions comparative benchmark",
        "",
        "> These are native AArch64 GitHub-hosted runner measurements, **not Raspberry Pi 5 absolute FPS numbers**. "
        "Use them to compare baseline vs optimized code paths; the existing Pi 5 captures remain the source for Pi 5 end-to-end FPS/CPU behavior.",
        "",
        f"- Architecture: `{payload['environment']['machine']}`",
        f"- Platform: `{payload['environment']['platform']}`",
        f"- Python: `{payload['environment']['python']}`",
        f"- GitHub run: `{payload['environment'].get('github_run_id', '')}`",
        "",
        "## A/B results",
        "",
        "| Benchmark | Baseline median | Optimized median | Speedup | p95 baseline | p95 optimized | Equivalent output |",
        "|---|---:|---:|---:|---:|---:|:---:|",
    ]
    for name, data in payload["benchmarks"].items():
        b = data["baseline"]["timing"]
        o = data["optimized"]["timing"]
        lines.append(
            f"| {name} | {b['median_ms']:.3f} ms | {o['median_ms']:.3f} ms | "
            f"{data['speedup']:.2f}x | {b['p95_ms']:.3f} ms | {o['p95_ms']:.3f} ms | "
            f"{'yes' if data['equivalent'] else 'NO'} |"
        )
    lines += [
        "",
        "## Additional NCNN diagnostics",
        "",
        "`ncnn_ab.txt` contains per-configuration median/p95/CPU-ms results for NCNN thread counts, FP16 settings and OpenMP policies. "
        "`gil_check.txt` compares Python-thread stalls during `ncnn.Extractor.extract()` against an OpenCV remap control.",
        "",
        "## Files",
        "",
        "- `results.json` — complete machine-readable A/B results and equivalence hashes.",
        "- `ncnn_ab.txt` — NCNN runtime tuning matrix.",
        "- `gil_check.txt` — stock NCNN Python-binding GIL behavior.",
        "- `lscpu.txt`, `uname.txt`, `python.txt`, `pip-freeze.txt` — runner provenance captured by the workflow.",
        "- `console.log` — complete harness console output captured by the workflow.",
        "",
    ]
    return "\n".join(lines)


def main() -> int:
    parser = argparse.ArgumentParser()
    parser.add_argument("--baseline", type=Path)
    parser.add_argument("--optimized", type=Path)
    parser.add_argument("--output", type=Path)
    parser.add_argument("--worker", choices=["masked_median", "lmeds", "ncnn"])
    parser.add_argument("--repo", type=Path)
    args = parser.parse_args()

    if args.worker:
        if args.repo is None:
            parser.error("--repo is required with --worker")
        workers = {
            "masked_median": worker_masked_median,
            "lmeds": worker_lmeds,
            "ncnn": worker_ncnn,
        }
        print(json.dumps(workers[args.worker](args.repo.resolve()), sort_keys=True))
        return 0

    if args.baseline is None or args.optimized is None or args.output is None:
        parser.error("--baseline, --optimized and --output are required")

    baseline = args.baseline.resolve()
    optimized = args.optimized.resolve()
    output = args.output.resolve()
    output.mkdir(parents=True, exist_ok=True)

    payload: dict[str, Any] = {
        "environment": {
            "machine": platform.machine(),
            "platform": platform.platform(),
            "python": platform.python_version(),
            "github_run_id": os.environ.get("GITHUB_RUN_ID", ""),
            "github_run_attempt": os.environ.get("GITHUB_RUN_ATTEMPT", ""),
            "github_sha": os.environ.get("GITHUB_SHA", ""),
        },
        "baseline": str(baseline),
        "optimized": str(optimized),
        "benchmarks": {},
        "diagnostics": {},
    }

    for mode in ("masked_median", "lmeds", "ncnn"):
        print(f"Running {mode} baseline...", flush=True)
        base_result = run_worker(mode, baseline)
        print(f"Running {mode} optimized...", flush=True)
        opt_result = run_worker(mode, optimized)
        base_median = float(base_result["timing"]["median_ms"])
        opt_median = float(opt_result["timing"]["median_ms"])
        payload["benchmarks"][mode] = {
            "baseline": base_result,
            "optimized": opt_result,
            "speedup": speedup(base_median, opt_median),
            "equivalent": base_result["sha256"] == opt_result["sha256"],
        }
        data = payload["benchmarks"][mode]
        print(
            f"{mode}: {base_median:.3f} -> {opt_median:.3f} ms = {data['speedup']:.2f}x; "
            f"equivalent={data['equivalent']}",
            flush=True,
        )

    optimized_src = _repo_src(optimized)
    model_dir = optimized_src / "inference" / "models" / "libreyolo9t-288x384-ncnn"
    tools_dir = optimized / "benchmark" / "tools"
    # Support both the pre-reorganization branch and the final benchmark/tools/perzi layout.
    perzi_tools = tools_dir / "perzi"
    if (perzi_tools / "ncnn_ab_bench.py").exists():
        tools_dir = perzi_tools

    payload["diagnostics"]["ncnn_ab"] = run_tool(
        [
            sys.executable,
            str(tools_dir / "ncnn_ab_bench.py"),
            "--model-dir",
            str(model_dir),
            "--size",
            "288",
            "384",
            "--iters",
            "60",
            "--warmup",
            "12",
        ],
        optimized_src,
        output / "ncnn_ab.txt",
    )
    payload["diagnostics"]["gil_check"] = run_tool(
        [
            sys.executable,
            str(tools_dir / "gil_check.py"),
            "--model-dir",
            str(model_dir),
            "--size",
            "288",
            "384",
            "--threads",
            "4",
            "--repeat",
            "3",
        ],
        optimized_src,
        output / "gil_check.txt",
    )

    write_json(output / "results.json", payload)
    (output / "README.md").write_text(render_readme(payload), encoding="utf-8")
    print(json.dumps(payload, indent=2, sort_keys=True))

    failed_checks = [name for name, data in payload["benchmarks"].items() if not data["equivalent"]]
    failed_tools = [name for name, data in payload["diagnostics"].items() if data["returncode"] != 0]
    if failed_checks or failed_tools:
        print(f"FAILED equivalence checks={failed_checks} diagnostic tools={failed_tools}", file=sys.stderr)
        return 2
    return 0


if __name__ == "__main__":
    raise SystemExit(main())
