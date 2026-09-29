package com.lingq.core.domain.model.status;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum CardStatus {
    Ignored(-1),
    New(0),
    Recognized(1),
    Familiar(2),
    Learned(3),
    Known(4);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int value;

    CardStatus(int i) {
        this.value = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
