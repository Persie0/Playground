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
 # Explicit skip-data is mandatory: executable PT_LOAD starts before the native
# function section and a sequential Capstone stream otherwise stops at padding.
cs.skipdata=True
for lo,hi,b,fl in seg:
 if not fl&1:continue
 count=0
 for it in cs.disasm(src[b:b+hi-lo],lo):
  if it.mnemonic!="adrp" or not any(pg in it.op_str for pg in targetpages):continue
  near=list(cs.disasm(src[off(it.address):off(it.address)+110],it.address))
  markers=[z for z in near[1:24] if any(q in z.op_str for q in ("#0xc8","#0x10c")) and z.mnemonic in ("add","ldr","str")]
  if not markers:continue
  count+=1
  print("=== GLOBAL_CANDIDATE",hex(it.address),"===")
  print("MARKERS",[(hex(z.address),z.mnemonic,z.op_str) for z in markers])
  for z in near[:25]:print(f"ASM {z.address:#010x} {z.mnemonic:8} {z.op_str}")
 print("ADRP_REFERENCE_REGION",hex(lo),hex(hi),"TOTAL_CANDIDATE_ADDRESSES",count)
print("=== STITCH_SESSION_CREATOR ===")
for i in cs.disasm(src[off(0x340560):off(0x340840)],0x340560):
 print(f"ASM {i.address:#010x} {i.mnemonic:8} {i.op_str}")
