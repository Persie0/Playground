package com.google.android.gms.internal.vision;

import p000.awc;
import p000.c6c;
import p000.ij6;
import p000.lvc;
import p000.qnc;
import p000.r6c;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1018c extends AbstractC1034s {
    private static final C1018c zzg;
    private static volatile lvc zzh;
    private int zzc;
    private int zzd;
    private int zze;
    private String zzf = "";

    static {
        C1018c c1018c = new C1018c();
        zzg = c1018c;
        AbstractC1034s.m5742g(C1018c.class, c1018c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1018c();
            case 2:
                return new c6c(zzg);
            case 3:
                return new awc(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"zzc", "zzd", zzgz.zzb(), "zze", zzha.zzb(), "zzf"});
            case 4:
                return zzg;
            case 5:
                lvc lvcVar = zzh;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1018c.class) {
                    try {
                        lvc lvcVar2 = zzh;
                        obj = lvcVar2;
                        if (lvcVar2 == null) {
                            ?? qncVar = new qnc();
                            zzh = qncVar;
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
