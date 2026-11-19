# Jelly Squeeze public validation summary

Private source commit: `76bc6ed9b02aca1d1d701f163f491f46d073bfac`
Runner: https://github.com/Persie0/Playground/actions/runs/44505988159
Overall checks before report: **failure**

## Test suites
- test_adaptive_daily: PASS
- test_android_settings_scroll: PASS
- test_audio: PASS
- test_campaign_50: PASS
- test_chapter_cosmetics: PASS
- test_collection: FAIL
  - ERROR: FAILED: ShopButton exists
  - ERROR: FAILED: Pause Store overlay opens without replacing puzzle
  - ERROR: FAILED: Store Back returns to same paused game
  - ERROR: FAILED: CollectionButton exists
  - ERROR: FAILED: Collection overlays paused puzzle
- test_completion_chapters: FAIL
  - ERROR: FAILED: Last campaign level offers map instead of redundant replay actions
  - ERROR: FAILED: Non-optimal completion offers a genuine improvement action
  - ERROR: FAILED: Previously saved best remains visible during failed new write
  - ERROR: JELLY COMPLETION AND CHAPTERS FAIL: 3/74
- test_cosmetics: PASS
- test_daily_rewards: PASS
- test_daily_ui: FAIL
  - ERROR: FAILED: Button DailyButton exists
  - ERROR: FAILED: Daily pause returns to Daily hub without touching campaign
  - ERROR: FAILED: Back restores daily hub
  - ERROR: FAILED: Daily hub Back returns home
  - ERROR: FAILED: Daily results return to hub
- test_difficulty: PASS
- test_flex_lab: PASS
- test_flex_rules: PASS
- test_gel_layer: PASS
- test_generator: PASS
- test_hint_visibility: PASS
- test_iap: PASS
- test_navigation: FAIL
  - ERROR: FAILED: Pause has a Home button
  - ERROR: FAILED: Pause Home returns home
  - ERROR: JELLY NAVIGATION FAIL: 2 of 45
- test_pause_navigation: FAIL
  - ERROR: FAILED: Next enters unlocked Level 2
  - ERROR: FAILED: Level 2 has a real non-winning move
  - ERROR: FAILED: One unfinished move is active
  - ERROR: FAILED: Level 2 is active in local storage
  - ERROR: FAILED: Started a pending touch on occupied piece
- test_rules: FAIL
  - ERROR: FAILED: Restart clears history
  - ERROR: JELLY RULES FAIL: 1 of 41 checks
- test_save: PASS
- test_solver: PASS
- test_swipe: PASS
- test_touch_scrolling: FAIL
  - SCRIPT ERROR: Invalid call. Nonexistent function '_input' in base 'Nil'.
  - SCRIPT ERROR: Invalid access to property or key '_touch_index' on a base object of type 'Nil'.
- test_tutorial: PASS

## Import, solver verification and smoke tests
- godot-import: PASS (inspect runner exit status if job failed)
- verify-levels: PASS (inspect runner exit status if job failed)
- smoke: PASS (inspect runner exit status if job failed)
