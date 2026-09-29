package com.google.android.gms.internal.vision;

import java.util.ArrayList;
import p000.awc;
import p000.dwc;
import p000.e6c;
import p000.gfc;
import p000.ij6;
import p000.lvc;
import p000.mpc;
import p000.qnc;
import p000.r6c;
import p000.rnc;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C1024i extends AbstractC1034s {
    private static final C1024i zzg;
    private static volatile lvc zzh;
    private int zzc;
    private C1025j zzd;
    private C1027l zze;
    private mpc zzf = dwc.f36341d;

    static {
        C1024i c1024i = new C1024i();
        zzg = c1024i;
        AbstractC1034s.m5742g(C1024i.class, c1024i);
    }

    /* JADX INFO: renamed from: j */
    public static void m5705j(C1024i c1024i, C1025j c1025j) {
        c1024i.getClass();
        c1024i.zzd = c1025j;
        c1024i.zzc |= 1;
    }

    /* JADX INFO: renamed from: k */
    public static void m5706k(C1024i c1024i, ArrayList arrayList) {
        mpc mpcVar = c1024i.zzf;
        if (!mpcVar.zza()) {
            int size = mpcVar.size();
            c1024i.zzf = mpcVar.mo5748a(size == 0 ? 10 : size << 1);
        }
        gfc.m12569a(arrayList, c1024i.zzf);
    }

    /* JADX INFO: renamed from: l */
    public static e6c m5707l() {
        return (e6c) ((rnc) zzg.mo5699e(5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1024i();
            case 2:
                return new e6c(zzg);
            case 3:
                return new awc(zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", C1021f.class});
            case 4:
                return zzg;
            case 5:
                lvc lvcVar = zzh;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1024i.class) {
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
