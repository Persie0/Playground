package p000;

import android.content.Context;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.p002ui.platform.AbstractC0394f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class fid {
    /* JADX INFO: renamed from: a */
    public static final void m11884a(String str, lp4 lp4Var, vi3 vi3Var, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        str.getClass();
        lp4Var.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-643329891);
        int i2 = (tj3Var2.m22120g(str) ? 4 : 2) | i | (tj3Var2.m22124i(lp4Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var2) ? 16384 : 8192;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            fe9 fe9Var = (fe9) tj3Var2.m22128k(ge9.f40637a);
            x17 x17Var = h7a.f41916a;
            rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var2), tj3Var2);
            tj3Var = tj3Var2;
            b34.m3232b(c99.m4410c(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), 1.0f), ci8.m4703P(-2133345183, new mn4(rv2VarM13115b, str, ui3Var2, 3), tj3Var2), ci8.m4703P(-1884066782, new C3836zk(lp4Var, fe9Var, ui3Var, 17), tj3Var2), null, null, 0, 0L, 0L, null, ci8.m4703P(230858348, new C3357n2((Object) fe9Var, (Object) lp4Var, vi3Var, (Object) context, 9), tj3Var2), tj3Var, 805306800, 504);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rb0(str, lp4Var, vi3Var, ui3Var, ui3Var2, i, 2);
        }
    }
}
