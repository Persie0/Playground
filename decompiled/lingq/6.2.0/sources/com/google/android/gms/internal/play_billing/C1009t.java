package com.google.android.gms.internal.play_billing;

import p000.e1c;
import p000.e9c;
import p000.fgc;
import p000.j8c;
import p000.smc;
import p000.xyb;
import p000.y8c;
import p000.zfc;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1009t extends AbstractC0998i {
    private static final C1009t zzb;
    private int zzd;
    private int zzf;
    private C1007r zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private y8c zzg = j8c.m14338h();
    private e9c zzh = zfc.m25596g();

    static {
        C1009t c1009t = new C1009t();
        zzb = c1009t;
        AbstractC0998i.m5533f(C1009t.class, c1009t);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0998i
    /* JADX INFO: renamed from: j */
    public final Object mo5511j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new fgc(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", e1c.f36585c, "zzg", smc.f61033d, "zzh", C0986a0.class, "zzi", "zzj", "zzk"});
        }
        int i3 = 3;
        if (i2 == 3) {
            return new C1009t();
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
