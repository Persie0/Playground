#!/usr/bin/env python3
"""Checkpoint 112: read-only source-camera initialization and live capture ownership."""
import os, struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
track=os.environ["TRACK"];raw=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 loads=[(p["p_vaddr"],p["p_vaddr"]+p["p_filesz"],p["p_offset"],p["p_flags"]) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
 rel={r["r_offset"]:r["r_addend"] for s in e.iter_sections() if isinstance(s,RelocationSection) for r in s.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
def off(a):
 for lo,hi,pos,_ in loads:
  if lo<=a<hi:return pos+a-lo
 raise ValueError(hex(a))
cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def view(a,b):
 print("=== NATIVE",hex(a),hex(b),"===")
 for i in cs.disasm(raw[off(a):off(b-4)+4],a):print(f"{i.address:08x}: {i.mnemonic:9} {i.op_str}")
def allrefs(targets):
 for t in targets:
  refs=[]
  for lo,hi,pos,flags in loads:
   if flags&1==0:continue
   for p in range(pos,pos+hi-lo-3,4):
    op=struct.unpack_from("<I",raw,p)[0]
    if op>>26 != 0b100101:continue
    disp=op&0x3ffffff
    if disp&(1<<25):disp-=1<<26
    caller=lo+p-pos
    if caller+4*disp==t:refs.append(caller)
  print("CALLS_TO",hex(t),len(refs),[hex(x) for x in refs[:100]])
if track=="linear-construction":
 for a,b in [(0x331118,0x331344),(0x331344,0x3314b0),(0x331b54,0x331c38),(0x331c38,0x331d08)]:
  view(a,b)
 allrefs([0x331118,0x331344,0x331690,0x3317bc,0x331b54])
elif track=="capture-rosette":
 for a,b in [(0x11b8e0,0x11ba1c),(0x11be38,0x11bf30),(0x31a6bc,0x31a7a0),(0x343e74,0x3440ec)]:
  view(a,b)
 allrefs([0x3440ec,0x343e74,0x31a6bc,0x331344])
elif track=="native-thumbnail":
 for a,b in [(0xf0150,0xf02e0),(0x31b9e4,0x31baf4),(0x117658,0x117730),(0x11771c,0x117780)]:
  view(a,b)
 allrefs([0x31b9e4,0x117658,0x11771c])
else:raise SystemExit(track)
