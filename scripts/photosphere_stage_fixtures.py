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



def fisheye_equidistant_project(
    ray: tuple[float, float, float],
    focal: float, cx: float, cy: float, fov_rad: float
) -> tuple[float, float] | None:
    """FUN_00430ec4, no optional distortion object or image-bounds check."""
    x, y, z = ray
    if z > 0.0 or focal <= 0.0:
        return None
    norm = math.sqrt(x*x + y*y + z*z)
    if norm == 0.0:
        return None
    angle = math.acos(max(-1., min(1., -z / norm)))
    if angle > fov_rad / 2:
        return None
    lateral = math.hypot(x, y)
    mul = angle*focal / lateral if lateral else 0.0
    return (cx + mul*x, cy - mul*y)


def fisheye_equidistant_unproject(
    pixel: tuple[float, float], focal: float, cx: float, cy: float, fov_rad: float
) -> tuple[float, float, float] | None:
    """FUN_00431030, no optional distortion object; ray Z=-1, not normalized."""
    if focal <= 0.0:
        return None
    dx, dy = pixel[0]-cx, pixel[1]-cy
    r = math.hypot(dx,dy)
    alpha = r/focal
    # The native inverse rejects boundary equality; forward uses a strict >.
    if alpha >= fov_rad / 2:
        return None
    if not r:
        return (0.0,0.0,-1.0)
    tan_a=math.tan(alpha)
    return (tan_a*dx/r,-tan_a*dy/r,-1.0)



def resize_native_center_and_focal(
    old_width: int, old_height: int, new_width: int,
    fx: float, fy: float, cx: float, cy: float
) -> tuple[int, float, float, float, float]:
    """Recovered linear-camera FUN_00431690 positive-dimension resize semantics."""
    if old_width <= 0 or old_height <= 0 or new_width <= 0:
        raise ValueError("Positive camera dimensions required")
    scale = new_width / old_width
    new_height = int(old_height * scale + 0.5)
    return (
        new_height,
        fx * scale,
        fy * scale,
        (cx + 0.5) * scale - 0.5,
        (cy + 0.5) * scale - 0.5
    )


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


    def test_fisheye_center_negative_z(self):
        f, cx, cy, fov = 100., 199.5, 149.5, math.pi
        pixel = fisheye_equidistant_project((0.,0.,-1.),f,cx,cy,fov)
        self.assertAlmostEqual(pixel[0],cx)
        self.assertAlmostEqual(pixel[1],cy)
        self.assertEqual(fisheye_equidistant_unproject(pixel,f,cx,cy,fov),(0.,0.,-1.))

    def test_fisheye_equidistant_horizontal_45_degree_ray(self):
        f, cx, cy, fov = 100., 100., 100., math.pi
        pixel = fisheye_equidistant_project((1.,0.,-1.),f,cx,cy,fov)
        self.assertAlmostEqual(pixel[0],cx+f*math.pi/4)
        self.assertAlmostEqual(pixel[1],cy)
        inverse = fisheye_equidistant_unproject(pixel,f,cx,cy,fov)
        for observed,expected in zip(inverse,(1.,0.,-1.)):
            self.assertAlmostEqual(observed,expected)

    def test_fisheye_vertical_sign_and_direction(self):
        f,cx,cy,fov=200.,120.,80.,math.pi
        pixel=fisheye_equidistant_project((0.,1.,-1.),f,cx,cy,fov)
        self.assertAlmostEqual(pixel[0],cx)
        self.assertLess(pixel[1],cy)
        inverse=fisheye_equidistant_unproject(pixel,f,cx,cy,fov)
        for got,expected in zip(inverse,(0.,1.,-1.)):
            self.assertAlmostEqual(got,expected)

    def test_fisheye_field_of_view_boundary_and_backfacing(self):
        f,cx,cy,fov=100.,200.,150.,1.0
        self.assertIsNone(fisheye_equidistant_unproject((cx+f*fov/2,cy),f,cx,cy,fov))
        self.assertIsNone(fisheye_equidistant_project((0.,0.,1.),f,cx,cy,fov))
        self.assertIsNone(fisheye_equidistant_project((2.,0.,-1.),f,cx,cy,fov))
        self.assertIsNotNone(fisheye_equidistant_project((0.2,0.,-1.),f,cx,cy,fov))


    def test_linear_camera_resize_preserves_exact_center(self):
        result = resize_native_center_and_focal(640, 480, 320, 550., 540., 319.5, 239.5)
        self.assertEqual(result, (240, 275., 270., 159.5, 119.5))

    def test_linear_camera_resize_nonsymmetric_center_not_naive_scale(self):
        new_h, fx, fy, cx, cy = resize_native_center_and_focal(
            640, 480, 320, 550., 540., 301.25, 199.75)
        self.assertEqual(new_h, 240)
        self.assertEqual((fx, fy), (275., 270.))
        self.assertEqual(cx, 150.375)
        self.assertEqual(cy, 99.625)
        self.assertNotEqual(cx, 301.25 * 0.5)

    def test_linear_camera_resize_center_scale_composition(self):
        old = (640, 480, 1024., 512., 287.5, 209.5)
        h2,fx2,fy2,cx2,cy2 = resize_native_center_and_focal(
            old[0],old[1],320,*old[2:])
        h4,fx4,fy4,cx4,cy4 = resize_native_center_and_focal(
            320,h2,160,fx2,fy2,cx2,cy2)
        direct = resize_native_center_and_focal(
            old[0],old[1],160,*old[2:])
        for computed,expected in zip((h4,fx4,fy4,cx4,cy4),direct):
            self.assertAlmostEqual(computed,expected)



if __name__ == "__main__":
    unittest.main()
