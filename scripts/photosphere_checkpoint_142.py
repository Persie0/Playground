#!/usr/bin/env python3
"""Checkpoint 142: follow actual 0/1 mask remap and source-camera correction writes."""
import os,struct
from pathlib import Path
from capstone import Cs,CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
TRACK=os.environ["TRACK"];data=Path("liblightcycle.so").read_bytes()
with open("liblightcycle.so","rb") as f:
 e=ELFFile(f)
 loads=[(int(p["p_vaddr"]),int(p["p_vaddr"]+p["p_filesz"]),int(p["p_offset"]),int(p["p_flags"])) for p in e.iter_segments() if p["p_type"]=="PT_LOAD"]
def off(a):
 for a0,b0,p,fl in loads:
  if a0<=a<b0:return p+a-a0
 raise ValueError(hex(a))
decoder=Cs(CS_ARCH_ARM64,CS_MODE_LITTLE_ENDIAN)
def inspect(a,b):
 print("=== BLOCK",hex(a),hex(b))
 for x in decoder.disasm(data[off(a):off(b-4)+4],a):print(f"{x.address:08x}: {x.mnemonic:10} {x.op_str}")
def all_bl(target):
 sites=[]
 for lo,hi,p,flags in loads:
  if not flags&1:continue
  for q in range(p,p+hi-lo-3,4):
   inst=struct.unpack_from("<I",data,q)[0]
   if inst>>26!=0b100101:continue
   disp=inst&0x3ffffff
   if disp&(1<<25):disp-=1<<26
   addr=lo+q-p
   if addr+disp*4==target:sites.append(addr)
 print("DIRECT_CALLS",hex(target),len(sites),[hex(x) for x in sites])
if TRACK=="mask-trace":
 for a,b in [(0x335f90,0x33613c),(0x33732c,0x33743c),(0x337590,0x337760),
 (0x333ee0,0x334120),(0x321fb0,0x322124)]:
  inspect(a,b)
 for t in (0x33605c,0x337498,0x3371a8,0x334478,0x41fb10,0x423310):all_bl(t)
elif TRACK=="correction-writes":
 # Raw ARM64 STR Xt, [Xn,#0x30] instruction, 64-bit unsigned offset.
 # Most stores are NOT lens writes; enumerate with neighbor context and
 # resolve constructor-owned bodies, never conflate unrelated C++ objects.
 sites=[]
 for lo,hi,p,fl in loads:
  if not fl&1:continue
  for q in range(p,p+hi-lo-3,4):
   w=struct.unpack_from("<I",data,q)[0]
   if (w&0xfffffc00)!=0xf9001800:continue
   a=lo+q-p
   if 0x330000<=a<0x360000 or 0x310000<=a<0x332000:
    sites.append(a)
 print("STR_X_OFFSET_30",len(sites),[hex(x) for x in sites[:200]])
 for a in sites[:85]:
  print("=== WRITE",hex(a))
  inspect(a-0x14,a+0x18)
 for t in [0x331344,0x331118,0x331690,0x3317bc,0x331b54,0x331c38]:all_bl(t)
else:raise SystemExit(TRACK)
