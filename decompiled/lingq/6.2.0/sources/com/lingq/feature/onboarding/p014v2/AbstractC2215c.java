package com.lingq.feature.onboarding.p014v2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.compose.animation.core.AbstractC0060b;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.material3.C0232g0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.compose.AbstractC0711a;
import com.facebook.login.C0938l;
import com.facebook.login.C0939m;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.common.api.Scope;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.common.util.LqAnalyticsVariant;
import com.lingq.feature.onboarding.p014v2.AbstractC2215c;
import com.lingq.feature.onboarding.p014v2.OnboardingPage;
import com.lingq.feature.onboarding.p014v2.domain.C2223d;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import com.lingq.feature.onboarding.p014v2.pages.AbstractC2228a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.jvm.internal.FunctionReference;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.C3028g7;
import p000.C3386nv;
import p000.C3504qn;
import p000.C3509qs;
import p000.C3757xf;
import p000.aj3;
import p000.as4;
import p000.au4;
import p000.av6;
import p000.b16;
import p000.b34;
import p000.b4d;
import p000.bb0;
import p000.bj3;
import p000.bv6;
import p000.c99;
import p000.cc4;
import p000.ci8;
import p000.cv6;
import p000.cx6;
import p000.czc;
import p000.d32;
import p000.deb;
import p000.dh9;
import p000.di0;
import p000.dm0;
import p000.dn7;
import p000.dua;
import p000.dv6;
import p000.dx6;
import p000.e16;
import p000.e3d;
import p000.eeb;
import p000.eh0;
import p000.et6;
import p000.ev6;
import p000.ex6;
import p000.fa4;
import p000.fe9;
import p000.fs6;
import p000.fv6;
import p000.ge9;
import p000.gi5;
import p000.gj9;
import p000.gm5;
import p000.gr3;
import p000.gu6;
import p000.gv6;
import p000.hd9;
import p000.hm5;
import p000.hp5;
import p000.hv6;
import p000.i75;
import p000.ifc;
import p000.iqb;
import p000.iv6;
import p000.jv6;
import p000.kl3;
import p000.kv4;
import p000.kv6;
import p000.kx6;
import p000.l77;
import p000.ld9;
import p000.lda;
import p000.lm5;
import p000.lv6;
import p000.lx6;
import p000.mc9;
import p000.ms5;
import p000.mv6;
import p000.n7d;
import p000.nj0;
import p000.npb;
import p000.nv6;
import p000.o72;
import p000.oa5;
import p000.oha;
import p000.omd;
import p000.or1;
import p000.ov6;
import p000.p84;
import p000.pfa;
import p000.ps5;
import p000.pv6;
import p000.q7a;
import p000.qj8;
import p000.qm3;
import p000.qv6;
import p000.r3d;
import p000.ru6;
import p000.rv6;
import p000.se1;
import p000.sed;
import p000.si5;
import p000.sj8;
import p000.sjd;
import p000.sv6;
import p000.t66;
import p000.thb;
import p000.thd;
import p000.tj3;
import p000.tu6;
import p000.tv6;
import p000.u91;
import p000.ub5;
import p000.ui3;
import p000.uk9;
import p000.ut6;
import p000.uu6;
import p000.uv6;
import p000.v27;
import p000.vf2;
import p000.vh9;
import p000.vi3;
import p000.vu6;
import p000.vv6;
import p000.vz1;
import p000.vz5;
import p000.we1;
import p000.wf2;
import p000.wfb;
import p000.wu6;
import p000.x18;
import p000.xfa;
import p000.xu6;
import p000.y38;
import p000.y47;
import p000.ye1;
import p000.yh7;
import p000.ym5;
import p000.yu6;
import p000.zf1;
import p000.zi3;
import p000.zu6;

