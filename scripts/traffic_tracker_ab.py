#!/usr/bin/env python3
"""Throwaway tracker A/B probe for the traffic-counting migration.

Replays the repository's raw per-frame detector CSV through either BoxMOT 25
or Roboflow Trackers 2.6.0 and prints compact JSON metrics. This lives only in
the Playground verification branch; it is not production application code.
"""

from __future__ import annotations

import argparse
import csv
import json
import math
import resource
import statistics
import time
from collections import Counter, defaultdict
from pathlib import Path

import numpy as np

MIN_CONF = 0.10
TRACK_THRESH = 0.30
MATCH_THRESH = 0.80
TRACK_BUFFER = 45
FRAME_RATE = 30.0


def iter_frames(path: Path):
    with path.open(newline="", encoding="utf-8-sig") as handle:
        reader = csv.DictReader(handle)
        current_frame = None
        rows: list[dict[str, str]] = []
        for row in reader:
            frame = int(row["frame"])
            if current_frame is None:
                current_frame = frame
            if frame != current_frame:
                yield current_frame, rows
                current_frame = frame
                rows = []
            rows.append(row)
        if current_frame is not None:
            yield current_frame, rows


def raw_arrays(rows: list[dict[str, str]]):
    xyxy = np.asarray(
        [[float(r["x1"]), float(r["y1"]), float(r["x2"]), float(r["y2"])] for r in rows],
        dtype=np.float32,
    )
    conf = np.asarray([float(r["confidence"]) for r in rows], dtype=np.float32)
    cls = np.asarray([int(r["class_id"]) for r in rows], dtype=np.int32)
    return xyxy, conf, cls


def percentile(values: list[int], q: float) -> float:
    if not values:
        return 0.0
    ordered = sorted(values)
    index = (len(ordered) - 1) * q
    lo = math.floor(index)
    hi = math.ceil(index)
    if lo == hi:
        return float(ordered[lo])
    fraction = index - lo
    return float(ordered[lo] * (1.0 - fraction) + ordered[hi] * fraction)


def summarize(
    *,
    name: str,
    threshold: float | None,
    total_frames: int,
    total_input: int,
    accepted_input: int,
    assignments: dict[int, list[int]],
    track_classes: dict[int, int],
    tracker_seconds: float,
):
    lengths = [len(frames) for frames in assignments.values()]
    gap_events = 0
    gap_frames = 0
    recovered_gap_events = 0
    for frames in assignments.values():
        ordered = sorted(set(frames))
        for previous, current in zip(ordered, ordered[1:]):
            gap = current - previous - 1
            if gap > 0:
                gap_events += 1
                gap_frames += gap
                if gap <= TRACK_BUFFER:
                    recovered_gap_events += 1

    class_tracks = Counter(track_classes.values())
    result = {
        "name": name,
        "minimum_iou_threshold": threshold,
        "frames": total_frames,
        "raw_detections": total_input,
        "accepted_detections": accepted_input,
        "assigned_rows": int(sum(lengths)),
        "assignment_coverage": (sum(lengths) / accepted_input) if accepted_input else 0.0,
        "unique_tracks": len(lengths),
        "tracks_per_1000_frames": (len(lengths) * 1000.0 / total_frames) if total_frames else 0.0,
        "mean_rows_per_track": statistics.fmean(lengths) if lengths else 0.0,
        "median_rows_per_track": statistics.median(lengths) if lengths else 0.0,
        "p95_rows_per_track": percentile(lengths, 0.95),
        "short_tracks_le_2": sum(v <= 2 for v in lengths),
        "short_tracks_le_5": sum(v <= 5 for v in lengths),
        "short_tracks_le_10": sum(v <= 10 for v in lengths),
        "short_track_le_5_ratio": (sum(v <= 5 for v in lengths) / len(lengths)) if lengths else 0.0,
        "gap_events_inside_tracks": gap_events,
        "gap_frames_inside_tracks": gap_frames,
        "recovered_gap_events_le_buffer": recovered_gap_events,
        "tracker_seconds": tracker_seconds,
        "tracker_ms_per_frame": tracker_seconds * 1000.0 / total_frames if total_frames else 0.0,
        "max_rss_kb": resource.getrusage(resource.RUSAGE_SELF).ru_maxrss,
        "tracks_by_class": {str(k): v for k, v in sorted(class_tracks.items())},
    }
    print(json.dumps(result, sort_keys=True))


