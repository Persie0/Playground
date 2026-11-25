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

# Verify that the secondary menu exposes contextual help without extra
# first-screen buttons. No fixed screen-coordinate assumptions.
button_center() {
    python3 - "$1" "$2" <<'PY'
import re,sys,xml.etree.ElementTree as ET
root=ET.parse(sys.argv[1]).getroot()
for node in root.iter('node'):
    if node.get('text')==sys.argv[2]:
        m=re.fullmatch(r'\[(\d+),(\d+)\]\[(\d+),(\d+)\]',node.get('bounds',''))
        if m:
            a,b,c,d=map(int,m.groups())
            print((a+c)//2,(b+d)//2)
            sys.exit(0)
raise SystemExit('Missing visible UI control: '+sys.argv[2])
PY
}
adb shell input tap $(button_center ux-artifacts/portrait.xml More)
sleep 2
capture options-menu
adb shell input tap $(button_center ux-artifacts/options-menu.xml 'How to capture a Photo Sphere')
sleep 2
capture help-dialog
adb shell input keyevent 4
sleep 1

adb shell cmd window set-user-rotation lock 1
adb shell settings put system user_rotation 1
adb shell am force-stop at.persie0.photosphere
adb shell am start -n at.persie0.photosphere/.CaptureActivity
sleep 7
capture landscape

# Large-font layout must keep its core actions visible and accessible.
adb shell cmd window set-user-rotation lock 0
adb shell settings put system user_rotation 0
adb shell settings put system font_scale 1.4
adb shell am force-stop at.persie0.photosphere
adb shell am start -n at.persie0.photosphere/.CaptureActivity
sleep 7
capture portrait-large-font
adb shell cmd window set-user-rotation lock 1
adb shell settings put system user_rotation 1
adb shell am force-stop at.persie0.photosphere
adb shell am start -n at.persie0.photosphere/.CaptureActivity
sleep 7
capture landscape-large-font
adb shell settings put system font_scale 1.0
adb shell cmd window set-user-rotation free
adb shell settings put system user_rotation 0

python3 - <<'PY'
import pathlib, re, struct, xml.etree.ElementTree as ET

def bounds(value):
    m=re.fullmatch(r'\[(\d+),(\d+)\]\[(\d+),(\d+)\]',value or '')
    return tuple(map(int,m.groups())) if m else None

for orientation in ['portrait','landscape','portrait-large-font','landscape-large-font']:
    path=pathlib.Path('ux-artifacts')/(orientation+'.xml')
    png=path.with_suffix('.png').read_bytes()
    assert png[:8]==b'\x89PNG\r\n\x1a\n', orientation+': invalid screenshot'
    width,height=struct.unpack('>II',png[16:24])
    assert (width>height)==orientation.startswith('landscape'), (
        f'{orientation}: incorrect device orientation {width}x{height}')
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
    expected=['Start'] if 'large-font' in orientation else ['Start','More','Open photo']
    for value in expected:
        assert any(value.lower() in label.lower() for label in labels), f'{orientation}: missing {value}: {labels}'
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
for name,required in [('options-menu','How to capture a Photo Sphere'),('help-dialog','Keep the phone')]:
    root=ET.parse(pathlib.Path('ux-artifacts')/(name+'.xml')).getroot()
    alltext=' '.join(el.get('text','') for el in root.iter('node'))
    assert required in alltext, f'{name}: missing {required}: {alltext[:400]}'
print('PASS: portrait, landscape, large-font and in-app help actions are discoverable, sized and non-overlapping')
PY
