# Jelly Squeeze public validation summary

Private source commit: `aacbcde24975d387091e420f7090bf2c7a47e71a`
Runner: https://github.com/Persie0/Playground/actions/runs/44929552511
Overall checks before report: **failure**

## Test suites
- test_adaptive_daily: PASS
- test_android_settings_scroll: PASS
- test_audio: PASS
- test_bank_binary: PASS
- test_bank_generated: PASS
- test_bank_release: PASS
- test_bank_runtime: PASS
- test_campaign_50: PASS
- test_chapter_cosmetics: PASS
- test_collection: PASS
- test_colorblind_patterns: PASS
- test_completion_chapters: PASS
- test_cosmetics: PASS
- test_daily_rewards: PASS
- test_daily_ui: FAIL
  - ERROR: FAILED: Daily results return to hub
  - ERROR: JELLY DAILY UI FAIL: 1/15
- test_difficulty: PASS
- test_endless_navigation: PASS
- test_endless_progress: PASS
- test_flex_lab: PASS
- test_flex_rules: PASS
- test_flow_director: PASS
- test_gel_layer: PASS
- test_generator: PASS
- test_hint_visibility: PASS
- test_iap: PASS
- test_local_flow_history: PASS
- test_map_stars: FAIL
  - ERROR: MAP STARS: At chapter boundary Journey expands next playable chapter, not solved one
  - ERROR: MAP STARS: Continue and expanded chapter both point to Level 11
  - ERROR: MAP STARS: Locked tile is visually labelled and explains its prerequisite
  - ERROR: MAP STARS: Locked tile displays a visible notice over the scrollable Journey map
- test_navigation: PASS
- test_pause_navigation: PASS
- test_rules: PASS
- test_rules_differential: PASS
- test_save: PASS
- test_screen_layouts: PASS
- test_solver: PASS
- test_stars_migration: PASS
- test_swipe: PASS
- test_tap_journey: PASS
- test_touch_scrolling: PASS
- test_tutorial: PASS

## Import, solver verification and smoke tests
- godot-import: PASS (inspect runner exit status if job failed)
- verify-levels: PASS (inspect runner exit status if job failed)
- smoke: PASS (inspect runner exit status if job failed)
