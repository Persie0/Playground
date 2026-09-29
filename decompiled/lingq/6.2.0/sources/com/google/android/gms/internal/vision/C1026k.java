package com.google.android.gms.internal.vision;

import p000.awc;
import p000.c6c;
import p000.ij6;
import p000.lvc;
import p000.qnc;
import p000.r6c;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C1026k extends AbstractC1034s {
    private static final C1026k zzj;
    private static volatile lvc zzk;
    private int zzc;
    private long zze;
    private C1016a zzf;
    private C1022g zzh;
    private C1017b zzi;
    private String zzd = "";
    private String zzg = "";

    static {
        C1026k c1026k = new C1026k();
        zzj = c1026k;
        AbstractC1034s.m5742g(C1026k.class, c1026k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1026k();
            case 2:
                return new c6c(zzj);
            case 3:
                return new awc(zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဉ\u0002\u0006ဈ\u0003\u0010ဉ\u0004\u0011ဉ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                lvc lvcVar = zzk;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1026k.class) {
                    try {
                        lvc lvcVar2 = zzk;
                        obj = lvcVar2;
                        if (lvcVar2 == null) {
                            ?? qncVar = new qnc();
                            zzk = qncVar;
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
