set -euo pipefail
APP=at.persie0.hanziHero
mkdir -p ux-screenshots
adb shell settings put global window_animation_scale 0
adb shell settings put global transition_animation_scale 0
adb shell settings put global animator_duration_scale 0
adb shell input keyevent 82 || true
adb install -r app/build/app/outputs/flutter-apk/app-debug.apk
sleep 20
adb shell am start -n "$APP/.MainActivity"
sleep 14

get_hierarchy() {
  adb shell uiautomator dump /sdcard/ux-hierarchy.xml >/dev/null 2>&1 || true
  adb shell cat /sdcard/ux-hierarchy.xml > /tmp/ux-hierarchy.xml 2>/dev/null || true
}

tap_by_label() {
  get_hierarchy
  local bounds
  bounds="$(python3 - "$1" <<'PY'
import re
import sys
import xml.etree.ElementTree as ET
try:
    root = ET.parse('/tmp/ux-hierarchy.xml').getroot()
    for element in root.iter():
        attrs = element.attrib
        label = (attrs.get('text', '') + ' ' + attrs.get('content-desc', '')).lower()
        if sys.argv[1].lower() in label and attrs.get('clickable') == 'true':
            coords = list(map(int, re.findall(r'\d+', attrs.get('bounds', ''))))
            if len(coords) == 4 and coords[2] > coords[0] and coords[3] > coords[1]:
                print((coords[0] + coords[2]) // 2, (coords[1] + coords[3]) // 2)
                sys.exit(0)
except Exception:
    pass
sys.exit(1)
PY
  )" || return 1
  adb shell input tap $bounds
}

clear_system_dialog() {
  get_hierarchy
  if grep -Eiq "isn.t responding|not responding" /tmp/ux-hierarchy.xml; then
    echo "System ANR detected; closing the unresponsive launcher"
    tap_by_label "Close app" || adb shell input keyevent 4 || true
    sleep 5
    adb shell am start -n "$APP/.MainActivity"
    sleep 8
    get_hierarchy
  fi
}

capture() {
  local name="$1"
  clear_system_dialog
  get_hierarchy
  cp /tmp/ux-hierarchy.xml "ux-screenshots/$name.xml" || true
  adb exec-out screencap -p > "ux-screenshots/$name.png"
  adb shell dumpsys window | grep -E 'mCurrentFocus|mFocusedApp' | head -n 4 || true
}

# Keep startup and text-scale captures on a fresh onboarding screen.
capture android-phone-light
adb shell settings put system font_scale 1.3
adb shell am force-stop "$APP"
adb shell am start -n "$APP/.MainActivity"
sleep 8
capture android-phone-large-text
adb shell cmd uimode night yes
adb shell am force-stop "$APP"
adb shell am start -n "$APP/.MainActivity"
sleep 8
capture android-phone-dark-large-text
adb shell settings put system font_scale 1.0
adb shell wm size 1200x1920
adb shell wm density 200
adb shell am force-stop "$APP"
adb shell am start -n "$APP/.MainActivity"
sleep 8
capture android-tablet-size-dark

# Return to compact/light configuration for the complete onboarding journey.
adb shell cmd uimode night no
adb shell settings put system font_scale 1.0
adb shell wm size reset
adb shell wm density reset
adb shell am force-stop "$APP"
adb shell am start -n "$APP/.MainActivity"
sleep 8

if tap_by_label "Get Started"; then
  sleep 3
  capture android-script-selection-light
  if tap_by_label "Simplified Chinese"; then
    sleep 4
    capture android-goal-selection-light
    if tap_by_label "Set Goal"; then
      sleep 12
      capture android-after-goal-light
      # Accept the EULA only within this disposable emulator instance.
      if tap_by_label "I have read and agree"; then
        sleep 2
        if tap_by_label "Continue"; then
          sleep 10
        fi
      fi
      capture android-onboarding-completed-light

      if tap_by_label "Dictionary"; then
        sleep 5
        capture android-dictionary-light
      fi
      if tap_by_label "Settings"; then
        sleep 3
        capture android-settings-general-light
        if tap_by_label "Study Experience"; then
          sleep 3
          capture android-settings-study-light
        fi
        if tap_by_label "Audio Preferences"; then
          sleep 3
          capture android-settings-audio-light
        fi
      fi
      if tap_by_label "Home"; then
        sleep 3
        capture android-home-light
        if tap_by_label "Start Learning"; then
          sleep 6
          capture android-learning-entry-light
        fi
      fi
    fi
  fi
fi
