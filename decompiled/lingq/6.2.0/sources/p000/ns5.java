package p000;

import androidx.compose.foundation.text.contextmenu.provider.C0175a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53195a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f53196b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f53197c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f53198d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f53199e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0282a f53200f;

    public /* synthetic */ ns5(pa1 pa1Var, q36 q36Var, v49 v49Var, zda zdaVar, C0282a c0282a) {
        this.f53196b = pa1Var;
        this.f53197c = q36Var;
        this.f53198d = v49Var;
        this.f53199e = zdaVar;
        this.f53200f = c0282a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f53195a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f53199e;
        Object obj4 = this.f53198d;
        Object obj5 = this.f53197c;
        Object obj6 = this.f53196b;
        switch (i) {
            case 0:
                pa1 pa1VarM20493f = (pa1) obj6;
                q36 q36Var = (q36) obj5;
                v49 v49Var = (v49) obj4;
                zda zdaVar = (zda) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    if (pa1VarM20493f == null) {
                        vh9 vh9Var = ra1.f58959a;
                        pa1VarM20493f = ra1.m20493f(0L, 0L, 0L, d37.f34915G, 0L, 0L, 0L, 0L, d37.f34922N, 0L, 0L, 0L, d37.f34929U, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, d37.f34936d, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -33558793, 65535);
                    }
                    pa1 pa1Var = pa1VarM20493f;
                    if (q36Var == null) {
                        q36Var = o36.f53770a;
                    }
                    q36 q36Var2 = q36Var;
                    if (v49Var == null) {
                        v49Var = new v49();
                    }
                    v49 v49Var2 = v49Var;
                    if (zdaVar == null) {
                        zdaVar = new zda();
                    }
                    ps5.m19471b(pa1Var, q36Var2, v49Var2, zdaVar, this.f53200f, tj3Var, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                ps5.m19470a((pa1) obj6, (q36) obj5, (v49) obj4, (zda) obj3, this.f53200f, (ye1) obj, pk9.m19383z(3457));
                break;
            default:
                e16 e16Var = (e16) obj6;
                t66 t66Var = (t66) obj5;
                C0175a c0175a = (C0175a) obj4;
                ui3 ui3Var = (ui3) obj3;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    Object objM22097O = tj3Var2.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = new gb0(5, t66Var);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    e16 e16VarM24741N = xwc.m24741N(e16Var, (vi3) objM22097O);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, true);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM24741N);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    this.f53200f.invoke(tj3Var2, 0);
                    c0175a.m1067b(6, tj3Var2, ui3Var);
                    tj3Var2.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ns5(pa1 pa1Var, q36 q36Var, v49 v49Var, zda zdaVar, C0282a c0282a, int i) {
        this.f53196b = pa1Var;
        this.f53197c = q36Var;
        this.f53198d = v49Var;
        this.f53199e = zdaVar;
        this.f53200f = c0282a;
    }

    public /* synthetic */ ns5(e16 e16Var, t66 t66Var, C0282a c0282a, C0175a c0175a, ui3 ui3Var) {
        this.f53196b = e16Var;
        this.f53197c = t66Var;
        this.f53200f = c0282a;
        this.f53198d = c0175a;
        this.f53199e = ui3Var;
    }
}
