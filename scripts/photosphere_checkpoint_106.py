#!/usr/bin/env python3
"""Checkpoint 106 focused isolated ARM64 gamma sampling implementation audit."""
import os,struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
track=os.environ["TRACK"]; raw=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
    elf=ELFFile(f)
    segments=[(p["p_vaddr"],p["p_vaddr"]+p["p_filesz"],p["p_offset"],p["p_flags"]) for p in elf.iter_segments() if p["p_type"]=="PT_LOAD"]
    reloc={r["r_offset"]:r["r_addend"] for sec in elf.iter_sections() if isinstance(sec,RelocationSection) for r in sec.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
def offset(a):
    for start,end,pos,flag in segments:
        if start<=a<end:return pos+a-start
    raise ValueError(hex(a))
dis=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def window(start,end):
    print("===WINDOW",hex(start),hex(end))
    for ins in dis.disasm(raw[offset(start):offset(end-4)+4],start):
        print(f"{ins.address:08x} {ins.mnemonic:10} {ins.op_str}")
def dval(a):
    return struct.unpack_from("<d",raw,offset(a))[0]
def rval(a):
    return struct.unpack_from("<f",raw,offset(a))[0]
if track=="pixels":
    for start,end in [(0x340d38,0x340db0),(0x340dac,0x340e8c),(0x340e90,0x340fb0),(0x340fb0,0x3411b4),(0x3411b4,0x3412c4)]:
        window(start,end)
    for addr in (0x61940,0x619c0,0x61858):
        print(f"DOUBLE_CONST addr={addr:#x} value={dval(addr):.17g} bits=0x{struct.unpack_from('<Q',raw,offset(addr))[0]:016x}")
elif track=="interfaces":
    for addr in (0x40ec08,0x40ec68,0x40ebd0,0x40ecb0,0x40ecc8):
        print("===RELOCATION_TABLE",hex(addr))
        for i in range(-2,16):
            slot=addr+8*i; v=reloc.get(slot)
            print(f"  offset {8*i:+#x} at {slot:#x}: {hex(v) if v is not None else 'none'}")
    for start,end in [(0x39a2fc,0x39a438),(0x39a438,0x39a548),(0x39a548,0x39a6b8),(0x39a6b8,0x39a77c)]:
        window(start,end)
else:raise RuntimeError(track)
