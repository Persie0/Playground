#!/usr/bin/env python3
"""Checkpoint 163: exact post-render writer call and storage-producing owners."""
import contextlib, io, runpy
with contextlib.redirect_stdout(io.StringIO()):
    e = runpy.run_path("scripts/photosphere_manager_160.py")
ins, span, pointer = e["ins"], e["enclosing"], e["pointer"]
def executable(a):
    return any(lo<=a<hi and flags&1 for lo,hi,_,flags in e["segments"])
def name(addr):
    off=e["offset"](addr)
    return e["raw"][off:off+200].split(b"\0",1)[0].decode("ascii","replace") if off is not None else None
targets={0x119ff0,0x10fe74,0x11a204,0x3195c8}
tables=set()
def dump(a):
    bounds=span(a)
    assert bounds,hex(a)
    print("FUNCTION",hex(a),[hex(v) for v in bounds])
    state={}
    for addr,_,op,args in ins:
        if not bounds[0]<=addr<bounds[1]:continue
        print(f"{addr:#010x} {op:8s} {args}")
        p=[s.strip() for s in args.split(",")]
        if op=="adrp" and len(p)==2:state[p[0]]=int(p[1].lstrip("#"),0)
        elif op=="add" and len(p)==3 and p[1] in state and p[2].startswith("#"):
            state[p[0]]=state[p[1]]+int(p[2].lstrip("#"),0)
            value=state[p[0]]
            if pointer(value-16)==0 and executable(pointer(value) or 0) and executable(pointer(value+8) or 0):tables.add(value)
    print("END_FUNCTION",hex(a))
for a in sorted(targets):dump(a)
seen=set(targets)
for table in sorted(tables):
    info=pointer(table-8)
    print("TYPED_VTABLE",hex(table),name(pointer(info+8) or 0) if info else None)
    for offset in range(0,0xa8,8):
        target=pointer(table+offset) or 0
        if not executable(target):break
        print("TYPED_SLOT",hex(table),hex(offset),hex(target))
        if offset in (0x18,0x38,0x80) and target not in seen:
            seen.add(target)
            dump(target)
for a,size,s in e["symbols"]:
    if 0x3b9e60<=a<0x3b9e70 or 0x3bb450<=a<0x3bb460:print("SYNC_SYMBOL",hex(a),s)
print("CHECKPOINT_163_PASSED")
