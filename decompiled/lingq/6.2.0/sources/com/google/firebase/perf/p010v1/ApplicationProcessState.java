package com.google.firebase.perf.p010v1;

import p000.a94;
import p000.d94;
import p000.g94;
import p000.gz8;
import p000.p84;

/* JADX INFO: loaded from: classes.dex */
public enum ApplicationProcessState implements a94 {
    APPLICATION_PROCESS_STATE_UNKNOWN(0),
    FOREGROUND(1),
    BACKGROUND(2),
    FOREGROUND_BACKGROUND(3);

    public static final int APPLICATION_PROCESS_STATE_UNKNOWN_VALUE = 0;
    public static final int BACKGROUND_VALUE = 2;
    public static final int FOREGROUND_BACKGROUND_VALUE = 3;
    public static final int FOREGROUND_VALUE = 1;
    private static final d94 internalValueMap = new gz8(7);
    private final int value;

    ApplicationProcessState(int i) {
        this.value = i;
    }

    public static ApplicationProcessState forNumber(int i) {
        if (i == 0) {
            return APPLICATION_PROCESS_STATE_UNKNOWN;
        }
        if (i == 1) {
            return FOREGROUND;
        }
        if (i == 2) {
            return BACKGROUND;
        }
        if (i != 3) {
            return null;
        }
        return FOREGROUND_BACKGROUND;
    }

    public static d94 internalGetValueMap() {
        return internalValueMap;
    }

    public static g94 internalGetVerifier() {
        return p84.f55743e;
    }

    @Override // p000.a94
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static ApplicationProcessState valueOf(int i) {
        return forNumber(i);
    }
}
