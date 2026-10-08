#!/usr/bin/env python3
"""Checkpoint 122: provenance of the packed source-preview/thumbnail dimensions."""
import struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
src=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
    e=ELFFile(f)
    maps=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def off(addr):
    for lo,hi,p,fl in maps:
        if lo<=addr<hi:return p+addr-lo
    raise ValueError(hex(addr))
d=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def dump(a,b):
    print("=== BLOCK",hex(a),hex(b))
    for x in d.disasm(src[off(a):off(b-4)+4],a):
        print(f"{x.address:08x} {x.mnemonic:10} {x.op_str}")
def callers(t):
    hits=[]
    for lo,hi,p,fl in maps:
        if not fl&1:continue
        for q in range(p,p+hi-lo-3,4):
            w=struct.unpack_from("<I",src,q)[0]
            if w>>26!=0b100101:continue
            v=w&0x3ffffff
            if v&(1<<25):v-=1<<26
            call=lo+q-p
            if call+4*v==t:hits.append(call)
    print("=== CALLERS",hex(t),[hex(h) for h in hits])
    for h in hits[:14]:
        dump(h-0x50,h+0x18)
for a,b in [(0x10f060,0x10f210),(0x10f310,0x10f3e0),(0x11ccf4,0x11ce00)]:
    dump(a,b)
for t in (0x10f310,0x10f1a0,0x11ccf4):
    callers(t)
