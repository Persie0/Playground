package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC3122is;
import p000.C2986f2;
import p000.InterfaceC3036gf;
import p000.gc1;
import p000.gm5;
import p000.hc1;
import p000.lb2;
import p000.vc1;

/* JADX INFO: loaded from: classes.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C2986f2 lambda$getComponents$0(vc1 vc1Var) {
        return new C2986f2((Context) vc1Var.mo4926a(Context.class), vc1Var.mo4928c(InterfaceC3036gf.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hc1> getComponents() {
        gc1 gc1VarM13189b = hc1.m13189b(C2986f2.class);
        gc1VarM13189b.f40515a = LIBRARY_NAME;
        gc1VarM13189b.m12471a(lb2.m16059c(Context.class));
        gc1VarM13189b.m12471a(lb2.m16057a(InterfaceC3036gf.class));
        gc1VarM13189b.f40520f = new gm5(4);
        return Arrays.asList(gc1VarM13189b.m12472b(), AbstractC3122is.m14099m(LIBRARY_NAME, "21.1.1"));
    }
}
