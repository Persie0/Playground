package org.joda.time;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.base.BaseDateTime;
import org.joda.time.chrono.ISOChronology;
import p000.C3386nv;
import p000.b22;
import p000.hy3;
import p000.k12;
import p000.nc3;
import p000.s11;
import p000.s94;
import p000.t22;

/* JADX INFO: loaded from: classes.dex */
public final class DateTime extends BaseDateTime implements Serializable {
    private static final long serialVersionUID = -5171125899451703815L;

    /* JADX INFO: renamed from: e */
    public static DateTime m18332e(String str) {
        k12 k12Var = hy3.f43179e0;
        if (!k12Var.f46547d) {
            k12Var = new k12(k12Var.f46544a, k12Var.f46545b, k12Var.f46546c, true, k12Var.f46548e, null);
        }
        s94 s94Var = k12Var.f46545b;
        if (s94Var == null) {
            C3386nv.m17636w("Parsing not supported");
            return null;
        }
        s11 s11VarM14768c = k12Var.m14768c(null);
        b22 b22Var = new b22(s11VarM14768c, k12Var.f46546c);
        int into = s94Var.parseInto(b22Var, str, 0);
        if (into < 0) {
            into = ~into;
        } else if (into >= str.length()) {
            long jM3182c = b22Var.m3182c(str);
            if (k12Var.f46547d && b22Var.m3185f() != null) {
                s11VarM14768c = s11VarM14768c.mo18359H(DateTimeZone.m18338d(b22Var.m3185f().intValue()));
            } else if (b22Var.m3186g() != null) {
                s11VarM14768c = s11VarM14768c.mo18359H(b22Var.m3186g());
            }
            DateTime dateTime = new DateTime(jM3182c, s11VarM14768c);
            DateTimeZone dateTimeZone = k12Var.f46549f;
            if (dateTimeZone != null) {
                s11 s11VarMo18359H = dateTime.mo18365a().mo18359H(dateTimeZone);
                AtomicReference atomicReference = t22.f61763a;
                if (s11VarMo18359H == null) {
                    s11VarMo18359H = ISOChronology.m18437Q();
                }
                if (s11VarMo18359H != dateTime.mo18365a()) {
                    return new DateTime(dateTime.mo18366b(), s11VarMo18359H);
                }
            }
            return dateTime;
        }
        C3386nv.m17626m(nc3.m17347c(into, str));
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final DateTime m18333f(int i) {
        if (i != 0) {
            long jMo11268a = mo18365a().mo18401h().mo11268a(i, mo18366b());
            if (jMo11268a != mo18366b()) {
                return new DateTime(jMo11268a, mo18365a());
            }
        }
        return this;
    }
}
