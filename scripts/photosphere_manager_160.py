#!/usr/bin/env python3
"""Checkpoint 160: exact ARM64 global accesses, ELF-owned boundaries, RTTI."""
import bisect, hashlib, json, re
from pathlib import Path
from capstone import Cs, CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN
from elftools.elf.elffile import ELFFile
from elftools.dwarf.callframe import FDE

SHA = "878feb4ab3912bc0a4c399d9eb14b6c615926e132b324ad8ea02d4988fd428d1"
raw = Path("liblightcycle.so").read_bytes()
assert hashlib.sha256(raw).hexdigest() == SHA
handle = open("liblightcycle.so", "rb")
elf = ELFFile(handle)
segments = [(int(s["p_vaddr"]), int(s["p_vaddr"] + s["p_filesz"]),
             int(s["p_offset"]), int(s["p_flags"]))
            for s in elf.iter_segments() if s["p_type"] == "PT_LOAD"]
def offset(addr):
    for lo, hi, off, _ in segments:
        if lo <= addr < hi: return off + addr - lo
    return None
relocs = {}
for section in elf.iter_sections():
    if section["sh_type"] == "SHT_RELA":
        for r in section.iter_relocations():
            if int(r["r_info_type"]) == 1027:
                relocs[int(r["r_offset"])] = int(r["r_addend"])
def pointer(addr):
    if addr in relocs: return relocs[addr]
    off = offset(addr)
    return int.from_bytes(raw[off:off+8], "little") if off is not None else None
symbols = []
dynsym = elf.get_section_by_name(".dynsym")
if dynsym:
    symbols = sorted((int(s["st_value"]), int(s["st_size"]), s.name)
                     for s in dynsym.iter_symbols()
                     if s["st_info"]["type"] == "STT_FUNC" and int(s["st_value"]))
ranges = []
try:
    for e in elf.get_dwarf_info().EH_CFI_entries():
        if isinstance(e, FDE):
            a = int(e["initial_location"])
            ranges.append((a, a + int(e["address_range"])))
except Exception as error: print("FDE_READ_LIMIT", type(error).__name__, str(error))
ranges.sort()
starts = [a for a, _ in ranges]
start_set = set(starts)
def enclosing(addr):
    i = bisect.bisect_right(starts, addr) - 1
    if i >= 0 and addr < ranges[i][1]: return ranges[i]
    for a, size, _ in symbols:
        if a <= addr < a + size: return a, a + size
    return None
cs = Cs(CS_ARCH_ARM64, CS_MODE_LITTLE_ENDIAN)
cs.skipdata = True
ins = []
for lo, hi, off, flags in segments:
    if flags & 1: ins.extend(cs.disasm_lite(raw[off:off+hi-lo], lo))
indices = {a: i for i, (a, _, _, _) in enumerate(ins)}
print("PROVENANCE", SHA, "instructions", len(ins), "FDEs", len(ranges))
strings = {}
for m in re.finditer(rb"[\x20-\x7e]{5,}\x00", raw):
    s = m.group()[:-1].decode("ascii")
    if not re.search(r"(Stitch.*(Manager|Session)|Session.*Manager|session\.meta|source_photos_count|first_photo_time|last_photo_time|pose_heading|yaw_correction_deg)", s, re.I): continue
    for lo, hi, off, _ in segments:
        if off <= m.start() < off + hi - lo:
            strings[lo+m.start()-off] = s
            break
print("FOCUSED_STRINGS", json.dumps({hex(a): s for a, s in strings.items()}, sort_keys=True))
watched = {0x4170c8: "render_manager_global", 0x41710c: "session_id_counter", **strings}
refs = []
def reg(s):
    if s in ("wzr", "xzr"): return "xzr"
    return "x"+s[1:] if re.fullmatch(r"[wx]\d+", s) else s
def imm(s):
    try: return int(s.lstrip("#"), 0)
    except ValueError: return None
def memory(s):
    m = re.search(r"\[(x\d+|sp)(?:,\s*#(0x[0-9a-f]+|-?\d+))?\]", s)
    return (m.group(1), int(m.group(2) or "0", 0)) if m else None
