package com.google.android.gms.internal.play_billing;

import p000.fgc;
import p000.xyb;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1008s extends AbstractC0998i {
    private static final C1008s zzb;

    static {
        C1008s c1008s = new C1008s();
        zzb = c1008s;
        AbstractC0998i.m5533f(C1008s.class, c1008s);
    }

    /* JADX INFO: renamed from: q */
    public static C1008s m5630q() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        int i3 = 2;
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new C1008s();
        }
        if (i2 == 4) {
            return new xyb(i3);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
