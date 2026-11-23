# FlowForge Android release gates

FlowForge commit: 8701fdbb9c382cef286f0a9d46dddbac4e519556
Playground commit: d5cb352073c6913504bac077c1314017055a8704
Private checkout: success
JDK setup: success
Android SDK setup: success
Godot binary/export template: success
Headless unit and calibration: success
Android debug APK export: cancelled
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
LAYOUT_PERF_RESULT {"errors":[],"gate":"headless CPU/geometry only","generated":140,"generator_p95_ms":2.34,"layout_cases":36,"status":"pass","trace_p95_ms":0.19}

## gradle-template.log

## playtest-parser.log

## sdk.log

## sdk-install.log

Screenshots and raw emulator diagnostics remain in the 7-day workflow artifact.
