package com.lingq.core.analytics.data;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum LqAnalyticsValues$LanguageLevels {
    Beginner1("Beginner 1"),
    Beginner2("Beginner 2"),
    Intermediate1("Intermediate 1"),
    Intermediate2("Intermediate 2"),
    Advanced1("Advanced 1"),
    Advanced2("Advanced 2");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    LqAnalyticsValues$LanguageLevels(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
