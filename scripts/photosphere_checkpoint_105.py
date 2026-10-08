#!/usr/bin/env python3
"""Checkpoint 105: read-only ARM64 GammaAdjuster native consumer audit."""
import os, struct
from collections import Counter,defaultdict
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection

track=os.environ["TRACK"]; data=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as inp:
    elf=ELFFile(inp)
    loads=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in elf.iter_segments() if p["p_type"]=="PT_LOAD"]
    relative={}
    for sec in elf.iter_sections():
        if isinstance(sec,RelocationSection):
            for r in sec.iter_relocations():
                if r.is_RELA() and r["r_info_type"]==1027:relative[int(r["r_offset"])]=int(r["r_addend"])
def fileoff(a):
    for lo,hi,at,fl in loads:
        if lo<=a<hi:return at+a-lo
    raise ValueError(hex(a))
md=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def read(start,end):
    return list(md.disasm(data[fileoff(start):fileoff(end-4)+4],start))
def ins(s):return f"{s.address:08x}: {s.mnemonic:9s} {s.op_str}"
def view(name,start,end,filter_mode="calls",max_lines=450):
    arr=read(start,end)
    print(f"=== {name} [{start:#x},{end:#x}) instructions={len(arr)} ===")
    print("ALL_DIRECT_CALLS",[(hex(x.address),x.op_str) for x in arr if x.mnemonic in ("bl","blr","br")][:280])
    print("ALL_VTABLE_LOADS",[(hex(x.address),x.op_str) for x in arr if x.mnemonic=="ldr" and ("[x8," in x.op_str or "[x9," in x.op_str or "[x10," in x.op_str) and "#" in x.op_str][:230])
    if filter_mode=="all":
        for a in arr[:max_lines]:print(ins(a))
    elif filter_mode=="calls":
        indices=[i for i,a in enumerate(arr) if a.mnemonic in ("blr","br") or (a.mnemonic=="bl" and not any(t in a.op_str for t in ["0x3f19f4","0x3fbc00","0x3fbb60","0x3f1a98"]))]
        emitted=set()
        for i in indices[:90]:
            for k in range(max(0,i-11),min(len(arr),i+10)):
                if k not in emitted:print(ins(arr[k]));emitted.add(k)
        print("EMITTED_CALL_NEIGHBOR_ROWS",len(emitted))
    elif filter_mode=="math":
        indices=[i for i,a in enumerate(arr) if a.mnemonic.startswith(("f","fc")) or a.mnemonic in ("blr","bl")]
        keep=[]
        for i in indices:
            if len(keep)>max_lines:break
            keep.append(ins(arr[i]))
        print("\n".join(keep))
def pointers_to(targets):
    for t in targets:
        refs=[a for a,v in relative.items() if v==t]
        print(f"RELOCS_TO_{t:#x}",[hex(a) for a in refs[:55]],"COUNT",len(refs))
if track=="constructor":
    view("sphere constructor post-lattice",0x340bfc,0x3415d0,"calls")
    view("sphere constructor final",0x3415d0,0x341dc0,"calls")
    pointers_to([0x340994,0x341048,0x341dc0,0x39a19c])
elif track=="image-consumer":
    view("native gamma matrix producer near constructor",0x340c00,0x340f30,"all",210)
    view("consumer middle",0x340f30,0x3412a0,"all",220)
    view("constructor callback windows",0x3412a0,0x3415d0,"calls")
elif track=="gamma-interface":
    view("gamma-wrapper and initializer",0x341dc0,0x3420f0,"calls")
    view("gamma renderer-constructor",0x39a19c,0x39a3e0,"calls")
    view("actual thumbnail aligned selector",0x31c618,0x31cbf0,"calls")
    for b in (0x40ec68,0x40ec08,0x40ecb0):
        print(f"VTABLE_{b:#x}",[hex(relative.get(b+8*i,0)) for i in range(-2,10)])
else:raise SystemExit(track)
