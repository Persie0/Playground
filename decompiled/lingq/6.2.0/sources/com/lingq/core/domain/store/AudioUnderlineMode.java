package com.lingq.core.domain.store;

import kotlin.enums.AbstractC3201a;
import p000.e00;
import p000.ys2;

/* JADX INFO: loaded from: classes2.dex */
public enum AudioUnderlineMode {
    Off(0),
    Static(1),
    Wave(2);

    private final int value;
    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    public static final e00 Companion = new e00();

    AudioUnderlineMode(int i) {
        this.value = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getValue() {
        return this.value;
    }
}
