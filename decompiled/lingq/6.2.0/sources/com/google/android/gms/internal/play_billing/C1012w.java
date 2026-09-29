package com.google.android.gms.internal.play_billing;

import p000.e1c;
import p000.fgc;
import p000.xyb;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1012w extends AbstractC0998i {
    private static final C1012w zzb;
    private int zzd;
    private int zze;

    static {
        C1012w c1012w = new C1012w();
        zzb = c1012w;
        AbstractC0998i.m5533f(C1012w.class, c1012w);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", e1c.f36586d});
        }
        if (i2 == 3) {
            return new C1012w();
        }
        int i3 = 5;
        if (i2 == 4) {
            return new xyb(i3);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
