package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ou1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54991a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ru1 f54992b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f54993c;

    public /* synthetic */ ou1(ru1 ru1Var, int i, int i2) {
        this.f54991a = i2;
        this.f54992b = ru1Var;
        this.f54993c = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f54991a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f54993c;
        ru1 ru1Var = this.f54992b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                qu1.m20171h(ru1Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
            case 1:
                qu1.m20169f(ru1Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                qu1.m20165b(ru1Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