state = {}
for addr, _, op, operands in ins:
    if addr in start_set: state.clear()
    p = [v.strip() for v in operands.split(",")]
    dest = reg(p[0]) if p else ""
    if op in ("adrp", "adr") and len(p) == 2:
        state[dest] = imm(p[1])
        if state[dest] in watched: refs.append((addr, "address", state[dest], watched[state[dest]]))
        continue
    if op == "add" and len(p) == 3:
        a, b = state.get(reg(p[1])), imm(p[2])
        state[dest] = a+b if isinstance(a, int) and b is not None else None
        if state[dest] in watched: refs.append((addr, "address", state[dest], watched[state[dest]]))
        continue
    if op in ("mov", "movz") and len(p) == 2:
        state[dest] = state.get(reg(p[1]), imm(p[1]))
        continue
    mem = memory(operands)
    if mem and op in ("ldr", "ldur", "str", "stur", "ldp", "stp"):
        base, disp = mem
        b = state.get(base)
        ea = b+disp if isinstance(b, int) else None
        count, stride = (2 if op in ("ldp", "stp") else 1), (8 if p[0].startswith("x") else 4)
        for n in range(count):
            at = ea + stride*n if ea is not None else None
            if at in watched: refs.append((addr, "load" if op.startswith("ld") else "store", at, watched[at]))
            if op.startswith("ld"): state[reg(p[n])] = relocs.get(at)
        if "]!" in operands or "]," in operands: state.pop(base, None)
        continue
    if op in ("bl", "blr"):
        for n in range(19): state.pop("x"+str(n), None)
        continue
    if op in ("ret", "b", "br", "cbz", "cbnz", "tbz", "tbnz", ".byte") or op.startswith("b."):
        state.clear()
        continue
    if dest.startswith("x") and op not in ("cmp", "cmn", "tst", "prfm", "nop"): state.pop(dest, None)
focus = {}
for addr, kind, target, label in refs:
    region = enclosing(addr)
    print("EXACT_REF", hex(addr), kind, hex(target), label, "FUNCTION", None if region is None else [hex(v) for v in region])
    if label in ("render_manager_global", "session_id_counter") or kind == "store":
        i = indices[addr]
        focus[addr] = ins[max(0, i-28):i+29]
    if region and label == "render_manager_global":
        focus[region[0]] = [it for it in ins if region[0] <= it[0] < min(region[1], region[0]+2400)]
assert relocs.get(0x40cc68) == 0x319b74, "storage writer relocation changed"
print("STORAGE_WRITER_VTABLE", "0x40cc50 +0x18", hex(relocs[0x40cc68]))
for a, s in strings.items():
    if "Manager" not in s and "manager" not in s: continue
    for type_slot, target in relocs.items():
        if target != a: continue
        print("RTTI_STRING_REFERENCE", hex(a), s, hex(type_slot))
        for slot, value in relocs.items():
            if value != type_slot-8: continue
            vptr = slot+8
            print("RTTI_VTABLE_CANDIDATE", s, hex(vptr),
                  json.dumps([(hex(k*8), hex(pointer(vptr+k*8) or 0)) for k in range(10)]))
for addr, body in sorted(focus.items()):
    print("BEGIN_WINDOW", hex(addr))
    for a, _, op, operands in body: print(f"{a:#010x} {op:8s} {operands}")
    print("END_WINDOW", hex(addr))
Path("out").mkdir(exist_ok=True)
summary = {"elf_sha256": SHA, "instruction_count": len(ins), "fde_count": len(ranges),
           "references": [{"address": hex(a), "kind": k, "target": hex(t), "label": s,
                           "function": [hex(v) for v in enclosing(a)] if enclosing(a) else None}
                          for a, k, t, s in refs]}
Path("out/manager-references.json").write_text(json.dumps(summary, indent=2)+"\n")
manager = {a for a, _, _, label in refs if label == "render_manager_global"}
assert any(0xeee00 <= a < 0xeee78 for a in manager), "missed RenderNextSession control"
assert any(0xee234 <= a < 0xee5d4 for a in manager), "missed FinishCapture control"
print("CHECKPOINT_160_SCAN_PASSED")
