package p000;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.material3.AbstractC0231g;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bt6 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8988a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f8989b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f8990c;

    public /* synthetic */ bt6(t66 t66Var, t66 t66Var2, int i) {
        this.f8988a = i;
        this.f8989b = t66Var;
        this.f8990c = t66Var2;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f8988a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        t66 t66Var = this.f8990c;
        t66 t66Var2 = this.f8989b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    Integer num = (Integer) t66Var2.getValue();
                    Object objM22097O = tj3Var.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = new C0023al(28, t66Var);
                        tj3Var.m22131l0(objM22097O);
                    }
                    AbstractC0054a.m727b(num, null, (vi3) objM22097O, nj0.f52812g, "learnWords", null, q2c.f57177d, tj3Var, 1600896, 34);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else if (!((Boolean) t66Var.getValue()).booleanValue()) {
                    tj3Var2.m22111b0(976715866);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(976326661);
                    boolean zM22120g = tj3Var2.m22120g(t66Var2);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g || objM22097O2 == p84Var) {
                        objM22097O2 = new do4(16, t66Var2);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var2, (ui3) objM22097O2, q3c.f57219c, null, null, null, false);
                    tj3Var2.m22139q(false);
                }
                break;
        }
        return xfaVar;
    }
}
