#!/usr/bin/env python3
import json,os,pathlib,xml.etree.ElementTree as ET

root=pathlib.Path("engine")
summary=json.loads((root/"docs/validation/android-camera-ui.json").read_text())
for key in ["camera_ui_capture","process_death_recovery","undo_and_recapture","foreground_render","native_session_reused","notification_measured_progress","coverage_guidance","edge_guidance_accessible","gallery_publication","original_source_hashes_unchanged"]:
    assert summary[key] is True,key

def cases(folder):
    paths=list(folder.rglob("TEST-*.xml"))
    assert paths,folder
    result=[t for path in paths for t in ET.parse(path).getroot().iter("testcase")]
    assert result and all(t.find("failure") is None and t.find("error") is None and t.find("skipped") is None for t in result)
    return result

unit=cases(root/"android/app/build/test-results")
native=cases(root/"android/app/build/outputs/androidTest-results")
assert len(unit)>=40 and len(native)>=15,(len(unit),len(native))
for name,count in [("OrientationFilterTest",14),("SensorPoseEstimatorTest",6)]:
    assert sum(t.attrib.get("classname","").endswith(name) for t in unit)>=count,name
assert any(t.attrib.get("classname","").endswith("SensorPoseTest") and t.attrib.get("name","").startswith("sensorRestartProducesFreshProperCameraFrames") for t in native)
run=os.environ["GITHUB_RUN_ID"];sha=os.environ["SOURCE_SHA"]
text=f"""# Gravity/gyro orientation and complete capture validation

Source: `{sha}`
Run: https://github.com/Persie0/Playground/actions/runs/{run}

- {len(unit)} JVM tests passed, including 14 attitude-filter checks and 6 startup, magnetic-jump, stale-data and recovery checks. Android lint and APK build passed.
- {len(native)} emulator instrumentation tests passed, including stopping/restarting the sensor worker, native session ownership, portrait coverage and persistent edge guidance.
- Rust source is unchanged from the earlier verified JNI build; the workflow compared native source paths before reusing the arm64/x86_64 libraries. 16 KB ELF LOAD alignment passed.
- Actual packaged camera UI captured {summary["source_count"]} images, recovered after force-stop, undid and recaptured, rendered with the retained native session, and published a GPano 4:2:0 JPEG at {summary["decoded_dimensions"]}.
- Real blending percentages appeared in the foreground notification. Source JPEG hashes remained unchanged.

The Android host now runs an independently implemented gravity/gyro multiplicative filter on a sensor worker. Its startup heading is seeded once from a reliable Android reference to preserve the ENU anchor used by persistent captures; subsequent rotation-vector updates are disconnected. The original native gyro-bias calibration and visual tracker remain unresolved. Mathematical checks and emulator images do not prove physical-device drift, stock sensor traces, pixel equality or full 1:1 GCam parity. See ../ORIENTATION_FILTER.md and ../PARITY.md.
"""
(root/"docs/validation/2026-10-21-orientation.md").write_text(text)
print(f"Verified {len(unit)} JVM + {len(native)} Android tests; sensor restart and packaged camera/notification flow passed")
