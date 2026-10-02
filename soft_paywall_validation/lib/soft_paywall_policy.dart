class SoftPaywallConfig {
  final int firstActionThreshold;
  final List<int> repeatActionThresholds;
  final List<Duration> cooldowns;

  const SoftPaywallConfig({
    required this.firstActionThreshold,
    required this.repeatActionThresholds,
    required this.cooldowns,
  })  : assert(firstActionThreshold > 0),
        assert(repeatActionThresholds.length > 0),
        assert(cooldowns.length > 0);

  int repeatThresholdForImpression(int impressionCount) {
    final index = (impressionCount - 1).clamp(0, repeatActionThresholds.length - 1);
    return repeatActionThresholds[index];
  }

  Duration cooldownForImpression(int impressionCount) {
    final index = (impressionCount - 1).clamp(0, cooldowns.length - 1);
    return cooldowns[index];
  }
}

class SoftPaywallState {
  final int actionCount;
  final int impressionCount;
  final int lastShownActionCount;
  final DateTime? lastShownAt;
  final bool shownThisSession;

  const SoftPaywallState({
    this.actionCount = 0,
    this.impressionCount = 0,
    this.lastShownActionCount = 0,
    this.lastShownAt,
    this.shownThisSession = false,
  });

  SoftPaywallState copyWith({
    int? actionCount,
    int? impressionCount,
    int? lastShownActionCount,
    DateTime? lastShownAt,
    bool clearLastShownAt = false,
    bool? shownThisSession,
  }) {
    return SoftPaywallState(
      actionCount: actionCount ?? this.actionCount,
      impressionCount: impressionCount ?? this.impressionCount,
      lastShownActionCount: lastShownActionCount ?? this.lastShownActionCount,
      lastShownAt: clearLastShownAt ? null : (lastShownAt ?? this.lastShownAt),
      shownThisSession: shownThisSession ?? this.shownThisSession,
    );
  }
}

class SoftPaywallDecision {
  final SoftPaywallState state;
  final bool shouldShow;

  const SoftPaywallDecision({
    required this.state,
    required this.shouldShow,
  });
}

class SoftPaywallPolicy {
  const SoftPaywallPolicy._();

  static SoftPaywallDecision recordAction({
    required SoftPaywallConfig config,
    required SoftPaywallState state,
    required DateTime now,
    bool isPremium = false,
  }) {
    if (isPremium) {
      return SoftPaywallDecision(state: state, shouldShow: false);
    }

    final actionCount = state.actionCount + 1;
    var nextState = state.copyWith(actionCount: actionCount);

    if (state.shownThisSession) {
      return SoftPaywallDecision(state: nextState, shouldShow: false);
    }

    bool due;
    if (state.impressionCount == 0) {
      due = actionCount >= config.firstActionThreshold;
    } else {
      final requiredActions = config.repeatThresholdForImpression(
        state.impressionCount,
      );
      final requiredCooldown = config.cooldownForImpression(
        state.impressionCount,
      );
      final actionsSinceLastShow = actionCount - state.lastShownActionCount;
      final cooldownElapsed = state.lastShownAt == null ||
          !now.isBefore(state.lastShownAt!.add(requiredCooldown));
      due = actionsSinceLastShow >= requiredActions && cooldownElapsed;
    }

    if (!due) {
      return SoftPaywallDecision(state: nextState, shouldShow: false);
    }

    nextState = nextState.copyWith(
      impressionCount: state.impressionCount + 1,
      lastShownActionCount: actionCount,
      lastShownAt: now,
      shownThisSession: true,
    );
    return SoftPaywallDecision(state: nextState, shouldShow: true);
  }
}
