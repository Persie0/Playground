#!/usr/bin/env python3
"""Validate and assemble native 1080p original-source actor-rendered Arctic Circle film.

The render chunks contain frames generated from the *same original runtime* and
pacing schedule; no scene video from the older release is reused. The older
release is used ONLY to retime its instrumental original soundtrack.
"""
from __future__ import annotations
import argparse
from decimal import Decimal
import hashlib
import json
from pathlib import Path
import re
import subprocess
import sys

DURATIONS = (16, 18, 25, 23, 26, 23, 30, 24, 24, 25, 23, 28, 23, 42, 39)
GROUPS = ((1, 3), (4, 6), (7, 9), (10, 11), (12, 13), (14, 15))
VIDEO_NAME = 'Arctic_Circle_Original_State_1080p30.mp4'
SRT_NAME = 'Arctic_Circle_Original_State_1080p30.srt'


def execute(*args: str, capture=False):
    command = list(map(str, args))
    print('+', ' '.join(command), flush=True)
    return subprocess.run(command, check=True, text=True,
                          capture_output=capture)


def timeline(source: Path):
    plan = json.loads((source/'editorial'/'narration_v2.json').read_text())
    factors = [Decimal(str(plan['pace_factors'][str(i)])) for i in range(1, 16)]
    durations = [Decimal(d)*f for d, f in zip(DURATIONS, factors)]
    moments = [Decimal(0)]
    for d in durations:
        moments.append(moments[-1]+d)
    frames = [round(float(t)*30) for t in moments]
    assert frames[0] == 0 and frames[-1] == 13224, frames
    return factors, durations, moments, frames


def probe(path: Path, count_frames=False):
    args = ['ffprobe', '-v', 'error']
    if count_frames:
        args += ['-count_frames']
    args += ['-show_streams', '-show_format', '-show_chapters', '-of', 'json', str(path)]
    return json.loads(execute(*args, capture=True).stdout)


def video_stream(probe_data):
    return next(x for x in probe_data['streams'] if x['codec_type']=='video')


def count_srt(srt: Path) -> int:
    chunks = re.split(r'\n\s*\n', srt.read_text(encoding='utf-8-sig').strip())
    for i, part in enumerate(chunks, 1):
        assert part.splitlines()[0].strip() == str(i), (i, part[:80])
    return len(chunks)


def verify_segment(segment: Path, expected_frames: int):
    assert segment.is_file() and segment.stat().st_size > 100000, segment
    p = probe(segment, count_frames=True)
    video = video_stream(p)
    assert video['codec_name']=='h264' and int(video['width'])==1920 and int(video['height'])==1080, (segment,video)
    assert video['r_frame_rate']=='30/1', (segment, video['r_frame_rate'])
    actual = int(video.get('nb_read_frames') or video.get('nb_frames'))
    assert actual==expected_frames, (segment,actual,expected_frames)
    print(f'PASS {segment.name}: {actual} real 1080p frames', flush=True)


def make_audio(old_master: Path, target: Path, factors, durations):
    p = probe(old_master)
    assert any(s['codec_type']=='audio' for s in p['streams']), 'Prior public release has no original audio'
    assert float(p['format']['duration'])>388.5, 'Prior film shorter than original 389s storyboard'
    edges = [0]
    for d in DURATIONS: edges.append(edges[-1]+d)
    filters = []
    for idx, (factor, duration) in enumerate(zip(factors, durations)):
        f = Decimal(1)/factor
        # Force consistent length for each segment even if AAC packet duration differs.
        filters.append(f'[0:a:0]atrim=start={edges[idx]}:end={edges[idx+1]},'
                       f'asetpts=PTS-STARTPTS,atempo={f:.10f},apad,'
                       f'atrim=duration={duration},asetpts=PTS-STARTPTS[a{idx}]')
    filters.append(''.join(f'[a{j}]' for j in range(15))+'concat=n=15:v=0:a=1[out]')
    execute('ffmpeg','-nostdin','-y','-hide_banner','-loglevel','error',
            '-i',old_master,'-filter_complex',';'.join(filters),
            '-map','[out]','-vn','-ar','48000','-ac','2','-c:a','aac','-b:a','192k',target)


