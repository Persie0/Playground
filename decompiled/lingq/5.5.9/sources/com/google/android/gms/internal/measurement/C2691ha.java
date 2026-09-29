package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ha */
/* JADX INFO: loaded from: classes.dex */
public final class C2691ha implements InterfaceC2677ga {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14240a;

    /* JADX INFO: renamed from: b */
    public static final C2808q4 f14241b;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), true, true);
        f14240a = c2847t4.m8259c("measurement.item_scoped_custom_parameters.client", true);
        f14241b = c2847t4.m8259c("measurement.item_scoped_custom_parameters.service", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2677ga
    /* JADX INFO: renamed from: c */
    public final boolean mo7860c() {
        return ((Boolean) f14240a.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2677ga
    /* JADX INFO: renamed from: d */
    public final boolean mo7861d() {
        return ((Boolean) f14241b.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2677ga
    public final void zza() {
    }
}
