"""Small second-order degradation pipeline for licensed HR image training."""

from __future__ import annotations

import random

import torch
from torch import Tensor
from torch.nn import functional as F


def _gaussian_kernel(size: int, sigma: float, device: torch.device) -> Tensor:
    axis = torch.arange(size, dtype=torch.float32, device=device) - size // 2
    kernel = torch.exp(-(axis**2) / (2.0 * sigma**2))
    kernel = kernel / kernel.sum()
    return torch.outer(kernel, kernel)


def _blur(images: Tensor, sigma: float) -> Tensor:
    size = 2 * max(1, int(round(2.0 * sigma))) + 1
    kernel = _gaussian_kernel(size, sigma, images.device)
    weight = kernel.expand(images.shape[1], 1, size, size)
    return F.conv2d(images, weight, padding=size // 2, groups=images.shape[1])


def _jpeg_like(images: Tensor, levels: int) -> Tensor:
    # Differentiable quantization surrogate; inputs remain in RGB [0,1].
    return torch.round(images * levels) / levels


def degrade(hr: Tensor, scale: int, *, second_order: bool = True) -> Tensor:
    """Generate LR input using blur, resize, noise and quantization."""

    value = _blur(hr, random.uniform(0.2, 2.0))
    target_size = (hr.shape[-2] // scale, hr.shape[-1] // scale)
    value = F.interpolate(value, size=target_size, mode="bicubic", align_corners=False)
    if random.random() < 0.75:
        value = value + torch.randn_like(value) * random.uniform(0.0, 0.025)
    value = _jpeg_like(value.clamp(0.0, 1.0), random.randint(32, 128))

    if second_order and random.random() < 0.7:
        value = _blur(value, random.uniform(0.2, 1.2))
        larger = (
            max(target_size[0], int(target_size[0] * random.uniform(1.0, 1.3))),
            max(target_size[1], int(target_size[1] * random.uniform(1.0, 1.3))),
        )
        value = F.interpolate(value, size=larger, mode="bilinear", align_corners=False)
        value = F.interpolate(value, size=target_size, mode="bicubic", align_corners=False)
        value = _jpeg_like(value.clamp(0.0, 1.0), random.randint(40, 160))
    return value.clamp(0.0, 1.0)

