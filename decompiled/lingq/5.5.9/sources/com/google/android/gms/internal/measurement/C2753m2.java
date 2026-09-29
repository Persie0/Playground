package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2753m2 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2753m2 zza;
    private int zzd;
    private String zze = "";
    private InterfaceC2836s6 zzf = C2850t7.f14441d;
    private boolean zzg;

    static {
        C2753m2 c2753m2 = new C2753m2();
        zza = c2753m2;
        AbstractC2771n6.m8083p(C2753m2.class, c2753m2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2771n6
    /* JADX INFO: renamed from: s */
    public final Object mo7659s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C2863u7(zza, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", C2819r2.class, "zzg"});
        }
        if (i11 == 3) {
            return new C2753m2();
        }
        if (i11 == 4) {
            return new C2739l2();
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: u */
    public final String m8062u() {
        return this.zze;
    }
}
