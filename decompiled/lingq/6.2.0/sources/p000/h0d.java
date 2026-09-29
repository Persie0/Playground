package p000;

import androidx.compose.runtime.AbstractC0278f;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h0d {
    /* JADX INFO: renamed from: a */
    public static final void m12995a(u19 u19Var, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1194583038);
        int i2 = (tj3Var2.m22124i(u19Var) ? 4 : 2) | i | (tj3Var2.m22124i(vi3Var) ? 32 : 16) | 384;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Object objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            tj3Var2.m22111b0(-1238024292);
            ArrayList arrayList = u19Var.f63252a;
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(vz1.m23620a0(tj3Var2, ((Number) it.next()).intValue()));
            }
            tj3Var2.m22139q(false);
            b16 b16Var = b16.f7762a;
            e16Var2 = b16Var;
            tj3Var = tj3Var2;
            r46.m20381f(c99.m4430w(b16Var, null, 3), null, null, null, ci8.m4703P(143404140, new hn0(b16Var, t66Var, arrayList2, u19Var, vi3Var, 16), tj3Var2), tj3Var, 24576, 14);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 19, u19Var, vi3Var, e16Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static C3321m3 m12996b(Locale locale) {
        if (C3321m3.f50479f == null) {
            C3321m3 c3321m3 = new C3321m3(1);
            c3321m3.f50481d = BreakIterator.getWordInstance(locale);
            C3321m3.f50479f = c3321m3;
        }
        C3321m3 c3321m4 = C3321m3.f50479f;
        c3321m4.getClass();
        return c3321m4;
    }
}
