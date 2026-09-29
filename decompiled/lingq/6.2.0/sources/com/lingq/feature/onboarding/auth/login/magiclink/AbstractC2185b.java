package com.lingq.feature.onboarding.auth.login.magiclink;

import androidx.compose.material3.C0232g0;
import androidx.compose.material3.SnackbarDuration;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.feature.onboarding.AbstractC2174a;
import com.lingq.feature.onboarding.R$string;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3584sr;
import p000.C2956e9;
import p000.C3386nv;
import p000.b34;
import p000.ci6;
import p000.ci8;
import p000.dq0;
import p000.dua;
import p000.ep2;
import p000.gr3;
import p000.hn0;
import p000.jp2;
import p000.ld9;
import p000.nw1;
import p000.or1;
import p000.ot1;
import p000.p84;
import p000.pfa;
import p000.pk9;
import p000.rw1;
import p000.si5;
import p000.t66;
import p000.te0;
import p000.tj3;
import p000.ui3;
import p000.um5;
import p000.vi3;
import p000.vz1;
import p000.we1;
import p000.x18;
import p000.xm5;
import p000.y38;
import p000.ye1;
import p000.ym5;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.auth.login.magiclink.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2185b {
    /* JADX INFO: renamed from: a */
    public static final void m9115a(C2186c c2186c, vi3 vi3Var, ye1 ye1Var, int i) {
        C2186c c2186c2;
        int i2;
        String str;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(328041618);
        int i3 = i | 2 | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        int i4 = 18;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2186c2 = (C2186c) pfa.m19114d(y38.m24933a(C2186c.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                c2186c2 = c2186c;
            }
            tj3Var.m22140r();
            ym5 ym5Var = c2186c2.m9117V2().f45952a;
            ym5Var.getClass();
            if ((ym5Var instanceof xm5) && (str = (String) pk9.m19381x(ym5Var)) != null) {
                c2186c2.m9118W2(ep2.f37658a);
                vi3Var.invoke(new ci6(str));
            }
            jp2 jp2VarM9117V2 = c2186c2.m9117V2();
            boolean zM22124i = tj3Var.m22124i(c2186c2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                EmailLoginScreenKt$EmailLoginRoute$1$1 emailLoginScreenKt$EmailLoginRoute$1$1 = new EmailLoginScreenKt$EmailLoginRoute$1$1(1, c2186c2, C2186c.class, "handleAction", "handleAction(Lcom/lingq/feature/onboarding/auth/login/magiclink/EmailLoginAction;)V", 0);
                tj3Var.m22131l0(emailLoginScreenKt$EmailLoginRoute$1$1);
                objM22097O = emailLoginScreenKt$EmailLoginRoute$1$1;
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O);
            boolean z = (i2 & 112) == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new te0(vi3Var, i4);
                tj3Var.m22131l0(objM22097O2);
            }
            m9116b(jp2VarM9117V2, vi3Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
            c2186c2 = c2186c;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(c2186c2, i, 8, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9116b(jp2 jp2Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2;
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(781921521);
        int i2 = (tj3Var3.m22124i(jp2Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var3.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var3.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var3.m22099R(i2 & 1, (i2 & 147) != 146)) {
            ld9 ld9Var = (ld9) tj3Var3.m22128k(AbstractC0402n.f4826r);
            Object objM22097O = tj3Var3.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new C0232g0();
                tj3Var3.m22131l0(objM22097O);
            }
            C0232g0 c0232g0 = (C0232g0) objM22097O;
            Object objM22097O2 = tj3Var3.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j("");
                tj3Var3.m22131l0(objM22097O2);
            }
            t66 t66Var = (t66) objM22097O2;
            Object objM22097O3 = tj3Var3.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var3.m22131l0(objM22097O3);
            }
            t66 t66Var2 = (t66) objM22097O3;
            ym5 ym5Var = jp2Var.f45952a;
            ym5Var.getClass();
            if (ym5Var instanceof um5) {
                tj3Var3.m22111b0(-1678137564);
                ym5 ym5Var2 = jp2Var.f45952a;
                String strM23620a0 = vz1.m23620a0(tj3Var3, R$string.welcome_email_not_found);
                String strM23620a1 = vz1.m23620a0(tj3Var3, com.lingq.core.p012ui.R$string.ui_ok);
                SnackbarDuration snackbarDuration = SnackbarDuration.Indefinite;
                int i3 = i2 & 112;
                boolean z = i3 == 32;
                Object objM22097O4 = tj3Var3.m22097O();
                if (z || objM22097O4 == p84Var) {
                    objM22097O4 = new nw1(vi3Var, 6);
                    tj3Var3.m22131l0(objM22097O4);
                }
                ui3 ui3Var = (ui3) objM22097O4;
                boolean z2 = i3 == 32;
                Object objM22097O5 = tj3Var3.m22097O();
                if (z2 || objM22097O5 == p84Var) {
                    objM22097O5 = new nw1(vi3Var, 7);
                    tj3Var3.m22131l0(objM22097O5);
                }
                AbstractC2174a.m9104a(c0232g0, ym5Var2, strM23620a0, strM23620a1, snackbarDuration, ui3Var, (ui3) objM22097O5, tj3Var3, 24582);
                tj3Var2 = tj3Var3;
                tj3Var2.m22139q(false);
            } else {
                tj3Var2 = tj3Var3;
                tj3Var2.m22111b0(-1677633039);
                tj3Var2.m22139q(false);
            }
            tj3 tj3Var4 = tj3Var2;
            b34.m3232b(null, ci8.m4703P(1470609069, new dq0(vi3Var2, 27), tj3Var2), null, ci8.m4703P(-724619797, new ot1(c0232g0, 2), tj3Var2), null, 0, 0L, 0L, null, ci8.m4703P(-216761918, new hn0((Object) jp2Var, vi3Var, (Object) ld9Var, (Object) t66Var, (Object) t66Var2, 3), tj3Var2), tj3Var4, 805309488, 501);
            tj3Var = tj3Var4;
        } else {
            tj3Var = tj3Var3;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 21, jp2Var, vi3Var, vi3Var2);
        }
    }
}
