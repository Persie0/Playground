package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ts1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62792a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f62793b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f62794c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ e16 f62795d;

    public /* synthetic */ ts1(String str, String str2, e16 e16Var, int i, int i2) {
        this.f62792a = i2;
        this.f62793b = str;
        this.f62794c = str2;
        this.f62795d = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f62792a;
        xfa xfaVar = xfa.f68157a;
        e16 e16Var = this.f62795d;
        String str = this.f62794c;
        String str2 = this.f62793b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                us1.m22892e(str2, str, e16Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                s9d.m21182a(str2, str, e16Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
