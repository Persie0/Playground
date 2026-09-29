package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.ua */
/* JADX INFO: loaded from: classes.dex */
public final class C2866ua implements InterfaceC2853ta {

    /* JADX INFO: renamed from: a */
    public static final C2808q4 f14459a;

    /* JADX INFO: renamed from: b */
    public static final C2821r4 f14460b;

    /* JADX INFO: renamed from: c */
    public static final C2795p4 f14461c;

    /* JADX INFO: renamed from: d */
    public static final C2795p4 f14462d;

    /* JADX INFO: renamed from: e */
    public static final C2834s4 f14463e;

    static {
        C2847t4 c2847t4 = new C2847t4(C2769n4.m8075a(), false, true);
        f14459a = c2847t4.m8259c("measurement.test.boolean_flag", false);
        f14460b = new C2821r4(c2847t4, Double.valueOf(-3.0d));
        f14461c = c2847t4.m8257a("measurement.test.int_flag", -2L);
        f14462d = c2847t4.m8257a("measurement.test.long_flag", -1L);
        f14463e = new C2834s4(c2847t4, "measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2853ta
    /* JADX INFO: renamed from: a */
    public final String mo8266a() {
        return (String) f14463e.m8330b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2853ta
    /* JADX INFO: renamed from: b */
    public final boolean mo8267b() {
        return ((Boolean) f14459a.m8330b()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2853ta
    /* JADX INFO: renamed from: c */
    public final long mo8268c() {
        return ((Long) f14461c.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2853ta
    /* JADX INFO: renamed from: d */
    public final long mo8269d() {
        return ((Long) f14462d.m8330b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2853ta
    public final double zza() {
        return ((Double) f14460b.m8330b()).doubleValue();
    }
}
