#!/usr/bin/env python3
"""Checkpoint 118: locate precise SimpleThumbnailCreator target-width initializer and resize kernel."""
import os,struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
part=os.environ["TRACK"];src=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 chunks=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def off(a):
 for lo,hi,ofs,_ in chunks:
  if lo<=a<hi:return ofs+a-lo
 raise ValueError(hex(a))
ds=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN);ds.skipdata=True
def dump(lo,hi):
 print("=== SOURCE",hex(lo),hex(hi))
 for s in ds.disasm(src[off(lo):off(hi-4)+4],lo):
  print(f"{s.address:08x} {s.mnemonic:9} {s.op_str}")
if part=="creator":
 for a,b in [(0x319200,0x3192e0),(0x3192e0,0x3193c0),(0x11bffc,0x11c1d0),(0x3193fc,0x31947c)]:dump(a,b)
 print("=== STORES INTO CREATOR FIELD +8 / VPTR 0x40cbd8")
 for lo,hi,ofs,flag in chunks:
  if not(flag&1):continue
  data=src[ofs:ofs+hi-lo]
  for k in range(0,len(data)-12,4):
   # AARCH64 add xD,xN,#0xbd8
   ins=list(ds.disasm(data[k:k+4],lo+k))
   if not ins or ins[0].mnemonic!="add" or "#0xbd8" not in ins[0].op_str:continue
   p=lo+k
   print("CANDIDATE_CTOR",hex(p))
   dump(max(lo,p-0x28),min(hi,p+0x60))
elif part=="resize":
 for a,b in [(0x117b10,0x117d50),(0x117658,0x1177b0),(0xf0b28,0xf0c28)]:dump(a,b)
else:raise SystemExit(part)
