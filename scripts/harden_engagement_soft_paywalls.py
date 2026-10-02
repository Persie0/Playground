#!/usr/bin/env python3
import re
import sys
import textwrap
from pathlib import Path

repo = sys.argv[1]
root = Path(sys.argv[2]) if len(sys.argv) > 2 else Path('.')


def replace_once(relative_path: str, old: str, new: str) -> None:
    path = root / relative_path
    text = path.read_text()
    if old not in text:
        raise SystemExit(f'Expected snippet not found in {relative_path}: {old!r}')
    path.write_text(text.replace(old, new, 1))


# Add a live entitlement recheck at the final presentation boundary. The trigger
# already rejects Pro users before counting; this second guard closes the race
# where entitlement changes while SharedPreferences / UI work is awaited.
if repo == 'recorder_noise_remove':
    replace_once(
        'lib/services/ad_service.dart',
        "    if (shouldShowPaywall) {\n      final context = softPaywallNavigatorKey.currentContext;",
        "    if (shouldShowPaywall && !SubscriptionService.instance.isPro) {\n      final context = softPaywallNavigatorKey.currentContext;",
    )
elif repo == 'fake_gps_detector':
    replace_once(
        'lib/start_screen.dart',
        "        if (shouldShowPaywall && mounted) {\n          await subscription.presentPaywall(context);",
        "        if (shouldShowPaywall && !subscription.isPro && mounted) {\n          await subscription.presentPaywall(context);",
    )
elif repo == 'root_detection_app':
    replace_once(
        'lib/adbanner.dart',
        "    if (shouldShowPaywall) {\n      final context = softPaywallNavigatorKey.currentContext;",
        "    if (shouldShowPaywall && !SettingsProvider.boughtPro) {\n      final context = softPaywallNavigatorKey.currentContext;",
    )
elif repo == 'face_scanner':
    replace_once(
        'lib/screens/show2d.dart',
        "  if (shouldShowPaywall) {\n    await Navigator.of(context).push(",
        "  final isStillPro =\n      Provider.of<SettingsProvider>(context, listen: false).getBoughtPro();\n  if (shouldShowPaywall && !isStillPro) {\n    await Navigator.of(context).push(",
    )
elif repo == 'vitamindtracker':
    replace_once(
        'lib/providers/vitd_provider_impl.dart',
        '    if (!shouldShow || premium || !context.mounted) return;',
        '    if (!shouldShow || isPro || subscription.isPro || !context.mounted) return;',
    )
elif repo == 'surebets_calculator':
    replace_once(
        'lib/services/bet_history_service.dart',
        '    if (!shouldShow) return;',
        '    if (!shouldShow || subscription.isPro) return;',
    )
    replace_once(
        'lib/services/bet_history_service.dart',
        '      if (navigator == null || !navigator.mounted) return;',
        '      if (subscription.isPro || navigator == null || !navigator.mounted) return;',
    )
elif repo == 'image_enhancer':
    replace_once(
        'lib/services/image_processing_service.dart',
        '    if (!shouldShow) return;\n\n    final context = softPaywallNavigatorKey.currentContext;',
        '    if (!shouldShow || subscriptions.isPro) return;\n\n    final context = softPaywallNavigatorKey.currentContext;',
    )
elif repo in {'hanzi_hero', 'norwegian_yoyillo'}:
    replace_once(
        'lib/screens/flashcards/flashcards_screen.dart',
        '      if (shouldShowPaywall && mounted) {\n        await subscriptions.presentPaywall(context);',
        '      if (shouldShowPaywall && !subscriptions.isPro && mounted) {\n        await subscriptions.presentPaywall(context);',
    )
elif repo == 'Memory_Palace_Builder':
    replace_once(
        'lib/pages/memory_palaces/add_entry.dart',
        '        if (shouldShowPaywall && mounted) {\n          await subscriptions.presentPaywall(context);',
        '        if (shouldShowPaywall && !subscriptions.isPro && mounted) {\n          await subscriptions.presentPaywall(context);',
    )
elif repo == 'noise_remover':
    replace_once(
        'lib/services/processing_lock_service.dart',
        '    if (!shouldShow) return;',
        '    if (!shouldShow || subscription.isPro) return;',
    )
    replace_once(
        'lib/services/processing_lock_service.dart',
        '      if (navigator == null || !navigator.mounted) return;',
        '      if (subscription.isPro || navigator == null || !navigator.mounted) return;',
    )
else:
    raise SystemExit(f'Unknown repository: {repo}')


