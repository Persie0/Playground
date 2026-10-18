#!/usr/bin/env python3
"""60-percent masked full-frame production-median benchmark on hosted ARM64.

Synthetic stress workload: 1296x972, 60 frames, 32-row tiles, real source
functions pinned to their historical/current versions in a private checkout.
Masks cover ~60% of each frame; this is NOT 60% permanently hidden.
"""
from __future__ import annotations

import argparse
import hashlib
import json
from pathlib import Path
import platform
import statistics
import subprocess
import sys
import tempfile

import numpy as np
import traffic_fullframe_masked_median as baseline

GRID_COLS = 12
GRID_ROWS = 12
CELL_WIDTH = baseline.WIDTH // GRID_COLS
CELL_HEIGHT = baseline.HEIGHT // GRID_ROWS
assert CELL_WIDTH * GRID_COLS == baseline.WIDTH
assert CELL_HEIGHT * GRID_ROWS == baseline.HEIGHT


def make_mask60(tmp: Path) -> tuple[Path, Path, dict]:
    rng = np.random.default_rng(20261019)
    path = tmp / "mask60-samples.uint8"
    boxes_file = tmp / "mask60-boxes.json"
    mm = np.memmap(path, dtype=np.uint8, mode="w+", shape=baseline.SHAPE)
    yy, xx = np.indices((baseline.HEIGHT, baseline.WIDTH), dtype=np.uint16)
    base = np.empty((baseline.HEIGHT, baseline.WIDTH, 3), dtype=np.uint8)
    base[:, :, 0] = ((xx // 6 + yy // 13) % 85 + 35).astype(np.uint8)
    base[:, :, 1] = ((xx // 17 + yy // 9) % 75 + 45).astype(np.uint8)
    base[:, :, 2] = ((xx // 25 + yy // 22) % 85 + 55).astype(np.uint8)
    all_boxes = []
    masked_percentages = []
    for frame_idx in range(baseline.SAMPLES):
        # Average 86.4 of 144 equally-sized tiles = precisely 60%.
        # Fixed 26x26 always-hidden patch adds about +0.02 percentage points.
        blocks = 87 if frame_idx % 5 in (0, 1) else 86
        selected = rng.choice(GRID_ROWS * GRID_COLS, size=blocks, replace=False)
        mask = np.zeros((baseline.HEIGHT, baseline.WIDTH), dtype=np.bool_)
        frame = (base.astype(np.uint16) +
                 rng.integers(0, 5, size=base.shape, dtype=np.uint8)).astype(np.uint8)
        boxes = [{"x": 490, "y": 350, "width": 26, "height": 26}]
        mask[350:376, 490:516] = True
        frame[350:376, 490:516] = (180, 95, 55)
        for cell in selected:
            cy, cx = divmod(int(cell), GRID_COLS)
            x, y = cx * CELL_WIDTH, cy * CELL_HEIGHT
            box = {"x": x, "y": y, "width": CELL_WIDTH, "height": CELL_HEIGHT}
            boxes.append(box)
            mask[y:y + CELL_HEIGHT, x:x + CELL_WIDTH] = True
            frame[y:y + CELL_HEIGHT, x:x + CELL_WIDTH] = (
                int((53 + 9 * cell + 5 * frame_idx) % 256),
                int((131 + 7 * cell + 3 * frame_idx) % 256),
                int((211 + 11 * cell + 2 * frame_idx) % 256),
            )
        actual = float(np.count_nonzero(mask)) / float(mask.size) * 100
        if not (59.5 <= actual <= 60.6):
            raise AssertionError(f"Unexpected mask coverage {actual}")
        masked_percentages.append(actual)
        mm[frame_idx] = frame
        all_boxes.append(boxes)
    mm.flush()
    del mm
    boxes_file.write_text(json.dumps(all_boxes), encoding="utf-8")
    stats = {
        "mean_masked_percent": round(statistics.fmean(masked_percentages), 5),
        "min_masked_percent": round(min(masked_percentages), 5),
        "max_masked_percent": round(max(masked_percentages), 5),
        "boxes_per_frame_min": min(map(len, all_boxes)),
        "boxes_per_frame_max": max(map(len, all_boxes)),
        "mask_fraction_computed_from_box_union": True,
        "per_frame_masked_percent": [round(p, 5) for p in masked_percentages],
    }
    return path, boxes_file, stats


def run(args: argparse.Namespace) -> None:
    baseline.ensure_checkout(args.old, baseline.OLD_SHA)
    baseline.ensure_checkout(args.new, baseline.NEW_SHA)
    with tempfile.TemporaryDirectory(prefix="traffic-median-mask60-") as temporary:
        dataset, boxes, mask_stats = make_mask60(Path(temporary))
        initial_sha256 = baseline.sha256(dataset)
        results = {"old": [], "new": []}
        for i in range(args.repetitions):
            for version in (("old", "new") if i % 2 == 0 else ("new", "old")):
                cmd = [
                    sys.executable, str(Path(baseline.__file__).resolve()),
                    "--worker", "--old", str(args.old), "--new", str(args.new),
                    "--version", version, "--samples", str(dataset), "--boxes", str(boxes),
                ]
                child = subprocess.run(cmd, capture_output=True, text=True, check=True)
                item = json.loads(child.stdout)
                results[version].append(item)
        if baseline.sha256(dataset) != initial_sha256:
            raise AssertionError("Input memmap was mutated")
        hashes = {measurement["output_sha256"] for group in results.values()
                  for measurement in group}
        if len(hashes) != 1:
            raise AssertionError("Old and new median produced different full outputs")
        old_med = statistics.median(r["elapsed_ms"] for r in results["old"])
        new_med = statistics.median(r["elapsed_ms"] for r in results["new"])
        report = {
            "test": "60-percent synthetic mask coverage, production full-frame median algorithm",
            "source_commits": {"old": baseline.OLD_SHA, "new": baseline.NEW_SHA},
            "host": {"machine": platform.machine(), "platform": platform.platform(),
                     "numpy": np.__version__, "python": sys.version.split()[0]},
            "configuration": {
                "resolution": [baseline.WIDTH, baseline.HEIGHT, 3],
                "sample_count": baseline.SAMPLES, "tile_rows": baseline.TILE_ROWS,
                "input": "read-only uint8 memmap", "inpaint_radius": 3.0,
                "repetitions": args.repetitions,
            },
            "mask_statistics": mask_stats,
            "baseline_median_ms": old_med, "optimized_median_ms": new_med,
            "speedup": old_med / new_med, "output_byte_identical": True,
            "input_unchanged": True,
            "input_sha256": initial_sha256,
            "output_sha256": next(iter(hashes)),
            "raw_timings": results,
            "limitations": [
                "Synthetic grid of occluding bounding boxes, not actual detector output",
                "Hosted ARM64 CPU, not Raspberry Pi 5 hardware",
                "Only full median/inpainting function, not collection or overall FPS",
            ],
        }
        args.output.parent.mkdir(parents=True, exist_ok=True)
        args.output.write_text(json.dumps(report, indent=2) + "\n", encoding="utf-8")
        print("Masked area: mean %.3f%% (range %.3f%%-%.3f%%)" %
              (mask_stats["mean_masked_percent"], mask_stats["min_masked_percent"],
               mask_stats["max_masked_percent"]), flush=True)
        print("Before: %.3f ms; after: %.3f ms; speedup: %.2fx" %
              (old_med, new_med, old_med / new_med), flush=True)
        print("Full output byte-identical; input unchanged: YES", flush=True)
        print("Report:", args.output, flush=True)


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--old", type=Path, required=True)
    parser.add_argument("--new", type=Path, required=True)
    parser.add_argument("--repetitions", type=int, default=3)
    parser.add_argument("--output", type=Path, default=Path("results/traffic-median-60pct.json"))
    args = parser.parse_args()
    if args.repetitions < 2:
        parser.error("Need at least two repetitions")
    run(args)
