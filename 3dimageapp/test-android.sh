#!/usr/bin/env bash
set -euo pipefail
SRC="${1:?private source path required}"
HERE="$(cd "$(dirname "$0")" && pwd)"
source "$HERE/ci-common.sh"
require_private_tree "$SRC"

run_logic_group() {
  local label="$1"
  local test_class="$2"
  quiet_run "$label" \
    gradle -p "$SRC/android" :app:testDebugUnitTest \
    --tests "$test_class" --stacktrace
}

# Run behavior groups separately so public CI identifies the failing subsystem
# without ever printing private source/test output.
run_logic_group "Android keyframe behavior" "com.persie.scene3d.KeyframeSelectorTest"
run_logic_group "Android scan-state policy" "com.persie.scene3d.ScanFlowPolicyTest"
run_logic_group "Android capture guidance behavior" "com.persie.scene3d.ScanGuidanceTest"
run_logic_group "Android reconstruction-mode behavior" "com.persie.scene3d.ReconstructionModeTest"
run_logic_group "Android saved-result recovery" "com.persie.scene3d.ScanResultLocatorTest"
run_logic_group "Android in-app result parsing" "com.persie.scene3d.ResultViewerParserTest"

quiet_run "Android complete app logic suite" \
  gradle -p "$SRC/android" :app:testDebugUnitTest --stacktrace
quiet_run "Android Debug + Release build" \
  gradle -p "$SRC/android" :app:assembleDebug :app:assembleRelease --stacktrace
quiet_run "Android lint" \
  gradle -p "$SRC/android" :app:lintDebug --stacktrace

echo "PASS: Android behavior/build/lint complete (artifacts intentionally not uploaded from public CI)"
