import 'package:flutter/material.dart';
import 'package:provider/provider.dart';

import '../domain/vitd_validation.dart';
import '../l10n/gen_l10n/app_localizations.dart';
import '../models/app_theme.dart';
import '../providers/vitd_provider.dart';

class ExposureScreen extends StatefulWidget {
  const ExposureScreen({
    super.key,
    this.date,
    this.initialUvIndex,
    this.initialIu,
    this.initialMinutes,
    this.initialStart,
    this.initialEnd,
    this.isEditing = false,
    this.entryId,
  });

  final DateTime? date;
  final double? initialUvIndex;
  final double? initialIu;
  final int? initialMinutes;
  final DateTime? initialStart;
  final DateTime? initialEnd;
  final bool isEditing;
  final String? entryId;

  @override
  State<ExposureScreen> createState() => _ExposureScreenState();
}

class _ExposureScreenState extends State<ExposureScreen> {
  double _mins = 15;
  double _cloudFactor = 1.0;
  final TextEditingController _controller = TextEditingController();
  final FocusNode _focusNode = FocusNode();
  bool _isHours = false;
  bool _isSaving = false;
  bool _intervalChanged = false;
  bool _weatherChanged = false;
  late TimeOfDay _startTime;
  late TimeOfDay _endTime;

  DateTime get _date {
    final source = widget.date ?? DateTime.now();
    return DateTime(source.year, source.month, source.day);
  }

  DateTime _onSelectedDate(TimeOfDay time) => DateTime(
        _date.year,
        _date.month,
        _date.day,
        time.hour,
        time.minute,
      );

  DateTime get _start => _onSelectedDate(_startTime);
  DateTime get _end => _onSelectedDate(_endTime);

  @override
  void initState() {
    super.initState();

    final now = DateTime.now();
    final initialEnd = widget.initialEnd ??
        DateTime(
          _date.year,
          _date.month,
          _date.day,
          now.hour,
          now.minute,
        );
    final requestedMinutes = widget.initialMinutes ?? 15;
    var initialStart = widget.initialStart ??
        initialEnd.subtract(Duration(minutes: requestedMinutes));
    if (initialStart.isBefore(_date)) initialStart = _date;

    _startTime = TimeOfDay.fromDateTime(initialStart);
    _endTime = TimeOfDay.fromDateTime(initialEnd);
    _syncDurationFromTimes(updateController: true);

    _focusNode.addListener(() {
      if (_focusNode.hasFocus && _controller.text == '15') {
        _controller.clear();
      }
    });

    WidgetsBinding.instance.addPostFrameCallback((_) async {
      if (!mounted) return;
      final provider = context.read<VitDProvider>();

      if (!widget.isEditing) {
        final cloudiness = provider.cloudiness;
        setState(() {
          if (cloudiness < 30) {
            _cloudFactor = 1.0;
          } else if (cloudiness < 70) {
            _cloudFactor = 0.8;
          } else {
            _cloudFactor = 0.5;
          }
        });
      }

      if (widget.isEditing && widget.entryId != null) {
        final dateKey = _date.toIso8601String().split('T')[0];
        final entries = await provider.getTrackingEntriesForDate(dateKey);
        if (!mounted) return;
        final targetId = int.tryParse(widget.entryId!);
        for (final entry in entries) {
          if (entry.id != targetId || entry.entryType != 'sun') continue;
          final storedStart = DateTime.tryParse(entry.createdAt)?.toLocal();
          if (storedStart == null) break;
          final storedEnd = storedStart.add(Duration(minutes: entry.sunMinutes));
          setState(() {
            _startTime = TimeOfDay.fromDateTime(storedStart);
            _endTime = TimeOfDay.fromDateTime(storedEnd);
            _syncDurationFromTimes(updateController: true);
          });
          break;
        }
      }
    });
  }

  @override
  void dispose() {
    _controller.dispose();
    _focusNode.dispose();
    super.dispose();
  }

  void _syncDurationFromTimes({bool updateController = false}) {
    _mins = _end.isAfter(_start)
        ? _end.difference(_start).inMinutes.toDouble()
        : 0;
    if (updateController) _syncController();
  }

