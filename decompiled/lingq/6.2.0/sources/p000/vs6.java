package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.onboarding.R$drawable;
import com.lingq.feature.onboarding.R$string;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vs6 implements aj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65858a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ fe9 f65859b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Context f65860c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xs6 f65861d;

    public /* synthetic */ vs6(fe9 fe9Var, Context context, xs6 xs6Var, int i) {
        this.f65858a = i;
        this.f65859b = fe9Var;
        this.f65860c = context;
        this.f65861d = xs6Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.f65858a;
        xfa xfaVar = xfa.f68157a;
        b16 b16Var = b16.f7762a;
        xs6 xs6Var = this.f65861d;
        Context context = this.f65860c;
        fe9 fe9Var = this.f65859b;
        int i2 = 0;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ft4) obj).getClass();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    tj3Var.m22102U();
                } else {
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, fe9Var.f38952a, 0.0f, 0.0f, 13);
                    sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(fe9Var.f38957f, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
                    int iHashCode = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m = tj3Var.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    zi3 zi3Var = C0352b.f4303f;
                    oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
                    zi3 zi3Var2 = C0352b.f4302e;
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    zi3 zi3Var3 = C0352b.f4304g;
                    oha.m18001g(tj3Var, zi3Var3, numValueOf);
                    vi3 vi3Var = C0352b.f4305h;
                    oha.m18000f(tj3Var, vi3Var);
                    zi3 zi3Var4 = C0352b.f4301d;
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
                    e16 e16VarM4422o = c99.m4422o(b16Var, 40.0f);
                    String strM23620a0 = vz1.m23620a0(tj3Var, R$string.onboarding_v2_skill_vocabulary);
                    gc0 gc0Var = nj0.f52812g;
                    y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_signup_earphones, tj3Var, 0);
                    vh9 vh9Var = ps5.f56764b;
                    bq1.m4042R(y27VarM18236U, strM23620a0, e16VarM4422o, gc0Var, null, 0.0f, new qd0(5, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55852f), tj3Var, 3080, 48);
                    as4 as4Var = new as4(1.0f, true);
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(fe9Var.f38952a, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, as4Var);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                    lw9.m16554b(vz1.m23620a0(tj3Var, R$string.welcome_become_fluent_listener), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 0, 0, 131070);
                    lw9.m16554b(vz1.m23618Z(R$string.welcome_listen_until_following, new Object[]{AbstractC3352my.m17093L(context, xs6Var.f68650a)}, tj3Var), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 0, 0, 131070);
                    tj3Var.m22139q(true);
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
                    e16 e16VarM21611X2 = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, fe9Var.f38952a, 0.0f, 0.0f, 13);
                    sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(fe9Var.f38957f, true, new gm5(28)), nj0.f52789H, tj3Var2, 48);
                    int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m3 = tj3Var2.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X2);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    zi3 zi3Var5 = C0352b.f4303f;
                    oha.m18001g(tj3Var2, zi3Var5, sj8VarM20003a2);
                    zi3 zi3Var6 = C0352b.f4302e;
                    oha.m18001g(tj3Var2, zi3Var6, l77VarM22132m3);
                    Integer numValueOf2 = Integer.valueOf(iHashCode3);
                    zi3 zi3Var7 = C0352b.f4304g;
                    oha.m18001g(tj3Var2, zi3Var7, numValueOf2);
                    vi3 vi3Var2 = C0352b.f4305h;
                    oha.m18000f(tj3Var2, vi3Var2);
                    zi3 zi3Var8 = C0352b.f4301d;
                    oha.m18001g(tj3Var2, zi3Var8, e16VarM1322c3);
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_signup_flame, tj3Var2, 0), vz1.m23620a0(tj3Var2, R$string.onboarding_v2_skill_vocabulary), c99.m4422o(b16Var, 40.0f), nj0.f52812g, null, 0.0f, new qd0(5, ((bx2) tj3Var2.m22128k(cx2.f34676a)).m4215h()), tj3Var2, 3080, 48);
                    as4 as4Var2 = new as4(1.0f, true);
                    bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(fe9Var.f38952a, true, new gm5(28)), nj0.f52791J, tj3Var2, 0);
                    int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m4 = tj3Var2.m22132m();
                    e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, as4Var2);
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var2);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, zi3Var5, bb1VarM230a2);
                    oha.m18001g(tj3Var2, zi3Var6, l77VarM22132m4);
                    AbstractC3393o1.m17747v(iHashCode4, tj3Var2, zi3Var7, tj3Var2, vi3Var2);
                    oha.m18001g(tj3Var2, zi3Var8, e16VarM1322c4);
                    String strM23618Z = vz1.m23618Z(R$string.welcome_make_language_habit, new Object[]{AbstractC3352my.m17093L(context, xs6Var.f68650a)}, tj3Var2);
                    vh9 vh9Var2 = ps5.f56764b;
                    lw9.m16554b(strM23618Z, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var2)).f51800b.f71404h, tj3Var2, 0, 0, 131070);
                    lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.welcome_goals_challenges_reminders), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var2)).f51800b.f71406j, tj3Var2, 0, 0, 131070);
                    tj3Var2.m22139q(true);
                    tj3Var2.m22139q(true);
                }
                break;
            default:
                t17 t17Var = (t17) obj;
                ye1 ye1Var3 = (ye1) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t17Var.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((tj3) ye1Var3).m22120g(t17Var) ? 4 : 2;
                }
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    tj3Var3.m22102U();
                } else {
                    e16 e16VarM21606S = AbstractC3584sr.m21606S(l70.m15962y(b16Var), t17Var);
                    ec0 ec0Var = nj0.f52792K;
                    C3661uu c3661uu = new C3661uu(fe9Var.f38963l, true, new gm5(28));
                    float f = fe9Var.f38960i;
                    x17 x17Var = new x17(f, f, f, f);
                    boolean zM22124i = tj3Var3.m22124i(fe9Var) | tj3Var3.m22124i(context) | tj3Var3.m22120g(xs6Var);
                    Object objM22097O = tj3Var3.m22097O();
                    if (zM22124i || objM22097O == we1.f66679a) {
                        objM22097O = new ws6(fe9Var, context, xs6Var, i2);
                        tj3Var3.m22131l0(objM22097O);
                    }
                    fa4.m11642c(e16VarM21606S, null, x17Var, c3661uu, ec0Var, null, false, null, (vi3) objM22097O, tj3Var3, 196608, 458);
                }
                break;
        }
        return xfaVar;
    }
}
