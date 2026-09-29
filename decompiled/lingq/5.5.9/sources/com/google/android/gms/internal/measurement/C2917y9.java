package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2917y9 implements InterfaceC2904x9 {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14515a;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), false, true);
        f14515a = c2847t4.m8259c("measurement.client.sessions.check_on_reset_and_enable2", true);
        c2847t4.m8259c("measurement.client.sessions.check_on_startup", true);
        c2847t4.m8259c("measurement.client.sessions.start_session_before_view_screen", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2904x9
    /* JADX INFO: renamed from: c */
    public final boolean mo8431c() {
        return ((Boolean) f14515a.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2904x9
    public final void zza() {
    }
}
