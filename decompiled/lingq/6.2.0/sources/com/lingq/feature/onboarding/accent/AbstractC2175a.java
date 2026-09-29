package com.lingq.feature.onboarding.accent;

import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.lifecycle.compose.AbstractC0711a;
import kotlin.jvm.internal.FunctionReference;
import p000.C3357n2;
import p000.C3633u2;
import p000.b16;
import p000.b34;
import p000.c99;
import p000.ci8;
import p000.cx6;
import p000.fe9;
import p000.ge9;
import p000.h7a;
import p000.i75;
import p000.lo6;
import p000.p84;
import p000.qs6;
import p000.rv2;
import p000.tj3;
import p000.vi3;
import p000.wa5;
import p000.we1;
import p000.x17;
import p000.x18;
import p000.y35;
import p000.ye1;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.accent.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2175a {
    /* JADX INFO: renamed from: a */
    public static final void m9107a(OnboardingAccentViewModel onboardingAccentViewModel, vi3 vi3Var, ye1 ye1Var, int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1161339556);
        int i2 = (tj3Var.m22124i(onboardingAccentViewModel) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            C3633u2 c3633u2 = (C3633u2) AbstractC0711a.m2513c(onboardingAccentViewModel.f27013c, tj3Var).getValue();
            boolean zM22124i = tj3Var.m22124i(onboardingAccentViewModel);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                OnboardingAccentScreenKt$OnboardingAccentRoute$1$1 onboardingAccentScreenKt$OnboardingAccentRoute$1$1 = new OnboardingAccentScreenKt$OnboardingAccentRoute$1$1(1, onboardingAccentViewModel, OnboardingAccentViewModel.class, "handleAction", "handleAction(Lcom/lingq/feature/onboarding/accent/AccentAction;)V", 0);
                tj3Var.m22131l0(onboardingAccentScreenKt$OnboardingAccentRoute$1$1);
                objM22097O = onboardingAccentScreenKt$OnboardingAccentRoute$1$1;
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O);
            boolean z = (i2 & 112) == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new i75(vi3Var, 14);
                tj3Var.m22131l0(objM22097O2);
            }
            m9108b(c3633u2, vi3Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(onboardingAccentViewModel, i, 9, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9108b(C3633u2 c3633u2, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-227653050);
        int i2 = (tj3Var2.m22124i(c3633u2) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 256 : 128;
        }
        int i3 = 0;
        int i4 = 1;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            fe9 fe9Var = (fe9) tj3Var2.m22128k(ge9.f40637a);
            String str = cx6.f34682a;
            x17 x17Var = h7a.f41916a;
            rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var2), tj3Var2);
            tj3Var = tj3Var2;
            b34.m3232b(c99.m4410c(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), 1.0f), ci8.m4703P(-618409726, new qs6(rv2VarM13115b, vi3Var2, i3), tj3Var2), ci8.m4703P(328757217, new lo6(i4, vi3Var2, c3633u2, fe9Var), tj3Var2), null, null, 0, 0L, 0L, null, ci8.m4703P(735168471, new C3357n2((Object) fe9Var, (Object) c3633u2, str, vi3Var, 11), tj3Var2), tj3Var, 805306800, 504);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(i, 4, c3633u2, vi3Var, vi3Var2);
        }
    }
}
