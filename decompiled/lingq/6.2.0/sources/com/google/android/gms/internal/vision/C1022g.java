package com.google.android.gms.internal.vision;

import p000.awc;
import p000.c6c;
import p000.ij6;
import p000.lvc;
import p000.qnc;
import p000.r6c;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.g */
/* JADX INFO: loaded from: classes2.dex */
public final class C1022g extends AbstractC1034s {
    private static final C1022g zzj;
    private static volatile lvc zzk;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private float zzi;

    static {
        C1022g c1022g = new C1022g();
        zzj = c1022g;
        AbstractC1034s.m5742g(C1022g.class, c1022g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1022g();
            case 2:
                return new c6c(zzj);
            case 3:
                return new awc(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ခ\u0005", new Object[]{"zzc", "zzd", zzfi$zzg$zzd.zzb(), "zze", zzfi$zzg$zzc.zzb(), "zzf", zzfi$zzg$zzb.zzb(), "zzg", "zzh", "zzi"});
            case 4:
                return zzj;
            case 5:
                lvc lvcVar = zzk;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1022g.class) {
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
