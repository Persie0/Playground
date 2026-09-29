package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.mb */
/* JADX INFO: loaded from: classes.dex */
public final class C2762mb implements InterfaceC2748lb {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14316a;

    /* JADX INFO: renamed from: b */
    public static final C2808q4 f14317b;

    /* JADX INFO: renamed from: c */
    public static final C2808q4 f14318c;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), true, true);
        f14316a = c2847t4.m8259c("measurement.collection.enable_session_stitching_token.client.dev", true);
        f14317b = c2847t4.m8259c("measurement.collection.enable_session_stitching_token.first_open_fix", true);
        f14318c = c2847t4.m8259c("measurement.session_stitching_token_enabled", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2748lb
    /* JADX INFO: renamed from: a */
    public final boolean mo8054a() {
        return ((Boolean) f14318c.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2748lb
    /* JADX INFO: renamed from: c */
    public final boolean mo8055c() {
        return ((Boolean) f14316a.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2748lb
    /* JADX INFO: renamed from: d */
    public final boolean mo8056d() {
        return ((Boolean) f14317b.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2748lb
    public final void zza() {
    }
}
