package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dv4 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36264a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0282a f36265b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f36266c;

    public /* synthetic */ dv4(C0282a c0282a, int i, int i2) {
        this.f36264a = i2;
        this.f36265b = c0282a;
        this.f36266c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f36264a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f36266c;
        C0282a c0282a = this.f36265b;
        cv4 cv4Var = (cv4) obj;
        ye1 ye1Var = (ye1) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        switch (i) {
            case 0:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((tj3) ye1Var).m22120g(cv4Var) : ((tj3) ye1Var).m22124i(cv4Var) ? 4 : 2;
                }
                if ((iIntValue & 19) != 18) {
                    c0282a.mo825e(cv4Var, Integer.valueOf(i2), ye1Var, Integer.valueOf(iIntValue & 14));
                } else {
                    tj3 tj3Var = (tj3) ye1Var;
                    if (!tj3Var.m22086D()) {
                        c0282a.mo825e(cv4Var, Integer.valueOf(i2), ye1Var, Integer.valueOf(iIntValue & 14));
                    } else {
                        tj3Var.m22102U();
                    }
                }
                break;
            default:
                if ((iIntValue & 6) == 0) {
                    iIntValue |= (iIntValue & 8) == 0 ? ((tj3) ye1Var).m22120g(cv4Var) : ((tj3) ye1Var).m22124i(cv4Var) ? 4 : 2;
                }
                if ((iIntValue & 19) != 18) {
                    c0282a.mo825e(cv4Var, Integer.valueOf(i2), ye1Var, Integer.valueOf(iIntValue & 14));
                } else {
                    tj3 tj3Var2 = (tj3) ye1Var;
                    if (!tj3Var2.m22086D()) {
                        c0282a.mo825e(cv4Var, Integer.valueOf(i2), ye1Var, Integer.valueOf(iIntValue & 14));
                    } else {
                        tj3Var2.m22102U();
                    }
                }
                break;
        }
        return xfaVar;
    }
}
