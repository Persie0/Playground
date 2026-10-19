# 60% background-observation and heatmap-rendering A/B benchmarks

Successful GitHub Actions ARM64 runs, 19 October 2026. Both use 1296×972-pixel data and pinned historical/current implementations from the traffic analysis repository.

## Background valid-observation counter

[Benchmark source](traffic_observation_counts_60pct.py) · [Successful run](https://github.com/Persie0/Playground/actions/runs/39179722908) · [Raw results](https://github.com/Persie0/Playground/actions/runs/39179722908/artifacts/12154998534)

Old production commit: 6436ef9f3dd821570887128bd32a79b28acb1edc. Current: 805ac7fa4d7970f37b56b8e37dab738c923ce795.

| Workload | Actual masked pixels | Before | After | Relative speedup | Parity |
| --- | ---: | ---: | ---: | ---: | :---: |
| Random 60% boolean mask, isolated uint16 counter update | 59.9984% | 8.551 ms | 5.447 ms | 1.570× | Exact |
| Actual production collector method with 87 synthetic non-overlapping rectangular boxes | 60.0017% | 0.890 ms | 0.538 ms | 1.653× | Exact |

The workloads measure different things. The random mask test is the nearest match for the prior Pi 0%/20% count-array microbenchmarks. The rectangular-box production-method test includes boolean-mask allocation and bounding-box rasterization; a strongly structured mask can make array operations much faster than a spatially random one. **Do not mix these two data series, or extrapolate ARM64 hosted timings to Pi 5.** Synthetic initial counts include uint16 overflow cases.

## Heatmap renderer

[Benchmark source](traffic_renderer_60pct.py) · [Successful run](https://github.com/Persie0/Playground/actions/runs/39179882473) · [Raw results](https://github.com/Persie0/Playground/actions/runs/39179882473/artifacts/12155951288)

Same old/current commits. The benchmark invokes the actual production original colorization + two blends versus the new combined single/combined renderer, with 1296×972 BGR background, float32 synthetic traffic density/values and 60.0400% boolean support. OpenCV has two threads, matching the Pi renderer probe configuration. Repeated warmups and 14 timing samples per version across two subprocess runs, order alternated.

| Workload | Actual support | Before | After | Relative speedup | Output |
| --- | ---: | ---: | ---: | ---: | :---: |
| Single and combined heatmap colorization/blend | 60.0400% | 66.003 ms | 64.102 ms | 1.030× | Both BGR arrays byte-identical |

**Why nearly unchanged:** Production selects the sparse optimization only when supported pixels are at most 25% of the image. At ~60% it executes the full-image fallback, retaining the original per-pixel operations; 3% timing difference is too small to call a reliable improvement.

## Production relevance and limits

Actual rendering and collector code was used with production image dimensions, but **this was not run on Raspberry Pi 5 hardware**: GitHub's ubuntu-24.04-arm runner uses a different ARM64 CPU and memory subsystem. Inputs, masks and heatmap values were synthetic. Measurements exclude real camera, detection, tracking, concurrent background work, filesystem PNG/JPEG encoding and full-pipeline FPS. They establish output correctness and relative isolated timings for this runner, not sustained 28 FPS or thermal stability on the Pi. For a physically comparable 60% Pi benchmark, run this harness on the Pi with the same source commits and data generation.

GitHub Actions raw artifacts have seven-day retention; the benchmark sources and this summary remain tracked.
