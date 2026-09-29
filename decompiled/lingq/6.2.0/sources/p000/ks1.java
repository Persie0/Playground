package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ks1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48376a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f48377b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f48378c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f48379d;

    public /* synthetic */ ks1(int i, boolean z, e16 e16Var, int i2) {
        this.f48378c = i;
        this.f48377b = z;
        this.f48379d = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f48376a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f48378c;
        Object obj3 = this.f48379d;
        boolean z = this.f48377b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                q9d.m19830b(i2, z, (e16) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                tgc.m22030a(z, (zi3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ks1(boolean z, zi3 zi3Var, int i) {
        this.f48377b = z;
        this.f48379d = zi3Var;
        this.f48378c = i;
    }
}
