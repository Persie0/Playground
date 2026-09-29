package p000;

import androidx.appcompat.widget.ActionBarContainer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z0d {
    /* JADX INFO: renamed from: a */
    public static final void m25399a(xq8 xq8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1282316341);
        int i2 = i | (tj3Var.m22120g(xq8Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i3 = i2;
        int i4 = 0;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            Object[] objArr = {xq8Var.f68545b};
            boolean z = (i3 & 14) == 4;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new br8(xq8Var, i4);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) xwc.m24745R(objArr, (ui3) objM22097O, tj3Var, 0);
            String str = (String) t66Var.getValue();
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            vh9 vh9Var = ps5.f56764b;
            eu9 eu9VarM16905h = mkd.m16905h(((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55821F, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55824I, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55816A, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B, 0L, tj3Var, 2147477455);
            vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j;
            hj4 hj4Var = new hj4(0, 3, null, 119);
            boolean zM22120g = ((i3 & 112) == 32) | tj3Var.m22120g(t66Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                objM22097O2 = new ix0(vi3Var, t66Var, 15);
                tj3Var.m22131l0(objM22097O2);
            }
            gj4 gj4Var = new gj4(null, (vi3) objM22097O2, 47);
            boolean zM22120g2 = tj3Var.m22120g(t66Var);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O3 == p84Var) {
                objM22097O3 = new dt6(12, t66Var);
                tj3Var.m22131l0(objM22097O3);
            }
            q6d.m19686c(str, (vi3) objM22097O3, e16VarM4412e, false, vx9Var, null, blc.f8666a, blc.f8667b, ci8.m4703P(461911836, new yy0(vi3Var, t66Var, 5), tj3Var), null, false, null, hj4Var, gj4Var, true, 0, 0, null, eu9VarM16905h, tj3Var, 918552960, 12779520, 3963992);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(xq8Var, i, 26, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m25400b(ActionBarContainer actionBarContainer) {
        actionBarContainer.invalidateOutline();
    }
}
