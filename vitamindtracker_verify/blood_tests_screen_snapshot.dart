import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'package:shared_preferences/shared_preferences.dart';

import '../domain/blood_concentration_unit.dart';
import '../domain/serum_25ohd_projection.dart';
import '../domain/vitd_validation.dart';
import '../l10n/gen_l10n/app_localizations.dart';
import '../models/app_theme.dart';
import '../providers/vitd_provider.dart';
import 'blood_test_science_screen.dart';

class BloodTestsScreen extends StatefulWidget {
  const BloodTestsScreen({super.key});

  @override
  State<BloodTestsScreen> createState() => _BloodTestsScreenState();
}

class _BloodTestsScreenState extends State<BloodTestsScreen> {
  static const _unitPreferenceKey = 'blood_concentration_unit';
  BloodConcentrationUnit _unit = BloodConcentrationUnit.ngMl;

  @override
  void initState() {
    super.initState();
    _loadUnitPreference();
  }

  Future<void> _loadUnitPreference() async {
    final prefs = await SharedPreferences.getInstance();
    final unit = BloodConcentrationUnitX.fromStorage(
      prefs.getString(_unitPreferenceKey),
    );
    if (!mounted) return;
    setState(() => _unit = unit);
  }

  Future<void> _setUnit(BloodConcentrationUnit unit) async {
    if (_unit == unit) return;
    setState(() => _unit = unit);
    final prefs = await SharedPreferences.getInstance();
    await prefs.setString(_unitPreferenceKey, unit.label);
  }

  @override
  Widget build(BuildContext context) {
    final l10n = AppLocalizations.of(context)!;
    return Consumer<VitDProvider>(
      builder: (context, vm, _) {
        return Scaffold(
          appBar: AppBar(
            title: Text(l10n.bloodTestLog),
            actions: [
              IconButton(
                tooltip: l10n.bloodTestLearnTooltip,
                icon: const Icon(Icons.school),
                onPressed: () {
                  Navigator.of(context).push(
                    MaterialPageRoute(
                      builder: (_) => const BloodTestScienceScreen(),
                    ),
                  );
                },
              ),
            ],
          ),
          body: _buildBody(context, vm, l10n),
          floatingActionButton: FloatingActionButton.extended(
            heroTag: null,
            backgroundColor: AppTheme.primary,
            foregroundColor: Colors.black,
            onPressed: () => _showBloodTestDialog(context, vm, DateTime.now()),
            icon: const Icon(Icons.add),
            label: Text(l10n.addBloodTest),
          ),
        );
      },
    );
  }

  Widget _buildBody(
    BuildContext context,
    VitDProvider vm,
    AppLocalizations l10n,
  ) {
    final visibleBloodTests = vm.bloodTests;
    final estimate = vm.iuBloodResponseEstimate;
    return ListView(
      padding: const EdgeInsets.all(16),
      children: [
        Card(
          child: Padding(
            padding: const EdgeInsets.symmetric(horizontal: 12, vertical: 10),
            child: Column(
              crossAxisAlignment: CrossAxisAlignment.start,
              children: [
                Row(
                  children: [
                    const Icon(Icons.straighten, color: AppTheme.primary),
                    const SizedBox(width: 10),
                    Text(
                      l10n.unit,
                      style: Theme.of(context).textTheme.titleSmall?.copyWith(
                            fontWeight: FontWeight.w700,
                          ),
                    ),
                  ],
                ),
                const SizedBox(height: 10),
                SizedBox(
                  width: double.infinity,
                  child: SegmentedButton<BloodConcentrationUnit>(
                    showSelectedIcon: false,
                    segments: const [
                      ButtonSegment(
                        value: BloodConcentrationUnit.ngMl,
                        label: Text('ng/mL'),
                      ),
                      ButtonSegment(
                        value: BloodConcentrationUnit.nmolL,
                        label: Text('nmol/L'),
                      ),
                    ],
                    selected: {_unit},
                    onSelectionChanged: (selected) {
                      if (selected.isNotEmpty) _setUnit(selected.first);
                    },
                  ),
                ),
              ],
            ),
          ),
        ),
        const SizedBox(height: 12),
        if (estimate != null)
          _BloodProjectionCard(projection: estimate, unit: _unit)
        else
          const _ProjectionUnavailableCard(),
        const SizedBox(height: 16),
        Text(
          l10n.history,
          style: Theme.of(context).textTheme.titleMedium?.copyWith(
                fontWeight: FontWeight.w700,
              ),
        ),
        const SizedBox(height: 8),
        if (visibleBloodTests.isEmpty)
          Card(
            child: Padding(
              padding: const EdgeInsets.all(16),
              child: Text(l10n.noLogs),
            ),
          )
        else
          ...visibleBloodTests.map((entry) {
            final date =
                entry.dateTime.toLocal().toIso8601String().split('T')[0];
            final referenceStatus = _statusForBand(
              Serum25OhdProjector.classifyMeasurement(entry.valueNgMl),
              _unit,
            );
            return Padding(
              padding: const EdgeInsets.only(bottom: 8),
              child: Card(
                child: ListTile(
                  leading: const Icon(Icons.bloodtype, color: AppTheme.primary),
                  title: Text(_unit.formatFromNgMl(entry.valueNgMl)),
                  subtitle: Column(
                    crossAxisAlignment: CrossAxisAlignment.start,
                    mainAxisSize: MainAxisSize.min,
                    children: [
                      Text(date),
                      const SizedBox(height: 4),
                      _ReferenceBandChip(status: referenceStatus),
                    ],
                  ),
                  trailing: IconButton(
                    tooltip: l10n.delete,
                    icon: const Icon(Icons.delete_outline),
                    onPressed: () => vm.deleteBloodTest(entry.id!),
                  ),
                ),
              ),
            );
          }),
      ],
    );
  }

