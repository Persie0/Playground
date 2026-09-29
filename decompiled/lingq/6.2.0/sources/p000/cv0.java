package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cv0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34596a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f34597b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f34598c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f34599d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f34600e;

    public /* synthetic */ cv0(float f, int i, int i2, long j, e16 e16Var) {
        this.f34600e = e16Var;
        this.f34597b = i;
        this.f34599d = j;
        this.f34598c = f;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f34596a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f34600e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(385);
                float f = this.f34598c;
                int i2 = this.f34597b;
                long j = this.f34599d;
                p6d.m18932a(f, i2, iM19383z, j, (ye1) obj, (e16) obj3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(1);
                w7d.m23807b((String) obj3, this.f34597b, this.f34598c, this.f34599d, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ cv0(String str, int i, float f, long j, int i2) {
        this.f34600e = str;
        this.f34597b = i;
        this.f34598c = f;
        this.f34599d = j;
    }
}
