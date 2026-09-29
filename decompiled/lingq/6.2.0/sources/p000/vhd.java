package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class vhd {
    /* JADX INFO: renamed from: a */
    public static final void m23289a(jm4 jm4Var, ui3 ui3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1964439986);
        int i2 = (tj3Var.m22120g(jm4Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            whd.m23969a(jm4Var, ui3Var, vi3Var, tj3Var, i2 & 1022, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 15, jm4Var, ui3Var, vi3Var);
        }
    }
}
