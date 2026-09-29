package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2807q3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2807q3 zza;
    private InterfaceC2823r6 zzd;
    private InterfaceC2823r6 zze;
    private InterfaceC2836s6 zzf;
    private InterfaceC2836s6 zzg;

    static {
        C2807q3 c2807q3 = new C2807q3();
        zza = c2807q3;
        AbstractC2771n6.m8083p(C2807q3.class, c2807q3);
    }

    public C2807q3() {
        C2590a7 c2590a7 = C2590a7.f14051d;
        this.zzd = c2590a7;
        this.zze = c2590a7;
        C2850t7 c2850t7 = C2850t7.f14441d;
        this.zzf = c2850t7;
        this.zzg = c2850t7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E */
    public static void m8179E(C2807q3 c2807q3, List list) {
        InterfaceC2823r6 interfaceC2823r6 = c2807q3.zzd;
        if (!((AbstractC2770n5) interfaceC2823r6).f14334a) {
            c2807q3.zzd = AbstractC2771n6.m8080l(interfaceC2823r6);
        }
        AbstractC2756m5.m8064f(list, c2807q3.zzd);
    }

    /* JADX INFO: renamed from: F */
    public static void m8180F(C2807q3 c2807q3) {
        c2807q3.zzd = C2590a7.f14051d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public static void m8181G(C2807q3 c2807q3, List list) {
        InterfaceC2823r6 interfaceC2823r6 = c2807q3.zze;
        if (!((AbstractC2770n5) interfaceC2823r6).f14334a) {
            c2807q3.zze = AbstractC2771n6.m8080l(interfaceC2823r6);
        }
        AbstractC2756m5.m8064f(list, c2807q3.zze);
    }

    /* JADX INFO: renamed from: H */
    public static void m8182H(C2807q3 c2807q3) {
        c2807q3.zze = C2590a7.f14051d;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m8183I(C2807q3 c2807q3, ArrayList arrayList) {
        InterfaceC2836s6 interfaceC2836s6 = c2807q3.zzf;
        if (!interfaceC2836s6.mo8078d()) {
            c2807q3.zzf = AbstractC2771n6.m8081m(interfaceC2836s6);
        }
        AbstractC2756m5.m8064f(arrayList, c2807q3.zzf);
    }

    /* JADX INFO: renamed from: J */
    public static void m8184J(C2807q3 c2807q3) {
        c2807q3.zzf = C2850t7.f14441d;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m8185K(C2807q3 c2807q3, List list) {
        InterfaceC2836s6 interfaceC2836s6 = c2807q3.zzg;
        if (!interfaceC2836s6.mo8078d()) {
            c2807q3.zzg = AbstractC2771n6.m8081m(interfaceC2836s6);
        }
        AbstractC2756m5.m8064f(list, c2807q3.zzg);
    }

    /* JADX INFO: renamed from: L */
    public static void m8186L(C2807q3 c2807q3) {
        c2807q3.zzg = C2850t7.f14441d;
    }

    /* JADX INFO: renamed from: x */
    public static C2794p3 m8187x() {
        return (C2794p3) zza.m8085i();
    }

    /* JADX INFO: renamed from: z */
    public static C2807q3 m8189z() {
        return zza;
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC2836s6 m8190A() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: B */
    public final List m8191B() {
        return this.zze;
    }

    /* JADX INFO: renamed from: C */
    public final InterfaceC2836s6 m8192C() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: D */
    public final InterfaceC2823r6 m8193D() {
        return this.zzd;
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
            return new C2863u7(zza, "\u0001\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", C2923z2.class, "zzg", C2833s3.class});
        }
        if (i11 == 3) {
            return new C2807q3();
        }
        if (i11 == 4) {
            return new C2794p3(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m8194t() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: u */
    public final int m8195u() {
        return ((C2590a7) this.zze).f14053c;
    }

    /* JADX INFO: renamed from: v */
    public final int m8196v() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: w */
    public final int m8197w() {
        return ((C2590a7) this.zzd).f14053c;
    }
}
