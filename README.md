# Playground

Public multi-project CI/orchestration workspace.

## Security boundary

This repository keeps only generic orchestration and intentionally public tooling. Private app implementation, app-specific test/patch logic, private source assertions, and detailed diagnostic harnesses live in the corresponding private application repositories.

For private-app jobs, a Playground workflow:

1. validates the repository token;
2. checks out the requested private app revision into the ephemeral runner;
3. checks out only the private repo's `.github/playground/` CI harness;
4. installs the generic runner/toolchain dependencies required by the job;
5. invokes the private harness;
6. publishes only intentionally safe artifacts or summaries.

Private harnesses suppress source-derived compiler/test output where it could expose private implementation details. Public workflows must not embed private patch code, exact private test inventories, source snippets, symbol mappings, or raw private diagnostic logs.

Repository-level workflow files remain under `.github/workflows/` because GitHub Actions only discovers workflows there.

## Public projects

- [`mobile-super-resolution/`](mobile-super-resolution/) — intentionally public model tooling and experiments.

## Required secret

Private-repository workflows use `PRIVATE_REPO_TOKEN` (with `GH_TOKEN`/release-token fallbacks where explicitly configured) to read the corresponding private repository at runtime.
