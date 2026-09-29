package p000;

/* JADX INFO: loaded from: classes2.dex */
public abstract class gbd {
    /* JADX INFO: renamed from: a */
    public static final void m12467a(r0b r0bVar, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        r0bVar.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1395855101);
        int i2 = i | (tj3Var2.m22120g(r0bVar) ? 4 : 2) | (tj3Var2.m22124i(ui3Var) ? 32 : 16) | (tj3Var2.m22124i(ui3Var2) ? 256 : 128) | (tj3Var2.m22124i(ui3Var3) ? 2048 : 1024) | (tj3Var2.m22120g(e16Var) ? 16384 : 8192);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            e16 e16VarM4430w = c99.m4430w(e16Var, null, 3);
            si8 si8Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64859e;
            zf1 zf1Var = ge9.f40637a;
            tj3Var = tj3Var2;
            ho9.m13414a(e16VarM4430w, si8Var, 0L, 0L, ((fe9) tj3Var2.m22128k(zf1Var)).f38954c, ((fe9) tj3Var2.m22128k(zf1Var)).f38954c, null, ci8.m4703P(1452857054, new h39(r0bVar, ui3Var, ui3Var3, ui3Var2, 10), tj3Var2), tj3Var, 12582912, 76);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(r0bVar, ui3Var, ui3Var2, ui3Var3, e16Var, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static long m12468b(double d) {
        bna.m3967p("not a normal value", m12469c(d));
        int exponent = Math.getExponent(d);
        long jDoubleToRawLongBits = Double.doubleToRawLongBits(d) & 4503599627370495L;
        return exponent == -1023 ? jDoubleToRawLongBits << 1 : jDoubleToRawLongBits | 4503599627370496L;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m12469c(double d) {
        return Math.getExponent(d) <= 1023;
    }
}
