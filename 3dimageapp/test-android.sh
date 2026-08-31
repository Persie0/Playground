#!/usr/bin/env bash
set -euo pipefail
SRC="${1:?private source path required}"
HERE="$(cd "$(dirname "$0")" && pwd)"
source "$HERE/ci-common.sh"
require_private_tree "$SRC"

quiet_run "Android app logic unit tests" \
  gradle -p "$SRC/android" :app:testDebugUnitTest --stacktrace
quiet_run "Android Debug + Release build" \
  gradle -p "$SRC/android" :app:assembleDebug :app:assembleRelease --stacktrace
quiet_run "Android lint" \
  gradle -p "$SRC/android" :app:lintDebug --stacktrace

echo "PASS: Android logic tests/build/lint complete (artifacts intentionally not uploaded from public CI)"
