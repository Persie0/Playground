package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0232g0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gu6 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41343a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0232g0 f41344b;

    public /* synthetic */ gu6(C0232g0 c0232g0, int i) {
        this.f41343a = i;
        this.f41344b = c0232g0;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f41343a;
        xfa xfaVar = xfa.f68157a;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    AbstractC0231g.m1152e(this.f41344b, null, null, tj3Var, 6, 6);
                }
                break;
            default:
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    AbstractC0231g.m1152e(this.f41344b, null, null, tj3Var2, 6, 6);
                }
                break;
        }
        return xfaVar;
    }
}
