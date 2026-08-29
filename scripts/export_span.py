#!/usr/bin/env python3
"""Export a trained SPAN checkpoint to a static mobile ONNX graph."""

from __future__ import annotations

import argparse
import hashlib
import json
from pathlib import Path

import onnx
import onnxruntime as ort
import torch

from mobile_sr import SPAN, SpanConfig


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--checkpoint", required=True, type=Path)
    parser.add_argument("--output", required=True, type=Path)
    parser.add_argument("--scale", required=True, type=int, choices=(2, 4))
    parser.add_argument("--channels", type=int, default=32)
    parser.add_argument("--blocks", type=int, default=4)
    parser.add_argument("--tile-size", type=int, default=128, choices=(64, 128))
    parser.add_argument("--allow-smoke-checkpoint", action="store_true")
    args = parser.parse_args()

    checkpoint = torch.load(args.checkpoint, map_location="cpu", weights_only=True)
    metadata = checkpoint.get("metadata", {})
    if metadata.get("trainingStatus") != "production" and not args.allow_smoke_checkpoint:
        parser.error("checkpoint is not marked production; pass --allow-smoke-checkpoint only for CI")
    config = SpanConfig(scale=args.scale, channels=args.channels, blocks=args.blocks)
    model = SPAN(config)
    model.load_state_dict(checkpoint["model"])
    model.eval()
    sample = torch.rand(1, 3, args.tile_size, args.tile_size)
    args.output.parent.mkdir(parents=True, exist_ok=True)
    torch.onnx.export(
        model,
        sample,
        args.output,
        input_names=["input"],
        output_names=["output"],
        opset_version=17,
        do_constant_folding=True,
        dynamic_axes=None,
    )
    graph = onnx.load(args.output)
    onnx.checker.check_model(graph, full_check=True)
    session = ort.InferenceSession(str(args.output), providers=["CPUExecutionProvider"])
    result = session.run(None, {"input": sample.numpy()})[0]
    expected = (1, 3, args.tile_size * args.scale, args.tile_size * args.scale)
    if tuple(result.shape) != expected:
        raise ValueError(f"unexpected exported output {result.shape}; expected {expected}")
    digest = hashlib.sha256(args.output.read_bytes()).hexdigest()
    args.output.with_suffix(".json").write_text(
        json.dumps(
            {
                "filename": args.output.name,
                "sha256": digest,
                "byteSize": args.output.stat().st_size,
                "scale": args.scale,
                "staticTileSize": args.tile_size,
                "channels": args.channels,
                "blocks": args.blocks,
                "trainingStatus": metadata.get("trainingStatus", "unknown"),
            },
            indent=2,
        )
        + "\n",
        encoding="utf-8",
    )


if __name__ == "__main__":
    main()

