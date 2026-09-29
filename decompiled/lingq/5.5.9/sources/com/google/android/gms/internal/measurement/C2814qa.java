package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.qa */
/* JADX INFO: loaded from: classes.dex */
public final class C2814qa implements InterfaceC2801pa {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14406a;

    /* JADX INFO: renamed from: b */
    public static final C2808q4 f14407b;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), true, true);
        f14406a = c2847t4.m8259c("measurement.collection.client.log_target_api_version.dev", false);
        f14407b = c2847t4.m8259c("measurement.collection.service.log_target_api_version", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2801pa
    /* JADX INFO: renamed from: c */
    public final boolean mo8155c() {
        return ((Boolean) f14406a.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2801pa
    /* JADX INFO: renamed from: d */
    public final boolean mo8156d() {
        return ((Boolean) f14407b.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2801pa
    public final void zza() {
    }
}
