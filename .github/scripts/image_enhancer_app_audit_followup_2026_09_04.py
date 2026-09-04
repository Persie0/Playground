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

# The geo lookup is no longer used after separating EULA acceptance from ad
# consent. Remove the dependency; the service file is deleted by the workflow.
p = "pubspec.yaml"
s = load(p)
s = one(
    s,
    "  ip_country_lookup: ^1.0.4\n",
    "",
    "remove unused IP country dependency",
)
save(p, s)
