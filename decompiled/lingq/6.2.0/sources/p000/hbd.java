package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class hbd {

    /* JADX INFO: renamed from: a */
    public static p04 f42146a;

    /* JADX INFO: renamed from: a */
    public static final void m13186a(h1b h1bVar, vi3 vi3Var, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        h1bVar.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(82396415);
        int i2 = i | (tj3Var.m22120g(h1bVar) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | 3072;
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            String str = h1bVar.f41665a;
            b16 b16Var = b16.f7762a;
            e16 e16VarM23624c0 = vz1.m23624c0(c99.m4412e(b16Var, 1.0f), "vocabulary:search");
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            vx9 vx9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j;
            hj4 hj4Var = new hj4(1, 3, null, 115);
            boolean z = (i2 & 896) == 256;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new sy0(9, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            gj4 gj4Var = new gj4(null, (vi3) objM22097O, 47);
            long j = aa1.f411j;
            q6d.m19686c(str, vi3Var, e16VarM23624c0, false, vx9Var, null, dtc.f36226a, dtc.f36227b, null, null, false, null, hj4Var, gj4Var, true, 0, 0, si8Var, mkd.m16905h(0L, 0L, j, j, j, tj3Var, 2147469311), tj3Var, (i2 & 112) | 113246208, 12779520, 1867352);
            tj3Var = tj3Var;
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new h39(h1bVar, vi3Var, ui3Var, e16Var2, i, 13);
        }
    }
}
