package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import p000.d0c;
import p000.ddc;
import p000.ij6;
import p000.odc;
import p000.r0c;
import p000.usb;
import p000.utb;
import p000.v0c;
import p000.vnb;
import p000.z0c;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C0956i extends AbstractC0949b {
    private static volatile d0c zzbg;
    private static final C0956i zzbir;
    private utb zzbiq = v0c.f64680c;

    static {
        C0956i c0956i = new C0956i();
        zzbir = c0956i;
        AbstractC0949b.m5291c(C0956i.class, c0956i);
    }

    /* JADX INFO: renamed from: f */
    public static C0956i m5339f() {
        return zzbir;
    }

    /* JADX INFO: renamed from: g */
    public static C0956i m5340g(byte[] bArr) throws zzco {
        AbstractC0949b abstractC0949b = (AbstractC0949b) zzbir.mo5293a(4);
        try {
            r0c r0cVar = r0c.f58470c;
            r0cVar.getClass();
            r0cVar.m20230a(abstractC0949b.getClass()).mo5310e(abstractC0949b, bArr, 0, bArr.length, new vnb());
            r0cVar.m20230a(abstractC0949b.getClass()).mo5306a(abstractC0949b);
            if (abstractC0949b.zzex != 0) {
                throw new RuntimeException();
            }
            boolean zMo5311f = true;
            byte bByteValue = ((Byte) abstractC0949b.mo5293a(1)).byteValue();
            if (bByteValue != 1) {
                if (bByteValue == 0) {
                    zMo5311f = false;
                } else {
                    zMo5311f = r0cVar.m20230a(abstractC0949b.getClass()).mo5311f(abstractC0949b);
                    abstractC0949b.mo5293a(2);
                }
            }
            if (zMo5311f) {
                return (C0956i) abstractC0949b;
            }
            throw new zzco(new zzew().getMessage());
        } catch (IOException e) {
            if (e.getCause() instanceof zzco) {
                throw ((zzco) e.getCause());
            }
            throw new zzco(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw zzco.m5346a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [d0c, java.lang.Object] */
    @Override // com.google.android.gms.internal.clearcut.AbstractC0949b
    /* JADX INFO: renamed from: a */
    public final Object mo5293a(int i) {
        Object obj;
        switch (odc.f54236a[i - 1]) {
            case 1:
                return new C0956i();
            case 2:
                return new ddc(zzbir);
            case 3:
                return new z0c(zzbir, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0002\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbiq", C0955h.class});
            case 4:
                return zzbir;
            case 5:
                d0c d0cVar = zzbg;
                if (d0cVar != null) {
                    return d0cVar;
                }
                synchronized (C0956i.class) {
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
    public final utb m5341e() {
        return this.zzbiq;
    }
}
