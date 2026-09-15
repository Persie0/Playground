from __future__ import annotations

import argparse
import json
import sys
import tempfile
import time
from dataclasses import dataclass
from pathlib import Path

import cv2
import yaml


@dataclass(frozen=True)
class ModelSpec:
    name: str
    model_dir: Path
    width: int
    height: int
    yolox: bool


def letterbox(image, width: int, height: int):
    src_h, src_w = image.shape[:2]
    scale = min(width / float(src_w), height / float(src_h))
    resized_w = max(1, int(round(src_w * scale)))
    resized_h = max(1, int(round(src_h * scale)))
    resized = cv2.resize(
        image,
        (resized_w, resized_h),
        interpolation=cv2.INTER_AREA if scale < 1.0 else cv2.INTER_LINEAR,
    )
    pad_x = (width - resized_w) // 2
    pad_y = (height - resized_h) // 2
    padded = cv2.copyMakeBorder(
        resized,
        pad_y,
        height - resized_h - pad_y,
        pad_x,
        width - resized_w - pad_x,
        cv2.BORDER_CONSTANT,
        value=(114, 114, 114),
    )
    return padded, resized_w / float(src_w), resized_h / float(src_h), pad_x, pad_y


def _write_detector_config(path: Path, spec: ModelSpec, threads: int) -> None:
    path.write_text(
        yaml.safe_dump(
            {
                "detector": {
                    "type": "ncnn",
                    "half": False,
                    "device": "cpu",
                    "img_width": spec.width,
                    "img_height": spec.height,
                    "conf_threshold": 0.3,
                    "iou_threshold": 0.5,
                    "ncnn": {
                        "model": str(spec.model_dir.resolve()),
                        "num_threads": threads,
                        "yolox": spec.yolox,
                    },
                }
            },
            sort_keys=False,
        ),
        encoding="utf-8",
    )


def main() -> None:
    parser = argparse.ArgumentParser(description="Benchmark NCNN detector candidates through the production detector implementation.")
    parser.add_argument("--private-repo", type=Path, required=True)
    parser.add_argument("--generated-models", type=Path, required=True)
    parser.add_argument("--output", type=Path, required=True)
    parser.add_argument("--threads", type=int, default=4)
    parser.add_argument("--warmup", type=int, default=10)
    parser.add_argument("--iterations", type=int, default=50)
    args = parser.parse_args()

    private_repo = args.private_repo.resolve()
    edge_dir = private_repo / "edge"
    edge_src = edge_dir / "src"
    if not edge_src.is_dir():
        raise FileNotFoundError(f"Traffic edge source not found: {edge_src}")

    sys.path.insert(0, str(edge_src))
    from detectors.ncnn_detector import NcnnDetector
    from interfaces.image_loader import ProcessedImage
    from utils.config import Config

    image_path = private_repo / "tools" / "camera_calibration" / "docs" / "example1_dewarped.jpg"
    image = cv2.imread(str(image_path))
    if image is None:
        raise RuntimeError(f"Could not read benchmark image: {image_path}")

    specs = [
        ModelSpec("yoloxn_416x256", edge_dir / "models" / "yoloxn_416x256_ncnn_model", 416, 256, True),
        ModelSpec("yolo11n_416x256", edge_dir / "models" / "yolo11n_416x256_ncnn_model", 416, 256, False),
        ModelSpec("yolo11n_384x288", args.generated_models / "yolo11n_384x288_ncnn_model", 384, 288, False),
        ModelSpec("yolov9t_384x288", args.generated_models / "yolov9t_384x288_ncnn_model", 384, 288, False),
    ]

    results: dict[str, dict[str, object]] = {}
    original_h, original_w = image.shape[:2]

    with tempfile.TemporaryDirectory(prefix="traffic-detector-bench-") as temp_dir:
        temp_dir_path = Path(temp_dir)
        for spec in specs:
            for required in ("model.ncnn.param", "model.ncnn.bin"):
                if not (spec.model_dir / required).is_file():
                    raise FileNotFoundError(f"{spec.name}: missing {spec.model_dir / required}")

            config_path = temp_dir_path / f"{spec.name}.yaml"
            _write_detector_config(config_path, spec, args.threads)
            Config.load(config_path)
            detector = NcnnDetector()

            processed, scale_x, scale_y, pad_x, pad_y = letterbox(image, spec.width, spec.height)
            processed_image = ProcessedImage(
                original_image=image,
                image=processed,
                original_width=original_w,
                original_height=original_h,
                width=spec.width,
                height=spec.height,
                scale_x=scale_x,
                scale_y=scale_y,
                pad_x=pad_x,
                pad_y=pad_y,
            )

            for _ in range(args.warmup):
                detector.detect(processed_image)

            last = None
            started = time.perf_counter()
            for _ in range(args.iterations):
                last = detector.detect(processed_image)
            elapsed = time.perf_counter() - started

            avg_ms = elapsed * 1000.0 / args.iterations
            fps = args.iterations / elapsed
            assert last is not None
            result = {
                "input_width": spec.width,
                "input_height": spec.height,
                "tensor_pixels": spec.width * spec.height,
                "avg_detection_ms": avg_ms,
                "fps": fps,
                "cars_on_smoke_image": len(last.cars),
                "pedestrians_on_smoke_image": len(last.pedestrians),
                "model_bin_bytes": (spec.model_dir / "model.ncnn.bin").stat().st_size,
            }
            results[spec.name] = result
            print(f"{spec.name}: {json.dumps(result, sort_keys=True)}", flush=True)

    args.output.parent.mkdir(parents=True, exist_ok=True)
    args.output.write_text(json.dumps(results, indent=2, sort_keys=True), encoding="utf-8")


if __name__ == "__main__":
    main()
