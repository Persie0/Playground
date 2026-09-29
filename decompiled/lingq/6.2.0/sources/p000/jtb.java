package p000;

import android.content.Context;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class jtb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f46137a = new C0282a(-1443317882, false, new td1(10));

    /* JADX INFO: renamed from: b */
    public static final C0282a f46138b = new C0282a(-1625938294, false, new td1(13));

    /* JADX INFO: renamed from: c */
    public static final C0282a f46139c = new C0282a(260805408, false, new td1(14));

    /* JADX INFO: renamed from: d */
    public static final C0282a f46140d = new C0282a(-2122511068, false, new td1(15));

    /* JADX INFO: renamed from: e */
    public static final C0282a f46141e = new C0282a(-1974239391, false, new td1(16));

    /* JADX INFO: renamed from: f */
    public static final C0282a f46142f = new C0282a(-62588571, false, new td1(17));

    /* JADX INFO: renamed from: g */
    public static final C0282a f46143g = new C0282a(1997333926, false, new td1(18));

    /* JADX INFO: renamed from: h */
    public static final C0282a f46144h = new C0282a(-1618440184, false, new td1(19));

    /* JADX INFO: renamed from: i */
    public static final C0282a f46145i = new C0282a(-1801060596, false, new td1(20));

    /* JADX INFO: renamed from: j */
    public static final C0282a f46146j = new C0282a(-89439196, false, new td1(11));

    /* JADX INFO: renamed from: k */
    public static final C0282a f46147k = new C0282a(1822211624, false, new td1(12));

    /* JADX INFO: renamed from: a */
    public static final void m14645a(vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-319669630);
        int i2 = (tj3Var.m22124i(vi3Var) ? 4 : 2) | i;
        int i3 = 14;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            xs6 xs6Var = new xs6();
            boolean z = (i2 & 14) == 4;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new i75(vi3Var, 15);
                tj3Var.m22131l0(objM22097O);
            }
            m14646b(xs6Var, (vi3) objM22097O, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ks3(vi3Var, i, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m14646b(xs6 xs6Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1551193228);
        int i2 = 2;
        int i3 = (tj3Var.m22120g(xs6Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        int i4 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            fe9 fe9Var = (fe9) tj3Var.m22128k(ge9.f40637a);
            x17 x17Var = h7a.f41916a;
            rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var), tj3Var);
            b34.m3232b(c99.m4410c(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), 1.0f), ci8.m4703P(-303817656, new qs6(rv2VarM13115b, vi3Var, i4), tj3Var), ci8.m4703P(-609452185, new wa5(10, fe9Var, vi3Var), tj3Var), null, null, 0, 0L, 0L, null, ci8.m4703P(-890261027, new vs6(fe9Var, context, xs6Var, i2), tj3Var), tj3Var, 805306800, 504);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3709w4(xs6Var, i, 21, vi3Var);
        }
    }
}
