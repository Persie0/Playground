# Builder Actions Migration Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** Move every non-general GitHub Action from `firebase_tester_builder` to `Playground` without breaking cross-repository release dispatches.

**Architecture:** Preserve the four shared workflows in the builder repository and move the remaining workflows plus their trigger/status files to Playground. Cross-repository jobs continue to call the retained Play workflow in `firebase_tester_builder` using `secrets.GH_TOKEN`; same-repository reporting state moves to Playground.

**Tech Stack:** GitHub Actions YAML, Bash, GitHub CLI, Git.

**Spec:** `docs/superpowers/specs/2026-09-17-builder-actions-migration-design.md`

## Global Constraints

- Keep `play_auto.yml`, `app_store_auto.yml`, `debug_create_app.yml`, and `debug_build_release_reusable.yml` in `firebase_tester_builder`.
- Keep app-side Play release dispatchers pointed at `Persie0/firebase_tester_builder`.
- Use `[skip ci]` on migration commits so copied push-triggered workflows do not execute during the move.
- Do not expose or copy secret values.

---

### Task 1: Migrate specialized workflows and support files

**Files:**
- Create in Playground: 16 workflow files currently not in the retained set.
- Move support: `debug_triggers/game.txt`, `debug_triggers/stem.txt`, `release_triggers/`, `release_status/`, `.github/release-status/`.
- Delete the moved files from `firebase_tester_builder`.

- [ ] Verify every source workflow/support path exists before copying.
- [ ] Copy the files to Playground.
- [ ] Change moved cross-repository jobs from repo-scoped `github.token` to `secrets.GH_TOKEN`.
- [ ] Adapt `report_screendetector_release.yml` to query `firebase_tester_builder` instead of relying on cross-repository `workflow_run`.
- [ ] Commit Playground with `[skip ci]`.
- [ ] Remove migrated files from the builder and commit with `[skip ci]`.

### Task 2: Verify connected references

**Files:**
- Inspect all Persie0 code-search matches for moved workflow/trigger names and `Persie0/firebase_tester_builder`.

- [ ] Confirm app-side `firebase_tester_release.yml` callers still target the retained `play_auto.yml`.
- [ ] Confirm no external caller still targets a workflow/trigger path that moved.
- [ ] Confirm moved workflows that query/dispatch `play_auto.yml` still target `Persie0/firebase_tester_builder` and use `secrets.GH_TOKEN`.

### Task 3: Verify final repository state

- [ ] List `.github/workflows` in `firebase_tester_builder`; expect exactly the four retained workflows.
- [ ] List moved workflow names in Playground; expect all 16.
- [ ] Verify support trigger/status paths are present in Playground and absent from the builder except `debug_triggers/3dimageapp.txt`.
- [ ] Verify the temporary migration workflow removed itself.