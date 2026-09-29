package p000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b70 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8031a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f8032b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f8033c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f8034d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8035e;

    public /* synthetic */ b70(boolean z, ui3 ui3Var, int i, int i2) {
        this.f8031a = 0;
        this.f8032b = z;
        this.f8034d = ui3Var;
        this.f8033c = i;
        this.f8035e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8031a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f8035e;
        ui3 ui3Var = this.f8034d;
        int i3 = this.f8033c;
        boolean z = this.f8032b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                eh0.m11123c(pk9.m19383z(i3 | 1), i2, ye1Var, ui3Var, z);
                break;
            case 1:
                num.intValue();
                omd.m18137a(i3, pk9.m19383z(i2 | 1), ye1Var, ui3Var, z);
                break;
            default:
                num.intValue();
                omd.m18137a(i3, pk9.m19383z(i2 | 1), ye1Var, ui3Var, z);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ b70(int i, int i2, int i3, ui3 ui3Var, boolean z) {
        this.f8031a = i3;
        this.f8032b = z;
        this.f8033c = i;
        this.f8034d = ui3Var;
        this.f8035e = i2;
    }
}
