package com.google.firebase.messaging;

import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC3122is;
import p000.dba;
import p000.fba;
import p000.gc1;
import p000.hc1;
import p000.ho2;
import p000.l62;
import p000.lb2;
import p000.n92;
import p000.q43;
import p000.rp7;
import p000.um9;
import p000.vc1;
import p000.vr3;
import p000.x43;
import p000.y43;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(rp7 rp7Var, vc1 vc1Var) {
        q43 q43Var = (q43) vc1Var.mo4926a(q43.class);
        if (vc1Var.mo4926a(y43.class) == null) {
            return new FirebaseMessaging(q43Var, vc1Var.mo4928c(n92.class), vc1Var.mo4928c(vr3.class), (x43) vc1Var.mo4926a(x43.class), vc1Var.mo4931f(rp7Var), (um9) vc1Var.mo4926a(um9.class));
        }
        ho2.m13383c();
        return null;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hc1> getComponents() {
        rp7 rp7Var = new rp7(dba.class, fba.class);
        gc1 gc1VarM13189b = hc1.m13189b(FirebaseMessaging.class);
        gc1VarM13189b.f40515a = LIBRARY_NAME;
        gc1VarM13189b.m12471a(lb2.m16059c(q43.class));
        gc1VarM13189b.m12471a(new lb2(0, 0, y43.class));
        gc1VarM13189b.m12471a(lb2.m16057a(n92.class));
        gc1VarM13189b.m12471a(lb2.m16057a(vr3.class));
        gc1VarM13189b.m12471a(lb2.m16059c(x43.class));
        gc1VarM13189b.m12471a(new lb2(rp7Var, 0, 1));
        gc1VarM13189b.m12471a(lb2.m16059c(um9.class));
        gc1VarM13189b.f40520f = new l62(rp7Var, 1);
        gc1VarM13189b.m12473c(1);
        return Arrays.asList(gc1VarM13189b.m12472b(), AbstractC3122is.m14099m(LIBRARY_NAME, "25.0.2"));
    }
}
