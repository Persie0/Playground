#!/usr/bin/env python3
"""Checkpoint 164: trace the queued SessionImpl producer without slot guessing."""
import contextlib, io, runpy
with contextlib.redirect_stdout(io.StringIO()):
    e = runpy.run_path("scripts/photosphere_manager_160.py")
ins, span, pointer = e["ins"], e["enclosing"], e["pointer"]
def dump(a):
    bounds=span(a)
    assert bounds,hex(a)
    print("FUNCTION",hex(a),[hex(v) for v in bounds])
    for addr,_,op,args in ins:
        if bounds[0]<=addr<bounds[1]:
            print(f"{addr:#010x} {op:8s} {args}")
    print("END_FUNCTION",hex(a))
for off in (0x98,0xa0):
    a=pointer(0x3fd478+off)
    print("CAPTURE_BUILDER_SLOT",hex(off),hex(a))
    dump(a)
print("GOT_CAPTURE_GLOBAL",hex(pointer(0x412030) or 0))
for a in (0xed84c,0xee234,0x10f310,0x10f270):
    dump(a)
print("YAW_MULTIPLIER_ADDRESS",hex(0x618d0))
import struct
offset=e["offset"](0x618d0)
print("YAW_MULTIPLIER_DOUBLE",repr(struct.unpack_from("<d",e["raw"],offset)[0]))
print("CHECKPOINT_164_PASSED")
