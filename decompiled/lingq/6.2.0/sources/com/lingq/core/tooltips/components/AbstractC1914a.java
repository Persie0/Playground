package com.lingq.core.tooltips.components;

import androidx.compose.animation.core.C0059a;
import androidx.compose.animation.core.C0061c;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.onboarding.HighlightType;
import com.lingq.core.tooltips.R$drawable;
import java.util.List;
import p000.AbstractC3423or;
import p000.AbstractC3489q9;
import p000.C3445p2;
import p000.aa1;
import p000.b16;
import p000.bq1;
import p000.c99;
import p000.d32;
import p000.e16;
import p000.e28;
import p000.e6a;
import p000.eh0;
import p000.eq8;
import p000.fb2;
import p000.fda;
import p000.h6a;
import p000.ht5;
import p000.io2;
import p000.j6a;
import p000.k4a;
import p000.k9a;
import p000.l44;
import p000.l77;
import p000.ms5;
import p000.nj0;
import p000.o6a;
import p000.oha;
import p000.p84;
import p000.ps5;
import p000.pvc;
import p000.qh0;
import p000.se1;
import p000.ss5;
import p000.tj3;
import p000.ui3;
import p000.ux5;
import p000.vi3;
import p000.vz1;
import p000.we1;
import p000.x18;
import p000.xfa;
import p000.y27;
import p000.ye1;
import p000.zi3;
import p000.zr1;

