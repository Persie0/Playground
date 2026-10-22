#!/usr/bin/env python3
"""Verify and retain fresh, same-run private 0.8.0 validation evidence."""
import json
import os
import pathlib
import re
import shutil
import subprocess
import xml.etree.ElementTree as ET

root = pathlib.Path("engine")
temp = pathlib.Path(os.environ["RUNNER_TEMP"])
run, sha = os.environ["GITHUB_RUN_ID"], os.environ["SOURCE_SHA"]
summary_path = root / "docs/validation/android-camera-ui.json"
summary = json.loads(summary_path.read_text())
for key in [
    "camera_ui_capture", "process_death_recovery", "undo_and_recapture",
    "foreground_render", "native_session_reused", "notification_measured_progress",
    "notification_measured_seam_progress", "notification_terminal_cleanup",
    "coverage_guidance", "edge_guidance_accessible", "gallery_publication",
    "original_source_hashes_unchanged",
]:
    assert summary[key] is True, key
assert summary["source_count"] == 2, summary.get("source_count")


def cases(folder):
    files = list(folder.rglob("TEST-*.xml"))
    assert files, folder
    tests = [t for p in files for t in ET.parse(p).getroot().iter("testcase")]
    assert tests and all(
        t.find("failure") is None and t.find("error") is None and t.find("skipped") is None
        for t in tests
    )
    return tests


unit = cases(root / "android/app/build/test-results")
native = cases(root / "android/app/build/outputs/androidTest-results")
assert len(unit) == 58, len(unit)
assert len(native) == 25, len(native)
native_names = {t.attrib.get("name", "") for t in native}
for required in [
    "pitchedLayoutSurvivesRecoveryAndRejectsTamperedPitchOrAxis",
    "legacyVersionOneCaptureKeepsDisplayBasedZeroPitchLayout",
    "highPitchLayoutsKeepInitialTargetAndRecover",
    "frontCenterTargetShowsPersistentCornerCue",
    "rtlNarrowLargeFontBadgeKeepsArrowClearOfText",
    "halfFadedNormalDotKeepsSelectedRingAndCornerCueOpaque",
    "changingStatusTextKeepsCameraPreviewBoundsStable",
    "completedRenderRemovesForegroundNotificationAndPostsTerminalResult",
]:
    assert required in native_names, required
unit_names = {t.attrib.get("name", "") for t in unit}
for required in [
    "normalTargetAlphaUsesAngularFadeAndIgnoresRayScale",
    "normalTargetAlphaReturnsZeroForInvalidRays",
    "orientationOffsetUsesImmutablePlannedAxisAndFallsBackOnlyWhenAbsent",
    "versionTwoOrientationOffsetStaysOwnedByTheImmutablePlanAfterFirstSource",
    "actualFirstSourceQuarterTurnWitnessIsRejectedAgainstTheBeginPlan",
    "recoveredRollClassesIncludeBothTwentyDegreeBoundaries",
    "nonpolarCapturesRejectTwentyOneFortyFiveAndNinetyDegreeRollsAtEitherPitchSign",
    "portraitAndLandscapePlansEachOwnTheirRollClass",
    "onlyExplicitPolarHitsAreExemptFromRollPolicy",
    "allRecordedAcceptedPoseWitnessesAreCheckedAgainstThePlannedAxis",
    "versionOneAndNonCoverageSessionsKeepTheExistingPolicy",
    "firstShutterLocksOnlyControlsReportedSupported",
    "onlySupportedControlIsRequested",
    "unsupportedLocksStayAutomaticAndNextCameraInstanceCanDecideAgain",
]:
    assert required in unit_names, required

expected = {"default": 277, "portable": 271, "jni": 277}
rust = {}
rust_logs = {}
regressions = [
    "crop_coverage_tracks_actual_uniform_jpeg_for_ordinary_and_wrapping_crops",
    "cropped_report_counts_only_pixels_written_inside_the_crop",
    "cropped_render_reserves_only_tile_aligned_crop_workspace",
    "source_reducer_matches_direct_native_oracle_fixtures",
    "source_reducer_rejects_invalid_layouts_atomically",
    "partial_panorama_is_cropped_and_gpano_keeps_virtual_sphere_geometry",
    "low_resolution_seam_labels_do_not_create_holes_in_fully_covered_sphere",
    "seam_progress_counts_source_passes_and_finishes_after_map_construction",
    "gamma_adjusts_each_sources_own_brightness_in_either_order",
]
for mode in ["default", "portable", "jni"]:
    label = "parity-rust-" + mode
    log_path = temp / (label + ".log")
    log = log_path.read_text(errors="replace")
    results = re.findall(r"test result: ok\. (\d+) passed; (\d+) failed; (\d+) ignored", log)
    assert results and all(int(failed) == 0 and int(ignored) == 0 for _, failed, ignored in results), mode
    rust[mode] = sum(int(passed) for passed, _, _ in results)
    assert len(results) >= 17, (mode, len(results))
    assert rust[mode] == expected[mode], (mode, rust[mode])
    for regression in regressions:
        pattern = r"(?m)^test (?:[A-Za-z0-9_]+::)*" + re.escape(regression) + r" \.\.\. ok$"
        assert re.search(pattern, log), (mode, regression)
    rust_logs[mode] = log_path

