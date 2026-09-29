package com.lingq.core.analytics.data;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes3.dex */
public enum LqAnalyticsValues$StatDetail {
    Challenges("challenges"),
    Listening("listening"),
    Reading("reading"),
    StreakCalendar("streak calendar"),
    Lingqs("lingqs"),
    KnownWords("known words"),
    Method("method"),
    MoreStats("more stats"),
    Coins("coins"),
    Badges("badges"),
    StudyTime("study time"),
    ReadingSpeed("reading speed"),
    LingqsLearned("lingqs learned"),
    Speaking("speaking"),
    Writing("writing");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    LqAnalyticsValues$StatDetail(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
