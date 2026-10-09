#!/usr/bin/env python3
"""Photo Sphere checkpoint 145: targeted upstream provenance on SHA-pinned ARM64."""
import os,struct
from collections import defaultdict
from pathlib import Path
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN

TRACK=os.environ["TRACK"]
BIN=Path("liblightcycle.so").read_bytes()
with Path("liblightcycle.so").open("rb") as stream:
    elf=ELFFile(stream)
    loads=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in elf.iter_segments() if p["p_type"]=="PT_LOAD"]
    rel={}
    for s in elf.iter_sections():
        if not isinstance(s,RelocationSection):continue
        for r in s.iter_relocations():
            if r.is_RELA() and r["r_info_type"]==1027:rel[int(r["r_offset"])]=int(r["r_addend"])
    symbols=[]
    for symtab in elf.iter_sections():
        if symtab["sh_type"]=="SHT_DYNSYM":
            for sym in symtab.iter_symbols():
                name=sym.name
                if name and ("LightCycleNative_" in name or "Camera" in name or "Correction" in name):
                    symbols.append((name,int(sym["st_value"]),int(sym["st_size"])))
def off(addr):
    for low,hi,base,flags in loads:
        if low<=addr<hi:return base+addr-low
    raise ValueError(hex(addr))
def string(addr):
    if addr is None:return None
    try:return BIN[off(addr):off(addr)+180].split(b"\0",1)[0].decode(errors="replace")
    except (ValueError,IndexError):return None
def rtti(vptr):
    ti=rel.get(vptr-8)
    return string(rel.get(ti+8)) if ti is not None else None
def dis(start,end):
    cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
    return list(cs.disasm(BIN[off(start):off(end-4)+4],start))
def dump(label,start,end,limit=190):
    print(f"=== {label} RAW {start:#x}..{end:#x} ===")
    for inst in dis(start,end)[:limit]: print(f"ASM {inst.address:08x}: {inst.mnemonic:9} {inst.op_str}")
def callsites(targets):
    hits=defaultdict(list)
    for lo,hi,base,flags in loads:
        if not flags&1:continue
        for delta in range(0,hi-lo-3,4):
            op=struct.unpack_from("<I",BIN,base+delta)[0]
            if op>>26!=0b100101:continue
            d=op&0x3ffffff
            if d & 0x2000000:d-=0x4000000
            addr=lo+delta
            dest=addr+d*4
            if dest in targets:hits[dest].append(addr)
    for addr in targets:print(f"BL_TO {addr:#x} COUNT={len(hits[addr])} AT={[hex(i) for i in hits[addr][:90]]}")
def vtable_entries(target,limit=100):
    sites=sorted(a for a,t in rel.items() if t==target)
    print(f"VIRTUAL_RELOCATION_TARGET={target:#x} count={len(sites)} SITES={[hex(a) for a in sites[:limit]]}")
    for loc in sites[:limit]:
        for slot in [0x10,0x18,0x20,0x28,0x30,0x38,0x40,0x50,0x80]:
            vptr=loc-slot
            ident=rtti(vptr)
            if ident:
                print(f"VPTR_METHOD TARGET={target:#x} address_point={vptr:#x} slot={slot:#x} RTTI={ident}")
def dynamic_branch_site_count(slot):
    # Exact AArch64 LDR Xt,[Xn,#slot] (immediate), followed in next 10 ins by BLR Xt.
    matches=[]
    for low,hi,base,flags in loads:
        if not flags&1:continue
        ins=list(dis(low,hi)) # full native text once per track
        for j,it in enumerate(ins):
            opcode=struct.unpack_from("<I",BIN,base+(it.address-low))[0]
            if opcode&0xffc00000!=0xf9400000:continue
            if ((opcode>>10)&4095)*8!=slot:continue
            rd=opcode&31
            for k in range(j+1,min(j+8,len(ins))):
                z=struct.unpack_from("<I",BIN,base+(ins[k].address-low))[0]
                if z&0xfffffc1f==0xd63f0000 and (z>>5)&31==rd:
                    matches.append((it.address,ins[k].address))
                    break
    print(f"VIRTUAL_SLOT {slot:#x} TOTAL_POTENTIAL_LOAD_BLR={len(matches)}")
    print(f"VIRTUAL_SLOT_EXAMPLES {[(hex(a),hex(b)) for a,b in matches[:70]]}")

print("TRACK",TRACK,"SHA256_CHECKED_EXTERNALLY",len(BIN),"RELOCS",len(rel))
if TRACK=="thumb-width-upstream":
    for name,addr,size in symbols:
        if "ResetForPhotoSphereCapture" in name or "ResetFor" in name or "Init" in name:
            print("JNI",hex(addr),size,name)
    vtable_entries(0x10f0fc)
    callsites({0x10f0fc,0x10f310,0x11a204,0x319308})
    for label,a,b in [
        ("CONFIG_RESET_DISPATCH",0x10ef90,0x10f240),
        ("OPTIONS_PACKER",0x10f310,0x10f408),
        ("SESSION_FACTORY",0x11a204,0x11a310)]:
        dump(label,a,b)
    dynamic_branch_site_count(0x10)
elif TRACK=="camera-correction-types":
    types=[]
    for addr in sorted(rel):
        typ=rtti(addr)
        if not typ:continue
        if any(word in typ.lower() for word in ("camera","distortion","lens","correction","calibrat","fov")):
            methods=[rel.get(addr+x) for x in (0x10,0x20,0x28,0x30,0x80,0x88)]
            if sum(v is not None for v in methods)>=2:
                types.append((addr,typ,methods))
    print("RTTI_CAMERA_LENS_CANDIDATES",len(types))
    for addr,typ,methods in types[:170]:
        print(f"MODEL_VPTR {addr:#x} TYPE={typ} METHODS={[hex(m) if m is not None else None for m in methods]}")
    callsites({0x331344,0x331118,0x331b54,0x331c38,0x11b964})
    for label,a,b in [
        ("LINEAR_CAMERA_INITIALIZER",0x331344,0x33141c),
        ("LINEAR_CAMERA_CONFIG",0x331118,0x3312a0),
        ("SESSION_CAMERA_CONSTRUCTION",0x11a388,0x11a430),
        ("CAPTURE_ROSETTE_CREATOR",0x11b964,0x11ba90)]:
        dump(label,a,b)
elif TRACK=="metadata-dispatch-provenance":
    vtable_entries(0x319b74)
    vtable_entries(0x319d40)
    vtable_entries(0x31aa40)
    callsites({0x3195c8,0x319b74,0x319d40,0x31aa40,0x11a34c})
    for label,a,b in [
        ("FILEPATH_STORAGE_CONSTRUCTOR",0x3195c8,0x319694),
        ("SESSION_METADATA_WRITE",0x319b74,0x319d38),
        ("SESSION_META_PATH",0x31aa40,0x31aa98),
        ("RESTORE_CALLER",0x11a34c,0x11a42c)]:
        dump(label,a,b)
    dynamic_branch_site_count(0x18)
else:raise ValueError(TRACK)
