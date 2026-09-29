package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2656f3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2656f3 zza;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private InterfaceC2836s6 zzj = C2850t7.f14441d;

    static {
        C2656f3 c2656f3 = new C2656f3();
        zza = c2656f3;
        AbstractC2771n6.m8083p(C2656f3.class, c2656f3);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m7801C(C2656f3 c2656f3, String str) {
        str.getClass();
        c2656f3.zzd |= 1;
        c2656f3.zze = str;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m7802D(C2656f3 c2656f3, String str) {
        str.getClass();
        c2656f3.zzd |= 2;
        c2656f3.zzf = str;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m7803E(C2656f3 c2656f3) {
        c2656f3.zzd &= -3;
        c2656f3.zzf = zza.zzf;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m7804F(C2656f3 c2656f3, long j10) {
        c2656f3.zzd |= 4;
        c2656f3.zzg = j10;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m7805G(C2656f3 c2656f3) {
        c2656f3.zzd &= -5;
        c2656f3.zzg = 0L;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m7806H(C2656f3 c2656f3, double d10) {
        c2656f3.zzd |= 16;
        c2656f3.zzi = d10;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m7807I(C2656f3 c2656f3) {
        c2656f3.zzd &= -17;
        c2656f3.zzi = 0.0d;
    }

    /* JADX INFO: renamed from: J */
    public static void m7808J(C2656f3 c2656f3, C2656f3 c2656f4) {
        InterfaceC2836s6 interfaceC2836s6 = c2656f3.zzj;
        if (!interfaceC2836s6.mo8078d()) {
            c2656f3.zzj = AbstractC2771n6.m8081m(interfaceC2836s6);
        }
        c2656f3.zzj.add(c2656f4);
    }

    /* JADX INFO: renamed from: K */
    public static void m7809K(C2656f3 c2656f3, ArrayList arrayList) {
        InterfaceC2836s6 interfaceC2836s6 = c2656f3.zzj;
        if (!interfaceC2836s6.mo8078d()) {
            c2656f3.zzj = AbstractC2771n6.m8081m(interfaceC2836s6);
        }
        AbstractC2756m5.m8064f(arrayList, c2656f3.zzj);
    }

    /* JADX INFO: renamed from: L */
    public static void m7810L(C2656f3 c2656f3) {
        c2656f3.zzj = C2850t7.f14441d;
    }

    /* JADX INFO: renamed from: x */
    public static C2642e3 m7811x() {
        return (C2642e3) zza.m8085i();
    }

    /* JADX INFO: renamed from: A */
    public final String m7813A() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: B */
    public final List m7814B() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m7815M() {
        return (this.zzd & 16) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final boolean m7816N() {
        return (this.zzd & 8) != 0;
    }

    /* JADX INFO: renamed from: O */
    public final boolean m7817O() {
        return (this.zzd & 4) != 0;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m7818P() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m7819Q() {
        return (this.zzd & 2) != 0;
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
            return new C2863u7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", C2656f3.class});
        }
        if (i11 == 3) {
            return new C2656f3();
        }
        if (i11 == 4) {
            return new C2642e3(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final double m7820t() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: u */
    public final float m7821u() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: v */
    public final int m7822v() {
        return this.zzj.size();
    }

    /* JADX INFO: renamed from: w */
    public final long m7823w() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final String m7824z() {
        return this.zze;
    }
}
