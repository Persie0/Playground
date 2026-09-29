package p000;

import androidx.compose.material3.AbstractC0262s;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: renamed from: ie */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3109ie implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0282a f44007b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f44008c;

    public /* synthetic */ C3109ie(C0282a c0282a, zi3 zi3Var, int i) {
        this.f44006a = i;
        this.f44007b = c0282a;
        this.f44008c = zi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f44006a;
        xfa xfaVar = xfa.f68157a;
        zi3 zi3Var = this.f44008c;
        C0282a c0282a = this.f44007b;
        int i2 = 1;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                    return xfaVar;
                }
                float f = ((xj2) tj3Var.m22128k(AbstractC0262s.f3629c)).f68285a;
                if (Float.isNaN(f)) {
                    f = 0.0f;
                }
                xj2 xj2Var = new xj2(8.0f - (f - wj0.m24001f()));
                xj2 xj2Var2 = new xj2(0.0f);
                xj2 xj2Var3 = new xj2(8.0f);
                if (xj2Var2.compareTo(xj2Var3) > 0) {
                    C3386nv.m17622h(46, xj2Var3, " is less than minimum ", xj2Var2, "Cannot coerce value to an empty range: maximum ");
                    return null;
                }
                if (xj2Var.compareTo(xj2Var2) < 0) {
                    xj2Var = xj2Var2;
                } else if (xj2Var.compareTo(xj2Var3) > 0) {
                    xj2Var = xj2Var3;
                }
                AbstractC3369ne.m17394b(xj2Var.f68285a, ci8.m4703P(-459506658, new C3109ie(c0282a, zi3Var, i2), tj3Var), tj3Var, 390);
                return xfaVar;
            default:
                tj3 tj3Var2 = (tj3) ye1Var;
                if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0282a.invoke(tj3Var2, 0);
                    if (zi3Var == null) {
                        tj3Var2.m22111b0(-1102003461);
                    } else {
                        tj3Var2.m22111b0(795735494);
                        zi3Var.invoke(tj3Var2, 0);
                    }
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
        }
    }
}
