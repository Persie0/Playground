#!/usr/bin/env bash
set -euo pipefail

mkdir -p ux-ios-screenshots
APP_BUNDLE="$(find app/build/ios/iphonesimulator -maxdepth 1 -type d -name '*.app' -print -quit)"
if [[ -z "$APP_BUNDLE" ]]; then
  echo "No simulator .app bundle was built" >&2
  exit 1
fi
BUNDLE_ID=$(/usr/libexec/PlistBuddy -c 'Print :CFBundleIdentifier' "$APP_BUNDLE/Info.plist")
echo "Capturing iOS UI for $BUNDLE_ID"

pick_sim() {
  local type="$1"
  xcrun simctl list devices available -j | python3 -c '
import json, sys
kind = sys.argv[1]
devices = json.load(sys.stdin).get("devices", {})
for runtime in sorted(devices, reverse=True):
    for device in devices[runtime]:
        if kind in device.get("name", "") and device.get("isAvailable", True):
            print(device["udid"])
            sys.exit(0)
sys.exit(1)
' "$type"
}

capture_sim() {
  local udid="$1"
  local prefix="$2"
  xcrun simctl boot "$udid" || true
  xcrun simctl bootstatus "$udid" -b
  xcrun simctl status_bar "$udid" override --time '9:41' || true
  xcrun simctl install "$udid" "$APP_BUNDLE"
  xcrun simctl ui "$udid" appearance light
  xcrun simctl launch "$udid" "$BUNDLE_ID"
  sleep 18
  xcrun simctl io "$udid" screenshot "ux-ios-screenshots/${prefix}-light.png"

  xcrun simctl ui "$udid" appearance dark
  xcrun simctl terminate "$udid" "$BUNDLE_ID" || true
  xcrun simctl launch "$udid" "$BUNDLE_ID"
  sleep 8
  xcrun simctl io "$udid" screenshot "ux-ios-screenshots/${prefix}-dark.png"

  # Restore simulator state for later tests.
  xcrun simctl ui "$udid" appearance light
  xcrun simctl shutdown "$udid" || true
}

IPHONE="$(pick_sim iPhone)"
capture_sim "$IPHONE" "iphone-welcome"

if IPAD="$(pick_sim iPad)"; then
  capture_sim "$IPAD" "ipad-welcome"
else
  echo "No available iPad simulator; iPhone evidence still retained" >&2
fi
