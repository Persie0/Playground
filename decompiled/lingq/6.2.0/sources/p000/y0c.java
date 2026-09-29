package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.Lifecycle$Event;

/* JADX INFO: loaded from: classes2.dex */
public abstract class y0c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f69082a = new C0282a(1121996006, false, new ud1(13));

    /* JADX INFO: renamed from: a */
    public static final void m24826a(k66 k66Var, Lifecycle$Event lifecycle$Event, ye1 ye1Var, int i) {
        k66Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1770945943);
        int i2 = (tj3Var.m22120g(k66Var) ? 4 : 2) | i | 48;
        int i3 = 18;
        if ((i2 & 19) == 18 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            lifecycle$Event = Lifecycle$Event.ON_RESUME;
            tj3Var.m22111b0(-2101357749);
            boolean z = (i2 & 14) == 4;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new pb5(1, lifecycle$Event, k66Var);
                tj3Var.m22131l0(objM22097O);
            }
            rb5 rb5Var = (rb5) objM22097O;
            tj3Var.m22139q(false);
            AbstractC3572sf abstractC3572sfMo256K = ((ub5) tj3Var.m22128k(gi5.f40854a)).mo256K();
            tj3Var.m22111b0(-2101338711);
            boolean zM22124i = tj3Var.m22124i(abstractC3572sfMo256K) | tj3Var.m22124i(rb5Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new h85(22, abstractC3572sfMo256K, rb5Var);
                tj3Var.m22131l0(objM22097O2);
            }
            tj3Var.m22139q(false);
            d32.m10043i(abstractC3572sfMo256K, rb5Var, (vi3) objM22097O2, tj3Var);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(k66Var, i, i3, lifecycle$Event);
        }
    }
}
