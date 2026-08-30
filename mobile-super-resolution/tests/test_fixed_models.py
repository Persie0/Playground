from __future__ import annotations

from pathlib import Path

import numpy as np
import onnx
from onnx import TensorProto, helper

from scripts.build_fixed_models import SourceModel, build_fixed_model, sha256


def make_dynamic_nearest_model(path: Path) -> None:
    input_info = helper.make_tensor_value_info(
        "input", TensorProto.FLOAT, ["batch", 3, "height", "width"]
    )
    output_info = helper.make_tensor_value_info(
        "output", TensorProto.FLOAT, ["batch", 3, "out_height", "out_width"]
    )
    scales = helper.make_tensor("scales", TensorProto.FLOAT, [4], [1.0, 1.0, 2.0, 2.0])
    resize = helper.make_node(
        "Resize",
        ["input", "", "scales"],
        ["output"],
        mode="nearest",
        coordinate_transformation_mode="asymmetric",
    )
    graph = helper.make_graph([resize], "toy", [input_info], [output_info], [scales])
    model = helper.make_model(
        graph,
        opset_imports=[helper.make_opsetid("", 17)],
        ir_version=10,
    )
    onnx.save(model, path)


def test_build_fixes_shape_and_preserves_output(tmp_path: Path) -> None:
    original = tmp_path / "toy.onnx"
    fixed = tmp_path / "toy_t128.onnx"
    make_dynamic_nearest_model(original)
    source = SourceModel(
        id="toy",
        source_url="https://example.invalid/toy.onnx",
        source_sha256=sha256(original),
        scale=2,
        family="test",
        display_name="Toy",
        is_pro=False,
    )
    entry = build_fixed_model(original, fixed, tile_size=128, source=source)
    assert entry["byteSize"] == fixed.stat().st_size
    assert entry["parity"]["maxAbsoluteError"] <= 1e-5
    graph = onnx.load(fixed)
    dimensions = graph.graph.input[0].type.tensor_type.shape.dim
    assert [dimension.dim_value for dimension in dimensions] == [1, 3, 128, 128]
    assert np.isfinite(entry["parity"]["meanAbsoluteError"])

