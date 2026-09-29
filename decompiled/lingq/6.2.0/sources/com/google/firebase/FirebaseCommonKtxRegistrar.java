package com.google.firebase;

import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import java.util.concurrent.Executor;
import p000.e41;
import p000.ec5;
import p000.gc1;
import p000.gz8;
import p000.h70;
import p000.hc1;
import p000.kfa;
import p000.lb2;
import p000.nn1;
import p000.p58;
import p000.rp7;
import p000.td0;
import p000.tr3;
import p000.vz1;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<hc1> getComponents() {
        gc1 gc1VarM13188a = hc1.m13188a(new rp7(h70.class, nn1.class));
        gc1VarM13188a.m12471a(new lb2(new rp7(h70.class, Executor.class), 1, 0));
        gc1VarM13188a.f40520f = p58.f55612f;
        hc1 hc1VarM12472b = gc1VarM13188a.m12472b();
        gc1 gc1VarM13188a2 = hc1.m13188a(new rp7(ec5.class, nn1.class));
        gc1VarM13188a2.m12471a(new lb2(new rp7(ec5.class, Executor.class), 1, 0));
        gc1VarM13188a2.f40520f = gz8.f41564e;
        hc1 hc1VarM12472b2 = gc1VarM13188a2.m12472b();
        gc1 gc1VarM13188a3 = hc1.m13188a(new rp7(td0.class, nn1.class));
        gc1VarM13188a3.m12471a(new lb2(new rp7(td0.class, Executor.class), 1, 0));
        gc1VarM13188a3.f40520f = e41.f36680e;
        hc1 hc1VarM12472b3 = gc1VarM13188a3.m12472b();
        gc1 gc1VarM13188a4 = hc1.m13188a(new rp7(kfa.class, nn1.class));
        gc1VarM13188a4.m12471a(new lb2(new rp7(kfa.class, Executor.class), 1, 0));
        gc1VarM13188a4.f40520f = tr3.f62757c;
        return vz1.m23605K(hc1VarM12472b, hc1VarM12472b2, hc1VarM12472b3, gc1VarM13188a4.m12472b());
    }
}
