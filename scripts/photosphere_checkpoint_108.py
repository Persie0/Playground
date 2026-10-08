#!/usr/bin/env python3
"""Checkpoint 108: Gamma image accessor RTTI candidates and pairwise math."""
import os,struct,re
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
track=os.environ["TRACK"]; raw=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
    elf=ELFFile(f)
    segments=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in elf.iter_segments() if p["p_type"]=="PT_LOAD"]
    reloc={int(r["r_offset"]):int(r["r_addend"]) for sec in elf.iter_sections() if isinstance(sec,RelocationSection) for r in sec.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
def pos(a):
    for lo,hi,at,fl in segments:
        if lo<=a<hi:return at+a-lo
    raise ValueError(hex(a))
def executable(a):
    return any(lo<=a<hi and fl&1 for lo,hi,at,fl in segments)
def cstr(a):
    try:return raw[pos(a):pos(a)+150].split(b"\0",1)[0].decode("utf8","replace")
    except:return ""
cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def output(name,a,b):
    print(f"=== {name} {a:#x}..{b:#x} ===")
    for x in cs.disasm(raw[pos(a):pos(b-4)+4],a):
        print(f"{x.address:08x} {x.mnemonic:10} {x.op_str}")
if track=="rtti":
    target=0x40dcf8
    print("KNOWN_SOURCE_JPEG_FILE_ACCESSOR",hex(target))
    for o in range(0,0xb8,8):
        v=reloc.get(target+o)
        print(f"METHOD +0x{o:x} => {hex(v) if v is not None else 'none'}")
    named=[]
    alltyped=0
    for base in sorted(reloc):
        if base-8 not in reloc or base-16 not in reloc and struct.unpack_from("<Q",raw,pos(base-16))[0] != 0:continue
        typ=reloc[base-8]
        ptr=reloc.get(typ+8)
        name=cstr(ptr) if ptr else ""
        if not name.startswith(("N","St","P","K","1","2","3","4","5")):continue
        m18=reloc.get(base+0x18)
        m48=reloc.get(base+0x48)
        m98=reloc.get(base+0x98)
        ma0=reloc.get(base+0xa0)
        if not all(executable(x) for x in (m18,m48,m98,ma0) if x is not None):continue
        if not (m18 is not None and m48 is not None and m98 is not None and ma0 is not None):continue
        alltyped+=1
        if any(n in name.lower() for n in ("image","camera","source","access","thumb","panor","mosaic","render","photo","lightcycle")):
            named.append((base,name,m18,m48,m98,ma0))
    print("TYPED_TABLES_WITH_REQUIRED_VIRTUAL_OFFSETS",alltyped,"MATCHING_NAME",len(named))
    for base,name,m18,m48,m98,ma0 in named[:110]:
        print(f"MODEL vptr={base:#x} name={name} +0x18={m18:#x} +0x48={m48:#x} +0x98={m98:#x} +0xa0={ma0:#x}")
    print("APPROX_REFS_TO_PROJECTION_METHODS")
    for base,name,m18,m48,m98,ma0 in named[:30]:
        refs={x:[] for x in (m18,m48,m98,ma0)}
        for r,v in reloc.items():
            if v in refs and r!=base+0x18 and r!=base+0x48 and r!=base+0x98 and r!=base+0xa0:refs[v].append(r)
        print(name,hex(base),{hex(x):[hex(r) for r in rows[:5]] for x,rows in refs.items() if rows})
elif track=="pairmath":
    output("pair normalization from integer-count sum",0x3412c4,0x3415d0)
    for a in [0x61870,0x61858,0x61940,0x619c0]:
        if a in [0x61858,0x61940,0x619c0,0x61870]:
            print(f"ORIGINAL_DOUBLE_CONSTANT {a:#x} {struct.unpack_from('<d',raw,pos(a))[0]!r}")
elif track=="gamma-finish":
    output("gamma native final pairwise and normalization",0x3415d0,0x341d9c)
else:raise RuntimeError(track)
