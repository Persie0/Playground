package com.google.android.gms.internal.vision;

import p000.awc;
import p000.g6c;
import p000.ij6;
import p000.lvc;
import p000.qnc;
import p000.r6c;
import p000.rnc;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C1030o extends AbstractC1034s {
    private static final C1030o zzi;
    private static volatile lvc zzj;
    private int zzc;
    private C1020e zzd;
    private C1026k zze;
    private C1024i zzf;
    private int zzg;
    private boolean zzh;

    static {
        C1030o c1030o = new C1030o();
        zzi = c1030o;
        AbstractC1034s.m5742g(C1030o.class, c1030o);
    }

    /* JADX INFO: renamed from: j */
    public static void m5713j(C1030o c1030o, C1024i c1024i) {
        c1030o.getClass();
        c1030o.zzf = c1024i;
        c1030o.zzc |= 4;
    }

    /* JADX INFO: renamed from: k */
    public static g6c m5714k() {
        return (g6c) ((rnc) zzi.mo5699e(5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1030o();
            case 2:
                return new g6c(zzi);
            case 3:
                return new awc(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzi;
            case 5:
                lvc lvcVar = zzj;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1030o.class) {
                    try {
                        lvc lvcVar2 = zzj;
                        obj = lvcVar2;
                        if (lvcVar2 == null) {
                            ?? qncVar = new qnc();
                            zzj = qncVar;
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
