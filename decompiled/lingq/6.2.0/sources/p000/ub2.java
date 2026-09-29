package p000;

import com.kochava.tracker.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ub2 extends mb2 {

    /* JADX INFO: renamed from: i */
    public static final String f63666i;

    /* JADX INFO: renamed from: j */
    public static final sq5 f63667j;

    static {
        String str = se4.f60759x;
        f63666i = str;
        sj5 sj5VarM20396w = r46.m20396w();
        f63667j = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, str);
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: f */
    public final qb2 mo16745f(ce4 ce4Var) {
        return qb2.m19845a();
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: i */
    public final C0022ak mo16748i(ce4 ce4Var) {
        boolean z;
        long j;
        hz8 hz8Var = (hz8) ce4Var.f9970e;
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        synchronized (hz8Var) {
            z = hz8Var.f43252g;
        }
        if (z) {
            return C0022ak.m509b();
        }
        am7 am7VarM20694j = rl7Var.m20694j();
        synchronized (am7VarM20694j) {
            j = am7VarM20694j.f839d;
        }
        long jM4705R = ci8.m4705R(rl7Var.m20693i().m25692F().f55560i.f69272a) + j;
        return System.currentTimeMillis() > jM4705R ? C0022ak.m509b() : C0022ak.m511d(jM4705R - System.currentTimeMillis());
    }
}
