package com.lingq.core.settings.theme;

import android.content.Context;
import android.graphics.Color;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.theme.LqTheme;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.settings.theme.AbstractC1881a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Pair;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3288l7;
import p000.C3484q4;
import p000.C3537ri;
import p000.C3549ru;
import p000.C3661uu;
import p000.a65;
import p000.aa1;
import p000.ab1;
import p000.ap9;
import p000.as4;
import p000.b16;
import p000.bb1;
import p000.c81;
import p000.c99;
import p000.ci0;
import p000.ci8;
import p000.cx2;
import p000.cx8;
import p000.cz9;
import p000.d0b;
import p000.d32;
import p000.dt6;
import p000.dz9;
import p000.e16;
import p000.eh0;
import p000.eq8;
import p000.ex8;
import p000.ez9;
import p000.f70;
import p000.fa4;
import p000.fc0;
import p000.fe9;
import p000.fz9;
import p000.g39;
import p000.g54;
import p000.g79;
import p000.gc0;
import p000.ge9;
import p000.gm5;
import p000.h39;
import p000.ho5;
import p000.ho9;
import p000.ht5;
import p000.iq8;
import p000.iz9;
import p000.kc5;
import p000.ks9;
import p000.l6b;
import p000.l77;
import p000.ln0;
import p000.lw9;
import p000.mo9;
import p000.ms5;
import p000.mv3;
import p000.mv4;
import p000.n4b;
import p000.n84;
import p000.nj0;
import p000.ny0;
import p000.nz9;
import p000.oha;
import p000.omd;
import p000.ow8;
import p000.ox1;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.ps5;
import p000.pw1;
import p000.qh0;
import p000.qj8;
import p000.qk9;
import p000.r46;
import p000.rt9;
import p000.se1;
import p000.si8;
import p000.sj8;
import p000.ss5;
import p000.sx7;
import p000.t66;
import p000.t9a;
import p000.te1;
import p000.tj3;
import p000.u91;
import p000.ua3;
import p000.ui3;
import p000.ui8;
import p000.uv1;
import p000.ux5;
import p000.v56;
import p000.vh9;
import p000.vi3;
import p000.vj8;
import p000.vs3;
import p000.vx9;
import p000.vz1;
import p000.wb3;
import p000.we1;
import p000.wfb;
import p000.ws6;
import p000.x18;
import p000.xc9;
import p000.xfa;
import p000.xpc;
import p000.y35;
import p000.ye1;
import p000.yy9;
import p000.yz7;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.core.settings.theme.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1881a {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v17 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX INFO: renamed from: a */
    public static final void m8662a(AudioUnderlineMode audioUnderlineMode, vi3 vi3Var, ye1 ye1Var, int i) {
        long j;
        AudioUnderlineMode audioUnderlineMode2 = audioUnderlineMode;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(739453551);
        int i2 = 4;
        int i3 = 32;
        int i4 = (tj3Var.m22116e(audioUnderlineMode2.ordinal()) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        ?? r7 = 1;
        boolean z = false;
        if (tj3Var.m22099R(i4 & 1, (i4 & 19) != 18)) {
            List<Pair> listM23605K = vz1.m23605K(new Pair(AudioUnderlineMode.Off, Integer.valueOf(R$string.settings_audio_underline_none)), new Pair(AudioUnderlineMode.Static, Integer.valueOf(R$string.settings_audio_underline_by_sentence)), new Pair(AudioUnderlineMode.Wave, Integer.valueOf(R$string.settings_audio_underline_real_time)));
            float f = 1.0f;
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
            tj3Var.m22111b0(736554863);
            for (Pair pair : listM23605K) {
                AudioUnderlineMode audioUnderlineMode3 = (AudioUnderlineMode) pair.f47623a;
                int iIntValue = ((Number) pair.f47624b).intValue();
                ?? r10 = audioUnderlineMode3 == audioUnderlineMode2 ? r7 : z;
                as4 as4Var = new as4(f, r7);
                if (r10 != 0) {
                    tj3Var.m22111b0(1806682291);
                    j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55842a;
                    tj3Var.m22139q(z);
                } else {
                    tj3Var.m22111b0(1806682903);
                    tj3Var.m22139q(z);
                    j = aa1.f411j;
                }
                e16 e16VarM19045o = pb1.m19045o(r46.m20387m(as4Var, 2.0f, j, ui8.m22753b(8.0f)), ui8.m22753b(8.0f));
                vh9 vh9Var = ps5.f56764b;
                e16 e16VarM10007D = d32.m10007D(e16VarM19045o, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55822G, ss5.f61356d);
                ?? r12 = ((i4 & 112) == i3 ? r7 : z) | (tj3Var.m22116e(audioUnderlineMode3.ordinal()) ? 1 : 0);
                Object objM22097O = tj3Var.m22097O();
                if (r12 != 0 || objM22097O == we1.f66679a) {
                    objM22097O = new qk9(i2, vi3Var, audioUnderlineMode3);
                    tj3Var.m22131l0(objM22097O);
                }
                ho9.m13414a(AbstractC0080f.m815b(null, z, (ui3) objM22097O, e16VarM10007D, 15), ui8.m22753b(8.0f), ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55822G, 0L, 0.0f, 0.0f, null, ci8.m4703P(-1767483983, new yy9(iIntValue, r7, r10), tj3Var), tj3Var, 12582912, 120);
                r7 = 1;
                z = z;
                f = 1.0f;
                i2 = i2;
                i3 = i3;
                audioUnderlineMode2 = audioUnderlineMode;
            }
            tj3Var.m22139q(z);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(audioUnderlineMode, i, 21, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8663b(nz9 nz9Var, vi3 vi3Var, ThemeSettingsTab themeSettingsTab, vi3 vi3Var2, boolean z, n4b n4bVar, ye1 ye1Var, int i, int i2) {
        int i3;
        vi3 vi3Var3;
        int i4;
        boolean z2;
        int i5;
        ThemeSettingsTab themeSettingsTab2;
        tj3 tj3Var;
        vi3 vi3Var4;
        boolean z3;
        n4b n4bVar2;
        ThemeSettingsTab themeSettingsTab3;
        vi3 vi3Var5;
        int i6;
        n4b n4bVarM21912b;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(2036694748);
        int i7 = i | (tj3Var2.m22124i(nz9Var) ? 4 : 2);
        if ((i & 48) == 0) {
            i7 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 = i7 | 384;
        } else {
            i3 = i7 | (tj3Var2.m22116e(themeSettingsTab == null ? -1 : themeSettingsTab.ordinal()) ? 256 : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i4 = i3 | 3072;
            vi3Var3 = vi3Var2;
        } else {
            vi3Var3 = vi3Var2;
            i4 = i3 | (tj3Var2.m22124i(vi3Var3) ? 2048 : 1024);
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i5 = i4 | 24576;
            z2 = z;
        } else {
            z2 = z;
            i5 = i4 | (tj3Var2.m22122h(z2) ? 16384 : 8192);
        }
        int i11 = i5 | 65536;
        if (tj3Var2.m22099R(i11 & 1, (74899 & i11) != 74898)) {
            tj3Var2.m22104W();
            int i12 = i & 1;
            p84 p84Var = we1.f66679a;
            if (i12 == 0 || tj3Var2.m22084B()) {
                themeSettingsTab3 = i8 != 0 ? ThemeSettingsTab.Theme : themeSettingsTab;
                if (i9 != 0) {
                    Object objM22097O = tj3Var2.m22097O();
                    if (objM22097O == p84Var) {
                        objM22097O = new ow8(10);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    vi3Var5 = (vi3) objM22097O;
                } else {
                    vi3Var5 = vi3Var3;
                }
                if (i10 != 0) {
                    z2 = true;
                }
                i6 = i11 & (-458753);
                n4bVarM21912b = t9a.m21912b(tj3Var2);
            } else {
                tj3Var2.m22102U();
                themeSettingsTab3 = themeSettingsTab;
                i6 = i11 & (-458753);
                vi3Var5 = vi3Var3;
                n4bVarM21912b = n4bVar;
            }
            boolean z4 = z2;
            tj3Var2.m22140r();
            b16 b16Var = b16.f7762a;
            e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
            boolean z5 = (i6 & 112) == 32;
            Object objM22097O2 = tj3Var2.m22097O();
            if (z5 || objM22097O2 == p84Var) {
                objM22097O2 = new kc5(vi3Var, 1);
                tj3Var2.m22131l0(objM22097O2);
            }
            e16 e16VarM16957a = mo9.m16957a(e16VarM4411d, xfa.f68157a, (PointerInputEventHandler) objM22097O2);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM16957a);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            e16 e16VarMo3727a = ci0.f10109a.mo3727a(b16Var, nj0.f52810e);
            WeakHashMap weakHashMap = l6b.f49204w;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(wfb.m23904F(e16VarMo3727a, ho5.m13397r(tj3Var2).f49216l), 0.0f, 56.0f, 0.0f, 0.0f, 13);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM18559e = ox1.m18559e(AbstractC3584sr.m21607T(e16VarM21611X, ((fe9) tj3Var2.m22128k(zf1Var)).f38957f));
            Object objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC3393o1.m17729d(tj3Var2);
            }
            v56 v56Var = (v56) objM22097O3;
            Object objM22097O4 = tj3Var2.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = new C3288l7(7);
                tj3Var2.m22131l0(objM22097O4);
            }
            ThemeSettingsTab themeSettingsTab4 = themeSettingsTab3;
            vi3 vi3Var6 = vi3Var5;
            n4b n4bVar3 = n4bVarM21912b;
            r46.m20381f(AbstractC0080f.m814a(e16VarM18559e, v56Var, null, false, null, (ui3) objM22097O4, 28), null, te1.m22003q(62, ((fe9) tj3Var2.m22128k(zf1Var)).f38956e), null, ci8.m4703P(1791586816, new ny0(nz9Var, themeSettingsTab4, vi3Var6, vi3Var, n4bVar3, z4), tj3Var2), tj3Var2, 24576, 10);
            tj3Var2.m22139q(true);
            tj3Var = tj3Var2;
            themeSettingsTab2 = themeSettingsTab4;
            vi3Var4 = vi3Var6;
            n4bVar2 = n4bVar3;
            z3 = z4;
        } else {
            tj3Var2.m22102U();
            themeSettingsTab2 = themeSettingsTab;
            tj3Var = tj3Var2;
            vi3Var4 = vi3Var3;
            z3 = z2;
            n4bVar2 = n4bVar;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new a65(nz9Var, vi3Var, themeSettingsTab2, vi3Var4, z3, n4bVar2, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8664c(boolean z, vi3 vi3Var, ye1 ye1Var, int i) {
        long j;
        long j2;
        vi3 vi3Var2;
        boolean z2 = z;
        vi3 vi3Var3 = vi3Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(951999696);
        int i2 = 16;
        int i3 = i | (tj3Var.m22122h(z2) ? 4 : 2) | (tj3Var.m22124i(vi3Var3) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(ge9.m12515a(tj3Var).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var, 48);
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
            if (z2) {
                tj3Var.m22111b0(982371059);
                j = p58.m18900f(tj3Var).f55842a;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(982371671);
                tj3Var.m22139q(false);
                j = aa1.f411j;
            }
            e16 e16VarM19045o = pb1.m19045o(r46.m20387m(b16Var, 2.0f, j, ui8.m22753b(8.0f)), ui8.m22753b(8.0f));
            long j3 = p58.m18900f(tj3Var).f55822G;
            mv3 mv3Var = ss5.f61356d;
            e16 e16VarM10007D = d32.m10007D(e16VarM19045o, j3, mv3Var);
            int i4 = i3 & 112;
            boolean z3 = i4 == 32;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z3 || objM22097O == p84Var) {
                objM22097O = new ex8(vi3Var3, 24);
                tj3Var.m22131l0(objM22097O);
            }
            ho9.m13414a(AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM10007D, 15), ui8.m22753b(8.0f), p58.m18900f(tj3Var).f55822G, 0L, 0.0f, 0.0f, null, ci8.m4703P(1519426737, new c81(i2, z2), tj3Var), tj3Var, 12582912, 120);
            if (z) {
                tj3Var.m22111b0(982405847);
                tj3Var.m22139q(false);
                j2 = aa1.f411j;
            } else {
                tj3Var.m22111b0(982405235);
                j2 = p58.m18900f(tj3Var).f55842a;
                tj3Var.m22139q(false);
            }
            e16 e16VarM10007D2 = d32.m10007D(pb1.m19045o(r46.m20387m(b16Var, 2.0f, j2, ui8.m22753b(8.0f)), ui8.m22753b(8.0f)), p58.m18900f(tj3Var).f55822G, mv3Var);
            boolean z4 = i4 == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z4 || objM22097O2 == p84Var) {
                vi3Var2 = vi3Var;
                objM22097O2 = new ex8(vi3Var2, 25);
                tj3Var.m22131l0(objM22097O2);
            } else {
                vi3Var2 = vi3Var;
            }
            vi3Var3 = vi3Var2;
            z2 = z;
            ho9.m13414a(AbstractC0080f.m815b(null, false, (ui3) objM22097O2, e16VarM10007D2, 15), ui8.m22753b(8.0f), p58.m18900f(tj3Var).f55822G, 0L, 0.0f, 0.0f, null, ci8.m4703P(809744922, new c81(15, z), tj3Var), tj3Var, 12582912, 120);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g79(i, vi3Var3, z2);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8665d(int i, List list, vi3 vi3Var, ye1 ye1Var, int i2) {
        vi3 vi3Var2;
        boolean z;
        int i3;
        boolean z2;
        int i4 = i;
        list.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1016928197);
        int i5 = i2 | (tj3Var.m22116e(i4) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i5 & 1, (i5 & 131) != 130)) {
            int iIndexOf = ua3.f63636a.indexOf(Integer.valueOf(i4));
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52793L, tj3Var, 48);
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
            vi3 vi3Var3 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var3);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            fc0 fc0Var = nj0.f52789H;
            C3549ru c3549ru = eh0.f37236b;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var, 54);
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
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, true, new gm5(28)), fc0Var, tj3Var, 48);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var3);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            int i6 = i5 & 896;
            int i7 = i5 & 14;
            boolean zM22116e = tj3Var.m22116e(iIndexOf) | (i6 == 256) | (i7 == 4);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22116e || objM22097O == p84Var) {
                z = false;
                i3 = i;
                objM22097O = new cz9(vi3Var, iIndexOf, i3, 0);
                tj3Var.m22131l0(objM22097O);
            } else {
                z = false;
                i3 = i;
            }
            vh9 vh9Var = ps5.f56764b;
            boolean z3 = z;
            omd.m18141c((ui3) objM22097O, r46.m20387m(b16Var, 1.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B, ui8.m22753b(8.0f)), false, null, null, xpc.f68519k, tj3Var, 1572864, 60);
            lw9.m16554b(String.format("%d", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1)), c99.m4426s(b16Var, 20.0f), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 1, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 48, 24576, 113660);
            tj3Var = tj3Var;
            boolean zM22116e2 = tj3Var.m22116e(iIndexOf) | (i6 == 256 ? true : z3) | (i7 == 4 ? true : z3);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22116e2 || objM22097O2 == p84Var) {
                z2 = true;
                i4 = i;
                vi3Var2 = vi3Var;
                objM22097O2 = new cz9(vi3Var2, iIndexOf, i4, 1);
                tj3Var.m22131l0(objM22097O2);
            } else {
                z2 = true;
                i4 = i;
                vi3Var2 = vi3Var;
            }
            omd.m18141c((ui3) objM22097O2, r46.m20387m(b16Var, 1.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B, ui8.m22753b(8.0f)), false, null, null, xpc.f68520l, tj3Var, 1572864, 60);
            AbstractC3393o1.m17723A(tj3Var, z2, z2, z2);
        } else {
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new d0b(i4, list, vi3Var2, i2);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8666e(nz9 nz9Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(171159012);
        int i2 = 2;
        int i3 = (tj3Var.m22124i(nz9Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        int i4 = 0;
        int i5 = 1;
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            m8681t(xpc.f68516h, null, ci8.m4703P(2036169930, new ez9(nz9Var, vi3Var, i4), tj3Var), tj3Var, 390, 2);
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
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            m8681t(xpc.f68517i, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ci8.m4703P(-423397714, new ez9(nz9Var, vi3Var, i5), tj3Var), tj3Var, 390, 0);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            m8681t(xpc.f68518j, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ci8.m4703P(-1717589851, new ez9(nz9Var, vi3Var, i2), tj3Var), tj3Var, 390, 0);
            tj3Var.m22139q(true);
            if (nz9Var.f53463i) {
                tj3Var.m22111b0(874333452);
                String strM23618Z = vz1.m23618Z(R$string.settings_line_spacing_warning, new Object[]{Float.valueOf(1.15f)}, tj3Var);
                vh9 vh9Var = ps5.f56764b;
                lw9.m16554b(strM23618Z, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55879w, null, 0L, null, null, 0L, null, new ks9(6), 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71411o, 0L, 0L, null, new wb3(1), null, 0L, null, null, 0, 0L, null, 16777207), tj3Var, 0, 0, 130042);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(874725726);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ez9(nz9Var, vi3Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8667f(List list, ReaderFont readerFont, Pair pair, zi3 zi3Var, ye1 ye1Var, int i) {
        readerFont.getClass();
        zi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1732715277);
        int i2 = i | (tj3Var.m22124i(list) ? 4 : 2) | (tj3Var.m22116e(readerFont.ordinal()) ? 32 : 16) | (tj3Var.m22120g(pair) ? 256 : 128) | (tj3Var.m22124i(zi3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            C0127b c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
            int iIndexOf = list.indexOf(readerFont);
            boolean zM22116e = tj3Var.m22116e(iIndexOf) | tj3Var.m22124i(list) | tj3Var.m22120g(c0127bM17056a);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22116e || objM22097O == p84Var) {
                objM22097O = new ThemeSettingsPopupKt$FontTypeSettings$1$1(iIndexOf, list, c0127bM17056a, null);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O, list);
            e16 e16VarM1320a = AbstractC0287b.m1320a(c99.m4412e(b16.f7762a, 1.0f), new iq8(c0127bM17056a, 6));
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28));
            boolean zM22124i = ((i2 & 112) == 32) | ((i2 & 896) == 256) | tj3Var.m22124i(list) | tj3Var.m22124i(context) | ((i2 & 7168) == 2048);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                C3537ri c3537ri = new C3537ri(list, context, pair, readerFont, zi3Var, 9);
                tj3Var.m22131l0(c3537ri);
                objM22097O2 = c3537ri;
            }
            fa4.m11643d(e16VarM1320a, c0127bM17056a, null, c3661uu, null, null, false, null, (vi3) objM22097O2, tj3Var, 0, 492);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new h39(list, readerFont, pair, zi3Var, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8668g(vs3 vs3Var, boolean z, ye1 ye1Var, int i) {
        long j;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1917301528);
        int i2 = (tj3Var.m22124i(vs3Var) ? 4 : 2) | i | (tj3Var.m22122h(z) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4423p(b16Var, 60.0f, 40.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38955d, 7);
            if (z) {
                tj3Var.m22111b0(-14191201);
                j = p58.m18900f(tj3Var).f55842a;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-14190589);
                tj3Var.m22139q(false);
                j = aa1.f411j;
            }
            e16 e16VarM10007D = d32.m10007D(pb1.m19045o(r46.m20387m(e16VarM21611X, 2.0f, j, ui8.m22753b(8.0f)), ui8.m22753b(8.0f)), p58.m18900f(tj3Var).f55822G, ss5.f61356d);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
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
            lw9.m16554b("LingQ", AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(d32.m10007D(b16Var, d32.m10035e(Color.parseColor(vs3Var.f65847c.f69687a.f67242a)), ui8.m22753b(4.0f)), 0.0f, ge9.m12515a(tj3Var).f38954c, 1), 4.0f, 0.0f, 2), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 6, 0, 131064);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new f70(vs3Var, z, i, 7);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m8669h(List list, vs3 vs3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        list.getClass();
        vs3Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(680591250);
        int i2 = 16;
        int i3 = i | (tj3Var.m22124i(list) ? 4 : 2) | (tj3Var.m22124i(vs3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            C0127b c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
            e16 e16VarM1320a = AbstractC0287b.m1320a(c99.m4412e(b16.f7762a, 1.0f), new iq8(c0127bM17056a, 6));
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28));
            boolean zM22124i = tj3Var.m22124i(list) | tj3Var.m22124i(vs3Var) | ((i3 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ws6(list, vs3Var, vi3Var, i2);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11643d(e16VarM1320a, c0127bM17056a, null, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 492);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g39(list, vs3Var, vi3Var, i, 11);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8670i(TextHighlightStyle textHighlightStyle, boolean z, ye1 ye1Var, int i) {
        long j;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-57953156);
        int i2 = (tj3Var.m22116e(textHighlightStyle.ordinal()) ? 4 : 2) | i | (tj3Var.m22122h(z) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(c99.m4423p(b16Var, 60.0f, 40.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38955d, 7);
            if (z) {
                tj3Var.m22111b0(141602211);
                j = p58.m18900f(tj3Var).f55842a;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(141602823);
                tj3Var.m22139q(false);
                j = aa1.f411j;
            }
            e16 e16VarM10007D = d32.m10007D(pb1.m19045o(r46.m20387m(e16VarM21611X, 2.0f, j, ui8.m22753b(8.0f)), ui8.m22753b(8.0f)), p58.m18900f(tj3Var).f55822G, ss5.f61356d);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM10007D);
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
            int i3 = iz9.f44813d[textHighlightStyle.ordinal()];
            if (i3 == 1) {
                tj3Var.m22111b0(702192328);
                lw9.m16554b("LingQ", AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(d32.m10007D(b16Var, ((aa1) ((xc9) cx2.m9917a(tj3Var).f9116d).getValue()).f414a, ui8.m22753b(4.0f)), 0.0f, ge9.m12515a(tj3Var).f38954c, 1), 4.0f, 0.0f, 2), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 6, 0, 131064);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else if (i3 == 2) {
                tj3Var.m22111b0(702808391);
                lw9.m16554b("LingQ", AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(b16Var, 0.0f, ge9.m12515a(tj3Var).f38954c, 1), 4.0f, 0.0f, 2), 0L, null, 0L, null, null, 0L, rt9.f59802c, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 805306374, 0, 130556);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else if (i3 == 3) {
                tj3Var.m22111b0(703252063);
                lw9.m16554b("LingQ", AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(d32.m10007D(b16Var, ((aa1) ((xc9) cx2.m9917a(tj3Var).f9116d).getValue()).f414a, ui8.m22753b(4.0f)), 0.0f, ge9.m12515a(tj3Var).f38954c, 1), 4.0f, 0.0f, 2), cx2.m9917a(tj3Var).m4209b(), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 6, 0, 131064);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                if (i3 != 4) {
                    throw ux5.m23001x(tj3Var, 715387169, false);
                }
                tj3Var.m22111b0(703867909);
                lw9.m16554b("LingQ", AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(b16Var, 0.0f, ge9.m12515a(tj3Var).f38954c, 1), 4.0f, 0.0f, 2), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 6, 0, 131068);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new f70(textHighlightStyle, z, i, 6);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8671j(TextHighlightStyle textHighlightStyle, vi3 vi3Var, ye1 ye1Var, int i) {
        textHighlightStyle.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1124520964);
        int i2 = (tj3Var.m22116e(textHighlightStyle.ordinal()) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            C0127b c0127bM17056a = mv4.m17056a(0, tj3Var, 3);
            e16 e16VarM1320a = AbstractC0287b.m1320a(c99.m4412e(b16.f7762a, 1.0f), new iq8(c0127bM17056a, 6));
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, true, new gm5(28));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new sx7(28, textHighlightStyle, vi3Var);
                tj3Var.m22131l0(objM22097O);
            }
            fa4.m11643d(e16VarM1320a, c0127bM17056a, null, c3661uu, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 492);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(textHighlightStyle, i, 20, vi3Var);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m8672k(final double d, final boolean z, final vi3 vi3Var, ye1 ye1Var, final int i) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-837562079);
        int i2 = i | (tj3Var.m22112c(d) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 131) != 130)) {
            final int iIndexOf = ua3.f63637b.indexOf(Double.valueOf(d));
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52793L, tj3Var, 48);
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
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            fc0 fc0Var = nj0.f52789H;
            C3549ru c3549ru = eh0.f37236b;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var, 54);
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
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var2);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38955d, true, new gm5(28)), fc0Var, tj3Var, 48);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var2);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            int i3 = i2 & 896;
            int i4 = i2 & 14;
            boolean zM22116e = tj3Var.m22116e(iIndexOf) | (i3 == 256) | (i4 == 4);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22116e || objM22097O == p84Var) {
                final int i5 = 0;
                ui3 ui3Var2 = new ui3() { // from class: zy9
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i6 = i5;
                        xfa xfaVar = xfa.f68157a;
                        double d2 = d;
                        int i7 = iIndexOf;
                        vi3 vi3Var3 = vi3Var;
                        switch (i6) {
                            case 0:
                                List list = ua3.f63637b;
                                int i8 = i7 - 1;
                                vi3Var3.invoke((i8 < 0 || i8 >= list.size()) ? Double.valueOf(d2) : list.get(i8));
                                break;
                            default:
                                List list2 = ua3.f63637b;
                                int i9 = i7 + 1;
                                vi3Var3.invoke((i9 < 0 || i9 >= list2.size()) ? Double.valueOf(d2) : list2.get(i9));
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(ui3Var2);
                objM22097O = ui3Var2;
            }
            vh9 vh9Var = ps5.f56764b;
            omd.m18141c((ui3) objM22097O, r46.m20387m(b16Var, 1.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B, ui8.m22753b(8.0f)), false, null, null, xpc.f68521m, tj3Var, 1572864, 60);
            lw9.m16554b(String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1)), c99.m4426s(b16Var, 30.0f), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 1, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 48, 24576, 113660);
            tj3Var = tj3Var;
            boolean zM22116e2 = tj3Var.m22116e(iIndexOf) | (i3 == 256) | (i4 == 4);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22116e2 || objM22097O2 == p84Var) {
                final int i6 = 1;
                ui3 ui3Var3 = new ui3() { // from class: zy9
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i7 = i6;
                        xfa xfaVar = xfa.f68157a;
                        double d2 = d;
                        int i8 = iIndexOf;
                        vi3 vi3Var3 = vi3Var;
                        switch (i7) {
                            case 0:
                                List list = ua3.f63637b;
                                int i9 = i8 - 1;
                                vi3Var3.invoke((i9 < 0 || i9 >= list.size()) ? Double.valueOf(d2) : list.get(i9));
                                break;
                            default:
                                List list2 = ua3.f63637b;
                                int i10 = i8 + 1;
                                vi3Var3.invoke((i10 < 0 || i10 >= list2.size()) ? Double.valueOf(d2) : list2.get(i10));
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var.m22131l0(ui3Var3);
                objM22097O2 = ui3Var3;
            }
            omd.m18141c((ui3) objM22097O2, r46.m20387m(b16Var, 1.0f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B, ui8.m22753b(8.0f)), false, null, null, xpc.f68522n, tj3Var, 1572864, 60);
            AbstractC3393o1.m17723A(tj3Var, true, true, true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(d, z, vi3Var, i) { // from class: az9

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ double f7697a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f7698b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ vi3 f7699c;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC1881a.m8672k(this.f7697a, this.f7698b, this.f7699c, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m8673l(nz9 nz9Var, vi3 vi3Var, boolean z, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2052477377);
        int i2 = (tj3Var.m22124i(nz9Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            p84 p84Var = we1.f66679a;
            if (z && nz9Var.f53467m) {
                tj3Var.m22111b0(2096064569);
                String strM23620a0 = vz1.m23620a0(tj3Var, R$string.upgrade_sentence_translations);
                boolean z2 = nz9Var.f53466l;
                boolean z3 = (i2 & 112) == 32;
                Object objM22097O = tj3Var.m22097O();
                if (z3 || objM22097O == p84Var) {
                    objM22097O = new cx8(vi3Var, 10);
                    tj3Var.m22131l0(objM22097O);
                }
                m8676o(strM23620a0, z2, (vi3) objM22097O, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2096320195);
                tj3Var.m22139q(false);
            }
            if (z) {
                tj3Var.m22111b0(2096354326);
                String strM23620a1 = vz1.m23620a0(tj3Var, R$string.settings_reader_tap_page);
                boolean z4 = nz9Var.f53468n;
                boolean z5 = (i2 & 112) == 32;
                Object objM22097O2 = tj3Var.m22097O();
                if (z5 || objM22097O2 == p84Var) {
                    objM22097O2 = new cx8(vi3Var, 11);
                    tj3Var.m22131l0(objM22097O2);
                }
                m8676o(strM23620a1, z4, (vi3) objM22097O2, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2096582083);
                tj3Var.m22139q(false);
            }
            String strM23620a2 = vz1.m23620a0(tj3Var, R$string.popup_always_show_status);
            boolean z6 = nz9Var.f53469o;
            int i3 = i2 & 112;
            boolean z7 = i3 == 32;
            Object objM22097O3 = tj3Var.m22097O();
            if (z7 || objM22097O3 == p84Var) {
                objM22097O3 = new cx8(vi3Var, 12);
                tj3Var.m22131l0(objM22097O3);
            }
            m8676o(strM23620a2, z6, (vi3) objM22097O3, tj3Var, 0);
            if (z) {
                tj3Var.m22111b0(2096840189);
                String strM23620a3 = vz1.m23620a0(tj3Var, R$string.lesson_show_vocabulary);
                boolean z8 = nz9Var.f53470p;
                boolean z9 = i3 == 32;
                Object objM22097O4 = tj3Var.m22097O();
                if (z9 || objM22097O4 == p84Var) {
                    objM22097O4 = new cx8(vi3Var, 13);
                    tj3Var.m22131l0(objM22097O4);
                }
                m8676o(strM23620a3, z8, (vi3) objM22097O4, tj3Var, 0);
                m8681t(xpc.f68513e, null, ci8.m4703P(-1817852378, new ez9(nz9Var, vi3Var, 8), tj3Var), tj3Var, 390, 2);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2097522499);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fz9(nz9Var, vi3Var, z, i, 1);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m8674m(nz9 nz9Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1252833176);
        int i2 = (tj3Var.m22124i(nz9Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            boolean z = nz9Var.f53475u;
            p84 p84Var = we1.f66679a;
            if (z) {
                tj3Var.m22111b0(112799153);
                String strM23620a0 = vz1.m23620a0(tj3Var, R$string.settings_asian_show_spaces);
                boolean z2 = nz9Var.f53473s;
                boolean z3 = (i2 & 112) == 32;
                Object objM22097O = tj3Var.m22097O();
                if (z3 || objM22097O == p84Var) {
                    objM22097O = new cx8(vi3Var, 14);
                    tj3Var.m22131l0(objM22097O);
                }
                m8676o(strM23620a0, z2, (vi3) objM22097O, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(113053818);
                tj3Var.m22139q(false);
            }
            if (nz9Var.f53476v.isEmpty()) {
                tj3Var.m22111b0(113983322);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(113133798);
                m8681t(xpc.f68514f, null, ci8.m4703P(1304311584, new ez9(nz9Var, vi3Var, 9), tj3Var), tj3Var, 390, 2);
                if (fa4.m11650l(nz9Var.f53477w, "Off")) {
                    tj3Var.m22111b0(113977370);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(113696758);
                    String strM23620a1 = vz1.m23620a0(tj3Var, R$string.settings_transliteration_show_status);
                    boolean z4 = nz9Var.f53472r;
                    boolean z5 = (i2 & 112) == 32;
                    Object objM22097O2 = tj3Var.m22097O();
                    if (z5 || objM22097O2 == p84Var) {
                        objM22097O2 = new cx8(vi3Var, 15);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    m8676o(strM23620a1, z4, (vi3) objM22097O2, tj3Var, 0);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(false);
            }
            if (nz9Var.f53478x.isEmpty()) {
                tj3Var.m22111b0(114594394);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(114058156);
                m8681t(xpc.f68515g, null, ci8.m4703P(-1704173407, new ez9(nz9Var, vi3Var, 10), tj3Var), tj3Var, 390, 2);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ez9(nz9Var, vi3Var, i, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.lang.Object, pw1] */
    /* JADX WARN: Type inference failed for: r14v1, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX INFO: renamed from: n */
    public static final void m8675n(List list, String str, vi3 vi3Var, ye1 ye1Var, int i) {
        long j;
        ?? r14 = (tj3) ye1Var;
        r14.m22115d0(1057317611);
        int i2 = 256;
        int i3 = i | (r14.m22124i(list) ? 4 : 2) | (r14.m22120g(str) ? 32 : 16) | (r14.m22124i(vi3Var) ? 256 : 128);
        boolean z = true;
        ?? r8 = 0;
        if (r14.m22099R(i3 & 1, (i3 & 147) != 146)) {
            float f = 1.0f;
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) r14.m22128k(ge9.f40637a)).f38955d, true, new gm5(28)), nj0.f52789H, r14, 48);
            int iHashCode = Long.hashCode(r14.f62385T);
            l77 l77VarM22132m = r14.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(r14, e16VarM4412e);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            r14.m22119f0();
            if (r14.f62384S) {
                r14.m22130l(ui3Var);
            } else {
                r14.m22137o0();
            }
            oha.m18001g(r14, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(r14, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(r14, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(r14, C0352b.f4305h);
            oha.m18001g(r14, C0352b.f4301d, e16VarM1322c);
            r14.m22111b0(1928224163);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                int iIntValue = ((Number) pair.f47623a).intValue();
                String str2 = (String) pair.f47624b;
                boolean zM11650l = fa4.m11650l(str2, str);
                as4 as4Var = new as4(f, z);
                if (zM11650l) {
                    r14.m22111b0(-1899548523);
                    j = ((ms5) r14.m22128k(ps5.f56764b)).f51799a.f55842a;
                    r14.m22139q(r8);
                } else {
                    r14.m22111b0(-1899547911);
                    r14.m22139q(r8);
                    j = aa1.f411j;
                }
                e16 e16VarM19045o = pb1.m19045o(r46.m20387m(as4Var, 2.0f, j, ui8.m22753b(8.0f)), ui8.m22753b(8.0f));
                vh9 vh9Var = ps5.f56764b;
                e16 e16VarM10007D = d32.m10007D(e16VarM19045o, ((ms5) r14.m22128k(vh9Var)).f51799a.f55822G, ss5.f61356d);
                ?? r11 = ((i3 & 896) == i2 ? 1 : r8) | (r14.m22120g(str2) ? 1 : 0);
                ?? M22097O = r14.m22097O();
                if (r11 != 0 || M22097O == we1.f66679a) {
                    M22097O = new pw1(vi3Var, str2, 3);
                    r14.m22131l0(M22097O);
                }
                ho9.m13414a(AbstractC0080f.m815b(null, r8, (ui3) M22097O, e16VarM10007D, 15), ui8.m22753b(8.0f), ((ms5) r14.m22128k(vh9Var)).f51799a.f55822G, 0L, 0.0f, 0.0f, null, ci8.m4703P(-1647172247, new yy9(iIntValue, r8, zM11650l), r14), r14, 12582912, 120);
                r8 = r8 == true ? 1 : 0;
                f = 1.0f;
                i2 = i2;
                z = true;
                i3 = i3;
            }
            r14.m22139q(r8);
            r14.m22139q(true);
        } else {
            r14.m22102U();
        }
        x18 x18VarM22143u = r14.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g39(list, str, vi3Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m8676o(String str, boolean z, vi3 vi3Var, ye1 ye1Var, int i) {
        boolean z2;
        vi3 vi3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1011413409);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var, 54);
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
            lw9.m16554b(str, new as4(1.0f, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71407k, tj3Var, i2 & 14, 0, 131068);
            z2 = z;
            vi3Var2 = vi3Var;
            tj3Var = tj3Var;
            ap9.m2973a(z2, vi3Var2, null, false, null, tj3Var, (i2 >> 3) & 126);
            tj3Var.m22139q(true);
        } else {
            z2 = z;
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new uv1(str, z2, vi3Var2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX INFO: renamed from: p */
    public static final void m8677p(yz7 yz7Var, boolean z, ui3 ui3Var, ye1 ye1Var, int i) {
        long jM10035e;
        ?? r12;
        long j;
        long j2;
        mv3 mv3Var = ss5.f61356d;
        LqTheme lqTheme = yz7Var.f70708d;
        boolean z2 = yz7Var.f70709e;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(903731199);
        int i2 = i | (tj3Var.m22124i(yz7Var) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            if (z2 && lqTheme == LqTheme.System) {
                tj3Var.m22111b0(-2093589986);
                e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, c99.m4422o(b16Var, 40.0f), 15);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
                se1.f60731q.getClass();
                ui3 ui3Var2 = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                zi3 zi3Var = C0352b.f4303f;
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                zi3 zi3Var2 = C0352b.f4302e;
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var, zi3Var3, numValueOf);
                vi3 vi3Var = C0352b.f4305h;
                oha.m18000f(tj3Var, vi3Var);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
                e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                if (z) {
                    tj3Var.m22111b0(363304519);
                    j2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55842a;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(363305129);
                    tj3Var.m22139q(false);
                    j2 = aa1.f405d;
                }
                si8 si8Var = ui8.f63972a;
                e16 e16VarM19045o = pb1.m19045o(AbstractC3584sr.m21607T(r46.m20387m(e16VarM4411d, 2.0f, j2, si8Var), 4.0f), si8Var);
                ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM19045o);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                e16 e16VarM4411d2 = c99.m4411d(b16Var, 1.0f);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4411d2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                qh0.m19963a(d32.m10007D(c99.m4410c(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f), aa1.f406e, mv3Var), tj3Var, 0);
                if (1.0f <= 0.0d) {
                    g54.m12362a("invalid weight; must be greater than zero");
                }
                qh0.m19963a(d32.m10007D(c99.m4410c(new as4(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true), 1.0f), aa1.f403b, mv3Var), tj3Var, 0);
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-2092387000);
                if (z2) {
                    int i3 = iz9.f44811b[lqTheme.ordinal()];
                    if (i3 != 1) {
                        jM10035e = i3 != 2 ? aa1.f404c : aa1.f403b;
                    } else {
                        jM10035e = aa1.f406e;
                    }
                } else {
                    String str = (String) u91.m22591I0(yz7Var.f70706b);
                    jM10035e = str != null ? d32.m10035e(Color.parseColor(str)) : aa1.f411j;
                }
                e16 e16VarM4422o = c99.m4422o(b16Var, 40.0f);
                si8 si8Var2 = ui8.f63972a;
                e16 e16VarM10007D = d32.m10007D(pb1.m19045o(e16VarM4422o, si8Var2), jM10035e, mv3Var);
                if (z) {
                    tj3Var.m22111b0(902353542);
                    j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55842a;
                    r12 = 0;
                    tj3Var.m22139q(false);
                } else {
                    r12 = 0;
                    tj3Var.m22111b0(902354154);
                    tj3Var.m22139q(false);
                    j = aa1.f411j;
                }
                qh0.m19963a(AbstractC0080f.m815b(null, r12, ui3Var, r46.m20387m(e16VarM10007D, 2.0f, j, si8Var2), 15), tj3Var, r12);
                tj3Var.m22139q(r12);
            }
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ln0(yz7Var, z, ui3Var, i, 9);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m8678q(List list, yz7 yz7Var, vi3 vi3Var, ye1 ye1Var, int i) {
        list.getClass();
        yz7Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1084208678);
        int i2 = (tj3Var.m22124i(list) ? 4 : 2) | i | (tj3Var.m22124i(yz7Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52817l, tj3Var, 6);
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
            tj3Var.m22111b0(-1058142866);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                yz7 yz7Var2 = (yz7) it.next();
                boolean zEquals = yz7Var2.f70705a.equals(yz7Var.f70705a);
                boolean zM22124i = ((i2 & 896) == 256) | tj3Var.m22124i(yz7Var2);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == we1.f66679a) {
                    objM22097O = new qk9(3, vi3Var, yz7Var2);
                    tj3Var.m22131l0(objM22097O);
                }
                m8677p(yz7Var2, zEquals, (ui3) objM22097O, tj3Var, 0);
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g39(list, yz7Var, vi3Var, i, 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:57:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x010f  */
    /* JADX WARN: Code duplicated, block: B:81:0x011b  */
    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r */
    public static final void m8679r(boolean z, nz9 nz9Var, vi3 vi3Var, ThemeSettingsTab themeSettingsTab, vi3 vi3Var2, boolean z2, ye1 ye1Var, int i, int i2) {
        int i3;
        vi3 vi3Var3;
        int i4;
        boolean z3;
        int i5;
        boolean z4;
        ThemeSettingsTab themeSettingsTab2;
        boolean z5;
        x18 x18VarM22143u;
        ThemeSettingsTab themeSettingsTab3;
        vi3 vi3Var4;
        boolean z6;
        Object objM22097O;
        nz9Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-889499847);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(nz9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= tj3Var.m22116e(themeSettingsTab == null ? -1 : themeSettingsTab.ordinal()) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                vi3Var3 = vi3Var2;
                i3 |= tj3Var.m22124i(vi3Var3) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z3 = z2;
                    if (tj3Var.m22122h(z3)) {
                        i5 = 131072;
                    } else {
                        i5 = 65536;
                    }
                    i3 |= i5;
                }
                if ((74899 & i3) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (tj3Var.m22099R(i3 & 1, z4)) {
                    if (i6 != 0) {
                        themeSettingsTab3 = ThemeSettingsTab.Theme;
                    } else {
                        themeSettingsTab3 = themeSettingsTab;
                    }
                    if (i7 != 0) {
                        objM22097O = tj3Var.m22097O();
                        if (objM22097O == we1.f66679a) {
                            objM22097O = new ow8(9);
                            tj3Var.m22131l0(objM22097O);
                        }
                        vi3Var4 = (vi3) objM22097O;
                    } else {
                        vi3Var4 = vi3Var3;
                    }
                    if (i4 != 0) {
                        z6 = true;
                    } else {
                        z6 = z3;
                    }
                    AbstractC0054a.m729d(z, null, AbstractC0070i.m772g(null, 0.0f, 3), AbstractC0070i.m773h(null, 3), null, ci8.m4703P(1620021089, new C3484q4(nz9Var, vi3Var, themeSettingsTab3, vi3Var4, z6, 2), tj3Var), tj3Var, (i3 & 14) | 200064, 18);
                    themeSettingsTab2 = themeSettingsTab3;
                    vi3Var3 = vi3Var4;
                    z5 = z6;
                } else {
                    tj3Var.m22102U();
                    themeSettingsTab2 = themeSettingsTab;
                    z5 = z3;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new dz9(z, nz9Var, vi3Var, themeSettingsTab2, vi3Var3, z5, i, i2);
                }
            }
            i3 |= 196608;
            z3 = z2;
            if ((74899 & i3) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var.m22099R(i3 & 1, z4)) {
                if (i6 != 0) {
                    themeSettingsTab3 = ThemeSettingsTab.Theme;
                } else {
                    themeSettingsTab3 = themeSettingsTab;
                }
                if (i7 != 0) {
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = new ow8(9);
                        tj3Var.m22131l0(objM22097O);
                    }
                    vi3Var4 = (vi3) objM22097O;
                } else {
                    vi3Var4 = vi3Var3;
                }
                if (i4 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                AbstractC0054a.m729d(z, null, AbstractC0070i.m772g(null, 0.0f, 3), AbstractC0070i.m773h(null, 3), null, ci8.m4703P(1620021089, new C3484q4(nz9Var, vi3Var, themeSettingsTab3, vi3Var4, z6, 2), tj3Var), tj3Var, (i3 & 14) | 200064, 18);
                themeSettingsTab2 = themeSettingsTab3;
                vi3Var3 = vi3Var4;
                z5 = z6;
            } else {
                tj3Var.m22102U();
                themeSettingsTab2 = themeSettingsTab;
                z5 = z3;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new dz9(z, nz9Var, vi3Var, themeSettingsTab2, vi3Var3, z5, i, i2);
            }
        }
        i3 |= 24576;
        vi3Var3 = vi3Var2;
        i4 = i2 & 32;
        if (i4 != 0) {
            if ((196608 & i) == 0) {
                z3 = z2;
                if (tj3Var.m22122h(z3)) {
                    i5 = 131072;
                } else {
                    i5 = 65536;
                }
                i3 |= i5;
            }
            if ((74899 & i3) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var.m22099R(i3 & 1, z4)) {
                if (i6 != 0) {
                    themeSettingsTab3 = ThemeSettingsTab.Theme;
                } else {
                    themeSettingsTab3 = themeSettingsTab;
                }
                if (i7 != 0) {
                    objM22097O = tj3Var.m22097O();
                    if (objM22097O == we1.f66679a) {
                        objM22097O = new ow8(9);
                        tj3Var.m22131l0(objM22097O);
                    }
                    vi3Var4 = (vi3) objM22097O;
                } else {
                    vi3Var4 = vi3Var3;
                }
                if (i4 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                AbstractC0054a.m729d(z, null, AbstractC0070i.m772g(null, 0.0f, 3), AbstractC0070i.m773h(null, 3), null, ci8.m4703P(1620021089, new C3484q4(nz9Var, vi3Var, themeSettingsTab3, vi3Var4, z6, 2), tj3Var), tj3Var, (i3 & 14) | 200064, 18);
                themeSettingsTab2 = themeSettingsTab3;
                vi3Var3 = vi3Var4;
                z5 = z6;
            } else {
                tj3Var.m22102U();
                themeSettingsTab2 = themeSettingsTab;
                z5 = z3;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new dz9(z, nz9Var, vi3Var, themeSettingsTab2, vi3Var3, z5, i, i2);
            }
        }
        i3 |= 196608;
        z3 = z2;
        if ((74899 & i3) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (tj3Var.m22099R(i3 & 1, z4)) {
            if (i6 != 0) {
                themeSettingsTab3 = ThemeSettingsTab.Theme;
            } else {
                themeSettingsTab3 = themeSettingsTab;
            }
            if (i7 != 0) {
                objM22097O = tj3Var.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = new ow8(9);
                    tj3Var.m22131l0(objM22097O);
                }
                vi3Var4 = (vi3) objM22097O;
            } else {
                vi3Var4 = vi3Var3;
            }
            if (i4 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            AbstractC0054a.m729d(z, null, AbstractC0070i.m772g(null, 0.0f, 3), AbstractC0070i.m773h(null, 3), null, ci8.m4703P(1620021089, new C3484q4(nz9Var, vi3Var, themeSettingsTab3, vi3Var4, z6, 2), tj3Var), tj3Var, (i3 & 14) | 200064, 18);
            themeSettingsTab2 = themeSettingsTab3;
            vi3Var3 = vi3Var4;
            z5 = z6;
        } else {
            tj3Var.m22102U();
            themeSettingsTab2 = themeSettingsTab;
            z5 = z3;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dz9(z, nz9Var, vi3Var, themeSettingsTab2, vi3Var3, z5, i, i2);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m8680s(nz9 nz9Var, vi3 vi3Var, boolean z, ye1 ye1Var, int i) {
        nz9 nz9Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-917751774);
        int i2 = 4;
        int i3 = i | (tj3Var.m22124i(nz9Var) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22122h(z) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            m8681t(xpc.f68509a, null, ci8.m4703P(-347747332, new ez9(nz9Var, vi3Var, i2), tj3Var), tj3Var, 390, 2);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28));
            fc0 fc0Var = nj0.f52789H;
            sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var, tj3Var, 48);
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
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            vj8 vj8Var = vj8.f65508a;
            m8681t(xpc.f68510b, vj8Var.mo12420a(1.0f, b16Var, true), ci8.m4703P(-1074744680, new ez9(nz9Var, vi3Var, 5), tj3Var), tj3Var, 390, 0);
            m8681t(xpc.f68511c, vj8Var.mo12420a(1.0f, b16Var, true), ci8.m4703P(1175963265, new ez9(nz9Var, vi3Var, 6), tj3Var), tj3Var, 390, 0);
            tj3Var.m22139q(true);
            if (z) {
                tj3Var.m22111b0(1021595157);
                e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                sj8 sj8VarM20003a2 = qj8.m20003a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28)), fc0Var, tj3Var, 48);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                nz9Var2 = nz9Var;
                m8681t(xpc.f68512d, c99.m4414g(vj8Var.mo12420a(1.0f, b16Var, true), 90.0f), ci8.m4703P(-423954531, new ez9(nz9Var2, vi3Var, 7), tj3Var), tj3Var, 390, 0);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                nz9Var2 = nz9Var;
                tj3Var.m22111b0(1022405280);
                tj3Var.m22139q(false);
            }
        } else {
            nz9Var2 = nz9Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new fz9(nz9Var2, vi3Var, z, i, 0);
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m8681t(zi3 zi3Var, e16 e16Var, C0282a c0282a, ye1 ye1Var, int i, int i2) {
        e16 e16Var2;
        int i3;
        zi3 zi3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(533856325);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
            e16Var2 = e16Var;
        } else {
            e16Var2 = e16Var;
            i3 = i | (tj3Var.m22120g(e16Var2) ? 32 : 16);
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            if (i4 != 0) {
                e16Var2 = b16Var;
            }
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(new n84(0L));
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            gc0 gc0Var = nj0.f52808c;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var2);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var3 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var3, ht5VarM19966d);
            zi3 zi3Var4 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var5 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var5, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var6 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c);
            e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21607T(r46.m20387m(AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13), 1.0f, aa1.m198b(0.5f, p58.m18900f(tj3Var).f55817B), ui8.m22753b(8.0f)), ge9.m12515a(tj3Var).f38956e), 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13);
            ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, ht5VarM19966d2);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var5, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c2);
            c0282a.invoke(tj3Var, 6);
            tj3Var.m22139q(true);
            e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 0.0f, 14);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = new dt6(19, t66Var);
                tj3Var.m22131l0(objM22097O2);
            }
            e16 e16VarM21609V = AbstractC3584sr.m21609V(d32.m10007D(pb1.m19025M(e16VarM21611X2, (vi3) objM22097O2), p58.m18900f(tj3Var).f55821F, ss5.f61356d), ge9.m12515a(tj3Var).f38955d, 0.0f, 2);
            ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, false);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var3, ht5VarM19966d3);
            oha.m18001g(tj3Var, zi3Var4, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var5, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var6, e16VarM1322c3);
            zi3Var2 = zi3Var;
            zi3Var2.invoke(tj3Var, 6);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            zi3Var2 = zi3Var;
            tj3Var.m22102U();
        }
        e16 e16Var3 = e16Var2;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(zi3Var2, e16Var3, c0282a, i, i2, 16);
        }
    }
}
