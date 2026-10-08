"""Pure reference fixtures for recovered Photo Sphere primitives.

This is NOT a Google Camera binary, executable reverse-engineered decoder,
or a pixel-equivalence test against proprietary captures. It records small
deterministic mathematical properties established by public native traces:
3x3 rotations, transpose inverse, mask RLE run-value erasure, signed /9
boundary feather, and sequential panorama-X wrap.
"""
from __future__ import annotations

import unittest
import math


def rotate3(row_major_r: tuple[float, ...], xyz: tuple[float, float, float]) -> tuple[float, float, float]:
    """Use the 9 consecutive float entries of one rosette matrix."""
    if len(row_major_r) != 9 or len(xyz) != 3:
        raise ValueError("Expected a 3x3 matrix and 3-vector")
    return tuple(
        sum(row_major_r[row * 3 + col] * xyz[col] for col in range(3))
        for row in range(3)
    )


def inverse_rotate3(row_major_r: tuple[float, ...], xyz: tuple[float, float, float]) -> tuple[float, float, float]:
    """Native inverse path multiplies by R^T, not a general matrix inverse."""
    if len(row_major_r) != 9 or len(xyz) != 3:
        raise ValueError("Expected a 3x3 matrix and 3-vector")
    return tuple(
        sum(row_major_r[row * 3 + col] * xyz[row] for row in range(3))
        for col in range(3)
    )


def encode_mask_runs(mask: list[int]) -> list[tuple[int, int]]:
    """Inclusive nonzero coverage intervals; intentionally discards byte magnitude."""
    spans: list[tuple[int, int]] = []
    start = None
    for x, val in enumerate(mask):
        if val and start is None:
            start = x
        elif not val and start is not None:
            spans.append((start, x - 1))
            start = None
    if start is not None:
        spans.append((start, len(mask) - 1))
    return spans


def expand_mask_runs(length: int, spans: list[tuple[int, int]], fill_byte: int) -> list[int]:
    """Demonstrate that dense-mask values come from the decoder's fill argument."""
    if length < 0 or fill_byte not in range(256):
        raise ValueError("Invalid image width or byte value")
    image = [0] * length
    for start, last in spans:
        if start < 0 or start > last or last >= length:
            raise ValueError("Bad inclusive interval")
        for x in range(start, last + 1):
            image[x] = fill_byte
    return image


