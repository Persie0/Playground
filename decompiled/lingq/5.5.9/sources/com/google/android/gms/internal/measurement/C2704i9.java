package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2704i9 implements InterfaceC2690h9 {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14253a;

    /* JADX INFO: renamed from: b */
    public static final C2808q4 f14254b;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), true, true);
        c2847t4.m8259c("measurement.collection.event_safelist", true);
        f14253a = c2847t4.m8259c("measurement.service.store_null_safelist", true);
        f14254b = c2847t4.m8259c("measurement.service.store_safelist", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2690h9
    /* JADX INFO: renamed from: c */
    public final boolean mo7876c() {
        return ((Boolean) f14253a.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2690h9
    /* JADX INFO: renamed from: d */
    public final boolean mo7877d() {
        return ((Boolean) f14254b.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2690h9
    public final void zza() {
    }
}
