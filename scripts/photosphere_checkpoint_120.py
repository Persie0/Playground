#!/usr/bin/env python3
"""Checkpoint 120: source of session thumbnail width field passed to native creator."""
import os,struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
track=os.environ["TRACK"];data=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 loads=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def off(a):
 for lo,hi,p,fl in loads:
  if lo<=a<hi:return p+a-lo
 raise ValueError(hex(a))
d=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def dump(a,b):
 print("=== CODE",hex(a),hex(b))
 for x in d.disasm(data[off(a):off(b-4)+4],a):
  print(f"{x.address:08x}: {x.mnemonic:9} {x.op_str}")
def refs(targs):
 for t in targs:
  hit=[]
  for lo,hi,p,fl in loads:
   if not fl&1:continue
   for ix in range(p,p+hi-lo-3,4):
    word=struct.unpack_from("<I",data,ix)[0]
    if word>>26!=0b100101:continue
    delta=word&0x3ffffff
    if delta&(1<<25):delta-=1<<26
    caller=lo+ix-p
    if caller+delta*4==t:hit.append(caller)
  print("CALLS_TO",hex(t),[hex(a) for a in hit])
  for a in hit[:15]:
   print("-- CONTEXT",hex(a))
   dump(a-0x58,a+0x18)
if track=="session-width":
 dump(0x11a204,0x11a2fc)
 refs([0x11a204,0x319308])
elif track=="jni-reset-options":
 dump(0x1ed84c,0x1ed9c8)
 refs([0x1ed84c,0x11a204])
elif track=="options-factory":
 dump(0x2187f0,0x218a00)
 dump(0x1189e0,0x118b30)
 refs([0x2188b8,0x118a78])
else:raise ValueError(track)