  void _showBloodTestDialog(
      BuildContext context, VitDProvider vm, DateTime defaultDate) async {
    final l10n = AppLocalizations.of(context)!;
    String selectedUnit = _unit.label;
    final valueController = TextEditingController();
    DateTime selectedDate = defaultDate;
    String? errorText;
    try {
      await showDialog(
        context: context,
        builder: (context) {
          return StatefulBuilder(
            builder: (context, setState) {
              return AlertDialog(
                insetPadding:
                    const EdgeInsets.symmetric(horizontal: 16, vertical: 24),
                title: Text(l10n.logBloodTest),
                content: SizedBox(
                  width: MediaQuery.of(context).size.width,
                  child: Column(
                    mainAxisSize: MainAxisSize.min,
                    children: [
                      ListTile(
                        contentPadding: EdgeInsets.zero,
                        title: Text(l10n.bloodTestDate),
                        subtitle:
                            Text('${selectedDate.toLocal()}'.split(' ')[0]),
                        trailing: const Icon(Icons.calendar_today),
                        onTap: () async {
                          final picked = await showDatePicker(
                            context: context,
                            initialDate: selectedDate,
                            firstDate: DateTime(2000),
                            lastDate: DateTime.now(),
                          );
                          if (picked != null) setState(() => selectedDate = picked);
                        },
                      ),
                      Row(
                        children: [
                          Expanded(
                            child: TextField(
                              controller: valueController,
                              keyboardType:
                                  const TextInputType.numberWithOptions(
                                decimal: true,
                              ),
                              decoration: InputDecoration(
                                labelText: l10n.enterBloodTestValue,
                                errorText: errorText,
                              ),
                            ),
                          ),
                          const SizedBox(width: 16),
                          DropdownButton<String>(
                            value: selectedUnit,
                            items: BloodConcentrationUnit.values.map((unit) {
                              return DropdownMenuItem<String>(
                                value: unit.label,
                                child: Text(unit.label),
                              );
                            }).toList(),
                            onChanged: (newValue) {
                              if (newValue != null) {
                                setState(() => selectedUnit = newValue);
                              }
                            },
                          ),
                        ],
                      ),
                    ],
                  ),
                ),
                actions: [
                  TextButton(
                    onPressed: () => Navigator.pop(context),
                    child: Text(l10n.cancel),
                  ),
                  TextButton(
                    onPressed: () async {
                      final val = double.tryParse(
                        valueController.text.replaceFirst(',', '.'),
                      );
                      final selected =
                          BloodConcentrationUnitX.fromStorage(selectedUnit);
                      final standardValue =
                          val == null ? double.nan : selected.toNgMl(val);
                      if (!VitDValidation.isValidBloodLevelNgMl(
                          standardValue)) {
                        setState(() => errorText = l10n.pleaseEnterValidAmount);
                        return;
                      }
                      await vm.addBloodTest(
                        selectedDate,
                        val!,
                        selected.label,
                      );
                      if (context.mounted) Navigator.pop(context);
                    },
                    child: Text(l10n.save),
                  ),
                ],
              );
            },
          );
        },
      );
    } finally {
      valueController.dispose();
    }
  }
}

class _BloodProjectionCard extends StatelessWidget {
  const _BloodProjectionCard({
    required this.projection,
    required this.unit,
  });
  final Serum25OhdProjection projection;
  final BloodConcentrationUnit unit;

