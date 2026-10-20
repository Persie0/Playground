#!/usr/bin/env python3
"""Run a private Gradle check from the Android project, independent of shell state."""
import pathlib,subprocess,sys
here=pathlib.Path(__file__).resolve()
label,*arguments=sys.argv[1:]
raise SystemExit(subprocess.run([sys.executable,str(here.with_name("run_private_rust_check.py")),label,
    "gradle","--no-daemon",*arguments],cwd=here.parents[2]/"engine/android").returncode)
