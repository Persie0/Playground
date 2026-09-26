import 'blood_concentration_unit.dart';
import 'uv_forecast_service.dart';

Never _fail(String message) => throw StateError(message);

void _expectClose(double actual, double expected, {double epsilon = 0.0001}) {
  if ((actual - expected).abs() > epsilon) {
    _fail('Expected $expected, got $actual');
  }
}

void main() {
  _expectClose(BloodConcentrationUnit.nmolL.fromNgMl(20), 50);
  _expectClose(BloodConcentrationUnit.nmolL.toNgMl(50), 20);
  _expectClose(BloodConcentrationUnit.ngMl.fromNgMl(37.5), 37.5);
  if (BloodConcentrationUnitX.fromStorage('nmol/L') !=
      BloodConcentrationUnit.nmolL) {
    _fail('nmol/L preference did not parse');
  }
  if (BloodConcentrationUnitX.fromStorage('bad') !=
      BloodConcentrationUnit.ngMl) {
    _fail('unknown preference did not fall back to ng/mL');
  }
  if (BloodConcentrationUnit.nmolL.formatFromNgMl(20) != '50.0 nmol/L') {
    _fail('nmol/L display formatting is wrong');
  }

  final date = DateTime(2026, 7, 23);
  final curve = UvForecastService.buildDailyCurve(
    date: date,
    sunrise: DateTime(2026, 7, 23, 5, 30),
    sunset: DateTime(2026, 7, 23, 20, 30),
    peakUv: 8,
  );
  final dawn = UvForecastService.averageUv(
    curve,
    DateTime(2026, 7, 23, 5),
    DateTime(2026, 7, 23, 5, 15),
  );
  final morning = UvForecastService.averageUv(
    curve,
    DateTime(2026, 7, 23, 7),
    DateTime(2026, 7, 23, 7, 30),
  );
  final midday = UvForecastService.averageUv(
    curve,
    DateTime(2026, 7, 23, 12, 30),
    DateTime(2026, 7, 23, 13),
  );
  _expectClose(dawn, 0);
  if (midday <= morning) {
    _fail('Midday UV $midday was not greater than morning UV $morning');
  }

  final constant = [
    UvForecastPoint(time: DateTime(2026, 7, 23, 10), uvIndex: 4),
    UvForecastPoint(time: DateTime(2026, 7, 23, 11), uvIndex: 4),
  ];
  _expectClose(
    UvForecastService.averageUv(
      constant,
      DateTime(2026, 7, 23, 10, 10),
      DateTime(2026, 7, 23, 10, 50),
    ),
    4,
  );

  print('vitamindtracker focused verification passed');
}
