package com.google.android.gms.common.api;

/* JADX INFO: loaded from: classes.dex */
public class ApiException extends Exception {

    /* JADX INFO: renamed from: a */
    public final Status f11645a;

    public ApiException(Status status) {
        int i = status.f11662a;
        String str = status.f11663b;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.f11645a = status;
    }
}
