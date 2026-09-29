package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class phd {
    /* JADX INFO: renamed from: a */
    public static final void m19147a(e16 e16Var, a85 a85Var, int i, ye1 ye1Var, int i2, int i3) {
        int i4;
        tj3 tj3Var;
        e16 e16Var2;
        e16 e16Var3;
        a85Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1040277806);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (tj3Var2.m22120g(e16Var) ? 4 : 2) | i2;
        }
        int i6 = i4 | (tj3Var2.m22124i(a85Var) ? 32 : 16);
        if ((i2 & 384) == 0) {
            i6 |= tj3Var2.m22116e(i) ? 256 : 128;
        }
        int i7 = i6;
        if (tj3Var2.m22099R(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                e16Var = b16.f7762a;
            }
            if (a85Var instanceof y75) {
                tj3Var2.m22111b0(1568110763);
                e16Var3 = e16Var;
                r46.m20381f(e16Var3, null, null, te1.m21999m(0, 14, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var2), drb.f36120a, tj3Var2, (i7 & 14) | 24576, 6);
                tj3Var = tj3Var2;
                tj3Var.m22139q(false);
            } else {
                tj3Var = tj3Var2;
                if (a85Var instanceof z75) {
                    tj3Var.m22111b0(1569009701);
                    e16Var3 = e16Var;
                    r46.m20381f(e16Var3, null, null, te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var), ci8.m4703P(-2084889541, new bs0(a85Var, i, 3), tj3Var), tj3Var, (i7 & 14) | 24576, 6);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } else {
                    e16Var3 = e16Var;
                    if (!(a85Var instanceof x75)) {
                        throw ux5.m23001x(tj3Var, 1020421224, false);
                    }
                    tj3Var.m22111b0(1576410021);
                    tj3Var.m22139q(false);
                }
            }
            e16Var2 = e16Var3;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rk4(e16Var2, a85Var, i, i2, i3);
        }
    }
}
