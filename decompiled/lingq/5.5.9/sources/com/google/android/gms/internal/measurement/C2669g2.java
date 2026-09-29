package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2669g2 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2669g2 zza;
    private int zzd;
    private int zze;
    private String zzf = "";
    private C2599b2 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        C2669g2 c2669g2 = new C2669g2();
        zza = c2669g2;
        AbstractC2771n6.m8083p(C2669g2.class, c2669g2);
    }

    /* JADX INFO: renamed from: v */
    public static C2655f2 m7831v() {
        return (C2655f2) zza.m8085i();
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m7833y(C2669g2 c2669g2, String str) {
        c2669g2.zzd |= 2;
        c2669g2.zzf = str;
    }

    /* JADX INFO: renamed from: A */
    public final boolean m7834A() {
        return this.zzi;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m7835B() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: C */
    public final boolean m7836C() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m7837D() {
        return (this.zzd & 32) != 0;
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
            return new C2863u7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C2669g2();
        }
        if (i11 == 4) {
            return new C2655f2(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final int m7838t() {
        return this.zze;
    }

    /* JADX INFO: renamed from: u */
    public final C2599b2 m7839u() {
        C2599b2 c2599b2M7653u = this.zzg;
        if (c2599b2M7653u == null) {
            c2599b2M7653u = C2599b2.m7653u();
        }
        return c2599b2M7653u;
    }

    /* JADX INFO: renamed from: x */
    public final String m7840x() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m7841z() {
        return this.zzh;
    }
}
