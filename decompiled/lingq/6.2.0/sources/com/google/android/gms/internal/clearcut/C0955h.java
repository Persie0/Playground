package com.google.android.gms.internal.clearcut;

import p000.d0c;
import p000.edc;
import p000.ij6;
import p000.odc;
import p000.tsb;
import p000.usb;
import p000.z0c;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C0955h extends AbstractC0949b {
    private static volatile d0c zzbg;
    private static final C0955h zzbiv;
    private int zzbb;
    private String zzbis = "";
    private long zzbit;
    private long zzbiu;
    private int zzya;

    static {
        C0955h c0955h = new C0955h();
        zzbiv = c0955h;
        AbstractC0949b.m5291c(C0955h.class, c0955h);
    }

    /* JADX INFO: renamed from: f */
    public static void m5330f(C0955h c0955h, long j) {
        c0955h.zzbb |= 4;
        c0955h.zzbit = j;
    }

    /* JADX INFO: renamed from: g */
    public static void m5331g(C0955h c0955h, String str) {
        c0955h.getClass();
        c0955h.zzbb |= 2;
        c0955h.zzbis = str;
    }

    /* JADX INFO: renamed from: h */
    public static void m5332h(C0955h c0955h, long j) {
        c0955h.zzbb |= 8;
        c0955h.zzbiu = j;
    }

    /* JADX INFO: renamed from: m */
    public static edc m5333m() {
        return (edc) ((tsb) zzbiv.mo5293a(5));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [d0c, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC0949b
    /* JADX INFO: renamed from: a */
    public final Object mo5293a(int i) {
        Object obj;
        switch (odc.f54236a[i - 1]) {
            case 1:
                return new C0955h();
            case 2:
                return new edc(zzbiv);
            case 3:
                return new z0c(zzbiv, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\u0004\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003", new Object[]{"zzbb", "zzya", "zzbis", "zzbit", "zzbiu"});
            case 4:
                return zzbiv;
            case 5:
                d0c d0cVar = zzbg;
                if (d0cVar != null) {
                    return d0cVar;
                }
                synchronized (C0955h.class) {
                    try {
                        d0c d0cVar2 = zzbg;
                        obj = d0cVar2;
                        if (d0cVar2 == null) {
                            ?? usbVar = new usb();
                            zzbg = usbVar;
                            obj = usbVar;
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

    /* JADX INFO: renamed from: e */
    public final int m5334e() {
        return this.zzya;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5335i() {
        return (this.zzbb & 1) == 1;
    }

    /* JADX INFO: renamed from: j */
    public final String m5336j() {
        return this.zzbis;
    }

    /* JADX INFO: renamed from: k */
    public final long m5337k() {
        return this.zzbit;
    }

    /* JADX INFO: renamed from: l */
    public final long m5338l() {
        return this.zzbiu;
    }
}
