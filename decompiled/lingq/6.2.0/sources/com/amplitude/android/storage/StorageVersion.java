package com.amplitude.android.storage;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum StorageVersion {
    V3(3);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int rawValue;

    StorageVersion(int i) {
        this.rawValue = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    public final int getRawValue() {
        return this.rawValue;
    }
}
