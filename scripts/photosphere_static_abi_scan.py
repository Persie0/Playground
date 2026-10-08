#!/usr/bin/env python3
"""Offline read-only LightCycle ARM64 scan of virtual RLE calls and blender fields.

Input: SHA256-verified, extracted liblightcycle.so. No proprietary bytes are
included in this script. Prints address-localized instruction evidence.
"""
import argparse
import re
import struct
from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN


def text_code(path):
    data = Path(path).read_bytes()
    if data[:6] != b"\x7fELF\x02\x01":
        raise ValueError("Expected little-endian ELF64")
    shoff = struct.unpack_from("<Q", data, 40)[0]
    shsize, shnum, stridx = struct.unpack_from("<HHH", data, 58)
    sections = [struct.unpack_from("<IIQQQQIIQQ", data, shoff + shsize*i)
                for i in range(shnum)]
    names = sections[stridx]
    name_data = data[names[4]:names[4]+names[5]]
    for sh in sections:
        start_name = sh[0]
        end_name = name_data.find(b"\0", start_name)
        label = name_data[start_name:end_name].decode(errors="replace")
        if label == ".text":
            addr, off, size = sh[3], sh[4], sh[5]
            return addr, data[off:off+size]
    raise ValueError("No .text section in ELF")


def fmt(ins):
    return f"{ins.address:08x}: {ins.mnemonic:8s} {ins.op_str}"


def rle_scan(instr):
    candidate = []
    for idx, row in enumerate(instr):
        if row.mnemonic != "ldr" or "#0x58" not in row.op_str:
            continue
        m = re.match(r"(x\d+), \[(x\d+), #0x58\]$", row.op_str)
        if m is None:
            continue
        reg = m[1]
        following = instr[idx+1:idx+8]
        if not any(x.mnemonic == "blr" and x.op_str == reg for x in following):
            continue
        prior = instr[max(0,idx-13):idx]
        score = sum(bool(re.search(r"\bw2\b",v.op_str)) for v in prior)
        if any(v.mnemonic in ("mov","movz","orr") and
               re.search(r"^w2, #(?:0x1|0x64)$",v.op_str) for v in prior):
            score += 30
        if 0x300000 <= row.address <= 0x3e0000:
            score += 3
        candidate.append((score,idx))
    print(f"RLE_VIRTUAL_SLOT_0x58_CANDIDATES count={len(candidate)}")
    for score,idx in sorted(candidate,reverse=True)[:125]:
        print(f"\n=== candidate {instr[idx].address:#x} score={score} ===")
        for ins in instr[max(0,idx-10):idx+8]:
            print(fmt(ins))


def blender_scan(instr):
    candidates = []
    for idx, v in enumerate(instr):
        if not (0x31f000 <= v.address <= 0x325800):
            continue
        if v.mnemonic in ("str","stur","strb","sturh") and "#0x10" in v.op_str:
            candidates.append(idx)
    print(f"BLENDER_OBJECT_PLUS_0x10_STORES count={len(candidates)}")
    for idx in candidates[:130]:
        print(f"\n=== object field store {instr[idx].address:#x} ===")
        for v in instr[max(0,idx-7):idx+5]:
            print(fmt(v))
    print("\n=== original three-channel level threshold reads ===")
    for i,v in enumerate(instr):
        if v.address in (0x32206c,0x3220e8,0x322154):
            for p in instr[i-2:i+4]:
                print(fmt(p))


def main():
    p = argparse.ArgumentParser()
    p.add_argument("binary")
    p.add_argument("--track",choices=["rle_calls","blender_fields"],required=True)
    a = p.parse_args()
    base, blob = text_code(a.binary)
    md = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
    code = list(md.disasm(blob,base))
    print(f"ELF_TEXT start={base:#x} bytes={len(blob)} decoded_instructions={len(code)} track={a.track}")
    if a.track=="rle_calls":
        rle_scan(code)
    else:
        blender_scan(code)


if __name__=="__main__":
    main()