def signed_div9(n: int) -> int:
    """C/C++ signed integer division truncates toward zero, unlike Python //."""
    return (1 if n >= 0 else -1) * (abs(n) // 9)


def feather_boundary(coeff_i16: int, occupancy_sum: int) -> int:
    """Reference for interior partial-neighborhood masks: 0<S<9."""
    if not (-32767 <= coeff_i16 <= 32767):
        raise ValueError("Coefficient outside known signed pyramid range")
    if not (1 <= occupancy_sum <= 8):
        raise ValueError("Only partial 3x3 boundary occupancy is handled here")
    return signed_div9(coeff_i16 * occupancy_sum)


def wrap_horizontal_native(x: float, width: float) -> float:
    """Two ordered loops; near-right fractional X may finish negative."""
    if width <= 0:
        raise ValueError("Width must be positive")
    if x < 0.0:
        while x < 0.0:
            x += width
    if x > width - 1.0:
        while x > width - 1.0:
            x -= width
    return x



def project_negative_z_linear(
    ray: tuple[float, float, float], fx: float, fy: float, cx: float, cy: float
) -> tuple[float, float]:
    """Raw FUN_00431b54 base projection with no optional distortion object.

    Native validity/bounds checks are not modeled here; front-view rays have z<0.
    """
    x, y, z = ray
    if z >= 0 or fx == 0 or fy == 0:
        raise ValueError("Expected negative-Z ray and nonzero focal lengths")
    return (cx - fx * x / z, cy + fy * y / z)


def unproject_negative_z_linear(
    pixel: tuple[float, float], inv_fx: float, inv_fy: float, cx: float, cy: float
) -> tuple[float, float, float]:
    """FUN_00431c38 linear unprojection before any camera-specific undistortion."""
    px, py = pixel
    return ((px - cx) * inv_fx, -(py - cy) * inv_fy, -1.0)



def equirect_ray_to_pixel(ray: tuple[float, float, float], mosaic_height: int) -> tuple[float, float]:
    """FUN_00430800: equirect angular map, height=width//2; float rounding omitted."""
    if mosaic_height <= 0:
        raise ValueError("Invalid panorama height")
    x, y, z = ray
    elevation = math.atan2(y, math.hypot(x, -z))
    yaw = math.atan2(x, -z)
    return (
        (yaw / math.pi + 1.0) * mosaic_height - 0.5,
        ((math.pi / 2 - elevation) / math.pi) * mosaic_height - 0.5,
    )


def equirect_pixel_to_ray(pixel: tuple[float, float], mosaic_height: int) -> tuple[float, float, float]:
    """FUN_004308c0: pixel-center angular map; no input-bound or output normalization."""
    if mosaic_height <= 0:
        raise ValueError("Invalid panorama height")
    u, v = pixel
    theta = (u + 0.5) / mosaic_height * math.pi
    phi = (1.0 - (2.0 * (v + 0.5)) / mosaic_height) * math.pi / 2
    cos_phi = math.cos(phi)
    return (-math.sin(theta) * cos_phi, math.sin(phi), math.cos(theta) * cos_phi)


class LightCycleStageFixtures(unittest.TestCase):
    def test_identity_rotation_and_transpose(self):
        i = (1., 0., 0., 0., 1., 0., 0., 0., 1.)
        d = (0.25, -1.0, 3.0)
        self.assertEqual(rotate3(i, d), d)
        self.assertEqual(inverse_rotate3(i, d), d)

    def test_quarter_turn_camera_and_inverse(self):
        r = (0., -1., 0., 1., 0., 0., 0., 0., 1.)
        vec = (1., 0., 2.)
        self.assertEqual(rotate3(r, vec), (0., 1., 2.))
        self.assertEqual(inverse_rotate3(r, (0., 1., 2.)), vec)

    def test_transpose_is_not_generic_inverse(self):
        non_orthonormal = (2., 0., 0., 0., 1., 0., 0., 0., 1.)
        vec = (1., 3., 0.)
        self.assertEqual(inverse_rotate3(non_orthonormal, rotate3(non_orthonormal, vec)), (4., 3., 0.))

    def test_run_encoding_discards_surviving_100_values(self):
        mask = [0, 100, 100, 0, 100, 0, 0]
        spans = encode_mask_runs(mask)
        self.assertEqual(spans, [(1, 2), (4, 4)])
        self.assertEqual(expand_mask_runs(len(mask), spans, 1), [0, 1, 1, 0, 1, 0, 0])
        self.assertEqual(expand_mask_runs(len(mask), spans, 100), mask)

    def test_run_encoding_is_value_agnostic(self):
        self.assertEqual(encode_mask_runs([0, 1, 255, 0]), encode_mask_runs([0, 100, 100, 0]))

    def test_signed_feather_division_truncates_toward_zero(self):
        self.assertEqual(feather_boundary(90, 2), 20)
        self.assertEqual(feather_boundary(-101, 2), -22)
        self.assertNotEqual(feather_boundary(-101, 2), (-101 * 2) // 9)
        self.assertEqual(feather_boundary(32767, 8), 29126)

    def test_native_horizontal_wrap_order_not_modulo(self):
        self.assertEqual(wrap_horizontal_native(-8.0, 8.0), 0.0)
        self.assertEqual(wrap_horizontal_native(8.0, 8.0), 0.0)
        self.assertEqual(wrap_horizontal_native(7.5, 8.0), -0.5)
        self.assertEqual(wrap_horizontal_native(-0.5, 8.0), -0.5)
        self.assertEqual(wrap_horizontal_native(2.0, 8.0), 2.0)

    def test_linear_camera_center_uses_negative_z(self):
        f = (100.0, 110.0, 49.5, 59.5)
        self.assertEqual(project_negative_z_linear((0., 0., -1.), *f), (49.5, 59.5))
        self.assertEqual(unproject_negative_z_linear((49.5, 59.5), .01, 1/110, 49.5, 59.5), (0., 0., -1.))

    def test_linear_camera_projection_and_unprojection(self):
        fx, fy, cx, cy = 100., 200., 49.5, 30.5
        ray = (0.25, -0.5, -1.)
        pix = project_negative_z_linear(ray, fx, fy, cx, cy)
        self.assertEqual(pix, (74.5, 130.5))
        self.assertEqual(unproject_negative_z_linear(pix, 1/fx, 1/fy, cx, cy), ray)

    def test_linear_camera_rejects_nonnegative_z(self):
        with self.assertRaises(ValueError):
            project_negative_z_linear((0., 0., 0.), 100., 100., 1., 1.)
        with self.assertRaises(ValueError):
            project_negative_z_linear((0., 0., 1.), 100., 100., 1., 1.)

    def test_equirect_center_negative_z_ray(self):
        height = 256
        px = equirect_ray_to_pixel((0., 0., -1.), height)
        self.assertEqual(px, (255.5, 127.5))
        restored = equirect_pixel_to_ray(px, height)
        for got, expected in zip(restored, (0., 0., -1.)):
            self.assertAlmostEqual(got, expected, places=12)

    def test_equirect_cardinal_rays_and_pixel_center(self):
        h = 256
        # At the poles longitude is undefined; atan2(+0,-0) may choose the seam.
        for ray, expected in [
            ((1., 0., 0.), (383.5, 127.5)),
            ((-1., 0., 0.), (127.5, 127.5)),
            ((0., 1., 0.), (None, -0.5)),
            ((0., -1., 0.), (None, 255.5)),
        ]:
            observed = equirect_ray_to_pixel(ray, h)
            for a, b in zip(observed, expected):
                if b is not None:
                    self.assertAlmostEqual(a, b, places=10)
            recovered = equirect_pixel_to_ray(observed, h)
            for a, b in zip(recovered, ray):
                self.assertAlmostEqual(a, b, places=10)

    def test_equirect_nonunit_ray_direction(self):
        p = (0.75, -0.25, -1.5)
        h = 200
        px = equirect_ray_to_pixel(p, h)
        recovered = equirect_pixel_to_ray(px, h)
        norm = math.sqrt(sum(x*x for x in p))
        for got, orig in zip(recovered, p):
            self.assertAlmostEqual(got, orig/norm, places=10)

    def test_equirect_wrap_boundary_same_ray(self):
        h = 256
        a = equirect_pixel_to_ray((-0.5, 127.5), h)
        b = equirect_pixel_to_ray((2*h-0.5, 127.5), h)
        for x, y in zip(a, b):
            self.assertAlmostEqual(x, y, places=10)



if __name__ == "__main__":
    unittest.main()
