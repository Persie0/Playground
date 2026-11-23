# FlowForge Android release gates

FlowForge commit: 401b593acc7752fb46fc565c4fd7dd4b3eed1a1e
Playground commit: 9d4e9d5372f3670da51389f6f647bf0838b2f0b1
Private checkout: success
JDK setup: success
Android SDK setup: success
Godot binary/export template: success
Headless unit and calibration: success
Android debug APK export: failure
Android emulator interaction: skipped

Result: failure/incomplete

## import.log

## calibration.log
CALIBRATION_PROFILE {"flow_rate":0.718548387096774,"frustration_rate":0.0262096774193548,"max_recovery":0,"max_skill_step":3.08927812046187,"mercy_levels":8,"n":2480,"nonfrustration_rate":0.818548387096774,"profile":"casual"}
CALIBRATION_PROFILE {"flow_rate":0.718548387096774,"frustration_rate":0.0262096774193548,"max_recovery":0,"max_skill_step":3.89975453445197,"mercy_levels":8,"n":2480,"nonfrustration_rate":0.818548387096774,"profile":"average"}
CALIBRATION_PROFILE {"flow_rate":0.718951612903226,"frustration_rate":0.0266129032258065,"max_recovery":0,"max_skill_step":4.23185169555778,"mercy_levels":6,"n":2480,"nonfrustration_rate":0.818951612903226,"profile":"expert"}
CALIBRATION_PROFILE {"flow_rate":0.741129032258064,"frustration_rate":0.0157258064516129,"max_recovery":0,"max_skill_step":3.29630298962093,"mercy_levels":5,"n":2480,"nonfrustration_rate":0.884274193548387,"profile":"learner"}
CALIBRATION_PROFILE {"flow_rate":0.691532258064516,"frustration_rate":0.0548387096774194,"max_recovery":6,"max_skill_step":4.82435657621535,"mercy_levels":42,"n":2480,"nonfrustration_rate":0.7875,"profile":"skill_drop"}
CALIBRATION_RESULT {"failures":[],"model":"independent logistic with seeded noise","profiles":5,"status":"pass"}

## geometry-and-cpu.log
LAYOUT_PERF_RESULT {"errors":[],"gate":"headless CPU/geometry only","generated":140,"generator_p95_ms":2.29,"layout_cases":36,"status":"pass","trace_p95_ms":0.19}

## apk-export.log
WorkerThreadPool: 4 threads, 3 max low-priority.
Godot Engine v4.7.2.stable.official.ed1daf0bf - https://godotengine.org
TextServer: Added interface "Dummy"
TextServer: Added interface "ICU / HarfBuzz / Graphite (Built-in)"
SDL: Init OK!
Using "default" pen tablet driver...

TextServer: Primary interface set to: "ICU / HarfBuzz / Graphite (Built-in)".
CORE API HASH: 2004498165
EDITOR API HASH: 1696660745
SceneTreeFTI: traversal method DEFAULT
Loading resource: /home/runner/.config/godot/editor_settings-4.7.tres remapped: /home/runner/.config/godot/editor_settings-4.7.tres
Completed load for: '/home/runner/.config/godot/editor_settings-4.7.tres' remapped '/home/runner/.config/godot/editor_settings-4.7.tres' at thread -1
EditorSettings: Load OK!
EditorTheme: Generating new theme for the config '3810048042'.
EditorTheme: Generating new icons.
EditorTheme: Generating new fonts.
EditorTheme: Generating new styles.
Loading resource: /home/runner/.cache/godot/editor_doc_cache-4.7.res remapped: /home/runner/.cache/godot/editor_doc_cache-4.7.res
Loaded system CA certificates
Completed load for: '/home/runner/.cache/godot/editor_doc_cache-4.7.res' remapped '/home/runner/.cache/godot/editor_doc_cache-4.7.res' at thread -1
[   0% ] [90m[1mfirst_scan_filesystem[22m | Started Project initialization (5 steps)[39m[0m
[   0% ] [90m[1mfirst_scan_filesystem[22m | Scanning file structure...[39m[0m
[  16% ] [90m[1mfirst_scan_filesystem[22m | Loading global class names...[39m[0m
[  33% ] [90m[1mfirst_scan_filesystem[22m | Verifying GDExtensions...[39m[0m
[  50% ] [90m[1mfirst_scan_filesystem[22m | Creating autoload scripts...[39m[0m
[  66% ] [90m[1mfirst_scan_filesystem[22m | Initializing plugins...[39m[0m
[  83% ] [90m[1mfirst_scan_filesystem[22m | Starting file scan...[39m[0m
[92m[ DONE ][39m [1mfirst_scan_filesystem[22m
[0m
ERROR: Cannot export project with preset "Android" due to configuration errors:
"Min SDK" can only be overridden when "Use Gradle Build" is enabled.
"Target SDK" can only be overridden when "Use Gradle Build" is enabled.
ETC2/ASTC texture compression is required for Android export. In Project Settings, search for 'ETC2' in the search field, or enable 'Advanced Settings' and go to Rendering > Textures > VRAM Compression to enable 'Import ETC2 ASTC'.

   at: _fs_changed (editor/editor_node.cpp:1401)
ERROR: Project export for preset "Android" failed.
   at: _fs_changed (editor/editor_node.cpp:1417)
Script docs haven't been properly loaded or regenerated, so don't save them to disk.
cannot connect to daemon at tcp:5037: Connection refused
EditorSettings: Save OK!
XR: Clearing primary interface
XR: Removed interface "Native mobile"
XR: Removed interface "OpenXR"
Orphan StringName: Node (static: 3, total: 4)
StringName: 1 unclaimed string names at exit.

## sdk.log

## sdk-install.log

Screenshots and raw emulator diagnostics remain in the 7-day workflow artifact.
