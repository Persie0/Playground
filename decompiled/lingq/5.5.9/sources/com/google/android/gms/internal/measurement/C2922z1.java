package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2922z1 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2922z1 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private InterfaceC2836s6 zzg = C2850t7.f14441d;
    private boolean zzh;
    private C2641e2 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        C2922z1 c2922z1 = new C2922z1();
        zza = c2922z1;
        AbstractC2771n6.m8083p(C2922z1.class, c2922z1);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m8440B(C2922z1 c2922z1, String str) {
        c2922z1.zzd |= 2;
        c2922z1.zzf = str;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m8441C(C2922z1 c2922z1, int i10, C2599b2 c2599b2) {
        InterfaceC2836s6 interfaceC2836s6 = c2922z1.zzg;
        if (!interfaceC2836s6.mo8078d()) {
            c2922z1.zzg = AbstractC2771n6.m8081m(interfaceC2836s6);
        }
        c2922z1.zzg.set(i10, c2599b2);
    }

    /* JADX INFO: renamed from: v */
    public static C2909y1 m8442v() {
        return (C2909y1) zza.m8085i();
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC2836s6 m8444A() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m8445D() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m8446E() {
        return this.zzk;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m8447F() {
        return this.zzl;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m8448G() {
        return (this.zzd & 8) != 0;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m8449H() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: renamed from: I */
    public final boolean m8450I() {
        return (this.zzd & 64) != 0;
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
            return new C2863u7(zza, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", C2599b2.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new C2922z1();
        }
        if (i11 == 4) {
            return new C2909y1(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m8451t() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: u */
    public final int m8452u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: x */
    public final C2599b2 m8453x(int i10) {
        return (C2599b2) this.zzg.get(i10);
    }

    /* JADX INFO: renamed from: y */
    public final C2641e2 m8454y() {
        C2641e2 c2641e2M7754u = this.zzi;
        if (c2641e2M7754u == null) {
            c2641e2M7754u = C2641e2.m7754u();
        }
        return c2641e2M7754u;
    }

    /* JADX INFO: renamed from: z */
    public final String m8455z() {
        return this.zzf;
    }
}
