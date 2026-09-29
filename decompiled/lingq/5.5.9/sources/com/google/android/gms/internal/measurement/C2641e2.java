package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2641e2 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2641e2 zza;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        C2641e2 c2641e2 = new C2641e2();
        zza = c2641e2;
        AbstractC2771n6.m8083p(C2641e2.class, c2641e2);
    }

    /* JADX INFO: renamed from: u */
    public static C2641e2 m7754u() {
        return zza;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m7755A() {
        return (this.zzd & 4) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m7756B() {
        return (this.zzd & 2) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m7757C() {
        return (this.zzd & 16) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m7758D() {
        return (this.zzd & 8) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final int m7759E() {
        int i10;
        int i11 = this.zze;
        if (i11 != 0) {
            i10 = 2;
            if (i11 != 1) {
                if (i11 != 2) {
                    i10 = 4;
                    if (i11 != 3) {
                        i10 = i11 != 4 ? 0 : 5;
                    }
                } else {
                    i10 = 3;
                }
            }
        } else {
            i10 = 1;
        }
        if (i10 == 0) {
            return 1;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2771n6
    /* JADX INFO: renamed from: s */
    public final Object mo7659s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C2863u7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", C2627d2.f14148a, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C2641e2();
        }
        if (i11 == 4) {
            return new C2613c2();
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: v */
    public final String m7760v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final String m7761w() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: x */
    public final String m7762x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m7763y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m7764z() {
        return (this.zzd & 1) != 0;
    }
}
