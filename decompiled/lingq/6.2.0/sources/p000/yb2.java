package p000;

import com.kochava.tracker.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class yb2 extends mb2 {

    /* JADX INFO: renamed from: i */
    public static final String f69595i;

    /* JADX INFO: renamed from: j */
    public static final sq5 f69596j;

    static {
        String str = se4.f60758w;
        f69595i = str;
        sj5 sj5VarM20396w = r46.m20396w();
        f69596j = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, str);
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
        rq7 rq7VarM20117a;
        qq7 qq7Var = (qq7) ce4Var.f9972g;
        synchronized (qq7Var) {
            z = qq7Var.f58082a == 0;
        }
        if (z) {
            return C0022ak.m509b();
        }
        qq7 qq7Var2 = (qq7) ce4Var.f9972g;
        synchronized (qq7Var2) {
            rq7VarM20117a = qq7Var2.m20117a(false);
        }
        if (rq7VarM20117a.m20751f()) {
            return C0022ak.m509b();
        }
        return rq7VarM20117a.m20750e() ? C0022ak.m511d(rq7VarM20117a.m20749d()) : C0022ak.m510c();
    }
}