def replay_boxmot(path: Path):
    try:
        from boxmot import ByteTrack
    except ImportError:
        from boxmot.trackers import ByteTrack

    tracker = ByteTrack(
        min_conf=MIN_CONF,
        track_thresh=TRACK_THRESH,
        match_thresh=MATCH_THRESH,
        track_buffer=TRACK_BUFFER,
        frame_rate=int(FRAME_RATE),
    )
    # The project's previous adapter passed an image into BoxMOT. Standard IoU
    # ByteTrack does not use pixels, but keep the same call shape for parity.
    image = np.zeros((1080, 1920, 3), dtype=np.uint8)
    assignments: dict[int, list[int]] = defaultdict(list)
    track_classes: dict[int, int] = {}
    total_frames = total_input = accepted_input = 0
    tracker_seconds = 0.0

    for frame, rows in iter_frames(path):
        total_frames += 1
        xyxy, conf, cls = raw_arrays(rows)
        total_input += len(rows)
        accepted_input += int(np.count_nonzero((conf > MIN_CONF) & (conf != TRACK_THRESH)))
        dets = np.column_stack((xyxy, conf, cls.astype(np.float32))).astype(np.float32, copy=False)
        started = time.perf_counter()
        tracked = tracker.update(dets, image)
        tracker_seconds += time.perf_counter() - started
        arr = np.asarray(tracked)
        if arr.size == 0:
            continue
        if arr.ndim == 1:
            arr = arr.reshape(1, -1)
        for row in arr:
            if row.shape[0] < 7:
                continue
            track_id = int(row[4])
            if track_id < 0:
                continue
            assignments[track_id].append(frame)
            track_classes.setdefault(track_id, int(row[6]))

    summarize(
        name="boxmot-25",
        threshold=None,
        total_frames=total_frames,
        total_input=total_input,
        accepted_input=accepted_input,
        assignments=assignments,
        track_classes=track_classes,
        tracker_seconds=tracker_seconds,
    )


def replay_roboflow(path: Path, minimum_iou_threshold: float):
    import supervision as sv
    from trackers import ByteTrackTracker

    tracker = ByteTrackTracker(
        lost_track_buffer=TRACK_BUFFER,
        frame_rate=FRAME_RATE,
        track_activation_threshold=TRACK_THRESH,
        high_conf_det_threshold=TRACK_THRESH,
        minimum_consecutive_frames=1,
        minimum_iou_threshold=minimum_iou_threshold,
    )
    assignments: dict[int, list[int]] = defaultdict(list)
    track_classes: dict[int, int] = {}
    total_frames = total_input = accepted_input = 0
    tracker_seconds = 0.0

    for frame, rows in iter_frames(path):
        total_frames += 1
        xyxy, conf, cls = raw_arrays(rows)
        total_input += len(rows)
        mask = (conf > MIN_CONF) & (conf != TRACK_THRESH)
        xyxy = xyxy[mask]
        conf = conf[mask]
        cls = cls[mask]
        accepted_input += len(xyxy)
        detections = sv.Detections(xyxy=xyxy, confidence=conf, class_id=cls)
        started = time.perf_counter()
        tracked = tracker.update(detections)
        tracker_seconds += time.perf_counter() - started
        if tracked.tracker_id is None:
            continue
        for index, track_id_raw in enumerate(tracked.tracker_id):
            track_id = int(track_id_raw)
            if track_id < 0:
                continue
            assignments[track_id].append(frame)
            if tracked.class_id is not None:
                track_classes.setdefault(track_id, int(tracked.class_id[index]))

    summarize(
        name="roboflow-2.6",
        threshold=minimum_iou_threshold,
        total_frames=total_frames,
        total_input=total_input,
        accepted_input=accepted_input,
        assignments=assignments,
        track_classes=track_classes,
        tracker_seconds=tracker_seconds,
    )


def summarize_historical(path: Path):
    assignments: dict[int, list[int]] = defaultdict(list)
    track_classes: dict[int, int] = {}
    total_rows = 0
    max_frame = -1
    with path.open(newline="", encoding="utf-8-sig") as handle:
        reader = csv.DictReader(handle)
        for row in reader:
            total_rows += 1
            frame = int(row["frame"])
            max_frame = max(max_frame, frame)
            track_id = int(row["track_id"])
            assignments[track_id].append(frame)
            track_classes.setdefault(track_id, int(row["class_id"]))
    summarize(
        name="historical-tracks-csv",
        threshold=None,
        total_frames=max_frame + 1,
        total_input=total_rows,
        accepted_input=total_rows,
        assignments=assignments,
        track_classes=track_classes,
        tracker_seconds=0.0,
    )


def main():
    parser = argparse.ArgumentParser()
    parser.add_argument("mode", choices=("boxmot", "roboflow", "historical"))
    parser.add_argument("--detections", type=Path)
    parser.add_argument("--tracks", type=Path)
    parser.add_argument("--iou", type=float, default=0.2)
    args = parser.parse_args()

    if args.mode == "historical":
        if args.tracks is None:
            parser.error("--tracks is required for historical mode")
        summarize_historical(args.tracks)
        return
    if args.detections is None:
        parser.error("--detections is required")
    if args.mode == "boxmot":
        replay_boxmot(args.detections)
    else:
        replay_roboflow(args.detections, args.iou)


if __name__ == "__main__":
    main()
