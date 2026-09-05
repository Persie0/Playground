from pathlib import Path


def replace_once(text: str, old: str, new: str, label: str) -> str:
    count = text.count(old)
    if count != 1:
        raise SystemExit(f"{label}: expected exactly one match, found {count}")
    return text.replace(old, new, 1)


plan_path = Path("lib/src/models/capture_plan.dart")
plan = plan_path.read_text()
plan = replace_once(
    plan,
    """  static double angularErrorDeg({
    required double yawDeg,
    required double pitchDeg,
    required CaptureTarget target,
  }) {
    final dyaw = _shortestYawDelta(yawDeg, target.yawDeg);
    final dpitch = pitchDeg - target.pitchDeg;
    final pitchScale = math
        .cos(target.pitchDeg * math.pi / 180)
        .abs()
        .clamp(0.18, 1.0);
    return math.sqrt(dyaw * dyaw * pitchScale * pitchScale + dpitch * dpitch);
  }
""",
    """  static double angularErrorDeg({
    required double yawDeg,
    required double pitchDeg,
    required CaptureTarget target,
  }) {
    // Great-circle distance is the physically correct optical-axis error.
    // It also removes the yaw singularity at zenith/nadir: when the camera
    // points vertically, every azimuth describes the same direction.
    final currentPitch = pitchDeg * math.pi / 180;
    final targetPitch = target.pitchDeg * math.pi / 180;
    final yawDelta =
        _shortestYawDelta(yawDeg, target.yawDeg) * math.pi / 180;
    final cosine = (
      math.sin(currentPitch) * math.sin(targetPitch) +
      math.cos(currentPitch) * math.cos(targetPitch) * math.cos(yawDelta)
    ).clamp(-1.0, 1.0).toDouble();
    return math.acos(cosine) * 180 / math.pi;
  }

  /// Horizontal screen guidance in local tangent-angle degrees.
  ///
  /// Pole targets intentionally have no horizontal component because yaw is
  /// undefined there. Other rings scale azimuth by local latitude so the
  /// marker does not exaggerate sideways movement.
  static double guidanceYawDeltaDeg({
    required double yawDeg,
    required double pitchDeg,
    required CaptureTarget target,
  }) {
    if (target.isPole) return 0;
    final yawDelta = _shortestYawDelta(target.yawDeg, yawDeg);
    final meanPitch = (pitchDeg + target.pitchDeg) * 0.5 * math.pi / 180;
    return yawDelta * math.cos(meanPitch).abs();
  }
""",
    "capture-plan angular error",
)
plan_path.write_text(plan)

