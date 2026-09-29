package p000;

import com.lingq.feature.challenges.cup.AbstractC1976c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class lw1 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50200a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ tw1 f50201b;

    public /* synthetic */ lw1(tw1 tw1Var, int i) {
        this.f50200a = i;
        this.f50201b = tw1Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f50200a;
        xfa xfaVar = xfa.f68157a;
        tw1 tw1Var = this.f50201b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    AbstractC1976c.m8833p(tw1Var.f62981e, 0, tj3Var, null);
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
                    AbstractC1976c.m8840w(tw1Var, null, tj3Var2, 0);
                } else {
                    tj3Var2.m22102U();
                }
                return xfaVar;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC1976c.m8818a(tw1Var, null, tj3Var3, 0);
                } else {
                    tj3Var3.m22102U();
                }
                return xfaVar;
            default:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x9d.m24422e("", null, true, false, tj3Var4, 390, 10);
                    pb1.m19031a(0.0f, 0, 3, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51799a.f55817B, tj3Var4, null);
                    tj3 tj3Var5 = tj3Var4;
                    int i2 = 0;
                    for (Object obj4 : tw1Var.f62987k) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        s9d.m21183b((et1) obj4, true, null, tj3Var5, 48);
                        if (i2 != vz1.m23602H(tw1Var.f62987k)) {
                            tj3Var5.m22111b0(-1324798511);
                            tj3 tj3Var6 = tj3Var5;
                            pb1.m19031a(0.0f, 0, 3, ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51799a.f55817B, tj3Var6, null);
                            tj3Var5 = tj3Var6;
                            tj3Var5.m22139q(false);
                        } else {
                            tj3Var5.m22111b0(-1324703372);
                            tj3Var5.m22139q(false);
                        }
                        i2 = i3;
                    }
                } else {
                    tj3Var4.m22102U();
                }
                return xfaVar;
        }
    }
}
