package com.lingq.core.domain.model.language;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum LanguageProgressPeriod {
    Today("today"),
    Last7Days("last_7d"),
    Last14Days("last_14d"),
    Last30Days("last_30d"),
    ThisMonth("this_month"),
    LastMonth("last_1m"),
    Last3Months("last_3m"),
    Last6Months("last_6m"),
    AllTime("all");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String key;

    LanguageProgressPeriod(String str) {
        this.key = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }
}
