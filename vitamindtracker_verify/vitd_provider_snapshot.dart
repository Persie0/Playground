import 'dart:async';
import 'dart:convert';
import 'dart:math' as math;

import 'package:geolocator/geolocator.dart';
import 'package:http/http.dart' as http;
import 'package:permission_handler/permission_handler.dart';
import 'package:shared_preferences/shared_preferences.dart';

import '../services/db_helper.dart';
import '../services/uv_forecast_service.dart';
import 'vitd_provider_impl.dart' as impl;

class VitDProvider extends impl.VitDProvider {
  VitDProvider({
    required super.gdriveService,
    required super.syncQueueService,
    super.initialSeenLanguage,
    super.initialEula,
    super.initialSeenOnboarding,
  });

  static void setProStatic() => impl.VitDProvider.setProStatic();
  static void revokeProStatic() => impl.VitDProvider.revokeProStatic();

  List<UvForecastPoint> uvForecast = [];
  bool uvForecastIsEstimated = true;

  List<UvForecastPoint> get todayUvForecast {
    final now = DateTime.now();
    return uvForecast
        .where((point) =>
            point.time.year == now.year &&
            point.time.month == now.month &&
            point.time.day == now.day)
        .toList(growable: false);
  }

  double get dailyPeakUv {
    final points = todayUvForecast;
    if (points.isEmpty) return uvIndex;
    return points
        .map((point) => point.uvIndex)
        .fold<double>(0, (peak, value) => math.max(peak, value).toDouble());
  }

  @override
  Future<String?> fetchUV() async {
    isLocationLoading = true;
    hasNetworkError = false;
    notifyListeners();
    var status = await Permission.locationWhenInUse.status;
    if (!status.isGranted) {
      status = await Permission.locationWhenInUse.request();
      if (!status.isGranted) {
        isLocationLoading = false;
        notifyListeners();
        return 'locPermissionDenied';
      }
    }
    try {
      final pos = await Geolocator.getCurrentPosition(
        locationSettings: const LocationSettings(
          accuracy: LocationAccuracy.medium,
          timeLimit: Duration(seconds: 10),
        ),
      );
      final prefs = await SharedPreferences.getInstance();
      await prefs.setDouble('lat', pos.latitude);
      await prefs.setDouble('lon', pos.longitude);
      currentLat = pos.latitude;
      savedLocationName ??= 'unknownCity';
      final result = await super.refreshData(forceLocation: false);
      await _refreshUvForecast(pos.latitude, pos.longitude);
      return result;
    } on TimeoutException {
      hasNetworkError = true;
      lastErrorMessage = 'locationTimeout';
      return 'locationTimeout';
    } on LocationServiceDisabledException {
      hasNetworkError = true;
      lastErrorMessage = 'locDisabled';
      return 'locDisabled';
    } catch (e) {
      hasNetworkError = true;
      lastErrorMessage = 'connectionError';
      return 'locError|${e.toString()}';
    } finally {
      isLocationLoading = false;
      notifyListeners();
    }
  }

  @override
  Future<String?> refreshData({bool forceLocation = false}) async {
    if (forceLocation || savedLocationName == null) return fetchUV();
    final prefs = await SharedPreferences.getInstance();
    final lat = prefs.getDouble('lat');
    final lon = prefs.getDouble('lon');
    if (lat == null || lon == null) return fetchUV();
    final result = await super.refreshData(forceLocation: false);
    await _refreshUvForecast(lat, lon);
    return result;
  }

  Future<void> _refreshUvForecast(double lat, double lon) async {
    final now = DateTime.now();
    final sunrise = _timeOnDate(now, sunriseTime, 6);
    final sunset = _timeOnDate(now, sunsetTime, 18);
    var receivedHourlyForecast = false;
    if (apiKey.isNotEmpty) {
      final oneCallUrl =
          'https://api.openweathermap.org/data/3.0/onecall?lat=$lat&lon=$lon&exclude=minutely,daily,alerts&units=metric&appid=$apiKey';
      try {
        final response = await http
            .get(Uri.parse(oneCallUrl))
            .timeout(const Duration(seconds: 10));
        if (response.statusCode == 200) {
          final data = json.decode(response.body) as Map<String, dynamic>;
          final current = data['current'] as Map<String, dynamic>?;
          final currentUv = (current?['uvi'] as num?)?.toDouble();
          if (currentUv != null) uvIndex = currentUv;
          final points = <UvForecastPoint>[];
          for (final raw in (data['hourly'] as List<dynamic>? ?? const [])) {
            if (raw is! Map<String, dynamic>) continue;
            final timestamp = raw['dt'] as int?;
            final uvi = (raw['uvi'] as num?)?.toDouble();
            if (timestamp == null || uvi == null) continue;
            final time = DateTime.fromMillisecondsSinceEpoch(timestamp * 1000)
                .toLocal();
            if (time.year == now.year &&
                time.month == now.month &&
                time.day == now.day) {
              points.add(UvForecastPoint(time: time, uvIndex: uvi));
            }
          }
          points.sort((a, b) => a.time.compareTo(b.time));
          if (points.isNotEmpty) {
            final reportedPeak = points
                .map((point) => point.uvIndex)
                .fold<double>(uvIndex, (peak, value) =>
                    math.max(peak, value).toDouble());
            final modeled = UvForecastService.buildDailyCurve(
              date: now,
              sunrise: sunrise,
              sunset: sunset,
              peakUv:
                  math.max(reportedPeak, approximateUVIndex(now)).toDouble(),
            );
            final firstActual = points.first.time;
            uvForecast = [
              ...modeled.where((point) => point.time.isBefore(firstActual)),
              ...points,
            ]..sort((a, b) => a.time.compareTo(b.time));
            receivedHourlyForecast = true;
          }
        }
      } catch (_) {}
    }
    if (!receivedHourlyForecast) {
      final clearSkyPeak = approximateUVIndex(now);
      final cloudScale =
          (1 - (cloudiness / 100 * 0.45)).clamp(0.45, 1.0).toDouble();
      final baselinePeak = clearSkyPeak * cloudScale;
      final unitCurve = UvForecastService.buildDailyCurve(
        date: now,
        sunrise: sunrise,
        sunset: sunset,
        peakUv: 1,
      );
      final currentSolarShape = UvForecastService.valueAt(unitCurve, now);
      final estimatedPeak = uvIndex > 0.05 && currentSolarShape > 0.1
          ? (uvIndex / currentSolarShape).clamp(0.0, 15.0).toDouble()
          : baselinePeak;
      uvForecast = UvForecastService.buildDailyCurve(
        date: now,
        sunrise: sunrise,
        sunset: sunset,
        peakUv: estimatedPeak,
      );
    }
    uvForecastIsEstimated = !receivedHourlyForecast;
    notifyListeners();
  }

