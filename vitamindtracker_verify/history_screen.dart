import 'package:flutter/material.dart';
import 'package:fl_chart/fl_chart.dart';
import 'package:provider/provider.dart';
import 'package:shared_preferences/shared_preferences.dart';
import '../models/app_theme.dart';
import '../providers/vitd_provider.dart';
import '../models/vitd_log.dart';
import '../domain/blood_concentration_unit.dart';
import '../domain/vitd_validation.dart';
import 'package:intl/intl.dart';
import 'dart:math' as math;
import 'package:table_calendar/table_calendar.dart';
import '../l10n/gen_l10n/app_localizations.dart';
import 'store_screen.dart';
import 'exposure_screen.dart';

enum Period { weekly, monthly, yearly }

const int _calendarRangeDays = 3650;
const double _calendarTargetMetAlpha = 0.55;
const double _calendarPartialBaseAlpha = 0.2;
const double _calendarPartialAlphaSpan = 0.35;

class HistoryScreen extends StatefulWidget {
  const HistoryScreen({super.key});

  @override
  State<HistoryScreen> createState() => _HistoryScreenState();
}

class _HistoryScreenState extends State<HistoryScreen> {
  Period _period = Period.weekly;
  int _offset = 0; // 0 = this week, -1 = last week, +1 = next week
  DateTime? _selectedDay;
  CalendarFormat _calendarFormat = CalendarFormat.month;
  final Set<String> _activeFilters = {};

  Future<bool> _confirmHighDose(
      BuildContext context, double supplementIu) async {
    if (supplementIu <= 4000) return true;
    final l10n = AppLocalizations.of(context)!;
    return await showDialog<bool>(
          context: context,
          builder: (dialogContext) => AlertDialog(
            title: Text(l10n.dosageSafeLimit),
            content: Text(l10n.dosageSafeLimitDetail),
            actions: [
              TextButton(
                onPressed: () => Navigator.pop(dialogContext, false),
                child: Text(l10n.cancel),
              ),
              TextButton(
                onPressed: () => Navigator.pop(dialogContext, true),
                child: Text(l10n.ok),
              ),
            ],
          ),
        ) ??
        false;
  }

  List<VitDLog> _getFilteredHistory(List<VitDLog> history) {
    if (_activeFilters.isEmpty) return history;
    return history.where((log) {
      if (_activeFilters.contains('hideZero') && log.iu == 0) return false;
      if (_activeFilters.contains('hideSun') && log.sunIu > 0) return false;
      if (_activeFilters.contains('hideSupp') && log.supplementIu > 0) {
        return false;
      }
      if (_activeFilters.contains('hideSpill') && log.spilloverIu > 0) {
        return false;
      }
      return true;
    }).toList();
  }

