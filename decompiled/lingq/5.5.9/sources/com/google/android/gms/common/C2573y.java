package com.google.android.gms.common;

/* JADX INFO: renamed from: com.google.android.gms.common.y */
/* JADX INFO: loaded from: classes.dex */
public class C2573y {

    /* JADX INFO: renamed from: d */
    public static final C2573y f14004d = new C2573y(true, null, null);

    /* JADX INFO: renamed from: a */
    public final boolean f14005a;

    /* JADX INFO: renamed from: b */
    public final String f14006b;

    /* JADX INFO: renamed from: c */
    public final Throwable f14007c;

    public C2573y(boolean z10, String str, Exception exc) {
        this.f14005a = z10;
        this.f14006b = str;
        this.f14007c = exc;
    }

    /* JADX INFO: renamed from: b */
    public static C2573y m7620b(String str) {
        return new C2573y(false, str, null);
    }

    /* JADX INFO: renamed from: c */
    public static C2573y m7621c(String str, Exception exc) {
        return new C2573y(false, str, exc);
    }

    /* JADX INFO: renamed from: a */
    public String mo7619a() {
        return this.f14006b;
    }
}
