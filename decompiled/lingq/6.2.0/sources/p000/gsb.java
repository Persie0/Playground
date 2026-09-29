package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gsb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f41272a = new C0282a(-917829706, false, new qd1(19));

    /* JADX INFO: renamed from: a */
    public static final void m12858a(e16 e16Var, fl6 fl6Var, ui3 ui3Var, ye1 ye1Var, int i) {
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(177344189);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i | (tj3Var.m22120g(fl6Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            qid.m19982b(AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(e16Var, 1.0f), 15), ci8.m4703P(1985683836, new wz2(fl6Var, 23), tj3Var), tj3Var, 48, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 26, e16Var, fl6Var, ui3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m12859b(int i, int i2, long j, ye1 ye1Var, String str) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1076658028);
        int i3 = i2 | (tj3Var2.m22116e(i) ? 4 : 2) | (tj3Var2.m22120g(str) ? 32 : 16) | (tj3Var2.m22118f(j) ? 256 : 128);
        if (tj3Var2.m22099R(i3 & 1, (i3 & 147) != 146)) {
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var2, 48);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            qh0.m19963a(d32.m10007D(pb1.m19045o(c99.m4423p(b16Var, 12.0f, 12.0f), ui8.f63972a), j, ss5.f61356d), tj3Var2, 0);
            thb.m22044c(tj3Var2, c99.m4426s(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38955d));
            lw9.m16554b(i + " " + str, null, aa1.f406e, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var2, 384, 0, 131066);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rx0(i, str, j, i2);
        }
    }
}
