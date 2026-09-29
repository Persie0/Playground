package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mi9 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51368a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w65 f51369b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vs3 f51370c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f51371d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f51372e;

    public /* synthetic */ mi9(vs3 vs3Var, w65 w65Var, ui3 ui3Var, int i) {
        this.f51370c = vs3Var;
        this.f51369b = w65Var;
        this.f51371d = ui3Var;
        this.f51372e = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f51368a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f51372e;
        ui3 ui3Var = this.f51371d;
        vs3 vs3Var = this.f51370c;
        w65 w65Var = this.f51369b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                i4d.m13659a(pk9.m19383z(i2 | 1), ye1Var, ui3Var, vs3Var, w65Var);
                break;
            default:
                num.intValue();
                j4d.m14287b(pk9.m19383z(i2 | 1), ye1Var, ui3Var, vs3Var, w65Var);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ mi9(w65 w65Var, vs3 vs3Var, ui3 ui3Var, int i) {
        this.f51369b = w65Var;
        this.f51370c = vs3Var;
        this.f51371d = ui3Var;
        this.f51372e = i;
    }
}
