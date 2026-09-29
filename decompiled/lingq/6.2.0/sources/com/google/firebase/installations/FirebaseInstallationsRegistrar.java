package com.google.firebase.installations;

import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorC1147c;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p000.AbstractC3122is;
import p000.fc1;
import p000.gc1;
import p000.h70;
import p000.hc1;
import p000.ho2;
import p000.lb2;
import p000.q43;
import p000.rp7;
import p000.td0;
import p000.tr3;
import p000.ur3;
import p000.vc1;
import p000.x43;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static x43 lambda$getComponents$0(vc1 vc1Var) {
        return new C1154a((q43) vc1Var.mo4926a(q43.class), vc1Var.mo4928c(ur3.class), (ExecutorService) vc1Var.mo4932g(new rp7(h70.class, ExecutorService.class)), new ExecutorC1147c((Executor) vc1Var.mo4932g(new rp7(td0.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hc1> getComponents() {
        gc1 gc1VarM13189b = hc1.m13189b(x43.class);
        gc1VarM13189b.f40515a = LIBRARY_NAME;
        gc1VarM13189b.m12471a(lb2.m16059c(q43.class));
        gc1VarM13189b.m12471a(lb2.m16057a(ur3.class));
        int i = 0;
        gc1VarM13189b.m12471a(new lb2(new rp7(h70.class, ExecutorService.class), 1, 0));
        gc1VarM13189b.m12471a(new lb2(new rp7(td0.class, Executor.class), 1, 0));
        gc1VarM13189b.f40520f = new ho2(23);
        hc1 hc1VarM12472b = gc1VarM13189b.m12472b();
        tr3 tr3Var = new tr3(i);
        gc1 gc1VarM13189b2 = hc1.m13189b(tr3.class);
        gc1VarM13189b2.f40519e = 1;
        gc1VarM13189b2.f40520f = new fc1(tr3Var, i);
        return Arrays.asList(hc1VarM12472b, gc1VarM13189b2.m12472b(), AbstractC3122is.m14099m(LIBRARY_NAME, "19.1.0"));
    }
}
