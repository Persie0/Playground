# Playground

Multi-project development and CI workspace.

## Projects

- [`mobile-super-resolution/`](mobile-super-resolution/) — the original Mobile Super-Resolution Lab, moved intact from the repository root.
- [`3dimageapp/`](3dimageapp/) — CI/test harness for the private `Persie0/3dimageapp` repository.
- [`traffic-counting-light/`](traffic-counting-light/) — private CI and scientific-contract audit harness for `Persie0/traffic-counting-light-main`.

Private application source is **not stored in this public repository**. GitHub Actions checks out each private repository only inside an ephemeral runner using `PRIVATE_REPO_TOKEN` (or `GH_TOKEN` as a fallback), executes tests with private logs suppressed, and publishes only pass/fail status.

Repository-level workflow files remain under `.github/workflows/` because GitHub only executes workflows from that location.
