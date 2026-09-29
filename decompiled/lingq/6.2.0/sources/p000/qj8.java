package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class qj8 {

    /* JADX INFO: renamed from: a */
    public static final sj8 f57858a = new sj8(eh0.f37236b, nj0.f52817l);

    /* JADX INFO: renamed from: a */
    public static final sj8 m20003a(InterfaceC3624tu interfaceC3624tu, fc0 fc0Var, ye1 ye1Var, int i) {
        if (fa4.m11650l(interfaceC3624tu, eh0.f37236b) && fa4.m11650l(fc0Var, nj0.f52817l)) {
            tj3 tj3Var = (tj3) ye1Var;
            tj3Var.m22111b0(-1073830487);
            tj3Var.m22139q(false);
            return f57858a;
        }
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22111b0(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && tj3Var2.m22120g(interfaceC3624tu)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !tj3Var2.m22120g(fc0Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object objM22097O = tj3Var2.m22097O();
        if (z3 || objM22097O == we1.f66679a) {
            objM22097O = new sj8(interfaceC3624tu, fc0Var);
            tj3Var2.m22131l0(objM22097O);
        }
        sj8 sj8Var = (sj8) objM22097O;
        tj3Var2.m22139q(false);
        return sj8Var;
    }
}
