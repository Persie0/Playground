from pathlib import Path


def replace_exact(source: str, old: str, new: str, label: str) -> str:
    count = source.count(old)
    if count != 1:
        raise SystemExit(f"{label}: expected exactly one match, found {count}")
    return source.replace(old, new, 1)


calculator = Path("lib/calculator_screen.dart")
source = calculator.read_text()
source = replace_exact(
    source,
    "  SureBetResult? _pendingHistoryResult;\n  Future<void>? _historySaveInFlight;",
    "  SureBetResult? _pendingHistoryResult;\n  List<String>? _pendingHistoryInputOdds;\n  Future<void>? _historySaveInFlight;",
    "pending input odds field",
)
source = replace_exact(
    source,
    "      _pendingHistoryResult = null;\n      _resetCalculation();",
    "      _pendingHistoryResult = null;\n      _pendingHistoryInputOdds = null;\n      _resetCalculation();",
    "invalid result cleanup",
)
source = replace_exact(
    source,
    "    _pendingHistoryResult = result;\n    _historySaveTimer?.cancel();",
    "    _pendingHistoryResult = result;\n    _pendingHistoryInputOdds = _oddsControllers\n        .map((controller) => controller.text)\n        .toList(growable: false);\n    _historySaveTimer?.cancel();",
    "snapshot original odds text",
)
source = replace_exact(
    source,
    "  Future<void> _saveToHistory(SureBetResult result) async {\n    if (result.convertedOdds.isEmpty) return;\n    final entry = BetHistoryEntry(\n      timestamp: DateTime.now(),\n      odds: result.convertedOdds,\n      totalStake: result.totalStake,\n      profit: result.profit,\n      isSureBet: result.isSureBet,\n      stakeSplits: result.stakeSplits,\n      profitPercentage: result.profitPercentage,\n    );\n    await _historyService.saveEntry(entry);\n  }",
    "  Future<void> _saveToHistory(\n    SureBetResult result,\n    List<String> inputOdds,\n  ) async {\n    if (result.convertedOdds.isEmpty) return;\n    final entry = BetHistoryEntry(\n      timestamp: DateTime.now(),\n      odds: result.convertedOdds,\n      inputOdds: inputOdds,\n      totalStake: result.totalStake,\n      profit: result.profit,\n      isSureBet: result.isSureBet,\n      stakeSplits: result.stakeSplits,\n      profitPercentage: result.profitPercentage,\n    );\n    await _historyService.saveEntry(entry);\n  }",
    "history entry input odds",
)
source = replace_exact(
    source,
    "    final result = _pendingHistoryResult;\n    if (result == null) return;\n    _pendingHistoryResult = null;\n\n    final save = _saveToHistory(result);",
    "    final result = _pendingHistoryResult;\n    final inputOdds = _pendingHistoryInputOdds;\n    if (result == null || inputOdds == null) return;\n    _pendingHistoryResult = null;\n    _pendingHistoryInputOdds = null;\n\n    final save = _saveToHistory(result, inputOdds);",
    "flush matching result and input odds",
)
source = replace_exact(
    source,
    "    _historySaveTimer?.cancel();\n    _pendingHistoryResult = null;\n    tutorial?.finish();",
    "    _historySaveTimer?.cancel();\n    _pendingHistoryResult = null;\n    _pendingHistoryInputOdds = null;\n    tutorial?.finish();",
    "dispose cleanup",
)
calculator.write_text(source)

screen = Path("lib/bet_history_screen.dart")
source = screen.read_text()
source = replace_exact(
    source,
    "${l.oddsLabel}: ${entry.odds.map((o) => o.toStringAsFixed(2)).join(' / ')}",
    "${l.oddsLabel}: ${List.generate(entry.odds.length, (index) => _displayOdd(entry, index)).join(' / ')}",
    "history card odds display",
)
source = replace_exact(
    source,
    "${l.oddsLabel}: ${entry.odds[index].toStringAsFixed(2)}",
    "${l.oddsLabel}: ${_displayOdd(entry, index)}",
    "history details odds display",
)
source = replace_exact(
    source,
    "  String _formatTimeAgo(DateTime timestamp, AppLocalizations l) {",
    "  String _displayOdd(BetHistoryEntry entry, int index) {\n    final inputOdds = entry.inputOdds;\n    if (inputOdds != null && inputOdds.length == entry.odds.length) {\n      return inputOdds[index];\n    }\n\n    final odd = entry.odds[index];\n    if (odd.isFinite && odd == odd.roundToDouble()) {\n      return odd.toInt().toString();\n    }\n    return odd.toString();\n  }\n\n  String _formatTimeAgo(DateTime timestamp, AppLocalizations l) {",
    "history odds formatter",
)
screen.write_text(source)
