package com.google.android.gms.internal.play_billing;

import p000.e1c;
import p000.fgc;
import p000.xyb;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.e */
/* JADX INFO: loaded from: classes2.dex */
public final class C0993e extends AbstractC0998i {
    private static final C0993e zzb;
    private int zzd;
    private C0996g zze;
    private C0996g zzf;
    private int zzg;

    static {
        C0993e c0993e = new C0993e();
        zzb = c0993e;
        AbstractC0998i.m5533f(C0993e.class, c0993e);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", e1c.f36584b});
        }
        if (i2 == 3) {
            return new C0993e();
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
