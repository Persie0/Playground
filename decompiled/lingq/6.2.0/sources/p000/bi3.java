package p000;

import com.lingq.core.premium.AbstractC1839a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class bi3 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8558a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ li3 f8559b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f8560c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f8561d;

    public /* synthetic */ bi3(li3 li3Var, vi3 vi3Var, vi3 vi3Var2, int i) {
        this.f8558a = 2;
        this.f8559b = li3Var;
        this.f8560c = vi3Var;
        this.f8561d = vi3Var2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f8558a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f8561d;
        vi3 vi3Var2 = this.f8560c;
        li3 li3Var = this.f8559b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    AbstractC1839a.m8531i(li3Var, vi3Var2, vi3Var, tj3Var, 0);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    r46.m20381f(null, null, null, null, ci8.m4703P(-1982512779, new ai3(li3Var, vi3Var2, vi3Var), tj3Var2), tj3Var2, 24576, 15);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC1839a.m8531i(li3Var, vi3Var2, vi3Var, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ bi3(li3 li3Var, vi3 vi3Var, vi3 vi3Var2, int i, byte b) {
        this.f8558a = i;
        this.f8559b = li3Var;
        this.f8560c = vi3Var;
        this.f8561d = vi3Var2;
    }
}
