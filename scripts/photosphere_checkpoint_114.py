#!/usr/bin/env python3
"""Checkpoint 114: find concrete Photo Sphere RLE fill callsites via ARM64 vtable dispatch."""
import os,struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
track=os.environ["TRACK"];src=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 loads=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def fileoffset(a):
 for lo,hi,ofs,fl in loads:
  if lo<=a<hi:return ofs+a-lo
 raise ValueError(hex(a))
ds=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def dd(a,b):
 print("=== CODE",hex(a),hex(b))
 for i in ds.disasm(src[fileoffset(a):fileoffset(b-4)+4],a):
  print(f"{i.address:08x}: {i.mnemonic:9} {i.op_str}")
def discover():
 print("=== VIRTUAL PLUS 0x58 NEAR BLR ===")
 hits=0
 for lo,hi,off,flags in loads:
  if not flags&1:continue
  data=memoryview(src)[off:off+hi-lo]
  # register agnostic opcode match for 64-bit LDR Rt,[Rn,#0x58]
  # Native AArch64 LDR unsigned scaled uses 64-bit 0xf9402c00 | (Rn<<5)|Rt
  for k in range(0,len(data)-4,4):
   word=struct.unpack_from("<I",data,k)[0]
   if word & 0xfffffc00 != 0xf9402c00:continue
   dest=word & 31
   vaddr=lo+k
   if vaddr+40>hi:continue
   nearby=list(ds.disasm(bytes(data[k:k+48]),vaddr))
   indirect=[q for q in nearby[1:11] if q.mnemonic=="blr" and q.op_str==f"x{dest}"]
   if not indirect:continue
   lookbegin=max(lo,vaddr-0x48)
   before=list(ds.disasm(src[fileoffset(lookbegin):fileoffset(vaddr)+4],lookbegin))
   encoded=[s for s in before if s.mnemonic in ("mov","movz","movn","orr") and any(t in s.op_str for t in ("w2, #1","w2, #0x64","w3, #1","w3, #0x64"))]
   hits+=1
   if hits<=140:
    print("SITE",hex(vaddr),"BLR",hex(indirect[0].address),"REGISTER",dest,"POSSIBLE_FILL",[(hex(t.address),t.mnemonic,t.op_str) for t in encoded[-4:]])
    for s in nearby[:9]:print(f"  {s.address:08x}: {s.mnemonic} {s.op_str}")
 print("TOTAL_MATCHING_DISPATCH_SITES",hits)
if track=="find-mask-consumers":
 discover()
elif track=="rle-code":
 dd(0x39ce64,0x39d014)
 dd(0x32114c,0x3212b8)
 dd(0x31df08,0x31e054)
else:raise SystemExit(track)
