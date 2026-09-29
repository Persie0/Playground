#!/usr/bin/env bash
set -euo pipefail

mkdir -p .ci

# flutter test buffers integration-test stdout until the test group finishes.
# Capture device logcat separately so the app's debugPrint readiness marker is
# observable while the foreground worker is still running.
adb logcat -c || true
adb logcat -v time > .ci/image-logcat-live.txt 2>&1 &
LOGCAT_PID=$!

flutter test integration_test/foreground_image_processing_test.dart \
  -d emulator-5554 > .ci/image-foreground-smoke.log 2>&1 &
TEST_PID=$!

cleanup() {
  kill "$TEST_PID" >/dev/null 2>&1 || true
  kill "$LOGCAT_PID" >/dev/null 2>&1 || true
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

# Synchronize against live Android logcat rather than redirected flutter-test
# stdout. The latter is group-buffered and only exposed after the worker can
# already have completed normally.
ready=false
for _ in $(seq 1 4800); do
  if grep -q 'IMAGE_FOREGROUND_SMOKE_READY:' .ci/image-logcat-live.txt 2>/dev/null; then
    ready=true
    break
  fi
  if ! kill -0 "$TEST_PID" >/dev/null 2>&1; then
    break
  fi
  sleep 0.05
done
if [[ "$ready" != true ]]; then
  echo 'Image foreground worker never reached the live logcat ready marker.'
  tail -n 200 .ci/image-logcat-live.txt || true
  cat .ci/image-foreground-smoke.log || true
  set +e
  wait "$TEST_PID"
  status=$?
  set -e
  exit "${status:-1}"
fi

# Prove the service is active before changing Activity/screen state. This
# separates a lifecycle failure from a workload that simply completed first.
adb shell dumpsys activity services at.persie0.image_enhancer > .ci/image-services-ready.txt
if ! grep -q 'com.pravera.flutter_foreground_task.service.ForegroundService' .ci/image-services-ready.txt; then
  echo 'Image foreground service completed before the host could sample it.'
  tail -n 200 .ci/image-logcat-live.txt || true
  cat .ci/image-foreground-smoke.log || true
  exit 1
fi

adb shell input keyevent KEYCODE_HOME
# Give ActivityManager only a few scheduler ticks to publish the HOME change;
# do not add a whole-second delay that lets the worker finish first.
for _ in $(seq 1 20); do
  adb shell dumpsys activity activities > .ci/image-activity.txt
  if ! grep -E '(topResumedActivity|ResumedActivity|mResumedActivity).*at\.persie0\.image_enhancer' .ci/image-activity.txt; then
    break
  fi
  sleep 0.025
done
adb shell dumpsys activity services at.persie0.image_enhancer > .ci/image-services-home.txt
adb shell dumpsys notification --noredact > .ci/image-notifications.txt || true

if grep -E '(topResumedActivity|ResumedActivity|mResumedActivity).*at\.persie0\.image_enhancer' .ci/image-activity.txt; then
  echo 'Image Enhancer remained the resumed Activity after HOME.'
  exit 1
fi
if ! grep -q 'com.pravera.flutter_foreground_task.service.ForegroundService' .ci/image-services-home.txt; then
  echo 'Image foreground service was not alive after HOME.'
  exit 1
fi

adb shell input keyevent KEYCODE_SLEEP
# Observe the first point at which Android reports the display asleep, then
# inspect the service immediately so completion latency is not mistaken for a
# lock-screen lifecycle failure.
for _ in $(seq 1 40); do
  adb shell dumpsys power > .ci/image-power-locked.txt || true
  if grep -Eq 'Wakefulness: Asleep|mWakefulness=Asleep|Display Power: state=OFF' .ci/image-power-locked.txt; then
    break
  fi
  sleep 0.025
done
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

kill "$LOGCAT_PID" >/dev/null 2>&1 || true
wait "$LOGCAT_PID" >/dev/null 2>&1 || true
trap - EXIT

cat .ci/image-foreground-smoke.log || true
adb logcat -d > .ci/image-logcat-final.txt || true
exit "$TEST_STATUS"
