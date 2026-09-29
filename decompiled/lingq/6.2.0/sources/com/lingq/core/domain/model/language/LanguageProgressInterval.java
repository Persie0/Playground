package com.lingq.core.domain.model.language;

import kotlin.enums.AbstractC3201a;
import p000.im4;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum LanguageProgressInterval {
    AllTime("all_time"),
    LastYear("last_year"),
    LastSixMonths("last_six_months"),
    LastThreeMonths("last_two_months"),
    LastMonth("last_month"),
    LastTwoWeeks("last_two_weeks"),
    LastWeek("last_week"),
    Yesterday("yesterday"),
    Today("today");

    private final String key;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final im4 Companion = new im4();

    LanguageProgressInterval(String str) {
        this.key = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getKey() {
        return this.key;
    }
}
