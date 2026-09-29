package com.google.android.gms.internal.measurement;

import androidx.activity.result.C0204c;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2885w3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2885w3 zza;
    private int zzd;
    private String zze = "";
    private InterfaceC2836s6 zzf = C2850t7.f14441d;

    static {
        C2885w3 c2885w3 = new C2885w3();
        zza = c2885w3;
        AbstractC2771n6.m8083p(C2885w3.class, c2885w3);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2771n6
    /* JADX INFO: renamed from: s */
    public final Object mo7659s(int i10) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return new C2863u7(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C2924z3.class});
        }
        if (i11 == 3) {
            return new C2885w3();
        }
        C0204c c0204c = null;
        if (i11 == 4) {
            return new C2683h2(c0204c);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: u */
    public final String m8328u() {
        return this.zze;
    }

    /* JADX INFO: renamed from: v */
    public final InterfaceC2836s6 m8329v() {
        return this.zzf;
    }
}
