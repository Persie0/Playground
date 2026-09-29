package com.lingq.core.domain.model.status;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum CardExtendedStatus {
    Null(-1),
    NotKnown(0),
    Known(3);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int value;

    CardExtendedStatus(int i) {
        this.value = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
