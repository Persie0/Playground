#!/usr/bin/env python3
"""Checkpoint 116: resolve actual capture-thumbnail creator rather than an unused JNI export."""
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
src=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 loads=[(p["p_vaddr"],p["p_vaddr"]+p["p_filesz"],p["p_offset"]) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
 rel={r["r_offset"]:r["r_addend"] for s in e.iter_sections() if isinstance(s,RelocationSection) for r in s.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
def off(a):
 for lo,hi,at in loads:
  if lo<=a<hi:return at+a-lo
 raise ValueError(hex(a))
asm=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def read(start,end):
 print("=== NATIVE",hex(start),hex(end))
 for k in asm.disasm(src[off(start):off(end-4)+4],start):
  print(f"{k.address:08x}: {k.mnemonic:10} {k.op_str}")
for base in (0x40cbd8,0x40cbf0,0x40cc10):
 print("=== TABLE",hex(base))
 for k in range(-2,18):
  p=base+8*k;t=rel.get(p)
  print("  slot",f"{k*8:+#x}","loc",hex(p),"ptr",hex(t) if t else "-")
 print("RTTI",rel.get(base-8))
for a,b in [(0x3193e0,0x31955c),(0x11be38,0x11bf50),(0x11b80c,0x11b8e0)]:
 read(a,b)
