package p000;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class wu8 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67304a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zi3 f67305b;

    public /* synthetic */ wu8(int i, zi3 zi3Var) {
        this.f67304a = i;
        this.f67305b = zi3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f67304a;
        xfa xfaVar = xfa.f68157a;
        zi3 zi3Var = this.f67305b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    zi3Var.invoke(tj3Var, 0);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    iq9.m14078c(zi3Var, tj3Var2, 0);
                }
                break;
            default:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                } else {
                    zi3Var.invoke(tj3Var3, 0);
                }
                break;
        }
        return xfaVar;
    }
}
