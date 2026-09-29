package com.google.android.gms.internal.vision;

import p000.awc;
import p000.b6c;
import p000.ij6;
import p000.lvc;
import p000.qnc;
import p000.r6c;
import p000.rnc;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C1016a extends AbstractC1034s {
    private static final C1016a zzf;
    private static volatile lvc zzg;
    private int zzc;
    private String zzd = "";
    private String zze = "";

    static {
        C1016a c1016a = new C1016a();
        zzf = c1016a;
        AbstractC1034s.m5742g(C1016a.class, c1016a);
    }

    /* JADX INFO: renamed from: j */
    public static void m5695j(C1016a c1016a, String str) {
        c1016a.getClass();
        str.getClass();
        c1016a.zzc |= 1;
        c1016a.zzd = str;
    }

    /* JADX INFO: renamed from: k */
    public static b6c m5696k() {
        return (b6c) ((rnc) zzf.mo5699e(5));
    }

    /* JADX INFO: renamed from: m */
    public static void m5698m(C1016a c1016a, String str) {
        c1016a.getClass();
        c1016a.zzc |= 2;
        c1016a.zze = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1016a();
            case 2:
                return new b6c(zzf);
            case 3:
                return new awc(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 4:
                return zzf;
            case 5:
                lvc lvcVar = zzg;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1016a.class) {
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
