package com.lingq.feature.chat;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Toast;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.animation.core.C0061c;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0266w;
import androidx.compose.material3.C0233h;
import androidx.compose.material3.C0253l;
import androidx.compose.material3.DrawerValue;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.chat.ChatStats;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.settings.theme.AbstractC1881a;
import com.lingq.core.settings.theme.C1883c;
import com.lingq.core.settings.theme.ThemeSettingsTab;
import com.lingq.core.token.AbstractC1899b;
import com.lingq.core.token.C1909e;
import com.lingq.feature.chat.AbstractC2005i;
import com.lingq.feature.chat.settings.C2010a;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.FunctionReference;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C3072he;
import p000.C3368nd;
import p000.C3386nv;
import p000.C3445p2;
import p000.C3522r4;
import p000.C3539rk;
import p000.C3577sk;
import p000.C3598t4;
import p000.C3661uu;
import p000.C3799yk;
import p000.aa1;
import p000.ab1;
import p000.aj3;
import p000.b16;
import p000.b7d;
import p000.bb1;
import p000.bc3;
import p000.c99;
import p000.ci0;
import p000.ci8;
import p000.cw0;
import p000.d32;
import p000.db1;
import p000.dua;
import p000.e16;
import p000.ec0;
import p000.eh0;
import p000.eo5;
import p000.eu9;
import p000.ex0;
import p000.f5a;
import p000.f70;
import p000.fa4;
import p000.fc0;
import p000.fe9;
import p000.gc0;
import p000.ge9;
import p000.gm5;
import p000.gr3;
import p000.hj4;
import p000.ho5;
import p000.ho9;
import p000.ht5;
import p000.jj5;
import p000.jv0;
import p000.jx0;
import p000.jy9;
import p000.k44;
import p000.kv0;
import p000.kx0;
import p000.ky9;
import p000.l44;
import p000.l6b;
import p000.l77;
import p000.ld9;
import p000.lda;
import p000.lw9;
import p000.lx0;
import p000.ly3;
import p000.mkd;
import p000.mn0;
import p000.ms5;
import p000.mv3;
import p000.mx0;
import p000.my3;
import p000.my9;
import p000.n20;
import p000.nj0;
import p000.nv8;
import p000.nz9;
import p000.oha;
import p000.omd;
import p000.or1;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.pfa;
import p000.ps5;
import p000.pvc;
import p000.px0;
import p000.q6d;
import p000.qh0;
import p000.qj8;
import p000.qn5;
import p000.qx0;
import p000.r32;
import p000.r46;
import p000.rfd;
import p000.rx0;
import p000.s70;
import p000.se1;
import p000.si5;
import p000.si8;
import p000.sj8;
import p000.snb;
import p000.ss5;
import p000.sx0;
import p000.t17;
import p000.t31;
import p000.t66;
import p000.t70;
import p000.te1;
import p000.thb;
import p000.tj3;
import p000.tnb;
import p000.tx0;
import p000.tyc;
import p000.tz0;
import p000.u14;
import p000.u6d;
import p000.u91;
import p000.ud6;
import p000.ufd;
import p000.ui3;
import p000.ui8;
import p000.un1;
import p000.ux0;
import p000.v56;
import p000.vh9;
import p000.vi3;
import p000.vk9;
import p000.vx0;
import p000.vx9;
import p000.vz1;
import p000.w14;
import p000.w41;
import p000.we1;
import p000.wfb;
import p000.x14;
import p000.x18;
import p000.x74;
import p000.xfa;
import p000.xi5;
import p000.xwc;
import p000.xy9;
import p000.y38;
import p000.ye1;
import p000.zf1;
import p000.zg0;
import p000.zi3;
import p000.zs0;

