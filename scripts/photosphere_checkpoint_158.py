#!/usr/bin/env python3
"""Checkpoint 158: find all original native references to rendering manager global
and bridge RenderNextSession into concrete owned object construction. Raw ELF coordinates.
"""
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
import struct
src=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 seg=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def off(a):
 for lo,hi,b,fl in seg:
  if lo<=a<hi:return b+a-lo
 raise ValueError(hex(a))
cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
print("TRACK stitcher-manager-158")
targetpages=["#0x417000","#0x412000"]
for lo,hi,b,fl in seg:
 if not fl&1:continue
 ins=list(cs.disasm(src[b:b+hi-lo],lo))
 found=[]
 for j,it in enumerate(ins):
  if it.mnemonic!="adrp" or not any(pg in it.op_str for pg in targetpages):continue
  nexts=ins[j+1:j+23]
  markers=[z for z in nexts if any(q in z.op_str for q in ("#0xc8","#0x10c","#0x20")) and z.mnemonic in ("add","ldr","str")]
  if any("#0xc8" in z.op_str for z in markers):
   found.append((j,markers))
 print("ADRP_REFERENCE_REGION",hex(lo),hex(hi),"TOTAL_CANDIDATE_ADDRESSES",len(found))
 for j,markers in found[:95]:
  start=max(0,j-3);end=min(len(ins),j+23)
  print("=== GLOBAL_CANDIDATE",hex(ins[j].address),"===")
  for it in ins[start:end]:
   print(f"ASM {it.address:#010x} {it.mnemonic:8} {it.op_str}")
print("=== STITCH_SESSION_CREATOR ===")
for i in cs.disasm(src[off(0x340560):off(0x340840)],0x340560):
 print(f"ASM {i.address:#010x} {i.mnemonic:8} {i.op_str}")
