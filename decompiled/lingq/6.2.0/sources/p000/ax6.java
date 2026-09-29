package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.FeedTopic;
import com.lingq.feature.onboarding.R$string;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ax6 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7642a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fe9 f7643b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w7a f7644c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ vi3 f7645d;

    public /* synthetic */ ax6(fe9 fe9Var, w7a w7aVar, vi3 vi3Var, int i) {
        this.f7642a = i;
        this.f7643b = fe9Var;
        this.f7644c = w7aVar;
        this.f7645d = vi3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j;
        long j2;
        int i = this.f7642a;
        float f = 0.0f;
        int i2 = 2;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f7645d;
        w7a w7aVar = this.f7644c;
        fe9 fe9Var = this.f7643b;
        boolean z = true;
        switch (i) {
            case 0:
                t17 t17Var = (t17) obj;
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((tj3) ye1Var).m22120g(t17Var) ? 4 : 2;
                }
                int i3 = 1;
                tj3 tj3Var = (tj3) ye1Var;
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    AbstractC3423or.m18244b(bna.m3912B0(AbstractC3584sr.m21609V(AbstractC3584sr.m21606S(l70.m15962y(b16.f7762a), t17Var), fe9Var.f38960i, 0.0f, 2), bna.m3972r0(tj3Var), true, 12), new C3661uu(16.0f, true, new gm5(28)), new C3661uu(fe9Var.f38964m, true, new gm5(28)), null, 2, 0, ci8.m4703P(-741321464, new ax6(fe9Var, w7aVar, vi3Var, i3), tj3Var), tj3Var, 1597440, 40);
                } else {
                    tj3Var.m22102U();
                }
                break;
            default:
                g93 g93Var = (g93) obj;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                g93Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((tj3) ye1Var2).m22120g(g93Var) ? 4 : 2;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    String strM23620a0 = vz1.m23620a0(tj3Var2, R$string.feed_topics_please_choose_at_least);
                    float f2 = fe9Var.f38952a;
                    b16 b16Var = b16.f7762a;
                    float f3 = f2;
                    float f4 = 1.0f;
                    lw9.m16554b(strM23620a0, c99.m4412e(AbstractC3584sr.m21611X(b16Var, 0.0f, f2, 0.0f, 0.0f, 13), 1.0f), 0L, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, null, tj3Var2, 0, 0, 261116);
                    tj3 tj3Var3 = tj3Var2;
                    List<m7a> list = w7aVar.f66492a;
                    ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
                    for (m7a m7aVar : list) {
                        e16 e16VarM19045o = pb1.m19045o(c99.m4416i(g93Var.mo12420a(0.5f, b16Var, z), 48.0f, f, i2), p58.m18901i(tj3Var3).f64857c);
                        boolean z2 = m7aVar.f50737b;
                        FeedTopic feedTopic = m7aVar.f50736a;
                        if (z2) {
                            tj3Var3.m22111b0(1971333163);
                            j = p58.m18900f(tj3Var3).f55823H;
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(1971451955);
                            j = p58.m18900f(tj3Var3).f55821F;
                            tj3Var3.m22139q(false);
                        }
                        e16 e16VarM10007D = d32.m10007D(e16VarM19045o, j, p58.m18901i(tj3Var3).f64857c);
                        boolean z3 = m7aVar.f50737b;
                        float f5 = z3 ? f4 : 0.0f;
                        if (z3) {
                            tj3Var3.m22111b0(-1321866068);
                            j2 = p58.m18900f(tj3Var3).f55842a;
                        } else {
                            tj3Var3.m22111b0(-1321864808);
                            j2 = p58.m18900f(tj3Var3).f55824I;
                        }
                        tj3Var3.m22139q(false);
                        e16 e16VarM20387m = r46.m20387m(e16VarM10007D, f5, j2, p58.m18901i(tj3Var3).f64857c);
                        boolean zM22120g = tj3Var3.m22120g(vi3Var) | tj3Var3.m22120g(m7aVar);
                        Object objM22097O = tj3Var3.m22097O();
                        if (zM22120g || objM22097O == we1.f66679a) {
                            objM22097O = new a45(13, vi3Var, m7aVar);
                            tj3Var3.m22131l0(objM22097O);
                        }
                        float f6 = f3;
                        e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM20387m, 15), fe9Var.f38960i, f6);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var3, 48);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                        ArrayList arrayList2 = arrayList;
                        tj3 tj3Var4 = tj3Var3;
                        bq1.m4042R(AbstractC3423or.m18236U(jfa.m14421d(feedTopic), tj3Var3, 0), null, c99.m4422o(b16Var, 32.0f), nj0.f52812g, hl1.f42570g, 0.0f, null, tj3Var4, 27704, 96);
                        thb.m22044c(tj3Var4, c99.m4414g(b16Var, f6));
                        lw9.m16554b(vz1.m23620a0(tj3Var4, fbd.m11760j(feedTopic)), c99.m4412e(b16Var, 1.0f), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 2, false, 1, 0, null, p58.m18902j(tj3Var4).f71406j, tj3Var4, 48, 24960, 109564);
                        tj3Var3 = tj3Var4;
                        tj3Var3.m22139q(true);
                        xfaVar = xfaVar;
                        arrayList2.add(xfaVar);
                        arrayList = arrayList2;
                        f4 = 1.0f;
                        f3 = f6;
                        f = 0.0f;
                        i2 = 2;
                        z = true;
                    }
                } else {
                    tj3Var2.m22102U();
                }
                break;
        }
        return xfaVar;
    }
}