tracker_path = Path("lib/src/services/motion_pose_tracker.dart")
tracker = tracker_path.read_text()
tracker = replace_once(
    tracker,
    "  double _nativeAngularSpeed = double.infinity;\n  double? _lastNativeRawYaw;",
    "  double _nativeAngularSpeed = double.infinity;\n  double? _filteredNativeYawDeg;\n  double? _filteredNativePitchDeg;\n  double? _lastNativeRawYaw;",
    "filtered native fields",
)
tracker = replace_once(
    tracker,
    "    _nativeAngularSpeed = double.infinity;\n    _lastNativeRawYaw = null;\n    _lastNativeRawPitch = null;\n    _lastNativeAt = null;",
    "    _nativeAngularSpeed = double.infinity;\n    _filteredNativeYawDeg = null;\n    _filteredNativePitchDeg = null;\n    _lastNativeRawYaw = null;\n    _lastNativeRawPitch = null;\n    _lastNativeAt = null;",
    "reset native filters",
)
old_native = """  void _onNativeOrientation(NativeOrientationSample e) {
    if (_disposed) return;
    if (_alignNativeOnNext) {
      _nativeYawOffset = _nativeAlignmentTargetYaw - e.yawDeg;
      _nativePitchOffset = _nativeAlignmentTargetPitch - e.pitchDeg;
      _alignNativeOnNext = false;
      _nativeAngularSpeed = double.infinity;
    } else {
      final previousYaw = _lastNativeRawYaw;
      final previousPitch = _lastNativeRawPitch;
      final previousAt = _lastNativeAt;
      if (previousYaw != null && previousPitch != null && previousAt != null) {
        final dt = (e.timestamp - previousAt).inMicroseconds / 1000000.0;
        if (dt > 0 && dt < 0.25) {
          final dyaw = _shortestDegreesDelta(previousYaw, e.yawDeg);
          final dpitch = e.pitchDeg - previousPitch;
          final speed = _compatHypot(dyaw, dpitch) * math.pi / 180 / dt;
          _nativeAngularSpeed = _nativeAngularSpeed.isFinite
              ? _nativeAngularSpeed * 0.55 + speed * 0.45
              : speed;
        }
      }
    }

    _lastNativeRawYaw = e.yawDeg;
    _lastNativeRawPitch = e.pitchDeg;
    _lastNativeAt = e.timestamp;
    _nativeYawDeg = _normalizeDegrees(e.yawDeg + _nativeYawOffset);
    _nativePitchDeg = (e.pitchDeg + _nativePitchOffset)
        .clamp(-90.0, 90.0)
        .toDouble();
    _nativeActive = true;
    _publish();
  }
"""
new_native = """  void _onNativeOrientation(NativeOrientationSample e) {
    if (_disposed) return;
    final previousYaw = _lastNativeRawYaw;
    final previousPitch = _lastNativeRawPitch;
    final previousAt = _lastNativeAt;
    final aligning = _alignNativeOnNext;

    if (aligning) {
      _nativeYawOffset = _nativeAlignmentTargetYaw - e.yawDeg;
      _nativePitchOffset = _nativeAlignmentTargetPitch - e.pitchDeg;
      _alignNativeOnNext = false;
      _nativeAngularSpeed = double.infinity;
    } else if (previousYaw != null &&
        previousPitch != null &&
        previousAt != null) {
      final dt = (e.timestamp - previousAt).inMicroseconds / 1000000.0;
      if (dt > 0 && dt < 0.25) {
        // Measure optical-axis travel on the unit sphere. A raw yaw delta is
        // meaningless near +/-90 degrees pitch and previously reported huge
        // motion while a stationary phone was aimed at the ground or sky.
        final displacementDeg = _sphericalAngleDeg(
          previousYaw,
          previousPitch,
          e.yawDeg,
          e.pitchDeg,
        );
        final speed = displacementDeg * math.pi / 180 / dt;
        _nativeAngularSpeed = _nativeAngularSpeed.isFinite
            ? _nativeAngularSpeed * 0.55 + speed * 0.45
            : speed;
      }
    }

    final alignedYaw = _normalizeDegrees(e.yawDeg + _nativeYawOffset);
    final alignedPitch = (e.pitchDeg + _nativePitchOffset)
        .clamp(-90.0, 90.0)
        .toDouble();

    if (aligning ||
        _filteredNativeYawDeg == null ||
        _filteredNativePitchDeg == null) {
      _filteredNativeYawDeg = alignedYaw;
      _filteredNativePitchDeg = alignedPitch;
    } else {
      final dt = previousAt == null
          ? 0.02
          : ((e.timestamp - previousAt).inMicroseconds / 1000000.0)
                .clamp(0.005, 0.10)
                .toDouble();
      final motion = _angularSpeed.isFinite ? _angularSpeed : _nativeAngularSpeed;
      final timeConstant = !motion.isFinite || motion > 0.50
          ? 0.045
          : motion > 0.12
          ? 0.09
          : 0.18;
      final alpha = 1 - math.exp(-dt / timeConstant);
      final observability = math
          .cos(alignedPitch * math.pi / 180)
          .abs()
          .clamp(0.0, 1.0)
          .toDouble();
      final yawAlpha = (alpha * (0.12 + 0.88 * observability * observability))
          .clamp(0.015, 1.0)
          .toDouble();
      _filteredNativeYawDeg = _normalizeDegrees(
        _filteredNativeYawDeg! +
            _shortestDegreesDelta(_filteredNativeYawDeg!, alignedYaw) * yawAlpha,
      );
      _filteredNativePitchDeg =
          _filteredNativePitchDeg! +
          (alignedPitch - _filteredNativePitchDeg!) * alpha;
    }

    _lastNativeRawYaw = e.yawDeg;
    _lastNativeRawPitch = e.pitchDeg;
    _lastNativeAt = e.timestamp;
    _nativeYawDeg = _filteredNativeYawDeg!;
    _nativePitchDeg = _filteredNativePitchDeg!;
    _nativeActive = true;
    _publish();
  }
"""
tracker = replace_once(tracker, old_native, new_native, "native orientation handler")
tracker = replace_once(
    tracker,
    "      angularSpeedRad: _nativeActive ? _nativeAngularSpeed : _angularSpeed,",
    "      angularSpeedRad: _angularSpeed.isFinite\n          ? _angularSpeed\n          : (_nativeActive ? _nativeAngularSpeed : double.infinity),",
    "stable angular-speed source",
)
tracker = replace_once(
    tracker,
    "  static double _shortestDegreesDelta(double from, double to) {",
    """  static double _sphericalAngleDeg(
    double yawA,
    double pitchA,
    double yawB,
    double pitchB,
  ) {
    final a = pitchA * math.pi / 180;
    final b = pitchB * math.pi / 180;
    final yaw = _shortestDegreesDelta(yawA, yawB) * math.pi / 180;
    final cosine = (
      math.sin(a) * math.sin(b) +
      math.cos(a) * math.cos(b) * math.cos(yaw)
    ).clamp(-1.0, 1.0).toDouble();
    return math.acos(cosine) * 180 / math.pi;
  }

  static double _shortestDegreesDelta(double from, double to) {""",
    "spherical speed helper",
)
tracker_path.write_text(tracker)

