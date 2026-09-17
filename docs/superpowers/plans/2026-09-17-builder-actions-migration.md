# Builder Actions Migration Implementation Plan

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [x]`) syntax for tracking.

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
- Move connected helper: `scripts/appodeal43_migrate.py`.
- Delete the moved files from `firebase_tester_builder`.

- [x] Verify every source workflow/support path exists before copying.
- [x] Copy the files to Playground.
- [x] Change moved cross-repository jobs from repo-scoped `github.token` to `secrets.GH_TOKEN`.
- [x] Adapt `report_screendetector_release.yml` to query `firebase_tester_builder` instead of relying on cross-repository `workflow_run`.
- [x] Adapt `patch_optional_telegram.yml` to patch the retained builder `play_auto.yml` cross-repository.
- [x] Move `scripts/appodeal43_migrate.py` and repoint `appodeal_43_migrate_all_v2.yml` to Playground.
- [x] Commit Playground with `[skip ci]`.
- [x] Remove migrated files from the builder and commit with `[skip ci]`.

### Task 2: Verify connected references

**Files:**
- Inspect all Persie0 code-search matches for moved workflow/trigger names and `Persie0/firebase_tester_builder`.

- [x] Confirm app-side `firebase_tester_release.yml` callers still target the retained `play_auto.yml`.
- [x] Confirm no external caller still targets a workflow/trigger path that moved.
- [x] Confirm moved workflows that query/dispatch `play_auto.yml` still target `Persie0/firebase_tester_builder` and use `secrets.GH_TOKEN`.

### Task 3: Verify final repository state

- [x] List `.github/workflows` in `firebase_tester_builder`; exactly the four retained workflows remain.
- [x] List moved workflow names in Playground; all 16 are present.
- [x] Verify support trigger/status paths are present in Playground and absent from the builder except `debug_triggers/3dimageapp.txt`.
- [x] Verify temporary migration/export workflows are absent from the final Playground workflow inventory.

## Result

Migration completed on 2026-09-17. Specialized builder actions and their connected state/helper files now live in `Persie0/Playground`; `Persie0/firebase_tester_builder` is reduced to the four shared workflows. The migration deliberately did not execute the specialized release/migration workflows themselves, because several dispatch releases or mutate other repositories; verification covered repository inventories, cross-repository references, tokens, and support-file placement instead.
