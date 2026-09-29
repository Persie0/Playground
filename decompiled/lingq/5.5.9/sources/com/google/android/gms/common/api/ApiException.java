package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public ApiException(Status status) {
        int i10 = status.f13879b;
        String str = status.f13880c;
        super(i10 + ": " + (str == null ? "" : str));
    }
}
