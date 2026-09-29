package com.lingq.core.achievements;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum DailyGoal {
    Casual(50, R$string.stats_streak_casual, R$string.onboarding_daily_goal_min_desc, 10),
    Steady(100, R$string.stats_streak_steady, R$string.onboarding_daily_goal_min_desc, 20),
    Intense(200, R$string.stats_streak_keen, R$string.onboarding_daily_goal_min_desc, 40),
    Insane(400, R$string.stats_streak_intense, R$string.onboarding_daily_goal_min_desc, 60);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int coins;
    private final int desc;
    private final int descExtra;
    private final int mins;

    DailyGoal(int i, int i2, int i3, int i4) {
        this.coins = i;
        this.desc = i2;
        this.descExtra = i3;
        this.mins = i4;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getCoins() {
        return this.coins;
    }

    public final int getDesc() {
        return this.desc;
    }

    public final int getDescExtra() {
        return this.descExtra;
    }

    public final int getMins() {
        return this.mins;
    }
}
