#!/usr/bin/env python3
"""Retain private implementation diagnostics without public source artifacts."""
import os, pathlib, re, subprocess, sys
root = pathlib.Path(sys.argv[1]).resolve()
label = sys.argv[2]
assert re.fullmatch(r"[a-z0-9-]+",label)
run = os.environ["GITHUB_RUN_ID"]
assert run.isdigit()
dest = root / "docs/validation/runs" / run
dest.mkdir(parents=True,exist_ok=True)
for path in pathlib.Path(os.environ["RUNNER_TEMP"]).glob("*.log"):
    (dest / (path.stem+".txt")).write_text("\n".join(path.read_text(errors="replace").splitlines()[-1500:])+"\n")
screens=root/"docs/validation/android-screens"
if screens.is_dir():
    for path in screens.glob("*.png"):
        out=dest/"screens"/path.name
        out.parent.mkdir(parents=True,exist_ok=True)
        out.write_bytes(path.read_bytes())
for name in ["lint-results-debug.xml"]:
    path=root/"android/app/build/reports"/name
    if path.exists(): (dest/name).write_bytes(path.read_bytes())
subprocess.run(["gh","auth","setup-git"],check=True,stdout=subprocess.DEVNULL)
subprocess.run(["git","config","user.name","github-actions[bot]"],cwd=root,check=True)
subprocess.run(["git","config","user.email","41898282+github-actions[bot]@users.noreply.github.com"],cwd=root,check=True)
subprocess.run(["git","add",str(dest)],cwd=root,check=True)
if subprocess.run(["git","diff","--cached","--quiet"],cwd=root).returncode:
    subprocess.run(["git","commit","-qm","ci: preserve private "+label+" diagnostics"],cwd=root,check=True)
    branch="ci/"+label+"-"+run
    subprocess.run(["git","push","--quiet","origin","HEAD:refs/heads/"+branch],cwd=root,check=True)
    print("Private diagnostics: PhotosphereCleanroom branch "+branch)
