package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ki2 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47321a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f47322b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f47323c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f47324d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f47325e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f47326f;

    public /* synthetic */ ki2(float f, int i, int i2, long j, e16 e16Var) {
        this.f47326f = e16Var;
        this.f47323c = f;
        this.f47324d = j;
        this.f47322b = i;
        this.f47325e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f47321a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f47326f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(this.f47322b | 1);
                float f = this.f47323c;
                int i2 = this.f47325e;
                long j = this.f47324d;
                pb1.m19037g(f, iM19383z, i2, j, (ye1) obj, (e16) obj3);
                break;
            default:
                ((Integer) obj2).intValue();
                int iM19383z2 = pk9.m19383z(this.f47325e | 1);
                fjd.m11918b((String) obj3, this.f47322b, this.f47323c, this.f47324d, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ki2(String str, int i, float f, long j, int i2) {
        this.f47326f = str;
        this.f47322b = i;
        this.f47323c = f;
        this.f47324d = j;
        this.f47325e = i2;
    }
}
