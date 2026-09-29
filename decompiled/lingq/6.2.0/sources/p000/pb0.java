package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class pb0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55910a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f55911b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0282a f55912c;

    public /* synthetic */ pb0(String str, C0282a c0282a) {
        this.f55911b = str;
        this.f55912c = c0282a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f55910a;
        xfa xfaVar = xfa.f68157a;
        C0282a c0282a = this.f55912c;
        String str = this.f55911b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    boolean zM22120g = tj3Var.m22120g(str);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22120g || objM22097O == we1.f66679a) {
                        objM22097O = new t70(str, 2);
                        tj3Var.m22131l0(objM22097O);
                    }
                    e16 e16VarM17643c = nv8.m17643c(b16.f7762a, false, (vi3) objM22097O);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM17643c);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    wq1.m24128x(0, c0282a, tj3Var, true);
                }
                break;
            default:
                num.getClass();
                snb.m21495b(str, c0282a, ye1Var, pk9.m19383z(49));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ pb0(String str, C0282a c0282a, int i) {
        this.f55911b = str;
        this.f55912c = c0282a;
    }
}