  List<UvForecastPoint> _forecastForDate(DateTime date) {
    final now = DateTime.now();
    final isToday = date.year == now.year &&
        date.month == now.month &&
        date.day == now.day;
    if (isToday && uvForecast.isNotEmpty) return uvForecast;
    final sunrise = _timeOnDate(date, isToday ? sunriseTime : null, 6);
    final sunset = _timeOnDate(date, isToday ? sunsetTime : null, 18);
    return UvForecastService.buildDailyCurve(
      date: date,
      sunrise: sunrise,
      sunset: sunset,
      peakUv: approximateUVIndex(date),
    );
  }

  DateTime _timeOnDate(DateTime date, String? formattedTime, int fallbackHour) {
    if (formattedTime == null) {
      return DateTime(date.year, date.month, date.day, fallbackHour);
    }
    final parts = formattedTime.split(':');
    if (parts.length != 2) {
      return DateTime(date.year, date.month, date.day, fallbackHour);
    }
    return DateTime(
      date.year,
      date.month,
      date.day,
      int.tryParse(parts[0]) ?? fallbackHour,
      int.tryParse(parts[1]) ?? 0,
    );
  }

  double averageUvForInterval(
    DateTime start,
    DateTime end, {
    double cloudFactor = 1.0,
  }) {
    if (!end.isAfter(start)) return 0;
    final points = _forecastForDate(start);
    return UvForecastService.averageUv(points, start, end) * cloudFactor;
  }

  double calculateIUForInterval(
    DateTime start,
    DateTime end, {
    double cloudFactor = 1.0,
  }) {
    if (!end.isAfter(start)) return 0;
    final minutes = end.difference(start).inMilliseconds / 60000.0;
    final averageUv = averageUvForInterval(
      start,
      end,
      cloudFactor: cloudFactor,
    );
    return calculateIUWithUv(minutes, averageUv);
  }

  Future<void> updateExposureInterval(
    DateTime start,
    DateTime end, {
    double cloudFactor = 1.0,
  }) async {
    if (!end.isAfter(start)) {
      throw ArgumentError('Exposure end must be after its start.');
    }
    if (!cloudFactor.isFinite || cloudFactor <= 0 || cloudFactor > 1) {
      throw ArgumentError.value(cloudFactor, 'cloudFactor');
    }
    final minutes = end.difference(start).inMinutes;
    final produced = calculateIUForInterval(
      start,
      end,
      cloudFactor: cloudFactor,
    );
    final date = start.toIso8601String().split('T')[0];
    await DBHelper.saveSunExposureForDate(produced, minutes, date);
    final db = await DBHelper.database();
    final rows = await db.query(
      'tracking_entries',
      columns: ['id'],
      where: "date = ? AND entry_type = 'sun' AND deleted_at IS NULL",
      whereArgs: [date],
      orderBy: 'id DESC',
      limit: 1,
    );
    if (rows.isNotEmpty) {
      final id = (rows.first['id'] as num).toInt();
      await db.update(
        'tracking_entries',
        {
          'created_at': start.toIso8601String(),
          'updated_at': DateTime.now().toUtc().toIso8601String(),
        },
        where: 'id = ?',
        whereArgs: [id],
      );
    }
    await updateDailyTarget(dailyTarget);
    await triggerAutoSync();
  }

  @override
  Future<void> updateTrackingEntryById(
    int id, {
    required String date,
    required double iu,
    int? sunMinutes,
    DateTime? createdAt,
  }) async {
    await super.updateTrackingEntryById(
      id,
      date: date,
      iu: iu,
      sunMinutes: sunMinutes,
    );
    if (createdAt != null) {
      final db = await DBHelper.database();
      await db.update(
        'tracking_entries',
        {
          'created_at': createdAt.toIso8601String(),
          'updated_at': DateTime.now().toUtc().toIso8601String(),
        },
        where: 'id = ?',
        whereArgs: [id],
      );
      await triggerAutoSync();
    }
  }
}
