package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cxb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f34696a = new C0282a(-2107793785, false, new td1(23));

    /* JADX INFO: renamed from: a */
    public static final void m9927a(String str, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, ye1 ye1Var, int i) {
        tj3 tj3Var;
        str.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1561381731);
        int i2 = (tj3Var2.m22120g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var3) ? 2048 : 1024;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var = tj3Var2;
            b34.m3232b(null, ci8.m4703P(2000583521, new C0839c9(27, ui3Var), tj3Var2), ci8.m4703P(-2030686750, new cw0(ui3Var2, ui3Var3, 5), tj3Var2), null, null, 0, 0L, 0L, null, ci8.m4703P(-1286960212, new iq0(str, 7), tj3Var2), tj3Var, 805306800, 505);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(str, ui3Var, ui3Var2, ui3Var3, i, 20);
        }
    }
}
