#!/usr/bin/env bash
set -euo pipefail

private_root="${1:?private project path is required}"
private_root="$(cd "$private_root" && pwd)"
audit_venv="$(pwd)/.traffic-recorder-venv"
private_log="$(mktemp)"
trap 'rm -f "$private_log"' EXIT

report_phase() {
  local phase="$1"
  shift
  if "$@" >"$private_log" 2>&1; then
    echo "PASS: $phase"
  else
    echo "::error::$phase failed; reproduce in the private repository for details."
    return 1
  fi
}

uv venv --clear "$audit_venv" --python 3.12 >"$private_log" 2>&1
source "$audit_venv/bin/activate"
report_phase "complete recorder dependency resolution" \
  uv pip install --quiet -e "$private_root/recorder"
report_phase "resolved dependency consistency" uv pip check
report_phase "NCNN, OpenCV, BoxMOT and recorder imports" \
  env PYTHONPATH="$private_root:$private_root/recorder/src${PYTHONPATH:+:$PYTHONPATH}" \
  python - <<'PY'
import boxmot
import cv2
import ncnn
import numpy
import yaml

try:
    from boxmot.trackers.bbox.bytetrack import ByteTrack
except ImportError:
    from boxmot.trackers import ByteTrack

from analytics.trajectory_writer import TrajectoryWriter
from detectors.ncnn_detector import NcnnDetector
from tracking.bytetrack import ByteTrackTracker

assert ByteTrack is not None
assert TrajectoryWriter is not None
assert NcnnDetector is not None
assert ByteTrackTracker is not None
assert all(module is not None for module in (boxmot, cv2, ncnn, numpy, yaml))
PY
