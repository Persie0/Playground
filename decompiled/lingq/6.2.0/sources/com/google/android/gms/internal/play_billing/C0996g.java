package com.google.android.gms.internal.play_billing;

import p000.fgc;
import p000.xyb;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C0996g extends AbstractC0998i {
    private static final C0996g zzb;
    private int zzd;
    private String zze = "";

    static {
        C0996g c0996g = new C0996g();
        zzb = c0996g;
        AbstractC0998i.m5533f(C0996g.class, c0996g);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new C0996g();
        }
        if (i2 == 4) {
            return new xyb(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
