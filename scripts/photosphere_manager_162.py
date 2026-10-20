#!/usr/bin/env python3
"""Checkpoint 162: follow the manager's owned render/storage provider."""
import contextlib, io, runpy, re
with contextlib.redirect_stdout(io.StringIO()):
    e=runpy.run_path("scripts/photosphere_manager_160.py")
ins, enclosing, ptr=e["ins"],e["enclosing"],e["pointer"]
def code(a): return any(lo<=a<hi and flags&1 for lo,hi,_,flags in e["segments"])
def string(a):
    off=e["offset"](a)
    if off is None:return None
    return e["raw"][off:off+180].split(b"\0",1)[0].decode("ascii",errors="replace")
targets={0x118ae8,0x11a0c8,0x10f310}
tables=set()
for a in sorted(targets):
    span=enclosing(a)
    assert span,hex(a)
    body=[it for it in ins if span[0]<=it[0]<span[1]]
    print("FUNCTION",hex(a),[hex(v) for v in span])
    state={}
    for address,_,op,args in body:
        print(f"{address:#010x} {op:8s} {args}")
        parts=[s.strip() for s in args.split(",")]
        if op=="adrp" and len(parts)==2:state[parts[0]]=int(parts[1].lstrip("#"),0)
        elif op=="add" and len(parts)==3 and parts[1] in state and parts[2].startswith("#"):
            state[parts[0]]=state[parts[1]]+int(parts[2].lstrip("#"),0)
            v=state[parts[0]]
            if ptr(v-16)==0 and code(ptr(v) or 0) and code(ptr(v+8) or 0):tables.add(v)
    print("END_FUNCTION",hex(a))
for table in sorted(tables):
    typeinfo=ptr(table-8)
    print("OWNED_VTABLE",hex(table),"TYPE",string(ptr(typeinfo+8) or 0) if typeinfo else None)
    for k in range(0,0xa0,8):
        value=ptr(table+k) or 0
        if not code(value):break
        print("OWNED_SLOT",hex(k),hex(value),enclosing(value))
        if k in (0x10,0x18,0x20):
            span=enclosing(value)
            if span:
                print("BEGIN_METHOD",hex(value))
                for a,_,op,args in ins:
                    if span[0]<=a<min(span[1],span[0]+12000):print(f"{a:#010x} {op:8s} {args}")
                print("END_METHOD",hex(value))
print("CHECKPOINT_162_PASSED")
