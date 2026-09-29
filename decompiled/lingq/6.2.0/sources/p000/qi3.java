package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qi3 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ac7 f57808b;

    public /* synthetic */ qi3(ac7 ac7Var, int i) {
        this.f57807a = i;
        this.f57808b = ac7Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f57807a;
        xfa xfaVar = xfa.f68157a;
        ac7 ac7Var = this.f57808b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    lw9.m16554b(ac7Var.f487b, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, 0, 0, 131070);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    lw9.m16554b(ac7Var.f487b, null, aa1.f406e, null, 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71410n, tj3Var2, 384, 27648, 106490);
                }
                break;
            default:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    lw9.m16554b(ac7Var.f487b, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var3, 0, 0, 131070);
                }
                break;
        }
        return xfaVar;
    }
}
