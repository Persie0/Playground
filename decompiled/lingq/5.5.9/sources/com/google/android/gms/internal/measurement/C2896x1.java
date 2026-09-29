package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class C2896x1 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2896x1 zza;
    private int zzd;
    private int zze;
    private InterfaceC2836s6 zzf;
    private InterfaceC2836s6 zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        C2896x1 c2896x1 = new C2896x1();
        zza = c2896x1;
        AbstractC2771n6.m8083p(C2896x1.class, c2896x1);
    }

    public C2896x1() {
        C2850t7 c2850t7 = C2850t7.f14441d;
        this.zzf = c2850t7;
        this.zzg = c2850t7;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m8384B(C2896x1 c2896x1, int i10, C2669g2 c2669g2) {
        InterfaceC2836s6 interfaceC2836s6 = c2896x1.zzf;
        if (!interfaceC2836s6.mo8078d()) {
            c2896x1.zzf = AbstractC2771n6.m8081m(interfaceC2836s6);
        }
        c2896x1.zzf.set(i10, c2669g2);
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m8385C(C2896x1 c2896x1, int i10, C2922z1 c2922z1) {
        InterfaceC2836s6 interfaceC2836s6 = c2896x1.zzg;
        if (!interfaceC2836s6.mo8078d()) {
            c2896x1.zzg = AbstractC2771n6.m8081m(interfaceC2836s6);
        }
        c2896x1.zzg.set(i10, c2922z1);
    }

    /* JADX INFO: renamed from: A */
    public final InterfaceC2836s6 m8387A() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m8388D() {
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
            return new C2863u7(zza, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", C2669g2.class, "zzg", C2922z1.class, "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new C2896x1();
        }
        if (i11 == 4) {
            return new C2883w1(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m8389t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final int m8390u() {
        return this.zzg.size();
    }

    /* JADX INFO: renamed from: v */
    public final int m8391v() {
        return this.zzf.size();
    }

    /* JADX INFO: renamed from: x */
    public final C2922z1 m8392x(int i10) {
        return (C2922z1) this.zzg.get(i10);
    }

    /* JADX INFO: renamed from: y */
    public final C2669g2 m8393y(int i10) {
        return (C2669g2) this.zzf.get(i10);
    }

    /* JADX INFO: renamed from: z */
    public final List m8394z() {
        return this.zzg;
    }
}
