"""Clean-room reference fixtures for Google Camera 8.8.225 session metadata.

Recovered from liblightcycle.so:
  FUN_00419b74 writes nine key,value lines using fopen("a").
  FUN_00419d40 reads those keys and optionally source_photos_count.
  FUN_0041aa40 constructs the literal relative name session.meta.

These fixtures do not execute Google Camera or substitute a real capture.
"""
from __future__ import annotations

from dataclasses import dataclass
import math
import unittest


WRITE_KEYS = (
    "version",
    "filepath",
    "full_pano_width",
    "full_pano_height",
    "cropped_area_width",
    "cropped_area_height",
    "cropped_area_left",
    "cropped_area_top",
    "yaw_correction_deg",
)
NUMERIC_OFFSET = {
    "full_pano_width": 0x30,
    "full_pano_height": 0x34,
    "cropped_area_width": 0x38,
    "cropped_area_height": 0x3C,
    "cropped_area_top": 0x40,
    "cropped_area_left": 0x44,
    "yaw_correction_deg": 0x48,
    "source_photos_count": 0x4C,
}


def serialize_writer_records(fields: dict[str, object]) -> str:
    """Native field order; never emits source_photos_count from this writer."""
    return "".join(f"{key},{fields[key]}\n" for key in WRITE_KEYS)


def decode_accepted_records(data: str) -> dict[str, object]:
    """Reference for valid, single-comma records only.

    Avoid modeling malformed-input and duplicate-key semantics not validated
    against real native storage files.
    """
    values: dict[str, object] = {}
    for line in data.splitlines():
        if line.count(",") != 1:
            raise ValueError("Not a verified single-comma record")
        key, raw = line.split(",", 1)
        if key not in WRITE_KEYS and key != "source_photos_count":
            raise ValueError(f"Unknown key: {key}")
        if key in ("version", "filepath"):
            values[key] = raw
        elif key in ("yaw_correction_deg", "source_photos_count"):
            x = float(raw)
            if not math.isfinite(x) or abs(x) > 2_147_483_647:
                raise ValueError("Unverified native integer overflow")
            values[key] = math.trunc(x)
        else:
            values[key] = int(raw)
    return values


class NativeSessionMetadataFixture(unittest.TestCase):
    def setUp(self):
        self.data = {
            "version": "1",
            "filepath": "pano.jpg",
            "full_pano_width": 4096,
            "full_pano_height": 2048,
            "cropped_area_width": 4080,
            "cropped_area_height": 2016,
            "cropped_area_left": 8,
            "cropped_area_top": 16,
            "yaw_correction_deg": -7,
        }

    def test_native_writer_emits_nine_records_in_exact_order(self):
        output = serialize_writer_records(self.data)
        self.assertEqual(output.splitlines(), [f"{key},{self.data[key]}" for key in WRITE_KEYS])
        self.assertNotIn("source_photos_count", output)

    def test_reader_distinguishes_left_top_layout_and_optional_count(self):
        data = serialize_writer_records(self.data) + "source_photos_count,12.9\n"
        value = decode_accepted_records(data)
        self.assertEqual(value["cropped_area_left"], 8)
        self.assertEqual(value["cropped_area_top"], 16)
        self.assertEqual(value["source_photos_count"], 12)
        self.assertEqual(NUMERIC_OFFSET["source_photos_count"], 0x4C)
        self.assertEqual(NUMERIC_OFFSET["cropped_area_left"], 0x44)
        self.assertEqual(NUMERIC_OFFSET["cropped_area_top"], 0x40)

    def test_decimal_yaw_truncates_toward_zero(self):
        lines = "yaw_correction_deg,-7.9\nsource_photos_count,3.9\n"
        self.assertEqual(decode_accepted_records(lines),
                         {"yaw_correction_deg": -7, "source_photos_count": 3})

    def test_writer_uses_append_not_replace(self):
        first = serialize_writer_records(self.data)
        second = serialize_writer_records({**self.data, "full_pano_width": 1024})
        combined = first + second
        self.assertEqual(len(combined.splitlines()), 18)
        self.assertIn("full_pano_width,4096\n", combined)
        self.assertIn("full_pano_width,1024\n", combined)

    def test_reference_rejects_unsupported_embedded_commas(self):
        with self.assertRaises(ValueError):
            decode_accepted_records("filepath,a,b.jpg\n")


if __name__ == "__main__":
    unittest.main()
