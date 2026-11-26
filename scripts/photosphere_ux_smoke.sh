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
    adb shell rm -f /sdcard/window.xml
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

adb shell wm user-rotation lock 1
adb shell settings put system user_rotation 1
adb shell am force-stop at.persie0.photosphere
adb shell am start -n at.persie0.photosphere/.CaptureActivity
sleep 7
capture landscape

# Large-font layout must keep its core actions visible and accessible.
adb shell wm user-rotation lock 0
adb shell settings put system user_rotation 0
adb shell settings put system font_scale 1.4
adb shell am force-stop at.persie0.photosphere
adb shell am start -n at.persie0.photosphere/.CaptureActivity
sleep 7
capture portrait-large-font
adb shell wm user-rotation lock 1
adb shell settings put system user_rotation 1
adb shell am force-stop at.persie0.photosphere
adb shell am start -n at.persie0.photosphere/.CaptureActivity
sleep 7
capture landscape-large-font
adb shell settings put system font_scale 1.0
adb shell wm user-rotation free
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
    hints=[el.get('text','') for el in root.iter('node')]
    assert 'Pivot around the lens. Follow the arrow.' in hints, f'{orientation}: missing shortened guidance'
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
for name,required in [('options-menu','How to capture a Photo Sphere'),('help-dialog','Tap Start')]:
    root=ET.parse(pathlib.Path('ux-artifacts')/(name+'.xml')).getroot()
    alltext=' '.join(el.get('text','') for el in root.iter('node'))
    assert required in alltext, f'{name}: missing {required}: {alltext[:400]}'
print('PASS: portrait, landscape, large-font and in-app help actions are discoverable, sized and non-overlapping')
PY

# Use deterministic, synthetic saved sessions to exercise the real native
# activity's recovery and export UI without claiming a physical camera stitch.
adb shell wm user-rotation lock 0
adb shell am force-stop at.persie0.photosphere
mkdir -p /tmp/photosphere-ui-fixtures
app_dir="$(adb shell run-as at.persie0.photosphere pwd | tr -d '\r')"
APP_DIR="$app_dir" python3 - <<'PY'
import base64,json,os,pathlib,time
root=pathlib.Path('/tmp/photosphere-ui-fixtures')
jpeg=base64.b64decode('/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAoHBwgHBgoICAgLCgoLDhgQDg0NDh0VFhEYIx8lJCIfIiEmKzcvJik0KSEiMEExNDk7Pj4+JS5ESUM8SDc9Pjv/2wBDAQoLCw4NDhwQEBw7KCIoOzs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozs7Ozv/wAARCAAgAEADASIAAhEBAxEB/8QAHwAAAQUBAQEBAQEAAAAAAAAAAAECAwQFBgcICQoL/8QAtRAAAgEDAwIEAwUFBAQAAAF9AQIDAAQRBRIhMUEGE1FhByJxFDKBkaEII0KxwRVS0fAkM2JyggkKFhcYGRolJicoKSo0NTY3ODk6Q0RFRkdISUpTVFVWV1hZWmNkZWZnaGlqc3R1dnd4eXqDhIWGh4iJipKTlJWWl5iZmqKjpKWmp6ipqrKztLW2t7i5usLDxMXGx8jJytLT1NXW19jZ2uHi4+Tl5ufo6erx8vP09fb3+Pn6/8QAHwEAAwEBAQEBAQEBAQAAAAAAAAECAwQFBgcICQoL/8QAtREAAgECBAQDBAcFBAQAAQJ3AAECAxEEBSExBhJBUQdhcRMiMoEIFEKRobHBCSMzUvAVYnLRChYkNOEl8RcYGRomJygpKjU2Nzg5OkNERUZHSElKU1RVVldYWVpjZGVmZ2hpanN0dXZ3eHl6goOEhYaHiImKkpOUlZaXmJmaoqOkpaanqKmqsrO0tba3uLm6wsPExcbHyMnK0tPU1dbX2Nna4uPk5ebn6Onq8vP09fb3+Pn6/9oADAMBAAIRAxEAPwDAooor0DywooooAKKKKACiiigAooooAKKKKACiiigAooooA//Z')
for n,status in enumerate(['failed','complete','rendering'],1):
    ident='00000000-0000-4000-8000-%012d'%n
    d=root/ident;d.mkdir()
    p=os.environ['APP_DIR']+'/files/captures/'+ident+'/0.jpg'
    pose={'horizontal_fov_deg':70.0,'vertical_fov_deg':55.0,'quaternion_wxyz':[1.0,0.0,0.0,0.0]}
    data={'version':1,'width':64,'height':32,'horizontal_fov_deg':70.0,'vertical_fov_deg':55.0,
          'sensor_orientation':90,'anchor_heading':0.0,'first_photo_time':int(time.time()*1000)+n,
          'config':{},'target_layout_policy':'gcam_native','sources':[{'path':p,'pose':pose}],
          'target_ids':[0],'status':status,'revision':1}
    (d/'0.jpg').write_bytes(jpeg)
    (d/'session.json').write_text(json.dumps(data))
    if status=='complete':(d/'panorama.jpg').write_bytes(jpeg)
