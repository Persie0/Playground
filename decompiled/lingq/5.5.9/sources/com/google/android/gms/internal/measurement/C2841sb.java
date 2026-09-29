package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.sb */
/* JADX INFO: loaded from: classes.dex */
public final class C2841sb implements InterfaceC2828rb {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14430a;

    /* JADX INFO: renamed from: b */
    public static final C2808q4 f14431b;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), true, true);
        f14430a = c2847t4.m8259c("measurement.sfmc.client", false);
        f14431b = c2847t4.m8259c("measurement.sfmc.service", false);
        c2847t4.m8257a("measurement.id.sfmc.client", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2828rb
    /* JADX INFO: renamed from: c */
    public final boolean mo8242c() {
        return ((Boolean) f14430a.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2828rb
    /* JADX INFO: renamed from: d */
    public final boolean mo8243d() {
        return ((Boolean) f14431b.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2828rb
    public final void zza() {
    }
}
