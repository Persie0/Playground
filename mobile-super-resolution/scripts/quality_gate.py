#!/usr/bin/env python3
"""Evaluate a static ONNX model against paired LR/HR validation images."""

from __future__ import annotations

import argparse
import json
import math
from pathlib import Path

import numpy as np
import onnxruntime as ort
from PIL import Image


def read_rgb(path: Path) -> np.ndarray:
    with Image.open(path) as image:
        return np.asarray(image.convert("RGB"), dtype=np.float32) / 255.0


def psnr(actual: np.ndarray, expected: np.ndarray) -> float:
    error = float(np.mean((actual - expected) ** 2))
    return 99.0 if error == 0.0 else -10.0 * math.log10(error)


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--model", required=True, type=Path)
    parser.add_argument("--lr-dir", required=True, type=Path)
    parser.add_argument("--hr-dir", required=True, type=Path)
    parser.add_argument("--scale", required=True, type=int, choices=(2, 4))
    parser.add_argument("--minimum-psnr", type=float, default=27.0)
    parser.add_argument("--report", required=True, type=Path)
    args = parser.parse_args()

    session = ort.InferenceSession(str(args.model), providers=["CPUExecutionProvider"])
    input_info = session.get_inputs()[0]
    tile = int(input_info.shape[-1])
    scores: list[float] = []
    for lr_path in sorted(args.lr_dir.glob("*.png")):
        hr_path = args.hr_dir / lr_path.name
        if not hr_path.exists():
            raise FileNotFoundError(f"missing HR pair for {lr_path.name}")
        lr = read_rgb(lr_path)
        hr = read_rgb(hr_path)
        if lr.shape[:2] != (tile, tile):
            raise ValueError(f"{lr_path.name} must be exactly {tile}x{tile}")
        output = session.run(None, {input_info.name: lr.transpose(2, 0, 1)[None]})[0]
        actual = np.clip(output[0].transpose(1, 2, 0), 0.0, 1.0)
        if actual.shape != hr.shape:
            raise ValueError(f"shape mismatch for {lr_path.name}: {actual.shape} vs {hr.shape}")
        scores.append(psnr(actual, hr))
    if not scores:
        raise ValueError("validation set contains no PNG pairs")
    report = {
        "images": len(scores),
        "meanPsnr": float(np.mean(scores)),
        "minimumPsnr": min(scores),
        "requiredMeanPsnr": args.minimum_psnr,
        "passed": float(np.mean(scores)) >= args.minimum_psnr,
    }
    args.report.parent.mkdir(parents=True, exist_ok=True)
    args.report.write_text(json.dumps(report, indent=2) + "\n", encoding="utf-8")
    print(json.dumps(report))
    if not report["passed"]:
        raise SystemExit(1)


if __name__ == "__main__":
    main()

