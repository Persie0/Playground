#!/usr/bin/env python3
"""Require real Android assertion failures for the stale-store baseline."""
import os,pathlib,subprocess,xml.etree.ElementTree as ET
tests=["staleStoreCannotOverwriteCommittedSource","staleUndoCannotDeleteNewlyCommittedPrefix"]
selection=",".join("at.persie0.photosphere.NativeCaptureFlowTest#"+test for test in tests)
command=["gradle","--no-daemon",":app:connectedDebugAndroidTest","-Pandroid.testInstrumentationRunnerArguments.class="+selection]
p=subprocess.run(command,stdout=subprocess.PIPE,stderr=subprocess.STDOUT,text=True)
(pathlib.Path(os.environ["RUNNER_TEMP"])/"android-recovery-red.log").write_text(p.stdout)
assert p.returncode!=0,"Stale-store baseline unexpectedly passed"
failed=set()
for file in pathlib.Path("app/build/outputs/androidTest-results/connected").glob("**/*.xml"):
    root=ET.parse(file).getroot()
    for case in root.iter("testcase"):
        if case.find("failure") is not None or case.find("error") is not None:
            failed.add(case.attrib["name"])
assert set(tests)<=failed,"Expected stale-store assertion failures were not observed; inspect private diagnostics"
print("Recovery RED confirmed: stale save and stale undo both fail on baseline")
