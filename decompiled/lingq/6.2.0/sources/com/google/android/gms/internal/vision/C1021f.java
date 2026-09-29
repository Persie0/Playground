package com.google.android.gms.internal.vision;

import java.util.List;
import p000.awc;
import p000.d6c;
import p000.dwc;
import p000.gfc;
import p000.ij6;
import p000.lvc;
import p000.mpc;
import p000.qnc;
import p000.r6c;
import p000.rnc;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.f */
/* JADX INFO: loaded from: classes2.dex */
public final class C1021f extends AbstractC1034s {
    private static final C1021f zzl;
    private static volatile lvc zzm;
    private int zzc;
    private String zzd = "";
    private String zze = "";
    private mpc zzf;
    private int zzg;
    private String zzh;
    private long zzi;
    private long zzj;
    private mpc zzk;

    static {
        C1021f c1021f = new C1021f();
        zzl = c1021f;
        AbstractC1034s.m5742g(C1021f.class, c1021f);
    }

    public C1021f() {
        dwc dwcVar = dwc.f36341d;
        this.zzf = dwcVar;
        this.zzh = "";
        this.zzk = dwcVar;
    }

    /* JADX INFO: renamed from: j */
    public static void m5700j(C1021f c1021f, long j) {
        c1021f.zzc |= 16;
        c1021f.zzi = j;
    }

    /* JADX INFO: renamed from: k */
    public static void m5701k(C1021f c1021f, String str) {
        c1021f.getClass();
        str.getClass();
        c1021f.zzc |= 1;
        c1021f.zzd = str;
    }

    /* JADX INFO: renamed from: l */
    public static void m5702l(C1021f c1021f, List list) {
        mpc mpcVar = c1021f.zzk;
        if (!mpcVar.zza()) {
            int size = mpcVar.size();
            c1021f.zzk = mpcVar.mo5748a(size == 0 ? 10 : size << 1);
        }
        gfc.m12569a(list, c1021f.zzk);
    }

    /* JADX INFO: renamed from: m */
    public static d6c m5703m() {
        return (d6c) ((rnc) zzl.mo5699e(5));
    }

    /* JADX INFO: renamed from: n */
    public static void m5704n(C1021f c1021f, long j) {
        c1021f.zzc |= 32;
        c1021f.zzj = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11, types: [java.lang.Object, lvc] */
    @Override // com.google.android.gms.internal.vision.AbstractC1034s
    /* JADX INFO: renamed from: e */
    public final Object mo5699e(int i) {
        Object obj;
        switch (r6c.f58811a[i - 1]) {
            case 1:
                return new C1021f();
            case 2:
                return new d6c(zzl);
            case 3:
                return new awc(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004ဌ\u0002\u0005ဈ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", zzfi$zzf$zza.zzb(), "zzh", "zzi", "zzj", "zzk", C1029n.class});
            case 4:
                return zzl;
            case 5:
                lvc lvcVar = zzm;
                if (lvcVar != null) {
                    return lvcVar;
                }
                synchronized (C1021f.class) {
                    try {
                        lvc lvcVar2 = zzm;
                        obj = lvcVar2;
                        if (lvcVar2 == null) {
                            ?? qncVar = new qnc();
                            zzm = qncVar;
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
