package com.lingq.feature.onboarding.p014v2.pages;

import android.content.Context;
import android.os.Build;
import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.p014v2.OnboardingSelections;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3489q9;
import p000.AbstractC3584sr;
import p000.C3484q4;
import p000.C3522r4;
import p000.C3587su;
import p000.ab1;
import p000.b16;
import p000.bb1;
import p000.bc3;
import p000.bna;
import p000.bq1;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.dh9;
import p000.e16;
import p000.e65;
import p000.ec0;
import p000.eh0;
import p000.fe9;
import p000.g77;
import p000.ge9;
import p000.gs0;
import p000.gxb;
import p000.hn0;
import p000.i77;
import p000.ib1;
import p000.iq0;
import p000.j77;
import p000.js1;
import p000.k04;
import p000.ks9;
import p000.l70;
import p000.l77;
import p000.lo3;
import p000.lw9;
import p000.ms5;
import p000.mz5;
import p000.nj0;
import p000.oha;
import p000.p58;
import p000.p84;
import p000.ps5;
import p000.py0;
import p000.qc9;
import p000.qd0;
import p000.qj8;
import p000.rk4;
import p000.sc9;
import p000.se1;
import p000.sfc;
import p000.sj8;
import p000.ss5;
import p000.t66;
import p000.te1;
import p000.thb;
import p000.tj3;
import p000.u0c;
import p000.ui3;
import p000.ui8;
import p000.ux5;
import p000.vh9;
import p000.vi3;
import p000.vx9;
import p000.vz1;
import p000.we1;
import p000.x18;
import p000.xfa;
import p000.y27;
import p000.ye1;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.pages.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2228a {
    /* JADX INFO: renamed from: a */
    public static final void m9181a(String str, int i, ui3 ui3Var, ui3 ui3Var2, e16 e16Var, ye1 ye1Var, int i2) {
        e16 e16Var2;
        boolean zEquals;
        str.getClass();
        ui3Var.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-221844824);
        int i3 = i2 | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | (tj3Var.m22124i(ui3Var2) ? 2048 : 1024) | 24576;
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            g77 g77VarM22380a = u0c.m22380a(tj3Var);
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 33) {
                j77 j77VarMo12408n = g77VarM22380a.mo12408n();
                j77VarMo12408n.getClass();
                zEquals = j77VarMo12408n.equals(i77.f43628a);
            } else {
                zEquals = true;
            }
            if (i4 >= 33) {
                tj3Var.m22111b0(976154773);
                Boolean boolValueOf = Boolean.valueOf(zEquals);
                Boolean bool = (Boolean) t66Var.getValue();
                bool.getClass();
                boolean zM22122h = ((i3 & 896) == 256) | tj3Var.m22122h(zEquals);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22122h || objM22097O2 == p84Var) {
                    objM22097O2 = new AchieveGoalsPageKt$AchieveGoalsPage$1$1(zEquals, ui3Var, t66Var, null);
                    tj3Var.m22131l0(objM22097O2);
                }
                d32.m10049l(boolValueOf, bool, (zi3) objM22097O2, tj3Var);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(976405594);
                tj3Var.m22139q(false);
            }
            gxb.m12967c(vz1.m23620a0(tj3Var, R$string.onboarding_v2_achieve_title), vz1.m23618Z(R$string.onboarding_v2_achieve_subtitle, new Object[]{Integer.valueOf(i), AbstractC3352my.m17093L(context, str)}, tj3Var), ci8.m4703P(670971526, new C3484q4(zEquals, ui3Var, g77VarM22380a, ui3Var2, t66Var), tj3Var), tj3Var, 27696);
            e16Var2 = b16.f7762a;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(str, i, ui3Var, ui3Var2, e16Var2, i2, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9182b(String str, String str2, boolean z, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        long j;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1788658155);
        int i2 = i | (tj3Var2.m22120g(str) ? 4 : 2) | (tj3Var2.m22120g(str2) ? 32 : 16) | (tj3Var2.m22122h(z) ? 256 : 128) | 3072;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var2, 48);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            if (z) {
                tj3Var2.m22111b0(-320434886);
                j = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55842a;
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-320372173);
                j = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55874r;
                tj3Var2.m22139q(false);
            }
            e16 e16VarM4422o = c99.m4422o(b16Var, 24.0f);
            boolean zM22118f = tj3Var2.m22118f(j) | ((i2 & 896) == 256);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22118f || objM22097O == we1.f66679a) {
                objM22097O = new mz5(z, j);
                tj3Var2.m22131l0(objM22097O);
            }
            eh0.m11124d(e16VarM4422o, (vi3) objM22097O, tj3Var2, 6);
            thb.m22044c(tj3Var2, c99.m4426s(b16Var, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a));
            vh9 vh9Var = ps5.f56764b;
            e16Var2 = b16Var;
            lw9.m16554b(str + ": " + str2, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71406j, tj3Var2, 0, 0, 131066);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new py0(str, str2, z, e16Var2, i, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static final void m9183c(boolean z, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i, int i2) {
        int i3;
        e16 e16Var2;
        int i4;
        boolean z2;
        x18 x18VarM22143u;
        e16 e16Var3;
        Object objM22097O;
        p84 p84Var;
        qc9 qc9Var;
        Object objM22097O2;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1665426110);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                e16Var2 = e16Var;
                i3 |= tj3Var.m22120g(e16Var2) ? 256 : 128;
            }
            i4 = 0;
            if ((i3 & 147) != 146) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var.m22099R(i3 & 1, z2)) {
                if (i5 != 0) {
                    e16Var3 = b16.f7762a;
                } else {
                    e16Var3 = e16Var2;
                }
                objM22097O = tj3Var.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1256f(0.0f);
                    tj3Var.m22131l0(objM22097O);
                }
                qc9Var = (qc9) objM22097O;
                objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new GoalsProgressLinePageKt$GoalsProgressLinePage$1$1(qc9Var, null);
                    tj3Var.m22131l0(objM22097O2);
                }
                d32.m10047k(tj3Var, (zi3) objM22097O2, xfa.f68157a);
                dh9 dh9VarM750b = AbstractC0060b.m750b(qc9Var.m19861h(), ss5.m21703b0(1500, 0, null, 6), "lineProgress", null, tj3Var, 3120, 20);
                String strM23620a0 = vz1.m23620a0(tj3Var, R$string.onboarding_v2_goals_line_title);
                String strM23620a1 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_continue);
                C0282a c0282aM4703P = ci8.m4703P(-959408756, new lo3(dh9VarM750b, i4), tj3Var);
                int i6 = ((i3 << 3) & 112) | 1572864;
                int i7 = i3 << 6;
                e16 e16Var4 = e16Var3;
                gxb.m12966b(strM23620a0, z, strM23620a1, ui3Var, e16Var4, null, c0282aM4703P, tj3Var, i6 | (i7 & 7168) | (i7 & 57344), 32);
                e16Var2 = e16Var4;
            } else {
                tj3Var.m22102U();
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new js1(z, ui3Var, e16Var2, i, i2);
            }
        }
        i3 |= 384;
        e16Var2 = e16Var;
        i4 = 0;
        if ((i3 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (tj3Var.m22099R(i3 & 1, z2)) {
            if (i5 != 0) {
                e16Var3 = b16.f7762a;
            } else {
                e16Var3 = e16Var2;
            }
            objM22097O = tj3Var.m22097O();
            p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1256f(0.0f);
                tj3Var.m22131l0(objM22097O);
            }
            qc9Var = (qc9) objM22097O;
            objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new GoalsProgressLinePageKt$GoalsProgressLinePage$1$1(qc9Var, null);
                tj3Var.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O2, xfa.f68157a);
            dh9 dh9VarM750b2 = AbstractC0060b.m750b(qc9Var.m19861h(), ss5.m21703b0(1500, 0, null, 6), "lineProgress", null, tj3Var, 3120, 20);
            String strM23620a2 = vz1.m23620a0(tj3Var, R$string.onboarding_v2_goals_line_title);
            String strM23620a3 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_continue);
            C0282a c0282aM4703P2 = ci8.m4703P(-959408756, new lo3(dh9VarM750b2, i4), tj3Var);
            int i8 = ((i3 << 3) & 112) | 1572864;
            int i9 = i3 << 6;
            e16 e16Var5 = e16Var3;
            gxb.m12966b(strM23620a2, z, strM23620a3, ui3Var, e16Var5, null, c0282aM4703P2, tj3Var, i8 | (i9 & 7168) | (i9 & 57344), 32);
            e16Var2 = e16Var5;
        } else {
            tj3Var.m22102U();
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new js1(z, ui3Var, e16Var2, i, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9184d(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str) {
        int i2;
        e16 e16Var2;
        ui3 ui3Var2 = ui3Var;
        str.getClass();
        ui3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1491570435);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(ui3Var2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1256f(0.0f);
                tj3Var.m22131l0(objM22097O);
            }
            qc9 qc9Var = (qc9) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new PaywallConfidencePageKt$PaywallConfidencePage$1$1(qc9Var, null);
                tj3Var.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O2, xfa.f68157a);
            dh9 dh9VarM750b = AbstractC0060b.m750b(qc9Var.m19861h(), ss5.m21703b0(1500, 0, null, 6), "paywallConfidenceLineProgress", null, tj3Var, 3120, 20);
            String strM17093L = AbstractC3352my.m17093L((Context) tj3Var.m22128k(AbstractC0394f.f4761b), str);
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(thb.m22066y(thb.m22038C(l70.m15962y(c99.m4411d(b16Var, 1.0f)))), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            ec0 ec0Var = nj0.f52792K;
            C3587su c3587su = eh0.f37238d;
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var4 = C0352b.f4301d;
            e16 e16VarM3912B0 = bna.m3912B0(e65.m10871c(tj3Var, e16VarM1322c, zi3Var4, 1.0f, true), bna.m3972r0(tj3Var), false, 14);
            bb1 bb1VarM230a2 = ab1.m230a(c3587su, ec0Var, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM3912B0);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_paywall_confidence_title), null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var).f71400d, 0L, 0L, bc3.f8324j, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var, 0, 0, 130042);
            bq1.m4039O(ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38957f, tj3Var, b16Var, 1.0f), ui8.m22753b(8.0f), te1.m21999m(0, 14, p58.m18900f(tj3Var).f55824I, 0L, tj3Var), te1.m22000n(62, 0.0f), null, ci8.m4703P(-743442977, new lo3(dh9VarM750b, 4), tj3Var), tj3Var, 196614, 16);
            tj3Var = tj3Var;
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            m9187g(0, tj3Var, null, strM17093L);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
            ui3Var2 = ui3Var;
            ss5.m21710f(AbstractC3584sr.m21611X(ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38952a, tj3Var, b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, false, ui3Var2, sfc.f60803a, tj3Var, ((i3 << 9) & 57344) | 196608, 14);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ib1(str, ui3Var2, e16Var2, i);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9185e(OnboardingSelections onboardingSelections, boolean z, boolean z2, ui3 ui3Var, e16 e16Var, ye1 ye1Var, int i) {
        int i2;
        ui3 ui3Var2;
        e16 e16Var2;
        onboardingSelections.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1610524764);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(onboardingSelections) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22122h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            ui3Var2 = ui3Var;
            i2 |= tj3Var.m22124i(ui3Var2) ? 2048 : 1024;
        } else {
            ui3Var2 = ui3Var;
        }
        int i3 = i2 | 24576;
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC3489q9.m19771a(0.0f);
                tj3Var.m22131l0(objM22097O);
            }
            C0059a c0059a = (C0059a) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1257g(0);
                tj3Var.m22131l0(objM22097O2);
            }
            sc9 sc9Var = (sc9) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1257g(0);
                tj3Var.m22131l0(objM22097O3);
            }
            sc9 sc9Var2 = (sc9) objM22097O3;
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zM22124i = ((i3 & 896) == 256) | tj3Var.m22124i(c0059a) | ((i3 & 112) == 32);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i || objM22097O4 == p84Var) {
                objM22097O4 = new PersonalizingPageKt$PersonalizingPage$1$1(z2, c0059a, z, null);
                tj3Var.m22131l0(objM22097O4);
            }
            int i4 = (i3 >> 3) & 112;
            d32.m10049l(boolValueOf, boolValueOf2, (zi3) objM22097O4, tj3Var);
            Object objM745d = c0059a.m745d();
            boolean zM22124i2 = tj3Var.m22124i(c0059a);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O5 == p84Var) {
                objM22097O5 = new PersonalizingPageKt$PersonalizingPage$2$1(c0059a, sc9Var, sc9Var2, null);
                tj3Var.m22131l0(objM22097O5);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O5, objM745d);
            gxb.m12968d(vz1.m23620a0(tj3Var, R$string.onboarding_v2_personalizing_title), z2, vz1.m23620a0(tj3Var, R$string.onboarding_v2_personalizing_button), ui3Var2, null, ci8.m4703P(-653742208, new hn0(c0059a, sc9Var, onboardingSelections, context, sc9Var2, 12), tj3Var), tj3Var, i4 | 1572864 | (i3 & 7168) | (i3 & 57344), 32);
            e16Var2 = b16.f7762a;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new k04(onboardingSelections, z, z2, ui3Var, e16Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9186f(int i, int i2, e16 e16Var, String str, ye1 ye1Var, int i3, int i4) {
        String str2;
        int i5;
        e16 e16Var2;
        String str3;
        String strM23618Z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1421879639);
        int i6 = i3 | (tj3Var.m22116e(i) ? 4 : 2) | (tj3Var.m22116e(i2) ? 32 : 16);
        int i7 = i6 | 384;
        int i8 = i4 & 8;
        if (i8 != 0) {
            i5 = i6 | 3456;
            str2 = str;
        } else {
            str2 = str;
            i5 = i7 | (tj3Var.m22120g(str2) ? 2048 : 1024);
        }
        if (tj3Var.m22099R(i5 & 1, (i5 & 1171) != 1170)) {
            if (i8 != 0) {
                str2 = null;
            }
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
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
            y27 y27VarM18236U = AbstractC3423or.m18236U(i, tj3Var, i5 & 14);
            vh9 vh9Var = ps5.f56764b;
            qd0 qd0Var = new qd0(5, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55842a);
            zf1 zf1Var = ge9.f40637a;
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            bq1.m4042R(y27VarM18236U, null, c99.m4422o(b16Var, 32.0f), null, null, 0.0f, qd0Var, tj3Var, 56, 56);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38956e));
            if (str2 == null) {
                tj3Var.m22111b0(1144581793);
                strM23618Z = vz1.m23620a0(tj3Var, i2);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1144639608);
                strM23618Z = vz1.m23618Z(i2, new Object[]{str2}, tj3Var);
                tj3Var.m22139q(false);
            }
            lw9.m16554b(strM23618Z, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            str3 = str2;
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            str3 = str2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rk4(i, i2, e16Var2, str3, i3, i4);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m9187g(int i, ye1 ye1Var, e16 e16Var, String str) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1977589948);
        int i2 = (tj3Var.m22120g(str) ? 4 : 2) | i | 48;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            e16Var = b16.f7762a;
            bq1.m4039O(c99.m4412e(e16Var, 1.0f), ui8.m22753b(8.0f), te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55824I, 0L, tj3Var), te1.m22000n(62, 0.0f), null, ci8.m4703P(-510788426, new iq0(str, 12), tj3Var), tj3Var, 196608, 16);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new gs0(str, e16Var, i, 4);
        }
    }
}
