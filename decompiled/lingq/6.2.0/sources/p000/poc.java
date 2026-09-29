package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class poc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f56608a = new C0282a(1005566933, false, new de1(16));

    /* JADX INFO: renamed from: b */
    public static final C0282a f56609b = new C0282a(-1893731281, false, new ee1(11));

    /* JADX INFO: renamed from: c */
    public static final C0282a f56610c = new C0282a(455447575, false, new de1(17));

    /* JADX INFO: renamed from: d */
    public static final C0282a f56611d = new C0282a(911661440, false, new de1(18));

    /* JADX INFO: renamed from: e */
    public static final C0282a f56612e = new C0282a(-711888237, false, new de1(19));

    /* JADX INFO: renamed from: f */
    public static final C0282a f56613f = new C0282a(1812729375, false, new de1(20));

    /* JADX INFO: renamed from: g */
    public static final C0282a f56614g = new C0282a(-1581169986, false, new de1(21));

    /* JADX INFO: renamed from: h */
    public static final C0282a f56615h = new C0282a(-2073673871, false, new ee1(12));

    /* JADX INFO: renamed from: i */
    public static final C0282a f56616i = new C0282a(2100677354, false, new ee1(13));

    /* JADX INFO: renamed from: a */
    public static final void m19436a(ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1568749060);
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 = (tj3Var2.m22124i(ui3Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var2) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var2.m22111b0(1064244665);
            q2d.m19625a(ui3Var2, ci8.m4703P(-2051672425, new cw0(ui3Var, ui3Var2, 10), tj3Var2), null, ci8.m4703P(1412641237, new he7(i3, ui3Var2), tj3Var2), null, kic.f47359c, kic.f47360d, null, 0L, 0L, 0L, 0L, null, tj3Var2, ((i2 >> 6) & 14) | 1772592, 16276);
            tj3Var = tj3Var2;
            tj3Var.m22139q(false);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ml6(ui3Var, ui3Var2, i, 1);
        }
    }
}
