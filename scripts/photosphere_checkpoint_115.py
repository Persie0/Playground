#!/usr/bin/env python3
"""Checkpoint 115: targeted vtable +0x58 RLE candidate callsite provenance."""
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 segments=[(p["p_vaddr"],p["p_vaddr"]+p["p_filesz"],p["p_offset"]) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
blob=Path("liblightcycle.so").read_bytes();d=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def off(a):
 for l,h,x in segments:
  if l<=a<h:return x+a-l
 raise ValueError(hex(a))
for name,start,end in [
 ("stitcher-render-bounds-fill100",0x31e19c,0x31e210),
 ("seam-regions-fill1",0x33608c,0x336128),
 ("seam-masks-fill1-a",0x337370,0x33741c),
 ("seam-masks-fill1-b",0x337668,0x337708),
 ("graph-label-fill100-a",0x33b794,0x33b850),
 ("blender-mask-consumer",0x321d00,0x321d78),
 ("source-coverage",0x332d00,0x332d7c)
]:
 print("=== SITE",name,hex(start),hex(end))
 for ins in d.disasm(blob[off(start):off(end-4)+4],start):
  print(f"{ins.address:08x} {ins.mnemonic:9} {ins.op_str}")
