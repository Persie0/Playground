#!/usr/bin/env python3
"""Checkpoint 154 identify camera+0x30 candidate, raw vtable relocation and constructor."""
import struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
src=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 elf=ELFFile(f)
 segments=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in elf.iter_segments() if p["p_type"]=="PT_LOAD"]
 rel={int(r["r_offset"]):int(r["r_addend"]) for s in elf.iter_sections() if isinstance(s,RelocationSection) for r in s.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
def off(a):
 for lo,hi,pos,fl in segments:
  if lo<=a<hi:return pos+a-lo
 raise ValueError(hex(a))
def dump(a,b):
 print("=== REGION",hex(a),hex(b),"===")
 cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
 for i in cs.disasm(src[off(a):off(b-4)+4],a):
  print(f"{i.address:#010x} {i.mnemonic:8} {i.op_str}")
def strings(a):
 try:return src[off(a):off(a)+130].split(b"\x00")[0].decode(errors="replace")
 except: return "UNREADABLE"
print("TRACK lens-correction-vtable-154")
dump(0x3309b0,0x330b40)
dump(0x330e0c,0x330e90)
print("=== VTABLE RELOCATIONS TARGET CAMERA REGION ===")
for loc,val in sorted(rel.items()):
 if 0x330970<=val<0x330f00 and 0x3ff000<loc<0x412000:
  print("RELOCATION",hex(loc),"TARGET",hex(val),"SLOT_OFFSET_FROM_NEAREST",hex(loc&0x7f))
  for possible in (loc-0x10,loc-0x18,loc-0x20,loc-0x28):
   ti=rel.get(possible-8)
   if ti:
    ty=strings(rel.get(ti+8,0))
    if ty.startswith("N") or "Camera" in ty: print("CANDIDATE_VPTR",hex(possible),"RTTI",ty)
print("=== DIRECT CALLS TO POSSIBLE METHODS ===")
for t in [0x330a4c,0x330ac0,0x330ae4,0x330b00,0x330b2c,0x330e00,0x330e14,0x330e34]:
 hits=[]
 for lo,hi,pos,fl in segments:
  if not fl&1:continue
  for d in range(0,hi-lo-4,4):
   opcode=struct.unpack_from("<I",src,pos+d)[0]
   if opcode>>26!=0b100101:continue
   v=opcode&0x3ffffff
   if v&(1<<25):v-=1<<26
   at=lo+d
   if at+v*4==t:hits.append(hex(at))
 print("BL_TO",hex(t),"COUNT",len(hits),"SITES",hits[:36])
