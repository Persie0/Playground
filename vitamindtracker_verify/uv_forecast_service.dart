import 'dart:math' as math;

class UvForecastPoint {
  const UvForecastPoint({required this.time, required this.uvIndex});
  final DateTime time;
  final double uvIndex;
}

class UvForecastService {
  const UvForecastService._();

  static List<UvForecastPoint> buildDailyCurve({
    required DateTime date,
    required DateTime sunrise,
    required DateTime sunset,
    required double peakUv,
    Duration resolution = const Duration(minutes: 30),
  }) {
    final dayStart = DateTime(date.year, date.month, date.day);
    final dayEnd = dayStart.add(const Duration(days: 1));
    final safePeak = math.max(0.0, peakUv);
    final daylightMinutes = sunset.difference(sunrise).inMinutes;
    final points = <UvForecastPoint>[];
    for (var time = dayStart;
        !time.isAfter(dayEnd);
        time = time.add(resolution)) {
      double uv = 0;
      if (daylightMinutes > 0 && time.isAfter(sunrise) && time.isBefore(sunset)) {
        final daylightProgress = time.difference(sunrise).inMinutes / daylightMinutes;
        final solarShape = math.pow(
          math.sin(math.pi * daylightProgress).clamp(0.0, 1.0),
          1.35,
        );
        uv = (safePeak * solarShape).toDouble();
      }
      points.add(UvForecastPoint(time: time, uvIndex: uv));
    }
    return points;
  }

  static double valueAt(List<UvForecastPoint> points, DateTime time) {
    if (points.isEmpty) return 0;
    if (!time.isAfter(points.first.time)) return points.first.uvIndex;
    if (!time.isBefore(points.last.time)) return points.last.uvIndex;
    for (var index = 1; index < points.length; index++) {
      final right = points[index];
      if (time.isAfter(right.time)) continue;
      final left = points[index - 1];
      final span = right.time.difference(left.time).inMilliseconds;
      if (span <= 0) return right.uvIndex;
      final elapsed = time.difference(left.time).inMilliseconds;
      final fraction = (elapsed / span).clamp(0.0, 1.0);
      return left.uvIndex + ((right.uvIndex - left.uvIndex) * fraction);
    }
    return 0;
  }

  static double averageUv(
    List<UvForecastPoint> points,
    DateTime start,
    DateTime end, {
    Duration step = const Duration(minutes: 5),
  }) {
    if (points.isEmpty || !end.isAfter(start)) return 0;
    var cursor = start;
    var weightedUvMinutes = 0.0;
    var totalMinutes = 0.0;
    while (cursor.isBefore(end)) {
      final candidateEnd = cursor.add(step);
      final segmentEnd = candidateEnd.isAfter(end) ? end : candidateEnd;
      final minutes = segmentEnd.difference(cursor).inMilliseconds / 60000.0;
      final startUv = valueAt(points, cursor);
      final endUv = valueAt(points, segmentEnd);
      weightedUvMinutes += ((startUv + endUv) / 2) * minutes;
      totalMinutes += minutes;
      cursor = segmentEnd;
    }
    return totalMinutes == 0 ? 0 : weightedUvMinutes / totalMinutes;
  }
}
