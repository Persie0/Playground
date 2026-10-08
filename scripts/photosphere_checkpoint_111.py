#!/usr/bin/env python3
"""Checkpoint 111: read-only independent native Photo Sphere numerical gaps."""
import os,struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
TRACK=os.environ["TRACK"];blob=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as h:
 e=ELFFile(h)
 loads=[(int(x["p_vaddr"]),int(x["p_vaddr"]+x["p_filesz"]),int(x["p_offset"]),int(x["p_flags"])) for x in e.iter_segments() if x["p_type"]=="PT_LOAD"]
 rel={int(r["r_offset"]):int(r["r_addend"]) for s in e.iter_sections() if isinstance(s,RelocationSection) for r in s.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
def at(addr):
 for lo,hi,pos,f in loads:
  if lo<=addr<hi:return pos+addr-lo
 raise ValueError(hex(addr))
def iscode(addr):return isinstance(addr,int) and any(lo<=addr<hi and f&1 for lo,hi,pos,f in loads)
def string(addr):
 try:return blob[at(addr):at(addr)+120].split(b"\0",1)[0].decode("utf8","replace")
 except:return ""
C=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def asm(a,b):
 print(f"=== ARM64 {a:#x}..{b:#x} ===")
 for ins in C.disasm(blob[at(a):at(b-4)+4],a):
  print(f"{ins.address:08x}: {ins.mnemonic:10} {ins.op_str}")
def refs(targets):
 for t in targets:
  hits=[]
  for lo,hi,pos,flags in loads:
   if not flags&1:continue
   for k in range(pos,pos+hi-lo-3,4):
    op=struct.unpack_from("<I",blob,k)[0]
    if op>>26 != 0b100101:continue
    disp=op&0x3ffffff
    if disp&(1<<25):disp-=1<<26
    loc=lo+k-pos
    if loc+disp*4==t:hits.append(loc)
  print("DIRECT_BL_TO",hex(t),"N",len(hits),"CALLS",[hex(x) for x in hits[:150]])
def rttis(substrs):
 seen=set()
 for b in sorted(rel):
  info=rel.get(b-8)
  if info is None:continue
  ptr=rel.get(info+8)
  if not isinstance(ptr,int):continue
  nm=string(ptr)
  if not any(t.lower() in nm.lower() for t in substrs) or (b,nm) in seen:continue
  if not any(iscode(rel.get(b+n)) for n in (0,8,0x20,0x28,0x80,0x88)):continue
  seen.add((b,nm))
  print("RTTI_VPTR",hex(b),nm,"METHODS",[(hex(slot),hex(v) if v else None) for slot in (0,8,0x10,0x18,0x20,0x28,0x48,0x80,0x88,0x90,0x98,0xa0) if (v:=rel.get(b+slot)) is not None])
if TRACK=="gamma-angle":
 asm(0x340d38,0x340f54)
 # nearby constants used by frame and dot products
 for a in (0x61870,0x61940,0x61858,0x619c0):
  print("CONST64",hex(a),struct.unpack_from("<Q",blob,at(a))[0],struct.unpack_from("<d",blob,at(a))[0])
elif TRACK=="correction-models":
 rttis(("distort","correc","camera","lens","Brown","Radial","Polynomial","Fisheye","Linear"))
 asm(0x331b54,0x331c38)
 asm(0x331c38,0x331d1c)
 refs([0x331b54,0x331c38,0x331690,0x3317bc])
elif TRACK=="thumbnail-sizing":
 asm(0x31b9e4,0x31bb10)
 asm(0x3440ec,0x3441e0)
 asm(0xf002c,0xf0198)
 refs([0x31b9e4,0x3440ec,0x345798,0x34587c])
elif TRACK=="rosette-sources":
 asm(0x31a6bc,0x31a8d0)
 asm(0x3440ec,0x3441e0)
 asm(0x345798,0x34587c)
 asm(0x34587c,0x345958)
 refs([0x3440ec,0x31a6bc,0x345798,0x34587c])
else:raise SystemExit("unknown "+TRACK)
