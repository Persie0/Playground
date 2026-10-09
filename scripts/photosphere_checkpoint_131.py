#!/usr/bin/env python3
"""Checkpoint 131: identify original fast RGB8 thumbnail scaler input/output lookup tables."""
import os,struct
from pathlib import Path
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
track=os.environ["TRACK"];data=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 seg=[(int(s["p_vaddr"]),int(s["p_vaddr"]+s["p_filesz"]),int(s["p_offset"]),int(s["p_flags"])) for s in e.iter_segments() if s["p_type"]=="PT_LOAD"]
 rel={int(r["r_offset"]):int(r["r_addend"]) for s in e.iter_sections() if isinstance(s,RelocationSection) for r in s.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
 sections=[(s.name,int(s["sh_addr"]),int(s["sh_size"])) for s in e.iter_sections()]
def off(a):
 for lo,hi,p,f in seg:
  if lo<=a<hi:return p+a-lo
 return None
def val(a,n=64):
 pos=off(a)
 return data[pos:pos+n] if pos is not None else None
def section(a):
 return next((n for n,b,k in sections if b<=a<b+k),"<unmapped>")
if track=="lut-objects":
 for a in (0x4148f0,0x4148f8,0x414900,0x4148e8,0x4148e0,0x6205a0):
  r=rel.get(a)
  raw=val(a,64)
  print("LOOKUP_PTR",hex(a),"SECTION",section(a),"RELOC",hex(r) if r is not None else "-","RAW",raw.hex() if raw else None)
  if r is not None:
   d=val(r,256)
   print("TARGET",hex(r),"SECTION",section(r),"HEX256",d.hex() if d else None)
   if d and len(d)>=64:
    print("TARGET_I32",list(struct.unpack_from("<16I",d,0)))
 print("DATA_SECTIONS",[x for x in sections if x[0] in (".data",".bss",".rodata",".data.rel.ro")])
elif track=="lut-references":
 C=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
 for lo,hi,base,flags in seg:
  if not flags&1:continue
  # Find loaded +0x8f0 or +0x8f8 table pointers from module page 0x414000.
  for k in range(base,base+hi-lo-4,4):
   ins=list(C.disasm(data[k:k+4],lo+k))
   if not ins or ins[0].mnemonic!="adrp" or "#0x414000" not in ins[0].op_str:continue
   block=list(C.disasm(data[k:k+124],lo+k))
   match=[x for x in block[1:24] if x.mnemonic in ("ldr","str","ldp","stp") and
      ("#0x8f0" in x.op_str or "#0x8f8" in x.op_str)]
   if not match:continue
   print("REFERENCE",hex(lo+k))
   for ins in block[:24]:print(hex(ins.address),ins.mnemonic,ins.op_str)
else:raise SystemExit(track)
