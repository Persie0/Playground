package com.lingq.core.premium;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0233h;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;
import androidx.lifecycle.compose.AbstractC0711a;
import com.kochava.tracker.BuildConfig;
import com.lingq.core.domain.model.offer.BannerType;
import com.lingq.core.domain.model.offer.OfferBanner;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.core.premium.delegate.UpgradeTier;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Currency;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Set;
import kotlin.Result;
import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.Ref$FloatRef;
import p000.AbstractC3184kh;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3550rv;
import p000.AbstractC3584sr;
import p000.C2919d9;
import p000.C3187kk;
import p000.C3304ln;
import p000.C3357n2;
import p000.C3386nv;
import p000.C3390nz;
import p000.C3419on;
import p000.C3445p2;
import p000.C3549ru;
import p000.C3587su;
import p000.C3661uu;
import p000.C3741x;
import p000.aa1;
import p000.ab1;
import p000.ai3;
import p000.aia;
import p000.aj3;
import p000.as4;
import p000.b16;
import p000.b34;
import p000.bb1;
import p000.bc3;
import p000.bi3;
import p000.bq1;
import p000.bx2;
import p000.bx6;
import p000.c81;
import p000.c99;
import p000.ci0;
import p000.ci3;
import p000.ci8;
import p000.cl9;
import p000.cw0;
import p000.cx2;
import p000.cx7;
import p000.d32;
import p000.db1;
import p000.di3;
import p000.drc;
import p000.dt6;
import p000.dua;
import p000.dy0;
import p000.dz9;
import p000.e07;
import p000.e16;
import p000.e7d;
import p000.ec0;
import p000.eed;
import p000.eh0;
import p000.ex0;
import p000.ezc;
import p000.fa4;
import p000.fb2;
import p000.fc0;
import p000.fe9;
import p000.g39;
import p000.g4d;
import p000.g77;
import p000.g91;
import p000.gc0;
import p000.ge9;
import p000.gl3;
import p000.gm5;
import p000.gq6;
import p000.gr3;
import p000.h39;
import p000.h7a;
import p000.he9;
import p000.hl1;
import p000.hqb;
import p000.ht5;
import p000.ii3;
import p000.io2;
import p000.iz4;
import p000.j07;
import p000.j77;
import p000.j87;
import p000.k87;
import p000.ks9;
import p000.l39;
import p000.l44;
import p000.l77;
import p000.li3;
import p000.lia;
import p000.lt6;
import p000.lw9;
import p000.m04;
import p000.mia;
import p000.mn0;
import p000.ms5;
import p000.mv3;
import p000.nia;
import p000.nj0;
import p000.nw1;
import p000.oha;
import p000.oia;
import p000.ol7;
import p000.omd;
import p000.or1;
import p000.ow8;
import p000.p04;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.pe0;
import p000.pfa;
import p000.ph5;
import p000.pk9;
import p000.pl7;
import p000.ps5;
import p000.pvc;
import p000.py0;
import p000.py4;
import p000.q9d;
import p000.qc9;
import p000.qd0;
import p000.qh0;
import p000.qj8;
import p000.ql7;
import p000.r65;
import p000.rb0;
import p000.rh3;
import p000.rk4;
import p000.rv2;
import p000.s63;
import p000.sc9;
import p000.se1;
import p000.si5;
import p000.si8;
import p000.sj8;
import p000.ss5;
import p000.t17;
import p000.t66;
import p000.te0;
import p000.te1;
import p000.tha;
import p000.thb;
import p000.tia;
import p000.tj3;
import p000.ty3;
import p000.u0c;
import p000.u29;
import p000.u91;
import p000.ud6;
import p000.ui3;
import p000.ui8;
import p000.un7;
import p000.up6;
import p000.ux5;
import p000.v4a;
import p000.v8d;
import p000.v91;
import p000.vd5;
import p000.vf0;
import p000.vh9;
import p000.vi3;
import p000.via;
import p000.vj8;
import p000.vk8;
import p000.vk9;
import p000.vx9;
import p000.vz1;
import p000.wba;
import p000.we1;
import p000.wfb;
import p000.wia;
import p000.wq1;
import p000.ws6;
import p000.x17;
import p000.x18;
import p000.xfa;
import p000.xh3;
import p000.xwc;
import p000.y27;
import p000.y35;
import p000.y38;
import p000.ye1;
import p000.yh3;
import p000.zf1;
import p000.zg0;
import p000.zh3;
import p000.zi3;
import p000.zy7;

