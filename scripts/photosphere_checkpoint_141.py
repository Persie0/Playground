#!/usr/bin/env python3
"""Checkpoint 141: independent read-only LightCycle app/native mapping probes.

Input: SHA-verified original ARM64 liblightcycle.so in the working directory.
Each TRACK is standalone so the public Playground workflow can run jobs concurrently.
All addresses in this script are RAW ELF virtual addresses; Ghidra may be +0x100000.
"""
import os
import struct
from collections import defaultdict
from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.elf.relocation import RelocationSection

track = os.environ["TRACK"]
data = Path("liblightcycle.so").read_bytes()
with Path("liblightcycle.so").open("rb") as stream:
    elf = ELFFile(stream)
    loads = [(int(p["p_vaddr"]), int(p["p_vaddr"] + p["p_filesz"]),
              int(p["p_offset"]), int(p["p_flags"]))
             for p in elf.iter_segments() if p["p_type"] == "PT_LOAD"]
    rel = {}
    for sec in elf.iter_sections():
        if isinstance(sec, RelocationSection):
            for entry in sec.iter_relocations():
                if entry.is_RELA() and entry["r_info_type"] == 1027:
                    rel[int(entry["r_offset"])] = int(entry["r_addend"])

def offset(address):
    for low, high, file_offset, _ in loads:
        if low <= address < high:
            return file_offset + address - low
    raise ValueError(f"unmapped raw address {address:#x}")

def readstr(address, limit=200):
    if address is None:
        return None
    try:
        p = offset(address)
        return data[p:p + limit].split(b"\0", 1)[0].decode("utf-8", "replace")
    except ValueError:
        return None

def executable(address):
    return any(lo <= address < hi and fl & 1 for lo, hi, _, fl in loads)

cs = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)

def dump(label, start, stop, maxrows=250):
    print(f"=== {label}: raw {start:#x}..{stop:#x} ===")
    instructions = list(cs.disasm(data[offset(start):offset(stop - 4) + 4], start))
    print(f"INSTRUCTION_COUNT={len(instructions)}")
    for i in instructions[:maxrows]:
        print(f"{i.address:08x} {i.mnemonic:9} {i.op_str}")

def bl_refs(targets):
    refs = defaultdict(list)
    for lo, hi, file_offset, flags in loads:
        if not (flags & 1):
            continue
        length = hi - lo
        for n in range(0, length - 3, 4):
            op = struct.unpack_from("<I", data, file_offset + n)[0]
            if op >> 26 != 0b100101:
                continue
            signed = op & 0x03ffffff
            if signed & 0x02000000:
                signed -= 0x04000000
            t = lo + n + signed * 4
            if t in targets:
                refs[t].append(lo + n)
    for target in targets:
        hits = refs[target]
        print(f"BL_REF {target:#x} COUNT={len(hits)} SITES={[hex(x) for x in hits[:70]]}")

def type_for_vptr(vptr):
    ti = rel.get(vptr - 8)
    return readstr(rel.get(ti + 8)) if ti is not None else None

def vtable(label, vptr):
    print(f"=== {label}: vptr={vptr:#x} RTTI={type_for_vptr(vptr)!r} ===")
    for slot in [0, 8, 0x10, 0x18, 0x20, 0x28, 0x30, 0x48, 0x98, 0xa0]:
        target = rel.get(vptr + slot)
        print(f"SLOT +{slot:#x} -> {hex(target) if target is not None else None} exec={executable(target) if target is not None else None}")

print(f"TRACK={track} LIB_BYTES={len(data)} RELATIVE_RELOCS={len(rel)} LOADS={len(loads)}")

if track == "flow-model-dispatch":
    vtable("Confirmed CameraRotationModel", 0x3fd398)
    # Vtable slot equality alone is not proof of reachable constructor/dispatch.
    dump("Alignment model constructor", 0x0f327c, 0x0f34a0, 150)
    dump("Alignment owner", 0x0f2af8, 0x0f2d20, 150)
    dump("FOV JNI entry", 0x0f0784, 0x0f0910, 100)
    dump("Flow model virtual calls", 0x0ffc30, 0x0ffe50, 140)
    bl_refs({0x0f327c, 0x0f2af8, 0x0f4010, 0x0f40f0,
             0x0ffc30, 0x0fd76c, 0x0fdcc0})
    print("FLOW_VPTR_RELOCS", [hex(k) for k, v in rel.items() if v == 0x3fd398][:40])
elif track == "gamma-accessor-vtables":
    vtable("Confirmed StandardRosette", 0x40dc10)
    # Candidate virtual pairs, never blindly cast to StandardRosette.
    candidates = []
    for possible in sorted(rel):
        project = rel.get(possible + 0x98)
        unproject = rel.get(possible + 0xa0)
        if project is None or unproject is None:
            continue
        if not (executable(project) and executable(unproject)):
            continue
        if type_for_vptr(possible) is None:
            continue
        candidates.append((possible, project, unproject, type_for_vptr(possible)))
    print(f"ALL_RTTI_CANDIDATE_VPTR_COUNT={len(candidates)}")
    for vp, project, unproject, typ in candidates:
        if ("Rosette" in typ or "Accessor" in typ or "Camera" in typ
                or project in (0x345798, 0x34587c)
                or unproject in (0x345798, 0x34587c)):
            print(f"ACCESSOR_VPTR {vp:#x} PROJECT={project:#x} UNPROJECT={unproject:#x} RTTI={typ}")
    dump("Gamma pixel-sample vtable dispatch", 0x340da8, 0x341038, 170)
    dump("Gamma render factory caller", 0x31c618, 0x31c798, 100)
    dump("StandardRosette projection", 0x345798, 0x34587c, 80)
    dump("StandardRosette unprojection", 0x34587c, 0x345960, 80)
    bl_refs({0x345798, 0x34587c, 0x31c618, 0x340994, 0x341dc0})
elif track == "metadata-session-lifetime":
    for needle in (b"session.meta", b"source_photos_count", b"orientations.txt",
                   b"ground_truth.txt", b"fopen", b"remove", b"unlink"):
        print(f"STRING {needle!r} OCCURRENCES={data.count(needle)}")
    dump("Session metadata writer", 0x319b74, 0x319d38, 120)
    dump("Session metadata reader", 0x319d40, 0x319f38, 130)
    dump("Session metadata path builder", 0x31aa40, 0x31ab60, 90)
    dump("Session storage construction", 0x3195c8, 0x319730, 100)
    dump("Native stitch session caller", 0x11a204, 0x11a410, 140)
    bl_refs({0x3195c8, 0x319b74, 0x319d40, 0x31aa40, 0x11a204})
    for vptr in (0x40cc50, 0x40cc48, 0x40cc68):
        vtable("candidate session storage vtable", vptr)
else:
    raise SystemExit("unknown TRACK: " + track)
