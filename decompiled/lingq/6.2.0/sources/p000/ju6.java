package p000;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ju6 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f46162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f46163b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f46164c;

    public /* synthetic */ ju6(vi3 vi3Var, ui3 ui3Var, int i) {
        this.f46162a = 1;
        this.f46163b = vi3Var;
        this.f46164c = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f46162a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f46163b;
        ui3 ui3Var = this.f46164c;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    Object objM22097O = tj3Var.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = AbstractC0278f.m1260j(new vv9((String) null, 7, 0L));
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
                    si8 si8Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64859e;
                    x17 x17Var = AbstractC0807be.f8407a;
                    ho9.m13414a(e16VarM4430w, si8Var, 0L, 0L, 0.0f, 0.0f, null, ci8.m4703P(1827276458, new ku6((t66) objM22097O, ui3Var, vi3Var), tj3Var), tj3Var, 12582918, 108);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                cxc.m9928a(pk9.m19383z(1), (ye1) obj, ui3Var, vi3Var);
                break;
            default:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    bq1.m4039O(AbstractC3423or.m18285y(c99.m4412e(b16Var, 1.0f), IntrinsicSize.Min), ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51801c.f64858d, null, null, null, ci8.m4703P(2108185248, new iz4(20, ui3Var, vi3Var), tj3Var2), tj3Var2, 196614, 28);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ju6(ui3 ui3Var, vi3 vi3Var, int i) {
        this.f46162a = i;
        this.f46164c = ui3Var;
        this.f46163b = vi3Var;
    }
}
