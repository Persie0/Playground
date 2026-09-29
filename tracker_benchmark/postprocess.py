#!/usr/bin/env python3
from __future__ import annotations

import argparse
import json
import math
from pathlib import Path

WEIGHTS = {"clean": 0.08, "crossing": 0.18, "occlusion": 0.32, "dense": 0.27, "noisy": 0.15}
PERMISSIVE = {"MIT", "Apache-2.0", "BSD-3-Clause"}


def inv_log(value: float, values: list[float]) -> float:
    vals = [math.log(max(v, 1e-9)) for v in values]
    x = math.log(max(value, 1e-9))
    lo, hi = min(vals), max(vals)
    return 100.0 if hi <= lo else 100.0 * (hi - x) / (hi - lo)


def count_closeness(ratio: float) -> float:
    ratio = max(ratio, 1e-9)
    return min(ratio, 1.0 / ratio)


def main() -> None:
    p = argparse.ArgumentParser()
    p.add_argument("results_json")
    args = p.parse_args()
    path = Path(args.results_json)
    rows = json.loads(path.read_text())
    ok = [r for r in rows if r.get("status") == "ok"]
    if not ok:
        return

    for r in ok:
        acc = 0.0
        weighted_count = 0.0
        for mode, weight in WEIGHTS.items():
            m = r["modes"][mode]
            close = count_closeness(float(m["count_ratio"]))
            weighted_count += weight * close
            acc += weight * (
                0.50 * float(m["idf1"])
                + 0.15 * float(m["reid"])
                + 0.10 * float(m["precision"])
                + 0.10 * float(m["recall"])
                + 0.15 * close
            )
        r["accuracy_count_score"] = 100.0 * acc
        r["count_closeness_score"] = 100.0 * weighted_count
        r["dense_count_ratio"] = float(r["modes"]["dense"]["count_ratio"])
        r["noisy_count_ratio"] = float(r["modes"]["noisy"]["count_ratio"])
        r["permissive"] = r.get("license") in PERMISSIVE
        # A deliberately strict counting gate for this project's observed over-count problem.
        r["counting_gate"] = r["dense_count_ratio"] <= 1.50 and r["noisy_count_ratio"] <= 2.00

    ms = [float(r["mean_ms"]) for r in ok]
    mem = [float(r["rss_delta_mb"]) for r in ok]
    cpu = [float(r["cpu_core_pct"]) for r in ok]
    for r in ok:
        r["speed_log_score"] = inv_log(float(r["mean_ms"]), ms)
        r["memory_log_score"] = inv_log(max(float(r["rss_delta_mb"]), 0.01), [max(x, 0.01) for x in mem])
        r["cpu_log_score"] = inv_log(max(float(r["cpu_core_pct"]), 0.01), [max(x, 0.01) for x in cpu])
        r["balanced_edge_score"] = (
            0.75 * r["accuracy_count_score"]
            + 0.15 * r["speed_log_score"]
            + 0.05 * r["memory_log_score"]
            + 0.05 * r["cpu_log_score"]
        )

    accuracy_rank = sorted(ok, key=lambda x: x["accuracy_count_score"], reverse=True)
    speed_rank = sorted(ok, key=lambda x: x["mean_ms"])
    edge_rank = sorted(ok, key=lambda x: x["balanced_edge_score"], reverse=True)
    production = [r for r in edge_rank if r["permissive"] and r["counting_gate"]]

    md = [
        "# Decision-oriented ranking",
        "",
        "The original benchmark table is preserved in `results.md`. This ranking prevents raw throughput from masking ID fragmentation/over-counting.",
        "",
        "## Accuracy + counting stability",
        "",
        "|Rank|Tracker|Score|Dense track/GT|Noisy track/GT|Occlusion Re-ID|License|",
        "|---:|---|---:|---:|---:|---:|---|",
    ]
    for i, r in enumerate(accuracy_rank, 1):
        md.append(f"|{i}|{r['name']}|{r['accuracy_count_score']:.2f}|{r['dense_count_ratio']:.3f}|{r['noisy_count_ratio']:.3f}|{100*r['modes']['occlusion']['reid']:.1f}%|{r['license']}|")

    md += ["", "## Tracker-only throughput", "", "|Rank|Tracker|Mean ms/frame|P95 ms|Equivalent FPS|RSS delta MB|", "|---:|---|---:|---:|---:|---:|"]
    for i, r in enumerate(speed_rank, 1):
        md.append(f"|{i}|{r['name']}|{r['mean_ms']:.4f}|{r['p95_ms']:.4f}|{r['fps_equiv']:.0f}|{r['rss_delta_mb']:.1f}|")

    md += ["", "## Balanced edge score", "", "75% accuracy/counting, 15% log-normalized speed, 5% memory, 5% CPU.", "", "|Rank|Tracker|Score|Accuracy/count|Mean ms|RSS MB|License|Counting gate|", "|---:|---|---:|---:|---:|---:|---|---|"]
    for i, r in enumerate(edge_rank, 1):
        md.append(f"|{i}|{r['name']}|{r['balanced_edge_score']:.2f}|{r['accuracy_count_score']:.2f}|{r['mean_ms']:.4f}|{r['rss_delta_mb']:.1f}|{r['license']}|{'PASS' if r['counting_gate'] else 'FAIL'}|")

    md += ["", "## Permissive production shortlist", ""]
    if production:
        for i, r in enumerate(production, 1):
            md.append(f"{i}. **{r['name']}** — balanced {r['balanced_edge_score']:.2f}, accuracy/count {r['accuracy_count_score']:.2f}, {r['mean_ms']:.4f} ms/frame.")
    else:
        md.append("No permissively licensed candidate passed the strict synthetic counting gate.")

    failed = [r for r in rows if r.get("status") != "ok"]
    if failed:
        md += ["", "## Failed candidates", ""]
        for r in failed:
            md.append(f"- **{r['name']}**: {r.get('error','unknown error')}")

    out = path.parent / "ranking.md"
    out.write_text("\n".join(md) + "\n")
    (path.parent / "ranking.json").write_text(json.dumps(edge_rank, indent=2) + "\n")
    print(out.read_text())


if __name__ == "__main__":
    main()
