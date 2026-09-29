package com.lingq.core.analytics.data;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum LqAnalyticsValues$UpgradeTier {
    OneMonthPremium("1-Month Premium"),
    SixMonthPremium("6-Month Premium"),
    TwelveMonthPremium("12-Month Premium"),
    OneMonthPremiumPlus("1-Month Premium Plus"),
    TwelveMonthPremiumPlus("12-Month Premium Plus");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    LqAnalyticsValues$UpgradeTier(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
