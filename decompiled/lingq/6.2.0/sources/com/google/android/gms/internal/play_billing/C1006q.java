package com.google.android.gms.internal.play_billing;

import p000.fgc;
import p000.smc;
import p000.wmc;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.q */
/* JADX INFO: loaded from: classes.dex */
public final class C1006q extends AbstractC0998i {
    private static final C1006q zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private int zzh;

    static {
        C1006q c1006q = new C1006q();
        zzb = c1006q;
        AbstractC0998i.m5533f(C1006q.class, c1006q);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m5615p(C1006q c1006q, int i) {
        c1006q.zzg = i - 1;
        c1006q.zzd |= 1;
    }

    /* JADX INFO: renamed from: q */
    public static wmc m5616q() {
        return (wmc) zzb.m5540k();
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m5618t(C1006q c1006q, zzjk zzjkVar) {
        c1006q.zzh = zzjkVar.zza();
        c1006q.zzd |= 2;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m5619u(C1006q c1006q, C1014y c1014y) {
        c1006q.zzf = c1014y;
        c1006q.zze = 4;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m5620v(C1006q c1006q, C0992d0 c0992d0) {
        c1006q.zzf = c0992d0;
        c1006q.zze = 3;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005᠌\u0001", new Object[]{"zzf", "zze", "zzd", "zzg", smc.f61031b, C1012w.class, C0992d0.class, C1014y.class, "zzh", smc.f61033d});
        }
        if (i2 == 3) {
            return new C1006q();
        }
        if (i2 == 4) {
            return new wmc();
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    /* JADX INFO: renamed from: s */
    public final C1014y m5621s() {
        return this.zze == 4 ? (C1014y) this.zzf : C1014y.m5651q();
    }
}
