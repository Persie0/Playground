package com.google.firebase.sessions;

import kotlin.enums.AbstractC3201a;
import p000.cp6;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum EventType implements cp6 {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());
    private final int number;

    EventType(int i) {
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
