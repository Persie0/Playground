#!/usr/bin/env python3
from __future__ import annotations

import argparse
import configparser
import csv
import json
import os
import shutil
import sys
import time
from pathlib import Path
from types import SimpleNamespace

import numpy as np

LOW_CONF = 0.10
HIGH_CONF = 0.60
SPAWN_CONF = 0.70
MATCH_THRESH = 0.80
TRACK_BUFFER = 30
FPS = 30


def mot_detections(path: Path) -> dict[int, list[tuple[np.ndarray, float, int]]]:
    by_frame: dict[int, list[tuple[np.ndarray, float, int]]] = {}
    with path.open(newline="") as f:
        for row in csv.reader(f):
            if len(row) < 7:
                continue
            frame = int(float(row[0]))
            x, y, w, h = map(float, row[2:6])
            conf = float(row[6])
            if conf <= LOW_CONF or w <= 0 or h <= 0:
                continue
            box = np.asarray([x, y, x + w, y + h], dtype=np.float32)
            by_frame.setdefault(frame, []).append((box, conf, 0))
    return by_frame


def sequence_info(seq_dir: Path) -> tuple[int, int, int]:
    cfg = configparser.ConfigParser()
    cfg.read(seq_dir / "seqinfo.ini")
    s = cfg["Sequence"]
    return int(s["seqLength"]), int(s["imWidth"]), int(s["imHeight"])


def sv_detections(dets):
    import supervision as sv
    if not dets:
        out = sv.Detections.empty()
        out.confidence = np.empty((0,), dtype=np.float32)
        out.class_id = np.empty((0,), dtype=np.int32)
        return out
    return sv.Detections(
        xyxy=np.asarray([d[0] for d in dets], dtype=np.float32),
        confidence=np.asarray([d[1] for d in dets], dtype=np.float32),
        class_id=np.asarray([d[2] for d in dets], dtype=np.int32),
    )


def sv_output(x):
    if x is None or len(x) == 0 or getattr(x, "tracker_id", None) is None:
        return []
    return [
        (int(tid), np.asarray(box, dtype=np.float32))
        for tid, box in zip(x.tracker_id, x.xyxy)
        if int(tid) >= 0
    ]


class RoboflowByteTrack:
    def __init__(self, width: int, height: int):
        from trackers import ByteTrackTracker
        self.t = ByteTrackTracker(
            lost_track_buffer=TRACK_BUFFER,
            frame_rate=FPS,
            track_activation_threshold=SPAWN_CONF,
            minimum_consecutive_frames=1,
            minimum_iou_threshold=1.0 - MATCH_THRESH,
            high_conf_det_threshold=HIGH_CONF,
        )

    def update(self, dets):
        return sv_output(self.t.update(sv_detections(dets)))


class SupervisionByteTrack:
    def __init__(self, width: int, height: int):
        import supervision as sv
        # Supervision uses activation as high/low split and internally sets
        # new-track threshold to activation + 0.1, matching 0.6 -> 0.7 here.
        self.t = sv.ByteTrack(
            track_activation_threshold=HIGH_CONF,
            lost_track_buffer=TRACK_BUFFER,
            minimum_matching_threshold=MATCH_THRESH,
            frame_rate=FPS,
            minimum_consecutive_frames=1,
        )

    def update(self, dets):
        return sv_output(self.t.update_with_detections(sv_detections(dets)))


class TrackforgeByteTrack:
    def __init__(self, width: int, height: int):
        from trackforge import BYTETRACK
        self.t = BYTETRACK(
            track_thresh=HIGH_CONF,
            track_buffer=TRACK_BUFFER,
            match_thresh=MATCH_THRESH,
            det_thresh=SPAWN_CONF,
        )

    def update(self, dets):
        inp = [
            ([float(b[0]), float(b[1]), float(b[2] - b[0]), float(b[3] - b[1])], float(s), int(c))
            for b, s, c in dets
        ]
        out = []
        for row in self.t.update(inp):
            tid, tlwh = int(row[0]), row[1]
            out.append((tid, np.asarray([tlwh[0], tlwh[1], tlwh[0] + tlwh[2], tlwh[1] + tlwh[3]], dtype=np.float32)))
        return out


