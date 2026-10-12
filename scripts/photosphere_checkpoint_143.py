#!/usr/bin/env python3
"""Checkpoint 143: narrow native lens correction setter and seam unit-mask ownership."""
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
b=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 seg=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def off(addr):
 for lo,hi,p in seg:
  if lo<=addr<hi:return p+addr-lo
 raise ValueError(hex(addr))
D=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def dump(a,z):
 print("=== BLOCK",hex(a),hex(z))
 for x in D.disasm(b[off(a):off(z-4)+4],a):
  print(f"{x.address:08x}: {x.mnemonic:10} {x.op_str}")
for a,z in [(0x3315b8,0x3316d0),(0x331a68,0x331b54),(0x331d20,0x331dc0),
 (0x33442c,0x33453c),(0x33605c,0x3360ec)]:
 dump(a,z)
