package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2662f9 implements InterfaceC2648e9 {

    /* JADX INFO: renamed from: a */
    public static final C2795p4 f14197a;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), false, true);
        c2847t4.m8259c("measurement.client.consent_state_v1", true);
        c2847t4.m8259c("measurement.client.3p_consent_state_v1", true);
        c2847t4.m8259c("measurement.service.consent_state_v1_W36", true);
        f14197a = c2847t4.m8257a("measurement.service.storage_consent_support_version", 203600L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2648e9
    public final long zza() {
        return ((Long) f14197a.m8330b()).longValue();
    }
}
