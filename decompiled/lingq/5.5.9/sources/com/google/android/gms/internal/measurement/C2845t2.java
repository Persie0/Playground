package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2845t2 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2845t2 zza;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C2845t2 c2845t2 = new C2845t2();
        zza = c2845t2;
        AbstractC2771n6.m8083p(C2845t2.class, c2845t2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2771n6
    /* JADX INFO: renamed from: s */
    public final Object mo7659s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C2863u7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new C2845t2();
        }
        if (i11 == 4) {
            return new C2832s2();
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: u */
    public final String m8255u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final String m8256v() {
        return this.zzf;
    }
}
