package com.lingq.core.analytics.data;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum LqAnalyticsValues$ValueOnOrNot {
    Yes("yes"),
    No("no");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    LqAnalyticsValues$ValueOnOrNot(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
