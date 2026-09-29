package com.lingq.feature.library.preview;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum TranscriptionGateState {
    AVAILABLE,
    PREMIUM_REQUIRED,
    LIMIT_EXCEEDED,
    INSUFFICIENT_BALANCE;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
