# FlowForge Android release gates

FlowForge commit: b0969e04f0b25d1919970af8fccfa3519bc7af4d
Playground commit: 5c6cc567e011fa05763d3ace2a8cb5a34159442b
Private checkout: success
JDK setup: success
Android SDK setup: success
Godot binary/export template: success
Headless unit and calibration: success
Android debug APK export: success
Android emulator interaction: success

Result: success (emulator only; not a physical-device or human-playtest pass)

## import.log

## calibration.log
CALIBRATION_PROFILE {"flow_rate":0.718548387096774,"frustration_rate":0.0262096774193548,"max_recovery":0,"max_skill_step":3.08927812046187,"mercy_levels":8,"n":2480,"nonfrustration_rate":0.818548387096774,"profile":"casual"}
CALIBRATION_PROFILE {"flow_rate":0.718548387096774,"frustration_rate":0.0262096774193548,"max_recovery":0,"max_skill_step":3.89975453445197,"mercy_levels":8,"n":2480,"nonfrustration_rate":0.818548387096774,"profile":"average"}
CALIBRATION_PROFILE {"flow_rate":0.718951612903226,"frustration_rate":0.0266129032258065,"max_recovery":0,"max_skill_step":4.23185169555778,"mercy_levels":6,"n":2480,"nonfrustration_rate":0.818951612903226,"profile":"expert"}
CALIBRATION_PROFILE {"flow_rate":0.741129032258064,"frustration_rate":0.0157258064516129,"max_recovery":0,"max_skill_step":3.29630298962093,"mercy_levels":5,"n":2480,"nonfrustration_rate":0.884274193548387,"profile":"learner"}
CALIBRATION_PROFILE {"flow_rate":0.691532258064516,"frustration_rate":0.0548387096774194,"max_recovery":6,"max_skill_step":4.82435657621535,"mercy_levels":42,"n":2480,"nonfrustration_rate":0.7875,"profile":"skill_drop"}
CALIBRATION_RESULT {"failures":[],"model":"independent logistic with seeded noise","profiles":5,"status":"pass"}

## geometry-and-cpu.log
LAYOUT_PERF_RESULT {"errors":[],"gate":"headless CPU/geometry only","generated":140,"generator_p95_ms":3.06,"layout_cases":36,"status":"pass","trace_p95_ms":0.26}

## apk-export.log
    android.suppressUnsupportedCompileSdk=36
to this project's gradle.properties.

> Task :validateJavaVersion UP-TO-DATE
> Task :clean UP-TO-DATE
> Task :assetPackInstallTime:clean UP-TO-DATE
> Task :preBuild UP-TO-DATE
> Task :preStandardDebugBuild UP-TO-DATE
> Task :mergeStandardDebugNativeDebugMetadata NO-SOURCE
> Task :checkKotlinGradlePluginConfigurationErrors SKIPPED
> Task :generateStandardDebugBuildConfig
> Task :generateStandardDebugResValues
> Task :checkStandardDebugAarMetadata
> Task :mapStandardDebugSourceSetPaths
> Task :generateStandardDebugResources
> Task :packageStandardDebugResources
> Task :mergeStandardDebugResources
> Task :createStandardDebugCompatibleScreenManifests
> Task :extractDeepLinksStandardDebug
> Task :parseStandardDebugLocalResources

> Task :processStandardDebugMainManifest
[long-value-redacted].xml:22:9-124 Warning:
	meta-data#org.godotengine.rendering.method was tagged at AndroidManifest.xml:22 to replace another declaration but no other declaration present
[long-value-redacted].xml:23:9-118 Warning:
	meta-data#org.godotengine.editor.version was tagged at AndroidManifest.xml:23 to replace another declaration but no other declaration present

> Task :processStandardDebugManifest
> Task :javaPreCompileStandardDebug
> Task :mergeStandardDebugShaders
> Task :compileStandardDebugShaders NO-SOURCE
> Task :generateStandardDebugAssets UP-TO-DATE
> Task :mergeStandardDebugAssets
> Task :processStandardDebugManifestForPackage
> Task :compressStandardDebugAssets
> Task :processStandardDebugResources
> Task :compileStandardDebugKotlin NO-SOURCE
> Task :checkStandardDebugDuplicateClasses
> Task :compileStandardDebugJavaWithJavac
> Task :mergeLibDexStandardDebug
> Task :dexBuilderStandardDebug
> Task :processStandardDebugJavaRes NO-SOURCE
> Task :mergeProjectDexStandardDebug
> Task :mergeStandardDebugJniLibFolders
> Task :validateSigningStandardDebug
> Task :writeStandardDebugAppMetadata
> Task :writeStandardDebugSigningConfigVersions
> Task :mergeStandardDebugJavaResource
> Task :mergeStandardDebugNativeLibs
> Task :stripStandardDebugDebugSymbols
> Task :desugarStandardDebugFileDependencies
> Task :mergeStandardDebugGlobalSynthetics
> Task :mergeExtDexStandardDebug
> Task :packageStandardDebug
> Task :createStandardDebugApkListingFileRedirect
> Task :assembleStandardDebug

BUILD SUCCESSFUL in 1m 13s
37 actionable tasks: 35 executed, 2 up-to-date

Copying Android binary using gradle command: 
[long-value-redacted] copyAndRenameBinary -p [long-value-redacted] -Pexport_edition=standard -Pexport_build_type=debug -Pexport_format=apk -Pexport_path=file:/home/runner/work/Playground/Playground/qa-output -Pexport_filename=flowforge-qa-debug.apk
Thread exit status: 0

> Configure project :
WARNING: The option setting 'android.overridePathCheck=true' is experimental.
The current default is 'false'.

> Task :copyAndRenameBinary

BUILD SUCCESSFUL in 1s
1 actionable task: 1 executed

Successfully completed Android gradle build.
[92m[ DONE ][39m [1mexport[22m
[0m
WARNING: Scan thread aborted...
     at: _notification (editor/file_system/editor_file_system.cpp:1757)
Script docs haven't been properly loaded or regenerated, so don't save them to disk.
cannot connect to daemon at tcp:5037: Connection refused
EditorSettings: Save OK!
WARNING: 1 ObjectDB instance was leaked at exit (run with `--verbose` for details).
   at: cleanup (core/object/object.cpp:2536)
XR: Clearing primary interface
XR: Removed interface "Native mobile"
XR: Removed interface "OpenXR"
Leaked instance: EditorFileSystemDirectory:1481948337859
Hint: Leaked instances typically happen when nodes are removed from the scene tree (with `remove_child()`) but not freed (with `free()` or `queue_free()`).
Orphan StringName: Node (static: 3, total: 4)
StringName: 1 unclaimed string names at exit.

## playtest-parser.log

## sdk.log

## sdk-install.log

Screenshots and raw emulator diagnostics remain in the 7-day workflow artifact.
