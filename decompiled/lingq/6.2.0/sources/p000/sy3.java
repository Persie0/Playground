package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sy3 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f61607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e16 f61608c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f61609d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f61610e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f61611f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f61612g;

    public /* synthetic */ sy3(Object obj, String str, e16 e16Var, long j, int i, int i2, int i3) {
        this.f61606a = i3;
        this.f61612g = obj;
        this.f61607b = str;
        this.f61608c = e16Var;
        this.f61609d = j;
        this.f61610e = i;
        this.f61611f = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f61606a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f61610e;
        Object obj3 = this.f61612g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                ty3.m22351a((p04) obj3, this.f61607b, this.f61608c, this.f61609d, (ye1) obj, iM19383z, this.f61611f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                ty3.m22352b((y27) obj3, this.f61607b, this.f61608c, this.f61609d, (ye1) obj, iM19383z2, this.f61611f);
                break;
        }
        return xfaVar;
    }
}
