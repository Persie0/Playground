package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bdd {
    /* JADX INFO: renamed from: a */
    public static final void m3655a(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1950204174);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            r46.m20381f(null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d, null, null, ypb.f70278a, tj3Var, 24576, 13);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new je1(i, 19);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m3656b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                C3386nv.m17635v(ux5.m22988k(i2, "at index "));
                return;
            }
        }
    }
}
