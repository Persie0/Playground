#!/usr/bin/env python3
"""Reuse successful Rust gates only for an identical, explicitly pinned source."""
import base64
import hashlib
import json
import os
import pathlib
import re
import subprocess

PUBLIC = "Persie0/Playground"
PRIVATE = "Persie0/PhotosphereCleanroom"


def api(path):
    return json.loads(subprocess.check_output(["gh", "api", path], text=True))


def main():
    source = os.environ["SOURCE_SHA"]
    run_id = os.environ["RUST_VALIDATION_RUN"]
    workflow_sha = os.environ["RUST_VALIDATION_WORKFLOW_SHA"]
    evidence_sha = os.environ["RUST_VALIDATION_EVIDENCE_SHA"]
    assert re.fullmatch(r"[0-9a-f]{40}", source)
    assert re.fullmatch(r"[0-9a-f]{40}", workflow_sha)
    assert re.fullmatch(r"[0-9a-f]{40}", evidence_sha)
    assert run_id.isdigit()
    run = api(f"repos/{PUBLIC}/actions/runs/{run_id}")
    assert run["head_sha"] == workflow_sha
    assert run["path"] == ".github/workflows/photosphere-start-pose-parity.yml"
    workflow = api(f"repos/{PUBLIC}/contents/{run['path']}?ref={workflow_sha}")
    text = base64.b64decode(workflow["content"]).decode()
    assert re.search(r"^\s+SOURCE_SHA: " + source + r"\s*$", text, re.M)
    assert re.search(r"repository: " + PRIVATE + r"\s+ref: " + source + r"\s", text)
    jobs = api(f"repos/{PUBLIC}/actions/runs/{run_id}/jobs?per_page=100")["jobs"]
    assert len(jobs) == 1
    steps = {step["name"]: step for step in jobs[0]["steps"]}
    for name in ["Rust default regressions", "Rust portable regressions", "Rust JNI-host regressions"]:
        assert steps[name]["status"] == "completed" and steps[name]["conclusion"] == "success", name

    evidence = api(f"repos/{PRIVATE}/commits/{evidence_sha}")
    assert evidence["sha"] == evidence_sha
    assert [parent["sha"] for parent in evidence["parents"]] == [source]
    prefix = f"docs/validation/runs/{run_id}/"
    assert evidence["files"] and len(evidence["files"]) < 100
    assert all(file["filename"].startswith(prefix) for file in evidence["files"])
    retained = pathlib.Path(os.environ["RUNNER_TEMP"])
    for mode, expected in [("default", 272), ("portable", 266), ("jni", 272)]:
        blob = api(f"repos/{PRIVATE}/contents/{prefix}parity-{mode}.txt?ref={evidence['sha']}")
        assert blob["encoding"] == "base64"
        data = base64.b64decode(blob["content"])
        assert hashlib.sha1(b"blob " + str(len(data)).encode() + b"\0" + data).hexdigest() == blob["sha"]
        log = data.decode()
        results = re.findall(r"test result: ok\. (\d+) passed; (\d+) failed; (\d+) ignored", log)
        assert len(results) == 15
        assert all(int(failed) == 0 and int(ignored) == 0 for _, failed, ignored in results)
        assert sum(int(passed) for passed, _, _ in results) == expected
        for name in ["gamma_adjusts_each_sources_own_brightness_in_either_order",
                     "low_resolution_seam_labels_do_not_create_holes_in_fully_covered_sphere",
                     "seam_progress_counts_source_passes_and_finishes_after_map_construction"]:
            assert re.search(r"test " + name + r" \.\.\. ok", log), (mode, name)
        (retained / f"parity-{mode}.log").write_bytes(data)
    print(f"Verified same-source Rust evidence from run {run_id}; complete logs retained privately")


if __name__ == "__main__":
    main()
