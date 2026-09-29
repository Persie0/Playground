package p000;

import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0231g;

/* JADX INFO: renamed from: mu */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3348mu implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51841a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f51842b;

    public /* synthetic */ C3348mu(int i, ui3 ui3Var) {
        this.f51841a = i;
        this.f51842b = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f51841a;
        ui3 ui3Var = this.f51842b;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var, this.f51842b, smb.f61028a, null, null, null, false);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    AbstractC0231g.m1153f(805306368, 510, null, tj3Var2, this.f51842b, smb.f61029b, null, null, null, false);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    AbstractC0218a.m1123c(thb.f62305a, null, ci8.m4703P(1457974019, new C3348mu(3, ui3Var), tj3Var3), null, 0.0f, 0.0f, null, null, null, tj3Var3, 390, 506);
                }
                break;
            default:
                ye1 ye1Var4 = (ye1) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    boolean zM22120g = tj3Var4.m22120g(ui3Var);
                    Object objM22097O = tj3Var4.m22097O();
                    if (zM22120g || objM22097O == we1.f66679a) {
                        objM22097O = new k92(18, ui3Var);
                        tj3Var4.m22131l0(objM22097O);
                    }
                    omd.m18141c((ui3) objM22097O, null, false, null, null, thb.f62306b, tj3Var4, 1572864, 62);
                }
                break;
        }
        return xfaVar;
    }
}
