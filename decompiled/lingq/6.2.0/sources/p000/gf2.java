package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.language.DictionaryData;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gf2 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40697a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f40698b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ DictionaryData f40699c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f40700d;

    public /* synthetic */ gf2(DictionaryData dictionaryData, boolean z, Context context) {
        this.f40699c = dictionaryData;
        this.f40698b = z;
        this.f40700d = context;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = this.f40697a;
        xfa xfaVar = xfa.f68157a;
        p84 p84Var = we1.f66679a;
        Context context = this.f40700d;
        DictionaryData dictionaryData = this.f40699c;
        boolean z3 = this.f40698b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    zf1 zf1Var = ge9.f40637a;
                    float f = ((fe9) tj3Var.m22128k(zf1Var)).f38952a;
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(b16Var, f);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21607T);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
                    oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var, C0352b.f4305h);
                    oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
                    String strM8022a = dictionaryData.m8022a();
                    String str = dictionaryData.f19014g;
                    lw9.m16554b(strM8022a, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71410n, tj3Var, 0, 24960, 110590);
                    if (z3) {
                        tj3Var.m22111b0(-2078414496);
                        boolean zM22120g = tj3Var.m22120g(str);
                        Object objM22097O = tj3Var.m22097O();
                        if (zM22120g || objM22097O == p84Var) {
                            objM22097O = Integer.valueOf(AbstractC3423or.m18282v(context, str));
                            tj3Var.m22131l0(objM22097O);
                        }
                        int iIntValue2 = ((Number) objM22097O).intValue();
                        if (iIntValue2 != 0) {
                            tj3Var.m22111b0(-2078284234);
                            bq1.m4042R(AbstractC3423or.m18236U(iIntValue2, tj3Var, 0), dictionaryData.f19014g, c99.m4422o(AbstractC3584sr.m21611X(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38955d, 0.0f, 0.0f, 0.0f, 14), 16.0f), null, null, 0.0f, null, tj3Var, 8, 120);
                            z = false;
                            tj3Var.m22139q(false);
                        } else {
                            z = false;
                            tj3Var.m22111b0(-2077944040);
                            tj3Var.m22139q(false);
                        }
                        tj3Var.m22139q(z);
                    } else {
                        tj3Var.m22111b0(-2077930152);
                        tj3Var.m22139q(false);
                    }
                    tj3Var.m22139q(true);
                }
                break;
            default:
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    tj3Var2.m22102U();
                } else {
                    zf1 zf1Var2 = ge9.f40637a;
                    float f2 = ((fe9) tj3Var2.m22128k(zf1Var2)).f38952a;
                    b16 b16Var2 = b16.f7762a;
                    e16 e16VarM21607T2 = AbstractC3584sr.m21607T(b16Var2, f2);
                    sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var2)).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var2, 48);
                    int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m2 = tj3Var2.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM21607T2);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a2);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c2);
                    if (z3) {
                        tj3Var2.m22111b0(-775453391);
                        boolean zM22120g2 = tj3Var2.m22120g(dictionaryData.f19014g);
                        Object objM22097O2 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O2 == p84Var) {
                            objM22097O2 = Integer.valueOf(AbstractC3423or.m18282v(context, dictionaryData.f19014g));
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        int iIntValue4 = ((Number) objM22097O2).intValue();
                        if (iIntValue4 != 0) {
                            tj3Var2.m22111b0(-775302545);
                            y27 y27VarM18236U = AbstractC3423or.m18236U(iIntValue4, tj3Var2, 0);
                            String str2 = dictionaryData.f19014g;
                            e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var2, ((fe9) tj3Var2.m22128k(zf1Var2)).f38955d, 0.0f, 0.0f, 0.0f, 14);
                            ((fe9) tj3Var2.m22128k(zf1Var2)).getClass();
                            bq1.m4042R(y27VarM18236U, str2, pb1.m19045o(c99.m4422o(e16VarM21611X, 16.0f), ui8.f63972a), null, hl1.f42570g, 0.0f, null, tj3Var2, 24584, 104);
                            z2 = false;
                            tj3Var2.m22139q(false);
                        } else {
                            z2 = false;
                            tj3Var2.m22111b0(-774851278);
                            tj3Var2.m22139q(false);
                        }
                        tj3Var2.m22139q(z2);
                    } else {
                        tj3Var2.m22111b0(-774837390);
                        tj3Var2.m22139q(false);
                    }
                    lw9.m16554b(dictionaryData.m8022a(), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71410n, tj3Var2, 0, 24960, 110590);
                    tj3Var2.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ gf2(boolean z, DictionaryData dictionaryData, Context context) {
        this.f40698b = z;
        this.f40699c = dictionaryData;
        this.f40700d = context;
    }
}
