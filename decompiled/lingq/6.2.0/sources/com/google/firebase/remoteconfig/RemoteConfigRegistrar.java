package com.google.firebase.remoteconfig;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import p000.AbstractC3122is;
import p000.C2986f2;
import p000.InterfaceC3036gf;
import p000.gc1;
import p000.h58;
import p000.hc1;
import p000.l62;
import p000.lb2;
import p000.m43;
import p000.m53;
import p000.q43;
import p000.rp7;
import p000.td0;
import p000.vc1;
import p000.x43;

/* JADX INFO: loaded from: classes.dex */
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static h58 lambda$getComponents$0(rp7 rp7Var, vc1 vc1Var) {
        m43 m43Var;
        Context context = (Context) vc1Var.mo4926a(Context.class);
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) vc1Var.mo4932g(rp7Var);
        q43 q43Var = (q43) vc1Var.mo4926a(q43.class);
        x43 x43Var = (x43) vc1Var.mo4926a(x43.class);
        C2986f2 c2986f2 = (C2986f2) vc1Var.mo4926a(C2986f2.class);
        synchronized (c2986f2) {
            try {
                if (!c2986f2.f38286a.containsKey("frc")) {
                    c2986f2.f38286a.put("frc", new m43(c2986f2.f38287b));
                }
                m43Var = (m43) c2986f2.f38286a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new h58(context, scheduledExecutorService, q43Var, x43Var, m43Var, vc1Var.mo4928c(InterfaceC3036gf.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hc1> getComponents() {
        rp7 rp7Var = new rp7(td0.class, ScheduledExecutorService.class);
        gc1 gc1Var = new gc1(h58.class, new Class[]{m53.class});
        gc1Var.f40515a = LIBRARY_NAME;
        gc1Var.m12471a(lb2.m16059c(Context.class));
        gc1Var.m12471a(new lb2(rp7Var, 1, 0));
        gc1Var.m12471a(lb2.m16059c(q43.class));
        gc1Var.m12471a(lb2.m16059c(x43.class));
        gc1Var.m12471a(lb2.m16059c(C2986f2.class));
        gc1Var.m12471a(lb2.m16057a(InterfaceC3036gf.class));
        gc1Var.f40520f = new l62(rp7Var, 3);
        gc1Var.m12473c(2);
        return Arrays.asList(gc1Var.m12472b(), AbstractC3122is.m14099m(LIBRARY_NAME, "23.1.0"));
    }
}
