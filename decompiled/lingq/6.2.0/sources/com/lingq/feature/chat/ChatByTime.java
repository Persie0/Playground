package com.lingq.feature.chat;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum ChatByTime {
    Today(com.lingq.core.p012ui.R$string.periods_today),
    Previous7Days(com.lingq.core.p012ui.R$string.periods_last_seven_days),
    Previous30Days(com.lingq.core.p012ui.R$string.periods_last_30_days),
    Older(com.lingq.core.p012ui.R$string.sort_oldest);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int title;

    ChatByTime(int i) {
        this.title = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getTitle() {
        return this.title;
    }
}
