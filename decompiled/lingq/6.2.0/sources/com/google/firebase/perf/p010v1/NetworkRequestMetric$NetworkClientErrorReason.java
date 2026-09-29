package com.google.firebase.perf.p010v1;

import p000.a94;
import p000.d94;
import p000.g94;
import p000.nj0;
import p000.u06;

/* JADX INFO: loaded from: classes.dex */
public enum NetworkRequestMetric$NetworkClientErrorReason implements a94 {
    NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
    GENERIC_CLIENT_ERROR(1);

    public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
    public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
    private static final d94 internalValueMap = new nj0(14);
    private final int value;

    NetworkRequestMetric$NetworkClientErrorReason(int i) {
        this.value = i;
    }

    public static NetworkRequestMetric$NetworkClientErrorReason forNumber(int i) {
        if (i == 0) {
            return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
        }
        if (i != 1) {
            return null;
        }
        return GENERIC_CLIENT_ERROR;
    }

    public static d94 internalGetValueMap() {
        return internalValueMap;
    }

    public static g94 internalGetVerifier() {
        return u06.f63176d;
    }

    @Override // p000.a94
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static NetworkRequestMetric$NetworkClientErrorReason valueOf(int i) {
        return forNumber(i);
    }
}
