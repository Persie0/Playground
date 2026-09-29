package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ha5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42090a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f95 f42091b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e16 f42092c;

    public /* synthetic */ ha5(f95 f95Var, e16 e16Var, int i, int i2) {
        this.f42090a = i2;
        this.f42091b = f95Var;
        this.f42092c = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f42090a;
        xfa xfaVar = xfa.f68157a;
        e16 e16Var = this.f42092c;
        f95 f95Var = this.f42091b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC3584sr.m21632j(f95Var, e16Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                AbstractC3584sr.m21634l(f95Var, e16Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
