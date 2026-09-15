from __future__ import annotations

import argparse
import shutil
from dataclasses import dataclass
from pathlib import Path

import yaml


@dataclass(frozen=True)
class ExportSpec:
    model: str
    width: int
    height: int
    output_name: str


def validate_export_directory(model_dir: Path, spec: ExportSpec) -> Path:
    required = ["model.ncnn.param", "model.ncnn.bin", "metadata.yaml"]
    missing = [name for name in required if not (model_dir / name).is_file()]
    if missing:
        raise FileNotFoundError(f"Missing NCNN export files in {model_dir}: {missing}")

    metadata = yaml.safe_load((model_dir / "metadata.yaml").read_text(encoding="utf-8")) or {}
    imgsz = metadata.get("imgsz")
    expected = [spec.height, spec.width]
    if imgsz != expected:
        raise ValueError(f"NCNN export metadata has imgsz={imgsz}; expected {spec.height}x{spec.width}")

    param_text = (model_dir / "model.ncnn.param").read_text(encoding="utf-8")
    if "Input" not in param_text or "in0" not in param_text:
        raise ValueError(f"NCNN param file in {model_dir} does not expose input blob 'in0'")

    return model_dir


def export_ultralytics_ncnn(spec: ExportSpec, models_dir: Path) -> Path:
    from ultralytics import YOLO

    models_dir = Path(models_dir)
    models_dir.mkdir(parents=True, exist_ok=True)

    model_source = Path(spec.model)
    model_arg = str(model_source) if model_source.exists() else spec.model

    model = YOLO(model_arg)
    exported = Path(
        model.export(
            format="ncnn",
            imgsz=(spec.height, spec.width),
            batch=1,
            half=False,
            device="cpu",
        )
    )

    target = models_dir / spec.output_name
    if target.exists():
        shutil.rmtree(target)
    shutil.copytree(exported, target)
    return validate_export_directory(target, spec)


def parse_args() -> argparse.Namespace:
    parser = argparse.ArgumentParser(description="Export an Ultralytics detection model to a fixed-shape NCNN directory.")
    parser.add_argument("--model", required=True)
    parser.add_argument("--width", type=int, required=True)
    parser.add_argument("--height", type=int, required=True)
    parser.add_argument("--output-name", required=True)
    parser.add_argument("--models-dir", type=Path, default=Path("models"))
    return parser.parse_args()


def main() -> None:
    args = parse_args()
    spec = ExportSpec(
        model=args.model,
        width=args.width,
        height=args.height,
        output_name=args.output_name,
    )
    output = export_ultralytics_ncnn(spec, args.models_dir)
    print(output)


if __name__ == "__main__":
    main()
