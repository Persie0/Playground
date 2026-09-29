package com.lingq.feature.reader.reader;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0232g0;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonPath;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.lesson.LessonCard;
import com.lingq.core.domain.model.lesson.LessonProcessingStatus;
import com.lingq.core.domain.model.lesson.LessonSentence;
import com.lingq.core.domain.model.lesson.LessonWord;
import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.model.review.ReviewType;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.WordStatus;
import com.lingq.core.domain.model.token.TextTokenType;
import com.lingq.core.domain.model.token.TokenControllerType;
import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import com.lingq.core.domain.model.token.TokenTransliteration;
import com.lingq.core.p012ui.LessonInfoSource;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.settings.theme.AbstractC1881a;
import com.lingq.core.settings.theme.C1883c;
import com.lingq.core.settings.theme.ThemeSettingsTab;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.TokenFragmentData;
import com.lingq.core.token.TokenPopupData;
import com.lingq.core.token.TokenViewState;
import com.lingq.core.tooltips.components.AbstractC1915b;
import com.lingq.feature.reader.R$id;
import com.lingq.feature.reader.R$string;
import com.lingq.feature.reader.content.C2260a;
import com.lingq.feature.reader.content.state.C2264a;
import com.lingq.feature.reader.content.state.C2265b;
import com.lingq.feature.reader.preferences.C2469a;
import com.lingq.feature.reader.reader.AbstractC2501g;
import com.lingq.feature.reader.reader.C2493a;
import com.lingq.feature.reader.reader.p017ui.AbstractC2506c;
import com.lingq.feature.reader.reader.state.C2503b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.C2919d9;
import p000.C3386nv;
import p000.InterfaceC3055gy;
import p000.a45;
import p000.a89;
import p000.aa1;
import p000.aa6;
import p000.ab1;
import p000.as4;
import p000.av7;
import p000.b16;
import p000.b5d;
import p000.bb1;
import p000.bt7;
import p000.bv7;
import p000.bx7;
import p000.c18;
import p000.c3a;
import p000.c7a;
import p000.c99;
import p000.ca6;
import p000.cg7;
import p000.ci0;
import p000.ci8;
import p000.cj3;
import p000.cjc;
import p000.cma;
import p000.cs7;
import p000.cv7;
import p000.d32;
import p000.da6;
import p000.dh9;
import p000.ds7;
import p000.dua;
import p000.dv7;
import p000.e16;
import p000.e28;
import p000.e5a;
import p000.eh0;
import p000.ei3;
import p000.ev7;
import p000.f08;
import p000.f5a;
import p000.fa4;
import p000.fa6;
import p000.fe9;
import p000.fkc;
import p000.ft7;
import p000.fv7;
import p000.fy9;
import p000.g54;
import p000.gc0;
import p000.ge9;
import p000.gi5;
import p000.gjc;
import p000.gm5;
import p000.gr3;
import p000.gs7;
import p000.gv7;
import p000.h08;
import p000.h24;
import p000.hjd;
import p000.hl7;
import p000.hn0;
import p000.ho5;
import p000.ht5;
import p000.hx7;
import p000.iy7;
import p000.j25;
import p000.j3a;
import p000.ja6;
import p000.jfa;
import p000.js7;
import p000.ju7;
import p000.jy7;
import p000.k89;
import p000.ka6;
import p000.kk0;
import p000.l6b;
import p000.l77;
import p000.led;
import p000.ln0;
import p000.lu7;
import p000.ly7;
import p000.mbd;
import p000.mdd;
import p000.ms5;
import p000.mt7;
import p000.mx0;
import p000.mx8;
import p000.n2a;
import p000.nj0;
import p000.ns7;
import p000.nu7;
import p000.nz9;
import p000.og8;
import p000.oha;
import p000.ojd;
import p000.or1;
import p000.ot7;
import p000.ou7;
import p000.ox7;
import p000.p2a;
import p000.p84;
import p000.pb1;
import p000.pfa;
import p000.ps5;
import p000.pt7;
import p000.pu7;
import p000.q7b;
import p000.qe5;
import p000.qh0;
import p000.qj8;
import p000.ql4;
import p000.qu7;
import p000.qv2;
import p000.qv7;
import p000.rd8;
import p000.ru7;
import p000.ry7;
import p000.sc9;
import p000.se1;
import p000.si5;
import p000.sj8;
import p000.skc;
import p000.ss5;
import p000.su7;
import p000.sx7;
import p000.sy7;
import p000.t66;
import p000.t9a;
import p000.th7;
import p000.thc;
import p000.tj3;
import p000.tn7;
import p000.tu7;
import p000.ty7;
import p000.u4d;
import p000.u91;
import p000.ub5;
import p000.ud6;
import p000.ui3;
import p000.un1;
import p000.un7;
import p000.ur7;
import p000.uu7;
import p000.uwc;
import p000.v08;
import p000.v56;
import p000.v91;
import p000.vh9;
import p000.vi3;
import p000.vjc;
import p000.vs2;
import p000.vu7;
import p000.vy7;
import p000.vz1;
import p000.w41;
import p000.w65;
import p000.we1;
import p000.wfb;
import p000.wh7;
import p000.ws6;
import p000.wu7;
import p000.wy7;
import p000.x18;
import p000.x96;
import p000.xa0;
import p000.xfa;
import p000.xi3;
import p000.xkc;
import p000.xu7;
import p000.xx1;
import p000.xy0;
import p000.xz7;
import p000.y38;
import p000.ye1;
import p000.yu7;
import p000.yx4;
import p000.yy0;
import p000.yz4;
import p000.ze2;
import p000.zg0;
import p000.zi3;
import p000.zu7;
import p000.zu8;

