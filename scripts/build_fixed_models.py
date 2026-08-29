#!/usr/bin/env python3
"""Build numerically equivalent, static-shape mobile ONNX models."""

from __future__ import annotations

import argparse
import hashlib
import json
import shutil
import subprocess
import sys
import tempfile
import urllib.request
from dataclasses import asdict, dataclass
from pathlib import Path

import numpy as np
import onnx
import onnxruntime as ort


@dataclass(frozen=True)
class SourceModel:
    id: str
    source_url: str
    source_sha256: str
    scale: int
    family: str
    display_name: str
    is_pro: bool


SOURCES = (
    SourceModel(
        id="general2xlow",
        source_url=(
            "https://github.com/neuralfulailtd/OnnxModel/releases/download/"
            "v1.0.0/general2xlow.onnx"
        ),
        source_sha256="3036e9e42202b0ba546c74332d09a3cc3902da3b4c9d7dda26f85d7c947f852c",
        scale=2,
        family="SRVGG",
        display_name="General 2x Mobile",
        is_pro=False,
    ),
    SourceModel(
        id="anime4xlow",
        source_url=(
            "https://github.com/neuralfulailtd/OnnxModel/releases/download/"
            "v1.0.0/anime4xlow.onnx"
        ),
        source_sha256="6b0e362105f2e5dac2a8df21849d18bc0e59a375333fc04ab3ecc06f91d1c75d",
        scale=4,
        family="SPAN",
        display_name="Anime 4x Mobile",
        is_pro=True,
    ),
)


def sha256(path: Path) -> str:
    digest = hashlib.sha256()
    with path.open("rb") as stream:
        for chunk in iter(lambda: stream.read(1024 * 1024), b""):
            digest.update(chunk)
    return digest.hexdigest()


def download(url: str, destination: Path) -> None:
    request = urllib.request.Request(url, headers={"User-Agent": "mobile-sr-lab/1"})
    with urllib.request.urlopen(request, timeout=120) as response, destination.open("wb") as output:
        shutil.copyfileobj(response, output)


def tensor_shape(value_info: onnx.ValueInfoProto) -> list[int | str | None]:
    dimensions: list[int | str | None] = []
    for dimension in value_info.type.tensor_type.shape.dim:
        if dimension.HasField("dim_value"):
            dimensions.append(dimension.dim_value)
        elif dimension.HasField("dim_param"):
            dimensions.append(dimension.dim_param)
        else:
            dimensions.append(None)
    return dimensions


def _add_metadata(model_path: Path, *, source: SourceModel, tile_size: int) -> None:
    model = onnx.load(model_path)
    # The upstream exports contain stale intermediate/output annotations after
    # their dynamic dimensions are fixed. Clear those annotations and infer
    # them again from the now-static input; otherwise ONNX's strict checker
    # compares the correct 2x/4x output against the old input-sized hint.
    del model.graph.value_info[:]
    if not model.graph.output:
        raise ValueError("model has no graph output")
    output_shape = model.graph.output[0].type.tensor_type.shape
    del output_shape.dim[:]
    for value in (1, 3, tile_size * source.scale, tile_size * source.scale):
        dimension = output_shape.dim.add()
        dimension.dim_value = value
    values = {
        "CACHE_KEY": f"{source.source_sha256[:32]}t{tile_size}",
        "mobile_sr.family": source.family,
        "mobile_sr.scale": str(source.scale),
        "mobile_sr.source_sha256": source.source_sha256,
        "mobile_sr.static_input": f"1,3,{tile_size},{tile_size}",
    }
    retained = [item for item in model.metadata_props if item.key not in values]
    del model.metadata_props[:]
    model.metadata_props.extend(retained)
    for key, value in values.items():
        item = model.metadata_props.add()
        item.key = key
        item.value = value
    model = onnx.shape_inference.infer_shapes(model, strict_mode=True)
    onnx.checker.check_model(model, full_check=True)
    onnx.save(model, model_path)


def _session(path: Path) -> ort.InferenceSession:
    options = ort.SessionOptions()
    options.graph_optimization_level = ort.GraphOptimizationLevel.ORT_ENABLE_ALL
    options.intra_op_num_threads = 1
    return ort.InferenceSession(str(path), sess_options=options, providers=["CPUExecutionProvider"])


