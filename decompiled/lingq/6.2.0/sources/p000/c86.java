package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c86 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ud6 f9707b;

    public /* synthetic */ c86(ud6 ud6Var, int i) {
        this.f9706a = i;
        this.f9707b = ud6Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        boolean z;
        int i = this.f9706a;
        ud6 ud6Var = this.f9707b;
        switch (i) {
            case 0:
                w60 w60Var = ud6Var.f63764f;
                if (ud6Var.f63765g) {
                    z = ud6Var.m22685b() > 1;
                }
                w60Var.m15659f(z);
                return xfa.f68157a;
            default:
                return new vd6(ud6Var.f63759a, ud6Var.f63760b.f41963r);
        }
    }
}
