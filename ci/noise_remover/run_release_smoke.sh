#!/usr/bin/env bash
set -euo pipefail

cd app

flutter build apk --release --target lib/r8_native_processing_smoke_main.dart

APK="build/app/outputs/flutter-apk/app-release.apk"
test -f "$APK"

adb -s emulator-5554 install -r "$APK"
adb -s emulator-5554 logcat -c
adb -s emulator-5554 shell am force-stop at.persie0.noise_remover || true
adb -s emulator-5554 shell monkey -p at.persie0.noise_remover -c android.intent.category.LAUNCHER 1 >/dev/null

for _ in $(seq 1 300); do
  LOG="$(adb -s emulator-5554 logcat -d -v brief)"
  if printf '%s\n' "$LOG" | grep -q 'R8_SMOKE_PASS'; then
    printf '%s\n' "$LOG" | grep -E 'R8_SMOKE_(STAGE|PASS|FAIL)' || true
    echo 'Release-mode native processing smoke passed.'
    exit 0
  fi
  if printf '%s\n' "$LOG" | grep -q 'R8_SMOKE_FAIL'; then
    printf '%s\n' "$LOG" | grep -E 'R8_SMOKE_(STAGE|PASS|FAIL)' || true
    echo 'Release-mode native processing smoke failed.' >&2
    exit 1
  fi
  if printf '%s\n' "$LOG" | grep -q 'FATAL EXCEPTION'; then
    echo 'Release app crashed during smoke test.' >&2
    printf '%s\n' "$LOG" | tail -n 250
    exit 1
  fi
  sleep 2
done

echo 'Timed out waiting for release smoke result.' >&2
adb -s emulator-5554 logcat -d -v brief | tail -n 300
exit 1
