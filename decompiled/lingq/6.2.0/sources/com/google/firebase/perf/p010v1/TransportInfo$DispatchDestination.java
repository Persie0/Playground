package com.google.firebase.perf.p010v1;

import p000.a94;
import p000.d94;
import p000.g94;
import p000.j13;
import p000.q41;

/* JADX INFO: loaded from: classes2.dex */
public enum TransportInfo$DispatchDestination implements a94 {
    SOURCE_UNKNOWN(0),
    FL_LEGACY_V1(1);

    public static final int FL_LEGACY_V1_VALUE = 1;
    public static final int SOURCE_UNKNOWN_VALUE = 0;
    private static final d94 internalValueMap = new j13();
    private final int value;

    TransportInfo$DispatchDestination(int i) {
        this.value = i;
    }

    public static TransportInfo$DispatchDestination forNumber(int i) {
        if (i == 0) {
            return SOURCE_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return FL_LEGACY_V1;
    }

    public static d94 internalGetValueMap() {
        return internalValueMap;
    }

    public static g94 internalGetVerifier() {
        return q41.f57244e;
    }

    @Override // p000.a94
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static TransportInfo$DispatchDestination valueOf(int i) {
        return forNumber(i);
    }
}
