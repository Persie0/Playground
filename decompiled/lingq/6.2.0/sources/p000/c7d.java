package p000;

import android.content.Context;
import android.text.TextUtils;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c7d {
    /* JADX INFO: renamed from: a */
    public static final void m4396a(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1373152527);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            ui0 ui0Var = vi0.Companion;
            aa1 aa1Var = new aa1(aa1.f411j);
            vh9 vh9Var = cx2.f34676a;
            e16 e16VarM10006C = d32.m10006C(e16VarM4411d, ui0.m22749e(ui0Var, vz1.m23605K(aa1Var, new aa1(aa1.m198b(0.3f, ((bx2) tj3Var.m22128k(vh9Var)).m4211d())), new aa1(((bx2) tj3Var.m22128k(vh9Var)).m4211d())), 0.0f, 0.0f, 14));
            boolean zM22124i = tj3Var.m22124i(context);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new C3539rk(context, 5);
                tj3Var.m22131l0(objM22097O);
            }
            qh0.m19963a(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM10006C, 15), tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new jx0(i, 3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4397b(tx0 tx0Var, t17 t17Var, jv0 jv0Var, ye1 ye1Var, int i) {
        tx0Var.getClass();
        t17Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1361609405);
        int i2 = i | (tj3Var.m22124i(tx0Var) ? 4 : 2) | (tj3Var.m22120g(t17Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21611X(c99.m4411d(b16.f7762a, 1.0f), 0.0f, t17Var.mo14021d(), 0.0f, 0.0f, 13), 0.0f, 0.0f, 0.0f, t17Var.mo14018a(), 7);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
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
            if (tx0Var.f63047l) {
                tj3Var.m22111b0(-1080111431);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1080158520);
                m4396a(tj3Var, 0);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 4, tx0Var, t17Var, jv0Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m4398c(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
