package p000;

import android.content.Context;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.core.achievements.AbstractC1234a;
import com.lingq.core.achievements.R$string;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xy1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68953a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Context f68954b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ty1 f68955c;

    public /* synthetic */ xy1(Context context, ty1 ty1Var) {
        this.f68953a = 1;
        this.f68954b = context;
        this.f68955c = ty1Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f68953a;
        xfa xfaVar = xfa.f68157a;
        b16 b16Var = b16.f7762a;
        Context context = this.f68954b;
        ty1 ty1Var = this.f68955c;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    boolean z = ty1Var.f63090d;
                    DailyGoalMet dailyGoalMet = ty1Var.f63087a;
                    if (!z) {
                        tj3Var.m22111b0(-1398952956);
                        AbstractC1234a.m6999b(c99.m4412e(b16Var, 1.0f), dailyGoalMet.f19515b, dailyGoalMet.f19516c, ty1Var.f63088b, tj3Var, 6);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(-1399452459);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        String string = context.getString(R$string.streak_milestone);
                        string.getClass();
                        String str = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(dailyGoalMet.f19520g)}, 1));
                        vh9 vh9Var = ps5.f56764b;
                        lw9.m16554b(str, e16VarM4412e, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 48, 0, 131064);
                        tj3Var.m22139q(false);
                    }
                }
                break;
            case 1:
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    ec0 ec0Var = nj0.f52792K;
                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, ec0Var, tj3Var2, 48);
                    int iHashCode = Long.hashCode(tj3Var2.f62385T);
                    l77 l77VarM22132m = tj3Var2.m22132m();
                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var = C0352b.f4299b;
                    tj3Var2.m22119f0();
                    if (tj3Var2.f62384S) {
                        tj3Var2.m22130l(ui3Var);
                    } else {
                        tj3Var2.m22137o0();
                    }
                    oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
                    oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                    oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                    oha.m18000f(tj3Var2, C0352b.f4305h);
                    oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    zf1 zf1Var = ge9.f40637a;
                    e16 e16VarM21607T = AbstractC3584sr.m21607T(e16VarM4412e2, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e);
                    String string2 = context.getString(R$string.streak_milestone);
                    string2.getClass();
                    String str2 = String.format(string2, Arrays.copyOf(new Object[]{Integer.valueOf(ty1Var.f63087a.f19520g)}, 1));
                    vh9 vh9Var2 = ps5.f56764b;
                    lw9.m16554b(str2, e16VarM21607T, ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var2)).f51800b.f71404h, tj3Var2, 0, 0, 130040);
                    bq1.m4042R(AbstractC3423or.m18236U(ss5.m21683H(context, ty1Var.f63087a.f19520g), tj3Var2, 0), null, AbstractC3584sr.m21611X(c99.m4422o(b16Var, 128.0f).mo3161g(new gv3(ec0Var)), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e, 7), null, null, 0.0f, null, tj3Var2, 56, 120);
                    tj3Var2.m22139q(true);
                }
                break;
            default:
                ye1 ye1Var3 = (ye1) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                tj3 tj3Var3 = (tj3) ye1Var3;
                if (!tj3Var3.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    tj3Var3.m22102U();
                } else {
                    bb1 bb1VarM230a2 = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var3, 48);
                    int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m2 = tj3Var3.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, b16Var);
                    se1.f60731q.getClass();
                    ui3 ui3Var2 = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var2);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a2);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
                    e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4422o(b16Var, 128.0f), 0.0f, ge9.m12515a(tj3Var3).f38955d, 0.0f, 0.0f, 13);
                    DailyGoalMet dailyGoalMet2 = ty1Var.f63087a;
                    int i2 = ty1Var.f63088b;
                    m1d.m16596a(e16VarM21611X, dailyGoalMet2.f19515b, dailyGoalMet2.f19516c, dailyGoalMet2.f19517d, true, false, tj3Var3, 24576, 32);
                    e16 e16VarM21611X2 = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var3).f38952a, 0.0f, 0.0f, 13);
                    Locale locale = Locale.getDefault();
                    String string3 = context.getString(R$string.stats_coins_goal);
                    string3.getClass();
                    String str3 = String.format(locale, string3, Arrays.copyOf(new Object[]{Integer.valueOf(dailyGoalMet2.f19515b), Integer.valueOf(dailyGoalMet2.f19516c)}, 2));
                    vx9 vx9Var = p58.m18902j(tj3Var3).f71406j;
                    bc3 bc3Var = bc3.f8322h;
                    lw9.m16554b(str3, e16VarM21611X2, p58.m18900f(tj3Var3).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9.m23584b(vx9Var, 0L, 0L, bc3Var, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var3, 0, 0, 130040);
                    lw9.m16554b(vz1.m23620a0(tj3Var3, dailyGoalMet2.f19518e ? R$string.daily_goal_met_doubled : R$string.stats_daily_goal_met), AbstractC3584sr.m21607T(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38955d), p58.m18900f(tj3Var3).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71406j, tj3Var3, 0, 0, 130040);
                    e16 e16VarM21611X3 = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var3).f38957f, 0.0f, 0.0f, 13);
                    Locale locale2 = Locale.getDefault();
                    String string4 = context.getString(R$string.stats_n_day_streak);
                    string4.getClass();
                    lw9.m16554b(String.format(locale2, string4, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1)), e16VarM21611X3, p58.m18900f(tj3Var3).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var3).f71406j, 0L, 0L, bc3Var, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var3, 0, 0, 130040);
                    e5d.m10858b(AbstractC3584sr.m21609V(b16Var, ge9.m12515a(tj3Var3).f38960i, 0.0f, 2), new tj9(i2, ty1Var.f63089c, false, 28), tj3Var3, 0, 4);
                    tj3Var3.m22139q(true);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ xy1(ty1 ty1Var, Context context, int i) {
        this.f68953a = i;
        this.f68955c = ty1Var;
        this.f68954b = context;
    }
}
