package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bmc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f8699a = new C0282a(-1640625492, false, new be1(21));

    /* JADX INFO: renamed from: b */
    public static final C0282a f8700b = new C0282a(1272472391, false, new be1(22));

    /* JADX INFO: renamed from: a */
    public static final void m3883a(e16 e16Var, boolean z, boolean z2, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, ye1 ye1Var, int i) {
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1426897943);
        int i2 = i | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22122h(z2) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var2) ? 16384 : 8192) | (tj3Var.m22124i(ui3Var3) ? 131072 : 65536);
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            qid.m19982b(e16Var, ci8.m4703P(699922774, new j07(z2, ui3Var3, ui3Var, z, ui3Var2), tj3Var), tj3Var, (i2 & 14) | 48, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new o48(e16Var, z, z2, ui3Var, ui3Var2, ui3Var3, i, 0);
        }
    }
}
