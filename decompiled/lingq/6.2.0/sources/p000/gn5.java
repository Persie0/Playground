package p000;

import com.lingq.feature.reader.stats.p019ui.components.AbstractC2558b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gn5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41047a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ mn5 f41048b;

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f41047a;
        xfa xfaVar = xfa.f68157a;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    Object objM22097O = tj3Var.m22097O();
                    p84 p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = new vd1(3);
                        tj3Var.m22131l0(objM22097O);
                    }
                    bj3 bj3Var = (bj3) objM22097O;
                    Object objM22097O2 = tj3Var.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new ie1(6);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    aj3 aj3Var = (aj3) objM22097O2;
                    Object objM22097O3 = tj3Var.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new b25(29);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    AbstractC2558b.m9470c(this.f41048b, bj3Var, aj3Var, (ui3) objM22097O3, tj3Var, 3504);
                }
                break;
            default:
                num.getClass();
                AbstractC2558b.m9473f(this.f41048b, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ gn5(mn5 mn5Var, int i) {
        this.f41048b = mn5Var;
    }
}
