#!/usr/bin/env python3
"""Photo Sphere checkpoint 147: virtual callsite candidates and lens correction stores.

Read-only fixed-width ARM64 instruction scan over SHA-verified original liblightcycle.so.
A pointer slot match in an untyped C++ class is only a *candidate*.
"""
import os, struct
from pathlib import Path
from elftools.elf.elffile import ELFFile

TRACK=os.environ["TRACK"]
blob=Path("liblightcycle.so").read_bytes()
with Path("liblightcycle.so").open("rb") as stream:
    elf=ELFFile(stream)
    maps=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"]))
          for p in elf.iter_segments() if p["p_type"]=="PT_LOAD"]
def is_executable(addr):
    return any(lo<=addr<hi and flags&1 for lo,hi,base,flags in maps)
def mapfile(addr):
    for lo,hi,base,fl in maps:
        if lo<=addr<hi:return base+addr-lo
    raise ValueError(hex(addr))
def opat(addr):
    return struct.unpack_from("<I",blob,mapfile(addr))[0]
def records():
    for low,high,fileoff,flags in maps:
        if not flags&1:continue
        for delta in range(0,high-low-3,4):
            yield low+delta,struct.unpack_from("<I",blob,fileoff+delta)[0]
def blr_reg(op):
    if (op&0xfffffc1f)==0xd63f0000:return (op>>5)&31
    return None
def ldr64(op):
    if (op&0xffc00000)!=0xf9400000:return None
    return (op&31),((op>>5)&31),(((op>>10)&0xfff)*8)
def str64(op):
    if (op&0xffc00000)!=0xf9000000:return None
    return (op&31),((op>>5)&31),(((op>>10)&0xfff)*8)
def bl_target(pc,op):
    if op>>26 != 0b100101:return None
    signed=op&0x3ffffff
    if signed&(1<<25):signed-=1<<26
    return pc+4*signed
def context(addr,past=4,future=12):
    lo=addr-4*past
    hi=addr+4*future
    for at in range(lo,hi,4):
        if not is_executable(at):continue
        try:o=opat(at)
        except ValueError:continue
        hit="  <<<" if at==addr else ""
        print(f"INS {at:#010x} {o:08x} STR={str64(o)} LDR={ldr64(o)} BLR={blr_reg(o)} BL={hex(bl_target(at,o)) if bl_target(at,o) is not None else '-'}{hit}")
print("TRACK",TRACK,"BIN_BYTES",len(blob))
if TRACK=="metadata-callsite":
    # Potential C++ virtual calls: LDR Xt,[Xvtable,#slot] followed by BLR Xt.
    slots=(0x10,0x18,0x20,0x50)
    found={s:[] for s in slots}
    for addr,op in records():
        a=ldr64(op)
        if a is None:continue
        dst,base,offset=a
        if offset not in found:continue
        for j in range(1,21):
            vaddr=addr+4*j
            if not is_executable(vaddr):break
            v=opat(vaddr)
            if blr_reg(v)==dst:
                found[offset].append((addr,vaddr,base,dst))
                break
            # Any intervening new assignment to same destination may invalidate
            # correspondence. Treat all matches as candidates only.
    for slot,candidates in found.items():
        print(f"VIRTUAL_SLOT +{slot:#x} CANDIDATES={len(candidates)}")
        for addr,dest,base,dst in candidates[:85]:
            print(f"CANDIDATE slot={slot:#x} load={addr:#x} blr={dest:#x} vtable_reg={base} method_reg={dst}")
    # Restrict detailed excerpts to session storage, session rendering and JNI sites.
    for slot,candidates in found.items():
        selected=[(a,b) for a,b,*_ in candidates
                  if 0x10e000<=a<0x122000 or 0x318000<=a<0x31c000
                    or 0xec000<=a<0xf2000]
        print(f"SESSION_REGION_SLOT +{slot:#x} MATCHES={len(selected)}")
        for addr,blr in selected[:35]:
            print(f"SESSION_CANDIDATE slot={slot:#x} at={addr:#x} calls={blr:#x}")
            context(addr,5,5)
elif TRACK=="camera-correction-stores":
    # Optional LinearCamera lens pointer lives at object+0x30;
    # any STR +0x30 is *not* sufficient to identify the receiver as LinearCamera.
    stores=[]
    for addr,op in records():
        s=str64(op)
        if s is not None and s[2]==0x30:
            stores.append((addr,s[0],s[1]))
    print("ALL_64BIT_STR_PLUS_0X30",len(stores))
    bands=[("LINEAR_CAMERA_IMPL",0x330000,0x333000),
           ("SOURCE_SESSION",0x108000,0x123000),
           ("IMAGE_ACCESSOR",0x340000,0x350000),
           ("STORAGE_IMPL",0x318000,0x31b000),
           ("NATIVE_JNI",0xed000,0xf3000)]
    for label,low,hi in bands:
        hits=[(a,r,b) for a,r,b in stores if low<=a<hi]
        print(f"BAND {label} STORE_COUNT={len(hits)}")
        for addr,reg,base in hits[:65]:
            print(f"STORE_CANDIDATE at={addr:#x} src=x{reg} base=x{base} offset=0x30")
            context(addr,3,5)
    print("KNOWN_LINEAR_CAMERA_CONSTRUCTOR_STORE",hex(0x33134c),str64(opat(0x33134c)))
else:raise SystemExit("invalid TRACK")
