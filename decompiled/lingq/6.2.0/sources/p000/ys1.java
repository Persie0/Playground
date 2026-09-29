package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ys1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70364a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f70365b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f70366c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e16 f70367d;

    public /* synthetic */ ys1(e16 e16Var, int i, String str, int i2) {
        this.f70365b = i;
        this.f70366c = str;
        this.f70367d = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f70364a;
        xfa xfaVar = xfa.f68157a;
        e16 e16Var = this.f70367d;
        String str = this.f70366c;
        int i2 = this.f70365b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                r9d.m20481c(pk9.m19383z(i2 | 1), ye1Var, e16Var, str);
                break;
            default:
                lpb.m16442b(i2, pk9.m19383z(49), ye1Var, e16Var, str);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ys1(String str, e16 e16Var, int i) {
        this.f70366c = str;
        this.f70367d = e16Var;
        this.f70365b = i;
    }
}
