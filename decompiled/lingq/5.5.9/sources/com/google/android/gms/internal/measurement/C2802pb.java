package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.pb */
/* JADX INFO: loaded from: classes.dex */
public final class C2802pb implements InterfaceC2789ob {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14394a;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), true, true);
        c2847t4.m8259c("measurement.client.sessions.background_sessions_enabled", true);
        f14394a = c2847t4.m8259c("measurement.client.sessions.enable_fix_background_engagement", false);
        c2847t4.m8259c("measurement.client.sessions.immediate_start_enabled_foreground", true);
        c2847t4.m8259c("measurement.client.sessions.remove_expired_session_properties_enabled", true);
        c2847t4.m8259c("measurement.client.sessions.session_id_enabled", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2789ob
    public final boolean zza() {
        return ((Boolean) f14394a.m8330b()).booleanValue();
    }
}
