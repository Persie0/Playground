#!/usr/bin/env bash
set -euo pipefail

private_root="${1:?private project path is required}"
private_root="$(cd "$private_root" && pwd)"
audit_venv="$(pwd)/.traffic-smoke-venv"
private_log="$(mktemp)"
temp_dir="$(mktemp -d)"
trap 'rm -f "$private_log"; rm -rf "$temp_dir"' EXIT

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
report_phase "smoke dependency installation" uv pip install --quiet \
  -e "$private_root/intersection_analytics" \
  -e "$private_root/analyzer"

report_phase "intersection-analytics wheel build" \
  uv build --wheel --out-dir "$temp_dir/wheels-core" "$private_root/intersection_analytics"
report_phase "intersection-analyzer wheel build" \
  uv build --wheel --out-dir "$temp_dir/wheels-analyzer" "$private_root/analyzer"
report_phase "pose calibration example" \
  python "$private_root/intersection_analytics/examples/fit_pose_calibration.py" \
    --pose "$private_root/intersection_analytics/examples/pose_calibration.example.json" \
    --output "$temp_dir/pose-calibration.json"
report_phase "automatic sensor calibration example" \
  python "$private_root/intersection_analytics/examples/auto_sensor_calibration.py" \
    --manifest "$private_root/intersection_analytics/examples/auto_sensor_manifest.example.json" \
    --output "$temp_dir/sensor-calibration.json"
report_phase "analyzer command surface" intersection-analyzer --help
