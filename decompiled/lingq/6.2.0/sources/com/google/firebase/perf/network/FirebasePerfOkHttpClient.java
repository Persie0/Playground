package com.google.firebase.perf.network;

import android.os.Build;
import android.util.CloseGuard;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.util.logging.Level;
import p000.AbstractC3559s3;
import p000.C2927dg;
import p000.C3386nv;
import p000.bm0;
import p000.co7;
import p000.ex3;
import p000.f18;
import p000.i18;
import p000.j88;
import p000.lk6;
import p000.m88;
import p000.mba;
import p000.mk6;
import p000.ny8;
import p000.u87;
import p000.vl0;
import p000.xo2;
import p000.xv5;
import p000.z68;

/* JADX INFO: loaded from: classes.dex */
public class FirebasePerfOkHttpClient {
    /* JADX INFO: renamed from: a */
    public static void m6732a(j88 j88Var, lk6 lk6Var, long j, long j2) {
        co7 co7Var = j88Var.f45201a;
        if (co7Var == null) {
            return;
        }
        lk6Var.m16324j(((ex3) co7Var.f10360c).m11384j().toString());
        lk6Var.m16317c((String) co7Var.f10359b);
        z68 z68Var = (z68) co7Var.f10362e;
        if (z68Var != null) {
            long jMo159a = z68Var.mo159a();
            if (jMo159a != -1) {
                lk6Var.m16319e(jMo159a);
            }
        }
        m88 m88Var = j88Var.f45207g;
        if (m88Var != null) {
            long jMo3001b = m88Var.mo3001b();
            if (jMo3001b != -1) {
                lk6Var.m16322h(jMo3001b);
            }
            xv5 xv5VarMo3002c = m88Var.mo3002c();
            if (xv5VarMo3002c != null) {
                lk6Var.m16321g(xv5VarMo3002c.f68847a);
            }
        }
        lk6Var.m16318d(j88Var.f45204d);
        lk6Var.m16320f(j);
        lk6Var.m16323i(j2);
        lk6Var.m16316b();
    }

    public static void enqueue(vl0 vl0Var, bm0 bm0Var) {
        Object th;
        Timer timer = new Timer();
        xo2 xo2Var = new xo2(bm0Var, mba.f50883N, timer, timer.f13787a);
        i18 i18Var = (i18) vl0Var;
        i18Var.getClass();
        if (!i18Var.f43346e.compareAndSet(false, true)) {
            C3386nv.m17633t("Already Executed");
            return;
        }
        C2927dg c2927dg = u87.f63590a;
        u87.f63590a.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            CloseGuard closeGuardM21024h = AbstractC3559s3.m21024h();
            closeGuardM21024h.open("response.body().close()");
            th = closeGuardM21024h;
        } else {
            th = u87.f63591b.isLoggable(Level.FINE) ? new Throwable("response.body().close()") : null;
        }
        i18Var.f43347f = th;
        ny8 ny8Var = i18Var.f43342a.f36085a;
        f18 f18Var = new f18(i18Var, xo2Var);
        ny8Var.getClass();
        ny8.m17673J(ny8Var, f18Var, null, null, 6);
    }

    public static j88 execute(vl0 vl0Var) throws IOException {
        lk6 lk6Var = new lk6(mba.f50883N);
        Timer timer = new Timer();
        long j = timer.f13787a;
        try {
            j88 j88VarM13621d = ((i18) vl0Var).m13621d();
            m6732a(j88VarM13621d, lk6Var, j, timer.m6742a());
            return j88VarM13621d;
        } catch (IOException e) {
            co7 co7Var = ((i18) vl0Var).f43343b;
            if (co7Var != null) {
                ex3 ex3Var = (ex3) co7Var.f10360c;
                if (ex3Var != null) {
                    lk6Var.m16324j(ex3Var.m11384j().toString());
                }
                String str = (String) co7Var.f10359b;
                if (str != null) {
                    lk6Var.m16317c(str);
                }
            }
            lk6Var.m16320f(j);
            lk6Var.m16323i(timer.m6742a());
            mk6.m16868c(lk6Var);
            throw e;
        }
    }
}
