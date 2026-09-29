package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import p000.AbstractC3122is;
import p000.C3182kf;
import p000.InterfaceC3036gf;
import p000.e41;
import p000.gc1;
import p000.hc1;
import p000.iy5;
import p000.lb2;
import p000.lda;
import p000.q43;
import p000.qg2;
import p000.qt2;
import p000.um9;
import p000.v3c;
import p000.vc1;

/* JADX INFO: loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC3036gf lambda$getComponents$0(vc1 vc1Var) {
        q43 q43Var = (q43) vc1Var.mo4926a(q43.class);
        Context context = (Context) vc1Var.mo4926a(Context.class);
        um9 um9Var = (um9) vc1Var.mo4926a(um9.class);
        lda.m16130p(q43Var);
        lda.m16130p(context);
        lda.m16130p(um9Var);
        lda.m16130p(context.getApplicationContext());
        if (C3182kf.f47116c == null) {
            synchronized (C3182kf.class) {
                try {
                    if (C3182kf.f47116c == null) {
                        Bundle bundle = new Bundle(1);
                        q43Var.m19644a();
                        if ("[DEFAULT]".equals(q43Var.f57253b)) {
                            ((qt2) um9Var).m20144a(qg2.f57748d, e41.f36684i);
                            bundle.putBoolean("dataCollectionDefaultEnabled", q43Var.m19648h());
                        }
                        C3182kf.f47116c = new C3182kf(v3c.m23084e(context, bundle).f64807b);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return C3182kf.f47116c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hc1> getComponents() {
        gc1 gc1VarM13189b = hc1.m13189b(InterfaceC3036gf.class);
        gc1VarM13189b.m12471a(lb2.m16059c(q43.class));
        gc1VarM13189b.m12471a(lb2.m16059c(Context.class));
        gc1VarM13189b.m12471a(lb2.m16059c(um9.class));
        gc1VarM13189b.f40520f = iy5.f44773i;
        gc1VarM13189b.m12473c(2);
        return Arrays.asList(gc1VarM13189b.m12472b(), AbstractC3122is.m14099m("fire-analytics", "23.2.0"));
    }
}
