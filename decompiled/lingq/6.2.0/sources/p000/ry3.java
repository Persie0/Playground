package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.karaoke.AbstractC2117b;
import com.lingq.feature.reader.stats.p019ui.components.AbstractC2558b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ry3 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0282a f60037b;

    public /* synthetic */ ry3(C0282a c0282a, int i) {
        this.f60036a = i;
        this.f60037b = c0282a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f60036a;
        xfa xfaVar = xfa.f68157a;
        C0282a c0282a = this.f60037b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    int i2 = my3.f52030a;
                    long jM17150c = my3.m17150c();
                    y33 y33Var = c99.f9762a;
                    e16 e16VarM4423p = c99.m4423p(b16.f7762a, bk2.m3806b(jM17150c), bk2.m3805a(jM17150c));
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4423p);
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
            case 1:
                int iIntValue2 = num.intValue();
                tj3 tj3Var2 = (tj3) ye1Var;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    c0282a.invoke(tj3Var2, 0);
                }
                break;
            case 2:
                num.getClass();
                qu1.m20167d(c0282a, ye1Var, pk9.m19383z(7));
                break;
            case 3:
                num.getClass();
                AbstractC2117b.m9028h(c0282a, ye1Var, pk9.m19383z(7));
                break;
            default:
                num.getClass();
                AbstractC2558b.m9468a(c0282a, ye1Var, pk9.m19383z(7));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ry3(C0282a c0282a, int i, int i2) {
        this.f60036a = i2;
        this.f60037b = c0282a;
    }
}
