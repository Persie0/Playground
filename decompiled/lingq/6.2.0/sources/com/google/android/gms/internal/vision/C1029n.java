package com.google.android.gms.internal.vision;

import p000.awc;
import p000.c6c;
import p000.ij6;
import p000.lvc;
import p000.qnc;
import p000.r6c;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C1029n extends AbstractC1034s {
    private static final C1029n zzh;
    private static volatile lvc zzi;
    private int zzc;
    private C1019d zzd;
    private int zze;
    private C1023h zzf;
    private C1018c zzg;

    static {
        C1029n c1029n = new C1029n();
        zzh = c1029n;
        AbstractC1034s.m5742g(C1029n.class, c1029n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1029n();
            case 2:
                return new c6c(zzh);
            case 3:
                return new awc(zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0010ဉ\u0002\u0011ဉ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
            case 4:
                return zzh;
            case 5:
                lvc lvcVar = zzi;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1029n.class) {
                    try {
                        lvc lvcVar2 = zzi;
                        obj = lvcVar2;
                        if (lvcVar2 == null) {
                            ?? qncVar = new qnc();
                            zzi = qncVar;
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
