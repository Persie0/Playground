package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class nsb {

    /* JADX INFO: renamed from: a */
    public static final C0282a f53215a = new C0282a(768235125, false, new qd1(22));

    /* JADX INFO: renamed from: b */
    public static final C0282a f53216b = new C0282a(-1940360286, false, new qd1(23));

    /* JADX INFO: renamed from: c */
    public static final C0282a f53217c = new C0282a(-2108980666, false, new rd1(24));

    /* JADX INFO: renamed from: d */
    public static final C0282a f53218d = new C0282a(-1854924217, false, new rd1(25));

    /* JADX INFO: renamed from: e */
    public static final C0282a f53219e = new C0282a(-1996557016, false, new rd1(26));

    /* JADX INFO: renamed from: f */
    public static final C0282a f53220f = new C0282a(-322162123, false, new rd1(27));

    /* JADX INFO: renamed from: g */
    public static final C0282a f53221g = new C0282a(-918457733, false, new rd1(28));

    /* JADX INFO: renamed from: h */
    public static final C0282a f53222h = new C0282a(-1023042446, false, new rd1(29));

    /* JADX INFO: renamed from: i */
    public static final C0282a f53223i = new C0282a(298347461, false, new qd1(24));

    /* JADX INFO: renamed from: a */
    public static final void m17612a(ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        int i3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-324035498);
        if ((i & 48) == 0) {
            i2 = (tj3Var2.m22124i(ui3Var) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var2) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var2.m22111b0(1745103712);
            i3 = 0;
            q2d.m19625a(ui3Var2, ci8.m4703P(1151101865, new C0839c9(26, ui3Var), tj3Var2), null, null, null, v1c.f64713b, v1c.f64714c, null, 0L, 0L, 0L, 0L, null, tj3Var2, ((i2 >> 6) & 14) | 1769520, 16284);
            tj3Var = tj3Var2;
            tj3Var.m22139q(false);
        } else {
            tj3Var = tj3Var2;
            i3 = 0;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ml6(ui3Var, ui3Var2, i, i3);
        }
    }
}
