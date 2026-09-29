package com.google.android.gms.common.internal.safeparcel;

import android.os.Parcel;
import p000.AbstractC3393o1;

/* JADX INFO: loaded from: classes.dex */
public class SafeParcelReader$ParseException extends RuntimeException {
    public SafeParcelReader$ParseException(String str, Parcel parcel) {
        int iDataPosition = parcel.dataPosition();
        int iDataSize = parcel.dataSize();
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(iDataPosition).length() + 6 + String.valueOf(iDataSize).length());
        AbstractC3393o1.m17748w(iDataPosition, str, " Parcel: pos=", " size=", sb);
        sb.append(iDataSize);
        super(sb.toString());
    }
}
