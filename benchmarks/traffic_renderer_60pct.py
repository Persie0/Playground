#!/usr/bin/env python3
"""Production renderer benchmark at 60% active heatmap support.

Compares pinned old production _colorize + two blends to current production
_colorize_and_blend (single and combined) on 1296x972 uint8 images.
Same core operations as archived Pi renderer A/B; synthetic support/data.
This GitHub-hosted ARM64 runner is *not* the Raspberry Pi 5.
"""
from __future__ import annotations

import argparse
import hashlib
import importlib.util
import json
import os
from pathlib import Path
import platform
import statistics
import subprocess
import sys
import time

OLD_SHA = "6436ef9f3dd821570887128bd32a79b28acb1edc"
NEW_SHA = "805ac7fa4d7970f37b56b8e37dab738c923ce795"
SHAPE = (972, 1296)
NUM_REPEATS = 7
WARMUPS = 2


def verify_source(root: Path, expected_sha: str, is_new: bool) -> None:
    sha = subprocess.check_output(
        ["git", "-C", str(root.parent), "rev-parse", "HEAD"], text=True
    ).strip()
    if sha != expected_sha:
        raise RuntimeError(f"wrong source SHA: {sha} != {expected_sha}")
    code = (root / "src/analysis/traffic/renderer.py").read_text()
    expected = "def _colorize_and_blend(" if is_new else "def _colorize("
    if expected not in code:
        raise RuntimeError(f"missing production renderer method: {expected}")
    if is_new and "active * 4 <= mask.size" not in code:
        raise RuntimeError("expected production 25-percent sparse branch guard missing")


def setup(root: Path, version: str):
    import cv2
    cv2.setNumThreads(2)
    sys.path.insert(0, str(root / "src"))
    from analysis.traffic.models import TrafficCategory
    filename = root / "src/analysis/traffic/renderer.py"
    spec = importlib.util.spec_from_file_location(f"renderer_{version}", filename)
    if spec is None or spec.loader is None:
        raise RuntimeError("cannot load production renderer")
    mod = importlib.util.module_from_spec(spec)
    sys.modules[spec.name] = mod
    spec.loader.exec_module(mod)
    return mod, TrafficCategory.VEHICLE


def make_inputs():
    import numpy as np
    rng = np.random.default_rng(20261015)
    base = rng.integers(0, 256, (*SHAPE, 3), dtype=np.uint8)
    values = rng.random(SHAPE, dtype=np.float32)
    density = rng.random(SHAPE, dtype=np.float32)
    support = rng.random(SHAPE) < 0.6
    # Force the global density maximum to be off the active area, mirroring
    # the original on-Pi test. This catches incorrect normalization.
    support[0, 0] = False
    density[0, 0] = 100.
    support_percent = 100. * support.sum() / support.size
    if not (59.8 <= support_percent <= 60.2):
        raise AssertionError("support fraction is not 60%")
    return base, values, density, support, support_percent


def worker(args: argparse.Namespace) -> None:
    import cv2
    import numpy as np
    new = args.version == "new"
    root = args.new if new else args.old
    verify_source(root, NEW_SHA if new else OLD_SHA, new)
    renderer, category = setup(root, args.version)
    base, values, density, support, support_percent = make_inputs()
    records = []
    digests = []
    for i in range(WARMUPS + NUM_REPEATS):
        cpu_start = time.process_time_ns()
        wall_start = time.perf_counter_ns()
        if new:
            out_single, out_combined = renderer._colorize_and_blend(
                base, values, density, category, support, base
            )
        else:
            color, alpha = renderer._colorize(
                values, density, category, support_mask=support
            )
            out_single = renderer._blend(base, color, alpha)
            out_combined = renderer._blend(base, color, np.minimum(alpha, .70))
        wall_ms = (time.perf_counter_ns() - wall_start) / 1e6
        cpu_ms = (time.process_time_ns() - cpu_start) / 1e6
        if out_combined is None:
            raise AssertionError("combined layer missing")
        if out_single.dtype != np.uint8 or out_single.shape != base.shape:
            raise AssertionError("invalid single-layer shape/type")
        if out_combined.shape != base.shape or out_combined.dtype != np.uint8:
            raise AssertionError("invalid combined-layer shape/type")
        s1 = hashlib.sha256(out_single.tobytes()).hexdigest()
        s2 = hashlib.sha256(out_combined.tobytes()).hexdigest()
        digests.append([s1, s2])
        if i >= WARMUPS:
            records.append({"wall_ms": wall_ms, "cpu_ms": cpu_ms})
    if any(p != digests[0] for p in digests):
        raise AssertionError(f"renderer {args.version} produced inconsistent outputs")
    print(json.dumps({
        "version": args.version,
        "data": {"shape": [*SHAPE, 3], "support_percent": support_percent,
                 "support_pixels": int(support.sum())},
        "output_digests": digests[0],
        "times": records,
        "median_ms": statistics.median(r["wall_ms"] for r in records),
        "median_cpu_ms": statistics.median(r["cpu_ms"] for r in records),
        "opencv_threads": cv2.getNumThreads(),
        "numpy": np.__version__,
    }), flush=True)


