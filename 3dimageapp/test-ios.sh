#!/usr/bin/env bash
set -euo pipefail
SRC="${1:?private source path required}"
HERE="$(cd "$(dirname "$0")" && pwd)"
source "$HERE/ci-common.sh"
require_private_tree "$SRC"

quiet_run "XcodeGen project generation" \
  bash -lc "cd '$SRC/ios' && xcodegen generate"

SIM_ID="$(xcrun simctl list devices available -j | python3 -c 'import json,sys; d=json.load(sys.stdin)["devices"]; ids=[x["udid"] for k,v in d.items() if "iOS" in k for x in v if x.get("isAvailable")]; print(ids[0] if ids else "")')"
if [[ -z "$SIM_ID" ]]; then
  echo "::error::No available iOS simulator found"
  exit 2
fi

quiet_run "iOS app logic unit tests" \
  bash -lc "cd '$SRC/ios' && xcodebuild -project Scene3D.xcodeproj -scheme Scene3D -sdk iphonesimulator -configuration Debug -destination 'id=$SIM_ID' CODE_SIGNING_ALLOWED=NO test"
quiet_run "iOS Debug simulator build" \
  bash -lc "cd '$SRC/ios' && xcodebuild -project Scene3D.xcodeproj -scheme Scene3D -sdk iphonesimulator -configuration Debug CODE_SIGNING_ALLOWED=NO build"
quiet_run "iOS Release simulator build" \
  bash -lc "cd '$SRC/ios' && xcodebuild -project Scene3D.xcodeproj -scheme Scene3D -sdk iphonesimulator -configuration Release CODE_SIGNING_ALLOWED=NO build"
