#!/usr/bin/env python3
"""Retry repository lookup failures; never retry compilation or test failures."""
import os,pathlib,subprocess,sys,time
label,*command=sys.argv[1:]
helper=pathlib.Path(__file__).with_name("run_private_rust_check.py")
for attempt in range(1,4):
    result=subprocess.run([sys.executable,str(helper),label,*command])
    if result.returncode==0: sys.exit(0)
    log=pathlib.Path(os.environ["RUNNER_TEMP"])/(label+".log")
    text=log.read_text(errors="replace") if log.exists() else ""
    resolution=("Could not find " in text or "Could not GET " in text or "Could not resolve " in text)
    if not resolution or attempt==3: sys.exit(result.returncode)
    (log.with_name(label+"-dependency-attempt-"+str(attempt)+".log")).write_text(text)
    print("Dependency lookup failed; retrying with refreshed metadata",flush=True)
    if "--refresh-dependencies" not in command: command.append("--refresh-dependencies")
    time.sleep(5)
