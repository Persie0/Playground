#!/usr/bin/env python3
"""Checkpoint 144: recover native pointer-materialization sites for Photo Sphere owners.

Works directly on SHA-pinned ELF and reports ADRP+ADD, ADRP+LDR and GOT
references. A match identifies a *candidate* instruction sequence; inspect
subsequent stores/callers before claiming concrete runtime installation.
"""
import os
import struct
from collections import defaultdict
from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection

track=os.environ["TRACK"]
data=Path("liblightcycle.so").read_bytes()
with Path("liblightcycle.so").open("rb") as fh:
    elf=ELFFile(fh)
    loads=[(int(s["p_vaddr"]),int(s["p_vaddr"]+s["p_filesz"]),
            int(s["p_offset"]),int(s["p_flags"]))
           for s in elf.iter_segments() if s["p_type"]=="PT_LOAD"]
    rel={int(r["r_offset"]):int(r["r_addend"])
         for section in elf.iter_sections() if isinstance(section,RelocationSection)
         for r in section.iter_relocations() if r.is_RELA() and r["r_info_type"]==1027}
targets={
    "rosette":{
        "StandardRosette.vptr":0x40dc10,
        "InMemoryImageAccessor.vptr":0x40dd58,
        "BasicImageAccessor.vptr":0x40ddb0,
        "PipelinedImageAccessor.vptr":0x40ddf0,
        "AdjusterAccessor.vptr":0x40d370,
    },
    "flow":{"CameraRotationModel.vptr":0x3fd398},
    "storage":{"FilePathSessionStorage.vptr":0x40cc50},
}
if track not in targets: raise SystemExit("unknown track: "+track)
direct={v:k for k,v in targets[track].items()}
got=defaultdict(list)
for address,value in rel.items():
    if value in direct: got[address].append(direct[value])
lookup={**direct}
for g,names in got.items():lookup[g]="GOT("+",".join(names)+")"
print("TRACK",track,"TARGETS",targets[track],"GOT",dict(got))
if track == "flow":
    print("FLOW_CTOR_RAW_F32A4_GOT_4120F0",hex(rel[0x4120f0]) if 0x4120f0 in rel else None,
          "OFFSET_PLUS_0X10",hex(rel[0x4120f0]+0x10) if 0x4120f0 in rel else None)
    print("FLOW_RAW_CTOR_SEQUENCE", "ADRP x9, #0x412000; LDR x9,[x9,#0xf0]; ADD x9,x9,#0x10; STR x9,[x10,#0x58]")
def signed(v,bits):
    return v-(1<<bits) if v&(1<<(bits-1)) else v
def adrp(op,pc):
    if op&0x9f000000 != 0x90000000: return None
    immlo=(op>>29)&3
    immhi=(op>>5)&0x7ffff
    imm=signed((immhi<<2)|immlo,21)<<12
    return (op&31),((pc&~4095)+imm)
def add64(op):
    if op&0xff000000 not in (0x91000000,0x91400000):return None
    dst=op&31;src=(op>>5)&31;im=(op>>10)&4095
    return dst,src,im<<(12 if op&(1<<22) else 0)
def ldr64(op):
    if op&0xffc00000!=0xf9400000:return None
    return op&31,(op>>5)&31,((op>>10)&4095)*8
cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
matches=[]
for lo,hi,at,flags in loads:
    if not (flags&1):continue
    count=(hi-lo)//4
    view=memoryview(data)[at:at+(hi-lo)]
    for n in range(count):
        pc=lo+4*n
        x=adrp(struct.unpack_from("<I",view,n*4)[0],pc)
        if x is None:continue
        reg,page=x
        # Compiler commonly splits ADRP and ADD/LDR across a few instructions.
        for j in range(n+1,min(n+7,count)):
            op=struct.unpack_from("<I",view,j*4)[0]
            a=add64(op)
            if a is not None and a[1]==reg:
                dest=page+a[2]
                if dest in lookup:
                    matches.append((pc,lo+j*4,"ADRP+ADD",dest,lookup[dest]))
            l=ldr64(op)
            if l is not None and l[1]==reg:
                dest=page+l[2]
                if dest in lookup:
                    matches.append((pc,lo+j*4,"ADRP+LDR",dest,lookup[dest]))
            # Stop once the ADRP base register is overwritten by a new ADRP.
            other=adrp(op,lo+j*4)
            if other is not None and other[0]==reg:break
print("CANDIDATE_MATERIALIZATIONS",len(matches))
for pc,follow,kind,addr,name in matches[:125]:
    print(f"MATERIALIZE {name} {kind} at={pc:#x} use={follow:#x} target={addr:#x}")
    for seg_lo,seg_hi,seg_at,flags in loads:
        if flags&1 and seg_lo<=pc<seg_hi:
            start=max(seg_lo,pc-16);end=min(seg_hi,follow+36)
            b=data[seg_at+start-seg_lo:seg_at+end-seg_lo]
            for ins in cs.disasm(b,start):
                print(f"  {ins.address:08x} {ins.mnemonic:9} {ins.op_str}")
            break
for addr,name in direct.items():
    count=sum(1 for _,_,_,target,_ in matches if target==addr)
    print(f"DIRECT_REFERENCE {name} {addr:#x} COUNT={count}")
    print(f"RELOCATION_SLOTS {name} {[hex(k) for k,v in rel.items() if v==addr][:60]}")
