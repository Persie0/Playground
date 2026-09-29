package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ba5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8220a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f8221b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f8222c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8223d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f8224e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean f8225f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f8226g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f8227h;

    public /* synthetic */ ba5(e16 e16Var, int i, int i2, String str, boolean z, boolean z2, boolean z3, int i3) {
        this.f8221b = e16Var;
        this.f8222c = i;
        this.f8223d = i2;
        this.f8227h = str;
        this.f8224e = z;
        this.f8225f = z2;
        this.f8226g = z3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8220a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f8227h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(this.f8222c | 1);
                bkd.m3814a(this.f8221b, this.f8224e, this.f8225f, this.f8226g, (ui3) obj3, (ye1) obj, iM19383z, this.f8223d);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(1);
                e5d.m10857a(this.f8221b, this.f8222c, this.f8223d, (String) obj3, this.f8224e, this.f8225f, this.f8226g, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ba5(e16 e16Var, boolean z, boolean z2, boolean z3, ui3 ui3Var, int i, int i2) {
        this.f8221b = e16Var;
        this.f8224e = z;
        this.f8225f = z2;
        this.f8226g = z3;
        this.f8227h = ui3Var;
        this.f8222c = i;
        this.f8223d = i2;
    }
}
