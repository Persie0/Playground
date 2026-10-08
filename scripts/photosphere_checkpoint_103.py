#!/usr/bin/env python3
"""Checkpoint 103: locate concrete vptr address-takes, RTTI and live flow caller."""
import struct
from collections import defaultdict
from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection

p=Path("liblightcycle.so"); b=p.read_bytes()
with p.open("rb") as fh:
    elf=ELFFile(fh)
    segs=[(x["p_vaddr"],x["p_vaddr"]+x["p_filesz"],x["p_offset"],x["p_flags"]) for x in elf.iter_segments() if x["p_type"]=="PT_LOAD"]
    reloc={}
    for s in elf.iter_sections():
        if isinstance(s,RelocationSection):
            for r in s.iter_relocations():
                if r.is_RELA() and r["r_info_type"]==1027:reloc[r["r_offset"]]=r["r_addend"]
def off(va):
    for a,z,start,flags in segs:
        if a<=va<z:return start+va-a
    raise ValueError(hex(va))
def chars(va,n=120):
    try:
        data=b[off(va):off(va)+n]
        return data.split(b"\0",1)[0].decode("utf-8","replace")
    except Exception as exc:return f"<bad {exc}>"
cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
base=0x3fd398
print("=== PROPOSED_FLOW_VPTR ===")
for j in range(-2,9):
    at=base+j*8
    v=reloc.get(at)
    print(f"entry[{j}]=offset {at:#x}, RELATIVE={v:#x}" if v is not None else f"entry[{j}]=offset {at:#x}, raw={struct.unpack_from('<Q',b,off(at))[0]:#x}")
info=reloc.get(base-8)
if info is not None:
    print(f"rtti_ptr {info:#x}, vptr_slot={reloc.get(info)}, rtti_name_ptr={reloc.get(info+8)}, rtti_name={chars(reloc.get(info+8)) if reloc.get(info+8) else '<none>'}")
print("=== RELOC_POINTERS_TO_CANDIDATE_VPTR ===")
for at,v in reloc.items():
    if v in [base,base-8,base-16]:
        print(hex(at),"->",hex(v))
print("=== VTABLES_WITH_SAME_FIVE_METHODS ===")
for at,v in reloc.items():
    if v not in [0xfd76c,0xfdcc0]:continue
    for cand in (at-0x10,at-0x18):
        print(f"method {v:#x} is slot={at-cand:#x} for proposed-base {cand:#x}; slots {[hex(reloc.get(cand+8*i,0)) for i in range(7)]}")
print("=== ADRP+ADD USES OF VTABLE BASE (literal matching, not full def/use proof) ===")
wanted_page=base&~0xfff
wanted_low=base&0xfff
arr=[]
for low,hi,fileoff,flags in segs:
    if not flags & 1:continue
    for ins in cs.disasm(b[fileoff:fileoff+(hi-low)],low):arr.append(ins)
n=0
for i,ins in enumerate(arr):
    if ins.mnemonic!="adrp" or f"#0x{wanted_page:x}" not in ins.op_str:continue
    reg=ins.op_str.split(",")[0].strip()
    for follower in arr[i+1:i+9]:
        if follower.address>ins.address+32:break
        if follower.mnemonic in ("add","ldr") and f"#0x{wanted_low:x}" in follower.op_str and reg in follower.op_str:
            n+=1
            print(f"materialization #{n}: {ins.address:#x} {ins.mnemonic} {ins.op_str}; {follower.address:#x} {follower.mnemonic} {follower.op_str}")
            for a in arr[max(0,i-5):min(len(arr),i+12)]:
                print(f"  {a.address:08x}: {a.mnemonic:9} {a.op_str}")
            if n>=24:break
    if n>=24:break
print("materialization_count",n)
for name,start,end in [
    ("FLOW_CALLER",0xf43b0,0xf4520),
    ("FLOW_BUILDER_AND_UNPROJECT",0xfd76c,0xfd9ac),
    ("FLOW_JACOBIAN",0xfdcc0,0xfdef0),
    ("VIRTUAL_OPTICAL_UPDATE",0xffd90,0xffec0),
]:
    print(f"=== {name} [{start:#x},{end:#x}) ===")
    inst=list(cs.disasm(b[off(start):off(end-4)+4],start))
    for item in inst[:260]:
        print(f"{item.address:08x} {item.mnemonic:8} {item.op_str}")
