package com.google.firebase.perf;

import android.app.Application;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.SessionManager;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000.AbstractC3122is;
import p000.C3659us;
import p000.RunnableC3795yg;
import p000.c53;
import p000.cl7;
import p000.dh1;
import p000.dy1;
import p000.fba;
import p000.g53;
import p000.gc1;
import p000.h53;
import p000.h58;
import p000.hc1;
import p000.ho2;
import p000.i53;
import p000.j53;
import p000.k50;
import p000.kaa;
import p000.kfa;
import p000.l62;
import p000.lb2;
import p000.mba;
import p000.ny8;
import p000.q43;
import p000.rp7;
import p000.s46;
import p000.vc1;
import p000.x43;
import p000.yi2;

/* JADX INFO: loaded from: classes.dex */
public class FirebasePerfRegistrar implements ComponentRegistrar {
    private static final String EARLY_LIBRARY_NAME = "fire-perf-early";
    private static final String LIBRARY_NAME = "fire-perf";

    /* JADX INFO: Access modifiers changed from: private */
    public static c53 lambda$getComponents$0(rp7 rp7Var, vc1 vc1Var) {
        AppStartTrace appStartTrace;
        q43 q43Var = (q43) vc1Var.mo4926a(q43.class);
        k50 k50Var = (k50) vc1Var.mo4928c(k50.class).get();
        Executor executor = (Executor) vc1Var.mo4932g(rp7Var);
        c53 c53Var = new c53();
        q43Var.m19644a();
        Context context = q43Var.f57252a;
        dh1 dh1VarM10376e = dh1.m10376e();
        dh1VarM10376e.getClass();
        dh1.f35640d.f66844b = kaa.m15042d(context);
        dh1VarM10376e.f35644c.m23845c(context);
        C3659us c3659usM22881a = C3659us.m22881a();
        synchronized (c3659usM22881a) {
            if (!c3659usM22881a.f64266K) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof Application) {
                    ((Application) applicationContext).registerActivityLifecycleCallbacks(c3659usM22881a);
                    c3659usM22881a.f64266K = true;
                }
            }
        }
        h53 h53Var = new h53();
        synchronized (c3659usM22881a.f64274g) {
            c3659usM22881a.f64274g.add(h53Var);
        }
        if (k50Var != null) {
            if (AppStartTrace.f13745U != null) {
                appStartTrace = AppStartTrace.f13745U;
            } else {
                mba mbaVar = mba.f50883N;
                s46 s46Var = new s46(8);
                if (AppStartTrace.f13745U == null) {
                    synchronized (AppStartTrace.class) {
                        try {
                            if (AppStartTrace.f13745U == null) {
                                AppStartTrace.f13745U = new AppStartTrace(mbaVar, s46Var, dh1.m10376e(), new ThreadPoolExecutor(0, 1, 10 + AppStartTrace.f13743S, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                appStartTrace = AppStartTrace.f13745U;
            }
            synchronized (appStartTrace) {
                if (!appStartTrace.f13757a) {
                    cl7.f10231h.f10237f.mo21323g(appStartTrace);
                    Context applicationContext2 = context.getApplicationContext();
                    if (applicationContext2 instanceof Application) {
                        ((Application) applicationContext2).registerActivityLifecycleCallbacks(appStartTrace);
                        appStartTrace.f13756Q = appStartTrace.f13756Q || AppStartTrace.m6725f((Application) applicationContext2);
                        appStartTrace.f13757a = true;
                        appStartTrace.f13761e = (Application) applicationContext2;
                    }
                }
            }
            executor.execute(new RunnableC3795yg(appStartTrace, 2));
        }
        SessionManager.getInstance().initializeGaugeCollection();
        return c53Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g53 providesFirebasePerformance(vc1 vc1Var) {
        vc1Var.mo4926a(c53.class);
        ny8 ny8Var = new ny8((q43) vc1Var.mo4926a(q43.class), (x43) vc1Var.mo4926a(x43.class), vc1Var.mo4928c(h58.class), vc1Var.mo4928c(fba.class), 3);
        int i = 2;
        int i2 = 1;
        int i3 = 3;
        return (g53) ((yi2) yi2.m25153a(new j53(new i53(ny8Var, 0), new i53(ny8Var, i), new i53(ny8Var, i2), new i53(ny8Var, i3), new dy1(ny8Var, i), new dy1(ny8Var, i2), new dy1(ny8Var, i3)))).get();
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hc1> getComponents() {
        rp7 rp7Var = new rp7(kfa.class, Executor.class);
        gc1 gc1VarM13189b = hc1.m13189b(g53.class);
        gc1VarM13189b.f40515a = LIBRARY_NAME;
        gc1VarM13189b.m12471a(lb2.m16059c(q43.class));
        gc1VarM13189b.m12471a(new lb2(1, 1, h58.class));
        gc1VarM13189b.m12471a(lb2.m16059c(x43.class));
        gc1VarM13189b.m12471a(new lb2(1, 1, fba.class));
        gc1VarM13189b.m12471a(lb2.m16059c(c53.class));
        gc1VarM13189b.f40520f = new ho2(25);
        hc1 hc1VarM12472b = gc1VarM13189b.m12472b();
        gc1 gc1VarM13189b2 = hc1.m13189b(c53.class);
        gc1VarM13189b2.f40515a = EARLY_LIBRARY_NAME;
        gc1VarM13189b2.m12471a(lb2.m16059c(q43.class));
        gc1VarM13189b2.m12471a(lb2.m16057a(k50.class));
        gc1VarM13189b2.m12471a(new lb2(rp7Var, 1, 0));
        gc1VarM13189b2.m12473c(2);
        gc1VarM13189b2.f40520f = new l62(rp7Var, 2);
        return Arrays.asList(hc1VarM12472b, gc1VarM13189b2.m12472b(), AbstractC3122is.m14099m(LIBRARY_NAME, "22.0.5"));
    }
}
