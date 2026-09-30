#!/usr/bin/env python3
from __future__ import annotations

import argparse
import csv
import json
from pathlib import Path


def read_summary(path: Path) -> dict[str, float]:
    lines = [line.strip() for line in path.read_text().splitlines() if line.strip()]
    if len(lines) < 2:
        raise ValueError(f"Invalid TrackEval summary: {path}")
    keys = lines[0].split()
    vals = lines[1].split()
    return {k: float(v) for k, v in zip(keys, vals)}


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("out", type=Path)
    args = ap.parse_args()

    runtime = json.loads((args.out / "runtime.json").read_text())
    runtime_by_name = {r["tracker"]: r for r in runtime["results"]}
    rows = []
    base = args.out / "trackers" / "MOT17-train"
    for tracker_dir in sorted(p for p in base.iterdir() if p.is_dir()):
        candidates = list(tracker_dir.rglob("pedestrian_summary.txt"))
        if not candidates:
            continue
        m = read_summary(candidates[0])
        r = runtime_by_name.get(tracker_dir.name, {})
        rows.append({
            "tracker": tracker_dir.name,
            "HOTA": m.get("HOTA"),
            "DetA": m.get("DetA"),
            "AssA": m.get("AssA"),
            "MOTA": m.get("MOTA"),
            "IDF1": m.get("IDF1"),
            "IDSW": m.get("IDSW"),
            "Frag": m.get("Frag"),
            "ms_per_frame": r.get("tracker_ms_per_frame"),
        })

    if not rows:
        raise SystemExit("No TrackEval summary files found")

    fields = ["tracker", "HOTA", "DetA", "AssA", "MOTA", "IDF1", "IDSW", "Frag", "ms_per_frame"]
    with (args.out / "final_results.csv").open("w", newline="") as f:
        w = csv.DictWriter(f, fieldnames=fields)
        w.writeheader()
        w.writerows(rows)
    (args.out / "final_results.json").write_text(json.dumps(rows, indent=2))

    def fmt(v, n=2):
        return "–" if v is None else f"{v:.{n}f}"

    md = [
        "# MOT17 FRCNN detection-only ByteTrack implementation comparison",
        "",
        "Seven MOT17 train FRCNN sequences; identical public detections; official TrackEval metrics; tracker runtime measured separately on the same ARM64 runner.",
        "",
        "| Tracker | HOTA ↑ | DetA ↑ | AssA ↑ | MOTA ↑ | IDF1 ↑ | IDSW ↓ | Frag ↓ | ms/frame ↓ |",
        "|---|---:|---:|---:|---:|---:|---:|---:|---:|",
    ]
    for row in sorted(rows, key=lambda x: (-(x["HOTA"] or -1), x["tracker"])):
        md.append(
            f"| {row['tracker']} | {fmt(row['HOTA'])} | {fmt(row['DetA'])} | {fmt(row['AssA'])} | "
            f"{fmt(row['MOTA'])} | {fmt(row['IDF1'])} | {int(row['IDSW']) if row['IDSW'] is not None else '–'} | "
            f"{int(row['Frag']) if row['Frag'] is not None else '–'} | {fmt(row['ms_per_frame'], 4)} |"
        )
    if runtime.get("skipped"):
        md += ["", "## Skipped implementations", ""]
        md += [f"- `{k}`: {v}" for k, v in runtime["skipped"].items()]
    md += [
        "",
        "## Common benchmark settings",
        "",
        "- public MOT17 FRCNN detections only; no detector inference and no image input",
        "- detections with confidence <= 0.10 are discarded before every tracker",
        "- high/low split 0.60, new-track target 0.70 where the API allows it",
        "- matching threshold 0.80, lost buffer 30 frames, nominal 30 FPS",
        "- TrackEval MOTChallenge preprocessing enabled, class `pedestrian`",
        "",
        "The libraries do not expose perfectly identical lifecycle semantics, so these settings align the public knobs as closely as possible rather than changing each library's internals.",
    ]
    (args.out / "FINAL_RESULTS.md").write_text("\n".join(md) + "\n")
    print((args.out / "FINAL_RESULTS.md").read_text())


if __name__ == "__main__":
    main()
