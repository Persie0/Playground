package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.R$string;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xcd {
    /* JADX INFO: renamed from: a */
    public static final void m24458a(zz2 zz2Var, ye1 ye1Var, int i) {
        String strM23620a0;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2049966501);
        int i2 = (tj3Var.m22120g(zz2Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16.f7762a, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37240f, nj0.f52792K, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            if (zz2Var.f72420a) {
                tj3Var.m22111b0(-1026667084);
                strM23620a0 = vz1.m23620a0(tj3Var, R$string.search_no_search_results);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1026578672);
                strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.feature.search.R$string.search_just_start_typing);
                tj3Var.m22139q(false);
            }
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3368nd(zz2Var, i, 29);
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m24459b(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(m24461d(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(m24461d(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static String m24460c(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: d */
    public static String m24461d(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e) {
            String strM17735j = AbstractC3393o1.m17735j(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM17735j), (Throwable) e);
            return ux5.m22991n("<", strM17735j, " threw ", e.getClass().getName(), ">");
        }
    }
}
