package com.lingq.feature.onboarding.level;

import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.lifecycle.compose.AbstractC0711a;
import kotlin.jvm.internal.FunctionReference;
import p000.a05;
import p000.b16;
import p000.b34;
import p000.c99;
import p000.ci8;
import p000.fe9;
import p000.ge9;
import p000.h7a;
import p000.ix0;
import p000.lo6;
import p000.p84;
import p000.qs6;
import p000.rv2;
import p000.t66;
import p000.tj3;
import p000.vi3;
import p000.w75;
import p000.wa5;
import p000.we1;
import p000.x17;
import p000.x18;
import p000.y35;
import p000.ye1;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.level.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2209a {
    /* JADX INFO: renamed from: a */
    public static final void m9142a(C2210b c2210b, vi3 vi3Var, ye1 ye1Var, int i) {
        p84 p84Var;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1937886638);
        int i2 = (tj3Var.m22124i(c2210b) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2210b.f27264d, tj3Var);
            w75 w75Var = (w75) t66VarM2513c.getValue();
            boolean zM22124i = tj3Var.m22124i(c2210b);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (zM22124i || objM22097O == p84Var2) {
                p84Var = p84Var2;
                OnboardingLevelScreenKt$OnboardingLevelRoute$1$1 onboardingLevelScreenKt$OnboardingLevelRoute$1$1 = new OnboardingLevelScreenKt$OnboardingLevelRoute$1$1(1, c2210b, C2210b.class, "handleAction", "handleAction(Lcom/lingq/feature/onboarding/level/LevelAction;)V", 0);
                tj3Var.m22131l0(onboardingLevelScreenKt$OnboardingLevelRoute$1$1);
                objM22097O = onboardingLevelScreenKt$OnboardingLevelRoute$1$1;
            } else {
                p84Var = p84Var2;
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O);
            boolean zM22120g = ((i2 & 112) == 32) | tj3Var.m22120g(t66VarM2513c);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                objM22097O2 = new ix0(vi3Var, t66VarM2513c, 10);
                tj3Var.m22131l0(objM22097O2);
            }
            m9143b(w75Var, vi3Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(c2210b, i, 15, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9143b(w75 w75Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-847012834);
        int i2 = 4;
        int i3 = (tj3Var2.m22124i(w75Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 147) != 146)) {
            fe9 fe9Var = (fe9) tj3Var2.m22128k(ge9.f40637a);
            x17 x17Var = h7a.f41916a;
            rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var2), tj3Var2);
            int i4 = 3;
            tj3Var = tj3Var2;
            b34.m3232b(c99.m4410c(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), 1.0f), ci8.m4703P(-132060446, new qs6(rv2VarM13115b, vi3Var2, i4), tj3Var2), ci8.m4703P(40353635, new lo6(i4, vi3Var2, w75Var, fe9Var), tj3Var2), null, null, 0, 0L, 0L, null, ci8.m4703P(1060434221, new a05(i2, vi3Var, fe9Var, w75Var), tj3Var2), tj3Var, 805306800, 504);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 6, w75Var, vi3Var, vi3Var2);
        }
    }
}
