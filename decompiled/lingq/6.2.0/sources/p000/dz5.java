package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.domain.model.milestones.Milestone;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dz5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36460a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Milestone f36461b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f36462c;

    public /* synthetic */ dz5(Context context, Milestone milestone) {
        this.f36460a = 0;
        this.f36462c = context;
        this.f36461b = milestone;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f36460a;
        xfa xfaVar = xfa.f68157a;
        b16 b16Var = b16.f7762a;
        Context context = this.f36462c;
        Milestone milestone = this.f36461b;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    bq1.m4042R(AbstractC3423or.m18236U(ss5.m21679D(context, ss5.m21676A(milestone)), tj3Var, 0), null, AbstractC3584sr.m21611X(c99.m4422o(b16Var, 48.0f), 0.0f, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38956e, 0.0f, 0.0f, 13), null, null, 0.0f, null, tj3Var, 56, 120);
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                    String strM21685J = ss5.m21685J(context, milestone);
                    vh9 vh9Var = ps5.f56764b;
                    lw9.m16554b(strM21685J, e16VarM4412e, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71406j, tj3Var2, 48, 0, 131064);
                }
                break;
            default:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var3, 48);
                    int iHashCode = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m = tj3Var3.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, b16Var);
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
                    lw9.m16554b(ss5.m21685J(context, milestone), AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38962k, ge9.m12515a(tj3Var3).f38952a), p58.m18900f(tj3Var3).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71404h, tj3Var3, 0, 0, 130040);
                    bq1.m4042R(AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, milestone.f19532a), tj3Var3, 0), null, AbstractC3584sr.m21611X(c99.m4422o(b16Var, 48.0f), 0.0f, ge9.m12515a(tj3Var3).f38956e, 0.0f, 0.0f, 13), null, null, 0.0f, null, tj3Var3, 56, 120);
                    bq1.m4042R(AbstractC3423or.m18236U(ss5.m21679D(context, ss5.m21676A(milestone)), tj3Var3, 0), null, AbstractC3584sr.m21611X(c99.m4422o(b16Var, 108.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var3).f38956e, 7), null, null, 0.0f, null, tj3Var3, 56, 120);
                    tj3Var3.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ dz5(int i, Context context, Milestone milestone) {
        this.f36460a = i;
        this.f36461b = milestone;
        this.f36462c = context;
    }
}