/* JADX INFO: renamed from: com.lingq.feature.onboarding.v2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2215c {
    /* JADX WARN: Code duplicated, block: B:104:0x0214  */
    /* JADX WARN: Code duplicated, block: B:106:0x0238  */
    /* JADX WARN: Code duplicated, block: B:117:0x0262  */
    /* JADX WARN: Code duplicated, block: B:119:0x0286  */
    /* JADX WARN: Code duplicated, block: B:130:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:132:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:143:0x02f5  */
    /* JADX WARN: Code duplicated, block: B:145:0x0318  */
    /* JADX WARN: Code duplicated, block: B:156:0x0340  */
    /* JADX WARN: Code duplicated, block: B:160:0x0365  */
    /* JADX WARN: Code duplicated, block: B:171:0x038c  */
    /* JADX WARN: Code duplicated, block: B:173:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:174:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:185:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:187:0x0412  */
    /* JADX WARN: Code duplicated, block: B:191:0x043d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0447 A[PHI: r16
      0x0447: PHI (r16v15 java.lang.String) = (r16v12 java.lang.String), (r16v17 java.lang.String) binds: [B:194:0x0445, B:192:0x0440] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:196:0x044a  */
    /* JADX WARN: Code duplicated, block: B:199:0x0451 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:200:0x0453  */
    /* JADX WARN: Code duplicated, block: B:203:0x0462  */
    /* JADX WARN: Code duplicated, block: B:205:0x0468  */
    /* JADX WARN: Code duplicated, block: B:211:0x0476 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x0478  */
    /* JADX WARN: Code duplicated, block: B:214:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:225:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:227:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:238:0x0513  */
    /* JADX WARN: Code duplicated, block: B:243:0x053c  */
    /* JADX WARN: Code duplicated, block: B:244:0x0547  */
    /* JADX WARN: Code duplicated, block: B:246:0x0569  */
    /* JADX WARN: Code duplicated, block: B:247:0x057b  */
    /* JADX WARN: Code duplicated, block: B:258:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:260:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:261:0x05d8  */
    /* JADX WARN: Code duplicated, block: B:262:0x060f  */
    /* JADX WARN: Code duplicated, block: B:273:0x0639  */
    /* JADX WARN: Code duplicated, block: B:285:0x065d  */
    /* JADX WARN: Code duplicated, block: B:290:0x067d  */
    /* JADX WARN: Code duplicated, block: B:291:0x06a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:64:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:0x014f  */
    /* JADX WARN: Code duplicated, block: B:78:0x0165  */
    /* JADX WARN: Code duplicated, block: B:79:0x0178  */
    /* JADX WARN: Code duplicated, block: B:80:0x0198  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ea  */
    /* JADX INFO: renamed from: a */
    public static final void m9157a(final OnboardingPage onboardingPage, final lx6 lx6Var, final ym5 ym5Var, final boolean z, final boolean z2, final MiniLessonTemplate miniLessonTemplate, final vz5 vz5Var, final boolean z3, final dx6 dx6Var, final vi3 vi3Var, ye1 ye1Var, final int i) {
        int i2;
        boolean z4;
        Object objM22097O;
        boolean z5;
        int i3;
        p84 p84Var;
        ui3 ui3Var;
        int[] iArr;
        p84 p84Var2;
        boolean z6;
        Object objM22097O2;
        boolean z7;
        boolean z8;
        Object objM22097O3;
        String str;
        String str2;
        boolean z9;
        Object objM22097O4;
        boolean z10;
        Object objM22097O5;
        boolean z11;
        Object objM22097O6;
        boolean z12;
        boolean z13;
        Object objM22097O7;
        int i4;
        boolean z14;
        Object objM22097O8;
        boolean z15;
        Object objM22097O9;
        boolean z16;
        Object objM22097O10;
        int i5;
        int i6;
        boolean z17;
        Object objM22097O11;
        ui3 ui3Var2;
        boolean z18;
        Object objM22097O12;
        boolean z19;
        Object objM22097O13;
        boolean z20;
        Object objM22097O14;
        boolean z21;
        Object objM22097O15;
        boolean z22;
        Object objM22097O16;
        boolean z23;
        Object objM22097O17;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(115379135);
        int i7 = i | (tj3Var.m22116e(onboardingPage.ordinal()) ? 4 : 2) | (tj3Var.m22124i(lx6Var) ? 32 : 16) | (tj3Var.m22124i(ym5Var) ? 256 : 128) | (tj3Var.m22122h(z) ? 2048 : 1024) | (tj3Var.m22122h(z2) ? 16384 : 8192) | (tj3Var.m22124i(miniLessonTemplate) ? 131072 : 65536) | (tj3Var.m22124i(vz5Var) ? 1048576 : 524288) | (tj3Var.m22122h(z3) ? 8388608 : 4194304) | (tj3Var.m22120g(dx6Var) ? 67108864 : 33554432) | (tj3Var.m22124i(vi3Var) ? 536870912 : 268435456);
        boolean z24 = true;
        if (tj3Var.m22099R(i7 & 1, (i7 & 306783379) != 306783378)) {
            int i8 = i7 & 14;
            int i9 = i7 & 126;
            int i10 = i7 >> 9;
            int i11 = i7 >> 12;
            int i12 = (i10 & 7168) | (i10 & 896) | i9 | (i11 & 57344) | (i11 & 458752);
            tj3Var.m22111b0(939325770);
            int i13 = (i12 & 458752) ^ 196608;
            if (i13 <= 131072 || !tj3Var.m22120g(vi3Var)) {
                i2 = i7;
                if ((i12 & 196608) != 131072) {
                    z4 = false;
                }
                objM22097O = tj3Var.m22097O();
                z5 = z4;
                i3 = i10;
                p84Var = we1.f66679a;
                if (z5 || objM22097O == p84Var) {
                    objM22097O = new oa5(vi3Var, 5);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3Var = (ui3) objM22097O;
                iArr = kx6.f48544a;
                switch (iArr[onboardingPage.ordinal()]) {
                    case 1:
                        p84Var2 = p84Var;
                        tj3Var.m22111b0(748945618);
                        ui3 ui3Var3 = dx6Var.f36368a;
                        boolean z25 = lx6Var.f50249h;
                        z6 = (i13 <= 131072 && tj3Var.m22120g(vi3Var)) || (i12 & 196608) == 131072;
                        objM22097O2 = tj3Var.m22097O();
                        if (z6 || objM22097O2 == p84Var2) {
                            objM22097O2 = new oa5(vi3Var, 6);
                            tj3Var.m22131l0(objM22097O2);
                        }
                        omd.m18155k(ui3Var, ui3Var3, z25, (ui3) objM22097O2, null, tj3Var, 0);
                        z7 = false;
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(z7);
                        tj3Var.m22111b0(1286431536);
                        tj3Var.m22139q(z7);
                        z12 = true;
                        break;
                    case 2:
                        p84Var2 = p84Var;
                        tj3Var.m22111b0(748957194);
                        String str3 = lx6Var.f50244c.f27289a;
                        z8 = (i13 <= 131072 && tj3Var.m22120g(vi3Var)) || (i12 & 196608) == 131072;
                        objM22097O3 = tj3Var.m22097O();
                        if (z8 || objM22097O3 == p84Var2) {
                            objM22097O3 = new kl3(vi3Var, 4);
                            tj3Var.m22131l0(objM22097O3);
                        }
                        thd.m22069a(str3, (vi3) objM22097O3, lx6Var.f50245d, ui3Var, null, tj3Var, 0);
                        z7 = false;
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(z7);
                        tj3Var.m22111b0(1286431536);
                        tj3Var.m22139q(z7);
                        z12 = true;
                        break;
                    case 3:
                        p84Var2 = p84Var;
                        tj3Var.m22111b0(748967088);
                        OnboardingSelections onboardingSelections = lx6Var.f50244c;
                        String str4 = onboardingSelections.f27289a;
                        str = onboardingSelections.f27290b;
                        List list = lx6Var.f50248g;
                        wf2 wf2Var = new wf2(miniLessonTemplate, vz5Var);
                        boolean z26 = lx6Var.f50250i;
                        if (i13 > 131072 || !tj3Var.m22120g(vi3Var)) {
                            str2 = str;
                            if ((i12 & 196608) != 131072) {
                                z9 = false;
                            }
                            objM22097O4 = tj3Var.m22097O();
                            if (z9 || objM22097O4 == p84Var2) {
                                objM22097O4 = new oa5(vi3Var, 7);
                                tj3Var.m22131l0(objM22097O4);
                            }
                            ui3 ui3Var4 = (ui3) objM22097O4;
                            z10 = (i13 <= 131072 && tj3Var.m22120g(vi3Var)) || (i12 & 196608) == 131072;
                            objM22097O5 = tj3Var.m22097O();
                            if (z10 || objM22097O5 == p84Var2) {
                                objM22097O5 = new kl3(vi3Var, 5);
                                tj3Var.m22131l0(objM22097O5);
                            }
                            vf2.m23261c(str4, str2, list, wf2Var, z26, ui3Var4, (vi3) objM22097O5, lx6Var.f50245d, ui3Var, null, tj3Var, 0);
                            tj3Var = tj3Var;
                            z7 = false;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            tj3Var.m22111b0(1286431536);
                            tj3Var.m22139q(z7);
                            z12 = true;
                        } else {
                            str2 = str;
                        }
                        z9 = true;
                        objM22097O4 = tj3Var.m22097O();
                        if (z9) {
                            objM22097O4 = new oa5(vi3Var, 7);
                            tj3Var.m22131l0(objM22097O4);
                        } else {
                            objM22097O4 = new oa5(vi3Var, 7);
                            tj3Var.m22131l0(objM22097O4);
                        }
                        ui3 ui3Var5 = (ui3) objM22097O4;
                        if (i13 <= 131072) {
                        }
                        objM22097O5 = tj3Var.m22097O();
                        if (z10) {
                            objM22097O5 = new kl3(vi3Var, 5);
                            tj3Var.m22131l0(objM22097O5);
                        } else {
                            objM22097O5 = new kl3(vi3Var, 5);
                            tj3Var.m22131l0(objM22097O5);
                        }
                        vf2.m23261c(str4, str2, list, wf2Var, z26, ui3Var5, (vi3) objM22097O5, lx6Var.f50245d, ui3Var, null, tj3Var, 0);
                        tj3Var = tj3Var;
                        z7 = false;
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(z7);
                        tj3Var.m22111b0(1286431536);
                        tj3Var.m22139q(z7);
                        z12 = true;
                        break;
                    case 4:
                        p84Var2 = p84Var;
                        tj3Var.m22111b0(748991632);
                        OnboardingSelections onboardingSelections2 = lx6Var.f50244c;
                        String str5 = onboardingSelections2.f27289a;
                        String str6 = onboardingSelections2.f27291c;
                        z11 = (i13 <= 131072 && tj3Var.m22120g(vi3Var)) || (i12 & 196608) == 131072;
                        objM22097O6 = tj3Var.m22097O();
                        if (z11 || objM22097O6 == p84Var2) {
                            objM22097O6 = new kl3(vi3Var, 6);
                            tj3Var.m22131l0(objM22097O6);
                        }
                        iqb.m14080a(0, tj3Var, ui3Var, (vi3) objM22097O6, null, str5, str6, lx6Var.f50245d);
                        tj3Var = tj3Var;
                        z7 = false;
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(z7);
                        tj3Var.m22111b0(1286431536);
                        tj3Var.m22139q(z7);
                        z12 = true;
                        break;
                    case 5:
                        p84Var2 = p84Var;
                        z7 = false;
                        tj3Var.m22111b0(749003188);
                        OnboardingSelections onboardingSelections3 = lx6Var.f50244c;
                        sed.m21321a(0, tj3Var, ui3Var, null, onboardingSelections3.f27291c, onboardingSelections3.f27289a);
                        tj3Var = tj3Var;
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(z7);
                        tj3Var.m22111b0(1286431536);
                        tj3Var.m22139q(z7);
                        z12 = true;
                        break;
                    case 6:
                        p84Var2 = p84Var;
                        tj3Var.m22111b0(749009755);
                        String str7 = lx6Var.f50244c.f27292d;
                        z13 = (i13 <= 131072 && tj3Var.m22120g(vi3Var)) || (i12 & 196608) == 131072;
                        objM22097O7 = tj3Var.m22097O();
                        if (z13 || objM22097O7 == p84Var2) {
                            objM22097O7 = new kl3(vi3Var, 7);
                            tj3Var.m22131l0(objM22097O7);
                        }
                        sjd.m21438b(str7, (vi3) objM22097O7, lx6Var.f50245d, ui3Var, null, tj3Var, 0);
                        z7 = false;
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(z7);
                        tj3Var.m22111b0(1286431536);
                        tj3Var.m22139q(z7);
                        z12 = true;
                        break;
                    default:
                        tj3Var.m22111b0(1744714764);
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(false);
                        tj3Var.m22111b0(-789782838);
                        i5 = ((i2 >> 21) & 896) | i9;
                        tj3Var.m22111b0(1792888874);
                        i6 = (i5 & 896) ^ 384;
                        z17 = (i6 <= 256 && tj3Var.m22120g(vi3Var)) || (i5 & 384) == 256;
                        objM22097O11 = tj3Var.m22097O();
                        if (z17 || objM22097O11 == p84Var) {
                            objM22097O11 = new et6(vi3Var, 13);
                            tj3Var.m22131l0(objM22097O11);
                        }
                        ui3Var2 = (ui3) objM22097O11;
                        switch (iArr[onboardingPage.ordinal()]) {
                            case 7:
                                p84Var2 = p84Var;
                                tj3Var.m22111b0(684330724);
                                Set set = lx6Var.f50244c.f27293e;
                                z18 = (i6 <= 256 && tj3Var.m22120g(vi3Var)) || (i5 & 384) == 256;
                                objM22097O12 = tj3Var.m22097O();
                                if (z18 || objM22097O12 == p84Var2) {
                                    objM22097O12 = new i75(vi3Var, 18);
                                    tj3Var.m22131l0(objM22097O12);
                                }
                                r3d.m20286a(set, (vi3) objM22097O12, lx6Var.f50245d, ui3Var2, null, tj3Var, 0);
                                z7 = false;
                                tj3Var.m22139q(false);
                                tj3Var.m22139q(z7);
                                z12 = true;
                                break;
                            case 8:
                                p84Var2 = p84Var;
                                tj3Var.m22111b0(684339956);
                                OnboardingSelections onboardingSelections4 = lx6Var.f50244c;
                                String str8 = onboardingSelections4.f27289a;
                                String str9 = onboardingSelections4.f27294f;
                                z19 = (i6 <= 256 && tj3Var.m22120g(vi3Var)) || (i5 & 384) == 256;
                                objM22097O13 = tj3Var.m22097O();
                                if (z19 || objM22097O13 == p84Var2) {
                                    objM22097O13 = new i75(vi3Var, 19);
                                    tj3Var.m22131l0(objM22097O13);
                                }
                                b4d.m3297b(0, tj3Var, ui3Var2, (vi3) objM22097O13, null, str8, str9, lx6Var.f50245d);
                                tj3Var = tj3Var;
                                z7 = false;
                                tj3Var.m22139q(false);
                                tj3Var.m22139q(z7);
                                z12 = true;
                                break;
                            case 9:
                                p84Var2 = p84Var;
                                tj3Var.m22111b0(684351519);
                                Set set2 = lx6Var.f50244c.f27295g;
                                z20 = (i6 <= 256 && tj3Var.m22120g(vi3Var)) || (i5 & 384) == 256;
                                objM22097O14 = tj3Var.m22097O();
                                if (z20 || objM22097O14 == p84Var2) {
                                    objM22097O14 = new i75(vi3Var, 20);
                                    tj3Var.m22131l0(objM22097O14);
                                }
                                q7a.m19708c(set2, (vi3) objM22097O14, lx6Var.f50245d, ui3Var2, null, tj3Var, 0);
                                z7 = false;
                                tj3Var.m22139q(false);
                                tj3Var.m22139q(z7);
                                z12 = true;
                                break;
                            case 10:
                                p84Var2 = p84Var;
                                tj3Var.m22111b0(684360508);
                                OnboardingSelections onboardingSelections5 = lx6Var.f50244c;
                                String str10 = onboardingSelections5.f27289a;
                                String str11 = onboardingSelections5.f27296h;
                                z21 = (i6 <= 256 && tj3Var.m22120g(vi3Var)) || (i5 & 384) == 256;
                                objM22097O15 = tj3Var.m22097O();
                                if (z21 || objM22097O15 == p84Var2) {
                                    objM22097O15 = new i75(vi3Var, 21);
                                    tj3Var.m22131l0(objM22097O15);
                                }
                                czc.m9945a(0, tj3Var, ui3Var2, (vi3) objM22097O15, null, str10, str11, lx6Var.f50245d);
                                tj3Var = tj3Var;
                                z7 = false;
                                tj3Var.m22139q(false);
                                tj3Var.m22139q(z7);
                                z12 = true;
                                break;
                            case 11:
                                p84Var2 = p84Var;
                                tj3Var.m22111b0(684371400);
                                OnboardingSelections onboardingSelections6 = lx6Var.f50244c;
                                String str12 = onboardingSelections6.f27289a;
                                String str13 = onboardingSelections6.f27297i;
                                z22 = (i6 <= 256 && tj3Var.m22120g(vi3Var)) || (i5 & 384) == 256;
                                objM22097O16 = tj3Var.m22097O();
                                if (z22 || objM22097O16 == p84Var2) {
                                    objM22097O16 = new i75(vi3Var, 22);
                                    tj3Var.m22131l0(objM22097O16);
                                }
                                npb.m17580a(0, tj3Var, ui3Var2, (vi3) objM22097O16, null, str12, str13, lx6Var.f50245d);
                                tj3Var = tj3Var;
                                z7 = false;
                                tj3Var.m22139q(false);
                                tj3Var.m22139q(z7);
                                z12 = true;
                                break;
                            case 12:
                                p84Var2 = p84Var;
                                tj3Var.m22111b0(684382996);
                                OnboardingSelections onboardingSelections7 = lx6Var.f50244c;
                                String str14 = onboardingSelections7.f27289a;
                                int i14 = onboardingSelections7.f27298j;
                                String str15 = onboardingSelections7.f27292d;
                                z23 = (i6 <= 256 && tj3Var.m22120g(vi3Var)) || (i5 & 384) == 256;
                                objM22097O17 = tj3Var.m22097O();
                                if (z23 || objM22097O17 == p84Var2) {
                                    objM22097O17 = new i75(vi3Var, 23);
                                    tj3Var.m22131l0(objM22097O17);
                                }
                                n7d.m17275a(str14, i14, str15, (vi3) objM22097O17, lx6Var.f50245d, ui3Var2, null, tj3Var, 0);
                                tj3Var = tj3Var;
                                z7 = false;
                                tj3Var.m22139q(false);
                                tj3Var.m22139q(z7);
                                z12 = true;
                                break;
                            case 13:
                                z7 = false;
                                tj3Var.m22111b0(-258574459);
                                p84Var2 = p84Var;
                                AbstractC2228a.m9183c(lx6Var.f50245d, ui3Var2, null, tj3Var, 0, 4);
                                tj3Var = tj3Var;
                                tj3Var.m22139q(false);
                                tj3Var.m22139q(z7);
                                z12 = true;
                                break;
                            default:
                                tj3Var.m22111b0(-258446708);
                                z7 = false;
                                tj3Var.m22139q(false);
                                tj3Var.m22139q(false);
                                z12 = false;
                                p84Var2 = p84Var;
                                i3 = i3;
                                break;
                        }
                        tj3Var.m22139q(z7);
                        break;
                }
                if (z12) {
                    tj3Var.m22111b0(1286433241);
                    tj3Var.m22139q(z7);
                } else {
                    tj3Var.m22111b0(-789780825);
                    i4 = (i2 & 65534) | (i3 & 458752) | (i3 & 3670016);
                    tj3Var.m22111b0(1027854984);
                    switch (iArr[onboardingPage.ordinal()]) {
                        case 14:
                            tj3Var.m22111b0(-73826028);
                            OnboardingSelections onboardingSelections8 = lx6Var.f50244c;
                            String str16 = onboardingSelections8.f27289a;
                            int i15 = onboardingSelections8.f27298j;
                            int i16 = (i4 & 3670016) ^ 1572864;
                            z14 = (i16 <= 1048576 && tj3Var.m22120g(vi3Var)) || (i4 & 1572864) == 1048576;
                            objM22097O8 = tj3Var.m22097O();
                            if (z14 || objM22097O8 == p84Var2) {
                                objM22097O8 = new et6(vi3Var, 14);
                                tj3Var.m22131l0(objM22097O8);
                            }
                            ui3 ui3Var6 = (ui3) objM22097O8;
                            z15 = (i16 <= 1048576 && tj3Var.m22120g(vi3Var)) || (i4 & 1572864) == 1048576;
                            objM22097O9 = tj3Var.m22097O();
                            if (z15 || objM22097O9 == p84Var2) {
                                objM22097O9 = new et6(vi3Var, 15);
                                tj3Var.m22131l0(objM22097O9);
                            }
                            AbstractC2228a.m9181a(str16, i15, ui3Var6, (ui3) objM22097O9, null, tj3Var, 0);
                            z7 = false;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            break;
                        case 15:
                            tj3Var.m22111b0(-73815048);
                            tj3 tj3Var2 = tj3Var;
                            e3d.m10829d(lx6Var.f50246e, ym5Var, dx6Var.f36372e, dx6Var.f36373f, dx6Var.f36370c, dx6Var.f36371d, dx6Var.f36374g, dx6Var.f36368a, dx6Var.f36369b, null, lx6Var.f50244c.f27300l, tj3Var2, (i4 >> 3) & 112);
                            tj3Var = tj3Var2;
                            z7 = false;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            break;
                        case 16:
                            tj3Var.m22111b0(-73796148);
                            AbstractC2228a.m9185e(lx6Var.f50244c, z2, z, dx6Var.f36376i, null, tj3Var, ((i4 >> 9) & 112) | ((i4 >> 3) & 896));
                            z7 = false;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            break;
                        case 17:
                            tj3Var.m22111b0(-73787430);
                            String str17 = lx6Var.f50244c.f27289a;
                            z16 = (((i4 & 3670016) ^ 1572864) <= 1048576 && tj3Var.m22120g(vi3Var)) || (i4 & 1572864) == 1048576;
                            objM22097O10 = tj3Var.m22097O();
                            if (z16 || objM22097O10 == p84Var2) {
                                objM22097O10 = new et6(vi3Var, 16);
                                tj3Var.m22131l0(objM22097O10);
                            }
                            z7 = false;
                            AbstractC2228a.m9184d(0, tj3Var, (ui3) objM22097O10, null, str17);
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            break;
                        default:
                            tj3Var.m22111b0(2007745262);
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(false);
                            z7 = false;
                            z24 = false;
                            break;
                    }
                    tj3Var.m22139q(z7);
                }
                if (z24) {
                    tj3Var.m22111b0(1287243747);
                    tj3Var.m22139q(z7);
                } else {
                    tj3Var.m22111b0(1286912202);
                    int i17 = i2 >> 6;
                    yh7.m25143a(onboardingPage, lx6Var.f50244c, lx6Var.f50245d, miniLessonTemplate, vz5Var, z3, vi3Var, tj3Var, i8 | (i17 & 7168) | (i17 & 57344) | (i17 & 458752) | (i3 & 3670016));
                    tj3Var.m22139q(z7);
                }
            } else {
                i2 = i7;
            }
            z4 = true;
            objM22097O = tj3Var.m22097O();
            z5 = z4;
            i3 = i10;
            p84Var = we1.f66679a;
            if (z5) {
                objM22097O = new oa5(vi3Var, 5);
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = new oa5(vi3Var, 5);
                tj3Var.m22131l0(objM22097O);
            }
            ui3Var = (ui3) objM22097O;
            iArr = kx6.f48544a;
            switch (iArr[onboardingPage.ordinal()]) {
                case 1:
                    p84Var2 = p84Var;
                    tj3Var.m22111b0(748945618);
                    ui3 ui3Var7 = dx6Var.f36368a;
                    boolean z27 = lx6Var.f50249h;
                    if (i13 <= 131072) {
                    }
                    objM22097O2 = tj3Var.m22097O();
                    if (z6) {
                        objM22097O2 = new oa5(vi3Var, 6);
                        tj3Var.m22131l0(objM22097O2);
                    } else {
                        objM22097O2 = new oa5(vi3Var, 6);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    omd.m18155k(ui3Var, ui3Var7, z27, (ui3) objM22097O2, null, tj3Var, 0);
                    z7 = false;
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(z7);
                    tj3Var.m22111b0(1286431536);
                    tj3Var.m22139q(z7);
                    z12 = true;
                    break;
                case 2:
                    p84Var2 = p84Var;
                    tj3Var.m22111b0(748957194);
                    String str18 = lx6Var.f50244c.f27289a;
                    if (i13 <= 131072) {
                    }
                    objM22097O3 = tj3Var.m22097O();
                    if (z8) {
                        objM22097O3 = new kl3(vi3Var, 4);
                        tj3Var.m22131l0(objM22097O3);
                    } else {
                        objM22097O3 = new kl3(vi3Var, 4);
                        tj3Var.m22131l0(objM22097O3);
                    }
                    thd.m22069a(str18, (vi3) objM22097O3, lx6Var.f50245d, ui3Var, null, tj3Var, 0);
                    z7 = false;
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(z7);
                    tj3Var.m22111b0(1286431536);
                    tj3Var.m22139q(z7);
                    z12 = true;
                    break;
                case 3:
                    p84Var2 = p84Var;
                    tj3Var.m22111b0(748967088);
                    OnboardingSelections onboardingSelections9 = lx6Var.f50244c;
                    String str19 = onboardingSelections9.f27289a;
                    str = onboardingSelections9.f27290b;
                    List list2 = lx6Var.f50248g;
                    wf2 wf2Var2 = new wf2(miniLessonTemplate, vz5Var);
                    boolean z28 = lx6Var.f50250i;
                    if (i13 > 131072) {
                        str2 = str;
                        if ((i12 & 196608) != 131072) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    } else {
                        str2 = str;
                        if ((i12 & 196608) != 131072) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    }
                    objM22097O4 = tj3Var.m22097O();
                    if (z9) {
                        objM22097O4 = new oa5(vi3Var, 7);
                        tj3Var.m22131l0(objM22097O4);
                    } else {
                        objM22097O4 = new oa5(vi3Var, 7);
                        tj3Var.m22131l0(objM22097O4);
                    }
                    ui3 ui3Var8 = (ui3) objM22097O4;
                    if (i13 <= 131072) {
                    }
                    objM22097O5 = tj3Var.m22097O();
                    if (z10) {
                        objM22097O5 = new kl3(vi3Var, 5);
                        tj3Var.m22131l0(objM22097O5);
                    } else {
                        objM22097O5 = new kl3(vi3Var, 5);
                        tj3Var.m22131l0(objM22097O5);
                    }
                    vf2.m23261c(str19, str2, list2, wf2Var2, z28, ui3Var8, (vi3) objM22097O5, lx6Var.f50245d, ui3Var, null, tj3Var, 0);
                    tj3Var = tj3Var;
                    z7 = false;
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(z7);
                    tj3Var.m22111b0(1286431536);
                    tj3Var.m22139q(z7);
                    z12 = true;
                    break;
                case 4:
                    p84Var2 = p84Var;
                    tj3Var.m22111b0(748991632);
                    OnboardingSelections onboardingSelections10 = lx6Var.f50244c;
                    String str20 = onboardingSelections10.f27289a;
                    String str21 = onboardingSelections10.f27291c;
                    if (i13 <= 131072) {
                    }
                    objM22097O6 = tj3Var.m22097O();
                    if (z11) {
                        objM22097O6 = new kl3(vi3Var, 6);
                        tj3Var.m22131l0(objM22097O6);
                    } else {
                        objM22097O6 = new kl3(vi3Var, 6);
                        tj3Var.m22131l0(objM22097O6);
                    }
                    iqb.m14080a(0, tj3Var, ui3Var, (vi3) objM22097O6, null, str20, str21, lx6Var.f50245d);
                    tj3Var = tj3Var;
                    z7 = false;
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(z7);
                    tj3Var.m22111b0(1286431536);
                    tj3Var.m22139q(z7);
                    z12 = true;
                    break;
                case 5:
                    p84Var2 = p84Var;
                    z7 = false;
                    tj3Var.m22111b0(749003188);
                    OnboardingSelections onboardingSelections11 = lx6Var.f50244c;
                    sed.m21321a(0, tj3Var, ui3Var, null, onboardingSelections11.f27291c, onboardingSelections11.f27289a);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(z7);
                    tj3Var.m22111b0(1286431536);
                    tj3Var.m22139q(z7);
                    z12 = true;
                    break;
                case 6:
                    p84Var2 = p84Var;
                    tj3Var.m22111b0(749009755);
                    String str22 = lx6Var.f50244c.f27292d;
                    if (i13 <= 131072) {
                    }
                    objM22097O7 = tj3Var.m22097O();
                    if (z13) {
                        objM22097O7 = new kl3(vi3Var, 7);
                        tj3Var.m22131l0(objM22097O7);
                    } else {
                        objM22097O7 = new kl3(vi3Var, 7);
                        tj3Var.m22131l0(objM22097O7);
                    }
                    sjd.m21438b(str22, (vi3) objM22097O7, lx6Var.f50245d, ui3Var, null, tj3Var, 0);
                    z7 = false;
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(z7);
                    tj3Var.m22111b0(1286431536);
                    tj3Var.m22139q(z7);
                    z12 = true;
                    break;
                default:
                    tj3Var.m22111b0(1744714764);
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(false);
                    tj3Var.m22111b0(-789782838);
                    i5 = ((i2 >> 21) & 896) | i9;
                    tj3Var.m22111b0(1792888874);
                    i6 = (i5 & 896) ^ 384;
                    if (i6 <= 256) {
                    }
                    objM22097O11 = tj3Var.m22097O();
                    if (z17) {
                        objM22097O11 = new et6(vi3Var, 13);
                        tj3Var.m22131l0(objM22097O11);
                    } else {
                        objM22097O11 = new et6(vi3Var, 13);
                        tj3Var.m22131l0(objM22097O11);
                    }
                    ui3Var2 = (ui3) objM22097O11;
                    switch (iArr[onboardingPage.ordinal()]) {
                        case 7:
                            p84Var2 = p84Var;
                            tj3Var.m22111b0(684330724);
                            Set set3 = lx6Var.f50244c.f27293e;
                            if (i6 <= 256) {
                            }
                            objM22097O12 = tj3Var.m22097O();
                            if (z18) {
                                objM22097O12 = new i75(vi3Var, 18);
                                tj3Var.m22131l0(objM22097O12);
                            } else {
                                objM22097O12 = new i75(vi3Var, 18);
                                tj3Var.m22131l0(objM22097O12);
                            }
                            r3d.m20286a(set3, (vi3) objM22097O12, lx6Var.f50245d, ui3Var2, null, tj3Var, 0);
                            z7 = false;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            z12 = true;
                            break;
                        case 8:
                            p84Var2 = p84Var;
                            tj3Var.m22111b0(684339956);
                            OnboardingSelections onboardingSelections12 = lx6Var.f50244c;
                            String str23 = onboardingSelections12.f27289a;
                            String str24 = onboardingSelections12.f27294f;
                            if (i6 <= 256) {
                            }
                            objM22097O13 = tj3Var.m22097O();
                            if (z19) {
                                objM22097O13 = new i75(vi3Var, 19);
                                tj3Var.m22131l0(objM22097O13);
                            } else {
                                objM22097O13 = new i75(vi3Var, 19);
                                tj3Var.m22131l0(objM22097O13);
                            }
                            b4d.m3297b(0, tj3Var, ui3Var2, (vi3) objM22097O13, null, str23, str24, lx6Var.f50245d);
                            tj3Var = tj3Var;
                            z7 = false;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            z12 = true;
                            break;
                        case 9:
                            p84Var2 = p84Var;
                            tj3Var.m22111b0(684351519);
                            Set set4 = lx6Var.f50244c.f27295g;
                            if (i6 <= 256) {
                            }
                            objM22097O14 = tj3Var.m22097O();
                            if (z20) {
                                objM22097O14 = new i75(vi3Var, 20);
                                tj3Var.m22131l0(objM22097O14);
                            } else {
                                objM22097O14 = new i75(vi3Var, 20);
                                tj3Var.m22131l0(objM22097O14);
                            }
                            q7a.m19708c(set4, (vi3) objM22097O14, lx6Var.f50245d, ui3Var2, null, tj3Var, 0);
                            z7 = false;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            z12 = true;
                            break;
                        case 10:
                            p84Var2 = p84Var;
                            tj3Var.m22111b0(684360508);
                            OnboardingSelections onboardingSelections13 = lx6Var.f50244c;
                            String str110 = onboardingSelections13.f27289a;
                            String str111 = onboardingSelections13.f27296h;
                            if (i6 <= 256) {
                            }
                            objM22097O15 = tj3Var.m22097O();
                            if (z21) {
                                objM22097O15 = new i75(vi3Var, 21);
                                tj3Var.m22131l0(objM22097O15);
                            } else {
                                objM22097O15 = new i75(vi3Var, 21);
                                tj3Var.m22131l0(objM22097O15);
                            }
                            czc.m9945a(0, tj3Var, ui3Var2, (vi3) objM22097O15, null, str110, str111, lx6Var.f50245d);
                            tj3Var = tj3Var;
                            z7 = false;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            z12 = true;
                            break;
                        case 11:
                            p84Var2 = p84Var;
                            tj3Var.m22111b0(684371400);
                            OnboardingSelections onboardingSelections14 = lx6Var.f50244c;
                            String str112 = onboardingSelections14.f27289a;
                            String str113 = onboardingSelections14.f27297i;
                            if (i6 <= 256) {
                            }
                            objM22097O16 = tj3Var.m22097O();
                            if (z22) {
                                objM22097O16 = new i75(vi3Var, 22);
                                tj3Var.m22131l0(objM22097O16);
                            } else {
                                objM22097O16 = new i75(vi3Var, 22);
                                tj3Var.m22131l0(objM22097O16);
                            }
                            npb.m17580a(0, tj3Var, ui3Var2, (vi3) objM22097O16, null, str112, str113, lx6Var.f50245d);
                            tj3Var = tj3Var;
                            z7 = false;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            z12 = true;
                            break;
                        case 12:
                            p84Var2 = p84Var;
                            tj3Var.m22111b0(684382996);
                            OnboardingSelections onboardingSelections15 = lx6Var.f50244c;
                            String str114 = onboardingSelections15.f27289a;
                            int i18 = onboardingSelections15.f27298j;
                            String str115 = onboardingSelections15.f27292d;
                            if (i6 <= 256) {
                            }
                            objM22097O17 = tj3Var.m22097O();
                            if (z23) {
                                objM22097O17 = new i75(vi3Var, 23);
                                tj3Var.m22131l0(objM22097O17);
                            } else {
                                objM22097O17 = new i75(vi3Var, 23);
                                tj3Var.m22131l0(objM22097O17);
                            }
                            n7d.m17275a(str114, i18, str115, (vi3) objM22097O17, lx6Var.f50245d, ui3Var2, null, tj3Var, 0);
                            tj3Var = tj3Var;
                            z7 = false;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            z12 = true;
                            break;
                        case 13:
                            z7 = false;
                            tj3Var.m22111b0(-258574459);
                            p84Var2 = p84Var;
                            AbstractC2228a.m9183c(lx6Var.f50245d, ui3Var2, null, tj3Var, 0, 4);
                            tj3Var = tj3Var;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(z7);
                            z12 = true;
                            break;
                        default:
                            tj3Var.m22111b0(-258446708);
                            z7 = false;
                            tj3Var.m22139q(false);
                            tj3Var.m22139q(false);
                            z12 = false;
                            p84Var2 = p84Var;
                            i3 = i3;
                            break;
                    }
                    tj3Var.m22139q(z7);
                    break;
            }
            if (z12) {
                tj3Var.m22111b0(1286433241);
                tj3Var.m22139q(z7);
            } else {
                tj3Var.m22111b0(-789780825);
                i4 = (i2 & 65534) | (i3 & 458752) | (i3 & 3670016);
                tj3Var.m22111b0(1027854984);
                switch (iArr[onboardingPage.ordinal()]) {
                    case 14:
                        tj3Var.m22111b0(-73826028);
                        OnboardingSelections onboardingSelections16 = lx6Var.f50244c;
                        String str116 = onboardingSelections16.f27289a;
                        int i19 = onboardingSelections16.f27298j;
                        int i110 = (i4 & 3670016) ^ 1572864;
                        if (i110 <= 1048576) {
                        }
                        objM22097O8 = tj3Var.m22097O();
                        if (z14) {
                            objM22097O8 = new et6(vi3Var, 14);
                            tj3Var.m22131l0(objM22097O8);
                        } else {
                            objM22097O8 = new et6(vi3Var, 14);
                            tj3Var.m22131l0(objM22097O8);
                        }
                        ui3 ui3Var9 = (ui3) objM22097O8;
                        if (i110 <= 1048576) {
                        }
                        objM22097O9 = tj3Var.m22097O();
                        if (z15) {
                            objM22097O9 = new et6(vi3Var, 15);
                            tj3Var.m22131l0(objM22097O9);
                        } else {
                            objM22097O9 = new et6(vi3Var, 15);
                            tj3Var.m22131l0(objM22097O9);
                        }
                        AbstractC2228a.m9181a(str116, i19, ui3Var9, (ui3) objM22097O9, null, tj3Var, 0);
                        z7 = false;
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(z7);
                        break;
                    case 15:
                        tj3Var.m22111b0(-73815048);
                        tj3 tj3Var3 = tj3Var;
                        e3d.m10829d(lx6Var.f50246e, ym5Var, dx6Var.f36372e, dx6Var.f36373f, dx6Var.f36370c, dx6Var.f36371d, dx6Var.f36374g, dx6Var.f36368a, dx6Var.f36369b, null, lx6Var.f50244c.f27300l, tj3Var3, (i4 >> 3) & 112);
                        tj3Var = tj3Var3;
                        z7 = false;
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(z7);
                        break;
                    case 16:
                        tj3Var.m22111b0(-73796148);
                        AbstractC2228a.m9185e(lx6Var.f50244c, z2, z, dx6Var.f36376i, null, tj3Var, ((i4 >> 9) & 112) | ((i4 >> 3) & 896));
                        z7 = false;
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(z7);
                        break;
                    case 17:
                        tj3Var.m22111b0(-73787430);
                        String str117 = lx6Var.f50244c.f27289a;
                        if (((i4 & 3670016) ^ 1572864) <= 1048576) {
                        }
                        objM22097O10 = tj3Var.m22097O();
                        if (z16) {
                            objM22097O10 = new et6(vi3Var, 16);
                            tj3Var.m22131l0(objM22097O10);
                        } else {
                            objM22097O10 = new et6(vi3Var, 16);
                            tj3Var.m22131l0(objM22097O10);
                        }
                        z7 = false;
                        AbstractC2228a.m9184d(0, tj3Var, (ui3) objM22097O10, null, str117);
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(z7);
                        break;
                    default:
                        tj3Var.m22111b0(2007745262);
                        tj3Var.m22139q(false);
                        tj3Var.m22139q(false);
                        z7 = false;
                        z24 = false;
                        break;
                }
                tj3Var.m22139q(z7);
            }
            if (z24) {
                tj3Var.m22111b0(1286912202);
                int i111 = i2 >> 6;
                yh7.m25143a(onboardingPage, lx6Var.f50244c, lx6Var.f50245d, miniLessonTemplate, vz5Var, z3, vi3Var, tj3Var, i8 | (i111 & 7168) | (i111 & 57344) | (i111 & 458752) | (i3 & 3670016));
                tj3Var.m22139q(z7);
            } else {
                tj3Var.m22111b0(1287243747);
                tj3Var.m22139q(z7);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(lx6Var, ym5Var, z, z2, miniLessonTemplate, vz5Var, z3, dx6Var, vi3Var, i) { // from class: gx6

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ lx6 f41476b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ym5 f41477c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f41478d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f41479e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MiniLessonTemplate f41480f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ vz5 f41481g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ boolean f41482h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ dx6 f41483i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ vi3 f41484j;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC2215c.m9157a(this.f41475a, this.f41476b, this.f41477c, this.f41478d, this.f41479e, this.f41480f, this.f41481g, this.f41482h, this.f41483i, this.f41484j, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9158b(final boolean z, final o72 o72Var, final boolean z2, final boolean z3, final float f, final float f2, final ui3 ui3Var, ye1 ye1Var, final int i) {
        o72 o72Var2;
        float f3;
        x18 x18VarM22143u;
        zi3 zi3Var;
        p84 p84Var;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-682153787);
        int i2 = (tj3Var2.m22124i(ui3Var) ? 1048576 : 524288) | i | (tj3Var2.m22122h(z) ? 4 : 2) | (tj3Var2.m22120g(o72Var) ? 32 : 16) | (tj3Var2.m22122h(z2) ? 256 : 128) | (tj3Var2.m22122h(z3) ? 2048 : 1024) | (tj3Var2.m22114d(f) ? 16384 : 8192) | (tj3Var2.m22114d(f2) ? 131072 : 65536);
        if (tj3Var2.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            if (z) {
                o72Var2 = o72Var;
                f3 = f;
                b16 b16Var = b16.f7762a;
                e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, f2, 0.0f, 0.0f, 13);
                zf1 zf1Var = ge9.f40637a;
                e16 e16VarM21608U = AbstractC3584sr.m21608U(e16VarM21611X, ((fe9) tj3Var2.m22128k(zf1Var)).f38957f, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a);
                boolean z4 = (i2 & 112) == 32;
                Object objM22097O = tj3Var2.m22097O();
                p84 p84Var2 = we1.f66679a;
                if (z4 || objM22097O == p84Var2) {
                    objM22097O = new kv4(o72Var2, 13);
                    tj3Var2.m22131l0(objM22097O);
                }
                e16 e16VarM1406a = AbstractC0309d.m1406a(e16VarM21608U, (vi3) objM22097O);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var2, 48);
                int iHashCode = Long.hashCode(tj3Var2.f62385T);
                l77 l77VarM22132m = tj3Var2.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM1406a);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var2.m22119f0();
                if (tj3Var2.f62384S) {
                    tj3Var2.m22130l(ui3Var2);
                } else {
                    tj3Var2.m22137o0();
                }
                oha.m18001g(tj3Var2, C0352b.f4303f, sj8VarM20003a);
                oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var2, C0352b.f4305h);
                oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
                if (z3) {
                    tj3Var2.m22111b0(-1702216653);
                    tj3Var = tj3Var2;
                    p84Var = p84Var2;
                    omd.m18141c(ui3Var, c99.m4422o(b16Var, 24.0f), !z2, null, null, ifc.f44063a, tj3Var, ((i2 >> 18) & 14) | 1572912, 56);
                    thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38952a));
                    tj3Var.m22139q(false);
                } else {
                    p84Var = p84Var2;
                    tj3Var = tj3Var2;
                    tj3Var.m22111b0(-1701718855);
                    tj3Var.m22139q(false);
                }
                boolean z5 = (57344 & i2) == 16384;
                Object objM22097O2 = tj3Var.m22097O();
                if (z5 || objM22097O2 == p84Var) {
                    objM22097O2 = new gj9(0, f3);
                    tj3Var.m22131l0(objM22097O2);
                }
                ui3 ui3Var3 = (ui3) objM22097O2;
                e16 e16VarM4414g = c99.m4414g(new as4(1.0f, true), 4.0f);
                vh9 vh9Var = ps5.f56764b;
                tj3Var2 = tj3Var;
                dn7.m10494c(ui3Var3, e16VarM4414g, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55870o, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r, 1, 0.0f, null, tj3Var2, 0, 96);
                tj3Var2.m22139q(true);
            } else {
                x18VarM22143u = tj3Var2.m22143u();
                if (x18VarM22143u == null) {
                    return;
                }
                final int i3 = 0;
                zi3Var = new zi3(z, o72Var, z2, z3, f, f2, ui3Var, i, i3) { // from class: fx6

                    /* JADX INFO: renamed from: a */
                    public final /* synthetic */ int f39869a;

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ boolean f39870b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ o72 f39871c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ boolean f39872d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ boolean f39873e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ float f39874f;

                    /* JADX INFO: renamed from: g */
                    public final /* synthetic */ float f39875g;

                    /* JADX INFO: renamed from: h */
                    public final /* synthetic */ ui3 f39876h;

                    {
                        this.f39869a = i3;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        int i4 = this.f39869a;
                        xfa xfaVar = xfa.f68157a;
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(1);
                                AbstractC2215c.m9158b(this.f39870b, this.f39871c, this.f39872d, this.f39873e, this.f39874f, this.f39875g, this.f39876h, (ye1) obj, iM19383z);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iM19383z2 = pk9.m19383z(1);
                                AbstractC2215c.m9158b(this.f39870b, this.f39871c, this.f39872d, this.f39873e, this.f39874f, this.f39875g, this.f39876h, (ye1) obj, iM19383z2);
                                break;
                        }
                        return xfaVar;
                    }
                };
            }
            x18VarM22143u.f67642d = zi3Var;
        }
        o72Var2 = o72Var;
        f3 = f;
        tj3Var2.m22102U();
        x18VarM22143u = tj3Var2.m22143u();
        if (x18VarM22143u != null) {
            final int i4 = 1;
            final o72 o72Var3 = o72Var2;
            final float f4 = f3;
            zi3Var = new zi3(z, o72Var3, z2, z3, f4, f2, ui3Var, i, i4) { // from class: fx6

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f39869a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f39870b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ o72 f39871c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f39872d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f39873e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ float f39874f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ float f39875g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ ui3 f39876h;

                {
                    this.f39869a = i4;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.f39869a;
                    xfa xfaVar = xfa.f68157a;
                    switch (i5) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(1);
                            AbstractC2215c.m9158b(this.f39870b, this.f39871c, this.f39872d, this.f39873e, this.f39874f, this.f39875g, this.f39876h, (ye1) obj, iM19383z);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iM19383z2 = pk9.m19383z(1);
                            AbstractC2215c.m9158b(this.f39870b, this.f39871c, this.f39872d, this.f39873e, this.f39874f, this.f39875g, this.f39876h, (ye1) obj, iM19383z2);
                            break;
                    }
                    return xfaVar;
                }
            };
            x18VarM22143u.f67642d = zi3Var;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9159c(C2216d c2216d, String str, ui3 ui3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        final ui3 ui3Var2;
        C2216d c2216d2;
        C2216d c2216d3;
        int i2;
        C2216d c2216d4;
        vi3 vi3Var2;
        int i3;
        tj3 tj3Var;
        boolean z;
        p84 p84Var;
        final C2216d c2216d5;
        ui3Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1357626443);
        int i4 = i | 2 | (tj3Var2.m22120g(str) ? 32 : 16) | (tj3Var2.m22124i(ui3Var) ? 256 : 128) | (tj3Var2.m22124i(vi3Var) ? 2048 : 1024);
        if (tj3Var2.m22099R(i4 & 1, (i4 & 1171) != 1170)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var2);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2216d3 = (C2216d) pfa.m19114d(y38.m24933a(C2216d.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var2), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var2);
                    i2 = i4 & (-15);
                }
            } else {
                tj3Var2.m22102U();
                i2 = i4 & (-15);
                c2216d3 = c2216d;
            }
            tj3Var2.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2216d3.f27376N, tj3Var2);
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2216d3.f27372J, tj3Var2);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2216d3.f27375M, tj3Var2);
            t66 t66VarM2513c4 = AbstractC0711a.m2513c(c2216d3.f27374L, tj3Var2);
            t66 t66VarM2513c5 = AbstractC0711a.m2513c(c2216d3.f27368F, tj3Var2);
            t66 t66VarM2513c6 = AbstractC0711a.m2513c(c2216d3.f27369G, tj3Var2);
            boolean zM22124i = tj3Var2.m22124i(c2216d3);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (zM22124i || objM22097O == p84Var2) {
                objM22097O = new OnboardingV2ScreenKt$OnboardingV2Route$socialAuthState$1$1(1, c2216d3, C2216d.class, "registerWithGoogle", "registerWithGoogle(Ljava/lang/String;)V", 0);
                tj3Var2.m22131l0(objM22097O);
            }
            final vi3 vi3Var3 = (vi3) ((FunctionReference) objM22097O);
            boolean zM22124i2 = tj3Var2.m22124i(c2216d3);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var2) {
                objM22097O2 = new OnboardingV2ScreenKt$OnboardingV2Route$socialAuthState$2$1(1, c2216d3, C2216d.class, "registerWithFacebook", "registerWithFacebook(Ljava/lang/String;)V", 0);
                tj3Var2.m22131l0(objM22097O2);
            }
            vi3 vi3Var4 = (vi3) ((FunctionReference) objM22097O2);
            boolean zM22124i3 = tj3Var2.m22124i(c2216d3);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22124i3 || objM22097O3 == p84Var2) {
                c2216d4 = c2216d3;
                objM22097O3 = new OnboardingV2ScreenKt$OnboardingV2Route$socialAuthState$3$1(1, c2216d4, C2216d.class, "setSocialAuthError", "setSocialAuthError(Ljava/lang/String;)V", 0);
                tj3Var2.m22131l0(objM22097O3);
            } else {
                c2216d4 = c2216d3;
            }
            final vi3 vi3Var5 = (vi3) ((FunctionReference) objM22097O3);
            int i5 = i2 >> 3;
            vi3Var3.getClass();
            vi3Var4.getClass();
            final Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            boolean zM22120g = tj3Var2.m22120g(context);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22120g || objM22097O4 == p84Var2) {
                lda.m16130p(context);
                objM22097O4 = new eeb(context, new deb());
                tj3Var2.m22131l0(objM22097O4);
            }
            final eeb eebVar = (eeb) objM22097O4;
            eebVar.getClass();
            boolean z2 = (((i5 & 14) ^ 6) > 4 && tj3Var2.m22120g(str)) || (i5 & 6) == 4;
            Object objM22097O5 = tj3Var2.m22097O();
            if (z2 || objM22097O5 == p84Var2) {
                List listM23605K = vz1.m23605K(new Scope(1, "openid"), new Scope(1, "email"), new Scope(1, "profile"));
                lda.m16124j("requestedScopes cannot be null or empty", !listM23605K.isEmpty());
                vi3Var2 = vi3Var4;
                i3 = i2;
                tj3Var = tj3Var2;
                z = true;
                p84Var = p84Var2;
                AuthorizationRequest authorizationRequest = new AuthorizationRequest(listM23605K, str, true, false, null, null, null, false, null, false, 0);
                tj3Var.m22131l0(authorizationRequest);
                objM22097O5 = authorizationRequest;
            } else {
                i3 = i2;
                tj3Var = tj3Var2;
                vi3Var2 = vi3Var4;
                p84Var = p84Var2;
                z = true;
            }
            final AuthorizationRequest authorizationRequest2 = (AuthorizationRequest) objM22097O5;
            authorizationRequest2.getClass();
            C3028g7 c3028g7 = new C3028g7(2);
            boolean zM22124i4 = tj3Var.m22124i(eebVar) | tj3Var.m22120g(vi3Var3) | tj3Var.m22120g(vi3Var5);
            Object objM22097O6 = tj3Var.m22097O();
            p84 p84Var3 = p84Var;
            if (zM22124i4 || objM22097O6 == p84Var3) {
                objM22097O6 = new bb0(15, vi3Var3, eebVar, vi3Var5);
                tj3Var.m22131l0(objM22097O6);
            }
            final hp5 hp5VarM16109I = lda.m16109I(c3028g7, (vi3) objM22097O6, tj3Var);
            Object objM22097O7 = tj3Var.m22097O();
            if (objM22097O7 == p84Var3) {
                objM22097O7 = new dm0();
                tj3Var.m22131l0(objM22097O7);
            }
            C0938l c0938l = new C0938l(C0939m.f11517f.m5254a(), (dm0) objM22097O7);
            vi3 vi3Var6 = vi3Var2;
            boolean zM22120g2 = tj3Var.m22120g(vi3Var6) | tj3Var.m22120g(vi3Var5);
            Object objM22097O8 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O8 == p84Var3) {
                objM22097O8 = new mc9(vi3Var6, vi3Var5, 2);
                tj3Var.m22131l0(objM22097O8);
            }
            hp5 hp5VarM16109I2 = lda.m16109I(c0938l, (vi3) objM22097O8, tj3Var);
            final t66 t66VarM1263m = AbstractC0278f.m1263m(((ub5) tj3Var.m22128k(gi5.f40854a)).mo256K().mo21327q(), tj3Var);
            boolean zM22120g3 = tj3Var.m22120g(eebVar) | tj3Var.m22120g(authorizationRequest2) | tj3Var.m22120g(hp5VarM16109I);
            Object objM22097O9 = tj3Var.m22097O();
            if (zM22120g3 || objM22097O9 == p84Var3) {
                objM22097O9 = new ui3() { // from class: gd9
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        Context context2 = context;
                        lda.m16130p(context2);
                        new geb(context2, new afb()).m12517d();
                        tld tldVarM11081d = eebVar.m11081d(authorizationRequest2);
                        t66 t66Var = t66VarM1263m;
                        vi3 vi3Var7 = vi3Var5;
                        dw6 dw6Var = new dw6(new C3445p2((Object) t66Var, vi3Var7, (Object) hp5VarM16109I, (Object) vi3Var3, 18), 9);
                        tldVarM11081d.getClass();
                        tldVarM11081d.mo5963e(xr9.f68587a, dw6Var);
                        tldVarM11081d.mo5961c(new dw6(vi3Var7, 10));
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O9);
            }
            ui3 ui3Var3 = (ui3) objM22097O9;
            boolean zM22120g4 = tj3Var.m22120g(hp5VarM16109I2);
            Object objM22097O10 = tj3Var.m22097O();
            if (zM22120g4 || objM22097O10 == p84Var3) {
                objM22097O10 = new y47(hp5VarM16109I2, 14);
                tj3Var.m22131l0(objM22097O10);
            }
            ui3 ui3Var4 = (ui3) objM22097O10;
            boolean zM22120g5 = tj3Var.m22120g(ui3Var3) | tj3Var.m22120g(ui3Var4) | tj3Var.m22120g(vi3Var5);
            Object objM22097O11 = tj3Var.m22097O();
            if (zM22120g5 || objM22097O11 == p84Var3) {
                objM22097O11 = new hd9(ui3Var3, ui3Var4, vi3Var5);
                tj3Var.m22131l0(objM22097O11);
            }
            final hd9 hd9Var = (hd9) objM22097O11;
            ui3 ui3Var5 = hd9Var.f42225a;
            ui3 ui3Var6 = hd9Var.f42226b;
            C2216d c2216d6 = c2216d4;
            boolean zM22124i5 = tj3Var.m22124i(c2216d6);
            Object objM22097O12 = tj3Var.m22097O();
            if (zM22124i5 || objM22097O12 == p84Var3) {
                objM22097O12 = new OnboardingV2ScreenKt$OnboardingV2Route$callbacks$1$1(1, c2216d6, C2216d.class, "validateEmail", "validateEmail(Ljava/lang/String;)V", 0);
                tj3Var.m22131l0(objM22097O12);
            }
            vi3 vi3Var7 = (vi3) ((FunctionReference) objM22097O12);
            boolean zM22124i6 = tj3Var.m22124i(c2216d6);
            Object objM22097O13 = tj3Var.m22097O();
            if (zM22124i6 || objM22097O13 == p84Var3) {
                objM22097O13 = new OnboardingV2ScreenKt$OnboardingV2Route$callbacks$2$1(1, c2216d6, C2216d.class, "validateUsername", "validateUsername(Ljava/lang/String;)V", 0);
                tj3Var.m22131l0(objM22097O13);
            }
            vi3 vi3Var8 = (vi3) ((FunctionReference) objM22097O13);
            boolean zM22124i7 = tj3Var.m22124i(c2216d6);
            Object objM22097O14 = tj3Var.m22097O();
            if (zM22124i7 || objM22097O14 == p84Var3) {
                objM22097O14 = new OnboardingV2ScreenKt$OnboardingV2Route$callbacks$3$1(4, c2216d6, C2216d.class, "registerWithEmail", "registerWithEmail(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 0);
                tj3Var.m22131l0(objM22097O14);
            }
            bj3 bj3Var = (bj3) ((FunctionReference) objM22097O14);
            boolean zM22124i8 = tj3Var.m22124i(c2216d6);
            Object objM22097O15 = tj3Var.m22097O();
            if (zM22124i8 || objM22097O15 == p84Var3) {
                objM22097O15 = new OnboardingV2ScreenKt$OnboardingV2Route$callbacks$4$1(0, c2216d6, C2216d.class, "clearError", "clearError()V", 0);
                tj3Var.m22131l0(objM22097O15);
            }
            ui3 ui3Var7 = (ui3) ((FunctionReference) objM22097O15);
            boolean zM22124i9 = tj3Var.m22124i(c2216d6);
            Object objM22097O16 = tj3Var.m22097O();
            if (zM22124i9 || objM22097O16 == p84Var3) {
                objM22097O16 = new OnboardingV2ScreenKt$OnboardingV2Route$callbacks$5$1(0, c2216d6, C2216d.class, "continueAfterPersonalizing", "continueAfterPersonalizing()V", 0);
                c2216d5 = c2216d6;
                tj3Var.m22131l0(objM22097O16);
            } else {
                c2216d5 = c2216d6;
            }
            dx6 dx6Var = new dx6(ui3Var, vi3Var, ui3Var5, ui3Var6, vi3Var7, vi3Var8, bj3Var, ui3Var7, (ui3) ((FunctionReference) objM22097O16));
            ui3Var2 = ui3Var;
            lx6 lx6Var = (lx6) t66VarM2513c.getValue();
            ym5 ym5Var = (ym5) t66VarM2513c2.getValue();
            boolean zBooleanValue = ((Boolean) t66VarM2513c3.getValue()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) t66VarM2513c4.getValue()).booleanValue();
            MiniLessonTemplate miniLessonTemplate = (MiniLessonTemplate) t66VarM2513c5.getValue();
            vz5 vz5Var = (vz5) t66VarM2513c6.getValue();
            boolean zM22124i10 = tj3Var.m22124i(c2216d5);
            if ((i3 & 896) != 256) {
                z = false;
            }
            boolean zM22120g6 = zM22124i10 | z | tj3Var.m22120g(hd9Var);
            Object objM22097O17 = tj3Var.m22097O();
            if (zM22120g6 || objM22097O17 == p84Var3) {
                objM22097O17 = new vi3() { // from class: com.lingq.feature.onboarding.v2.b
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        Object value;
                        OnboardingSelections onboardingSelections;
                        Object value2;
                        Object value3;
                        OnboardingSelections onboardingSelections2;
                        uv6 uv6Var;
                        Object value4;
                        Object value5;
                        Object value6;
                        iv6 iv6Var;
                        Object value7;
                        Object value8;
                        Object value9;
                        Object value10;
                        Object value11;
                        Object value12;
                        Object value13;
                        Object value14;
                        OnboardingSelections onboardingSelections3;
                        Object value15;
                        Object value16;
                        Object value17;
                        C2216d c2216d7 = c2216d5;
                        cc4 cc4Var = c2216d7.f27386k;
                        C3244l c3244l = c2216d7.f27366D;
                        C3244l c3244l2 = c2216d7.f27393r;
                        vv6 vv6Var = (vv6) obj;
                        vv6Var.getClass();
                        if (vv6Var instanceof bv6) {
                            String strM4194a = ((bv6) vv6Var).m4194a();
                            strM4194a.getClass();
                            String strM17893g = c2216d7.f27390o.m17893g();
                            if (strM17893g.equals(strM4194a)) {
                                strM17893g = null;
                            }
                            String str2 = strM17893g == null ? "" : strM17893g;
                            do {
                                value17 = c3244l2.getValue();
                            } while (!c3244l2.m15570h(value17, OnboardingSelections.m9151a((OnboardingSelections) value17, strM4194a, str2, null, null, null, null, null, "", null, 0, null, null, null, null, null, null, null, 130940)));
                            cx6.f34682a = strM4194a;
                            cx6.f34688g = "";
                            if (str2.length() == 0) {
                                str2 = null;
                            }
                            cx6.f34687f = str2;
                            C3244l c3244l3 = c2216d7.f27364B;
                            C2223d c2223d = c2216d7.f27388m;
                            c2223d.getClass();
                            qm3 qm3Var = c2223d.f27471a;
                            MiniLessonTemplate miniLessonTemplateM20026a = qm3Var.m20026a(strM4194a);
                            if (miniLessonTemplateM20026a == null) {
                                miniLessonTemplateM20026a = qm3Var.m20026a("en");
                            }
                            c3244l3.m15571i(miniLessonTemplateM20026a);
                            wfb.m23926u(lda.m16103C(c2216d7), null, null, new OnboardingV2ViewModel$loadMiniLessonReaderStyle$1(c2216d7, strM4194a, null), 3);
                            c2216d7.m9169b3();
                        } else if (vv6Var instanceof yu6) {
                            String strM25344a = ((yu6) vv6Var).m25344a();
                            strM25344a.getClass();
                            do {
                                value16 = c3244l2.getValue();
                            } while (!c3244l2.m15570h(value16, OnboardingSelections.m9151a((OnboardingSelections) value16, null, strM25344a, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 131069)));
                            cx6.f34687f = strM25344a;
                            Boolean bool = Boolean.FALSE;
                            c3244l.getClass();
                            c3244l.m15572j(null, bool);
                            c2216d7.m9169b3();
                        } else if (vv6Var instanceof hv6) {
                            String strM13487a = ((hv6) vv6Var).m13487a();
                            strM13487a.getClass();
                            do {
                                value15 = c3244l2.getValue();
                            } while (!c3244l2.m15570h(value15, OnboardingSelections.m9151a((OnboardingSelections) value15, null, null, strM13487a, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 131067)));
                            c2216d7.m9169b3();
                        } else if (vv6Var instanceof dv6) {
                            String strM10685a = ((dv6) vv6Var).m10685a();
                            strM10685a.getClass();
                            do {
                                value14 = c3244l2.getValue();
                                onboardingSelections3 = (OnboardingSelections) value14;
                            } while (!c3244l2.m15570h(value14, OnboardingSelections.m9151a(onboardingSelections3, null, null, null, strM10685a, null, null, null, null, null, 0, null, null, null, null, fa4.m11650l(onboardingSelections3.f27292d, strM10685a) ? onboardingSelections3.f27303o : AbstractC3194a.m15360M(), null, null, 114679)));
                            cx6.f34683b = strM10685a;
                            c2216d7.m9169b3();
                        } else if (vv6Var instanceof ov6) {
                            Set setM18523a = ((ov6) vv6Var).m18523a();
                            setM18523a.getClass();
                            do {
                                value13 = c3244l2.getValue();
                            } while (!c3244l2.m15570h(value13, OnboardingSelections.m9151a((OnboardingSelections) value13, null, null, null, null, setM18523a, null, null, null, null, 0, null, null, null, null, null, null, null, 131055)));
                            c2216d7.m9169b3();
                        } else if (vv6Var instanceof pv6) {
                            String strM19491a = ((pv6) vv6Var).m19491a();
                            strM19491a.getClass();
                            do {
                                value12 = c3244l2.getValue();
                            } while (!c3244l2.m15570h(value12, OnboardingSelections.m9151a((OnboardingSelections) value12, null, null, null, null, null, strM19491a, null, null, null, 0, null, null, null, null, null, null, null, 131039)));
                            c2216d7.m9169b3();
                        } else if (vv6Var instanceof sv6) {
                            Set setM21749a = ((sv6) vv6Var).m21749a();
                            setM21749a.getClass();
                            do {
                                value11 = c3244l2.getValue();
                            } while (!c3244l2.m15570h(value11, OnboardingSelections.m9151a((OnboardingSelections) value11, null, null, null, null, null, null, setM21749a, null, null, 0, null, null, null, null, null, null, null, 131007)));
                            String str3 = cx6.f34682a;
                            cx6.f34685d = u91.m22626r1(setM21749a);
                            c2216d7.m9169b3();
                        } else if (vv6Var instanceof tu6) {
                            String strM22308a = ((tu6) vv6Var).m22308a();
                            strM22308a.getClass();
                            do {
                                value10 = c3244l2.getValue();
                            } while (!c3244l2.m15570h(value10, OnboardingSelections.m9151a((OnboardingSelections) value10, null, null, null, null, null, null, null, strM22308a, null, 0, null, null, null, null, null, null, null, 130943)));
                            cx6.f34688g = strM22308a;
                            cc4Var.getClass();
                            Bundle bundle = new Bundle();
                            bundle.putString("preferred accent", strM22308a);
                            ((C1240a) ((hm5) cc4Var.f9881a)).m7025f("registration accent selected", bundle);
                            c2216d7.m9169b3();
                        } else if (vv6Var instanceof cv6) {
                            String strM9911a = ((cv6) vv6Var).m9911a();
                            strM9911a.getClass();
                            do {
                                value9 = c3244l2.getValue();
                            } while (!c3244l2.m15570h(value9, OnboardingSelections.m9151a((OnboardingSelections) value9, null, null, null, null, null, null, null, null, strM9911a, 0, null, null, null, null, null, null, null, 130815)));
                            c2216d7.m9169b3();
                        } else if (vv6Var instanceof rv6) {
                            int iM20866a = ((rv6) vv6Var).m20866a();
                            do {
                                value8 = c3244l2.getValue();
                            } while (!c3244l2.m15570h(value8, OnboardingSelections.m9151a((OnboardingSelections) value8, null, null, null, null, null, null, null, null, null, iM20866a, null, null, null, null, null, null, null, 130559)));
                            String str4 = cx6.f34682a;
                            cx6.f34684c = C2216d.m9164a3(iM20866a);
                            c2216d7.m9169b3();
                        } else {
                            boolean z3 = vv6Var instanceof uu6;
                            wu6 wu6Var = wu6.f67302a;
                            if (z3 || (vv6Var instanceof iv6) || (vv6Var instanceof ev6) || (vv6Var instanceof tv6) || (vv6Var instanceof uv6) || (vv6Var instanceof zu6) || (vv6Var instanceof gv6) || vv6Var.equals(wu6Var)) {
                                if (z3) {
                                    do {
                                        value7 = c3244l2.getValue();
                                    } while (!c3244l2.m15570h(value7, OnboardingSelections.m9151a((OnboardingSelections) value7, null, null, null, null, null, null, null, null, null, 0, ((uu6) vv6Var).m22942a(), null, null, null, null, null, null, 130047)));
                                } else if (vv6Var instanceof iv6) {
                                    do {
                                        value6 = c3244l2.getValue();
                                        iv6Var = (iv6) vv6Var;
                                    } while (!c3244l2.m15570h(value6, OnboardingSelections.m9151a((OnboardingSelections) value6, null, null, null, null, null, null, null, null, null, 0, null, iv6Var.m14161a(), null, null, null, null, null, 129023)));
                                    String str5 = cx6.f34682a;
                                    iv6Var.m14161a().getClass();
                                } else if (vv6Var instanceof ev6) {
                                    do {
                                        value5 = c3244l2.getValue();
                                    } while (!c3244l2.m15570h(value5, OnboardingSelections.m9151a((OnboardingSelections) value5, null, null, null, null, null, null, null, null, null, 0, null, null, ((ev6) vv6Var).m11365a(), null, null, null, null, 126975)));
                                } else if (vv6Var instanceof tv6) {
                                    do {
                                        value4 = c3244l2.getValue();
                                    } while (!c3244l2.m15570h(value4, OnboardingSelections.m9151a((OnboardingSelections) value4, null, null, null, null, null, null, null, null, null, 0, null, null, null, ((tv6) vv6Var).m22314a(), null, null, null, 122879)));
                                } else if (vv6Var instanceof uv6) {
                                    do {
                                        value3 = c3244l2.getValue();
                                        onboardingSelections2 = (OnboardingSelections) value3;
                                        uv6Var = (uv6) vv6Var;
                                    } while (!c3244l2.m15570h(value3, OnboardingSelections.m9151a(onboardingSelections2, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, AbstractC3194a.m15368U(onboardingSelections2.f27303o, new Pair(uv6Var.m22945b().getSlug(), Boolean.valueOf(uv6Var.m22944a()))), null, null, 114687)));
                                } else if (vv6Var instanceof zu6) {
                                    do {
                                        value2 = c3244l2.getValue();
                                    } while (!c3244l2.m15570h(value2, OnboardingSelections.m9151a((OnboardingSelections) value2, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, ((zu6) vv6Var).m25792a(), null, 98303)));
                                } else if (vv6Var.equals(wu6Var)) {
                                    ((C1240a) ((hm5) cc4Var.f9881a)).m7025f("registration commitment made", null);
                                    c2216d7.m9168Z2();
                                } else if (vv6Var instanceof gv6) {
                                    do {
                                        value = c3244l2.getValue();
                                        onboardingSelections = (OnboardingSelections) value;
                                    } while (!c3244l2.m15570h(value, OnboardingSelections.m9151a(onboardingSelections, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, u91.m22604V0(onboardingSelections.f27305q, ((gv6) vv6Var).m12917a()), 65535)));
                                }
                                c2216d7.m9169b3();
                            } else if (vv6Var.equals(lv6.f50192a)) {
                                Boolean bool2 = Boolean.TRUE;
                                c3244l.getClass();
                                c3244l.m15572j(null, bool2);
                            } else if (vv6Var.equals(av6.f7573a)) {
                                Boolean bool3 = Boolean.FALSE;
                                c3244l.getClass();
                                c3244l.m15572j(null, bool3);
                            } else if (vv6Var.equals(xu6.f68803a)) {
                                c2216d7.m9168Z2();
                            } else if (vv6Var.equals(vu6.f65943a)) {
                                fs6 fs6Var = c2216d7.f27381f;
                                ru6 ru6Var = OnboardingPage.Companion;
                                C3244l c3244l4 = c2216d7.f27392q;
                                int iIntValue = ((Number) c3244l4.getValue()).intValue();
                                ru6Var.getClass();
                                OnboardingPage onboardingPageM20820a = ru6.m20820a(iIntValue);
                                if (onboardingPageM20820a == OnboardingPage.PERSONALIZING) {
                                    c3244l4.m15572j(null, 0);
                                    SharedPreferences.Editor editorEdit = ((C3509qs) fs6Var.f39590b).f58118b.edit();
                                    editorEdit.getClass();
                                    editorEdit.putInt("onboarding_v2_current_page", 0);
                                    editorEdit.apply();
                                } else {
                                    ArrayList arrayListM9167Y2 = c2216d7.m9167Y2();
                                    int iIndexOf = arrayListM9167Y2.indexOf(onboardingPageM20820a);
                                    if (iIndexOf > 0) {
                                        c3244l4.m15572j(null, Integer.valueOf(((OnboardingPage) arrayListM9167Y2.get(iIndexOf - 1)).getIndex()));
                                        int iIntValue2 = ((Number) c3244l4.getValue()).intValue();
                                        SharedPreferences.Editor editorEdit2 = ((C3509qs) fs6Var.f39590b).f58118b.edit();
                                        editorEdit2.getClass();
                                        editorEdit2.putInt("onboarding_v2_current_page", iIntValue2);
                                        editorEdit2.apply();
                                    }
                                }
                            } else if (vv6Var.equals(jv6.f46231a)) {
                                c2216d7.m9168Z2();
                            } else {
                                if (vv6Var.equals(qv6.f58251a)) {
                                    C3509qs c3509qs = (C3509qs) c2216d7.f27387l.f39591c;
                                    for (LqAnalyticsVariant lqAnalyticsVariant : lm5.f49833b.f45827c) {
                                        if (!lqAnalyticsVariant.f14399c) {
                                            c3509qs.m20137k(lqAnalyticsVariant);
                                            boolean z4 = lqAnalyticsVariant.f14399c && !fa4.m11650l(lqAnalyticsVariant.f14398b, "not set");
                                            SharedPreferences.Editor editorEdit3 = c3509qs.f58118b.edit();
                                            editorEdit3.getClass();
                                            editorEdit3.putBoolean("active_onboarding_trial_promotion", z4);
                                            editorEdit3.apply();
                                            c2216d7.m9168Z2();
                                        }
                                    }
                                    uk9.m22775i("Collection contains no element matching the predicate.");
                                    return null;
                                }
                                if (vv6Var.equals(kv6.f48468a)) {
                                    cc4Var.m4523y(((Boolean) c2216d7.f27363A.getValue()).booleanValue() ? OnboardingPage.PAYWALL_CONFIDENCE_LONG : OnboardingPage.PAYWALL_CONFIDENCE, (OnboardingSelections) c3244l2.getValue());
                                    c2216d7.m9165W2();
                                } else if (vv6Var.equals(fv6.f39756a)) {
                                    ui3Var2.mo0a();
                                } else {
                                    boolean zEquals = vv6Var.equals(nv6.f53290a);
                                    hd9 hd9Var2 = hd9Var;
                                    if (zEquals) {
                                        hd9Var2.f42225a.mo0a();
                                    } else {
                                        if (!vv6Var.equals(mv6.f51887a)) {
                                            gm5.m12750e();
                                            return null;
                                        }
                                        hd9Var2.f42226b.mo0a();
                                    }
                                }
                            }
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O17);
            }
            vi3 vi3Var9 = (vi3) objM22097O17;
            tj3Var2 = tj3Var;
            m9160d(lx6Var, ym5Var, zBooleanValue, zBooleanValue2, miniLessonTemplate, vz5Var, dx6Var, vi3Var9, tj3Var2, 0);
            c2216d2 = c2216d5;
        } else {
            ui3Var2 = ui3Var;
            tj3Var2.m22102U();
            c2216d2 = c2216d;
        }
        x18 x18VarM22143u = tj3Var2.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new au4(c2216d2, str, ui3Var2, vi3Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static final void m9160d(final lx6 lx6Var, final ym5 ym5Var, final boolean z, final boolean z2, final MiniLessonTemplate miniLessonTemplate, final vz5 vz5Var, final dx6 dx6Var, final vi3 vi3Var, ye1 ye1Var, final int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(719932615);
        int i3 = i | (tj3Var.m22124i(lx6Var) ? 4 : 2) | (tj3Var.m22124i(ym5Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128) | (tj3Var.m22122h(z2) ? 2048 : 1024) | (tj3Var.m22124i(miniLessonTemplate) ? 16384 : 8192) | (tj3Var.m22124i(vz5Var) ? 131072 : 65536) | (tj3Var.m22120g(dx6Var) ? 1048576 : 524288) | (tj3Var.m22124i(vi3Var) ? 8388608 : 4194304);
        if (tj3Var.m22099R(i3 & 1, (4793491 & i3) != 4793490)) {
            List list = lx6Var.f50243b;
            Iterator it = list.iterator();
            int i4 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i4 = -1;
                    break;
                } else if (((OnboardingPage) it.next()).getIndex() == lx6Var.f50242a) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                i4 = 0;
            }
            boolean zM22124i = tj3Var.m22124i(lx6Var);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new C3757xf(lx6Var, 28);
                tj3Var.m22131l0(objM22097O);
            }
            final o72 o72VarM23066b = v27.m23066b(i4, tj3Var, (ui3) objM22097O);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new C0232g0();
                tj3Var.m22131l0(objM22097O2);
            }
            C0232g0 c0232g0 = (C0232g0) objM22097O2;
            final ld9 ld9Var = (ld9) tj3Var.m22128k(AbstractC0402n.f4826r);
            m9162f(o72VarM23066b, i4, list, tj3Var, 0);
            m9161e(lx6Var.f50247f, c0232g0, dx6Var.f36375h, tj3Var, 48);
            boolean z3 = lx6Var.f50250i || i4 > 0;
            boolean zM22120g = tj3Var.m22120g(ld9Var) | tj3Var.m22124i(lx6Var) | ((i3 & 29360128) == 8388608);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                i2 = 1;
                objM22097O3 = new ex6(ld9Var, lx6Var, vi3Var, 1);
                tj3Var.m22131l0(objM22097O3);
            } else {
                i2 = 1;
            }
            eh0.m11123c(0, 0, tj3Var, (ui3) objM22097O3, z3);
            int size = list.size() - i2;
            if (size < i2) {
                size = i2;
            }
            int i5 = i4 - 1;
            if (i5 < 0) {
                i5 = 0;
            }
            int i6 = 0;
            final dh9 dh9VarM750b = AbstractC0060b.m750b(i4 == 0 ? 0.0f : (i5 + i2) / size, null, "progress", null, tj3Var, 3072, 22);
            int i7 = o72VarM23066b.m1036k() == 0 ? i2 : 0;
            OnboardingPage onboardingPage = (OnboardingPage) u91.m22592J0(o72VarM23066b.m1036k(), list);
            if (onboardingPage != null && (onboardingPage == OnboardingPage.START || onboardingPage == OnboardingPage.PAYWALL_CONFIDENCE || onboardingPage == OnboardingPage.PAYWALL_CONFIDENCE_LONG)) {
                i6 = i2;
            }
            zf1 zf1Var = ge9.f40637a;
            final float f = (((fe9) tj3Var.m22128k(zf1Var)).f38952a * 2.0f) + 24.0f + ((fe9) tj3Var.m22128k(zf1Var)).f38956e;
            C0282a c0282aM4703P = ci8.m4703P(252716865, new gu6(c0232g0, i2), tj3Var);
            final boolean z4 = i7;
            final boolean z5 = i6;
            C0282a c0282aM4703P2 = ci8.m4703P(1188405592, new aj3() { // from class: hx6
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z6;
                    final t17 t17Var = (t17) obj;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    t17Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                    }
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                        int iHashCode = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m = tj3Var2.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM4411d);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var2, zi3Var3, numValueOf);
                        vi3 vi3Var2 = C0352b.f4305h;
                        oha.m18000f(tj3Var2, vi3Var2);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
                        e16 e16VarM4411d2 = c99.m4411d(b16Var, 1.0f);
                        final lx6 lx6Var2 = lx6Var;
                        boolean zM22124i2 = tj3Var2.m22124i(lx6Var2);
                        Object objM22097O4 = tj3Var2.m22097O();
                        p84 p84Var2 = we1.f66679a;
                        if (zM22124i2 || objM22097O4 == p84Var2) {
                            objM22097O4 = new kv4(lx6Var2, 14);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        vi3 vi3Var3 = (vi3) objM22097O4;
                        final float f2 = f;
                        final o72 o72Var = o72VarM23066b;
                        final ym5 ym5Var2 = ym5Var;
                        final boolean z7 = z;
                        final boolean z8 = z2;
                        final MiniLessonTemplate miniLessonTemplate2 = miniLessonTemplate;
                        final vz5 vz5Var2 = vz5Var;
                        final dx6 dx6Var2 = dx6Var;
                        final vi3 vi3Var4 = vi3Var;
                        thb.m22042a(o72Var, e16VarM4411d2, null, null, 0, null, null, false, false, vi3Var3, null, null, null, ci8.m4703P(640404191, new bj3() { // from class: jx6
                            @Override // p000.bj3
                            /* JADX INFO: renamed from: e */
                            public final Object mo825e(Object obj4, Object obj5, Object obj6, Object obj7) {
                                int iIntValue2 = ((Integer) obj5).intValue();
                                ye1 ye1Var3 = (ye1) obj6;
                                int iIntValue3 = ((Integer) obj7).intValue();
                                ((o27) obj4).getClass();
                                lx6 lx6Var3 = lx6Var2;
                                OnboardingPage onboardingPage2 = (OnboardingPage) lx6Var3.f50243b.get(iIntValue2);
                                boolean z9 = onboardingPage2 == OnboardingPage.START || onboardingPage2 == OnboardingPage.PAYWALL_CONFIDENCE || onboardingPage2 == OnboardingPage.PAYWALL_CONFIDENCE_LONG;
                                e16 e16VarM21611X = b16.f7762a;
                                e16 e16VarM4411d3 = c99.m4411d(e16VarM21611X, 1.0f);
                                if (!z9) {
                                    t17 t17Var2 = t17Var;
                                    e16VarM21611X = AbstractC3584sr.m21611X(e16VarM21611X, 0.0f, f2 + t17Var2.mo14021d(), 0.0f, t17Var2.mo14018a(), 5);
                                }
                                e16 e16VarMo3161g = e16VarM4411d3.mo3161g(e16VarM21611X);
                                tj3 tj3Var3 = (tj3) ye1Var3;
                                o72 o72Var2 = o72Var;
                                boolean zM22120g2 = ((((iIntValue3 & 112) ^ 48) > 32 && tj3Var3.m22116e(iIntValue2)) || (iIntValue3 & 48) == 32) | tj3Var3.m22120g(o72Var2);
                                Object objM22097O5 = tj3Var3.m22097O();
                                if (zM22120g2 || objM22097O5 == we1.f66679a) {
                                    objM22097O5 = new bt4(o72Var2, iIntValue2, 1);
                                    tj3Var3.m22131l0(objM22097O5);
                                }
                                e16 e16VarM1406a = AbstractC0309d.m1406a(e16VarMo3161g, (vi3) objM22097O5);
                                ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
                                int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                                l77 l77VarM22132m2 = tj3Var3.m22132m();
                                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM1406a);
                                se1.f60731q.getClass();
                                ui3 ui3Var2 = C0352b.f4299b;
                                tj3Var3.m22119f0();
                                if (tj3Var3.f62384S) {
                                    tj3Var3.m22130l(ui3Var2);
                                } else {
                                    tj3Var3.m22137o0();
                                }
                                oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d2);
                                oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
                                oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode2));
                                oha.m18000f(tj3Var3, C0352b.f4305h);
                                oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
                                AbstractC2215c.m9157a(onboardingPage2, lx6Var3, ym5Var2, z7, z8, miniLessonTemplate2, vz5Var2, iIntValue2 == ((Number) o72Var2.f2690t.getValue()).intValue(), dx6Var2, vi3Var4, tj3Var3, 0);
                                tj3Var3.m22139q(true);
                                return xfa.f68157a;
                            }
                        }, tj3Var2), tj3Var2, 100663344, 15100);
                        boolean z9 = !z5;
                        boolean z10 = !(lx6Var2.f50242a == OnboardingPage.PERSONALIZING.getIndex());
                        float fFloatValue = ((Number) dh9VarM750b.getValue()).floatValue();
                        float fMo14021d = t17Var.mo14021d();
                        ld9 ld9Var2 = ld9Var;
                        boolean zM22120g2 = tj3Var2.m22120g(ld9Var2) | tj3Var2.m22124i(lx6Var2) | tj3Var2.m22120g(vi3Var4);
                        Object objM22097O5 = tj3Var2.m22097O();
                        if (zM22120g2 || objM22097O5 == p84Var2) {
                            objM22097O5 = new ex6(ld9Var2, lx6Var2, vi3Var4, 0);
                            tj3Var2.m22131l0(objM22097O5);
                        }
                        AbstractC2215c.m9158b(z9, o72Var, z4, z10, fFloatValue, fMo14021d, (ui3) objM22097O5, tj3Var2, 0);
                        if (lx6Var2.f50246e) {
                            tj3Var2.m22111b0(626380508);
                            e16 e16VarM4411d3 = c99.m4411d(b16Var, 1.0f);
                            vh9 vh9Var = ps5.f56764b;
                            e16 e16VarM10007D = d32.m10007D(e16VarM4411d3, aa1.m198b(0.7f, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55868n), ss5.f61356d);
                            ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52812g, false);
                            int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
                            l77 l77VarM22132m2 = tj3Var2.m22132m();
                            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM10007D);
                            tj3Var2.m22119f0();
                            if (tj3Var2.f62384S) {
                                tj3Var2.m22130l(ui3Var);
                            } else {
                                tj3Var2.m22137o0();
                            }
                            oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d2);
                            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
                            AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var2);
                            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
                            dn7.m10492a(null, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55842a, 0.0f, 0L, 0, 0.0f, tj3Var2, 0, 61);
                            z6 = true;
                            tj3Var2.m22139q(true);
                            tj3Var2.m22139q(false);
                        } else {
                            z6 = true;
                            tj3Var2.m22111b0(626757220);
                            tj3Var2.m22139q(false);
                        }
                        tj3Var2.m22139q(z6);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var);
            tj3Var = tj3Var;
            b34.m3232b(null, null, null, c0282aM4703P, null, 0, 0L, 0L, null, c0282aM4703P2, tj3Var, 805309440, 503);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(ym5Var, z, z2, miniLessonTemplate, vz5Var, dx6Var, vi3Var, i) { // from class: ix6

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ym5 f44730b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f44731c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f44732d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ MiniLessonTemplate f44733e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ vz5 f44734f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ dx6 f44735g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ vi3 f44736h;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC2215c.m9160d(this.f44729a, this.f44730b, this.f44731c, this.f44732d, this.f44733e, this.f44734f, this.f44735g, this.f44736h, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m9161e(ut6 ut6Var, C0232g0 c0232g0, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1228889655);
        int i2 = (tj3Var.m22120g(ut6Var) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new OnboardingV2ScreenKt$ShowErrorSnackbar$1$1(ut6Var, c0232g0, ui3Var, null);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O, ut6Var);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new di0(i, 8, ut6Var, c0232g0, ui3Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m9162f(AbstractC0150d abstractC0150d, int i, List list, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-161547587);
        int i3 = i2 | (tj3Var.m22120g(abstractC0150d) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22124i(list) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(list);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            Integer numValueOf = Integer.valueOf(i);
            boolean zM22124i = ((i3 & 14) == 4) | tj3Var.m22124i(list) | ((i3 & 112) == 32);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                OnboardingV2ScreenKt$SyncPagerToCurrentIndex$1$1 onboardingV2ScreenKt$SyncPagerToCurrentIndex$1$1 = new OnboardingV2ScreenKt$SyncPagerToCurrentIndex$1$1(list, abstractC0150d, i, t66Var, null);
                tj3Var.m22131l0(onboardingV2ScreenKt$SyncPagerToCurrentIndex$1$1);
                objM22097O2 = onboardingV2ScreenKt$SyncPagerToCurrentIndex$1$1;
            }
            d32.m10049l(numValueOf, list, (zi3) objM22097O2, tj3Var);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3504qn(i, i2, 10, abstractC0150d, list);
        }
    }
}
