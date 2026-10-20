#!/usr/bin/env python3
"""Run private-source checks without writing source snippets to public logs."""
import os
from pathlib import Path
import subprocess
import sys

label, *command = sys.argv[1:]
if not label or not command or not all(ch.isalnum() or ch in "-_" for ch in label):
    raise SystemExit("usage: run_private_rust_check.py LABEL COMMAND ...")
path = Path(os.environ["RUNNER_TEMP"]) / (label + ".log")
with path.open("w") as stream:
    result = subprocess.run(command, stdout=stream, stderr=subprocess.STDOUT)
if result.returncode:
    print(label + " failed; complete diagnostics remain private.")
    raise SystemExit(result.returncode)
print(label + " passed")
for line in path.read_text(errors="replace").splitlines():
    if line.startswith("test result:"):
        print(line)
