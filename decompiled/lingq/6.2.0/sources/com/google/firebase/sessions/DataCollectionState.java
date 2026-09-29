package com.google.firebase.sessions;

import kotlin.enums.AbstractC3201a;
import p000.cp6;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum DataCollectionState implements cp6 {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int number;

    DataCollectionState(int i) {
        this.number = i;
    }

    public static ys2 getEntries() {
        return $ENTRIES;
    }

    @Override // p000.cp6
    public int getNumber() {
        return this.number;
    }
}
