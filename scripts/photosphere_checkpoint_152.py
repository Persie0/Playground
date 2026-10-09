#!/usr/bin/env python3
"""Checkpoint 152: original ARM64 metadata-storage identity and camera correction object writes.
All offsets are raw ELF addresses; Ghidra addresses are raw + 0x100000.
Results identify *candidates*; vtable slot equality alone is not receiver identity.
"""
import os, struct
from pathlib import Path
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN

TRACK=os.environ["TRACK"]
blob=Path("liblightcycle.so").read_bytes()
with Path("liblightcycle.so").open("rb") as f:
    elf=ELFFile(f)
    seg=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),
          int(p["p_offset"]),int(p["p_flags"]))
         for p in elf.iter_segments() if p["p_type"]=="PT_LOAD"]
    rel={int(r["r_offset"]):int(r["r_addend"])
         for s in elf.iter_sections() if isinstance(s,RelocationSection)
         for r in s.iter_relocations()
         if r.is_RELA() and r["r_info_type"]==1027}
def offset(addr):
    for lo,hi,base,fl in seg:
        if lo<=addr<hi:return base+addr-lo
    raise ValueError(hex(addr))
def opcode(addr):
    return struct.unpack_from("<I",blob,offset(addr))[0]
def exec_ranges():
    for lo,hi,base,fl in seg:
        if fl&1:yield lo,hi,base
def ldr(op):
    if op&0xffc00000==0xf9400000:
        return op&31,(op>>5)&31,((op>>10)&4095)*8
    return None
def str64(op):
    if op&0xffc00000==0xf9000000:
        return op&31,(op>>5)&31,((op>>10)&4095)*8
    return None
def blr(op):
    if op&0xfffffc1f==0xd63f0000:return (op>>5)&31
    return None
def bl(op,pc):
    if op>>26!=0b100101:return None
    d=op&0x3ffffff
    if d&(1<<25):d-=1<<26
    return pc+d*4
cs=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def detail(start,end):
    print("ASM_REGION",hex(start),hex(end))
    try:
        buf=blob[offset(start):offset(end-4)+4]
        for i in cs.disasm(buf,start):
            print(f"ASM {i.address:#010x} {i.mnemonic:9} {i.op_str}")
    except ValueError as e:print("ASM_ERROR",str(e))
print("TRACK",TRACK,"INPUT_BYTES",len(blob),"RELOCATIONS",len(rel))
if TRACK=="storage-pointer-use":
    # Session creation writes FilePathSessionStorage ptr to session+0x90,
    # but this is not proof all [object+0x90] loads refer to storage.
    hits=[]
    for low,high,base in exec_ranges():
        for i in range(low,high-4,4):
            x=ldr(opcode(i))
            if x and x[2]==0x90:
                hits.append((i,*x))
    print("ALL_LDR_0X90_COUNT",len(hits))
    storage_regions=((0xed000,0xf3000),(0x10e000,0x122000),(0x318000,0x31c000))
    for low,high in storage_regions:
        near=[(addr,dst,obj) for addr,dst,obj,imm in hits if low<=addr<high]
        print("SOURCE_REGION",hex(low),hex(high),"LOAD_COUNT",len(near))
        for addr,dst,obj in near[:85]:
            # Search forward for nearby +0x18 virtual load followed by BLR
            poss=[]
            for j in range(1,49):
                at=addr+4*j
                if at>=high:break
                o=opcode(at); h=ldr(o)
                if h and h[2]==0x18:
                    for k in range(1,7):
                        nextaddr=at+k*4
                        if nextaddr>=high:break
                        if blr(opcode(nextaddr))==h[0]:
                            poss.append((at,nextaddr))
                            break
            print("LOAD90",hex(addr),"dest_reg",dst,"base_reg",obj,
                  "POTENTIAL_18_VCALL",[(hex(a),hex(b)) for a,b in poss[:7]])
            if poss and len(poss)<=4:detail(max(low,addr-16),min(high,poss[0][1]+16))
    # Two known storage paths as positive internal control:
    for start,end in ((0x11a280,0x11a2d0),(0x11a350,0x11a3c0),(0x11a060,0x11a098)):
        detail(start,end)
elif TRACK=="linear-correction-writers":
    print("LINEAR_VTABLE+0x10",hex(rel.get(0x40d550,0)))
    # All STR Xn,[Xm,#0x30] in camera neighborhood with explicit base/source.
    for start,end in ((0x330000,0x333000),(0xf0000,0xf2000),(0x11a000,0x11c100),
                      (0x318000,0x31c000)):
        stores=[]
        for addr in range(start,end-4,4):
            try:r=str64(opcode(addr))
            except ValueError:continue
            if r is not None and r[2]==0x30 and r[1]!=31:stores.append((addr,r[0],r[1]))
        print("REGION",hex(start),hex(end),"STORES",len(stores))
        for addr,src,base in stores[:56]:
            print("STORE30",hex(addr),f"src=x{src}",f"base=x{base}",
                  "zero" if src==31 else "nonzero_or_unknown")
            if 0x330000<=addr<0x333000:
                detail(addr-12,addr+20)
    # Native LinearCamera clone and any non-null setter candidates are
    # distinguishable only when receiver type is shown.
    detail(0x3315f8,0x331690)
elif TRACK=="metadata-file-reset":
    # Focus on metadata methods and caller regions. Direct symbol/stdio use
    # is not sufficient to prove unlink, reset, write or absence thereof.
    for start,end in ((0x3195c8,0x319730),(0x319b74,0x319d40),
                      (0x319d40,0x319e14),(0x31a8d0,0x31a930)):
        detail(start,end)
    # Direct branches to C stdio call targets, for contextual caller counts.
    targets={0x3fbdb0:"fopen",0x3fbdd0:"fclose",
             0x3fbb60:"memcpy",0x3f1a98:"free"}
    cnt={a:0 for a in targets}
    for lo,hi,base in exec_ranges():
        for at in range(lo,hi-4,4):
            target=bl(opcode(at),at)
            if target in cnt:
                cnt[target]+=1
                if (0x100000<=at<=0x120000 or 0x318000<=at<0x31c000) and target==0x3fbdb0:
                    print("FOPEN_SITE",hex(at))
    for a in targets:print("DIRECT_IMPORT_CALL_COUNT",targets[a],cnt[a])
else:raise SystemExit("invalid TRACK")
