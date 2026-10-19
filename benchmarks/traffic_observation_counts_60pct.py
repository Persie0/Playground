#!/usr/bin/env python3
"""Compare background valid-observation counters at 60% occlusion.

Measures two distinct scopes at 1296x972:
  1. Pi-20261015-compatible isolated counter-update kernel with random boolean mask
  2. Actual production BackgroundSampleCollector._record_valid_observations,
     including allocating/rasterizing detector boxes into a boolean mask.

Before / after versions are exact pinned versions from the private traffic repo.
This script is public, input is synthesized, no private source is exported.
"""
from __future__ import annotations

import argparse
import hashlib
import importlib.util
import json
import os
from pathlib import Path
import platform
import resource
import statistics
import subprocess
import sys
import time

import numpy as np

OLD_SHA = "6436ef9f3dd821570887128bd32a79b28acb1edc"
NEW_SHA = "805ac7fa4d7970f37b56b8e37dab738c923ce795"
H, W = 972, 1296
SHAPE = H, W
REPEATS = 7


def verify_source(root: Path, expected_sha: str, after: bool) -> None:
    sha = subprocess.check_output(
        ["git", "-C", str(root.parent), "rev-parse", "HEAD"], text=True
    ).strip()
    if sha != expected_sha:
        raise RuntimeError(f"wrong checkout SHA: {sha} != {expected_sha}")
    source = (root / "src/analysis/background/collector.py").read_text()
    expected = (
        "np.add(self._counts, np.uint16(1), out=self._counts, where=~masked)"
        if after else "self._counts[~masked] += np.uint16(1)"
    )
    if expected not in source:
        raise RuntimeError("Production method does not match tested kernel")


def sample_mask() -> np.ndarray:
    # Mirrors the previous Pi microprobe: independently Bernoulli mask each pixel.
    mask = np.random.default_rng(20261015).random(SHAPE) < 0.6
    mask.flat[:3] = False  # preserve edge cases from Pi comparison
    return mask


