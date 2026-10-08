#!/usr/bin/env python3
"""Checkpoint 117: native capture thumbnail dimensions and live creator constructor."""
import os,struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
track=os.environ["TRACK"];raw=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f);loads=[(p["p_vaddr"],p["p_vaddr"]+p["p_filesz"],p["p_offset"],p["p_flags"]) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def pos(a):
 for l,h,o,f in loads:
  if l<=a<h:return o+a-l
 raise ValueError(hex(a))
C=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def view(a,b):
 print("=== NATIVE",hex(a),hex(b))
 for ins in C.disasm(raw[pos(a):pos(b-4)+4],a):
  print(f"{ins.address:08x}: {ins.mnemonic:10} {ins.op_str}")
def refs(ts):
 for target in ts:
  hits=[]
  for lo,hi,ofs,flags in loads:
   if flags&1==0:continue
   for ofs2 in range(ofs,ofs+hi-lo-3,4):
    word=struct.unpack_from("<I",raw,ofs2)[0]
    if word>>26 != 0b100101:continue
    imm=word&0x3ffffff
    if imm&(1<<25):imm-=1<<26
    call=lo+ofs2-ofs
    if call+imm*4==target:hits.append(call)
  print("CALLED",hex(target),"N",len(hits),"FROM",[hex(x) for x in hits[:110]])
if track=="thumbnail-resize":
 for a,b in [(0x30aee4,0x30b108),(0x3193b0,0x31947c),(0x3466c8,0x3467e8)]:view(a,b)
 refs([0x30aee4,0x3193fc,0x3466c8])
elif track=="session-factory":
 for a,b in [(0x11b4c0,0x11b80c),(0x11a2f0,0x11a4e0),(0x319160,0x3193fc)]:view(a,b)
 refs([0x3193b0,0x3193fc,0x31947c,0x11b5f4])
else:raise SystemExit(track)
