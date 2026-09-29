package p000;

import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wb2 extends mb2 {

    /* JADX INFO: renamed from: i */
    public static final String f66581i;

    /* JADX INFO: renamed from: j */
    public static final sq5 f66582j;

    static {
        String str = se4.f60756u;
        f66581i = str;
        sj5 sj5VarM20396w = r46.m20396w();
        f66582j = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, str);
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: f */
    public final qb2 mo16745f(ce4 ce4Var) {
        return new qb2(false);
    }

    @Override // p000.mb2
    /* JADX INFO: renamed from: i */
    public final C0022ak mo16748i(ce4 ce4Var) {
        boolean z;
        ArrayList arrayList;
        rl7 rl7Var = (rl7) ce4Var.f9967b;
        if (rl7Var.m20693i().m25694H() && rl7Var.m20694j().m562I()) {
            am7 am7VarM20694j = rl7Var.m20694j();
            synchronized (am7VarM20694j) {
                z = am7VarM20694j.f841f;
            }
            if (z) {
                boolean z2 = rl7Var.m20693i().m25692F().f55555d.f63390a;
                rk7 rk7Var = (rk7) ce4Var.f9971f;
                synchronized (rk7Var) {
                    arrayList = rk7Var.f59444g;
                }
                boolean zContains = arrayList.contains(PayloadType.Install);
                if (!z2 && !zContains) {
                    return C0022ak.m510c();
                }
            }
            return C0022ak.m509b();
        }
        return C0022ak.m510c();
    }
}
