from pathlib import Path

import pytest
import yaml

from export_ncnn_models import ExportSpec, validate_export_directory


def test_validate_export_directory_accepts_expected_imgsz(tmp_path: Path):
    model_dir = tmp_path / "yolo11n_384x288_ncnn_model"
    model_dir.mkdir()
    (model_dir / "model.ncnn.param").write_text("7767517\n1 1\nInput in0 0 1 in0\n", encoding="utf-8")
    (model_dir / "model.ncnn.bin").write_bytes(b"weights")
    (model_dir / "metadata.yaml").write_text(
        yaml.safe_dump({"imgsz": [288, 384], "stride": 32, "task": "detect"}),
        encoding="utf-8",
    )

    result = validate_export_directory(
        model_dir,
        ExportSpec(model="yolo11n.pt", width=384, height=288, output_name=model_dir.name),
    )

    assert result == model_dir


def test_validate_export_directory_rejects_wrong_imgsz(tmp_path: Path):
    model_dir = tmp_path / "wrong"
    model_dir.mkdir()
    (model_dir / "model.ncnn.param").write_text("Input in0 0 1 in0\n", encoding="utf-8")
    (model_dir / "model.ncnn.bin").write_bytes(b"weights")
    (model_dir / "metadata.yaml").write_text(yaml.safe_dump({"imgsz": [256, 416]}), encoding="utf-8")

    with pytest.raises(ValueError, match="expected 288x384"):
        validate_export_directory(
            model_dir,
            ExportSpec(model="yolo11n.pt", width=384, height=288, output_name="wrong"),
        )
