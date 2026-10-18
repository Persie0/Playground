# Full-resolution masked-median A/B (19 October 2026)

**Run:** https://github.com/Persie0/Playground/actions/runs/39176120471 — **passed**

This compares the unmodified historical production median function with the unmodified current production implementation, loaded from pinned commits in the traffic repository. Neither implementation is copied into public Playground.

## Pinned versions and environment
- Before: e2ec5b544f084029d9fcfc473af2567c668a03ae (float/NaN + NumPy nanmedian).
- After: 805ac7fa4d7970f37b56b8e37dab738c923ce795 (uint8 tile + stable sort).
- Harness: [traffic_fullframe_masked_median.py](traffic_fullframe_masked_median.py).
- Runner: GitHub Actions ubuntu-24.04-arm, 4× Neoverse-N2 (aarch64), Python 3.13, NumPy 2.5.1, OpenCV 4.13.0.

## Production-matching parameters
- Resolution **1296 × 972 × 3**; 60 source frames; **32-row tiles**; inpaint radius 3; disk-backed uint8 memmap, opened read-only.
- Complete function timing across all tiles, including actual inpainting of a permanently occluded region.
- Synthetic static-background images with moving simulated detection boxes: seven objects in the moderate scene, 37 in the dense scene, plus one permanently masked patch.
- Three independent subprocess timings per version/scenario, with alternating version order; same generated inputs.
- All outputs validated by full-image SHA-256 digest; two scenarios passed byte equality.

| Synthetic scene | Original | Optimized | Speedup | Same output? |
| --- | ---: | ---: | ---: | :---: |
| Moderate masking | 11,191.68 ms | 1,131.25 ms | **9.89×** | Yes |
| Dense masking | 10,769.81 ms | 1,221.34 ms | **8.82×** | Yes |

## Interpretation
This is a **full-resolution production algorithm** comparison, not an extrapolation from 96-row samples. However, inputs are **synthetic** and the host is **not a Raspberry Pi 5**. Neoverse-N2 CPU and memory hierarchy differ substantially from Pi 5, so absolute runtime and even relative speedups may differ on the deployed hardware.

Timed interval includes median and inpaint, but not actual camera acquisition, inference, tracking, collector writes, asynchronous scheduling, background JPEG publication or thermal contention. The numbers are **not a measured end-to-end pipeline FPS gain** or proof the Pi 5 background spike is resolved.

The run artifact traffic-median-fullframe-arm64-results records all individual measurements, process CPU time, per-process peak RSS, and input/output SHA-256 digests. Private source or raw synthetic input arrays are not uploaded. The Actions artifact has seven-day retention.
