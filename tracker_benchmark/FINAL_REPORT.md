# ARM64 tracker implementation benchmark — final report

Benchmark branch: `tracker-benchmark-20260929`

Final verification run: GitHub Actions run `36585993930` on `ubuntu-24.04-arm` (AArch64), commit `7b3fe66bee5a15155967f0b07756d5ac80764044`.

## What was compared

All trackers replay the same deterministic 384×288, 30 FPS intersection-style detections. Stress scenarios cover clean motion, crossings, short occlusions, dense traffic, detector misses, low-confidence detections, duplicate detections, and false positives. Detector inference is excluded so this isolates tracking implementation cost.

Implementations/families tested:

- Roboflow `trackers==2.6.0`: ByteTrack, ByteTrack+DIoU, OC-SORT, C-BIoU
- Trackforge `0.4.0`: ByteTrack, OC-SORT
- Supervision `0.27.0`: ByteTrack
- Artefactory ByteTrack
- BoxMOT `25.0.0`: ByteTrack Python + C++, OC-SORT Python + C++, SFSORT Python + C++

The production-style baseline uses a 0.30 high/low split, 0.80 match threshold and 45-frame lost buffer. A second ARM64 sweep separately tuned the confidence required to create a new identity, without removing the low-confidence recovery band.

## Final production ranking — permissive licenses

This is the Pi-edge ranking after tuning. The combined score weights synthetic identity/counting quality 75%, tracker-only speed 15%, memory 5%, and CPU 5%. CPU below is the measured tracker latency converted to one-core duty at 30 FPS (`mean_ms × 3`), which is more meaningful than running every tracker flat-out and observing ~100% core usage.

| Rank | Candidate | License | Accuracy/count score | Mean ms/frame | 30 FPS one-core duty | RSS delta | Dense IDs / GT | Noisy IDs / GT | Occlusion IDF1 | Occlusion ID survival |
|---:|---|---|---:|---:|---:|---:|---:|---:|---:|---:|
| 1 | **Trackforge ByteTrack, spawn 0.85** | MIT | 80.47 | **0.0574** | **0.17%** | **7.6 MB** | 1.446 | **1.389** | 89.9 | 60.4% |
| 2 | **Artefactory ByteTrack** | MIT | 81.53 | 2.3232 | 6.97% | 8.5 MB | **1.304** | 1.583 | 89.2 | 62.6% |
| 3 | **Roboflow ByteTrack, activation 0.75, 3 confirmations** | Apache-2.0 | **82.88** | 0.7776 | 2.33% | 76.2 MB | 1.393 | 1.806 | 89.7 | **86.6%** |
| 4 | **Supervision ByteTrack** | MIT | **83.31** | 1.7918 | 5.38% | 69.9 MB | **1.232** | 1.556 | 88.9 | 62.6% |

### Interpretation

- **Trackforge tuned to 0.85 is the strongest edge/throughput result.** The untuned 0.30 configuration was unusable for counting (12.9× dense and 27.8× noisy track creation), but raising only the new-ID threshold to 0.85 reduced that to 1.446× / 1.389× while preserving ~0.057 ms/frame. It remains weaker than tuned Roboflow on occlusion identity survival (60.4% vs 86.6%).
- **Roboflow tuned to 0.75 + 3 consecutive confirmations is the strongest identity-survival option.** It substantially fixes the over-counting seen at the current 0.30 activation while retaining the existing Apache-2.0 architecture and low-confidence recovery. Its measured import/runtime RSS is much larger than Trackforge/Artefactory.
- **Supervision has the best synthetic accuracy/count score and best dense count stability**, but is slower and has high measured RSS. It does not materially improve occlusion re-identification over the conventional ByteTrack implementations.
- **Artefactory is a small-memory conventional ByteTrack baseline.** It is much slower than Trackforge but gives stable counts and is useful as a simple reference implementation.

## BoxMOT comparison

BoxMOT was included because it is a useful technical reference, but version 25.0.0 is AGPL-3.0 and therefore is not included in the permissive production shortlist.

