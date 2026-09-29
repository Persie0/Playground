package com.lingq.feature.language;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.language.LanguageToLearn;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.FunctionReference;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.C2956e9;
import p000.C3386nv;
import p000.C3836zk;
import p000.an4;
import p000.as4;
import p000.b16;
import p000.bc3;
import p000.bq1;
import p000.c99;
import p000.ci8;
import p000.csb;
import p000.d32;
import p000.dua;
import p000.e16;
import p000.eh0;
import p000.ex0;
import p000.fc0;
import p000.fe9;
import p000.fl4;
import p000.g6d;
import p000.ge9;
import p000.gr3;
import p000.hl1;
import p000.ik0;
import p000.l77;
import p000.lw9;
import p000.mm4;
import p000.ms5;
import p000.nj0;
import p000.nm4;
import p000.nsb;
import p000.oha;
import p000.or1;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.pfa;
import p000.ps5;
import p000.qj8;
import p000.qm4;
import p000.rw1;
import p000.se1;
import p000.si5;
import p000.sj8;
import p000.sy0;
import p000.t66;
import p000.thb;
import p000.tj3;
import p000.ui3;
import p000.ui8;
import p000.vh9;
import p000.vi3;
import p000.vx9;
import p000.vz1;
import p000.we1;
import p000.wq1;
import p000.x18;
import p000.xa0;
import p000.y38;
import p000.ye1;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.language.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2119a {
    /* JADX INFO: renamed from: a */
    public static final void m9036a(int i, ye1 ye1Var, int i2) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1865322510);
        int i3 = (tj3Var2.m22116e(i) ? 4 : 2) | i2;
        if (tj3Var2.m22099R(i3 & 1, (i3 & 3) != 2)) {
            String strM23620a0 = vz1.m23620a0(tj3Var2, i);
            vh9 vh9Var = ps5.f56764b;
            vx9 vx9Var = ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71405i;
            long j = ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55875s;
            bc3 bc3Var = bc3.f8323i;
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            tj3Var = tj3Var2;
            lw9.m16554b(strM23620a0, AbstractC3584sr.m21608U(e16VarM4412e, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a), j, null, 0L, null, bc3Var, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var, 1572864, 0, 131000);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ex0(i, i2, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9037b(LanguageToLearn languageToLearn, ui3 ui3Var, ye1 ye1Var, int i) {
        LanguageToLearn languageToLearn2 = languageToLearn;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1165588177);
        int i2 = i | (tj3Var.m22124i(languageToLearn2) ? 4 : 2) | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            boolean z = (i2 & 112) == 32;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new xa0(6, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM21608U = AbstractC3584sr.m21608U(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM4412e, 15), ge9.m12515a(tj3Var).f38960i, ge9.m12515a(tj3Var).f38956e);
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var, 48);
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
            String str = languageToLearn2.f19113a;
            int i3 = languageToLearn2.f19116d;
            bq1.m4042R(AbstractC3423or.m18236U(AbstractC3423or.m18282v(context, str), tj3Var, 0), null, pb1.m19045o(wq1.m24108d(tj3Var, b16Var, 40.0f), ui8.f63972a), null, hl1.f42564a, 0.0f, null, tj3Var, 24632, 104);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38956e));
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37242h, fc0Var, tj3Var, 54);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            languageToLearn2 = languageToLearn;
            lw9.m16554b(AbstractC3352my.m17093L(context, languageToLearn2.f19113a), new as4(1.0f, true), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 131064);
            tj3Var = tj3Var;
            if (i3 > 0) {
                tj3Var.m22111b0(1039686191);
                lw9.m16554b(String.format(Locale.getDefault(), "(%d)", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 131066);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1039940329);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(languageToLearn2, i, 18, ui3Var);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9038c(C2120b c2120b, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        C2120b c2120b2;
        C2120b c2120b3;
        int i2;
        C2120b c2120b4;
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(619332222);
        int i3 = i | 2 | (tj3Var.m22124i(ui3Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var2) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2120b3 = (C2120b) pfa.m19114d(y38.m24933a(C2120b.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-15);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-15);
                c2120b3 = c2120b;
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2120b3.f26335e, tj3Var);
            an4 an4Var = new an4((List) AbstractC0711a.m2513c(c2120b3.f26336f, tj3Var).getValue(), (qm4) t66VarM2513c.getValue());
            boolean zM22124i = tj3Var.m22124i(c2120b3);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                c2120b4 = c2120b3;
                LanguageSelectorScreenKt$LanguageSelectorRoute$1$1 languageSelectorScreenKt$LanguageSelectorRoute$1$1 = new LanguageSelectorScreenKt$LanguageSelectorRoute$1$1(1, c2120b4, C2120b.class, "handleAction", "handleAction(Lcom/lingq/feature/language/LanguageSelectorAction;)V", 0);
                tj3Var.m22131l0(languageSelectorScreenKt$LanguageSelectorRoute$1$1);
                objM22097O = languageSelectorScreenKt$LanguageSelectorRoute$1$1;
            } else {
                c2120b4 = c2120b3;
            }
            vi3 vi3Var = (vi3) ((FunctionReference) objM22097O);
            int i4 = i2 & 112;
            boolean z = i4 == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new sy0(1, ui3Var);
                tj3Var.m22131l0(objM22097O2);
            }
            m9039d(an4Var, vi3Var, (vi3) objM22097O2, tj3Var, 0);
            qm4 qm4Var = (qm4) t66VarM2513c.getValue();
            boolean zM22120g = ((i2 & 896) == 256) | tj3Var.m22120g(t66VarM2513c) | (i4 == 32);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                objM22097O3 = new LanguageSelectorScreenKt$LanguageSelectorRoute$3$1(ui3Var2, ui3Var, t66VarM2513c, null);
                tj3Var.m22131l0(objM22097O3);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O3, qm4Var);
            c2120b2 = c2120b4;
        } else {
            tj3Var.m22102U();
            c2120b2 = c2120b;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 16, c2120b2, ui3Var, ui3Var2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9039d(an4 an4Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        qm4 qm4Var = an4Var.f877b;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-828913682);
        int i2 = (tj3Var2.m22124i(an4Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            C0269z c0269zM1154g = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
            boolean z = qm4Var instanceof nm4;
            p84 p84Var = we1.f66679a;
            if (z) {
                tj3Var2.m22111b0(1894805343);
                g6d.m12389b(((nm4) qm4Var).f52958a, tj3Var2, 6);
                tj3Var2.m22139q(false);
            } else if (qm4Var instanceof mm4) {
                tj3Var2.m22111b0(1894999062);
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object objM22097O = tj3Var2.m22097O();
                if (z2 || objM22097O == p84Var) {
                    objM22097O = new fl4(vi3Var, 3);
                    tj3Var2.m22131l0(objM22097O);
                }
                ui3 ui3Var = (ui3) objM22097O;
                boolean z3 = i3 == 32;
                Object objM22097O2 = tj3Var2.m22097O();
                if (z3 || objM22097O2 == p84Var) {
                    objM22097O2 = new fl4(vi3Var, 4);
                    tj3Var2.m22131l0(objM22097O2);
                }
                nsb.m17612a(ui3Var, (ui3) objM22097O2, tj3Var2, 6);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(1895261074);
                tj3Var2.m22139q(false);
            }
            long j = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55872p;
            boolean z4 = (i2 & 896) == 256;
            Object objM22097O3 = tj3Var2.m22097O();
            if (z4 || objM22097O3 == p84Var) {
                objM22097O3 = new fl4(vi3Var2, 5);
                tj3Var2.m22131l0(objM22097O3);
            }
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c((ui3) objM22097O3, null, c0269zM1154g, 0.0f, false, null, j, 0L, 0L, csb.f34498a, null, null, ci8.m4703P(646123340, new ik0(an4Var, vi3Var, vi3Var2, 25), tj3Var2), tj3Var, 24576, 3078, 7082);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 25, an4Var, vi3Var, vi3Var2);
        }
    }
}
