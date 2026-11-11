# Jelly Squeeze public validation summary

Private source commit: `5ba4dbec33c10a25b64bbc6e8400da10ca6fd7c7`
Runner: https://github.com/Persie0/Playground/actions/runs/43056808011
Overall checks before report: **failure**

## Test suites
- test_android_settings_scroll: PASS
- test_audio: PASS
- test_campaign_50: PASS
- test_collection: FAIL
  - ERROR: FAILED: Two-column collection gallery
  - ERROR: JELLY COLLECTION UI FAIL: 1/41
- test_completion_chapters: PASS
- test_cosmetics: PASS
- test_daily_rewards: PASS
- test_daily_ui: PASS
- test_difficulty: PASS
- test_gel_layer: PASS
- test_generator: PASS
- test_navigation: PASS
- test_pause_navigation: PASS
- test_rules: PASS
- test_save: PASS
- test_solver: PASS
- test_swipe: PASS
- test_tutorial: PASS

## Import, solver verification and smoke tests
- godot-import: PASS (inspect runner exit status if job failed)
- verify-levels: PASS (inspect runner exit status if job failed)
- smoke: PASS (inspect runner exit status if job failed)
