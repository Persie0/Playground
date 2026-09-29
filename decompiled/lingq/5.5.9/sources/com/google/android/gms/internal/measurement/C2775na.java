package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.na */
/* JADX INFO: loaded from: classes.dex */
public final class C2775na implements InterfaceC2761ma {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14350a;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), false, true);
        c2847t4.m8257a("measurement.id.lifecycle.app_in_background_parameter", 0L);
        c2847t4.m8259c("measurement.lifecycle.app_backgrounded_tracking", true);
        f14350a = c2847t4.m8259c("measurement.lifecycle.app_in_background_parameter", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2761ma
    public final boolean zza() {
        return ((Boolean) f14350a.m8330b()).booleanValue();
    }
}
