package com.lingq.core.domain.model.language;

import kotlin.enums.AbstractC3201a;
import p000.gz1;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum DailyStreakPreset {
    Casual("casual", 50),
    Steady("steady", 100),
    Keen("intense", 200),
    Intense("insane", 400);

    private final int coins;
    private final String intensity;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final gz1 Companion = new gz1();

    DailyStreakPreset(String str, int i) {
        this.intensity = str;
        this.coins = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getCoins() {
        return this.coins;
    }

    public final String getIntensity() {
        return this.intensity;
    }
}
