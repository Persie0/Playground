package com.google.android.gms.internal.play_billing;

import p000.e1c;
import p000.fgc;
import p000.xyb;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.x */
/* JADX INFO: loaded from: classes2.dex */
public final class C1013x extends AbstractC0998i {
    private static final C1013x zzb;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C1013x c1013x = new C1013x();
        zzb = c1013x;
        AbstractC0998i.m5533f(C1013x.class, c1013x);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", e1c.f36587e, "zzf"});
        }
        if (i2 == 3) {
            return new C1013x();
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