/* JADX INFO: renamed from: com.lingq.core.tooltips.components.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1914a {
    /* JADX INFO: renamed from: a */
    public static final void m8782a(final e28 e28Var, ye1 ye1Var, int i) {
        int i2;
        int i3;
        Object objM23605K;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1450555929);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e28Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            final long j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55842a;
            C0061c c0061cM21691R = ss5.m21691R("FocusHighlight", tj3Var, 0);
            zr1 zr1Var = io2.f44349a;
            fda fdaVarM21703b0 = ss5.m21703b0(DescriptorProtos.Edition.EDITION_2023_VALUE, 0, zr1Var, 2);
            RepeatMode repeatMode = RepeatMode.Reverse;
            final l44 l44VarM21713i = ss5.m21713i(c0061cM21691R, 0.6f, 1.2f, ss5.m21687N(fdaVarM21703b0, repeatMode, 0L, 4), "FocusScale", tj3Var, 29112, 0);
            final l44 l44VarM21713i2 = ss5.m21713i(c0061cM21691R, 0.1f, 1.0f, ss5.m21687N(ss5.m21703b0(DescriptorProtos.Edition.EDITION_2023_VALUE, 0, zr1Var, 2), repeatMode, 0L, 4), "FocusAlpha", tj3Var, 29112, 0);
            final float fMo912g0 = ((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo912g0(24.0f);
            boolean zM22118f = tj3Var.m22118f(j);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22118f || objM22097O == p84Var) {
                objM23605K = vz1.m23605K(new aa1(aa1.m198b(0.0f, j)), new aa1(aa1.m198b(0.5f, j)), new aa1(j), new aa1(j), new aa1(aa1.m198b(0.5f, j)), new aa1(aa1.m198b(0.0f, j)));
                tj3Var.m22131l0(objM23605K);
            } else {
                objM23605K = objM22097O;
            }
            final o6a o6aVarM8792e = AbstractC1915b.m8792e((List) objM23605K, e28Var.m10803d(), tj3Var);
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            boolean zM22114d = tj3Var.m22114d(fMo912g0) | ((i2 & 14) == 4) | tj3Var.m22120g(l44VarM21713i) | tj3Var.m22120g(l44VarM21713i2) | tj3Var.m22120g(o6aVarM8792e) | tj3Var.m22118f(j);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22114d || objM22097O2 == p84Var) {
                i3 = 2;
                vi3 vi3Var = new vi3() { // from class: f6a
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        interfaceC0310a.getClass();
                        long jM10803d = e28Var.m10803d();
                        dh9 dh9Var = l44VarM21713i;
                        float fFloatValue = ((Number) dh9Var.getValue()).floatValue();
                        float f = fMo912g0;
                        el9 el9Var = new el9(12.0f, 0.0f, 0, 0, 30);
                        dh9 dh9Var2 = l44VarM21713i2;
                        interfaceC0310a.mo600l0(o6aVarM8792e, fFloatValue * f, jM10803d, ((Number) dh9Var2.getValue()).floatValue(), el9Var);
                        float fFloatValue2 = ((Number) dh9Var.getValue()).floatValue();
                        float fFloatValue3 = ((Number) dh9Var2.getValue()).floatValue() * 0.6f;
                        InterfaceC0310a.m1417c0(interfaceC0310a, j, fFloatValue2 * (f / 2.0f), jM10803d, fFloatValue3, null, 112);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(vi3Var);
                objM22097O2 = vi3Var;
            } else {
                i3 = 2;
            }
            eh0.m11124d(e16VarM4411d, (vi3) objM22097O2, tj3Var, 6);
        } else {
            i3 = 2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new e6a(e28Var, i, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8783b(e28 e28Var, boolean z, ye1 ye1Var, int i) {
        int i2;
        e28 e28Var2;
        int i3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-546195470);
        if ((i & 6) == 0) {
            i2 = i | (tj3Var.m22120g(e28Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            C0061c c0061cM21691R = ss5.m21691R("HandHighlight", tj3Var, 0);
            zr1 zr1Var = io2.f44350b;
            fda fdaVarM21703b0 = ss5.m21703b0(700, 0, zr1Var, 2);
            RepeatMode repeatMode = RepeatMode.Reverse;
            l44 l44VarM21713i = ss5.m21713i(c0061cM21691R, 0.0f, 6.0f, ss5.m21687N(fdaVarM21703b0, repeatMode, 0L, 4), "HandTranslateY", tj3Var, 29112, 0);
            l44 l44VarM21713i2 = ss5.m21713i(c0061cM21691R, 0.4f, 1.0f, ss5.m21687N(ss5.m21703b0(700, 0, zr1Var, 2), repeatMode, 0L, 4), "HandAlpha", tj3Var, 29112, 0);
            y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_tooltip_tap_hand, tj3Var, 0);
            fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            float fMo912g0 = fb2Var.mo912g0(48.0f);
            float fMo912g1 = fb2Var.mo912g0(((Number) l44VarM21713i.getValue()).floatValue());
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
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
            boolean zM22114d = tj3Var.m22114d(fMo912g0) | ((i2 & 14) == 4) | tj3Var.m22114d(fMo912g1);
            Object objM22097O = tj3Var.m22097O();
            if (zM22114d || objM22097O == we1.f66679a) {
                e28Var2 = e28Var;
                objM22097O = new k4a(e28Var2, fMo912g0, fMo912g1);
                tj3Var.m22131l0(objM22097O);
            } else {
                e28Var2 = e28Var;
            }
            bq1.m4042R(y27VarM18236U, null, AbstractC0309d.m1407b(c99.m4422o(pvc.m19527w(b16Var, (vi3) objM22097O), 48.0f), 0.0f, 0.0f, ((Number) l44VarM21713i2.getValue()).floatValue(), 0.0f, 0.0f, k9a.f46915b, null, false, 1047547), null, null, 0.0f, null, tj3Var, 56, 120);
            tj3Var = tj3Var;
            i3 = 1;
            tj3Var.m22139q(true);
        } else {
            e28Var2 = e28Var;
            i3 = 1;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new h6a(e28Var2, z, i, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8784c(final e28 e28Var, boolean z, ye1 ye1Var, int i) {
        int i2;
        int i3;
        Object obj;
        final boolean z2 = z;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2104268702);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e28Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22122h(z2) ? 32 : 16;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_tooltip_tap_hand, tj3Var, 0);
            fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            final float fMo912g0 = fb2Var.mo912g0(48.0f);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC3489q9.m19771a(0.0f);
                tj3Var.m22131l0(objM22097O);
            }
            C0059a c0059a = (C0059a) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC3489q9.m19771a(1.0f);
                tj3Var.m22131l0(objM22097O2);
            }
            C0059a c0059a2 = (C0059a) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC3489q9.m19771a(0.0f);
                tj3Var.m22131l0(objM22097O3);
            }
            final C0059a c0059a3 = (C0059a) objM22097O3;
            boolean zM22124i = tj3Var.m22124i(c0059a) | tj3Var.m22124i(c0059a2) | tj3Var.m22124i(c0059a3);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i || objM22097O4 == p84Var) {
                objM22097O4 = new TooltipHighlightsKt$HighlightHandSwipe$1$1(c0059a, c0059a2, c0059a3, null);
                tj3Var.m22131l0(objM22097O4);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O4, xfa.f68157a);
            final float fIntBitsToFloat = z2 ? Float.intBitsToFloat((int) (e28Var.m10803d() & 4294967295L)) - fb2Var.mo912g0(15.0f) : Float.intBitsToFloat((int) (e28Var.m10803d() & 4294967295L));
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
            se1.f60731q.getClass();
            int i4 = i2;
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
            boolean zM22124i2 = ((i4 & 112) == 32) | tj3Var.m22124i(c0059a3) | ((i4 & 14) == 4) | tj3Var.m22114d(fMo912g0) | tj3Var.m22114d(fIntBitsToFloat);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O5 == p84Var) {
                z2 = z;
                obj = new vi3() { // from class: g6a
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) {
                        ((fb2) obj2).getClass();
                        boolean z3 = z2;
                        C0059a c0059a4 = c0059a3;
                        int iM21693T = z3 ? 0 : ss5.m21693T(((Number) c0059a4.m745d()).floatValue());
                        return new f84((((long) (ss5.m21693T(fIntBitsToFloat) + (z3 ? ss5.m21693T(((Number) c0059a4.m745d()).floatValue()) : 0))) & 4294967295L) | (((long) (ss5.m21693T(Float.intBitsToFloat((int) (e28Var.m10803d() >> 32)) - (fMo912g0 / 2.0f)) + iM21693T)) << 32));
                    }
                };
                tj3Var.m22131l0(obj);
            } else {
                obj = objM22097O5;
                z2 = z;
            }
            e16 e16VarM1407b = AbstractC0309d.m1407b(c99.m4422o(pvc.m19527w(b16Var, (vi3) obj), 48.0f), ((Number) c0059a2.m745d()).floatValue(), ((Number) c0059a2.m745d()).floatValue(), ((Number) c0059a.m745d()).floatValue(), 0.0f, 0.0f, k9a.f46915b, null, false, 1047544);
            i3 = 0;
            bq1.m4042R(y27VarM18236U, null, e16VarM1407b, null, null, 0.0f, null, tj3Var, 56, 120);
            tj3Var.m22139q(true);
        } else {
            i3 = 0;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new h6a(e28Var, z2, i, i3);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8785d(e28 e28Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(888675494);
        if ((i & 6) == 0) {
            i2 = i | (tj3Var.m22120g(e28Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            long j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55842a;
            C0061c c0061cM21691R = ss5.m21691R("IncentiveHighlight", tj3Var, 0);
            zr1 zr1Var = io2.f44350b;
            fda fdaVarM21703b0 = ss5.m21703b0(DescriptorProtos.Edition.EDITION_2023_VALUE, 0, zr1Var, 2);
            RepeatMode repeatMode = RepeatMode.Restart;
            int i3 = i2;
            l44 l44VarM21713i = ss5.m21713i(c0061cM21691R, 0.7f, 1.0f, ss5.m21687N(fdaVarM21703b0, repeatMode, 0L, 4), "IncentiveScale", tj3Var, 29112, 0);
            l44 l44VarM21713i2 = ss5.m21713i(c0061cM21691R, 0.4f, 0.0f, ss5.m21687N(ss5.m21703b0(DescriptorProtos.Edition.EDITION_2023_VALUE, 0, zr1Var, 2), repeatMode, 0L, 4), "IncentiveAlpha", tj3Var, 29112, 0);
            boolean zM22118f = tj3Var.m22118f(j);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22118f || objM22097O == p84Var) {
                objM22097O = vz1.m23605K(new aa1(aa1.m198b(0.0f, j)), new aa1(aa1.m198b(0.5f, j)), new aa1(j), new aa1(j), new aa1(aa1.m198b(0.5f, j)), new aa1(aa1.m198b(0.0f, j)));
                tj3Var.m22131l0(objM22097O);
            }
            o6a o6aVarM8792e = AbstractC1915b.m8792e((List) objM22097O, e28Var.m10803d(), tj3Var);
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            boolean zM22120g = tj3Var.m22120g(l44VarM21713i) | ((i3 & 14) == 4) | tj3Var.m22120g(l44VarM21713i2) | tj3Var.m22120g(o6aVarM8792e);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                C3445p2 c3445p2 = new C3445p2(e28Var, o6aVarM8792e, l44VarM21713i, l44VarM21713i2, 20);
                tj3Var.m22131l0(c3445p2);
                objM22097O2 = c3445p2;
            }
            eh0.m11124d(e16VarM4411d, (vi3) objM22097O2, tj3Var, 6);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new e6a(e28Var, i, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8786e(final e28 e28Var, ye1 ye1Var, int i) {
        int i2;
        int i3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1017580930);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e28Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            final long j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55842a;
            C0061c c0061cM21691R = ss5.m21691R("IndicatorHighlight", tj3Var, 0);
            zr1 zr1Var = io2.f44349a;
            fda fdaVarM21703b0 = ss5.m21703b0(1200, 0, zr1Var, 2);
            RepeatMode repeatMode = RepeatMode.Reverse;
            int i4 = i2;
            final l44 l44VarM21713i = ss5.m21713i(c0061cM21691R, 0.6f, 1.4f, ss5.m21687N(fdaVarM21703b0, repeatMode, 0L, 4), "IndicatorScale", tj3Var, 29112, 0);
            final l44 l44VarM21713i2 = ss5.m21713i(c0061cM21691R, 0.8f, 0.2f, ss5.m21687N(ss5.m21703b0(1200, 0, zr1Var, 2), repeatMode, 0L, 4), "IndicatorAlpha", tj3Var, 29112, 0);
            final float fMo912g0 = ((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo912g0(24.0f);
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            boolean zM22114d = ((i4 & 14) == 4) | tj3Var.m22114d(fMo912g0) | tj3Var.m22120g(l44VarM21713i) | tj3Var.m22120g(l44VarM21713i2) | tj3Var.m22118f(j);
            Object objM22097O = tj3Var.m22097O();
            if (zM22114d || objM22097O == we1.f66679a) {
                i3 = 0;
                vi3 vi3Var = new vi3() { // from class: i6a
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        interfaceC0310a.getClass();
                        long jM10803d = e28Var.m10803d();
                        dh9 dh9Var = l44VarM21713i;
                        float fFloatValue = ((Number) dh9Var.getValue()).floatValue();
                        float f = fMo912g0;
                        el9 el9Var = new el9(6.0f, 0.0f, 0, 0, 30);
                        dh9 dh9Var2 = l44VarM21713i2;
                        float fFloatValue2 = 0.6f * ((Number) dh9Var2.getValue()).floatValue();
                        long j2 = j;
                        InterfaceC0310a.m1417c0(interfaceC0310a, j2, fFloatValue * f, jM10803d, fFloatValue2, el9Var, 96);
                        InterfaceC0310a.m1417c0(interfaceC0310a, j2, ((Number) dh9Var.getValue()).floatValue() * f * 0.5f, jM10803d, ((Number) dh9Var2.getValue()).floatValue(), null, 112);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(vi3Var);
                objM22097O = vi3Var;
            } else {
                i3 = 0;
            }
            eh0.m11124d(e16VarM4411d, (vi3) objM22097O, tj3Var, 6);
        } else {
            i3 = 0;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new e6a(e28Var, i, i3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8787f(HighlightType highlightType, e28 e28Var, ye1 ye1Var, int i) {
        highlightType.getClass();
        e28Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1575891254);
        int i2 = (tj3Var.m22116e(highlightType.ordinal()) ? 4 : 2) | i | (tj3Var.m22120g(e28Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            switch (j6a.f45124a[highlightType.ordinal()]) {
                case 1:
                    tj3Var.m22111b0(1691964966);
                    m8782a(e28Var, tj3Var, (i2 >> 3) & 14);
                    tj3Var.m22139q(false);
                    break;
                case 2:
                    tj3Var.m22111b0(1691966871);
                    m8783b(e28Var, false, tj3Var, ((i2 >> 3) & 14) | 48);
                    tj3Var.m22139q(false);
                    break;
                case 3:
                    tj3Var.m22111b0(1691969558);
                    m8783b(e28Var, true, tj3Var, ((i2 >> 3) & 14) | 48);
                    tj3Var.m22139q(false);
                    break;
                case 4:
                    tj3Var.m22111b0(1691972124);
                    m8784c(e28Var, false, tj3Var, ((i2 >> 3) & 14) | 48);
                    tj3Var.m22139q(false);
                    break;
                case 5:
                    tj3Var.m22111b0(1691975099);
                    m8784c(e28Var, true, tj3Var, ((i2 >> 3) & 14) | 48);
                    tj3Var.m22139q(false);
                    break;
                case 6:
                    tj3Var.m22111b0(1691977802);
                    m8785d(e28Var, tj3Var, (i2 >> 3) & 14);
                    tj3Var.m22139q(false);
                    break;
                case 7:
                    tj3Var.m22111b0(1691979978);
                    m8786e(e28Var, tj3Var, (i2 >> 3) & 14);
                    tj3Var.m22139q(false);
                    break;
                case 8:
                    tj3Var.m22111b0(911836341);
                    tj3Var.m22139q(false);
                    break;
                default:
                    throw ux5.m23001x(tj3Var, 1691963808, false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(highlightType, i, 23, e28Var);
        }
    }
}
