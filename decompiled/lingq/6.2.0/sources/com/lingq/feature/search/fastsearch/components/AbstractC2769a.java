package com.lingq.feature.search.fastsearch.components;

import p000.C3539rk;
import p000.C3709w4;
import p000.aqb;
import p000.b16;
import p000.c03;
import p000.c99;
import p000.d32;
import p000.e16;
import p000.eu9;
import p000.hj4;
import p000.ix0;
import p000.mkd;
import p000.ms5;
import p000.p84;
import p000.ps5;
import p000.q6d;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.vh9;
import p000.vi3;
import p000.vv9;
import p000.vx9;
import p000.we1;
import p000.x18;
import p000.xwc;
import p000.ye1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.search.fastsearch.components.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2769a {
    /* JADX INFO: renamed from: a */
    public static final void m9683a(c03 c03Var, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3 vi3Var2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1953188317);
        int i2 = i | (tj3Var.m22120g(c03Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i3 = i2;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            Object[] objArr = new Object[0];
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new C3539rk(c03Var, 16);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66VarM24744Q = xwc.m24744Q(objArr, (ui3) objM22097O, tj3Var, 0);
            String str = c03Var.f9248a;
            boolean zM22120g = (i4 == 4) | tj3Var.m22120g(t66VarM24744Q);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                objM22097O2 = new FastSearchSearchFieldKt$FastSearchSearchField$1$1(c03Var, t66VarM24744Q, null);
                tj3Var.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O2, str);
            vv9 vv9Var = (vv9) t66VarM24744Q.getValue();
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            eu9 eu9VarM16905h = mkd.m16905h(((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55821F, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55824I, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B, 0L, tj3Var, 2147477455);
            vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j;
            hj4 hj4Var = new hj4(0, 3, null, 119);
            boolean zM22120g2 = tj3Var.m22120g(t66VarM24744Q) | ((i3 & 112) == 32);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O3 == p84Var) {
                vi3Var2 = vi3Var;
                objM22097O3 = new ix0(vi3Var2, t66VarM24744Q, 6);
                tj3Var.m22131l0(objM22097O3);
            } else {
                vi3Var2 = vi3Var;
            }
            q6d.m19685b(vv9Var, (vi3) objM22097O3, e16VarM4412e, false, vx9Var, aqb.f7374a, aqb.f7375b, null, hj4Var, null, true, 0, 0, null, eu9VarM16905h, tj3Var, 113246592, 12779520, 4030040);
            tj3Var = tj3Var;
        } else {
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(c03Var, i, 12, vi3Var2);
        }
    }
}