class ArtefactoryByteTrack:
    def __init__(self, width: int, height: int):
        from bytetracker import BYTETracker
        self.t = BYTETracker(
            track_thresh=HIGH_CONF,
            track_buffer=TRACK_BUFFER,
            match_thresh=MATCH_THRESH,
            frame_rate=FPS,
        )
        self.frame = 0

    def update(self, dets):
        self.frame += 1
        a = np.asarray([[*map(float, b), float(s), float(c)] for b, s, c in dets], dtype=np.float32)
        if not a.size:
            a = np.empty((0, 6), dtype=np.float32)
        r = self.t.update(a, self.frame)
        if r is None or len(r) == 0:
            return []
        return [(int(x[4]), np.asarray(x[:4], dtype=np.float32)) for x in r if int(x[4]) >= 0]


class BoxMOTByteTrack:
    def __init__(self, width: int, height: int, backend: str):
        from boxmot import create_tracker
        common = dict(
            backend=backend,
            geometry="aabb",
            per_class=False,
            track_thresh=HIGH_CONF,
            track_buffer=TRACK_BUFFER,
            match_thresh=MATCH_THRESH,
        )
        # Some BoxMOT releases expose a separate new-track threshold, while
        # 25.0.0 may not. Prefer it if available and fall back cleanly.
        try:
            self.t = create_tracker("bytetrack", new_track_thresh=SPAWN_CONF, **common)
            self.spawn_semantics = "separate-0.70"
        except Exception:
            self.t = create_tracker("bytetrack", **common)
            self.spawn_semantics = "package-default"

    def update(self, dets):
        a = np.asarray([[*map(float, b), float(s), float(c)] for b, s, c in dets], dtype=np.float32)
        if not a.size:
            a = np.empty((0, 6), dtype=np.float32)
        r = self.t.update(a, None)
        if r is None or len(r) == 0:
            return []
        return [(int(x[4]), np.asarray(x[:4], dtype=np.float32)) for x in r if int(x[4]) >= 0]


class OriginalByteTrack:
    def __init__(self, width: int, height: int):
        # FoundationVision/ByteTrack is cloned by the workflow and put on PYTHONPATH.
        # NumPy 2 removed np.float, which the reference 2021 code still uses.
        if not hasattr(np, "float"):
            np.float = float  # type: ignore[attr-defined]
        from yolox.tracker.byte_tracker import BYTETracker
        args = SimpleNamespace(
            track_thresh=HIGH_CONF,
            track_buffer=TRACK_BUFFER,
            match_thresh=MATCH_THRESH,
            mot20=False,
        )
        self.t = BYTETracker(args, frame_rate=FPS)
        self.width, self.height = width, height

    def update(self, dets):
        a = np.asarray([[*map(float, b), float(s)] for b, s, _ in dets], dtype=np.float32)
        if not a.size:
            a = np.empty((0, 5), dtype=np.float32)
        tracks = self.t.update(a, (self.height, self.width), (self.height, self.width))
        return [(int(t.track_id), np.asarray(t.tlbr, dtype=np.float32)) for t in tracks if int(t.track_id) >= 0]


FACTORIES = {
    "original-bytetrack": OriginalByteTrack,
    "supervision-bytetrack": SupervisionByteTrack,
    "roboflow-bytetrack": RoboflowByteTrack,
    "trackforge-bytetrack": TrackforgeByteTrack,
    "artefactory-bytetrack": ArtefactoryByteTrack,
    "boxmot-bytetrack-python": lambda w, h: BoxMOTByteTrack(w, h, "python"),
    "boxmot-bytetrack-cpp": lambda w, h: BoxMOTByteTrack(w, h, "cpp"),
}


def write_mot_line(f, frame: int, tid: int, box: np.ndarray):
    x1, y1, x2, y2 = map(float, box)
    w, h = max(0.0, x2 - x1), max(0.0, y2 - y1)
    if w <= 0 or h <= 0:
        return
    f.write(f"{frame},{tid},{x1:.3f},{y1:.3f},{w:.3f},{h:.3f},1,-1,-1,-1\n")


def prepare_eval_layout(dataset_root: Path, out_root: Path) -> list[Path]:
    train = dataset_root / "train"
    seqs = sorted(train.glob("MOT17-*-FRCNN"))
    if not seqs:
        candidates = list(dataset_root.rglob("MOT17-02-FRCNN"))
        if candidates:
            train = candidates[0].parent
            seqs = sorted(train.glob("MOT17-*-FRCNN"))
    if len(seqs) != 7:
        raise RuntimeError(f"Expected 7 MOT17 FRCNN train sequences, found {len(seqs)} under {train}")

    gt_base = out_root / "gt" / "MOT17-train"
    gt_base.mkdir(parents=True, exist_ok=True)
    seqmap = out_root / "MOT17-FRCNN-train.txt"
    seqmap.write_text("name\n" + "\n".join(s.name for s in seqs) + "\n")

    for seq in seqs:
        dst = gt_base / seq.name
        (dst / "gt").mkdir(parents=True, exist_ok=True)
        shutil.copy2(seq / "gt" / "gt.txt", dst / "gt" / "gt.txt")
        shutil.copy2(seq / "seqinfo.ini", dst / "seqinfo.ini")
    return seqs


