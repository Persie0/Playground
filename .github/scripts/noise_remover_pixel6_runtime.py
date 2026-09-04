from pathlib import Path


def replace_once(path: str, old: str, new: str, label: str) -> None:
    p = Path(path)
    text = p.read_text()
    count = text.count(old)
    if count != 1:
        raise SystemExit(f"{label}: expected 1 match, found {count}")
    p.write_text(text.replace(old, new, 1))


# Keep local debug installs newer than the currently installed Play build (105).
replace_once(
    "pubspec.yaml",
    "version: 2026.09.01+90",
    "version: 2026.09.04+106",
    "pubspec version",
)

# Flutter 3.47 asserts when a ListTile paints ink/background through an
# intermediate DecoratedBox. Give the checkbox tile its own Material ancestor.
path = "lib/screens/eula_page.dart"
p = Path(path)
s = p.read_text()
old = """                  Theme(
                    data: Theme.of(context).copyWith(
                      splashColor: Colors.transparent,
                      highlightColor: Colors.transparent,
                    ),
                    child: CheckboxListTile(
                      value: _isChecked,
                      contentPadding: EdgeInsets.zero,
                      controlAffinity: ListTileControlAffinity.leading,
                      onChanged: (val) {
                        setState(() {
                          _isChecked = val ?? false;
                        });
                      },
                      title: Text(
                        l10n?.eulaCheckboxLabel ??
                            \"I have read and agree to the Terms of Use and EULA\",
                        style: TextStyle(
                          fontSize: 14,
                          color: Theme.of(context).textTheme.bodyMedium?.color,
                        ),
                      ),
                    ),
                  ),
"""
new = """                  Material(
                    color: Colors.transparent,
                    child: Theme(
                      data: Theme.of(context).copyWith(
                        splashColor: Colors.transparent,
                        highlightColor: Colors.transparent,
                      ),
                      child: CheckboxListTile(
                        value: _isChecked,
                        contentPadding: EdgeInsets.zero,
                        controlAffinity: ListTileControlAffinity.leading,
                        onChanged: (val) {
                          setState(() {
                            _isChecked = val ?? false;
                          });
                        },
                        title: Text(
                          l10n?.eulaCheckboxLabel ??
                              \"I have read and agree to the Terms of Use and EULA\",
                          style: TextStyle(
                            fontSize: 14,
                            color: Theme.of(context).textTheme.bodyMedium?.color,
                          ),
                        ),
                      ),
                    ),
                  ),
"""
if s.count(old) != 1:
    raise SystemExit("EULA CheckboxListTile block not found")
p.write_text(s.replace(old, new, 1))

# Ads are optional. A blocked Appodeal consent/config endpoint must not make the
# deferred startup coordinator fail, retry repeatedly, or become a Sentry app
# exception. AdService itself keeps retry-on-demand semantics for a later ad.
path = "lib/main.dart"
p = Path(path)
s = p.read_text()
old = """    if (_deferredServiceStatus['Appodeal'] != true)
      'Appodeal': _superviseService(
        'Appodeal',
        () async {
          await AdService.instance.initialize();
          if (!AdService.instance.isInitialized) {
            throw StateError(
              'Appodeal consent or initialization was not resolved',
            );
          }
        },
        maxAttempts: 1,
        timeout: const Duration(seconds: 85),
      ),
"""
new = """    if (_deferredServiceStatus['Appodeal'] != true)
      'Appodeal': (() async {
        try {
          await AdService.instance.initialize().timeout(
            const Duration(seconds: 85),
          );
        } catch (error) {
          // Ads are optional. Keep the app usable when Appodeal/CMP endpoints
          // are blocked or unavailable; showInterstitial can retry on demand.
          debugPrint('Optional Appodeal startup failed: $error');
        }
        return true;
      })(),
"""
if s.count(old) != 1:
    raise SystemExit("Appodeal deferred-service block not found")
p.write_text(s.replace(old, new, 1))
