#!/usr/bin/env python3
"""Resistor Scanner native UI capture, adapted from skipsilence-r5-native-ui.py."""
import os
import re
import subprocess
import time
from pathlib import Path
from xml.etree import ElementTree as ET

PACKAGE = "at.austriao.resistor_scanner"
ACTIVITY = PACKAGE + "/at.austriao.resistorscanner.MainActivity"
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
        if node.attrib.get("package") == PACKAGE and label.casefold() in (text.casefold(), desc.casefold()):
            return node
    return None


def wait_for(label, tries=30):
    for _ in range(tries):
        try:
            root = dump()
            if any(n.attrib.get("text") == "Pixel Launcher isn\'t responding" for n in root.iter("node")):
                adb("shell", "am", "force-stop", "com.google.android.apps.nexuslauncher", check=False)
                adb("shell", "am", "start", "-W", "-n", ACTIVITY)
                time.sleep(2)
                continue
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
    if not screenshot_bytes.startswith(b"\x89PNG\r\n\x1a\n"):
        raise RuntimeError("Invalid screenshot PNG")
    try:
        (OUTPUT / name.replace(".png", ".xml")).write_bytes(ET.tostring(dump(), encoding="utf-8"))
    except (ET.ParseError, RuntimeError):
        pass
    (OUTPUT / name).write_bytes(screenshot_bytes)
    print("Captured", name, len(screenshot_bytes), "bytes", flush=True)


def verify_no_node(label):
    root = dump()
    if find(root, label) is not None:
        screenshot("unexpected-" + label.replace(" ", "-") + ".png")
        raise AssertionError(f"{label!r} is incorrectly visible")
    print("Confirmed hidden:", label, flush=True)


def launch():
    adb("shell", "am", "start", "-W", "-n", ACTIVITY)
    time.sleep(3)

def screen(label, name):
    wait_for(label)
    screenshot(name)

def main():
    # Match the existing Playground capture harnesses: predictable dp size,
    # no launcher ANR over the app, and label-driven interaction.
    adb("shell", "wm", "size", "390x844")
    adb("shell", "wm", "density", "160")
    adb("shell", "cmd", "uimode", "night", "no")
    adb("shell", "settings", "put", "system", "font_scale", "1.0")
    adb("shell", "settings", "put", "system", "accelerometer_rotation", "0")
    adb("shell", "settings", "put", "system", "user_rotation", "0")
    adb("shell", "input", "keyevent", "KEYCODE_WAKEUP")
    adb("shell", "wm", "dismiss-keyguard", check=False)
    adb("shell", "am", "force-stop", "com.google.android.apps.nexuslauncher", check=False)
    adb("shell", "pm", "clear", PACKAGE)
    adb("shell", "pm", "grant", PACKAGE, "android.permission.CAMERA")
    launch()
    screen("Fill the frame", "01-guide-light.png")
    tap("Next")
    screen("Choose a plain background", "02-guide-background.png")
    tap("Next")
    screen("Avoid shiny reflections", "03-guide-lighting.png")
    tap("Start scanning")
    screen("Scanner settings", "04-scanner-light.png")
    tap("Scanner settings")
    screen("Scan guide", "05-settings-light.png")
    tap("Scan guide")
    screen("Fill the frame", "06-replay-light.png")
    verify_no_node("Skip")
    tap("Next")
    screen("Choose a plain background", "07-replay-step2.png")
    adb("shell", "input", "keyevent", "KEYCODE_BACK")
    wait_for("Fill the frame")
    adb("shell", "input", "keyevent", "KEYCODE_BACK")
    screen("Scanner settings", "08-after-replay.png")
    adb("shell", "cmd", "uimode", "night", "yes")
    adb("shell", "settings", "put", "system", "font_scale", "1.6")
    adb("shell", "wm", "size", "360x640")
    time.sleep(3)
    screen("Scanner settings", "09-compact-dark-large-text.png")
    tap("Scanner settings")
    screen("Scan guide", "10-settings-compact-dark.png")
    tap("Scan guide")
    screen("Fill the frame", "11-guide-compact-dark.png")
    tap("Close")
    wait_for("Scanner settings")
    adb("shell", "wm", "size", "844x390")
    time.sleep(3)
    screen("Scanner settings", "12-landscape-dark-large-text.png")
    tap("Scanner settings")
    screen("Scan guide", "13-settings-landscape-dark.png")
    tap("Scan guide")
    screen("Fill the frame", "14-guide-landscape-dark.png")
    tap("Close")
    wait_for("Scanner settings")
    adb("shell", "settings", "put", "system", "font_scale", "1.0")
    adb("shell", "cmd", "uimode", "night", "no")
    adb("shell", "wm", "size", "800x1280")
    time.sleep(3)
    screen("Scanner settings", "15-tablet-light.png")
    print("Native scanner UI smoke test: PASS", flush=True)

if __name__ == "__main__":
    try:
        main()
    finally:
        for filename, args in [
            ("runtime-crashes.log", ("logcat", "-d", "-b", "crash")),
            ("window-state.txt", ("shell", "dumpsys", "window")),
        ]:
            (OUTPUT / filename).write_text(adb(*args, check=False))
