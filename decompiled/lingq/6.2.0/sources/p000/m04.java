package p000;

import com.lingq.core.premium.R$string;
import com.lingq.feature.widget.layout.collections.layout.AbstractC2868d;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class m04 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f50379b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f50380c;

    public /* synthetic */ m04(int i, boolean z, boolean z2) {
        this.f50378a = i;
        this.f50379b = z;
        this.f50380c = z2;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f50378a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                h04 h04Var = (h04) obj;
                int iIntValue = ((Integer) obj3).intValue();
                h04Var.getClass();
                AbstractC2868d.m9781b(h04Var, this.f50379b, this.f50380c, h04Var.f41609e, ci8.m4734s(mn3.f51554a), (ye1) obj2, iIntValue & 14);
                break;
            default:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((tj8) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    lw9.m16554b(vz1.m23620a0(tj3Var, this.f50379b ? R$string.upgrade_start_7_day_free_trial : this.f50380c ? R$string.upgrade_unlock_plus : R$string.upgrade_unlock_premium), null, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var, 0, 0, 130046);
                }
                break;
        }
        return xfaVar;
    }
}
