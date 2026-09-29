package com.lingq.core.domain.model.repo;

import kotlin.enums.AbstractC3201a;
import p000.ys2;

/* JADX INFO: loaded from: classes.dex */
public enum NetworkErrorType {
    NO_INTERNET_CONNECTION,
    TIMEOUT,
    UNKNOWN,
    UNAUTHORIZED,
    FORBIDDEN,
    BAD_REQUEST,
    NOT_FOUND,
    SERVER_ERROR,
    SERVICE_UNAVAILABLE,
    GATEWAY_TIMEOUT,
    TOO_MANY_REQUESTS,
    INTERNAL_SERVER_ERROR,
    BAD_GATEWAY,
    NOT_IMPLEMENTED,
    BAD_GATEWAY_ERROR,
    GATEWAY_TIMEOUT_ERROR,
    SERVICE_UNAVAILABLE_ERROR,
    TOO_MANY_REQUESTS_ERROR,
    INTERNAL_SERVER_ERROR_ERROR,
    NOT_IMPLEMENTED_ERROR;

    private static final /* synthetic */ ys2 $ENTRIES = AbstractC3201a.m15404a(values());

    public static ys2 getEntries() {
        return $ENTRIES;
    }
}