# Preserve wrapper output privately beside the report. The wrapper itself emits
# only pass/fail and Cargo summaries to the Actions log; raw test diagnostics stay
# in RUNNER_TEMP until copied into the private source checkout here.
private_log_dir = root / "docs/validation/private-rust-logs" / str(run)
private_log_dir.mkdir(parents=True, exist_ok=True)
for mode, source in rust_logs.items():
    retained = private_log_dir / (source.stem + ".txt")
    shutil.copyfile(source, retained)
    relative = retained.relative_to(root)
    ignored = subprocess.run(
        ["git", "check-ignore", "-q", "--", str(relative)],
        cwd=root,
        check=False,
    )
    assert ignored.returncode == 1, (relative, ignored.returncode)

report = f"""# Photo Sphere 0.8.0 coverage and camera validation

Source: `{sha}`  
Workflow run: https://github.com/Persie0/Playground/actions/runs/{run}

- Fresh Rust checks from this workflow run passed: {rust['default']} default, {rust['portable']} portable, and {rust['jni']} JNI-host tests. Each mode reported at least 17 successful test suites. No earlier run was reused. Raw wrapper logs are stored privately as `.txt` files in `private-rust-logs/{run}/`.
- Crop regressions check ordinary and longitude-wrapping coverage, pixels counted inside the output crop, tile-aligned crop workspace, and public partial-panorama GPano geometry. The two source-reducer regressions cover native-oracle agreement and atomic rejection of invalid layouts. Existing low-resolution seam-hole, source-pass progress, and per-source gamma regressions remain required.
- {len(unit)} JVM tests, {len(native)} emulator instrumentation tests, Android lint, APK packaging, and both release JNI builds passed. Both Android ABIs passed the 16 KB ELF alignment check.
- The packaged Camera1 UI smoke test captured {summary['source_count']} camera sources, recovered after force-stop, undid and recaptured, rendered with the retained native session, displayed measured progress, cleaned up its terminal notification, and published a GPano JPEG with decoded dimensions {summary['decoded_dimensions']}.
- Coverage orientation policy tests checked the recorded accepted-pose witnesses, rejection of a first-source quarter-turn against the immutable Begin plan, portrait/landscape roll classes, both twenty-degree boundaries, explicit polar exemptions, and unchanged v1/non-coverage policy. The renamed immutable-plan regression is `versionTwoOrientationOffsetStaysOwnedByTheImmutablePlanAfterFirstSource`. Existing first-shutter AE/AWB support/fallback policy tests remain required.
- UI assertions verified accessible edge guidance, persistent corner guidance, narrow RTL large-font rendering, stable camera-preview bounds, process-death recovery, and terminal notification removal. Source JPEG hashes remained unchanged.
- Diagnostics and raw Rust logs are retained only in the private source checkout. This workflow uploads no public artifacts.

The UI/emulator camera checks establish the packaged flow on the emulator; they do not establish physical-camera convergence or stock-device pixel parity.
"""
(root / "docs/validation/2026-10-22-coverage-workspace.md").write_text(report)
(root / "docs/validation/coverage-workspace-summary.json").write_text(json.dumps({
    "source_sha": sha,
    "run_id": run,
    "rust_evidence_run_id": run,
    "rust_checks_fresh_same_run": True,
    "rust": rust,
    "rust_suite_counts": {mode: len(re.findall(
        r"test result: ok\. (\d+) passed; (\d+) failed; (\d+) ignored",
        (temp / ("parity-rust-" + mode + ".log")).read_text(errors="replace"),
    )) for mode in expected},
    "jvm_tests": len(unit),
    "instrumentation_tests": len(native),
    "camera": summary,
}, indent=2) + "\n")
print(f"Verified fresh Rust {rust}, {len(unit)} JVM and {len(native)} emulator checks; 2-camera packaged flow passed")
