package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mw6 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51968a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ p04 f51969b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f51970c;

    public /* synthetic */ mw6(p04 p04Var, String str, int i) {
        this.f51968a = i;
        this.f51969b = p04Var;
        this.f51970c = str;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f51968a;
        xfa xfaVar = xfa.f68157a;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    ty3.m22351a(this.f51969b, this.f51970c, null, 0L, tj3Var, 0, 12);
                }
                break;
            default:
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    ty3.m22351a(this.f51969b, this.f51970c, null, 0L, tj3Var2, 0, 12);
                }
                break;
        }
        return xfaVar;
    }
}
