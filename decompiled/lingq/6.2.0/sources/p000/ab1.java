package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class ab1 {

    /* JADX INFO: renamed from: a */
    public static final bb1 f455a = new bb1(eh0.f37238d, nj0.f52791J);

    /* JADX INFO: renamed from: a */
    public static final bb1 m230a(InterfaceC3735wu interfaceC3735wu, InterfaceC3457pe interfaceC3457pe, ye1 ye1Var, int i) {
        if (interfaceC3735wu.equals(eh0.f37238d) && fa4.m11650l(interfaceC3457pe, nj0.f52791J)) {
            tj3 tj3Var = (tj3) ye1Var;
            tj3Var.m22111b0(-1446604504);
            tj3Var.m22139q(false);
            return f455a;
        }
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22111b0(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && tj3Var2.m22120g(interfaceC3735wu)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !tj3Var2.m22120g(interfaceC3457pe)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM22097O = tj3Var2.m22097O();
        if (z3 || objM22097O == we1.f66679a) {
            objM22097O = new bb1(interfaceC3735wu, interfaceC3457pe);
            tj3Var2.m22131l0(objM22097O);
        }
        bb1 bb1Var = (bb1) objM22097O;
        tj3Var2.m22139q(false);
        return bb1Var;
    }
}
