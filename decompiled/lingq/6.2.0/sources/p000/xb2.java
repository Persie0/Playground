package p000;

import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.datapoint.internal.SdkTimingAction;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xb2 extends mb2 implements sk7 {

    /* JADX INFO: renamed from: i */
    public static final String f68019i;

    /* JADX INFO: renamed from: j */
    public static final sq5 f68020j;

    static {
        String str = se4.f60754s;
        f68019i = str;
        sj5 sj5VarM20396w = r46.m20396w();
        f68020j = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, str);
    }

    @Override // p000.sk7
    /* JADX INFO: renamed from: a */
    public final void mo10459a() {
    }

    @Override // p000.sk7
    /* JADX INFO: renamed from: d */
    public final void mo10462d() {
        C3309ls c3309ls = this.f50875e;
        if (c3309ls != null) {
            ((yd4) c3309ls.f50066d).m25092m();
        } else {
            ho2.m13385e("Dependency was not initialized");
        }
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: f */
    public final qb2 mo16745f(ce4 ce4Var) {
        List list = ((rk7) ce4Var.f9971f).f59439b;
        list.remove(this);
        list.add(this);
        return qb2.m19845a();
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: h */
    public final void mo16747h(ce4 ce4Var, boolean z) {
        if (z) {
            ((g02) ce4Var.f9969d).m12254b(SdkTimingAction.PrivacySleepDisabled);
        }
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: i */
    public final C0022ak mo16748i(ce4 ce4Var) {
        boolean z;
        rk7 rk7Var = (rk7) ce4Var.f9971f;
        synchronized (rk7Var) {
            z = rk7Var.f59445h;
        }
        return z ? C0022ak.m510c() : C0022ak.m509b();
    }
}
