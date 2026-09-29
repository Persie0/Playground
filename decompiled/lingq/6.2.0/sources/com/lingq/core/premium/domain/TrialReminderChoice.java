package com.lingq.core.premium.domain;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum TrialReminderChoice {
    TwoDaysBefore(2, "2 days before"),
    ThreeDaysBefore(3, "3 days before");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String analyticsValue;
    private final int daysBeforeTrialEnds;

    TrialReminderChoice(int i, String str) {
        this.daysBeforeTrialEnds = i;
        this.analyticsValue = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getAnalyticsValue() {
        return this.analyticsValue;
    }

    public final int getDaysBeforeTrialEnds() {
        return this.daysBeforeTrialEnds;
    }
}
