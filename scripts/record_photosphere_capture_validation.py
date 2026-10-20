#!/usr/bin/env python3
"""Record check outcomes, not private source, from a completed validation."""
import os,pathlib,subprocess,xml.etree.ElementTree as ET
temp=pathlib.Path(os.environ["RUNNER_TEMP"])
lines=["# Android Photo Sphere capture validation","",
    "Source: "+os.environ["SOURCE_SHA"],
    "Run: https://github.com/Persie0/Playground/actions/runs/"+os.environ["GITHUB_RUN_ID"],"",
    "Compiler: "+subprocess.check_output(["rustc","--version"],text=True).strip(),""]
for label in ["capture-regressions","android-default","android-portable","android-jni"]:
    text=(temp/(label+".log")).read_text(errors="replace")
    tests=[s for s in text.splitlines() if s.startswith("test result:")]
    assert tests and all("FAILED" not in s for s in tests)
    lines += ["## "+label,""]+tests+[""]
for label,pattern in [("Android JVM tests","android/app/build/test-results/testDebugUnitTest/TEST-*.xml"),
                       ("Android emulator tests","android/app/build/outputs/androidTest-results/connected/**/*.xml")]:
    files=list(pathlib.Path(".").glob(pattern))
    assert files,label+" result files missing"
    total=failures=errors=0
    for file in files:
        node=ET.parse(file).getroot()
        if node.tag!="testsuite": continue
        total+=int(node.attrib.get("tests",0))
        failures+=int(node.attrib.get("failures",0)); errors+=int(node.attrib.get("errors",0))
    assert total>0 and failures==0 and errors==0
    lines += [label+": "+str(total)+" passed, no failures/errors.",""]
    print(label+": "+str(total)+" passed")
lines += ["Android lint, arm64/x86_64 release native linking, 16 KB ELF alignment, APK build and Gradle wrapper verification passed.","",
    "The emulator exercised actual JNI session create/add/export/restore/render/undo/free, JPEG/GPano decoding, source preservation, native orientation round-trip, committed-prefix recovery, dimension rejection, path validation and gallery retry receipt reuse.","",
    "This is synthetic/emulator evidence. Physical camera/sensor behavior, original EKF/preview tracking and stock GCam decoded pixels, timing and all capture modes are not verified. See docs/PARITY.md and docs/DEVICE_VALIDATION.md.",""]
path=pathlib.Path("docs/validation/2026-10-20-android-capture.md")
path.parent.mkdir(parents=True,exist_ok=True)
path.write_text("\n".join(lines))
print("Validation evidence recorded")
