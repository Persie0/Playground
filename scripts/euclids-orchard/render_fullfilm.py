#!/usr/bin/env python3
"""Euclid's Orchard: native 1080p source rendering and complete 19:12 silent assembly."""
from __future__ import annotations
import argparse
import importlib
import inspect
import json
import os
from pathlib import Path
import shutil
import subprocess
import sys
import time

WIDTH, HEIGHT, FPS = 1920, 1080, 30
DURATIONS = (20,40,40,46,46,40,35,45,40,38,50,48,42,42,45,50,55,40,30,46,50,60,60,54,50,40)
assert len(DURATIONS) == 26 and sum(DURATIONS) == 1152
FRAME_COUNT = 1152 * FPS

def run(argv, capture=False):
    return subprocess.run(argv, text=True, check=True,
                          stdout=subprocess.PIPE if capture else None,
                          stderr=subprocess.PIPE if capture else None)

def inspect_video(path: Path, frames: int, full_decode=False):
    if not path.is_file() or path.stat().st_size < 10000:
        raise RuntimeError(f"Video missing or unexpectedly small: {path}")
    raw = run(["ffprobe","-v","error","-count_frames","-show_streams",
               "-show_format","-of","json",str(path)],capture=True).stdout
    obj = json.loads(raw)
    video = [s for s in obj["streams"] if s["codec_type"] == "video"]
    if len(video) != 1:
        raise RuntimeError(f"Unexpected video streams in {path}")
    v = video[0]
    if (int(v["width"]),int(v["height"]),v["r_frame_rate"]) != (WIDTH,HEIGHT,"30/1"):
        raise RuntimeError(f"Video dimensions or FPS incorrect: {path} {v}")
    if int(v["nb_read_frames"]) != frames:
        raise RuntimeError(f"Wrong frame count: {path}: {v['nb_read_frames']} != {frames}")
    if abs(float(obj["format"]["duration"]) - frames/FPS) > 0.045:
        raise RuntimeError(f"Wrong duration: {path}: {obj['format']['duration']}")
    if full_decode:
        run(["ffmpeg","-nostdin","-hide_banner","-loglevel","error","-xerror",
             "-i",str(path),"-map","0:v:0","-f","null","-"])
    print(f"PASS {path}: {frames} frames, {frames/FPS:.3f}s, {path.stat().st_size:,} bytes",flush=True)
    return obj

def load_scene(source: Path, scene: int):
    script = (source / f"scene{scene}" / f"render_scene{scene}.py").resolve()
    if not script.is_file():
        raise RuntimeError(f"Missing authentic Scene {scene} source: {script}")
    # Source modules import their preceding scene by bare module name.
    for n in range(1,27):
        directory = str((source / f"scene{n}").resolve())
        if directory not in sys.path:
            sys.path.insert(0,directory)
    mod = importlib.import_module(f"render_scene{scene}")
    if Path(mod.__file__).resolve() != script:
        raise RuntimeError(f"Unexpected Scene {scene} source: {mod.__file__}")
    if float(mod.DURATION) != DURATIONS[scene-1]:
        raise RuntimeError(f"Scene {scene} duration mismatch")
    candidates = [c for c in vars(mod).values()
                  if inspect.isclass(c) and c.__module__ == mod.__name__
                  and c.__name__.endswith("Renderer") and callable(getattr(c,"frame",None))]
    if len(candidates) != 1:
        raise RuntimeError(f"Scene {scene}: expected one primary renderer; found {candidates}")
    return candidates[0](width=WIDTH,height=HEIGHT)

def render(source: Path, scene: int, output: Path):
    if not 1 <= scene <= 26:
        raise ValueError("Scene must be 1..26")
    output.parent.mkdir(parents=True,exist_ok=True)
    # NumPy is only needed when producing source-rendered frames.
    # The artifact-only assembly job intentionally has no graphics dependencies.
    import numpy as np
    renderer = load_scene(source,scene)
    count = DURATIONS[scene-1]*FPS
    first = renderer.frame(0)
    if not isinstance(first,np.ndarray) or first.shape != (HEIGHT,WIDTH,3) or first.dtype != np.uint8:
        raise RuntimeError(f"Scene {scene} first frame is not 1080p BGR uint8")
    if float(first.std()) < 2.0:
        raise RuntimeError(f"Scene {scene} first frame is nearly blank")
    command = ["ffmpeg","-nostdin","-hide_banner","-loglevel","error","-y",
               "-f","rawvideo","-pix_fmt","bgr24","-s",f"{WIDTH}x{HEIGHT}",
               "-r",str(FPS),"-i","-","-an","-map","0:v:0","-c:v","libx264",
               "-preset","veryfast","-crf","19","-profile:v","high","-level:v","4.2",
               "-pix_fmt","yuv420p","-r",str(FPS),"-video_track_timescale","30000",
               "-movflags","+faststart",str(output)]
    process = subprocess.Popen(command,stdin=subprocess.PIPE)
    start = time.monotonic()
    print(f"Rendering native Scene {scene}: {count} frames",flush=True)
    try:
        assert process.stdin is not None
        for i in range(count):
            frame = first if i == 0 else renderer.frame(i/FPS)
            if (not isinstance(frame,np.ndarray) or frame.shape != (HEIGHT,WIDTH,3)
                    or frame.dtype != np.uint8):
                raise RuntimeError(f"Scene {scene} invalid frame {i}")
            process.stdin.write(frame.tobytes())
            if (i+1)%300 == 0 or i+1 == count:
                print(f"Scene {scene}: {i+1}/{count}, {time.monotonic()-start:.1f}s",flush=True)
    except BaseException:
        process.kill()
        process.wait()
        raise
    finally:
        if process.stdin:
            try:
                process.stdin.close()
            except BrokenPipeError:
                pass
    if process.wait():
        raise RuntimeError(f"FFmpeg encode failed for Scene {scene}")
    inspect_video(output,count,full_decode=True)

