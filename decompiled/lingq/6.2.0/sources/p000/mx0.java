package p000;

import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class mx0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51987a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0282a f51988b;

    public /* synthetic */ mx0(C0282a c0282a, int i) {
        this.f51987a = i;
        this.f51988b = c0282a;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f51987a;
        b16 b16Var = b16.f7762a;
        xfa xfaVar = xfa.f68157a;
        C0282a c0282a = this.f51988b;
        switch (i) {
            case 0:
                ((Integer) obj3).getClass();
                ((InterfaceC0067f) obj).getClass();
                c0282a.invoke((ye1) obj2, 0);
                break;
            case 1:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM4416i = c99.m4416i(c99.m4412e(b16Var, 1.0f), 200.0f, 0.0f, 2);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4416i);
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
            case 2:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    c0282a.invoke(tj3Var2, 0);
                }
                break;
            case 3:
                db1 db1Var = (db1) obj;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                db1Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((tj3) ye1Var3).m22120g(db1Var) ? 4 : 2;
                }
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    tj3Var3.m22102U();
                } else {
                    c0282a.invoke(db1Var, tj3Var3, Integer.valueOf(iIntValue3 & 14));
                }
                break;
            case 4:
                db1 db1Var2 = (db1) obj;
                ye1 ye1Var4 = (ye1) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                db1Var2.getClass();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((tj3) ye1Var4).m22120g(db1Var2) ? 4 : 2;
                }
                tj3 tj3Var4 = (tj3) ye1Var4;
                if (!tj3Var4.m22099R(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    tj3Var4.m22102U();
                } else {
                    c0282a.invoke(db1Var2, tj3Var4, Integer.valueOf(iIntValue4 & 14));
                }
                break;
            case 5:
                db1 db1Var3 = (db1) obj;
                ye1 ye1Var5 = (ye1) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                db1Var3.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((tj3) ye1Var5).m22120g(db1Var3) ? 4 : 2;
                }
                tj3 tj3Var5 = (tj3) ye1Var5;
                if (!tj3Var5.m22099R(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    tj3Var5.m22102U();
                } else {
                    c0282a.invoke(db1Var3, tj3Var5, Integer.valueOf(iIntValue5 & 14));
                }
                break;
            case 6:
                ye1 ye1Var6 = (ye1) obj2;
                ((Integer) obj3).getClass();
                ((InterfaceC0067f) obj).getClass();
                e16 e16VarM18559e = ox1.m18559e(b16Var);
                WeakHashMap weakHashMap = l6b.f49204w;
                e16 e16VarM23904F = wfb.m23904F(wfb.m23904F(e16VarM18559e, ho5.m13397r(ye1Var6).f49210f), ho5.m13397r(ye1Var6).f49209e);
                zf1 zf1Var = ge9.f40637a;
                tj3 tj3Var6 = (tj3) ye1Var6;
                r46.m20381f(e16VarM23904F, ui8.m22754c(((fe9) tj3Var6.m22128k(zf1Var)).f38956e, ((fe9) tj3Var6.m22128k(zf1Var)).f38956e, 12), te1.m22000n(62, ((fe9) tj3Var6.m22128k(zf1Var)).f38952a), null, ci8.m4703P(353389119, new mx0(c0282a, 7), ye1Var6), ye1Var6, 24576, 8);
                break;
            case 7:
                ye1 ye1Var7 = (ye1) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var7 = (tj3) ye1Var7;
                if (!tj3Var7.m22099R(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    tj3Var7.m22102U();
                } else {
                    c0282a.invoke(tj3Var7, 0);
                }
                break;
            case 8:
                ye1 ye1Var8 = (ye1) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var8 = (tj3) ye1Var8;
                if (!tj3Var8.m22099R(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    tj3Var8.m22102U();
                } else {
                    zf1 zf1Var2 = ge9.f40637a;
                    ((fe9) tj3Var8.m22128k(zf1Var2)).getClass();
                    e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(b16Var, 16.0f, 0.0f, 2), 0.0f, ((fe9) tj3Var8.m22128k(zf1Var2)).f38952a, 1);
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var8.m22128k(zf1Var2)).f38952a, true, new gm5(28)), nj0.f52789H, tj3Var8, 48);
                    int iHashCode2 = Long.hashCode(tj3Var8.f62385T);
                    l77 l77VarM22132m2 = tj3Var8.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var8, e16VarM21609V);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var8.m22119f0();
                    if (tj3Var8.f62384S) {
                        tj3Var8.m22130l(ui3Var2);
                    } else {
                        tj3Var8.m22137o0();
                    }
                    oha.m18001g(tj3Var8, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var8, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var8, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var8, C0352b.f4305h);
                    oha.m18001g(tj3Var8, C0352b.f4301d, e16VarM1322c2);
                    c0282a.invoke(vj8.f65508a, tj3Var8, 6);
                    tj3Var8.m22139q(true);
                }
                break;
            default:
                ye1 ye1Var9 = (ye1) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var9 = (tj3) ye1Var9;
                if (!tj3Var9.m22099R(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    tj3Var9.m22102U();
                } else {
                    c0282a.invoke(tj3Var9, 0);
                }
                break;
        }
        return xfaVar;
    }
}
