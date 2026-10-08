#!/usr/bin/env python3
"""Checkpoint 123: stock native source photometric resampler, JNI object call sites and packed width."""
import os,struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
track=os.environ["TRACK"]
src=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 seg=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
 rel={int(r["r_offset"]):int(r["r_addend"]) for s in e.iter_sections() if isinstance(s,RelocationSection) for r in s.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
def off(a):
 for lo,hi,base,fl in seg:
  if lo<=a<hi:return base+a-lo
 raise ValueError(hex(a))
cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def dump(a,b):
 print("=== ARM64",hex(a),hex(b))
 for ins in cs.disasm(src[off(a):off(b-4)+4],a):print(f"{ins.address:08x}: {ins.mnemonic:9} {ins.op_str}")
def calls(t):
 hits=[]
 for lo,hi,pos,flags in seg:
  if not flags&1:continue
  for x in range(pos,pos+hi-lo-3,4):
   inst=struct.unpack_from("<I",src,x)[0]
   if inst>>26!=0b100101:continue
   imm=inst&0x3ffffff
   if imm&(1<<25):imm-=1<<26
   addr=lo+x-pos
   if addr+imm*4==t:hits.append(addr)
 print("DIRECT_CALLS",hex(t),len(hits),[hex(x) for x in hits[:100]])
if track=="native-kernel":
 for a,b in [(0x39e91c,0x39ec20),(0x117b10,0x117b98),(0x30aee4,0x30af54)]:dump(a,b)
elif track=="native-reset":
 # Original JNI common reset (Ghidra +0x100000 from checkpoint 4)
 for a,b in [(0xed500,0xed710),(0xed710,0xeda30),(0x10f0fc,0x10f244)]:
  dump(a,b)
 for t in [0x10f0fc,0x10f310,0x319308]:calls(t)
elif track=="native-options":
 for a,b in [(0x11a204,0x11a2e8),(0x11a3a4,0x11a41c),(0x2188b8,0x218a10),(0x11bffc,0x11c0a8)]:
  dump(a,b)
 for t in [0x2188b8,0x11a204,0x319308]:calls(t)
else:raise SystemExit(track)
