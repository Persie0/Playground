package com.lingq.core.premium.delegate;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum PremiumPackages {
    PremiumMonth("lqa_001"),
    PremiumSixMonths("lqa_002"),
    PremiumOneYear("lqa_003"),
    PremiumMonthPlus("lqa_001_plus"),
    PremiumOneYearPlus("lqa_003_plus");

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final String value;

    PremiumPackages(String str) {
        this.value = str;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}