def boxes_mask60() -> tuple[list[dict[str, int]], float]:
    # 86 disjoint full cells + 44x80 sub-cell produces 60.00165% occlusion.
    rng = np.random.default_rng(20261019)
    grid = rng.permutation(144)
    boxes = []
    mask = np.zeros(SHAPE, dtype=np.bool_)
    for cell in grid[:86]:
        row, col = divmod(int(cell), 12)
        x, y = col * (W // 12), row * (H // 12)
        w, h = W // 12, H // 12
        boxes.append({"x": x, "y": y, "width": w, "height": h})
        mask[y:y+h, x:x+w] = True
    cell = int(grid[86])
    row, col = divmod(cell, 12)
    x, y = col * (W // 12), row * (H // 12)
    boxes.append({"x": x, "y": y, "width": 44, "height": 80})
    mask[y:y+80, x:x+44] = True
    return boxes, 100 * np.count_nonzero(mask) / mask.size


def initial_counts() -> np.ndarray:
    counts = np.random.default_rng(13480).integers(0, 65536, SHAPE, dtype=np.uint16)
    counts.flat[:3] = [0, 65534, 65535]  # verify overflow wrapping
    return counts


def production_method(root: Path):
    sys.path.insert(0, str(root / "src"))
    # All versions use the same dataclass for bounding boxes.
    from analysis.background.models import BoundingBox
    name = "collector_bench"
    source_file = root / "src/analysis/background/collector.py"
    spec = importlib.util.spec_from_file_location(name, source_file)
    if spec is None or spec.loader is None:
        raise RuntimeError("cannot import production collector")
    module = importlib.util.module_from_spec(spec)
    sys.modules[name] = module
    spec.loader.exec_module(module)
    return module.BackgroundSampleCollector, BoundingBox


def timed(args: argparse.Namespace) -> None:
    version = args.version
    root = args.new if version == "new" else args.old
    verify_source(root, NEW_SHA if version == "new" else OLD_SHA, version == "new")
    mask = sample_mask()
    actual = np.count_nonzero(mask) / mask.size * 100.0
    boxes_data, rectangular_actual = boxes_mask60()
    Collector, BoundingBox = production_method(root)
    boxes = tuple(BoundingBox(**b) for b in boxes_data)
    start_counts = initial_counts()
    measurements = {}
    digests = {}
    for workload in ("random_mask_kernel", "production_detector_boxes"):
        times = []
        cpus = []
        hashes = []
        for i in range(REPEATS + 2):
            counts = start_counts.copy()
            if workload == "production_detector_boxes":
                obj = object.__new__(Collector)
                obj._counts = counts
                obj._height = H
                obj._width = W
                obj._coverage_fraction = None
            cpu_start, wall_start = time.process_time_ns(), time.perf_counter_ns()
            if workload == "random_mask_kernel":
                if version == "old":
                    counts[~mask] += np.uint16(1)
                else:
                    np.add(counts, np.uint16(1), out=counts, where=~mask)
            else:
                obj._record_valid_observations(boxes)
            dt = (time.perf_counter_ns() - wall_start) / 1e6
            dc = (time.process_time_ns() - cpu_start) / 1e6
            hashes.append(hashlib.sha256(counts.tobytes()).hexdigest())
            if i >= 2:
                times.append(dt)
                cpus.append(dc)
        if len(set(hashes)) != 1:
            raise AssertionError(f"{version} has inconsistent outputs")
        measurements[workload] = {
            "wall_ms": times, "cpu_ms": cpus,
            "median_wall_ms": statistics.median(times),
            "median_cpu_ms": statistics.median(cpus),
            "output_sha256": hashes[0],
        }
    print(json.dumps({
        "version": version,
        "runner": {"machine": platform.machine(), "cpu_count": os.cpu_count(),
                   "numpy": np.__version__, "python": platform.python_version(),
                   "peak_rss_kib": resource.getrusage(resource.RUSAGE_SELF).ru_maxrss},
        "shape": [H, W],
        "mask_random_percent": round(actual, 6),
        "mask_boxes_percent": round(rectangular_actual, 6),
        "boxes": len(boxes),
        "measurements": measurements,
    }), flush=True)


def main(args: argparse.Namespace) -> None:
    verify_source(args.old, OLD_SHA, False)
    verify_source(args.new, NEW_SHA, True)
    results = {}
    # Alternating order partly counters thermal, cache and scheduler ordering.
    for ver in ("old", "new", "new", "old"):
        command = [
            sys.executable, str(Path(__file__).resolve()),
            "--worker", "--old", str(args.old), "--new", str(args.new),
            "--version", ver,
        ]
        p = subprocess.run(command, capture_output=True, check=True, text=True)
        results.setdefault(ver, []).append(json.loads(p.stdout))
    report = {
        "purpose": "60% masked background valid observation count update",
        "host": platform.platform(),
        "scope": "isolated counter kernel plus actual production bounding-box observation routine",
        "versions": {"old": OLD_SHA, "new": NEW_SHA},
        "results": {},
    }
    for name in ("random_mask_kernel", "production_detector_boxes"):
        old = [x["measurements"][name] for x in results["old"]]
        new = [x["measurements"][name] for x in results["new"]]
        digest = {x["output_sha256"] for x in old+new}
        if len(digest) != 1:
            raise AssertionError(f"{name}: old/new counts differ")
        old_times = [t for x in old for t in x["wall_ms"]]
        new_times = [t for x in new for t in x["wall_ms"]]
        old_median, new_median = statistics.median(old_times), statistics.median(new_times)
        report["results"][name] = {
            "masked_percent": (results["old"][0]["mask_random_percent"]
                               if name == "random_mask_kernel" else
                               results["old"][0]["mask_boxes_percent"]),
            "boxes_per_frame": (0 if name == "random_mask_kernel" else
                                results["old"][0]["boxes"]),
            "old_median_ms": old_median, "new_median_ms": new_median,
            "speedup": old_median / new_median,
            "identical_output": True, "output_sha256": next(iter(digest)),
            "old_times_ms": old_times, "new_times_ms": new_times,
        }
        print(f"{name}: {report['results'][name]['masked_percent']:.4f}% masked; "
              f"{old_median:.3f} -> {new_median:.3f} ms; "
              f"{old_median/new_median:.3f}x; byte-identical counts", flush=True)
    report["raw"] = results
    args.output.parent.mkdir(parents=True, exist_ok=True)
    args.output.write_text(json.dumps(report, indent=2)+"\n")
    print(f"Report: {args.output}")


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--old", type=Path, required=True)
    parser.add_argument("--new", type=Path, required=True)
    parser.add_argument("--worker", action="store_true")
    parser.add_argument("--version", choices=("old", "new"))
    parser.add_argument("--output", type=Path, default=Path("results/traffic-observation-count-60pct.json"))
    a = parser.parse_args()
    if a.worker:
        timed(a)
    else:
        main(a)
