"""Create neural-voice audio, timings, YouTube subtitles and script."""
from pathlib import Path
import asyncio, json, re, subprocess, math, sys
import edge_tts
ROOT=Path(__file__).parent
SRC=json.loads((ROOT/'script.json').read_text())
OUT=ROOT/'audio';OUT.mkdir(parents=True,exist_ok=True)
def probe(path):
 return float(subprocess.check_output(['ffprobe','-v','error','-show_entries','format=duration','-of','default=noprint_wrappers=1:nokey=1',str(path)]).decode().strip())
def srt_time(t):
 n=round(t*1000);h,n=divmod(n,3600000);m,n=divmod(n,60000);s,n=divmod(n,1000)
 return f'{h:02}:{m:02}:{s:02},{n:03}'
async def speak(index,text):
 output=OUT/f'{index:03}.mp3'
 for k,voice in enumerate(('en-US-AndrewNeural','en-US-GuyNeural','en-US-AriaNeural')):
  try:
   await edge_tts.Communicate(text,voice=voice,rate='-4%').save(str(output))
   if output.stat().st_size<3000: raise RuntimeError('No generated speech')
   return
  except Exception as ex:
   print('TTS RETRY',index,voice,ex,flush=True)
   await asyncio.sleep(2+k)
 raise RuntimeError(f'No neural TTS voice succeeded for scene {index}')
async def main():
 time=0;timeline=[];captions=[];sid=0
 for i,s in enumerate(SRC):
  await speak(i,s['narration'])
  wav=OUT/f'{i:03}.wav'
  subprocess.run(['ffmpeg','-hide_banner','-loglevel','error','-y','-i',str(OUT/f'{i:03}.mp3'),'-ar','48000','-ac','1',str(wav)],check=True)
  voice_time=probe(wav)
  # Reserve enough time for every animation, even if TTS reads quickly.
  kind=s['kind']
  floor={'example':15,'cycle':13,'matrices':12,'comparison':11,'safety':11,
         'request':11,'vector':10,'sequence':11,'intro':9}.get(kind,10)
  duration=max(voice_time+1.15,floor)
  item={**s,'duration':duration,'audio_duration':voice_time,'start':time,'end':time+duration}
  timeline.append(item)
  chunks=[x.strip() for x in re.split(r'(?<=[.!?])\s+',s['narration']) if x.strip()]
  total=sum(len(x) for x in chunks);cur=0
  for part in chunks:
   a=time+voice_time*cur/total;cur+=len(part)
   b=time+voice_time*cur/total
   sid+=1;captions.append(f'{sid}\n{srt_time(a)} --> {srt_time(b)}\n{part}\n')
  time+=duration
  print(f'SCENE {i+1}/{len(SRC)}: {voice_time:.1f}s voice, {duration:.1f}s video; total {time/60:.1f} min',flush=True)
 (ROOT/'timing.json').write_text(json.dumps(timeline,indent=2))
 (ROOT/'subtitles.srt').write_text('\n'.join(captions))
 (ROOT/'narration.txt').write_text('\n\n'.join(x['title']+'\n'+x['narration'] for x in SRC))
 print('VIDEO DURATION',time,flush=True)
if __name__=='__main__':asyncio.run(main())
