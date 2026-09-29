package com.google.android.gms.internal.vision;

import p000.awc;
import p000.c6c;
import p000.dwc;
import p000.ij6;
import p000.lvc;
import p000.mpc;
import p000.qnc;
import p000.r6c;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C1019d extends AbstractC1034s {
    private static final C1019d zzd;
    private static volatile lvc zze;
    private mpc zzc = dwc.f36341d;

    static {
        C1019d c1019d = new C1019d();
        zzd = c1019d;
        AbstractC1034s.m5742g(C1019d.class, c1019d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1019d();
            case 2:
                return new c6c(zzd);
            case 3:
                return new awc(zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", C1028m.class});
            case 4:
                return zzd;
            case 5:
                lvc lvcVar = zze;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1019d.class) {
                    try {
                        lvc lvcVar2 = zze;
                        obj = lvcVar2;
                        if (lvcVar2 == null) {
                            ?? qncVar = new qnc();
                            zze = qncVar;
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
