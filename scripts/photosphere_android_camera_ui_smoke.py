#!/usr/bin/env python3
"""Exercise the packaged app through its camera UI on a disposable emulator."""
import hashlib, io, json, os, pathlib, re, subprocess, time, xml.etree.ElementTree as ET
from PIL import Image
PKG="at.persie0.photosphere"
root=pathlib.Path("engine")
shots=root/"docs/validation/android-screens"
shots.mkdir(parents=True,exist_ok=True)
def adb(*args, binary=False, check=True):
    p=subprocess.run(["adb",*args],stdout=subprocess.PIPE,stderr=subprocess.PIPE,check=check)
    return p.stdout if binary else p.stdout.decode(errors="replace").strip()
def ui():
    adb("shell","uiautomator","dump","/sdcard/photosphere-window.xml")
    return ET.fromstring(adb("shell","cat","/sdcard/photosphere-window.xml"))
def tap(text):
    nodes=[n for n in ui().iter("node") if n.attrib.get("text")==text and n.attrib.get("enabled")=="true"]
    assert nodes,"Missing enabled UI action: "+text
    bounds=re.findall(r"\d+",nodes[0].attrib["bounds"])
    x1,y1,x2,y2=map(int,bounds)
    adb("shell","input","tap",str((x1+x2)//2),str((y1+y2)//2))
def texts():
    return [n.attrib.get("text","") for n in ui().iter("node")]
def wait(predicate,seconds=45):
    deadline=time.monotonic()+seconds
    while time.monotonic()<deadline:
        try:
            value=predicate()
            if value: return value
        except (subprocess.CalledProcessError,ET.ParseError,json.JSONDecodeError,AssertionError):
            pass
        time.sleep(0.5)
    raise AssertionError("Timed out waiting for expected app state")
def read_state():
    ids=adb("shell","run-as",PKG,"ls","files/captures",check=False).split()
    values=[]
    for id in ids:
        if re.fullmatch(r"[a-f0-9-]{36}",id):
            data=adb("exec-out","run-as",PKG,"cat","files/captures/"+id+"/session.json",check=False)
            try: values.append((id,json.loads(data)))
            except json.JSONDecodeError: pass
    return max(values,key=lambda x:x[1]["first_photo_time"]) if values else None
def count_is(n):
    pair=read_state()
    return pair if pair and len(pair[1]["sources"])==n else None
def screenshot(name):
    (shots/(name+".png")).write_bytes(adb("exec-out","screencap","-p",binary=True))
def source_hashes(state):
    return [hashlib.sha256(adb("exec-out","run-as",PKG,"cat",s["path"],binary=True)).hexdigest() for s in state["sources"]]
try:
    adb("shell","pm","grant",PKG,"android.permission.CAMERA")
    adb("shell","pm","grant",PKG,"android.permission.POST_NOTIFICATIONS")
    adb("emu","sensor","set","acceleration","0:9.81:0")
    adb("emu","sensor","set","magnetic-field","0:0:-50")
    adb("emu","sensor","set","gyroscope","0:0:0")
    adb("shell","am","start","-W","-n",PKG+"/.CaptureActivity")
    wait(lambda:"Start capture" in texts())
    time.sleep(1)
    tap("Start capture")
    first=wait(lambda:count_is(1),60)
    wait(lambda:any(re.fullmatch(r"1 of \d+ photos",s) for s in texts()))
    screenshot("capture")
    # Simulate process death with a committed source, then recover through UI.
    adb("shell","am","force-stop",PKG)
    adb("shell","am","start","-W","-n",PKG+"/.CaptureActivity")
    wait(lambda:"Continue saved capture?" in texts())
    tap("Cancel")
    wait(lambda:any(re.fullmatch(r"1 of \d+ photos",s) for s in texts()))
    screenshot("recovered")
    tap("Undo")
    wait(lambda:count_is(0))
    wait(lambda:any(re.fullmatch(r"0 of \d+ photos",s) for s in texts()))
    tap("Resume")
    second=wait(lambda:count_is(1),60)
    wait(lambda:any(re.fullmatch(r"1 of \d+ photos",s) for s in texts()))
    before=source_hashes(second[1])
    tap("Save panorama")
    completed=wait(lambda:(lambda v:v if v and v[1]["status"]=="complete" else None)(read_state()),240)
    assert source_hashes(completed[1])==before,"Rendering changed source JPEG bytes"
    assert completed[1]["output_uri"].startswith("content://media/")
    path="files/captures/"+completed[0]+"/panorama.jpg"
    jpeg=adb("exec-out","run-as",PKG,"cat",path,binary=True)
    assert b'GPano:ProjectionType="equirectangular"' in jpeg
    image=Image.open(io.BytesIO(jpeg)); image.load()
    report=completed[1]["report"]
    assert image.size==(report["output_width"],report["output_height"])
    assert [layer[1:3] for layer in image.layer]==[(2,2),(1,1),(1,1)]
    wait(lambda:"Panorama saved" in texts())
    screenshot("saved")
    summary={"camera_ui_capture":True,"process_death_recovery":True,"undo_and_recapture":True,
        "foreground_render":True,"gallery_publication":True,"original_source_hashes_unchanged":True,
        "decoded_dimensions":list(image.size),"jpeg_sampling":"4:2:0",
        "source_count":len(completed[1]["sources"]),"capture_id":completed[0]}
    (root/"docs/validation/android-camera-ui.json").write_text(json.dumps(summary,indent=2)+"\n")
    print("Packaged camera UI capture/recovery/undo/render/gallery smoke passed")
finally:
    try:
        screenshot("last-state")
        temp=pathlib.Path(os.environ["RUNNER_TEMP"])
        (temp/"android-ui-window.log").write_text(ET.tostring(ui(),encoding="unicode"))
        (temp/"android-ui-state.log").write_text(json.dumps(read_state(),indent=2))
        (temp/"android-ui-logcat.log").write_text(adb("logcat","-d","-t","1000"))
    except Exception:
        pass
