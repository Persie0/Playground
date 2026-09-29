package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.ApiException;

/* JADX INFO: loaded from: classes.dex */
public final class zzmk extends RuntimeException {

    /* JADX INFO: renamed from: a */
    public final int f11920a;

    public zzmk(int i, String str, ApiException apiException) {
        String strValueOf;
        if (str != null) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + str.length());
            sb.append(i);
            sb.append(": ");
            sb.append(str);
            strValueOf = sb.toString();
        } else {
            strValueOf = String.valueOf(i);
        }
        super(strValueOf, apiException);
        this.f11920a = i;
    }
}
