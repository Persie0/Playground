package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2787o9 implements InterfaceC2774n9 {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14370a;

    /* JADX INFO: renamed from: b */
    public static final C2808q4 f14371b;

    /* JADX INFO: renamed from: c */
    public static final C2808q4 f14372c;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), false, true);
        c2847t4.m8259c("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f14370a = c2847t4.m8259c("measurement.audience.refresh_event_count_filters_timestamp", false);
        f14371b = c2847t4.m8259c("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f14372c = c2847t4.m8259c("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2774n9
    /* JADX INFO: renamed from: a */
    public final boolean mo8134a() {
        return ((Boolean) f14372c.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2774n9
    /* JADX INFO: renamed from: c */
    public final boolean mo8135c() {
        return ((Boolean) f14370a.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2774n9
    /* JADX INFO: renamed from: d */
    public final boolean mo8136d() {
        return ((Boolean) f14371b.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2774n9
    public final void zza() {
    }
}
