#!/usr/bin/env python3
"""Train SPAN-S/M with synthetic degradation and optional ONNX distillation."""

from __future__ import annotations

import argparse
import json
import random
from pathlib import Path

import numpy as np
import onnxruntime as ort
import torch
from PIL import Image
from torch import Tensor
from torch.nn import functional as F

from mobile_sr import SPAN, SpanConfig
from mobile_sr.degradation import degrade


IMAGE_SUFFIXES = {".png", ".jpg", ".jpeg", ".webp", ".tif", ".tiff"}


def load_images(folder: Path | None) -> list[Path]:
    if folder is None:
        return []
    return sorted(path for path in folder.rglob("*") if path.suffix.lower() in IMAGE_SUFFIXES)


def procedural_patch(size: int, device: torch.device) -> Tensor:
    # Smoke-test data only: smooth gradients, edges and noise exercise the full
    # training/export path without pretending to produce a release checkpoint.
    coordinates = torch.linspace(0.0, 1.0, size, device=device)
    yy, xx = torch.meshgrid(coordinates, coordinates, indexing="ij")
    channels = [xx, yy, 0.5 + 0.25 * torch.sin(xx * random.randint(4, 20))]
    value = torch.stack(channels).unsqueeze(0)
    value = value + torch.randn_like(value) * 0.02
    return value.clamp(0.0, 1.0)


def image_patch(path: Path, size: int, device: torch.device) -> Tensor:
    with Image.open(path) as image:
        image = image.convert("RGB")
        if image.width < size or image.height < size:
            ratio = max(size / image.width, size / image.height)
            image = image.resize(
                (round(image.width * ratio), round(image.height * ratio)),
                Image.Resampling.LANCZOS,
            )
        left = random.randint(0, image.width - size)
        top = random.randint(0, image.height - size)
        image = image.crop((left, top, left + size, top + size))
        data = np.asarray(image, dtype=np.float32) / 255.0
    return torch.from_numpy(data).permute(2, 0, 1).unsqueeze(0).to(device)


def charbonnier(actual: Tensor, expected: Tensor, epsilon: float = 1e-3) -> Tensor:
    return torch.sqrt((actual - expected) ** 2 + epsilon**2).mean()


def gradient_loss(actual: Tensor, expected: Tensor) -> Tensor:
    actual_x = actual[..., :, 1:] - actual[..., :, :-1]
    expected_x = expected[..., :, 1:] - expected[..., :, :-1]
    actual_y = actual[..., 1:, :] - actual[..., :-1, :]
    expected_y = expected[..., 1:, :] - expected[..., :-1, :]
    return F.l1_loss(actual_x, expected_x) + F.l1_loss(actual_y, expected_y)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--dataset", type=Path)
    parser.add_argument("--teacher", type=Path)
    parser.add_argument("--output", required=True, type=Path)
    parser.add_argument("--scale", required=True, type=int, choices=(2, 4))
    parser.add_argument("--channels", type=int, default=32)
    parser.add_argument("--blocks", type=int, default=4)
    parser.add_argument("--steps", type=int, default=100_000)
    parser.add_argument("--patch-size", type=int, default=128)
    parser.add_argument("--learning-rate", type=float, default=2e-4)
    parser.add_argument("--seed", type=int, default=20260829)
    args = parser.parse_args()

    random.seed(args.seed)
    np.random.seed(args.seed)
    torch.manual_seed(args.seed)
    device = torch.device("cuda" if torch.cuda.is_available() else "cpu")
    paths = load_images(args.dataset)
    if args.dataset is not None and not paths:
        parser.error("--dataset contains no supported images")
    if not paths and args.steps > 10:
        parser.error("procedural smoke training is capped at 10 steps")

    config = SpanConfig(scale=args.scale, channels=args.channels, blocks=args.blocks)
    model = SPAN(config).to(device)
    optimizer = torch.optim.AdamW(model.parameters(), lr=args.learning_rate)
    teacher = None
    if args.teacher:
        teacher = ort.InferenceSession(str(args.teacher), providers=["CPUExecutionProvider"])

    losses: list[float] = []
    for step in range(args.steps):
        hr = (
            image_patch(random.choice(paths), args.patch_size, device)
            if paths
            else procedural_patch(args.patch_size, device)
        )
        lr = degrade(hr, args.scale)
        target = hr
        if teacher is not None:
            teacher_input = teacher.get_inputs()[0].name
            distilled = teacher.run(None, {teacher_input: lr.detach().cpu().numpy()})[0]
            target = torch.from_numpy(distilled).to(device)
        prediction = model(lr)
        loss = charbonnier(prediction, target) + 0.05 * gradient_loss(prediction, target)
        optimizer.zero_grad(set_to_none=True)
        loss.backward()
        torch.nn.utils.clip_grad_norm_(model.parameters(), 1.0)
        optimizer.step()
        losses.append(float(loss.detach().cpu()))
        if step % 100 == 0 or step + 1 == args.steps:
            print(json.dumps({"step": step + 1, "loss": losses[-1], "device": str(device)}))

    args.output.parent.mkdir(parents=True, exist_ok=True)
    training_status = "candidate" if paths else "smoke"
    torch.save(
        {
            "model": model.cpu().state_dict(),
            "config": config.__dict__,
            "metadata": {
                "trainingStatus": training_status,
                "steps": args.steps,
                "datasetImageCount": len(paths),
                "teacher": str(args.teacher) if args.teacher else None,
                "finalLoss": losses[-1],
            },
        },
        args.output,
    )


if __name__ == "__main__":
    main()

