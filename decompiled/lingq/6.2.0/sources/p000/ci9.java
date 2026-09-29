package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ci9 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10134a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ hi9 f10135b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ LocalDate f10136c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f10137d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ui3 f10138e;

    public /* synthetic */ ci9(hi9 hi9Var, LocalDate localDate, ui3 ui3Var, ui3 ui3Var2, int i) {
        this.f10134a = i;
        this.f10135b = hi9Var;
        this.f10136c = localDate;
        this.f10137d = ui3Var;
        this.f10138e = ui3Var2;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list;
        int i = this.f10134a;
        xfa xfaVar = xfa.f68157a;
        b16 b16Var = b16.f7762a;
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
                if (tj3Var.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
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
                    e16 e16VarM4428u = c99.m4428u(b16Var, 0.0f, 600.0f, 1);
                    zf1 zf1Var = ge9.f40637a;
                    r46.m20381f(AbstractC3584sr.m21610W(e16VarM4428u, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, t17Var.mo14021d(), ((fe9) tj3Var.m22128k(zf1Var)).f38960i, t17Var.mo14018a()), null, null, null, ci8.m4703P(443497721, new ci9(this.f10135b, this.f10136c, this.f10137d, this.f10138e, 1), tj3Var), tj3Var, 24576, 14);
                    tj3Var.m22139q(true);
                } else {
                    tj3Var.m22102U();
                }
                return xfaVar;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    tj3Var2.m22102U();
                    return xfaVar;
                }
                zf1 zf1Var2 = ge9.f40637a;
                e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, ((fe9) tj3Var2.m22128k(zf1Var2)).f38952a);
                bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var2)).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
                int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m2 = tj3Var2.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM21607T);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var2);
                } else {
                    tj3Var2.m22137o0();
                }
                zi3 zi3Var = C0352b.f4303f;
                oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
                zi3 zi3Var2 = C0352b.f4302e;
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                vi3 vi3Var = C0352b.f4305h;
                oha.m18000f(tj3Var2, vi3Var);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var2, 48);
                int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m3 = tj3Var2.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e2);
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var2);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var3, tj3Var2, vi3Var);
                oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c3);
                omd.m18141c(this.f10137d, null, false, null, null, zoc.f71925c, tj3Var2, 1572864, 62);
                as4 as4Var = new as4(1.0f, true);
                LocalDate localDate = this.f10136c;
                String strM24813k = y02.m24813k("MMMM yyyy", localDate);
                vh9 vh9Var = ps5.f56764b;
                lw9.m16554b(strM24813k, as4Var, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, bc3.f8324j, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71401e, tj3Var2, 1572864, 0, 129976);
                omd.m18141c(this.f10138e, null, localDate.compareTo((ChronoLocalDate) LocalDate.now()) < 0, null, null, zoc.f71926d, tj3Var2, 1572864, 58);
                tj3Var2.m22139q(true);
                hi9 hi9Var = this.f10135b;
                if (hi9Var instanceof ei9) {
                    tj3Var2.m22111b0(-4177389);
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var2.m22111b0(-4681635);
                    boolean z = hi9Var instanceof fi9;
                    if (z) {
                        list = ((fi9) hi9Var).f39152a;
                    } else if (hi9Var instanceof gi9) {
                        list = ((gi9) hi9Var).f40856a;
                    } else {
                        if (!fa4.m11650l(hi9Var, ei9.f37299a)) {
                            gm5.m12750e();
                            return null;
                        }
                        list = EmptyList.f47638a;
                    }
                    h4d.m13052a(null, list, localDate, z, tj3Var2, 0);
                    tj3Var2.m22139q(false);
                }
                tj3Var2.m22139q(true);
                return xfaVar;
        }
    }
}