  void _syncController() {
    if (_isHours) {
      _controller.text =
          (_mins / 60.0).toStringAsFixed(1).replaceFirst(RegExp(r'\.0$'), '');
    } else {
      _controller.text = _mins.round().toString();
    }
  }

  void _setDuration(
    double minutes, {
    bool updateController = true,
    bool markChanged = true,
  }) {
    final safeMinutes = minutes.clamp(0.0, 1439.0).toDouble();
    var start = _end.subtract(Duration(minutes: safeMinutes.round()));
    if (start.isBefore(_date)) start = _date;

    setState(() {
      if (markChanged) _intervalChanged = true;
      _startTime = TimeOfDay.fromDateTime(start);
      _syncDurationFromTimes(updateController: updateController);
    });
  }

  void _updateFromController(String value) {
    if (value.isEmpty) {
      setState(() {
        _mins = 0;
        _intervalChanged = true;
      });
      return;
    }
    final parsed = double.tryParse(value.replaceFirst(',', '.'));
    if (parsed == null) return;
    final requestedMinutes = _isHours ? parsed * 60 : parsed;
    _setDuration(
      requestedMinutes,
      updateController: requestedMinutes < 0 || requestedMinutes > 1439,
    );
  }

  void _toggleUnit(bool toHours) {
    if (_isHours == toHours) return;
    setState(() {
      _isHours = toHours;
      _syncController();
    });
  }

  Future<void> _pickTime({required bool start}) async {
    final selected = await showTimePicker(
      context: context,
      initialTime: start ? _startTime : _endTime,
    );
    if (selected == null || !mounted) return;

    setState(() {
      _intervalChanged = true;
      if (start) {
        _startTime = selected;
        if (!_end.isAfter(_start)) {
          final dayEnd = _date.add(const Duration(days: 1, minutes: -1));
          var adjustedEnd = _start.add(const Duration(minutes: 15));
          if (adjustedEnd.isAfter(dayEnd)) {
            adjustedEnd = dayEnd;
            final adjustedStart = dayEnd.subtract(const Duration(minutes: 15));
            _startTime = TimeOfDay.fromDateTime(adjustedStart);
          }
          _endTime = TimeOfDay.fromDateTime(adjustedEnd);
        }
      } else {
        _endTime = selected;
        if (!_end.isAfter(_start)) {
          var adjustedStart = _end.subtract(const Duration(minutes: 15));
          if (adjustedStart.isBefore(_date)) adjustedStart = _date;
          _startTime = TimeOfDay.fromDateTime(adjustedStart);
        }
      }
      _syncDurationFromTimes(updateController: true);
    });
  }

  Future<void> _saveExposure() async {
    final l10n = AppLocalizations.of(context)!;
    if (_isSaving ||
        !_end.isAfter(_start) ||
        !VitDValidation.isValidExposureMinutes(_mins)) {
      ScaffoldMessenger.of(context).showSnackBar(
        SnackBar(
          content: Text(l10n.pleaseEnterValidAmount),
          backgroundColor: Colors.red,
        ),
      );
      return;
    }

    setState(() => _isSaving = true);
    try {
      final provider = context.read<VitDProvider>();
      if (widget.isEditing && widget.entryId != null) {
        final produced = !_intervalChanged &&
                !_weatherChanged &&
                widget.initialIu != null
            ? widget.initialIu!
            : provider.calculateIUForInterval(
                _start,
                _end,
                cloudFactor: _cloudFactor,
              );
        await provider.updateTrackingEntryById(
          int.parse(widget.entryId!),
          iu: produced,
          sunMinutes: _end.difference(_start).inMinutes,
          date: _date.toIso8601String().split('T')[0],
          createdAt: _start,
        );
      } else {
        await provider.updateExposureInterval(
          _start,
          _end,
          cloudFactor: _cloudFactor,
        );
      }
      if (mounted) Navigator.pop(context);
    } finally {
      if (mounted) setState(() => _isSaving = false);
    }
  }

