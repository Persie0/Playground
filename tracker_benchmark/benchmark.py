#!/usr/bin/env python3
from __future__ import annotations

import argparse
import csv
import json
import math
import os
import platform
import resource
import statistics
import subprocess
import sys
import time
from collections import defaultdict
from pathlib import Path

import numpy as np
from scipy.optimize import linear_sum_assignment

W, H, FPS = 384, 288, 30
TRACK_THRESH, MATCH_THRESH, TRACK_BUFFER = 0.30, 0.80, 45
IOU_FLOOR = 1.0 - MATCH_THRESH


def box(cx, cy, w, h):
    return np.array([cx-w/2, cy-h/2, cx+w/2, cy+h/2], dtype=np.float32)


def ious(a, b):
    if not a or not b:
        return np.zeros((len(a), len(b)), dtype=np.float32)
    a, b = np.asarray(a, np.float32), np.asarray(b, np.float32)
    x1 = np.maximum(a[:,None,0], b[None,:,0]); y1 = np.maximum(a[:,None,1], b[None,:,1])
    x2 = np.minimum(a[:,None,2], b[None,:,2]); y2 = np.minimum(a[:,None,3], b[None,:,3])
    inter = np.maximum(0, x2-x1) * np.maximum(0, y2-y1)
    aa = np.maximum(0,a[:,2]-a[:,0])*np.maximum(0,a[:,3]-a[:,1])
    bb = np.maximum(0,b[:,2]-b[:,0])*np.maximum(0,b[:,3]-b[:,1])
    u = aa[:,None]+bb[None,:]-inter
    return np.divide(inter,u,out=np.zeros_like(inter),where=u>0)


