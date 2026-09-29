package p000;

import androidx.glance.text.AbstractC0704a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j04 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44837a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ h04 f44838b;

    public /* synthetic */ j04(h04 h04Var) {
        this.f44838b = h04Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f44837a;
        xfa xfaVar = xfa.f68157a;
        h04 h04Var = this.f44838b;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    h04Var.getClass();
                    tj3Var.m22111b0(-294690877);
                    tj3Var.m22139q(false);
                }
                break;
            default:
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    AbstractC0704a.m2506a(h04Var.f41607c, null, new ux9(((vn2) tj3Var2.m22128k(yf1.f69766e)).f65636e, new zx9(d32.m10018P(12)), new ac3(400), 120), 2, tj3Var2, 3072, 2);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ j04(h04 h04Var, zj8 zj8Var) {
        this.f44838b = h04Var;
    }
}
