# Playground

Multi-project development and CI workspace.

## Projects

- [`mobile-super-resolution/`](mobile-super-resolution/) — the original Mobile Super-Resolution Lab, moved intact from the repository root.
- [`3dimageapp/`](3dimageapp/) — CI/test harness for the private `Persie0/3dimageapp` repository.
- [`traffic-counting-detector/`](traffic-counting-detector/) — isolated NCNN detector export/performance lab for the private `Persie0/traffic-counting-light-main` repository.

The private application/source repositories are **not stored in this public repository**. GitHub Actions checks them out only inside ephemeral runners using `PRIVATE_REPO_TOKEN` (or `GH_TOKEN` as a fallback), executes the requested tests, and publishes only the intended test artifacts/results.

Repository-level workflow files remain under `.github/workflows/` because GitHub only executes workflows from that location.
