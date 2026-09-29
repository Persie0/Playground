package p000;

import androidx.compose.material3.AbstractC0231g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m9d {
    /* JADX INFO: renamed from: a */
    public static final void m16704a(String str, ui3 ui3Var, do1 do1Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        ui3Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1807935868);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (tj3Var2.m22120g(do1Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var) ? 2048 : 1024;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c(ui3Var, null, null, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(-1391574946, new ik0(str, vi3Var, do1Var, 9), tj3Var2), tj3Var, 6, 3072, 8190);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(str, ui3Var, do1Var, vi3Var, i, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m16705b(long j) {
        bna.m3963n(j, "out of range: %s", (j >> 32) == 0);
        return (int) j;
    }
}
