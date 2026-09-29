package com.google.android.gms.internal.play_billing;

import p000.e1c;
import p000.fgc;
import p000.xyb;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0990c0 extends AbstractC0998i {
    private static final C0990c0 zzb;
    private int zzd;
    private int zze;

    static {
        C0990c0 c0990c0 = new C0990c0();
        zzb = c0990c0;
        AbstractC0998i.m5533f(C0990c0.class, c0990c0);
    }

    /* JADX INFO: renamed from: q */
    public static C0990c0 m5519q() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", e1c.f36588f});
        }
        if (i2 == 3) {
            return new C0990c0();
        }
        if (i2 == 4) {
            return new xyb(8);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
