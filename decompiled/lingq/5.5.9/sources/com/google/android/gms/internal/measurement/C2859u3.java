package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2859u3 extends AbstractC2771n6 implements InterfaceC2744l7 {
    private static final C2859u3 zza;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C2859u3 c2859u3 = new C2859u3();
        zza = c2859u3;
        AbstractC2771n6.m8083p(C2859u3.class, c2859u3);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m8270A(C2859u3 c2859u3, long j10) {
        c2859u3.zzd |= 1;
        c2859u3.zze = j10;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m8271B(C2859u3 c2859u3, String str) {
        str.getClass();
        c2859u3.zzd |= 2;
        c2859u3.zzf = str;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m8272C(C2859u3 c2859u3, String str) {
        str.getClass();
        c2859u3.zzd |= 4;
        c2859u3.zzg = str;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m8273D(C2859u3 c2859u3) {
        c2859u3.zzd &= -5;
        c2859u3.zzg = zza.zzg;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m8274E(C2859u3 c2859u3, long j10) {
        c2859u3.zzd |= 8;
        c2859u3.zzh = j10;
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m8275F(C2859u3 c2859u3) {
        c2859u3.zzd &= -9;
        c2859u3.zzh = 0L;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m8276G(C2859u3 c2859u3, double d10) {
        c2859u3.zzd |= 32;
        c2859u3.zzj = d10;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m8277H(C2859u3 c2859u3) {
        c2859u3.zzd &= -33;
        c2859u3.zzj = 0.0d;
    }

    /* JADX INFO: renamed from: w */
    public static C2846t3 m8278w() {
        return (C2846t3) zza.m8085i();
    }

    /* JADX INFO: renamed from: I */
    public final boolean m8280I() {
        return (this.zzd & 32) != 0;
    }

    /* JADX INFO: renamed from: J */
    public final boolean m8281J() {
        return (this.zzd & 8) != 0;
    }

    /* JADX INFO: renamed from: K */
    public final boolean m8282K() {
        return (this.zzd & 1) != 0;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m8283L() {
        return (this.zzd & 4) != 0;
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
            return new C2863u7(zza, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new C2859u3();
        }
        if (i11 == 4) {
            return new C2846t3(i12);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }

    /* JADX INFO: renamed from: t */
    public final double m8284t() {
        return this.zzj;
    }

    /* JADX INFO: renamed from: u */
    public final long m8285u() {
        return this.zzh;
    }

    /* JADX INFO: renamed from: v */
    public final long m8286v() {
        return this.zze;
    }

    /* JADX INFO: renamed from: y */
    public final String m8287y() {
        return this.zzf;
    }

    /* JADX INFO: renamed from: z */
    public final String m8288z() {
        return this.zzg;
    }
}
