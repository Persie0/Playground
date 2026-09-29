package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ds0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36149a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f36150b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f36151c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f36152d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f36153e;

    public /* synthetic */ ds0(p04 p04Var, String str, long j, y27 y27Var) {
        this.f36152d = p04Var;
        this.f36150b = str;
        this.f36151c = j;
        this.f36153e = y27Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f36149a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f36153e;
        Object obj4 = this.f36152d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                b6d.m3383c((e16) obj4, this.f36150b, (hr0) obj3, this.f36151c, (ye1) obj, pk9.m19383z(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                qu1.m20170g(this.f36150b, this.f36151c, (String) obj4, (String) obj3, (ye1) obj, pk9.m19383z(55));
                break;
            default:
                p04 p04Var = (p04) obj4;
                y27 y27Var = (y27) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    b16 b16Var = b16.f7762a;
                    String str = this.f36150b;
                    long j = this.f36151c;
                    if (p04Var != null) {
                        tj3Var.m22111b0(652567089);
                        ((fe9) tj3Var.m22128k(ge9.f40637a)).getClass();
                        ty3.m22351a(p04Var, str, c99.m4422o(b16Var, 16.0f), j, tj3Var, 0, 0);
                        tj3Var.m22139q(false);
                    } else if (y27Var == null) {
                        tj3Var.m22111b0(653069537);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(652836014);
                        ((fe9) tj3Var.m22128k(ge9.f40637a)).getClass();
                        ty3.m22352b(y27Var, str, c99.m4422o(b16Var, 16.0f), j, tj3Var, 8, 0);
                        tj3Var.m22139q(false);
                    }
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ds0(e16 e16Var, String str, hr0 hr0Var, long j, int i) {
        this.f36152d = e16Var;
        this.f36150b = str;
        this.f36153e = hr0Var;
        this.f36151c = j;
    }

    public /* synthetic */ ds0(String str, long j, String str2, String str3, int i) {
        this.f36150b = str;
        this.f36151c = j;
        this.f36152d = str2;
        this.f36153e = str3;
    }
}
