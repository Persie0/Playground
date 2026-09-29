package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2923z2 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2923z2 zza;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        C2923z2 c2923z2 = new C2923z2();
        zza = c2923z2;
        AbstractC2771n6.m8083p(C2923z2.class, c2923z2);
    }

    /* JADX INFO: renamed from: v */
    public static C2910y2 m8456v() {
        return (C2910y2) zza.m8085i();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m8458x(C2923z2 c2923z2, int i10) {
        c2923z2.zzd |= 1;
        c2923z2.zze = i10;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m8459y(C2923z2 c2923z2, long j10) {
        c2923z2.zzd |= 2;
        c2923z2.zzf = j10;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m8460A() {
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
            return new C2863u7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2923z2();
        }
        if (i11 == 4) {
            return new C2910y2(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m8461t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final long m8462u() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m8463z() {
        return (this.zzd & 2) != 0;
    }
}
