#!/usr/bin/env python3
"""Verify and retain only privately stored implementation evidence."""
import json, os, pathlib, re, xml.etree.ElementTree as ET

root = pathlib.Path("engine")
temp = pathlib.Path(os.environ["RUNNER_TEMP"])
summary = json.loads((root / "docs/validation/android-camera-ui.json").read_text())
for key in ["camera_ui_capture", "process_death_recovery", "undo_and_recapture", "foreground_render",
            "native_session_reused", "notification_measured_progress", "notification_measured_seam_progress",
            "notification_terminal_cleanup", "coverage_guidance",
            "edge_guidance_accessible", "gallery_publication", "original_source_hashes_unchanged"]:
    assert summary[key] is True, key

def cases(folder):
    files = list(folder.rglob("TEST-*.xml"))
    assert files, folder
    tests = [t for p in files for t in ET.parse(p).getroot().iter("testcase")]
    assert tests and all(t.find("failure") is None and t.find("error") is None and t.find("skipped") is None for t in tests)
    return tests

unit = cases(root / "android/app/build/test-results")
native = cases(root / "android/app/build/outputs/androidTest-results")
assert len(unit) >= 50 and len(native) >= 25, (len(unit), len(native))
names = {t.attrib.get("name", "") for t in native}
assert "pitchedLayoutSurvivesRecoveryAndRejectsTamperedPitchOrAxis" in names
assert "legacyVersionOneCaptureKeepsDisplayBasedZeroPitchLayout" in names
assert "highPitchLayoutsKeepInitialTargetAndRecover" in names
assert "frontCenterTargetShowsPersistentCornerCue" in names
assert "rtlNarrowLargeFontBadgeKeepsArrowClearOfText" in names
assert "halfFadedNormalDotKeepsSelectedRingAndCornerCueOpaque" in names
assert "changingStatusTextKeepsCameraPreviewBoundsStable" in names
assert "completedRenderRemovesForegroundNotificationAndPostsTerminalResult" in names
unit_names = {t.attrib.get("name", "") for t in unit}
assert "normalTargetAlphaUsesAngularFadeAndIgnoresRayScale" in unit_names
assert "normalTargetAlphaReturnsZeroForInvalidRays" in unit_names
assert "orientationOffsetUsesPlannedAxisUntilFirstSourceThenKeepsFirstSourceAxis" in unit_names
assert "firstShutterLocksOnlyControlsReportedSupported" in unit_names
assert "onlySupportedControlIsRequested" in unit_names
assert "unsupportedLocksStayAutomaticAndNextCameraInstanceCanDecideAgain" in unit_names
rust = {}
for mode in ["default", "portable", "jni"]:
    log = (temp / ("parity-" + mode + ".log")).read_text()
    results = re.findall(r"test result: ok\. (\d+) passed; (\d+) failed; (\d+) ignored", log)
    assert results and all(int(failed) == 0 and int(ignored) == 0 for _, failed, ignored in results), mode
    rust[mode] = sum(int(passed) for passed, _, _ in results)
    assert len(results) >= 14, (mode, len(results))
    assert rust[mode] == {"default": 271, "portable": 265, "jni": 271}[mode], (mode, rust[mode])
    for regression in ["low_resolution_seam_labels_do_not_create_holes_in_fully_covered_sphere",
                       "seam_progress_counts_source_passes_and_finishes_after_map_construction"]:
        assert re.search(r"test "+regression+r" \.\.\. ok", log), (mode, regression)

run, sha = os.environ["GITHUB_RUN_ID"], os.environ["SOURCE_SHA"]
rust_run = os.environ.get("RUST_VALIDATION_RUN", run)
report = f"""# Capture quality and native contract validation

Source: `{sha}`
Run: https://github.com/Persie0/Playground/actions/runs/{run}

- Rust regressions passed: {rust['default']} default, {rust['portable']} portable and {rust['jni']} JNI-host tests in https://github.com/Persie0/Playground/actions/runs/{rust_run}. Their source pin and successful steps were verified before reusing evidence. Both release Android ABIs were rebuilt from this source with 16 KB ELF alignment.
- {len(unit)} JVM tests and {len(native)} emulator instrumentation tests passed; Android lint and APK packaging passed.
- V2 start-pitch/axis geometry through +/-90 degrees, retained first-pose roll policy, recovery, tamper rejection and legacy target IDs were checked. Normal scan-dot angular fading, a full-opacity selected ring/corner cue, a separate off-image chevron and narrow large-font RTL rendering were checked.
- Stable camera-preview bounds under changing status/count text, measured seam source-pass counts, terminal service notification removal, gallery access, planned-axis gating and supported first-shutter AE/AWB lock decisions were checked.
- Multiband seam masks no longer discard geometrically covered pixels in the bounded one-source-group regression. The fallback is selected only when base-band weight is at or below the hole threshold. First-shutter metering locks are a capture-quality improvement, with driver support/failure fallback; physical camera convergence is not established by an emulator.
- Source-independent multiband mask reuse and isolated Q22 RGB/YCbCr and residual helpers passed their regression checks. These numerical helpers remain outside the production RGB renderer. Optional GPano fields, Java integer overflow/omission, legacy configs, raw metadata import and JPEG EXIF/pixel preservation were checked.
- The packaged Camera1 UI captured {summary['source_count']} photos, recovered after force-stop, undid/recaptured, rendered with the retained native session, showed measured seam and blending notification progress, removed foreground notification42 and posted ordinary result43, and published a GPano 4:2:0 JPEG at {summary['decoded_dimensions']}.
- Source JPEG hashes remained unchanged. Private screenshots and logs are retained with this evidence.

The original native pose mailbox copies the supplied sensor rotation; a preview visual correction entering that mailbox was not found. The recovered55/65/45 JPEG camera sweep belongs to the exported CalibrateFieldOfViewDeg path, not ordinary capture FOV. A reader of photoSphereCalibratedFieldOfView into ordinary Reset was not found. These findings correct earlier assumptions; they do not establish original-device drift, stock pixels, timing, UI equality or complete1:1 parity. Source photos/session metadata for the supplied panorama were unavailable, so reproductions establish specific causes rather than every defect in that image. See ../START_POSE_AND_METADATA.md, ../ORIENTATION_FILTER.md and ../PARITY.md.
"""
(root / "docs/validation/2026-10-22-capture-quality.md").write_text(report)
(root / "docs/validation/start-pose-summary.json").write_text(json.dumps({"source_sha": sha, "run_id": run, "rust_validation_run_id": rust_run,
    "rust": rust, "jvm_tests": len(unit), "instrumentation_tests": len(native), "camera": summary}, indent=2) + "\n")
print(f"Verified Rust {rust}, {len(unit)} JVM and {len(native)} Android checks; full packaged capture flow passed")
