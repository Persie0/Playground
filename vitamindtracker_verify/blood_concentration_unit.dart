enum BloodConcentrationUnit { ngMl, nmolL }

extension BloodConcentrationUnitX on BloodConcentrationUnit {
  static const double nmolPerLPerNgPerMl = 2.5;

  String get label => switch (this) {
        BloodConcentrationUnit.ngMl => 'ng/mL',
        BloodConcentrationUnit.nmolL => 'nmol/L',
      };

  double fromNgMl(double valueNgMl) => switch (this) {
        BloodConcentrationUnit.ngMl => valueNgMl,
        BloodConcentrationUnit.nmolL => valueNgMl * nmolPerLPerNgPerMl,
      };

  double toNgMl(double value) => switch (this) {
        BloodConcentrationUnit.ngMl => value,
        BloodConcentrationUnit.nmolL => value / nmolPerLPerNgPerMl,
      };

  String formatFromNgMl(
    double valueNgMl, {
    int fractionDigits = 1,
    bool includeUnit = true,
  }) {
    final value = fromNgMl(valueNgMl).toStringAsFixed(fractionDigits);
    return includeUnit ? '$value $label' : value;
  }

  String formatHistoryMeasurementTitle(
    String bloodTestLabel,
    double valueNgMl, {
    int fractionDigits = 1,
  }) {
    return '$bloodTestLabel • ${formatFromNgMl(valueNgMl, fractionDigits: fractionDigits)}';
  }

  static BloodConcentrationUnit fromStorage(String? value) {
    return value == BloodConcentrationUnit.nmolL.label
        ? BloodConcentrationUnit.nmolL
        : BloodConcentrationUnit.ngMl;
  }
}
