# Traffic detector YOLO26n 384x288 lab

Isolated export and benchmark workspace for `Persie0/traffic-counting-light-main`.

## Goal

Evaluate the current production detector, **YOLO11n 384×288 NCNN**, against the newer **YOLO26n 384×288 NCNN** candidate without changing the production repository first.

Ultralytics currently recommends YOLO26 and YOLO11 for production. YOLO12/YOLO13 are intentionally excluded from this promotion test because Ultralytics warns that they are larger/slower or less stable for production CPU deployment.

## What the workflow does

1. Checks out Playground.
2. Checks out the private traffic project at the requested ref.
3. Pulls only the Git LFS object for the exact production YOLO11n 384×288 NCNN baseline.
4. Installs the pinned CPU/NCNN toolchain and current Ultralytics release.
5. Exports **YOLO26n → fixed 384×288 NCNN** using the traditional raw one-to-many output expected by the current `NcnnDetector`.
6. Runs the helper tests.
7. Benchmarks both models through the production `NcnnDetector` on the committed dewarped ZeroCam image.
8. Runs the deterministic 180-image COCO val2017 traffic subset used by the previous promotion benchmark.
9. Uploads the YOLO26n model plus benchmark JSON/Markdown as a short-lived artifact.

## Promotion rule

The benchmark retains the existing rule: choose the highest macro F1 among candidates within 20% of the fastest measured detector latency.

Promotion to the private production repository happens only after reviewing the benchmark output.

## Important limitation

GitHub-hosted x86 CPU timing is a relative comparison. Final Raspberry Pi 5 latency, power and thermal behavior still need on-device verification.
