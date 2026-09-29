package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qoc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f58023a = new C0282a(-902728147, false, new de1(22));

    /* JADX INFO: renamed from: a */
    public static final void m20093a(ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1177734085);
        if ((i & 48) == 0) {
            i2 = (tj3Var2.m22124i(ui3Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var2) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var2.m22111b0(288431285);
            q2d.m19625a(ui3Var2, ci8.m4703P(1079805144, new cw0(ui3Var, ui3Var2, 11), tj3Var2), null, ci8.m4703P(1006220566, new he7(17, ui3Var2), tj3Var2), null, pic.f56282c, pic.f56283d, null, 0L, 0L, 0L, 0L, null, tj3Var2, ((i2 >> 6) & 14) | 1772592, 16276);
            tj3Var = tj3Var2;
            tj3Var.m22139q(false);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ml6(ui3Var, ui3Var2, i, 2);
        }
    }
}
