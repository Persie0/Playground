package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2847t4 {

    /* JADX INFO: renamed from: a */
    public final Uri f14436a;

    /* JADX INFO: renamed from: b */
    public final boolean f14437b;

    public C2847t4(Uri uri, boolean z10, boolean z11) {
        this.f14436a = uri;
        this.f14437b = z10;
    }

    /* JADX INFO: renamed from: a */
    public final C2795p4 m8257a(String str, long j10) {
        return new C2795p4(this, str, Long.valueOf(j10));
    }

    /* JADX INFO: renamed from: b */
    public final C2834s4 m8258b(String str, String str2) {
        return new C2834s4(this, str, str2);
    }

    /* JADX INFO: renamed from: c */
    public final C2808q4 m8259c(String str, boolean z10) {
        return new C2808q4(this, str, Boolean.valueOf(z10));
    }
}
