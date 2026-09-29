package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class sv1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61453a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vv1 f61454b;

    public /* synthetic */ sv1(vv1 vv1Var, int i, int i2) {
        this.f61453a = i2;
        this.f61454b = vv1Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f61453a;
        xfa xfaVar = xfa.f68157a;
        vv1 vv1Var = this.f61454b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                v9d.m23207i(vv1Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                v9d.m23203e(vv1Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
