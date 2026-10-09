#!/usr/bin/env python3
"""Checkpoint 132: invert native Gamma thumbnail RGB8 sRGB-domain LUTs exactly."""
import math,struct
from pathlib import Path
from elftools.elf.elffile import ELFFile
data=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 seg=[(int(s["p_vaddr"]),int(s["p_vaddr"]+s["p_filesz"]),int(s["p_offset"])) for s in e.iter_segments() if s["p_type"]=="PT_LOAD"]
def off(a):
 for lo,hi,x in seg:
  if lo<=a<hi:return x+a-lo
 raise ValueError(hex(a))
base=0x8eb74;inv=0x8ef74
forward=list(struct.unpack_from("<256I",data,off(base)))
max_y=forward[-1]
rev=list(data[off(inv):off(inv)+max(4096,(max_y>>3)+512)])
samples=[0,1,2,3,4,5,8,10,12,16,24,32,40,48,64,80,96,112,128,144,160,176,192,208,224,240,248,254,255]
print("FORWARD_TABLE",hex(base),"BYTES",256*4,"MIN_MAX",forward[0],forward[-1])
for i in samples:
 mapped=(forward[i]+5)>>3
 val=rev[mapped] if mapped<len(rev) else None
 print(f"RGB={i:3d} forward={forward[i]:6d} out_index={mapped:6d} LUT_inverse={val} delta={val-i if val is not None else None}")
print("REV",hex(inv),"LENGTH_READ",len(rev),"INDEXES",[(i,rev[i] if i<len(rev) else None) for i in [0,1,2,16,32,64,128,255,256,512,768,1024,2048,4095,8191,16383,32767] ])
print("IS_FORWARD_MONOTONIC",all(forward[i+1]>=forward[i] for i in range(255)))
print("IS_INVERSE_MONOTONIC_TO_MAX",all(rev[i+1]>=rev[i] for i in range(min(len(rev)-1,max_y//8+6))))
print("FULL_INPUT_OUTPUT_DELTA",[(d,len([i for i in range(256) if (forward[i]+5)>>3<len(rev) and rev[(forward[i]+5)>>3]-i==d])) for d in range(-5,6)])
print("OUTPUT_NEAR_MAX",[(i,rev[i]) for i in range(max(0,max_y//8-12),min(len(rev),max_y//8+15))])
