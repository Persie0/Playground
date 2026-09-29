package p000;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import com.google.common.hash.C1109c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wyc {
    /* JADX INFO: renamed from: a */
    public static final void m24221a(final String str, e16 e16Var, final ui3 ui3Var, final ui3 ui3Var2, final long j, ye1 ye1Var, final int i) {
        int i2;
        final e16 e16Var2;
        e16 e16Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2078815310);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var.m22124i(ui3Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22118f(j) ? 16384 : 8192;
        }
        int i4 = 0;
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            tj3Var.m22104W();
            int i5 = i & 1;
            e16 e16VarM17643c = b16.f7762a;
            if (i5 == 0 || tj3Var.m22084B()) {
                e16Var3 = e16VarM17643c;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var;
            }
            tj3Var.m22140r();
            if (j != 16) {
                tj3Var.m22111b0(-853219337);
                p84 p84Var = we1.f66679a;
                if (ui3Var != null) {
                    tj3Var.m22111b0(-853120974);
                    int i6 = i3 & 896;
                    boolean z = i6 == 256;
                    Object objM22097O = tj3Var.m22097O();
                    if (z || objM22097O == p84Var) {
                        objM22097O = new fn8(i4, ui3Var);
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM16957a = mo9.m16957a(e16VarM17643c, ui3Var, (PointerInputEventHandler) objM22097O);
                    boolean z2 = ((i3 & 14) == 4) | (i6 == 256);
                    Object objM22097O2 = tj3Var.m22097O();
                    if (z2 || objM22097O2 == p84Var) {
                        objM22097O2 = new sx7(18, str, ui3Var);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    e16VarM17643c = nv8.m17643c(e16VarM16957a, true, (vi3) objM22097O2);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-852623672);
                    tj3Var.m22139q(false);
                }
                e16 e16VarMo3161g = c99.m4411d(e16Var3, 1.0f).mo3161g(e16VarM17643c);
                boolean z3 = ((i3 & 7168) == 2048) | ((((57344 & i3) ^ 24576) > 16384 && tj3Var.m22118f(j)) || (i3 & 24576) == 16384);
                Object objM22097O3 = tj3Var.m22097O();
                if (z3 || objM22097O3 == p84Var) {
                    objM22097O3 = new p25(j, ui3Var2, 1);
                    tj3Var.m22131l0(objM22097O3);
                }
                eh0.m11124d(e16VarMo3161g, (vi3) objM22097O3, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-852426512);
                tj3Var.m22139q(false);
            }
            e16Var2 = e16Var3;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: en8
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    wyc.m24221a(str, e16Var2, ui3Var, ui3Var2, j, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public abstract C1109c mo6355b();
}