| Candidate | Accuracy/count score | Mean ms/frame | 30 FPS one-core duty | RSS delta | Dense IDs / GT | Noisy IDs / GT |
|---|---:|---:|---:|---:|---:|---:|
| **BoxMOT ByteTrack C++** | **83.00** | **0.4115** | **1.23%** | 37.3 MB | **1.268** | **1.583** |
| BoxMOT ByteTrack Python | 83.00 | 3.8242 | 11.47% | 37.9 MB | 1.268 | 1.583 |
| BoxMOT OC-SORT C++ | 61.74 | 0.4281 | 1.28% | 38.9 MB | 1.250 | 1.361 |
| BoxMOT SFSORT C++ | 29.64 | 0.3170 | 0.95% | 37.1 MB | 15.804 | 23.778 |

BoxMOT's native ByteTrack backend is technically strong: it is substantially faster than the Python ByteTrack implementations and has stable counting. The Python and C++ backends produced the same synthetic tracking quality in this test. OC-SORT and SFSORT were not competitive under the fixed-camera/detection-only settings used here.

## Spawn-threshold sweep conclusions

The important parameter for the observed over-counting problem is **not simply the low-confidence association threshold**. Keeping low-confidence detections available for recovery while requiring a stronger condition to create a *new* identity improves counting substantially.

Best tested points:

- Trackforge ByteTrack: `track_thresh=0.30`, `match_thresh=0.80`, `track_buffer=45`, **`det_thresh=0.85`**.
- Roboflow ByteTrack: low/high split `0.30`, buffer `45`, IoU compatibility floor `0.20`, **`track_activation_threshold=0.75`**, **`minimum_consecutive_frames=3`**.

For Roboflow, the synthetic score peaked at 0.75/3. Moving to 0.80–0.90 reduced false identity creation further but started losing enough legitimate detections to lower the combined score. For Trackforge, 0.85 was the best tested trade-off; 0.90 reduced over-counting a little more but lowered the combined score.

## Other tracker families

The alternative families did not beat tuned ByteTrack for this fixed-camera traffic task:

- Roboflow OC-SORT: 75.00 accuracy/count score, 1.341 ms/frame, dense/noisy identity ratios 1.768 / 3.306.
- Roboflow C-BIoU: 73.69 score, 1.499 ms/frame, ratios 4.536 / 11.056.
- Trackforge OC-SORT: extremely fast at 0.073 ms/frame but severely over-created identities with the tested settings (15.554 / 30.639).
- BoxMOT OC-SORT had stable counts but much lower recall/identity quality; BoxMOT SFSORT fragmented identities heavily.

## Practical decision

1. **Test Trackforge ByteTrack with `det_thresh=0.85` on the actual Pi/video first** if minimum CPU/RAM is the priority.
2. **Keep/tune Roboflow ByteTrack to activation 0.75 + 3 confirmations** if retaining IDs through occlusions is more important than memory. This is the lower-risk change because the current production tracker already uses Roboflow Trackers.
3. Use Supervision/Artefactory as reference baselines rather than the first deployment choice.
4. Do not select BoxMOT for the production permissive-license path without separately resolving its AGPL implications.

## Limitations

- The identity/count quality benchmark is deterministic synthetic ground truth, not hand-labeled real intersection trajectories. It is designed to expose association/fragmentation behavior and make implementation comparisons reproducible.
- GitHub-hosted ARM64 is architecture-relevant but is not a Raspberry Pi 5 CPU. Absolute timing must still be confirmed on the Pi; relative differences are the main result here.
- RSS deltas include each library's Python/import dependency footprint. If a dependency is already loaded elsewhere in the production process, its incremental memory cost can be lower.
- Tracker-only timings exclude LibreYOLO/NCNN inference, preprocessing, analytics, rendering, and I/O.

Raw files from the final ARM64 run are emitted as Actions artifacts: `results.json`, `results.csv`, `results.md`, `ranking.json`, `ranking.md`, `spawn-threshold.json`, and `spawn-threshold.md`.
