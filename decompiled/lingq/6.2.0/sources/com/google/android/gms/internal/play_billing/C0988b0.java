package com.google.android.gms.internal.play_billing;

import p000.fgc;
import p000.ptc;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0988b0 extends AbstractC0998i {
    private static final C0988b0 zzb;
    private int zzd;
    private C1007r zze;
    private long zzf;

    static {
        C0988b0 c0988b0 = new C0988b0();
        zzb = c0988b0;
        AbstractC0998i.m5533f(C0988b0.class, c0988b0);
    }

    /* JADX INFO: renamed from: p */
    public static ptc m5512p() {
        return (ptc) zzb.m5540k();
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m5514r(C0988b0 c0988b0, C1007r c1007r) {
        c0988b0.zze = c1007r;
        c0988b0.zzd |= 1;
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m5515s(C0988b0 c0988b0, long j) {
        c0988b0.zzd |= 2;
        c0988b0.zzf = j;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C0988b0();
        }
        if (i2 == 4) {
            return new ptc();
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
