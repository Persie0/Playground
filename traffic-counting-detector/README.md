# Traffic detector 384x288 lab

Isolated export and benchmark workspace for `Persie0/traffic-counting-light-main`.

The goal is to test 384×288 NCNN detector inputs without putting experimental CI or generated model artifacts into the production traffic repository.

## What the workflow does

1. Checks out this Playground repository.
2. Checks out the private traffic repository with `PRIVATE_REPO_TOKEN` (or `GH_TOKEN`).
3. Installs CPU-only PyTorch plus the pinned Ultralytics/NCNN toolchain.
4. Runs unit tests for the export validator.
5. Exports:
   - YOLO11n → 384×288 NCNN
   - YOLOv9t → 384×288 NCNN
6. Benchmarks both candidates through the traffic project's real `NcnnDetector` implementation against the existing:
   - YOLOX-N 416×256 NCNN
   - YOLO11n 416×256 NCNN
7. Uploads only the generated detector models and benchmark JSON as a short-lived Playground artifact.

The private traffic source tree itself is never uploaded as an artifact.

## Benchmark scope

The automated run is a smoke/performance benchmark on the committed dewarped ZeroCam sample image. It measures the complete production detector call, including NCNN inference, output decoding, confidence filtering, and NMS.

It is **not** a replacement for the Cityscapes accuracy benchmark. Model promotion back into the production Raspberry Pi config should require both:

- functional/performance validation here; and
- accuracy validation on the project's proper benchmark dataset or representative intersection footage.

## Run

Use the GitHub Actions workflow **Traffic detector 384x288 lab**. The default private traffic ref is `main`; a branch/tag/SHA can be supplied for manual runs.
