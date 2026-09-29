package com.google.android.gms.internal.play_billing;

import p000.fgc;
import p000.ssc;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1015z extends AbstractC0998i {
    private static final C1015z zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private C1010u zzg;
    private C1011v zzh;

    static {
        C1015z c1015z = new C1015z();
        zzb = c1015z;
        AbstractC0998i.m5533f(C1015z.class, c1015z);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m5653p(C1015z c1015z, C0990c0 c0990c0) {
        c1015z.zzf = c0990c0;
        c1015z.zze = 4;
    }

    /* JADX INFO: renamed from: q */
    public static ssc m5654q() {
        return (ssc) zzb.m5540k();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m5655r(C1015z c1015z, C1005p c1005p) {
        c1015z.zzf = c1005p;
        c1015z.zze = 2;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m5656s(C1015z c1015z, C1006q c1006q) {
        c1015z.zzf = c1006q;
        c1015z.zze = 3;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m5657t(C1015z c1015z, C1008s c1008s) {
        c1008s.getClass();
        c1015z.zzf = c1008s;
        c1015z.zze = 7;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m5658u(C1015z c1015z, C1010u c1010u) {
        c1010u.getClass();
        c1015z.zzg = c1010u;
        c1015z.zzd |= 1;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m5659v(C1015z c1015z, C0988b0 c0988b0) {
        c1015z.zzf = c0988b0;
        c1015z.zze = 8;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\b\u0001\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001\u0007<\u0000\b<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", C1005p.class, C1006q.class, C0990c0.class, C1009t.class, "zzh", C1008s.class, C0988b0.class});
        }
        if (i2 == 3) {
            return new C1015z();
        }
        if (i2 == 4) {
            return new ssc(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
