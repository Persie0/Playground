package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tv1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vv1 f62941b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f62942c;

    public /* synthetic */ tv1(vv1 vv1Var, vi3 vi3Var, int i, int i2) {
        this.f62940a = i2;
        this.f62941b = vv1Var;
        this.f62942c = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f62940a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f62942c;
        vv1 vv1Var = this.f62941b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                v9d.m23200b(vv1Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
            case 1:
                v9d.m23205g(vv1Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                v9d.m23206h(vv1Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
