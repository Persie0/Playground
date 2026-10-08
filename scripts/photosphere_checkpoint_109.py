#!/usr/bin/env python3
"""Checkpoint 109: pinned ARM64 InMemoryImageAccessor projection slots."""
import os,struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
raw=Path("liblightcycle.so").read_bytes();which=os.environ["TRACK"]
with open("liblightcycle.so","rb") as file:
    elf=ELFFile(file)
    segs=[(p["p_vaddr"],p["p_vaddr"]+p["p_filesz"],p["p_offset"],p["p_flags"]) for p in elf.iter_segments() if p["p_type"]=="PT_LOAD"]
    rel={int(r["r_offset"]):int(r["r_addend"]) for s in elf.iter_sections() if isinstance(s,RelocationSection) for r in s.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
def off(a):
    for lo,hi,base,fl in segs:
        if lo<=a<hi:return base+a-lo
    raise ValueError(hex(a))
cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def dump(start,end):
    print(f"=== CODE {start:#x}..{end:#x}")
    for i in cs.disasm(raw[off(start):off(end-4)+4],start):
        print(f"{i.address:08x} {i.mnemonic:10} {i.op_str}")
if which=="methods":
    for a,b in [(0x346d4c,0x346e28),(0x346e28,0x346f70),(0x3467e8,0x34686c),(0x345fb0,0x345ff4)]:
        dump(a,b)
elif which=="vtable":
    for b in [0x40dc10,0x40dcf8,0x40dd58]:
        print(f"=== VTABLE ADDRESS_POINT {b:#x}")
        for n in range(-3,27):
            at=b+8*n;v=rel.get(at);o=raw[off(at):off(at)+8]
            print(f"at {at:#x} slot {n*8:+#x} reloc={hex(v) if v else '-'} raw={o.hex()}")
        typ=rel.get(b-8)
        nm=rel.get(typ+8) if typ else None
        print("RTTI",hex(typ) if typ else None,hex(nm) if nm else None,raw[off(nm):off(nm)+90].split(b"\x00",1)[0] if nm else None)
else: raise ValueError(which)
