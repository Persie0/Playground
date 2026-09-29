package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class rh7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59312a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hqa f59313b;

    public /* synthetic */ rh7(hqa hqaVar, int i) {
        this.f59312a = i;
        this.f59313b = hqaVar;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f59312a;
        xfa xfaVar = xfa.f68157a;
        hqa hqaVar = this.f59313b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    lw9.m16554b(hqaVar.f42797e.f487b, null, aa1.f406e, null, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71410n, tj3Var, 384, 27648, 106490);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    ty3.m22351a(hqaVar.f42795c ? xzb.m24801a() : z1c.m25402a(), hqaVar.f42795c ? "Pause" : "Play", c99.m4422o(b16.f7762a, 24.0f), aa1.f406e, tj3Var2, 3456, 0);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    String str = hqaVar.f42797e.f487b;
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(str, null, ((ms5) tj3Var3.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((ms5) tj3Var3.m22128k(vh9Var)).f51800b.f71406j, tj3Var3, 0, 27648, 106490);
                }
                break;
            default:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    ty3.m22351a(hqaVar.f42795c ? xzb.m24801a() : z1c.m25402a(), hqaVar.f42795c ? "Pause" : "Play", null, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51799a.f55844b, tj3Var4, 0, 4);
                }
                break;
        }
        return xfaVar;
    }
}
