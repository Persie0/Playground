package p000;

import com.kochava.tracker.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ob2 extends mb2 {

    /* JADX INFO: renamed from: i */
    public static final String f54127i;

    /* JADX INFO: renamed from: j */
    public static final sq5 f54128j;

    static {
        String str = se4.f60755t;
        f54127i = str;
        sj5 sj5VarM20396w = r46.m20396w();
        f54128j = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, str);
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: f */
    public final qb2 mo16745f(ce4 ce4Var) {
        return new qb2(false);
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: i */
    public final C0022ak mo16748i(ce4 ce4Var) {
        long j;
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        if (rl7Var.m20693i().m25694H() && rl7Var.m20694j().m562I()) {
            am7 am7VarM20694j = rl7Var.m20694j();
            synchronized (am7VarM20694j) {
                j = am7VarM20694j.f839d;
            }
            long jM4705R = ci8.m4705R(rl7Var.m20693i().m25692F().f55552a.f57262a) + j;
            return System.currentTimeMillis() > jM4705R ? C0022ak.m509b() : C0022ak.m511d(jM4705R - System.currentTimeMillis());
        }
        return C0022ak.m510c();
    }
}
