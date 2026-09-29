package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class oc8 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54175a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f54176b;

    public /* synthetic */ oc8(Object obj, int i) {
        this.f54175a = i;
        this.f54176b = obj;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f54175a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f54176b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Number) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    lw9.m16554b((String) obj3, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    lw9.m16554b(((d39) obj3).f34966h, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                }
                break;
        }
        return xfaVar;
    }
}
