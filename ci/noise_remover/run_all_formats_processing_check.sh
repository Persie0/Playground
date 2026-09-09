#!/usr/bin/env bash
set -euo pipefail

cd app

flutter build apk \
  --release \
  --target-platform android-x64 \
  --target lib/all_formats_processing_check_main.dart

APK="build/app/outputs/flutter-apk/app-release.apk"
test -s "$APK"

DEVICE="${ANDROID_SERIAL:-emulator-5554}"
adb -s "$DEVICE" install -r "$APK"
adb -s "$DEVICE" logcat -c
adb -s "$DEVICE" shell am force-stop at.persie0.noise_remover || true
adb -s "$DEVICE" shell monkey \
  -p at.persie0.noise_remover \
  -c android.intent.category.LAUNCHER 1 >/dev/null

LOG_FILE="../noise-remover-all-formats-log.txt"
: > "$LOG_FILE"

# 31 real input formats + output-format matrix + DPDF cross-checks can take a
# while on an x86 Android emulator. Poll logs without keeping an unbounded
# streaming process alive.
for _ in $(seq 1 3000); do
  adb -s "$DEVICE" logcat -d -v brief > "$LOG_FILE" || true

  if grep -q 'FORMAT_CHECK_PASS' "$LOG_FILE"; then
    grep -E 'FORMAT_CHECK_(CASE_(START|PASS)|SUMMARY|PASS|FAIL)|OUTPUT_FORMAT_CHECK_(START|PASS)|DPDF_FORMAT_CHECK_(START|PASS)' "$LOG_FILE" || true
    echo 'Noise Remover all-format processing check passed.'
    exit 0
  fi

  if grep -q 'FORMAT_CHECK_FAIL' "$LOG_FILE"; then
    grep -E 'FORMAT_CHECK_(CASE_(START|PASS)|SUMMARY|PASS|FAIL)|OUTPUT_FORMAT_CHECK_(START|PASS)|DPDF_FORMAT_CHECK_(START|PASS)' "$LOG_FILE" || true
    echo 'Noise Remover all-format processing check failed.' >&2
    tail -n 350 "$LOG_FILE" >&2
    exit 1
  fi

  if grep -q 'FATAL EXCEPTION' "$LOG_FILE"; then
    echo 'Noise Remover crashed during the all-format processing check.' >&2
    tail -n 350 "$LOG_FILE" >&2
    exit 1
  fi

  sleep 2
done

echo 'Timed out waiting for Noise Remover all-format processing result.' >&2
adb -s "$DEVICE" logcat -d -v brief > "$LOG_FILE" || true
tail -n 400 "$LOG_FILE" >&2
exit 1
