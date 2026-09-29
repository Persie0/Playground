package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ml6 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51474a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f51475b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f51476c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f51477d;

    public /* synthetic */ ml6(ui3 ui3Var, ui3 ui3Var2, int i, int i2) {
        this.f51474a = i2;
        this.f51475b = ui3Var;
        this.f51476c = ui3Var2;
        this.f51477d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f51474a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f51477d;
        ui3 ui3Var = this.f51476c;
        ui3 ui3Var2 = this.f51475b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                nsb.m17612a(ui3Var2, ui3Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
            case 1:
                poc.m19436a(ui3Var2, ui3Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                qoc.m20093a(ui3Var2, ui3Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
