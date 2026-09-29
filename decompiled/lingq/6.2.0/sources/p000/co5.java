package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class co5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10350a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f10351b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f10352c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f10353d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f10354e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xi3 f10355f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f10356g;

    public /* synthetic */ co5(p04 p04Var, int i, boolean z, vi3 vi3Var, Integer num, int i2, int i3) {
        this.f10354e = p04Var;
        this.f10351b = i;
        this.f10352c = z;
        this.f10355f = vi3Var;
        this.f10356g = num;
        this.f10353d = i3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f10350a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f10356g;
        xi3 xi3Var = this.f10355f;
        Object obj4 = this.f10354e;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                tnb.m22247a((p04) obj4, this.f10351b, this.f10352c, (vi3) xi3Var, (Integer) obj3, (ye1) obj, iM19383z, this.f10353d);
                break;
            case 1:
                ye1 ye1Var = (ye1) obj;
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(this.f10353d | 1);
                int i2 = this.f10351b;
                e3d.m10830e(i2, iM19383z2, ye1Var, (ui3) xi3Var, (e16) obj3, (String) obj4, this.f10352c);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(this.f10351b | 1);
                fbd.m11758h((sxa) obj4, (ui3) xi3Var, (e16) obj3, this.f10352c, (ye1) obj, iM19383z3, this.f10353d);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ co5(e16 e16Var, String str, int i, boolean z, ui3 ui3Var, int i2) {
        this.f10351b = i;
        this.f10354e = str;
        this.f10355f = ui3Var;
        this.f10352c = z;
        this.f10356g = e16Var;
        this.f10353d = i2;
    }

    public /* synthetic */ co5(sxa sxaVar, ui3 ui3Var, e16 e16Var, boolean z, int i, int i2) {
        this.f10354e = sxaVar;
        this.f10355f = ui3Var;
        this.f10356g = e16Var;
        this.f10352c = z;
        this.f10351b = i;
        this.f10353d = i2;
    }
}
