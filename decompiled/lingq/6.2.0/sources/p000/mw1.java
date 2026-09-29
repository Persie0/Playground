package p000;

import androidx.compose.foundation.AbstractC0080f;
import com.lingq.feature.challenges.R$string;
import com.lingq.feature.challenges.cup.AbstractC1976c;
import com.lingq.feature.challenges.cup.data.CupLeaderboardTab;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mw1 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tw1 f51909b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f51910c;

    public /* synthetic */ mw1(tw1 tw1Var, vi3 vi3Var, int i) {
        this.f51908a = i;
        this.f51909b = tw1Var;
        this.f51910c = vi3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f51908a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        vi3 vi3Var = this.f51910c;
        tw1 tw1Var = this.f51909b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    CupLeaderboardTab cupLeaderboardTab = tw1Var.f62978b;
                    boolean zM22120g = tj3Var.m22120g(vi3Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == p84Var) {
                        objM22097O = new te0(vi3Var, 14);
                        tj3Var.m22131l0(objM22097O);
                    }
                    AbstractC1976c.m8834q(cupLeaderboardTab, (vi3) objM22097O, tj3Var, 0);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    boolean zM22120g2 = tj3Var2.m22120g(vi3Var);
                    Object objM22097O2 = tj3Var2.m22097O();
                    if (zM22120g2 || objM22097O2 == p84Var) {
                        objM22097O2 = new te0(vi3Var, 15);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    AbstractC1976c.m8837t(tw1Var, (vi3) objM22097O2, null, tj3Var2, 0);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            default:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    x9d.m24422e(vz1.m23620a0(tj3Var3, R$string.cup_col_team), null, false, true, tj3Var3, 3072, 6);
                    pb1.m19031a(0.0f, 0, 3, ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51799a.f55817B, tj3Var3, null);
                    tj3 tj3Var4 = tj3Var3;
                    int i2 = 0;
                    for (Object obj4 : tw1Var.f62982f) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        vw1 vw1Var = (vw1) obj4;
                        boolean zM22120g3 = tj3Var4.m22120g(vi3Var) | tj3Var4.m22120g(vw1Var);
                        Object objM22097O3 = tj3Var4.m22097O();
                        if (zM22120g3 || objM22097O3 == p84Var) {
                            objM22097O3 = new fw1(vi3Var, vw1Var, 1);
                            tj3Var4.m22131l0(objM22097O3);
                        }
                        x9d.m24419b(AbstractC0080f.m815b(null, false, (ui3) objM22097O3, b16.f7762a, 15), vw1Var, tj3Var4, 0);
                        if (i2 != vz1.m23602H(tw1Var.f62982f)) {
                            tj3Var4.m22111b0(971151176);
                            tj3 tj3Var5 = tj3Var4;
                            pb1.m19031a(0.0f, 0, 3, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51799a.f55817B, tj3Var5, null);
                            tj3Var4 = tj3Var5;
                            tj3Var4.m22139q(false);
                        } else {
                            tj3Var4.m22111b0(971246315);
                            tj3Var4.m22139q(false);
                        }
                        i2 = i3;
                    }
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
        }
    }
}
