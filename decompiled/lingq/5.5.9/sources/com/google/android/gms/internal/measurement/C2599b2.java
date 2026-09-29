package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2599b2 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2599b2 zza;
    private int zzd;
    private C2711j2 zze;
    private C2641e2 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        C2599b2 c2599b2 = new C2599b2();
        zza = c2599b2;
        AbstractC2771n6.m8083p(C2599b2.class, c2599b2);
    }

    /* JADX INFO: renamed from: u */
    public static C2599b2 m7653u() {
        return zza;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m7654y(C2599b2 c2599b2, String str) {
        c2599b2.zzd |= 8;
        c2599b2.zzh = str;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m7655A() {
        return (this.zzd & 4) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m7656B() {
        return (this.zzd & 2) != 0;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m7657C() {
        return (this.zzd & 8) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m7658D() {
        return (this.zzd & 1) != 0;
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
            return new C2863u7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2599b2();
        }
        if (i11 == 4) {
            return new C2585a2(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: v */
    public final C2641e2 m7660v() {
        C2641e2 c2641e2M7754u = this.zzf;
        if (c2641e2M7754u == null) {
            c2641e2M7754u = C2641e2.m7754u();
        }
        return c2641e2M7754u;
    }

    /* JADX INFO: renamed from: w */
    public final C2711j2 m7661w() {
        C2711j2 c2711j2M7881v = this.zze;
        if (c2711j2M7881v == null) {
            c2711j2M7881v = C2711j2.m7881v();
        }
        return c2711j2M7881v;
    }

    /* JADX INFO: renamed from: x */
    public final String m7662x() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m7663z() {
        return this.zzg;
    }
}
