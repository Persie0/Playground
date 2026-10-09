#!/usr/bin/env python3
"""Checkpoint 149: recover untyped LinearCamera correction pointer replacement region."""
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
import struct
data=Path("liblightcycle.so").read_bytes()
with Path("liblightcycle.so").open("rb") as f:
 e=ELFFile(f)
 loads=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
 rel={int(r["r_offset"]):int(r["r_addend"]) for sec in e.iter_sections() if isinstance(sec,RelocationSection) for r in sec.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
def off(a):
 for lo,hi,b,fl in loads:
  if lo<=a<hi:return b+a-lo
 raise ValueError(hex(a))
cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
print("=== RAW_LINEARCAMERA_CORRECTION_REGION ===")
for i in cs.disasm(data[off(0x3315b0):off(0x3316a8)],0x3315b0):
 print(f"{i.address:08x} {i.mnemonic:8} {i.op_str}")
print("=== RELATIVE_RELOCS_TO_CORRECTION_REGION ===")
for p,t in sorted(rel.items()):
 if 0x331590<=t<0x3316a8:print(f"VTABLE_OR_GOT_REF at={p:#x} target={t:#x}")
print("=== DIRECT_BL_TO_POSSIBLE_ENTRY ===")
for dest in (0x3315f8,0x331620,0x331630,0x331640,0x331644,0x331650,0x331690):
 hits=[]
 for lo,hi,b,fl in loads:
  if not (fl&1):continue
  for d in range(0,hi-lo-3,4):
   op=struct.unpack_from("<I",data,b+d)[0]
   if (op>>26)!=0b100101:continue
   x=op&0x3ffffff
   if x&(1<<25):x-=1<<26
   pc=lo+d
   if pc+4*x==dest:hits.append(hex(pc))
 print("BL_TO",hex(dest),"COUNT",len(hits),"SITES",hits[:45])
