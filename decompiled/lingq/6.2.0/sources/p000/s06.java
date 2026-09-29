package p000;

import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import p000.l70;
import p000.ss5;
import p000.wfb;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s06 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60133a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f60134b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f60135c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f60136d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f60137e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ xi3 f60138f;

    public /* synthetic */ s06(int i, o72 o72Var, long j, un1 un1Var, vi3 vi3Var) {
        this.f60134b = i;
        this.f60136d = o72Var;
        this.f60135c = j;
        this.f60137e = un1Var;
        this.f60138f = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f60133a;
        xfa xfaVar = xfa.f68157a;
        xi3 xi3Var = this.f60138f;
        Object obj3 = this.f60137e;
        Object obj4 = this.f60136d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                xpb.m24635a((ui3) obj4, this.f60135c, (q06) obj3, (C0282a) xi3Var, (ye1) obj, pk9.m19383z(this.f60134b | 1));
                break;
            default:
                final AbstractC0150d abstractC0150d = (AbstractC0150d) obj4;
                final un1 un1Var = (un1) obj3;
                vi3 vi3Var = (vi3) xi3Var;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    final int i2 = this.f60134b;
                    final long j = this.f60135c;
                    AbstractC0218a.m1121a(ci8.m4703P(503636978, new zi3() { // from class: vw8
                        @Override // p000.zi3
                        public final Object invoke(Object obj5, Object obj6) {
                            final AbstractC0150d abstractC0150d2;
                            ye1 ye1Var2 = (ye1) obj5;
                            int iIntValue2 = ((Integer) obj6).intValue();
                            tj3 tj3Var2 = (tj3) ye1Var2;
                            if (tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                fc0 fc0Var = nj0.f52789H;
                                b16 b16Var = b16.f7762a;
                                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var2, 48);
                                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                                l77 l77VarM22132m = tj3Var2.m22132m();
                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
                                se1.f60731q.getClass();
                                ui3 ui3Var = C0352b.f4299b;
                                tj3Var2.m22119f0();
                                if (tj3Var2.f62384S) {
                                    tj3Var2.m22130l(ui3Var);
                                } else {
                                    tj3Var2.m22137o0();
                                }
                                oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
                                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                                oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                                oha.m18000f(tj3Var2, C0352b.f4305h);
                                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                                final int i3 = i2;
                                AbstractC0150d abstractC0150d3 = abstractC0150d;
                                if (i3 > 1) {
                                    tj3Var2.m22111b0(1605443863);
                                    float fM1042q = abstractC0150d3.m1042q();
                                    h41 h41Var = new h41(0.0f, i3 - 1);
                                    e16 e16VarM4414g = c99.m4414g(new as4(1.0f, true), 6.0f);
                                    la9 la9Var = la9.f49371a;
                                    vh9 vh9Var = ps5.f56764b;
                                    abstractC0150d2 = abstractC0150d3;
                                    fa9 fa9VarM16040g = la9.m16040g(j, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55874r, 0L, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55874r, tj3Var2, 1012);
                                    boolean zM22116e = tj3Var2.m22116e(i3) | tj3Var2.m22120g(abstractC0150d2);
                                    final un1 un1Var2 = un1Var;
                                    boolean zM22124i = zM22116e | tj3Var2.m22124i(un1Var2);
                                    Object objM22097O = tj3Var2.m22097O();
                                    if (zM22124i || objM22097O == we1.f66679a) {
                                        objM22097O = new vi3() { // from class: com.lingq.feature.edit.d
                                            @Override // p000.vi3
                                            public final Object invoke(Object obj7) {
                                                int iM15945h = l70.m15945h(ss5.m21693T(((Float) obj7).floatValue()), 0, i3 - 1);
                                                AbstractC0150d abstractC0150d4 = abstractC0150d2;
                                                if (iM15945h != abstractC0150d4.m1036k()) {
                                                    wfb.m23926u(un1Var2, null, null, new SentenceEditPagerScreenKt$SentenceEditPagerScreen$4$1$1$1$1$1(abstractC0150d4, iM15945h, null), 3);
                                                }
                                                return xfa.f68157a;
                                            }
                                        };
                                        tj3Var2.m22131l0(objM22097O);
                                    }
                                    AbstractC0226d0.m1132c(fM1042q, (vi3) objM22097O, e16VarM4414g, false, h41Var, 0, null, fa9VarM16040g, null, tj3Var2, 0, 360);
                                    tj3Var2 = tj3Var2;
                                    tj3Var2.m22139q(false);
                                } else {
                                    abstractC0150d2 = abstractC0150d3;
                                    tj3Var2.m22111b0(1606543092);
                                    tj3Var2.m22139q(false);
                                }
                                String str = (abstractC0150d2.m1042q() + 1) + " / " + i3;
                                vh9 vh9Var2 = ps5.f56764b;
                                tj3 tj3Var3 = tj3Var2;
                                lw9.m16554b(str, c99.m4428u(AbstractC3584sr.m21611X(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a, 0.0f, 0.0f, 0.0f, 14), 48.0f, 0.0f, 2), ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var2)).f51800b.f71410n, tj3Var3, 0, 0, 131064);
                                tj3Var3.m22139q(true);
                            } else {
                                tj3Var2.m22102U();
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var), null, ci8.m4703P(-1272438096, new ww8(vi3Var, 0), tj3Var), ci8.m4703P(-1301987993, new xw8(vi3Var, 0), tj3Var), 0.0f, null, null, null, null, tj3Var, 3462, 498);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ s06(ui3 ui3Var, long j, q06 q06Var, C0282a c0282a, int i) {
        this.f60136d = ui3Var;
        this.f60135c = j;
        this.f60137e = q06Var;
        this.f60138f = c0282a;
        this.f60134b = i;
    }
}
