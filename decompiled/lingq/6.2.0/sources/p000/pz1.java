package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pz1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57017a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f57018b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f57019c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f57020d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f57021e;

    public /* synthetic */ pz1(int i, int i2, ui3 ui3Var, String str, String str2, boolean z) {
        this.f57017a = i2;
        this.f57018b = str;
        this.f57019c = str2;
        this.f57020d = z;
        this.f57021e = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f57017a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                had.m13167b(pk9.m19383z(1), (ye1) obj, this.f57021e, this.f57018b, this.f57019c, this.f57020d);
                break;
            default:
                ((Integer) obj2).getClass();
                v8d.m23178c(pk9.m19383z(1), (ye1) obj, this.f57021e, this.f57018b, this.f57019c, this.f57020d);
                break;
        }
        return xfaVar;
    }
}
