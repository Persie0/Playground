#!/usr/bin/env bash
set -euo pipefail

mkdir -p .ci
python3 -m http.server 8765 --directory .ci/foreground-fixtures > .ci/foreground-http.log 2>&1 &
SERVER_PID=$!

flutter test integration_test/foreground_media_processing_test.dart \
  -d emulator-5554 \
  --dart-define=MEDIA_FIXTURE_BASE_URL=http://10.0.2.2:8765 \
  > .ci/foreground-smoke.log 2>&1 &
TEST_PID=$!

cleanup() {
  kill "$TEST_PID" >/dev/null 2>&1 || true
  kill "$SERVER_PID" >/dev/null 2>&1 || true
}
trap cleanup EXIT

installed=false
for _ in $(seq 1 240); do
  if adb shell pm path at.persie0.noise_remover >/dev/null 2>&1; then
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
  cat .ci/foreground-smoke.log || true
  set +e
  wait "$TEST_PID"
  status=$?
  set -e
  exit "${status:-1}"
fi

adb shell pm grant at.persie0.noise_remover android.permission.POST_NOTIFICATIONS || true
adb shell appops set at.persie0.noise_remover POST_NOTIFICATION allow || true

ready=false
for _ in $(seq 1 240); do
  if grep -q 'FOREGROUND_SMOKE_READY:' .ci/foreground-smoke.log 2>/dev/null; then
    ready=true
    break
  fi
  if ! kill -0 "$TEST_PID" >/dev/null 2>&1; then
    break
  fi
  sleep 1
done
if [[ "$ready" != true ]]; then
  echo 'Foreground service never reached the ready marker.'
  cat .ci/foreground-smoke.log || true
  set +e
  wait "$TEST_PID"
  status=$?
  set -e
  exit "${status:-1}"
fi

adb shell input keyevent KEYCODE_HOME
sleep 1
adb shell dumpsys activity activities > .ci/foreground-activity.txt
adb shell dumpsys activity services at.persie0.noise_remover > .ci/foreground-services-home.txt
adb shell dumpsys notification --noredact > .ci/foreground-notifications.txt || true

if grep -E 'mResumedActivity.*at\.persie0\.noise_remover' .ci/foreground-activity.txt; then
  echo 'Noise Remover remained the resumed Activity after HOME.'
  exit 1
fi
if ! grep -q 'com.pravera.flutter_foreground_task.service.ForegroundService' .ci/foreground-services-home.txt; then
  echo 'Noise foreground service was not alive after HOME.'
  exit 1
fi

adb shell input keyevent KEYCODE_SLEEP
sleep 2
adb shell dumpsys activity services at.persie0.noise_remover > .ci/foreground-services-locked.txt
adb logcat -d > .ci/foreground-logcat-locked.txt || true
if ! grep -q 'com.pravera.flutter_foreground_task.service.ForegroundService' .ci/foreground-services-locked.txt; then
  echo 'Noise foreground service did not survive screen lock.'
  adb shell input keyevent KEYCODE_WAKEUP || true
  exit 1
fi
adb shell input keyevent KEYCODE_WAKEUP || true

set +e
wait "$TEST_PID"
TEST_STATUS=$?
set -e
trap - EXIT
kill "$SERVER_PID" >/dev/null 2>&1 || true

cat .ci/foreground-smoke.log || true
adb logcat -d > .ci/foreground-logcat-final.txt || true
exit "$TEST_STATUS"
