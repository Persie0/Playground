#!/usr/bin/env python3
"""Checkpoint 161: factory to concrete manager vtable, then typed methods."""
import contextlib, io, json, runpy
from pathlib import Path
with contextlib.redirect_stdout(io.StringIO()):
    env = runpy.run_path("scripts/photosphere_manager_160.py")
ins, enclosing, relocs, pointer = [env[k] for k in ("ins", "enclosing", "relocs", "pointer")]
strings, symbols = env["strings"], env["symbols"]
def executable(addr):
    return any(lo <= addr < hi and flags & 1 for lo, hi, _, flags in env["segments"])
def dump(addr, max_bytes=10000):
    span = enclosing(addr)
    assert span, hex(addr)
    print("FUNCTION_RANGE", hex(addr), [hex(v) for v in span])
    for a, _, op, args in ins:
        if span[0] <= a < min(span[1], span[0] + max_bytes):
            print(f"{a:#010x} {op:8s} {args}")
    if span[1] - span[0] > max_bytes: print("TRUNCATED_RANGE", hex(span[1]))
for a, size, name in symbols:
    if any(a <= addr < a+size for addr in (0xeda20,0xee9dc,0xeee00)):
        print("JNI_SYMBOL", hex(a), size, name)
tables = []
for a, s in strings.items():
    if "SessionManager" not in s: continue
    for name_at in (a, a+1):
        for slot, target in relocs.items():
            if target != name_at: continue
            typeinfo = slot-8
            print("TYPEINFO_NAME", hex(typeinfo), hex(name_at), s)
            for at, ptr in relocs.items():
                if ptr != typeinfo: continue
                vptr = at+8
                if pointer(vptr-16) != 0 or not executable(pointer(vptr) or 0): continue
                tables.append(vptr)
                print("CONFIRMED_VTABLE", hex(vptr), s)
                for k in range(12):
                    value = pointer(vptr+k*8) or 0
                    print("METHOD_SLOT", hex(vptr), hex(k*8), hex(value), enclosing(value))
print("FACTORY")
dump(0x10efd0)
print("CONSTRUCTOR")
dump(0x10f0fc)
targets = {0x10efd0,0x10f0fc}
for table in tables:
    for k in (0x10,0x18,0x20,0x28,0x30):
        value = pointer(table+k)
        if value and executable(value): targets.add(value)
for a in sorted(targets-{0x10efd0,0x10f0fc}):
    print("MANAGER_METHOD", hex(a))
    dump(a)
# Preserve exact raw addresses for optional focused Ghidra follow-up.
Path("out/manager-methods.json").write_text(json.dumps({"raw_targets":[hex(a) for a in sorted(targets)],"vptrs":[hex(a) for a in tables]}, indent=2)+"\n")
assert tables, "no relocation-backed concrete vtable"
print("CHECKPOINT_161_PASSED")
