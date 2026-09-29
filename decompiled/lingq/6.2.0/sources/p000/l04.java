package p000;

import com.lingq.core.p012ui.R$string;
import com.lingq.core.premium.R$drawable;
import com.lingq.feature.widget.layout.collections.layout.AbstractC2868d;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l04 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48849a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f48850b;

    public /* synthetic */ l04(int i, boolean z) {
        this.f48849a = i;
        this.f48850b = z;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f48849a;
        boolean z = this.f48850b;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                h04 h04Var = (h04) obj;
                int iIntValue = ((Integer) obj3).intValue();
                h04Var.getClass();
                AbstractC2868d.m9781b(h04Var, true, this.f48850b, h04Var.f41609e, ci8.m4734s(mn3.f51554a), (ye1) obj2, iIntValue & 14);
                break;
            case 1:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    r9d.m20484f(R$drawable.ic_upgrade_lynx_graphic, 0.0f, tj3Var, 0, 2);
                    wnb.m24086c(z, tj3Var, 0);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.ui_delete), null, aa1.m198b(z ? 1.0f : 0.4f, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55879w), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262138);
                }
                break;
        }
        return xfaVar;
    }
}
