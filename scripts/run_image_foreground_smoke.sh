#!/usr/bin/env bash
set -euo pipefail

mkdir -p .ci

flutter test integration_test/foreground_image_processing_test.dart \
  -d emulator-5554 > .ci/image-foreground-smoke.log 2>&1 &
TEST_PID=$!

cleanup() {
  kill "$TEST_PID" >/dev/null 2>&1 || true
}
trap cleanup EXIT

installed=false
for _ in $(seq 1 240); do
  if adb shell pm path at.persie0.image_enhancer >/dev/null 2>&1; then
    installed=true
    break
  fi
  if ! kill -0 "$TEST_PID" >/dev/null 2>&1; then
    break
  fi
  sleep 1
done
if [[ "$installed" != true ]]; then
  echo 'App was not installed in time.'
  cat .ci/image-foreground-smoke.log || true
  set +e
  wait "$TEST_PID"
  status=$?
  set -e
  exit "${status:-1}"
fi

adb shell pm grant at.persie0.image_enhancer android.permission.POST_NOTIFICATIONS || true
adb shell appops set at.persie0.image_enhancer POST_NOTIFICATION allow || true

ready=false
for _ in $(seq 1 240); do
  if grep -q 'IMAGE_FOREGROUND_SMOKE_READY:' .ci/image-foreground-smoke.log 2>/dev/null; then
    ready=true
    break
  fi
  if ! kill -0 "$TEST_PID" >/dev/null 2>&1; then
    break
  fi
  sleep 1
done
if [[ "$ready" != true ]]; then
  echo 'Image foreground worker never reached the ready marker.'
  cat .ci/image-foreground-smoke.log || true
  set +e
  wait "$TEST_PID"
  status=$?
  set -e
  exit "${status:-1}"
fi

adb shell input keyevent KEYCODE_HOME
sleep 1
adb shell dumpsys activity activities > .ci/image-activity.txt
adb shell dumpsys activity services at.persie0.image_enhancer > .ci/image-services-home.txt
adb shell dumpsys notification --noredact > .ci/image-notifications.txt || true

if grep -E 'mResumedActivity.*at\.persie0\.image_enhancer' .ci/image-activity.txt; then
  echo 'Image Enhancer remained the resumed Activity after HOME.'
  exit 1
fi
if ! grep -q 'com.pravera.flutter_foreground_task.service.ForegroundService' .ci/image-services-home.txt; then
  echo 'Image foreground service was not alive after HOME.'
  exit 1
fi

adb shell input keyevent KEYCODE_SLEEP
sleep 2
adb shell dumpsys activity services at.persie0.image_enhancer > .ci/image-services-locked.txt
adb logcat -d > .ci/image-logcat-locked.txt || true
if ! grep -q 'com.pravera.flutter_foreground_task.service.ForegroundService' .ci/image-services-locked.txt; then
  echo 'Image foreground service did not survive screen lock.'
  adb shell input keyevent KEYCODE_WAKEUP || true
  exit 1
fi
adb shell input keyevent KEYCODE_WAKEUP || true

set +e
wait "$TEST_PID"
TEST_STATUS=$?
set -e
trap - EXIT

cat .ci/image-foreground-smoke.log || true
adb logcat -d > .ci/image-logcat-final.txt || true
exit "$TEST_STATUS"
