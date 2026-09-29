package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2670g3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2670g3 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private C2871v2 zzg;

    static {
        C2670g3 c2670g3 = new C2670g3();
        zza = c2670g3;
        AbstractC2771n6.m8083p(C2670g3.class, c2670g3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2771n6
    /* JADX INFO: renamed from: s */
    public final Object mo7659s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C2863u7(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new C2670g3();
        }
        Object obj = null;
        if (i11 == 4) {
            return new C2683h2(obj);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
