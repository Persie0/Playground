#!/usr/bin/env bash
set -euo pipefail
SRC="${1:?private source path required}"
HERE="$(cd "$(dirname "$0")" && pwd)"
source "$HERE/ci-common.sh"
require_private_tree "$SRC"

quiet_run "shared core configure (Release)" \
  cmake -S "$SRC/shared" -B "$RUNNER_TEMP/scene3d-core" \
  -DSCENE3D_BUILD_TESTS=ON -DCMAKE_BUILD_TYPE=Release
quiet_run "shared core build (Release)" \
  cmake --build "$RUNNER_TEMP/scene3d-core" --parallel
quiet_run "shared core tests (Release)" \
  ctest --test-dir "$RUNNER_TEMP/scene3d-core" --output-on-failure

quiet_run "shared core configure (ASan/UBSan)" \
  cmake -S "$SRC/shared" -B "$RUNNER_TEMP/scene3d-sanitize" \
  -DSCENE3D_BUILD_TESTS=ON -DSCENE3D_ENABLE_SANITIZERS=ON -DCMAKE_BUILD_TYPE=Debug
quiet_run "shared core build (ASan/UBSan)" \
  cmake --build "$RUNNER_TEMP/scene3d-sanitize" --parallel

run_sanitized_test() {
  local label="$1"
  local regex="$2"
  ASAN_OPTIONS=detect_leaks=1:halt_on_error=1 \
  UBSAN_OPTIONS=halt_on_error=1:print_stacktrace=0 \
    quiet_run "$label" \
    ctest --test-dir "$RUNNER_TEMP/scene3d-sanitize" -R "$regex" --output-on-failure
}

run_sanitized_test "sanitizer reconstruction-core test" '^scene3d_core_test$'
run_sanitized_test "sanitizer sparse-TSDF test" '^scene3d_sparse_tsdf_test$'
run_sanitized_test "sanitizer GLB-export test" '^scene3d_glb_export_test$'
