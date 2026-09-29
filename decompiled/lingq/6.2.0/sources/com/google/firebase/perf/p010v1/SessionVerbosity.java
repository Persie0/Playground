package com.google.firebase.perf.p010v1;

import p000.a94;
import p000.d94;
import p000.g94;
import p000.iy5;
import p000.p84;

/* JADX INFO: loaded from: classes.dex */
public enum SessionVerbosity implements a94 {
    SESSION_VERBOSITY_NONE(0),
    GAUGES_AND_SYSTEM_EVENTS(1);

    public static final int GAUGES_AND_SYSTEM_EVENTS_VALUE = 1;
    public static final int SESSION_VERBOSITY_NONE_VALUE = 0;
    private static final d94 internalValueMap = new p84(16);
    private final int value;

    SessionVerbosity(int i) {
        this.value = i;
    }

    public static SessionVerbosity forNumber(int i) {
        if (i == 0) {
            return SESSION_VERBOSITY_NONE;
        }
        if (i != 1) {
            return null;
        }
        return GAUGES_AND_SYSTEM_EVENTS;
    }

    public static d94 internalGetValueMap() {
        return internalValueMap;
    }

    public static g94 internalGetVerifier() {
        return iy5.f44772h;
    }

    @Override // p000.a94
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static SessionVerbosity valueOf(int i) {
        return forNumber(i);
    }
}
