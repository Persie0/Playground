package com.google.android.gms.internal.vision;

import p000.awc;
import p000.c6c;
import p000.ij6;
import p000.lvc;
import p000.qnc;
import p000.r6c;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C1027l extends AbstractC1034s {
    private static final C1027l zzf;
    private static volatile lvc zzg;
    private int zzc;
    private long zzd;
    private long zze;

    static {
        C1027l c1027l = new C1027l();
        zzf = c1027l;
        AbstractC1034s.m5742g(C1027l.class, c1027l);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1027l();
            case 2:
                return new c6c(zzf);
            case 3:
                return new awc(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                lvc lvcVar = zzg;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1027l.class) {
                    try {
                        lvc lvcVar2 = zzg;
                        obj = lvcVar2;
                        if (lvcVar2 == null) {
                            ?? qncVar = new qnc();
                            zzg = qncVar;
                            obj = qncVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return obj;
            case 6:
                return (byte) 1;
            default:
                ij6.m13946b();
            case 7:
                return null;
        }
    }
}
