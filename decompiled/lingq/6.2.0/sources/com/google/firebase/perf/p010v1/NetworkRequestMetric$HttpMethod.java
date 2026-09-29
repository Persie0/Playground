package com.google.firebase.perf.p010v1;

import p000.a94;
import p000.d94;
import p000.g94;
import p000.g9c;
import p000.jj5;

/* JADX INFO: loaded from: classes.dex */
public enum NetworkRequestMetric$HttpMethod implements a94 {
    HTTP_METHOD_UNKNOWN(0),
    GET(1),
    PUT(2),
    POST(3),
    DELETE(4),
    HEAD(5),
    PATCH(6),
    OPTIONS(7),
    TRACE(8),
    CONNECT(9);

    public static final int CONNECT_VALUE = 9;
    public static final int DELETE_VALUE = 4;
    public static final int GET_VALUE = 1;
    public static final int HEAD_VALUE = 5;
    public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
    public static final int OPTIONS_VALUE = 7;
    public static final int PATCH_VALUE = 6;
    public static final int POST_VALUE = 3;
    public static final int PUT_VALUE = 2;
    public static final int TRACE_VALUE = 8;
    private static final d94 internalValueMap = new g9c(13);
    private final int value;

    NetworkRequestMetric$HttpMethod(int i) {
        this.value = i;
    }

    public static NetworkRequestMetric$HttpMethod forNumber(int i) {
        switch (i) {
            case 0:
                return HTTP_METHOD_UNKNOWN;
            case 1:
                return GET;
            case 2:
                return PUT;
            case 3:
                return POST;
            case 4:
                return DELETE;
            case 5:
                return HEAD;
            case 6:
                return PATCH;
            case 7:
                return OPTIONS;
            case 8:
                return TRACE;
            case 9:
                return CONNECT;
            default:
                return null;
        }
    }

    public static d94 internalGetValueMap() {
        return internalValueMap;
    }

    public static g94 internalGetVerifier() {
        return jj5.f45613d;
    }

    @Override // p000.a94
    public final int getNumber() {
        return this.value;
    }

    @Deprecated
    public static NetworkRequestMetric$HttpMethod valueOf(int i) {
        return forNumber(i);
    }
}