def main(args: argparse.Namespace) -> None:
    verify_source(args.old, OLD_SHA, False)
    verify_source(args.new, NEW_SHA, True)
    versions = ("old", "new", "new", "old")
    data = {"old": [], "new": []}
    for ver in versions:
        command = [
            sys.executable, str(Path(__file__).resolve()), "--worker",
            "--old", str(args.old), "--new", str(args.new), "--version", ver
        ]
        process = subprocess.run(command, check=True, capture_output=True, text=True)
        data[ver].append(json.loads(process.stdout))
    all_hashes = {
        (str(r["output_digests"][0]), str(r["output_digests"][1]))
        for runs in data.values() for r in runs
    }
    if len(all_hashes) != 1:
        raise AssertionError(f"Rendered images not bit-identical: {all_hashes}")
    old_timings = [t["wall_ms"] for r in data["old"] for t in r["times"]]
    new_timings = [t["wall_ms"] for r in data["new"] for t in r["times"]]
    old_median, new_median = statistics.median(old_timings), statistics.median(new_timings)
    percent = data["old"][0]["data"]["support_percent"]
    if not 59.8 <= percent <= 60.2:
        raise AssertionError("wrong support fraction")
    report = {
        "purpose": "Production renderer old/new A/B for 60-percent active support",
        "scope": "actual colorize + two blends vs combined renderer, excludes preprocessing, PNG, legends",
        "hardware": {
            "machine": platform.machine(), "platform": platform.platform(),
            "logical_cpus": os.cpu_count(), "python": platform.python_version(),
        },
        "source_commits": {"old": OLD_SHA, "new": NEW_SHA},
        "geometry": {"width": SHAPE[1], "height": SHAPE[0],
                     "support_percent": percent, "opencv_threads": 2,
                     "single_and_combined_layers": True},
        "sparse_fast_path_used": False,
        "reason": "production fallback for support above 25%",
        "output_byte_identical": True,
        "original_median_ms": old_median,
        "optimized_median_ms": new_median,
        "speedup": old_median / new_median,
        "raw": data,
        "limitations": [
            "Synthetic random active support/data; no actual traffic heatmaps",
            "GitHub-hosted ARM64 runner; not the Raspberry Pi 5",
            "Isolated renderer core, not complete PNG render or live-pipeline FPS",
        ],
    }
    args.output.parent.mkdir(parents=True, exist_ok=True)
    args.output.write_text(json.dumps(report, indent=2)+"\n")
    print(f"Support fraction: {percent:.4f}%", flush=True)
    print(f"Original renderer: {old_median:.3f} ms", flush=True)
    print(f"Current renderer: {new_median:.3f} ms", flush=True)
    print(f"Speedup: {old_median/new_median:.3f}x", flush=True)
    print("Output single+combined byte-identical: YES", flush=True)
    print("Sparse fast path used: NO (fallback beyond 25%)", flush=True)
    print("Report:", args.output, flush=True)


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--old", type=Path, required=True)
    parser.add_argument("--new", type=Path, required=True)
    parser.add_argument("--worker", action="store_true")
    parser.add_argument("--version", choices=("old", "new"))
    parser.add_argument("--output", type=Path, default=Path("results/traffic-renderer-60pct.json"))
    a = parser.parse_args()
    if a.worker:
        worker(a)
    else:
        main(a)
