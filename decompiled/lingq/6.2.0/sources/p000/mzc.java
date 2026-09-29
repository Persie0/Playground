package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.library.LibraryShelfType;
import java.text.BreakIterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class mzc {
    /* JADX INFO: renamed from: a */
    public static final void m17161a(sq8 sq8Var, vi3 vi3Var, ye1 ye1Var, int i) {
        boolean z;
        p84 p84Var;
        float f;
        boolean z2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(25025265);
        int i2 = (tj3Var.m22120g(sq8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (objM22097O == p84Var2) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            List listM25681a = zjd.m25681a(sq8Var.f61265a);
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
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
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (fa4.m11650l(sq8Var.f61268d, LibraryShelfType.Trending.getValue())) {
                z = true;
                p84Var = p84Var2;
                f = 1.0f;
                z2 = false;
                tj3Var.m22111b0(604887445);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(603331276);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                as4 as4Var = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                vh9 vh9Var = ps5.f56764b;
                si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64856b;
                mn0 mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55824I, 0L, tj3Var);
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var2) {
                    objM22097O2 = new un7(9, t66Var);
                    tj3Var.m22131l0(objM22097O2);
                }
                C0282a c0282aM4703P = ci8.m4703P(-720739045, new C3357n2((Object) sq8Var, (Object) t66Var, (Object) listM25681a, (xi3) vi3Var, 15), tj3Var);
                f = 1.0f;
                p84Var = p84Var2;
                z = true;
                z2 = false;
                context = context;
                r46.m20380e(as4Var, si8Var, null, mn0VarM21999m, (ui3) objM22097O2, c0282aM4703P, tj3Var, 221184, 4);
                tj3Var.m22139q(false);
            }
            if (f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            as4 as4Var2 = new as4(f > Float.MAX_VALUE ? Float.MAX_VALUE : f, z);
            vh9 vh9Var2 = ps5.f56764b;
            si8 si8Var2 = ((ms5) tj3Var.m22128k(vh9Var2)).f51801c.f64856b;
            mn0 mn0VarM21999m2 = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55824I, 0L, tj3Var);
            boolean z3 = (i2 & 112) == 32 ? z : z2;
            Object objM22097O3 = tj3Var.m22097O();
            if (z3 || objM22097O3 == p84Var) {
                objM22097O3 = new nc8(vi3Var, 16);
                tj3Var.m22131l0(objM22097O3);
            }
            r46.m20380e(as4Var2, si8Var2, null, mn0VarM21999m2, (ui3) objM22097O3, ci8.m4703P(-596891050, new iz4(14, sq8Var, context), tj3Var), tj3Var, 196608, 4);
            tj3Var.m22139q(z);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(sq8Var, i, 29, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C3321m3 m17162b(Locale locale) {
        if (C3321m3.f50478e == null) {
            C3321m3 c3321m3 = new C3321m3(0);
            c3321m3.f50481d = BreakIterator.getCharacterInstance(locale);
            C3321m3.f50478e = c3321m3;
        }
        C3321m3 c3321m4 = C3321m3.f50478e;
        c3321m4.getClass();
        return c3321m4;
    }
}
