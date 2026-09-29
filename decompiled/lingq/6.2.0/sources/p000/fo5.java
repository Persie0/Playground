package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fo5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f39381b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f39382c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f39383d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f39384e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f39385f;

    public /* synthetic */ fo5(int i, int i2, ui3 ui3Var, String str, String str2, boolean z) {
        this.f39380a = i2;
        this.f39381b = z;
        this.f39382c = str;
        this.f39383d = str2;
        this.f39384e = ui3Var;
        this.f39385f = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f39380a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f39385f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                wnb.m24087d(pk9.m19383z(i2 | 1), (ye1) obj, this.f39384e, this.f39382c, this.f39383d, this.f39381b);
                break;
            default:
                ((Integer) obj2).getClass();
                q9d.m19833e(pk9.m19383z(i2 | 1), (ye1) obj, this.f39384e, this.f39382c, this.f39383d, this.f39381b);
                break;
        }
        return xfaVar;
    }
}
