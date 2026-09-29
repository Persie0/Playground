package p000;

import com.lingq.core.p012ui.R$string;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.core.premium.delegate.UpgradeTier;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qia implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57835a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ wia f57836b;

    public /* synthetic */ qia(wia wiaVar, int i) {
        this.f57835a = i;
        this.f57836b = wiaVar;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strM23620a0;
        int i = this.f57835a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        wia wiaVar = this.f57836b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38962k, 0.0f, 2), ((fe9) tj3Var.m22128k(zf1Var)).f38957f, 0.0f, 2), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38957f, 7);
                    if (wiaVar.f66881f == UpgradeTier.PREMIUM_YEAR) {
                        tj3Var.m22111b0(1502863608);
                        strM23620a0 = vz1.m23620a0(tj3Var, R$string.settings_upgrade_change_plan);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1502971550);
                        strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.premium.R$string.upgrade_reach_your_goals);
                        tj3Var.m22139q(false);
                    }
                    lw9.m16554b(strM23620a0, e16VarM21611X, 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71401e, 0L, 0L, bc3.f8322h, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var, 0, 0, 130044);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    AbstractC1839a.m8519E(wiaVar.f66893r, tj3Var2, 0);
                }
                break;
            default:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                } else {
                    u9d.m22641e(wiaVar.f66880e, AbstractC3584sr.m21611X(c99.m4412e(c99.m4428u(b16Var, 0.0f, 600.0f, 1), 1.0f), 0.0f, ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38952a, 0.0f, 0.0f, 13), ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51799a.f55842a, true, tj3Var3, 3072);
                }
                break;
        }
        return xfaVar;
    }
}
