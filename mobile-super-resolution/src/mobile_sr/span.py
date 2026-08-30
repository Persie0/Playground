"""Accelerator-friendly SPAN-inspired super-resolution network.

The deployment graph deliberately stays within Conv, Relu, Add, Mul, Clip and
DepthToSpace-compatible operations. It avoids dynamic indexing, normalization,
transformer operations and other patterns that fragment NNAPI/Core ML graphs.
"""

from __future__ import annotations

from dataclasses import dataclass

import torch
from torch import Tensor, nn
from torch.nn import functional as F


@dataclass(frozen=True)
class SpanConfig:
    scale: int
    channels: int = 32
    blocks: int = 4
    input_channels: int = 3

    def __post_init__(self) -> None:
        if self.scale not in (2, 4):
            raise ValueError("scale must be 2 or 4")
        if self.channels < 8:
            raise ValueError("channels must be at least 8")
        if self.blocks < 1:
            raise ValueError("blocks must be positive")


class SPAB(nn.Module):
    """Swift parameter-free attention block with a residual connection."""

    def __init__(self, channels: int) -> None:
        super().__init__()
        self.conv1 = nn.Conv2d(channels, channels, 3, padding=1)
        self.conv2 = nn.Conv2d(channels, channels, 3, padding=1)
        self.conv3 = nn.Conv2d(channels, channels, 3, padding=1)
        self.activation = nn.ReLU(inplace=False)

    def forward(self, value: Tensor) -> Tensor:
        residual = value
        value = self.activation(self.conv1(value))
        value = self.activation(self.conv2(value))
        value = self.conv3(value)
        # ReLU6 is cheaper and more consistently delegated than sigmoid on
        # older mobile accelerators. Dividing by six bounds attention to [0,1].
        attention = F.relu6(value + 3.0) / 6.0
        return residual + value * attention


class SPAN(nn.Module):
    """Small, fully convolutional SR model for 2x/4x mobile inference."""

    def __init__(self, config: SpanConfig) -> None:
        super().__init__()
        self.config = config
        self.head = nn.Conv2d(config.input_channels, config.channels, 3, padding=1)
        self.body = nn.ModuleList(SPAB(config.channels) for _ in range(config.blocks))
        self.fusion = nn.Conv2d(
            config.channels * (config.blocks + 1), config.channels, 1
        )
        self.tail = nn.Conv2d(
            config.channels,
            config.input_channels * config.scale * config.scale,
            3,
            padding=1,
        )
        self.shuffle = nn.PixelShuffle(config.scale)

    def forward(self, image: Tensor) -> Tensor:
        features = self.head(image)
        collected = [features]
        value = features
        for block in self.body:
            value = block(value)
            collected.append(value)
        residual = self.shuffle(self.tail(self.fusion(torch.cat(collected, dim=1))))
        base = F.interpolate(image, scale_factor=self.config.scale, mode="bilinear", align_corners=False)
        return torch.clamp(base + residual, 0.0, 1.0)

