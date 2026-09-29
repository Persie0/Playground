package p000;

import com.lingq.core.premium.AbstractC1839a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tha implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f62300a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f62301b;

    public /* synthetic */ tha(String str, int i) {
        this.f62300a = 3;
        this.f62301b = str;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f62300a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    lw9.m16554b(this.f62301b, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var, 0, 0, 262142);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    lw9.m16554b(this.f62301b, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 262142);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    vx9 vx9Var = ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71406j;
                    zf1 zf1Var = ge9.f40637a;
                    lw9.m16554b(this.f62301b, AbstractC3584sr.m21608U(b16.f7762a, ((fe9) tj3Var3.m22128k(zf1Var)).f38956e, ((fe9) tj3Var3.m22128k(zf1Var)).f38956e), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var, tj3Var3, 0, 0, 130044);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC1839a.m8524b(this.f62301b, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    lw9.m16554b(this.f62301b, null, aa1.m198b(0.5f, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51799a.f55870o), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, tj3Var4, 0, 0, 262138);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ tha(String str, int i, byte b) {
        this.f62300a = i;
        this.f62301b = str;
    }
}
