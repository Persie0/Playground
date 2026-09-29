package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b81 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8083a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f8084b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f8085c;

    public /* synthetic */ b81(int i, int i2, int i3, long j) {
        this.f8083a = i3;
        this.f8084b = i;
        this.f8085c = j;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8083a;
        xfa xfaVar = xfa.f68157a;
        long j = this.f8085c;
        int i2 = this.f8084b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                d8d.m10162b(i2, j, ye1Var, pk9.m19383z(1));
                break;
            default:
                czc.m9947c(i2, j, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
