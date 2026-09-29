package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ezc {

    /* JADX INFO: renamed from: a */
    public static p04 f38125a;

    /* JADX INFO: renamed from: a */
    public static final void m11404a(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-190658864);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f);
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
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_empty_search, tj3Var, 0), null, c99.m4422o(b16Var, 64.0f), null, null, 0.0f, null, tj3Var, 440, 120);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.search_no_search_results);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cx7(i, 8);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final p04 m11405b() {
        p04 p04Var = f38125a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Outlined.AccessTime", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57VarM17730e = AbstractC3393o1.m17730e(11.99f, 2.0f);
        f57VarM17730e.m11547b(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        f57VarM17730e.m11555j(4.47f, 10.0f, 9.99f, 10.0f);
        f57VarM17730e.m11547b(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        f57VarM17730e.m11554i(17.52f, 2.0f, 11.99f, 2.0f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(12.0f, 20.0f);
        f57VarM17730e.m11548c(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        f57VarM17730e.m11555j(3.58f, -8.0f, 8.0f, -8.0f);
        f57VarM17730e.m11555j(8.0f, 3.58f, 8.0f, 8.0f);
        f57VarM17730e.m11555j(-3.58f, 8.0f, -8.0f, 8.0f);
        f57VarM17730e.m11546a();
        f57VarM17730e.m11553h(12.5f, 7.0f);
        f57VarM17730e.m11551f(11.0f, 7.0f);
        f57VarM17730e.m11557l(6.0f);
        f57VarM17730e.m11552g(5.25f, 3.15f);
        f57VarM17730e.m11552g(0.75f, -1.23f);
        f57VarM17730e.m11552g(-4.5f, -2.67f);
        f57VarM17730e.m11546a();
        o04.m17720a(o04Var, f57VarM17730e.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f38125a = p04VarM17721b;
        return p04VarM17721b;
    }
}
