package com.google.firebase.datatransport;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC3122is;
import p000.al0;
import p000.ax4;
import p000.dba;
import p000.fba;
import p000.gc1;
import p000.hc1;
import p000.lb2;
import p000.nba;
import p000.rp7;
import p000.uk9;
import p000.vc1;

/* JADX INFO: loaded from: classes.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ fba lambda$getComponents$0(vc1 vc1Var) {
        nba.m17319b((Context) vc1Var.mo4926a(Context.class));
        return nba.m17318a().m17320c(al0.f794f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ fba lambda$getComponents$1(vc1 vc1Var) {
        nba.m17319b((Context) vc1Var.mo4926a(Context.class));
        return nba.m17318a().m17320c(al0.f794f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ fba lambda$getComponents$2(vc1 vc1Var) {
        nba.m17319b((Context) vc1Var.mo4926a(Context.class));
        return nba.m17318a().m17320c(al0.f793e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hc1> getComponents() {
        gc1 gc1VarM13189b = hc1.m13189b(fba.class);
        gc1VarM13189b.f40515a = LIBRARY_NAME;
        gc1VarM13189b.m12471a(lb2.m16059c(Context.class));
        gc1VarM13189b.f40520f = new uk9(9);
        hc1 hc1VarM12472b = gc1VarM13189b.m12472b();
        gc1 gc1VarM13188a = hc1.m13188a(new rp7(ax4.class, fba.class));
        gc1VarM13188a.m12471a(lb2.m16059c(Context.class));
        gc1VarM13188a.f40520f = new uk9(10);
        hc1 hc1VarM12472b2 = gc1VarM13188a.m12472b();
        gc1 gc1VarM13188a2 = hc1.m13188a(new rp7(dba.class, fba.class));
        gc1VarM13188a2.m12471a(lb2.m16059c(Context.class));
        gc1VarM13188a2.f40520f = new uk9(11);
        return Arrays.asList(hc1VarM12472b, hc1VarM12472b2, gc1VarM13188a2.m12472b(), AbstractC3122is.m14099m(LIBRARY_NAME, "19.0.0"));
    }
}
