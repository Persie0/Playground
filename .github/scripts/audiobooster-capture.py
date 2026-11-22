#!/usr/bin/env python3
"""Capture native AudioBooster UX only to the runner's private checkout.

Never prints image bytes or publishes artifacts to the public Playground repo.
"""
import pathlib
import re
import subprocess
import time
import xml.etree.ElementTree as ET

OUT = pathlib.Path("source/.ux-native/android")
OUT.mkdir(parents=True, exist_ok=True)


def adb(*args, **kwargs):
    return subprocess.run(["adb", *args], check=False, **kwargs)


def dump_tree():
    for _ in range(3):
        adb("shell", "uiautomator", "dump", "/sdcard/audiobooster-ux.xml",
            stdout=subprocess.DEVNULL, stderr=subprocess.DEVNULL)
        result = adb("exec-out", "cat", "/sdcard/audiobooster-ux.xml",
                     capture_output=True)
        try:
            return ET.fromstring(result.stdout), result.stdout
        except ET.ParseError:
            time.sleep(2)
    return None, b""


def capture(name):
    time.sleep(3)
    target = OUT / f"{name}.png"
    with target.open("wb") as stream:
        subprocess.run(["adb", "exec-out", "screencap", "-p"], check=True, stdout=stream)
    tree, xml = dump_tree()
    if xml:
        (OUT / f"{name}.xml").write_bytes(xml)
    print(f"Native capture {name}: {target.stat().st_size} bytes", flush=True)


def tap_label(*labels, optional=True):
    for attempt in range(3):
        tree, _ = dump_tree()
        if tree is None:
            continue
        nodes = list(tree.iter("node"))
        for exact in (True, False):
            for label in labels:
                needle = label.casefold()
                for node in nodes:
                    texts = [node.attrib.get("text", ""), node.attrib.get("content-desc", "")]
                    matched = any(
                        value and (value.casefold() == needle if exact else needle in value.casefold())
                        for value in texts
                    )
                    if not matched:
                        continue
                    coords = re.findall(r"\d+", node.attrib.get("bounds", ""))
                    if len(coords) != 4:
                        continue
                    x1, y1, x2, y2 = map(int, coords)
                    if x2 <= x1 or y2 <= y1:
                        continue
                    adb("shell", "input", "tap", str((x1 + x2) // 2), str((y1 + y2) // 2))
                    print(f"Tapped {label}", flush=True)
                    time.sleep(3)
                    return True
        if attempt < 2:
            adb("shell", "input", "swipe", "230", "680", "230", "280", "400")
            time.sleep(2)
    if not optional:
        raise RuntimeError(f"Could not find UI control matching {labels}")
    print(f"Unavailable optional control: {labels}", flush=True)
    return False


def main():
    adb("shell", "wm", "size", "390x844")
    adb("shell", "wm", "density", "160")
    adb("shell", "settings", "put", "system", "font_scale", "1.0")
    adb("shell", "cmd", "uimode", "night", "no")
    adb("shell", "am", "start", "-W", "-n",
        "com.persie0.audiobooster/.MainActivity", stdout=subprocess.DEVNULL)
    time.sleep(12)
    capture("01-onboarding-light")

    # Fresh installs may start with the automatic media guide or directly
    # display the device compatibility result.
    tap_label("Close", "Skip")
    capture("02-compatibility-light")
    tap_label("Continue", optional=False)
    capture("03-home-light")

    tap_label("Settings")
    capture("04-advanced-light")
    tap_label("Back")
    tap_label("View supported apps")
    capture("05-supported-apps-light")
    tap_label("Back")

    adb("shell", "cmd", "uimode", "night", "yes")
    time.sleep(4)
    capture("06-home-dark")
    adb("shell", "settings", "put", "system", "font_scale", "1.6")
    time.sleep(4)
    capture("07-home-dark-large-type")
    tap_label("Settings")
    capture("08-advanced-dark-large-type")
    tap_label("Back")

    adb("shell", "settings", "put", "system", "font_scale", "1.0")
    adb("shell", "cmd", "uimode", "night", "no")
    adb("shell", "wm", "size", "800x1280")
    adb("shell", "wm", "density", "160")
    time.sleep(5)
    capture("09-home-tablet")
    tap_label("Settings")
    capture("10-advanced-tablet")
    print("All available native captures remain in the private checkout.", flush=True)


if __name__ == "__main__":
    main()
