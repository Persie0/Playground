package p000;

import androidx.compose.p002ui.viewinterop.AbstractC0443c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pwc {

    /* JADX INFO: renamed from: a */
    public static final C2953e6 f56933a = new C2953e6("lessonId");

    /* JADX INFO: renamed from: a */
    public static final void m19556a(nd8 nd8Var, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(581354778);
        int i2 = (tj3Var.m22124i(nd8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM4411d = c99.m4411d(e16Var, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new wh7(vi3Var, 21);
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var2 = (vi3) objM22097O;
            boolean zM22124i = tj3Var.m22124i(nd8Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new cg7(nd8Var, 9);
                tj3Var.m22131l0(objM22097O2);
            }
            AbstractC0443c.m1891b(vi3Var2, e16VarM4411d, (vi3) objM22097O2, tj3Var, 0, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 12, nd8Var, vi3Var, e16Var);
        }
    }
}
