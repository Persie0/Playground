package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class en5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37564a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f37565b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f37566c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f37567d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f37568e;

    public /* synthetic */ en5(ui3 ui3Var, e16 e16Var, int i, int i2) {
        this.f37567d = ui3Var;
        this.f37565b = e16Var;
        this.f37566c = i;
        this.f37568e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f37564a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f37568e;
        int i3 = this.f37566c;
        ui3 ui3Var = this.f37567d;
        e16 e16Var = this.f37565b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                qnb.m20084a(pk9.m19383z(i3 | 1), i2, ye1Var, ui3Var, e16Var);
                break;
            case 1:
                t4d.m21843d(i3, pk9.m19383z(i2 | 1), ye1Var, ui3Var, e16Var);
                break;
            default:
                n9d.m17299a(pk9.m19383z(i3 | 1), i2, ye1Var, ui3Var, e16Var);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ en5(e16 e16Var, int i, ui3 ui3Var, int i2) {
        this.f37565b = e16Var;
        this.f37566c = i;
        this.f37567d = ui3Var;
        this.f37568e = i2;
    }

    public /* synthetic */ en5(e16 e16Var, ui3 ui3Var, int i, int i2) {
        this.f37565b = e16Var;
        this.f37567d = ui3Var;
        this.f37566c = i;
        this.f37568e = i2;
    }
}