PY
for d in /tmp/photosphere-ui-fixtures/*; do
    id="$(basename "$d")"
    adb shell run-as at.persie0.photosphere mkdir -p "files/captures/$id"
    for f in "$d"/*; do
        name="$(basename "$f")"
        adb shell -T "run-as at.persie0.photosphere sh -c 'cat > files/captures/$id/$name'" < "$f"
    done
done

open_fixture() {
    adb shell am force-stop at.persie0.photosphere
    adb shell am start -n at.persie0.photosphere/.CaptureActivity --es capture_id "$1"
    sleep 6
    capture "$2"
}
assert_text() {
    python3 - "$1" "$2" <<'PY'
import sys,xml.etree.ElementTree as ET
tree=ET.parse('ux-artifacts/'+sys.argv[1]+'.xml')
content=' '.join(n.get('text','')+' '+n.get('content-desc','') for n in tree.iter('node'))
assert sys.argv[2] in content, f'{sys.argv[1]}: expected {sys.argv[2]}, found {content[:500]}'
PY
}
open_fixture 00000000-0000-4000-8000-000000000001 failed-render
assert_text failed-render 'Render failed'
assert_text failed-render 'Retry'
assert_text failed-render 'Export ZIP'
adb shell input tap $(button_center ux-artifacts/failed-render.xml 'Export ZIP')
sleep 2
capture export-privacy
assert_text export-privacy 'sensitive details'
adb shell input keyevent 4
sleep 1
open_fixture 00000000-0000-4000-8000-000000000003 interrupted-render
assert_text interrupted-render 'Stitching stopped'
assert_text interrupted-render 'Retry'
assert_text interrupted-render 'Export ZIP'
open_fixture 00000000-0000-4000-8000-000000000002 complete-render
assert_text complete-render 'Panorama ready'
assert_text complete-render 'View 360°'
assert_text complete-render 'New capture'
adb shell input tap $(button_center ux-artifacts/complete-render.xml 'More')
sleep 1
capture saved-menu
adb shell input tap $(button_center ux-artifacts/saved-menu.xml 'Saved captures')
sleep 2
capture saved-history
assert_text saved-history 'Panorama ready'
assert_text saved-history 'Stitching stopped'
assert_text saved-history 'Render failed'
assert_text saved-history '1 photo'
python3 - <<'PY'
import xml.etree.ElementTree as ET
for name in ['failed-render','complete-render','interrupted-render']:
    tree=ET.parse('ux-artifacts/'+name+'.xml')
    nodes=list(tree.iter('node'))
    texts=[n.get('text','') for n in nodes]
    assert '1 photo' in texts, f'{name}: expected actual saved photo count'
    assert not any('1 of ' in t for t in texts), f'{name}: misleading target count'
    assert not any(n.get('resource-id','').endswith(':id/capture_status') for n in nodes), f'{name}: duplicate status banner'
tree=ET.parse('ux-artifacts/saved-history.xml')
assert not any('1 photos' in n.get('text','') for n in tree.iter('node')), 'incorrect plural'
PY
adb shell input keyevent 4
sleep 1
adb shell input tap $(button_center ux-artifacts/complete-render.xml 'New capture')
sleep 4
capture new-capture
assert_text new-capture 'Start'
adb shell am force-stop at.persie0.photosphere
adb shell am start -n at.persie0.photosphere/.CaptureActivity
sleep 6
capture new-capture-relaunch
assert_text new-capture-relaunch 'Start'
echo 'PASS: synthetic complete, failed and interrupted states, ZIP privacy, saved-session history and new-session recreation'
