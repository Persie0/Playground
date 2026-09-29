package p000;

import com.google.android.gms.internal.play_billing.AbstractC0985a;
import com.google.android.gms.internal.play_billing.C1005p;
import com.google.android.gms.internal.play_billing.C1006q;
import com.google.android.gms.internal.play_billing.C1007r;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjk;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class qvb {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f58258a = 0;

    static {
        int i = vvb.f65994G;
    }

    /* JADX INFO: renamed from: a */
    public static String m20181a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + xcd.m24460c(exc.getMessage());
            int i = AbstractC0985a.f12176a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to get truncated exception info", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1005p m20182b(zzjd zzjdVar, int i, qc0 qc0Var, String str, zzjk zzjkVar) {
        try {
            vnc vncVarM5623q = C1007r.m5623q();
            int i2 = qc0Var.f57553a;
            vncVarM5623q.m18948b();
            C1007r.m5622p((C1007r) vncVarM5623q.f55715b, i2);
            String str2 = qc0Var.f57555c;
            vncVarM5623q.m18948b();
            C1007r.m5625s((C1007r) vncVarM5623q.f55715b, str2);
            int i3 = qc0Var.f57554b;
            if (i3 != 0) {
                vncVarM5623q.m18948b();
                C1007r.m5627u((C1007r) vncVarM5623q.f55715b, i3);
            }
            if (zzjdVar != null) {
                vncVarM5623q.m18948b();
                C1007r.m5628v((C1007r) vncVarM5623q.f55715b, zzjdVar);
            }
            if (str != null) {
                vncVarM5623q.m18948b();
                C1007r.m5624r((C1007r) vncVarM5623q.f55715b, str);
            }
            imc imcVarM5610s = C1005p.m5610s();
            imcVarM5610s.m14030c(vncVarM5623q);
            imcVarM5610s.m18948b();
            C1005p.m5609r((C1005p) imcVarM5610s.f55715b, i);
            if (!zzjkVar.equals(zzjk.BROADCAST_ACTION_UNSPECIFIED)) {
                imcVarM5610s.m18948b();
                C1005p.m5612v((C1005p) imcVarM5610s.f55715b, zzjkVar);
            }
            return (C1005p) imcVarM5610s.m18947a();
        } catch (Throwable th) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to create logging payload", th);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C1006q m20183c(int i, zzjk zzjkVar) {
        try {
            wmc wmcVarM5616q = C1006q.m5616q();
            wmcVarM5616q.m24058f(i);
            if (!zzjkVar.equals(zzjk.BROADCAST_ACTION_UNSPECIFIED)) {
                wmcVarM5616q.m24055c(zzjkVar);
            }
            return (C1006q) wmcVarM5616q.m18947a();
        } catch (Exception e) {
            AbstractC0985a.m5509j("BillingLogger", "Unable to create logging payload", e);
            return null;
        }
    }
}
