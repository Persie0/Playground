package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ka */
/* JADX INFO: loaded from: classes.dex */
public final class C2733ka implements InterfaceC2719ja {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14293a;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), false, true);
        c2847t4.m8259c("measurement.sdk.collection.enable_extend_user_property_size", true);
        c2847t4.m8259c("measurement.sdk.collection.last_deep_link_referrer2", true);
        f14293a = c2847t4.m8259c("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
        c2847t4.m8257a("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2719ja
    public final boolean zza() {
        return ((Boolean) f14293a.m8330b()).booleanValue();
    }
}
