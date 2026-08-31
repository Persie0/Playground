#!/usr/bin/env bash
set -euo pipefail
SRC="${1:?private source path required}"
HERE="$(cd "$(dirname "$0")" && pwd)"
source "$HERE/ci-common.sh"
require_private_tree "$SRC"

quiet_run "iOS keyframe logic compile" \
  xcrun swiftc "$SRC/ios/Scene3D/KeyframeSelector.swift" \
  "$SRC/ios/LogicTests/main.swift" -o "$RUNNER_TEMP/scene3d-ios-logic"
quiet_run "iOS keyframe behavior" \
  "$RUNNER_TEMP/scene3d-ios-logic"
quiet_run "XcodeGen project generation" \
  bash -lc "cd '$SRC/ios' && xcodegen generate"
quiet_run "iOS Debug simulator build" \
  bash -lc "cd '$SRC/ios' && xcodebuild -project Scene3D.xcodeproj -scheme Scene3D -sdk iphonesimulator -configuration Debug CODE_SIGNING_ALLOWED=NO build"
quiet_run "iOS Release simulator build" \
  bash -lc "cd '$SRC/ios' && xcodebuild -project Scene3D.xcodeproj -scheme Scene3D -sdk iphonesimulator -configuration Release CODE_SIGNING_ALLOWED=NO build"
