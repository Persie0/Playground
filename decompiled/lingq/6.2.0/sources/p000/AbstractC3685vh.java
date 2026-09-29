package p000;

/* JADX INFO: renamed from: vh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3685vh {

    /* JADX INFO: renamed from: a */
    public static final float f65364a = (25.0f * 2.0f) / 2.4142137f;

    /* JADX INFO: renamed from: a */
    public static final void m23281a(oq6 oq6Var, e16 e16Var, long j, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1776202187);
        int i3 = (tj3Var.m22120g(oq6Var) ? 4 : 2) | i | (tj3Var.m22120g(e16Var) ? 32 : 16) | 128;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                i2 = i3 & (-897);
                j = 9205357640488583168L;
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-897);
            }
            tj3Var.m22140r();
            int i4 = i2 & 14;
            boolean z = i4 == 4;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new C0011a9(oq6Var, 1);
                tj3Var.m22131l0(objM22097O);
            }
            bq1.m4040P(oq6Var, nj0.f52809d, ci8.m4703P(-1653527038, new C3498qh(j, nv8.m17643c(e16Var, false, (vi3) objM22097O)), tj3Var), tj3Var, i4 | 432);
        } else {
            tj3Var.m22102U();
        }
        long j2 = j;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3536rh(oq6Var, e16Var, j2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m23282b(int i, int i2, ye1 ye1Var, e16 e16Var) {
        int i3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(694251107);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 3) != 2)) {
            if (i4 != 0) {
                e16Var = b16.f7762a;
            }
            thb.m22044c(tj3Var, vz1.m23655y(c99.m4423p(e16Var, f65364a, 25.0f), new C3611th(0, ((mx9) tj3Var.m22128k(nx9.f53367a)).f52001a)));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3574sh(i, i2, e16Var);
        }
    }
}
