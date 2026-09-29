package com.google.android.gms.internal.vision;

import p000.awc;
import p000.f6c;
import p000.ij6;
import p000.lvc;
import p000.qnc;
import p000.r6c;
import p000.rnc;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.j */
/* JADX INFO: loaded from: classes2.dex */
public final class C1025j extends AbstractC1034s {
    private static final C1025j zzi;
    private static volatile lvc zzj;
    private int zzc;
    private int zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private long zzh;

    static {
        C1025j c1025j = new C1025j();
        zzi = c1025j;
        AbstractC1034s.m5742g(C1025j.class, c1025j);
    }

    /* JADX INFO: renamed from: j */
    public static void m5708j(C1025j c1025j, long j) {
        c1025j.zzc |= 2;
        c1025j.zze = j;
    }

    /* JADX INFO: renamed from: k */
    public static f6c m5709k() {
        return (f6c) ((rnc) zzi.mo5699e(5));
    }

    /* JADX INFO: renamed from: l */
    public static void m5710l(C1025j c1025j, long j) {
        c1025j.zzc |= 4;
        c1025j.zzf = j;
    }

    /* JADX INFO: renamed from: m */
    public static void m5711m(C1025j c1025j, long j) {
        c1025j.zzc |= 8;
        c1025j.zzg = j;
    }

    /* JADX INFO: renamed from: n */
    public static void m5712n(C1025j c1025j, long j) {
        c1025j.zzc |= 16;
        c1025j.zzh = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1025j();
            case 2:
                return new f6c(zzi);
            case 3:
                return new awc(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဂ\u0003", new Object[]{"zzc", "zzd", zzfi$zzj$zza.zzb(), "zze", "zzf", "zzh", "zzg"});
            case 4:
                return zzi;
            case 5:
                lvc lvcVar = zzj;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1025j.class) {
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
