#!/usr/bin/env python3
import json,os,pathlib,xml.etree.ElementTree as ET
root=pathlib.Path("engine")
summary=json.loads((root/"docs/validation/android-camera-ui.json").read_text())
for key in ["camera_ui_capture","process_death_recovery","undo_and_recapture","foreground_render","native_session_reused","notification_measured_progress","coverage_guidance","edge_guidance_accessible","gallery_publication","original_source_hashes_unchanged"]:
    assert summary[key] is True,key
def count(folder):
    paths=list(folder.rglob("TEST-*.xml"))
    assert paths,folder
    cases=[t for path in paths for t in ET.parse(path).getroot().iter("testcase")]
    assert cases and all(t.find("failure") is None and t.find("error") is None for t in cases)
    return len(cases)
unit=count(root/"android/app/build/test-results")
native=count(root/"android/app/build/outputs/androidTest-results")
assert unit>=18 and native>=14,(unit,native)
run=os.environ["GITHUB_RUN_ID"];sha=os.environ["SOURCE_SHA"]
text=f"""# Coverage, guidance and stitching progress validation

Source: `{sha}`
Run: https://github.com/Persie0/Playground/actions/runs/{run}

- {unit} JVM geometry/progress tests; Android lint/build passed.
- Rust focused geometry/calibration/progress/JPEG regressions passed.
- arm64-v8a and x86_64 JNI release libraries built; 16 KB ELF LOAD alignment passed.
- {native} emulator instrumentation tests passed, including raw-frame portrait coverage with the accepted hit-angle margin, persistent offscreen guidance, calibrated session rendering and single-owner session transfer.
- Actual packaged camera UI captured, recovered after force-stop, undid and recaptured, and saved a GPano 4:2:0 JPEG at {summary["decoded_dimensions"]}.
- Measured blending percentages appeared in the foreground notification. Save reused the live native session rather than restoring alignment.
- Original source JPEG hashes were unchanged; gallery publication succeeded.

Camera UI fixture uses {summary["source_count"]} emulator frame(s); this is not stock-GCam image/timing parity or a physical-device panorama test. Full sphere geometry is exercised separately by ray-coverage checks. Benchmarks and the full local Rust feature-matrix results are documented in the continuation report.
"""
(root/"docs/validation/2026-10-20-guidance-progress.md").write_text(text)
print(f"Verified {unit} JVM + {native} native Android tests and actual camera/notification flow")
