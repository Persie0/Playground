package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class pnb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f56537a = new C0282a(-2018928616, false, new jx0(20));

    /* JADX INFO: renamed from: a */
    public static final void m19414a(final e16 e16Var, final String str, float f, p04 p04Var, long j, final ui3 ui3Var, ye1 ye1Var, final int i) {
        final float f2;
        final p04 p04Var2;
        final long j2;
        p04 p04VarM13932a;
        long j3;
        int i2;
        float f3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2048437387);
        int i3 = i | (tj3Var.m22120g(str) ? 32 : 16) | 9216 | (tj3Var.m22124i(ui3Var) ? 131072 : 65536);
        if (tj3Var.m22099R(i3 & 1, (74771 & i3) != 74770)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                p04VarM13932a = ihd.m13932a();
                j3 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55856h;
                i2 = i3 & (-64513);
                f3 = 1.0f;
            } else {
                tj3Var.m22102U();
                p04VarM13932a = p04Var;
                j3 = j;
                i2 = i3 & (-64513);
                f3 = f;
            }
            tj3Var.m22140r();
            boolean z = (458752 & i2) == 131072;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new xa0(12, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM21609V = AbstractC3584sr.m21609V(pb1.m19045o(d32.m10007D(c99.m4409b(c99.m4412e(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16Var, 15), 1.0f), 0.0f, 56.0f, 1), j3, p58.m18901i(tj3Var).f64855a), p58.m18901i(tj3Var).f64855a), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            lw9.m16554b(str, e65.m10871c(tj3Var, e16VarM1322c, C0352b.f4301d, 1.0f, true), p58.m18900f(tj3Var).f55858i, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, null, tj3Var, (i2 >> 3) & 14, 0, 261112);
            long j4 = p58.m18900f(tj3Var).f55858i;
            p04 p04Var3 = p04VarM13932a;
            tj3Var = tj3Var;
            ty3.m22351a(p04Var3, null, null, j4, tj3Var, 48, 4);
            tj3Var.m22139q(true);
            f2 = f3;
            p04Var2 = p04Var3;
            j2 = j3;
        } else {
            tj3Var.m22102U();
            f2 = f;
            p04Var2 = p04Var;
            j2 = j;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(str, f2, p04Var2, j2, ui3Var, i) { // from class: zm5

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f71765b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ float f71766c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ p04 f71767d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f71768e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ ui3 f71769f;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(7);
                    pnb.m19414a(this.f71764a, this.f71765b, this.f71766c, this.f71767d, this.f71768e, this.f71769f, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }
}
