package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cs0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34440a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f34441b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ hr0 f34442c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f34443d;

    public /* synthetic */ cs0(e16 e16Var, hr0 hr0Var, int i) {
        this.f34441b = e16Var;
        this.f34442c = hr0Var;
        this.f34443d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f34440a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f34443d;
        hr0 hr0Var = this.f34442c;
        e16 e16Var = this.f34441b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b6d.m3391k(e16Var, hr0Var, i2, ye1Var, pk9.m19383z(1));
                break;
            default:
                b6d.m3390j(e16Var, hr0Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ cs0(e16 e16Var, hr0 hr0Var, int i, int i2) {
        this.f34441b = e16Var;
        this.f34442c = hr0Var;
        this.f34443d = i;
    }
}
