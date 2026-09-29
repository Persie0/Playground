package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.lingq.feature.onboarding.R$drawable;
import com.lingq.feature.onboarding.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class hz5 {

    /* JADX INFO: renamed from: a */
    public static final List f43242a = vz1.m23605K(new kl1(R$drawable.im_onboarding_content_source_app, R$string.onboarding_v2_mini_lesson_content_app_label, R$string.onboarding_v2_mini_lesson_content_app_items), new kl1(R$drawable.im_onboarding_content_source_external, R$string.onboarding_v2_mini_lesson_content_external_label, R$string.onboarding_v2_mini_lesson_content_external_items), new kl1(R$drawable.im_onboarding_content_source_import, R$string.onboarding_v2_mini_lesson_content_import_label, R$string.onboarding_v2_mini_lesson_content_import_items));

    /* JADX INFO: renamed from: a */
    public static final void m13594a(kl1 kl1Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1764530538);
        int i2 = i | (tj3Var.m22120g(kl1Var) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(c99.m4412e(b16Var, 1.0f), ui8.m22753b(ge9.m12515a(tj3Var).f38958g)), p58.m18900f(tj3Var).f55822G, ss5.f61356d), ge9.m12515a(tj3Var).f38957f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            bq1.m4042R(AbstractC3423or.m18236U(kl1Var.f47478a, tj3Var, 0), null, c99.m4414g(b16Var, 56.0f), null, null, 0.0f, null, tj3Var, 440, 120);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38952a));
            lw9.m16554b(vz1.m23620a0(tj3Var, kl1Var.f47479b), null, p58.m18900f(tj3Var).f55873q, null, 0L, null, bc3.f8323i, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 1572864, 0, 129978);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38954c));
            lw9.m16554b(vz1.m23620a0(tj3Var, kl1Var.f47480c), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 130042);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wz2(kl1Var, i, 20);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m13595b(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var) {
        ui3 ui3Var2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1736653104);
        int i2 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i | 48;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            ui3Var2 = ui3Var;
            gxb.m12966b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_mini_lesson_lesson_intro_title), true, vz1.m23620a0(tj3Var, R$string.onboarding_v2_continue), ui3Var2, b16Var, null, tzb.f63153a, tj3Var, ((i2 << 9) & 7168) | 1597488, 32);
            e16Var = b16Var;
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ov1(ui3Var2, e16Var, i, 5);
        }
    }
}
