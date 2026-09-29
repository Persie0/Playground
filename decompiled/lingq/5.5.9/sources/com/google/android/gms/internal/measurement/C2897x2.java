package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2897x2 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2897x2 zza;
    private int zzd;
    private int zze;
    private C2807q3 zzf;
    private C2807q3 zzg;
    private boolean zzh;

    static {
        C2897x2 c2897x2 = new C2897x2();
        zza = c2897x2;
        AbstractC2771n6.m8083p(C2897x2.class, c2897x2);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m8395A(C2897x2 c2897x2, C2807q3 c2807q3) {
        c2897x2.zzg = c2807q3;
        c2897x2.zzd |= 4;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m8396B(C2897x2 c2897x2, boolean z10) {
        c2897x2.zzd |= 8;
        c2897x2.zzh = z10;
    }

    /* JADX INFO: renamed from: u */
    public static C2884w2 m8397u() {
        return (C2884w2) zza.m8085i();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8399y(C2897x2 c2897x2, int i10) {
        c2897x2.zzd |= 1;
        c2897x2.zze = i10;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m8400z(C2897x2 c2897x2, C2807q3 c2807q3) {
        c2897x2.zzf = c2807q3;
        c2897x2.zzd |= 2;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m8401C() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m8402D() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m8403E() {
        return (this.zzd & 8) != 0;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m8404F() {
        return (this.zzd & 4) != 0;
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
            return new C2863u7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2897x2();
        }
        if (i11 == 4) {
            return new C2884w2(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m8405t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: w */
    public final C2807q3 m8406w() {
        C2807q3 c2807q3M8189z = this.zzf;
        if (c2807q3M8189z == null) {
            c2807q3M8189z = C2807q3.m8189z();
        }
        return c2807q3M8189z;
    }

    /* JADX INFO: renamed from: x */
    public final C2807q3 m8407x() {
        C2807q3 c2807q3 = this.zzg;
        return c2807q3 == null ? C2807q3.m8189z() : c2807q3;
    }
}
