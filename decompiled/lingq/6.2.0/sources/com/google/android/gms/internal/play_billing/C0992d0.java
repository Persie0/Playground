package com.google.android.gms.internal.play_billing;

import p000.fgc;
import p000.nuc;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0992d0 extends AbstractC0998i {
    private static final C0992d0 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;

    static {
        C0992d0 c0992d0 = new C0992d0();
        zzb = c0992d0;
        AbstractC0998i.m5533f(C0992d0.class, c0992d0);
    }

    /* JADX INFO: renamed from: p */
    public static nuc m5520p() {
        return (nuc) zzb.m5540k();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m5521q(C0992d0 c0992d0, boolean z) {
        c0992d0.zzd |= 8;
        c0992d0.zzh = z;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m5522r(C0992d0 c0992d0) {
        c0992d0.zzd |= 16;
        c0992d0.zzi = 0;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m5523s(C0992d0 c0992d0, long j) {
        c0992d0.zzd |= 4;
        c0992d0.zzg = j;
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m5524t(C0992d0 c0992d0) {
        c0992d0.zzd |= 32;
        c0992d0.zzj = 0;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m5525u(C0992d0 c0992d0) {
        c0992d0.zzd |= 2;
        c0992d0.zzf = true;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new C0992d0();
        }
        if (i2 == 4) {
            return new nuc(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
