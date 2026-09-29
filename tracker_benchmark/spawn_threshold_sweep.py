#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import statistics
import time
from pathlib import Path

import numpy as np

import benchmark as b

WEIGHTS = {"clean": 0.08, "crossing": 0.18, "occlusion": 0.32, "dense": 0.27, "noisy": 0.15}
THRESHOLDS = (0.30, 0.35, 0.40, 0.45, 0.50, 0.60)


def count_closeness(ratio: float) -> float:
    ratio = max(float(ratio), 1e-9)
    return min(ratio, 1.0 / ratio)


class RoboflowTuned:
    def __init__(self, activation: float, confirm: int = 1):
        from trackers import ByteTrackTracker
        self.t = ByteTrackTracker(
            lost_track_buffer=b.TRACK_BUFFER,
            frame_rate=b.FPS,
            track_activation_threshold=activation,
            high_conf_det_threshold=b.TRACK_THRESH,
            minimum_consecutive_frames=confirm,
            minimum_iou_threshold=b.IOU_FLOOR,
        )

    def update(self, detections):
        return b.sv_out(self.t.update(b.sv_dets(detections)))


class TrackforgeTuned:
    def __init__(self, spawn: float):
        from trackforge import BYTETRACK
        self.t = BYTETRACK(
            track_thresh=b.TRACK_THRESH,
            track_buffer=b.TRACK_BUFFER,
            match_thresh=b.MATCH_THRESH,
            det_thresh=spawn,
        )

    def update(self, detections):
        inp = [
            ([float(bb[0]), float(bb[1]), float(bb[2]-bb[0]), float(bb[3]-bb[1])], float(s), int(c))
            for bb, s, c in detections
        ]
        return [
            (int(tid), np.array([tl[0], tl[1], tl[0]+tl[2], tl[1]+tl[3]], np.float32))
            for tid, tl, *_ in self.t.update(inp)
        ]


def score_factory(factory) -> dict:
    modes = {}
    for mode in ("clean", "crossing", "occlusion", "dense", "noisy"):
        vals = [b.evaluate(factory(), b.generate(seed, mode)) for seed in (13, 37)]
        modes[mode] = {k: statistics.mean(v[k] for v in vals) for k in vals[0]}

    score = 0.0
    for mode, weight in WEIGHTS.items():
        m = modes[mode]
        close = count_closeness(m["count_ratio"])
        score += weight * (
            0.50 * m["idf1"]
            + 0.15 * m["reid"]
            + 0.10 * m["precision"]
            + 0.10 * m["recall"]
            + 0.15 * close
        )

    stream = b.perf_stream(800)
    adapter = factory()
    for d in stream[:80]:
        adapter.update(d)
    timings = []
    for d in stream[80:]:
        t0 = time.perf_counter_ns()
        adapter.update(d)
        timings.append((time.perf_counter_ns() - t0) / 1e6)

    return {
        "accuracy_count_score": 100.0 * score,
        "mean_ms": statistics.mean(timings),
        "p95_ms": float(np.percentile(timings, 95)),
        "dense_count_ratio": modes["dense"]["count_ratio"],
        "noisy_count_ratio": modes["noisy"]["count_ratio"],
        "occlusion_idf1": modes["occlusion"]["idf1"],
        "occlusion_reid": modes["occlusion"]["reid"],
        "dense_idf1": modes["dense"]["idf1"],
        "noisy_idf1": modes["noisy"]["idf1"],
        "modes": modes,
    }


def main() -> None:
    p = argparse.ArgumentParser()
    p.add_argument("--out", default="tracker_benchmark/results-arm64")
    args = p.parse_args()
    out = Path(args.out)
    out.mkdir(parents=True, exist_ok=True)

    rows = []
    for threshold in THRESHOLDS:
        r = score_factory(lambda t=threshold: TrackforgeTuned(t))
        r.update(library="trackforge", spawn_threshold=threshold, confirm_frames=3)
        rows.append(r)
    for threshold in THRESHOLDS:
        r = score_factory(lambda t=threshold: RoboflowTuned(t, 1))
        r.update(library="roboflow", spawn_threshold=threshold, confirm_frames=1)
        rows.append(r)
    # Confirmation is an independent anti-flicker lever in Roboflow Trackers.
    for threshold in (0.40, 0.50, 0.60):
        r = score_factory(lambda t=threshold: RoboflowTuned(t, 2))
        r.update(library="roboflow", spawn_threshold=threshold, confirm_frames=2)
        rows.append(r)

    rows.sort(key=lambda x: x["accuracy_count_score"], reverse=True)
    (out / "spawn-threshold.json").write_text(json.dumps(rows, indent=2) + "\n")

    md = [
        "# ByteTrack spawn-threshold sweep",
        "",
        "Association stays at the production-style low-confidence setting (`track/high split=0.30`, match threshold `0.80`, buffer `45`). Only the confidence required to create a new identity is raised.",
        "",
        "|Rank|Implementation|Spawn threshold|Confirm frames|Accuracy/count score|Dense track/GT|Noisy track/GT|Occlusion IDF1|Occlusion ID survival|Mean ms|P95 ms|",
        "|---:|---|---:|---:|---:|---:|---:|---:|---:|---:|---:|",
    ]
    for i, r in enumerate(rows, 1):
        md.append(
            f"|{i}|{r['library']}|{r['spawn_threshold']:.2f}|{r['confirm_frames']}|{r['accuracy_count_score']:.2f}|"
            f"{r['dense_count_ratio']:.3f}|{r['noisy_count_ratio']:.3f}|{100*r['occlusion_idf1']:.1f}|"
            f"{100*r['occlusion_reid']:.1f}%|{r['mean_ms']:.4f}|{r['p95_ms']:.4f}|"
        )

    for library in ("trackforge", "roboflow"):
        best = max((r for r in rows if r["library"] == library), key=lambda x: x["accuracy_count_score"])
        md += [
            "",
            f"## Best {library}",
            "",
            f"Spawn threshold **{best['spawn_threshold']:.2f}**, confirmation **{best['confirm_frames']}**: "
            f"score {best['accuracy_count_score']:.2f}, dense count ratio {best['dense_count_ratio']:.3f}, "
            f"noisy count ratio {best['noisy_count_ratio']:.3f}, {best['mean_ms']:.4f} ms/frame.",
        ]

    (out / "spawn-threshold.md").write_text("\n".join(md) + "\n")
    print((out / "spawn-threshold.md").read_text())


if __name__ == "__main__":
    main()
