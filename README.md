# Mobile Super-Resolution Lab

Reproducible tooling for the models used by
[`Persie0/image_enhancer`](https://github.com/Persie0/image_enhancer).

The default build converts the two useful upstream networks to a static
`1x3x128x128` input. Static shapes let ONNX Runtime offer the complete graph to
NNAPI and Core ML instead of silently running a dynamic graph on the CPU.

## Released mobile models

| Artifact | Source architecture | Scale | Precision | Intended runtime |
|---|---|---:|---|---|
| `general2xlow_t128_fp32.onnx` | SRVGG-like | 2x | FP32 | NNAPI/Core ML, XNNPACK fallback |
| `anime4xlow_t128_fp32.onnx` | SPAN | 4x | FP32 | NNAPI/Core ML, XNNPACK fallback |

The graph transform does not change weights or outputs. `build_fixed_models.py`
runs the original and static graph on identical inputs and fails if numerical
parity, static dimensions, output scale, or ONNX validation fails. A manifest
with exact byte sizes and SHA-256 hashes is generated with the models.

## Commands

```bash
python -m pip install -r requirements-ci.txt
python scripts/build_fixed_models.py --output dist
pytest -q
```

To export a trained SPAN candidate:

```bash
python scripts/export_span.py \
  --checkpoint checkpoints/span_s_x2.pt \
  --scale 2 --channels 32 --blocks 4 \
  --tile-size 128 --output dist/span_s_x2_t128.onnx
```

`train_span.py` supports HR image folders, Real-ESRGAN-style synthetic
degradation, and optional output distillation from a teacher ONNX model. CI
only performs a tiny smoke train and never publishes that checkpoint. A model
is production-eligible only when its checkpoint was trained on a licensed
dataset and its quality report passes the thresholds in `quality_gate.py`.

## Release behavior

Pull requests validate and upload workflow artifacts. A push to `main` also
updates the stable `mobile-models-v1` release used by the app. The release step
uses only `GITHUB_TOKEN`; no repository secrets are required.

## Licensing

Tooling in this repository is Apache-2.0. Upstream model binaries retain their
own terms. The neuralfulai binaries have no clear redistribution license, so
the workflow records their provenance and the app should not ship them as
bundled commercial assets until the owner clarifies the license.

