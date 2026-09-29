package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2600b3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2600b3 zza;
    private int zzd;
    private InterfaceC2836s6 zze = C2850t7.f14441d;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        C2600b3 c2600b3 = new C2600b3();
        zza = c2600b3;
        AbstractC2771n6.m8083p(C2600b3.class, c2600b3);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m7664C(C2600b3 c2600b3, int i10, C2656f3 c2656f3) {
        c2600b3.m7679N();
        c2600b3.zze.set(i10, c2656f3);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m7665D(C2600b3 c2600b3, C2656f3 c2656f3) {
        c2600b3.m7679N();
        c2600b3.zze.add(c2656f3);
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m7666E(C2600b3 c2600b3, Iterable iterable) {
        c2600b3.m7679N();
        AbstractC2756m5.m8064f(iterable, c2600b3.zze);
    }

    /* JADX INFO: renamed from: F */
    public static void m7667F(C2600b3 c2600b3) {
        c2600b3.zze = C2850t7.f14441d;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m7668G(C2600b3 c2600b3, int i10) {
        c2600b3.m7679N();
        c2600b3.zze.remove(i10);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m7669H(C2600b3 c2600b3, String str) {
        str.getClass();
        c2600b3.zzd |= 1;
        c2600b3.zzf = str;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m7670I(long j10, C2600b3 c2600b3) {
        c2600b3.zzd |= 2;
        c2600b3.zzg = j10;
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m7671J(long j10, C2600b3 c2600b3) {
        c2600b3.zzd |= 4;
        c2600b3.zzh = j10;
    }

    /* JADX INFO: renamed from: x */
    public static C2586a3 m7672x() {
        return (C2586a3) zza.m8085i();
    }

    /* JADX INFO: renamed from: A */
    public final String m7674A() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: B */
    public final List m7675B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m7676K() {
        return (this.zzd & 8) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m7677L() {
        return (this.zzd & 4) != 0;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m7678M() {
        return (this.zzd & 2) != 0;
    }

    /* JADX INFO: renamed from: N */
    public final void m7679N() {
        InterfaceC2836s6 interfaceC2836s6 = this.zze;
        if (!interfaceC2836s6.mo8078d()) {
            this.zze = AbstractC2771n6.m8081m(interfaceC2836s6);
        }
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
            return new C2863u7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", C2656f3.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C2600b3();
        }
        if (i11 == 4) {
            return new C2586a3(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m7680t() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: u */
    public final int m7681u() {
        return this.zze.size();
    }

    /* JADX INFO: renamed from: v */
    public final long m7682v() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: w */
    public final long m7683w() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final C2656f3 m7684z(int i10) {
        return (C2656f3) this.zze.get(i10);
    }
}
