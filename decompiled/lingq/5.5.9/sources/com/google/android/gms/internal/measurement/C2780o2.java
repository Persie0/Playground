package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2780o2 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2780o2 zza;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C2780o2 c2780o2 = new C2780o2();
        zza = c2780o2;
        AbstractC2771n6.m8083p(C2780o2.class, c2780o2);
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m8138w(C2780o2 c2780o2, String str) {
        str.getClass();
        c2780o2.zzd |= 1;
        c2780o2.zze = str;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m8139A() {
        return (this.zzd & 4) != 0;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m8140B() {
        return (this.zzd & 8) != 0;
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
            return new C2863u7(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new C2780o2();
        }
        if (i11 == 4) {
            return new C2767n2(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m8141t() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: v */
    public final String m8142v() {
        return this.zze;
    }

    /* JADX INFO: renamed from: x */
    public final boolean m8143x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m8144y() {
        return this.zzg;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m8145z() {
        return (this.zzd & 2) != 0;
    }
}
