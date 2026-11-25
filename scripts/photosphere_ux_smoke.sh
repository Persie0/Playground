#!/usr/bin/env bash
set -euo pipefail
mkdir -p ux-artifacts
APK=PhotoSphere-UX-debug.apk
test -s "$APK"
adb install -r "$APK"
adb shell pm grant at.persie0.photosphere android.permission.CAMERA || true
adb shell settings put system accelerometer_rotation 0
adb shell settings put system user_rotation 0
adb shell am force-stop at.persie0.photosphere
adb shell am start -n at.persie0.photosphere/.CaptureActivity
sleep 8

capture() {
    local name="$1"
    for attempt in 1 2 3; do
        if timeout 35 adb shell uiautomator dump /sdcard/window.xml >/dev/null 2>&1; then break; fi
        sleep 3
    done
    adb pull /sdcard/window.xml "ux-artifacts/${name}.xml"
    adb exec-out screencap -p > "ux-artifacts/${name}.png"
    test -s "ux-artifacts/${name}.png"
}
capture portrait

adb shell settings put system user_rotation 1
sleep 7
capture landscape

python3 - <<'PY'
import pathlib, re, xml.etree.ElementTree as ET

def bounds(value):
    m=re.fullmatch(r'\[(\d+),(\d+)\]\[(\d+),(\d+)\]',value or '')
    return tuple(map(int,m.groups())) if m else None

for orientation in ['portrait','landscape']:
    path=pathlib.Path('ux-artifacts')/(orientation+'.xml')
    root=ET.parse(path).getroot()
    buttons=[]
    for el in root.iter('node'):
        if el.attrib.get('class')!='android.widget.Button': continue
        label=el.attrib.get('text','')
        box=bounds(el.attrib.get('bounds'))
        if box and el.attrib.get('package')=='at.persie0.photosphere':
            buttons.append((label,box))
    assert buttons, f'{orientation}: expected native accessible buttons'
    labels=[label for label,_ in buttons]
    for expected in ['More','View 360']:
        assert any(expected in label for label in labels), f'{orientation}: missing {expected}: {labels}'
    for label,(left,top,right,bottom) in buttons:
        assert right>left and bottom>top, f'{orientation}: empty button {label}'
        assert right-left>=75 and bottom-top>=75, (
            f'{orientation}: too-small touch target {label}: {right-left}x{bottom-top}'
        )
    for i,(name,a) in enumerate(buttons):
        for other,b in buttons[i+1:]:
            overlap=max(0,min(a[2],b[2])-max(a[0],b[0]))*max(0,min(a[3],b[3])-max(a[1],b[1]))
            assert overlap==0, f'{orientation}: overlapping actions {name} and {other}'
    print(orientation, 'buttons', buttons)
print('PASS: portrait and landscape actions are discoverable, sized and non-overlapping')
PY
