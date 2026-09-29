package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.vb */
/* JADX INFO: loaded from: classes.dex */
public final class C2880vb implements InterfaceC2867ub {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14481a;

    /* JADX INFO: renamed from: b */
    public static final C2808q4 f14482b;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), true, true);
        f14481a = c2847t4.m8259c("measurement.sgtm.client.dev", false);
        f14482b = c2847t4.m8259c("measurement.sgtm.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867ub
    /* JADX INFO: renamed from: c */
    public final boolean mo8296c() {
        return ((Boolean) f14481a.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867ub
    /* JADX INFO: renamed from: d */
    public final boolean mo8297d() {
        return ((Boolean) f14482b.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2867ub
    public final void zza() {
    }
}
