package p000;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.InterfaceC0067f;
import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class en0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f37541a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f37542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f37543c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xi3 f37544d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f37545e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f37546f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f37547g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f37548h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f37549i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f37550j;

    public /* synthetic */ en0(e37 e37Var, e16 e16Var, boolean z, qx8 qx8Var, nz9 nz9Var, wz7 wz7Var, vs3 vs3Var, vi3 vi3Var, String str) {
        this.f37545e = e37Var;
        this.f37546f = e16Var;
        this.f37543c = z;
        this.f37547g = qx8Var;
        this.f37542b = nz9Var;
        this.f37548h = wz7Var;
        this.f37549i = vs3Var;
        this.f37544d = vi3Var;
        this.f37550j = str;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f37541a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f37550j;
        xi3 xi3Var = this.f37544d;
        Object obj4 = this.f37549i;
        Object obj5 = this.f37548h;
        Object obj6 = this.f37542b;
        Object obj7 = this.f37547g;
        Object obj8 = this.f37546f;
        Object obj9 = this.f37545e;
        switch (i) {
            case 0:
                final e37 e37Var = (e37) obj9;
                e16 e16Var = (e16) obj8;
                final qx8 qx8Var = (qx8) obj7;
                final nz9 nz9Var = (nz9) obj6;
                final wz7 wz7Var = (wz7) obj5;
                final vs3 vs3Var = (vs3) obj4;
                final vi3 vi3Var = (vi3) xi3Var;
                final String str = (String) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    boolean z = e37Var != null;
                    vs2 vs2VarM772g = AbstractC0070i.m772g(null, 0.0f, 3);
                    qv2 qv2VarM773h = AbstractC0070i.m773h(null, 3);
                    final boolean z2 = this.f37543c;
                    AbstractC0054a.m729d(z, e16Var, vs2VarM772g, qv2VarM773h, null, ci8.m4703P(-212620439, new aj3() { // from class: gn0
                        @Override // p000.aj3
                        public final Object invoke(Object obj10, Object obj11, Object obj12) {
                            boolean z3;
                            ye1 ye1Var2 = (ye1) obj11;
                            ((Integer) obj12).getClass();
                            ((InterfaceC0067f) obj10).getClass();
                            e37 e37Var2 = e37Var;
                            if (e37Var2 == null) {
                                tj3 tj3Var2 = (tj3) ye1Var2;
                                tj3Var2.m22111b0(901517645);
                                tj3Var2.m22139q(false);
                            } else {
                                tj3 tj3Var3 = (tj3) ye1Var2;
                                tj3Var3.m22111b0(901517646);
                                b16 b16Var = b16.f7762a;
                                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                                ui0 ui0Var = vi0.Companion;
                                aa1 aa1Var = new aa1(aa1.f411j);
                                long j = aa1.f403b;
                                e16 e16VarM21609V = AbstractC3584sr.m21609V(d32.m10006C(e16VarM4412e, ui0.m22749e(ui0Var, vz1.m23605K(aa1Var, new aa1(aa1.m198b(0.75f, j))), 0.0f, 0.0f, 14)), ge9.m12515a(tj3Var3).f38962k, 0.0f, 2);
                                boolean z4 = z2;
                                qx8 qx8Var2 = qx8Var;
                                e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM21609V, 0.0f, 20.0f, 0.0f, (z4 || (qx8Var2 != null && qx8Var2.f58341b)) ? 20.0f : 48.0f, 5);
                                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var3, 48);
                                int iHashCode = Long.hashCode(tj3Var3.f62385T);
                                l77 l77VarM22132m = tj3Var3.m22132m();
                                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21611X);
                                se1.f60731q.getClass();
                                ui3 ui3Var = C0352b.f4299b;
                                tj3Var3.m22119f0();
                                if (tj3Var3.f62384S) {
                                    tj3Var3.m22130l(ui3Var);
                                } else {
                                    tj3Var3.m22137o0();
                                }
                                zi3 zi3Var = C0352b.f4303f;
                                oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                                zi3 zi3Var2 = C0352b.f4302e;
                                oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
                                Integer numValueOf = Integer.valueOf(iHashCode);
                                zi3 zi3Var3 = C0352b.f4304g;
                                oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                                vi3 vi3Var2 = C0352b.f4305h;
                                oha.m18000f(tj3Var3, vi3Var2);
                                zi3 zi3Var4 = C0352b.f4301d;
                                oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
                                e16 e16VarM19045o = pb1.m19045o(b16Var, ui8.m22753b(ge9.m12515a(tj3Var3).f38955d));
                                long jM198b = aa1.m198b(0.8f, j);
                                mv3 mv3Var = ss5.f61356d;
                                pk9.m19366a(AbstractC3584sr.m21608U(d32.m10007D(e16VarM19045o, jM198b, mv3Var), ge9.m12515a(tj3Var3).f38956e, ge9.m12515a(tj3Var3).f38952a), null, ci8.m4703P(-971321814, new hn0(e37Var2, nz9Var, wz7Var, vs3Var, vi3Var, 0), tj3Var3), tj3Var3, 3072);
                                if (z4 || (qx8Var2 != null && qx8Var2.f58341b)) {
                                    tj3Var3.m22111b0(-616639080);
                                    z3 = true;
                                    e16 e16VarM21608U = AbstractC3584sr.m21608U(d32.m10007D(pb1.m19045o(AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var3).f38952a, 0.0f, 0.0f, 13), ui8.m22753b(ge9.m12515a(tj3Var3).f38955d)), aa1.m198b(0.8f, j), mv3Var), ge9.m12515a(tj3Var3).f38956e, 6.0f);
                                    ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                                    int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                                    l77 l77VarM22132m2 = tj3Var3.m22132m();
                                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U);
                                    tj3Var3.m22119f0();
                                    if (tj3Var3.f62384S) {
                                        tj3Var3.m22130l(ui3Var);
                                    } else {
                                        tj3Var3.m22137o0();
                                    }
                                    oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d);
                                    oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                                    AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var2);
                                    oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                                    if (qx8Var2 == null || !qx8Var2.f58341b) {
                                        tj3Var3.m22111b0(-1357123800);
                                        String str2 = str;
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        lw9.m16554b(str2, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var3).f71407k, aa1.m198b(0.95f, aa1.f406e), 0L, null, null, null, 0L, null, null, 0, 0L, null, 16744446), tj3Var3, 0, 0, 131070);
                                        tj3Var3 = tj3Var3;
                                        tj3Var3.m22139q(false);
                                    } else {
                                        tj3Var3.m22111b0(-1357404846);
                                        dn7.m10492a(c99.m4422o(b16Var, 16.0f), aa1.f406e, 2.0f, 0L, 0, 0.0f, tj3Var3, 438, 56);
                                        tj3Var3.m22139q(false);
                                    }
                                    tj3Var3.m22139q(z3);
                                    tj3Var3.m22139q(false);
                                } else {
                                    tj3Var3.m22111b0(-615368638);
                                    tj3Var3.m22139q(false);
                                    z3 = true;
                                }
                                tj3Var3.m22139q(z3);
                                tj3Var3.m22139q(false);
                            }
                            return xfa.f68157a;
                        }
                    }, tj3Var), tj3Var, 200064, 16);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                n2d.m17194c((ey7) obj9, (nz9) obj6, (bx7) obj8, (hx8) obj7, (List) obj5, this.f37543c, (f00) obj4, (AudioUnderlineMode) obj3, (vi3) xi3Var, (ye1) obj, pk9.m19383z(65));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0226d0.m1130a((oq7) obj9, (e16) obj8, this.f37543c, (fa9) obj7, (v56) obj6, (v56) obj5, (aj3) obj4, (aj3) xi3Var, (aj3) obj3, (ye1) obj, pk9.m19383z(9));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ en0(oq7 oq7Var, e16 e16Var, boolean z, fa9 fa9Var, v56 v56Var, v56 v56Var2, aj3 aj3Var, aj3 aj3Var2, aj3 aj3Var3, int i) {
        this.f37545e = oq7Var;
        this.f37546f = e16Var;
        this.f37543c = z;
        this.f37547g = fa9Var;
        this.f37542b = v56Var;
        this.f37548h = v56Var2;
        this.f37549i = aj3Var;
        this.f37544d = aj3Var2;
        this.f37550j = aj3Var3;
    }

    public /* synthetic */ en0(ey7 ey7Var, nz9 nz9Var, bx7 bx7Var, hx8 hx8Var, List list, boolean z, f00 f00Var, AudioUnderlineMode audioUnderlineMode, vi3 vi3Var, int i) {
        this.f37545e = ey7Var;
        this.f37542b = nz9Var;
        this.f37546f = bx7Var;
        this.f37547g = hx8Var;
        this.f37548h = list;
        this.f37543c = z;
        this.f37549i = f00Var;
        this.f37550j = audioUnderlineMode;
        this.f37544d = vi3Var;
    }
}
