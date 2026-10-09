#!/usr/bin/env python3
"""Checkpoint 158: scan original ARM64 render-manager global references.
Raw ELF addresses. Scan executable segments across alignment/data padding.
"""
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
src=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 elf=ELFFile(f)
 seg=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),
       int(p["p_offset"]),int(p["p_flags"]))
      for p in elf.iter_segments() if p["p_type"]=="PT_LOAD"]
def off(a):
 for lo,hi,b,fl in seg:
  if lo<=a<hi:return b+a-lo
 raise ValueError(hex(a))
cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
cs.skipdata=True
print("TRACK stitcher-manager-158")
for lo,hi,b,fl in seg:
 if not fl&1:continue
 count=0
 for it in cs.disasm(src[b:b+hi-lo],lo):
  if it.mnemonic!="adrp":continue
  if "#0x417000" not in it.op_str and "#0x412000" not in it.op_str:continue
  start=it.address
  try:near=list(cs.disasm(src[off(start):off(start)+105],start))
  except ValueError:continue
  matches=[z for z in near[1:23] if z.mnemonic in ("add","ldr","str")
           and ("#0xc8" in z.op_str or "#0x10c" in z.op_str)]
  if not matches:continue
  count+=1
  print("=== GLOBAL_CANDIDATE",hex(start),"===")
  print("MARKERS",[(hex(z.address),z.mnemonic,z.op_str) for z in matches])
  for z in near[:24]:
   print(f"ASM {z.address:#010x} {z.mnemonic:8} {z.op_str}")
 print("ADRP_REFERENCE_REGION",hex(lo),hex(hi),"TOTAL_CANDIDATE_ADDRESSES",count)
print("=== STITCH_SESSION_CREATOR ===")
for it in cs.disasm(src[off(0x340560):off(0x340840)],0x340560):
 print(f"ASM {it.address:#010x} {it.mnemonic:8} {it.op_str}")
