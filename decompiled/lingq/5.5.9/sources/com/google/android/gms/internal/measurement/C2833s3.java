package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2833s3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2833s3 zza;
    private int zzd;
    private int zze;
    private InterfaceC2823r6 zzf = C2590a7.f14051d;

    static {
        C2833s3 c2833s3 = new C2833s3();
        zza = c2833s3;
        AbstractC2771n6.m8083p(C2833s3.class, c2833s3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A */
    public static void m8244A(C2833s3 c2833s3, List list) {
        InterfaceC2823r6 interfaceC2823r6 = c2833s3.zzf;
        if (!((AbstractC2770n5) interfaceC2823r6).f14334a) {
            c2833s3.zzf = AbstractC2771n6.m8080l(interfaceC2823r6);
        }
        AbstractC2756m5.m8064f(list, c2833s3.zzf);
    }

    /* JADX INFO: renamed from: w */
    public static C2820r3 m8245w() {
        return (C2820r3) zza.m8085i();
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m8247z(C2833s3 c2833s3, int i10) {
        c2833s3.zzd |= 1;
        c2833s3.zze = i10;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m8248B() {
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
            return new C2863u7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2833s3();
        }
        if (i11 == 4) {
            return new C2820r3(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m8249t() {
        return ((C2590a7) this.zzf).f14053c;
    }

    /* JADX INFO: renamed from: u */
    public final int m8250u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final long m8251v(int i10) {
        C2590a7 c2590a7 = (C2590a7) this.zzf;
        c2590a7.m7644g(i10);
        return c2590a7.f14052b[i10];
    }

    /* JADX INFO: renamed from: y */
    public final List m8252y() {
        return this.zzf;
    }
}
