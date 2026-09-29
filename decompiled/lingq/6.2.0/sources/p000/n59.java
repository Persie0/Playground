package p000;

import androidx.compose.material3.R$string;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;

/* JADX INFO: loaded from: classes.dex */
public abstract class n59 {

    /* JADX INFO: renamed from: a */
    public static final float f52380a;

    static {
        ss5.m21703b0(300, 0, io2.f44349a, 2);
        f52380a = 22.0f;
    }

    /* JADX INFO: renamed from: a */
    public static final void m17236a(e16 e16Var, zi3 zi3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        zi3 zi3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1361920385);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | (tj3Var.m22124i(zi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            String strM11661w = fa4.m11661w(tj3Var, R$string.m3c_bottom_sheet_drag_handle_description);
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            e16Var2 = e16Var;
            zi3Var2 = zi3Var;
            s6a.m21131b(c6a.m4357a(tj3Var), ci8.m4703P(1497042086, new iq0(strM11661w, 14), tj3Var), s6a.m21132c(tj3Var), e16Var2, false, zi3Var2, tj3Var, ((i2 << 9) & 7168) | 48 | ((i2 << 21) & 234881024), 240);
            tj3Var.m22139q(true);
        } else {
            e16Var2 = e16Var;
            zi3Var2 = zi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(e16Var2, i, 11, zi3Var2);
        }
    }
}
