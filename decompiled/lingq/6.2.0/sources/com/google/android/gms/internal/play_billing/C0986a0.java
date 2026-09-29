package com.google.android.gms.internal.play_billing;

import p000.e9c;
import p000.fgc;
import p000.xyb;
import p000.zfc;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.a0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0986a0 extends AbstractC0998i {
    private static final C0986a0 zzb;
    private int zzd;
    private int zzf;
    private e9c zze = zfc.m25596g();
    private String zzg = "";

    static {
        C0986a0 c0986a0 = new C0986a0();
        zzb = c0986a0;
        AbstractC0998i.m5533f(C0986a0.class, c0986a0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C0986a0();
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
