#!/usr/bin/env python3
"""Full-frame, production-configuration comparison of historical vs current median.

The two exact production modules are loaded from private checkouts at pinned SHAs.
Only synthetic data, numerical timings and digests are exposed by the public CI.
This is an ARM64 hosted-runner CPU benchmark, not a Pi 5/live-camera measurement.
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
import tempfile
import time

import numpy as np

WIDTH = 1296
HEIGHT = 972
SAMPLES = 60
TILE_ROWS = 32
SHAPE = (SAMPLES, HEIGHT, WIDTH, 3)
OLD_SHA = "e2ec5b544f084029d9fcfc473af2567c668a03ae"
NEW_SHA = "805ac7fa4d7970f37b56b8e37dab738c923ce795"


def sha256(path: Path) -> str:
    h = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(4 * 1024 * 1024), b""):
            h.update(chunk)
    return h.hexdigest()


def ensure_checkout(root: Path, expected: str) -> None:
    sha = subprocess.check_output(
        ["git", "-C", str(root.parent), "rev-parse", "HEAD"], text=True
    ).strip()
    if sha != expected:
        raise RuntimeError(f"Wrong pinned source version: {sha} != {expected}")
    if not (root / "src/analysis/background/masked_median.py").is_file():
        raise FileNotFoundError(root)


def generate_inputs(target: Path, scene: str) -> tuple[Path, Path]:
    """Full 60-image uint8 disk-backed input and detector-like rectangular masks."""
    rng = np.random.default_rng(20261019 if scene == "moderate" else 20261020)
    yy, xx = np.indices((HEIGHT, WIDTH), dtype=np.uint16)
    base = np.empty((HEIGHT, WIDTH, 3), dtype=np.uint8)
    base[:, :, 0] = ((xx // 6 + yy // 13) % 85 + 35).astype(np.uint8)
    base[:, :, 1] = ((xx // 17 + yy // 9) % 75 + 45).astype(np.uint8)
    base[:, :, 2] = ((xx // 25 + yy // 22) % 85 + 55).astype(np.uint8)
    # Simulate static scene, sensor/lighting noise and moving foreground boxes.
    count = 7 if scene == "moderate" else 37
    dataset = target / f"{scene}-samples.uint8"
    metadata = target / f"{scene}-boxes.json"
    samples = np.memmap(dataset, dtype=np.uint8, mode="w+", shape=SHAPE)
    all_boxes: list[list[dict[str, int]]] = []
    for frame_id in range(SAMPLES):
        frame = (base.astype(np.uint16) +
                 rng.integers(0, 5, size=base.shape, dtype=np.uint8)).astype(np.uint8)
        boxes: list[dict[str, int]] = []
        # Always-hidden region: checks the real inpainting branch.
        boxes.append({"x": 490, "y": 350, "width": 26, "height": 26})
        frame[350:376, 490:516] = (180, 95, 55)
        for j in range(count):
            w = 21 + (j * 19 % 107)
            h = 31 + (j * 13 % 89)
            x = (j * 127 + frame_id * (5 + j % 4)) % (WIDTH - w)
            y = (j * 97 + frame_id * (3 + j % 3)) % (HEIGHT - h)
            boxes.append({"x": int(x), "y": int(y),
                          "width": int(w), "height": int(h)})
            frame[y:y + h, x:x + w, :] = (
                (57 + j * 13) % 256, (131 + j * 19) % 256, (221 + j * 7) % 256
            )
        samples[frame_id] = frame
        all_boxes.append(boxes)
    samples.flush()
    del samples
    metadata.write_text(json.dumps(all_boxes), encoding="utf-8")
    return dataset, metadata


def load_implementation(root: Path, version: str):
    # Both versions use the same stable BoundingBox dataclass and dependencies.
    sys.path.insert(0, str(root / "src"))
    from analysis.background.models import BoundingBox
    filename = root / "src/analysis/background/masked_median.py"
    spec = importlib.util.spec_from_file_location(f"median_{version}", filename)
    if spec is None or spec.loader is None:
        raise RuntimeError(f"Unable to load production module {version}")
    module = importlib.util.module_from_spec(spec)
    spec.loader.exec_module(module)
    return module.compute_masked_median, BoundingBox


def worker(args: argparse.Namespace) -> None:
    root = args.old if args.version == "old" else args.new
    impl, BoundingBox = load_implementation(root, args.version)
    boxes_raw = json.loads(args.boxes.read_text(encoding="utf-8"))
    boxes = tuple(tuple(BoundingBox(**box) for box in frame) for frame in boxes_raw)
    source = np.memmap(args.samples, dtype=np.uint8, mode="r", shape=SHAPE)
    before = resource.getrusage(resource.RUSAGE_SELF)
    t0 = time.perf_counter_ns()
    result = impl(source, boxes, tile_rows=TILE_ROWS, inpaint_radius=3.0)
    elapsed_ms = (time.perf_counter_ns() - t0) / 1_000_000
    after = resource.getrusage(resource.RUSAGE_SELF)
    if result.shape != (HEIGHT, WIDTH, 3) or result.dtype != np.uint8:
        raise AssertionError("Unexpected production output geometry/type")
    print(json.dumps({
        "version": args.version,
        "elapsed_ms": round(elapsed_ms, 3),
        "process_cpu_ms": round((after.ru_utime + after.ru_stime -
                                before.ru_utime - before.ru_stime) * 1000, 3),
        "peak_rss_mib": round(after.ru_maxrss / 1024, 2),
        "output_sha256": hashlib.sha256(result.tobytes()).hexdigest(),
        "shape": [HEIGHT, WIDTH, 3],
    }), flush=True)


def main(args: argparse.Namespace) -> None:
    ensure_checkout(args.old, OLD_SHA)
    ensure_checkout(args.new, NEW_SHA)
    cases = []
    with tempfile.TemporaryDirectory(prefix="median-fullframe-") as scratch:
        temporary = Path(scratch)
        for scene in ("moderate", "dense"):
            samples, boxes = generate_inputs(temporary, scene)
            measurements = {"old": [], "new": []}
            # Swap execution order across iterations to reduce order bias.
            for iteration in range(args.repetitions):
                order = ("old", "new") if iteration % 2 == 0 else ("new", "old")
                for version in order:
                    root = args.old if version == "old" else args.new
                    command = [
                        sys.executable, str(Path(__file__).resolve()), "--worker",
                        "--old", str(args.old), "--new", str(args.new),
                        "--version", version, "--samples", str(samples),
                        "--boxes", str(boxes)
                    ]
                    run = subprocess.run(command, check=True, text=True,
                                         capture_output=True)
                    measurements[version].append(json.loads(run.stdout))
            digests = {v["output_sha256"] for group in measurements.values()
                       for v in group}
            if len(digests) != 1:
                raise AssertionError(f"{scene}: old/new outputs differ: {digests}")
            old_ms = statistics.median(m["elapsed_ms"] for m in measurements["old"])
            new_ms = statistics.median(m["elapsed_ms"] for m in measurements["new"])
            cases.append({
                "scenario": scene,
                "description": ("7 moving simulated objects + permanent mask" if
                                scene == "moderate" else
                                "37 moving simulated objects + permanent mask"),
                "input_sha256": sha256(samples),
                "box_counts": [len(json.loads(boxes.read_text())[0])],
                "old_median_ms": old_ms,
                "new_median_ms": new_ms,
                "speedup": round(old_ms / new_ms, 3),
                "old_runs": measurements["old"],
                "new_runs": measurements["new"],
                "byte_identical": True,
            })
            print(f"{scene}: {old_ms:.1f} -> {new_ms:.1f} ms "
                  f"({old_ms/new_ms:.2f}x); identical output", flush=True)
    report = {
        "scope": "actual production median function, full-frame, synthetic samples/masks",
        "not_measured": ["camera", "NCNN", "tracking", "background collecting",
                         "background refresh scheduling", "long-run Pi 5 thermals"],
        "host": {"machine": platform.machine(), "platform": platform.platform(),
                 "cpu_count": os.cpu_count(), "python": sys.version.split()[0],
                 "numpy": np.__version__},
        "config": {"width": WIDTH, "height": HEIGHT, "samples": SAMPLES,
                   "tile_rows": TILE_ROWS, "inpaint_radius": 3.0,
                   "disk_backed_memmap": True, "repetitions": args.repetitions},
        "source_commits": {"old": OLD_SHA, "new": NEW_SHA},
        "results": cases,
    }
    args.output.parent.mkdir(parents=True, exist_ok=True)
    args.output.write_text(json.dumps(report, indent=2) + "\n", encoding="utf-8")
    print("Results (only summary and hashes, no private data):", args.output)


if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--old", type=Path, required=True)
    parser.add_argument("--new", type=Path, required=True)
    parser.add_argument("--output", type=Path, default=Path("results/median-fullframe.json"))
    parser.add_argument("--repetitions", type=int, default=3)
    parser.add_argument("--worker", action="store_true")
    parser.add_argument("--version", choices=("old", "new"))
    parser.add_argument("--samples", type=Path)
    parser.add_argument("--boxes", type=Path)
    opts = parser.parse_args()
    if opts.worker:
        worker(opts)
    else:
        if opts.repetitions < 2:
            parser.error("Use at least two full-frame repetitions")
        main(opts)
