package com.google.firebase.sessions;

import android.content.Context;
import android.util.Log;
import androidx.datastore.core.MultiProcessDataStoreFactory;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p000.AbstractC3122is;
import p000.by1;
import p000.ci8;
import p000.do7;
import p000.ez8;
import p000.fba;
import p000.g59;
import p000.gc1;
import p000.h70;
import p000.hc1;
import p000.ho2;
import p000.kn1;
import p000.lb2;
import p000.nn1;
import p000.p53;
import p000.q43;
import p000.q53;
import p000.qo7;
import p000.r53;
import p000.r58;
import p000.rp7;
import p000.td0;
import p000.u53;
import p000.uo7;
import p000.ut2;
import p000.v53;
import p000.vc1;
import p000.vz1;
import p000.wy8;
import p000.x43;
import p000.xi2;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    public static final String LIBRARY_NAME = "fire-sessions";
    private static final u53 Companion = new u53();
    private static final rp7 appContext = rp7.m20740a(Context.class);
    private static final rp7 firebaseApp = rp7.m20740a(q43.class);
    private static final rp7 firebaseInstallationsApi = rp7.m20740a(x43.class);
    private static final rp7 backgroundDispatcher = new rp7(h70.class, nn1.class);
    private static final rp7 blockingDispatcher = new rp7(td0.class, nn1.class);
    private static final rp7 transportFactory = rp7.m20740a(fba.class);
    private static final rp7 firebaseSessionsComponent = rp7.m20740a(p53.class);

    static {
        try {
            MultiProcessDataStoreFactory.INSTANCE.getClass();
        } catch (NoClassDefFoundError unused) {
            Log.w("FirebaseSessions", "Your app is experiencing a known issue in the Android Gradle plugin, see https://issuetracker.google.com/328687152\n\nIt affects Java-only apps using AGP version 8.3.2 and under. To avoid the issue, either:\n\n1. Upgrade Android Gradle plugin to 8.4.0+\n   Follow the guide at https://developer.android.com/build/agp-upgrade-assistant\n\n2. Or, add the Kotlin plugin to your app\n   Follow the guide at https://developer.android.com/kotlin/add-kotlin\n\n3. Or, do the technical workaround described in https://issuetracker.google.com/issues/328687152#comment3");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C1164a getComponents$lambda$0(vc1 vc1Var) {
        return (C1164a) ((by1) ((p53) vc1Var.mo4932g(firebaseSessionsComponent))).f9171p.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p53 getComponents$lambda$1(vc1 vc1Var) {
        Object objMo4932g = vc1Var.mo4932g(appContext);
        objMo4932g.getClass();
        Object objMo4932g2 = vc1Var.mo4932g(backgroundDispatcher);
        objMo4932g2.getClass();
        Object objMo4932g3 = vc1Var.mo4932g(blockingDispatcher);
        objMo4932g3.getClass();
        Object objMo4932g4 = vc1Var.mo4932g(firebaseApp);
        objMo4932g4.getClass();
        Object objMo4932g5 = vc1Var.mo4932g(firebaseInstallationsApi);
        objMo4932g5.getClass();
        uo7 uo7VarMo4931f = vc1Var.mo4931f(transportFactory);
        uo7VarMo4931f.getClass();
        by1 by1Var = new by1();
        by1Var.f9156a = wy8.m24219a((q43) objMo4932g4);
        wy8 wy8VarM24219a = wy8.m24219a((Context) objMo4932g);
        by1Var.f9157b = wy8VarM24219a;
        by1Var.f9158c = xi2.m24525a(new ut2(wy8VarM24219a, 2));
        by1Var.f9159d = xi2.m24525a(do7.f35954c);
        by1Var.f9160e = wy8.m24219a((x43) objMo4932g5);
        int i = 1;
        by1Var.f9161f = xi2.m24525a(new ut2(by1Var.f9156a, i));
        wy8 wy8VarM24219a2 = wy8.m24219a((kn1) objMo4932g3);
        by1Var.f9162g = wy8VarM24219a2;
        by1Var.f9163h = xi2.m24525a(new q53(by1Var.f9161f, wy8VarM24219a2));
        by1Var.f9164i = wy8.m24219a((kn1) objMo4932g2);
        int i2 = 0;
        by1Var.f9165j = xi2.m24525a(new ez8(by1Var.f9158c, xi2.m24525a(new r58(by1Var.f9159d, by1Var.f9160e, by1Var.f9161f, by1Var.f9163h, xi2.m24525a(new r53((qo7) by1Var.f9164i, by1Var.f9159d, xi2.m24525a(new q53(by1Var.f9157b, by1Var.f9162g, i2)))))), i));
        qo7 qo7VarM24525a = xi2.m24525a(ci8.f10119c);
        by1Var.f9166k = qo7VarM24525a;
        by1Var.f9167l = xi2.m24525a(new ez8(by1Var.f9159d, qo7VarM24525a, i2));
        by1Var.f9168m = xi2.m24525a(new r58(by1Var.f9156a, (qo7) by1Var.f9160e, by1Var.f9165j, xi2.m24525a(new ut2(wy8.m24219a(uo7VarMo4931f), i2)), (qo7) by1Var.f9164i));
        by1Var.f9169n = xi2.m24525a(new r53(by1Var.f9157b, (qo7) by1Var.f9162g, xi2.m24525a(new wy8(by1Var.f9167l, i2))));
        qo7 qo7VarM24525a2 = xi2.m24525a(new g59(by1Var.f9165j, by1Var.f9167l, by1Var.f9168m, by1Var.f9159d, by1Var.f9169n, xi2.m24525a(new q53(by1Var.f9157b, by1Var.f9166k, i)), by1Var.f9164i));
        by1Var.f9170o = qo7VarM24525a2;
        by1Var.f9171p = xi2.m24525a(new v53(by1Var.f9156a, by1Var.f9165j, by1Var.f9164i, xi2.m24525a(new wy8(qo7VarM24525a2, i))));
        return by1Var;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hc1> getComponents() {
        gc1 gc1VarM13189b = hc1.m13189b(C1164a.class);
        gc1VarM13189b.f40515a = LIBRARY_NAME;
        gc1VarM13189b.m12471a(lb2.m16058b(firebaseSessionsComponent));
        gc1VarM13189b.f40520f = new ho2(28);
        gc1VarM13189b.m12473c(2);
        hc1 hc1VarM12472b = gc1VarM13189b.m12472b();
        gc1 gc1VarM13189b2 = hc1.m13189b(p53.class);
        gc1VarM13189b2.f40515a = "fire-sessions-component";
        gc1VarM13189b2.m12471a(lb2.m16058b(appContext));
        gc1VarM13189b2.m12471a(lb2.m16058b(backgroundDispatcher));
        gc1VarM13189b2.m12471a(lb2.m16058b(blockingDispatcher));
        gc1VarM13189b2.m12471a(lb2.m16058b(firebaseApp));
        gc1VarM13189b2.m12471a(lb2.m16058b(firebaseInstallationsApi));
        gc1VarM13189b2.m12471a(new lb2(transportFactory, 1, 1));
        gc1VarM13189b2.f40520f = new ho2(29);
        return vz1.m23605K(hc1VarM12472b, gc1VarM13189b2.m12472b(), AbstractC3122is.m14099m(LIBRARY_NAME, "3.0.6"));
    }
}
