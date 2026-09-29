package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.p012ui.R$string;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class st0 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61376a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f61377b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f61378c;

    public /* synthetic */ st0(Context context, String str) {
        this.f61378c = context;
        this.f61377b = str;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f61376a;
        xfa xfaVar = xfa.f68157a;
        Context context = this.f61378c;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((db1) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    b16 b16Var = b16.f7762a;
                    e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38956e, ge9.m12515a(tj3Var).f38957f);
                    sj8 sj8VarM20003a = qj8.m20003a(eh0.f37240f, nj0.f52789H, tj3Var, 54);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
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
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 0.0f, 11);
                    ge9.m12515a(tj3Var).getClass();
                    do7.m10527c(c99.m4422o(e16VarM21611X, 48.0f), 0L, 0.0f, 0.0f, tj3Var, 0, 14);
                    lw9.m16554b(vz1.m23618Z(R$string.deep_link_language_switching, new Object[]{AbstractC3352my.m17093L(context, this.f61377b)}, tj3Var), c99.m4430w(b16Var, null, 3), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, new ks9(5), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 48, 0, 130040);
                    tj3Var.m22139q(true);
                }
                break;
            default:
                db1 db1Var = (db1) obj;
                ye1 ye1Var2 = (ye1) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                db1Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((tj3) ye1Var2).m22120g(db1Var) ? 4 : 2;
                }
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(1 & iIntValue2, (iIntValue2 & 19) != 18)) {
                    tj3Var2.m22102U();
                } else {
                    float f = ge9.m12515a(tj3Var2).f38952a;
                    float f2 = ge9.m12515a(tj3Var2).f38952a;
                    b16 b16Var2 = b16.f7762a;
                    e16 e16VarM4429v = c99.m4429v(c99.m4431x(AbstractC3584sr.m21611X(b16Var2, 0.0f, f, 0.0f, f2, 5)));
                    ec0 ec0Var = nj0.f52792K;
                    lw9.m16554b(this.f61377b, db1Var.m10265a(e16VarM4429v, ec0Var), 0L, null, d32.m10018P(36), null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, null, tj3Var2, 24576, 0, 261100);
                    e16 e16VarM10265a = db1Var.m10265a(c99.m4429v(c99.m4431x(AbstractC3584sr.m21610W(b16Var2, ge9.m12515a(tj3Var2).f38958g, ge9.m12515a(tj3Var2).f38957f, ge9.m12515a(tj3Var2).f38958g, ge9.m12515a(tj3Var2).f38957f))), ec0Var);
                    String string = context.getString(com.lingq.feature.review.R$string.activities_correct);
                    string.getClass();
                    lw9.m16554b(string, e16VarM10265a, cx2.m9917a(tj3Var2).m4212e(), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var2).f71403g, tj3Var2, 0, 0, 130040);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ st0(String str, Context context) {
        this.f61377b = str;
        this.f61378c = context;
    }
}
