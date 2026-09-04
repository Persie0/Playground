from pathlib import Path


def load(path: str) -> str:
    return Path(path).read_text()


def save(path: str, text: str) -> None:
    Path(path).write_text(text)


def one(text: str, old: str, new: str, label: str) -> str:
    count = text.count(old)
    if count != 1:
        raise SystemExit(f"{label}: expected exactly 1 match, found {count}")
    return text.replace(old, new, 1)


# First launch: EULA acceptance is contractual and must not be auto-granted
# based on IP geolocation. Showing it universally also removes an unnecessary
# IP-country lookup before the user has accepted the app terms.
p = "lib/main.dart"
s = load(p)
s = one(
    s,
    "import 'package:image_enhancer/services/eu_privacy_service.dart';\n",
    "",
    "remove EU geo service import",
)
s = one(
    s,
    "    runApp(const PrivacyCheckWrapper());",
    "    runApp(const EulaOnboardingApp());",
    "universal EULA app entry",
)
start = s.find("class PrivacyCheckWrapper extends StatefulWidget {")
end = s.find("class EulaOnboardingWrapper extends StatelessWidget {", start)
if start < 0 or end < 0:
    raise SystemExit("privacy wrapper block not found")
replacement = """class EulaOnboardingApp extends StatelessWidget {
  const EulaOnboardingApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      debugShowCheckedModeBanner: false,
      localizationsDelegates: AppLocalizations.localizationsDelegates,
      supportedLocales: AppLocalizations.supportedLocales,
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: const Color(0xFF39E079)),
        useMaterial3: true,
      ),
      darkTheme: ThemeData(
        colorScheme: ColorScheme.fromSeed(
          seedColor: const Color(0xFF39E079),
          brightness: Brightness.dark,
        ),
        useMaterial3: true,
      ),
      home: const EulaOnboardingWrapper(),
    );
  }
}

"""
s = s[:start] + replacement + s[end:]
save(p, s)

# Store: a successful transaction without the expected app entitlement is a
# RevenueCat/store configuration failure, not a success and not a silent no-op.
p = "lib/store/store.dart"
s = load(p)
old = """      final isPro = SubscriptionService.instance.isPro;

      if (mounted) {
        if (isPro) {
          ScaffoldMessenger.of(context).showSnackBar(
            SnackBar(
              content: Text(AppLocalizations.of(context)!.purchaseSuccess),
              backgroundColor: Colors.green,
            ),
          );
          Navigator.pop(context);
        }
      }"""
new = """      final isPro = SubscriptionService.instance.isPro;

      if (!isPro) {
        final error = StateError(
          'Purchase completed but the expected Image Enhancer Pro entitlement '
          'is not active for package ${_selectedPackage!.identifier}.',
        );
        if (kReleaseMode) {
          await Sentry.captureException(error);
        }
        if (mounted) {
          final l10n = AppLocalizations.of(context);
          if (l10n != null) {
            ScaffoldMessenger.of(context).showSnackBar(
              SnackBar(content: Text(l10n.storeError)),
            );
          }
        }
        return;
      }

      if (mounted) {
        ScaffoldMessenger.of(context).showSnackBar(
          SnackBar(
            content: Text(AppLocalizations.of(context)!.purchaseSuccess),
            backgroundColor: Colors.green,
          ),
        );
        Navigator.pop(context);
      }"""
s = one(s, old, new, "surface missing entitlement after purchase")
save(p, s)

# Current image_gallery_saver_plus uses scoped MediaStore on Android 10+, but
# Android 9 and older still require WRITE_EXTERNAL_STORAGE plus a runtime grant.
# Request it only on those legacy OS versions; do not retain broad legacy
# external-storage mode on Android 10+.
p = "lib/super_resolution_home_page.dart"
s = load(p)
s = one(
    s,
    "import 'package:image_gallery_saver_plus/image_gallery_saver_plus.dart';\n",
    """import 'package:image_gallery_saver_plus/image_gallery_saver_plus.dart';
import 'package:device_info_plus/device_info_plus.dart';
import 'package:permission_handler/permission_handler.dart';
""",
    "gallery permission imports",
)
s = one(
    s,
    "  bool _isSaving = false;",
    """  bool _isSaving = false;
  int? _androidSdkInt;""",
    "cache Android SDK level",
)
insert_before = "  Future<void> _saveBatchToGallery() async {"
helper = """  Future<void> _requestLegacyGalleryWritePermission() async {
    if (!Platform.isAndroid) return;
    final sdkInt = _androidSdkInt ??=
        (await DeviceInfoPlugin().androidInfo).version.sdkInt;
    if (sdkInt >= 29) return;
    await PermissionHelper.runWithRetry(
      () => Permission.storage.request(),
    );
  }

"""
if s.count(insert_before) != 1:
    raise SystemExit("gallery save insertion anchor missing")
s = s.replace(insert_before, helper + insert_before, 1)
s = one(
    s,
    """    var savedCount = 0;
    try {
      for (final entry in _upscaledImagePaths.entries) {""",
    """    var savedCount = 0;
    try {
      await _requestLegacyGalleryWritePermission();
      for (final entry in _upscaledImagePaths.entries) {""",
    "legacy permission before batch save",
)
s = one(
    s,
    """    try {
      final preparedPath = await _ensurePreparedResultFile();""",
    """    try {
      await _requestLegacyGalleryWritePermission();
      final preparedPath = await _ensurePreparedResultFile();""",
    "legacy permission before single save",
)
save(p, s)

# Remove the geo lookup, add only the Android legacy-save helpers, and allow pub
# to resolve the lockfile to the versions supported by the current Flutter SDK.
p = "pubspec.yaml"
s = load(p)
s = one(
    s,
    "  image_gallery_saver_plus: ^5.1.1\n",
    """  image_gallery_saver_plus: ^5.1.1
  permission_handler: ^13.0.1
  device_info_plus: ^13.2.0
""",
    "gallery permission dependencies",
)
s = one(
    s,
    "  ip_country_lookup: ^1.0.3\n",
    "",
    "remove unused IP country dependency",
)
save(p, s)

p = "android/app/src/main/AndroidManifest.xml"
s = load(p)
s = one(
    s,
    "    <uses-permission android:name=\"com.android.vending.BILLING\" />\n",
    """    <uses-permission android:name=\"com.android.vending.BILLING\" />
    <uses-permission
        android:name=\"android.permission.WRITE_EXTERNAL_STORAGE\"
        android:maxSdkVersion=\"28\" />
""",
    "legacy gallery write permission",
)
s = one(
    s,
    "        android:requestLegacyExternalStorage=\"true\"\n",
    "",
    "remove legacy storage mode",
)
save(p, s)
