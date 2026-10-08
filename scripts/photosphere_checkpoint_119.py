#!/usr/bin/env python3
"""Checkpoint 119: exact SimpleThumbnailCreator target width at constructor callsites."""
import struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
data=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 seg=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def off(addr):
 for lo,hi,ofs,fl in seg:
  if lo<=addr<hi:return ofs+addr-lo
 raise ValueError(hex(addr))
ds=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
targets=(0x319308,0x3193fc,0x30aee4)
for target in targets:
 print("=== DIRECT CALLS TO",hex(target))
 hits=[]
 for lo,hi,ofs,fl in seg:
  if fl&1==0:continue
  for p in range(ofs,ofs+hi-lo-3,4):
   w=struct.unpack_from("<I",data,p)[0]
   if w>>26!=0b100101:continue
   d=w&0x3ffffff
   if d&(1<<25):d-=1<<26
   addr=lo+p-ofs
   if addr+4*d==target:hits.append(addr)
 print("COUNT",len(hits),"ADDRS",[hex(x) for x in hits])
 for a in hits[:45]:
  print("--- CALLER AT",hex(a),"---")
  for ins in ds.disasm(data[off(a-0x80):off(a+0x28)],a-0x80):
   print(f"{ins.address:08x} {ins.mnemonic:9} {ins.op_str}")