def verify_parity(original: Path, fixed: Path, tile_size: int, scale: int) -> dict[str, float]:
    original_session = _session(original)
    fixed_session = _session(fixed)
    original_input = original_session.get_inputs()[0]
    fixed_input = fixed_session.get_inputs()[0]
    if list(fixed_input.shape) != [1, 3, tile_size, tile_size]:
        raise ValueError(f"fixed input is still dynamic: {fixed_input.shape}")
    random = np.random.default_rng(20260829)
    sample = random.random((1, 3, tile_size, tile_size), dtype=np.float32)
    expected = original_session.run(None, {original_input.name: sample})[0]
    actual = fixed_session.run(None, {fixed_input.name: sample})[0]
    expected_shape = (1, 3, tile_size * scale, tile_size * scale)
    if tuple(actual.shape) != expected_shape:
        raise ValueError(f"unexpected output {actual.shape}; expected {expected_shape}")
    difference = np.abs(expected.astype(np.float32) - actual.astype(np.float32))
    metrics = {
        "maxAbsoluteError": float(difference.max(initial=0.0)),
        "meanAbsoluteError": float(difference.mean()),
    }
    if metrics["maxAbsoluteError"] > 1e-5:
        raise ValueError(f"static graph changed the output: {metrics}")
    return metrics


def build_fixed_model(
    original: Path,
    output: Path,
    *,
    tile_size: int,
    source: SourceModel,
) -> dict[str, object]:
    model = onnx.load(original, load_external_data=False)
    if not model.graph.input:
        raise ValueError("model has no graph input")
    input_name = model.graph.input[0].name
    output.parent.mkdir(parents=True, exist_ok=True)
    subprocess.run(
        [
            sys.executable,
            "-m",
            "onnxruntime.tools.make_dynamic_shape_fixed",
            "--input_name",
            input_name,
            "--input_shape",
            f"1,3,{tile_size},{tile_size}",
            str(original),
            str(output),
        ],
        check=True,
    )
    _add_metadata(output, source=source, tile_size=tile_size)
    fixed_model = onnx.load(output, load_external_data=False)
    static_shape = tensor_shape(fixed_model.graph.input[0])
    if static_shape != [1, 3, tile_size, tile_size]:
        raise ValueError(f"static shape check failed: {static_shape}")
    parity = verify_parity(original, output, tile_size, source.scale)
    digest = sha256(output)
    return {
        "id": source.id,
        "name": f"{source.id}_t{tile_size}_fp32",
        "displayName": source.display_name,
        "description": (
            f"Static {tile_size}px FP32 {source.family} graph for full NNAPI/Core ML "
            "delegation with XNNPACK fallback."
        ),
        "filename": output.name,
        "sizeMB": round(output.stat().st_size / 1_000_000, 3),
        "byteSize": output.stat().st_size,
        "sha256": digest,
        "isPro": source.is_pro,
        "downloadUrl": "",
        "scale": source.scale,
        "staticTileSize": tile_size,
        "precision": "fp32",
        "acceleratorOptimized": True,
        "sourceUrl": source.source_url,
        "sourceSha256": source.source_sha256,
        "parity": parity,
    }


def main() -> None:
    parser = argparse.ArgumentParser()
    parser.add_argument("--output", type=Path, default=Path("dist"))
    parser.add_argument("--tile-size", type=int, default=128)
    parser.add_argument(
        "--release-base-url",
        default=(
            "https://github.com/Persie0/Playground-/releases/download/"
            "mobile-models-v1"
        ),
    )
    parser.add_argument("--source-dir", type=Path)
    args = parser.parse_args()
    if args.tile_size not in (64, 128):
        parser.error("--tile-size must be 64 or 128")

    args.output.mkdir(parents=True, exist_ok=True)
    manifest: list[dict[str, object]] = []
    with tempfile.TemporaryDirectory(prefix="mobile-sr-") as temp:
        temp_dir = Path(temp)
        for source in SOURCES:
            original = (
                args.source_dir / f"{source.id}.onnx"
                if args.source_dir
                else temp_dir / f"{source.id}.onnx"
            )
            if not original.exists():
                download(source.source_url, original)
            actual_source_hash = sha256(original)
            if actual_source_hash != source.source_sha256:
                raise ValueError(
                    f"source hash mismatch for {source.id}: {actual_source_hash}"
                )
            output = args.output / f"{source.id}_t{args.tile_size}_fp32.onnx"
            entry = build_fixed_model(
                original,
                output,
                tile_size=args.tile_size,
                source=source,
            )
            entry["downloadUrl"] = f"{args.release_base_url}/{output.name}"
            manifest.append(entry)

    manifest_path = args.output / "mobile_models_manifest.json"
    manifest_path.write_text(json.dumps(manifest, indent=2) + "\n", encoding="utf-8")
    provenance = {
        "builder": "Persie0/Playground-",
        "tileSize": args.tile_size,
        "models": [asdict(source) for source in SOURCES],
        "redistributionWarning": (
            "Upstream repository does not currently state a model redistribution license."
        ),
    }
    (args.output / "provenance.json").write_text(
        json.dumps(provenance, indent=2) + "\n", encoding="utf-8"
    )


if __name__ == "__main__":
    main()
