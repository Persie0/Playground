package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.db */
/* JADX INFO: loaded from: classes.dex */
public final class C2636db implements InterfaceC2622cb {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14158a;

    /* JADX INFO: renamed from: b */
    public static final C2808q4 f14159b;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), true, true);
        c2847t4.m8259c("measurement.redaction.app_instance_id", true);
        c2847t4.m8259c("measurement.redaction.client_ephemeral_aiid_generation", true);
        c2847t4.m8259c("measurement.redaction.config_redacted_fields", true);
        c2847t4.m8259c("measurement.redaction.device_info", true);
        c2847t4.m8259c("measurement.redaction.e_tag", true);
        c2847t4.m8259c("measurement.redaction.enhanced_uid", true);
        c2847t4.m8259c("measurement.redaction.populate_ephemeral_app_instance_id", true);
        c2847t4.m8259c("measurement.redaction.google_signals", true);
        c2847t4.m8259c("measurement.redaction.no_aiid_in_config_request", true);
        f14158a = c2847t4.m8259c("measurement.redaction.retain_major_os_version", true);
        f14159b = c2847t4.m8259c("measurement.redaction.scion_payload_generator", true);
        c2847t4.m8259c("measurement.redaction.upload_redacted_fields", true);
        c2847t4.m8259c("measurement.redaction.upload_subdomain_override", true);
        c2847t4.m8259c("measurement.redaction.user_id", true);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2622cb
    /* JADX INFO: renamed from: c */
    public final boolean mo7742c() {
        return ((Boolean) f14159b.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2622cb
    public final boolean zza() {
        return ((Boolean) f14158a.m8330b()).booleanValue();
    }
}
