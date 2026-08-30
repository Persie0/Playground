#!/usr/bin/env bash
set -euo pipefail

quiet_run() {
  local label="$1"
  shift
  local log
  log="$(mktemp)"
  if "$@" >"$log" 2>&1; then
    echo "PASS: $label"
    rm -f "$log"
  else
    local code=$?
    echo "::error::$label failed. Private build/test output was intentionally suppressed."
    rm -f "$log"
    return "$code"
  fi
}

require_private_tree() {
  local src="$1"
  test -d "$src" || { echo "::error::Private source checkout missing"; exit 2; }
  test -f "$src/README.md" || { echo "::error::Private source checkout incomplete"; exit 2; }
  test -d "$src/shared" || { echo "::error::Expected shared/ tree missing"; exit 2; }
  test -d "$src/android" || { echo "::error::Expected android/ tree missing"; exit 2; }
  test -d "$src/ios" || { echo "::error::Expected ios/ tree missing"; exit 2; }
}