  @override
  Widget build(BuildContext context) {
    final vm = context.watch<VitDProvider>();
    final l10n = AppLocalizations.of(context)!;
    final historyByDate = {for (final log in vm.history) log.date: log};
    final filteredHistory = _getFilteredHistory(vm.history);

    // DATA PROCESSING -------------------------------
    double periodTotal = 0;
    double dailyAvg = 0;
    String trendText = l10n.notEnoughData;
    bool trendPositive = true;

    if (_period == Period.weekly) {
      // Logic for Weekly
      List<VitDLog> last7Days = [];
      List<VitDLog> prev7Days = [];

      final shiftedNow = DateTime.now().add(Duration(days: _offset * 7));
      final weekStart = shiftedNow
          .subtract(Duration(days: shiftedNow.weekday - DateTime.monday));
      final previousWeekStart = weekStart.subtract(const Duration(days: 7));

      for (int i = 0; i < 7; i++) {
        final d =
            weekStart.add(Duration(days: i)).toIso8601String().split('T')[0];
        last7Days.add(historyByDate[d] ?? VitDLog(date: d, iu: 0));
      }
      for (int i = 0; i < 7; i++) {
        final d = previousWeekStart
            .add(Duration(days: i))
            .toIso8601String()
            .split('T')[0];
        prev7Days.add(historyByDate[d] ?? VitDLog(date: d, iu: 0));
      }

      final thisWeekSum = last7Days.fold(0.0, (sum, log) => sum + log.iu);
      final prevWeekSum = prev7Days.fold(0.0, (sum, log) => sum + log.iu);

      periodTotal = thisWeekSum;
      dailyAvg = thisWeekSum / 7;

      if (prevWeekSum > 0) {
        double diff = ((thisWeekSum - prevWeekSum) / prevWeekSum) * 100;
        trendPositive = diff >= 0;
        trendText =
            l10n.vsLastWeek("${trendPositive ? '+' : ''}${diff.toInt()}");
      }
    } else if (_period == Period.monthly) {
      // Logic for Monthly (All days of the offset month)
      final now = DateTime.now();
      final targetDate = DateTime(now.year, now.month + _offset, 1);

      String currentMonth =
          targetDate.toIso8601String().substring(0, 7); // YYYY-MM
      List<VitDLog> monthLogs =
          vm.history.where((l) => l.date.startsWith(currentMonth)).toList();

      periodTotal = monthLogs.fold(0, (p, c) => p + c.iu);
      int daysInMonth = (targetDate.month == now.month &&
              targetDate.year == now.year &&
              _offset == 0)
          ? now.day
          : DateTime(targetDate.year, targetDate.month + 1, 0).day;

      dailyAvg = daysInMonth > 0 ? periodTotal / daysInMonth : 0;

      trendText = l10n.monthlyOverview; // Simplified for month
      trendPositive = true;
    } else {
      // Calendar year ending in the selected offset year.
      final now = DateTime.now();
      final targetYear = now.year + _offset;

      double sum = 0;
      for (int month = 1; month <= 12; month++) {
        final prefix = "$targetYear-${month.toString().padLeft(2, '0')}";
        sum += vm.history
            .where((l) => l.date.startsWith(prefix))
            .fold(0.0, (total, log) => total + log.iu);
      }

      periodTotal = sum;
      final elapsedDays = targetYear == now.year && _offset == 0
          ? now.difference(DateTime(now.year, 1, 1)).inDays + 1
          : DateTime(targetYear + 1, 1, 1)
              .difference(DateTime(targetYear, 1, 1))
              .inDays;
      dailyAvg = periodTotal / elapsedDays;

      trendText = l10n.yearly;
      trendPositive = true;
    }

    // Prepare Chart Data ahead of time to calculate MaxY
    // Calculate overflow map for spillover visualization
    final overflowMap = vm.calculateOverflowUsage();
    final spilloverProjections = vm.calculateSpilloverProjections();
    List<BarChartGroupData> chartData;

    if (_period == Period.weekly) {
      chartData = _generateWeeklyData(
          vm.history, overflowMap, _offset, spilloverProjections);
    } else if (_period == Period.monthly) {
      chartData = _generateMonthlyData(
          vm.history, overflowMap, _offset, spilloverProjections);
    } else {
      chartData = _generateYearlyData(vm.history, _offset);
    }

    final targetLineValue =
        (_period == Period.weekly || _period == Period.monthly)
            ? vm.dailyTarget
            : vm.dailyTarget * 30.4;

    // Dynamic Y Axis Calculation
    double maxDataValue = 0;
    for (var group in chartData) {
      if (group.barRods.isNotEmpty) {
        // Handle stacked rods summation if needed, but here rod.toY is the value
        maxDataValue = math.max(maxDataValue, group.barRods[0].toY);
      }
    }

    double maxY;
    double interval;

    final greatestValue = math.max(maxDataValue, targetLineValue);
    final step = _period == Period.yearly
        ? 10000.0
        : math.max(1000.0, greatestValue / 5);
    maxY = ((greatestValue * 1.1 / step).ceil() * step).toDouble();
    if (maxY <= 0) maxY = step;
    interval = maxY / 5;

    // -----------------------------------------------

    return Scaffold(
      body: SafeArea(
        child: SingleChildScrollView(
          child: Column(
            children: [
              // Segmented Control
              Padding(
                padding: const EdgeInsets.all(16.0),
                child: Container(
                  height: 40,
                  padding: const EdgeInsets.all(4),
                  decoration: BoxDecoration(
                    color: Theme.of(context).brightness == Brightness.light
                        ? const Color(0xFFE8E6DE)
                        : const Color(0xFF2D291B),
                    borderRadius: BorderRadius.circular(10),
                  ),
                  child: Row(
                    children: [
                      _segmentBtn(
                          l10n.weekly, _period == Period.weekly, Period.weekly),
                      _segmentBtn(l10n.monthly, _period == Period.monthly,
                          Period.monthly),
                      _segmentBtn(
                          l10n.yearly, _period == Period.yearly, Period.yearly),
                    ],
                  ),
                ),
              ),

              // Stats Cards
              Padding(
                padding: const EdgeInsets.symmetric(horizontal: 16),
                child: Row(
                  children: [
                    Expanded(
                        child: _statCard(
                            Icons.calendar_view_week,
                            AppTheme.primary,
                            l10n.periodTotal,
                            periodTotal.toInt().toString())),
                    const SizedBox(width: 16),
                    Expanded(
                        child: _statCard(Icons.trending_up, Colors.green,
                            l10n.dailyAverage, dailyAvg.toInt().toString())),
                  ],
                ),
              ),

              // Chart Section
              Container(
                margin: const EdgeInsets.all(16),
                padding: const EdgeInsets.all(24),
                decoration: BoxDecoration(
                  color: Theme.of(context).cardColor,
                  borderRadius: BorderRadius.circular(20),
                  border: Border.all(color: Colors.grey.withValues(alpha: 0.1)),
                ),
                child: Column(
                  children: [
                    Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        IconButton(
                          onPressed: () => setState(() => _offset--),
                          icon: const Icon(Icons.chevron_left,
                              color: Colors.grey),
                        ),
                        Expanded(
                          child: Text(
                            _getDateRangeLabel(context, _offset),
                            textAlign: TextAlign.center,
                            style: const TextStyle(
                                fontWeight: FontWeight.bold, fontSize: 14),
                          ),
                        ),
                        IconButton(
                          onPressed: () => setState(() => _offset++),
                          icon: const Icon(Icons.chevron_right,
                              color: Colors.grey),
                        ),
                      ],
                    ),
                    const SizedBox(height: 16),
                    Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      crossAxisAlignment: CrossAxisAlignment.end,
                      children: [
                        Column(
                          crossAxisAlignment: CrossAxisAlignment.start,
                          children: [
                            Text(l10n.productionIu,
                                style: TextStyle(
                                    fontSize: 14,
                                    color: Colors.grey.shade500,
                                    fontWeight: FontWeight.bold)),
                            const SizedBox(height: 4),
                            Row(
                              children: [
                                Text(dailyAvg.toInt().toString(),
                                    style: TextStyle(
                                        fontSize: 28,
                                        fontWeight: FontWeight.bold,
                                        color: Theme.of(context)
                                            .colorScheme
                                            .onSurface)),
                                const SizedBox(width: 8),
                                Container(
                                  padding: const EdgeInsets.symmetric(
                                      horizontal: 8, vertical: 2),
                                  decoration: BoxDecoration(
                                      color: (trendPositive
                                              ? Colors.green
                                              : Colors.red)
                                          .withValues(alpha: 0.1),
                                      borderRadius: BorderRadius.circular(12)),
                                  child: Text(trendText,
                                      style: TextStyle(
                                          color: trendPositive
                                              ? Colors.green
                                              : Colors.red,
                                          fontSize: 10,
                                          fontWeight: FontWeight.bold)),
                                )
                              ],
                            )
                          ],
                        ),
                        Text(l10n.targetIu(vm.dailyTarget.toInt()),
                            style: TextStyle(
                                fontSize: 12, color: Colors.grey.shade500)),
                      ],
                    ),
                    const SizedBox(height: 24),
                    SizedBox(
                      height: 200,
                      child: BarChart(BarChartData(
                        alignment: BarChartAlignment.spaceAround,
                        maxY: maxY, // Dynamic MaxY
                        barTouchData: BarTouchData(
                            touchTooltipData: BarTouchTooltipData(
                          getTooltipColor: (_) => Theme.of(context).cardColor,
                          getTooltipItem: (group, groupIndex, rod, rodIndex) {
                            return BarTooltipItem(
                              rod.toY.toInt().toString(),
                              TextStyle(
                                color: Theme.of(context)
                                        .textTheme
                                        .bodyMedium
                                        ?.color ??
                                    Colors.black,
                                fontWeight: FontWeight.bold,
                              ),
                            );
                          },
                        )),
                        titlesData: FlTitlesData(
                          show: true,
                          bottomTitles: AxisTitles(
                              sideTitles: SideTitles(
                            showTitles: true,
                            getTitlesWidget: (val, _) => Padding(
                              padding: const EdgeInsets.only(top: 8.0),
                              child: Text(_getBottomTitle(val.toInt()),
                                  style: TextStyle(
                                      color: Colors.grey.shade500,
                                      fontWeight: FontWeight.bold,
                                      fontSize: 10)),
                            ),
                          )),
                          leftTitles: AxisTitles(
                              sideTitles: SideTitles(
                            showTitles: true,
                            reservedSize: 40,
                            getTitlesWidget: (value, meta) {
                              if (value == 0) return const SizedBox.shrink();
                              return Text(
                                value >= 1000
                                    ? '${(value / 1000).toStringAsFixed(1).replaceFirst('.0', '')}k'
                                    : value.toInt().toString(),
                                style: TextStyle(
                                    color: Colors.grey.shade500,
                                    fontSize: 10,
                                    fontWeight: FontWeight.bold),
                              );
                            },
                          )),
                          topTitles: const AxisTitles(
                              sideTitles: SideTitles(showTitles: false)),
                          rightTitles: const AxisTitles(
                              sideTitles: SideTitles(showTitles: false)),
                        ),
                        gridData: FlGridData(
                            show: true,
                            drawVerticalLine: false,
                            horizontalInterval: interval,
                            getDrawingHorizontalLine: (val) {
                              return FlLine(
                                color: Colors.grey.withValues(alpha: 0.1),
                                strokeWidth: 1,
                              );
                            }),
                        extraLinesData: ExtraLinesData(
                          horizontalLines: [
                            HorizontalLine(
                              y: targetLineValue,
                              color: AppTheme.primary.withValues(alpha: 0.6),
                              strokeWidth: 2,
                              dashArray: [4, 4], // Dotted/Dashed effect
                            ),
                          ],
                        ),
                        borderData: FlBorderData(show: false),
                        barGroups: chartData,
                      )),
                    ),
                    const SizedBox(height: 16),
                    Wrap(
                      alignment: WrapAlignment.center,
                      spacing: 12,
                      runSpacing: 8,
                      children: [
                        _legendItem(AppTheme.primary, l10n.obtainSun),
                        _legendItem(Colors.grey.shade400, l10n.navSupplements),
                        _legendItem(Colors.teal, l10n.spillover),
                        // Legend for Target Line
                        Row(children: [
                          Container(
                            width: 12,
                            height: 2,
                            color: AppTheme.primary.withValues(alpha: 0.6),
                          ),
                          const SizedBox(width: 6),
                          Text(l10n.target,
                              style: const TextStyle(
                                  fontSize: 12,
                                  fontWeight: FontWeight.bold,
                                  color: Colors.grey)),
                        ]),
                      ],
                    )
                  ],
                ),
              ),

              // Daily Breakdown
              Padding(
                padding:
                    const EdgeInsets.symmetric(horizontal: 16, vertical: 8),
                child: Row(
                  children: [
                    Text(l10n.dailyBreakdown,
                        style: Theme.of(context)
                            .textTheme
                            .titleLarge
                            ?.copyWith(fontSize: 18)),
                    const Spacer(),
                    _headerActionBtn(
                      icon: Icons.calendar_month,
                      onPressed: () async {
                        final picked =
                            await _showHistoryCalendarSheet(context, vm);
                        if (picked != null) {
                          if (!mounted) return;
                          setState(() => _selectedDay =
                              DateTime(picked.year, picked.month, picked.day));
                          final selectedKey =
                              _selectedDay!.toIso8601String().split('T')[0];
                          final selectedLog = vm.history.firstWhere(
                            (log) => log.date == selectedKey,
                            orElse: () => VitDLog(date: selectedKey, iu: 0),
                          );
                          if (!context.mounted) return;
                          _showDayBreakdownSheet(context, vm, selectedLog);
                        }
                      },
                      tooltip: l10n.date,
                    ),
                    const SizedBox(width: 8),
                    _headerActionBtn(
                      icon: Icons.share,
                      onPressed: () {
                        if (!vm.isPro) {
                          Navigator.push(
                            context,
                            MaterialPageRoute(
                                builder: (context) => const StoreScreen()),
                          );
                          return;
                        }
                        _showExportOptions(context, vm);
                      },
                      tooltip: l10n.save,
                    ),
                    const SizedBox(width: 8),
                    _headerActionBtn(
                      icon: Icons.filter_list,
                      onPressed: () => _showFilterOptions(context, vm),
                      tooltip: l10n.filters,
                      isActive: _activeFilters.isNotEmpty,
                    ),
                  ],
                ),
              ),
              if (_selectedDay != null)
                Padding(
                  padding: const EdgeInsets.fromLTRB(16, 0, 16, 8),
                  child: Align(
                    alignment: Alignment.centerRight,
                    child: Text(
                      DateFormat.yMMMd().format(_selectedDay!),
                      style: TextStyle(
                        fontWeight: FontWeight.w600,
                        color: AppTheme.primary.withValues(alpha: 0.8),
                        fontSize: 12,
                      ),
                    ),
                  ),
                ),
              const SizedBox(height: 4),
              Padding(
                padding: const EdgeInsets.symmetric(horizontal: 16),
                child: ConstrainedBox(
                  constraints: BoxConstraints(
                      maxHeight: MediaQuery.of(context).size.height * 0.5),
                  child: Column(
                    children: [
                      Expanded(
                        child: ListView.separated(
                          itemCount: filteredHistory.length,
                          separatorBuilder: (_, __) =>
                              const SizedBox(height: 12),
                          itemBuilder: (context, i) {
                            final log = filteredHistory[i];
                            return Dismissible(
                              key: Key('history_log_${log.date}'),
                              direction: DismissDirection.horizontal,
                              confirmDismiss: (direction) async {
                                if (direction == DismissDirection.startToEnd) {
                                  // Left-to-right swipe -> Edit!
                                  _showDayBreakdownSheet(context, vm, log);
                                  return false; // Retract the item
                                } else {
                                  // Right-to-left swipe -> Delete!
                                  return await showDialog(
                                    context: context,
                                    builder: (BuildContext context) {
                                      return AlertDialog(
                                        title: Text(l10n.confirmDelete),
                                        content: Text(
                                            l10n.deleteLogConfirmation(
                                                DateFormat.yMMMd().format(
                                                    DateTime.parse(log.date)))),
                                        actions: <Widget>[
                                          TextButton(
                                            onPressed: () =>
                                                Navigator.of(context)
                                                    .pop(false),
                                            child: Text(l10n.cancel),
                                          ),
                                          TextButton(
                                            onPressed: () =>
                                                Navigator.of(context).pop(true),
                                            style: TextButton.styleFrom(
                                                foregroundColor: Colors.red),
                                            child: Text(l10n.delete),
                                          ),
                                        ],
                                      );
                                    },
                                  );
                                }
                              },
                              onDismissed: (direction) async {
                                if (direction == DismissDirection.endToStart) {
                                  await vm.deleteHistoryDay(log.date);
                                  if (context.mounted) {
                                    ScaffoldMessenger.of(context).showSnackBar(
                                      SnackBar(content: Text(l10n.logDeleted)),
                                    );
                                  }
                                }
                              },
                              background: Container(
                                alignment: Alignment.centerLeft,
                                padding:
                                    const EdgeInsets.symmetric(horizontal: 20),
                                decoration: BoxDecoration(
                                  color:
                                      AppTheme.primary.withValues(alpha: 0.8),
                                  borderRadius: BorderRadius.circular(16),
                                ),
                                child:
                                    const Icon(Icons.edit, color: Colors.black),
                              ),
                              secondaryBackground: Container(
                                alignment: Alignment.centerRight,
                                padding:
                                    const EdgeInsets.symmetric(horizontal: 20),
                                decoration: BoxDecoration(
                                  color: Colors.red.withValues(alpha: 0.8),
                                  borderRadius: BorderRadius.circular(16),
                                ),
                                child: const Icon(Icons.delete,
                                    color: Colors.white),
                              ),
                              child: GestureDetector(
                                onTap: () =>
                                    _showDayBreakdownSheet(context, vm, log),
                                child: _dailyCard(
                                  context,
                                  log.date,
                                  log.date,
                                  log.iu.toInt(),
                                  true,
                                  log.iu >= vm.dailyTarget,
                                  log.sunIu.toInt(),
                                  log.supplementIu.toInt(),
                                  log.spilloverIu.toInt(),
                                ),
                              ),
                            );
                          },
                        ),
                      ),
                      Padding(
                        padding: const EdgeInsets.only(top: 12.0),
                        child: Row(
                          mainAxisAlignment: MainAxisAlignment.center,
                          children: [
                            Icon(Icons.swipe_right,
                                size: 14, color: Colors.grey.shade500),
                            const SizedBox(width: 4),
                            Text(
                              l10n.swipeToEdit,
                              style: TextStyle(
                                fontSize: 11,
                                color: Colors.grey.shade500,
                                fontWeight: FontWeight.w500,
                              ),
                            ),
                            const SizedBox(width: 16),
                            Icon(Icons.swipe_left,
                                size: 14, color: Colors.grey.shade500),
                            const SizedBox(width: 4),
                            Text(
                              l10n.swipeToDelete,
                              style: TextStyle(
                                fontSize: 11,
                                color: Colors.grey.shade500,
                                fontWeight: FontWeight.w500,
                              ),
                            ),
                          ],
                        ),
                      ),
                    ],
                  ),
                ),
              ),
              const SizedBox(height: 100),
            ],
          ),
        ),
      ),
    );
  }

  String _getBottomTitle(int index) {
    if (_period == Period.weekly) {
      final shiftedNow = DateTime.now().add(Duration(days: _offset * 7));
      final start = shiftedNow
          .subtract(Duration(days: shiftedNow.weekday - DateTime.monday));
      final date = start.add(Duration(days: index));
      return DateFormat.E().format(date)[0];
    } else if (_period == Period.monthly) {
      // Monthly shows days like 1, 5, 10, ...
      int day = index + 1;
      if (day == 1 || day % 5 == 0) return day.toString();
      return '';
    } else {
      // Yearly shows months
      final now = DateTime.now();
      final effectiveDate = DateTime(now.year + _offset, index + 1);
      return DateFormat.MMM().format(effectiveDate);
    }
  }

  String _getDateRangeLabel(BuildContext context, int offset) {
    final l10n = AppLocalizations.of(context)!;
    if (_period == Period.weekly) {
      final shiftedNow = DateTime.now().add(Duration(days: offset * 7));
      final start = shiftedNow
          .subtract(Duration(days: shiftedNow.weekday - DateTime.monday));
      final end = start.add(const Duration(days: 6));

      if (offset == 0) return l10n.thisWeek;

      final rangeStr =
          "${DateFormat.MMMd().format(start)} - ${DateFormat.MMMd().format(end)}";
      try {
        if (offset > 0) return l10n.projectedRange(rangeStr);
      } catch (e) {
        // Fallback
      }
      return rangeStr;
    } else if (_period == Period.monthly) {
      final now = DateTime.now();
      final targetDate = DateTime(now.year, now.month + offset, 1);
      return DateFormat.yMMMM().format(targetDate);
    } else {
      final now = DateTime.now();
      final targetDate = DateTime(now.year + offset, now.month, 1);
      if (offset == 0) return l10n.yearly;
      return targetDate.year.toString();
    }
  }

  Widget _segmentBtn(String label, bool isSelected, Period period) {
    return Expanded(
      child: GestureDetector(
        onTap: () => setState(() {
          _period = period;
          _offset = 0;
        }),
        child: Container(
          decoration: BoxDecoration(
            color:
                isSelected ? Theme.of(context).cardColor : Colors.transparent,
            borderRadius: BorderRadius.circular(8),
            boxShadow: isSelected
                ? [
                    BoxShadow(
                        color: Colors.black.withValues(alpha: 0.05),
                        blurRadius: 4)
                  ]
                : null,
          ),
          alignment: Alignment.center,
          child: Text(
            label,
            style: TextStyle(
                fontWeight: FontWeight.w600,
                fontSize: 14,
                color: isSelected
                    ? Theme.of(context).colorScheme.onSurface
                    : Colors.grey.shade500),
          ),
        ),
      ),
    );
  }

  Widget _statCard(IconData icon, Color color, String label, String value) {
    return Container(
      padding: const EdgeInsets.all(16),
      decoration: BoxDecoration(
        color: Theme.of(context).cardColor,
        borderRadius: BorderRadius.circular(16),
        border: Border.all(color: Colors.grey.withValues(alpha: 0.1)),
      ),
      child: Column(
        crossAxisAlignment: CrossAxisAlignment.start,
        children: [
          Row(children: [
            Icon(icon, color: color, size: 20),
            const SizedBox(width: 6),
            Text(label,
                style: const TextStyle(
                    fontSize: 10,
                    fontWeight: FontWeight.bold,
                    color: Colors.grey))
          ]),
          const SizedBox(height: 4),
          RichText(
              text: TextSpan(
                  text: value,
                  style: TextStyle(
                      fontSize: 20,
                      fontWeight: FontWeight.bold,
                      color: Theme.of(context).colorScheme.onSurface),
                  children: const [
                TextSpan(
                    text: " IU",
                    style: TextStyle(fontSize: 12, color: Colors.grey))
              ])),
        ],
      ),
    );
  }

  Widget _headerActionBtn({
    required IconData icon,
    required VoidCallback onPressed,
    required String tooltip,
    bool isActive = false,
  }) {
    return Container(
      decoration: BoxDecoration(
        color: isActive
            ? AppTheme.primary.withValues(alpha: 0.1)
            : Theme.of(context).cardColor,
        borderRadius: BorderRadius.circular(12),
        border: Border.all(
            color: isActive
                ? AppTheme.primary
                : Colors.grey.withValues(alpha: 0.2)),
        boxShadow: [
          BoxShadow(
            color: Colors.black.withValues(alpha: 0.05),
            blurRadius: 4,
            offset: const Offset(0, 2),
          ),
        ],
      ),
      child: IconButton(
        onPressed: onPressed,
        icon: Icon(icon,
            size: 20,
            color: isActive
                ? AppTheme.primary
                : (Theme.of(context).brightness == Brightness.light
                    ? Colors.black
                    : Colors.white70)),
        tooltip: tooltip,
      ),
    );
  }

  Widget _legendItem(Color color, String label) {
    return Row(
      children: [
        Container(
            width: 8,
            height: 8,
            decoration: BoxDecoration(color: color, shape: BoxShape.circle)),
        const SizedBox(width: 6),
        Text(label,
            style: const TextStyle(
                fontSize: 12, fontWeight: FontWeight.bold, color: Colors.grey)),
      ],
    );
  }

  void _showDayBreakdownSheet(
      BuildContext context, VitDProvider vm, VitDLog log) async {
    final initialEntries = await vm.getTrackingEntriesForDate(log.date);
    final prefs = await SharedPreferences.getInstance();
    final bloodUnit = BloodConcentrationUnitX.fromStorage(
      prefs.getString('blood_concentration_unit'),
    );
    if (!context.mounted) return;
    showModalBottomSheet(
      context: context,
      isScrollControlled: true,
      builder: (context) {
        return StatefulBuilder(
          builder: (context, setSheetState) {
            return SafeArea(
              child: Padding(
                padding: const EdgeInsets.all(16.0),
                child: Column(
                  mainAxisSize: MainAxisSize.min,
                  crossAxisAlignment: CrossAxisAlignment.start,
                  children: [
                    Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        Text(
                          "${AppLocalizations.of(context)!.dailyBreakdown} - ${DateFormat.yMMMd().format(DateTime.parse(log.date))}",
                          style: Theme.of(context).textTheme.titleMedium,
                        ),
                        IconButton(
                          onPressed: () async {
                            final l10n = AppLocalizations.of(context)!;
                            final confirmed = await showDialog<bool>(
                                  context: context,
                                  builder: (dialogContext) => AlertDialog(
                                    title: Text(l10n.confirmDelete),
                                    content: Text(
                                      l10n.deleteLogConfirmation(
                                        DateFormat.yMMMd()
                                            .format(DateTime.parse(log.date)),
                                      ),
                                    ),
                                    actions: [
                                      TextButton(
                                        onPressed: () =>
                                            Navigator.pop(dialogContext, false),
                                        child: Text(l10n.cancel),
                                      ),
                                      TextButton(
                                        onPressed: () =>
                                            Navigator.pop(dialogContext, true),
                                        style: TextButton.styleFrom(
                                          foregroundColor: Colors.red,
                                        ),
                                        child: Text(l10n.delete),
                                      ),
                                    ],
                                  ),
                                ) ??
                                false;
                            if (!confirmed || !context.mounted) return;
                            Navigator.of(context).pop();
                            await vm.deleteHistoryDay(log.date);
                            if (!mounted) return;
                          },
                          icon: const Icon(Icons.delete_forever),
                        ),
                      ],
                    ),
                    const SizedBox(height: 8),
                    if (vm.bloodTests.any((t) =>
                        t.dateTime.toIso8601String().split('T')[0] == log.date))
                      ...vm.bloodTests
                          .where((t) =>
                              t.dateTime.toIso8601String().split('T')[0] ==
                              log.date)
                          .map((entry) {
                        return ListTile(
                          leading:
                              const Icon(Icons.bloodtype, color: Colors.red),
                          title: Text(
                            bloodUnit.formatHistoryMeasurementTitle(
                              AppLocalizations.of(context)!.bloodTest,
                              entry.valueNgMl,
                            ),
                          ),
                          trailing: IconButton(
                            icon: const Icon(Icons.delete_outline),
                            onPressed: () async {
                              if (entry.id != null) {
                                await vm.deleteBloodTest(entry.id!);
                                setSheetState(() {});
                              }
                            },
                          ),
                        );
                      }),
                    if (initialEntries.isEmpty)
                      Padding(
                        padding: const EdgeInsets.symmetric(vertical: 8.0),
                        child:
                            Text(AppLocalizations.of(context)!.notEnoughData),
                      )
                    else
                      ConstrainedBox(
                        constraints: BoxConstraints(
                            maxHeight:
                                MediaQuery.of(context).size.height * 0.45),
                        child: ListView.separated(
                          shrinkWrap: true,
                          itemCount: initialEntries.length,
                          separatorBuilder: (_, __) => const Divider(height: 1),
                          itemBuilder: (context, index) {
                            final entry = initialEntries[index];
                            final isSun = entry.entryType == 'sun';
                            return ListTile(
                              onTap: () async {
                                if (isSun) {
                                  // Edit Sun Exposure
                                  final dateObj = DateTime.parse(entry.date);
                                  await showModalBottomSheet(
                                    context: context,
                                    isScrollControlled: true,
                                    backgroundColor: Colors.transparent,
                                    builder: (context) => ExposureScreen(
                                      date: dateObj,
                                      initialMinutes: entry.sunMinutes,
                                      initialIu: entry.iu,
                                      isEditing: true,
                                      entryId: entry.id.toString(),
                                    ),
                                  );
                                  final newEntries = await vm
                                      .getTrackingEntriesForDate(log.date);
                                  setSheetState(() {
                                    initialEntries.clear();
                                    initialEntries.addAll(newEntries);
                                  });
                                } else {
                                  // Edit Supplement IU
                                  final TextEditingController editController =
                                      TextEditingController(
                                          text: entry.iu.toInt().toString());
                                  final newIu = await showDialog<double>(
                                    context: context,
                                    builder: (context) => AlertDialog(
                                      title: Text(AppLocalizations.of(context)!
                                          .editSupplement),
                                      content: TextField(
                                        controller: editController,
                                        keyboardType: TextInputType.number,
                                        decoration:
                                            InputDecoration(suffixText: "IU"),
                                      ),
                                      actions: [
                                        TextButton(
                                            onPressed: () =>
                                                Navigator.pop(context),
                                            child: Text(
                                                AppLocalizations.of(context)!
                                                    .cancel)),
                                        TextButton(
                                            onPressed: () => Navigator.pop(
                                                context,
                                                double.tryParse(
                                                    editController.text)),
                                            child: Text(
                                                AppLocalizations.of(context)!
                                                    .save)),
                                      ],
                                    ),
                                  );
                                  editController.dispose();
                                  if (newIu != null &&
                                      VitDValidation.isValidSupplement(newIu)) {
                                    if (!context.mounted) return;
                                    final confirmed =
                                        await _confirmHighDose(context, newIu);
                                    if (!confirmed || !context.mounted) return;
                                    await vm.updateTrackingEntryById(entry.id,
                                        iu: newIu, date: entry.date);
                                    final newEntries = await vm
                                        .getTrackingEntriesForDate(log.date);
                                    setSheetState(() {
                                      initialEntries.clear();
                                      initialEntries.addAll(newEntries);
                                    });
                                  }
                                }
                              },
                              leading: Icon(
                                isSun ? Icons.wb_sunny : Icons.medication,
                                color: isSun
                                    ? AppTheme.primary
                                    : Colors.grey.shade700,
                              ),
                              title: Text(
                                  "${isSun ? AppLocalizations.of(context)!.obtainSun : AppLocalizations.of(context)!.navSupplements} • ${entry.iu.toInt()} IU"),
                              subtitle: Text(DateFormat.Hm().format(
                                  DateTime.parse(entry.createdAt).toLocal())),
                              trailing: IconButton(
                                onPressed: () async {
                                  await vm.deleteTrackingEntry(entry);
                                  if (!mounted) return;
                                  initialEntries
                                      .removeWhere((e) => e.id == entry.id);
                                  setSheetState(() {});
                                },
                                icon: const Icon(Icons.delete_outline),
                              ),
                            );
                          },
                        ),
                      ),
                    const SizedBox(height: 16),
                    Wrap(
                      spacing: 8,
                      runSpacing: 8,
                      children: [
                        SizedBox(
                          width: MediaQuery.of(context).size.width / 2 - 20,
                          child: OutlinedButton.icon(
                            onPressed: () async {
                              final dateObj = DateTime.parse(log.date);
                              final approxUv = vm.approximateUVIndex(dateObj);
                              await showModalBottomSheet(
                                context: context,
                                isScrollControlled: true,
                                backgroundColor: Colors.transparent,
                                builder: (context) => ExposureScreen(
                                  date: dateObj,
                                  initialUvIndex: approxUv,
                                ),
                              );
                              final newEntries =
                                  await vm.getTrackingEntriesForDate(log.date);
                              setSheetState(() {
                                initialEntries.clear();
                                initialEntries.addAll(newEntries);
                              });
                            },
                            icon: const Icon(Icons.wb_sunny, size: 18),
                            label: Text(AppLocalizations.of(context)!.addSun),
                          ),
                        ),
                        SizedBox(
                          width: MediaQuery.of(context).size.width / 2 - 20,
                          child: OutlinedButton.icon(
                            onPressed: () async {
                              final TextEditingController addController =
                                  TextEditingController();
                              final iuVal = await showDialog<double>(
                                context: context,
                                builder: (context) => AlertDialog(
                                  title: Text(AppLocalizations.of(context)!
                                      .addSupplement),
                                  content: TextField(
                                    controller: addController,
                                    keyboardType: TextInputType.number,
                                    autofocus: true,
                                    decoration: InputDecoration(
                                      hintText: AppLocalizations.of(context)!
                                          .enterIuAmount,
                                      suffixText: "IU",
                                    ),
                                  ),
                                  actions: [
                                    TextButton(
                                        onPressed: () => Navigator.pop(context),
                                        child: Text(
                                            AppLocalizations.of(context)!
                                                .cancel)),
                                    TextButton(
                                        onPressed: () => Navigator.pop(
                                            context,
                                            double.tryParse(
                                                addController.text)),
                                        child: Text(
                                            AppLocalizations.of(context)!
                                                .save)),
                                  ],
                                ),
                              );
                              addController.dispose();
                              if (iuVal != null &&
                                  VitDValidation.isValidSupplement(iuVal)) {
                                if (!context.mounted) return;
                                final confirmed =
                                    await _confirmHighDose(context, iuVal);
                                if (!confirmed || !context.mounted) return;
                                await vm.addSupplement(iuVal,
                                    date: DateTime.parse(log.date));
                                final newEntries = await vm
                                    .getTrackingEntriesForDate(log.date);
                                setSheetState(() {
                                  initialEntries.clear();
                                  initialEntries.addAll(newEntries);
                                });
                              }
                            },
                            icon: const Icon(Icons.medication, size: 18),
                            label: Text(
                                AppLocalizations.of(context)!.addSupplement),
                          ),
                        ),
                        SizedBox(
                          width: MediaQuery.of(context).size.width - 32,
                          child: OutlinedButton.icon(
                            onPressed: () async {
                              final l10n = AppLocalizations.of(context)!;
                              String selectedUnit = 'ng/mL';
                              final valueController = TextEditingController();
                              DateTime selectedDate = DateTime.parse(log.date);

                              await showDialog(
                                context: context,
                                builder: (context) {
                                  return StatefulBuilder(
                                    builder: (context, setState) {
                                      return AlertDialog(
                                        title: Text(l10n.logBloodTest),
                                        content: Column(
                                          mainAxisSize: MainAxisSize.min,
                                          children: [
                                            Row(
                                              children: [
                                                Expanded(
                                                  child: TextField(
                                                    controller: valueController,
                                                    keyboardType: TextInputType
                                                        .numberWithOptions(
                                                            decimal: true),
                                                    decoration: InputDecoration(
                                                      labelText: l10n
                                                          .enterBloodTestValue,
                                                    ),
                                                  ),
                                                ),
                                                const SizedBox(width: 16),
                                                DropdownButton<String>(
                                                  value: selectedUnit,
                                                  items: ['ng/mL', 'nmol/L']
                                                      .map((String value) {
                                                    return DropdownMenuItem<
                                                        String>(
                                                      value: value,
                                                      child: Text(value),
                                                    );
                                                  }).toList(),
                                                  onChanged: (newValue) {
                                                    setState(() {
                                                      selectedUnit = newValue!;
                                                    });
                                                  },
                                                ),
                                              ],
                                            ),
                                          ],
                                        ),
                                        actions: [
                                          TextButton(
                                            onPressed: () =>
                                                Navigator.pop(context),
                                            child: Text(l10n.cancel),
                                          ),
                                          TextButton(
                                            onPressed: () async {
                                              final val = double.tryParse(
                                                  valueController.text);
                                              final standardValue = val == null
                                                  ? double.nan
                                                  : selectedUnit == 'nmol/L'
                                                      ? val / 2.5
                                                      : val;
                                              if (VitDValidation
                                                  .isValidBloodLevelNgMl(
                                                      standardValue)) {
                                                await vm.addBloodTest(
                                                    selectedDate,
                                                    val!,
                                                    selectedUnit);
                                                if (context.mounted) {
                                                  Navigator.pop(context);
                                                }
                                                setSheetState(() {});
                                              }
                                            },
                                            child: Text(l10n.save),
                                          ),
                                        ],
                                      );
                                    },
                                  );
                                },
                              );
                              valueController.dispose();
                            },
                            icon: const Icon(Icons.bloodtype, size: 18),
                            label: Text(
                                AppLocalizations.of(context)!.addBloodTest),
                          ),
                        ),
                      ],
                    ),
                  ],
                ),
              ),
            );
          },
        );
      },
    );
  }

  Future<DateTime?> _showHistoryCalendarSheet(
      BuildContext context, VitDProvider vm) async {
    DateTime focusedDay = _selectedDay ?? DateTime.now();
    DateTime selectedDay = _selectedDay ?? DateTime.now();
    DateTime? pickedDay;

    await showModalBottomSheet(
      context: context,
      isScrollControlled: true,
      builder: (context) {
        return StatefulBuilder(
          builder: (context, setModalState) {
            return SafeArea(
              child: Padding(
                padding: const EdgeInsets.all(16),
                child: Column(
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    Row(
                      mainAxisAlignment: MainAxisAlignment.spaceBetween,
                      children: [
                        Text(
                          AppLocalizations.of(context)!.date,
                          style: Theme.of(context).textTheme.titleMedium,
                        ),
                        IconButton(
                          onPressed: () => Navigator.of(context).pop(),
                          icon: const Icon(Icons.close),
                        )
                      ],
                    ),
                    TableCalendar(
                      firstDay: DateTime.now()
                          .subtract(const Duration(days: _calendarRangeDays)),
                      lastDay: DateTime.now()
                          .add(const Duration(days: _calendarRangeDays)),
                      focusedDay: focusedDay,
                      calendarFormat: _calendarFormat,
                      selectedDayPredicate: (day) =>
                          isSameDay(selectedDay, day),
                      onFormatChanged: (format) {
                        setState(() {
                          _calendarFormat = format;
                        });
                        setModalState(() {});
                      },
                      headerStyle: const HeaderStyle(
                        formatButtonVisible: true,
                        formatButtonShowsNext: false,
                      ),
                      calendarBuilders: CalendarBuilders(
                        defaultBuilder: (context, day, focused) {
                          return _calendarDayCell(vm, day, selected: false);
                        },
                        todayBuilder: (context, day, focused) {
                          return _calendarDayCell(vm, day, selected: false);
                        },
                        selectedBuilder: (context, day, focused) {
                          return _calendarDayCell(vm, day, selected: true);
                        },
                      ),
                      onDaySelected: (newSelectedDay, newFocusedDay) {
                        setModalState(() {
                          selectedDay = newSelectedDay;
                          focusedDay = newFocusedDay;
                        });
                        pickedDay = DateTime(newSelectedDay.year,
                            newSelectedDay.month, newSelectedDay.day);
                        Navigator.of(context).pop();
                      },
                      onPageChanged: (newFocusedDay) {
                        setModalState(() => focusedDay = newFocusedDay);
                      },
                    ),
                  ],
                ),
              ),
            );
          },
        );
      },
    );

    return pickedDay;
  }

  Widget _calendarDayCell(VitDProvider vm, DateTime day,
      {required bool selected}) {
    final key =
        DateTime(day.year, day.month, day.day).toIso8601String().split('T')[0];
    final log = vm.history.firstWhere(
      (l) => l.date == key,
      orElse: () => VitDLog(date: key, iu: 0),
    );
    final ratio =
        vm.dailyTarget <= 0 ? 0.0 : (log.iu / vm.dailyTarget).clamp(0.0, 1.5);
    Color bgColor;
    if (ratio >= 1.0) {
      bgColor = Colors.green.withValues(alpha: _calendarTargetMetAlpha);
    } else if (ratio > 0.0) {
      bgColor = AppTheme.primary.withValues(
          alpha:
              _calendarPartialBaseAlpha + (ratio * _calendarPartialAlphaSpan));
    } else {
      bgColor = Colors.transparent;
    }

    return Container(
      margin: const EdgeInsets.all(4),
      decoration: BoxDecoration(
        color: selected ? AppTheme.primary : bgColor,
        borderRadius: BorderRadius.circular(8),
        border: selected
            ? Border.all(color: AppTheme.primary, width: 1.5)
            : (isSameDay(day, DateTime.now())
                ? Border.all(
                    color: Colors.yellow.withValues(alpha: 0.9), width: 0.5)
                : null),
      ),
      child: Stack(
        children: [
          Center(
            child: Text(
              '${day.day}',
              style: TextStyle(
                fontWeight: FontWeight.w600,
                color: selected ? Colors.white : null,
              ),
            ),
          ),
          if (log.iu > 0)
            Positioned(
              bottom: 4,
              left: 0,
              right: 0,
              child: Row(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [
                  if (log.sunIu > 0) _calendarDot(AppTheme.primary),
                  if (log.supplementIu > 0) _calendarDot(Colors.grey.shade400),
                  if (log.spilloverIu > 0) _calendarDot(Colors.teal),
                  if (vm.bloodTests.any(
                      (t) => t.dateTime.toIso8601String().split('T')[0] == key))
                    _calendarDot(Colors.red),
                ],
              ),
            ),
        ],
      ),
    );
  }

  Widget _calendarDot(Color color) {
    return Container(
      margin: const EdgeInsets.symmetric(horizontal: 1),
      width: 4,
      height: 4,
      decoration: BoxDecoration(
        color: color,
        shape: BoxShape.circle,
      ),
    );
  }

  Widget _dailyCard(BuildContext context, String title, String date, int iu,
      bool isDetailed, bool targetMet, int sun, int supp, int spillover,
      {bool isLow = false, IconData icon = Icons.wb_sunny, String? subtitle}) {
    final l10n = AppLocalizations.of(context)!;
    return Container(
      padding: const EdgeInsets.all(16),
      decoration: BoxDecoration(
        color: Theme.of(context).cardColor,
        borderRadius: BorderRadius.circular(16),
        border: Border.all(color: Colors.grey.withValues(alpha: 0.1)),
        boxShadow: [
          BoxShadow(color: Colors.black.withValues(alpha: 0.02), blurRadius: 10)
        ],
      ),
      child: Column(
        children: [
          Row(
            mainAxisAlignment: MainAxisAlignment.spaceBetween,
            children: [
              Row(
                children: [
                  Container(
                    width: 40,
                    height: 40,
                    decoration: BoxDecoration(
                        color: icon == Icons.wb_sunny
                            ? AppTheme.primary.withValues(alpha: 0.2)
                            : (isLow
                                ? Colors.orange.withValues(alpha: 0.1)
                                : Colors.grey.withValues(alpha: 0.1)),
                        shape: BoxShape.circle),
                    child: Icon(icon,
                        color: icon == Icons.wb_sunny
                            ? AppTheme.primary
                            : (isLow ? Colors.deepOrange : Colors.grey),
                        size: 20),
                  ),
                  const SizedBox(width: 12),
                  Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    children: [
                      Text(title,
                          style: const TextStyle(
                              fontWeight: FontWeight.bold, fontSize: 16)),
                      Text(date,
                          style: const TextStyle(
                              fontSize: 12, color: Colors.grey)),
                    ],
                  )
                ],
              ),
              Column(
                crossAxisAlignment: CrossAxisAlignment.end,
                children: [
                  Text("$iu IU",
                      style: const TextStyle(
                          fontWeight: FontWeight.bold, fontSize: 16)),
                  if (targetMet)
                    Container(
                        padding: const EdgeInsets.symmetric(
                            horizontal: 6, vertical: 2),
                        decoration: BoxDecoration(
                            color: Colors.green.withValues(alpha: 0.1),
                            borderRadius: BorderRadius.circular(10)),
                        child: Text(l10n.targetMet,
                            style: const TextStyle(
                                color: Colors.green,
                                fontSize: 10,
                                fontWeight: FontWeight.bold)))
                  else if (isLow)
                    Text(l10n.lowExposure,
                        style: const TextStyle(
                            color: Colors.deepOrange,
                            fontSize: 10,
                            fontWeight: FontWeight.bold))
                  else if (subtitle != null)
                    Text(subtitle,
                        style:
                            const TextStyle(color: Colors.grey, fontSize: 10))
                ],
              )
            ],
          ),
          if (isDetailed) ...[
            Padding(
                padding: const EdgeInsets.symmetric(vertical: 12),
                child: Divider(
                    height: 1, color: Colors.grey.withValues(alpha: 0.1))),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                Text(l10n.sunExposureIu(sun),
                    style: const TextStyle(fontSize: 12, color: Colors.grey)),
                Text(l10n.supplementIu(supp),
                    style: const TextStyle(fontSize: 12, color: Colors.grey)),
              ],
            ),
            if (spillover > 0)
              Padding(
                padding: const EdgeInsets.only(top: 4.0),
                child: Row(
                  children: [
                    Text(l10n.spilloverIu(spillover),
                        style:
                            const TextStyle(fontSize: 12, color: Colors.teal)),
                  ],
                ),
              )
          ]
        ],
      ),
    );
  }

  Future<void> _showExportOptions(BuildContext context, VitDProvider vm) async {
    final l10n = AppLocalizations.of(context)!;
    final now = DateTime.now();

    final Set<int> dataYears = {now.year};
    final Set<String> dataMonths = {
      "${now.year}-${now.month.toString().padLeft(2, '0')}"
    };
    DateTime firstDate = now;
    DateTime lastDate = now;

    if (vm.history.isNotEmpty) {
      final dates =
          vm.history.map((e) => DateTime.tryParse(e.date) ?? now).toList();
      dates.sort();
      firstDate = dates.first.isBefore(now) ? dates.first : now;
      lastDate = dates.last.isAfter(now) ? dates.last : now;

      for (final d in dates) {
        dataYears.add(d.year);
        dataMonths.add("${d.year}-${d.month.toString().padLeft(2, '0')}");
      }
    }

    final List<int> availableYears = dataYears.toList()
      ..sort((a, b) => b.compareTo(a));
    final List<DateTime> availableMonths = dataMonths.map((m) {
      final parts = m.split('-');
      return DateTime(int.parse(parts[0]), int.parse(parts[1]), 1);
    }).toList()
      ..sort((a, b) => b.compareTo(a));

    final mode = await showModalBottomSheet<String>(
      context: context,
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(20)),
      ),
      builder: (context) => SafeArea(
        child: Column(
          mainAxisSize: MainAxisSize.min,
          children: [
            Padding(
              padding: const EdgeInsets.all(16.0),
              child: Text(
                l10n.selectExportMode,
                style:
                    const TextStyle(fontWeight: FontWeight.bold, fontSize: 18),
              ),
            ),
            ListTile(
              leading: const Icon(Icons.calendar_today),
              title: Text(l10n.byYear),
              onTap: () => Navigator.pop(context, 'year'),
            ),
            ListTile(
              leading: const Icon(Icons.calendar_month),
              title: Text(l10n.byMonth),
              onTap: () => Navigator.pop(context, 'month'),
            ),
            ListTile(
              leading: const Icon(Icons.date_range),
              title: Text(l10n.customRange),
              onTap: () => Navigator.pop(context, 'range'),
            ),
            const SizedBox(height: 8),
          ],
        ),
      ),
    );

    if (mode == null || !context.mounted) return;

    DateTimeRange? pickedRange;

    if (mode == 'range') {
      DateTime initialStart =
          firstDate.isAfter(now.subtract(const Duration(days: 29)))
              ? firstDate
              : now.subtract(const Duration(days: 29));
      if (initialStart.isBefore(firstDate)) initialStart = firstDate;

      DateTime initialEnd = lastDate.isBefore(now) ? lastDate : now;

      pickedRange = await showDateRangePicker(
        context: context,
        firstDate: firstDate,
        lastDate: lastDate,
        initialDateRange: DateTimeRange(
          start: initialStart,
          end: initialEnd,
        ),
        builder: (context, child) {
          return Theme(
            data: Theme.of(context).copyWith(
              colorScheme: Theme.of(context).colorScheme.copyWith(
                    primary: AppTheme.primary,
                    onPrimary: Colors.black,
                    surface: Theme.of(context).scaffoldBackgroundColor,
                    onSurface: Theme.of(context).colorScheme.onSurface,
                  ),
              datePickerTheme: DatePickerThemeData(
                rangeSelectionBackgroundColor:
                    AppTheme.primary.withValues(alpha: 0.2),
                rangeSelectionOverlayColor: WidgetStateProperty.all(
                    AppTheme.primary.withValues(alpha: 0.1)),
              ),
            ),
            child: child!,
          );
        },
      );
    } else if (mode == 'year') {
      pickedRange = await _pickYearRange(context, l10n, availableYears);
    } else if (mode == 'month') {
      pickedRange = await _pickMonthRange(context, l10n, availableMonths);
    }

    if (pickedRange == null || !context.mounted) return;
    final finalRange = pickedRange;

    String selectedFilter = 'all';
    bool onlyWithData = true;

    await showModalBottomSheet(
      context: context,
      builder: (sheetContext) =>
          StatefulBuilder(builder: (context, setModalState) {
        return SafeArea(
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              Padding(
                padding:
                    const EdgeInsets.symmetric(horizontal: 16.0, vertical: 8.0),
                child: DropdownButtonFormField<String>(
                  decoration: InputDecoration(labelText: l10n.dataFilter),
                  initialValue: selectedFilter,
                  items: [
                    DropdownMenuItem(value: 'all', child: Text(l10n.allData)),
                    DropdownMenuItem(
                        value: 'sun', child: Text(l10n.sunExposureOnly)),
                    DropdownMenuItem(
                        value: 'supplement', child: Text(l10n.supplementsOnly)),
                  ],
                  onChanged: (v) => setModalState(() => selectedFilter = v!),
                ),
              ),
              CheckboxListTile(
                title: Text(l10n.onlyExportDataDays),
                value: onlyWithData,
                onChanged: (v) => setModalState(() => onlyWithData = v ?? true),
                controlAffinity: ListTileControlAffinity.leading,
                activeColor: Theme.of(context).primaryColor,
              ),
              ListTile(
                leading: const Icon(Icons.picture_as_pdf),
                title: Text('${l10n.save} ${l10n.pdfSuffix}'),
                onTap: () async {
                  Navigator.of(sheetContext).pop();
                  final error = await vm.generateAndShareReport(
                      finalRange.start, finalRange.end, 'pdf', l10n,
                      filter: selectedFilter, onlyWithData: onlyWithData);
                  if (!context.mounted) return;
                  if (error != null) {
                    ScaffoldMessenger.of(context).showSnackBar(
                      SnackBar(content: Text(error)),
                    );
                  }
                },
              ),
              ListTile(
                leading: const Icon(Icons.table_chart),
                title: Text('${l10n.save} ${l10n.csvSuffix}'),
                onTap: () async {
                  Navigator.of(sheetContext).pop();
                  final error = await vm.generateAndShareReport(
                      finalRange.start, finalRange.end, 'csv', l10n,
                      filter: selectedFilter, onlyWithData: onlyWithData);
                  if (!context.mounted) return;
                  if (error != null) {
                    ScaffoldMessenger.of(context).showSnackBar(
                      SnackBar(content: Text(error)),
                    );
                  }
                },
              ),
            ],
          ),
        );
      }),
    );
  }

  Future<DateTimeRange?> _pickYearRange(
      BuildContext context, AppLocalizations l10n, List<int> years) async {
    final now = DateTime.now();
    final currentYear = now.year;

    final result = await showModalBottomSheet<dynamic>(
      context: context,
      isScrollControlled: true,
      builder: (context) => DraggableScrollableSheet(
        initialChildSize: 0.6,
        maxChildSize: 0.9,
        minChildSize: 0.4,
        expand: false,
        builder: (context, scrollController) => Column(
          children: [
            Padding(
              padding: const EdgeInsets.all(16.0),
              child: Text(l10n.byYear,
                  style: const TextStyle(
                      fontSize: 18, fontWeight: FontWeight.bold)),
            ),
            ListTile(
              leading: const Icon(Icons.today),
              title: Text(l10n.yearToDate),
              onTap: () => Navigator.pop(context,
                  DateTimeRange(start: DateTime(currentYear, 1, 1), end: now)),
            ),
            ListTile(
              leading: const Icon(Icons.date_range),
              title: Text(l10n.selectYearRange),
              onTap: () async {
                final range = await _showYearRangePicker(context, l10n, years);
                if (context.mounted && range != null) {
                  Navigator.pop(context, range);
                }
              },
            ),
            const Divider(),
            Expanded(
              child: ListView.builder(
                controller: scrollController,
                itemCount: years.length,
                itemBuilder: (context, index) {
                  final year = years[index];
                  return ListTile(
                    title: Text(year.toString()),
                    onTap: () => Navigator.pop(
                        context,
                        DateTimeRange(
                            start: DateTime(year, 1, 1),
                            end: DateTime(year, 12, 31))),
                  );
                },
              ),
            ),
          ],
        ),
      ),
    );

    if (result is DateTimeRange) return result;
    return null;
  }

  Future<DateTimeRange?> _showYearRangePicker(
      BuildContext context, AppLocalizations l10n, List<int> years) async {
    int? startYear;
    int? endYear;

    return await showDialog<DateTimeRange>(
      context: context,
      builder: (context) => StatefulBuilder(builder: (context, setState) {
        return AlertDialog(
          title: Text(l10n.selectYearRange),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              DropdownButtonFormField<int>(
                decoration: InputDecoration(labelText: l10n.selectStartYear),
                initialValue: startYear,
                items: years
                    .map((y) => DropdownMenuItem(value: y, child: Text("$y")))
                    .toList(),
                onChanged: (v) => setState(() => startYear = v),
              ),
              const SizedBox(height: 16),
              DropdownButtonFormField<int>(
                decoration: InputDecoration(labelText: l10n.selectEndYear),
                initialValue: endYear,
                items: years
                    .map((y) => DropdownMenuItem(value: y, child: Text("$y")))
                    .toList(),
                onChanged: (v) => setState(() => endYear = v),
              ),
            ],
          ),
          actions: [
            TextButton(
                onPressed: () => Navigator.pop(context),
                child: Text(l10n.cancel)),
            TextButton(
              onPressed: (startYear == null || endYear == null)
                  ? null
                  : () {
                      final s = startYear! < endYear! ? startYear! : endYear!;
                      final e = startYear! > endYear! ? startYear! : endYear!;
                      Navigator.pop(
                        context,
                        DateTimeRange(
                          start: DateTime(s, 1, 1),
                          end: DateTime(e, 12, 31),
                        ),
                      );
                    },
              child: Text(l10n.ok),
            ),
          ],
        );
      }),
    );
  }

  Future<DateTimeRange?> _pickMonthRange(BuildContext context,
      AppLocalizations l10n, List<DateTime> months) async {
    final now = DateTime.now();
    final currentYear = now.year;
    final currentMonth = now.month;

    final result = await showModalBottomSheet<dynamic>(
      context: context,
      isScrollControlled: true,
      builder: (context) => DraggableScrollableSheet(
        initialChildSize: 0.6,
        maxChildSize: 0.9,
        minChildSize: 0.4,
        expand: false,
        builder: (context, scrollController) => Column(
          children: [
            Padding(
              padding: const EdgeInsets.all(16.0),
              child: Text(l10n.byMonth,
                  style: const TextStyle(
                      fontSize: 18, fontWeight: FontWeight.bold)),
            ),
            ListTile(
              leading: const Icon(Icons.today),
              title: Text(l10n.monthToDate),
              onTap: () => Navigator.pop(
                  context,
                  DateTimeRange(
                      start: DateTime(currentYear, currentMonth, 1), end: now)),
            ),
            ListTile(
              leading: const Icon(Icons.date_range),
              title: Text(l10n.selectMonthRange),
              onTap: () async {
                final range =
                    await _showMonthRangePicker(context, l10n, months);
                if (context.mounted && range != null) {
                  Navigator.pop(context, range);
                }
              },
            ),
            const Divider(),
            Expanded(
              child: ListView.builder(
                controller: scrollController,
                itemCount: months.length,
                itemBuilder: (context, index) {
                  final date = months[index];
                  final label = DateFormat.yMMMM().format(date);
                  return ListTile(
                    title: Text(label),
                    onTap: () {
                      final lastDay = DateTime(date.year, date.month + 1, 0);
                      Navigator.pop(
                          context,
                          DateTimeRange(
                              start: date,
                              end: lastDay.isAfter(now) ? now : lastDay));
                    },
                  );
                },
              ),
            ),
          ],
        ),
      ),
    );

    if (result is DateTimeRange) return result;
    return null;
  }

  Future<DateTimeRange?> _showMonthRangePicker(BuildContext context,
      AppLocalizations l10n, List<DateTime> months) async {
    final now = DateTime.now();

    DateTime? startMonth;
    DateTime? endMonth;

    return await showDialog<DateTimeRange>(
      context: context,
      builder: (context) => StatefulBuilder(builder: (context, setState) {
        return AlertDialog(
          title: Text(l10n.selectMonthRange),
          content: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              DropdownButtonFormField<DateTime>(
                decoration: InputDecoration(labelText: l10n.selectStartMonth),
                initialValue: startMonth,
                items: months
                    .map((m) => DropdownMenuItem(
                        value: m, child: Text(DateFormat.yMMMM().format(m))))
                    .toList(),
                onChanged: (v) => setState(() => startMonth = v),
              ),
              const SizedBox(height: 16),
              DropdownButtonFormField<DateTime>(
                decoration: InputDecoration(labelText: l10n.selectEndMonth),
                initialValue: endMonth,
                items: months
                    .map((m) => DropdownMenuItem(
                        value: m, child: Text(DateFormat.yMMMM().format(m))))
                    .toList(),
                onChanged: (v) => setState(() => endMonth = v),
              ),
            ],
          ),
          actions: [
            TextButton(
                onPressed: () => Navigator.pop(context),
                child: Text(l10n.cancel)),
            TextButton(
              onPressed: (startMonth == null || endMonth == null)
                  ? null
                  : () {
                      final s = startMonth!.isBefore(endMonth!)
                          ? startMonth!
                          : endMonth!;
                      final e = startMonth!.isAfter(endMonth!)
                          ? startMonth!
                          : endMonth!;
                      final lastDayOfE = DateTime(e.year, e.month + 1, 0);
                      Navigator.pop(
                        context,
                        DateTimeRange(
                          start: s,
                          end: lastDayOfE.isAfter(now) ? now : lastDayOfE,
                        ),
                      );
                    },
              child: Text(l10n.ok),
            ),
          ],
        );
      }),
    );
  }

  List<BarChartGroupData> _generateWeeklyData(
      List<VitDLog> logs,
      Map<String, double> overflowMap,
      int weekOffset,
      Map<String, double> spilloverProjections) {
    List<BarChartGroupData> groups = [];
    final shiftedNow = DateTime.now().add(Duration(days: weekOffset * 7));
    final weekStart = shiftedNow
        .subtract(Duration(days: shiftedNow.weekday - DateTime.monday));
    final logsByDate = {for (final log in logs) log.date: log};

    for (int index = 0; index < 7; index++) {
      final date = weekStart.add(Duration(days: index));
      final dateStr = date.toIso8601String().split('T')[0];

      final log = logsByDate[dateStr] ?? VitDLog(date: dateStr, iu: 0);

      double sunVal = log.sunIu;
      double suppVal = log.supplementIu;
      // Combine stored spillover with calculated overflow (one or the other will be non-zero due to provider logic)
      double overflowVal = (overflowMap[dateStr] ?? 0) + log.spilloverIu;

      // If date is in the future relative to today, use projections
      final todayStr = DateTime.now().toIso8601String().split('T')[0];
      if (dateStr.compareTo(todayStr) > 0) {
        // Projected data
        double projectedVal = spilloverProjections[dateStr] ?? 0;
        groups.add(BarChartGroupData(
          x: index,
          barRods: [
            BarChartRodData(
              toY: projectedVal,
              color: Colors.teal.withValues(alpha: 0.3),
              width: 16,
              borderRadius: BorderRadius.circular(4),
              borderSide: const BorderSide(color: Colors.teal, width: 1),
            )
          ],
        ));
      } else {
        // Historical data
        final isToday = dateStr == todayStr;
        groups.add(BarChartGroupData(
          x: index,
          barRods: [
            BarChartRodData(
              toY: sunVal + suppVal + overflowVal,
              rodStackItems: [
                BarChartRodStackItem(0, sunVal, AppTheme.primary),
                BarChartRodStackItem(
                    sunVal, sunVal + suppVal, Colors.grey.shade400),
                BarChartRodStackItem(sunVal + suppVal,
                    sunVal + suppVal + overflowVal, Colors.teal),
              ],
              width: isToday ? 18 : 16,
              borderRadius: BorderRadius.circular(4),
              borderSide: isToday
                  ? const BorderSide(color: Colors.indigoAccent, width: 1.5)
                  : BorderSide.none,
            )
          ],
        ));
      }
    }
    return groups;
  }

  List<BarChartGroupData> _generateMonthlyData(
      List<VitDLog> logs,
      Map<String, double> overflowMap,
      int monthOffset,
      Map<String, double> spilloverProjections) {
    List<BarChartGroupData> groups = [];
    final now = DateTime.now();
    final targetDate = DateTime(now.year, now.month + monthOffset, 1);
    final daysInMonth = DateTime(targetDate.year, targetDate.month + 1, 0).day;
    final logsByDate = {for (final log in logs) log.date: log};

    for (int i = 1; i <= daysInMonth; i++) {
      final dateStr =
          "${targetDate.year}-${targetDate.month.toString().padLeft(2, '0')}-${i.toString().padLeft(2, '0')}";
      final log = logsByDate[dateStr] ?? VitDLog(date: dateStr, iu: 0);

      double sunVal = log.sunIu;
      double suppVal = log.supplementIu;
      double overflowVal = (overflowMap[dateStr] ?? 0) + log.spilloverIu;

      final todayStr = DateTime.now().toIso8601String().split('T')[0];
      if (dateStr.compareTo(todayStr) > 0) {
        double projectedVal = spilloverProjections[dateStr] ?? 0;
        groups.add(BarChartGroupData(
          x: i - 1,
          barRods: [
            BarChartRodData(
              toY: projectedVal,
              color: Colors.teal.withValues(alpha: 0.3),
              width: 4,
              borderRadius: BorderRadius.circular(1),
              borderSide: const BorderSide(color: Colors.teal, width: 0.5),
            )
          ],
        ));
      } else {
        final isToday = dateStr == todayStr;
        groups.add(BarChartGroupData(
          x: i - 1,
          barRods: [
            BarChartRodData(
              toY: sunVal + suppVal + overflowVal,
              rodStackItems: [
                BarChartRodStackItem(0, sunVal, AppTheme.primary),
                BarChartRodStackItem(
                    sunVal, sunVal + suppVal, Colors.grey.shade400),
                BarChartRodStackItem(sunVal + suppVal,
                    sunVal + suppVal + overflowVal, Colors.teal),
              ],
              width: isToday ? 6 : 4,
              borderRadius: BorderRadius.circular(1),
              borderSide: isToday
                  ? const BorderSide(color: Colors.indigoAccent, width: 1)
                  : BorderSide.none,
            )
          ],
        ));
      }
    }
    return groups;
  }

  List<BarChartGroupData> _generateYearlyData(
      List<VitDLog> history, int yearOffset) {
    final now = DateTime.now();
    final targetYear = now.year + yearOffset;

    final List<double> sunData = [];
    final List<double> suppData = [];
    final List<double> overflowData = [];

    for (int targetMonth = 1; targetMonth <= 12; targetMonth++) {
      String monthPrefix =
          "$targetYear-${targetMonth.toString().padLeft(2, '0')}";

      List<VitDLog> monthLogs =
          history.where((l) => l.date.startsWith(monthPrefix)).toList();
      double mSun = monthLogs.fold(0.0, (p, c) => p + c.sunIu);
      double mSupp = monthLogs.fold(0.0, (p, c) => p + c.supplementIu);
      double mSpill = monthLogs.fold(0.0, (p, c) => p + c.spilloverIu);

      sunData.add(mSun);
      suppData.add(mSupp);
      overflowData.add(mSpill);
    }

    return List.generate(12, (i) {
      final sunVal = sunData[i];
      final suppVal = suppData[i];
      final overflowVal = overflowData[i];
      final total = sunVal + suppVal + overflowVal;

      return BarChartGroupData(
        x: i,
        barRods: [
          BarChartRodData(
            toY: total,
            width: 16,
            color: Colors.transparent,
            rodStackItems: [
              BarChartRodStackItem(0, sunVal, AppTheme.primary),
              BarChartRodStackItem(
                  sunVal, sunVal + suppVal, Colors.grey.shade400),
              BarChartRodStackItem(sunVal + suppVal, total, Colors.teal),
            ],
            borderRadius: BorderRadius.circular(4),
          )
        ],
      );
    });
  }

  void _showFilterOptions(BuildContext context, VitDProvider vm) {
    final l10n = AppLocalizations.of(context)!;

    showModalBottomSheet(
      context: context,
      shape: const RoundedRectangleBorder(
        borderRadius: BorderRadius.vertical(top: Radius.circular(20)),
      ),
      builder: (context) {
        return StatefulBuilder(
          builder: (context, setModalState) {
            return SafeArea(
              child: Padding(
                padding: const EdgeInsets.symmetric(vertical: 20),
                child: Column(
                  mainAxisSize: MainAxisSize.min,
                  children: [
                    Padding(
                      padding: const EdgeInsets.symmetric(horizontal: 16),
                      child: Row(
                        mainAxisAlignment: MainAxisAlignment.spaceBetween,
                        children: [
                          Text(
                            l10n.filters,
                            style: const TextStyle(
                                fontWeight: FontWeight.bold, fontSize: 18),
                          ),
                          if (_activeFilters.isNotEmpty)
                            TextButton(
                              onPressed: () {
                                setState(() => _activeFilters.clear());
                                setModalState(() {});
                                Navigator.pop(context);
                              },
                              child: Text(l10n.clearFilters),
                            ),
                        ],
                      ),
                    ),
                    const Divider(),
                    _filterTile(
                      l10n.hideZeroIu,
                      _activeFilters.contains('hideZero'),
                      (val) {
                        setState(() {
                          if (val!) {
                            _activeFilters.add('hideZero');
                          } else {
                            _activeFilters.remove('hideZero');
                          }
                        });
                        setModalState(() {});
                      },
                    ),
                    _filterTile(
                      l10n.hideSunEntry,
                      _activeFilters.contains('hideSun'),
                      (val) {
                        setState(() {
                          if (val!) {
                            _activeFilters.add('hideSun');
                          } else {
                            _activeFilters.remove('hideSun');
                          }
                        });
                        setModalState(() {});
                      },
                    ),
                    _filterTile(
                      l10n.hideSupplementEntry,
                      _activeFilters.contains('hideSupp'),
                      (val) {
                        setState(() {
                          if (val!) {
                            _activeFilters.add('hideSupp');
                          } else {
                            _activeFilters.remove('hideSupp');
                          }
                        });
                        setModalState(() {});
                      },
                    ),
                    _filterTile(
                      l10n.hideSpilloverEntry,
                      _activeFilters.contains('hideSpill'),
                      (val) {
                        setState(() {
                          if (val!) {
                            _activeFilters.add('hideSpill');
                          } else {
                            _activeFilters.remove('hideSpill');
                          }
                        });
                        setModalState(() {});
                      },
                    ),
                  ],
                ),
              ),
            );
          },
        );
      },
    );
  }

  Widget _filterTile(String title, bool value, ValueChanged<bool?> onChanged) {
    return CheckboxListTile(
      title: Text(title),
      value: value,
      onChanged: onChanged,
      controlAffinity: ListTileControlAffinity.trailing,
      activeColor: AppTheme.primary,
    );
  }
}