/* JADX INFO: renamed from: com.lingq.core.premium.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1839a {
    /* JADX INFO: renamed from: A */
    public static final void m8515A(ud6 ud6Var, C1853l c1853l, ui3 ui3Var, ye1 ye1Var, int i) {
        ud6Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-657523382);
        int i2 = (tj3Var.m22124i(ud6Var) ? 4 : 2) | i | 16 | (tj3Var.m22124i(ui3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c1853l = (C1853l) pfa.m19114d(y38.m24933a(C1853l.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            } else {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-113);
            tj3Var.m22140r();
            Activity activity = (Activity) tj3Var.m22128k(ph5.f56222a);
            t66 t66VarM2513c = AbstractC0711a.m2513c(c1853l.f22545i, tj3Var);
            wia wiaVar = (wia) t66VarM2513c.getValue();
            boolean zM22120g = tj3Var.m22120g(t66VarM2513c) | ((i3 & 896) == 256) | tj3Var.m22124i(ud6Var);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = new u29(ui3Var, ud6Var, t66VarM2513c, 3);
                tj3Var.m22131l0(objM22097O);
            }
            m8516B(wiaVar, (ui3) objM22097O, new via(c1853l, t66VarM2513c, activity, ui3Var), tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        C1853l c1853l2 = c1853l;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new g39((Object) ud6Var, (Object) c1853l2, ui3Var, i, 13);
        }
    }

    /* JADX INFO: renamed from: B */
    public static final void m8516B(wia wiaVar, ui3 ui3Var, via viaVar, ye1 ye1Var, int i) {
        x18 x18VarM22143u;
        nia niaVar;
        wiaVar.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-881708742);
        int i2 = 2;
        int i3 = i | (tj3Var.m22124i(wiaVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 32 : 16;
        }
        int i4 = i3 | (tj3Var.m22120g(viaVar) ? 256 : 128);
        if (tj3Var.m22099R(i4 & 1, (i4 & 147) != 146)) {
            q9d.m19834f(wiaVar.f66883h, tj3Var, 0);
            boolean z = wiaVar.f66891p;
            String strM23620a0 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.upgrade_purchase_successful);
            String strM23620a1 = vz1.m23620a0(tj3Var, R$string.upgrade_thank_you);
            int i5 = i4 & 896;
            boolean z2 = i5 == 256;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z2 || objM22097O == p84Var) {
                objM22097O = new mia(viaVar, 0);
                tj3Var.m22131l0(objM22097O);
            }
            q9d.m19833e(0, tj3Var, (ui3) objM22097O, strM23620a0, strM23620a1, z);
            boolean z3 = wiaVar.f66892q;
            String strM23620a2 = vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_error);
            String strM23620a3 = vz1.m23620a0(tj3Var, R$string.upgrade_purchase_server_problem);
            boolean z4 = i5 == 256;
            Object objM22097O2 = tj3Var.m22097O();
            if (z4 || objM22097O2 == p84Var) {
                objM22097O2 = new mia(viaVar, 1);
                tj3Var.m22131l0(objM22097O2);
            }
            q9d.m19833e(0, tj3Var, (ui3) objM22097O2, strM23620a2, strM23620a3, z3);
            if (wiaVar.f66895t) {
                tj3Var.m22111b0(1035605165);
                m8536n(wiaVar, ui3Var, viaVar, tj3Var, i4 & 1022);
                tj3Var.m22139q(false);
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u == null) {
                    return;
                } else {
                    niaVar = new nia(wiaVar, ui3Var, viaVar, i, 0);
                }
            } else {
                tj3Var.m22111b0(1035754120);
                tj3Var.m22139q(false);
                Object objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = AbstractC0278f.m1257g(0);
                    tj3Var.m22131l0(objM22097O3);
                }
                sc9 sc9Var = (sc9) objM22097O3;
                x17 x17Var = h7a.f41916a;
                rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var), tj3Var);
                List listM8522H = m8522H(wiaVar, wiaVar.f66885j, wiaVar.f66886k, false, tj3Var);
                b34.m3232b(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), ci8.m4703P(1979878398, new vd5(rv2VarM13115b, ui3Var, i2), tj3Var), ci8.m4703P(-2133355649, new h39(viaVar, listM8522H, sc9Var, wiaVar, 6), tj3Var), null, null, 0, 0L, 0L, null, ci8.m4703P(1428489033, new C3357n2(wiaVar, listM8522H, viaVar, sc9Var, 17, false), tj3Var), tj3Var, 805306800, 504);
                tj3Var = tj3Var;
            }
            x18VarM22143u.f67642d = niaVar;
        }
        tj3Var.m22102U();
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            niaVar = new nia(wiaVar, ui3Var, viaVar, i, 1);
            x18VarM22143u.f67642d = niaVar;
        }
    }

    /* JADX INFO: renamed from: C */
    public static final void m8517C(String str, String str2, ye1 ye1Var, int i) {
        str2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1183869582);
        int i2 = (tj3Var.m22120g(str2) ? 256 : 128) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            e16 e16VarM4426s = c99.m4426s(b16.f7762a, 250.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4426s, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 0.0f, 0.0f, 14);
            vh9 vh9Var = ps5.f56764b;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(e16VarM21611X, ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d), ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55821F, ss5.f61356d), ((fe9) tj3Var.m22128k(zf1Var)).f38957f);
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
            m8538p(str, str2, tj3Var, i2 & 1022);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new r65(str, i, 4, str2);
        }
    }

    /* JADX INFO: renamed from: D */
    public static final void m8518D(ye1 ye1Var, int i) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1596366623);
        if (tj3Var2.m22099R(i & 1, i != 0)) {
            b16 b16Var = b16.f7762a;
            lw9.m16554b(vz1.m23620a0(tj3Var2, R$string.upgrade_customer_reviews), AbstractC3584sr.m21609V(AbstractC3423or.m18285y(c99.m4412e(b16Var, 1.0f), IntrinsicSize.Max), 0.0f, ((fe9) tj3Var2.m22128k(ge9.f40637a)).f38957f, 1), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51800b.f71399c, 0L, 0L, bc3.f8322h, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var2, 0, 0, 130044);
            e16 e16VarM15211e = AbstractC3184kh.m15211e(c99.m4430w(b16Var, null, 3), Orientation.Horizontal);
            Object objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = new ow8(18);
                tj3Var2.m22131l0(objM22097O);
            }
            fa4.m11643d(e16VarM15211e, null, null, null, null, null, false, null, (vi3) objM22097O, tj3Var2, 805306374, 510);
            tj3Var = tj3Var2;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cx7(i, 19);
        }
    }

    /* JADX INFO: renamed from: E */
    public static final void m8519E(boolean z, ye1 ye1Var, int i) {
        long jM198b;
        long jM198b2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-437614111);
        int i2 = i | (tj3Var.m22122h(z) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM10007D = d32.m10007D(AbstractC3584sr.m21609V(c99.m4429v(c99.m4412e(b16Var, 1.0f)), ge9.m12515a(tj3Var).f38960i, 0.0f, 2), p58.m18900f(tj3Var).f55821F, p58.m18901i(tj3Var).f64858d);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
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
            e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(ci0.f10109a.m4674b(b16Var), ge9.m12515a(tj3Var).f38957f, 0.0f, 2), 0.0f, ge9.m12515a(tj3Var).f38956e, 1);
            C3587su c3587su = eh0.f37238d;
            ec0 ec0Var = nj0.f52791J;
            bb1 bb1VarM230a = ab1.m230a(c3587su, ec0Var, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            e16 e16VarM4410c = c99.m4410c(b16Var, 1.0f);
            C3549ru c3549ru = eh0.f37236b;
            sj8 sj8VarM20003a = qj8.m20003a(c3549ru, nj0.f52817l, tj3Var, 0);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM4410c);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            vj8 vj8Var = vj8.f65508a;
            thb.m22044c(tj3Var, vj8Var.mo12420a(0.4f, b16Var, true));
            thb.m22044c(tj3Var, vj8Var.mo12420a(0.2f, b16Var, true));
            if (z) {
                tj3Var.m22111b0(553792008);
                tj3Var.m22139q(false);
                jM198b = aa1.f411j;
            } else {
                tj3Var.m22111b0(553695877);
                jM198b = aa1.m198b(0.2f, p58.m18900f(tj3Var).f55842a);
                tj3Var.m22139q(false);
            }
            e16 e16VarM19045o = pb1.m19045o(c99.m4410c(vj8Var.mo12420a(0.2f, b16Var, true), 1.0f), p58.m18901i(tj3Var).f64858d);
            mv3 mv3Var = ss5.f61356d;
            thb.m22044c(tj3Var, d32.m10007D(e16VarM19045o, jM198b, mv3Var));
            if (z) {
                tj3Var.m22111b0(554154181);
                jM198b2 = aa1.m198b(0.2f, p58.m18900f(tj3Var).f55842a);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(554250312);
                tj3Var.m22139q(false);
                jM198b2 = aa1.f411j;
            }
            thb.m22044c(tj3Var, d32.m10007D(pb1.m19045o(c99.m4410c(vj8Var.mo12420a(0.2f, b16Var, true), 1.0f), p58.m18901i(tj3Var).f64858d), jM198b2, mv3Var));
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21607T(c99.m4429v(c99.m4412e(b16Var, 1.0f)), ge9.m12515a(tj3Var).f38957f), 0.0f, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 13);
            bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(ge9.m12515a(tj3Var).f38952a, true, new gm5(28)), ec0Var, tj3Var, 0);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m4);
            AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c4);
            e16 e16VarM21611X2 = AbstractC3584sr.m21611X(c99.m4412e(b16Var, 1.0f), 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38952a, 7);
            sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, nj0.f52789H, tj3Var, 48);
            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m5 = tj3Var.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c5);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.upgrade_what_you_get), vj8Var.mo12420a(0.4f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, 0, 0, 131068);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.upgrade_free), vj8Var.mo12420a(0.2f, b16Var, true), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71410n, tj3Var, 0, 0, 130044);
            g4d.m12360a(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.upgrade_premium), vj8Var.mo12420a(0.2f, b16Var, true), 0L, new ks9(3), 0L, 0, false, 0, p58.m18902j(tj3Var).f71410n, null, tj3Var, 0, 756);
            g4d.m12360a(vz1.m23620a0(tj3Var, R$string.upgrade_plus), vj8Var.mo12420a(0.2f, b16Var, true), 0L, new ks9(3), 0L, 0, false, 0, p58.m18902j(tj3Var).f71410n, null, tj3Var, 0, 756);
            tj3Var.m22139q(true);
            pb1.m19031a(1.0f, 54, 0, aa1.m198b(0.8f, p58.m18900f(tj3Var).f55842a), tj3Var, c99.m4412e(b16Var, 1.0f));
            tj3Var = tj3Var;
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38952a));
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_thousands_of_lessons), true, true, null, null, null, tj3Var, 3504, 112);
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_flashcard_quizzes), true, true, null, null, null, tj3Var, 3504, 112);
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_save_words_phrases), true, true, BuildConfig.SDK_PROTOCOL, null, null, tj3Var, 28080, 96);
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_create_lessons_imported), true, true, "5", null, null, tj3Var, 28080, 96);
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_audio_playlists), true, true, "1", null, null, tj3Var, 28080, 96);
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_statistics_tracking), false, true, null, null, null, tj3Var, 3504, 112);
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_language_challenges), false, true, null, null, null, tj3Var, 3504, 112);
            m8543u(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.upgrade_offline_access), false, true, null, null, null, tj3Var, 3504, 112);
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_standard_ai_chatbot), false, true, null, null, null, tj3Var, 3504, 112);
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_advanced_ai_chatbot), false, false, null, null, null, tj3Var, 3504, 112);
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_transcribe_audio), false, true, null, "600", "3600", tj3Var, 1772976, 16);
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_ai_enhanced_text_to_speech), false, false, null, null, null, tj3Var, 3504, 112);
            m8543u(vz1.m23620a0(tj3Var, R$string.upgrade_simplify_lessons_with_ai), false, false, null, null, null, tj3Var, 3504, 112);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new c81(i, 17, z);
        }
    }

    /* JADX INFO: renamed from: F */
    public static final C3419on m8520F(String str, ye1 ye1Var) {
        String strM23371G0 = vk9.m23371G0(vk9.m23368D0(str, "**", str), "**");
        int iM23389l0 = vk9.m23389l0(str, strM23371G0, 0, false, 6) - 2;
        int length = strM23371G0.length() + iM23389l0;
        String strM23368D0 = vk9.m23368D0(str, "**", str);
        String strM23368D1 = vk9.m23368D0(strM23368D0, "**", strM23368D0);
        String strM23371G1 = vk9.m23371G0(vk9.m23368D0(strM23368D1, "**", strM23368D1), "**");
        int iM23389l1 = vk9.m23389l0(str, strM23371G1, 0, false, 6) - 6;
        int length2 = strM23371G1.length() + iM23389l1;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22111b0(1642876480);
        StringBuilder sb = new StringBuilder(16);
        new ArrayList();
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        sb.append(cl9.m4839V(str, "**", ""));
        vh9 vh9Var = ps5.f56764b;
        he9 he9Var = ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k.f66065a;
        bc3 bc3Var = bc3.f8322h;
        arrayList.add(new C3304ln(he9.m13209a(he9Var, bc3Var, 65531), iM23389l0, length, 8));
        arrayList.add(new C3304ln(he9.m13209a(((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k.f66065a, bc3Var, 65531), iM23389l1, length2, 8));
        String string = sb.toString();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(((C3304ln) arrayList.get(i)).m16392a(sb.length()));
        }
        C3419on c3419on = new C3419on(string, arrayList2);
        tj3Var.m22139q(false);
        return c3419on;
    }

    /* JADX INFO: renamed from: G */
    public static final aa1 m8521G(String str) {
        Object failure;
        if (vk9.m23391n0(str)) {
            return null;
        }
        try {
            failure = new aa1(d32.m10035e(Color.parseColor(str)));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (aa1) (failure instanceof Result.Failure ? null : failure);
    }

    /* JADX WARN: Code duplicated, block: B:206:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:30:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:35:0x010f  */
    /* JADX WARN: Code duplicated, block: B:57:0x015e  */
    /* JADX INFO: renamed from: H */
    public static final List m8522H(wia wiaVar, String str, String str2, boolean z, ye1 ye1Var) {
        String str3;
        Object next;
        pl7 pl7Var;
        Iterator it;
        Object next2;
        double d;
        s63 s63Var;
        ArrayList arrayList;
        Object next3;
        String str4;
        List listM23605K;
        pl7 pl7Var2;
        double d2;
        ol7 ol7Var;
        String str5;
        String str6;
        long j;
        tj3 tj3Var;
        String str7;
        ArrayList arrayList2;
        aia aiaVar;
        String strM23620a0;
        String str8;
        s63 s63Var2;
        ArrayList arrayList3;
        Object next4;
        Object next5;
        Object next6;
        boolean zEquals;
        wia wiaVar2 = wiaVar;
        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.getDefault());
        currencyInstance.getClass();
        int i = 2;
        currencyInstance.setMaximumFractionDigits(2);
        List list = wiaVar2.f66878c;
        String str9 = wiaVar2.f66882g;
        String str10 = "%s/%s";
        if (list.isEmpty()) {
            tj3 tj3Var2 = (tj3) ye1Var;
            tj3Var2.m22111b0(-1495031025);
            str3 = str2;
            str4 = str;
            listM23605K = vz1.m23605K(new aia(str2, 3616, vz1.m23620a0(tj3Var2, R$string.upgrade_twelve_months), "$124,99", String.format(Locale.getDefault(), "%s/%s", Arrays.copyOf(new Object[]{"$10,42", vz1.m23620a0(tj3Var2, R$string.upgrade_subscribe_substring_month)}, 2)), "25% Off Now"), new aia(str, 4008, vz1.m23620a0(tj3Var2, R$string.upgrade_one_month), "$13,99", String.format(Locale.getDefault(), "%s/%s", Arrays.copyOf(new Object[]{"$13,99", vz1.m23620a0(tj3Var2, R$string.upgrade_subscribe_substring_month)}, 2)), ""));
            tj3Var2.m22139q(false);
        } else {
            String str11 = str;
            str3 = str2;
            tj3 tj3Var3 = (tj3) ye1Var;
            tj3Var3.m22111b0(-1494870879);
            List list2 = list;
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!fa4.m11650l(((ql7) next).f57906c, str11));
            ql7 ql7Var = (ql7) next;
            if (ql7Var == null) {
                d = 0.0d;
            } else {
                ArrayList arrayList4 = ql7Var.f57911h;
                if (arrayList4 != null) {
                    Iterator it3 = arrayList4.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (!((pl7) next3).f56417e.contains(str9));
                    pl7Var = (pl7) next3;
                    if (pl7Var == null) {
                        if (arrayList4 != null) {
                            it = arrayList4.iterator();
                            do {
                                if (it.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it.next();
                            } while (!((pl7) next2).f56417e.isEmpty());
                            pl7Var = (pl7) next2;
                        } else {
                            pl7Var = null;
                        }
                    }
                } else if (arrayList4 != null) {
                    it = arrayList4.iterator();
                    do {
                        if (it.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it.next();
                    } while (!((pl7) next2).f56417e.isEmpty());
                    pl7Var = (pl7) next2;
                } else {
                    pl7Var = null;
                }
                ol7 ol7Var2 = (pl7Var == null || (s63Var = pl7Var.f56416d) == null || (arrayList = s63Var.f60402a) == null) ? null : (ol7) u91.m22591I0(arrayList);
                d = (ol7Var2 != null ? ol7Var2.f54545b : 0L) / 1000000.0f;
            }
            ArrayList<ql7> arrayList5 = new ArrayList();
            for (Object obj : list2) {
                UpgradeTier upgradeTier = wiaVar2.f66881f;
                String str12 = ((ql7) obj).f57906c;
                str12.getClass();
                if (!z) {
                    int i2 = AbstractC1852k.f22537c[upgradeTier.ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        zEquals = str12.equals(str3);
                    } else {
                        if (i2 != 3) {
                            if (i2 == 4 || i2 == 5) {
                                zEquals = str12.equals(str11);
                            }
                        } else if (!str12.equals(str11) && !str12.equals(str3)) {
                            zEquals = false;
                        }
                        zEquals = true;
                    }
                } else if (str12.equals(str11) || str12.equals(str3)) {
                    zEquals = true;
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    arrayList5.add(obj);
                }
            }
            long j2 = 0;
            ArrayList arrayList6 = new ArrayList();
            for (ql7 ql7Var2 : arrayList5) {
                ArrayList arrayList7 = ql7Var2.f57911h;
                if (arrayList7 != null) {
                    Iterator it4 = arrayList7.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next6 = null;
                            break;
                        }
                        next6 = it4.next();
                    } while (!((pl7) next6).f56417e.contains(str9));
                    pl7Var2 = (pl7) next6;
                } else {
                    pl7Var2 = null;
                }
                ArrayList arrayList8 = arrayList6;
                boolean z2 = pl7Var2 != null;
                if (pl7Var2 == null) {
                    ArrayList arrayList9 = ql7Var2.f57911h;
                    if (arrayList9 != null) {
                        Iterator it5 = arrayList9.iterator();
                        do {
                            if (!it5.hasNext()) {
                                next5 = null;
                                break;
                            }
                            next5 = it5.next();
                        } while (!((pl7) next5).f56417e.isEmpty());
                        pl7Var2 = (pl7) next5;
                    } else {
                        pl7Var2 = null;
                    }
                }
                if (pl7Var2 == null || (s63Var2 = pl7Var2.f56416d) == null || (arrayList3 = s63Var2.f60402a) == null) {
                    d2 = d;
                    ol7Var = null;
                } else {
                    Iterator it6 = arrayList3.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            d2 = d;
                            next4 = null;
                            break;
                        }
                        next4 = it6.next();
                        ol7 ol7Var3 = (ol7) next4;
                        d2 = d;
                        if (ol7Var3.f54545b != j2 && !fa4.m11650l(ol7Var3.f54547d, "P1W")) {
                            break;
                        }
                        d = d2;
                    }
                    ol7Var = (ol7) next4;
                }
                if (ol7Var != null) {
                    try {
                        str5 = ol7Var.f54546c;
                    } catch (NullPointerException unused) {
                        currencyInstance.setCurrency(Currency.getInstance(Locale.US));
                    }
                } else {
                    str5 = null;
                }
                currencyInstance.setCurrency(Currency.getInstance(str5));
                String str13 = ql7Var2.f57906c;
                if (fa4.m11650l(str13, str11)) {
                    tj3Var3.m22111b0(1828836162);
                    double d3 = (ol7Var != null ? ol7Var.f54545b : j2) / 1000000.0f;
                    aiaVar = new aia(str11, 4072, vz1.m23620a0(tj3Var3, R$string.upgrade_one_month), String.format(Locale.getDefault(), str10, Arrays.copyOf(new Object[]{currencyInstance.format(d3), vz1.m23620a0(tj3Var3, R$string.upgrade_subscribe_substring_month)}, i)), String.format(Locale.getDefault(), vz1.m23620a0(tj3Var3, R$string.upgrade_price_month_abbr), Arrays.copyOf(new Object[]{currencyInstance.format(d3)}, 1)), null);
                    tj3Var3.m22139q(false);
                    str6 = str9;
                    j = j2;
                    tj3Var = tj3Var3;
                    str7 = str10;
                    arrayList2 = arrayList8;
                } else {
                    String str14 = str10;
                    boolean z3 = z2;
                    long j3 = j2;
                    if (fa4.m11650l(str13, str3)) {
                        tj3Var3.m22111b0(1828839164);
                        double d4 = ((ol7Var != null ? ol7Var.f54545b : 0.0f) / 12.0f) / 1000000.0f;
                        double dRint = d2 > 0.0d ? d4 / d2 : 1.0d;
                        up6 up6Var = wiaVar2.f66894s;
                        String strM22854b = up6Var != null ? up6Var.m22854b() : "";
                        double d5 = 100.0d;
                        if (fa4.m11650l(str9, strM22854b) && strM22854b.length() > 0) {
                            d5 = 5.0d;
                            dRint = Math.rint((dRint * 100.0d) / 5.0d);
                        }
                        int i3 = 100 - ((int) (dRint * d5));
                        if (wiaVar2.f66884i == UpgradeUserType.FreeTrial) {
                            tj3Var3.m22111b0(1614204101);
                            strM23620a0 = String.format(Locale.getDefault(), vz1.m23620a0(tj3Var3, R$string.upgrade_trial_offer), Arrays.copyOf(new Object[]{currencyInstance.format(j3)}, 1));
                            tj3Var3.m22139q(false);
                        } else if (vk9.m23391n0(str9)) {
                            tj3Var3.m22111b0(1614209545);
                            strM23620a0 = vz1.m23620a0(tj3Var3, R$string.upgrade_save_amount1);
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(1614211538);
                            strM23620a0 = vz1.m23620a0(tj3Var3, R$string.upgrade_special_offer_off_now);
                            tj3Var3.m22139q(false);
                        }
                        String strM23620a1 = vz1.m23620a0(tj3Var3, R$string.upgrade_twelve_months);
                        String str15 = str9;
                        String str16 = currencyInstance.format(d4 * 12.0d);
                        str16.getClass();
                        String str17 = currencyInstance.format(d2 * 12.0d);
                        str17.getClass();
                        String str18 = String.format(Locale.getDefault(), vz1.m23620a0(tj3Var3, R$string.upgrade_price_month_abbr), Arrays.copyOf(new Object[]{currencyInstance.format(d4)}, 1));
                        double d6 = d2;
                        String str19 = String.format(Locale.getDefault(), vz1.m23620a0(tj3Var3, R$string.upgrade_price_month_abbr), Arrays.copyOf(new Object[]{currencyInstance.format(d6)}, 1));
                        String str20 = String.format(Locale.getDefault(), strM23620a0, Arrays.copyOf(new Object[]{AbstractC3393o1.m17732g(i3, "%")}, 1));
                        if (str15.length() > 0) {
                            str8 = str15;
                            boolean z4 = str8.equals(strM22854b) || str8.equals("special-welcome");
                            boolean zEquals2 = str8.equals("special-welcome");
                            vk8 vk8Var = wiaVar2.f66880e;
                            str6 = str8;
                            tj3Var = tj3Var3;
                            j = 0;
                            arrayList2 = arrayList8;
                            d2 = d6;
                            str7 = str14;
                            aiaVar = new aia(str2, strM23620a1, str16, str17, str18, str19, str20, true, z3, z4, zEquals2, vk8Var);
                            str3 = str2;
                            tj3Var.m22139q(false);
                        } else {
                            str8 = str15;
                        }
                        boolean zEquals3 = str8.equals("special-welcome");
                        vk8 vk8Var2 = wiaVar2.f66880e;
                        str6 = str8;
                        tj3Var = tj3Var3;
                        j = 0;
                        arrayList2 = arrayList8;
                        d2 = d6;
                        str7 = str14;
                        aiaVar = new aia(str2, strM23620a1, str16, str17, str18, str19, str20, true, z3, z4, zEquals3, vk8Var2);
                        str3 = str2;
                        tj3Var.m22139q(false);
                    } else {
                        str6 = str9;
                        j = j3;
                        tj3Var = tj3Var3;
                        str7 = str14;
                        arrayList2 = arrayList8;
                        tj3Var.m22111b0(859692631);
                        tj3Var.m22139q(false);
                        aiaVar = null;
                    }
                }
                if (aiaVar != null) {
                    arrayList2.add(aiaVar);
                }
                str11 = str;
                tj3Var3 = tj3Var;
                arrayList6 = arrayList2;
                currencyInstance = currencyInstance;
                str9 = str6;
                d = d2;
                j2 = j;
                str10 = str7;
                i = 2;
                wiaVar2 = wiaVar;
            }
            tj3Var3.m22139q(false);
            str4 = str;
            listM23605K = arrayList6;
        }
        return u91.m22614f1(listM23605K, new lt6(vz1.m23605K(str3, str4), 2));
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:31:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x006f  */
    /* JADX WARN: Code duplicated, block: B:36:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x015c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0166  */
    /* JADX WARN: Code duplicated, block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m8523a(int i, String str, vi3 vi3Var, ye1 ye1Var, int i2, int i3) {
        vi3 vi3Var2;
        boolean z;
        vi3 vi3Var3;
        x18 x18VarM22143u;
        p84 p84Var;
        vi3 vi3Var4;
        boolean z2;
        Object objM22097O;
        ui3 ui3Var;
        Object objM22097O2;
        str.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1419084476);
        int i4 = 4;
        int i5 = (tj3Var.m22116e(i) ? 4 : 2) | i2 | (tj3Var.m22120g(str) ? 32 : 16);
        int i6 = i3 & 4;
        if (i6 == 0) {
            if ((i2 & 384) == 0) {
                vi3Var2 = vi3Var;
                i5 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
            }
            if ((i5 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i5 & 1, z)) {
                p84Var = we1.f66679a;
                if (i6 != 0) {
                    objM22097O2 = tj3Var.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = new ow8(17);
                        tj3Var.m22131l0(objM22097O2);
                    }
                    vi3Var4 = (vi3) objM22097O2;
                } else {
                    vi3Var4 = vi3Var2;
                }
                b16 b16Var = b16.f7762a;
                e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                z2 = (i5 & 896) == 256;
                objM22097O = tj3Var.m22097O();
                if (z2 || objM22097O == p84Var) {
                    objM22097O = new v4a(vi3Var4, i4);
                    tj3Var.m22131l0(objM22097O);
                }
                e16 e16VarM24741N = xwc.m24741N(e16VarM4412e, (vi3) objM22097O);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM24741N);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
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
                zf1 zf1Var = ge9.f40637a;
                ((fe9) tj3Var.m22128k(zf1Var)).getClass();
                bq1.m4042R(y27VarM18236U, null, c99.m4422o(b16Var, 32.0f), null, null, 0.0f, null, tj3Var, 56, 120);
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38952a));
                lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, (i5 >> 3) & 14, 0, 131070);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
                vi3Var3 = vi3Var4;
            } else {
                tj3Var.m22102U();
                vi3Var3 = vi3Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new rk4(i, str, vi3Var3, i2, i3);
            }
        }
        i5 |= 384;
        vi3Var2 = vi3Var;
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i5 & 1, z)) {
            p84Var = we1.f66679a;
            if (i6 != 0) {
                objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new ow8(17);
                    tj3Var.m22131l0(objM22097O2);
                }
                vi3Var4 = (vi3) objM22097O2;
            } else {
                vi3Var4 = vi3Var2;
            }
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM4412e2 = c99.m4412e(b16Var2, 1.0f);
            if ((i5 & 896) == 256) {
            }
            objM22097O = tj3Var.m22097O();
            if (z2) {
                objM22097O = new v4a(vi3Var4, i4);
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = new v4a(vi3Var4, i4);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM24741N2 = xwc.m24741N(e16VarM4412e2, (vi3) objM22097O);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM24741N2);
            se1.f60731q.getClass();
            ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a2);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m2);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode2));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c2);
            y27 y27VarM18236U2 = AbstractC3423or.m18236U(i, tj3Var, i5 & 14);
            zf1 zf1Var2 = ge9.f40637a;
            ((fe9) tj3Var.m22128k(zf1Var2)).getClass();
            bq1.m4042R(y27VarM18236U2, null, c99.m4422o(b16Var2, 32.0f), null, null, 0.0f, null, tj3Var, 56, 120);
            thb.m22044c(tj3Var, c99.m4426s(b16Var2, ((fe9) tj3Var.m22128k(zf1Var2)).f38952a));
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, (i5 >> 3) & 14, 0, 131070);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            vi3Var3 = vi3Var4;
        } else {
            tj3Var.m22102U();
            vi3Var3 = vi3Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rk4(i, str, vi3Var3, i2, i3);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8524b(String str, ye1 ye1Var, int i) {
        Object obj;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(116596891);
        int i2 = i | (tj3Var.m22120g(str) ? 4 : 2);
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(new gq6((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L)));
                tj3Var.m22131l0(objM22097O);
            }
            final t66 t66Var = (t66) objM22097O;
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(new gq6((4294967295L & ((long) Float.floatToRawIntBits(0.0f))) | (((long) Float.floatToRawIntBits(0.0f)) << 32)));
                tj3Var.m22131l0(objM22097O2);
            }
            final t66 t66Var2 = (t66) objM22097O2;
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            IntrinsicSize intrinsicSize = IntrinsicSize.Min;
            e16 e16VarM18285y = AbstractC3423or.m18285y(e16VarM4412e, intrinsicSize);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM18285y, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 2);
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
            final long j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55816A;
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            e16 e16VarM21609V2 = AbstractC3584sr.m21609V(ci0.f10109a.m4674b(b16Var), 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 1);
            final float f = 16.0f;
            boolean zM22118f = tj3Var.m22118f(j) | tj3Var.m22114d(16.0f);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22118f || objM22097O3 == p84Var) {
                obj = new vi3() { // from class: sia
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj2;
                        interfaceC0310a.getClass();
                        float f2 = f;
                        float fMo912g0 = interfaceC0310a.mo912g0(f2);
                        interfaceC0310a.mo604w(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (((gq6) t66Var.getValue()).f41189a & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fMo912g0) << 32), (((long) Float.floatToRawIntBits(interfaceC0310a.mo912g0(f2))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (((gq6) t66Var2.getValue()).f41189a & 4294967295L)))) & 4294967295L), interfaceC0310a.mo912g0(2.0f), (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(obj);
            } else {
                obj = objM22097O3;
            }
            eh0.m11124d(e16VarM21609V2, (vi3) obj, tj3Var, 0);
            e16 e16VarM18285y2 = AbstractC3423or.m18285y(c99.m4412e(b16Var, 1.0f), intrinsicSize);
            bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM18285y2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            int i3 = R$drawable.ic_upgrade_increase;
            String strM23620a0 = vz1.m23620a0(tj3Var, R$string.upgrade_increase_your_vocabulary);
            Object objM22097O4 = tj3Var.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = new dt6(29, t66Var);
                tj3Var.m22131l0(objM22097O4);
            }
            m8523a(i3, strM23620a0, (vi3) objM22097O4, tj3Var, 384, 0);
            m8523a(R$drawable.ic_upgrade_grow, vz1.m23618Z(R$string.upgrade_grow_your_comprehension, new Object[]{str}, tj3Var), null, tj3Var, 0, 4);
            int i4 = R$drawable.ic_upgrade_unlock;
            String strM23620a1 = vz1.m23620a0(tj3Var, R$string.upgrade_unlock_all_features);
            Object objM22097O5 = tj3Var.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = new tia(0, t66Var2);
                tj3Var.m22131l0(objM22097O5);
            }
            m8523a(i4, strM23620a1, (vi3) objM22097O5, tj3Var, 384, 0);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new tha(str, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8525c(ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-925138508);
        int i2 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var2) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM4412e, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 1);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
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
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37240f, nj0.f52817l, tj3Var, 6);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            boolean z = (i2 & 14) == 4;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new zy7(20, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            AbstractC0231g.m1153f(805306368, 510, null, tj3Var, (ui3) objM22097O, drc.f36144x, null, null, null, false);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38956e));
            boolean z2 = (i2 & 112) == 32;
            Object objM22097O2 = tj3Var.m22097O();
            if (z2 || objM22097O2 == p84Var) {
                objM22097O2 = new zy7(21, ui3Var2);
                tj3Var.m22131l0(objM22097O2);
            }
            AbstractC0231g.m1153f(805306368, 510, null, tj3Var, (ui3) objM22097O2, drc.f36145y, null, null, null, false);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cw0(ui3Var, ui3Var2, i, 15);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8526d(li3 li3Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        li3 li3Var2;
        g77 g77Var;
        boolean z;
        Object freeTrialRouteKt$FreeTrialPurchaseFeedback$1$1;
        vi3 vi3Var3 = vi3Var;
        vi3 vi3Var4 = vi3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1956464560);
        int i2 = (tj3Var.m22124i(li3Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var3) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var4) ? 256 : 128;
        }
        int i3 = i2;
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            g77 g77VarM22380a = u0c.m22380a(tj3Var);
            if (Build.VERSION.SDK_INT >= 33) {
                tj3Var.m22111b0(-1965048337);
                j77 j77VarMo12408n = g77VarM22380a.mo12408n();
                Boolean bool = (Boolean) t66Var.getValue();
                bool.getClass();
                boolean zM22120g = tj3Var.m22120g(g77VarM22380a) | tj3Var.m22124i(li3Var) | ((i3 & 112) == 32) | ((i3 & 896) == 256);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22120g || objM22097O2 == p84Var) {
                    g77Var = g77VarM22380a;
                    freeTrialRouteKt$FreeTrialPurchaseFeedback$1$1 = new FreeTrialRouteKt$FreeTrialPurchaseFeedback$1$1(g77Var, li3Var, vi3Var3, vi3Var4, t66Var, null);
                    li3Var2 = li3Var;
                    vi3Var3 = vi3Var3;
                    vi3Var4 = vi3Var4;
                    t66Var = t66Var;
                    tj3Var.m22131l0(freeTrialRouteKt$FreeTrialPurchaseFeedback$1$1);
                } else {
                    li3Var2 = li3Var;
                    g77Var = g77VarM22380a;
                    freeTrialRouteKt$FreeTrialPurchaseFeedback$1$1 = objM22097O2;
                }
                d32.m10049l(j77VarMo12408n, bool, (zi3) freeTrialRouteKt$FreeTrialPurchaseFeedback$1$1, tj3Var);
                tj3Var.m22139q(false);
            } else {
                li3Var2 = li3Var;
                g77Var = g77VarM22380a;
                tj3Var.m22111b0(-1964645678);
                tj3Var.m22139q(false);
            }
            boolean z2 = li3Var2.f49704g;
            int i4 = i3 & 112;
            int i5 = i3 & 896;
            boolean z3 = (i4 == 32) | (i5 == 256);
            Object objM22097O3 = tj3Var.m22097O();
            if (z3 || objM22097O3 == p84Var) {
                objM22097O3 = new zh3(vi3Var3, vi3Var4, t66Var, 0);
                tj3Var.m22131l0(objM22097O3);
            }
            ui3 ui3Var = (ui3) objM22097O3;
            boolean zM22120g2 = tj3Var.m22120g(g77Var) | (i4 == 32) | (i5 == 256);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O4 == p84Var) {
                g91 g91Var = new g91((Object) g77Var, (Object) vi3Var3, (Object) vi3Var4, t66Var, 2);
                tj3Var.m22131l0(g91Var);
                objM22097O4 = g91Var;
            }
            ui3 ui3Var2 = (ui3) objM22097O4;
            boolean z4 = (i4 == 32) | (i5 == 256);
            Object objM22097O5 = tj3Var.m22097O();
            if (z4 || objM22097O5 == p84Var) {
                z = true;
                objM22097O5 = new zh3(vi3Var3, vi3Var4, t66Var, 1);
                tj3Var.m22131l0(objM22097O5);
            } else {
                z = true;
            }
            vi3 vi3Var5 = vi3Var3;
            eed.m11083a(z2, ui3Var, ui3Var2, (ui3) objM22097O5, tj3Var, 0);
            if (li3Var2.f49705h == null) {
                z = false;
            }
            AbstractC0054a.m729d(z, null, null, null, null, ci8.m4703P(-1772185464, new ai3(vi3Var5, vi3Var2, li3Var2), tj3Var), tj3Var, 196608, 30);
        } else {
            li3Var2 = li3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yh3(li3Var2, vi3Var, vi3Var2, i, 1);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8527e(C1840b c1840b, rh3 rh3Var, ud6 ud6Var, ui3 ui3Var, ye1 ye1Var, int i) {
        ud6Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-413026548);
        int i2 = i | 2 | (tj3Var.m22120g(rh3Var) ? 32 : 16) | (tj3Var.m22124i(ud6Var) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                c1840b = (C1840b) pfa.m19114d(y38.m24933a(C1840b.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
            } else {
                tj3Var.m22102U();
            }
            int i3 = i2 & (-15);
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c1840b.f22416i, tj3Var);
            boolean zM22124i = tj3Var.m22124i(c1840b);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new C3741x(c1840b, 19);
                tj3Var.m22131l0(objM22097O);
            }
            vi3 vi3Var = (vi3) objM22097O;
            boolean zM22124i2 = ((i3 & 7168) == 2048) | tj3Var.m22124i(ud6Var) | ((i3 & 112) == 32) | tj3Var.m22120g(t66VarM2513c);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                C3445p2 c3445p2 = new C3445p2(ui3Var, ud6Var, rh3Var, t66VarM2513c, 11);
                tj3Var.m22131l0(c3445p2);
                objM22097O2 = c3445p2;
            }
            m8528f((li3) t66VarM2513c.getValue(), vi3Var, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var.m22102U();
        }
        C1840b c1840b2 = c1840b;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9((Object) c1840b2, (Object) rh3Var, (Object) ud6Var, (Object) ui3Var, i, 12);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8528f(li3 li3Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3 vi3Var3;
        x18 x18VarM22143u;
        yh3 yh3Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-553478282);
        int i2 = (tj3Var.m22124i(li3Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(vi3Var2) ? 256 : 128;
        }
        int i3 = 0;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            x17 x17Var = h7a.f41916a;
            k87 k87VarM13118e = h7a.m13118e(AbstractC0218a.m1129i(tj3Var), tj3Var);
            String strM23618Z = vz1.m23618Z(R$string.free_trial_price_info, new Object[]{li3Var.f49698a, li3Var.f49700c}, tj3Var);
            q9d.m19834f(li3Var.f49702e, tj3Var, 0);
            int i4 = i2 & 112;
            int i5 = i2 & 1022;
            m8526d(li3Var, vi3Var, vi3Var2, tj3Var, i5);
            if (li3Var.f49708k) {
                tj3Var.m22111b0(-291513354);
                if (li3Var.f49710m == FreeTrialOnboardingPage.ReminderChoice) {
                    tj3Var.m22111b0(-291443480);
                    boolean z = i4 == 32;
                    Object objM22097O = tj3Var.m22097O();
                    if (z || objM22097O == we1.f66679a) {
                        objM22097O = new nw1(vi3Var, 14);
                        tj3Var.m22131l0(objM22097O);
                    }
                    eh0.m11123c(0, 1, tj3Var, (ui3) objM22097O, false);
                    v8d.m23179d(li3Var, vi3Var, vi3Var2, tj3Var, i5);
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(false);
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u == null) {
                        return;
                    } else {
                        yh3Var = new yh3(li3Var, vi3Var, vi3Var2, i, 3);
                    }
                } else {
                    tj3Var.m22111b0(-291193620);
                    tj3Var.m22139q(false);
                    m8532j(li3Var, vi3Var, vi3Var2, tj3Var, i5);
                    tj3Var.m22139q(false);
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u == null) {
                        return;
                    } else {
                        yh3Var = new yh3(li3Var, vi3Var, vi3Var2, i, 4);
                    }
                }
            } else {
                vi3Var3 = vi3Var;
                tj3Var.m22111b0(-291030932);
                tj3Var.m22139q(false);
                boolean z2 = li3Var.f49714q.length() > 0;
                long j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55872p;
                j87 j87Var = k87VarM13118e.f46862c;
                boolean z3 = z2;
                b34.m3232b(AbstractC0319c.m1450a(b16.f7762a, j87Var, null), ci8.m4703P(884134714, new py0(1, k87VarM13118e, li3Var, vi3Var2, z3), tj3Var), ci8.m4703P(611698427, new C2919d9(li3Var, vi3Var3, vi3Var2, strM23618Z), tj3Var), null, null, 0, j, 0L, null, ci8.m4703P(1947246917, new xh3(z3, li3Var, vi3Var2, i3), tj3Var), tj3Var, 805306800, 440);
            }
            x18VarM22143u.f67642d = yh3Var;
        }
        vi3Var3 = vi3Var;
        tj3Var.m22102U();
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            yh3Var = new yh3(li3Var, vi3Var3, vi3Var2, i, 0);
            x18VarM22143u.f67642d = yh3Var;
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8529g(final bx6 bx6Var, final OnboardingBillingPeriod onboardingBillingPeriod, final String str, final boolean z, final vi3 vi3Var, final vi3 vi3Var2, final ui3 ui3Var, final vi3 vi3Var3, ye1 ye1Var, final int i) {
        tj3 tj3Var;
        ArrayList arrayList;
        Object next;
        List list = bx6Var.f9134b;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1487117241);
        int i2 = i | (tj3Var2.m22124i(bx6Var) ? 4 : 2) | (tj3Var2.m22116e(onboardingBillingPeriod.ordinal()) ? 32 : 16) | (tj3Var2.m22120g(str) ? 256 : 128) | (tj3Var2.m22122h(z) ? 2048 : 1024) | (tj3Var2.m22124i(vi3Var) ? 16384 : 8192) | (tj3Var2.m22124i(vi3Var2) ? 131072 : 65536) | (tj3Var2.m22124i(vi3Var3) ? 8388608 : 4194304);
        if (tj3Var2.m22099R(i2 & 1, (4793491 & i2) != 4793490)) {
            C0269z c0269zM1154g = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
            int i3 = AbstractC1852k.f22536b[onboardingBillingPeriod.ordinal()];
            if (i3 == 1) {
                arrayList = bx6Var.f9136d;
            } else {
                if (i3 != 2) {
                    gm5.m12750e();
                    return;
                }
                arrayList = bx6Var.f9135c;
            }
            final ArrayList arrayList2 = arrayList;
            Iterator it = arrayList2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fa4.m11650l(((aia) next).f701a, str));
            aia aiaVar = (aia) next;
            if (aiaVar == null && (aiaVar = (aia) u91.m22591I0(arrayList2)) == null && (aiaVar = (aia) u91.m22591I0(bx6Var.f9133a)) == null) {
                aiaVar = (aia) u91.m22591I0(list);
            }
            boolean zM22120g = tj3Var2.m22120g(list);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                List list2 = list;
                ArrayList arrayList3 = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((aia) it2.next()).f701a);
                }
                objM22097O = u91.m22627s1(arrayList3);
                tj3Var2.m22131l0(objM22097O);
            }
            final Set set = (Set) objM22097O;
            final aia aiaVar2 = aiaVar;
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c(ui3Var, null, c0269zM1154g, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(-292762217, new aj3() { // from class: com.lingq.core.premium.f
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Set set2;
                    p84 p84Var;
                    int i4;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((db1) obj).getClass();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 17) != 16)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM22066y = thb.m22066y(c99.m4412e(b16Var, 1.0f));
                        zf1 zf1Var = ge9.f40637a;
                        e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(e16VarM22066y, ((fe9) tj3Var3.m22128k(zf1Var)).f38960i, 0.0f, 2), 0.0f, 0.0f, 0.0f, ((fe9) tj3Var3.m22128k(zf1Var)).f38957f, 7);
                        bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var3.m22128k(zf1Var)).f38956e, true, new gm5(28)), nj0.f52791J, tj3Var3, 0);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21611X);
                        se1.f60731q.getClass();
                        ui3 ui3Var2 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var2);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        zi3 zi3Var = C0352b.f4303f;
                        oha.m18001g(tj3Var3, zi3Var, bb1VarM230a);
                        zi3 zi3Var2 = C0352b.f4302e;
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var3 = C0352b.f4304g;
                        oha.m18001g(tj3Var3, zi3Var3, numValueOf);
                        vi3 vi3Var4 = C0352b.f4305h;
                        oha.m18000f(tj3Var3, vi3Var4);
                        zi3 zi3Var4 = C0352b.f4301d;
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c);
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37242h, nj0.f52789H, tj3Var3, 54);
                        int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m2 = tj3Var3.m22132m();
                        e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e);
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var2);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, zi3Var, sj8VarM20003a);
                        oha.m18001g(tj3Var3, zi3Var2, l77VarM22132m2);
                        AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var3, tj3Var3, vi3Var4);
                        oha.m18001g(tj3Var3, zi3Var4, e16VarM1322c2);
                        lw9.m16554b(vz1.m23620a0(tj3Var3, R$string.upgrade_choose_plan), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var3.m22128k(ps5.f56764b)).f51800b.f71403g, 0L, 0L, bc3.f8324j, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var3, 0, 0, 131070);
                        omd.m18141c(ui3Var, null, false, null, null, drc.f36131k, tj3Var3, 1572864, 62);
                        tj3Var3.m22139q(true);
                        OnboardingBillingPeriod onboardingBillingPeriod2 = onboardingBillingPeriod;
                        AbstractC1839a.m8530h(onboardingBillingPeriod2, vi3Var, tj3Var3, 0);
                        tj3Var3.m22111b0(1940413698);
                        Iterator it3 = arrayList2.iterator();
                        while (true) {
                            boolean zHasNext = it3.hasNext();
                            set2 = set;
                            p84Var = we1.f66679a;
                            if (!zHasNext) {
                                break;
                            }
                            aia aiaVar3 = (aia) it3.next();
                            boolean zContains = set2.contains(aiaVar3.f701a);
                            boolean zM11650l = fa4.m11650l(aiaVar3.f701a, str);
                            vi3 vi3Var5 = vi3Var2;
                            boolean zM22120g2 = tj3Var3.m22120g(vi3Var5) | tj3Var3.m22124i(aiaVar3);
                            Object objM22097O2 = tj3Var3.m22097O();
                            if (zM22120g2 || objM22097O2 == p84Var) {
                                objM22097O2 = new lia(vi3Var5, aiaVar3, 1);
                                tj3Var3.m22131l0(objM22097O2);
                            }
                            AbstractC1839a.m8535m(aiaVar3, zContains, zM11650l, (ui3) objM22097O2, tj3Var3, 0);
                        }
                        tj3Var3.m22139q(false);
                        AbstractC1839a.m8540r(R$string.upgrade_securely_processed_cancel_anytime, tj3Var3, 0);
                        aia aiaVar4 = aiaVar2;
                        if (aiaVar4 == null) {
                            tj3Var3.m22111b0(23703909);
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(23703910);
                            boolean z2 = onboardingBillingPeriod2 == OnboardingBillingPeriod.Monthly;
                            boolean zContains2 = set2.contains(aiaVar4.f701a);
                            if (z2 || !z) {
                                i4 = zContains2 ? R$string.upgrade_unlock_plus : R$string.upgrade_unlock_premium;
                            } else {
                                i4 = R$string.upgrade_start_7_day_free_trial;
                            }
                            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                            vi3 vi3Var6 = vi3Var3;
                            boolean zM22120g3 = tj3Var3.m22120g(vi3Var6) | tj3Var3.m22124i(aiaVar4);
                            Object objM22097O3 = tj3Var3.m22097O();
                            if (zM22120g3 || objM22097O3 == p84Var) {
                                objM22097O3 = new lia(vi3Var6, aiaVar4, 2);
                                tj3Var3.m22131l0(objM22097O3);
                            }
                            ss5.m21710f(e16VarM4412e2, null, null, false, (ui3) objM22097O3, ci8.m4703P(982411255, new pe0(i4, 7), tj3Var3), tj3Var3, 196614, 14);
                            tj3Var3.m22139q(false);
                        }
                        tj3Var3.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, 6, 3072, 8186);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(onboardingBillingPeriod, str, z, vi3Var, vi3Var2, ui3Var, vi3Var3, i) { // from class: com.lingq.core.premium.g

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ OnboardingBillingPeriod f22520b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f22521c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ boolean f22522d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ vi3 f22523e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ vi3 f22524f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ ui3 f22525g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ vi3 f22526h;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1572865);
                    AbstractC1839a.m8529g(this.f22519a, this.f22520b, this.f22521c, this.f22522d, this.f22523e, this.f22524f, this.f22525g, this.f22526h, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r12v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v20 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r25v0, types: [ye1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [tj3] */
    /* JADX WARN: Type inference failed for: r4v4, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r4v6, types: [tj3] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX INFO: renamed from: h */
    public static final void m8530h(final OnboardingBillingPeriod onboardingBillingPeriod, final vi3 vi3Var, ye1 ye1Var, final int i) {
        ?? r4;
        long j;
        Object obj;
        int i2;
        OnboardingBillingPeriod onboardingBillingPeriod2 = onboardingBillingPeriod;
        mv3 mv3Var = ss5.f61356d;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1551585324);
        int i3 = 2;
        int i4 = 32;
        int i5 = (tj3Var.m22116e(onboardingBillingPeriod2.ordinal()) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        ?? r9 = 1;
        boolean z = false;
        if (tj3Var.m22099R(i5 & 1, (i5 & 19) != 18)) {
            float f = 1.0f;
            e16 e16VarM21607T = AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(c99.m4412e(b16.f7762a, 1.0f), ui8.m22753b(8.0f)), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55823H, mv3Var), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38954c);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(463256385);
            ?? r5 = tj3Var;
            for (final OnboardingBillingPeriod onboardingBillingPeriod3 : OnboardingBillingPeriod.getEntries()) {
                ?? r11 = onboardingBillingPeriod3 == onboardingBillingPeriod2 ? r9 : z;
                e16 e16VarM19045o = pb1.m19045o(new as4(f, r9), ui8.m22753b(6.0f));
                if (r11 != 0) {
                    r5.m22111b0(1685374660);
                    j = ((ms5) r5.m22128k(ps5.f56764b)).f51799a.f55868n;
                    r5.m22139q(z);
                } else {
                    r5.m22111b0(1685471287);
                    r5.m22139q(z);
                    j = aa1.f411j;
                }
                e16 e16VarM10007D = d32.m10007D(e16VarM19045o, j, mv3Var);
                int i6 = ((i5 & 112) == i4 ? r9 : z) | (r5.m22116e(onboardingBillingPeriod3.ordinal()) ? 1 : 0);
                Object objM22097O = r5.m22097O();
                if (i6 != 0 || objM22097O == we1.f66679a) {
                    obj = objM22097O;
                    ui3 ui3Var2 = new ui3() { // from class: com.lingq.core.premium.i
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            vi3Var.invoke(onboardingBillingPeriod3);
                            return xfa.f68157a;
                        }
                    };
                    r5.m22131l0(ui3Var2);
                    obj = ui3Var2;
                }
                obj = objM22097O;
                e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC0080f.m815b(null, z, (ui3) obj, e16VarM10007D, 15), 0.0f, ((fe9) r5.m22128k(ge9.f40637a)).f38952a, r9);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, z);
                int iHashCode2 = Long.hashCode(r5.f62385T);
                l77 l77VarM22132m2 = r5.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(r5, e16VarM21609V);
                se1.f60731q.getClass();
                ui3 ui3Var3 = C0352b.f4299b;
                r5.m22119f0();
                if (r5.f62384S) {
                    r5.m22130l(ui3Var3);
                } else {
                    r5.m22137o0();
                }
                oha.m18001g(r5, C0352b.f4303f, ht5VarM19966d);
                oha.m18001g(r5, C0352b.f4302e, l77VarM22132m2);
                oha.m18001g(r5, C0352b.f4304g, Integer.valueOf(iHashCode2));
                oha.m18000f(r5, C0352b.f4305h);
                oha.m18001g(r5, C0352b.f4301d, e16VarM1322c2);
                int i7 = AbstractC1852k.f22536b[onboardingBillingPeriod3.ordinal()];
                if (i7 == r9) {
                    i2 = R$string.upgrade_monthly;
                } else {
                    if (i7 != i3) {
                        gm5.m12750e();
                        return;
                    }
                    i2 = R$string.upgrade_yearly;
                }
                ?? r25 = r5;
                ?? r12 = r9;
                lw9.m16554b(vz1.m23620a0(r5, i2), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) r5.m22128k(ps5.f56764b)).f51800b.f71409m, 0L, 0L, r11 != 0 ? bc3.f8324j : bc3.f8321g, null, null, 0L, null, null, 0, 0L, null, 16777211), r25, 0, 0, 131070);
                ?? r6 = r25;
                r6.m22139q(r12);
                z = z;
                r9 = r12 == true ? 1 : 0;
                f = 1.0f;
                i3 = i3;
                mv3Var = mv3Var;
                i4 = 32;
                onboardingBillingPeriod2 = onboardingBillingPeriod;
                r5 = r6;
            }
            r5.m22139q(z);
            r5.m22139q(r9);
            r4 = r5;
        } else {
            tj3Var.m22102U();
            r4 = tj3Var;
        }
        x18 x18VarM22143u = r4.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(vi3Var, i) { // from class: com.lingq.core.premium.j

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ vi3 f22534b;

                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC1839a.m8530h(this.f22533a, this.f22534b, (ye1) obj2, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8531i(li3 li3Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3 vi3Var3;
        vi3 vi3Var4;
        b16 b16Var;
        zi3 zi3Var;
        zi3 zi3Var2;
        ui3 ui3Var;
        zi3 zi3Var3;
        int i2;
        boolean z;
        li3 li3Var2 = li3Var;
        fc0 fc0Var = nj0.f52789H;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1573527285);
        int i3 = i | (tj3Var.m22124i(li3Var2) ? 4 : 2) | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var2) ? 256 : 128);
        if (tj3Var.m22099R(i3 & 1, (i3 & 147) != 146)) {
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM4428u = c99.m4428u(c99.m4430w(c99.m4412e(AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(thb.m22066y(b16Var2), ge9.m12515a(tj3Var).f38960i, 0.0f, 2), 0.0f, ge9.m12515a(tj3Var).f38956e, 0.0f, ge9.m12515a(tj3Var).f38956e, 5), 1.0f), nj0.f52812g, 2), 0.0f, 600.0f, 1);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4428u);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var4 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var4, bb1VarM230a);
            zi3 zi3Var5 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var5, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var6 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var6, numValueOf);
            vi3 vi3Var5 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var5);
            zi3 zi3Var7 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var7, e16VarM1322c);
            if (li3Var2.f49706i) {
                tj3Var.m22111b0(1663345049);
                sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, fc0Var, tj3Var, 48);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var4, sj8VarM20003a);
                oha.m18001g(tj3Var, zi3Var5, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var6, tj3Var, vi3Var5);
                oha.m18001g(tj3Var, zi3Var7, e16VarM1322c2);
                zi3Var = zi3Var5;
                b16Var = b16Var2;
                zi3Var2 = zi3Var4;
                ty3.m22351a(ezc.m11405b(), vz1.m23620a0(tj3Var, R$string.trial_limited_time_offer), null, p58.m18900f(tj3Var).f55842a, tj3Var, 0, 4);
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38955d));
                i2 = i3;
                ui3Var = ui3Var2;
                zi3Var3 = zi3Var7;
                lw9.m16554b(vz1.m23620a0(tj3Var, R$string.trial_limited_time_offer), null, p58.m18900f(tj3Var).f55842a, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131066);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
                z = false;
                ux5.m23003z(b16Var, ge9.m12515a(tj3Var).f38956e, tj3Var, false);
            } else {
                b16Var = b16Var2;
                zi3Var = zi3Var5;
                zi3Var2 = zi3Var4;
                ui3Var = ui3Var2;
                zi3Var3 = zi3Var7;
                i2 = i3;
                z = false;
                tj3Var.m22111b0(1664061955);
                tj3Var.m22139q(false);
            }
            b16 b16Var3 = b16Var;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var3, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38956e, 7);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37240f, fc0Var, tj3Var, 54);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var2, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var6, tj3Var, vi3Var5);
            oha.m18001g(tj3Var, zi3Var3, e16VarM1322c3);
            ty3.m22351a(e7d.m10916b(), null, wq1.m24108d(tj3Var, b16Var3, 16.0f), cx2.m9917a(tj3Var).m4212e(), tj3Var, 48, 0);
            thb.m22044c(tj3Var, c99.m4426s(b16Var3, ge9.m12515a(tj3Var).f38955d));
            tj3 tj3Var2 = tj3Var;
            boolean z2 = z;
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.upgrade_no_payment_cancel_anytime), null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var2, 0, 0, 130042);
            tj3Var2.m22139q(true);
            e16 e16VarM4412e = c99.m4412e(b16Var3, 1.0f);
            li3Var2 = li3Var;
            boolean zM22124i = tj3Var2.m22124i(li3Var2) | ((i2 & 112) == 32 ? true : z2) | ((i2 & 896) == 256 ? true : z2);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                vi3Var3 = vi3Var;
                vi3Var4 = vi3Var2;
                objM22097O = new zg0(li3Var2, vi3Var3, vi3Var4, 9);
                tj3Var2.m22131l0(objM22097O);
            } else {
                vi3Var3 = vi3Var;
                vi3Var4 = vi3Var2;
            }
            ss5.m21710f(e16VarM4412e, null, null, false, (ui3) objM22097O, hqb.f42814o, tj3Var2, 196614, 14);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            vi3Var3 = vi3Var;
            vi3Var4 = vi3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new bi3(li3Var2, vi3Var3, vi3Var4, i);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8532j(li3 li3Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3 vi3Var3;
        vi3 vi3Var4;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-808356517);
        int i2 = (tj3Var2.m22124i(li3Var) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            vi3Var3 = vi3Var;
            i2 |= tj3Var2.m22124i(vi3Var3) ? 32 : 16;
        } else {
            vi3Var3 = vi3Var;
        }
        if ((i & 384) == 0) {
            vi3Var4 = vi3Var2;
            i2 |= tj3Var2.m22124i(vi3Var4) ? 256 : 128;
        } else {
            vi3Var4 = vi3Var2;
        }
        int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            tj3Var = tj3Var2;
            b34.m3232b(null, null, ci8.m4703P(2032583328, new bi3(li3Var, vi3Var3, vi3Var4, 0, (byte) 0), tj3Var2), null, null, 0, ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55868n, 0L, null, ci8.m4703P(1519700074, new ci3(li3Var, i3), tj3Var2), tj3Var, 805306752, 443);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new yh3(li3Var, vi3Var, vi3Var2, i, 2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m8533k(aia aiaVar, boolean z, boolean z2, vi3 vi3Var, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1407450327);
        int i2 = i | (tj3Var.m22124i(aiaVar) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22122h(z2) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var) ? 16384 : 8192);
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM22066y = thb.m22066y(d32.m10007D(c99.m4412e(b16Var, 1.0f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55868n, ss5.f61356d));
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(e16VarM22066y, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 2), 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 5);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
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
            m8540r(z ? R$string.upgrade_no_payment_cancel_anytime : R$string.upgrade_securely_processed_cancel_anytime, tj3Var, 0);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38952a));
            e16 e16VarM4412e = c99.m4412e(c99.m4428u(b16Var, 0.0f, 600.0f, 1), 1.0f);
            boolean zM22124i = tj3Var.m22124i(aiaVar) | ((i2 & 7168) == 2048);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new lia(vi3Var, aiaVar, 3);
                tj3Var.m22131l0(objM22097O);
            }
            ss5.m21710f(e16VarM4412e, null, null, false, (ui3) objM22097O, ci8.m4703P(1457096947, new m04(i3, z, z2), tj3Var), tj3Var, 196614, 14);
            AbstractC0231g.m1153f(805306368 | ((i2 >> 12) & 14), 510, null, tj3Var, ui3Var, drc.f36130j, null, null, null, false);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new j07(aiaVar, z, z2, vi3Var, ui3Var, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m8534l(wia wiaVar, ArrayList arrayList, String str, t17 t17Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        String str2;
        OfferBanner offerBannerM22853a;
        OfferBanner offerBannerM22853a2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(180492090);
        int i2 = (i & 6) == 0 ? (tj3Var2.m22124i(wiaVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22120g(t17Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 16384 : 8192;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            up6 up6Var = wiaVar.f66894s;
            if (up6Var == null || (offerBannerM22853a2 = up6Var.m22853a(BannerType.UPGRADE, wiaVar.f66877b)) == null || (str2 = offerBannerM22853a2.f19546b) == null) {
                str2 = (up6Var == null || (offerBannerM22853a = up6Var.m22853a(BannerType.UPGRADE, "en")) == null) ? null : offerBannerM22853a.f19546b;
            }
            String strM23620a0 = vz1.m23620a0(tj3Var2, R$string.onboarding_upgrade_join_users_highlight);
            String strM23618Z = vz1.m23618Z(R$string.onboarding_upgrade_join_users, new Object[]{strM23620a0}, tj3Var2);
            tj3Var2.m22111b0(1654226133);
            StringBuilder sb = new StringBuilder(16);
            new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            new ArrayList();
            sb.append(strM23618Z);
            int iM23389l0 = vk9.m23389l0(strM23618Z, strM23620a0, 0, false, 6);
            if (iM23389l0 >= 0) {
                tj3Var2.m22111b0(289875174);
                arrayList2.add(new C3304ln(new he9(((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a.f55842a, 0L, bc3.f8324j, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530), iM23389l0, strM23620a0.length() + iM23389l0, 8));
                tj3Var2.m22139q(false);
            } else {
                tj3Var2.m22111b0(290154825);
                tj3Var2.m22139q(false);
            }
            String string = sb.toString();
            ArrayList arrayList3 = new ArrayList(arrayList2.size());
            int size = arrayList2.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList3.add(((C3304ln) arrayList2.get(i3)).m16392a(sb.length()));
            }
            C3419on c3419on = new C3419on(string, arrayList3);
            tj3Var2.m22139q(false);
            e16 e16VarM23914i = wfb.m23914i(c99.m4411d(b16.f7762a, 1.0f), t17Var);
            zf1 zf1Var = ge9.f40637a;
            x17 x17Var = new x17(((fe9) tj3Var2.m22128k(zf1Var)).f38960i, t17Var.mo14021d(), ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, t17Var.mo14018a() + ((fe9) tj3Var2.m22128k(zf1Var)).f38957f);
            ec0 ec0Var = nj0.f52792K;
            boolean zM22120g = tj3Var2.m22120g(c3419on) | tj3Var2.m22120g(str2) | tj3Var2.m22124i(wiaVar) | tj3Var2.m22124i(up6Var) | tj3Var2.m22124i(arrayList) | ((i2 & 896) == 256) | ((i2 & 57344) == 16384);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                dy0 dy0Var = new dy0(str2, wiaVar, up6Var, c3419on, arrayList, str, vi3Var);
                tj3Var2.m22131l0(dy0Var);
                objM22097O = dy0Var;
            }
            tj3Var = tj3Var2;
            fa4.m11642c(e16VarM23914i, null, x17Var, null, ec0Var, null, false, null, (vi3) objM22097O, tj3Var, 196608, 474);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rb0(wiaVar, arrayList, str, t17Var, vi3Var, i, 7);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final void m8535m(final aia aiaVar, final boolean z, final boolean z2, final ui3 ui3Var, ye1 ye1Var, final int i) {
        long j;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(912630803);
        int i2 = 4;
        int i3 = (tj3Var.m22124i(aiaVar) ? 4 : 2) | i | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22122h(z2) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, c99.m4412e(b16.f7762a, 1.0f), 15);
            si8 si8VarM22753b = ui8.m22753b(8.0f);
            vh9 vh9Var = ps5.f56764b;
            mn0 mn0VarM21972E = te1.m21972E(((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55868n, tj3Var);
            float f = z2 ? 2.0f : 1.0f;
            if (z2) {
                tj3Var.m22111b0(1041799308);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1041871879);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55817B;
                tj3Var.m22139q(false);
            }
            bq1.m4044T(e16VarM815b, si8VarM22753b, mn0VarM21972E, null, ci8.m4714a(f, j), ci8.m4703P(-612496505, new C3187kk(z, aiaVar, i2), tj3Var), tj3Var, 196608, 8);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(z, z2, ui3Var, i) { // from class: ria

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ boolean f59375b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ boolean f59376c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ui3 f59377d;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC1839a.m8535m(this.f59374a, this.f59375b, this.f59376c, this.f59377d, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n */
    public static final void m8536n(final wia wiaVar, ui3 ui3Var, final via viaVar, ye1 ye1Var, int i) {
        tj3 tj3Var;
        Object obj;
        char c;
        Object next;
        Object next2;
        Object[] objArr;
        Object next3;
        Object next4;
        long j;
        bx6 bx6Var;
        final t66 t66Var;
        tj3 tj3Var2;
        boolean z;
        bx6 bx6Var2;
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(-1006556705);
        int i2 = i | (tj3Var3.m22124i(wiaVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= tj3Var3.m22124i(ui3Var) ? 32 : 16;
        }
        int i3 = i2 | (tj3Var3.m22120g(viaVar) ? 256 : 128);
        if (tj3Var3.m22099R(i3 & 1, (i3 & 147) != 146)) {
            long j2 = ((ms5) tj3Var3.m22128k(ps5.f56764b)).f51799a.f55825J;
            String str = wiaVar.f66887l;
            String str2 = wiaVar.f66890o;
            String str3 = wiaVar.f66889n;
            String str4 = wiaVar.f66888m;
            List listM8522H = m8522H(wiaVar, str, str4, true, tj3Var3);
            List listM8522H2 = m8522H(wiaVar, str3, str2, true, tj3Var3);
            aia[] aiaVarArr = new aia[2];
            List list = listM8522H;
            Iterator it = list.iterator();
            do {
                obj = null;
                if (!it.hasNext()) {
                    c = 0;
                    next = null;
                    break;
                } else {
                    next = it.next();
                    c = 0;
                }
            } while (!fa4.m11650l(((aia) next).f701a, str4));
            aiaVarArr[c] = next;
            List list2 = listM8522H2;
            Iterator it2 = list2.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!fa4.m11650l(((aia) next2).f701a, str2));
            aiaVarArr[1] = next2;
            ArrayList arrayListM20837e0 = AbstractC3550rv.m20837e0(aiaVarArr);
            Object[] objArr2 = new aia[2];
            Iterator it3 = list.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    objArr = objArr2;
                    next3 = null;
                    break;
                }
                next3 = it3.next();
                objArr = objArr2;
                Iterator it4 = it3;
                if (fa4.m11650l(((aia) next3).f701a, wiaVar.f66887l)) {
                    break;
                }
                objArr2 = objArr;
                it3 = it4;
            }
            objArr[c] = next3;
            Iterator it5 = list2.iterator();
            do {
                if (!it5.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it5.next();
            } while (!fa4.m11650l(((aia) next4).f701a, str3));
            objArr[1] = next4;
            bx6 bx6Var3 = new bx6(listM8522H, listM8522H2, arrayListM20837e0, AbstractC3550rv.m20837e0(objArr));
            boolean zM22120g = tj3Var3.m22120g(str4);
            Object objM22097O = tj3Var3.m22097O();
            Object obj2 = we1.f66679a;
            if (zM22120g || objM22097O == obj2) {
                objM22097O = AbstractC0278f.m1260j(str4);
                tj3Var3.m22131l0(objM22097O);
            }
            final t66 t66Var2 = (t66) objM22097O;
            Object objM22097O2 = tj3Var3.m22097O();
            if (objM22097O2 == obj2) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var3.m22131l0(objM22097O2);
            }
            final t66 t66Var3 = (t66) objM22097O2;
            Object objM22097O3 = tj3Var3.m22097O();
            if (objM22097O3 == obj2) {
                objM22097O3 = AbstractC0278f.m1260j(OnboardingBillingPeriod.Yearly);
                tj3Var3.m22131l0(objM22097O3);
            }
            final t66 t66Var4 = (t66) objM22097O3;
            boolean zM22120g2 = tj3Var3.m22120g((String) t66Var2.getValue());
            Object objM22097O4 = tj3Var3.m22097O();
            if (zM22120g2 || objM22097O4 == obj2) {
                objM22097O4 = AbstractC0278f.m1260j((String) t66Var2.getValue());
                tj3Var3.m22131l0(objM22097O4);
            }
            final t66 t66Var5 = (t66) objM22097O4;
            Iterator it6 = arrayListM20837e0.iterator();
            while (it6.hasNext()) {
                Object next5 = it6.next();
                Iterator it7 = it6;
                if (fa4.m11650l(((aia) next5).f701a, (String) t66Var2.getValue())) {
                    obj = next5;
                    break;
                }
                it6 = it7;
            }
            aia aiaVar = (aia) obj;
            if (aiaVar == null && (aiaVar = (aia) u91.m22591I0(bx6Var3.f9135c)) == null && (aiaVar = (aia) u91.m22591I0(bx6Var3.f9133a)) == null) {
                aiaVar = (aia) u91.m22591I0(bx6Var3.f9134b);
            }
            if (((Boolean) t66Var3.getValue()).booleanValue()) {
                tj3Var3.m22111b0(1131698337);
                OnboardingBillingPeriod onboardingBillingPeriod = (OnboardingBillingPeriod) t66Var4.getValue();
                String str5 = (String) t66Var5.getValue();
                boolean z2 = wiaVar.f66896u;
                boolean zM22120g3 = tj3Var3.m22120g(t66Var5) | tj3Var3.m22124i(wiaVar) | tj3Var3.m22120g(t66Var2);
                Object objM22097O5 = tj3Var3.m22097O();
                if (zM22120g3 || objM22097O5 == obj2) {
                    objM22097O5 = new vi3() { // from class: com.lingq.core.premium.d
                        @Override // p000.vi3
                        public final Object invoke(Object obj3) {
                            OnboardingBillingPeriod onboardingBillingPeriod2 = (OnboardingBillingPeriod) obj3;
                            onboardingBillingPeriod2.getClass();
                            t66Var4.setValue(onboardingBillingPeriod2);
                            t66 t66Var6 = t66Var5;
                            String str6 = (String) t66Var6.getValue();
                            String str7 = (String) t66Var2.getValue();
                            wia wiaVar2 = wiaVar;
                            String str8 = wiaVar2.f66889n;
                            String str9 = wiaVar2.f66890o;
                            boolean z3 = fa4.m11650l(str6, str8) || fa4.m11650l(str6, str9) || fa4.m11650l(str7, str9);
                            int i4 = AbstractC1852k.f22536b[onboardingBillingPeriod2.ordinal()];
                            if (i4 == 1) {
                                str9 = z3 ? wiaVar2.f66889n : wiaVar2.f66887l;
                            } else {
                                if (i4 != 2) {
                                    gm5.m12750e();
                                    return null;
                                }
                                if (!z3) {
                                    str9 = wiaVar2.f66888m;
                                }
                            }
                            t66Var6.setValue(str9);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var3.m22131l0(objM22097O5);
                }
                vi3 vi3Var = (vi3) objM22097O5;
                boolean zM22120g4 = tj3Var3.m22120g(t66Var5);
                Object objM22097O6 = tj3Var3.m22097O();
                if (zM22120g4 || objM22097O6 == obj2) {
                    objM22097O6 = new dt6(28, t66Var5);
                    tj3Var3.m22131l0(objM22097O6);
                }
                vi3 vi3Var2 = (vi3) objM22097O6;
                Object objM22097O7 = tj3Var3.m22097O();
                if (objM22097O7 == obj2) {
                    objM22097O7 = new un7(27, t66Var3);
                    tj3Var3.m22131l0(objM22097O7);
                }
                ui3 ui3Var2 = (ui3) objM22097O7;
                char c2 = (i3 & 896) != 256 ? c : (char) 1;
                Object objM22097O8 = tj3Var3.m22097O();
                if (c2 != 0 || objM22097O8 == obj2) {
                    t66Var = t66Var4;
                    j = j2;
                    z = z2;
                    bx6Var2 = bx6Var3;
                    Object upgradeScreenKt$OnboardingUpgradeScreen$4$1 = new UpgradeScreenKt$OnboardingUpgradeScreen$4$1(1, viaVar, via.class, "onUnlockPremium", "onUnlockPremium(Lcom/lingq/core/premium/ui/UpgradeItem;)V", 0);
                    tj3Var3.m22131l0(upgradeScreenKt$OnboardingUpgradeScreen$4$1);
                    objM22097O8 = upgradeScreenKt$OnboardingUpgradeScreen$4$1;
                } else {
                    bx6Var2 = bx6Var3;
                    t66Var = t66Var4;
                    j = j2;
                    z = z2;
                }
                bx6 bx6Var4 = bx6Var2;
                m8529g(bx6Var4, onboardingBillingPeriod, str5, z, vi3Var, vi3Var2, ui3Var2, (vi3) ((FunctionReference) objM22097O8), tj3Var3, 1572864);
                bx6Var = bx6Var4;
                tj3 tj3Var4 = tj3Var3;
                tj3Var4.m22139q(c);
                tj3Var2 = tj3Var4;
            } else {
                t66Var5 = t66Var5;
                j = j2;
                bx6Var = bx6Var3;
                t66Var = t66Var4;
                tj3 tj3Var5 = tj3Var3;
                tj3Var5.m22111b0(1132284547);
                tj3Var5.m22139q(c);
                tj3Var2 = tj3Var5;
            }
            C0282a c0282aM4703P = ci8.m4703P(-528359517, new oia(j, ui3Var), tj3Var2);
            long j3 = j;
            final aia aiaVar2 = aiaVar;
            final t66 t66Var6 = t66Var5;
            tj3 tj3Var6 = tj3Var2;
            b34.m3232b(null, c0282aM4703P, ci8.m4703P(1832401380, new zi3() { // from class: com.lingq.core.premium.e
                @Override // p000.zi3
                public final Object invoke(Object obj3, Object obj4) {
                    ye1 ye1Var2 = (ye1) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    tj3 tj3Var7 = (tj3) ye1Var2;
                    if (tj3Var7.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        aia aiaVar3 = aiaVar2;
                        if (aiaVar3 == null) {
                            tj3Var7.m22111b0(35225177);
                            tj3Var7.m22139q(false);
                        } else {
                            tj3Var7.m22111b0(35225178);
                            wia wiaVar2 = wiaVar;
                            boolean z3 = wiaVar2.f66896u;
                            boolean zM11650l = fa4.m11650l(aiaVar3.f701a, wiaVar2.f66890o);
                            via viaVar2 = viaVar;
                            boolean zM22124i = tj3Var7.m22124i(viaVar2);
                            Object objM22097O9 = tj3Var7.m22097O();
                            p84 p84Var = we1.f66679a;
                            if (zM22124i || objM22097O9 == p84Var) {
                                UpgradeScreenKt$OnboardingUpgradeScreen$6$1$1$1 upgradeScreenKt$OnboardingUpgradeScreen$6$1$1$1 = new UpgradeScreenKt$OnboardingUpgradeScreen$6$1$1$1(1, viaVar2, via.class, "onUnlockPremium", "onUnlockPremium(Lcom/lingq/core/premium/ui/UpgradeItem;)V", 0);
                                tj3Var7.m22131l0(upgradeScreenKt$OnboardingUpgradeScreen$6$1$1$1);
                                objM22097O9 = upgradeScreenKt$OnboardingUpgradeScreen$6$1$1$1;
                            }
                            vi3 vi3Var3 = (vi3) ((FunctionReference) objM22097O9);
                            final t66 t66Var7 = t66Var6;
                            boolean zM22120g5 = tj3Var7.m22120g(t66Var7);
                            final t66 t66Var8 = t66Var2;
                            boolean zM22120g6 = zM22120g5 | tj3Var7.m22120g(t66Var8);
                            Object objM22097O10 = tj3Var7.m22097O();
                            if (zM22120g6 || objM22097O10 == p84Var) {
                                final t66 t66Var9 = t66Var;
                                final t66 t66Var10 = t66Var3;
                                objM22097O10 = new ui3() { // from class: com.lingq.core.premium.h
                                    @Override // p000.ui3
                                    /* JADX INFO: renamed from: a */
                                    public final Object mo0a() {
                                        t66Var9.setValue(OnboardingBillingPeriod.Yearly);
                                        t66Var7.setValue((String) t66Var8.getValue());
                                        t66Var10.setValue(Boolean.TRUE);
                                        return xfa.f68157a;
                                    }
                                };
                                tj3Var7.m22131l0(objM22097O10);
                            }
                            AbstractC1839a.m8533k(aiaVar3, z3, zM11650l, vi3Var3, (ui3) objM22097O10, tj3Var7, 0);
                            tj3Var7.m22139q(false);
                        }
                    } else {
                        tj3Var7.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), null, null, 0, j3, 0L, null, ci8.m4703P(-1422133970, new C3357n2(wiaVar, bx6Var, t66Var2, viaVar, 18), tj3Var2), tj3Var6, 805306800, 441);
            tj3Var = tj3Var6;
        } else {
            tj3 tj3Var7 = tj3Var3;
            tj3Var7.m22102U();
            tj3Var = tj3Var7;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nia(wiaVar, ui3Var, viaVar, i, 2);
        }
    }

    /* JADX INFO: renamed from: o */
    public static final void m8537o(long j, ui3 ui3Var, ye1 ye1Var, int i) {
        ui3 ui3Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2044844564);
        int i2 = (tj3Var.m22118f(j) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM22038C = thb.m22038C(d32.m10007D(c99.m4412e(b16Var, 1.0f), j, ss5.f61356d));
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52813h, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM22038C);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            ui3Var2 = ui3Var;
            omd.m18141c(ui3Var2, AbstractC3584sr.m21609V(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a, 0.0f, 2), false, null, null, drc.f36123c, tj3Var, ((i2 >> 3) & 14) | 1572864, 60);
            tj3Var.m22139q(true);
        } else {
            ui3Var2 = ui3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new oia(j, ui3Var2, i);
        }
    }

    /* JADX INFO: renamed from: p */
    public static final void m8538p(String str, String str2, ye1 ye1Var, int i) {
        String str3 = str2;
        str3.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1373433322);
        int i2 = i | (tj3Var.m22120g(str3) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
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
            lw9.m16554b(str, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71409m, tj3Var, 6, 0, 131070);
            e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            tj3Var.m22111b0(1719569591);
            for (int i3 = 0; i3 < 5; i3++) {
                y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_review_star, tj3Var, 0);
                ((fe9) tj3Var.m22128k(ge9.f40637a)).getClass();
                bq1.m4042R(y27VarM18236U, null, c99.m4422o(b16Var, 16.0f), null, null, 0.0f, null, tj3Var, 56, 120);
            }
            AbstractC3393o1.m17723A(tj3Var, false, true, true);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a));
            vh9 vh9Var = ps5.f56764b;
            str3 = str2;
            lw9.m16554b(str3, null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9.m23584b(((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, 0L, null, null, null, 0L, null, null, 0, 0L, null, 16777214), tj3Var, (i2 >> 6) & 14, 0, 131070);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new r65(str, i, 5, str3);
        }
    }

    /* JADX INFO: renamed from: q */
    public static final void m8539q(final wia wiaVar, final List list, final int i, final t17 t17Var, final vi3 vi3Var, final ui3 ui3Var, final ui3 ui3Var2, final ui3 ui3Var3, final ui3 ui3Var4, ye1 ye1Var, final int i2) {
        int i3;
        ui3 ui3Var5;
        ui3 ui3Var6;
        tj3 tj3Var;
        wiaVar.getClass();
        t17Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(14891444);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var2.m22124i(wiaVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var2.m22124i(list) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var2.m22116e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= tj3Var2.m22120g(t17Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= tj3Var2.m22124i(ui3Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            ui3Var5 = ui3Var2;
            i3 |= tj3Var2.m22124i(ui3Var5) ? 1048576 : 524288;
        } else {
            ui3Var5 = ui3Var2;
        }
        if ((12582912 & i2) == 0) {
            ui3Var6 = ui3Var3;
            i3 |= tj3Var2.m22124i(ui3Var6) ? 8388608 : 4194304;
        } else {
            ui3Var6 = ui3Var3;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= tj3Var2.m22124i(ui3Var4) ? 67108864 : 33554432;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 38347923) != 38347922)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM23914i = wfb.m23914i(AbstractC3184kh.m15211e(c99.m4428u(c99.m4410c(b16.f7762a, 1.0f), 0.0f, 600.0f, 1), Orientation.Vertical), t17Var);
            x17 x17VarM21626g = AbstractC3584sr.m21626g(0.0f, t17Var.mo14021d(), 0.0f, t17Var.mo14018a(), 5);
            boolean zM22124i = tj3Var2.m22124i(wiaVar) | tj3Var2.m22124i(context) | ((234881024 & i3) == 67108864) | ((29360128 & i3) == 8388608) | tj3Var2.m22124i(list) | ((i3 & 896) == 256) | ((57344 & i3) == 16384) | ((458752 & i3) == 131072) | ((i3 & 3670016) == 1048576);
            Object objM22097O = tj3Var2.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                py4 py4Var = new py4(wiaVar, context, ui3Var4, ui3Var6, list, i, vi3Var, ui3Var, ui3Var5);
                tj3Var2.m22131l0(py4Var);
                objM22097O = py4Var;
            }
            tj3Var = tj3Var2;
            fa4.m11642c(e16VarM23914i, null, x17VarM21626g, null, null, null, false, null, (vi3) objM22097O, tj3Var, 0, 506);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: pia
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC1839a.m8539q(wiaVar, list, i, t17Var, vi3Var, ui3Var, ui3Var2, ui3Var3, ui3Var4, (ye1) obj, pk9.m19383z(i2 | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: r */
    public static final void m8540r(int i, ye1 ye1Var, int i2) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(977721697);
        int i3 = (tj3Var.m22116e(i) ? 4 : 2) | i2;
        if (tj3Var.m22099R(i3 & 1, (i3 & 3) != 2)) {
            tj3Var.m22104W();
            if ((i2 & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37240f, nj0.f52789H, tj3Var, 54);
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
            p04 p04VarM10916b = e7d.m10916b();
            long jM4212e = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
            zf1 zf1Var = ge9.f40637a;
            ((fe9) tj3Var.m22128k(zf1Var)).getClass();
            ty3.m22351a(p04VarM10916b, null, c99.m4422o(b16Var, 16.0f), jM4212e, tj3Var, 48, 0);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38955d));
            String strM23620a0 = vz1.m23620a0(tj3Var, i);
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(strM23620a0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, 0, 0, 130042);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ex0(i, i2, 19);
        }
    }

    /* JADX INFO: renamed from: s */
    public static final void m8541s(final int i, aia aiaVar, final int i2, final vi3 vi3Var, final up6 up6Var, ye1 ye1Var, final int i3) {
        int i4;
        String str;
        long j;
        vf0 vf0VarM21971D;
        boolean z;
        String strM23620a0;
        long jM4210c;
        boolean z2;
        final aia aiaVar2 = aiaVar;
        aiaVar2.getClass();
        boolean z3 = aiaVar2.f710j;
        boolean z4 = aiaVar2.f708h;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-471659292);
        if ((i3 & 6) == 0) {
            i4 = (tj3Var.m22116e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= tj3Var.m22124i(aiaVar2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= tj3Var.m22116e(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= tj3Var.m22124i(vi3Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= tj3Var.m22124i(up6Var) ? 16384 : 8192;
        }
        if (tj3Var.m22099R(i4 & 1, (i4 & 9363) != 9362)) {
            int i5 = i4;
            l44 l44VarM21713i = ss5.m21713i(ss5.m21691R("shimmer", tj3Var, 0), 0.0f, 1.0f, ss5.m21687N(ss5.m21703b0(2000, 0, io2.f44352d, 2), null, 0L, 6), "shimmer", tj3Var, 29112, 0);
            if (up6Var == null) {
                tj3Var.m22111b0(1931540195);
                tj3Var.m22139q(false);
                str = null;
            } else {
                tj3Var.m22111b0(1931540196);
                str = AbstractC3423or.m18217B(tj3Var) ? up6Var.f64189q : up6Var.f64188p;
                tj3Var.m22139q(false);
            }
            aa1 aa1VarM8521G = str != null ? m8521G(str) : null;
            if (aa1VarM8521G == null) {
                tj3Var.m22111b0(2001975883);
                j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55842a;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(2001974612);
                tj3Var.m22139q(false);
                j = aa1VarM8521G.f414a;
            }
            List listM23605K = vz1.m23605K(new aa1(j), new aa1(aa1.m198b(0.8f, j)));
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
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var3, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var).f38952a, 1);
            float f = z4 ? 4.0f : 0.0f;
            C0233h c0233h = new C0233h(f, f, f, f, e07.m10781c(), 0.0f);
            mn0 mn0VarM21972E = te1.m21972E(p58.m18900f(tj3Var).f55821F, tj3Var);
            si8 si8Var = p58.m18901i(tj3Var).f64858d;
            if (i2 == i) {
                tj3Var.m22111b0(976881300);
                if (z4) {
                    tj3Var.m22111b0(976911866);
                    tj3Var.m22139q(false);
                    vf0VarM21971D = ci8.m4714a(1.0f, j);
                    z2 = false;
                } else {
                    tj3Var.m22111b0(977055768);
                    vf0VarM21971D = ci8.m4714a(1.0f, p58.m18900f(tj3Var).f55875s);
                    z2 = false;
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(977243070);
                vf0VarM21971D = te1.m21971D(false, tj3Var, 0);
                tj3Var.m22139q(false);
            }
            boolean z5 = ((i5 & 14) == 4) | ((i5 & 7168) == 2048);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z5 || objM22097O == p84Var) {
                objM22097O = new C3390nz(vi3Var, i, 11);
                tj3Var.m22131l0(objM22097O);
            }
            aiaVar2 = aiaVar;
            bq1.m4043S((ui3) objM22097O, e16VarM21609V, false, si8Var, mn0VarM21972E, c0233h, vf0VarM21971D, ci8.m4703P(569108807, new iz4(27, aiaVar, up6Var), tj3Var), tj3Var, 100663296, 132);
            tj3Var = tj3Var;
            if (z4) {
                tj3Var.m22111b0(983189862);
                e16 e16VarM10007D = d32.m10007D(pb1.m19045o(AbstractC3584sr.m21611X(ci0.f10109a.mo3727a(b16Var, nj0.f52810e), 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 0.0f, 11), p58.m18901i(tj3Var).f64855a), p58.m18900f(tj3Var).f55842a, ss5.f61356d);
                boolean zM22124i = tj3Var.m22124i(aiaVar2) | tj3Var.m22120g(l44VarM21713i) | tj3Var.m22120g(listM23605K);
                Object objM22097O2 = tj3Var.m22097O();
                if (zM22124i || objM22097O2 == p84Var) {
                    objM22097O2 = new ws6(aiaVar2, listM23605K, l44VarM21713i, 19);
                    tj3Var.m22131l0(objM22097O2);
                }
                e16 e16VarM21609V2 = AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(vz1.m23655y(e16VarM10007D, (vi3) objM22097O2), ge9.m12515a(tj3Var).f38952a, 0.0f, 2), 0.0f, ge9.m12515a(tj3Var).f38954c, 1);
                ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52812g, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                if (z3) {
                    tj3Var.m22111b0(-1157156085);
                    strM23620a0 = vz1.m23620a0(tj3Var, R$string.upgrade_special_offer);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-1157154293);
                    tj3Var.m22139q(false);
                    strM23620a0 = aiaVar2.f707g;
                }
                String str2 = strM23620a0;
                vx9 vx9VarM23584b = vx9.m23584b(p58.m18902j(tj3Var).f71405i, 0L, 0L, null, null, null, 0L, null, new l39(p58.m18900f(tj3Var).f55875s, (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L), 1.0f), 0, 0L, null, 16769023);
                if (z3) {
                    tj3Var.m22111b0(-1511639605);
                    jM4210c = cx2.m9917a(tj3Var).m4210c();
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(-1511544590);
                    jM4210c = p58.m18900f(tj3Var).f55844b;
                    tj3Var.m22139q(false);
                }
                g4d.m12360a(str2, null, jM4210c, null, 0L, 0, false, 1, vx9VarM23584b, null, tj3Var, 12582912, 634);
                tj3Var = tj3Var;
                z = true;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                z = true;
                tj3Var.m22111b0(985402084);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(z);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: uia
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    AbstractC1839a.m8541s(i, aiaVar2, i2, vi3Var, up6Var, (ye1) obj, pk9.m19383z(i3 | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: t */
    public static final void m8542t(List list, int i, vi3 vi3Var, up6 up6Var, ye1 ye1Var, int i2) {
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-225346961);
        up6 up6Var2 = up6Var;
        int i3 = i2 | (tj3Var.m22124i(list) ? 4 : 2) | (tj3Var.m22116e(i) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128) | (tj3Var.m22124i(up6Var2) ? 2048 : 1024);
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            e16 e16VarM4412e = c99.m4412e(b16.f7762a, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC3584sr.m21609V(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, 0.0f, 2), 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38957f, 1);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            tj3Var.m22111b0(-24626702);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                m8541s(i4, (aia) obj, i, vi3Var, up6Var2, tj3Var, 65408 & (i3 << 3));
                up6Var2 = up6Var;
                i4 = i5;
            }
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new y35(list, i, vi3Var, up6Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:57:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:60:0x0158  */
    /* JADX WARN: Code duplicated, block: B:62:0x0164  */
    /* JADX WARN: Code duplicated, block: B:63:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x0204  */
    /* JADX WARN: Code duplicated, block: B:67:0x023b  */
    /* JADX WARN: Code duplicated, block: B:69:0x0247  */
    /* JADX WARN: Code duplicated, block: B:70:0x027d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0283  */
    /* JADX WARN: Code duplicated, block: B:73:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0319  */
    /* JADX WARN: Code duplicated, block: B:78:0x0359  */
    /* JADX WARN: Code duplicated, block: B:79:0x038e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0394  */
    /* JADX WARN: Code duplicated, block: B:82:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x042e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0438  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11, types: [tj3] */
    /* JADX WARN: Type inference failed for: r12v12, types: [tj3] */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2, types: [tj3] */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v25 */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v28 */
    /* JADX WARN: Type inference failed for: r12v29 */
    /* JADX WARN: Type inference failed for: r12v5, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r12v6, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r12v8, types: [tj3] */
    /* JADX WARN: Type inference failed for: r12v9, types: [tj3, ye1] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r26v1, types: [ye1] */
    /* JADX WARN: Type inference failed for: r26v2, types: [ye1] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: u */
    public static final void m8543u(String str, boolean z, boolean z2, String str2, String str3, String str4, ye1 ye1Var, int i, int i2) {
        String str5;
        int i3;
        String str6;
        int i4;
        int i5;
        String str7;
        int i6;
        boolean z3;
        String str8;
        ?? r12;
        x18 x18VarM22143u;
        String str9;
        String str10;
        b16 b16Var;
        ui3 ui3Var;
        vj8 vj8Var;
        int i7;
        tj3 tj3Var;
        String str11;
        float f;
        ?? r15;
        ?? r13;
        String str12;
        ?? r14;
        ?? r2;
        String str13;
        ?? r16;
        ?? r17;
        ?? r3;
        boolean z4;
        tj3 tj3Var2;
        str.getClass();
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(1668635577);
        int i8 = (tj3Var3.m22120g(str) ? 4 : 2) | i;
        int i9 = i2 & 16;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                str5 = str2;
                i8 |= tj3Var3.m22120g(str5) ? 16384 : 8192;
            }
            i3 = i2 & 32;
            if (i3 != 0) {
                if ((196608 & i) == 0) {
                    str6 = str3;
                    if (tj3Var3.m22120g(str6)) {
                        i4 = 131072;
                    } else {
                        i4 = 65536;
                    }
                    i8 |= i4;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    if ((1572864 & i) == 0) {
                        str7 = str4;
                        if (tj3Var3.m22120g(str7)) {
                            i6 = 1048576;
                        } else {
                            i6 = 524288;
                        }
                        i8 |= i6;
                    }
                    if ((599187 & i8) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (tj3Var3.m22099R(i8 & 1, z3)) {
                        if (i9 != 0) {
                            str5 = "";
                        }
                        if (i3 != 0) {
                            str9 = "";
                        } else {
                            str9 = str6;
                        }
                        if (i5 != 0) {
                            str10 = "";
                        } else {
                            str10 = str7;
                        }
                        b16Var = b16.f7762a;
                        e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
                        sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e);
                        se1.f60731q.getClass();
                        ui3Var = C0352b.f4299b;
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
                        vj8Var = vj8.f65508a;
                        i7 = i8;
                        lw9.m16554b(str, vj8Var.mo12420a(0.4f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, i8 & 14, 0, 131068);
                        tj3Var = tj3Var3;
                        thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                        if (z) {
                            tj3Var.m22111b0(1554371135);
                            if (str5.length() > 0) {
                                tj3Var.m22111b0(1554415713);
                                String str14 = str5;
                                f = 0.2f;
                                lw9.m16554b(str14, vj8Var.mo12420a(0.2f, b16Var, true), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, (i7 >> 12) & 14, 0, 130040);
                                str11 = str14;
                                tj3 tj3Var4 = tj3Var;
                                z4 = false;
                                tj3Var4.m22139q(false);
                                tj3Var2 = tj3Var4;
                            } else {
                                str11 = str5;
                                f = 0.2f;
                                z4 = false;
                                tj3Var.m22111b0(1554736005);
                                y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, tj3Var, 0);
                                e16 e16VarMo12420a = vj8Var.mo12420a(0.2f, b16Var, true);
                                ge9.m12515a(tj3Var).getClass();
                                bq1.m4042R(y27VarM18236U, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                                tj3Var.m22139q(false);
                                tj3Var2 = tj3Var;
                            }
                            tj3Var2.m22139q(z4);
                            r13 = tj3Var2;
                            r15 = z4;
                        } else {
                            str11 = str5;
                            f = 0.2f;
                            r15 = 0;
                            tj3Var.m22111b0(1555139749);
                            y27 y27VarM18236U2 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, tj3Var, 0);
                            e16 e16VarMo12420a2 = vj8Var.mo12420a(0.2f, b16Var, true);
                            ge9.m12515a(tj3Var).getClass();
                            bq1.m4042R(y27VarM18236U2, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a2, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                            tj3Var.m22139q(false);
                        }
                        if (z2) {
                            r13 = tj3Var;
                            r13.m22111b0(1555557784);
                            if (str11.length() > 0) {
                                r13.m22111b0(1555573532);
                                y27 y27VarM18236U3 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r13, r15);
                                e16 e16VarMo12420a3 = vj8Var.mo12420a(f, b16Var, true);
                                ge9.m12515a(r13).getClass();
                                bq1.m4042R(y27VarM18236U3, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a3, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                                r13.m22139q(r15);
                                str12 = str9;
                                r3 = r15;
                                r17 = r13;
                            } else if (str9.length() > 0) {
                                r13.m22111b0(1556023280);
                                e16 e16VarMo12420a4 = vj8Var.mo12420a(f, b16Var, true);
                                vx9 vx9Var = p58.m18902j(r13).f71410n;
                                ?? r26 = r13;
                                String str15 = str9;
                                boolean z5 = r15 == true ? 1 : 0;
                                lw9.m16554b(str15, e16VarMo12420a4, aa1.m198b(0.6f, p58.m18900f(r13).f55873q), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var, r26, (i7 >> 15) & 14, 0, 130040);
                                str12 = str15;
                                ?? r18 = r26;
                                r18.m22139q(z5);
                                r3 = z5;
                                r17 = r18;
                            } else {
                                str12 = str9;
                                ?? r4 = r15;
                                r13.m22111b0(1556359909);
                                y27 y27VarM18236U4 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r13, r4 == true ? 1 : 0);
                                e16 e16VarMo12420a5 = vj8Var.mo12420a(f, b16Var, true);
                                ge9.m12515a(r13).getClass();
                                bq1.m4042R(y27VarM18236U4, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a5, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                                r13.m22139q(r4);
                                r3 = r4;
                                r17 = r13;
                            }
                            r17.m22139q(r3);
                            r2 = r3;
                            r14 = r17;
                        } else {
                            r13 = tj3Var;
                            str12 = str9;
                            ?? r5 = r15;
                            r13.m22111b0(1556763653);
                            y27 y27VarM18236U5 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, r13, r5 == true ? 1 : 0);
                            e16 e16VarMo12420a6 = vj8Var.mo12420a(f, b16Var, true);
                            ge9.m12515a(r13).getClass();
                            bq1.m4042R(y27VarM18236U5, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a6, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                            r13.m22139q(r5);
                            r2 = r5;
                            r14 = r13;
                        }
                        r14.m22111b0(1557176945);
                        if (str11.length() > 0) {
                            r14.m22111b0(1557193468);
                            y27 y27VarM18236U6 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r14, r2);
                            e16 e16VarMo12420a7 = vj8Var.mo12420a(f, b16Var, true);
                            ge9.m12515a(r14).getClass();
                            bq1.m4042R(y27VarM18236U6, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a7, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                            r14.m22139q(r2);
                            str13 = str10;
                            r16 = r14;
                        } else if (str10.length() > 0) {
                            r14.m22111b0(1557639558);
                            ?? r27 = r14;
                            String str16 = str10;
                            lw9.m16554b(str16, vj8Var.mo12420a(f, b16Var, true), p58.m18900f(r14).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(r14).f71410n, r27, (i7 >> 18) & 14, 0, 130040);
                            str13 = str16;
                            ?? r19 = r27;
                            r19.m22139q(r2);
                            r16 = r19;
                        } else {
                            str13 = str10;
                            r14.m22111b0(1557955045);
                            y27 y27VarM18236U7 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r14, r2);
                            e16 e16VarMo12420a8 = vj8Var.mo12420a(f, b16Var, true);
                            ge9.m12515a(r14).getClass();
                            bq1.m4042R(y27VarM18236U7, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a8, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                            r14.m22139q(r2);
                            r16 = r14;
                        }
                        r16.m22139q(r2);
                        r16.m22139q(true);
                        thb.m22044c(r16, c99.m4414g(b16Var, ge9.m12515a(r16).f38952a));
                        str8 = str13;
                        str5 = str11;
                        str6 = str12;
                        r12 = r16;
                    } else {
                        tj3Var3.m22102U();
                        str8 = str7;
                        r12 = tj3Var3;
                    }
                    x18VarM22143u = r12.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new dz9(str, z, str5, i, i2, str6, str8, z2);
                    }
                }
                i8 |= 1572864;
                str7 = str4;
                if ((599187 & i8) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var3.m22099R(i8 & 1, z3)) {
                    if (i9 != 0) {
                        str5 = "";
                    }
                    if (i3 != 0) {
                        str9 = "";
                    } else {
                        str9 = str6;
                    }
                    if (i5 != 0) {
                        str10 = "";
                    } else {
                        str10 = str7;
                    }
                    b16Var = b16.f7762a;
                    e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                    int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m2 = tj3Var3.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e2);
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a2);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode2));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
                    vj8Var = vj8.f65508a;
                    i7 = i8;
                    lw9.m16554b(str, vj8Var.mo12420a(0.4f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, i8 & 14, 0, 131068);
                    tj3Var = tj3Var3;
                    thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                    if (z) {
                        tj3Var.m22111b0(1554371135);
                        if (str5.length() > 0) {
                            tj3Var.m22111b0(1554415713);
                            String str17 = str5;
                            f = 0.2f;
                            lw9.m16554b(str17, vj8Var.mo12420a(0.2f, b16Var, true), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, (i7 >> 12) & 14, 0, 130040);
                            str11 = str17;
                            tj3 tj3Var5 = tj3Var;
                            z4 = false;
                            tj3Var5.m22139q(false);
                            tj3Var2 = tj3Var5;
                        } else {
                            str11 = str5;
                            f = 0.2f;
                            z4 = false;
                            tj3Var.m22111b0(1554736005);
                            y27 y27VarM18236U8 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, tj3Var, 0);
                            e16 e16VarMo12420a9 = vj8Var.mo12420a(0.2f, b16Var, true);
                            ge9.m12515a(tj3Var).getClass();
                            bq1.m4042R(y27VarM18236U8, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a9, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                            tj3Var.m22139q(false);
                            tj3Var2 = tj3Var;
                        }
                        tj3Var2.m22139q(z4);
                        r13 = tj3Var2;
                        r15 = z4;
                    } else {
                        str11 = str5;
                        f = 0.2f;
                        r15 = 0;
                        tj3Var.m22111b0(1555139749);
                        y27 y27VarM18236U9 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, tj3Var, 0);
                        e16 e16VarMo12420a10 = vj8Var.mo12420a(0.2f, b16Var, true);
                        ge9.m12515a(tj3Var).getClass();
                        bq1.m4042R(y27VarM18236U9, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a10, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                        tj3Var.m22139q(false);
                    }
                    if (z2) {
                        r13 = tj3Var;
                        r13.m22111b0(1555557784);
                        if (str11.length() > 0) {
                            r13.m22111b0(1555573532);
                            y27 y27VarM18236U10 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r13, r15);
                            e16 e16VarMo12420a11 = vj8Var.mo12420a(f, b16Var, true);
                            ge9.m12515a(r13).getClass();
                            bq1.m4042R(y27VarM18236U10, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a11, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                            r13.m22139q(r15);
                            str12 = str9;
                            r3 = r15;
                            r17 = r13;
                        } else if (str9.length() > 0) {
                            r13.m22111b0(1556023280);
                            e16 e16VarMo12420a12 = vj8Var.mo12420a(f, b16Var, true);
                            vx9 vx9Var2 = p58.m18902j(r13).f71410n;
                            ?? r28 = r13;
                            String str18 = str9;
                            boolean z6 = r15 == true ? 1 : 0;
                            lw9.m16554b(str18, e16VarMo12420a12, aa1.m198b(0.6f, p58.m18900f(r13).f55873q), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var2, r28, (i7 >> 15) & 14, 0, 130040);
                            str12 = str18;
                            ?? r110 = r28;
                            r110.m22139q(z6);
                            r3 = z6;
                            r17 = r110;
                        } else {
                            str12 = str9;
                            ?? r6 = r15;
                            r13.m22111b0(1556359909);
                            y27 y27VarM18236U11 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r13, r6 == true ? 1 : 0);
                            e16 e16VarMo12420a13 = vj8Var.mo12420a(f, b16Var, true);
                            ge9.m12515a(r13).getClass();
                            bq1.m4042R(y27VarM18236U11, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a13, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                            r13.m22139q(r6);
                            r3 = r6;
                            r17 = r13;
                        }
                        r17.m22139q(r3);
                        r2 = r3;
                        r14 = r17;
                    } else {
                        r13 = tj3Var;
                        str12 = str9;
                        ?? r7 = r15;
                        r13.m22111b0(1556763653);
                        y27 y27VarM18236U12 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, r13, r7 == true ? 1 : 0);
                        e16 e16VarMo12420a14 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r13).getClass();
                        bq1.m4042R(y27VarM18236U12, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a14, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                        r13.m22139q(r7);
                        r2 = r7;
                        r14 = r13;
                    }
                    r14.m22111b0(1557176945);
                    if (str11.length() > 0) {
                        r14.m22111b0(1557193468);
                        y27 y27VarM18236U13 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r14, r2);
                        e16 e16VarMo12420a15 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r14).getClass();
                        bq1.m4042R(y27VarM18236U13, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a15, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                        r14.m22139q(r2);
                        str13 = str10;
                        r16 = r14;
                    } else if (str10.length() > 0) {
                        r14.m22111b0(1557639558);
                        ?? r29 = r14;
                        String str19 = str10;
                        lw9.m16554b(str19, vj8Var.mo12420a(f, b16Var, true), p58.m18900f(r14).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(r14).f71410n, r29, (i7 >> 18) & 14, 0, 130040);
                        str13 = str19;
                        ?? r111 = r29;
                        r111.m22139q(r2);
                        r16 = r111;
                    } else {
                        str13 = str10;
                        r14.m22111b0(1557955045);
                        y27 y27VarM18236U14 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r14, r2);
                        e16 e16VarMo12420a16 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r14).getClass();
                        bq1.m4042R(y27VarM18236U14, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a16, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                        r14.m22139q(r2);
                        r16 = r14;
                    }
                    r16.m22139q(r2);
                    r16.m22139q(true);
                    thb.m22044c(r16, c99.m4414g(b16Var, ge9.m12515a(r16).f38952a));
                    str8 = str13;
                    str5 = str11;
                    str6 = str12;
                    r12 = r16;
                } else {
                    tj3Var3.m22102U();
                    str8 = str7;
                    r12 = tj3Var3;
                }
                x18VarM22143u = r12.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new dz9(str, z, str5, i, i2, str6, str8, z2);
                }
            }
            i8 |= 196608;
            str6 = str3;
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((1572864 & i) == 0) {
                    str7 = str4;
                    if (tj3Var3.m22120g(str7)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i8 |= i6;
                }
                if ((599187 & i8) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var3.m22099R(i8 & 1, z3)) {
                    if (i9 != 0) {
                        str5 = "";
                    }
                    if (i3 != 0) {
                        str9 = "";
                    } else {
                        str9 = str6;
                    }
                    if (i5 != 0) {
                        str10 = "";
                    } else {
                        str10 = str7;
                    }
                    b16Var = b16.f7762a;
                    e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a3 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                    int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m3 = tj3Var3.m22132m();
                    e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e3);
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a3);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m3);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode3));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c3);
                    vj8Var = vj8.f65508a;
                    i7 = i8;
                    lw9.m16554b(str, vj8Var.mo12420a(0.4f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, i8 & 14, 0, 131068);
                    tj3Var = tj3Var3;
                    thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                    if (z) {
                        tj3Var.m22111b0(1554371135);
                        if (str5.length() > 0) {
                            tj3Var.m22111b0(1554415713);
                            String str110 = str5;
                            f = 0.2f;
                            lw9.m16554b(str110, vj8Var.mo12420a(0.2f, b16Var, true), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, (i7 >> 12) & 14, 0, 130040);
                            str11 = str110;
                            tj3 tj3Var6 = tj3Var;
                            z4 = false;
                            tj3Var6.m22139q(false);
                            tj3Var2 = tj3Var6;
                        } else {
                            str11 = str5;
                            f = 0.2f;
                            z4 = false;
                            tj3Var.m22111b0(1554736005);
                            y27 y27VarM18236U15 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, tj3Var, 0);
                            e16 e16VarMo12420a17 = vj8Var.mo12420a(0.2f, b16Var, true);
                            ge9.m12515a(tj3Var).getClass();
                            bq1.m4042R(y27VarM18236U15, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a17, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                            tj3Var.m22139q(false);
                            tj3Var2 = tj3Var;
                        }
                        tj3Var2.m22139q(z4);
                        r13 = tj3Var2;
                        r15 = z4;
                    } else {
                        str11 = str5;
                        f = 0.2f;
                        r15 = 0;
                        tj3Var.m22111b0(1555139749);
                        y27 y27VarM18236U16 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, tj3Var, 0);
                        e16 e16VarMo12420a18 = vj8Var.mo12420a(0.2f, b16Var, true);
                        ge9.m12515a(tj3Var).getClass();
                        bq1.m4042R(y27VarM18236U16, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a18, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                        tj3Var.m22139q(false);
                    }
                    if (z2) {
                        r13 = tj3Var;
                        r13.m22111b0(1555557784);
                        if (str11.length() > 0) {
                            r13.m22111b0(1555573532);
                            y27 y27VarM18236U17 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r13, r15);
                            e16 e16VarMo12420a19 = vj8Var.mo12420a(f, b16Var, true);
                            ge9.m12515a(r13).getClass();
                            bq1.m4042R(y27VarM18236U17, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a19, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                            r13.m22139q(r15);
                            str12 = str9;
                            r3 = r15;
                            r17 = r13;
                        } else if (str9.length() > 0) {
                            r13.m22111b0(1556023280);
                            e16 e16VarMo12420a110 = vj8Var.mo12420a(f, b16Var, true);
                            vx9 vx9Var3 = p58.m18902j(r13).f71410n;
                            ?? r210 = r13;
                            String str111 = str9;
                            boolean z7 = r15 == true ? 1 : 0;
                            lw9.m16554b(str111, e16VarMo12420a110, aa1.m198b(0.6f, p58.m18900f(r13).f55873q), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var3, r210, (i7 >> 15) & 14, 0, 130040);
                            str12 = str111;
                            ?? r112 = r210;
                            r112.m22139q(z7);
                            r3 = z7;
                            r17 = r112;
                        } else {
                            str12 = str9;
                            ?? r8 = r15;
                            r13.m22111b0(1556359909);
                            y27 y27VarM18236U18 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r13, r8 == true ? 1 : 0);
                            e16 e16VarMo12420a111 = vj8Var.mo12420a(f, b16Var, true);
                            ge9.m12515a(r13).getClass();
                            bq1.m4042R(y27VarM18236U18, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a111, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                            r13.m22139q(r8);
                            r3 = r8;
                            r17 = r13;
                        }
                        r17.m22139q(r3);
                        r2 = r3;
                        r14 = r17;
                    } else {
                        r13 = tj3Var;
                        str12 = str9;
                        ?? r9 = r15;
                        r13.m22111b0(1556763653);
                        y27 y27VarM18236U19 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, r13, r9 == true ? 1 : 0);
                        e16 e16VarMo12420a112 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r13).getClass();
                        bq1.m4042R(y27VarM18236U19, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a112, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                        r13.m22139q(r9);
                        r2 = r9;
                        r14 = r13;
                    }
                    r14.m22111b0(1557176945);
                    if (str11.length() > 0) {
                        r14.m22111b0(1557193468);
                        y27 y27VarM18236U110 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r14, r2);
                        e16 e16VarMo12420a113 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r14).getClass();
                        bq1.m4042R(y27VarM18236U110, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a113, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                        r14.m22139q(r2);
                        str13 = str10;
                        r16 = r14;
                    } else if (str10.length() > 0) {
                        r14.m22111b0(1557639558);
                        ?? r211 = r14;
                        String str112 = str10;
                        lw9.m16554b(str112, vj8Var.mo12420a(f, b16Var, true), p58.m18900f(r14).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(r14).f71410n, r211, (i7 >> 18) & 14, 0, 130040);
                        str13 = str112;
                        ?? r113 = r211;
                        r113.m22139q(r2);
                        r16 = r113;
                    } else {
                        str13 = str10;
                        r14.m22111b0(1557955045);
                        y27 y27VarM18236U111 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r14, r2);
                        e16 e16VarMo12420a114 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r14).getClass();
                        bq1.m4042R(y27VarM18236U111, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a114, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                        r14.m22139q(r2);
                        r16 = r14;
                    }
                    r16.m22139q(r2);
                    r16.m22139q(true);
                    thb.m22044c(r16, c99.m4414g(b16Var, ge9.m12515a(r16).f38952a));
                    str8 = str13;
                    str5 = str11;
                    str6 = str12;
                    r12 = r16;
                } else {
                    tj3Var3.m22102U();
                    str8 = str7;
                    r12 = tj3Var3;
                }
                x18VarM22143u = r12.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new dz9(str, z, str5, i, i2, str6, str8, z2);
                }
            }
            i8 |= 1572864;
            str7 = str4;
            if ((599187 & i8) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var3.m22099R(i8 & 1, z3)) {
                if (i9 != 0) {
                    str5 = "";
                }
                if (i3 != 0) {
                    str9 = "";
                } else {
                    str9 = str6;
                }
                if (i5 != 0) {
                    str10 = "";
                } else {
                    str10 = str7;
                }
                b16Var = b16.f7762a;
                e16 e16VarM4412e4 = c99.m4412e(b16Var, 1.0f);
                sj8 sj8VarM20003a4 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                int iHashCode4 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m4 = tj3Var3.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e4);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a4);
                oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m4);
                oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode4));
                oha.m18000f(tj3Var3, C0352b.f4305h);
                oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c4);
                vj8Var = vj8.f65508a;
                i7 = i8;
                lw9.m16554b(str, vj8Var.mo12420a(0.4f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, i8 & 14, 0, 131068);
                tj3Var = tj3Var3;
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                if (z) {
                    tj3Var.m22111b0(1554371135);
                    if (str5.length() > 0) {
                        tj3Var.m22111b0(1554415713);
                        String str113 = str5;
                        f = 0.2f;
                        lw9.m16554b(str113, vj8Var.mo12420a(0.2f, b16Var, true), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, (i7 >> 12) & 14, 0, 130040);
                        str11 = str113;
                        tj3 tj3Var7 = tj3Var;
                        z4 = false;
                        tj3Var7.m22139q(false);
                        tj3Var2 = tj3Var7;
                    } else {
                        str11 = str5;
                        f = 0.2f;
                        z4 = false;
                        tj3Var.m22111b0(1554736005);
                        y27 y27VarM18236U112 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, tj3Var, 0);
                        e16 e16VarMo12420a115 = vj8Var.mo12420a(0.2f, b16Var, true);
                        ge9.m12515a(tj3Var).getClass();
                        bq1.m4042R(y27VarM18236U112, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a115, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                        tj3Var.m22139q(false);
                        tj3Var2 = tj3Var;
                    }
                    tj3Var2.m22139q(z4);
                    r13 = tj3Var2;
                    r15 = z4;
                } else {
                    str11 = str5;
                    f = 0.2f;
                    r15 = 0;
                    tj3Var.m22111b0(1555139749);
                    y27 y27VarM18236U113 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, tj3Var, 0);
                    e16 e16VarMo12420a116 = vj8Var.mo12420a(0.2f, b16Var, true);
                    ge9.m12515a(tj3Var).getClass();
                    bq1.m4042R(y27VarM18236U113, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a116, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                    tj3Var.m22139q(false);
                }
                if (z2) {
                    r13 = tj3Var;
                    r13.m22111b0(1555557784);
                    if (str11.length() > 0) {
                        r13.m22111b0(1555573532);
                        y27 y27VarM18236U114 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r13, r15);
                        e16 e16VarMo12420a117 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r13).getClass();
                        bq1.m4042R(y27VarM18236U114, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a117, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                        r13.m22139q(r15);
                        str12 = str9;
                        r3 = r15;
                        r17 = r13;
                    } else if (str9.length() > 0) {
                        r13.m22111b0(1556023280);
                        e16 e16VarMo12420a118 = vj8Var.mo12420a(f, b16Var, true);
                        vx9 vx9Var4 = p58.m18902j(r13).f71410n;
                        ?? r212 = r13;
                        String str114 = str9;
                        boolean z8 = r15 == true ? 1 : 0;
                        lw9.m16554b(str114, e16VarMo12420a118, aa1.m198b(0.6f, p58.m18900f(r13).f55873q), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var4, r212, (i7 >> 15) & 14, 0, 130040);
                        str12 = str114;
                        ?? r114 = r212;
                        r114.m22139q(z8);
                        r3 = z8;
                        r17 = r114;
                    } else {
                        str12 = str9;
                        ?? r10 = r15;
                        r13.m22111b0(1556359909);
                        y27 y27VarM18236U115 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r13, r10 == true ? 1 : 0);
                        e16 e16VarMo12420a119 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r13).getClass();
                        bq1.m4042R(y27VarM18236U115, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a119, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                        r13.m22139q(r10);
                        r3 = r10;
                        r17 = r13;
                    }
                    r17.m22139q(r3);
                    r2 = r3;
                    r14 = r17;
                } else {
                    r13 = tj3Var;
                    str12 = str9;
                    ?? r11 = r15;
                    r13.m22111b0(1556763653);
                    y27 y27VarM18236U116 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, r13, r11 == true ? 1 : 0);
                    e16 e16VarMo12420a1110 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(r13).getClass();
                    bq1.m4042R(y27VarM18236U116, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1110, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                    r13.m22139q(r11);
                    r2 = r11;
                    r14 = r13;
                }
                r14.m22111b0(1557176945);
                if (str11.length() > 0) {
                    r14.m22111b0(1557193468);
                    y27 y27VarM18236U117 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r14, r2);
                    e16 e16VarMo12420a1111 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(r14).getClass();
                    bq1.m4042R(y27VarM18236U117, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1111, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                    r14.m22139q(r2);
                    str13 = str10;
                    r16 = r14;
                } else if (str10.length() > 0) {
                    r14.m22111b0(1557639558);
                    ?? r213 = r14;
                    String str115 = str10;
                    lw9.m16554b(str115, vj8Var.mo12420a(f, b16Var, true), p58.m18900f(r14).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(r14).f71410n, r213, (i7 >> 18) & 14, 0, 130040);
                    str13 = str115;
                    ?? r115 = r213;
                    r115.m22139q(r2);
                    r16 = r115;
                } else {
                    str13 = str10;
                    r14.m22111b0(1557955045);
                    y27 y27VarM18236U118 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r14, r2);
                    e16 e16VarMo12420a1112 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(r14).getClass();
                    bq1.m4042R(y27VarM18236U118, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1112, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                    r14.m22139q(r2);
                    r16 = r14;
                }
                r16.m22139q(r2);
                r16.m22139q(true);
                thb.m22044c(r16, c99.m4414g(b16Var, ge9.m12515a(r16).f38952a));
                str8 = str13;
                str5 = str11;
                str6 = str12;
                r12 = r16;
            } else {
                tj3Var3.m22102U();
                str8 = str7;
                r12 = tj3Var3;
            }
            x18VarM22143u = r12.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new dz9(str, z, str5, i, i2, str6, str8, z2);
            }
        }
        i8 |= 24576;
        str5 = str2;
        i3 = i2 & 32;
        if (i3 != 0) {
            if ((196608 & i) == 0) {
                str6 = str3;
                if (tj3Var3.m22120g(str6)) {
                    i4 = 131072;
                } else {
                    i4 = 65536;
                }
                i8 |= i4;
            }
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((1572864 & i) == 0) {
                    str7 = str4;
                    if (tj3Var3.m22120g(str7)) {
                        i6 = 1048576;
                    } else {
                        i6 = 524288;
                    }
                    i8 |= i6;
                }
                if ((599187 & i8) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var3.m22099R(i8 & 1, z3)) {
                    if (i9 != 0) {
                        str5 = "";
                    }
                    if (i3 != 0) {
                        str9 = "";
                    } else {
                        str9 = str6;
                    }
                    if (i5 != 0) {
                        str10 = "";
                    } else {
                        str10 = str7;
                    }
                    b16Var = b16.f7762a;
                    e16 e16VarM4412e5 = c99.m4412e(b16Var, 1.0f);
                    sj8 sj8VarM20003a5 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                    int iHashCode5 = Long.hashCode(tj3Var3.f62385T);
                    l77 l77VarM22132m5 = tj3Var3.m22132m();
                    e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e5);
                    se1.f60731q.getClass();
                    ui3Var = C0352b.f4299b;
                    tj3Var3.m22119f0();
                    if (tj3Var3.f62384S) {
                        tj3Var3.m22130l(ui3Var);
                    } else {
                        tj3Var3.m22137o0();
                    }
                    oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a5);
                    oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m5);
                    oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode5));
                    oha.m18000f(tj3Var3, C0352b.f4305h);
                    oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c5);
                    vj8Var = vj8.f65508a;
                    i7 = i8;
                    lw9.m16554b(str, vj8Var.mo12420a(0.4f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, i8 & 14, 0, 131068);
                    tj3Var = tj3Var3;
                    thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                    if (z) {
                        tj3Var.m22111b0(1554371135);
                        if (str5.length() > 0) {
                            tj3Var.m22111b0(1554415713);
                            String str116 = str5;
                            f = 0.2f;
                            lw9.m16554b(str116, vj8Var.mo12420a(0.2f, b16Var, true), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, (i7 >> 12) & 14, 0, 130040);
                            str11 = str116;
                            tj3 tj3Var8 = tj3Var;
                            z4 = false;
                            tj3Var8.m22139q(false);
                            tj3Var2 = tj3Var8;
                        } else {
                            str11 = str5;
                            f = 0.2f;
                            z4 = false;
                            tj3Var.m22111b0(1554736005);
                            y27 y27VarM18236U119 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, tj3Var, 0);
                            e16 e16VarMo12420a1113 = vj8Var.mo12420a(0.2f, b16Var, true);
                            ge9.m12515a(tj3Var).getClass();
                            bq1.m4042R(y27VarM18236U119, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1113, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                            tj3Var.m22139q(false);
                            tj3Var2 = tj3Var;
                        }
                        tj3Var2.m22139q(z4);
                        r13 = tj3Var2;
                        r15 = z4;
                    } else {
                        str11 = str5;
                        f = 0.2f;
                        r15 = 0;
                        tj3Var.m22111b0(1555139749);
                        y27 y27VarM18236U1110 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, tj3Var, 0);
                        e16 e16VarMo12420a1114 = vj8Var.mo12420a(0.2f, b16Var, true);
                        ge9.m12515a(tj3Var).getClass();
                        bq1.m4042R(y27VarM18236U1110, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1114, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                        tj3Var.m22139q(false);
                    }
                    if (z2) {
                        r13 = tj3Var;
                        r13.m22111b0(1555557784);
                        if (str11.length() > 0) {
                            r13.m22111b0(1555573532);
                            y27 y27VarM18236U1111 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r13, r15);
                            e16 e16VarMo12420a1115 = vj8Var.mo12420a(f, b16Var, true);
                            ge9.m12515a(r13).getClass();
                            bq1.m4042R(y27VarM18236U1111, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1115, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                            r13.m22139q(r15);
                            str12 = str9;
                            r3 = r15;
                            r17 = r13;
                        } else if (str9.length() > 0) {
                            r13.m22111b0(1556023280);
                            e16 e16VarMo12420a1116 = vj8Var.mo12420a(f, b16Var, true);
                            vx9 vx9Var5 = p58.m18902j(r13).f71410n;
                            ?? r214 = r13;
                            String str117 = str9;
                            boolean z9 = r15 == true ? 1 : 0;
                            lw9.m16554b(str117, e16VarMo12420a1116, aa1.m198b(0.6f, p58.m18900f(r13).f55873q), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var5, r214, (i7 >> 15) & 14, 0, 130040);
                            str12 = str117;
                            ?? r116 = r214;
                            r116.m22139q(z9);
                            r3 = z9;
                            r17 = r116;
                        } else {
                            str12 = str9;
                            ?? r117 = r15;
                            r13.m22111b0(1556359909);
                            y27 y27VarM18236U1112 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r13, r117 == true ? 1 : 0);
                            e16 e16VarMo12420a1117 = vj8Var.mo12420a(f, b16Var, true);
                            ge9.m12515a(r13).getClass();
                            bq1.m4042R(y27VarM18236U1112, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1117, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                            r13.m22139q(r117);
                            r3 = r117;
                            r17 = r13;
                        }
                        r17.m22139q(r3);
                        r2 = r3;
                        r14 = r17;
                    } else {
                        r13 = tj3Var;
                        str12 = str9;
                        ?? r118 = r15;
                        r13.m22111b0(1556763653);
                        y27 y27VarM18236U1113 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, r13, r118 == true ? 1 : 0);
                        e16 e16VarMo12420a1118 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r13).getClass();
                        bq1.m4042R(y27VarM18236U1113, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1118, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                        r13.m22139q(r118);
                        r2 = r118;
                        r14 = r13;
                    }
                    r14.m22111b0(1557176945);
                    if (str11.length() > 0) {
                        r14.m22111b0(1557193468);
                        y27 y27VarM18236U1114 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r14, r2);
                        e16 e16VarMo12420a1119 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r14).getClass();
                        bq1.m4042R(y27VarM18236U1114, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1119, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                        r14.m22139q(r2);
                        str13 = str10;
                        r16 = r14;
                    } else if (str10.length() > 0) {
                        r14.m22111b0(1557639558);
                        ?? r215 = r14;
                        String str118 = str10;
                        lw9.m16554b(str118, vj8Var.mo12420a(f, b16Var, true), p58.m18900f(r14).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(r14).f71410n, r215, (i7 >> 18) & 14, 0, 130040);
                        str13 = str118;
                        ?? r119 = r215;
                        r119.m22139q(r2);
                        r16 = r119;
                    } else {
                        str13 = str10;
                        r14.m22111b0(1557955045);
                        y27 y27VarM18236U1115 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r14, r2);
                        e16 e16VarMo12420a11110 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r14).getClass();
                        bq1.m4042R(y27VarM18236U1115, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a11110, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                        r14.m22139q(r2);
                        r16 = r14;
                    }
                    r16.m22139q(r2);
                    r16.m22139q(true);
                    thb.m22044c(r16, c99.m4414g(b16Var, ge9.m12515a(r16).f38952a));
                    str8 = str13;
                    str5 = str11;
                    str6 = str12;
                    r12 = r16;
                } else {
                    tj3Var3.m22102U();
                    str8 = str7;
                    r12 = tj3Var3;
                }
                x18VarM22143u = r12.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new dz9(str, z, str5, i, i2, str6, str8, z2);
                }
            }
            i8 |= 1572864;
            str7 = str4;
            if ((599187 & i8) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var3.m22099R(i8 & 1, z3)) {
                if (i9 != 0) {
                    str5 = "";
                }
                if (i3 != 0) {
                    str9 = "";
                } else {
                    str9 = str6;
                }
                if (i5 != 0) {
                    str10 = "";
                } else {
                    str10 = str7;
                }
                b16Var = b16.f7762a;
                e16 e16VarM4412e6 = c99.m4412e(b16Var, 1.0f);
                sj8 sj8VarM20003a6 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                int iHashCode6 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m6 = tj3Var3.m22132m();
                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e6);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a6);
                oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m6);
                oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode6));
                oha.m18000f(tj3Var3, C0352b.f4305h);
                oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c6);
                vj8Var = vj8.f65508a;
                i7 = i8;
                lw9.m16554b(str, vj8Var.mo12420a(0.4f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, i8 & 14, 0, 131068);
                tj3Var = tj3Var3;
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                if (z) {
                    tj3Var.m22111b0(1554371135);
                    if (str5.length() > 0) {
                        tj3Var.m22111b0(1554415713);
                        String str119 = str5;
                        f = 0.2f;
                        lw9.m16554b(str119, vj8Var.mo12420a(0.2f, b16Var, true), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, (i7 >> 12) & 14, 0, 130040);
                        str11 = str119;
                        tj3 tj3Var9 = tj3Var;
                        z4 = false;
                        tj3Var9.m22139q(false);
                        tj3Var2 = tj3Var9;
                    } else {
                        str11 = str5;
                        f = 0.2f;
                        z4 = false;
                        tj3Var.m22111b0(1554736005);
                        y27 y27VarM18236U1116 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, tj3Var, 0);
                        e16 e16VarMo12420a11111 = vj8Var.mo12420a(0.2f, b16Var, true);
                        ge9.m12515a(tj3Var).getClass();
                        bq1.m4042R(y27VarM18236U1116, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a11111, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                        tj3Var.m22139q(false);
                        tj3Var2 = tj3Var;
                    }
                    tj3Var2.m22139q(z4);
                    r13 = tj3Var2;
                    r15 = z4;
                } else {
                    str11 = str5;
                    f = 0.2f;
                    r15 = 0;
                    tj3Var.m22111b0(1555139749);
                    y27 y27VarM18236U1117 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, tj3Var, 0);
                    e16 e16VarMo12420a11112 = vj8Var.mo12420a(0.2f, b16Var, true);
                    ge9.m12515a(tj3Var).getClass();
                    bq1.m4042R(y27VarM18236U1117, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a11112, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                    tj3Var.m22139q(false);
                }
                if (z2) {
                    r13 = tj3Var;
                    r13.m22111b0(1555557784);
                    if (str11.length() > 0) {
                        r13.m22111b0(1555573532);
                        y27 y27VarM18236U1118 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r13, r15);
                        e16 e16VarMo12420a11113 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r13).getClass();
                        bq1.m4042R(y27VarM18236U1118, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a11113, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                        r13.m22139q(r15);
                        str12 = str9;
                        r3 = r15;
                        r17 = r13;
                    } else if (str9.length() > 0) {
                        r13.m22111b0(1556023280);
                        e16 e16VarMo12420a11114 = vj8Var.mo12420a(f, b16Var, true);
                        vx9 vx9Var6 = p58.m18902j(r13).f71410n;
                        ?? r216 = r13;
                        String str1110 = str9;
                        boolean z10 = r15 == true ? 1 : 0;
                        lw9.m16554b(str1110, e16VarMo12420a11114, aa1.m198b(0.6f, p58.m18900f(r13).f55873q), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var6, r216, (i7 >> 15) & 14, 0, 130040);
                        str12 = str1110;
                        ?? r1110 = r216;
                        r1110.m22139q(z10);
                        r3 = z10;
                        r17 = r1110;
                    } else {
                        str12 = str9;
                        ?? r1111 = r15;
                        r13.m22111b0(1556359909);
                        y27 y27VarM18236U1119 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r13, r1111 == true ? 1 : 0);
                        e16 e16VarMo12420a11115 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r13).getClass();
                        bq1.m4042R(y27VarM18236U1119, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a11115, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                        r13.m22139q(r1111);
                        r3 = r1111;
                        r17 = r13;
                    }
                    r17.m22139q(r3);
                    r2 = r3;
                    r14 = r17;
                } else {
                    r13 = tj3Var;
                    str12 = str9;
                    ?? r1112 = r15;
                    r13.m22111b0(1556763653);
                    y27 y27VarM18236U11110 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, r13, r1112 == true ? 1 : 0);
                    e16 e16VarMo12420a11116 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(r13).getClass();
                    bq1.m4042R(y27VarM18236U11110, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a11116, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                    r13.m22139q(r1112);
                    r2 = r1112;
                    r14 = r13;
                }
                r14.m22111b0(1557176945);
                if (str11.length() > 0) {
                    r14.m22111b0(1557193468);
                    y27 y27VarM18236U11111 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r14, r2);
                    e16 e16VarMo12420a11117 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(r14).getClass();
                    bq1.m4042R(y27VarM18236U11111, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a11117, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                    r14.m22139q(r2);
                    str13 = str10;
                    r16 = r14;
                } else if (str10.length() > 0) {
                    r14.m22111b0(1557639558);
                    ?? r217 = r14;
                    String str1111 = str10;
                    lw9.m16554b(str1111, vj8Var.mo12420a(f, b16Var, true), p58.m18900f(r14).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(r14).f71410n, r217, (i7 >> 18) & 14, 0, 130040);
                    str13 = str1111;
                    ?? r1113 = r217;
                    r1113.m22139q(r2);
                    r16 = r1113;
                } else {
                    str13 = str10;
                    r14.m22111b0(1557955045);
                    y27 y27VarM18236U11112 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r14, r2);
                    e16 e16VarMo12420a11118 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(r14).getClass();
                    bq1.m4042R(y27VarM18236U11112, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a11118, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                    r14.m22139q(r2);
                    r16 = r14;
                }
                r16.m22139q(r2);
                r16.m22139q(true);
                thb.m22044c(r16, c99.m4414g(b16Var, ge9.m12515a(r16).f38952a));
                str8 = str13;
                str5 = str11;
                str6 = str12;
                r12 = r16;
            } else {
                tj3Var3.m22102U();
                str8 = str7;
                r12 = tj3Var3;
            }
            x18VarM22143u = r12.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new dz9(str, z, str5, i, i2, str6, str8, z2);
            }
        }
        i8 |= 196608;
        str6 = str3;
        i5 = i2 & 64;
        if (i5 != 0) {
            if ((1572864 & i) == 0) {
                str7 = str4;
                if (tj3Var3.m22120g(str7)) {
                    i6 = 1048576;
                } else {
                    i6 = 524288;
                }
                i8 |= i6;
            }
            if ((599187 & i8) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var3.m22099R(i8 & 1, z3)) {
                if (i9 != 0) {
                    str5 = "";
                }
                if (i3 != 0) {
                    str9 = "";
                } else {
                    str9 = str6;
                }
                if (i5 != 0) {
                    str10 = "";
                } else {
                    str10 = str7;
                }
                b16Var = b16.f7762a;
                e16 e16VarM4412e7 = c99.m4412e(b16Var, 1.0f);
                sj8 sj8VarM20003a7 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
                int iHashCode7 = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m7 = tj3Var3.m22132m();
                e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e7);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a7);
                oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m7);
                oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode7));
                oha.m18000f(tj3Var3, C0352b.f4305h);
                oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c7);
                vj8Var = vj8.f65508a;
                i7 = i8;
                lw9.m16554b(str, vj8Var.mo12420a(0.4f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, i8 & 14, 0, 131068);
                tj3Var = tj3Var3;
                thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
                if (z) {
                    tj3Var.m22111b0(1554371135);
                    if (str5.length() > 0) {
                        tj3Var.m22111b0(1554415713);
                        String str1112 = str5;
                        f = 0.2f;
                        lw9.m16554b(str1112, vj8Var.mo12420a(0.2f, b16Var, true), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, (i7 >> 12) & 14, 0, 130040);
                        str11 = str1112;
                        tj3 tj3Var10 = tj3Var;
                        z4 = false;
                        tj3Var10.m22139q(false);
                        tj3Var2 = tj3Var10;
                    } else {
                        str11 = str5;
                        f = 0.2f;
                        z4 = false;
                        tj3Var.m22111b0(1554736005);
                        y27 y27VarM18236U11113 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, tj3Var, 0);
                        e16 e16VarMo12420a11119 = vj8Var.mo12420a(0.2f, b16Var, true);
                        ge9.m12515a(tj3Var).getClass();
                        bq1.m4042R(y27VarM18236U11113, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a11119, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                        tj3Var.m22139q(false);
                        tj3Var2 = tj3Var;
                    }
                    tj3Var2.m22139q(z4);
                    r13 = tj3Var2;
                    r15 = z4;
                } else {
                    str11 = str5;
                    f = 0.2f;
                    r15 = 0;
                    tj3Var.m22111b0(1555139749);
                    y27 y27VarM18236U11114 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, tj3Var, 0);
                    e16 e16VarMo12420a111110 = vj8Var.mo12420a(0.2f, b16Var, true);
                    ge9.m12515a(tj3Var).getClass();
                    bq1.m4042R(y27VarM18236U11114, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a111110, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                    tj3Var.m22139q(false);
                }
                if (z2) {
                    r13 = tj3Var;
                    r13.m22111b0(1555557784);
                    if (str11.length() > 0) {
                        r13.m22111b0(1555573532);
                        y27 y27VarM18236U11115 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r13, r15);
                        e16 e16VarMo12420a111111 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r13).getClass();
                        bq1.m4042R(y27VarM18236U11115, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a111111, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                        r13.m22139q(r15);
                        str12 = str9;
                        r3 = r15;
                        r17 = r13;
                    } else if (str9.length() > 0) {
                        r13.m22111b0(1556023280);
                        e16 e16VarMo12420a111112 = vj8Var.mo12420a(f, b16Var, true);
                        vx9 vx9Var7 = p58.m18902j(r13).f71410n;
                        ?? r218 = r13;
                        String str1113 = str9;
                        boolean z11 = r15 == true ? 1 : 0;
                        lw9.m16554b(str1113, e16VarMo12420a111112, aa1.m198b(0.6f, p58.m18900f(r13).f55873q), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var7, r218, (i7 >> 15) & 14, 0, 130040);
                        str12 = str1113;
                        ?? r1114 = r218;
                        r1114.m22139q(z11);
                        r3 = z11;
                        r17 = r1114;
                    } else {
                        str12 = str9;
                        ?? r1115 = r15;
                        r13.m22111b0(1556359909);
                        y27 y27VarM18236U11116 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r13, r1115 == true ? 1 : 0);
                        e16 e16VarMo12420a111113 = vj8Var.mo12420a(f, b16Var, true);
                        ge9.m12515a(r13).getClass();
                        bq1.m4042R(y27VarM18236U11116, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a111113, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                        r13.m22139q(r1115);
                        r3 = r1115;
                        r17 = r13;
                    }
                    r17.m22139q(r3);
                    r2 = r3;
                    r14 = r17;
                } else {
                    r13 = tj3Var;
                    str12 = str9;
                    ?? r1116 = r15;
                    r13.m22111b0(1556763653);
                    y27 y27VarM18236U11117 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, r13, r1116 == true ? 1 : 0);
                    e16 e16VarMo12420a111114 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(r13).getClass();
                    bq1.m4042R(y27VarM18236U11117, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a111114, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                    r13.m22139q(r1116);
                    r2 = r1116;
                    r14 = r13;
                }
                r14.m22111b0(1557176945);
                if (str11.length() > 0) {
                    r14.m22111b0(1557193468);
                    y27 y27VarM18236U11118 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r14, r2);
                    e16 e16VarMo12420a111115 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(r14).getClass();
                    bq1.m4042R(y27VarM18236U11118, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a111115, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                    r14.m22139q(r2);
                    str13 = str10;
                    r16 = r14;
                } else if (str10.length() > 0) {
                    r14.m22111b0(1557639558);
                    ?? r219 = r14;
                    String str1114 = str10;
                    lw9.m16554b(str1114, vj8Var.mo12420a(f, b16Var, true), p58.m18900f(r14).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(r14).f71410n, r219, (i7 >> 18) & 14, 0, 130040);
                    str13 = str1114;
                    ?? r1117 = r219;
                    r1117.m22139q(r2);
                    r16 = r1117;
                } else {
                    str13 = str10;
                    r14.m22111b0(1557955045);
                    y27 y27VarM18236U11119 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r14, r2);
                    e16 e16VarMo12420a111116 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(r14).getClass();
                    bq1.m4042R(y27VarM18236U11119, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a111116, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                    r14.m22139q(r2);
                    r16 = r14;
                }
                r16.m22139q(r2);
                r16.m22139q(true);
                thb.m22044c(r16, c99.m4414g(b16Var, ge9.m12515a(r16).f38952a));
                str8 = str13;
                str5 = str11;
                str6 = str12;
                r12 = r16;
            } else {
                tj3Var3.m22102U();
                str8 = str7;
                r12 = tj3Var3;
            }
            x18VarM22143u = r12.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new dz9(str, z, str5, i, i2, str6, str8, z2);
            }
        }
        i8 |= 1572864;
        str7 = str4;
        if ((599187 & i8) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var3.m22099R(i8 & 1, z3)) {
            if (i9 != 0) {
                str5 = "";
            }
            if (i3 != 0) {
                str9 = "";
            } else {
                str9 = str6;
            }
            if (i5 != 0) {
                str10 = "";
            } else {
                str10 = str7;
            }
            b16Var = b16.f7762a;
            e16 e16VarM4412e8 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a8 = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var3, 48);
            int iHashCode8 = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m8 = tj3Var3.m22132m();
            e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var3, e16VarM4412e8);
            se1.f60731q.getClass();
            ui3Var = C0352b.f4299b;
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var);
            } else {
                tj3Var3.m22137o0();
            }
            oha.m18001g(tj3Var3, C0352b.f4303f, sj8VarM20003a8);
            oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m8);
            oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode8));
            oha.m18000f(tj3Var3, C0352b.f4305h);
            oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c8);
            vj8Var = vj8.f65508a;
            i7 = i8;
            lw9.m16554b(str, vj8Var.mo12420a(0.4f, b16Var, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var3).f71407k, tj3Var3, i8 & 14, 0, 131068);
            tj3Var = tj3Var3;
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38952a));
            if (z) {
                tj3Var.m22111b0(1554371135);
                if (str5.length() > 0) {
                    tj3Var.m22111b0(1554415713);
                    String str1115 = str5;
                    f = 0.2f;
                    lw9.m16554b(str1115, vj8Var.mo12420a(0.2f, b16Var, true), p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71408l, tj3Var, (i7 >> 12) & 14, 0, 130040);
                    str11 = str1115;
                    tj3 tj3Var11 = tj3Var;
                    z4 = false;
                    tj3Var11.m22139q(false);
                    tj3Var2 = tj3Var11;
                } else {
                    str11 = str5;
                    f = 0.2f;
                    z4 = false;
                    tj3Var.m22111b0(1554736005);
                    y27 y27VarM18236U111110 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, tj3Var, 0);
                    e16 e16VarMo12420a111117 = vj8Var.mo12420a(0.2f, b16Var, true);
                    ge9.m12515a(tj3Var).getClass();
                    bq1.m4042R(y27VarM18236U111110, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a111117, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                    tj3Var.m22139q(false);
                    tj3Var2 = tj3Var;
                }
                tj3Var2.m22139q(z4);
                r13 = tj3Var2;
                r15 = z4;
            } else {
                str11 = str5;
                f = 0.2f;
                r15 = 0;
                tj3Var.m22111b0(1555139749);
                y27 y27VarM18236U111111 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, tj3Var, 0);
                e16 e16VarMo12420a111118 = vj8Var.mo12420a(0.2f, b16Var, true);
                ge9.m12515a(tj3Var).getClass();
                bq1.m4042R(y27VarM18236U111111, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a111118, 24.0f)), null, null, 0.0f, null, tj3Var, 56, 120);
                tj3Var.m22139q(false);
            }
            if (z2) {
                r13 = tj3Var;
                r13.m22111b0(1555557784);
                if (str11.length() > 0) {
                    r13.m22111b0(1555573532);
                    y27 y27VarM18236U111112 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r13, r15);
                    e16 e16VarMo12420a111119 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(r13).getClass();
                    bq1.m4042R(y27VarM18236U111112, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a111119, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                    r13.m22139q(r15);
                    str12 = str9;
                    r3 = r15;
                    r17 = r13;
                } else if (str9.length() > 0) {
                    r13.m22111b0(1556023280);
                    e16 e16VarMo12420a1111110 = vj8Var.mo12420a(f, b16Var, true);
                    vx9 vx9Var8 = p58.m18902j(r13).f71410n;
                    ?? r2110 = r13;
                    String str1116 = str9;
                    boolean z12 = r15 == true ? 1 : 0;
                    lw9.m16554b(str1116, e16VarMo12420a1111110, aa1.m198b(0.6f, p58.m18900f(r13).f55873q), null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9Var8, r2110, (i7 >> 15) & 14, 0, 130040);
                    str12 = str1116;
                    ?? r1118 = r2110;
                    r1118.m22139q(z12);
                    r3 = z12;
                    r17 = r1118;
                } else {
                    str12 = str9;
                    ?? r1119 = r15;
                    r13.m22111b0(1556359909);
                    y27 y27VarM18236U111113 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r13, r1119 == true ? 1 : 0);
                    e16 e16VarMo12420a1111111 = vj8Var.mo12420a(f, b16Var, true);
                    ge9.m12515a(r13).getClass();
                    bq1.m4042R(y27VarM18236U111113, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1111111, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                    r13.m22139q(r1119);
                    r3 = r1119;
                    r17 = r13;
                }
                r17.m22139q(r3);
                r2 = r3;
                r14 = r17;
            } else {
                r13 = tj3Var;
                str12 = str9;
                ?? r11110 = r15;
                r13.m22111b0(1556763653);
                y27 y27VarM18236U111114 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_not, r13, r11110 == true ? 1 : 0);
                e16 e16VarMo12420a1111112 = vj8Var.mo12420a(f, b16Var, true);
                ge9.m12515a(r13).getClass();
                bq1.m4042R(y27VarM18236U111114, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1111112, 24.0f)), null, null, 0.0f, null, r13, 56, 120);
                r13.m22139q(r11110);
                r2 = r11110;
                r14 = r13;
            }
            r14.m22111b0(1557176945);
            if (str11.length() > 0) {
                r14.m22111b0(1557193468);
                y27 y27VarM18236U111115 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has_infinite, r14, r2);
                e16 e16VarMo12420a1111113 = vj8Var.mo12420a(f, b16Var, true);
                ge9.m12515a(r14).getClass();
                bq1.m4042R(y27VarM18236U111115, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1111113, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                r14.m22139q(r2);
                str13 = str10;
                r16 = r14;
            } else if (str10.length() > 0) {
                r14.m22111b0(1557639558);
                ?? r2111 = r14;
                String str1117 = str10;
                lw9.m16554b(str1117, vj8Var.mo12420a(f, b16Var, true), p58.m18900f(r14).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, p58.m18902j(r14).f71410n, r2111, (i7 >> 18) & 14, 0, 130040);
                str13 = str1117;
                ?? r11111 = r2111;
                r11111.m22139q(r2);
                r16 = r11111;
            } else {
                str13 = str10;
                r14.m22111b0(1557955045);
                y27 y27VarM18236U111116 = AbstractC3423or.m18236U(R$drawable.ic_upgrade_feature_has, r14, r2);
                e16 e16VarMo12420a1111114 = vj8Var.mo12420a(f, b16Var, true);
                ge9.m12515a(r14).getClass();
                bq1.m4042R(y27VarM18236U111116, null, vj8Var.mo12421b(c99.m4422o(e16VarMo12420a1111114, 24.0f)), null, null, 0.0f, null, r14, 56, 120);
                r14.m22139q(r2);
                r16 = r14;
            }
            r16.m22139q(r2);
            r16.m22139q(true);
            thb.m22044c(r16, c99.m4414g(b16Var, ge9.m12515a(r16).f38952a));
            str8 = str13;
            str5 = str11;
            str6 = str12;
            r12 = r16;
        } else {
            tj3Var3.m22102U();
            str8 = str7;
            r12 = tj3Var3;
        }
        x18VarM22143u = r12.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dz9(str, z, str5, i, i2, str6, str8, z2);
        }
    }

    /* JADX INFO: renamed from: v */
    public static final void m8544v(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-335667344);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                fb2Var.getClass();
                Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
                Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
                Ref$FloatRef ref$FloatRef4 = new Ref$FloatRef();
                ref$FloatRef.f47715a = fb2Var.mo912g0(6.0f);
                ref$FloatRef2.f47715a = fb2Var.mo912g0(20.0f);
                ref$FloatRef3.f47715a = fb2Var.mo912g0(16.0f);
                ref$FloatRef4.f47715a = fb2Var.mo912g0(30.0f);
                objM22097O = new gl3(new C3357n2(ref$FloatRef4, ref$FloatRef2, ref$FloatRef3, ref$FloatRef, 19));
                tj3Var.m22131l0(objM22097O);
            }
            gl3 gl3Var = (gl3) objM22097O;
            b16 b16Var = b16.f7762a;
            e16 e16VarM19045o = pb1.m19045o(AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38960i, 0.0f, 2), 0.0f, ge9.m12515a(tj3Var).f38957f, 0.0f, 0.0f, 13), p58.m18901i(tj3Var).f64858d);
            long j = p58.m18900f(tj3Var).f55821F;
            mv3 mv3Var = ss5.f61356d;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC3584sr.m21611X(d32.m10007D(e16VarM19045o, j, mv3Var), ge9.m12515a(tj3Var).f38956e, ge9.m12515a(tj3Var).f38956e, ge9.m12515a(tj3Var).f38956e, 0.0f, 8), 0.0f, ge9.m12515a(tj3Var).f38957f, 0.0f, 0.0f, 13);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
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
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.upgrade_testimonial_title), AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), 0.0f, ge9.m12515a(tj3Var).f38957f, 1), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var).f71399c, 0L, 0L, bc3.f8322h, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var, 0, 0, 130044);
            e16 e16VarM22984g = ux5.m22984g(b16Var, 16.0f, tj3Var, b16Var, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM22984g);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.im_upgrade_steve, tj3Var, 0);
            e16 e16VarM19529y = pvc.m19529y(c99.m4422o(b16Var, 300.0f), 70.0f, 0.0f, 2);
            gc0 gc0Var = nj0.f52816k;
            ci0 ci0Var = ci0.f10109a;
            bq1.m4042R(y27VarM18236U, null, ci0Var.mo3727a(e16VarM19529y, gc0Var), null, hl1.f42566c, 0.0f, null, tj3Var, 24632, 104);
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.im_media, tj3Var, 0), null, ci0Var.mo3727a(c99.m4431x(AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 0.0f, ge9.m12515a(tj3Var).f38957f, 7), p58.m18901i(tj3Var).f64858d), d32.m10037f(2852126720L), mv3Var), ge9.m12515a(tj3Var).f38956e)), nj0.f52815j), null, null, 0.0f, null, tj3Var, 56, 120);
            e16 e16VarM21611X2 = AbstractC3584sr.m21611X(b16Var, 0.0f, 0.0f, 150.0f, 0.0f, 11);
            long j2 = p58.m18900f(tj3Var).f55846c;
            tj3Var = tj3Var;
            bq1.m4039O(e16VarM21611X2, gl3Var, te1.m21999m(0, 14, j2, 0L, tj3Var), null, null, drc.f36138r, tj3Var, 196662, 24);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cx7(i, 16);
        }
    }

    /* JADX INFO: renamed from: w */
    public static final void m8545w(final int i, final long j, final long j2, final String str, final String str2, e16 e16Var, final float f, float f2, float f3, final boolean z, long j3, int i2, float f4, float f5, final vi3 vi3Var, ye1 ye1Var, final int i3) {
        int i4;
        long j4;
        final e16 e16Var2;
        final float f6;
        final float f7;
        final long j5;
        final int i5;
        final float f8;
        final float f9;
        float f10;
        float f11;
        int i6;
        long j6;
        float f12;
        e16 e16Var3;
        int i7;
        int i8;
        float f13;
        int i9;
        long j7;
        str.getClass();
        str2.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1696834057);
        if ((i3 & 6) == 0) {
            i4 = (tj3Var.m22116e(i) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            j4 = j;
            i4 |= tj3Var.m22118f(j4) ? 32 : 16;
        } else {
            j4 = j;
        }
        if ((i3 & 384) == 0) {
            i4 |= tj3Var.m22118f(j2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= tj3Var.m22120g(str) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= tj3Var.m22120g(str2) ? 16384 : 8192;
        }
        int i10 = i4 | 196608;
        if ((i3 & 1572864) == 0) {
            i10 |= tj3Var.m22114d(f) ? 1048576 : 524288;
        }
        if ((i3 & 12582912) == 0) {
            i10 |= 4194304;
        }
        int i11 = i10 | 100663296;
        if ((i3 & 805306368) == 0) {
            i11 |= tj3Var.m22122h(z) ? 536870912 : 268435456;
        }
        int i12 = 3506 | (tj3Var.m22124i(vi3Var) ? (char) 16384 : (char) 8192);
        if (tj3Var.m22099R(i11 & 1, ((i11 & 306783379) == 306783378 && (i12 & 9363) == 9362) ? false : true)) {
            tj3Var.m22104W();
            int i13 = i3 & 1;
            b16 b16Var = b16.f7762a;
            if (i13 == 0 || tj3Var.m22084B()) {
                ((fe9) tj3Var.m22128k(ge9.f40637a)).getClass();
                f10 = 16.0f;
                f11 = 1.5f;
                i6 = i11 & (-29360129);
                j6 = j4;
                f12 = 4.0f;
                e16Var3 = b16Var;
                i7 = 3;
                i8 = i12 & (-15);
                f13 = 16.0f;
            } else {
                tj3Var.m22102U();
                f10 = f2;
                f12 = f3;
                j6 = j3;
                i7 = i2;
                f11 = f5;
                i6 = i11 & (-29360129);
                i8 = i12 & (-15);
                e16Var3 = e16Var;
                f13 = f4;
            }
            tj3Var.m22140r();
            e16 e16Var4 = e16Var3;
            float f14 = f13;
            float f15 = f10;
            float f16 = f11;
            l44 l44VarM21713i = ss5.m21713i(ss5.m21691R("pulse_transition_".concat(str), tj3Var, 0), 0.0f, 1.0f, ss5.m21687N(ss5.m21703b0(3000, 0, io2.f44352d, 2), RepeatMode.Restart, 0L, 4), "pulse_progress_".concat(str), tj3Var, 4536, 0);
            fb2 fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
            float fMo912g0 = fb2Var.mo912g0(f / 2.0f);
            float fMo912g1 = fb2Var.mo912g0(f14);
            float fMo912g2 = fb2Var.mo912g0(f16);
            e16 e16VarM4412e = c99.m4412e(e16Var4, 1.0f);
            boolean z2 = (i8 & 57344) == 16384;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z2 || objM22097O == p84Var) {
                objM22097O = new te0(vi3Var, 19);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM24741N = xwc.m24741N(e16VarM4412e, (vi3) objM22097O);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM24741N);
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
            e16 e16VarM23616X = vz1.m23616X(c99.m4422o(AbstractC3584sr.m21611X(b16Var, 0.0f, ge9.m12515a(tj3Var).f38952a, 0.0f, 0.0f, 13), f), f12, ui8.f63972a, 0L, 0L, 24);
            float f17 = f12;
            boolean zM22114d = ((i6 & 1879048192) == 536870912) | ((i6 & 112) == 32) | tj3Var.m22114d(fMo912g0) | tj3Var.m22120g(l44VarM21713i) | tj3Var.m22114d(fMo912g1);
            long j8 = j6;
            boolean zM22118f = zM22114d | tj3Var.m22118f(j8) | tj3Var.m22114d(fMo912g2);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22118f || objM22097O2 == p84Var) {
                int i14 = i7;
                objM22097O2 = new di3(z, j, fMo912g0, i14, fMo912g1, j8, fMo912g2, l44VarM21713i);
                i9 = i14;
                j7 = j8;
                tj3Var.m22131l0(objM22097O2);
            } else {
                j7 = j8;
                i9 = i7;
            }
            e16 e16VarM23655y = vz1.m23655y(e16VarM23616X, (vi3) objM22097O2);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM23655y);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var2);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            int i15 = i9;
            bq1.m4042R(AbstractC3423or.m18236U(i, tj3Var, i6 & 14), null, c99.m4422o(b16Var, f15), null, null, 0.0f, new qd0(5, j2), tj3Var, 56, 56);
            tj3Var.m22139q(true);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38957f));
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode3 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m3 = tj3Var.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var2);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
            lw9.m16554b(str, null, p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71404h, tj3Var, (i6 >> 9) & 14, 0, 131066);
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38955d));
            lw9.m16554b(str2, null, p58.m18900f(tj3Var).f55875s, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, (i6 >> 12) & 14, 0, 131066);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            f9 = f16;
            e16Var2 = e16Var4;
            i5 = i15;
            f8 = f14;
            f6 = f15;
            f7 = f17;
            j5 = j7;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            f6 = f2;
            f7 = f3;
            j5 = j3;
            i5 = i2;
            f8 = f4;
            f9 = f5;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ki3
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i3 | 1);
                    AbstractC1839a.m8545w(i, j, j2, str, str2, e16Var2, f, f6, f7, z, j5, i5, f8, f9, vi3Var, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x031b  */
    /* JADX WARN: Code duplicated, block: B:102:0x031e  */
    /* JADX WARN: Code duplicated, block: B:103:0x032a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0339  */
    /* JADX WARN: Code duplicated, block: B:107:0x033c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0350  */
    /* JADX WARN: Code duplicated, block: B:113:0x0372 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:116:0x037e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0403  */
    /* JADX WARN: Code duplicated, block: B:124:0x041c  */
    /* JADX WARN: Code duplicated, block: B:126:0x03e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x0187 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x017f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0044  */
    /* JADX WARN: Code duplicated, block: B:21:0x0053  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:42:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:47:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x013b  */
    /* JADX WARN: Code duplicated, block: B:53:0x014a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x0171  */
    /* JADX WARN: Code duplicated, block: B:65:0x0184 A[LOOP:1: B:60:0x016b->B:65:0x0184, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:70:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:82:0x0254  */
    /* JADX WARN: Code duplicated, block: B:85:0x0259  */
    /* JADX WARN: Code duplicated, block: B:86:0x0268  */
    /* JADX WARN: Code duplicated, block: B:90:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:91:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:95:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:97:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:99:0x0304  */
    /* JADX INFO: renamed from: x */
    public static final void m8546x(e16 e16Var, final List list, long j, long j2, long j3, long j4, long j5, long j6, float f, float f2, ye1 ye1Var, final int i, final int i2) {
        final long jM4212e;
        long j7;
        int i3;
        int i4;
        boolean z;
        final e16 e16Var2;
        final long j8;
        final long j9;
        final long j10;
        final long j11;
        final long j12;
        final float f3;
        final float f4;
        x18 x18VarM22143u;
        int i5;
        b16 b16Var;
        vh9 vh9Var;
        int i6;
        long jM4212e2;
        long j13;
        long j14;
        long j15;
        long j16;
        int i7;
        e16 e16Var3;
        float f5;
        float f6;
        long j17;
        Object objM22097O;
        p84 p84Var;
        Object objM22097O2;
        Object objM22097O3;
        boolean zM22120g;
        Object objM22097O4;
        ListIterator listIterator;
        float f7;
        int iNextIndex;
        e16 e16Var4;
        ui3 ui3Var;
        final qc9 qc9Var;
        final int i8;
        boolean zM22124i;
        Object objM22097O5;
        p84 p84Var2;
        List list2;
        long j18;
        long j19;
        qc9 qc9Var2;
        qc9 qc9Var3;
        int i9;
        int i10;
        wba wbaVar;
        boolean z2;
        long jM4218k;
        long j20;
        String str;
        boolean zM22116e;
        Object objM22097O6;
        int i11;
        qc9 qc9Var4;
        qc9 qc9Var5;
        qc9 qc9Var6;
        list.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1349725424);
        int i12 = i | 6 | (tj3Var.m22124i(list) ? 32 : 16);
        if ((i2 & 4) == 0) {
            jM4212e = j;
            int i13 = tj3Var.m22118f(jM4212e) ? 256 : 128;
            int i14 = i12 | i13 | 74752;
            j7 = j5;
            if ((i2 & 64) == 0 || !tj3Var.m22118f(j7)) {
                i3 = 524288;
            } else {
                i3 = 1048576;
            }
            i4 = i14 | i3 | 373293056;
            if ((306783379 & i4) != 306783378) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i4 & 1, z)) {
                tj3Var.m22104W();
                i5 = i & 1;
                b16Var = b16.f7762a;
                if (i5 != 0 || tj3Var.m22084B()) {
                    if ((i2 & 4) != 0) {
                        jM4212e = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
                        i4 &= -897;
                    }
                    vh9Var = cx2.f34676a;
                    long jM4210c = ((bx2) tj3Var.m22128k(vh9Var)).m4210c();
                    vh9 vh9Var2 = ps5.f56764b;
                    long j21 = ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55874r;
                    long j22 = ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55875s;
                    i6 = i4 & (-523265);
                    if ((i2 & 64) != 0) {
                        jM4212e2 = ((bx2) tj3Var.m22128k(vh9Var)).m4212e();
                        i6 = i4 & (-4193281);
                    } else {
                        jM4212e2 = j5;
                    }
                    j13 = ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55874r;
                    ((fe9) tj3Var.m22128k(ge9.f40637a)).getClass();
                    j14 = jM4210c;
                    j15 = j22;
                    j16 = j21;
                    i7 = i6 & (-1908408321);
                    e16Var3 = b16Var;
                    long j23 = jM4212e;
                    f5 = 6.0f;
                    f6 = 32.0f;
                    j7 = jM4212e2;
                    j17 = j23;
                } else {
                    tj3Var.m22102U();
                    if ((i2 & 4) != 0) {
                        i4 &= -897;
                    }
                    int i15 = i4 & (-523265);
                    if ((i2 & 64) != 0) {
                        i15 = i4 & (-4193281);
                    }
                    j14 = j2;
                    j16 = j3;
                    j15 = j4;
                    j13 = j6;
                    i7 = i15 & (-1908408321);
                    j17 = jM4212e;
                    e16Var3 = e16Var;
                    f5 = f;
                    f6 = f2;
                }
                tj3Var.m22140r();
                objM22097O = tj3Var.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1256f(0.0f);
                    tj3Var.m22131l0(objM22097O);
                }
                final qc9 qc9Var7 = (qc9) objM22097O;
                objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC0278f.m1256f(0.0f);
                    tj3Var.m22131l0(objM22097O2);
                }
                final qc9 qc9Var8 = (qc9) objM22097O2;
                objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = AbstractC0278f.m1256f(0.0f);
                    tj3Var.m22131l0(objM22097O3);
                }
                qc9 qc9Var9 = (qc9) objM22097O3;
                zM22120g = tj3Var.m22120g(list);
                objM22097O4 = tj3Var.m22097O();
                if (!zM22120g || objM22097O4 == p84Var) {
                    listIterator = list.listIterator(list.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            f7 = f6;
                            iNextIndex = -1;
                            break;
                        } else {
                            f7 = f6;
                            if (((wba) listIterator.previous()).f66602e) {
                                iNextIndex = listIterator.nextIndex();
                                break;
                            }
                            f6 = f7;
                        }
                    }
                    objM22097O4 = Integer.valueOf(iNextIndex);
                    tj3Var.m22131l0(objM22097O4);
                } else {
                    f7 = f6;
                }
                int iIntValue = ((Number) objM22097O4).intValue();
                vh9 vh9Var3 = AbstractC0402n.f4816h;
                int i16 = i7;
                final float fMo912g0 = ((fb2) tj3Var.m22128k(vh9Var3)).mo912g0(f7 / 2.0f);
                final float fMo912g1 = ((fb2) tj3Var.m22128k(vh9Var3)).mo912g0(f5);
                e16 e16VarM4412e = c99.m4412e(e16Var3, 1.0f);
                e16Var4 = e16Var3;
                float f8 = f5;
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m = tj3Var.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM4412e);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                zi3 zi3Var = C0352b.f4303f;
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                zi3 zi3Var2 = C0352b.f4302e;
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m);
                Integer numValueOf = Integer.valueOf(iHashCode);
                qc9Var = qc9Var9;
                zi3 zi3Var3 = C0352b.f4304g;
                oha.m18001g(tj3Var, zi3Var3, numValueOf);
                vi3 vi3Var = C0352b.f4305h;
                oha.m18000f(tj3Var, vi3Var);
                zi3 zi3Var4 = C0352b.f4301d;
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c);
                e16 e16VarM4674b = ci0.f10109a.m4674b(b16Var);
                i8 = iIntValue;
                zM22124i = tj3Var.m22124i(list) | tj3Var.m22116e(iIntValue) | ((((i16 & 3670016) ^ 1572864) <= 1048576 && tj3Var.m22118f(j7)) || (i16 & 1572864) == 1048576) | tj3Var.m22114d(fMo912g0) | tj3Var.m22114d(fMo912g1) | tj3Var.m22118f(j13);
                objM22097O5 = tj3Var.m22097O();
                if (zM22124i) {
                    p84Var2 = p84Var;
                } else {
                    p84Var2 = p84Var;
                    if (objM22097O5 == p84Var2) {
                        list2 = list;
                        j18 = j7;
                        j19 = j13;
                    }
                    eh0.m11124d(e16VarM4674b, (vi3) objM22097O5, tj3Var, 0);
                    qc9Var2 = qc9Var7;
                    bb1 bb1VarM230a = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38964m * 2.0f, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
                    qc9Var3 = qc9Var8;
                    int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m2 = tj3Var.m22132m();
                    e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
                    oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                    AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                    oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                    tj3Var.m22111b0(443365609);
                    i9 = 0;
                    for (Object obj : list2) {
                        i10 = i9 + 1;
                        if (i9 >= 0) {
                            vz1.m23628e0();
                            throw null;
                        }
                        wbaVar = (wba) obj;
                        z2 = wbaVar.f66602e;
                        if (wbaVar.f66604g) {
                            tj3Var.m22111b0(634402847);
                            jM4218k = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4218k();
                            tj3Var.m22139q(false);
                        } else if (z2) {
                            tj3Var.m22111b0(634404234);
                            tj3Var.m22139q(false);
                            jM4218k = j17;
                        } else {
                            tj3Var.m22111b0(634405708);
                            tj3Var.m22139q(false);
                            jM4218k = j16;
                        }
                        int i17 = wbaVar.f66598a;
                        if (z2) {
                            j20 = j14;
                        } else {
                            j20 = j15;
                        }
                        String strM23620a0 = vz1.m23620a0(tj3Var, wbaVar.f66599b);
                        int i18 = wbaVar.f66600c;
                        str = (String) u91.m22591I0(wbaVar.f66601d);
                        if (str == null) {
                            str = "";
                        }
                        String strM23618Z = vz1.m23618Z(i18, new Object[]{str}, tj3Var);
                        boolean z3 = wbaVar.f66603f;
                        zM22116e = tj3Var.m22116e(i9) | tj3Var.m22124i(list2) | tj3Var.m22116e(i8);
                        objM22097O6 = tj3Var.m22097O();
                        if (!zM22116e || objM22097O6 == p84Var2) {
                            qc9 qc9Var10 = qc9Var2;
                            qc9 qc9Var11 = qc9Var3;
                            qc9 qc9Var12 = qc9Var;
                            int i19 = i8;
                            objM22097O6 = new ii3(i9, list2, i19, qc9Var10, qc9Var11, qc9Var12);
                            i11 = i19;
                            qc9Var4 = qc9Var10;
                            qc9Var5 = qc9Var11;
                            qc9Var6 = qc9Var12;
                            tj3Var.m22131l0(objM22097O6);
                        } else {
                            qc9Var4 = qc9Var2;
                            qc9Var5 = qc9Var3;
                            qc9Var6 = qc9Var;
                            i11 = i8;
                        }
                        tj3 tj3Var2 = tj3Var;
                        m8545w(i17, jM4218k, j20, strM23620a0, strM23618Z, null, f7, 0.0f, 0.0f, z3, 0L, 0, 0.0f, 0.0f, (vi3) objM22097O6, tj3Var2, 0);
                        list2 = list;
                        tj3Var = tj3Var2;
                        i9 = i10;
                        qc9Var2 = qc9Var4;
                        qc9Var3 = qc9Var5;
                        qc9Var = qc9Var6;
                        i8 = i11;
                        e16Var4 = e16Var4;
                        p84Var2 = p84Var2;
                    }
                    AbstractC3393o1.m17723A(tj3Var, false, true, true);
                    f4 = f7;
                    jM4212e = j17;
                    j8 = j14;
                    j9 = j16;
                    j10 = j15;
                    j11 = j18;
                    j12 = j19;
                    f3 = f8;
                    e16Var2 = e16Var4;
                }
                final long j24 = j7;
                final long j25 = j13;
                objM22097O5 = new vi3() { // from class: hi3
                    @Override // p000.vi3
                    public final Object invoke(Object obj2) {
                        float f9;
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj2;
                        interfaceC0310a.getClass();
                        float fM19861h = qc9Var7.m19861h();
                        float fM19861h2 = qc9Var8.m19861h();
                        float fM19861h3 = qc9Var.m19861h();
                        if (list.size() > 1) {
                            float fMin = Math.min(fM19861h, fM19861h2);
                            float fMax = Math.max(fM19861h, fM19861h2);
                            float fMax2 = i8 >= 0 ? Math.max(fMin, Math.min(fMax, fM19861h3)) : fMin;
                            float f10 = fMo912g0;
                            float f11 = fMo912g1;
                            if (fMax2 > fMin) {
                                f9 = f11;
                                interfaceC0310a.mo604w(j24, (((long) Float.floatToRawIntBits(fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(f10)) << 32), (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L), f9, (496 & 16) != 0 ? 0 : 1, (496 & 32) != 0 ? null : null);
                            } else {
                                f9 = f11;
                            }
                            if (fMax > fMax2) {
                                interfaceC0310a.mo604w(j25, (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L), (((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), f9, (496 & 16) != 0 ? 0 : 1, (496 & 32) != 0 ? null : null);
                            }
                        }
                        return xfa.f68157a;
                    }
                };
                list2 = list;
                j18 = j24;
                j19 = j25;
                tj3Var.m22131l0(objM22097O5);
                eh0.m11124d(e16VarM4674b, (vi3) objM22097O5, tj3Var, 0);
                qc9Var2 = qc9Var7;
                bb1 bb1VarM230a2 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38964m * 2.0f, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
                qc9Var3 = qc9Var8;
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, b16Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, bb1VarM230a2);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c3);
                tj3Var.m22111b0(443365609);
                i9 = 0;
                while (r28.hasNext()) {
                    i10 = i9 + 1;
                    if (i9 >= 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    wbaVar = (wba) obj;
                    z2 = wbaVar.f66602e;
                    if (wbaVar.f66604g) {
                        tj3Var.m22111b0(634402847);
                        jM4218k = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4218k();
                        tj3Var.m22139q(false);
                    } else if (z2) {
                        tj3Var.m22111b0(634404234);
                        tj3Var.m22139q(false);
                        jM4218k = j17;
                    } else {
                        tj3Var.m22111b0(634405708);
                        tj3Var.m22139q(false);
                        jM4218k = j16;
                    }
                    int i110 = wbaVar.f66598a;
                    if (z2) {
                        j20 = j14;
                    } else {
                        j20 = j15;
                    }
                    String strM23620a1 = vz1.m23620a0(tj3Var, wbaVar.f66599b);
                    int i111 = wbaVar.f66600c;
                    str = (String) u91.m22591I0(wbaVar.f66601d);
                    if (str == null) {
                        str = "";
                    }
                    String strM23618Z2 = vz1.m23618Z(i111, new Object[]{str}, tj3Var);
                    boolean z4 = wbaVar.f66603f;
                    zM22116e = tj3Var.m22116e(i9) | tj3Var.m22124i(list2) | tj3Var.m22116e(i8);
                    objM22097O6 = tj3Var.m22097O();
                    if (zM22116e) {
                        qc9 qc9Var13 = qc9Var2;
                        qc9 qc9Var14 = qc9Var3;
                        qc9 qc9Var15 = qc9Var;
                        int i112 = i8;
                        objM22097O6 = new ii3(i9, list2, i112, qc9Var13, qc9Var14, qc9Var15);
                        i11 = i112;
                        qc9Var4 = qc9Var13;
                        qc9Var5 = qc9Var14;
                        qc9Var6 = qc9Var15;
                        tj3Var.m22131l0(objM22097O6);
                    } else {
                        qc9 qc9Var16 = qc9Var2;
                        qc9 qc9Var17 = qc9Var3;
                        qc9 qc9Var18 = qc9Var;
                        int i113 = i8;
                        objM22097O6 = new ii3(i9, list2, i113, qc9Var16, qc9Var17, qc9Var18);
                        i11 = i113;
                        qc9Var4 = qc9Var16;
                        qc9Var5 = qc9Var17;
                        qc9Var6 = qc9Var18;
                        tj3Var.m22131l0(objM22097O6);
                    }
                    tj3 tj3Var3 = tj3Var;
                    m8545w(i110, jM4218k, j20, strM23620a1, strM23618Z2, null, f7, 0.0f, 0.0f, z4, 0L, 0, 0.0f, 0.0f, (vi3) objM22097O6, tj3Var3, 0);
                    list2 = list;
                    tj3Var = tj3Var3;
                    i9 = i10;
                    qc9Var2 = qc9Var4;
                    qc9Var3 = qc9Var5;
                    qc9Var = qc9Var6;
                    i8 = i11;
                    e16Var4 = e16Var4;
                    p84Var2 = p84Var2;
                }
                AbstractC3393o1.m17723A(tj3Var, false, true, true);
                f4 = f7;
                jM4212e = j17;
                j8 = j14;
                j9 = j16;
                j10 = j15;
                j11 = j18;
                j12 = j19;
                f3 = f8;
                e16Var2 = e16Var4;
            } else {
                tj3Var.m22102U();
                e16Var2 = e16Var;
                j8 = j2;
                j9 = j3;
                j10 = j4;
                j11 = j5;
                j12 = j6;
                f3 = f;
                f4 = f2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3(list, jM4212e, j8, j9, j10, j11, j12, f3, f4, i, i2) { // from class: ji3

                    /* JADX INFO: renamed from: b */
                    public final /* synthetic */ List f45567b;

                    /* JADX INFO: renamed from: c */
                    public final /* synthetic */ long f45568c;

                    /* JADX INFO: renamed from: d */
                    public final /* synthetic */ long f45569d;

                    /* JADX INFO: renamed from: e */
                    public final /* synthetic */ long f45570e;

                    /* JADX INFO: renamed from: f */
                    public final /* synthetic */ long f45571f;

                    /* JADX INFO: renamed from: g */
                    public final /* synthetic */ long f45572g;

                    /* JADX INFO: renamed from: h */
                    public final /* synthetic */ long f45573h;

                    /* JADX INFO: renamed from: i */
                    public final /* synthetic */ float f45574i;

                    /* JADX INFO: renamed from: j */
                    public final /* synthetic */ float f45575j;

                    /* JADX INFO: renamed from: k */
                    public final /* synthetic */ int f45576k;

                    {
                        this.f45576k = i2;
                    }

                    @Override // p000.zi3
                    public final Object invoke(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int iM19383z = pk9.m19383z(1);
                        AbstractC1839a.m8546x(this.f45566a, this.f45567b, this.f45568c, this.f45569d, this.f45570e, this.f45571f, this.f45572g, this.f45573h, this.f45574i, this.f45575j, (ye1) obj2, iM19383z, this.f45576k);
                        return xfa.f68157a;
                    }
                };
            }
        }
        jM4212e = j;
        int i114 = i12 | i13 | 74752;
        j7 = j5;
        if ((i2 & 64) == 0) {
            i3 = 524288;
        } else {
            i3 = 524288;
        }
        i4 = i114 | i3 | 373293056;
        if ((306783379 & i4) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i4 & 1, z)) {
            tj3Var.m22104W();
            i5 = i & 1;
            b16Var = b16.f7762a;
            if (i5 != 0) {
                if ((i2 & 4) != 0) {
                    jM4212e = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
                    i4 &= -897;
                }
                vh9Var = cx2.f34676a;
                long jM4210c2 = ((bx2) tj3Var.m22128k(vh9Var)).m4210c();
                vh9 vh9Var4 = ps5.f56764b;
                long j26 = ((ms5) tj3Var.m22128k(vh9Var4)).f51799a.f55874r;
                long j27 = ((ms5) tj3Var.m22128k(vh9Var4)).f51799a.f55875s;
                i6 = i4 & (-523265);
                if ((i2 & 64) != 0) {
                    jM4212e2 = ((bx2) tj3Var.m22128k(vh9Var)).m4212e();
                    i6 = i4 & (-4193281);
                } else {
                    jM4212e2 = j5;
                }
                j13 = ((ms5) tj3Var.m22128k(vh9Var4)).f51799a.f55874r;
                ((fe9) tj3Var.m22128k(ge9.f40637a)).getClass();
                j14 = jM4210c2;
                j15 = j27;
                j16 = j26;
                i7 = i6 & (-1908408321);
                e16Var3 = b16Var;
                long j28 = jM4212e;
                f5 = 6.0f;
                f6 = 32.0f;
                j7 = jM4212e2;
                j17 = j28;
            } else {
                if ((i2 & 4) != 0) {
                    jM4212e = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e();
                    i4 &= -897;
                }
                vh9Var = cx2.f34676a;
                long jM4210c3 = ((bx2) tj3Var.m22128k(vh9Var)).m4210c();
                vh9 vh9Var5 = ps5.f56764b;
                long j29 = ((ms5) tj3Var.m22128k(vh9Var5)).f51799a.f55874r;
                long j210 = ((ms5) tj3Var.m22128k(vh9Var5)).f51799a.f55875s;
                i6 = i4 & (-523265);
                if ((i2 & 64) != 0) {
                    jM4212e2 = ((bx2) tj3Var.m22128k(vh9Var)).m4212e();
                    i6 = i4 & (-4193281);
                } else {
                    jM4212e2 = j5;
                }
                j13 = ((ms5) tj3Var.m22128k(vh9Var5)).f51799a.f55874r;
                ((fe9) tj3Var.m22128k(ge9.f40637a)).getClass();
                j14 = jM4210c3;
                j15 = j210;
                j16 = j29;
                i7 = i6 & (-1908408321);
                e16Var3 = b16Var;
                long j211 = jM4212e;
                f5 = 6.0f;
                f6 = 32.0f;
                j7 = jM4212e2;
                j17 = j211;
            }
            tj3Var.m22140r();
            objM22097O = tj3Var.m22097O();
            p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1256f(0.0f);
                tj3Var.m22131l0(objM22097O);
            }
            final qc9 qc9Var19 = (qc9) objM22097O;
            objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1256f(0.0f);
                tj3Var.m22131l0(objM22097O2);
            }
            final qc9 qc9Var20 = (qc9) objM22097O2;
            objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1256f(0.0f);
                tj3Var.m22131l0(objM22097O3);
            }
            qc9 qc9Var21 = (qc9) objM22097O3;
            zM22120g = tj3Var.m22120g(list);
            objM22097O4 = tj3Var.m22097O();
            if (zM22120g) {
                listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        f7 = f6;
                        iNextIndex = -1;
                        break;
                    } else {
                        f7 = f6;
                        if (((wba) listIterator.previous()).f66602e) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                        f6 = f7;
                    }
                }
                objM22097O4 = Integer.valueOf(iNextIndex);
                tj3Var.m22131l0(objM22097O4);
            } else {
                listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        f7 = f6;
                        iNextIndex = -1;
                        break;
                    } else {
                        f7 = f6;
                        if (((wba) listIterator.previous()).f66602e) {
                            iNextIndex = listIterator.nextIndex();
                            break;
                        }
                        f6 = f7;
                    }
                }
                objM22097O4 = Integer.valueOf(iNextIndex);
                tj3Var.m22131l0(objM22097O4);
            }
            int iIntValue2 = ((Number) objM22097O4).intValue();
            vh9 vh9Var6 = AbstractC0402n.f4816h;
            int i115 = i7;
            final float fMo912g2 = ((fb2) tj3Var.m22128k(vh9Var6)).mo912g0(f7 / 2.0f);
            final float fMo912g3 = ((fb2) tj3Var.m22128k(vh9Var6)).mo912g0(f5);
            e16 e16VarM4412e2 = c99.m4412e(e16Var3, 1.0f);
            e16Var4 = e16Var3;
            float f9 = f5;
            ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52808c, false);
            int iHashCode4 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m4 = tj3Var.m22132m();
            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM4412e2);
            se1.f60731q.getClass();
            ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var5 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var5, ht5VarM19966d2);
            zi3 zi3Var6 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var6, l77VarM22132m4);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            qc9Var = qc9Var21;
            zi3 zi3Var7 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var7, numValueOf2);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var2);
            zi3 zi3Var8 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var8, e16VarM1322c4);
            e16 e16VarM4674b2 = ci0.f10109a.m4674b(b16Var);
            i8 = iIntValue2;
            zM22124i = tj3Var.m22124i(list) | tj3Var.m22116e(iIntValue2) | ((((i115 & 3670016) ^ 1572864) <= 1048576 && tj3Var.m22118f(j7)) || (i115 & 1572864) == 1048576) | tj3Var.m22114d(fMo912g2) | tj3Var.m22114d(fMo912g3) | tj3Var.m22118f(j13);
            objM22097O5 = tj3Var.m22097O();
            if (zM22124i) {
                p84Var2 = p84Var;
                if (objM22097O5 == p84Var2) {
                    list2 = list;
                    j18 = j7;
                    j19 = j13;
                }
                eh0.m11124d(e16VarM4674b2, (vi3) objM22097O5, tj3Var, 0);
                qc9Var2 = qc9Var19;
                bb1 bb1VarM230a3 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38964m * 2.0f, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
                qc9Var3 = qc9Var20;
                int iHashCode5 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m5 = tj3Var.m22132m();
                e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, b16Var);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var5, bb1VarM230a3);
                oha.m18001g(tj3Var, zi3Var6, l77VarM22132m5);
                AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var7, tj3Var, vi3Var2);
                oha.m18001g(tj3Var, zi3Var8, e16VarM1322c5);
                tj3Var.m22111b0(443365609);
                i9 = 0;
                while (r28.hasNext()) {
                    i10 = i9 + 1;
                    if (i9 >= 0) {
                        vz1.m23628e0();
                        throw null;
                    }
                    wbaVar = (wba) obj;
                    z2 = wbaVar.f66602e;
                    if (wbaVar.f66604g) {
                        tj3Var.m22111b0(634402847);
                        jM4218k = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4218k();
                        tj3Var.m22139q(false);
                    } else if (z2) {
                        tj3Var.m22111b0(634404234);
                        tj3Var.m22139q(false);
                        jM4218k = j17;
                    } else {
                        tj3Var.m22111b0(634405708);
                        tj3Var.m22139q(false);
                        jM4218k = j16;
                    }
                    int i116 = wbaVar.f66598a;
                    if (z2) {
                        j20 = j14;
                    } else {
                        j20 = j15;
                    }
                    String strM23620a2 = vz1.m23620a0(tj3Var, wbaVar.f66599b);
                    int i117 = wbaVar.f66600c;
                    str = (String) u91.m22591I0(wbaVar.f66601d);
                    if (str == null) {
                        str = "";
                    }
                    String strM23618Z3 = vz1.m23618Z(i117, new Object[]{str}, tj3Var);
                    boolean z5 = wbaVar.f66603f;
                    zM22116e = tj3Var.m22116e(i9) | tj3Var.m22124i(list2) | tj3Var.m22116e(i8);
                    objM22097O6 = tj3Var.m22097O();
                    if (zM22116e) {
                        qc9 qc9Var110 = qc9Var2;
                        qc9 qc9Var111 = qc9Var3;
                        qc9 qc9Var112 = qc9Var;
                        int i118 = i8;
                        objM22097O6 = new ii3(i9, list2, i118, qc9Var110, qc9Var111, qc9Var112);
                        i11 = i118;
                        qc9Var4 = qc9Var110;
                        qc9Var5 = qc9Var111;
                        qc9Var6 = qc9Var112;
                        tj3Var.m22131l0(objM22097O6);
                    } else {
                        qc9 qc9Var113 = qc9Var2;
                        qc9 qc9Var114 = qc9Var3;
                        qc9 qc9Var115 = qc9Var;
                        int i119 = i8;
                        objM22097O6 = new ii3(i9, list2, i119, qc9Var113, qc9Var114, qc9Var115);
                        i11 = i119;
                        qc9Var4 = qc9Var113;
                        qc9Var5 = qc9Var114;
                        qc9Var6 = qc9Var115;
                        tj3Var.m22131l0(objM22097O6);
                    }
                    tj3 tj3Var4 = tj3Var;
                    m8545w(i116, jM4218k, j20, strM23620a2, strM23618Z3, null, f7, 0.0f, 0.0f, z5, 0L, 0, 0.0f, 0.0f, (vi3) objM22097O6, tj3Var4, 0);
                    list2 = list;
                    tj3Var = tj3Var4;
                    i9 = i10;
                    qc9Var2 = qc9Var4;
                    qc9Var3 = qc9Var5;
                    qc9Var = qc9Var6;
                    i8 = i11;
                    e16Var4 = e16Var4;
                    p84Var2 = p84Var2;
                }
                AbstractC3393o1.m17723A(tj3Var, false, true, true);
                f4 = f7;
                jM4212e = j17;
                j8 = j14;
                j9 = j16;
                j10 = j15;
                j11 = j18;
                j12 = j19;
                f3 = f9;
                e16Var2 = e16Var4;
            } else {
                p84Var2 = p84Var;
            }
            final long j212 = j7;
            final long j213 = j13;
            objM22097O5 = new vi3() { // from class: hi3
                @Override // p000.vi3
                public final Object invoke(Object obj2) {
                    float f10;
                    InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj2;
                    interfaceC0310a.getClass();
                    float fM19861h = qc9Var19.m19861h();
                    float fM19861h2 = qc9Var20.m19861h();
                    float fM19861h3 = qc9Var.m19861h();
                    if (list.size() > 1) {
                        float fMin = Math.min(fM19861h, fM19861h2);
                        float fMax = Math.max(fM19861h, fM19861h2);
                        float fMax2 = i8 >= 0 ? Math.max(fMin, Math.min(fMax, fM19861h3)) : fMin;
                        float f11 = fMo912g2;
                        float f12 = fMo912g3;
                        if (fMax2 > fMin) {
                            f10 = f12;
                            interfaceC0310a.mo604w(j212, (((long) Float.floatToRawIntBits(fMin)) & 4294967295L) | (((long) Float.floatToRawIntBits(f11)) << 32), (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L), f10, (496 & 16) != 0 ? 0 : 1, (496 & 32) != 0 ? null : null);
                        } else {
                            f10 = f12;
                        }
                        if (fMax > fMax2) {
                            interfaceC0310a.mo604w(j213, (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L), (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L), f10, (496 & 16) != 0 ? 0 : 1, (496 & 32) != 0 ? null : null);
                        }
                    }
                    return xfa.f68157a;
                }
            };
            list2 = list;
            j18 = j212;
            j19 = j213;
            tj3Var.m22131l0(objM22097O5);
            eh0.m11124d(e16VarM4674b2, (vi3) objM22097O5, tj3Var, 0);
            qc9Var2 = qc9Var19;
            bb1 bb1VarM230a4 = ab1.m230a(new C3661uu(((fe9) tj3Var.m22128k(ge9.f40637a)).f38964m * 2.0f, true, new gm5(28)), nj0.f52791J, tj3Var, 0);
            qc9Var3 = qc9Var20;
            int iHashCode6 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m6 = tj3Var.m22132m();
            e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, b16Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var5, bb1VarM230a4);
            oha.m18001g(tj3Var, zi3Var6, l77VarM22132m6);
            AbstractC3393o1.m17747v(iHashCode6, tj3Var, zi3Var7, tj3Var, vi3Var2);
            oha.m18001g(tj3Var, zi3Var8, e16VarM1322c6);
            tj3Var.m22111b0(443365609);
            i9 = 0;
            while (r28.hasNext()) {
                i10 = i9 + 1;
                if (i9 >= 0) {
                    vz1.m23628e0();
                    throw null;
                }
                wbaVar = (wba) obj;
                z2 = wbaVar.f66602e;
                if (wbaVar.f66604g) {
                    tj3Var.m22111b0(634402847);
                    jM4218k = ((bx2) tj3Var.m22128k(cx2.f34676a)).m4218k();
                    tj3Var.m22139q(false);
                } else if (z2) {
                    tj3Var.m22111b0(634404234);
                    tj3Var.m22139q(false);
                    jM4218k = j17;
                } else {
                    tj3Var.m22111b0(634405708);
                    tj3Var.m22139q(false);
                    jM4218k = j16;
                }
                int i1110 = wbaVar.f66598a;
                if (z2) {
                    j20 = j14;
                } else {
                    j20 = j15;
                }
                String strM23620a3 = vz1.m23620a0(tj3Var, wbaVar.f66599b);
                int i1111 = wbaVar.f66600c;
                str = (String) u91.m22591I0(wbaVar.f66601d);
                if (str == null) {
                    str = "";
                }
                String strM23618Z4 = vz1.m23618Z(i1111, new Object[]{str}, tj3Var);
                boolean z6 = wbaVar.f66603f;
                zM22116e = tj3Var.m22116e(i9) | tj3Var.m22124i(list2) | tj3Var.m22116e(i8);
                objM22097O6 = tj3Var.m22097O();
                if (zM22116e) {
                    qc9 qc9Var116 = qc9Var2;
                    qc9 qc9Var117 = qc9Var3;
                    qc9 qc9Var118 = qc9Var;
                    int i1112 = i8;
                    objM22097O6 = new ii3(i9, list2, i1112, qc9Var116, qc9Var117, qc9Var118);
                    i11 = i1112;
                    qc9Var4 = qc9Var116;
                    qc9Var5 = qc9Var117;
                    qc9Var6 = qc9Var118;
                    tj3Var.m22131l0(objM22097O6);
                } else {
                    qc9 qc9Var119 = qc9Var2;
                    qc9 qc9Var1110 = qc9Var3;
                    qc9 qc9Var1111 = qc9Var;
                    int i1113 = i8;
                    objM22097O6 = new ii3(i9, list2, i1113, qc9Var119, qc9Var1110, qc9Var1111);
                    i11 = i1113;
                    qc9Var4 = qc9Var119;
                    qc9Var5 = qc9Var1110;
                    qc9Var6 = qc9Var1111;
                    tj3Var.m22131l0(objM22097O6);
                }
                tj3 tj3Var5 = tj3Var;
                m8545w(i1110, jM4218k, j20, strM23620a3, strM23618Z4, null, f7, 0.0f, 0.0f, z6, 0L, 0, 0.0f, 0.0f, (vi3) objM22097O6, tj3Var5, 0);
                list2 = list;
                tj3Var = tj3Var5;
                i9 = i10;
                qc9Var2 = qc9Var4;
                qc9Var3 = qc9Var5;
                qc9Var = qc9Var6;
                i8 = i11;
                e16Var4 = e16Var4;
                p84Var2 = p84Var2;
            }
            AbstractC3393o1.m17723A(tj3Var, false, true, true);
            f4 = f7;
            jM4212e = j17;
            j8 = j14;
            j9 = j16;
            j10 = j15;
            j11 = j18;
            j12 = j19;
            f3 = f9;
            e16Var2 = e16Var4;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            j8 = j2;
            j9 = j3;
            j10 = j4;
            j11 = j5;
            j12 = j6;
            f3 = f;
            f4 = f2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(list, jM4212e, j8, j9, j10, j11, j12, f3, f4, i, i2) { // from class: ji3

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ List f45567b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f45568c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ long f45569d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ long f45570e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ long f45571f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ long f45572g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ long f45573h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ float f45574i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ float f45575j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ int f45576k;

                {
                    this.f45576k = i2;
                }

                @Override // p000.zi3
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC1839a.m8546x(this.f45566a, this.f45567b, this.f45568c, this.f45569d, this.f45570e, this.f45571f, this.f45572g, this.f45573h, this.f45574i, this.f45575j, (ye1) obj2, iM19383z, this.f45576k);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: y */
    public static final void m8547y(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1219210205);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38960i, 0.0f, 2), 0.0f, ge9.m12515a(tj3Var).f38957f, 0.0f, 0.0f, 13), p58.m18901i(tj3Var).f64858d), p58.m18900f(tj3Var).f55821F, ss5.f61356d), ge9.m12515a(tj3Var).f38956e), 0.0f, ge9.m12515a(tj3Var).f38957f, 1);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
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
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.im_trophy, tj3Var, 0), null, c99.m4414g(c99.m4431x(b16Var), 80.0f), null, null, 0.0f, null, tj3Var, 440, 120);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, ge9.m12515a(tj3Var).f38957f));
            lw9.m16555c(m8520F(vz1.m23620a0(tj3Var, R$string.upgrade_most_effective), tj3Var), c99.m4412e(b16Var, 1.0f), 0L, null, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, p58.m18902j(tj3Var).f71406j, tj3Var, 48, 0, 262140);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cx7(i, 18);
        }
    }

    /* JADX INFO: renamed from: z */
    public static final void m8548z(ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(261509823);
        if (tj3Var.m22099R(i & 1, i != 0)) {
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(AbstractC3584sr.m21607T(d32.m10007D(pb1.m19045o(AbstractC3584sr.m21611X(AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38960i, 0.0f, 2), 0.0f, ge9.m12515a(tj3Var).f38957f, 0.0f, 0.0f, 13), p58.m18901i(tj3Var).f64858d), p58.m18900f(tj3Var).f55821F, ss5.f61356d), ge9.m12515a(tj3Var).f38956e), 0.0f, ge9.m12515a(tj3Var).f38957f, 1);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
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
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            lw9.m16554b(vz1.m23620a0(tj3Var, R$string.upgrade_trusted_message), c99.m4412e(b16Var, 1.0f), 0L, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 0, 0, null, vx9.m23584b(p58.m18902j(tj3Var).f71399c, 0L, 0L, bc3.f8322h, null, null, 0L, null, null, 0, 0L, null, 16777211), tj3Var, 48, 0, 130044);
            tj3Var = tj3Var;
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ge9.m12515a(tj3Var).f38957f));
            bq1.m4042R(AbstractC3423or.m18236U(R$drawable.im_upgrade_reviews_stats, tj3Var, 0), null, c99.m4430w(b16Var, null, 3), null, hl1.f42566c, 0.0f, null, tj3Var, 25016, 104);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new cx7(i, 17);
        }
    }
}