screen_path = Path("lib/src/screens/capture_screen.dart")
screen = screen_path.read_text()
screen = replace_once(
    screen,
    """    final target = _plan.nearestIncomplete(
      yawDeg: sample.yawDeg,
      pitchDeg: sample.pitchDeg,
      completed: _completed,
    );""",
    "    final target = _selectTarget(sample);",
    "target hysteresis selection",
)
screen = replace_once(
    screen,
    """                      yawErrorDeg: target == null
                          ? 0
                          : _yawDelta(_sample.yawDeg, target.yawDeg),""",
    """                      yawErrorDeg: target == null
                          ? 0
                          : CapturePlan.guidanceYawDeltaDeg(
                              yawDeg: _sample.yawDeg,
                              pitchDeg: _sample.pitchDeg,
                              target: target,
                            ),""",
    "screen tangent guidance",
)
screen = replace_once(
    screen,
    """  static double _yawDelta(double current, double target) {
    var delta = target - current;
    while (delta > 180) {
      delta -= 360;
    }
    while (delta < -180) {
      delta += 360;
    }
    return delta;
  }
""",
    """  CaptureTarget? _selectTarget(PoseSample sample) {
    final nearest = _plan.nearestIncomplete(
      yawDeg: sample.yawDeg,
      pitchDeg: sample.pitchDeg,
      completed: _completed,
    );
    final current = _target;
    if (current == null ||
        _completed.contains(current.id) ||
        nearest == null ||
        nearest.id == current.id) {
      return nearest ?? current;
    }

    final currentError = CapturePlan.angularErrorDeg(
      yawDeg: sample.yawDeg,
      pitchDeg: sample.pitchDeg,
      target: current,
    );
    final nearestError = CapturePlan.angularErrorDeg(
      yawDeg: sample.yawDeg,
      pitchDeg: sample.pitchDeg,
      target: nearest,
    );
    final holdRadius = current.isPole ? 28.0 : 18.0;
    final requiredImprovement = current.isPole ? 8.0 : 5.0;
    if (currentError <= holdRadius ||
        nearestError + requiredImprovement >= currentError) {
      return current;
    }

    _stableSince = null;
    return nearest;
  }
""",
    "target hysteresis helper",
)
screen_path.write_text(screen)

test_path = Path("test/capture_plan_test.dart")
tests = test_path.read_text()
if "pole guidance is invariant to the yaw singularity" not in tests:
    idx = tests.rfind("\n}\n")
    if idx < 0:
        raise SystemExit("capture plan test closing brace not found")
    tests = tests[:idx] + r'''

  test('pole guidance is invariant to the yaw singularity', () {
    const exactNadir = CaptureTarget(id: 100, yawDeg: 0, pitchDeg: -90);
    for (final yaw in [0.0, 45.0, 90.0, 180.0, 315.0]) {
      expect(
        CapturePlan.angularErrorDeg(
          yawDeg: yaw,
          pitchDeg: -90,
          target: exactNadir,
        ),
        closeTo(0, 0.0001),
      );
      expect(
        CapturePlan.guidanceYawDeltaDeg(
          yawDeg: yaw,
          pitchDeg: -90,
          target: exactNadir,
        ),
        0,
      );
    }
  });

  test('near-nadir plan target stays capturable across a 180 degree yaw jump', () {
    const target = CaptureTarget(id: 101, yawDeg: 0, pitchDeg: -88);
    final error = CapturePlan.angularErrorDeg(
      yawDeg: 180,
      pitchDeg: -88,
      target: target,
    );
    expect(error, lessThan(5.5));
    expect(
      CapturePlan.guidanceYawDeltaDeg(
        yawDeg: 180,
        pitchDeg: -88,
        target: target,
      ),
      0,
    );
  });
''' + tests[idx:]
test_path.write_text(tests)