/* JADX INFO: renamed from: com.lingq.feature.reader.reader.g */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2501g {
    /* JADX INFO: renamed from: a */
    public static final void m9400a(boolean z, ui3 ui3Var, C0282a c0282a, ye1 ye1Var, int i) {
        boolean z2 = z;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-271311398);
        int i2 = (tj3Var.m22122h(z2) ? 32 : 16) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new xa0(29, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            int i3 = (i2 >> 3) & 14;
            eh0.m11123c(i3, 0, tj3Var, (ui3) objM22097O, z2);
            vs2 vs2VarM772g = AbstractC0070i.m772g(null, 0.0f, 3);
            b16 b16Var = b16.f7762a;
            AbstractC0054a.m729d(z2, c99.m4411d(b16Var, 1.0f), vs2VarM772g, null, null, ci8.m4703P(1023612594, new ze2(8, ui3Var), tj3Var), tj3Var, i3 | 197040, 24);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new qv7(3);
                tj3Var.m22131l0(objM22097O2);
            }
            vs2 vs2VarM778m = AbstractC0070i.m778m((vi3) objM22097O2, 1);
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new qv7(3);
                tj3Var.m22131l0(objM22097O3);
            }
            z2 = z;
            AbstractC0054a.m729d(z2, ci0.f10109a.mo3727a(b16Var, nj0.f52815j), vs2VarM778m, AbstractC0070i.m780o((vi3) objM22097O3, 1), null, ci8.m4703P(-679486743, new mx0(c0282a, 6), tj3Var), tj3Var, i3 | 200064, 16);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ln0(z2, ui3Var, c0282a, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m9401b(jy7 jy7Var, final yz4 yz4Var, final rd8 rd8Var, final float f, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, final int i) {
        int i2;
        jy7 jy7Var2;
        vi3 vi3Var3;
        vi3 vi3Var4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-332347346);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(jy7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(yz4Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(rd8Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22114d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22124i(vi3Var2) ? 131072 : 65536;
        }
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = yz4Var.f70686t ? rd8Var.f59125h : rd8Var.f59121d;
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
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
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            boolean z = yz4Var.f70686t;
            Lesson lesson = yz4Var.f70667a;
            boolean z2 = (lesson != null ? lesson.f19162u : null) != null;
            boolean z3 = jy7Var.f46394b;
            boolean z4 = yz4Var.f70675i;
            int i4 = 458752 & i2;
            boolean z5 = i4 == 131072;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z5 || objM22097O == p84Var) {
                objM22097O = new sy7(vi3Var2, 18);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var2 = (ui3) objM22097O;
            int i5 = 57344 & i2;
            boolean z6 = i5 == 16384;
            Object objM22097O2 = tj3Var.m22097O();
            if (z6 || objM22097O2 == p84Var) {
                objM22097O2 = new sy7(vi3Var, 20);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3 ui3Var3 = (ui3) objM22097O2;
            boolean z7 = i5 == 16384;
            Object objM22097O3 = tj3Var.m22097O();
            if (z7 || objM22097O3 == p84Var) {
                objM22097O3 = new sy7(vi3Var, 21);
                tj3Var.m22131l0(objM22097O3);
            }
            ui3 ui3Var4 = (ui3) objM22097O3;
            boolean zM22124i = (i4 == 131072) | tj3Var.m22124i(yz4Var) | (i5 == 16384);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i || objM22097O4 == p84Var) {
                objM22097O4 = new zg0(yz4Var, vi3Var, vi3Var2, 26);
                tj3Var.m22131l0(objM22097O4);
            }
            ui3 ui3Var5 = (ui3) objM22097O4;
            boolean z8 = i4 == 131072;
            Object objM22097O5 = tj3Var.m22097O();
            if (z8 || objM22097O5 == p84Var) {
                objM22097O5 = new wh7(vi3Var2, 12);
                tj3Var.m22131l0(objM22097O5);
            }
            vi3 vi3Var5 = (vi3) objM22097O5;
            boolean z9 = i4 == 131072;
            Object objM22097O6 = tj3Var.m22097O();
            if (z9 || objM22097O6 == p84Var) {
                objM22097O6 = new wh7(vi3Var2, 13);
                tj3Var.m22131l0(objM22097O6);
            }
            vi3 vi3Var6 = (vi3) objM22097O6;
            boolean z10 = i4 == 131072;
            Object objM22097O7 = tj3Var.m22097O();
            if (z10 || objM22097O7 == p84Var) {
                objM22097O7 = new wh7(vi3Var2, 14);
                tj3Var.m22131l0(objM22097O7);
            }
            cjc.m4785a(jy7Var, z, i3, z2, z3, z4, ui3Var2, ui3Var3, ui3Var4, ui3Var5, vi3Var5, vi3Var6, (vi3) objM22097O7, null, tj3Var, i2 & 14);
            jy7Var2 = jy7Var;
            if (jy7Var2.f46394b) {
                tj3Var.m22111b0(1210935114);
                boolean z11 = jy7Var2.f46393a;
                boolean z12 = i4 == 131072;
                Object objM22097O8 = tj3Var.m22097O();
                if (z12 || objM22097O8 == p84Var) {
                    vi3Var4 = vi3Var2;
                    objM22097O8 = new sy7(vi3Var4, 22);
                    tj3Var.m22131l0(objM22097O8);
                } else {
                    vi3Var4 = vi3Var2;
                }
                ui3 ui3Var6 = (ui3) objM22097O8;
                boolean z13 = i4 == 131072;
                Object objM22097O9 = tj3Var.m22097O();
                if (z13 || objM22097O9 == p84Var) {
                    objM22097O9 = new sy7(vi3Var4, 23);
                    tj3Var.m22131l0(objM22097O9);
                }
                ui3 ui3Var7 = (ui3) objM22097O9;
                boolean z14 = i5 == 16384;
                Object objM22097O10 = tj3Var.m22097O();
                if (z14 || objM22097O10 == p84Var) {
                    vi3Var3 = vi3Var;
                    objM22097O10 = new sy7(vi3Var3, 24);
                    tj3Var.m22131l0(objM22097O10);
                } else {
                    vi3Var3 = vi3Var;
                }
                ui3 ui3Var8 = (ui3) objM22097O10;
                boolean z15 = i4 == 131072;
                Object objM22097O11 = tj3Var.m22097O();
                if (z15 || objM22097O11 == p84Var) {
                    objM22097O11 = new sy7(vi3Var4, 19);
                    tj3Var.m22131l0(objM22097O11);
                }
                cjc.m4786b(z11, ui3Var6, ui3Var7, ui3Var8, (ui3) objM22097O11, AbstractC3584sr.m21611X(ci0.f10109a.mo3727a(b16Var, nj0.f52811f), f, 0.0f, 0.0f, 0.0f, 14), tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                vi3Var3 = vi3Var;
                vi3Var4 = vi3Var2;
                tj3Var.m22111b0(1211473274);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            jy7Var2 = jy7Var;
            vi3Var3 = vi3Var;
            vi3Var4 = vi3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final jy7 jy7Var3 = jy7Var2;
            final vi3 vi3Var7 = vi3Var4;
            final vi3 vi3Var8 = vi3Var3;
            x18VarM22143u.f67642d = new zi3() { // from class: yy7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    AbstractC2501g.m9401b(jy7Var3, yz4Var, rd8Var, f, vi3Var8, vi3Var7, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m9402c(h24 h24Var, String str, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1918645651);
        int i2 = i | (tj3Var2.m22124i(h24Var) ? 32 : 16) | (tj3Var2.m22120g(str) ? 256 : 128) | (tj3Var2.m22124i(ui3Var) ? 2048 : 1024) | (tj3Var2.m22124i(ui3Var2) ? 16384 : 8192);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            boolean z = h24Var != null;
            vs2 vs2VarM778m = AbstractC0070i.m778m(null, 3);
            qv2 qv2VarM20180a = AbstractC0070i.m780o(null, 3).m20180a(AbstractC0070i.m773h(null, 3));
            e16 e16VarMo3727a = ci0.f10109a.mo3727a(b16.f7762a, nj0.f52809d);
            WeakHashMap weakHashMap = l6b.f49204w;
            tj3Var = tj3Var2;
            AbstractC0054a.m729d(z, wfb.m23904F(e16VarMo3727a, ho5.m13397r(tj3Var2).f49210f), vs2VarM778m, qv2VarM20180a, null, ci8.m4703P(-1839044283, new hn0(h24Var, context, str, ui3Var2, ui3Var, 15), tj3Var2), tj3Var, 200064, 16);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9((Object) h24Var, (Object) str, (Object) ui3Var, (xi3) ui3Var2, i, 23);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m9403d(C2493a c2493a, C1909e c1909e, C1883c c1883c, ud6 ud6Var, w41 w41Var, ye1 ye1Var, int i) {
        C2493a c2493a2;
        C1909e c1909e2;
        C1883c c1883c2;
        C1883c c1883c3;
        C2493a c2493a3;
        C1909e c1909e3;
        boolean z;
        t66 t66Var;
        Object readerScreenKt$ReaderRoute$3$1;
        C2493a c2493a4;
        tj3 tj3Var;
        C0232g0 c0232g0;
        t66 t66Var2;
        final C2493a c2493a5;
        final C1909e c1909e4;
        final t66 t66Var3;
        final ud6 ud6Var2;
        final t66 t66Var4;
        tj3 tj3Var2;
        final C1909e c1909e5;
        Object obj;
        String str;
        C1909e c1909e6;
        vi3 vi3Var;
        C1883c c1883c4;
        vi3 vi3Var2;
        b16 b16Var;
        C2493a c2493a6;
        Object obj2;
        t66 t66Var5;
        vi3 vi3Var3;
        Object obj3;
        Object value;
        final w41 w41Var2 = w41Var;
        ud6Var.getClass();
        w41Var2.getClass();
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(798923448);
        int i2 = i | 146 | (tj3Var3.m22124i(ud6Var) ? 2048 : 1024) | (tj3Var3.m22124i(w41Var2) ? 16384 : 8192);
        if (tj3Var3.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var3.m22104W();
            if ((i & 1) == 0 || tj3Var3.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var3);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                C2493a c2493a7 = (C2493a) pfa.m19114d(y38.m24933a(C2493a.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var3), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var3);
                dua duaVarM21396a2 = si5.m21396a(tj3Var3);
                if (duaVarM21396a2 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                C1909e c1909e7 = (C1909e) pfa.m19114d(y38.m24933a(C1909e.class), duaVarM21396a2, null, AbstractC3584sr.m21591B(duaVarM21396a2, tj3Var3), duaVarM21396a2 instanceof gr3 ? ((gr3) duaVarM21396a2).mo2103e() : or1.f54780b, tj3Var3);
                dua duaVarM21396a3 = si5.m21396a(tj3Var3);
                if (duaVarM21396a3 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c1883c3 = (C1883c) pfa.m19114d(y38.m24933a(C1883c.class), duaVarM21396a3, null, AbstractC3584sr.m21591B(duaVarM21396a3, tj3Var3), duaVarM21396a3 instanceof gr3 ? ((gr3) duaVarM21396a3).mo2103e() : or1.f54780b, tj3Var3);
                    c2493a3 = c2493a7;
                    c1909e3 = c1909e7;
                }
            } else {
                tj3Var3.m22102U();
                c2493a3 = c2493a;
                c1909e3 = c1909e;
                c1883c3 = c1883c;
            }
            tj3Var3.m22140r();
            C2260a c2260a = c2493a3.f30212e;
            C2503b c2503b = c2493a3.f30223m;
            C2469a c2469a = c2493a3.f30220j;
            cma cmaVar = c2493a3.f30206b;
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2260a.f27957w, tj3Var3);
            final String strMo4589b2 = cmaVar.mo4589b2();
            final Context context = (Context) tj3Var3.m22128k(AbstractC0394f.f4761b);
            boolean z2 = (!fy9.m12247b(t9a.m21912b(tj3Var3)) && ((Configuration) tj3Var3.m22128k(AbstractC0394f.f4760a)).orientation == 2) && ((Boolean) AbstractC0711a.m2513c(c2493a3.f30202X, tj3Var3).getValue()).booleanValue();
            Object objM22097O = tj3Var3.m22097O();
            Object obj4 = we1.f66679a;
            if (objM22097O == obj4) {
                objM22097O = AbstractC0278f.m1260j(SidePanelContent.Vocabulary);
                tj3Var3.m22131l0(objM22097O);
            }
            t66 t66Var6 = (t66) objM22097O;
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c1909e3.f23886X, tj3Var3);
            final t66 t66VarM2513c3 = AbstractC0711a.m2513c(cmaVar.mo4594r1(), tj3Var3);
            c1883c3.getClass();
            strMo4589b2.getClass();
            C3244l c3244l = c1883c3.f23312m;
            c3244l.getClass();
            c3244l.m15572j(null, strMo4589b2);
            t66 t66VarM2513c4 = AbstractC0711a.m2513c(c2493a3.f30214f.f28111G, tj3Var3);
            t66 t66VarM2513c5 = AbstractC0711a.m2513c(c1883c3.f23314o, tj3Var3);
            t66 t66VarM2513c6 = AbstractC0711a.m2513c((c18) c2493a3.f30216g.f55514c, tj3Var3);
            t66 t66VarM2513c7 = AbstractC0711a.m2513c(c2493a3.f30200V, tj3Var3);
            t66 t66VarM2513c8 = AbstractC0711a.m2513c(c2493a3.f30218h.f29783q, tj3Var3);
            t66 t66VarM2513c9 = AbstractC0711a.m2513c(c2469a.f29846l, tj3Var3);
            t66 t66VarM2513c10 = AbstractC0711a.m2513c(c2493a3.f30222l.f30311d, tj3Var3);
            Object objM22097O2 = tj3Var3.m22097O();
            if (objM22097O2 == obj4) {
                objM22097O2 = d32.m10013K(tj3Var3);
                tj3Var3.m22131l0(objM22097O2);
            }
            final un1 un1Var = (un1) objM22097O2;
            t66 t66VarM2513c11 = AbstractC0711a.m2513c(c2493a3.f30204Z, tj3Var3);
            AbstractC0711a.m2513c(c2469a.f29841g, tj3Var3);
            Integer numValueOf = Integer.valueOf(c2493a3.f30190L);
            Boolean boolValueOf = Boolean.valueOf(c2493a3.f30194P);
            boolean zM22124i = tj3Var3.m22124i(c2493a3);
            final C1883c c1883c5 = c1883c3;
            Object objM22097O3 = tj3Var3.m22097O();
            if (zM22124i || objM22097O3 == obj4) {
                objM22097O3 = new ReaderScreenKt$ReaderRoute$1$1(c2493a3, null);
                tj3Var3.m22131l0(objM22097O3);
            }
            d32.m10049l(numValueOf, boolValueOf, (zi3) objM22097O3, tj3Var3);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            boolean zM22124i2 = tj3Var3.m22124i(c1909e3) | tj3Var3.m22124i(c2493a3) | tj3Var3.m22122h(z2);
            Object objM22097O4 = tj3Var3.m22097O();
            if (zM22124i2 || objM22097O4 == obj4) {
                z = z2;
                t66Var = t66VarM2513c10;
                ReaderScreenKt$ReaderRoute$2$1 readerScreenKt$ReaderRoute$2$1 = new ReaderScreenKt$ReaderRoute$2$1(c1909e3, c2493a3, z, t66Var6, null);
                tj3Var3.m22131l0(readerScreenKt$ReaderRoute$2$1);
                objM22097O4 = readerScreenKt$ReaderRoute$2$1;
            } else {
                z = z2;
                t66Var = t66VarM2513c10;
            }
            d32.m10047k(tj3Var3, (zi3) objM22097O4, boolValueOf2);
            t66 t66VarM2513c12 = AbstractC0711a.m2513c(c2493a3.f30229s.f27862e, tj3Var3);
            Object objM22097O5 = tj3Var3.m22097O();
            if (objM22097O5 == obj4) {
                objM22097O5 = new C0232g0();
                tj3Var3.m22131l0(objM22097O5);
            }
            C0232g0 c0232g1 = (C0232g0) objM22097O5;
            t66 t66VarM2513c13 = AbstractC0711a.m2513c(c2493a3.f30230t.f30503l, tj3Var3);
            String strM23620a0 = vz1.m23620a0(tj3Var3, R$string.lesson_simplify_started);
            String strM23620a1 = vz1.m23620a0(tj3Var3, R$string.lesson_simplify_not_simplified);
            String strM23620a2 = vz1.m23620a0(tj3Var3, R$string.lesson_simplify_not_available);
            String strM23620a3 = vz1.m23620a0(tj3Var3, R$string.lesson_simplify_ready);
            String strM23620a4 = vz1.m23620a0(tj3Var3, R$string.lesson_simplify_open);
            String strM23620a5 = vz1.m23620a0(tj3Var3, com.lingq.core.p012ui.R$string.texts_try_later);
            t66 t66Var7 = t66Var;
            k89 k89Var = (k89) t66VarM2513c13.getValue();
            boolean zM22120g = tj3Var3.m22120g(t66VarM2513c13) | tj3Var3.m22120g(strM23620a0) | tj3Var3.m22120g(strM23620a1) | tj3Var3.m22120g(strM23620a5) | tj3Var3.m22120g(strM23620a2) | tj3Var3.m22120g(strM23620a3) | tj3Var3.m22120g(strM23620a4) | tj3Var3.m22124i(w41Var2) | tj3Var3.m22120g(t66VarM2513c) | tj3Var3.m22124i(c2493a3);
            C2493a c2493a8 = c2493a3;
            Object objM22097O6 = tj3Var3.m22097O();
            if (zM22120g || objM22097O6 == obj4) {
                c2493a4 = c2493a8;
                tj3Var = tj3Var3;
                readerScreenKt$ReaderRoute$3$1 = new ReaderScreenKt$ReaderRoute$3$1(c0232g1, strM23620a0, strM23620a1, strM23620a5, strM23620a2, strM23620a3, strM23620a4, w41Var, c2493a4, t66VarM2513c13, t66VarM2513c, null);
                c0232g0 = c0232g1;
                w41Var2 = w41Var;
                t66Var2 = t66VarM2513c;
                tj3Var.m22131l0(readerScreenKt$ReaderRoute$3$1);
            } else {
                t66Var2 = t66VarM2513c;
                tj3Var = tj3Var3;
                c0232g0 = c0232g1;
                c2493a4 = c2493a8;
                readerScreenKt$ReaderRoute$3$1 = objM22097O6;
            }
            d32.m10047k(tj3Var, (zi3) readerScreenKt$ReaderRoute$3$1, k89Var);
            TokenRelatedPhrase tokenRelatedPhrase = ((f5a) t66VarM2513c2.getValue()).f38468Z;
            t66 t66VarM2513c14 = AbstractC0711a.m2513c(c2493a4.f30203Y, tj3Var);
            boolean zM22124i3 = tj3Var.m22124i(tokenRelatedPhrase) | tj3Var.m22120g(t66VarM2513c14) | tj3Var.m22124i(c2493a4) | tj3Var.m22124i(c1909e3);
            Object objM22097O7 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O7 == obj4) {
                C1909e c1909e8 = c1909e3;
                C2493a c2493a9 = c2493a4;
                ReaderScreenKt$ReaderRoute$4$1 readerScreenKt$ReaderRoute$4$1 = new ReaderScreenKt$ReaderRoute$4$1(tokenRelatedPhrase, c2493a9, c1909e8, t66VarM2513c14, null);
                c2493a5 = c2493a9;
                c1909e4 = c1909e8;
                tj3Var.m22131l0(readerScreenKt$ReaderRoute$4$1);
                objM22097O7 = readerScreenKt$ReaderRoute$4$1;
            } else {
                c1909e4 = c1909e3;
                c2493a5 = c2493a4;
            }
            d32.m10047k(tj3Var, (zi3) objM22097O7, tokenRelatedPhrase);
            final boolean z3 = z;
            boolean zM22122h = tj3Var.m22122h(z3) | tj3Var.m22124i(c1909e4);
            Object objM22097O8 = tj3Var.m22097O();
            if (zM22122h || objM22097O8 == obj4) {
                t66Var3 = t66Var6;
                objM22097O8 = new cj3() { // from class: com.lingq.feature.reader.reader.b
                    @Override // p000.cj3
                    /* JADX INFO: renamed from: i */
                    public final Object mo1291i(Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                        TokenRelatedPhrase tokenRelatedPhrase2 = (TokenRelatedPhrase) obj5;
                        int iIntValue = ((Integer) obj6).intValue();
                        int iIntValue2 = ((Integer) obj7).intValue();
                        int iIntValue3 = ((Integer) obj8).intValue();
                        int iIntValue4 = ((Integer) obj9).intValue();
                        tokenRelatedPhrase2.getClass();
                        String str2 = tokenRelatedPhrase2.f19613b;
                        TokenType tokenType = TokenType.NewWordOrPhraseType;
                        List list = tokenRelatedPhrase2.f19614c;
                        boolean z4 = z3;
                        c1909e4.m8760d3(new c3a(new TokenPopupData(str2, str2, tokenType, iIntValue, iIntValue2, null, z4 ? TokenViewState.Expanded.f23709a : TokenViewState.Collapsed.f23708a, TokenControllerType.Lesson, list, 0, null, true, 0, 0, null, iIntValue3, iIntValue4, 0, 0, z4, null, null, false, 7763488, null), false));
                        if (z4) {
                            t66Var3.setValue(SidePanelContent.TokenPopup);
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O8);
            } else {
                t66Var3 = t66Var6;
            }
            cj3 cj3Var = (cj3) objM22097O8;
            boolean zM22124i4 = tj3Var.m22124i(c2493a5) | tj3Var.m22124i(c1909e4) | tj3Var.m22120g(cj3Var);
            Object objM22097O9 = tj3Var.m22097O();
            if (zM22124i4 || objM22097O9 == obj4) {
                objM22097O9 = new ws6(c2493a5, c1909e4, cj3Var, 5);
                tj3Var.m22131l0(objM22097O9);
            }
            final vi3 vi3Var4 = (vi3) objM22097O9;
            ub5 ub5Var = (ub5) tj3Var.m22128k(gi5.f40854a);
            boolean zM22124i5 = tj3Var.m22124i(c2493a5) | tj3Var.m22124i(ub5Var);
            Object objM22097O10 = tj3Var.m22097O();
            if (zM22124i5 || objM22097O10 == obj4) {
                objM22097O10 = new sx7(1, ub5Var, c2493a5);
                tj3Var.m22131l0(objM22097O10);
            }
            d32.m10041h(ub5Var, (vi3) objM22097O10, tj3Var);
            boolean zBooleanValue = ((Boolean) AbstractC0711a.m2513c(c2493a5.f30205a0, tj3Var).getValue()).booleanValue();
            boolean zM22124i6 = tj3Var.m22124i(c2493a5);
            Object objM22097O11 = tj3Var.m22097O();
            if (zM22124i6 || objM22097O11 == obj4) {
                objM22097O11 = new cg7(c2493a5, 3);
                tj3Var.m22131l0(objM22097O11);
            }
            vi3 vi3Var5 = (vi3) objM22097O11;
            boolean zM22124i7 = tj3Var.m22124i(c2493a5);
            Object objM22097O12 = tj3Var.m22097O();
            if (zM22124i7 || objM22097O12 == obj4) {
                objM22097O12 = new ry7(c2493a5, 3);
                tj3Var.m22131l0(objM22097O12);
            }
            u4d.m22468c(zBooleanValue, vi3Var5, (ui3) objM22097O12, tj3Var, 0);
            t66 t66VarM2513c15 = AbstractC0711a.m2513c(c2493a5.f30207b0, tj3Var);
            Object objM22097O13 = tj3Var.m22097O();
            if (objM22097O13 == obj4) {
                objM22097O13 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O13);
            }
            final t66 t66Var8 = (t66) objM22097O13;
            final Lesson lesson = ((yz4) t66Var2.getValue()).f70667a;
            boolean zM22124i8 = tj3Var.m22124i(c2493a5) | tj3Var.m22124i(c1909e4) | tj3Var.m22124i(ud6Var);
            Object objM22097O14 = tj3Var.m22097O();
            if (zM22124i8 || objM22097O14 == obj4) {
                objM22097O14 = new zg0(c2493a5, c1909e4, ud6Var, 23);
                tj3Var.m22131l0(objM22097O14);
            }
            eh0.m11123c(0, 1, tj3Var, (ui3) objM22097O14, false);
            boolean z4 = ((f5a) t66VarM2513c2.getValue()).f38475g != null;
            boolean zM22124i9 = tj3Var.m22124i(c1909e4) | tj3Var.m22124i(c2493a5);
            Object objM22097O15 = tj3Var.m22097O();
            if (zM22124i9 || objM22097O15 == obj4) {
                objM22097O15 = new a45(17, c1909e4, c2493a5);
                tj3Var.m22131l0(objM22097O15);
            }
            eh0.m11123c(0, 0, tj3Var, (ui3) objM22097O15, z4);
            boolean z5 = ((f08) t66VarM2513c7.getValue()).f38148a;
            boolean zM22124i10 = tj3Var.m22124i(c2493a5);
            Object objM22097O16 = tj3Var.m22097O();
            if (zM22124i10 || objM22097O16 == obj4) {
                objM22097O16 = new ry7(c2493a5, 5);
                tj3Var.m22131l0(objM22097O16);
            }
            eh0.m11123c(0, 0, tj3Var, (ui3) objM22097O16, z5);
            boolean zM22124i11 = tj3Var.m22124i(c2493a5) | tj3Var.m22124i(c1909e4) | tj3Var.m22124i(ud6Var) | tj3Var.m22124i(un1Var) | tj3Var.m22124i(lesson) | tj3Var.m22124i(w41Var2) | tj3Var.m22124i(context) | tj3Var.m22122h(z3) | tj3Var.m22120g(t66Var7);
            Object objM22097O17 = tj3Var.m22097O();
            if (zM22124i11 || objM22097O17 == obj4) {
                ud6Var2 = ud6Var;
                t66Var4 = t66Var7;
                tj3Var2 = tj3Var;
                c1909e5 = c1909e4;
                objM22097O17 = new vi3() { // from class: com.lingq.feature.reader.reader.c
                    @Override // p000.vi3
                    public final Object invoke(Object obj5) {
                        int i3;
                        String str2;
                        String str3;
                        String str4;
                        Pair pair;
                        String str5;
                        String str6;
                        C2493a c2493a10 = c2493a5;
                        cma cmaVar2 = c2493a10.f30206b;
                        int i4 = c2493a10.f30190L;
                        gv7 gv7Var = (gv7) obj5;
                        gv7Var.getClass();
                        boolean zEquals = gv7Var.equals(nu7.f53260a);
                        C1909e c1909e9 = c1909e5;
                        ud6 ud6Var3 = ud6Var2;
                        n2a n2aVar = n2a.f52243a;
                        if (zEquals) {
                            c2493a10.m9389V2(ns7.f53201a);
                            c1909e9.m8760d3(n2aVar);
                            ud6Var3.m22689f();
                        } else {
                            boolean zEquals2 = gv7Var.equals(bv7.f9054a);
                            Lesson lesson2 = lesson;
                            mx8 mx8Var = null;
                            if (zEquals2) {
                                c1909e9.m8760d3(n2aVar);
                                wfb.m23926u(un1Var, null, null, new ReaderScreenKt$ReaderRoute$onNavigation$1$1$1(c2493a10, ud6Var3, lesson2, null), 3);
                            } else {
                                boolean z6 = gv7Var instanceof tu7;
                                w41 w41Var3 = w41Var2;
                                LqAnalyticsValues$LessonPath.LessonComplete lessonComplete = LqAnalyticsValues$LessonPath.LessonComplete.f14308a;
                                String str7 = "";
                                if (z6) {
                                    int i5 = ((tu7) gv7Var).f62914a;
                                    i3 = lesson2 != null ? lesson2.f19149h : -1;
                                    if (lesson2 != null && (str6 = lesson2.f19150i) != null) {
                                        str7 = str6;
                                    }
                                    w41Var3.m23737z(new ja6(i5, i3, str7, lessonComplete));
                                } else if (gv7Var instanceof vu7) {
                                    int i6 = ((vu7) gv7Var).f65944a;
                                    i3 = lesson2 != null ? lesson2.f19149h : -1;
                                    if (lesson2 != null && (str5 = lesson2.f19150i) != null) {
                                        str7 = str5;
                                    }
                                    w41Var3.m23737z(new ja6(i6, i3, str7, lessonComplete));
                                } else if (gv7Var.equals(pu7.f56816a)) {
                                    w41Var3.m23737z(x96.f67977b);
                                } else if (gv7Var.equals(su7.f61445a)) {
                                    if (lesson2 != null) {
                                        int i7 = lesson2.f19142a;
                                        String str8 = lesson2.f19143b;
                                        String str9 = lesson2.f19146e;
                                        String str10 = str9 == null ? "" : str9;
                                        String str11 = lesson2.f19145d;
                                        String str12 = str11 == null ? "" : str11;
                                        String str13 = lesson2.f19144c;
                                        w41Var3.m23737z(new da6(i7, str8, str10, str12, str13 == null ? "" : str13, LessonInfoSource.Lesson, ""));
                                    }
                                } else if (gv7Var.equals(cv7.f34609a)) {
                                    int i8 = R$id.actionToLessonComplete;
                                    Bundle bundle = new Bundle();
                                    bundle.putInt("lessonId", i4);
                                    bundle.putBoolean("isCompleting", false);
                                    ud6Var3.m22687d(i8, bundle, null);
                                } else {
                                    boolean z7 = gv7Var instanceof ou7;
                                    Context context2 = context;
                                    if (z7) {
                                        mbd.m16753a(context2, ((ou7) gv7Var).f55003a);
                                    } else if (gv7Var.equals(wu7.f67303a)) {
                                        w41Var3.m23737z(fa6.f38722b);
                                    } else if (gv7Var.equals(fv7.f39757a)) {
                                        if (z3) {
                                            t66Var3.setValue(SidePanelContent.Vocabulary);
                                        } else {
                                            t66Var8.setValue(Boolean.TRUE);
                                        }
                                    } else if (gv7Var.equals(zu7.f72190a)) {
                                        if (((rd8) t66Var4.getValue()).f59123f > 0) {
                                            w41Var3.m23737z(new ka6(false, c2493a10.f30190L, CardStatus.Familiar, ReviewType.Page, -1, null, null, "Reader page mode", 192));
                                        }
                                    } else if (gv7Var.equals(yu7.f70489a)) {
                                        w41Var3.m23737z(new ka6(false, c2493a10.f30190L, CardStatus.Learned, ReviewType.SrsDue, -1, null, null, "Reader page mode", 192));
                                    } else if (gv7Var.equals(xu7.f68804a)) {
                                        w41Var3.m23737z(new ka6(false, c2493a10.f30190L, CardStatus.Familiar, ReviewType.All, -1, null, null, "Reader page mode", 192));
                                    } else if (gv7Var.equals(av7.f7574a)) {
                                        yz4 yz4Var = (yz4) ((C3244l) c2493a10.f30212e.f27957w.f9311a).getValue();
                                        List list = yz4Var.f70670d;
                                        int i9 = yz4Var.f70680n;
                                        ox7 ox7Var = (ox7) u91.m22592J0(i9, list);
                                        if (ox7Var != null) {
                                            Iterable iterable = (List) ((Map) ((C3244l) c2493a10.f30214f.f28110F.f9311a).getValue()).get(Integer.valueOf(ox7Var.f55128a));
                                            if (iterable == null) {
                                                iterable = EmptyList.f47638a;
                                            }
                                            ArrayList arrayList = new ArrayList();
                                            for (Object obj6 : iterable) {
                                                if (obj6 instanceof LessonCard) {
                                                    arrayList.add(obj6);
                                                }
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            for (Object obj7 : arrayList) {
                                                if (((LessonCard) obj7).m8040h()) {
                                                    arrayList2.add(obj7);
                                                }
                                            }
                                            ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
                                            Iterator it = arrayList2.iterator();
                                            while (it.hasNext()) {
                                                String str14 = ((LessonCard) it.next()).f19178a;
                                                Locale localeForLanguageTag = Locale.forLanguageTag(cmaVar2.mo4580K1());
                                                localeForLanguageTag.getClass();
                                                arrayList3.add(vz1.m23610P(str14, localeForLanguageTag));
                                            }
                                            List listM22622n1 = u91.m22622n1(u91.m22626r1(arrayList3));
                                            if (listM22622n1.isEmpty()) {
                                                List list2 = ox7Var.f55132e;
                                                ArrayList arrayList4 = new ArrayList(v91.m23189q0(list2, 10));
                                                Iterator it2 = list2.iterator();
                                                while (it2.hasNext()) {
                                                    String str15 = ((xz7) it2.next()).f69008e;
                                                    Locale localeForLanguageTag2 = Locale.forLanguageTag(cmaVar2.mo4580K1());
                                                    localeForLanguageTag2.getClass();
                                                    arrayList4.add(vz1.m23610P(str15, localeForLanguageTag2));
                                                }
                                                List listM22622n2 = u91.m22622n1(u91.m22626r1(arrayList4));
                                                if (!listM22622n2.isEmpty()) {
                                                    pair = new Pair(ReviewType.IntegratedWord, listM22622n2);
                                                }
                                            } else {
                                                pair = new Pair(ReviewType.Integrated, listM22622n1);
                                            }
                                            ReviewType reviewType = (ReviewType) pair.f47623a;
                                            List list3 = (List) pair.f47624b;
                                            og8 og8Var = c2493a10.f30236z;
                                            Set setM22627s1 = u91.m22627s1(list3);
                                            og8Var.getClass();
                                            og8Var.f54320a = setM22627s1;
                                            mx8Var = new mx8(reviewType, CardStatus.Learned, i9 + 1);
                                        }
                                        if (mx8Var != null) {
                                            w41Var3.m23737z(new ka6(false, c2493a10.f30190L, mx8Var.f51999b, mx8Var.f51998a, mx8Var.f52000c, null, null, "Reader sentence mode", 192));
                                        }
                                    } else if (gv7Var instanceof qu7) {
                                        if (((qu7) gv7Var).f58223a) {
                                            int i10 = R$id.actionToVideoReader;
                                            i3 = lesson2 != null ? lesson2.f19149h : -1;
                                            if (lesson2 != null && (str4 = lesson2.f19150i) != null) {
                                                str7 = str4;
                                            }
                                            ud6Var3.m22687d(i10, new h08(i4, str7, i3).m12992a(), null);
                                        } else {
                                            w41Var3.m23737z(new aa6(i4, true, false));
                                        }
                                    } else if (gv7Var instanceof ev7) {
                                        int i11 = R$id.actionToVideoReader;
                                        i3 = lesson2 != null ? lesson2.f19149h : -1;
                                        if (lesson2 != null && (str3 = lesson2.f19150i) != null) {
                                            str7 = str3;
                                        }
                                        ud6Var3.m22687d(i11, new h08(i4, str7, i3).m12992a(), null);
                                    } else if (gv7Var instanceof ru7) {
                                        ru7 ru7Var = (ru7) gv7Var;
                                        w41Var3.m23737z(new ca6(ru7Var.f59832a, ru7Var.f59833b, ru7Var.f59834c));
                                    } else if (gv7Var instanceof dv7) {
                                        int i12 = ((dv7) gv7Var).f36272a;
                                        i3 = lesson2 != null ? lesson2.f19149h : -1;
                                        if (lesson2 != null && (str2 = lesson2.f19150i) != null) {
                                            str7 = str2;
                                        }
                                        w41Var3.m23737z(new ja6(i12, i3, str7, LqAnalyticsValues$LessonPath.Unknown.f14315a));
                                    } else {
                                        if (!(gv7Var instanceof uu7)) {
                                            gm5.m12750e();
                                            return null;
                                        }
                                        mbd.m16753a(context2, ((uu7) gv7Var).f64370a);
                                    }
                                }
                            }
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var2.m22131l0(objM22097O17);
            } else {
                tj3Var2 = tj3Var;
                c1909e5 = c1909e4;
                ud6Var2 = ud6Var;
                t66Var4 = t66Var7;
            }
            final vi3 vi3Var6 = (vi3) objM22097O17;
            if (((yz4) t66Var2.getValue()).f70689w) {
                C3244l c3244l2 = c2493a5.f30212e.f27949o;
                do {
                    value = c3244l2.getValue();
                } while (!c3244l2.m15570h(value, yz4.m25387a((yz4) value, null, null, null, null, null, null, false, null, false, false, null, null, null, 0, 0, false, null, null, false, false, null, 0, false, 4194303)));
                vi3Var6.invoke(bv7.f9054a);
            }
            boolean zM22120g2 = tj3Var2.m22120g(t66VarM2513c3) | tj3Var2.m22124i(c2493a5) | tj3Var2.m22120g(t66Var2) | tj3Var2.m22120g(strMo4589b2) | tj3Var2.m22122h(z3) | tj3Var2.m22124i(c1909e5) | tj3Var2.m22120g(vi3Var6) | tj3Var2.m22124i(ud6Var2);
            Object objM22097O18 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O18 == obj4) {
                final C1909e c1909e9 = c1909e5;
                final ud6 ud6Var3 = ud6Var2;
                final t66 t66Var9 = t66Var2;
                obj = new vi3() { // from class: com.lingq.feature.reader.reader.d
                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                     */
                    @Override // p000.vi3
                    public final Object invoke(Object obj5) {
                        TokenFragmentData tokenFragmentData;
                        Map mapM15360M;
                        Object next;
                        Object next2;
                        C2493a c2493a10 = c2493a5;
                        C2265b c2265b = c2493a10.f30225o;
                        C2264a c2264a = c2493a10.f30214f;
                        pt7 pt7Var = (pt7) obj5;
                        pt7Var.getClass();
                        boolean z6 = pt7Var instanceof ft7;
                        String str2 = strMo4589b2;
                        boolean z7 = z3;
                        C1909e c1909e10 = c1909e9;
                        dh9 dh9Var = t66VarM2513c3;
                        t66 t66Var10 = t66Var9;
                        t66 t66Var11 = t66Var3;
                        TokenViewState.Collapsed collapsed = TokenViewState.Collapsed.f23708a;
                        TokenViewState tokenViewState = TokenViewState.Expanded.f23709a;
                        if (z6) {
                            ft7 ft7Var = (ft7) pt7Var;
                            xz7 xz7Var = ft7Var.f39627a;
                            if (ft7Var.f39628b == TokenType.CardType || ((Boolean) dh9Var.getValue()).booleanValue()) {
                                c2493a10.m9389V2(pt7Var);
                                int i3 = ((yz4) t66Var10.getValue()).f70680n;
                                c2264a.getClass();
                                xz7Var.getClass();
                                TokenFragmentData tokenFragmentDataM9266h = c2264a.m9266h(i3, vz1.m23604J(xz7Var));
                                String str3 = xz7Var.f69008e;
                                String strM23609O = vz1.m23609O(str3, str2);
                                TokenType tokenType = ft7Var.f39628b;
                                e28 e28Var = ft7Var.f39630d;
                                int i4 = (int) e28Var.f36621b;
                                int i5 = (int) e28Var.f36623d;
                                int i6 = (int) e28Var.f36620a;
                                int i7 = (int) e28Var.f36622c;
                                if (!z7) {
                                    tokenViewState = collapsed;
                                }
                                TokenControllerType tokenControllerType = TokenControllerType.Lesson;
                                int i8 = xz7Var.f69009f;
                                TokenTransliteration tokenTransliteration = xz7Var.f69013j;
                                int i9 = xz7Var.f69010g;
                                int i10 = xz7Var.f69011h;
                                Map mapM15367T = xz7Var.f69017n;
                                c2265b.getClass();
                                mapM15367T.getClass();
                                Map map = (Map) ((Map) c2265b.f28141d.getValue()).get(Integer.valueOf(i8));
                                if (map != null) {
                                    mapM15367T = AbstractC3194a.m15367T(mapM15367T, map);
                                }
                                c1909e10.m8760d3(new c3a(new TokenPopupData(str3, strM23609O, tokenType, i4, i5, tokenFragmentDataM9266h, tokenViewState, tokenControllerType, null, i8, tokenTransliteration, false, i9, i10, mapM15367T, i6, i7, 0, 0, z7, null, null, false, 7735552, null), false));
                                if (z7) {
                                    t66Var11.setValue(SidePanelContent.TokenPopup);
                                }
                            } else {
                                c2493a10.mo3737M1(UpgradeReason.LIMIT_WORDS);
                            }
                        } else if (pt7Var instanceof js7) {
                            c2493a10.m9389V2(pt7Var);
                            Iterator it = ((yz4) t66Var10.getValue()).f70668b.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it.next();
                            } while (((LessonSentence) next2).f19256d != ((js7) pt7Var).f46077a.f44779a.f69010g);
                            LessonSentence lessonSentence = (LessonSentence) next2;
                            String str4 = lessonSentence != null ? lessonSentence.f19254b : null;
                            js7 js7Var = (js7) pt7Var;
                            iy7 iy7Var = js7Var.f46077a;
                            List list = iy7Var.f44782d;
                            xz7 xz7Var2 = iy7Var.f44779a;
                            List listM23604J = list;
                            if (listM23604J.isEmpty()) {
                                listM23604J = vz1.m23604J(xz7Var2);
                            }
                            TokenFragmentData tokenFragmentDataM9266h2 = c2264a.m9266h(((yz4) t66Var10.getValue()).f70680n, listM23604J);
                            String str5 = xz7Var2.f69008e;
                            String strM23609O2 = vz1.m23609O(str5, str2);
                            TokenType tokenType2 = TokenType.NewWordOrPhraseType;
                            e28 e28Var2 = js7Var.f46079c;
                            int i11 = (int) e28Var2.f36621b;
                            int i12 = (int) e28Var2.f36623d;
                            int i13 = (int) e28Var2.f36620a;
                            int i14 = (int) e28Var2.f36622c;
                            if (!z7) {
                                tokenViewState = collapsed;
                            }
                            TokenControllerType tokenControllerType2 = TokenControllerType.Lesson;
                            int i15 = xz7Var2.f69009f;
                            xz7 xz7Var3 = (xz7) u91.m22591I0(iy7Var.f44782d);
                            int i16 = xz7Var3 != null ? xz7Var3.f69010g : xz7Var2.f69010g;
                            xz7 xz7Var4 = (xz7) u91.m22591I0(iy7Var.f44782d);
                            c1909e10.m8760d3(new c3a(new TokenPopupData(str5, strM23609O2, tokenType2, i11, i12, tokenFragmentDataM9266h2, tokenViewState, tokenControllerType2, null, i15, null, false, i16, xz7Var4 != null ? xz7Var4.f69011h : xz7Var2.f69011h, null, i13, i14, 0, 0, z7, null, str4, true, 1461504, null), false));
                            if (z7) {
                                t66Var11.setValue(SidePanelContent.TokenPopup);
                            }
                        } else if (pt7Var instanceof bt7) {
                            if (((Boolean) dh9Var.getValue()).booleanValue()) {
                                c2493a10.m9389V2(pt7Var);
                                zu8 zu8Var = ((bt7) pt7Var).f8991a;
                                Integer num = zu8Var.f72196f;
                                int iIntValue = num != null ? num.intValue() : 0;
                                Iterator it2 = ((yz4) t66Var10.getValue()).f70668b.iterator();
                                do {
                                    if (!it2.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it2.next();
                                } while (((LessonSentence) next).f19256d != iIntValue);
                                LessonSentence lessonSentence2 = (LessonSentence) next;
                                String str6 = lessonSentence2 != null ? lessonSentence2.f19254b : null;
                                List list2 = zu8Var.f72191a;
                                ArrayList arrayList = new ArrayList();
                                for (Object obj6 : list2) {
                                    if (((q7b) obj6).f57357a.f69014k != TextTokenType.PUNCT) {
                                        arrayList.add(obj6);
                                    }
                                }
                                String strM22596N0 = u91.m22596N0(arrayList, " ", null, null, new ql4(str2, 19), 30);
                                ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    arrayList2.add(((q7b) it3.next()).f57357a);
                                }
                                TokenFragmentData tokenFragmentDataM9266h3 = c2264a.m9266h(((yz4) t66Var10.getValue()).f70680n, arrayList2);
                                String str7 = zu8Var.f72192b;
                                TokenType tokenType3 = TokenType.NewWordOrPhraseType;
                                e28 e28Var3 = zu8Var.f72193c;
                                int i17 = (int) e28Var3.f36621b;
                                int i18 = (int) e28Var3.f36623d;
                                int i19 = (int) e28Var3.f36620a;
                                int i20 = (int) e28Var3.f36622c;
                                if (!z7) {
                                    tokenViewState = collapsed;
                                }
                                c1909e10.m8760d3(new c3a(new TokenPopupData(str7, strM22596N0, tokenType3, i17, i18, tokenFragmentDataM9266h3, tokenViewState, TokenControllerType.Lesson, null, 0, null, false, iIntValue, 0, null, i19, i20, 0, 0, z7, null, str6, arrayList.size() > 1, 1470208, null), false));
                                if (z7) {
                                    t66Var11.setValue(SidePanelContent.TokenPopup);
                                }
                            } else {
                                c2493a10.mo3737M1(UpgradeReason.LIMIT_WORDS);
                            }
                        } else if (pt7Var instanceof cs7) {
                            c2493a10.m9389V2(pt7Var);
                        } else {
                            boolean z8 = pt7Var instanceof ur7;
                            n2a n2aVar = n2a.f52243a;
                            if (z8) {
                                c1909e10.m8760d3(n2aVar);
                                c2493a10.m9389V2(pt7Var);
                                if (z7) {
                                    t66Var11.setValue(SidePanelContent.Vocabulary);
                                }
                            } else if (pt7Var instanceof ds7) {
                                Lesson lesson2 = ((yz4) t66Var10.getValue()).f70667a;
                                if (lesson2 == null || !lesson2.f19154m) {
                                    int i21 = c2493a10.f30190L;
                                    Map map2 = (Map) ((C3244l) c2264a.f28132u.f9311a).getValue();
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    for (Map.Entry entry : map2.entrySet()) {
                                        if (fa4.m11650l(((LessonWord) entry.getValue()).f19322i, WordStatus.New.getValue())) {
                                            linkedHashMap.put(entry.getKey(), entry.getValue());
                                        }
                                    }
                                    List listM22622n1 = u91.m22622n1(linkedHashMap.keySet());
                                    c2493a10.f30186H.m9501j();
                                    c2493a10.f30226p.m9373a(i21, c2493a10.f30206b.mo4589b2(), listM22622n1);
                                    lu7.Companion.getClass();
                                    jfa.m14428k(ud6Var3, new ju7(i21), null);
                                } else {
                                    vi3Var6.invoke(cv7.f34609a);
                                }
                            } else if (pt7Var instanceof mt7) {
                                if (((Boolean) dh9Var.getValue()).booleanValue()) {
                                    w65 w65Var = ((mt7) pt7Var).f51828a;
                                    TokenType tokenType4 = w65Var instanceof LessonWord ? TokenType.WordType : ((w65Var instanceof LessonCard) && ((LessonCard) w65Var).f19182e) ? TokenType.NewWordOrPhraseType : TokenType.CardType;
                                    xz7 xz7VarM9264f = c2264a.m9264f(((yz4) t66Var10.getValue()).f70680n, w65Var.mo8037d());
                                    if (xz7VarM9264f != null) {
                                        int i22 = ((yz4) t66Var10.getValue()).f70680n;
                                        c2264a.getClass();
                                        tokenFragmentData = c2264a.m9266h(i22, vz1.m23604J(xz7VarM9264f));
                                    } else {
                                        tokenFragmentData = new TokenFragmentData();
                                    }
                                    String strMo8037d = w65Var.mo8037d();
                                    String strM23609O3 = vz1.m23609O(w65Var.mo8037d(), str2);
                                    TokenControllerType tokenControllerType3 = TokenControllerType.LessonExpanded;
                                    int i23 = xz7VarM9264f != null ? xz7VarM9264f.f69009f : 0;
                                    TokenTransliteration tokenTransliteration2 = xz7VarM9264f != null ? xz7VarM9264f.f69013j : null;
                                    int i24 = xz7VarM9264f != null ? xz7VarM9264f.f69010g : 0;
                                    int i25 = xz7VarM9264f != null ? xz7VarM9264f.f69011h : 0;
                                    if (xz7VarM9264f != null) {
                                        int i26 = xz7VarM9264f.f69009f;
                                        mapM15360M = xz7VarM9264f.f69017n;
                                        c2265b.getClass();
                                        mapM15360M.getClass();
                                        Map map3 = (Map) ((Map) c2265b.f28141d.getValue()).get(Integer.valueOf(i26));
                                        if (map3 != null) {
                                            mapM15360M = AbstractC3194a.m15367T(mapM15360M, map3);
                                        }
                                    } else {
                                        mapM15360M = AbstractC3194a.m15360M();
                                    }
                                    Map map4 = mapM15360M;
                                    LessonCard lessonCard = w65Var instanceof LessonCard ? (LessonCard) w65Var : null;
                                    c1909e10.m8760d3(new c3a(new TokenPopupData(strMo8037d, strM23609O3, tokenType4, 0, 0, tokenFragmentData, tokenViewState, tokenControllerType3, null, i23, tokenTransliteration2, false, i24, i25, map4, 0, 0, 0, 0, z7, null, null, lessonCard != null && lessonCard.f19182e, 3639576, null), false));
                                    if (z7) {
                                        t66Var11.setValue(SidePanelContent.TokenPopup);
                                    }
                                } else {
                                    c2493a10.mo3737M1(UpgradeReason.LIMIT_WORDS);
                                }
                            } else if (pt7Var instanceof ot7) {
                                if (((Boolean) dh9Var.getValue()).booleanValue()) {
                                    c2493a10.m9389V2(pt7Var);
                                } else {
                                    c2493a10.mo3737M1(UpgradeReason.LIMIT_WORDS);
                                }
                            } else if (pt7Var instanceof gs7) {
                                c1909e10.m8760d3(n2aVar);
                                c2493a10.m9389V2(pt7Var);
                            } else {
                                c2493a10.m9389V2(pt7Var);
                            }
                        }
                        return xfa.f68157a;
                    }
                };
                str = strMo4589b2;
                c1909e6 = c1909e9;
                z3 = z3;
                tj3Var2.m22131l0(obj);
            } else {
                c1909e6 = c1909e5;
                str = strMo4589b2;
                obj = objM22097O18;
            }
            vi3 vi3Var7 = (vi3) obj;
            boolean z6 = ((kk0) t66VarM2513c12.getValue()).f47448a;
            yx4 yx4Var = ((kk0) t66VarM2513c12.getValue()).f47449b;
            boolean zM22124i12 = tj3Var2.m22124i(c2493a5);
            Object objM22097O19 = tj3Var2.m22097O();
            if (zM22124i12 || objM22097O19 == obj4) {
                objM22097O19 = new ry7(c2493a5, 4);
                tj3Var2.m22131l0(objM22097O19);
            }
            ui3 ui3Var = (ui3) objM22097O19;
            boolean zM22120g3 = tj3Var2.m22120g(t66VarM2513c12) | tj3Var2.m22124i(c2493a5) | tj3Var2.m22120g(vi3Var6);
            Object objM22097O20 = tj3Var2.m22097O();
            if (zM22120g3 || objM22097O20 == obj4) {
                objM22097O20 = new zg0(c2493a5, vi3Var6, t66VarM2513c12, 24);
                tj3Var2.m22131l0(objM22097O20);
            }
            tj3 tj3Var4 = tj3Var2;
            b5d.m3323a(z6, yx4Var, ui3Var, (ui3) objM22097O20, tj3Var4, 0);
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var2, 1.0f);
            gc0 gc0Var = nj0.f52808c;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
            int iHashCode = Long.hashCode(tj3Var4.f62385T);
            l77 l77VarM22132m = tj3Var4.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var4, e16VarM4411d);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var4.m22119f0();
            if (tj3Var4.f62384S) {
                tj3Var4.m22130l(ui3Var2);
            } else {
                tj3Var4.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var4, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            boolean z7 = z3;
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var4, zi3Var3, numValueOf2);
            vi3 vi3Var8 = C0352b.f4305h;
            oha.m18000f(tj3Var4, vi3Var8);
            final t66 t66Var10 = t66Var3;
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c);
            if (z7) {
                tj3Var4.m22111b0(-339522719);
                e16 e16VarM4411d2 = c99.m4411d(b16Var2, 1.0f);
                t66 t66Var11 = t66Var4;
                t66 t66Var12 = t66Var2;
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var4, 0);
                int iHashCode2 = Long.hashCode(tj3Var4.f62385T);
                l77 l77VarM22132m2 = tj3Var4.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var4, e16VarM4411d2);
                tj3Var4.m22119f0();
                if (tj3Var4.f62384S) {
                    tj3Var4.m22130l(ui3Var2);
                } else {
                    tj3Var4.m22137o0();
                }
                oha.m18001g(tj3Var4, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var4, zi3Var3, tj3Var4, vi3Var8);
                oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c2);
                if (0.7f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                e16 e16VarM4410c = c99.m4410c(new as4(0.7f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.7f, true), 1.0f);
                ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                int iHashCode3 = Long.hashCode(tj3Var4.f62385T);
                l77 l77VarM22132m3 = tj3Var4.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var4, e16VarM4410c);
                tj3Var4.m22119f0();
                if (tj3Var4.f62384S) {
                    tj3Var4.m22130l(ui3Var2);
                } else {
                    tj3Var4.m22137o0();
                }
                oha.m18001g(tj3Var4, zi3Var, ht5VarM19966d2);
                oha.m18001g(tj3Var4, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var4, zi3Var3, tj3Var4, vi3Var8);
                oha.m18001g(tj3Var4, zi3Var4, e16VarM1322c3);
                yz4 yz4Var = (yz4) t66Var12.getValue();
                v08 v08Var = (v08) t66VarM2513c4.getValue();
                nz9 nz9Var = (nz9) t66VarM2513c5.getValue();
                bx7 bx7Var = (bx7) t66VarM2513c6.getValue();
                f08 f08Var = (f08) t66VarM2513c7.getValue();
                jy7 jy7Var = (jy7) t66VarM2513c8.getValue();
                hx7 hx7Var = (hx7) t66VarM2513c11.getValue();
                ly7 ly7Var = (ly7) t66VarM2513c9.getValue();
                rd8 rd8Var = (rd8) t66Var11.getValue();
                boolean zM22124i13 = tj3Var4.m22124i(c2493a5) | tj3Var4.m22124i(c1883c5);
                Object objM22097O21 = tj3Var4.m22097O();
                if (zM22124i13 || objM22097O21 == obj4) {
                    final int i3 = 0;
                    objM22097O21 = new vi3() { // from class: uy7
                        @Override // p000.vi3
                        public final Object invoke(Object obj5) {
                            int i4 = i3;
                            xfa xfaVar = xfa.f68157a;
                            as7 as7Var = as7.f7429a;
                            C1883c c1883c6 = c1883c5;
                            C2493a c2493a10 = c2493a5;
                            xy9 xy9Var = (xy9) obj5;
                            switch (i4) {
                                case 0:
                                    xy9Var.getClass();
                                    if (!(xy9Var instanceof gy9)) {
                                        c1883c6.m8688Z2(xy9Var);
                                    } else {
                                        c2493a10.m9389V2(as7Var);
                                    }
                                    break;
                                default:
                                    xy9Var.getClass();
                                    if (!(xy9Var instanceof gy9)) {
                                        c1883c6.m8688Z2(xy9Var);
                                    } else {
                                        c2493a10.m9389V2(as7Var);
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var4.m22131l0(objM22097O21);
                }
                vi3Var = vi3Var6;
                C2493a c2493a10 = c2493a5;
                m9404e(yz4Var, v08Var, nz9Var, bx7Var, f08Var, jy7Var, hx7Var, ly7Var, rd8Var, vi3Var, vi3Var7, (vi3) objM22097O21, tj3Var4, 512);
                tj3Var3 = tj3Var4;
                tj3Var3.m22139q(true);
                e16 e16VarM4410c2 = c99.m4410c(b16Var2, 1.0f);
                vh9 vh9Var = ps5.f56764b;
                pb1.m19037g(0.0f, 6, 2, ((ms5) tj3Var3.m22128k(vh9Var)).f51799a.f55817B, tj3Var3, e16VarM4410c2);
                if (0.3f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                e16 e16VarM10007D = d32.m10007D(c99.m4410c(new as4(0.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.3f, true), 1.0f), ((ms5) tj3Var3.m22128k(vh9Var)).f51799a.f55824I, ss5.f61356d);
                WeakHashMap weakHashMap = l6b.f49204w;
                e16 e16VarM23904F = wfb.m23904F(wfb.m23904F(e16VarM10007D, ho5.m13397r(tj3Var3).f49210f), ho5.m13397r(tj3Var3).f49209e);
                ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, false);
                int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m4 = tj3Var3.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, e16VarM23904F);
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var2);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d3);
                oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var3, zi3Var3, tj3Var3, vi3Var8);
                oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c4);
                int i4 = AbstractC2500f.f30282b[((SidePanelContent) t66Var10.getValue()).ordinal()];
                if (i4 == 1) {
                    vi3Var3 = vi3Var7;
                    obj3 = obj4;
                    tj3Var3.m22111b0(1045248989);
                    f5a f5aVar = (f5a) t66VarM2513c2.getValue();
                    boolean zM22120g4 = tj3Var3.m22120g(vi3Var4);
                    Object objM22097O22 = tj3Var3.m22097O();
                    if (zM22120g4 || objM22097O22 == obj3) {
                        objM22097O22 = new vi3() { // from class: com.lingq.feature.reader.reader.e
                            @Override // p000.vi3
                            public final Object invoke(Object obj5) {
                                j3a j3aVar = (j3a) obj5;
                                j3aVar.getClass();
                                vi3Var4.invoke(j3aVar);
                                if ((j3aVar instanceof n2a) || (j3aVar instanceof p2a)) {
                                    t66Var10.setValue(SidePanelContent.Vocabulary);
                                }
                                return xfa.f68157a;
                            }
                        };
                        tj3Var3.m22131l0(objM22097O22);
                    }
                    AbstractC1899b.m8698g(f5aVar, (vi3) objM22097O22, tj3Var3, 8);
                    tj3Var3.m22142t();
                } else if (i4 == 2) {
                    tj3Var3.m22111b0(1045847165);
                    Object objM22097O23 = tj3Var3.m22097O();
                    obj3 = obj4;
                    if (objM22097O23 == obj3) {
                        objM22097O23 = new e5a(6);
                        tj3Var3.m22131l0(objM22097O23);
                    }
                    vi3Var3 = vi3Var7;
                    ojd.m18053a(true, null, (ui3) objM22097O23, vi3Var3, tj3Var3, 390);
                    tj3Var3.m22142t();
                } else if (i4 != 3) {
                    tj3Var3.m22111b0(-243379041);
                    tj3Var3.m22142t();
                    gm5.m12750e();
                    return;
                } else {
                    tj3Var3.m22111b0(1046156173);
                    tj3Var3.m22142t();
                    vi3Var3 = vi3Var7;
                    obj3 = obj4;
                }
                tj3Var3.m22141s();
                tj3Var3.m22141s();
                tj3Var3.m22142t();
                vi3Var2 = vi3Var3;
                b16Var = b16Var2;
                obj2 = obj3;
                c2493a6 = c2493a10;
                c1883c4 = c1883c5;
            } else {
                vi3Var = vi3Var6;
                final int i5 = 1;
                final C2493a c2493a11 = c2493a5;
                tj3Var4.m22111b0(-336641672);
                yz4 yz4Var2 = (yz4) t66Var2.getValue();
                v08 v08Var2 = (v08) t66VarM2513c4.getValue();
                nz9 nz9Var2 = (nz9) t66VarM2513c5.getValue();
                bx7 bx7Var2 = (bx7) t66VarM2513c6.getValue();
                f08 f08Var2 = (f08) t66VarM2513c7.getValue();
                jy7 jy7Var2 = (jy7) t66VarM2513c8.getValue();
                hx7 hx7Var2 = (hx7) t66VarM2513c11.getValue();
                ly7 ly7Var2 = (ly7) t66VarM2513c9.getValue();
                rd8 rd8Var2 = (rd8) t66Var4.getValue();
                boolean zM22124i14 = tj3Var4.m22124i(c2493a11) | tj3Var4.m22124i(c1883c5);
                Object objM22097O24 = tj3Var4.m22097O();
                if (zM22124i14 || objM22097O24 == obj4) {
                    objM22097O24 = new vi3() { // from class: uy7
                        @Override // p000.vi3
                        public final Object invoke(Object obj5) {
                            int i6 = i5;
                            xfa xfaVar = xfa.f68157a;
                            as7 as7Var = as7.f7429a;
                            C1883c c1883c6 = c1883c5;
                            C2493a c2493a12 = c2493a11;
                            xy9 xy9Var = (xy9) obj5;
                            switch (i6) {
                                case 0:
                                    xy9Var.getClass();
                                    if (!(xy9Var instanceof gy9)) {
                                        c1883c6.m8688Z2(xy9Var);
                                    } else {
                                        c2493a12.m9389V2(as7Var);
                                    }
                                    break;
                                default:
                                    xy9Var.getClass();
                                    if (!(xy9Var instanceof gy9)) {
                                        c1883c6.m8688Z2(xy9Var);
                                    } else {
                                        c2493a12.m9389V2(as7Var);
                                    }
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var4.m22131l0(objM22097O24);
                }
                c1883c4 = c1883c5;
                vi3Var2 = vi3Var7;
                b16Var = b16Var2;
                c2493a6 = c2493a11;
                obj2 = obj4;
                m9404e(yz4Var2, v08Var2, nz9Var2, bx7Var2, f08Var2, jy7Var2, hx7Var2, ly7Var2, rd8Var2, vi3Var, vi3Var2, (vi3) objM22097O24, tj3Var4, 512);
                tj3Var3 = tj3Var4;
                boolean zBooleanValue2 = ((Boolean) t66Var8.getValue()).booleanValue();
                Object objM22097O25 = tj3Var3.m22097O();
                if (objM22097O25 == obj2) {
                    t66Var5 = t66Var8;
                    objM22097O25 = new un7(5, t66Var5);
                    tj3Var3.m22131l0(objM22097O25);
                } else {
                    t66Var5 = t66Var8;
                }
                m9400a(zBooleanValue2, (ui3) objM22097O25, ci8.m4703P(-691627818, new yy0(vi3Var2, t66Var5, 3), tj3Var3), tj3Var3, 3462);
                AbstractC1899b.m8698g((f5a) t66VarM2513c2.getValue(), vi3Var4, tj3Var3, 8);
                tj3Var3.m22142t();
            }
            c7a c7aVar = (c7a) AbstractC0711a.m2513c(c2503b.f30322k, tj3Var3).getValue();
            C2493a c2493a12 = c2493a6;
            boolean zM22124i15 = tj3Var3.m22124i(c2493a12);
            Object objM22097O26 = tj3Var3.m22097O();
            if (zM22124i15 || objM22097O26 == obj2) {
                objM22097O26 = new ry7(c2493a12, 7);
                tj3Var3.m22131l0(objM22097O26);
            }
            ui3 ui3Var3 = (ui3) objM22097O26;
            boolean zM22124i16 = tj3Var3.m22124i(c2493a12) | tj3Var3.m22120g(vi3Var2) | tj3Var3.m22120g(vi3Var);
            Object objM22097O27 = tj3Var3.m22097O();
            if (zM22124i16 || objM22097O27 == obj2) {
                objM22097O27 = new zg0(c2493a12, vi3Var2, vi3Var, 27);
                tj3Var3.m22131l0(objM22097O27);
            }
            AbstractC1915b.m8789b(c7aVar, ui3Var3, (ui3) objM22097O27, tj3Var3, 0);
            boolean zBooleanValue3 = ((Boolean) AbstractC0711a.m2513c(c2503b.f30324m, tj3Var3).getValue()).booleanValue();
            boolean zM22124i17 = tj3Var3.m22124i(c2493a12);
            Object objM22097O28 = tj3Var3.m22097O();
            if (zM22124i17 || objM22097O28 == obj2) {
                objM22097O28 = new ry7(c2493a12, 0);
                tj3Var3.m22131l0(objM22097O28);
            }
            mdd.m16791a(zBooleanValue3, (ui3) objM22097O28, tj3Var3, 0);
            h24 h24Var = (h24) t66VarM2513c15.getValue();
            boolean zM22124i18 = tj3Var3.m22124i(c2493a12);
            Object objM22097O29 = tj3Var3.m22097O();
            if (zM22124i18 || objM22097O29 == obj2) {
                objM22097O29 = new ry7(c2493a12, 1);
                tj3Var3.m22131l0(objM22097O29);
            }
            ui3 ui3Var4 = (ui3) objM22097O29;
            boolean zM22124i19 = tj3Var3.m22124i(c2493a12);
            Object objM22097O30 = tj3Var3.m22097O();
            if (zM22124i19 || objM22097O30 == obj2) {
                objM22097O30 = new ry7(c2493a12, 2);
                tj3Var3.m22131l0(objM22097O30);
            }
            m9402c(h24Var, str, ui3Var4, (ui3) objM22097O30, tj3Var3, 6);
            e16 e16VarMo3727a = ci0.f10109a.mo3727a(b16Var, nj0.f52815j);
            WeakHashMap weakHashMap2 = l6b.f49204w;
            AbstractC0231g.m1152e(c0232g0, wfb.m23904F(e16VarMo3727a, ho5.m13397r(tj3Var3).f49209e), null, tj3Var3, 6, 4);
            tj3Var3.m22141s();
            c2493a2 = c2493a12;
            c1909e2 = c1909e6;
            c1883c2 = c1883c4;
        } else {
            tj3Var3.m22102U();
            c2493a2 = c2493a;
            c1909e2 = c1909e;
            c1883c2 = c1883c;
        }
        x18 x18VarM22143u = tj3Var3.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0(c2493a2, c1909e2, c1883c2, ud6Var, w41Var, i, 11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:262:0x06cc  */
    /* JADX WARN: Code duplicated, block: B:268:0x06d9  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v38, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v70 */
    /* JADX WARN: Type inference failed for: r8v71 */
    /* JADX INFO: renamed from: e */
    public static final void m9404e(yz4 yz4Var, final v08 v08Var, final nz9 nz9Var, final bx7 bx7Var, f08 f08Var, final jy7 jy7Var, hx7 hx7Var, final ly7 ly7Var, final rd8 rd8Var, vi3 vi3Var, vi3 vi3Var2, final vi3 vi3Var3, ye1 ye1Var, final int i) {
        vi3 vi3Var4;
        final hx7 hx7Var2;
        yz4 yz4Var2;
        f08 f08Var2;
        final vi3 vi3Var5;
        tj3 tj3Var;
        int i2;
        boolean z;
        boolean z2;
        vi3 vi3Var6;
        int i3;
        Lesson lesson;
        int i4;
        Object obj;
        boolean z3;
        vi3 vi3Var7;
        jy7 jy7Var2;
        vi3 vi3Var8;
        ?? r8;
        tj3 tj3Var2;
        int i5;
        Object obj2;
        int i6;
        boolean z4;
        Integer num;
        Integer num2;
        String str;
        String str2;
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(-2037716054);
        int i7 = i | (tj3Var3.m22124i(yz4Var) ? 4 : 2) | (tj3Var3.m22124i(v08Var) ? 32 : 16) | (tj3Var3.m22124i(nz9Var) ? 256 : 128) | (tj3Var3.m22124i(bx7Var) ? 2048 : 1024) | (tj3Var3.m22120g(f08Var) ? 16384 : 8192) | (tj3Var3.m22124i(jy7Var) ? 131072 : 65536) | (tj3Var3.m22120g(hx7Var) ? 1048576 : 524288) | (tj3Var3.m22124i(ly7Var) ? 8388608 : 4194304) | (tj3Var3.m22120g(rd8Var) ? 67108864 : 33554432) | (tj3Var3.m22124i(vi3Var) ? 536870912 : 268435456);
        int i8 = (tj3Var3.m22124i(vi3Var2) ? 4 : 2) | (tj3Var3.m22124i(vi3Var3) ? 32 : 16);
        if (tj3Var3.m22099R(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 19) == 18) ? false : true)) {
            Object objM22097O = tj3Var3.m22097O();
            Object obj3 = we1.f66679a;
            if (objM22097O == obj3) {
                objM22097O = new C0232g0();
                tj3Var3.m22131l0(objM22097O);
            }
            C0232g0 c0232g0 = (C0232g0) objM22097O;
            String strM23620a0 = vz1.m23620a0(tj3Var3, com.lingq.core.p012ui.R$string.texts_try_later);
            String strM23620a1 = vz1.m23620a0(tj3Var3, R$string.texts_tts_generation_failed);
            float f = ((fe9) tj3Var3.m22128k(ge9.f40637a)).f38960i;
            long jM21440a = skc.m21440a(nz9Var.f53460f, AbstractC3423or.m18217B(tj3Var3));
            int i9 = aa1.f413l;
            if (aa1.m199c(jM21440a, aa1.f412k)) {
                tj3Var3.m22111b0(259992721);
                jM21440a = ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51799a.f55872p;
                tj3Var3.m22139q(false);
            } else {
                tj3Var3.m22111b0(259990969);
                tj3Var3.m22139q(false);
            }
            Lesson lesson2 = yz4Var.f70667a;
            tn7 tn7Var = yz4Var.f70687u;
            long j = jM21440a;
            int i10 = yz4Var.f70681o;
            j25 j25Var = yz4Var.f70677k;
            List list = yz4Var.f70670d;
            int i11 = yz4Var.f70680n;
            Boolean boolValueOf = Boolean.valueOf(jy7Var.f46405m);
            InterfaceC3055gy interfaceC3055gy = jy7Var.f46404l;
            boolean zM22124i = tj3Var3.m22124i(jy7Var) | tj3Var3.m22120g(strM23620a0) | tj3Var3.m22120g(strM23620a1);
            int i12 = i8 & 14;
            boolean z5 = zM22124i | (i12 == 4);
            Object objM22097O2 = tj3Var3.m22097O();
            if (z5 || objM22097O2 == obj3) {
                i2 = i12;
                z = false;
                z2 = true;
                objM22097O2 = new ReaderScreenKt$ReaderScreen$1$1(jy7Var, strM23620a0, strM23620a1, c0232g0, vi3Var2, null);
                tj3Var3.m22131l0(objM22097O2);
            } else {
                i2 = i12;
                z = false;
                z2 = true;
            }
            d32.m10049l(boolValueOf, interfaceC3055gy, (zi3) objM22097O2, tj3Var3);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            Object objM22097O3 = tj3Var3.m22097O();
            if (objM22097O3 == obj3) {
                objM22097O3 = AbstractC3393o1.m17729d(tj3Var3);
            }
            v56 v56Var = (v56) objM22097O3;
            boolean z6 = i2 == 4 ? z2 : z;
            Object objM22097O4 = tj3Var3.m22097O();
            if (z6 || objM22097O4 == obj3) {
                objM22097O4 = new th7(vi3Var2, 27);
                tj3Var3.m22131l0(objM22097O4);
            }
            e16 e16VarM814a = AbstractC0080f.m814a(e16VarM4411d, v56Var, null, false, null, (ui3) objM22097O4, 28);
            gc0 gc0Var = nj0.f52808c;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, z);
            int iHashCode = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m = tj3Var3.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM814a);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var);
            } else {
                tj3Var3.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var3, zi3Var3, numValueOf);
            vi3 vi3Var9 = C0352b.f4305h;
            oha.m18000f(tj3Var3, vi3Var9);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
            if (r28 != 0) {
                tj3Var3.m22111b0(-1485542055);
                boolean z7 = i2 == 4 ? z2 : false;
                Object objM22097O5 = tj3Var3.m22097O();
                if (z7 || objM22097O5 == obj3) {
                    objM22097O5 = new sy7(vi3Var2, 5);
                    tj3Var3.m22131l0(objM22097O5);
                }
                ui3 ui3Var2 = (ui3) objM22097O5;
                boolean z8 = (i7 & 1879048192) == 536870912 ? z2 : false;
                Object objM22097O6 = tj3Var3.m22097O();
                if (z8 || objM22097O6 == obj3) {
                    objM22097O6 = new sy7(vi3Var, 12);
                    tj3Var3.m22131l0(objM22097O6);
                }
                gjc.m12715a(j25Var, ui3Var2, (ui3) objM22097O6, tj3Var3, 0);
                tj3Var3.m22139q(false);
                lesson = lesson2;
                tj3Var2 = tj3Var3;
                i2 = i2;
                r8 = 0;
                obj = obj3;
                i3 = i7;
                i4 = 536870912;
                jy7Var2 = jy7Var;
                vi3Var8 = vi3Var2;
                vi3Var7 = vi3Var;
                yz4Var2 = yz4Var;
            } else {
                tj3Var3.m22111b0(-1485167606);
                Object objM22097O7 = tj3Var3.m22097O();
                if (objM22097O7 == obj3) {
                    objM22097O7 = AbstractC0278f.m1257g(i11);
                    tj3Var3.m22131l0(objM22097O7);
                }
                sc9 sc9Var = (sc9) objM22097O7;
                Object objM22097O8 = tj3Var3.m22097O();
                if (objM22097O8 == obj3) {
                    objM22097O8 = AbstractC0278f.m1257g(list.size());
                    tj3Var3.m22131l0(objM22097O8);
                }
                sc9 sc9Var2 = (sc9) objM22097O8;
                Object objM22097O9 = tj3Var3.m22097O();
                if (objM22097O9 == obj3) {
                    objM22097O9 = AbstractC0278f.m1257g(i10);
                    tj3Var3.m22131l0(objM22097O9);
                }
                sc9 sc9Var3 = (sc9) objM22097O9;
                if (yz4Var.m25388b()) {
                    sc9Var.m21223i(i11);
                    sc9Var2.m21223i(list.size());
                    sc9Var3.m21223i(i10);
                }
                e16 e16VarM10007D = d32.m10007D(c99.m4411d(b16Var, 1.0f), j, ss5.f61356d);
                WeakHashMap weakHashMap = l6b.f49204w;
                e16 e16VarM23904F = wfb.m23904F(wfb.m23904F(e16VarM10007D, ho5.m13397r(tj3Var3).f49210f), ho5.m13397r(tj3Var3).f49209e);
                bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m2 = tj3Var3.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM23904F);
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var9);
                oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                int iM21222h = sc9Var.m21222h();
                int iM21222h2 = sc9Var2.m21222h();
                int iM21222h3 = sc9Var3.m21222h();
                int i13 = yz4Var.f70688v;
                boolean z9 = yz4Var.f70685s;
                boolean z10 = yz4Var.f70675i;
                boolean z11 = yz4Var.f70686t;
                int i14 = i7 & 1879048192;
                boolean z12 = i14 == 536870912 ? z2 : false;
                Object objM22097O10 = tj3Var3.m22097O();
                if (z12 || objM22097O10 == obj3) {
                    objM22097O10 = new sy7(vi3Var, 13);
                    tj3Var3.m22131l0(objM22097O10);
                }
                ui3 ui3Var3 = (ui3) objM22097O10;
                boolean z13 = i14 == 536870912 ? z2 : false;
                Object objM22097O11 = tj3Var3.m22097O();
                if (z13 || objM22097O11 == obj3) {
                    objM22097O11 = new sy7(vi3Var, 14);
                    tj3Var3.m22131l0(objM22097O11);
                }
                ui3 ui3Var4 = (ui3) objM22097O11;
                boolean z14 = i2 == 4 ? z2 : false;
                Object objM22097O12 = tj3Var3.m22097O();
                if (z14 || objM22097O12 == obj3) {
                    vi3Var6 = vi3Var2;
                    objM22097O12 = new sy7(vi3Var6, 15);
                    tj3Var3.m22131l0(objM22097O12);
                } else {
                    vi3Var6 = vi3Var2;
                }
                ui3 ui3Var5 = (ui3) objM22097O12;
                boolean z15 = i2 == 4 ? z2 : false;
                Object objM22097O13 = tj3Var3.m22097O();
                if (z15 || objM22097O13 == obj3) {
                    objM22097O13 = new sy7(vi3Var6, 16);
                    tj3Var3.m22131l0(objM22097O13);
                }
                ui3 ui3Var6 = (ui3) objM22097O13;
                boolean z16 = i2 == 4 ? z2 : false;
                Object objM22097O14 = tj3Var3.m22097O();
                if (z16 || objM22097O14 == obj3) {
                    objM22097O14 = new wh7(vi3Var6, 10);
                    tj3Var3.m22131l0(objM22097O14);
                }
                xkc.m24603a(iM21222h, iM21222h2, iM21222h3, i13, z9, z10, z11, ui3Var3, ui3Var4, ui3Var5, ui3Var6, (vi3) objM22097O14, null, null, null, tj3Var3, 0, 28672);
                as4 as4Var = new as4(1.0f, z2);
                ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                i3 = i7;
                int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m3 = tj3Var3.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, as4Var);
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, zi3Var, ht5VarM19966d2);
                oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var3, tj3Var3, vi3Var9);
                oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c3);
                int i15 = i3 >> 6;
                lesson = lesson2;
                i4 = 536870912;
                AbstractC2506c.m9413a(yz4Var, v08Var, nz9Var, bx7Var, jy7Var, ly7Var, f, vi3Var, vi3Var6, tj3Var3, (i3 & 126) | 512 | (i3 & 896) | (i3 & 7168) | ((i3 >> 3) & 57344) | (i15 & 458752) | (i15 & 29360128) | ((i8 << 24) & 234881024));
                tj3Var3.m22139q(true);
                if (tn7Var != 0) {
                    tj3Var3.m22111b0(-582937847);
                    boolean z17 = i14 == 536870912;
                    Object objM22097O15 = tj3Var3.m22097O();
                    if (z17) {
                        obj = obj3;
                    } else {
                        obj = obj3;
                        if (objM22097O15 == obj) {
                        }
                        z3 = false;
                        thc.m22068a(tn7Var, (vi3) objM22097O15, tj3Var3, 0, 0);
                        tj3Var3.m22139q(false);
                    }
                    objM22097O15 = new wh7(vi3Var, 11);
                    tj3Var3.m22131l0(objM22097O15);
                    z3 = false;
                    thc.m22068a(tn7Var, (vi3) objM22097O15, tj3Var3, 0, 0);
                    tj3Var3.m22139q(false);
                } else {
                    obj = obj3;
                    z3 = false;
                    tj3Var3.m22111b0(-582618795);
                    tj3Var3.m22139q(false);
                }
                int i16 = i3 >> 15;
                m9401b(jy7Var, yz4Var, rd8Var, f, vi3Var, vi3Var2, tj3Var3, (i16 & 57344) | (i16 & 14) | ((i3 << 3) & 112) | ((i3 >> 18) & 896) | ((i8 << 15) & 458752));
                yz4Var2 = yz4Var;
                vi3Var7 = vi3Var;
                tj3 tj3Var4 = tj3Var3;
                jy7Var2 = jy7Var;
                vi3Var8 = vi3Var2;
                tj3Var4.m22139q(true);
                tj3Var4.m22139q(z3);
                tj3Var2 = tj3Var4;
                r8 = z3;
            }
            if (yz4Var2.f70676j) {
                tj3Var2.m22111b0(-1481959788);
                fkc.m11927a(tj3Var2, r8);
                tj3Var2.m22139q(r8);
            } else {
                tj3Var2.m22111b0(-1481919426);
                tj3Var2.m22139q(r8);
            }
            e16 e16VarM4411d2 = c99.m4411d(b16Var, 1.0f);
            ht5 ht5VarM19966d3 = qh0.m19966d(nj0.f52812g, r8);
            Object obj4 = obj;
            int iHashCode4 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m4 = tj3Var2.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var2, e16VarM4411d2);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, ht5VarM19966d3);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var2, zi3Var3, tj3Var2, vi3Var9);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c4);
            qe5 qe5Var = yz4Var2.f70678l;
            xx1.m24789a(qe5Var.f57649a, qe5Var.f57650b / 100.0f, tj3Var2, 0);
            tj3Var2.m22139q(true);
            hl7 hl7Var = yz4Var2.f70679m;
            boolean z18 = hl7Var.f42580a;
            LessonProcessingStatus lessonProcessingStatus = hl7Var.f42581b;
            if (!z18 || lessonProcessingStatus == null) {
                i5 = i2;
                obj2 = obj4;
                i6 = 4;
                tj3Var2.m22111b0(-1481298434);
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(-1481481024);
                i5 = i2;
                i6 = 4;
                boolean z19 = i5 == 4;
                Object objM22097O16 = tj3Var2.m22097O();
                obj2 = obj4;
                if (z19 || objM22097O16 == obj2) {
                    objM22097O16 = new sy7(vi3Var8, 17);
                    tj3Var2.m22131l0(objM22097O16);
                }
                hjd.m13302a(lessonProcessingStatus, (ui3) objM22097O16, tj3Var2, 0);
                tj3Var2.m22139q(false);
            }
            Boolean boolValueOf2 = Boolean.valueOf(hl7Var.f42582c);
            int i17 = i3 & 1879048192;
            boolean zM22120g = tj3Var2.m22120g(hl7Var) | (i5 == i6) | (i17 == i4);
            Object objM22097O17 = tj3Var2.m22097O();
            if (zM22120g || objM22097O17 == obj2) {
                objM22097O17 = new ReaderScreenKt$ReaderScreen$4$6$1(hl7Var, vi3Var8, vi3Var7, null);
                tj3Var2.m22131l0(objM22097O17);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O17, boolValueOf2);
            if (jy7Var2.f46403k) {
                tj3Var2.m22111b0(-1480981211);
                boolean z20 = i5 == i6;
                Object objM22097O18 = tj3Var2.m22097O();
                if (z20 || objM22097O18 == obj2) {
                    objM22097O18 = new th7(vi3Var8, 28);
                    tj3Var2.m22131l0(objM22097O18);
                }
                ui3 ui3Var7 = (ui3) objM22097O18;
                boolean z21 = i5 == i6;
                Object objM22097O19 = tj3Var2.m22097O();
                if (z21 || objM22097O19 == obj2) {
                    objM22097O19 = new th7(vi3Var8, 29);
                    tj3Var2.m22131l0(objM22097O19);
                }
                z4 = false;
                led.m16156a(ui3Var7, (ui3) objM22097O19, tj3Var2, 0);
                tj3Var2.m22139q(false);
            } else {
                z4 = false;
                tj3Var2.m22111b0(-1480772674);
                tj3Var2.m22139q(false);
            }
            e16 e16VarMo3727a = ci0.f10109a.mo3727a(b16Var, nj0.f52815j);
            vi3Var5 = vi3Var8;
            AbstractC0231g.m1152e(c0232g0, e16VarMo3727a, null, tj3Var2, 6, 4);
            tj3Var2.m22139q(true);
            boolean z22 = f08Var.f38148a;
            ThemeSettingsTab themeSettingsTab = f08Var.f38151d;
            boolean z23 = i5 == i6 ? true : z4;
            Object objM22097O20 = tj3Var2.m22097O();
            if (z23 || objM22097O20 == obj2) {
                objM22097O20 = new wh7(vi3Var5, 9);
                tj3Var2.m22131l0(objM22097O20);
            }
            f08Var2 = f08Var;
            tj3 tj3Var5 = tj3Var2;
            AbstractC1881a.m8679r(z22, nz9Var, vi3Var3, themeSettingsTab, (vi3) objM22097O20, false, tj3Var5, 64 | ((i3 >> 3) & 112) | ((i8 << 3) & 896), 32);
            tj3 tj3Var6 = tj3Var5;
            boolean z24 = yz4Var2.f70685s;
            Lesson lesson3 = lesson;
            if (z24) {
                if (lesson3 != null) {
                    num = lesson3.f19152k;
                } else {
                    num = null;
                }
            } else if (lesson != null) {
                num = lesson3.f19153l;
            } else {
                num = null;
            }
            if (z24) {
                if (lesson3 != null) {
                    num2 = lesson3.f19153l;
                } else {
                    num2 = null;
                }
            } else if (lesson3 != null) {
                num2 = lesson3.f19152k;
            } else {
                num2 = null;
            }
            boolean z25 = f08Var2.f38149b;
            if (lesson3 == null || (str = lesson3.f19143b) == null) {
                str = "";
            }
            hx7Var2 = hx7Var;
            boolean z26 = hx7Var2.f43112a != null;
            boolean z27 = hx7Var2.f43113b.f64694a;
            a89 a89Var = hx7Var2.f43116e;
            boolean z28 = hx7Var2.f43117f;
            boolean z29 = hx7Var2.f43118g;
            boolean z30 = hx7Var2.f43119h;
            boolean z31 = i5 == 4;
            Object objM22097O21 = tj3Var6.m22097O();
            if (z31 || objM22097O21 == obj2) {
                objM22097O21 = new sy7(vi3Var5, 0);
                tj3Var6.m22131l0(objM22097O21);
            }
            ui3 ui3Var8 = (ui3) objM22097O21;
            boolean zM22120g2 = tj3Var6.m22120g(num2) | (i17 == 536870912);
            Object objM22097O22 = tj3Var6.m22097O();
            if (zM22120g2 || objM22097O22 == obj2) {
                vi3Var4 = vi3Var;
                objM22097O22 = new ty7(num2, vi3Var4, 0);
                tj3Var6.m22131l0(objM22097O22);
            } else {
                vi3Var4 = vi3Var;
            }
            ui3 ui3Var9 = (ui3) objM22097O22;
            boolean zM22120g3 = tj3Var6.m22120g(num) | (i17 == 536870912);
            Object objM22097O23 = tj3Var6.m22097O();
            if (zM22120g3 || objM22097O23 == obj2) {
                objM22097O23 = new ty7(num, vi3Var4, 1);
                tj3Var6.m22131l0(objM22097O23);
            }
            ui3 ui3Var10 = (ui3) objM22097O23;
            boolean z32 = i17 == 536870912;
            Object objM22097O24 = tj3Var6.m22097O();
            if (z32 || objM22097O24 == obj2) {
                objM22097O24 = new sy7(vi3Var4, 1);
                tj3Var6.m22131l0(objM22097O24);
            }
            ui3 ui3Var11 = (ui3) objM22097O24;
            boolean z33 = i5 == 4;
            Object objM22097O25 = tj3Var6.m22097O();
            if (z33 || objM22097O25 == obj2) {
                objM22097O25 = new sy7(vi3Var5, 2);
                tj3Var6.m22131l0(objM22097O25);
            }
            ui3 ui3Var12 = (ui3) objM22097O25;
            boolean z34 = i17 == 536870912;
            Object objM22097O26 = tj3Var6.m22097O();
            if (z34 || objM22097O26 == obj2) {
                objM22097O26 = new sy7(vi3Var4, 3);
                tj3Var6.m22131l0(objM22097O26);
            }
            ui3 ui3Var13 = (ui3) objM22097O26;
            boolean z35 = i17 == 536870912;
            Object objM22097O27 = tj3Var6.m22097O();
            if (z35 || objM22097O27 == obj2) {
                objM22097O27 = new sy7(vi3Var4, 4);
                tj3Var6.m22131l0(objM22097O27);
            }
            ui3 ui3Var14 = (ui3) objM22097O27;
            int i18 = i3 & 3670016;
            boolean z36 = (i18 == 1048576) | (i17 == 536870912);
            Integer num3 = num2;
            Object objM22097O28 = tj3Var6.m22097O();
            if (z36 || objM22097O28 == obj2) {
                objM22097O28 = new vy7(hx7Var2, vi3Var4, 0);
                tj3Var6.m22131l0(objM22097O28);
            }
            ui3 ui3Var15 = (ui3) objM22097O28;
            boolean zM22124i2 = (i18 == 1048576) | tj3Var6.m22124i(lesson3) | (i17 == 536870912);
            Object objM22097O29 = tj3Var6.m22097O();
            if (zM22124i2 || objM22097O29 == obj2) {
                objM22097O29 = new wy7(lesson3, vi3Var4, hx7Var2);
                tj3Var6.m22131l0(objM22097O29);
            }
            ui3 ui3Var16 = (ui3) objM22097O29;
            boolean z37 = i5 == 4;
            Object objM22097O30 = tj3Var6.m22097O();
            if (z37 || objM22097O30 == obj2) {
                objM22097O30 = new sy7(vi3Var5, 6);
                tj3Var6.m22131l0(objM22097O30);
            }
            ui3 ui3Var17 = (ui3) objM22097O30;
            boolean z38 = (i18 == 1048576) | (i17 == 536870912) | (i5 == 4);
            Object objM22097O31 = tj3Var6.m22097O();
            if (z38 || objM22097O31 == obj2) {
                objM22097O31 = new zg0(hx7Var2, vi3Var4, vi3Var5, 25);
                tj3Var6.m22131l0(objM22097O31);
            }
            ui3 ui3Var18 = (ui3) objM22097O31;
            boolean z39 = i17 == 536870912;
            Object objM22097O32 = tj3Var6.m22097O();
            if (z39 || objM22097O32 == obj2) {
                objM22097O32 = new sy7(vi3Var4, 7);
                tj3Var6.m22131l0(objM22097O32);
            }
            Integer num4 = num;
            Object obj5 = obj2;
            vjc.m23356b(z25, str, num3, num4, z26, z27, a89Var, z28, z29, z30, ui3Var8, ui3Var9, ui3Var10, ui3Var11, ui3Var12, ui3Var13, ui3Var14, ui3Var15, ui3Var16, ui3Var17, ui3Var18, (ui3) objM22097O32, tj3Var6, 0, 0);
            if (yz4Var2.f70686t) {
                tj3Var6.m22111b0(-520074792);
                tj3Var6.m22139q(false);
                tj3Var = tj3Var6;
            } else {
                tj3Var6.m22111b0(-521028104);
                boolean z40 = f08Var2.f38150c;
                String str3 = (lesson3 == null || (str2 = lesson3.f19143b) == null) ? "" : str2;
                int i19 = i11 + 1;
                int size = list.size();
                int i20 = rd8Var.f59121d;
                int i21 = rd8Var.f59122e;
                int i22 = rd8Var.f59123f;
                int i23 = rd8Var.f59124g;
                boolean z41 = i5 == 4;
                Object objM22097O33 = tj3Var6.m22097O();
                if (z41 || objM22097O33 == obj5) {
                    objM22097O33 = new sy7(vi3Var5, 8);
                    tj3Var6.m22131l0(objM22097O33);
                }
                ui3 ui3Var19 = (ui3) objM22097O33;
                boolean z42 = (i17 == 536870912) | (i5 == 4);
                Object objM22097O34 = tj3Var6.m22097O();
                if (z42 || objM22097O34 == obj5) {
                    objM22097O34 = new ei3(vi3Var5, vi3Var4, 3);
                    tj3Var6.m22131l0(objM22097O34);
                }
                ui3 ui3Var20 = (ui3) objM22097O34;
                boolean z43 = i17 == 536870912;
                Object objM22097O35 = tj3Var6.m22097O();
                if (z43 || objM22097O35 == obj5) {
                    objM22097O35 = new sy7(vi3Var4, 9);
                    tj3Var6.m22131l0(objM22097O35);
                }
                ui3 ui3Var21 = (ui3) objM22097O35;
                boolean z44 = i17 == 536870912;
                Object objM22097O36 = tj3Var6.m22097O();
                if (z44 || objM22097O36 == obj5) {
                    objM22097O36 = new sy7(vi3Var4, 10);
                    tj3Var6.m22131l0(objM22097O36);
                }
                ui3 ui3Var22 = (ui3) objM22097O36;
                boolean z45 = i17 == 536870912;
                Object objM22097O37 = tj3Var6.m22097O();
                if (z45 || objM22097O37 == obj5) {
                    objM22097O37 = new sy7(vi3Var4, 11);
                    tj3Var6.m22131l0(objM22097O37);
                }
                uwc.m22969a(z40, str3, i19, size, i20, i21, i22, i23, rd8Var, ui3Var19, ui3Var20, ui3Var21, ui3Var22, (ui3) objM22097O37, tj3Var6, i3 & 234881024);
                tj3Var6.m22139q(false);
                tj3Var = tj3Var6;
            }
        } else {
            tj3 tj3Var7 = tj3Var3;
            vi3Var4 = vi3Var;
            hx7Var2 = hx7Var;
            yz4Var2 = yz4Var;
            f08Var2 = f08Var;
            vi3Var5 = vi3Var2;
            tj3Var7.m22102U();
            tj3Var = tj3Var7;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final yz4 yz4Var3 = yz4Var2;
            final f08 f08Var3 = f08Var2;
            final vi3 vi3Var10 = vi3Var4;
            x18VarM22143u.f67642d = new zi3(v08Var, nz9Var, bx7Var, f08Var3, jy7Var, hx7Var2, ly7Var, rd8Var, vi3Var10, vi3Var5, vi3Var3, i) { // from class: xy7

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ v08 f68962b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ nz9 f68963c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ bx7 f68964d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ f08 f68965e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ jy7 f68966f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ hx7 f68967g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ ly7 f68968h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ rd8 f68969i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ vi3 f68970j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ vi3 f68971k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ vi3 f68972l;

                @Override // p000.zi3
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int iM19383z = pk9.m19383z(513);
                    AbstractC2501g.m9404e(this.f68961a, this.f68962b, this.f68963c, this.f68964d, this.f68965e, this.f68966f, this.f68967g, this.f68968h, this.f68969i, this.f68970j, this.f68971k, this.f68972l, (ye1) obj6, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }
}
