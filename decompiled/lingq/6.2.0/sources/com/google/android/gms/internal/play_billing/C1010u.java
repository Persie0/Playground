package com.google.android.gms.internal.play_billing;

import android.os.Build;
import p000.bqc;
import p000.fgc;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1010u extends AbstractC0998i {
    private static final C1010u zzb;
    private int zzd;
    private int zzh;
    private long zzi;
    private long zzj;
    private boolean zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzs;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzr = "";

    static {
        C1010u c1010u = new C1010u();
        zzb = c1010u;
        AbstractC0998i.m5533f(C1010u.class, c1010u);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m5632A(C1010u c1010u, int i) {
        c1010u.zzd |= 128;
        c1010u.zzl = i;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m5633B(C1010u c1010u, int i) {
        c1010u.zzd |= 256;
        c1010u.zzm = i;
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m5634C(C1010u c1010u, int i) {
        c1010u.zzd |= 8;
        c1010u.zzh = i;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m5635D(C1010u c1010u, long j) {
        c1010u.zzd |= 16;
        c1010u.zzi = j;
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ void m5636E(C1010u c1010u, long j) {
        c1010u.zzd |= 32;
        c1010u.zzj = j;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m5637p(C1010u c1010u) {
        c1010u.zzd |= 512;
        c1010u.zzn = 846465066L;
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m5638q(C1010u c1010u, String str) {
        str.getClass();
        c1010u.zzd |= 4;
        c1010u.zzg = str;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m5639r(C1010u c1010u) {
        String str = Build.BRAND;
        str.getClass();
        c1010u.zzd |= 1024;
        c1010u.zzo = str;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m5640s(C1010u c1010u) {
        String str = Build.FINGERPRINT;
        str.getClass();
        c1010u.zzd |= 8192;
        c1010u.zzr = str;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m5641t(C1010u c1010u) {
        String str = Build.MANUFACTURER;
        str.getClass();
        c1010u.zzd |= 4096;
        c1010u.zzq = str;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m5642u(C1010u c1010u) {
        String str = Build.MODEL;
        str.getClass();
        c1010u.zzd |= 2048;
        c1010u.zzp = str;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m5643v(C1010u c1010u, int i) {
        c1010u.zzd |= 16384;
        c1010u.zzs = i;
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m5644w(C1010u c1010u) {
        c1010u.zzd |= 64;
        c1010u.zzk = false;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m5645x(C1010u c1010u) {
        c1010u.zzd |= 1;
        c1010u.zze = "8.3.0";
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m5646y(C1010u c1010u, String str) {
        c1010u.zzd |= 2;
        c1010u.zzf = str;
    }

    /* JADX INFO: renamed from: z */
    public static bqc m5647z() {
        return (bqc) zzb.m5540k();
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003င\u0003\u0004ဂ\u0004\u0005ဈ\u0001\u0006ဂ\u0005\u0007ဇ\u0006\bင\u0007\tင\b\nဂ\t\u000bဈ\n\fဈ\u000b\rဈ\f\u000eဈ\r\u000fင\u000e", new Object[]{"zzd", "zze", "zzg", "zzh", "zzi", "zzf", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new C1010u();
        }
        if (i2 == 4) {
            return new bqc(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
