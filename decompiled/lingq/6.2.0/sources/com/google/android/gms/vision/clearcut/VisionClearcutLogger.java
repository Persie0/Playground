package com.google.android.gms.vision.clearcut;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.internal.vision.C1030o;
import com.google.android.gms.internal.vision.C1031p;
import com.google.android.gms.internal.vision.C1032q;
import java.io.IOException;
import p000.C2943dx;
import p000.cnc;
import p000.g6c;
import p000.i5c;
import p000.iwc;
import p000.klc;
import p000.m31;
import p000.mec;
import p000.ovc;
import p000.qhd;

/* JADX INFO: loaded from: classes2.dex */
public class VisionClearcutLogger {
    private final m31 zza;
    private boolean zzb = true;

    public VisionClearcutLogger(Context context) {
        this.zza = new m31(context);
    }

    public final void zza(int i, C1030o c1030o) {
        klc klcVarM4904a;
        c1030o.getClass();
        try {
            int iM5746h = c1030o.m5746h();
            byte[] bArr = new byte[iM5746h];
            C1031p c1031p = new C1031p(iM5746h, bArr);
            ovc ovcVar = ovc.f55046c;
            ovcVar.getClass();
            iwc iwcVarM18526a = ovcVar.m18526a(c1030o.getClass());
            C1032q c1032q = c1031p.f12236a;
            if (c1032q == null) {
                c1032q = new C1032q(c1031p);
            }
            iwcVarM18526a.mo5762d(c1030o, c1032q);
            if (c1031p.m5732e() != 0) {
                throw new IllegalStateException("Did not write as much data as expected.");
            }
            if (i < 0 || i > 3) {
                Object[] objArr = {Integer.valueOf(i)};
                if (Log.isLoggable("Vision", 4)) {
                    Log.i("Vision", String.format("Illegal event code: %d", objArr));
                    return;
                }
                return;
            }
            try {
                if (this.zzb) {
                    m31 m31Var = this.zza;
                    m31Var.getClass();
                    C2943dx c2943dx = new C2943dx(m31Var, bArr);
                    ((mec) c2943dx.f36348e).f51228c = i;
                    c2943dx.m10721i();
                    return;
                }
                g6c g6cVarM5714k = C1030o.m5714k();
                try {
                    klc klcVar = klc.f47500b;
                    if (klcVar == null) {
                        synchronized (klc.class) {
                            try {
                                klcVarM4904a = klc.f47500b;
                                if (klcVarM4904a == null) {
                                    klcVarM4904a = cnc.m4904a();
                                    klc.f47500b = klcVarM4904a;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        klcVar = klcVarM4904a;
                    }
                    g6cVarM5714k.m20722c(bArr, iM5746h, klcVar);
                    String string = g6cVarM5714k.toString();
                    if (Log.isLoggable("Vision", 6)) {
                        Log.e("Vision", "Would have logged:\n" + string);
                    }
                } catch (Exception e) {
                    qhd.m19975a(e, "Parsing error", new Object[0]);
                }
            } catch (Exception e2) {
                i5c.f43560a.mo4332c(e2);
                qhd.m19975a(e2, "Failed to log", new Object[0]);
            }
        } catch (IOException e3) {
            String name = C1030o.class.getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e3);
        }
    }
}
