package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uh7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqa f63930b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f63931c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e16 f63932d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f63933e;

    public /* synthetic */ uh7(hqa hqaVar, vi3 vi3Var, e16 e16Var, int i, int i2) {
        this.f63929a = i2;
        this.f63930b = hqaVar;
        this.f63931c = vi3Var;
        this.f63932d = e16Var;
        this.f63933e = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f63929a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f63933e;
        e16 e16Var = this.f63932d;
        vi3 vi3Var = this.f63931c;
        hqa hqaVar = this.f63930b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ngc.m17429a(hqaVar, vi3Var, e16Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                mad.m16719a(hqaVar, vi3Var, e16Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
