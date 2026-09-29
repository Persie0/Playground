package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2711j2 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2711j2 zza;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private InterfaceC2836s6 zzh = C2850t7.f14441d;

    static {
        C2711j2 c2711j2 = new C2711j2();
        zza = c2711j2;
        AbstractC2771n6.m8083p(C2711j2.class, c2711j2);
    }

    /* JADX INFO: renamed from: v */
    public static C2711j2 m7881v() {
        return zza;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m7882A() {
        return (this.zzd & 2) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m7883B() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final int m7884C() {
        int iM7748a = C2630d5.m7748a(this.zze);
        if (iM7748a == 0) {
            return 1;
        }
        return iM7748a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2771n6
    /* JADX INFO: renamed from: s */
    public final Object mo7659s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C2863u7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", C2697i2.f14249a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2711j2();
        }
        if (i11 == 4) {
            return new C2683h2();
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m7885t() {
        return this.zzh.size();
    }

    /* JADX INFO: renamed from: w */
    public final String m7886w() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: x */
    public final InterfaceC2836s6 m7887x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m7888y() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m7889z() {
        return (this.zzd & 4) != 0;
    }
}
