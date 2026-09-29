package p000;

import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.SdkTimingAction;

/* JADX INFO: loaded from: classes.dex */
public final class vb2 extends mb2 {

    /* JADX INFO: renamed from: i */
    public static final String f65158i;

    /* JADX INFO: renamed from: j */
    public static final sq5 f65159j;

    static {
        String str = se4.f60757v;
        f65158i = str;
        sj5 sj5VarM20396w = r46.m20396w();
        f65159j = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, str);
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: f */
    public final qb2 mo16745f(ce4 ce4Var) {
        return qb2.m19845a();
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: h */
    public final void mo16747h(ce4 ce4Var, boolean z) {
        if (z) {
            d74 d74Var = (d74) ce4Var.f9968c;
            if (((String) d74Var.f35081e) == null || !d74Var.f35079c) {
                return;
            }
            ((g02) ce4Var.f9969d).m12254b(SdkTimingAction.InstantAppDeeplinkReady);
        }
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: i */
    public final C0022ak mo16748i(ce4 ce4Var) {
        e74 e74Var;
        d74 d74Var = (d74) ce4Var.f9968c;
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        if (((String) d74Var.f35081e) == null || !d74Var.f35079c) {
            return C0022ak.m509b();
        }
        if (!rl7Var.m20693i().m25694H()) {
            return C0022ak.m510c();
        }
        am7 am7VarM20694j = rl7Var.m20694j();
        synchronized (am7VarM20694j) {
            e74Var = am7VarM20694j.f832I;
        }
        if (e74Var != null) {
            return C0022ak.m509b();
        }
        long jM4705R = d74Var.f35078b + ci8.m4705R(rl7Var.m20693i().m25692F().f55559h.f57262a);
        return System.currentTimeMillis() > jM4705R ? C0022ak.m509b() : C0022ak.m511d(jM4705R - System.currentTimeMillis());
    }
}
