#!/usr/bin/env python3
"""Checkpoint 133: verify independently generated affine-gamma transfer curves against exact stock ELF tables."""
import math,struct
from elftools.elf.elffile import ELFFile
from pathlib import Path
f=Path("liblightcycle.so");blob=f.read_bytes()
with f.open("rb") as s:
 e=ELFFile(s)
 seg=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def off(addr):
 for a,b,o in seg:
  if a<=addr<b:return o+addr-a
 raise ValueError(hex(addr))
forward=struct.unpack_from("<256I",blob,off(0x8eb74))
reverse=blob[off(0x8ef74):off(0x8ef74)+1025]
candidates={
  "round-8186": [math.floor(8186 * (i/255.0)**1.6+0.5) for i in range(256)],
  "floor-8186": [math.floor(8186 * (i/255.0)**1.6) for i in range(256)],
  "round-8192": [math.floor(8192 * (i/255.0)**1.6+0.5) for i in range(256)],
}
for key,vals in candidates.items():
 miss=[(i,forward[i],vals[i]) for i in range(256) if vals[i]!=forward[i]]
 print("FORWARD_FORMULA",key,"MISMATCHES",len(miss),"FIRST",miss[:24])
for denom in (1024,1023,1022):
 for offset in (0,1):
  for fn in ("round","floor"):
   arr=[]
   for i in range(1025):
    base=max(0,i-offset)/denom
    v=255*base**0.625
    arr.append(min(255,math.floor(v+0.5) if fn=="round" else math.floor(v)))
   bad=[(i,reverse[i],arr[i]) for i in range(1025) if reverse[i]!=arr[i]]
   print("INVERSE_FORMULA",denom,offset,fn,"MISMATCHES",len(bad),"FIRST",bad[:12])
print("FORWARD_EXACT_FIRST",list(forward[:48]))
print("INVERSE_EXACT_FIRST",list(reverse[:64]))
