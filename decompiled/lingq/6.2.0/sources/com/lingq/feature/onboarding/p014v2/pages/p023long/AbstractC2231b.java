package com.lingq.feature.onboarding.p014v2.pages.p023long;

import android.content.Context;
import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.feature.onboarding.R$drawable;
import com.lingq.feature.onboarding.R$string;
import com.lingq.feature.onboarding.p014v2.pages.p023long.AbstractC2231b;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3489q9;
import p000.AbstractC3584sr;
import p000.C0023al;
import p000.C3441oz;
import p000.C3587su;
import p000.C3661uu;
import p000.aa1;
import p000.ab1;
import p000.aj3;
import p000.as0;
import p000.as4;
import p000.b16;
import p000.bb1;
import p000.bc3;
import p000.bna;
import p000.bq1;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.dh9;
import p000.dn7;
import p000.dr3;
import p000.e16;
import p000.e65;
import p000.ec0;
import p000.eh0;
import p000.fc0;
import p000.fe9;
import p000.fn5;
import p000.g4b;
import p000.ge9;
import p000.gj9;
import p000.gm5;
import p000.hl1;
import p000.ht5;
import p000.ib1;
import p000.iq0;
import p000.js3;
import p000.ks9;
import p000.l70;
import p000.l77;
import p000.lw9;
import p000.mfc;
import p000.mo9;
import p000.ms5;
import p000.nj0;
import p000.oha;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.ps5;
import p000.qa4;
import p000.qc9;
import p000.qh0;
import p000.qj8;
import p000.r65;
import p000.se0;
import p000.se1;
import p000.sj8;
import p000.ss5;
import p000.t66;
import p000.te1;
import p000.thb;
import p000.tj3;
import p000.ui3;
import p000.ui8;
import p000.ux5;
import p000.vh9;
import p000.vi3;
import p000.vx9;
import p000.vz1;
import p000.wa5;
import p000.we1;
import p000.x18;
import p000.xfa;
import p000.ye1;
import p000.yu4;
import p000.zf1;
import p000.zi3;
import p000.zr0;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.pages.long.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2231b {
    /* JADX INFO: renamed from: a */
    public static final void m9188a(int i, int i2, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str) {
        e16 e16Var2;
        Object commitmentPageKt$CommitmentPage$1$1;
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1971595036);
        int i3 = i2 | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | 3072;
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            dr3 dr3Var = (dr3) tj3Var.m22128k(AbstractC0402n.f4820l);
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            tj3Var.m22111b0(-622242274);
            String strM17093L = AbstractC3352my.m17093L(context, str);
            if (strM17093L.length() == 0) {
                strM17093L = vz1.m23620a0(tj3Var, R$string.onboarding_v2_commitment_default_language);
            }
            tj3Var.m22139q(false);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC3489q9.m19771a(0.0f);
                tj3Var.m22131l0(objM22097O);
            }
            C0059a c0059a = (C0059a) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O2);
            }
            t66 t66Var = (t66) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O3);
            }
            t66 t66Var2 = (t66) objM22097O3;
            Boolean bool = (Boolean) t66Var.getValue();
            bool.getClass();
            boolean zM22124i = tj3Var.m22124i(c0059a) | tj3Var.m22124i(dr3Var) | ((i3 & 896) == 256);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i || objM22097O4 == p84Var) {
                commitmentPageKt$CommitmentPage$1$1 = new CommitmentPageKt$CommitmentPage$1$1(c0059a, dr3Var, ui3Var, t66Var2, t66Var, null);
                tj3Var.m22131l0(commitmentPageKt$CommitmentPage$1$1);
            } else {
                commitmentPageKt$CommitmentPage$1$1 = objM22097O4;
            }
            d32.m10047k(tj3Var, (zi3) commitmentPageKt$CommitmentPage$1$1, bool);
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(l70.m15962y(c99.m4411d(b16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.im_onboarding_commit, tj3Var, 0), null, c99.m4416i(c99.m4412e(b16Var, 1.0f), 0.0f, 180.0f, 1), null, hl1.f42565b, 0.0f, null, tj3Var, 25016, 104);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_commitment_title), null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71400d, tj3Var, 0, 0, 130042);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38956e));
            lw9.m16554b(vz1.m23618Z(R$string.onboarding_v2_commitment_body, new Object[]{strM17093L, Integer.valueOf(i)}, tj3Var), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 130042);
            thb.m22044c(tj3Var, new as4(1.0f, true));
            float fFloatValue = ((Number) c0059a.m745d()).floatValue();
            boolean z = !((Boolean) t66Var2.getValue()).booleanValue();
            Object objM22097O5 = tj3Var.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = new C0023al(6, t66Var);
                tj3Var.m22131l0(objM22097O5);
            }
            m9189b(fFloatValue, z, (vi3) objM22097O5, null, tj3Var, 384);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38958g));
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_commitment_fingerprint_hint), c99.m4412e(b16Var, 1.0f), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 48, 0, 130040);
            tj3Var = tj3Var;
            ux5.m23003z(b16Var, ge9.m12515a(tj3Var).f38957f, tj3Var, true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ib1(i, i2, ui3Var, e16Var2, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9189b(final float f, final boolean z, final vi3 vi3Var, e16 e16Var, ye1 ye1Var, final int i) {
        final e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-982064160);
        int i2 = i | (tj3Var.m22114d(f) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | 3072;
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4422o = c99.m4422o(b16Var, 200.0f);
            Boolean boolValueOf = Boolean.valueOf(z);
            boolean z2 = (i2 & 112) == 32;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z2 || objM22097O == p84Var) {
                objM22097O = new C2230a(vi3Var, z);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM16957a = mo9.m16957a(e16VarM4422o, boolValueOf, (PointerInputEventHandler) objM22097O);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM16957a);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.im_onboarding_fingerprint, tj3Var, 0), null, c99.m4411d(b16Var, 1.0f), null, hl1.f42565b, 0.0f, null, tj3Var, 25016, 104);
            boolean z3 = (i2 & 14) == 4;
            Object objM22097O2 = tj3Var.m22097O();
            if (z3 || objM22097O2 == p84Var) {
                objM22097O2 = new gj9(0, f);
                tj3Var.m22131l0(objM22097O2);
            }
            dn7.m10493b((ui3) objM22097O2, c99.m4411d(b16Var, 1.0f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55842a, 4.0f, aa1.f411j, 0, 0.0f, tj3Var, 3120, 96);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(f, z, vi3Var, e16Var2, i) { // from class: jb1

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ float f45370a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f45371b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ vi3 f45372c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ e16 f45373d;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(385);
                    AbstractC2231b.m9189b(this.f45370a, this.f45371b, this.f45372c, this.f45373d, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9190c(int i, int i2, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, String str2) {
        e16 e16Var2;
        str.getClass();
        str2.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1657148439);
        int i3 = i2 | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22116e(i) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 24576;
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            String strM17093L = AbstractC3352my.m17093L((Context) tj3Var.m22128k(AbstractC0394f.f4761b), str);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1256f(0.0f);
                tj3Var.m22131l0(objM22097O);
            }
            qc9 qc9Var = (qc9) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new PaywallConfidenceLongPageKt$PaywallConfidenceLongPage$1$1(qc9Var, null);
                tj3Var.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O2, xfa.f68157a);
            dh9 dh9VarM750b = AbstractC0060b.m750b(qc9Var.m19861h(), ss5.m21703b0(1500, 0, null, 6), "paywallConfidenceLongLineProgress", null, tj3Var, 3120, 20);
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(thb.m22066y(thb.m22038C(l70.m15962y(c99.m4411d(b16Var, 1.0f)))), ge9.m12515a(tj3Var).f38957f, 0.0f, 2);
            ec0 ec0Var = nj0.f52792K;
            C3587su c3587su = eh0.f37238d;
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
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
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.onboarding_v2_pre_paywall_long_title), null, p58.m18900f(tj3Var).f55870o, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var).f71400d, 0L, 0L, bc3.f8323i, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var, 0, 0, 130042);
            tj3Var = tj3Var;
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            m9194g(tj3Var, 0);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            m9193f(i, (i3 >> 3) & 126, tj3Var, str2, strM17093L);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            m9199l(tj3Var, 0);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            m9192e(strM17093L, tj3Var, 0);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            m9195h(((Number) dh9VarM750b.getValue()).floatValue(), tj3Var, 0);
            tj3Var.m22139q(true);
            ss5.m21710f(AbstractC3584sr.m21611X(ux5.m22984g(b16Var, ge9.m12515a(tj3Var).f38952a, tj3Var, b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), null, null, false, ui3Var, mfc.f51259a, tj3Var, (57344 & (i3 << 3)) | 196608, 14);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new js3(str, str2, i, ui3Var, e16Var2, i2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9191d(String str, String str2, ye1 ye1Var, int i) {
        String str3 = str2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(135080376);
        int i2 = i | (tj3Var.m22120g(str3) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
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
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, 6, 0, 131070);
            str3 = str2;
            lw9.m16554b(str3, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, (i2 >> 3) & 14, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new r65(str, i, 2, str3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9192e(String str, ye1 ye1Var, int i) {
        String str2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(727146013);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.onboarding_paywall_confidence_plan_title);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71403g, 0L, 0L, bc3.f8323i, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            str2 = str;
            bq1.m4039O(ux5.m22984g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, tj3Var, b16Var, 1.0f), ui8.m22753b(8.0f), te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55824I, 0L, tj3Var), te1.m22000n(62, 0.0f), null, ci8.m4703P(2059360773, new iq0(str2, 11), tj3Var), tj3Var, 196614, 16);
            tj3Var.m22139q(true);
        } else {
            str2 = str;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3441oz(str2, i, 24);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9193f(int i, int i2, ye1 ye1Var, String str, String str2) {
        int i3;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1066869902);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var2.m22120g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var2.m22116e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var2.m22120g(str2) ? 256 : 128;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
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
            oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.im_onboarding_paywall_people, tj3Var2, 0), null, pb1.m19045o(c99.m4414g(c99.m4412e(b16Var, 1.0f), 180.0f), ui8.m22754c(8.0f, 8.0f, 12)), null, hl1.f42564a, 0.0f, null, tj3Var2, 24632, 104);
            bq1.m4039O(c99.m4412e(b16Var, 1.0f), ui8.m22754c(0.0f, 0.0f, 3), te1.m21999m(0, 14, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55842a, 0L, tj3Var2), te1.m22000n(62, 0.0f), null, ci8.m4703P(1397639514, new as0(str, i, 2, str2), tj3Var2), tj3Var2, 196614, 16);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qa4(str, i, str2, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m9194g(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1037087141);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            bq1.m4039O(c99.m4412e(b16.f7762a, 1.0f), ui8.m22753b(8.0f), te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55824I, 0L, tj3Var), te1.m22000n(62, 0.0f), null, mfc.f51260b, tj3Var, 196614, 16);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yu4(i, 25);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m9195h(float f, ye1 ye1Var, int i) {
        final float f2;
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(270567559);
        int i3 = i | (tj3Var.m22114d(f) ? 4 : 2);
        if (tj3Var.m22099R(i3 & 1, (i3 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.onboarding_v2_pre_paywall_long_reach_goals_title);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71403g, 0L, 0L, bc3.f8323i, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            f2 = f;
            bq1.m4039O(ux5.m22984g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, tj3Var, b16Var, 1.0f), ui8.m22753b(8.0f), te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55824I, 0L, tj3Var), te1.m22000n(62, 0.0f), null, ci8.m4703P(628697711, new aj3() { // from class: r67
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strM23620a1 = vz1.m23620a0(tj3Var2, R$string.onboarding_v2_goals_line_verbal_proficiency);
                        String strM23620a2 = vz1.m23620a0(tj3Var2, R$string.onboarding_v2_goals_line_today);
                        String strM23620a3 = vz1.m23620a0(tj3Var2, R$string.onboarding_v2_goals_line_after_12_months);
                        String strM23620a4 = vz1.m23620a0(tj3Var2, R$string.onboarding_v2_goals_line_lingq_members);
                        String strM23620a5 = vz1.m23620a0(tj3Var2, R$string.onboarding_v2_goals_line_other_learners);
                        int i4 = R$drawable.im_onboarding_paywall_confidence_lingq_member;
                        int i5 = R$drawable.im_onboarding_paywall_confidence_other_learner;
                        e16 e16VarM21607T = AbstractC3584sr.m21607T(b16.f7762a, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38952a);
                        vh9 vh9Var2 = ps5.f56764b;
                        kxb.m15719e(f2, strM23620a1, strM23620a2, strM23620a3, strM23620a4, strM23620a5, i4, i5, e16VarM21607T, 220.0f, 44.0f, ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55842a, ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55875s, 0L, ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55817B, false, 0.98f, 0.34f, ((ms5) tj3Var2.m22128k(vh9Var2)).f51799a.f55875s, tj3Var2, 805306368, 14352390, 8192);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 196614, 16);
            i2 = 1;
            tj3Var.m22139q(true);
        } else {
            f2 = f;
            i2 = 1;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fn5(i, f2, i2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m9196i(int i, String str, ye1 ye1Var, int i2) {
        String str2 = str;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-796534726);
        int i3 = i2 | (tj3Var.m22116e(i) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(2.0f, true, new gm5(28)), nj0.f52792K, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16.f7762a);
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
            String strM23620a0 = vz1.m23620a0(tj3Var, i);
            vh9 vh9Var = ps5.f56764b;
            vx9 vx9VarM23584b = vx9.m23584b(((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, 0L, 0L, bc3.f8323i, null, null, 0L, null, null, 0, 0L, null, 16777211);
            long j = aa1.f406e;
            lw9.m16554b(strM23620a0, null, j, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9VarM23584b, tj3Var, 384, 0, 130042);
            str2 = str;
            lw9.m16554b(str2, null, j, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, ((i3 >> 3) & 14) | 384, 0, 130042);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zr0(i, str2, i2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m9197j(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1828550375);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4414g(c99.m4426s(b16Var, 1.0f), 36.0f), 0.0f, 2.0f, 1);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            qh0.m19963a(AbstractC3584sr.m21607T(c99.m4411d(b16Var, 1.0f), 0.0f), tj3Var, 6);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yu4(i, 24);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m9198k(ye1 ye1Var, int i) {
        fc0 fc0Var = nj0.f52817l;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1271783061);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            List listM23605K = vz1.m23605K(new g4b("📚", R$string.onboarding_v2_pre_paywall_long_tile_unlimited_lessons), new g4b("💬", R$string.onboarding_v2_pre_paywall_long_tile_practice_with_ai), new g4b("🗣️", R$string.onboarding_v2_pre_paywall_long_tile_quizzes_challenges), new g4b("🔄", R$string.onboarding_v2_pre_paywall_long_tile_offline_access), new g4b("⬇️", R$string.onboarding_v2_pre_paywall_long_tile_import_anything), new g4b("📈", R$string.onboarding_v2_pre_paywall_long_tile_track_progress));
            zf1 zf1Var = ge9.f40637a;
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
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
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), fc0Var, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            tj3Var.m22111b0(255581360);
            Iterator it = listM23605K.subList(0, 3).iterator();
            while (it.hasNext()) {
                m9200m((g4b) it.next(), new as4(1.0f, true), tj3Var, 0);
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28)), fc0Var, tj3Var, 0);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a2);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m3);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode3));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c3);
            tj3Var.m22111b0(-167524569);
            Iterator it2 = listM23605K.subList(3, 6).iterator();
            while (it2.hasNext()) {
                m9200m((g4b) it2.next(), new as4(1.0f, true), tj3Var, 0);
            }
            AbstractC3393o1.m17723A(tj3Var, false, true, true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yu4(i, 27);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m9199l(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2077094242);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.onboarding_v2_pre_paywall_long_what_you_get_title);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55870o, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71403g, 0L, 0L, bc3.f8323i, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var, 0, 0, 131066);
            tj3Var = tj3Var;
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a));
            m9198k(tj3Var, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yu4(i, 26);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m9200m(g4b g4bVar, e16 e16Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1267598543);
        int i2 = (tj3Var.m22120g(g4bVar) ? 4 : 2) | i | (tj3Var.m22120g(e16Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            e16Var2 = e16Var;
            bq1.m4039O(e16Var2, ui8.m22753b(8.0f), te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55824I, 0L, tj3Var), te1.m22000n(62, 0.0f), null, ci8.m4703P(-1435585409, new se0(g4bVar, 26), tj3Var), tj3Var, ((i2 >> 3) & 14) | 196608, 16);
        } else {
            e16Var2 = e16Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new wa5(g4bVar, i, 17, e16Var2);
        }
    }
}
