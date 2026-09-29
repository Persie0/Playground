package com.lingq.core.network.adapters;

import com.lingq.core.domain.model.repo.NetworkErrorType;

/* JADX INFO: renamed from: com.lingq.core.network.adapters.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1554b {
    /* JADX INFO: renamed from: a */
    public static final NetworkErrorType m8250a(NetworkResponse.Error error) {
        Integer code = error.getCode();
        if (code != null && code.intValue() == 400) {
            return NetworkErrorType.BAD_REQUEST;
        }
        if (code != null && code.intValue() == 401) {
            return NetworkErrorType.UNAUTHORIZED;
        }
        if (code != null && code.intValue() == 403) {
            return NetworkErrorType.FORBIDDEN;
        }
        if (code != null && code.intValue() == 404) {
            return NetworkErrorType.NOT_FOUND;
        }
        if (code != null && code.intValue() == 408) {
            return NetworkErrorType.TIMEOUT;
        }
        if (code != null && code.intValue() == 429) {
            return NetworkErrorType.TOO_MANY_REQUESTS;
        }
        if (code != null && code.intValue() == 500) {
            return NetworkErrorType.INTERNAL_SERVER_ERROR;
        }
        if (code != null && code.intValue() == 502) {
            return NetworkErrorType.BAD_GATEWAY;
        }
        if (code != null && code.intValue() == 503) {
            return NetworkErrorType.SERVICE_UNAVAILABLE;
        }
        return (code != null && code.intValue() == 504) ? NetworkErrorType.GATEWAY_TIMEOUT : NetworkErrorType.UNKNOWN;
    }
}
