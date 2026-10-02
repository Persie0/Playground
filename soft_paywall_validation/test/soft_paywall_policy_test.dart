import 'package:test/test.dart';
import 'package:soft_paywall_validation/soft_paywall_policy.dart';

void main() {
  const threeThenThree = SoftPaywallConfig(
    firstActionThreshold: 3,
    repeatActionThresholds: [3],
    cooldowns: [Duration(days: 2)],
  );

  test('first impression happens only after the first threshold', () {
    var state = const SoftPaywallState();
    final t0 = DateTime.utc(2026, 10, 2);

    var decision = SoftPaywallPolicy.recordAction(
      config: threeThenThree,
      state: state,
      now: t0,
    );
    expect(decision.shouldShow, isFalse);
    state = decision.state;

    decision = SoftPaywallPolicy.recordAction(
      config: threeThenThree,
      state: state,
      now: t0,
    );
    expect(decision.shouldShow, isFalse);
    state = decision.state;

    decision = SoftPaywallPolicy.recordAction(
      config: threeThenThree,
      state: state,
      now: t0,
    );
    expect(decision.shouldShow, isTrue);
    expect(decision.state.impressionCount, 1);
    expect(decision.state.lastShownActionCount, 3);
    expect(decision.state.shownThisSession, isTrue);
  });

  test('never shows twice in one app session', () {
    const state = SoftPaywallState(
      actionCount: 3,
      impressionCount: 1,
      lastShownActionCount: 3,
      shownThisSession: true,
    );

    final decision = SoftPaywallPolicy.recordAction(
      config: threeThenThree,
      state: state,
      now: DateTime.utc(2026, 10, 10),
    );

    expect(decision.shouldShow, isFalse);
    expect(decision.state.actionCount, 4);
  });

  test('repeat requires both enough actions and the cooldown', () {
    final t0 = DateTime.utc(2026, 10, 2);
    var state = SoftPaywallState(
      actionCount: 3,
      impressionCount: 1,
      lastShownActionCount: 3,
      lastShownAt: t0,
    );

    for (var i = 0; i < 3; i++) {
      final decision = SoftPaywallPolicy.recordAction(
        config: threeThenThree,
        state: state,
        now: t0.add(const Duration(days: 1)),
      );
      expect(decision.shouldShow, isFalse);
      state = decision.state;
    }

    final decision = SoftPaywallPolicy.recordAction(
      config: threeThenThree,
      state: state,
      now: t0.add(const Duration(days: 2)),
    );
    expect(decision.shouldShow, isTrue);
    expect(decision.state.impressionCount, 2);
  });

  test('later repeat thresholds and cooldowns clamp to the last configured value', () {
    const config = SoftPaywallConfig(
      firstActionThreshold: 5,
      repeatActionThresholds: [15, 25],
      cooldowns: [Duration(days: 1), Duration(days: 3)],
    );
    final t0 = DateTime.utc(2026, 10, 2);
    var state = SoftPaywallState(
      actionCount: 100,
      impressionCount: 3,
      lastShownActionCount: 100,
      lastShownAt: t0,
    );

    for (var i = 0; i < 24; i++) {
      state = SoftPaywallPolicy.recordAction(
        config: config,
        state: state,
        now: t0.add(const Duration(days: 4)),
      ).state;
    }
    var decision = SoftPaywallPolicy.recordAction(
      config: config,
      state: state,
      now: t0.add(const Duration(days: 4)),
    );
    expect(decision.shouldShow, isTrue);

    state = decision.state.copyWith(shownThisSession: false);
    for (var i = 0; i < 25; i++) {
      decision = SoftPaywallPolicy.recordAction(
        config: config,
        state: state,
        now: t0.add(const Duration(days: 6)),
      );
      state = decision.state;
    }
    expect(decision.shouldShow, isFalse,
        reason: 'three-day cooldown is measured from the previous impression');
  });

  test('premium users do not advance the meter', () {
    const state = SoftPaywallState(actionCount: 2);
    final decision = SoftPaywallPolicy.recordAction(
      config: threeThenThree,
      state: state,
      now: DateTime.utc(2026, 10, 2),
      isPremium: true,
    );

    expect(decision.shouldShow, isFalse);
    expect(decision.state.actionCount, 2);
  });
}
