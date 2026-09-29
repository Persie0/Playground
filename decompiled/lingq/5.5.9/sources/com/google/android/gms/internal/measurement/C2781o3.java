package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2781o3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2781o3 zza;
    private int zzd;
    private int zze = 1;
    private InterfaceC2836s6 zzf = C2850t7.f14441d;

    static {
        C2781o3 c2781o3 = new C2781o3();
        zza = c2781o3;
        AbstractC2771n6.m8083p(C2781o3.class, c2781o3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2771n6
    /* JADX INFO: renamed from: s */
    public final Object mo7659s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        int i12 = 0;
        if (i11 == 2) {
            return new C2863u7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b", new Object[]{"zzd", "zze", C2768n3.f14332a, "zzf", C2628d3.class});
        }
        if (i11 == 3) {
            return new C2781o3();
        }
        if (i11 == 4) {
            return new C2754m3(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
