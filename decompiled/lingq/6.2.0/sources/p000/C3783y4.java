package p000;

/* JADX INFO: renamed from: y4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3783y4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f69263a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f69264b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f69265c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e16 f69266d;

    public /* synthetic */ C3783y4(int i, int i2, int i3, e16 e16Var) {
        this.f69264b = i;
        this.f69265c = i2;
        this.f69266d = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f69263a;
        xfa xfaVar = xfa.f68157a;
        e16 e16Var = this.f69266d;
        int i2 = this.f69265c;
        int i3 = this.f69264b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                r0d.m20236f(i3, pk9.m19383z(i2 | 1), ye1Var, e16Var);
                break;
            default:
                us1.m22893f(i3, i2, e16Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3783y4(int i, int i2, e16 e16Var) {
        this.f69266d = e16Var;
        this.f69264b = i;
        this.f69265c = i2;
    }
}
