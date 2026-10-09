#!/usr/bin/env python3
"""Checkpoint 129: exact native fast RGB8 downscale execution and filter weights."""
import os
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
TRACK=os.environ["TRACK"];blob=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as h:
 e=ELFFile(h)
 seg=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def off(a):
 for lo,hi,p in seg:
  if lo<=a<hi:return p+a-lo
 raise ValueError(hex(a))
C=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def dump(a,b):
 print("=== SOURCE",hex(a),hex(b))
 for ins in C.disasm(blob[off(a):off(b-4)+4],a):
  print(f"{ins.address:08x}: {ins.mnemonic:10} {ins.op_str}")
if TRACK=="fast-contract":
 for a,b in [(0x39e5c8,0x39e718),(0x39e91c,0x39e9ac)]:dump(a,b)
elif TRACK=="fast-row-kernel":
 for a,b in [(0x39e718,0x39e91c),(0x39e91c,0x39e9ac)]:dump(a,b)
elif TRACK=="scale-dispatch":
 for a,b in [(0x117b10,0x117bbc),(0x117bbc,0x117f40)]:dump(a,b)
else:raise SystemExit(TRACK)
