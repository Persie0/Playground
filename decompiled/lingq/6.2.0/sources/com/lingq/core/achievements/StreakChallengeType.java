package com.lingq.core.achievements;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum StreakChallengeType {
    Day3(3),
    Day7(7),
    Day14(14),
    Day30(30);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int days;

    StreakChallengeType(int i) {
        this.days = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getDays() {
        return this.days;
    }
}
