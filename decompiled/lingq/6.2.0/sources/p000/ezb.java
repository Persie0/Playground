package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ezb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f38121a = new C0282a(378872608, false, new sd1(24));

    /* JADX INFO: renamed from: b */
    public static final C0282a f38122b = new C0282a(164617815, false, new ud1(7));

    /* JADX INFO: renamed from: c */
    public static final C0282a f38123c = new C0282a(1923192846, false, new ud1(8));

    /* JADX INFO: renamed from: d */
    public static final C0282a f38124d = new C0282a(-48501243, false, new sd1(25));

    /* JADX INFO: renamed from: a */
    public static final void m11403a(int i, int i2, e16 e16Var, ye1 ye1Var, int i3) {
        long j;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1993959761);
        int i4 = ((i3 & 6) == 0 ? (tj3Var.m22116e(i) ? 4 : 2) | i3 : i3) | 384;
        if (tj3Var.m22099R(i4 & 1, (i4 & 147) != 146)) {
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
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
            tj3Var.m22111b0(2124227336);
            for (int i5 = 0; i5 < i; i5++) {
                e16 e16VarM19045o = pb1.m19045o(c99.m4422o(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a), ui8.f63972a);
                if (i5 == i2) {
                    tj3Var.m22111b0(1541817862);
                    j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1541819947);
                    j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55817B;
                    tj3Var.m22139q(false);
                }
                qh0.m19963a(d32.m10007D(e16VarM19045o, j, ss5.f61356d), tj3Var, 0);
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
            e16Var = b16Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yy1(i, i2, i3, e16Var);
        }
    }
}
