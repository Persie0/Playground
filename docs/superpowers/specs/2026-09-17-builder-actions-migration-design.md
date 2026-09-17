# Builder Actions Migration Design

## Goal
Keep `Persie0/firebase_tester_builder` focused on the general Play Store, App Store, and generic debug-generation workflows, and move project-specific/one-off Actions to `Persie0/Playground`.

## Retained in firebase_tester_builder
- `.github/workflows/play_auto.yml`
- `.github/workflows/app_store_auto.yml`
- `.github/workflows/debug_create_app.yml`
- `.github/workflows/debug_build_release_reusable.yml`
- `debug_triggers/3dimageapp.txt` because it drives `debug_create_app.yml`.

## Moved to Playground
All other workflows currently under `.github/workflows`, including Appodeal migrations, project-specific debug builds, release dispatch/probe/watch/report jobs, retry jobs, and patch jobs.

Move their associated state/trigger files as well:
- `debug_triggers/game.txt`
- `debug_triggers/stem.txt`
- `release_triggers/`
- `release_status/`
- `.github/release-status/`

## Cross-repository behavior
Workflows that continue to dispatch or inspect the retained `play_auto.yml` must keep `Persie0/firebase_tester_builder` as the target repository, but must use `secrets.GH_TOKEN` rather than the repo-scoped `github.token` once they run from Playground.

The moved `report_screendetector_release.yml` cannot keep a `workflow_run` trigger for `Play Store Automation`, because the Play workflow remains in another repository. It will be converted to a manual/periodic reporter that queries the retained Play workflow directly and writes its status in Playground.

## Connected scripts
Searches found no external callers of the moved `debug_game_build.yml` / `debug_stem_build.yml` trigger paths. Existing app-side `firebase_tester_release.yml` files intentionally continue to dispatch `play_auto.yml` in `firebase_tester_builder`, because that general workflow is not moving.

## Safety
The migration commit in Playground uses `[skip ci]` so copying self-triggering workflows does not accidentally dispatch releases, patches, or debug builds during the move. A temporary migration workflow performs the copy/cleanup atomically enough to avoid manual recreation of workflow contents, then deletes itself from the builder repository.