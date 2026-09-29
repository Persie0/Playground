package com.google.android.gms.internal.vision;

import p000.awc;
import p000.c6c;
import p000.cpc;
import p000.fpc;
import p000.ij6;
import p000.lvc;
import p000.qnc;
import p000.r6c;
import p000.to2;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1017b extends AbstractC1034s {
    private static final cpc zzd = new to2();
    private static final C1017b zze;
    private static volatile lvc zzf;
    private fpc zzc = AbstractC1034s.m5743i();

    /* JADX WARN: Type inference failed for: r0v0, types: [cpc, java.lang.Object] */
    static {
        C1017b c1017b = new C1017b();
        zze = c1017b;
        AbstractC1034s.m5742g(C1017b.class, c1017b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1017b();
            case 2:
                return new c6c(zze);
            case 3:
                return new awc(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[]{"zzc", zzgz.zzb()});
            case 4:
                return zze;
            case 5:
                lvc lvcVar = zzf;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1017b.class) {
                    try {
                        lvc lvcVar2 = zzf;
                        obj = lvcVar2;
                        if (lvcVar2 == null) {
                            ?? qncVar = new qnc();
                            zzf = qncVar;
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
