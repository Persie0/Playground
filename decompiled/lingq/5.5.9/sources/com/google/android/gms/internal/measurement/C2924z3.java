package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2924z3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2924z3 zza;
    private int zzd;
    private int zze;
    private InterfaceC2836s6 zzf = C2850t7.f14441d;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C2924z3 c2924z3 = new C2924z3();
        zza = c2924z3;
        AbstractC2771n6.m8083p(C2924z3.class, c2924z3);
    }

    /* JADX INFO: renamed from: A */
    public final boolean m8465A() {
        return (this.zzd & 16) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m8466B() {
        return (this.zzd & 4) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final int m8467C() {
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
        int i12 = 0;
        if (i11 == 2) {
            return new C2863u7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", C2911y3.f14512a, "zzf", C2924z3.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C2924z3();
        }
        if (i11 == 4) {
            return new C2613c2(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final double m8468t() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: v */
    public final String m8469v() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: w */
    public final String m8470w() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC2836s6 m8471x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m8472y() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m8473z() {
        return (this.zzd & 8) != 0;
    }
}
