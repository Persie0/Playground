package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xgc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f68191a = new C0282a(1007630941, false, new zd1(14));

    /* JADX INFO: renamed from: a */
    public static final void m24512a(boolean z, int i, int i2, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i3) {
        int i4;
        tj3 tj3Var;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(557468521);
        int i5 = 2;
        if ((i3 & 6) == 0) {
            i4 = (tj3Var2.m22122h(z) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= tj3Var2.m22116e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= tj3Var2.m22116e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= tj3Var2.m22124i(ui3Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= tj3Var2.m22124i(ui3Var2) ? 16384 : 8192;
        }
        if (!tj3Var2.m22099R(i4 & 1, (i4 & 9363) != 9362)) {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        } else if (z) {
            tj3Var2.m22111b0(-1093641743);
            q2d.m19625a(ui3Var2, ci8.m4703P(1436337590, new cw0(ui3Var, ui3Var2, 8), tj3Var2), null, ci8.m4703P(-333134024, new he7(11, ui3Var2), tj3Var2), null, tgc.f62264c, ci8.m4703P(1307625851, new ie7(i, i2, i5), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var2, ((i4 >> 12) & 14) | 1772592, 16276);
            tj3Var = tj3Var2;
            tj3Var.m22139q(false);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22111b0(-1092711495);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new jj7(z, i, i2, ui3Var, ui3Var2, i3, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m24513b(boolean z, int i, int i2, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i3) {
        int i4;
        tj3 tj3Var;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1764343610);
        if ((i3 & 6) == 0) {
            i4 = (tj3Var2.m22122h(z) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= tj3Var2.m22116e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= tj3Var2.m22116e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= tj3Var2.m22124i(ui3Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= tj3Var2.m22124i(ui3Var2) ? 16384 : 8192;
        }
        if (!tj3Var2.m22099R(i4 & 1, (i4 & 9363) != 9362)) {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        } else if (z) {
            tj3Var2.m22111b0(249466646);
            q2d.m19625a(ui3Var2, ci8.m4703P(-2052535149, new cw0(ui3Var, ui3Var2, 9), tj3Var2), null, ci8.m4703P(-1385153259, new he7(12, ui3Var2), tj3Var2), null, tgc.f62267f, ci8.m4703P(1763403224, new ie7(i, i2, 3), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var2, ((i4 >> 12) & 14) | 1772592, 16276);
            tj3Var = tj3Var2;
            tj3Var.m22139q(false);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22111b0(250364220);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new jj7(z, i, i2, ui3Var, ui3Var2, i3, 1);
        }
    }
}