def assemble(parts: Path, output: Path):
    paths = [parts/f"scene-{n:02d}.mp4" for n in range(1,27)]
    for n,p in enumerate(paths,start=1):
        inspect_video(p,DURATIONS[n-1]*FPS)
    output.parent.mkdir(parents=True,exist_ok=True)
    concat = output.parent/"euclids-orchard-concat.txt"
    if any("'" in str(p.resolve()) for p in paths):
        raise RuntimeError("Unsupported apostrophe in output path")
    concat.write_text("".join(f"file '{p.resolve()}'\n" for p in paths),encoding="utf-8")
    cmd = ["ffmpeg","-nostdin","-hide_banner","-loglevel","warning","-y",
           "-f","concat","-safe","0","-i",str(concat),
           "-map","0:v:0","-an","-c:v","copy","-movflags","+faststart",str(output)]
    process = subprocess.run(cmd,text=True,capture_output=True)
    bad_timestamps = any(x in process.stderr.lower() for x in
                         ["non-monoton","invalid dts","invalid pts"])
    if process.returncode or bad_timestamps:
        print("Uniformly re-encoding concatenated scenes to fix DTS/PTS",flush=True)
        print(process.stderr[-2500:],flush=True)
        cmd = ["ffmpeg","-nostdin","-hide_banner","-loglevel","warning","-y",
               "-f","concat","-safe","0","-i",str(concat),
               "-map","0:v:0","-an","-c:v","libx264","-preset","veryfast",
               "-crf","19","-profile:v","high","-level:v","4.2",
               "-pix_fmt","yuv420p","-r",str(FPS),
               "-video_track_timescale","30000","-movflags","+faststart",str(output)]
        run(cmd)
    else:
        print("All 26 uniformly encoded source segments merged without DTS warnings.",flush=True)
    info = inspect_video(output,FRAME_COUNT,full_decode=True)
    if any(s["codec_type"] == "audio" for s in info["streams"]):
        raise RuntimeError("Unexpected audio track in silent export")
    sha = os.environ.get("EUCLIDS_SOURCE_SHA","unknown")
    (output.parent/"RENDER_INFO.txt").write_text(
        "EUCLID'S ORCHARD: ORIGINAL COMPLETE 26-SCENE 1080p FILM - SILENT\n"
        f"Private source commit: {sha}\n"
        "Source: Persie0/manimVideos, feature/scene26 (not run in private Actions)\n"
        "Workflow: public Persie0/Playground GitHub Actions\n"
        f"Resolution: {WIDTH}x{HEIGHT}\nFrame rate: {FPS}\n"
        f"Frames: {FRAME_COUNT}\nDuration: 1152 seconds (19:12)\n"
        "All 26 scenes source-rendered at native 1080p, including Scene 1.\n"
        "NO AUDIO: Voiceover, soundtrack, external SRT and final mastering are outstanding.\n"
        "Historical unit suite and all exact source continuity seams need separate verification.\n",
        encoding="utf-8")
    print("PASS: complete 19:12 native 1080p silent visual film fully decoded.",flush=True)

def main():
    parser = argparse.ArgumentParser(description=__doc__)
    commands = parser.add_subparsers(dest="command",required=True)
    r = commands.add_parser("render")
    r.add_argument("--source-root",type=Path,required=True)
    r.add_argument("--scene",type=int,required=True)
    r.add_argument("--output",type=Path,required=True)
    a = commands.add_parser("assemble")
    a.add_argument("--parts-dir",type=Path,required=True)
    a.add_argument("--output",type=Path,required=True)
    args = parser.parse_args()
    if args.command == "render":
        render(args.source_root.resolve(),args.scene,args.output)
    else:
        assemble(args.parts_dir,args.output)

if __name__ == "__main__":
    main()