  @override
  Widget build(BuildContext context) {
    final low = unit.formatFromNgMl(projection.lowIncreaseNgMl);
    final high = unit.formatFromNgMl(projection.highIncreaseNgMl);
    final center = unit.formatFromNgMl(projection.centerIncreaseNgMl);
    return Semantics(
      container: true,
      label:
          'IU-only estimated steady-state 25-hydroxyvitamin D response, not a '
          'blood status. Study-derived increase $low to $high.',
      child: Card(
        child: Padding(
          padding: const EdgeInsets.all(16),
          child: Column(
            crossAxisAlignment: CrossAxisAlignment.start,
            children: [
              Row(
                children: [
                  const Icon(Icons.insights, color: AppTheme.primary),
                  const SizedBox(width: 8),
                  Expanded(
                    child: Text(
                      'Predicted 25(OH)D response from IU',
                      style: Theme.of(context).textTheme.titleMedium?.copyWith(
                            fontWeight: FontWeight.w700,
                          ),
                    ),
                  ),
                ],
              ),
              const SizedBox(height: 12),
              Text(
                '+$low to +$high',
                style: Theme.of(context).textTheme.headlineSmall?.copyWith(
                      fontWeight: FontWeight.w800,
                    ),
              ),
              Text(
                'Central response: +$center',
                style: Theme.of(context).textTheme.bodySmall,
              ),
              const SizedBox(height: 12),
              Text(
                'Based only on ${projection.trackedDays} days of entered IU: '
                '${projection.averageDailyIu.toStringAsFixed(0)} IU/day '
                'average across ${projection.loggedDays} logged days.',
                style: Theme.of(context).textTheme.bodyMedium?.copyWith(
                      fontWeight: FontWeight.w600,
                    ),
              ),
              const SizedBox(height: 8),
              Text(
                'Uses entered sun IU + supplement IU only. Spillover is '
                'excluded to avoid counting the same IU twice. No blood-test '
                'value or other personal input is used.',
                style: Theme.of(context).textTheme.bodySmall,
              ),
              const SizedBox(height: 6),
              Text(
                'IU alone cannot predict your absolute blood level or whether '
                'it is deficient, adequate, or high. This is the study-derived '
                'change expected if the average input is maintained; actual '
                'status requires a 25(OH)D blood test. It is not a diagnosis or '
                'dosing recommendation.',
                style: Theme.of(context).textTheme.bodySmall?.copyWith(
                      color: Theme.of(context).colorScheme.error,
                      fontWeight: FontWeight.w600,
                    ),
              ),
            ],
          ),
        ),
      ),
    );
  }
}

class _ProjectionUnavailableCard extends StatelessWidget {
  const _ProjectionUnavailableCard();
  @override
  Widget build(BuildContext context) {
    return Card(
      child: Padding(
        padding: const EdgeInsets.all(16),
        child: Row(
          crossAxisAlignment: CrossAxisAlignment.start,
          children: [
            const Icon(Icons.science_outlined, color: AppTheme.primary),
            const SizedBox(width: 12),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    'Predicted 25(OH)D response from IU',
                    style: Theme.of(context).textTheme.titleMedium?.copyWith(
                          fontWeight: FontWeight.w700,
                        ),
                  ),
                  const SizedBox(height: 4),
                  const Text(
                    'Enter sun or supplement IU to generate the response. '
                    'The rolling daily average must remain within the '
                    'study-supported 0–10,000 IU/day range.',
                  ),
                ],
              ),
            ),
          ],
        ),
      ),
    );
  }
}

class _ReferenceBandStatus {
  const _ReferenceBandStatus({required this.label, required this.color});
  final String label;
  final Color color;
}

class _ReferenceBandChip extends StatelessWidget {
  const _ReferenceBandChip({required this.status});
  final _ReferenceBandStatus status;
  @override
  Widget build(BuildContext context) {
    return Semantics(
      label: status.label,
      child: Container(
        padding: const EdgeInsets.symmetric(horizontal: 8, vertical: 3),
        decoration: BoxDecoration(
          color: status.color.withValues(alpha: 0.12),
          borderRadius: BorderRadius.circular(999),
          border: Border.all(color: status.color.withValues(alpha: 0.4)),
        ),
        child: Text(
          status.label,
          style: TextStyle(
            color: status.color,
            fontWeight: FontWeight.w600,
            fontSize: 12,
          ),
        ),
      ),
    );
  }
}

_ReferenceBandStatus _statusForBand(
  SerumReferenceBand band,
  BloodConcentrationUnit unit,
) {
  String threshold(double value) => unit.formatFromNgMl(
        value,
        fractionDigits: 0,
      );
  switch (band) {
    case SerumReferenceBand.deficiencyRisk:
      return _ReferenceBandStatus(
        label: 'NASEM: deficiency risk (<${threshold(12)})',
        color: Colors.red,
      );
    case SerumReferenceBand.potentialInadequacy:
      return _ReferenceBandStatus(
        label:
            'NASEM: potentially inadequate (${threshold(12)}–<${threshold(20)})',
        color: Colors.orange,
      );
    case SerumReferenceBand.generallyAdequate:
      return _ReferenceBandStatus(
        label: 'NASEM: generally adequate (${threshold(20)}–${threshold(50)})',
        color: Colors.green,
      );
    case SerumReferenceBand.potentialAdverseEffects:
      return _ReferenceBandStatus(
        label: 'NASEM: potential adverse effects (>${threshold(50)})',
        color: Colors.red,
      );
    case SerumReferenceBand.uncertain:
      return const _ReferenceBandStatus(
        label: 'NASEM band uncertain — estimate crosses a boundary',
        color: Colors.blueGrey,
      );
  }
}
