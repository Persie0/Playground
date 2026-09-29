package p000;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kw6 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48506a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ i48 f48507b;

    public /* synthetic */ kw6(i48 i48Var, int i) {
        this.f48506a = i;
        this.f48507b = i48Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f48506a;
        xfa xfaVar = xfa.f68157a;
        String strM23620a0 = "";
        i48 i48Var = this.f48507b;
        switch (i) {
            case 0:
                int i2 = i48Var.f43519b;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    if (i2 != 0) {
                        tj3Var.m22111b0(-147803568);
                        strM23620a0 = vz1.m23620a0(tj3Var, i2);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-147730966);
                        tj3Var.m22139q(false);
                    }
                    String str = strM23620a0;
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(str, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55879w, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71408l, tj3Var, 0, 0, 131066);
                }
                break;
            default:
                int i3 = i48Var.f43518a;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    if (i3 != 0) {
                        tj3Var2.m22111b0(-888291723);
                        strM23620a0 = vz1.m23620a0(tj3Var2, i3);
                        tj3Var2.m22139q(false);
                    } else {
                        tj3Var2.m22111b0(-888216238);
                        tj3Var2.m22139q(false);
                    }
                    String str2 = strM23620a0;
                    vh9 vh9Var2 = ps5.f56764b;
                    lw9.m16554b(str2, null, ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55879w, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var2)).f51800b.f71408l, tj3Var2, 0, 0, 131066);
                }
                break;
        }
        return xfaVar;
    }
}
