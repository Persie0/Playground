package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2898x3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2898x3 zza;
    private int zzd;
    private InterfaceC2836s6 zze = C2850t7.f14441d;
    private C2872v3 zzf;

    static {
        C2898x3 c2898x3 = new C2898x3();
        zza = c2898x3;
        AbstractC2771n6.m8083p(C2898x3.class, c2898x3);
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
            return new C2863u7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", C2924z3.class, "zzf"});
        }
        if (i11 == 3) {
            return new C2898x3();
        }
        if (i11 == 4) {
            return new C2832s2(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final C2872v3 m8409t() {
        C2872v3 c2872v3 = this.zzf;
        return c2872v3 == null ? C2872v3.m8303v() : c2872v3;
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC2836s6 m8410v() {
        return this.zze;
    }
}
