package com.google.android.gms.internal.play_billing;

import p000.fgc;
import p000.xyb;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v */
/* JADX INFO: loaded from: classes.dex */
public final class C1011v extends AbstractC0998i {
    private static final C1011v zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        C1011v c1011v = new C1011v();
        zzb = c1011v;
        AbstractC0998i.m5533f(C1011v.class, c1011v);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new C1011v();
        }
        int i3 = 4;
        if (i2 == 4) {
            return new xyb(i3);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
