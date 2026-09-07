# Traffic-counting private CI and audit harness

This folder contains no private application source. It tests
`Persie0/traffic-counting-light-main` only inside an ephemeral GitHub Actions
runner, using a read-only private-repository token.

The workflow defaults to `agent/intersection-analytics-foundation` and can be
dispatched against any branch, tag, or commit SHA.

## What is checked

- the complete analytics, analyzer/dashboard, and dependency-light recorder
  unit suites on Python 3.11, 3.12, and 3.13;
- Python compilation, YAML/TOML parsing, and dashboard JavaScript syntax;
- wheel builds and the pose/sensor calibration executable examples;
- complete recorder dependency resolution plus NCNN/OpenCV/BoxMOT import
  compatibility;
- adversarial scientific contracts that are intentionally independent of the
  private repository's own tests.

The contract IDs cover:

- `IA-001`: total handling of inconsistent visual scale cues;
- `IA-002`: truthful holdout/error-basis reporting;
- `IA-003`: rejection of gate crossings inferred across long missing gaps;
- `IA-004`: metric-grid cells store occupied seconds, independent of raster
  resolution;
- `IA-005`: calibration changes cannot silently leave mixed unlabelled metric
  coordinates;
- `IA-006`: temporal scene-validation splits independently estimate the ROI;
- `IA-007`: stored calibration quality is revalidated at load time.

Private command output is suppressed. CI prints only phase results and stable
contract IDs, and uploads no source, logs, databases, footage, or generated
artifacts.

## Required secret

`PRIVATE_REPO_TOKEN` needs read-only **Contents** access to
`Persie0/traffic-counting-light-main`. An existing `GH_TOKEN` with the same
scope is accepted as a fallback.
