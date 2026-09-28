from pathlib import Path

main_path = Path('lib/main.dart')
source = main_path.read_text()
start = source.find('class MyApp extends StatefulWidget {')
if start >= 0:
    replacement = '''class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return ValueListenableBuilder<Locale?>(
      valueListenable: SettingsService.instance.localeNotifier,
      builder: (context, locale, child) {
        return ValueListenableBuilder<ThemeMode>(
          valueListenable: SettingsService.instance.themeNotifier,
          builder: (context, themeMode, child) {
            return MaterialApp(
              navigatorObservers: [
                SentryNavigatorObserver(),
              ],
              debugShowCheckedModeBanner: false,
              title: 'Noise Remover',
              theme: AppTheme.lightTheme,
              darkTheme: AppTheme.darkTheme,
              themeMode: themeMode,
              locale: locale,
              localizationsDelegates: AppLocalizations.localizationsDelegates,
              supportedLocales: AppLocalizations.supportedLocales,
              home: const HomeScreen(),
            );
          },
        );
      },
    );
  }
}
'''
    source = source[:start] + replacement
elif 'SettingsService.instance.localeNotifier' not in source:
    raise SystemExit('MyApp settings block was neither old nor current reactive form')
main_path.write_text(source)

smoke_path = Path('integration_test/foreground_media_processing_test.dart')
smoke = smoke_path.read_text()
if "import 'package:flutter/foundation.dart';" not in smoke:
    smoke = smoke.replace(
        "import 'package:device_info_plus/device_info_plus.dart';\n",
        "import 'package:device_info_plus/device_info_plus.dart';\nimport 'package:flutter/foundation.dart';\n",
        1,
    )
smoke = smoke.replace(
    "print('FOREGROUND_SMOKE_READY:$jobId');",
    "debugPrint('FOREGROUND_SMOKE_READY:$jobId');",
)
smoke_path.write_text(smoke)
