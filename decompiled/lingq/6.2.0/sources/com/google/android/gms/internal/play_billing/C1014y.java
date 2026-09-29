package com.google.android.gms.internal.play_billing;

import p000.e9c;
import p000.fgc;
import p000.prc;
import p000.zfc;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.y */
/* JADX INFO: loaded from: classes.dex */
public final class C1014y extends AbstractC0998i {
    private static final C1014y zzb;
    private int zzd;
    private e9c zze = zfc.m25596g();
    private String zzf = "";
    private boolean zzg;

    static {
        C1014y c1014y = new C1014y();
        zzb = c1014y;
        AbstractC0998i.m5533f(C1014y.class, c1014y);
    }

    /* JADX INFO: renamed from: q */
    public static C1014y m5651q() {
        return zzb;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m5652r(C1014y c1014y, boolean z) {
        c1014y.zzd |= 2;
        c1014y.zzg = z;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", C1013x.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new C1014y();
        }
        if (i2 == 4) {
            return new prc();
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
