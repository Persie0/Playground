package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v75 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f64971a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f64972b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f64973c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f64974d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f64975e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ui3 f64976f;

    public /* synthetic */ v75(e16 e16Var, String str, int i, boolean z, ui3 ui3Var, int i2) {
        this.f64972b = e16Var;
        this.f64973c = str;
        this.f64974d = i;
        this.f64975e = z;
        this.f64976f = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f64971a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                sjd.m21437a(this.f64974d, iM19383z, (ye1) obj, this.f64976f, this.f64972b, this.f64973c, this.f64975e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(1);
                q7a.m19706a(this.f64974d, iM19383z2, (ye1) obj, this.f64976f, this.f64972b, this.f64973c, this.f64975e);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ v75(String str, int i, boolean z, ui3 ui3Var, e16 e16Var, int i2) {
        this.f64973c = str;
        this.f64974d = i;
        this.f64975e = z;
        this.f64976f = ui3Var;
        this.f64972b = e16Var;
    }
}
