package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class os5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54940a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zda f54941b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0282a f54942c;

    public /* synthetic */ os5(zda zdaVar, C0282a c0282a, int i) {
        this.f54940a = i;
        this.f54941b = zdaVar;
        this.f54942c = c0282a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f54940a;
        xfa xfaVar = xfa.f68157a;
        C0282a c0282a = this.f54942c;
        zda zdaVar = this.f54941b;
        int i2 = 1;
        ye1 ye1Var = (ye1) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    ei7.m11160a(ci8.m4703P(-241536773, new os5(zdaVar, c0282a, i2), tj3Var), tj3Var, 6);
                }
                break;
            default:
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    lw9.m16553a(zdaVar.f71406j, c0282a, tj3Var2, 0);
                }
                break;
        }
        return xfaVar;
    }
}
