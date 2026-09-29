package p000;

import androidx.compose.material3.AbstractC0218a;
import com.lingq.feature.review.AbstractC2752c;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class de8 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35530a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hg8 f35531b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f35532c;

    public /* synthetic */ de8(vi3 vi3Var, hg8 hg8Var) {
        this.f35532c = vi3Var;
        this.f35531b = hg8Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f35530a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f35532c;
        hg8 hg8Var = this.f35531b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    AbstractC0218a.m1121a(mjc.f51414a, null, ci8.m4703P(-928476103, new ks3(vi3Var, 25), tj3Var), ci8.m4703P(892755810, new iz4(10, hg8Var, vi3Var), tj3Var), 0.0f, null, null, null, null, tj3Var, 3462, 498);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    fwc.m12240a(hg8Var.f42328c, vi3Var, tj3Var2, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC2752c.m9585h(hg8Var, vi3Var, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ de8(hg8 hg8Var, vi3 vi3Var) {
        this.f35531b = hg8Var;
        this.f35532c = vi3Var;
    }

    public /* synthetic */ de8(hg8 hg8Var, vi3 vi3Var, int i) {
        this.f35531b = hg8Var;
        this.f35532c = vi3Var;
    }
}
