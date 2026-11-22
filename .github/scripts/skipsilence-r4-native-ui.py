#!/usr/bin/env python3
"""On-device SkipSilencePlayer UI smoke test on a public Playground Android emulator."""
import os
import re
import subprocess
import time
from pathlib import Path
from xml.etree import ElementTree as ET

PACKAGE = "at.persie0.skipsilenceplayer"
OUTPUT = Path("native-review")
OUTPUT.mkdir(exist_ok=True)


def adb(*args, timeout=75, check=True, binary=False):
    cp = subprocess.run(["adb", *args], capture_output=True, timeout=timeout, check=False)
    if check and cp.returncode:
        msg = cp.stderr.decode(errors="replace") + cp.stdout.decode(errors="replace")
        raise RuntimeError(f"adb {args!r} failed: {msg[:1500]}")
    return cp.stdout if binary else cp.stdout.decode(errors="replace")


def dump():
    adb("shell", "uiautomator", "dump", "/sdcard/window.xml")
    data = adb("exec-out", "cat", "/sdcard/window.xml")
    return ET.fromstring(data)


def find(root, label):
    for node in root.iter("node"):
        text = node.attrib.get("text", "")
        desc = node.attrib.get("content-desc", "")
        if label.casefold() in (text.casefold(), desc.casefold()):
            return node
    return None


def wait_for(label, tries=5):
    for _ in range(tries):
        try:
            root = dump()
            hit = find(root, label)
            if hit is not None:
                return root, hit
        except (ET.ParseError, RuntimeError) as exc:
            print("UI dump retry:", str(exc)[:220], flush=True)
        time.sleep(2)
    root = dump()
    labels = [
        (node.attrib.get("text") or node.attrib.get("content-desc"))
        for node in root.iter("node")
    ]
    labels = [value for value in labels if value]
    print("Current accessibility labels:", labels[:90], flush=True)
    screenshot("missing-" + label.replace(" ", "-") + ".png")
    raise RuntimeError(f"Expected accessible UI item not found: {label}")


def tap(label):
    _, node = wait_for(label)
    coords = re.findall(r"\[(\d+),(\d+)\]", node.attrib.get("bounds", ""))
    if len(coords) != 2:
        raise RuntimeError(f"No tap bounds for {label}: {node.attrib!r}")
    (x1, y1), (x2, y2) = ((int(x), int(y)) for x, y in coords)
    adb("shell", "input", "tap", str((x1 + x2) // 2), str((y1 + y2) // 2))
    print("Tapped", label, flush=True)
    time.sleep(1)


def screenshot(name):
    screenshot_bytes = adb("exec-out", "screencap", "-p", binary=True)
    (OUTPUT / name).write_bytes(screenshot_bytes)
    print("Captured", name, len(screenshot_bytes), "bytes", flush=True)


def verify_no_node(label):
    root = dump()
    if find(root, label) is not None:
        screenshot("unexpected-" + label.replace(" ", "-") + ".png")
        raise AssertionError(f"{label!r} is incorrectly visible")
    print("Confirmed hidden:", label, flush=True)


def open_media(uri):
    adb("shell", "am", "start", "-W",
        "-n", PACKAGE + "/.MainActivity",
        "-a", "android.intent.action.VIEW",
        "-t", "video/mp4", "-d", uri,
        "--grant-read-uri-permission")
    time.sleep(3)


def media_uri():
    path = "/sdcard/Movies/skipsilence-native-qa.mp4"
    adb("shell", "mkdir", "-p", "/sdcard/Movies")
    adb("push", "native-review/fixture.mp4", path)
    adb("shell", "am", "broadcast", "-a",
        "android.intent.action.MEDIA_SCANNER_SCAN_FILE", "-d", "file://" + path)
    for attempt in range(5):
        rows = adb("shell", "content", "query", "--uri",
                   "content://media/external/video/media", "--projection", "_id:_display_name",
                   check=False)
        found = re.search(r"_id=(\d+).*_display_name=skipsilence-native-qa\.mp4", rows)
        if found:
            uri = "content://media/external/video/media/" + found.group(1)
            print("MediaStore fixture URI:", uri, flush=True)
            return uri
        time.sleep(2)
    raise RuntimeError("Fixture not registered in Android MediaStore: " + rows[:1600])


print("Starting Android functional UX smoke test", flush=True)
adb("shell", "settings", "put", "system", "font_scale", "1.3")
adb("shell", "am", "force-stop", "com.google.android.apps.nexuslauncher", check=False)
adb("shell", "am", "start", "-W", "-n", PACKAGE + "/.MainActivity")
time.sleep(3)
wait_for("Gestures & player guide")
screenshot("empty-library.png")
tap("Gestures & player guide")
wait_for("Touch gestures")
screenshot("player-guide.png")
adb("shell", "input", "keyevent", "KEYCODE_BACK")
time.sleep(1)

open_media(media_uri())
# Keep the controls from auto-hiding during slow UIAutomator hierarchy queries.
adb("shell", "input", "keyevent", "KEYCODE_MEDIA_PAUSE")
time.sleep(1)
try:
    wait_for("More options", tries=2)
except RuntimeError:
    adb("shell", "input", "tap", "500", "1050")
    wait_for("More options")
screenshot("video-player.png")
wait_for("skipsilence-native-qa.mp4", tries=2)
tap("More options")
tap("Audio only")
time.sleep(1)
screenshot("audio-only-player.png")
# Reveal the top controls if the overlay hid them during a delayed tick.
try:
    wait_for("Library", tries=2)
except RuntimeError:
    adb("shell", "input", "tap", "500", "1050")
    wait_for("Library")
tap("Library")
wait_for("Continue watching")
verify_no_node("Audio only")
screenshot("library-with-audio-only-enabled.png")
print("Native UI smoke test: PASS", flush=True)
