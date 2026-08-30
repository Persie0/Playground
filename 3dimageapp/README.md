# 3dimageapp CI harness

This folder intentionally contains **no application source code**.

The source remains private in `Persie0/3dimageapp`. The repository-level workflow `.github/workflows/3dimageapp-private-ci.yml` checks out that private repository only inside an ephemeral GitHub Actions runner and executes the scripts in this folder.

## Required secret

Configure one repository secret on `Persie0/Playground-`:

- `PRIVATE_REPO_TOKEN` — fine-grained token with **Contents: read** access to `Persie0/3dimageapp`.

For compatibility the workflow also accepts an existing `GH_TOKEN` secret with the same read permission.

## Privacy behavior

- private checkout credentials are not persisted;
- source stays only in the ephemeral runner workspace;
- compiler/test output is redirected to temporary private logs;
- failed jobs report only the failing phase, not source snippets;
- no private source, logs, APKs, or build trees are uploaded as artifacts from this public repository.

## Test matrix

- shared C++ Release build + tests;
- shared C++ ASan/UBSan build + tests;
- Android Debug + Release builds;
- Android lint;
- iOS Debug + Release simulator builds.
