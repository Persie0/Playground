package p000;

import androidx.compose.animation.AbstractC0054a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class rfd {
    /* JADX INFO: renamed from: a */
    public static final void m20652a(boolean z, ye1 ye1Var, int i) {
        boolean z2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(468389261);
        int i2 = 4;
        int i3 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        if (tj3Var.m22099R(i3 & 1, (i3 & 3) != 2)) {
            z2 = z;
            AbstractC0054a.m729d(z2, null, null, null, null, pqb.f56705g, tj3Var, (i3 & 14) | 196608, 30);
        } else {
            z2 = z;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new c81(i, i2, z2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m20653b(int i, int i2, ye1 ye1Var, ui3 ui3Var, vi3 vi3Var, boolean z) {
        boolean z2;
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1433671233);
        int i3 = (tj3Var.m22122h(z) ? 4 : 2) | i2 | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            z2 = z;
            AbstractC0054a.m729d(z2, null, null, null, null, ci8.m4703P(1080126615, new as0(ui3Var, vi3Var, i), tj3Var), tj3Var, (i3 & 14) | 196608, 30);
        } else {
            z2 = z;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new vb3(z2, i, vi3Var, ui3Var, i2);
        }
    }
}