def run_tracker(name: str, factory, seqs: list[Path], out_root: Path):
    tracker_dir = out_root / "trackers" / "MOT17-train" / name / "data"
    tracker_dir.mkdir(parents=True, exist_ok=True)
    per_seq = []
    total_ns = 0
    total_frames = 0
    total_dets = 0

    for seq in seqs:
        frame_count, width, height = sequence_info(seq)
        detections = mot_detections(seq / "det" / "det.txt")
        tracker = factory(width, height)
        seq_ns = 0
        seq_dets = 0
        with (tracker_dir / f"{seq.name}.txt").open("w") as f:
            for frame in range(1, frame_count + 1):
                dets = detections.get(frame, [])
                seq_dets += len(dets)
                t0 = time.perf_counter_ns()
                tracks = tracker.update(dets)
                seq_ns += time.perf_counter_ns() - t0
                for tid, box in tracks:
                    write_mot_line(f, frame, tid, box)
        total_ns += seq_ns
        total_frames += frame_count
        total_dets += seq_dets
        per_seq.append({
            "sequence": seq.name,
            "frames": frame_count,
            "detections": seq_dets,
            "tracker_ms_per_frame": seq_ns / 1e6 / frame_count,
        })

    return {
        "tracker": name,
        "frames": total_frames,
        "detections": total_dets,
        "tracker_ms_per_frame": total_ns / 1e6 / total_frames,
        "tracker_fps_equivalent": total_frames / (total_ns / 1e9) if total_ns else None,
        "sequences": per_seq,
    }


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--dataset-root", type=Path, required=True)
    ap.add_argument("--out", type=Path, required=True)
    args = ap.parse_args()
    args.out.mkdir(parents=True, exist_ok=True)

    seqs = prepare_eval_layout(args.dataset_root, args.out)
    results, skipped = [], {}
    for name, factory in FACTORIES.items():
        print(f"=== {name} ===", flush=True)
        try:
            result = run_tracker(name, factory, seqs, args.out)
            results.append(result)
            print(f"{name}: {result['tracker_ms_per_frame']:.4f} ms/frame", flush=True)
        except Exception as exc:
            skipped[name] = f"{type(exc).__name__}: {exc}"
            print(f"SKIP {name}: {skipped[name]}", file=sys.stderr, flush=True)

    payload = {
        "dataset": "MOT17 train, seven FRCNN public-detection sequences",
        "parameters": {
            "low_conf": LOW_CONF,
            "high_conf": HIGH_CONF,
            "spawn_conf": SPAWN_CONF,
            "match_thresh": MATCH_THRESH,
            "track_buffer_frames": TRACK_BUFFER,
            "nominal_fps": FPS,
        },
        "results": results,
        "skipped": skipped,
    }
    (args.out / "runtime.json").write_text(json.dumps(payload, indent=2))
    with (args.out / "runtime.csv").open("w", newline="") as f:
        w = csv.writer(f)
        w.writerow(["tracker", "frames", "detections", "ms_per_frame", "tracker_fps_equivalent"])
        for r in results:
            w.writerow([r["tracker"], r["frames"], r["detections"], f"{r['tracker_ms_per_frame']:.6f}", f"{r['tracker_fps_equivalent']:.2f}"])

    md = [
        "# MOT17 ByteTrack implementation runtime",
        "",
        "Same seven MOT17 train FRCNN public-detection sequences for every tracker. Detector inference and image I/O are excluded.",
        "",
        "| Tracker | ms/frame | tracker-only FPS |",
        "|---|---:|---:|",
    ]
    for r in sorted(results, key=lambda x: x["tracker_ms_per_frame"]):
        md.append(f"| {r['tracker']} | {r['tracker_ms_per_frame']:.4f} | {r['tracker_fps_equivalent']:.0f} |")
    if skipped:
        md += ["", "## Skipped", ""] + [f"- `{k}`: {v}" for k, v in skipped.items()]
    (args.out / "runtime.md").write_text("\n".join(md) + "\n")

    if len(results) < 4:
        raise SystemExit(f"Too few trackers ran successfully: {len(results)}")


if __name__ == "__main__":
    main()
