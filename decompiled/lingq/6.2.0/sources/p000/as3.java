package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class as3 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7424a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ bs3 f7425b;

    public /* synthetic */ as3(bs3 bs3Var, int i) {
        this.f7424a = i;
        this.f7425b = bs3Var;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = this.f7424a;
        xfa xfaVar = xfa.f68157a;
        bs3 bs3Var = this.f7425b;
        switch (i) {
            case 0:
                wda wdaVar = bs3Var.f8939Q;
                if (wdaVar == null) {
                    throw wq1.m24126v("Font resolution state is not set.");
                }
                wdaVar.getValue();
                return xfaVar;
            default:
                wda wdaVar2 = bs3Var.f8939Q;
                if (wdaVar2 == null) {
                    throw wq1.m24126v("Font resolution state is not set.");
                }
                wdaVar2.getValue();
                return xfaVar;
        }
    }
}
