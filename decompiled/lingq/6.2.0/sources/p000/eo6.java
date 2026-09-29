package p000;

import androidx.compose.material3.AbstractC0218a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eo6 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37613a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ vi3 f37614b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f37615c;

    public /* synthetic */ eo6(vi3 vi3Var, vi3 vi3Var2, int i) {
        this.f37613a = 2;
        this.f37614b = vi3Var;
        this.f37615c = vi3Var2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f37613a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f37615c;
        vi3 vi3Var2 = this.f37614b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    AbstractC0218a.m1125e(c2c.f9376a, null, ci8.m4703P(-219747721, new ks3(vi3Var2, 10), tj3Var), ci8.m4703P(1192884782, new iz4(6, vi3Var, vi3Var2), tj3Var), 0.0f, null, null, null, null, tj3Var, 3462, 498);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    v8d.m23177b(vi3Var2, vi3Var, tj3Var2, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                v8d.m23177b(vi3Var2, vi3Var, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ eo6(vi3 vi3Var, vi3 vi3Var2, int i, byte b) {
        this.f37613a = i;
        this.f37614b = vi3Var;
        this.f37615c = vi3Var2;
    }
}
