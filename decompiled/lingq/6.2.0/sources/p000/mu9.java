package p000;

import androidx.compose.material3.internal.AbstractC0246h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mu9 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51859a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f51860b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f51861c;

    public /* synthetic */ mu9(long j, zi3 zi3Var, int i) {
        this.f51859a = 2;
        this.f51860b = j;
        this.f51861c = zi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f51859a;
        xfa xfaVar = xfa.f68157a;
        zi3 zi3Var = this.f51861c;
        long j = this.f51860b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    AbstractC0246h.m1169d(j, zi3Var, tj3Var, 0);
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    AbstractC0246h.m1169d(j, zi3Var, tj3Var2, 0);
                }
                break;
            default:
                num.getClass();
                AbstractC0246h.m1169d(j, zi3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ mu9(long j, zi3 zi3Var, int i, byte b) {
        this.f51859a = i;
        this.f51860b = j;
        this.f51861c = zi3Var;
    }
}