if repo == 'noise_remover':
    report = root / 'test/bulk_report_pro_refresh_regression_test.dart'
    text = report.read_text()
    if "import 'dart:convert';" not in text:
        text = text.replace(
            "import 'dart:io';",
            "import 'dart:convert';\nimport 'dart:io';",
            1,
        )
    pattern = re.compile(
        r"  test\('report sheet offers diagnostic report and email', \(\) \{.*?\n  \}\);",
        re.S,
    )
    replacement = textwrap.dedent(
        """\
          test('report sheet offers localized diagnostic report and email', () {
            final source =
                File('lib/widgets/report_problem_sheet.dart').readAsStringSync();
            final english =
                jsonDecode(File('lib/l10n/app_en.arb').readAsStringSync())
                    as Map<String, dynamic>;
            expect(source, contains('l10n.sendDiagnosticReport'));
            expect(source, contains('l10n.emailSupport'));
            expect(english['sendDiagnosticReport'], 'Send diagnostic report');
            expect(english['emailSupport'], 'Email support');
            expect(source, contains('SingleChildScrollView'));
            expect(source, contains('persie0@protonmail.com'));
          });"""
    )
    text, count = pattern.subn(replacement, text, count=1)
    if count != 1:
        raise SystemExit('Could not update report-problem regression test')
    report.write_text(text)

    localization = root / 'test/localization_integrity_test.dart'
    text = localization.read_text()
    old_title = "  test('all Google Play locales have ARB resources', () {"
    new_title = (
        "  test('all Google Play locales have direct or language fallback ARB resources', () {"
    )
    if old_title not in text:
        raise SystemExit('Could not find locale test title')
    text = text.replace(old_title, new_title, 1)
    old = """    final missing = googlePlayLocaleFiles.difference(actual);
    expect(missing, isEmpty, reason: 'Missing Google Play locales: $missing');"""
    new = """    final localeFilePattern =
        RegExp(r'^app_([A-Za-z]{2,3})(?:_[A-Za-z0-9]+)?\\.arb$');
    final missing = googlePlayLocaleFiles.where((expected) {
      if (actual.contains(expected)) return false;
      final match = localeFilePattern.firstMatch(expected);
      if (match == null) return true;
      final languageFallback = 'app_${match.group(1)}.arb';
      return !actual.contains(languageFallback);
    }).toSet();
    expect(
      missing,
      isEmpty,
      reason: 'Missing Google Play locale resources or fallbacks: $missing',
    );"""
    if old not in text:
        raise SystemExit('Could not find locale missing-set assertion')
    localization.write_text(text.replace(old, new, 1))


if repo == 'norwegian_yoyillo':
    gap = root / 'lib/utils/norwegian_gap_utils.dart'
    text = gap.read_text()
    old = """      final explicitMatch = _findOccurrence(
        sentence,
        explicitTarget.text,
        explicitTarget.occurrence,
        requireWordBoundaries: false,
      );
      if (explicitMatch != null) return explicitMatch;"""
    new = """      final explicitWordMatch = _findOccurrence(
        sentence,
        explicitTarget.text,
        explicitTarget.occurrence,
        requireWordBoundaries: true,
      );
      if (explicitWordMatch != null) return explicitWordMatch;

      // Explicit metadata may intentionally target a morpheme inside a
      // compound. Prefer whole-token occurrences first, then retain the raw
      // substring fallback for those generated morpheme targets.
      final explicitMorphemeMatch = _findOccurrence(
        sentence,
        explicitTarget.text,
        explicitTarget.occurrence,
        requireWordBoundaries: false,
      );
      if (explicitMorphemeMatch != null) return explicitMorphemeMatch;"""
    if old not in text:
        raise SystemExit('Could not find explicit-gap matching block')
    gap.write_text(text.replace(old, new, 1))

    pinyin_test = root / 'test/utils/pinyin_utils_test.dart'
    text = pinyin_test.read_text()
    old = "      final expectedStart = sentence.lastIndexOf('OH');"
    new = "      final expectedStart = sentence.indexOf(' OH ') + 1;"
    if old not in text:
        raise SystemExit('Could not find pinyin expectedStart')
    pinyin_test.write_text(text.replace(old, new, 1))

    provider_test = root / 'test/providers/word_provider_test.dart'
    text = provider_test.read_text()
    old = """      // Mark words 1, 2, and 3 as learning (progress recorded)
      vocabService.getProgress(1).correctCount = 1;
      vocabService.getProgress(2).correctCount = 1;
      vocabService.getProgress(3).correctCount = 1;"""
    new = """      // Mark words 1, 2, and 3 as learning through the public mutation API.
      await vocabService.recordAnswer(1, true);
      await vocabService.recordAnswer(2, true);
      await vocabService.recordAnswer(3, true);"""
    if old not in text:
        raise SystemExit('Could not find radio-learning setup')
    text = text.replace(old, new, 1)
    old = """      // Mark word 1 as known so we always return it
      vocabService.getProgress(1).correctCount = 1;"""
    new = """      // Introduce word 1 through the public mutation API so radio can review it.
      await vocabService.recordAnswer(1, true);"""
    if old not in text:
        raise SystemExit('Could not find radio overflow setup')
    provider_test.write_text(text.replace(old, new, 1))
