# Jelly Squeeze public validation summary

Private source commit: `c5e3405e639540a5f4c9be56ba48fa3217f9a80c`
Runner: https://github.com/Persie0/Playground/actions/runs/45374263995
Overall checks before report: **success**

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
- test_daily_ui: PASS
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
- test_map_stars: PASS
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
- screenshot-layout: FAIL
  - ALSA lib conf.c:5211:(_snd_config_evaluate) [error.core] function snd_func_card_inum returned error: No such file or directory
  - ALSA lib conf.c:5211:(_snd_config_evaluate) [error.core] function snd_func_concat returned error: No such file or directory
  - ALSA lib conf.c:5211:(_snd_config_evaluate) [error.core] function snd_func_refer returned error: No such file or directory
  - ALSA lib conf.c:5734:(snd_config_expand) [error.core] Evaluate error: No such file or directory
  - ERROR: Condition "status < 0" is true. Returning: ERR_CANT_OPEN
