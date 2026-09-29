package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2849t6 {

    /* JADX INFO: renamed from: a */
    public static final Charset f14439a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f14440b;

    static {
        Charset.forName("US-ASCII");
        f14439a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f14440b = bArr;
        ByteBuffer.wrap(bArr);
    }
}
