# Jelly Squeeze public validation summary

Private source commit: `8a950a7bf38a56b0fdbab5661eacccb060d3482b`
Runner: https://github.com/Persie0/Playground/actions/runs/43053548037
Overall checks before report: **failure**

## Test suites
- test_android_settings_scroll: PASS
- test_audio: PASS
- test_campaign_50: PASS
- test_completion_chapters: FAIL
  - ERROR: Parameter "data.tree" is null.
  - SCRIPT ERROR: Invalid access to property or key 'process_frame' on a base object of type 'null instance'.
- test_daily_rewards: PASS
- test_daily_ui: PASS
- test_difficulty: PASS
- test_gel_layer: PASS
- test_generator: PASS
- test_navigation: FAIL
  - ERROR: Parameter "data.tree" is null.
  - SCRIPT ERROR: Invalid access to property or key 'process_frame' on a base object of type 'null instance'.
  - ERROR: Parameter "data.tree" is null.
  - SCRIPT ERROR: Invalid access to property or key 'process_frame' on a base object of type 'null instance'.
  - ERROR: Parameter "data.tree" is null.
- test_pause_navigation: FAIL
  - ERROR: Parameter "data.tree" is null.
  - SCRIPT ERROR: Invalid access to property or key 'process_frame' on a base object of type 'null instance'.
- test_rules: PASS
- test_save: PASS
- test_solver: PASS
- test_swipe: PASS
- test_tutorial: PASS

## Import, solver verification and smoke tests
- godot-import: PASS (inspect runner exit status if job failed)
- verify-levels: PASS (inspect runner exit status if job failed)
- smoke: PASS (inspect runner exit status if job failed)
