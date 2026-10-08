#!/usr/bin/env python3
"""Checkpoint 102: read-only, independently repeatable native LightCycle audit."""
import os
import struct
from collections import defaultdict
from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection

TRACK=os.environ["TRACK"]
binary=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
    elf=ELFFile(f)
    loads=[(p["p_vaddr"],p["p_vaddr"]+p["p_filesz"],p["p_offset"],p["p_flags"]) for p in elf.iter_segments() if p["p_type"]=="PT_LOAD"]
    relocs={}
    types=defaultdict(int)
    for section in elf.iter_sections():
        if not isinstance(section,RelocationSection):continue
        for r in section.iter_relocations():
            types[r["r_info_type"]]+=1
            if not r.is_RELA():continue
            if r["r_info_type"]==1027:relocs[r["r_offset"]]=r["r_addend"]
def off(a):
    for lo,hi,at,flags in loads:
        if lo<=a<hi:return at+a-lo
    raise ValueError(f"unmapped VA {a:#x}")
def executable(addr):
    return any(lo<=addr<hi and (fl&1) for lo,hi,at,fl in loads)
d=Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
print(f"TRACK={TRACK} PT_LOAD={len(loads)} RELATIVE_RELOCS={len(relocs)} ALL_RELOC_TYPES={dict(types)}")
def disasm(label,start,end,maxrows=999):
    print(f"=== {label} RAW [{start:#x},{end:#x}) ===")
    arr=list(d.disasm(binary[off(start):off(end-4)+4],start))
    print(f"INSTRUCTIONS={len(arr)}")
    for v in arr[:maxrows]:
        print(f"{v.address:08x}: {v.mnemonic:9} {v.op_str}")
def direct_calls(targets):
    print("=== DIRECT_BL_REFS (does not find BR,BLR,B) ===")
    targets=set(targets)
    hits=defaultdict(list)
    for lo,hi,at,flags in loads:
        if not flags&1:continue
        view=memoryview(binary)[at:at+(hi-lo)]
        for n in range(0,len(view)-3,4):
            ins=struct.unpack_from("<I",view,n)[0]
            if (ins>>26)!=0b100101:continue
            disp=ins&0x3ffffff
            if disp&(1<<25):disp-=(1<<26)
            t=lo+n+disp*4
            if t in targets:hits[t].append(lo+n)
    for t in sorted(targets):
        print(f"BL_TO {t:#x}: {[hex(x) for x in hits[t][:80]]} count={len(hits[t])}")

if TRACK=="flow-virtual-table":
    # Detect relocation-backed contiguous C++ vtable method tables. A base
    # is a *candidate* until constructor/typeinfo identity is resolved.
    candidates=[]
    for base in sorted(relocs):
        add=[relocs.get(base+8*i) for i in range(7)]
        if any(v is None or not executable(v) for v in add[:6]):continue
        # Ghidra flow object vptr +0x10/+0x18/+0x20/+0x28/+0x30
        scores=sum(0x0e0000<=v<0x140000 for v in add[:6])
        if scores>=2:
            candidates.append((scores,base,add))
    candidates.sort(key=lambda v:(-v[0],v[1]))
    print(f"ALL_CANDIDATES={len(candidates)}")
    for score,base,add in candidates[:130]:
        print(f"VPTR_CANDIDATE base={base:#x} nearby_flow={score} methods={[hex(x) if x is not None else None for x in add]}")
    disasm("FLOW_COORDINATOR virtual dispatch",0x0ffc30,0x0ffed0)
    disasm("THREE_FLOAT_ROWS AND GRAY RESIDUAL",0x0ffb70,0x0ffc30)
    direct_calls([0x0ff7dc,0x0ffab0,0x0ffc30,0x0fff14,0x0fdcc0,0x0fdf50])
elif TRACK=="gamma-accessors":
    disasm("GAMMA_STAGE_FACTORY",0x31c600,0x31c7f0)
    disasm("GAMMA_SPHERE_GENERATOR",0x340994,0x340c10)
    disasm("GAMMA_ANALYSIS_NEIGHBOR",0x3404ec,0x340994)
    disasm("GAMMA_FACTORY_AND_INITIALIZER",0x341dc0,0x341fb0)
    disasm("GAMMA_POSTPROCESSOR",0x39a19c,0x39a35c)
    direct_calls([0x3404ec,0x340994,0x341dc0,0x39a19c,0x39a3a0,0x31c618,0x341048])
    print("=== RELOCATION_REFERENCES_GAMMA_FUNCTIONS ===")
    for addr in [0x3404ec,0x340994,0x341dc0,0x39a19c,0x341048]:
        found=[hex(loc) for loc,v in relocs.items() if v==addr]
        print(f"RELOC_REFERENCING {addr:#x}: {found[:60]} count={len(found)}")
elif TRACK=="metadata-writer-graph":
    disasm("SESSION_WRITER",0x319b74,0x319d38)
    disasm("SESSION_NAME_CONSTRUCTOR",0x31aa40,0x31ab40)
    disasm("SESSION_ROOT_CONSTRUCTOR",0x3195c8,0x3196f0)
    disasm("SESSION_CONTEXT",0x11a240,0x11a410)
    # This is restricted to direct branch-and-link references; vtables are separate.
    direct_calls([0x3195c8,0x319b74,0x319d40,0x31aa40,0x31a9a8])
    for base in [0x40cc50,0x40cc48,0x40cc68]:
        print(f"KNOWN_VPTR base={base:#x}: {[hex(relocs[base+8*i]) if base+8*i in relocs else None for i in range(14)]}")
    for needle in [b"session.meta",b"source_photos_count",b"orientations.txt",b"ground_truth.txt"]:
        ix=binary.find(needle)
        print(f"STRING {needle!r} at_file_offset={ix:#x}, repeats={binary.count(needle)}")
else:
    raise SystemExit(f"bad TRACK: {TRACK}")
