package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2712j3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2712j3 zza;
    private InterfaceC2836s6 zzd = C2850t7.f14441d;

    static {
        C2712j3 c2712j3 = new C2712j3();
        zza = c2712j3;
        AbstractC2771n6.m8083p(C2712j3.class, c2712j3);
    }

    /* JADX INFO: renamed from: t */
    public static C2698i3 m7890t() {
        return (C2698i3) zza.m8085i();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m7892x(C2712j3 c2712j3, C2740l3 c2740l3) {
        InterfaceC2836s6 interfaceC2836s6 = c2712j3.zzd;
        if (!interfaceC2836s6.mo8078d()) {
            c2712j3.zzd = AbstractC2771n6.m8081m(interfaceC2836s6);
        }
        c2712j3.zzd.add(c2740l3);
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
            return new C2863u7(zza, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C2740l3.class});
        }
        if (i11 == 3) {
            return new C2712j3();
        }
        if (i11 == 4) {
            return new C2698i3(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: v */
    public final C2740l3 m7893v() {
        return (C2740l3) this.zzd.get(0);
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC2836s6 m7894w() {
        return this.zzd;
    }
}
