package com.lingq.feature.onboarding.dailygoal;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.achievements.DailyGoal;
import com.lingq.core.p012ui.R$drawable;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.as4;
import p000.b16;
import p000.b34;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.dua;
import p000.e16;
import p000.eh0;
import p000.fe9;
import p000.ge9;
import p000.gr3;
import p000.h7a;
import p000.i75;
import p000.l77;
import p000.lo6;
import p000.lw9;
import p000.nj0;
import p000.oha;
import p000.or1;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.pfa;
import p000.py0;
import p000.qj8;
import p000.qs6;
import p000.rv2;
import p000.se1;
import p000.si5;
import p000.sj8;
import p000.t66;
import p000.thb;
import p000.tj3;
import p000.ty3;
import p000.ui3;
import p000.vi3;
import p000.vx9;
import p000.vz1;
import p000.wa5;
import p000.wb3;
import p000.we1;
import p000.x17;
import p000.x18;
import p000.xa0;
import p000.y35;
import p000.y38;
import p000.ye1;
import p000.ys0;
import p000.zi3;
import p000.zy1;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.dailygoal.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2200a {
    /* JADX INFO: renamed from: a */
    public static final void m9131a(e16 e16Var, DailyGoal dailyGoal, boolean z, ui3 ui3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        long j;
        dailyGoal.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(774814310);
        int i2 = i | 6 | (tj3Var.m22116e(dailyGoal.ordinal()) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            fe9 fe9VarM12515a = ge9.m12515a(tj3Var);
            b16 b16Var = b16.f7762a;
            e16 e16VarM19045o = pb1.m19045o(c99.m4416i(c99.m4412e(b16Var, 1.0f), 48.0f, 0.0f, 2), p58.m18901i(tj3Var).f64857c);
            if (z) {
                tj3Var.m22111b0(1339240258);
                j = p58.m18900f(tj3Var).f55823H;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1339335242);
                j = p58.m18900f(tj3Var).f55821F;
                tj3Var.m22139q(false);
            }
            e16 e16VarM10007D = d32.m10007D(e16VarM19045o, j, p58.m18901i(tj3Var).f64857c);
            boolean z2 = (i2 & 7168) == 2048;
            Object objM22097O = tj3Var.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new xa0(14, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM10007D, 15), fe9VarM12515a.f38960i, fe9VarM12515a.f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            lw9.m16554b(vz1.m23618Z(dailyGoal.getDescExtra(), new Object[]{Integer.valueOf(dailyGoal.getMins())}, tj3Var), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 131070);
            thb.m22044c(tj3Var, c99.m4414g(c99.m4426s(b16Var, fe9VarM12515a.f38957f), 48.0f));
            lw9.m16554b(vz1.m23620a0(tj3Var, dailyGoal.getDesc()), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var).f71406j, 0L, 0L, null, new wb3(1), null, 0L, null, null, 0, 0L, null, 16777207), tj3Var, 0, 0, 131070);
            tj3Var = tj3Var;
            thb.m22044c(tj3Var, new as4(1.0f, true));
            if (z) {
                tj3Var.m22111b0(1073008881);
                ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_check, tj3Var, 0), null, c99.m4422o(b16Var, 16.0f), 0L, tj3Var, 56, 8);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1073238560);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new py0(e16Var2, dailyGoal, z, ui3Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9132b(OnboardingDailyGoalViewModel onboardingDailyGoalViewModel, vi3 vi3Var, ye1 ye1Var, int i) {
        OnboardingDailyGoalViewModel onboardingDailyGoalViewModel2;
        int i2;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-117556302);
        int i3 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    onboardingDailyGoalViewModel2 = (OnboardingDailyGoalViewModel) pfa.m19114d(y38.m24933a(OnboardingDailyGoalViewModel.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                onboardingDailyGoalViewModel2 = onboardingDailyGoalViewModel;
            }
            tj3Var.m22140r();
            zy1 zy1Var = (zy1) AbstractC0711a.m2513c(onboardingDailyGoalViewModel2.f27190c, tj3Var).getValue();
            boolean zM22124i = tj3Var.m22124i(onboardingDailyGoalViewModel2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                OnboardingDailyGoalScreenKt$OnboardingDailyGoalRoute$1$1 onboardingDailyGoalScreenKt$OnboardingDailyGoalRoute$1$1 = new OnboardingDailyGoalScreenKt$OnboardingDailyGoalRoute$1$1(1, onboardingDailyGoalViewModel2, OnboardingDailyGoalViewModel.class, "handleAction", "handleAction(Lcom/lingq/feature/onboarding/dailygoal/DailyGoalAction;)V", 0);
                tj3Var.m22131l0(onboardingDailyGoalScreenKt$OnboardingDailyGoalRoute$1$1);
                objM22097O = onboardingDailyGoalScreenKt$OnboardingDailyGoalRoute$1$1;
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O);
            boolean z = (i2 & 112) == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new i75(vi3Var, 16);
                tj3Var.m22131l0(objM22097O2);
            }
            m9133c(zy1Var, vi3Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
            onboardingDailyGoalViewModel2 = onboardingDailyGoalViewModel;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(onboardingDailyGoalViewModel2, i, 11, vi3Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9133c(zy1 zy1Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1046166540);
        int i2 = 2;
        int i3 = (tj3Var2.m22124i(zy1Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 147) != 146)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            fe9 fe9Var = (fe9) tj3Var2.m22128k(ge9.f40637a);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(null);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.TRUE);
                tj3Var2.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) objM22097O2;
            DailyGoal dailyGoal = zy1Var.f72376d;
            boolean zM22124i = tj3Var2.m22124i(zy1Var);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22124i || objM22097O3 == p84Var) {
                objM22097O3 = new OnboardingDailyGoalScreenKt$OnboardingDailyGoalScreen$1$1(zy1Var, t66Var, t66Var2, null);
                tj3Var2.m22131l0(objM22097O3);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O3, dailyGoal);
            x17 x17Var = h7a.f41916a;
            rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var2), tj3Var2);
            tj3Var = tj3Var2;
            b34.m3232b(c99.m4410c(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), 1.0f), ci8.m4703P(7999664, new qs6(rv2VarM13115b, vi3Var2, i2), tj3Var2), ci8.m4703P(-854304497, new lo6(i2, vi3Var2, zy1Var, fe9Var), tj3Var2), null, null, 0, 0L, 0L, null, ci8.m4703P(283865093, new ys0(zy1Var, vi3Var, t66Var, t66Var2, fe9Var, context), tj3Var2), tj3Var, 805306800, 504);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 5, zy1Var, vi3Var, vi3Var2);
        }
    }
}
