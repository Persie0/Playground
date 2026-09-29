package p000;

import androidx.compose.foundation.AbstractC0080f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z7d {
    /* JADX INFO: renamed from: a */
    public static final void m25488a(String str, boolean z, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16VarM20387m;
        mv3 mv3Var = ss5.f61356d;
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1735876119);
        int i2 = i | (tj3Var2.m22120g(str) ? 4 : 2) | (tj3Var2.m22122h(z) ? 32 : 16) | (tj3Var2.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            si8 si8Var = p58.m18901i(tj3Var2).f64856b;
            b16 b16Var = b16.f7762a;
            e16 e16VarM19045o = pb1.m19045o(b16Var, si8Var);
            if (z) {
                tj3Var2.m22111b0(-2078627822);
                e16VarM20387m = r46.m20387m(d32.m10007D(b16Var, p58.m18900f(tj3Var2).f55822G, mv3Var), 1.0f, p58.m18900f(tj3Var2).f55823H, p58.m18901i(tj3Var2).f64856b);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-2078974526);
                e16VarM20387m = r46.m20387m(d32.m10007D(b16Var, p58.m18900f(tj3Var2).f55856h, mv3Var), 1.0f, p58.m18900f(tj3Var2).f55852f, p58.m18901i(tj3Var2).f64856b);
                tj3Var2.m22139q(false);
            }
            tj3Var = tj3Var2;
            lw9.m16554b(str, AbstractC0080f.m815b(null, false, ui3Var, AbstractC3584sr.m21607T(e16VarM19045o.mo3161g(e16VarM20387m), ge9.m12515a(tj3Var2).f38955d), 15), 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var2).f71408l, tj3Var, i2 & 14, 24960, 110588);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ln0(str, z, ui3Var, i, 10);
        }
    }
}
