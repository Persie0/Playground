package p000;

import androidx.compose.material3.AbstractC0231g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rid {
    /* JADX INFO: renamed from: a */
    public static final void m20672a(String str, ui3 ui3Var, d05 d05Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        ui3Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1768718585);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (tj3Var2.m22120g(d05Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var) ? 2048 : 1024;
        }
        int i4 = 0;
        if (tj3Var2.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c(ui3Var, null, null, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(-1430792229, new a05(str, vi3Var, d05Var, i4), tj3Var2), tj3Var, 6, 3072, 8190);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(str, ui3Var, d05Var, vi3Var, i, 15);
        }
    }
}