/* JADX INFO: renamed from: com.lingq.feature.chat.i */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2005i {
    /* JADX INFO: renamed from: a */
    public static final void m8900a(boolean z, C0282a c0282a, ye1 ye1Var, int i) {
        boolean z2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(397457089);
        int i2 = (tj3Var.m22122h(z) ? 4 : 2) | i;
        int i3 = 0;
        int i4 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            z2 = z;
            AbstractC0054a.m729d(z2, null, AbstractC0070i.m772g(ss5.m21703b0(300, 0, null, 6), 0.0f, 2), AbstractC0070i.m773h(ss5.m21703b0(150, 0, null, 6), 2), null, ci8.m4703P(630405865, new mx0(c0282a, i3), tj3Var), tj3Var, (i2 & 14) | 200064, 18);
        } else {
            z2 = z;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new f70(z2, c0282a, i, i4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8901b(ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(218907513);
        int i2 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var2) ? 32 : 16);
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            ho9.m13414a(AbstractC3584sr.m21611X(b16.f7762a, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, 0.0f, 0.0f, 0.0f, 14), ui8.f63972a, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55872p, 0L, 0.0f, 1.0f, null, ci8.m4703P(1989412628, new cw0(ui3Var, ui3Var2, i3), tj3Var), tj3Var, 12779520, 88);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cw0(ui3Var, ui3Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8902c(t17 t17Var, ye1 ye1Var, int i) {
        t17Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(977590013);
        int i2 = (tj3Var.m22120g(t17Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            ge9.m12515a(tj3Var).getClass();
            si8 si8Var = p58.m18901i(tj3Var).f64858d;
            long j = p58.m18900f(tj3Var).f55824I;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(c99.m4410c(c99.m4412e(b16Var, 1.0f), 1.0f), ge9.m12515a(tj3Var).f38960i, 0.0f, 2), 0.0f, t17Var.mo14021d(), 0.0f, 0.0f, 13);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
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
            e16 e16VarM19045o = pb1.m19045o(c99.m4414g(c99.m4412e(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38958g * 4.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 18.0f), si8Var);
            mv3 mv3Var = ss5.f61356d;
            qh0.m19963a(x74.m24341H(d32.m10007D(e16VarM19045o, j, mv3Var)), tj3Var, 0);
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4412e(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38958g * 4.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4412e(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38958g * 6.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 60.0f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 250.0f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            qh0.m19963a(x74.m24341H(pb1.m19045o(d32.m10007D(c99.m4414g(c99.m4426s(b16Var, 250.0f), 18.0f), j, mv3Var), si8Var)), tj3Var, 0);
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 250.0f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 250.0f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 113.63636f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4412e(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38958g * 4.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4412e(AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38958g * 7.0f, 0.0f, 0.0f, 0.0f, 14), 1.0f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 60.0f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 250.0f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 250.0f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            qh0.m19963a(x74.m24341H(d32.m10007D(pb1.m19045o(c99.m4414g(c99.m4426s(b16Var, 104.166664f), 18.0f), si8Var), j, mv3Var)), tj3Var, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3368nd(t17Var, i, 5);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8903d(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1165466223);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            k44 k44VarM21687N = ss5.m21687N(ss5.m21703b0(600, 0, null, 6), RepeatMode.Restart, 0L, 4);
            C0061c c0061cM21691R = ss5.m21691R("loading_dots", tj3Var, 0);
            l44 l44VarM21713i = ss5.m21713i(c0061cM21691R, 0.0f, 1.0f, k44VarM21687N, "dot1", tj3Var, 29112, 0);
            l44 l44VarM21713i2 = ss5.m21713i(c0061cM21691R, 0.2f, 1.0f, k44VarM21687N, "dot2", tj3Var, 29112, 0);
            l44 l44VarM21713i3 = ss5.m21713i(c0061cM21691R, 0.4f, 1.0f, k44VarM21687N, "dot3", tj3Var, 29112, 0);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(c99.m4414g(b16Var, 36.0f), 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37241g, nj0.f52789H, tj3Var, 54);
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
            e16 e16VarM4422o = c99.m4422o(b16Var, ge9.m12515a(tj3Var).f38955d);
            float fFloatValue = ((Number) l44VarM21713i.getValue()).floatValue();
            e16 e16VarM22353a = tyc.m22353a(e16VarM4422o, fFloatValue, fFloatValue);
            si8 si8Var = ui8.f63972a;
            e16 e16VarM19045o = pb1.m19045o(e16VarM22353a, si8Var);
            long j = p58.m18900f(tj3Var).f55842a;
            mv3 mv3Var = ss5.f61356d;
            qh0.m19963a(d32.m10007D(e16VarM19045o, j, mv3Var), tj3Var, 0);
            e16 e16VarM4422o2 = c99.m4422o(b16Var, ge9.m12515a(tj3Var).f38955d);
            float fFloatValue2 = ((Number) l44VarM21713i2.getValue()).floatValue();
            qh0.m19963a(d32.m10007D(pb1.m19045o(tyc.m22353a(e16VarM4422o2, fFloatValue2, fFloatValue2), si8Var), p58.m18900f(tj3Var).f55842a, mv3Var), tj3Var, 0);
            e16 e16VarM4422o3 = c99.m4422o(b16Var, ge9.m12515a(tj3Var).f38955d);
            float fFloatValue3 = ((Number) l44VarM21713i3.getValue()).floatValue();
            qh0.m19963a(d32.m10007D(pb1.m19045o(tyc.m22353a(e16VarM4422o3, fFloatValue3, fFloatValue3), si8Var), p58.m18900f(tj3Var).f55842a, mv3Var), tj3Var, 0);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new jx0(i, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8904e(C2009m c2009m, C1909e c1909e, C1883c c1883c, C2010a c2010a, ud6 ud6Var, w41 w41Var, r32 r32Var, ye1 ye1Var, int i) {
        C2009m c2009m2;
        C1909e c1909e2;
        C1883c c1883c2;
        C2010a c2010a2;
        C2009m c2009m3;
        final C1883c c1883c3;
        C2010a c2010a3;
        C1909e c1909e3;
        C2010a c2010a4;
        tj3 tj3Var;
        ud6Var.getClass();
        w41Var.getClass();
        r32Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-457197611);
        int i2 = i | 1170 | (tj3Var2.m22124i(ud6Var) ? 16384 : 8192) | (tj3Var2.m22124i(w41Var) ? 131072 : 65536) | (tj3Var2.m22124i(r32Var) ? 1048576 : 524288);
        if (tj3Var2.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var2);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c2009m3 = (C2009m) pfa.m19114d(y38.m24933a(C2009m.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var2), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var2);
                dua duaVarM21396a2 = si5.m21396a(tj3Var2);
                if (duaVarM21396a2 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                C1909e c1909e4 = (C1909e) pfa.m19114d(y38.m24933a(C1909e.class), duaVarM21396a2, null, AbstractC3584sr.m21591B(duaVarM21396a2, tj3Var2), duaVarM21396a2 instanceof gr3 ? ((gr3) duaVarM21396a2).mo2103e() : or1.f54780b, tj3Var2);
                dua duaVarM21396a3 = si5.m21396a(tj3Var2);
                if (duaVarM21396a3 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c1883c3 = (C1883c) pfa.m19114d(y38.m24933a(C1883c.class), duaVarM21396a3, null, AbstractC3584sr.m21591B(duaVarM21396a3, tj3Var2), duaVarM21396a3 instanceof gr3 ? ((gr3) duaVarM21396a3).mo2103e() : or1.f54780b, tj3Var2);
                dua duaVarM21396a4 = si5.m21396a(tj3Var2);
                if (duaVarM21396a4 == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2010a3 = (C2010a) pfa.m19114d(y38.m24933a(C2010a.class), duaVarM21396a4, null, AbstractC3584sr.m21591B(duaVarM21396a4, tj3Var2), duaVarM21396a4 instanceof gr3 ? ((gr3) duaVarM21396a4).mo2103e() : or1.f54780b, tj3Var2);
                    c1909e3 = c1909e4;
                }
            } else {
                tj3Var2.m22102U();
                c2009m3 = c2009m;
                c1909e3 = c1909e;
                c1883c3 = c1883c;
                c2010a3 = c2010a;
            }
            tj3Var2.m22140r();
            t31 t31Var = (t31) tj3Var2.m22128k(AbstractC0402n.f4814f);
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            boolean zM22124i = tj3Var2.m22124i(context);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new lx0(context, 0);
                tj3Var2.m22131l0(objM22097O);
            }
            vi3 vi3Var = (vi3) objM22097O;
            String strMo4589b2 = c2009m3.f25273M.mo4589b2();
            c1883c3.getClass();
            strMo4589b2.getClass();
            C3244l c3244l = c1883c3.f23312m;
            c3244l.getClass();
            c3244l.m15572j(null, strMo4589b2);
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2009m3.f25287a0, tj3Var2);
            nz9 nz9Var = ((tz0) t66VarM2513c.getValue()).f63116d.f63046k;
            t66 t66VarM2513c2 = AbstractC0711a.m2513c(c2009m3.f25273M.mo4594r1(), tj3Var2);
            t66 t66VarM2513c3 = AbstractC0711a.m2513c(c2010a3.f25326h, tj3Var2);
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O2);
            }
            t66 t66Var = (t66) objM22097O2;
            if (((Boolean) t66Var.getValue()).booleanValue()) {
                tj3Var2.m22111b0(-1031615389);
                eo5 eo5Var = (eo5) t66VarM2513c3.getValue();
                Object objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new C3799yk(5, t66Var);
                    tj3Var2.m22131l0(objM22097O3);
                }
                ui3 ui3Var = (ui3) objM22097O3;
                boolean zM22124i2 = tj3Var2.m22124i(c2010a3);
                c2010a4 = c2010a3;
                Object objM22097O4 = tj3Var2.m22097O();
                if (zM22124i2 || objM22097O4 == p84Var) {
                    objM22097O4 = new ChatScreenKt$ChatRoute$2$1(1, c2010a4, C2010a.class, "handleAction", "handleAction(Lcom/lingq/feature/chat/settings/LynxSettingsAction;)V", 0);
                    tj3Var2.m22131l0(objM22097O4);
                }
                tnb.m22248b(eo5Var, ui3Var, (vi3) ((FunctionReference) objM22097O4), tj3Var2, 48);
                tj3Var2.m22139q(false);
            } else {
                c2010a4 = c2010a3;
                tj3Var2.m22111b0(-1031421267);
                tj3Var2.m22139q(false);
            }
            if (((tz0) t66VarM2513c.getValue()).f63115c instanceof ux0) {
                tj3Var2.m22111b0(-1031316797);
                ufd ufdVar = ((tz0) t66VarM2513c.getValue()).f63116d.f63044i;
                if (fa4.m11650l(ufdVar, u14.f63242a)) {
                    Toast.makeText(context, (CharSequence) vi3Var.invoke(Integer.valueOf(R$string.imports_import_failed)), 0).show();
                    c2009m3.m8925b3();
                }
                boolean z = ufdVar instanceof x14;
                int i3 = z ? ((x14) ufdVar).f67628a : 0;
                boolean zM22124i3 = tj3Var2.m22124i(c2009m3) | tj3Var2.m22124i(w41Var);
                int i4 = i3;
                Object objM22097O5 = tj3Var2.m22097O();
                if (zM22124i3 || objM22097O5 == p84Var) {
                    objM22097O5 = new s70(18, c2009m3, w41Var);
                    tj3Var2.m22131l0(objM22097O5);
                }
                vi3 vi3Var2 = (vi3) objM22097O5;
                boolean zM22124i4 = tj3Var2.m22124i(c2009m3);
                Object objM22097O6 = tj3Var2.m22097O();
                if (zM22124i4 || objM22097O6 == p84Var) {
                    objM22097O6 = new C3539rk(c2009m3, 4);
                    tj3Var2.m22131l0(objM22097O6);
                }
                rfd.m20653b(i4, 0, tj3Var2, (ui3) objM22097O6, vi3Var2, z);
                tj3Var = tj3Var2;
                rfd.m20652a(ufdVar instanceof w14, tj3Var, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22111b0(-1030169363);
                tj3Var.m22139q(false);
            }
            Object objM22097O7 = tj3Var.m22097O();
            if (objM22097O7 == p84Var) {
                objM22097O7 = d32.m10013K(tj3Var);
                tj3Var.m22131l0(objM22097O7);
            }
            un1 un1Var = (un1) objM22097O7;
            e16 e16VarM4411d = c99.m4411d(b16.f7762a, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4411d);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tz0 tz0Var = (tz0) t66VarM2513c.getValue();
            final C2009m c2009m4 = c2009m3;
            tj3 tj3Var3 = tj3Var;
            C1909e c1909e5 = c1909e3;
            C2004h c2004h = new C2004h(c2009m4, un1Var, t31Var, context, vi3Var, c1909e5, t66VarM2513c2, t66VarM2513c, w41Var, r32Var, ud6Var, t66Var);
            boolean zM22124i5 = tj3Var3.m22124i(c2009m4) | tj3Var3.m22124i(c1883c3);
            Object objM22097O8 = tj3Var3.m22097O();
            if (zM22124i5 || objM22097O8 == p84Var) {
                objM22097O8 = new vi3() { // from class: com.lingq.feature.chat.g
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        xy9 xy9Var = (xy9) obj;
                        xy9Var.getClass();
                        boolean z2 = xy9Var instanceof ky9;
                        C2009m c2009m5 = c2009m4;
                        if (z2) {
                            wfb.m23926u(lda.m16103C(c2009m5), null, null, new ChatViewModel$setLessonFontSize$1(c2009m5, ((ky9) xy9Var).f48779a, null), 3);
                        } else if (xy9Var instanceof my9) {
                            wfb.m23926u(lda.m16103C(c2009m5), null, null, new ChatViewModel$setLessonLineSpacing$1(c2009m5, ((my9) xy9Var).f52046a, null), 3);
                        } else if (xy9Var instanceof jy9) {
                            jy9 jy9Var = (jy9) xy9Var;
                            ReaderFont readerFont = jy9Var.f46409a;
                            boolean z3 = jy9Var.f46410b;
                            readerFont.getClass();
                            wfb.m23926u(lda.m16103C(c2009m5), null, null, new ChatViewModel$setFont$1(z3, c2009m5, readerFont, null), 3);
                        } else {
                            c1883c3.m8688Z2(xy9Var);
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var3.m22131l0(objM22097O8);
            }
            m8905f(tz0Var, nz9Var, c2004h, (vi3) objM22097O8, tj3Var3, 64);
            tj3Var2 = tj3Var3;
            t66 t66VarM2513c4 = AbstractC0711a.m2513c(c1909e5.f23886X, tj3Var2);
            f5a f5aVar = (f5a) t66VarM2513c4.getValue();
            boolean zM22124i6 = tj3Var2.m22124i(c2009m4) | tj3Var2.m22120g(t66VarM2513c4) | tj3Var2.m22120g(t66VarM2513c2) | tj3Var2.m22124i(c1909e5);
            Object objM22097O9 = tj3Var2.m22097O();
            if (zM22124i6 || objM22097O9 == p84Var) {
                objM22097O9 = new C3445p2(c2009m4, c1909e5, t66VarM2513c4, t66VarM2513c2, 5);
                tj3Var2.m22131l0(objM22097O9);
            }
            AbstractC1899b.m8698g(f5aVar, (vi3) objM22097O9, tj3Var2, 8);
            tj3Var2.m22139q(true);
            c1909e2 = c1909e5;
            c2009m2 = c2009m4;
            c1883c2 = c1883c3;
            c2010a2 = c2010a4;
        } else {
            tj3Var2.m22102U();
            c2009m2 = c2009m;
            c1909e2 = c1909e;
            c1883c2 = c1883c;
            c2010a2 = c2010a;
        }
        x18 x18VarM22143u = tj3Var2.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new sx0(c2009m2, c1909e2, c1883c2, c2010a2, ud6Var, w41Var, r32Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8905f(final tz0 tz0Var, final nz9 nz9Var, final jv0 jv0Var, final vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        long j;
        tz0Var.getClass();
        tx0 tx0Var = tz0Var.f63116d;
        nz9Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-2143112682);
        int i2 = 4;
        int i3 = (tj3Var2.m22124i(tz0Var) ? 4 : 2) | i | (tj3Var2.m22124i(nz9Var) ? 32 : 16) | (tj3Var2.m22120g(jv0Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var) ? 2048 : 1024;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            final ld9 ld9Var = (ld9) tj3Var2.m22128k(AbstractC0402n.f4826r);
            final InterfaceC0300b interfaceC0300b = (InterfaceC0300b) tj3Var2.m22128k(AbstractC0402n.f4817i);
            final C0253l c0253lM1211d = AbstractC0266w.m1211d(DrawerValue.Closed, tj3Var2);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = d32.m10013K(tj3Var2);
                tj3Var2.m22131l0(objM22097O);
            }
            final un1 un1Var = (un1) objM22097O;
            View view = (View) tj3Var2.m22128k(AbstractC0394f.f4765f);
            boolean zM22124i = tj3Var2.m22124i(interfaceC0300b) | tj3Var2.m22120g(ld9Var) | tj3Var2.m22124i(view);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new zg0(interfaceC0300b, ld9Var, view, i2);
                tj3Var2.m22131l0(objM22097O2);
            }
            final ui3 ui3Var = (ui3) objM22097O2;
            int i4 = i3;
            boolean zM22120g = ((i3 & 896) == 256) | tj3Var2.m22120g(ui3Var) | tj3Var2.m22124i(un1Var) | tj3Var2.m22120g(c0253lM1211d);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                objM22097O3 = new ui3() { // from class: com.lingq.feature.chat.a
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        ui3Var.mo0a();
                        wfb.m23926u(un1Var, null, null, new ChatScreenKt$ChatScreen$toggleDrawer$1$1$1(jv0Var, c0253lM1211d, null), 3);
                        return xfa.f68157a;
                    }
                };
                tj3Var2.m22131l0(objM22097O3);
            }
            final ui3 ui3Var2 = (ui3) objM22097O3;
            final nz9 nz9Var2 = tx0Var.f63046k;
            String str = (String) u91.m22591I0(nz9Var2.f53460f.f70706b);
            aa1 aa1Var = str != null ? new aa1(d32.m10035e(Color.parseColor(str))) : null;
            if (aa1Var == null) {
                tj3Var2.m22111b0(2053059421);
                j = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55872p;
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(2053056166);
                tj3Var2.m22139q(false);
                j = aa1Var.f414a;
            }
            final long j2 = j;
            Object objM22097O4 = tj3Var2.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O4);
            }
            final t66 t66Var = (t66) objM22097O4;
            Object objM22097O5 = tj3Var2.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = AbstractC0278f.m1260j(ThemeSettingsTab.Theme);
                tj3Var2.m22131l0(objM22097O5);
            }
            final t66 t66Var2 = (t66) objM22097O5;
            Object[] objArr = new Object[0];
            Object objM22097O6 = tj3Var2.m22097O();
            if (objM22097O6 == p84Var) {
                objM22097O6 = new C3072he(21);
                tj3Var2.m22131l0(objM22097O6);
            }
            final t66 t66Var3 = (t66) xwc.m24745R(objArr, (ui3) objM22097O6, tj3Var2, 48);
            if (fa4.m11650l(tz0Var.f63115c, vx0.f66039a)) {
                tj3Var2.m22111b0(-779380761);
                u6d.m22516a(tx0Var.f63046k, jv0Var, tj3Var2, ((i4 >> 3) & 112) | 8);
                tj3Var2.m22139q(false);
                tj3Var = tj3Var2;
            } else {
                tj3Var2.m22111b0(-778238907);
                Boolean boolValueOf = Boolean.valueOf(tx0Var.f63049n);
                boolean zM22124i2 = tj3Var2.m22124i(tz0Var) | tj3Var2.m22120g(ld9Var) | tj3Var2.m22124i(interfaceC0300b);
                Object objM22097O7 = tj3Var2.m22097O();
                if (zM22124i2 || objM22097O7 == p84Var) {
                    objM22097O7 = new ChatScreenKt$ChatScreen$1$1(tz0Var, ld9Var, interfaceC0300b, null);
                    tj3Var2.m22131l0(objM22097O7);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O7, boolValueOf);
                Boolean boolValueOf2 = Boolean.valueOf(c0253lM1211d.m1182c());
                boolean zM22120g2 = tj3Var2.m22120g(c0253lM1211d) | tj3Var2.m22120g(ui3Var);
                Object objM22097O8 = tj3Var2.m22097O();
                if (zM22120g2 || objM22097O8 == p84Var) {
                    objM22097O8 = new ChatScreenKt$ChatScreen$2$1(c0253lM1211d, ui3Var, null);
                    tj3Var2.m22131l0(objM22097O8);
                }
                d32.m10047k(tj3Var2, (zi3) objM22097O8, boolValueOf2);
                tj3Var = tj3Var2;
                AbstractC0266w.m1210c(ci8.m4703P(-64095669, new zs0(tz0Var, jv0Var, interfaceC0300b, ld9Var, un1Var, c0253lM1211d, 1), tj3Var2), null, c0253lM1211d, c0253lM1211d.m1182c(), 0L, ci8.m4703P(-192807408, new zi3() { // from class: fx0
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ye1 ye1Var2 = (ye1) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        tj3 tj3Var3 = (tj3) ye1Var2;
                        if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                            e16 e16VarM22061t = thb.m22061t(c99.m4411d(b16.f7762a, 1.0f));
                            Object objM22097O9 = tj3Var3.m22097O();
                            p84 p84Var2 = we1.f66679a;
                            if (objM22097O9 == p84Var2) {
                                objM22097O9 = AbstractC3393o1.m17729d(tj3Var3);
                            }
                            v56 v56Var = (v56) objM22097O9;
                            final InterfaceC0300b interfaceC0300b2 = interfaceC0300b;
                            boolean zM22124i3 = tj3Var3.m22124i(interfaceC0300b2);
                            final ld9 ld9Var2 = ld9Var;
                            boolean zM22120g3 = zM22124i3 | tj3Var3.m22120g(ld9Var2);
                            final jv0 jv0Var2 = jv0Var;
                            boolean zM22124i4 = zM22120g3 | tj3Var3.m22124i(jv0Var2);
                            Object objM22097O10 = tj3Var3.m22097O();
                            if (zM22124i4 || objM22097O10 == p84Var2) {
                                objM22097O10 = new zg0(interfaceC0300b2, ld9Var2, jv0Var2, 3);
                                tj3Var3.m22131l0(objM22097O10);
                            }
                            e16 e16VarM814a = AbstractC0080f.m814a(e16VarM22061t, v56Var, null, false, null, (ui3) objM22097O10, 28);
                            final tz0 tz0Var2 = tz0Var;
                            final long j3 = j2;
                            ui3 ui3Var3 = ui3Var2;
                            final nz9 nz9Var3 = nz9Var2;
                            C0282a c0282aM4703P = ci8.m4703P(-170247980, new gx0(tz0Var2, j3, jv0Var2, ui3Var3, nz9Var3), tj3Var3);
                            final t66 t66Var4 = t66Var3;
                            final t66 t66Var5 = t66Var;
                            b34.m3232b(e16VarM814a, c0282aM4703P, ci8.m4703P(1114814549, new zi3() { // from class: hx0
                                @Override // p000.zi3
                                public final Object invoke(Object obj3, Object obj4) {
                                    long j4;
                                    ye1 ye1Var3 = (ye1) obj3;
                                    int iIntValue2 = ((Integer) obj4).intValue();
                                    tj3 tj3Var4 = (tj3) ye1Var3;
                                    if (tj3Var4.m22099R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        final tz0 tz0Var3 = tz0Var2;
                                        final boolean zM11650l = fa4.m11650l(tz0Var3.f63115c, xx0.f68916a);
                                        if (fa4.m11650l(tz0Var3.f63115c, ux0.f64483a)) {
                                            tj3Var4.m22111b0(1889931652);
                                            tj3Var4.m22139q(false);
                                            j4 = j3;
                                        } else {
                                            tj3Var4.m22111b0(1889933148);
                                            j4 = ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51799a.f55872p;
                                            tj3Var4.m22139q(false);
                                        }
                                        final long j5 = j4;
                                        e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
                                        final jv0 jv0Var3 = jv0Var2;
                                        final t66 t66Var6 = t66Var4;
                                        final nz9 nz9Var4 = nz9Var3;
                                        final ld9 ld9Var3 = ld9Var2;
                                        final InterfaceC0300b interfaceC0300b3 = interfaceC0300b2;
                                        final t66 t66Var7 = t66Var5;
                                        ho9.m13414a(e16VarM4412e, null, j5, 0L, 0.0f, 0.0f, null, ci8.m4703P(-1594928848, new zi3() { // from class: com.lingq.feature.chat.e
                                            @Override // p000.zi3
                                            public final Object invoke(Object obj5, Object obj6) {
                                                jv0 jv0Var4;
                                                float f;
                                                final String str2;
                                                C0233h c0233hM22003q;
                                                mn0 mn0VarM21998l;
                                                ye1 ye1Var4 = (ye1) obj5;
                                                int iIntValue3 = ((Integer) obj6).intValue();
                                                tj3 tj3Var5 = (tj3) ye1Var4;
                                                if (tj3Var5.m22099R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                                    Object objM22097O11 = tj3Var5.m22097O();
                                                    p84 p84Var3 = we1.f66679a;
                                                    if (objM22097O11 == p84Var3) {
                                                        objM22097O11 = AbstractC0278f.m1260j(Boolean.FALSE);
                                                        tj3Var5.m22131l0(objM22097O11);
                                                    }
                                                    final t66 t66Var8 = (t66) objM22097O11;
                                                    bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var5, 0);
                                                    int iHashCode = Long.hashCode(tj3Var5.f62385T);
                                                    l77 l77VarM22132m = tj3Var5.m22132m();
                                                    b16 b16Var = b16.f7762a;
                                                    e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var5, b16Var);
                                                    se1.f60731q.getClass();
                                                    ui3 ui3Var4 = C0352b.f4299b;
                                                    tj3Var5.m22119f0();
                                                    if (tj3Var5.f62384S) {
                                                        tj3Var5.m22130l(ui3Var4);
                                                    } else {
                                                        tj3Var5.m22137o0();
                                                    }
                                                    oha.m18001g(tj3Var5, C0352b.f4303f, bb1VarM230a);
                                                    oha.m18001g(tj3Var5, C0352b.f4302e, l77VarM22132m);
                                                    oha.m18001g(tj3Var5, C0352b.f4304g, Integer.valueOf(iHashCode));
                                                    oha.m18000f(tj3Var5, C0352b.f4305h);
                                                    oha.m18001g(tj3Var5, C0352b.f4301d, e16VarM1322c);
                                                    final boolean z = zM11650l;
                                                    final tz0 tz0Var4 = tz0Var3;
                                                    jv0 jv0Var5 = jv0Var3;
                                                    if (z) {
                                                        tj3Var5.m22111b0(-1696586754);
                                                        tx0 tx0Var2 = tz0Var4.f63116d;
                                                        List list = tx0Var2.f63037b;
                                                        boolean z2 = tx0Var2.f63038c;
                                                        boolean zM22124i5 = tj3Var5.m22124i(jv0Var5);
                                                        Object objM22097O12 = tj3Var5.m22097O();
                                                        if (zM22124i5 || objM22097O12 == p84Var3) {
                                                            objM22097O12 = new kx0(jv0Var5, 2);
                                                            tj3Var5.m22131l0(objM22097O12);
                                                        }
                                                        vi3 vi3Var2 = (vi3) objM22097O12;
                                                        boolean zM22124i6 = tj3Var5.m22124i(jv0Var5);
                                                        Object objM22097O13 = tj3Var5.m22097O();
                                                        if (zM22124i6 || objM22097O13 == p84Var3) {
                                                            jv0Var4 = jv0Var5;
                                                            ChatScreenKt$ChatScreen$4$4$1$1$2$1 chatScreenKt$ChatScreen$4$4$1$1$2$1 = new ChatScreenKt$ChatScreen$4$4$1$1$2$1(0, jv0Var4, jv0.class, "onShuffleSuggestions", "onShuffleSuggestions()V", 0);
                                                            tj3Var5.m22131l0(chatScreenKt$ChatScreen$4$4$1$1$2$1);
                                                            objM22097O13 = chatScreenKt$ChatScreen$4$4$1$1$2$1;
                                                        } else {
                                                            jv0Var4 = jv0Var5;
                                                        }
                                                        f = 0.0f;
                                                        b7d.m3410a(24576, tj3Var5, (ui3) ((FunctionReference) objM22097O13), vi3Var2, AbstractC3584sr.m21609V(b16Var, 12.0f, 0.0f, 2), list, z2);
                                                        tj3Var5 = tj3Var5;
                                                        tj3Var5.m22139q(false);
                                                    } else {
                                                        jv0Var4 = jv0Var5;
                                                        f = 0.0f;
                                                        tj3Var5.m22111b0(-1695869848);
                                                        tj3Var5.m22139q(false);
                                                    }
                                                    tj3Var5.m22111b0(1053675939);
                                                    kv0 kv0Var = tz0Var4.f63119g;
                                                    String strM23620a0 = kv0Var.f48448a;
                                                    String strM23620a1 = kv0Var.f48449b;
                                                    if (vk9.m23391n0(strM23620a0)) {
                                                        tj3Var5.m22111b0(1053679505);
                                                        strM23620a0 = vk9.m23391n0(strM23620a1) ? vz1.m23620a0(tj3Var5, R$string.chat_message_intro) : strM23620a1;
                                                        tj3Var5.m22139q(false);
                                                    }
                                                    final String str3 = strM23620a0;
                                                    tj3Var5.m22139q(false);
                                                    if (z) {
                                                        tj3Var5.m22111b0(-1695521253);
                                                        String str4 = tz0Var4.f63120h;
                                                        if (vk9.m23391n0(str4)) {
                                                            tj3Var5.m22111b0(1053690001);
                                                            if (vk9.m23391n0(strM23620a1)) {
                                                                strM23620a1 = vz1.m23620a0(tj3Var5, R$string.chat_message_intro);
                                                            }
                                                            tj3Var5.m22139q(false);
                                                            str4 = strM23620a1;
                                                        }
                                                        tj3Var5.m22139q(false);
                                                        str2 = str4;
                                                    } else {
                                                        tj3Var5.m22111b0(-1695220057);
                                                        if (vk9.m23391n0(strM23620a1)) {
                                                            strM23620a1 = vz1.m23620a0(tj3Var5, R$string.chat_message_intro);
                                                        }
                                                        tj3Var5.m22139q(false);
                                                        str2 = strM23620a1;
                                                    }
                                                    e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), 12.0f, f, 2), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var5.m22128k(ge9.f40637a)).f38952a, 7);
                                                    si8 si8Var = ((ms5) tj3Var5.m22128k(ps5.f56764b)).f51801c.f64858d;
                                                    if (z) {
                                                        tj3Var5.m22111b0(-1694299388);
                                                        c0233hM22003q = te1.m22000n(63, f);
                                                        tj3Var5.m22139q(false);
                                                    } else {
                                                        tj3Var5.m22111b0(-1694193988);
                                                        c0233hM22003q = te1.m22003q(63, f);
                                                        tj3Var5.m22139q(false);
                                                    }
                                                    final long j6 = j5;
                                                    if (z) {
                                                        tj3Var5.m22111b0(-1694028913);
                                                        mn0VarM21998l = te1.m21999m(0, 14, j6, 0L, tj3Var5);
                                                        tj3Var5.m22139q(false);
                                                    } else {
                                                        tj3Var5.m22111b0(-1693903673);
                                                        mn0VarM21998l = te1.m21998l(tj3Var5);
                                                        tj3Var5.m22139q(false);
                                                    }
                                                    mn0 mn0Var = mn0VarM21998l;
                                                    final t66 t66Var9 = t66Var6;
                                                    final nz9 nz9Var5 = nz9Var4;
                                                    final ld9 ld9Var4 = ld9Var3;
                                                    final InterfaceC0300b interfaceC0300b4 = interfaceC0300b3;
                                                    final t66 t66Var10 = t66Var7;
                                                    final jv0 jv0Var6 = jv0Var4;
                                                    tj3 tj3Var6 = tj3Var5;
                                                    r46.m20382g(e16VarM21611X, si8Var, c0233hM22003q, mn0Var, null, null, ci8.m4703P(-1546268064, new aj3() { // from class: com.lingq.feature.chat.f
                                                        @Override // p000.aj3
                                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                                            zi3 zi3Var;
                                                            vi3 vi3Var3;
                                                            zi3 zi3Var2;
                                                            ui3 ui3Var5;
                                                            long j7;
                                                            boolean z3;
                                                            boolean z4;
                                                            ui3 ui3Var6;
                                                            long j8;
                                                            b16 b16Var2;
                                                            zi3 zi3Var3;
                                                            jv0 jv0Var7;
                                                            ci0 ci0Var;
                                                            vi3 vi3Var4;
                                                            e16 e16Var;
                                                            e16 e16VarM21611X2;
                                                            C2002f c2002f;
                                                            tz0 tz0Var5;
                                                            boolean z5;
                                                            e16 e16VarM21611X3;
                                                            boolean z6;
                                                            long j9;
                                                            long j10;
                                                            ye1 ye1Var5 = (ye1) obj8;
                                                            int iIntValue4 = ((Integer) obj9).intValue();
                                                            ((db1) obj7).getClass();
                                                            tj3 tj3Var7 = (tj3) ye1Var5;
                                                            if (tj3Var7.m22099R(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                                                b16 b16Var3 = b16.f7762a;
                                                                e16 e16VarM4412e2 = c99.m4412e(b16Var3, 1.0f);
                                                                mv3 mv3Var = ss5.f61356d;
                                                                long j11 = j6;
                                                                e16 e16VarM10007D = d32.m10007D(e16VarM4412e2, j11, mv3Var);
                                                                jj5 jj5Var = eh0.f37242h;
                                                                ec0 ec0Var = nj0.f52791J;
                                                                bb1 bb1VarM230a2 = ab1.m230a(jj5Var, ec0Var, tj3Var7, 6);
                                                                int iHashCode2 = Long.hashCode(tj3Var7.f62385T);
                                                                l77 l77VarM22132m2 = tj3Var7.m22132m();
                                                                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var7, e16VarM10007D);
                                                                se1.f60731q.getClass();
                                                                ui3 ui3Var7 = C0352b.f4299b;
                                                                tj3Var7.m22119f0();
                                                                if (tj3Var7.f62384S) {
                                                                    tj3Var7.m22130l(ui3Var7);
                                                                } else {
                                                                    tj3Var7.m22137o0();
                                                                }
                                                                zi3 zi3Var4 = C0352b.f4303f;
                                                                oha.m18001g(tj3Var7, zi3Var4, bb1VarM230a2);
                                                                zi3 zi3Var5 = C0352b.f4302e;
                                                                oha.m18001g(tj3Var7, zi3Var5, l77VarM22132m2);
                                                                Integer numValueOf = Integer.valueOf(iHashCode2);
                                                                zi3 zi3Var6 = C0352b.f4304g;
                                                                oha.m18001g(tj3Var7, zi3Var6, numValueOf);
                                                                vi3 vi3Var5 = C0352b.f4305h;
                                                                oha.m18000f(tj3Var7, vi3Var5);
                                                                zi3 zi3Var7 = C0352b.f4301d;
                                                                oha.m18001g(tj3Var7, zi3Var7, e16VarM1322c2);
                                                                e16 e16VarM4412e3 = c99.m4412e(b16Var3, 1.0f);
                                                                bb1 bb1VarM230a3 = ab1.m230a(eh0.f37238d, ec0Var, tj3Var7, 0);
                                                                int iHashCode3 = Long.hashCode(tj3Var7.f62385T);
                                                                l77 l77VarM22132m3 = tj3Var7.m22132m();
                                                                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var7, e16VarM4412e3);
                                                                tj3Var7.m22119f0();
                                                                if (tj3Var7.f62384S) {
                                                                    tj3Var7.m22130l(ui3Var7);
                                                                } else {
                                                                    tj3Var7.m22137o0();
                                                                }
                                                                oha.m18001g(tj3Var7, zi3Var4, bb1VarM230a3);
                                                                oha.m18001g(tj3Var7, zi3Var5, l77VarM22132m3);
                                                                AbstractC3393o1.m17747v(iHashCode3, tj3Var7, zi3Var6, tj3Var7, vi3Var5);
                                                                oha.m18001g(tj3Var7, zi3Var7, e16VarM1322c3);
                                                                boolean z7 = z;
                                                                if (z7) {
                                                                    tj3Var7.m22111b0(312257543);
                                                                    e16 e16VarM4412e4 = c99.m4412e(b16Var3, 1.0f);
                                                                    zf1 zf1Var = ge9.f40637a;
                                                                    e16 e16VarM21611X4 = AbstractC3584sr.m21611X(e16VarM4412e4, ((fe9) tj3Var7.m22128k(zf1Var)).f38957f, ((fe9) tj3Var7.m22128k(zf1Var)).f38956e, ((fe9) tj3Var7.m22128k(zf1Var)).f38957f, 0.0f, 8);
                                                                    vh9 vh9Var = ps5.f56764b;
                                                                    long j12 = ((ms5) tj3Var7.m22128k(vh9Var)).f51799a.f55873q;
                                                                    vx9 vx9VarM23584b = vx9.m23584b(((ms5) tj3Var7.m22128k(vh9Var)).f51800b.f71404h, 0L, 0L, bc3.f8323i, null, null, 0L, null, null, 0, 0L, null, 16777211);
                                                                    j7 = j11;
                                                                    vi3Var3 = vi3Var5;
                                                                    zi3Var2 = zi3Var6;
                                                                    zi3Var = zi3Var5;
                                                                    ui3Var5 = ui3Var7;
                                                                    lw9.m16554b(str3, e16VarM21611X4, j12, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9VarM23584b, tj3Var7, 0, 0, 131064);
                                                                    tj3Var7 = tj3Var7;
                                                                    z3 = false;
                                                                    tj3Var7.m22139q(false);
                                                                } else {
                                                                    zi3Var = zi3Var5;
                                                                    vi3Var3 = vi3Var5;
                                                                    zi3Var2 = zi3Var6;
                                                                    ui3Var5 = ui3Var7;
                                                                    j7 = j11;
                                                                    z3 = false;
                                                                    tj3Var7.m22111b0(313193774);
                                                                    tj3Var7.m22139q(false);
                                                                }
                                                                e16 e16VarM4412e5 = c99.m4412e(b16Var3, 1.0f);
                                                                gc0 gc0Var = nj0.f52808c;
                                                                ht5 ht5VarM19966d = qh0.m19966d(gc0Var, z3);
                                                                int iHashCode4 = Long.hashCode(tj3Var7.f62385T);
                                                                l77 l77VarM22132m4 = tj3Var7.m22132m();
                                                                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var7, e16VarM4412e5);
                                                                tj3Var7.m22119f0();
                                                                if (tj3Var7.f62384S) {
                                                                    tj3Var7.m22130l(ui3Var5);
                                                                } else {
                                                                    tj3Var7.m22137o0();
                                                                }
                                                                oha.m18001g(tj3Var7, zi3Var4, ht5VarM19966d);
                                                                oha.m18001g(tj3Var7, zi3Var, l77VarM22132m4);
                                                                AbstractC3393o1.m17747v(iHashCode4, tj3Var7, zi3Var2, tj3Var7, vi3Var3);
                                                                oha.m18001g(tj3Var7, zi3Var7, e16VarM1322c4);
                                                                t66 t66Var11 = t66Var9;
                                                                String str5 = (String) t66Var11.getValue();
                                                                e16 e16VarM4418k = c99.m4418k(c99.m4412e(b16Var3, 1.0f), 1);
                                                                tz0 tz0Var6 = tz0Var4;
                                                                String str6 = tz0Var6.f63113a;
                                                                tx0 tx0Var3 = tz0Var6.f63116d;
                                                                hj4 hj4Var = new hj4(1, 0, new xi5(str6), 59);
                                                                boolean z8 = tx0Var3.f63048m;
                                                                long j13 = j7;
                                                                tj3 tj3Var8 = tj3Var7;
                                                                long j14 = j7;
                                                                vi3 vi3Var6 = vi3Var3;
                                                                zi3 zi3Var8 = zi3Var2;
                                                                long j15 = j7;
                                                                zi3 zi3Var9 = zi3Var;
                                                                eu9 eu9VarM16905h = mkd.m16905h(j15, j13, 0L, j14, 0L, tj3Var8, 2147479503);
                                                                t66 t66Var12 = t66Var8;
                                                                boolean zBooleanValue = ((Boolean) t66Var12.getValue()).booleanValue();
                                                                vx9 vx9VarM23584b2 = vx9.m23584b((vx9) tj3Var8.m22128k(lw9.f50220a), 0L, 0L, null, null, null, 0L, null, null, AbstractC3184kh.m15194A(tz0Var6.f63113a) ? 2 : 1, 0L, null, 16711679);
                                                                boolean zM22120g4 = tj3Var8.m22120g(t66Var11);
                                                                Object objM22097O14 = tj3Var8.m22097O();
                                                                p84 p84Var4 = we1.f66679a;
                                                                if (zM22120g4 || objM22097O14 == p84Var4) {
                                                                    objM22097O14 = new n20(t66Var11, t66Var12, 1);
                                                                    tj3Var8.m22131l0(objM22097O14);
                                                                }
                                                                ui3 ui3Var8 = ui3Var5;
                                                                q6d.m19686c(str5, (vi3) objM22097O14, e16VarM4418k, z8, vx9VarM23584b2, ci8.m4703P(332293842, new C3598t4(8, tz0Var6, str2), tj3Var8), null, null, null, ci8.m4703P(119509989, new px0(t66Var11, t66Var12, 0), tj3Var8), zBooleanValue, null, hj4Var, null, false, 0, 0, null, eu9VarM16905h, tj3Var8, 1573248, 384, 4149136);
                                                                tj3 tj3Var9 = tj3Var8;
                                                                boolean z9 = tx0Var3.f63049n;
                                                                jv0 jv0Var8 = jv0Var6;
                                                                ci0 ci0Var2 = ci0.f10109a;
                                                                if (z9) {
                                                                    tj3Var9.m22111b0(684389973);
                                                                    e16 e16VarM4674b = ci0Var2.m4674b(b16Var3);
                                                                    Object objM22097O15 = tj3Var9.m22097O();
                                                                    if (objM22097O15 == p84Var4) {
                                                                        objM22097O15 = AbstractC3393o1.m17729d(tj3Var9);
                                                                    }
                                                                    v56 v56Var2 = (v56) objM22097O15;
                                                                    boolean zM22124i7 = tj3Var9.m22124i(jv0Var8);
                                                                    Object objM22097O16 = tj3Var9.m22097O();
                                                                    if (zM22124i7 || objM22097O16 == p84Var4) {
                                                                        ChatScreenKt$ChatScreen$4$4$1$1$3$1$1$1$5$1 chatScreenKt$ChatScreen$4$4$1$1$3$1$1$1$5$1 = new ChatScreenKt$ChatScreen$4$4$1$1$3$1$1$1$5$1(0, jv0Var8, jv0.class, "onOutOfCreditsTapped", "onOutOfCreditsTapped()V", 0);
                                                                        tj3Var9.m22131l0(chatScreenKt$ChatScreen$4$4$1$1$3$1$1$1$5$1);
                                                                        objM22097O16 = chatScreenKt$ChatScreen$4$4$1$1$3$1$1$1$5$1;
                                                                    }
                                                                    z4 = false;
                                                                    qh0.m19963a(AbstractC0080f.m814a(e16VarM4674b, v56Var2, null, false, null, (ui3) ((FunctionReference) objM22097O16), 28), tj3Var9, 0);
                                                                    tj3Var9.m22139q(false);
                                                                } else {
                                                                    z4 = false;
                                                                    tj3Var9.m22111b0(685157812);
                                                                    tj3Var9.m22139q(false);
                                                                }
                                                                tj3Var9.m22139q(true);
                                                                tj3Var9.m22139q(true);
                                                                e16 e16VarM10007D2 = d32.m10007D(c99.m4412e(b16Var3, 1.0f), j15, mv3Var);
                                                                ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, z4);
                                                                int iHashCode5 = Long.hashCode(tj3Var9.f62385T);
                                                                l77 l77VarM22132m5 = tj3Var9.m22132m();
                                                                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var9, e16VarM10007D2);
                                                                tj3Var9.m22119f0();
                                                                if (tj3Var9.f62384S) {
                                                                    ui3Var6 = ui3Var8;
                                                                    tj3Var9.m22130l(ui3Var6);
                                                                } else {
                                                                    ui3Var6 = ui3Var8;
                                                                    tj3Var9.m22137o0();
                                                                }
                                                                oha.m18001g(tj3Var9, zi3Var4, ht5VarM19966d2);
                                                                oha.m18001g(tj3Var9, zi3Var9, l77VarM22132m5);
                                                                AbstractC3393o1.m17747v(iHashCode5, tj3Var9, zi3Var8, tj3Var9, vi3Var6);
                                                                oha.m18001g(tj3Var9, zi3Var7, e16VarM1322c5);
                                                                String str7 = (String) u91.m22592J0(1, nz9Var5.f53460f.f70706b);
                                                                aa1 aa1Var2 = str7 != null ? new aa1(d32.m10035e(Color.parseColor(str7))) : null;
                                                                if (aa1Var2 == null) {
                                                                    tj3Var9.m22111b0(480219352);
                                                                    j8 = ((ms5) tj3Var9.m22128k(ps5.f56764b)).f51799a.f55822G;
                                                                    tj3Var9.m22139q(false);
                                                                } else {
                                                                    tj3Var9.m22111b0(480213369);
                                                                    tj3Var9.m22139q(false);
                                                                    j8 = aa1Var2.f414a;
                                                                }
                                                                long j16 = j8;
                                                                boolean z10 = vk9.m23376L0((String) t66Var11.getValue()).toString().length() > 0 && !((Boolean) t66Var12.getValue()).booleanValue();
                                                                e16 e16VarMo3727a = ci0Var2.mo3727a(b16Var3, nj0.f52811f);
                                                                if (z7 != 0) {
                                                                    tj3Var9.m22111b0(2002392228);
                                                                    tj3Var9.m22139q(false);
                                                                    b16Var2 = b16Var3;
                                                                    zi3Var3 = zi3Var8;
                                                                    e16Var = e16VarMo3727a;
                                                                    ci0Var = ci0Var2;
                                                                    jv0Var7 = jv0Var8;
                                                                    vi3Var4 = vi3Var6;
                                                                    e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var2, 14.0f, 0.0f, 0.0f, 0.0f, 14);
                                                                } else {
                                                                    b16Var2 = b16Var3;
                                                                    zi3Var3 = zi3Var8;
                                                                    jv0Var7 = jv0Var8;
                                                                    ci0Var = ci0Var2;
                                                                    vi3Var4 = vi3Var6;
                                                                    e16Var = e16VarMo3727a;
                                                                    tj3Var9.m22111b0(2002681024);
                                                                    zf1 zf1Var2 = ge9.f40637a;
                                                                    e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var2, ((fe9) tj3Var9.m22128k(zf1Var2)).f38955d, 0.0f, 0.0f, ((fe9) tj3Var9.m22128k(zf1Var2)).f38955d, 6);
                                                                    tj3Var9.m22139q(false);
                                                                }
                                                                e16 e16VarMo3161g = e16Var.mo3161g(e16VarM21611X2);
                                                                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var9, 48);
                                                                int iHashCode6 = Long.hashCode(tj3Var9.f62385T);
                                                                l77 l77VarM22132m6 = tj3Var9.m22132m();
                                                                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var9, e16VarMo3161g);
                                                                tj3Var9.m22119f0();
                                                                if (tj3Var9.f62384S) {
                                                                    tj3Var9.m22130l(ui3Var6);
                                                                } else {
                                                                    tj3Var9.m22137o0();
                                                                }
                                                                oha.m18001g(tj3Var9, zi3Var4, sj8VarM20003a);
                                                                oha.m18001g(tj3Var9, zi3Var9, l77VarM22132m6);
                                                                AbstractC3393o1.m17747v(iHashCode6, tj3Var9, zi3Var3, tj3Var9, vi3Var4);
                                                                oha.m18001g(tj3Var9, zi3Var7, e16VarM1322c6);
                                                                boolean zM22124i8 = tj3Var9.m22124i(jv0Var7);
                                                                Object objM22097O17 = tj3Var9.m22097O();
                                                                if (zM22124i8 || objM22097O17 == p84Var4) {
                                                                    ChatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$1$1 chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$1$1 = new ChatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$1$1(0, jv0Var7, jv0.class, "onSettingsClicked", "onSettingsClicked()V", 0);
                                                                    tj3Var9.m22131l0(chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$1$1);
                                                                    objM22097O17 = chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$1$1;
                                                                }
                                                                b16 b16Var4 = b16Var2;
                                                                omd.m18141c((ui3) ((FunctionReference) objM22097O17), null, false, null, null, tnb.f62610c, tj3Var9, 1572864, 62);
                                                                if (z7 == 0) {
                                                                    tj3Var9.m22111b0(1133832878);
                                                                    Object objM22097O18 = tj3Var9.m22097O();
                                                                    if (objM22097O18 == p84Var4) {
                                                                        c2002f = this;
                                                                        objM22097O18 = new C3799yk(6, t66Var10);
                                                                        tj3Var9.m22131l0(objM22097O18);
                                                                    } else {
                                                                        c2002f = this;
                                                                    }
                                                                    omd.m18141c((ui3) objM22097O18, null, false, null, null, tnb.f62611d, tj3Var9, 1572870, 62);
                                                                    tz0Var5 = tz0Var6;
                                                                    boolean zM22124i9 = tj3Var9.m22124i(jv0Var7) | tj3Var9.m22124i(tz0Var5);
                                                                    Object objM22097O19 = tj3Var9.m22097O();
                                                                    if (zM22124i9 || objM22097O19 == p84Var4) {
                                                                        objM22097O19 = new C3577sk(7, jv0Var7, tz0Var5);
                                                                        tj3Var9.m22131l0(objM22097O19);
                                                                    }
                                                                    omd.m18141c((ui3) objM22097O19, null, false, null, null, tnb.f62612e, tj3Var9, 1572864, 62);
                                                                    z5 = false;
                                                                    tj3Var9.m22139q(false);
                                                                } else {
                                                                    c2002f = this;
                                                                    tz0Var5 = tz0Var6;
                                                                    z5 = false;
                                                                    tj3Var9.m22111b0(1135697218);
                                                                    tj3Var9.m22139q(false);
                                                                }
                                                                if (z7 == 0) {
                                                                    tj3Var9.m22111b0(2114856101);
                                                                    qn5 qn5Var = tz0Var5.f63121i;
                                                                    if (qn5Var == null) {
                                                                        tj3Var9.m22111b0(1136029692);
                                                                        tj3Var9.m22139q(z5);
                                                                    } else {
                                                                        tj3Var9.m22111b0(1136029693);
                                                                        boolean zM22124i10 = tj3Var9.m22124i(jv0Var7);
                                                                        Object objM22097O20 = tj3Var9.m22097O();
                                                                        if (zM22124i10 || objM22097O20 == p84Var4) {
                                                                            ChatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$1$1 chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$1$1 = new ChatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$1$1(1, jv0Var7, jv0.class, "onLynxModelSelected", "onLynxModelSelected(Lcom/lingq/core/domain/model/chat/LynxChatModel;)V", 0);
                                                                            tj3Var9.m22131l0(chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$1$1);
                                                                            objM22097O20 = chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$1$1;
                                                                        }
                                                                        vi3 vi3Var7 = (vi3) ((FunctionReference) objM22097O20);
                                                                        boolean zM22124i11 = tj3Var9.m22124i(jv0Var7);
                                                                        Object objM22097O21 = tj3Var9.m22097O();
                                                                        if (zM22124i11 || objM22097O21 == p84Var4) {
                                                                            ChatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$2$1 chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$2$1 = new ChatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$2$1(1, jv0Var7, jv0.class, "onLynxEffortSelected", "onLynxEffortSelected(Lcom/lingq/core/domain/model/chat/LynxReasoningEffort;)V", 0);
                                                                            tj3Var9.m22131l0(chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$2$1);
                                                                            objM22097O21 = chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$2$1;
                                                                        }
                                                                        vi3 vi3Var8 = (vi3) ((FunctionReference) objM22097O21);
                                                                        boolean zM22124i12 = tj3Var9.m22124i(jv0Var7);
                                                                        Object objM22097O22 = tj3Var9.m22097O();
                                                                        if (zM22124i12 || objM22097O22 == p84Var4) {
                                                                            ChatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$3$1 chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$3$1 = new ChatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$3$1(0, jv0Var7, jv0.class, "onLynxModelCleared", "onLynxModelCleared()V", 0);
                                                                            tj3Var9.m22131l0(chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$3$1);
                                                                            objM22097O22 = chatScreenKt$ChatScreen$4$4$1$1$3$1$2$1$4$3$1;
                                                                        }
                                                                        snb.m21494a(qn5Var, vi3Var7, vi3Var8, (ui3) ((FunctionReference) objM22097O22), null, tj3Var9, 0);
                                                                        tj3Var9 = tj3Var9;
                                                                        z5 = false;
                                                                        tj3Var9.m22139q(false);
                                                                    }
                                                                    tj3Var9.m22139q(z5);
                                                                } else {
                                                                    tj3Var9.m22111b0(1136633666);
                                                                    tj3Var9.m22139q(z5);
                                                                }
                                                                tj3Var9.m22139q(true);
                                                                e16 e16VarMo3727a2 = ci0Var.mo3727a(b16Var4, nj0.f52813h);
                                                                if (z7) {
                                                                    tj3Var9.m22111b0(2007347516);
                                                                    tj3Var9.m22139q(z5);
                                                                    e16VarM21611X3 = AbstractC3584sr.m21611X(b16Var4, 0.0f, 0.0f, 14.0f, 0.0f, 11);
                                                                } else {
                                                                    tj3Var9.m22111b0(2007583674);
                                                                    zf1 zf1Var3 = ge9.f40637a;
                                                                    e16VarM21611X3 = AbstractC3584sr.m21611X(b16Var4, 0.0f, 0.0f, ((fe9) tj3Var9.m22128k(zf1Var3)).f38952a, ((fe9) tj3Var9.m22128k(zf1Var3)).f38955d, 3);
                                                                    tj3Var9.m22139q(false);
                                                                }
                                                                e16 e16VarMo3161g2 = e16VarMo3727a2.mo3161g(e16VarM21611X3);
                                                                boolean z11 = tx0Var3.f63048m && !((Boolean) t66Var12.getValue()).booleanValue();
                                                                int i5 = my3.f52030a;
                                                                if (z10 != 0) {
                                                                    tj3Var9.m22111b0(2011609365);
                                                                    j9 = ((ms5) tj3Var9.m22128k(ps5.f56764b)).f51799a.f55842a;
                                                                    z6 = false;
                                                                    tj3Var9.m22139q(false);
                                                                } else {
                                                                    z6 = false;
                                                                    tj3Var9.m22111b0(2011750818);
                                                                    tj3Var9.m22139q(false);
                                                                    j9 = j16;
                                                                }
                                                                if (z10) {
                                                                    tj3Var9.m22111b0(2011958611);
                                                                    j10 = ((ms5) tj3Var9.m22128k(ps5.f56764b)).f51799a.f55844b;
                                                                    tj3Var9.m22139q(z6);
                                                                } else {
                                                                    tj3Var9.m22111b0(2012102668);
                                                                    j10 = ((ms5) tj3Var9.m22128k(ps5.f56764b)).f51799a.f55875s;
                                                                    tj3Var9.m22139q(z6);
                                                                }
                                                                ly3 ly3VarM17149b = my3.m17149b(j9, j10, tj3Var9, 12);
                                                                boolean zM22124i13 = tj3Var9.m22124i(tz0Var5);
                                                                ld9 ld9Var5 = ld9Var4;
                                                                boolean zM22120g5 = zM22124i13 | tj3Var9.m22120g(ld9Var5);
                                                                InterfaceC0300b interfaceC0300b5 = interfaceC0300b4;
                                                                boolean zM22124i14 = zM22120g5 | tj3Var9.m22124i(interfaceC0300b5) | tj3Var9.m22124i(jv0Var7) | tj3Var9.m22120g(t66Var11);
                                                                Object objM22097O23 = tj3Var9.m22097O();
                                                                if (zM22124i14 || objM22097O23 == p84Var4) {
                                                                    qx0 qx0Var = new qx0(tz0Var5, ld9Var5, interfaceC0300b5, jv0Var7, t66Var11, t66Var12);
                                                                    tj3Var9.m22131l0(qx0Var);
                                                                    objM22097O23 = qx0Var;
                                                                }
                                                                omd.m18141c((ui3) objM22097O23, e16VarMo3161g2, z11, ly3VarM17149b, null, tnb.f62613f, tj3Var9, 1572864, 48);
                                                                tj3Var9.m22139q(true);
                                                                tj3Var9.m22139q(true);
                                                            } else {
                                                                tj3Var7.m22102U();
                                                            }
                                                            return xfa.f68157a;
                                                        }
                                                    }, tj3Var5), tj3Var6, 1572864, 48);
                                                    WeakHashMap weakHashMap = l6b.f49204w;
                                                    thb.m22044c(tj3Var6, pvc.m19502J(ho5.m13397r(tj3Var6).f49209e));
                                                    tj3Var6.m22139q(true);
                                                } else {
                                                    tj3Var5.m22102U();
                                                }
                                                return xfa.f68157a;
                                            }
                                        }, tj3Var4), tj3Var4, 12582918, 122);
                                    } else {
                                        tj3Var4.m22102U();
                                    }
                                    return xfa.f68157a;
                                }
                            }, tj3Var3), null, null, 0, 0L, 0L, null, ci8.m4703P(-1931683809, new C3180kd(4, tz0Var2, jv0Var2), tj3Var3), tj3Var3, 805306800, 504);
                            boolean zBooleanValue = ((Boolean) t66Var5.getValue()).booleanValue();
                            t66 t66Var6 = t66Var2;
                            ThemeSettingsTab themeSettingsTab = (ThemeSettingsTab) t66Var6.getValue();
                            vi3 vi3Var2 = vi3Var;
                            boolean zM22120g4 = tj3Var3.m22120g(vi3Var2);
                            Object objM22097O11 = tj3Var3.m22097O();
                            if (zM22120g4 || objM22097O11 == p84Var2) {
                                objM22097O11 = new ix0(vi3Var2, t66Var5, 0);
                                tj3Var3.m22131l0(objM22097O11);
                            }
                            vi3 vi3Var3 = (vi3) objM22097O11;
                            Object objM22097O12 = tj3Var3.m22097O();
                            if (objM22097O12 == p84Var2) {
                                objM22097O12 = new C0023al(4, t66Var6);
                                tj3Var3.m22131l0(objM22097O12);
                            }
                            AbstractC1881a.m8679r(zBooleanValue, nz9Var, vi3Var3, themeSettingsTab, (vi3) objM22097O12, false, tj3Var3, 221248, 0);
                        } else {
                            tj3Var3.m22102U();
                        }
                        return xfa.f68157a;
                    }
                }, tj3Var2), tj3Var, 196614);
                tj3Var.m22139q(false);
            }
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(tz0Var, nz9Var, jv0Var, vi3Var, i, 4);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8906g(final ChatStats chatStats, final long j, final long j2, final e16 e16Var, ye1 ye1Var, final int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1338815218);
        int i2 = i | (tj3Var2.m22124i(chatStats) ? 4 : 2) | (tj3Var2.m22118f(j) ? 32 : 16) | (tj3Var2.m22118f(j2) ? 256 : 128) | (tj3Var2.m22120g(e16Var) ? 2048 : 1024);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var = tj3Var2;
            ho9.m13414a(c99.m4414g(e16Var, 40.0f), ui8.f63972a, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55872p, 0L, 0.0f, 1.0f, null, ci8.m4703P(-622216457, new zi3() { // from class: nx0
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        zf1 zf1Var = ge9.f40637a;
                        e16 e16VarM21609V = AbstractC3584sr.m21609V(b16.f7762a, ((fe9) tj3Var3.m22128k(zf1Var)).f38956e, 0.0f, 2);
                        sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var3.m22128k(zf1Var)).f38956e, true, new gm5(28)), nj0.f52789H, tj3Var3, 48);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21609V);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                        ChatStats chatStats2 = chatStats;
                        int i3 = (chatStats2.f18959d - chatStats2.f18957b) - chatStats2.f18960e;
                        AbstractC2005i.m8907h(i3 < 0 ? 0 : i3, 0, j, tj3Var3, vz1.m23620a0(tj3Var3, R$string.stats_words));
                        AbstractC2005i.m8907h(chatStats2.f18960e, 0, j2, tj3Var3, vz1.m23620a0(tj3Var3, R$string.complete_lingqs_created));
                        tj3Var3.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, 12779520, 88);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(j, j2, e16Var, i) { // from class: ox0

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f55116b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f55117c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ e16 f55118d;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC2005i.m8906g(this.f55115a, this.f55116b, this.f55117c, this.f55118d, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m8907h(int i, int i2, long j, ye1 ye1Var, String str) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(802060052);
        int i3 = i2 | (tj3Var.m22116e(i) ? 4 : 2) | (tj3Var.m22118f(j) ? 32 : 16) | (tj3Var.m22120g(str) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            zf1 zf1Var = ge9.f40637a;
            C3661uu c3661uu = new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38955d, true, new gm5(28));
            fc0 fc0Var = nj0.f52789H;
            boolean z = (i3 & 896) == 256;
            Object objM22097O = tj3Var.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new t70(str, 12);
                tj3Var.m22131l0(objM22097O);
            }
            b16 b16Var = b16.f7762a;
            e16 e16VarM17643c = nv8.m17643c(b16Var, false, (vi3) objM22097O);
            sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM17643c);
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
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            e16 e16VarM4426s = c99.m4426s(b16Var, 20.0f);
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            ho9.m13414a(c99.m4414g(e16VarM4426s, 12.0f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64859e, j, 0L, 0.0f, 0.0f, null, tnb.f62616i, tj3Var, ((i3 << 3) & 896) | 12582912, 120);
            m8908i(i, tj3Var, i3 & 14);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rx0(i, j, str, i2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8908i(int i, ye1 ye1Var, int i2) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(463006207);
        int i3 = (tj3Var2.m22116e(i) ? 4 : 2) | i2;
        if (tj3Var2.m22099R(i3 & 1, (i3 & 3) != 2)) {
            String strValueOf = String.valueOf(i);
            vh9 vh9Var = ps5.f56764b;
            tj3Var = tj3Var2;
            lw9.m16554b(strValueOf, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, bc3.f8324j, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71404h, tj3Var, 1572864, 0, 131002);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ex0(i, i2, 0);
        }
    }
}
