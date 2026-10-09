#!/usr/bin/env python3
"""Checkpoint 156: JNI finalization/restoration boundary across original liblightcycle.so."""
from pathlib import Path
import struct
from elftools.elf.elffile import ELFFile
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
blob=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 seg=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
 symbols=[]
 for sh in e.iter_sections():
  if sh["sh_type"]=="SHT_DYNSYM":
   for sy in sh.iter_symbols():
    if any(t in sy.name for t in ("FinishCapture","CreateNewStitchingSession","RenderNextSession","SetOutputResolution","AddExistingSession")):
     symbols.append((sy.name,int(sy["st_value"]),int(sy["st_size"])))
def off(a):
 for l,h,b,fl in seg:
  if l<=a<h:return b+a-l
 raise ValueError(hex(a))
cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
print("TRACK jni-finish-156")
for name,addr,size in sorted(symbols,key=lambda x:x[1]):
 print("JNI_SYMBOL",hex(addr),"SIZE",size,"NAME",name)
 if not any(t in name for t in ("FinishCapture","CreateNewStitchingSession","RenderNextSession")):continue
 window=min(size if size>0 else 480,1300)
 end=addr+window
 print("=== BODY",name,hex(addr),hex(end),"===")
 for ins in cs.disasm(blob[off(addr):off(end-4)+4],addr):
  print("ASM",hex(ins.address),ins.mnemonic,ins.op_str)
