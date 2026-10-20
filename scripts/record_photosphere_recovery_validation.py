#!/usr/bin/env python3
import json,os,pathlib,xml.etree.ElementTree as ET
root=pathlib.Path("engine")
lines=["# Android recovery and packaged camera UI validation","",
    "Source: "+os.environ["SOURCE_SHA"],
    "Native source: 6e0fc91056f9facf04e114700c324d4fd2e57847",
    "Run: https://github.com/Persie0/Playground/actions/runs/"+os.environ["GITHUB_RUN_ID"],"",
    "Native library binaries were reused from the prior verified arm64/x86_64 build; Rust code was unchanged.",""]
for label,pattern in [("Android JVM","android/app/build/test-results/testDebugUnitTest/TEST-*.xml"),
                      ("Android emulator","android/app/build/outputs/androidTest-results/connected/**/*.xml")]:
    total=failures=errors=0
    for path in root.glob(pattern):
        node=ET.parse(path).getroot()
        if node.tag=="testsuite":
            total+=int(node.attrib.get("tests",0)); failures+=int(node.attrib.get("failures",0)); errors+=int(node.attrib.get("errors",0))
    assert total>0 and failures==0 and errors==0
    lines += [label+": "+str(total)+" passed; no failures/errors.",""]
    print(label+": "+str(total)+" passed")
summary=json.loads((root/"docs/validation/android-camera-ui.json").read_text())
assert all(summary.get(name) is True for name in ["camera_ui_capture","process_death_recovery","undo_and_recapture","foreground_render","gallery_publication","original_source_hashes_unchanged"])
lines += ["The packaged app captured from the emulated Camera1 preview through its own UI, recovered after force-stop, undid and recaptured a source, rendered through its foreground service, published a decodable GPano 4:2:0 JPEG to MediaStore and preserved the final source JPEG bytes.","",
    "Two stale-store tests first failed on the baseline, then passed with directory serialization and persisted revision checks before JPEG writes or undo deletions.","",
    "This is emulator evidence, not physical-device or stock-GCam parity validation. Original sensor EKF, preview tracking/rosette, other capture modes and numerical/pixel parity remain unresolved.",""]
(root/"docs/validation/2026-10-20-android-recovery.md").write_text("\n".join(lines))
print("Recovery and packaged camera UI evidence recorded")
