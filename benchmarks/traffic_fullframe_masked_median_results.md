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

## Additional high-occlusion stress case: ~60% mask coverage

**Successful run:** https://github.com/Persie0/Playground/actions/runs/39177300495

The [dedicated reproducible harness](traffic_fullframe_masked_median_60pct.py) exercises the **same unmodified historical vs current full production median functions** at 1296 × 972 pixels, 60 frames, 32-row tiles and read-only disk-backed uint8 samples. Each input frame has a moving/rotating random selection of 86 or 87 of 144 equal-sized rectangular grid regions masked, plus a permanently occluded 26 × 26 patch to exercise inpainting. This is intentionally a **synthetic worst-case mask-coverage stress test** rather than real traffic/detector output.

Union of the rectangles was checked pixel by pixel for every one of the 60 frames, including overlap with the permanent patch: average **60.01699%** masked per frame (range **59.722%–60.470%**). This is **per-frame occlusion**, not 60% of the scene permanently occluded across all observations.

| Synthetic scenario | Historical production | Optimized production | Improvement | Exact output |
| --- | ---: | ---: | ---: | :---: |
| ~60.017% masked area per frame | **7,990.434 ms** | **1,720.320 ms** | **4.645×** | Yes |

Three isolated subprocess timing repetitions per version, alternating order. The result report confirms the original input memmap was unchanged and final RGB output SHA-256 matched for all runs.

**Important limitations:** hosted ARM64 Neoverse-N2, **not** Raspberry Pi 5; synthetic grid-aligned box sizes and motion, **not** actual LibreYOLO detections. This is a full-median+inpainting function benchmark, not end-to-end camera/inference FPS or sustained thermal validation. Runtime may differ considerably on the Pi.

Numerical results and per-repetition measurements are in the 7-day GitHub Actions artifact [traffic-median-mask60-arm64-results](https://github.com/Persie0/Playground/actions/runs/39177300495/artifacts/12154557817). The source harness and this text remain versioned in the repository.
