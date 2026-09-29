package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p326q.C8446b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2769n4 {

    /* JADX INFO: renamed from: a */
    public static final C8446b f14333a = new C8446b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static synchronized Uri m8075a() {
        try {
            C8446b c8446b = f14333a;
            Uri uri = (Uri) c8446b.getOrDefault("com.google.android.gms.measurement", null);
            if (uri != null) {
                return uri;
            }
            Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
            c8446b.put("com.google.android.gms.measurement", uri2);
            return uri2;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
