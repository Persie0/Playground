package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2872v3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2872v3 zza;
    private InterfaceC2836s6 zzd = C2850t7.f14441d;

    static {
        C2872v3 c2872v3 = new C2872v3();
        zza = c2872v3;
        AbstractC2771n6.m8083p(C2872v3.class, c2872v3);
    }

    /* JADX INFO: renamed from: v */
    public static C2872v3 m8303v() {
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2771n6
    /* JADX INFO: renamed from: s */
    public final Object mo7659s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C2863u7(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2885w3.class});
        }
        if (i11 == 3) {
            return new C2872v3();
        }
        Object obj = null;
        if (i11 == 4) {
            return new C2739l2(obj);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m8304t() {
        return this.zzd.size();
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC2836s6 m8305w() {
        return this.zzd;
    }
}
