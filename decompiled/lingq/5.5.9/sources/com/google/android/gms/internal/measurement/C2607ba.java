package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ba */
/* JADX INFO: loaded from: classes.dex */
public final class C2607ba implements InterfaceC2593aa {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14070a;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), true, true);
        c2847t4.m8259c("measurement.client.global_params", true);
        c2847t4.m8259c("measurement.service.global_params_in_payload", true);
        f14070a = c2847t4.m8259c("measurement.service.clear_global_params_on_uninstall", true);
        c2847t4.m8259c("measurement.service.global_params", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2593aa
    /* JADX INFO: renamed from: c */
    public final boolean mo7648c() {
        return ((Boolean) f14070a.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2593aa
    public final void zza() {
    }
}
