package p000;

/* JADX INFO: renamed from: v4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3672v4 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64813a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f64814b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e16 f64815c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f64816d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f64817e;

    public /* synthetic */ C3672v4(e16 e16Var, int i, String str, int i2) {
        this.f64815c = e16Var;
        this.f64816d = i;
        this.f64814b = str;
        this.f64817e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f64813a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f64817e;
        int i3 = this.f64816d;
        e16 e16Var = this.f64815c;
        String str = this.f64814b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                r0d.m20233c(i3, pk9.m19383z(i2 | 1), ye1Var, e16Var, str);
                break;
            default:
                r9d.m20483e(pk9.m19383z(i3 | 1), i2, ye1Var, e16Var, str);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3672v4(String str, e16 e16Var, int i, int i2) {
        this.f64814b = str;
        this.f64815c = e16Var;
        this.f64816d = i;
        this.f64817e = i2;
    }
}
