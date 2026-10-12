#!/usr/bin/env python3
"""Original Google Camera lens correction vtable identification (October 12)."""
import os,re
from pathlib import Path
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
track=os.environ["TRACK"];blob=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 seg=[(int(s["p_vaddr"]),int(s["p_vaddr"]+s["p_filesz"]),int(s["p_offset"]),int(s["p_flags"])) for s in e.iter_segments() if s["p_type"]=="PT_LOAD"]
 rel={int(r["r_offset"]):int(r["r_addend"]) for s in e.iter_sections() if isinstance(s,RelocationSection) for r in s.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
def loc(a):
 for lo,hi,p,fl in seg:
  if lo<=a<hi:return p+a-lo
 raise ValueError(hex(a))
def str_at(a):
 try:return blob[loc(a):loc(a)+160].split(b"\0")[0].decode("utf-8","replace")
 except:return ""
def is_code(a):
 return isinstance(a,int) and any(lo<=a<hi and fl&1 for lo,hi,p,fl in seg)
if track=="lens-rtti":
 seen=set()
 for p in sorted(rel):
  ti=rel.get(p-8)
  if ti is None:continue
  nameptr=rel.get(ti+8)
  if nameptr is None:continue
  typename=str_at(nameptr)
  if not re.search("distort|correct|radial|lens|fisheye|linearcamera|undistor|camera",typename,re.I):continue
  if not any(is_code(rel.get(p+idx)) for idx in (0,8,16,24,32,40)):continue
  if (p,typename) in seen:continue
  seen.add((p,typename))
  print("MODEL_VPTR",hex(p),"RTTI",typename,"METHODS",
    [(hex(idx),hex(rel[p+idx])) for idx in (0,8,16,24,32,40,48,0x80,0x88) if p+idx in rel])
 print("TOTAL_MATCHED_VTABLES",len(seen))
elif track=="distortion-strings":
 found=0
 for m in re.finditer(rb"[\x20-\x7e]{8,}",blob):
  value=m.group().decode("ascii","replace")
  if re.search(r"distort|undistor|radial|tangential|lens.?correct|image.?correct|brown.?conrady|fisheye.?camera",value,re.I):
   if found<170:print("STRING",hex(m.start()),value[:240])
   found+=1
 print("TOTAL_MATCHED_STRINGS",found)
else:raise SystemExit(track)
