package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zn0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71789a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0282a f71790b;

    public /* synthetic */ zn0(C0282a c0282a, int i) {
        this.f71789a = i;
        this.f71790b = c0282a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f71789a;
        xfa xfaVar = xfa.f68157a;
        C0282a c0282a = this.f71790b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16.f7762a);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    c0282a.invoke(db1.f35347a, tj3Var, 6);
                    tj3Var.m22139q(true);
                }
                break;
            case 1:
                int iIntValue2 = num.intValue();
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    c0282a.invoke(g93.f40419a, tj3Var2, 6);
                }
                break;
            case 2:
                int iIntValue3 = num.intValue();
                tj3 tj3Var3 = (tj3) ye1Var;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    fy9.m12246a(false, null, ci8.m4703P(1936166145, new zn0(c0282a, 3), tj3Var3), tj3Var3, 384);
                }
                break;
            case 3:
                int iIntValue4 = num.intValue();
                tj3 tj3Var4 = (tj3) ye1Var;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    tj3Var4.m22102U();
                } else {
                    c0282a.invoke(tj3Var4, 0);
                }
                break;
            case 4:
                num.getClass();
                pvc.m19509e(c0282a, ye1Var, pk9.m19383z(7));
                break;
            default:
                num.getClass();
                ei7.m11160a(c0282a, ye1Var, pk9.m19383z(7));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ zn0(C0282a c0282a, int i, int i2) {
        this.f71789a = i2;
        this.f71790b = c0282a;
    }
}
