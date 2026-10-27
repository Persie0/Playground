#!/usr/bin/env python3
"""Render active Arctic Circle scenes and release a chaptered film with external SRT."""
import argparse, subprocess, pathlib, json, sys, hashlib, os
D=[16,18,25,23,26,23,30,24,24,25,23,28,23,42,39]
T=["A Circle Nobody Drew","Just Two Squares","Building the Aztec Diamond","One Shape, Many Possibilities","An Astronomical Number of Arrangements","Four Colors, One Hidden Rule","The Domino-Shuffling Machine","A Fair Coin for Every Choice","Watch the Diamond Grow","Something Is Changing","The Reveal","Not a Coincidence","The Actual Theorem","Why a Circle, Specifically?","The Final Thought"]
NAME="Arctic_Circle_Theorem_Complete_1080p30"
REF={2:"scene1_last_frame.png",3:"scene2_end.png",4:"scene3_end.jpg",5:"scene4_end.png",6:"scene5_end.png",7:"scene6_end.png",8:"scene7_end.png",9:"scene8_end.png",10:"scene9_end.png",11:"scene10_end.png",12:"scene11_end.png",13:"scene12_end.png",14:"scene13_end_decoded.png",15:"scene14_end_decoded.png"}
def run(*a, cwd=None):
 print("RUN", " ".join(map(str,a)),flush=True)
 subprocess.run(list(map(str,a)),cwd=cwd,check=True)
def probe(p):
 return json.loads(subprocess.check_output(["ffprobe","-v","error","-show_streams","-show_format","-of","json",str(p)],text=True))
def verify(path,expected):
 p=pathlib.Path(path)
 assert p.exists() and p.stat().st_size>50000, "missing "+str(p)
 data=probe(p)
 typ={x["codec_type"] for x in data["streams"]}
 assert {"video","audio"}<=typ, "missing AV stream "+str(p)
 duration=float(data["format"]["duration"])
 assert abs(duration-expected)<.65, f"bad length {p} {duration}/{expected}"
 print("VERIFIED",p,duration,p.stat().st_size,flush=True)
def render(root,output,first,last):
 output.mkdir(parents=True,exist_ok=True)
 for n in range(first,last+1):
  folder=root/f"scene{n}";script=folder/f"render_scene{n}.py"; assert script.is_file()
  if n>first:
   ref=folder/REF[n]
   run("ffmpeg","-y","-hide_banner","-loglevel","error","-sseof","-0.012","-i",output/f"scene{n-1:02}.mp4","-map","0:v:0","-frames:v","1","-update","1",ref)
   assert ref.exists()
  dest=output/f"scene{n:02}.mp4"
  args=[sys.executable,script,"--output",dest]
  if n<=12:args+=["--width","1280","--height","720","--fps","30"]
  elif n==13:args+=["--width","1920","--height","1080","--fps","30"]
  else:args+=["--reference",folder/REF[n],"--fps","30"]
  run(*args,cwd=folder)
  verify(dest,D[n-1])
  for pat in ("*.wav","*.mp4"):
   for file in folder.glob(pat):
    if file.resolve()!=dest.resolve():file.unlink()
def chapters(out):
 lines=[";FFMETADATA1","title=How Randomness Creates a Perfect Circle"]
 elapsed=0
 for i,(title,duration) in enumerate(zip(T,D),1):
  lines+=["[CHAPTER]","TIMEBASE=1/1000",f"START={elapsed*1000}",f"END={(elapsed+duration)*1000}",f"title={i:02}. {title}"]
  elapsed+=duration
 out.write_text("\n".join(lines)+"\n");assert elapsed==389
def assemble(root,output,release):
 release.mkdir(parents=True,exist_ok=True)
 normalized=output/"normalized";normalized.mkdir(parents=True,exist_ok=True)
 files=[]
 for i,length in enumerate(D,1):
  raw=output/f"scene{i:02}.mp4";verify(raw,length)
  dest=normalized/f"scene{i:02}.mp4"
  vf=f"scale=1920:1080:flags=lanczos,setsar=1,fps=30,tpad=stop_mode=clone:stop_duration=0.4,trim=end_frame={length*30},setpts=N/(30*TB)"
  af=f"aresample=48000:async=1:first_pts=0,apad,atrim=duration={length},asetpts=PTS-STARTPTS"
  run("ffmpeg","-y","-hide_banner","-loglevel","error","-i",raw,
      "-filter_complex",f"[0:v]{vf}[v];[0:a]{af}[a]","-map","[v]","-map","[a]",
      "-c:v","libx264","-threads","3","-preset","veryfast","-crf","22","-pix_fmt","yuv420p","-r","30",
      "-c:a","aac","-ar","48000","-ac","2","-b:a","160k",dest)
  verify(dest,length);files.append(dest)
 listing=output/"concat.txt"
 listing.write_text("\n".join("file '"+x.resolve().as_posix()+"'" for x in files)+"\n")
 joined=output/"joined.mp4"
 run("ffmpeg","-y","-hide_banner","-loglevel","error","-f","concat","-safe","0","-i",listing,"-c","copy",joined)
 verify(joined,389)
 meta=output/"chapters.ffmeta";chapters(meta)
 film=release/(NAME+".mp4")
 run("ffmpeg","-y","-hide_banner","-loglevel","error","-i",joined,"-i",meta,
     "-map","0:v:0","-map","0:a:0","-map_metadata","1","-map_chapters","1","-c","copy","-movflags","+faststart",film)
 info=probe(film);verify(film,389)
 vid=next(x for x in info["streams"] if x["codec_type"]=="video")
 assert (vid["width"],vid["height"])==(1920,1080)
 ch=json.loads(subprocess.check_output(["ffprobe","-v","error","-show_chapters","-of","json",str(film)],text=True))["chapters"]
 assert len(ch)==15
 original=root/"subtitles"/"scenes_1_2_3_4_5_6_7_8_9_10_11_12_13_14_15.srt"
 assert original.is_file()
 srt=release/(NAME+".srt");srt.write_bytes(original.read_bytes())
 count=sum(line.strip().isdigit() for line in srt.read_text().splitlines())
 assert count==101,count
 checks={f.name:hashlib.sha256(f.read_bytes()).hexdigest() for f in (film,srt)}
 (release/"SHA256SUMS.txt").write_text("\n".join(f"{sha}  {name}" for name,sha in checks.items())+"\n")
 (release/"manifest.json").write_text(json.dumps({"source":"Persie0/manimVideos","scenes":15,"duration_seconds":389,"resolution":"1920x1080","fps":30,"subtitles_burned_in":False,"voiceover":False,"chapters":[{"scene":i,"title":T[i-1],"start_seconds":sum(D[:i-1]),"duration_seconds":D[i-1]} for i in range(1,16)],"checksums":checks},indent=2)+"\n")
 print("VALIDATED COMPLETE 15-SCENE FILM",film,flush=True)
if __name__=="__main__":
 p=argparse.ArgumentParser();p.add_argument("--source",required=True,type=pathlib.Path);p.add_argument("--output-dir",default="output",type=pathlib.Path);p.add_argument("--release-dir",default="release",type=pathlib.Path)
 sub=p.add_subparsers(dest="command",required=True);a=sub.add_parser("render");a.add_argument("first",type=int);a.add_argument("last",type=int);sub.add_parser("assemble")
 z=p.parse_args();root=z.source.resolve();out=z.output_dir.resolve()
 if z.command=="render":assert 1<=z.first<=z.last<=15;render(root,out,z.first,z.last)
 else:assemble(root,out,z.release_dir.resolve())
