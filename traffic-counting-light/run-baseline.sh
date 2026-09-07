#!/usr/bin/env bash
set -euo pipefail

private_root="${1:?private project path is required}"
private_root="$(cd "$private_root" && pwd)"
audit_venv="$(pwd)/.traffic-ci-venv"
private_log="$(mktemp)"
inline_js="$(mktemp --suffix=.js)"
trap 'rm -f "$private_log" "$inline_js"' EXIT

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

uv venv --clear "$audit_venv" --python "$(python -c 'import sys; print(f"{sys.version_info.major}.{sys.version_info.minor}")')" \
  >"$private_log" 2>&1
source "$audit_venv/bin/activate"
report_phase "dependency installation" uv pip install --quiet \
  -e "$private_root/intersection_analytics" \
  -e "$private_root/analyzer" \
  pytest pytest-cov pyyaml

report_phase "analytics and dashboard unit tests" \
  env PYTHONPATH="$private_root${PYTHONPATH:+:$PYTHONPATH}" \
  python -m pytest -q \
    "$private_root/intersection_analytics/tests" \
    "$private_root/analyzer/tests"

report_phase "recorder dependency-light unit tests" \
  env PYTHONPATH="$private_root:$private_root/recorder/src${PYTHONPATH:+:$PYTHONPATH}" \
  python -m pytest -q "$private_root/recorder/tests"

report_phase "Python bytecode compilation" \
  python -m compileall -q \
    "$private_root/intersection_analytics" \
    "$private_root/analyzer" \
    "$private_root/recorder/src" \
    "$private_root/tools"

report_phase "YAML and TOML parsing" python - "$private_root" <<'PY'
from pathlib import Path
import sys
import tomllib
import yaml

root = Path(sys.argv[1])
for path in root.rglob("*.toml"):
    tomllib.loads(path.read_text(encoding="utf-8"))
for path in root.rglob("*.yml"):
    yaml.safe_load(path.read_text(encoding="utf-8"))
for path in root.rglob("*.yaml"):
    yaml.safe_load(path.read_text(encoding="utf-8"))
PY

if command -v node >/dev/null 2>&1; then
  python - "$private_root/analyzer/src/intersection_analyzer/static/index.html" "$inline_js" <<'PY'
from pathlib import Path
import re
import sys

html = Path(sys.argv[1]).read_text(encoding="utf-8")
scripts = re.findall(r"<script(?:\s[^>]*)?>(.*?)</script>", html, flags=re.DOTALL | re.IGNORECASE)
if not scripts:
    raise SystemExit("dashboard contains no inline JavaScript")
Path(sys.argv[2]).write_text("\n".join(scripts), encoding="utf-8")
PY
  report_phase "dashboard JavaScript syntax" \
    node --check "$inline_js"
fi