def main():
    ap = argparse.ArgumentParser()
    sub = ap.add_subparsers(dest='command', required=True)
    ap_bounds = sub.add_parser('bounds', help='Print zero-based frame-aligned inclusive/exclusive time bounds')
    ap_bounds.add_argument('--source',type=Path,required=True)
    ap_bounds.add_argument('--group',type=int,choices=range(len(GROUPS)),required=True)
    ap_finish = sub.add_parser('assemble')
    for option in ('--source','--parts','--release','--prior-master'):
        ap_finish.add_argument(option,type=Path,required=True)
    ap_finish.add_argument('--source-sha',required=True)
    args=ap.parse_args()
    source=args.source.resolve()
    factors,durations,moments,frames=timeline(source)
    if args.command=='bounds':
        a,b=GROUPS[args.group]
        print(f'{frames[a-1]/30:.12f} {frames[b]/30:.12f}')
        return
    parts=args.parts.resolve(); dest=args.release.resolve();dest.mkdir(parents=True,exist_ok=True)
    lines=[]
    for i,(a,b) in enumerate(GROUPS):
        part=(parts/f'segment_{i}.mp4').resolve()
        verify_segment(part,frames[b]-frames[a-1])
        lines.append(f"file '{part.as_posix()}'")
    concat=dest/'concat.txt';concat.write_text('\n'.join(lines)+'\n')
    video=dest/'video_only.mp4'
    execute('ffmpeg','-nostdin','-y','-hide_banner','-loglevel','error',
            '-f','concat','-safe','0','-i',concat,'-map','0:v:0',
            '-c:v','copy','-an','-movflags','+faststart',video)
    verify_segment(video, frames[-1])
    old=args.prior_master.resolve();score=dest/'score.m4a'
    make_audio(old,score,factors,durations)
    meta=dest/'chapters.ffmeta'
    chapters=[';FFMETADATA1']
    for i,d in enumerate(durations):
        start=round(float(moments[i])*1000);end=round(float(moments[i+1])*1000)
        chapters += ['[CHAPTER]','TIMEBASE=1/1000',f'START={start}',f'END={end}',f'title=Chapter {i+1:02d}']
    meta.write_text('\n'.join(chapters)+'\n')
    film=dest/VIDEO_NAME
    execute('ffmpeg','-nostdin','-y','-hide_banner','-loglevel','error',
            '-i',video,'-i',score,'-f','ffmetadata','-i',meta,
            '-map','0:v:0','-map','1:a:0','-map_metadata','2','-map_chapters','2',
            '-c:v','copy','-c:a','copy','-movflags','+faststart',film)
    # Generate the V2 external subtitle track from the same source commit and pacing.
    srt_dir=dest/'subtitle_build'
    execute(sys.executable,source/'editorial'/'build_cut.py','--output-dir',srt_dir)
    srt=(srt_dir/'subtitles'/'full_cut.srt')
    assert count_srt(srt)==101, 'Expected 101 V2 narration cues'
    (dest/SRT_NAME).write_bytes(srt.read_bytes())
    d=probe(film,count_frames=True)
    v=video_stream(d);audio=next(s for s in d['streams'] if s['codec_type']=='audio')
    assert v['codec_name']=='h264' and v['r_frame_rate']=='30/1'
    assert int(v['width'])==1920 and int(v['height'])==1080
    assert int(v.get('nb_read_frames') or v.get('nb_frames'))==frames[-1]
    assert audio['codec_name']=='aac' and len(d['chapters'])==15
    assert 440.7 <=float(d['format']['duration'])<=441.05, d['format']['duration']
    print('Full H.264/AAC stream decoding (no truncated MP4 permitted)...',flush=True)
    execute('ffmpeg','-nostdin','-hide_banner','-v','error','-xerror',
            '-i',film,'-map','0:v:0','-map','0:a:0','-f','null','-')
    artifacts=[film,dest/SRT_NAME]
    checksums=[]
    for item in artifacts:
        h=hashlib.sha256()
        with item.open('rb') as stream:
            for chunk in iter(lambda: stream.read(8*1024*1024), b''):
                h.update(chunk)
        checksums.append(f'{h.hexdigest()}  {item.name}\n')
    (dest/'SHA256SUMS.txt').write_text(''.join(checksums))
    (dest/'manifest.json').write_text(json.dumps({
        'source_repository':'Persie0/manimVideos','source_sha':args.source_sha,
        'source_directory':'arctic-circle-theorem/shared_engine',
        'source_model':'original fifteen renderers with shared actor/state handoff',
        'resolution':[1920,1080],'fps':30,'frames':frames[-1],
        'duration_seconds':float(moments[-1]),'subtitle_cues':101,
        'chapters':15,'soundtrack':'Original 2026-10-27 release audio, retimed per scene',
        'note':'Native source render. Does not by itself establish pixel-for-pixel parity with earlier independent clips.'},indent=2)+'\n')
    # Avoid uploading big intermediates as release assets.
    for file in (concat,video,score,meta):file.unlink(missing_ok=True)
    print('VALIDATED RELEASE FILES:',[(f.name,f.stat().st_size) for f in artifacts],flush=True)

if __name__=='__main__':main()