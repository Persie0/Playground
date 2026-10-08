#!/usr/bin/env python3
"""Checkpoint 121: native Photo Sphere default thumb-width stored in stack options struct."""
import struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
raw=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 spans=[(p["p_vaddr"],p["p_vaddr"]+p["p_filesz"],p["p_offset"]) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def off(a):
 for lo,hi,pos in spans:
  if lo<=a<hi:return pos+a-lo
 raise ValueError(hex(a))
d=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
for start,end in [(0x10f200,0x10f374),(0x10f374,0x10f3d0),(0x1ed84c,0x1ed980),(0x11ccf4,0x11ce30)]:
 print("=== NATIVE",hex(start),hex(end))
 for i in d.disasm(raw[off(start):off(end-4)+4],start):
  print(f"{i.address:08x} {i.mnemonic:10} {i.op_str}")
