package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ht1 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42912a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ it1 f42913b;

    public /* synthetic */ ht1(it1 it1Var, int i) {
        this.f42912a = i;
        this.f42913b = it1Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f42912a;
        xfa xfaVar = xfa.f68157a;
        it1 it1Var = this.f42913b;
        switch (i) {
            case 0:
                t17 t17Var = (t17) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    tj3Var.m22102U();
                } else {
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4411d(b16Var, 1.0f), t17Var);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52809d, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21606S);
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
                    e16 e16VarM18559e = ox1.m18559e(c99.m4410c(b16Var, 1.0f));
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM18559e, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 2);
                    C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38957f, true, new gm5(28));
                    boolean zM22124i = tj3Var.m22124i(it1Var);
                    Object objM22097O = tj3Var.m22097O();
                    if (zM22124i || objM22097O == we1.f66679a) {
                        objM22097O = new C3741x(it1Var, 13);
                        tj3Var.m22131l0(objM22097O);
                    }
                    fa4.m11642c(e16VarM21609V, null, null, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 494);
                    tj3Var.m22139q(true);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    u9d.m22638b(it1Var.f44520b, tj3Var2, 0);
                }
                break;
            case 2:
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var3.m22102U();
                } else {
                    u9d.m22642f(it1Var, null, tj3Var3, 0);
                }
                break;
            default:
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    tj3Var4.m22102U();
                } else {
                    u9d.m22637a(0, tj3Var4, null, it1Var.f44525g);
                }
                break;
        }
        return xfaVar;
    }
}
