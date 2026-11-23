#!/usr/bin/env bash
# Public Playground only. Smoke-tests a debug APK on an Android emulator.
# Not a claim of physical-device performance or human difficulty balancing.
set -euo pipefail
mkdir -p qa-output
adb wait-for-device
adb shell getprop sys.boot_completed | grep -q 1
adb shell getprop ro.build.version.sdk | tee qa-output/android-api.txt
adb install -r qa-output/flowforge-qa-debug.apk | tee qa-output/install.txt
PKG="com.flowforge.game"
APP_ID="$(adb shell cmd package resolve-activity --brief "$PKG" | tr -d '\r' | tail -1)"
if [[ "$APP_ID" != *"/"* ]]; then
  echo "Could not resolve launcher activity for $PKG" >&2
  exit 1
fi

function launch_and_check() {
  local tag="$1"
  adb shell am force-stop "$PKG" || true
  adb shell am start -W -n "$APP_ID" | tee "qa-output/start-${tag}.txt"
  local live=0
  for _ in $(seq 1 40); do
    if adb shell pidof "$PKG" >/dev/null 2>&1; then
      live=1
      break
    fi
    sleep 1
  done
  if [[ "$live" -ne 1 ]]; then
    echo "Game did not start within 40 seconds" >&2
    return 1
  fi
  sleep 4
  adb exec-out screencap -p > "qa-output/${tag}.png"
  test -s "qa-output/${tag}.png"
}

# Baseline portrait, short/inset-sized portrait, then a taller phone.
launch_and_check "initial"
adb shell wm size 360x640
adb shell wm density 160
sleep 2
adb exec-out screencap -p > qa-output/short-360x640.png
test -s qa-output/short-360x640.png

# Interact with the real Android touch path. These inputs exercise tutorial,
# pause/back and resume without assuming an ADB accessibility UI hierarchy.
adb shell input tap 180 480
adb shell input tap 180 480
adb shell input tap 170 515
adb shell input tap 270 580
adb shell input swipe 180 390 260 480 350
adb shell input keyevent 4
adb shell input tap 110 110
adb shell input keyevent 4
adb shell input tap 350 590
adb shell input swipe 100 350 220 440 250
if ! adb shell pidof "$PKG" >/dev/null 2>&1; then
  echo "Game exited during touch smoke sequence" >&2
  exit 1
fi
adb exec-out screencap -p > qa-output/after-touch-360x640.png

adb shell wm size 390x844
adb shell wm density 160
sleep 3
adb exec-out screencap -p > qa-output/tall-390x844.png
test -s qa-output/tall-390x844.png

# Relaunch tests persisted pause/touch state and standard Android lifecycle.
launch_and_check "after-relaunch"
adb shell dumpsys meminfo "$PKG" > qa-output/meminfo.txt
adb shell dumpsys gfxinfo "$PKG" > qa-output/gfxinfo.txt
adb logcat -d -b crash > qa-output/crash-log.txt || true
# Android's crash buffer can contain unrelated app crashes; only attribute
# a crash if the Flow Forge process/package occurs in the same buffer.
if grep -Eq "com.flowforge.game|GodotApp" qa-output/crash-log.txt; then
  echo "Android crash buffer contains an application crash" >&2
  exit 1
fi
adb shell pidof "$PKG" > qa-output/process.txt
adb shell wm size reset
adb shell wm density reset
echo "ANDROID_EMULATOR_SMOKE_PASS api=$(cat qa-output/android-api.txt)"
