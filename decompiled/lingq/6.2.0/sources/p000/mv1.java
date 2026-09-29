package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mv1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51877a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zt1 f51878b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e16 f51879c;

    public /* synthetic */ mv1(zt1 zt1Var, e16 e16Var, int i, int i2) {
        this.f51877a = i2;
        this.f51878b = zt1Var;
        this.f51879c = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f51877a;
        xfa xfaVar = xfa.f68157a;
        e16 e16Var = this.f51879c;
        zt1 zt1Var = this.f51878b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                rv1.m20858c(zt1Var, e16Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                rv1.m20856a(zt1Var, e16Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