def generate(seed, mode, frames=220):
    rng=np.random.default_rng(seed)
    cfg={
      'clean':(10,.55,.01,.01,False), 'crossing':(16,1.0,.02,.04,False),
      'occlusion':(16,1.15,.025,.06,True), 'dense':(28,1.35,.04,.10,True),
      'noisy':(18,1.7,.065,.28,True),
    }[mode]
    n,noise,miss_p,fp_rate,hard=cfg
    specs=[]
    for i in range(n):
        lane=i%4; start=(i//4)*6+int(rng.integers(0,4)); sp=float(rng.uniform(1.1,1.75))
        if lane==0: p=np.array([-25.,95.+(i%4)*14]); v=np.array([sp,rng.normal(0,.02)])
        elif lane==1: p=np.array([W+25.,108.+(i%4)*14]); v=np.array([-sp,rng.normal(0,.02)])
        elif lane==2: p=np.array([157.+(i%4)*17,-22.]); v=np.array([rng.normal(0,.02),sp*.82])
        else: p=np.array([174.+(i%4)*17,H+22.]); v=np.array([rng.normal(0,.02),-sp*.82])
        specs.append((i,start,p,v,np.array([rng.uniform(19,30),rng.uniform(10,17)])))
    seq=[]
    for f in range(frames):
        gt=[]; det=[]; ctr={}
        for gid,start,p,v,wh in specs:
            t=f-start
            if t<0: continue
            c=p+v*t
            if c[0] < -30 or c[0] > W+30 or c[1] < -30 or c[1] > H+30: continue
            b=box(c[0],c[1],wh[0],wh[1]); gt.append((gid,b)); ctr[gid]=c
        for gid,b in gt:
            c=ctr[gid]; centre=abs(c[0]-W/2)<45 and abs(c[1]-H/2)<40
            gap=False
            if hard and centre:
                phase=(f+gid*7)%41; gap=14 <= phase < (20 if mode=='occlusion' else 24)
            if gap or rng.random()<miss_p: continue
            d=b+rng.normal(0,noise,4)
            conf=float(np.clip(rng.normal(.76,.13),.11,.99))
            if hard and centre and (f+gid)%10<4: conf=float(rng.uniform(.12,.29))
            det.append((d.astype(np.float32),conf,0))
            if mode in ('dense','noisy') and rng.random()<.025:
                det.append(((d+rng.normal(0,1.6,4)).astype(np.float32),max(.11,conf-.22),0))
        for _ in range(int(rng.poisson(fp_rate*max(1,len(gt))))):
            cx,cy=rng.uniform(10,W-10),rng.uniform(10,H-10)
            det.append((box(cx,cy,rng.uniform(14,32),rng.uniform(9,19)),float(rng.uniform(.11,.72)),0))
        seq.append((gt,det))
    return seq


def sv_dets(dets):
    import supervision as sv
    if not dets: return sv.Detections.empty()
    return sv.Detections(
      xyxy=np.asarray([d[0] for d in dets],np.float32),
      confidence=np.asarray([d[1] for d in dets],np.float32),
      class_id=np.asarray([d[2] for d in dets],np.int32))


def sv_out(x):
    if x is None or len(x)==0 or getattr(x,'tracker_id',None) is None: return []
    return [(int(t),np.asarray(b,np.float32)) for t,b in zip(x.tracker_id,x.xyxy) if int(t)>=0]


class RFByte:
    def __init__(self):
        from trackers import ByteTrackTracker
        self.t=ByteTrackTracker(lost_track_buffer=TRACK_BUFFER,frame_rate=FPS,track_activation_threshold=TRACK_THRESH,
          minimum_consecutive_frames=1,minimum_iou_threshold=IOU_FLOOR,high_conf_det_threshold=TRACK_THRESH)
    def update(self,d): return sv_out(self.t.update(sv_dets(d)))

class RFByteDIoU:
    def __init__(self):
        from trackers import ByteTrackTracker
        from trackers.utils.iou import DIoU
        self.t=ByteTrackTracker(lost_track_buffer=TRACK_BUFFER,frame_rate=FPS,track_activation_threshold=TRACK_THRESH,
          minimum_consecutive_frames=1,minimum_iou_threshold=.05,high_conf_det_threshold=TRACK_THRESH,iou=DIoU())
    def update(self,d): return sv_out(self.t.update(sv_dets(d)))

class RFOC:
    def __init__(self):
        from trackers import OCSORTTracker
        self.t=OCSORTTracker(lost_track_buffer=TRACK_BUFFER,frame_rate=FPS,minimum_consecutive_frames=1,minimum_iou_threshold=IOU_FLOOR)
    def update(self,d): return sv_out(self.t.update(sv_dets(d)))

class RFCBIoU:
    def __init__(self):
        from trackers import CBIoUTracker
        self.t=CBIoUTracker(lost_track_buffer=TRACK_BUFFER,frame_rate=FPS,track_activation_threshold=TRACK_THRESH,
          minimum_consecutive_frames=1,high_conf_det_threshold=TRACK_THRESH,minimum_iou_threshold_first_assoc=.20,
          minimum_iou_threshold_second_assoc=.20,minimum_iou_threshold_unconfirmed_assoc=.20,buffer_ratio_first=.15,buffer_ratio_second=.35)
    def update(self,d): return sv_out(self.t.update(sv_dets(d)))

class SVByte:
    def __init__(self):
        import supervision as sv
        self.t=sv.ByteTrack(track_activation_threshold=TRACK_THRESH,lost_track_buffer=TRACK_BUFFER,
          minimum_matching_threshold=MATCH_THRESH,frame_rate=FPS,minimum_consecutive_frames=1)
    def update(self,d): return sv_out(self.t.update_with_detections(sv_dets(d)))

class TFByte:
    def __init__(self):
        from trackforge import BYTETRACK
        self.t=BYTETRACK(track_thresh=TRACK_THRESH,track_buffer=TRACK_BUFFER,match_thresh=MATCH_THRESH,det_thresh=TRACK_THRESH)
    def update(self,d):
        inp=[([float(b[0]),float(b[1]),float(b[2]-b[0]),float(b[3]-b[1])],float(s),int(c)) for b,s,c in d]
        return [(int(tid),np.array([tl[0],tl[1],tl[0]+tl[2],tl[1]+tl[3]],np.float32)) for tid,tl,*_ in self.t.update(inp)]

class TFOC:
    def __init__(self):
        from trackforge import OCSORT
        self.t=OCSORT(max_age=TRACK_BUFFER,min_hits=1,iou_threshold=IOU_FLOOR,delta_t=3,inertia=.2)
    def update(self,d):
        inp=[([float(b[0]),float(b[1]),float(b[2]-b[0]),float(b[3]-b[1])],float(s),int(c)) for b,s,c in d if s>.10]
        return [(int(tid),np.array([tl[0],tl[1],tl[0]+tl[2],tl[1]+tl[3]],np.float32)) for tid,tl,*_ in self.t.update(inp)]

class ArteByte:
    def __init__(self):
        from bytetracker import BYTETracker
        self.t=BYTETracker(track_thresh=TRACK_THRESH,track_buffer=TRACK_BUFFER,match_thresh=MATCH_THRESH,frame_rate=FPS); self.f=0
    def update(self,d):
        self.f+=1
        a=np.asarray([[*map(float,b),float(s),float(c)] for b,s,c in d if s>.10],np.float32)
        if not a.size: a=np.empty((0,6),np.float32)
        r=self.t.update(a,self.f)
        return [] if r is None or len(r)==0 else [(int(x[4]),np.asarray(x[:4],np.float32)) for x in r]

class BoxMOT:
    def __init__(self, name='bytetrack', backend='python'):
        from boxmot import create_tracker
        kw=dict(backend=backend,geometry='aabb',per_class=False)
        if name=='bytetrack': kw.update(track_thresh=TRACK_THRESH,track_buffer=TRACK_BUFFER,match_thresh=MATCH_THRESH)
        self.t=create_tracker(name,**kw); self.frame=np.zeros((H,W,3),np.uint8); self.name=name
    def update(self,d):
        a=np.asarray([[*map(float,b),float(s),float(c)] for b,s,c in d],np.float32)
        if not a.size: a=np.empty((0,6),np.float32)
        r=self.t.update(a, self.frame if self.name=='sfsort' else None)
        return [] if r is None or len(r)==0 else [(int(x[4]),np.asarray(x[:4],np.float32)) for x in r]

FACTORIES={
 'roboflow-bytetrack':RFByte, 'roboflow-bytetrack-diou':RFByteDIoU,
 'supervision-bytetrack':SVByte, 'trackforge-bytetrack':TFByte, 'artefactory-bytetrack':ArteByte,
 'boxmot-bytetrack-python':lambda:BoxMOT('bytetrack','python'),
 'boxmot-bytetrack-cpp':lambda:BoxMOT('bytetrack','cpp'),
 'roboflow-ocsort':RFOC, 'trackforge-ocsort':TFOC, 'roboflow-cbiou':RFCBIoU,
 'boxmot-ocsort-python':lambda:BoxMOT('ocsort','python'),
 'boxmot-ocsort-cpp':lambda:BoxMOT('ocsort','cpp'),
 'boxmot-sfsort-python':lambda:BoxMOT('sfsort','python'),
 'boxmot-sfsort-cpp':lambda:BoxMOT('sfsort','cpp'),
}
META={
 **{k:{'family':'ByteTrack','license':'Apache-2.0'} for k in ['roboflow-bytetrack','roboflow-bytetrack-diou']},
 'supervision-bytetrack':{'family':'ByteTrack','license':'MIT'}, 'trackforge-bytetrack':{'family':'ByteTrack','license':'MIT'},
 'artefactory-bytetrack':{'family':'ByteTrack','license':'MIT'},
 'boxmot-bytetrack-python':{'family':'ByteTrack','license':'AGPL-3.0'}, 'boxmot-bytetrack-cpp':{'family':'ByteTrack','license':'AGPL-3.0'},
 'roboflow-ocsort':{'family':'OC-SORT','license':'Apache-2.0'}, 'trackforge-ocsort':{'family':'OC-SORT','license':'MIT'},
 'roboflow-cbiou':{'family':'C-BIoU','license':'Apache-2.0'},
 'boxmot-ocsort-python':{'family':'OC-SORT','license':'AGPL-3.0'}, 'boxmot-ocsort-cpp':{'family':'OC-SORT','license':'AGPL-3.0'},
 'boxmot-sfsort-python':{'family':'SFSORT','license':'AGPL-3.0'}, 'boxmot-sfsort-cpp':{'family':'SFSORT','license':'AGPL-3.0'},
}


def evaluate(adapter, seq):
    total_gt=total_pred=matches=switches=frags=0; pairs=defaultdict(int); last={}; was=defaultdict(bool); gap=defaultdict(bool)
    forced_pre={}; forced_len=defaultdict(int); forced_trials=forced_ok=0; pred_ids=set(); gt_ids_all=set()
    for fi,(gt,dets) in enumerate(seq):
        pred=adapter.update(dets); gids=[g for g,_ in gt]; gb=[b for _,b in gt]; pids=[p for p,_ in pred]; pb=[b for _,b in pred]
        gt_ids_all.update(gids); pred_ids.update(pids); total_gt+=len(gb); total_pred+=len(pb)
        # infer detector-visible GT to identify forced/missed gaps
        vis=set(); dm=ious(gb,[b for b,_,_ in dets])
        for i,g in enumerate(gids):
            if dm.shape[1] and float(dm[i].max())>=.30: vis.add(g)
        assigned={}; m=ious(gb,pb)
        if len(gb) and len(pb):
            rr,cc=linear_sum_assignment(1-m)
            for r,c in zip(rr,cc):
                if m[r,c]>=.30:
                    g,p=gids[r],pids[c]; assigned[g]=p; pairs[(g,p)]+=1; matches+=1
                    if g in last and last[g][0]!=p and fi-last[g][1]<=TRACK_BUFFER: switches+=1
                    last[g]=(p,fi)
        for g in gids:
            now=g in assigned
            if was[g] and not now: gap[g]=True
            if now and gap[g]: frags+=1; gap[g]=False
            was[g]=now
            visible=g in vis
            if g in last and g not in vis and g not in forced_pre: forced_pre[g]=last[g][0]; forced_len[g]=1
            elif g in forced_pre and not visible: forced_len[g]+=1
            elif g in forced_pre and visible:
                if 2<=forced_len[g]<=20:
                    forced_trials+=1; forced_ok+=int(g in assigned and assigned[g]==forced_pre[g])
                forced_pre.pop(g,None); forced_len.pop(g,None)
    # global one-to-one identity assignment => IDF1
    ug=sorted({g for g,_ in pairs}); up=sorted({p for _,p in pairs}); idtp=0
    if ug and up:
        a=np.zeros((len(ug),len(up)),np.int32); gm={g:i for i,g in enumerate(ug)}; pm={p:i for i,p in enumerate(up)}
        for (g,p),n in pairs.items(): a[gm[g],pm[p]]+=n
        r,c=linear_sum_assignment(-a); idtp=int(a[r,c].sum())
    idf1=2*idtp/max(1,2*idtp+(total_pred-idtp)+(total_gt-idtp))
    precision=matches/max(1,total_pred); recall=matches/max(1,total_gt)
    mota=1-((total_gt-matches)+(total_pred-matches)+switches)/max(1,total_gt)
    count_ratio=len(pred_ids)/max(1,len(gt_ids_all)); count_score=math.exp(-abs(math.log(max(count_ratio,1e-6))))
    return dict(idf1=idf1,precision=precision,recall=recall,mota=mota,id_switches=switches,fragments=frags,
      reid=(forced_ok/forced_trials if forced_trials else 0.0),reid_trials=forced_trials,count_ratio=count_ratio,count_score=count_score)


def perf_stream(frames=1000):
    rng=np.random.default_rng(777); c=rng.uniform([20,20],[W-20,H-20],(22,2)); v=rng.normal(0,1.15,(22,2)); out=[]
    for f in range(frames):
        d=[]
        for i in range(len(c)):
            c[i]+=v[i]
            for k,lim in ((0,W),(1,H)):
                if c[i,k]<10 or c[i,k]>lim-10: v[i,k]*=-1
            b=box(c[i,0],c[i,1],24+i%4,12+i%3)+rng.normal(0,.65,4)
            conf=.18 if (f+i)%31 in (0,1,2) else float(rng.uniform(.45,.95)); d.append((b.astype(np.float32),conf,0))
        out.append(d)
    return out


def worker(name):
    rss0=resource.getrusage(resource.RUSAGE_SELF).ru_maxrss/1024
    try:
        t0=time.perf_counter(); probe=FACTORIES[name](); init_ms=(time.perf_counter()-t0)*1000
        rss_init=resource.getrusage(resource.RUSAGE_SELF).ru_maxrss/1024
        modes={}
        for mode in ['clean','crossing','occlusion','dense','noisy']:
            vals=[evaluate(FACTORIES[name](),generate(seed,mode)) for seed in (13,37)]
            modes[mode]={k:statistics.mean(v[k] for v in vals) for k in vals[0]}
        stream=perf_stream(); a=FACTORIES[name]();
        for d in stream[:80]: a.update(d)
        ts=[]; cpu0=time.process_time(); wall0=time.perf_counter()
        for d in stream[80:]:
            s=time.perf_counter_ns(); a.update(d); ts.append((time.perf_counter_ns()-s)/1e6)
        wall=time.perf_counter()-wall0; cpu=time.process_time()-cpu0; rss=resource.getrusage(resource.RUSAGE_SELF).ru_maxrss/1024
        weights={'clean':.08,'crossing':.18,'occlusion':.32,'dense':.27,'noisy':.15}
        quality=0
        for m,w in weights.items():
            x=modes[m]; quality+=w*(.45*x['idf1']+.10*x['precision']+.10*x['recall']+.20*x['reid']+.15*x['count_score'])
        return dict(name=name,status='ok',family=META[name]['family'],license=META[name]['license'],arch=platform.machine(),quality=quality*100,
          mean_ms=statistics.mean(ts),p50_ms=statistics.median(ts),p95_ms=float(np.percentile(ts,95)),fps_equiv=1000/statistics.mean(ts),
          cpu_core_pct=100*cpu/max(wall,1e-9),peak_rss_mb=rss,rss_delta_mb=max(0,rss-rss0),init_rss_delta_mb=max(0,rss_init-rss0),init_ms=init_ms,modes=modes)
    except Exception as e:
        return dict(name=name,status='failed',family=META[name]['family'],license=META[name]['license'],arch=platform.machine(),error=f'{type(e).__name__}: {e}')


def rank(rows):
    ok=[x for x in rows if x['status']=='ok']; bad=[x for x in rows if x['status']!='ok']
    if not ok:return rows
    def inv(v,vals):
        lo,hi=min(vals),max(vals); return 100 if hi<=lo else 100*(hi-v)/(hi-lo)
    ms=[x['mean_ms'] for x in ok]; mem=[x['rss_delta_mb'] for x in ok]; cpu=[x['cpu_core_pct'] for x in ok]
    for x in ok:
        x['speed_score']=inv(x['mean_ms'],ms); x['memory_score']=inv(x['rss_delta_mb'],mem); x['cpu_score']=inv(x['cpu_core_pct'],cpu)
        x['edge_score']=.65*x['quality']+.20*x['speed_score']+.10*x['memory_score']+.05*x['cpu_score']
    ok.sort(key=lambda x:x['edge_score'],reverse=True)
    for i,x in enumerate(ok,1):x['rank']=i
    return ok+bad


def write(rows,out):
    out.mkdir(parents=True,exist_ok=True); (out/'results.json').write_text(json.dumps(rows,indent=2))
    cols=['rank','name','family','license','edge_score','quality','mean_ms','p95_ms','fps_equiv','cpu_core_pct','rss_delta_mb','peak_rss_mb','status','error']
    with (out/'results.csv').open('w',newline='') as f:
        w=csv.DictWriter(f,fieldnames=cols,extrasaction='ignore');w.writeheader();w.writerows(rows)
    md=['# Tracker benchmark','',f'Architecture: **{platform.machine()}**. Production-like inputs: 384x288 coordinates, 30 FPS, activation 0.30, lost buffer 45, ByteTrack match 0.80.','',
        '|Rank|Tracker|Family|License|Edge score|Quality|Mean ms|P95 ms|Eq FPS|CPU core %|RSS delta MB|','|---:|---|---|---|---:|---:|---:|---:|---:|---:|---:|']
    for x in rows:
        if x['status']!='ok': md.append(f"|-|{x['name']}|{x['family']}|{x['license']}|FAILED: {x.get('error','')}|||||||");continue
        md.append(f"|{x['rank']}|{x['name']}|{x['family']}|{x['license']}|{x['edge_score']:.2f}|{x['quality']:.2f}|{x['mean_ms']:.4f}|{x['p95_ms']:.4f}|{x['fps_equiv']:.0f}|{x['cpu_core_pct']:.1f}|{x['rss_delta_mb']:.1f}|")
    md += ['','## Scenario details','']
    for x in rows:
        if x['status']!='ok':continue
        md += [f"### {x['name']}",'|Scenario|IDF1|Precision|Recall|MOTA|ID switches|Re-ID survival|Track count / GT|','|---|---:|---:|---:|---:|---:|---:|---:|']
        for m,v in x['modes'].items(): md.append(f"|{m}|{100*v['idf1']:.1f}|{100*v['precision']:.1f}|{100*v['recall']:.1f}|{100*v['mota']:.1f}|{v['id_switches']:.1f}|{100*v['reid']:.1f}|{v['count_ratio']:.3f}|")
        md.append('')
    md += ['## Notes','','- Accuracy cases are deterministic synthetic intersection stress tests with crossings, detector misses, low-confidence boxes, false positives and short occlusions. They are meant to expose association behavior, not replace a labeled real-video benchmark.',
      '- Speed/CPU/RAM exclude detector inference and include each library adapter/conversion overhead.',
      '- BoxMOT is benchmarked for comparison but is AGPL-3.0; the permissive candidates are Roboflow Trackers (Apache-2.0), Trackforge (MIT), Supervision (MIT), and Artefactory ByteTrack (MIT).',
      '- GitHub ARM64 is closer to Raspberry Pi 5 architecture than x86_64, but it is not the same CPU. Use ARM64 for relative ranking, then confirm the winner on the Pi.']
    (out/'results.md').write_text('\n'.join(md)+'\n')


def main():
    p=argparse.ArgumentParser(); p.add_argument('--worker'); p.add_argument('--out',default='tracker_benchmark/results'); a=p.parse_args()
    if a.worker:
        print(json.dumps(worker(a.worker))); return
    rows=[]
    for name in FACTORIES:
        cp=subprocess.run([sys.executable,__file__,'--worker',name],text=True,capture_output=True)
        try: rows.append(json.loads(cp.stdout.strip().splitlines()[-1]))
        except Exception: rows.append(dict(name=name,status='failed',family=META[name]['family'],license=META[name]['license'],arch=platform.machine(),error=(cp.stderr or cp.stdout)[-1000:]))
    rows=rank(rows); write(rows,Path(a.out)); print((Path(a.out)/'results.md').read_text())

if __name__=='__main__': main()