  @override
  Widget build(BuildContext context) {
    final l10n = AppLocalizations.of(context)!;
    final provider = context.watch<VitDProvider>();
    final averageUv = provider.averageUvForInterval(
      _start,
      _end,
      cloudFactor: _cloudFactor,
    );

    return Container(
      height: MediaQuery.of(context).size.height * 0.9,
      decoration: BoxDecoration(
        color: Theme.of(context).scaffoldBackgroundColor,
        borderRadius: const BorderRadius.vertical(top: Radius.circular(32)),
      ),
      child: Column(
        children: [
          Center(
            child: Container(
              margin: const EdgeInsets.only(top: 12),
              width: 40,
              height: 4,
              decoration: BoxDecoration(
                color: Colors.grey.withValues(alpha: 0.3),
                borderRadius: BorderRadius.circular(2),
              ),
            ),
          ),
          Padding(
            padding: const EdgeInsets.all(16),
            child: Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: [
                IconButton(
                  onPressed: () => Navigator.pop(context),
                  icon: const Icon(Icons.close),
                ),
                Text(
                  l10n.logSunExposure,
                  style: const TextStyle(
                    fontSize: 18,
                    fontWeight: FontWeight.bold,
                  ),
                ),
                TextButton(
                  onPressed: _isSaving ? null : _saveExposure,
                  child: Text(
                    l10n.save,
                    style: const TextStyle(
                      color: AppTheme.primary,
                      fontWeight: FontWeight.bold,
                    ),
                  ),
                ),
              ],
            ),
          ),
          Expanded(
            child: SingleChildScrollView(
              physics: const BouncingScrollPhysics(),
              padding: const EdgeInsets.symmetric(horizontal: 24),
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.stretch,
                children: [
                  Text(
                    l10n.time,
                    style: const TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.grey,
                    ),
                  ),
                  const SizedBox(height: 10),
                  Row(
                    children: [
                      Expanded(
                        child: _timeButton(
                          icon: Icons.play_arrow_rounded,
                          time: _startTime,
                          onTap: () => _pickTime(start: true),
                        ),
                      ),
                      const Padding(
                        padding: EdgeInsets.symmetric(horizontal: 10),
                        child: Icon(Icons.arrow_forward, color: Colors.grey),
                      ),
                      Expanded(
                        child: _timeButton(
                          icon: Icons.stop_rounded,
                          time: _endTime,
                          onTap: () => _pickTime(start: false),
                        ),
                      ),
                    ],
                  ),
                  const SizedBox(height: 16),
                  Container(
                    padding: const EdgeInsets.all(14),
                    decoration: BoxDecoration(
                      color: Theme.of(context).cardColor,
                      borderRadius: BorderRadius.circular(16),
                    ),
                    child: Row(
                      children: [
                        const Icon(
                          Icons.wb_sunny_outlined,
                          color: AppTheme.primary,
                          size: 28,
                        ),
                        const SizedBox(width: 12),
                        Expanded(
                          child: Column(
                            crossAxisAlignment: CrossAxisAlignment.start,
                            children: [
                              Text(
                                '${_mins.round()} ${l10n.min}',
                                style: const TextStyle(
                                  fontSize: 22,
                                  fontWeight: FontWeight.bold,
                                ),
                              ),
                              Text(
                                provider.uvForecastIsEstimated
                                    ? l10n.uvIndexApprox
                                    : l10n.uvIndex,
                                style: const TextStyle(
                                  color: Colors.grey,
                                  fontSize: 12,
                                ),
                              ),
                            ],
                          ),
                        ),
                        Column(
                          crossAxisAlignment: CrossAxisAlignment.end,
                          children: [
                            Text(
                              l10n.uvIndex,
                              style: const TextStyle(
                                color: Colors.grey,
                                fontSize: 12,
                              ),
                            ),
                            Text(
                              averageUv.toStringAsFixed(1),
                              style: const TextStyle(
                                fontSize: 22,
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                          ],
                        ),
                      ],
                    ),
                  ),
                  const SizedBox(height: 16),
                  _buildDurationInput(l10n),
                  const SizedBox(height: 4),
                  Text(
                    l10n.timeSpentOutdoors,
                    textAlign: TextAlign.center,
                    style: const TextStyle(
                      fontWeight: FontWeight.bold,
                      color: Colors.grey,
                    ),
                  ),
                  const SizedBox(height: 10),
                  SliderTheme(
                    data: SliderTheme.of(context).copyWith(
                      activeTrackColor: AppTheme.primary,
                      inactiveTrackColor: Colors.grey.shade200,
                      thumbColor: AppTheme.primary,
                      trackHeight: 6,
                      thumbShape: const RoundSliderThumbShape(
                        enabledThumbRadius: 14,
                      ),
                    ),
                    child: Slider(
                      value: _mins.clamp(1.0, 120.0),
                      min: 1,
                      max: 120,
                      onChanged: (value) => _setDuration(value),
                    ),
                  ),
                  Row(
                    mainAxisAlignment: MainAxisAlignment.spaceBetween,
                    children: [
                      Text(l10n.zeroMin),
                      Text(l10n.thirtyMin),
                      Text(l10n.oneHour),
                      Text(l10n.twoHoursPlus),
                    ],
                  ),
                  const SizedBox(height: 18),
                  Text(
                    l10n.weatherCondition,
                    style: const TextStyle(fontWeight: FontWeight.bold),
                  ),
                  const SizedBox(height: 10),
                  Row(
                    children: [
                      _weatherConditionButton(
                        l10n.weatherClear,
                        Icons.wb_sunny,
                        1.0,
                      ),
                      const SizedBox(width: 8),
                      _weatherConditionButton(
                        l10n.weatherPartlyCloudy,
                        Icons.wb_cloudy,
                        0.8,
                      ),
                      const SizedBox(width: 8),
                      _weatherConditionButton(
                        l10n.weatherCloudy,
                        Icons.cloud_queue,
                        0.5,
                      ),
                    ],
                  ),
                  const SizedBox(height: 18),
                  Text(
                    l10n.quickAdd,
                    style: const TextStyle(fontWeight: FontWeight.bold),
                  ),
                  const SizedBox(height: 10),
                  Row(
                    children: [
                      _quickAddButton(10),
                      const SizedBox(width: 10),
                      _quickAddButton(30),
                      const SizedBox(width: 10),
                      _quickAddButton(60),
                    ],
                  ),
                  const SizedBox(height: 24),
                  SizedBox(
                    height: 56,
                    child: ElevatedButton(
                      onPressed: _isSaving ? null : _saveExposure,
                      style: ElevatedButton.styleFrom(
                        backgroundColor: AppTheme.primary,
                        foregroundColor: Colors.black,
                        shape: RoundedRectangleBorder(
                          borderRadius: BorderRadius.circular(16),
                        ),
                        elevation: 0,
                      ),
                      child: _isSaving
                          ? const SizedBox.square(
                              dimension: 22,
                              child: CircularProgressIndicator(
                                strokeWidth: 2,
                                color: Colors.black,
                              ),
                            )
                          : Text(
                              widget.isEditing
                                  ? l10n.save
                                  : l10n.logExposureActivity,
                              style: const TextStyle(
                                fontSize: 18,
                                fontWeight: FontWeight.bold,
                              ),
                            ),
                    ),
                  ),
                  const SizedBox(height: 32),
                ],
              ),
            ),
          ),
        ],
      ),
    );
  }

  Widget _buildDurationInput(AppLocalizations l10n) {
    return Row(
      mainAxisAlignment: MainAxisAlignment.center,
      children: [
        SizedBox(
          width: 110,
          child: TextField(
            controller: _controller,
            focusNode: _focusNode,
            keyboardType: const TextInputType.numberWithOptions(decimal: true),
            textAlign: TextAlign.center,
            style: const TextStyle(
              fontSize: 42,
              fontWeight: FontWeight.w800,
            ),
            decoration: const InputDecoration(
              contentPadding: EdgeInsets.symmetric(vertical: 4),
              isDense: true,
              border: UnderlineInputBorder(
                borderSide: BorderSide(color: Colors.grey, width: 1.5),
              ),
              focusedBorder: UnderlineInputBorder(
                borderSide: BorderSide(color: AppTheme.primary, width: 2.5),
              ),
              hintText: '0',
            ),
            onChanged: _updateFromController,
          ),
        ),
        const SizedBox(width: 14),
        Container(
          height: 38,
          padding: const EdgeInsets.all(3),
          decoration: BoxDecoration(
            color: Theme.of(context).brightness == Brightness.light
                ? const Color(0xFFE8E6DE)
                : const Color(0xFF2D291B),
            borderRadius: BorderRadius.circular(10),
          ),
          child: Row(
            mainAxisSize: MainAxisSize.min,
            children: [
              _unitToggleButton(l10n.min, isHours: false),
              _unitToggleButton(l10n.hours, isHours: true),
            ],
          ),
        ),
      ],
    );
  }

  Widget _unitToggleButton(String label, {required bool isHours}) {
    final selected = _isHours == isHours;
    return GestureDetector(
      onTap: () => _toggleUnit(isHours),
      child: AnimatedContainer(
        duration: const Duration(milliseconds: 150),
        padding: const EdgeInsets.symmetric(horizontal: 10, vertical: 6),
        decoration: BoxDecoration(
          color: selected ? AppTheme.primary : Colors.transparent,
          borderRadius: BorderRadius.circular(8),
        ),
        alignment: Alignment.center,
        child: Text(
          label,
          style: TextStyle(
            color: selected
                ? Colors.black
                : (Theme.of(context).brightness == Brightness.light
                    ? Colors.grey.shade600
                    : Colors.grey.shade400),
            fontWeight: FontWeight.bold,
            fontSize: 12,
          ),
        ),
      ),
    );
  }

  Widget _timeButton({
    required IconData icon,
    required TimeOfDay time,
    required VoidCallback onTap,
  }) {
    return InkWell(
      onTap: onTap,
      borderRadius: BorderRadius.circular(16),
      child: Container(
        padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 14),
        decoration: BoxDecoration(
          color: Theme.of(context).cardColor,
          borderRadius: BorderRadius.circular(16),
          border: Border.all(color: AppTheme.primary.withValues(alpha: 0.3)),
        ),
        child: Row(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
            Icon(icon, color: AppTheme.primary, size: 20),
            const SizedBox(width: 6),
            Flexible(
              child: Text(
                MaterialLocalizations.of(context).formatTimeOfDay(time),
                overflow: TextOverflow.ellipsis,
                style: const TextStyle(
                  fontSize: 18,
                  fontWeight: FontWeight.bold,
                ),
              ),
            ),
          ],
        ),
      ),
    );
  }

  Widget _quickAddButton(int minutes) {
    return Expanded(
      child: OutlinedButton(
        onPressed: () => _setDuration(minutes.toDouble()),
        style: OutlinedButton.styleFrom(
          padding: const EdgeInsets.symmetric(vertical: 12),
          side: BorderSide(color: Colors.grey.shade300),
          shape: RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(12),
          ),
        ),
        child: Text(
          '+${minutes}m',
          style: const TextStyle(fontWeight: FontWeight.bold),
        ),
      ),
    );
  }

  Widget _weatherConditionButton(
    String label,
    IconData icon,
    double factor,
  ) {
    final selected = _cloudFactor == factor;
    return Expanded(
      child: InkWell(
        onTap: () => setState(() {
          _cloudFactor = factor;
          _weatherChanged = true;
        }),
        borderRadius: BorderRadius.circular(12),
        child: Container(
          padding: const EdgeInsets.symmetric(vertical: 9),
          decoration: BoxDecoration(
            color: selected
                ? AppTheme.primary.withValues(alpha: 0.1)
                : Colors.transparent,
            border: Border.all(
              color: selected ? AppTheme.primary : Colors.grey.shade300,
              width: selected ? 2 : 1,
            ),
            borderRadius: BorderRadius.circular(12),
          ),
          child: Column(
            children: [
              Icon(
                icon,
                color: selected ? AppTheme.primary : Colors.grey.shade600,
              ),
              const SizedBox(height: 4),
              Text(
                label,
                textAlign: TextAlign.center,
                style: TextStyle(
                  fontSize: 11,
                  fontWeight: selected ? FontWeight.bold : FontWeight.normal,
                  color: selected ? AppTheme.primary : Colors.grey.shade600,
                ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}
