package com.lingq.core.p012ui.challenges;

import com.lingq.core.designsystem.R$color;
import com.lingq.core.p012ui.R$string;
import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum MonthlyLingqingType {
    Bronze("bronze", R$string.challenge_stats_bronze, R$color.bronze),
    Silver("silver", R$string.challenge_stats_silver, R$color.silver),
    Gold("gold", R$string.challenge_stats_gold, R$color.gold);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int color;
    private final int title;
    private final String value;

    MonthlyLingqingType(String str, int i, int i2) {
        this.value = str;
        this.title = i;
        this.color = i2;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getColor() {
        return this.color;
    }

    public final int getTitle() {
        return this.title;
    }

    public final String getValue() {
        return this.value;
    }
}
