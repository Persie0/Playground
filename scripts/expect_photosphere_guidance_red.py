#!/usr/bin/env python3
import os,pathlib,subprocess,xml.etree.ElementTree as ET
root=pathlib.Path("engine/android")
log=pathlib.Path(os.environ["RUNNER_TEMP"])/"guidance-red.log"
with log.open("w") as stream:
    result=subprocess.run(["gradle","--no-daemon",":app:connectedDebugAndroidTest","-Pandroid.testInstrumentationRunnerArguments.class=at.persie0.photosphere.GuidanceOverlayTest"],cwd=root,stdout=stream,stderr=subprocess.STDOUT)
tests=[]
for path in (root/"app/build/outputs/androidTest-results").rglob("TEST-*.xml"):
    tests.extend(ET.parse(path).getroot().iter("testcase"))
failed=[t for t in tests if t.find("failure") is not None]
assert result.returncode!=0,"Baseline unexpectedly passed"
assert len(tests)==1 and len(failed)==1,"Expected precisely the selected regression test"
assert failed[0].get("name")=="behindCameraActiveTargetIsExposedAsNextScanHint"
assert "Expected a screen-reader hint" in ET.tostring(failed[0],encoding="unicode")
print("Confirmed RED: offscreen target has no next-scan hint on the baseline")
