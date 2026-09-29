package com.lingq.feature.dictionary;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.lazy.C0127b;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.viewinterop.AbstractC0443c;
import androidx.compose.runtime.AbstractC0278f;
import androidx.lifecycle.compose.AbstractC0711a;
import com.lingq.core.domain.model.language.DictionaryData;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.p012ui.dragdrop.C1919b;
import com.lingq.feature.dictionary.C2068l;
import com.lingq.feature.dictionary.C2069m;
import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3003fj;
import p000.AbstractC3352my;
import p000.AbstractC3393o1;
import p000.AbstractC3423or;
import p000.AbstractC3584sr;
import p000.C0839c9;
import p000.C0844ce;
import p000.C2919d9;
import p000.C3180kd;
import p000.C3357n2;
import p000.C3386nv;
import p000.C3522r4;
import p000.C3549ru;
import p000.C3577sk;
import p000.C3661uu;
import p000.C3799yk;
import p000.C3836zk;
import p000.ab1;
import p000.af2;
import p000.aj3;
import p000.as4;
import p000.b16;
import p000.b34;
import p000.bb1;
import p000.bna;
import p000.bq1;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.dn7;
import p000.dua;
import p000.e16;
import p000.ef2;
import p000.eh0;
import p000.fa4;
import p000.fc0;
import p000.fe9;
import p000.ff2;
import p000.g54;
import p000.ge9;
import p000.gf2;
import p000.gj4;
import p000.gm5;
import p000.gr3;
import p000.hj4;
import p000.hl1;
import p000.ht5;
import p000.ibd;
import p000.ik0;
import p000.ke2;
import p000.ks9;
import p000.l77;
import p000.ld9;
import p000.le2;
import p000.lf2;
import p000.ln0;
import p000.lw9;
import p000.mn0;
import p000.ms5;
import p000.mv4;
import p000.nj0;
import p000.nu1;
import p000.nw1;
import p000.oha;
import p000.omd;
import p000.opb;
import p000.or1;
import p000.p58;
import p000.p84;
import p000.pb1;
import p000.pfa;
import p000.ps5;
import p000.qh0;
import p000.qj8;
import p000.r46;
import p000.rpb;
import p000.rw1;
import p000.sc9;
import p000.se1;
import p000.sg4;
import p000.si5;
import p000.si8;
import p000.sj8;
import p000.t17;
import p000.t66;
import p000.t70;
import p000.te1;
import p000.thb;
import p000.tj3;
import p000.ty3;
import p000.ui3;
import p000.ui8;
import p000.un1;
import p000.vh9;
import p000.vi3;
import p000.vx9;
import p000.vy0;
import p000.vz1;
import p000.we1;
import p000.wq1;
import p000.x18;
import p000.xfa;
import p000.xi3;
import p000.xy0;
import p000.y27;
import p000.y38;
import p000.ye1;
import p000.yoc;
import p000.ze2;
import p000.zf1;
import p000.zf2;
import p000.zg0;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.dictionary.d */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2059d {
    /* JADX INFO: renamed from: a */
    public static final void m8965a(DictionaryData dictionaryData, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(293360872);
        int i3 = (tj3Var.m22124i(dictionaryData) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var.m22099R(i3 & 1, (i3 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            b16 b16Var = b16.f7762a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var).f38965n, ge9.m12515a(tj3Var).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
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
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            boolean zM22120g = tj3Var.m22120g(dictionaryData.f19014g);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = Integer.valueOf(AbstractC3423or.m18282v(context, dictionaryData.f19014g));
                tj3Var.m22131l0(objM22097O);
            }
            int iIntValue = ((Number) objM22097O).intValue();
            if (iIntValue != 0) {
                tj3Var.m22111b0(-282977092);
                bq1.m4042R(AbstractC3423or.m18236U(iIntValue, tj3Var, 0), dictionaryData.f19014g, pb1.m19045o(wq1.m24108d(tj3Var, b16Var, 32.0f), ui8.f63972a), null, hl1.f42570g, 0.0f, null, tj3Var, 24584, 104);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-282657730);
                tj3Var.m22139q(false);
            }
            lw9.m16554b(dictionaryData.m8022a(), AbstractC3584sr.m21611X(b16Var, ge9.m12515a(tj3Var).f38956e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71406j, tj3Var, 0, 0, 131068);
            thb.m22044c(tj3Var, new as4(1.0f, true));
            i2 = 1;
            omd.m18141c(ui3Var, null, false, null, null, opb.f54705b, tj3Var, ((i3 >> 3) & 14) | 1572864, 62);
            tj3Var = tj3Var;
            ty3.m22351a(yoc.m25219a(), vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.ui_reorder), wq1.m24108d(tj3Var, b16Var, 24.0f), p58.m18900f(tj3Var).f55875s, tj3Var, 0, 0);
            tj3Var.m22139q(true);
        } else {
            i2 = 1;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new af2(dictionaryData, ui3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8966b(DictionaryData dictionaryData, ui3 ui3Var, ye1 ye1Var, int i) {
        zf1 zf1Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(359804239);
        int i2 = (tj3Var.m22124i(dictionaryData) ? 4 : 2) | i | (tj3Var.m22124i(ui3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var2 = ge9.f40637a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(e16VarM4412e, ((fe9) tj3Var.m22128k(zf1Var2)).f38965n, ((fe9) tj3Var.m22128k(zf1Var2)).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
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
            oha.m18001g(tj3Var, C0352b.f4303f, sj8VarM20003a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            boolean zM22120g = tj3Var.m22120g(dictionaryData.f19014g);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                objM22097O = Integer.valueOf(AbstractC3423or.m18282v(context, dictionaryData.f19014g));
                tj3Var.m22131l0(objM22097O);
            }
            int iIntValue = ((Number) objM22097O).intValue();
            if (iIntValue != 0) {
                tj3Var.m22111b0(1006194093);
                y27 y27VarM18236U = AbstractC3423or.m18236U(iIntValue, tj3Var, 0);
                String str = dictionaryData.f19014g;
                ((fe9) tj3Var.m22128k(zf1Var2)).getClass();
                zf1Var = zf1Var2;
                bq1.m4042R(y27VarM18236U, str, pb1.m19045o(c99.m4422o(b16Var, 32.0f), ui8.f63972a), null, hl1.f42570g, 0.0f, null, tj3Var, 24584, 104);
                tj3Var.m22139q(false);
            } else {
                zf1Var = zf1Var2;
                tj3Var.m22111b0(1006513455);
                tj3Var.m22139q(false);
            }
            lw9.m16554b(dictionaryData.m8022a(), AbstractC3584sr.m21611X(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, 0, 0, 131068);
            thb.m22044c(tj3Var, new as4(1.0f, true));
            omd.m18141c(ui3Var, null, false, null, null, opb.f54706c, tj3Var, ((i2 >> 3) & 14) | 1572864, 62);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new af2(dictionaryData, ui3Var, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8967c(String str, String str2, TokenMeaning tokenMeaning, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        str.getClass();
        str2.getClass();
        tokenMeaning.getClass();
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(888802212);
        int i2 = i | (tj3Var2.m22120g(str) ? 4 : 2) | (tj3Var2.m22120g(str2) ? 32 : 16) | (tj3Var2.m22124i(tokenMeaning) ? 256 : 128) | (tj3Var2.m22124i(ui3Var) ? 2048 : 1024);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c(ui3Var, null, AbstractC0231g.m1154g(true, tj3Var2, 6, 2), 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(-1931128062, new C3357n2((Object) str, (Object) str2, (Object) tokenMeaning, (xi3) ui3Var, 4), tj3Var2), tj3Var, ((i2 >> 9) & 14) | 24576, 3078, 7146);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9((Object) str, (Object) str2, (Object) tokenMeaning, (Object) ui3Var, i, 8);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m8968d(String str, String str2, TokenMeaning tokenMeaning, ui3 ui3Var, C2061e c2061e, ye1 ye1Var, int i) {
        C2061e c2061e2;
        C2061e c2061e3;
        int i2;
        C2061e c2061e4;
        Object value;
        str.getClass();
        str2.getClass();
        tokenMeaning.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1442644624);
        int i3 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22124i(tokenMeaning) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | 8192;
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2061e3 = (C2061e) pfa.m19114d(y38.m24933a(C2061e.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i2 = i3 & (-57345);
                }
            } else {
                tj3Var.m22102U();
                i2 = i3 & (-57345);
                c2061e3 = c2061e;
            }
            tj3Var.m22140r();
            t66 t66VarM2513c = AbstractC0711a.m2513c(c2061e3.f25822i, tj3Var);
            if (((le2) t66VarM2513c.getValue()).f49542c) {
                C3244l c3244l = c2061e3.f25818e;
                do {
                    value = c3244l.getValue();
                    ((Boolean) value).getClass();
                } while (!c3244l.m15570h(value, Boolean.FALSE));
                ui3Var.mo0a();
            }
            boolean zM22124i = ((i2 & 14) == 4) | tj3Var.m22124i(c2061e3) | ((i2 & 112) == 32) | tj3Var.m22124i(tokenMeaning);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                c2061e4 = c2061e3;
                DictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1 dictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1 = new DictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1(c2061e4, str, str2, tokenMeaning, null);
                tj3Var.m22131l0(dictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1);
                objM22097O = dictionariesLocaleScreenKt$DictionariesLocaleScreen$1$1;
            } else {
                c2061e4 = c2061e3;
            }
            d32.m10047k(tj3Var, (zi3) objM22097O, xfa.f68157a);
            b34.m3232b(null, ci8.m4703P(1233080876, new C0839c9(6, ui3Var), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(700016513, new C3180kd(17, t66VarM2513c, c2061e4), tj3Var), tj3Var, 805306416, 509);
            tj3Var = tj3Var;
            c2061e2 = c2061e4;
        } else {
            tj3Var.m22102U();
            c2061e2 = c2061e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new xy0((Object) str, (Object) str2, (Object) tokenMeaning, ui3Var, (Object) c2061e2, i, 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m8969e(int i, ye1 ye1Var, ui3 ui3Var) {
        tj3 tj3Var;
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1314660984);
        int i2 = (tj3Var2.m22124i(ui3Var) ? 4 : 2) | i;
        int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 3) != 2)) {
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c(ui3Var, null, AbstractC0231g.m1154g(true, tj3Var2, 6, 2), 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(-1377138454, new ze2(i3, ui3Var), tj3Var2), tj3Var, (i2 & 14) | 24576, 3078, 7146);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C0839c9(i, 7, ui3Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m8970f(ef2 ef2Var, ui3 ui3Var, vi3 vi3Var, vi3 vi3Var2, zi3 zi3Var, vi3 vi3Var3, ye1 ye1Var, int i) {
        int i2;
        vi3 vi3Var4;
        tj3 tj3Var;
        ef2Var.getClass();
        ui3Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        zi3Var.getClass();
        vi3Var3.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(769028783);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(ef2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(ui3Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            vi3Var4 = vi3Var;
            i2 |= tj3Var2.m22124i(vi3Var4) ? 256 : 128;
        } else {
            vi3Var4 = vi3Var;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22124i(zi3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var3) ? 131072 : 65536;
        }
        byte b = 0;
        if (tj3Var2.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            C0127b c0127bM17056a = mv4.m17056a(0, tj3Var2, 3);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = d32.m10013K(tj3Var2);
                tj3Var2.m22131l0(objM22097O);
            }
            un1 un1Var = (un1) objM22097O;
            boolean z = (i2 & 57344) == 16384;
            Object objM22097O2 = tj3Var2.m22097O();
            if (z || objM22097O2 == p84Var) {
                objM22097O2 = new C0844ce(zi3Var, i3, b);
                tj3Var2.m22131l0(objM22097O2);
            }
            C1919b c1919bM13756b = ibd.m13756b(c0127bM17056a, (zi3) objM22097O2, tj3Var2);
            Object objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1257g(0);
                tj3Var2.m22131l0(objM22097O3);
            }
            tj3Var = tj3Var2;
            b34.m3232b(c99.m4411d(b16.f7762a, 1.0f), null, null, null, null, 0, 0L, 0L, null, ci8.m4703P(-240794626, new vy0(ui3Var, c1919bM13756b, un1Var, c0127bM17056a, ef2Var, vi3Var2, vi3Var3, vi3Var4, (sc9) objM22097O3), tj3Var2), tj3Var, 805306374, 510);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nu1(ef2Var, ui3Var, vi3Var, vi3Var2, zi3Var, vi3Var3, i);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final void m8971g(ui3 ui3Var, C2066j c2066j, ye1 ye1Var, int i) {
        tj3 tj3Var;
        C2066j c2066j2;
        tj3 tj3Var2;
        int i2;
        ui3Var.getClass();
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(1163202109);
        int i3 = (tj3Var3.m22124i(ui3Var) ? 4 : 2) | i | 16;
        if (tj3Var3.m22099R(i3 & 1, (i3 & 19) != 18)) {
            tj3Var3.m22104W();
            if ((i & 1) == 0 || tj3Var3.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var3);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    tj3Var2 = tj3Var3;
                    i2 = i3 & (-113);
                    c2066j2 = (C2066j) pfa.m19114d(y38.m24933a(C2066j.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var3), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var2);
                }
            } else {
                tj3Var3.m22102U();
                i2 = i3 & (-113);
                c2066j2 = c2066j;
                tj3Var2 = tj3Var3;
            }
            tj3Var2.m22140r();
            ef2 ef2Var = (ef2) AbstractC0711a.m2513c(c2066j2.f25841j, tj3Var2).getValue();
            boolean zM22124i = tj3Var2.m22124i(c2066j2);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                DictionariesManageScreenKt$DictionariesManageScreen$1$1 dictionariesManageScreenKt$DictionariesManageScreen$1$1 = new DictionariesManageScreenKt$DictionariesManageScreen$1$1(1, c2066j2, C2066j.class, "addDictionaryToActive", "addDictionaryToActive(Lcom/lingq/core/domain/model/language/DictionaryData;)V", 0);
                tj3Var2.m22131l0(dictionariesManageScreenKt$DictionariesManageScreen$1$1);
                objM22097O = dictionariesManageScreenKt$DictionariesManageScreen$1$1;
            }
            vi3 vi3Var = (vi3) ((FunctionReference) objM22097O);
            boolean zM22124i2 = tj3Var2.m22124i(c2066j2);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                DictionariesManageScreenKt$DictionariesManageScreen$2$1 dictionariesManageScreenKt$DictionariesManageScreen$2$1 = new DictionariesManageScreenKt$DictionariesManageScreen$2$1(1, c2066j2, C2066j.class, "removeDictionaryFromActive", "removeDictionaryFromActive(Lcom/lingq/core/domain/model/language/DictionaryData;)V", 0);
                tj3Var2.m22131l0(dictionariesManageScreenKt$DictionariesManageScreen$2$1);
                objM22097O2 = dictionariesManageScreenKt$DictionariesManageScreen$2$1;
            }
            vi3 vi3Var2 = (vi3) ((FunctionReference) objM22097O2);
            boolean zM22124i3 = tj3Var2.m22124i(c2066j2);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22124i3 || objM22097O3 == p84Var) {
                objM22097O3 = new DictionariesManageScreenKt$DictionariesManageScreen$3$1(2, c2066j2, C2066j.class, "changePosition", "changePosition(II)V", 0);
                tj3Var2.m22131l0(objM22097O3);
            }
            zi3 zi3Var = (zi3) ((FunctionReference) objM22097O3);
            boolean zM22124i4 = tj3Var2.m22124i(c2066j2);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22124i4 || objM22097O4 == p84Var) {
                DictionariesManageScreenKt$DictionariesManageScreen$4$1 dictionariesManageScreenKt$DictionariesManageScreen$4$1 = new DictionariesManageScreenKt$DictionariesManageScreen$4$1(1, c2066j2, C2066j.class, "updateLocale", "updateLocale(Ljava/lang/String;)V", 0);
                tj3Var2.m22131l0(dictionariesManageScreenKt$DictionariesManageScreen$4$1);
                objM22097O4 = dictionariesManageScreenKt$DictionariesManageScreen$4$1;
            }
            tj3 tj3Var4 = tj3Var2;
            m8970f(ef2Var, ui3Var, vi3Var, vi3Var2, zi3Var, (vi3) ((FunctionReference) objM22097O4), tj3Var4, (i2 << 3) & 112);
            tj3Var = tj3Var4;
        } else {
            tj3Var = tj3Var3;
            tj3Var.m22102U();
            c2066j2 = c2066j;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(ui3Var, i, 6, c2066j2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m8972h(String str, zf2 zf2Var, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        str.getClass();
        zf2Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-757008388);
        int i2 = i | (tj3Var2.m22120g(str) ? 4 : 2) | (tj3Var2.m22124i(zf2Var) ? 32 : 16) | (tj3Var2.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            C0269z c0269zM1154g = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
            boolean z = (i2 & 896) == 256;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new nw1(vi3Var, 4);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c((ui3) objM22097O, null, c0269zM1154g, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(-250446118, new ik0(str, zf2Var, vi3Var, 22), tj3Var2), tj3Var, 24576, 3078, 7146);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3836zk(i, 12, str, zf2Var, vi3Var);
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m8973i(String str, zf2 zf2Var, vi3 vi3Var, C2069m c2069m, ye1 ye1Var, int i) {
        int i2;
        C2069m c2069m2;
        final C2069m c2069m3;
        int i3;
        str.getClass();
        zf2Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1997808047);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | (tj3Var.m22124i(zf2Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= tj3Var.m22124i(vi3Var) ? 256 : 128;
        }
        int i5 = i4 | 1024;
        if (tj3Var.m22099R(i5 & 1, (i5 & 1171) != 1170)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                dua duaVarM21396a = si5.m21396a(tj3Var);
                if (duaVarM21396a == null) {
                    C3386nv.m17633t("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    c2069m3 = (C2069m) pfa.m19114d(y38.m24933a(C2069m.class), duaVarM21396a, null, AbstractC3584sr.m21591B(duaVarM21396a, tj3Var), duaVarM21396a instanceof gr3 ? ((gr3) duaVarM21396a).mo2103e() : or1.f54780b, tj3Var);
                    i3 = i5 & (-7169);
                }
            } else {
                tj3Var.m22102U();
                i3 = i5 & (-7169);
                c2069m3 = c2069m;
            }
            tj3Var.m22140r();
            final t66 t66VarM2513c = AbstractC0711a.m2513c(c2069m3.f25851f, tj3Var);
            final Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            ld9 ld9Var = (ld9) tj3Var.m22128k(AbstractC0402n.f4826r);
            final boolean z = ((Configuration) tj3Var.m22128k(AbstractC0394f.f4760a)).orientation == 2;
            Boolean boolValueOf = Boolean.valueOf(((lf2) t66VarM2513c.getValue()).f49588g);
            boolean zM22120g = tj3Var.m22120g(t66VarM2513c) | tj3Var.m22120g(ld9Var) | ((i3 & 896) == 256) | tj3Var.m22124i(c2069m3);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22120g || objM22097O == p84Var) {
                DictionaryContentScreenKt$DictionaryContentScreen$1$1 dictionaryContentScreenKt$DictionaryContentScreen$1$1 = new DictionaryContentScreenKt$DictionaryContentScreen$1$1(ld9Var, vi3Var, c2069m3, t66VarM2513c, null);
                tj3Var.m22131l0(dictionaryContentScreenKt$DictionaryContentScreen$1$1);
                objM22097O = dictionaryContentScreenKt$DictionaryContentScreen$1$1;
            }
            d32.m10047k(tj3Var, (zi3) objM22097O, boolValueOf);
            boolean zM22124i = tj3Var.m22124i(c2069m3) | tj3Var.m22124i(zf2Var) | ((i3 & 14) == 4);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new DictionaryContentScreenKt$DictionaryContentScreen$2$1(c2069m3, zf2Var, str, null);
                tj3Var.m22131l0(objM22097O2);
            }
            d32.m10047k(tj3Var, (zi3) objM22097O2, xfa.f68157a);
            b34.m3232b(c99.m4411d(b16.f7762a, 1.0f), null, null, null, null, 0, 0L, 0L, null, ci8.m4703P(-1396745922, new aj3() { // from class: com.lingq.feature.dictionary.k
                @Override // p000.aj3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    C3549ru c3549ru;
                    t66 t66Var;
                    final C2069m c2069m4;
                    zi3 zi3Var;
                    ui3 ui3Var;
                    zi3 zi3Var2;
                    float f;
                    fc0 fc0Var;
                    zi3 zi3Var3;
                    b16 b16Var;
                    tj3 tj3Var2;
                    boolean z2;
                    float f2;
                    boolean z3;
                    float f3;
                    t17 t17Var = (t17) obj;
                    ye1 ye1Var2 = (ye1) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    C3549ru c3549ru2 = eh0.f37236b;
                    fc0 fc0Var2 = nj0.f52789H;
                    t17Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= ((tj3) ye1Var2).m22120g(t17Var) ? 4 : 2;
                    }
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 19) != 18)) {
                        b16 b16Var2 = b16.f7762a;
                        e16 e16VarM21606S = AbstractC3584sr.m21606S(c99.m4411d(b16Var2, 1.0f), t17Var);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM21606S);
                        se1.f60731q.getClass();
                        ui3 ui3Var2 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var2);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        zi3 zi3Var4 = C0352b.f4303f;
                        oha.m18001g(tj3Var3, zi3Var4, bb1VarM230a);
                        zi3 zi3Var5 = C0352b.f4302e;
                        oha.m18001g(tj3Var3, zi3Var5, l77VarM22132m);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        zi3 zi3Var6 = C0352b.f4304g;
                        oha.m18001g(tj3Var3, zi3Var6, numValueOf);
                        vi3 vi3Var2 = C0352b.f4305h;
                        oha.m18000f(tj3Var3, vi3Var2);
                        zi3 zi3Var7 = C0352b.f4301d;
                        oha.m18001g(tj3Var3, zi3Var7, e16VarM1322c);
                        boolean z4 = z;
                        t66 t66Var2 = t66VarM2513c;
                        C2069m c2069m5 = c2069m3;
                        p84 p84Var2 = we1.f66679a;
                        if (z4) {
                            tj3Var3.m22111b0(393159204);
                            e16 e16VarM4412e = c99.m4412e(b16Var2, 1.0f);
                            zf1 zf1Var = ge9.f40637a;
                            t66Var = t66Var2;
                            e16 e16VarM21609V = AbstractC3584sr.m21609V(e16VarM4412e, ((fe9) tj3Var3.m22128k(zf1Var)).f38956e, 0.0f, 2);
                            sj8 sj8VarM20003a = qj8.m20003a(c3549ru2, fc0Var2, tj3Var3, 48);
                            fc0Var = fc0Var2;
                            int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
                            l77 l77VarM22132m2 = tj3Var3.m22132m();
                            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM21609V);
                            tj3Var3.m22119f0();
                            if (tj3Var3.f62384S) {
                                tj3Var3.m22130l(ui3Var2);
                            } else {
                                tj3Var3.m22137o0();
                            }
                            oha.m18001g(tj3Var3, zi3Var4, sj8VarM20003a);
                            oha.m18001g(tj3Var3, zi3Var5, l77VarM22132m2);
                            AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var6, tj3Var3, vi3Var2);
                            oha.m18001g(tj3Var3, zi3Var7, e16VarM1322c2);
                            boolean zM22124i2 = tj3Var3.m22124i(c2069m5);
                            Object objM22097O3 = tj3Var3.m22097O();
                            if (zM22124i2 || objM22097O3 == p84Var2) {
                                objM22097O3 = new DictionaryContentScreenKt$DictionaryContentScreen$3$1$1$1$1(0, c2069m5, C2069m.class, "onCancelClick", "onCancelClick()V", 0);
                                c2069m4 = c2069m5;
                                tj3Var3.m22131l0(objM22097O3);
                            } else {
                                c2069m4 = c2069m5;
                            }
                            ui3Var = ui3Var2;
                            zi3Var2 = zi3Var4;
                            zi3Var3 = zi3Var7;
                            zi3Var = zi3Var6;
                            omd.m18141c((ui3) ((FunctionReference) objM22097O3), null, false, null, null, rpb.f59694a, tj3Var3, 1572864, 62);
                            tj3 tj3Var4 = tj3Var3;
                            if (fa4.m11650l(((lf2) t66Var.getValue()).f49586e, Boolean.TRUE)) {
                                tj3Var4.m22111b0(2064559434);
                                boolean zM22124i3 = tj3Var4.m22124i(c2069m4);
                                Object objM22097O4 = tj3Var4.m22097O();
                                if (zM22124i3 || objM22097O4 == p84Var2) {
                                    objM22097O4 = new DictionaryContentScreenKt$DictionaryContentScreen$3$1$1$2$1(0, c2069m4, C2069m.class, "speakTerm", "speakTerm()V", 0);
                                    tj3Var4.m22131l0(objM22097O4);
                                }
                                omd.m18141c((ui3) ((FunctionReference) objM22097O4), null, false, null, null, rpb.f59695b, tj3Var4, 1572864, 62);
                                tj3Var4 = tj3Var4;
                                tj3Var4.m22139q(false);
                            } else {
                                tj3Var4.m22111b0(2064912121);
                                tj3Var4.m22139q(false);
                            }
                            tj3 tj3Var5 = tj3Var4;
                            f = 0.0f;
                            lw9.m16554b(((lf2) t66Var.getValue()).f49583b, AbstractC3584sr.m21609V(new as4(1.0f, true), ((fe9) tj3Var4.m22128k(zf1Var)).f38952a, 0.0f, 2), 0L, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var4.m22128k(ps5.f56764b)).f51800b.f71404h, tj3Var5, 0, 24960, 110588);
                            tj3Var2 = tj3Var5;
                            boolean zM22124i4 = tj3Var2.m22124i(c2069m4);
                            Object objM22097O5 = tj3Var2.m22097O();
                            if (zM22124i4 || objM22097O5 == p84Var2) {
                                objM22097O5 = new DictionaryContentScreenKt$DictionaryContentScreen$3$1$1$3$1(0, c2069m4, C2069m.class, "onDoneClick", "onDoneClick()V", 0);
                                tj3Var2.m22131l0(objM22097O5);
                            }
                            AbstractC0231g.m1153f(805306368, 510, null, tj3Var2, (ui3) ((FunctionReference) objM22097O5), rpb.f59696c, null, null, null, false);
                            tj3Var2.m22139q(true);
                            tj3Var2.m22139q(false);
                            z2 = false;
                            b16Var = b16Var2;
                            c3549ru = c3549ru2;
                        } else {
                            c3549ru = c3549ru2;
                            t66Var = t66Var2;
                            c2069m4 = c2069m5;
                            zi3Var = zi3Var6;
                            ui3Var = ui3Var2;
                            zi3Var2 = zi3Var4;
                            f = 0.0f;
                            fc0Var = fc0Var2;
                            zi3Var3 = zi3Var7;
                            tj3Var3.m22111b0(394890957);
                            b16Var = b16Var2;
                            e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var3).f38956e, ge9.m12515a(tj3Var3).f38952a);
                            sj8 sj8VarM20003a2 = qj8.m20003a(eh0.f37242h, fc0Var, tj3Var3, 54);
                            int iHashCode3 = Long.hashCode(tj3Var3.f62385T);
                            l77 l77VarM22132m3 = tj3Var3.m22132m();
                            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var3, e16VarM21608U);
                            tj3Var3.m22119f0();
                            if (tj3Var3.f62384S) {
                                tj3Var3.m22130l(ui3Var);
                            } else {
                                tj3Var3.m22137o0();
                            }
                            oha.m18001g(tj3Var3, zi3Var2, sj8VarM20003a2);
                            oha.m18001g(tj3Var3, zi3Var5, l77VarM22132m3);
                            AbstractC3393o1.m17747v(iHashCode3, tj3Var3, zi3Var, tj3Var3, vi3Var2);
                            oha.m18001g(tj3Var3, zi3Var3, e16VarM1322c3);
                            boolean zM22124i5 = tj3Var3.m22124i(c2069m4);
                            Object objM22097O6 = tj3Var3.m22097O();
                            if (zM22124i5 || objM22097O6 == p84Var2) {
                                objM22097O6 = new DictionaryContentScreenKt$DictionaryContentScreen$3$1$2$1$1(0, c2069m4, C2069m.class, "onCancelClick", "onCancelClick()V", 0);
                                tj3Var3.m22131l0(objM22097O6);
                            }
                            omd.m18141c((ui3) ((FunctionReference) objM22097O6), null, false, null, null, rpb.f59697d, tj3Var3, 1572864, 62);
                            zf2 zf2Var2 = ((lf2) t66Var.getValue()).f49582a;
                            String str2 = zf2Var2 != null ? zf2Var2.f71486c : "";
                            vx9 vx9Var = p58.m18902j(tj3Var3).f71404h;
                            if (1.0f <= 0.0d) {
                                g54.m12362a("invalid weight; must be greater than zero");
                            }
                            lw9.m16554b(str2, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, null, 0L, null, null, 0L, null, ks9.m15662a(), 0L, 0, false, 0, 0, null, vx9Var, tj3Var3, 0, 0, 130044);
                            tj3 tj3Var6 = tj3Var3;
                            boolean zM22124i6 = tj3Var6.m22124i(c2069m4);
                            Object objM22097O7 = tj3Var6.m22097O();
                            if (zM22124i6 || objM22097O7 == p84Var2) {
                                objM22097O7 = new DictionaryContentScreenKt$DictionaryContentScreen$3$1$2$2$1(0, c2069m4, C2069m.class, "onDoneClick", "onDoneClick()V", 0);
                                tj3Var6.m22131l0(objM22097O7);
                            }
                            AbstractC0231g.m1153f(805306368, 510, null, tj3Var6, (ui3) ((FunctionReference) objM22097O7), rpb.f59698e, null, null, null, false);
                            tj3Var6.m22139q(true);
                            e16 e16VarM21608U2 = AbstractC3584sr.m21608U(c99.m4412e(b16Var, 1.0f), ge9.m12515a(tj3Var6).f38956e, ge9.m12515a(tj3Var6).f38952a);
                            sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru, fc0Var, tj3Var6, 48);
                            int iHashCode4 = Long.hashCode(tj3Var6.f62385T);
                            l77 l77VarM22132m4 = tj3Var6.m22132m();
                            e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var6, e16VarM21608U2);
                            tj3Var6.m22119f0();
                            if (tj3Var6.f62384S) {
                                tj3Var6.m22130l(ui3Var);
                            } else {
                                tj3Var6.m22137o0();
                            }
                            oha.m18001g(tj3Var6, zi3Var2, sj8VarM20003a3);
                            oha.m18001g(tj3Var6, zi3Var5, l77VarM22132m4);
                            AbstractC3393o1.m17747v(iHashCode4, tj3Var6, zi3Var, tj3Var6, vi3Var2);
                            oha.m18001g(tj3Var6, zi3Var3, e16VarM1322c4);
                            if (fa4.m11650l(((lf2) t66Var.getValue()).f49586e, Boolean.TRUE)) {
                                tj3Var6.m22111b0(1248758442);
                                boolean zM22124i7 = tj3Var6.m22124i(c2069m4);
                                Object objM22097O8 = tj3Var6.m22097O();
                                if (zM22124i7 || objM22097O8 == p84Var2) {
                                    objM22097O8 = new DictionaryContentScreenKt$DictionaryContentScreen$3$1$3$1$1(0, c2069m4, C2069m.class, "speakTerm", "speakTerm()V", 0);
                                    tj3Var6.m22131l0(objM22097O8);
                                }
                                omd.m18141c((ui3) ((FunctionReference) objM22097O8), null, false, null, null, rpb.f59699f, tj3Var6, 1572864, 62);
                                tj3Var6 = tj3Var6;
                                tj3Var6.m22139q(false);
                            } else {
                                tj3Var6.m22111b0(1249111129);
                                tj3Var6.m22139q(false);
                            }
                            String str3 = ((lf2) t66Var.getValue()).f49583b;
                            vx9 vx9Var2 = p58.m18902j(tj3Var6).f71403g;
                            if (1.0f <= 0.0d) {
                                g54.m12362a("invalid weight; must be greater than zero");
                            }
                            tj3 tj3Var7 = tj3Var6;
                            lw9.m16554b(str3, new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var2, tj3Var7, 0, 0, 131068);
                            tj3Var2 = tj3Var7;
                            tj3Var2.m22139q(true);
                            z2 = false;
                            tj3Var2.m22139q(false);
                        }
                        e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
                        float f4 = ge9.m12515a(tj3Var2).f38956e;
                        if (z4 != 0) {
                            tj3Var2.m22111b0(-957010390);
                            tj3Var2.m22139q(z2);
                            f2 = f;
                        } else {
                            tj3Var2.m22111b0(-957009425);
                            f2 = ge9.m12515a(tj3Var2).f38952a;
                            tj3Var2.m22139q(z2);
                        }
                        e16 e16VarM21608U3 = AbstractC3584sr.m21608U(e16VarM4412e2, f4, f2);
                        sj8 sj8VarM20003a4 = qj8.m20003a(c3549ru, fc0Var, tj3Var2, 48);
                        int iHashCode5 = Long.hashCode(tj3Var2.f62385T);
                        l77 l77VarM22132m5 = tj3Var2.m22132m();
                        e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var2, e16VarM21608U3);
                        tj3Var2.m22119f0();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, zi3Var2, sj8VarM20003a4);
                        oha.m18001g(tj3Var2, zi3Var5, l77VarM22132m5);
                        AbstractC3393o1.m17747v(iHashCode5, tj3Var2, zi3Var, tj3Var2, vi3Var2);
                        oha.m18001g(tj3Var2, zi3Var3, e16VarM1322c5);
                        String str4 = ((lf2) t66Var.getValue()).f49585d;
                        boolean zM22124i8 = tj3Var2.m22124i(c2069m4);
                        Object objM22097O9 = tj3Var2.m22097O();
                        if (zM22124i8 || objM22097O9 == p84Var2) {
                            objM22097O9 = new DictionaryContentScreenKt$DictionaryContentScreen$3$1$4$1$1(1, c2069m4, C2069m.class, "updateHintText", "updateHintText(Ljava/lang/String;)V", 0);
                            tj3Var2.m22131l0(objM22097O9);
                        }
                        sg4 sg4Var = (FunctionReference) objM22097O9;
                        as4 as4Var = new as4(1.0f, true);
                        hj4 hj4Var = new hj4(0, 7, null, 119);
                        boolean zM22124i9 = tj3Var2.m22124i(c2069m4);
                        Object objM22097O10 = tj3Var2.m22097O();
                        if (zM22124i9 || objM22097O10 == p84Var2) {
                            final int i6 = 1;
                            objM22097O10 = new vi3() { // from class: kf2
                                @Override // p000.vi3
                                public final Object invoke(Object obj4) {
                                    int i7 = i6;
                                    C2069m c2069m6 = c2069m4;
                                    switch (i7) {
                                        case 0:
                                            Context context2 = (Context) obj4;
                                            context2.getClass();
                                            WebView webView = new WebView(context2);
                                            webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                            webView.setWebChromeClient(new WebChromeClient());
                                            webView.setWebViewClient(new C2068l(c2069m6));
                                            webView.getSettings().setJavaScriptEnabled(true);
                                            webView.getSettings().setDomStorageEnabled(true);
                                            webView.getSettings().setUseWideViewPort(true);
                                            webView.getSettings().setLoadWithOverviewMode(true);
                                            webView.setBackgroundColor(0);
                                            return webView;
                                        default:
                                            ((fj4) obj4).getClass();
                                            c2069m6.m8981W2();
                                            return xfa.f68157a;
                                    }
                                }
                            };
                            tj3Var2.m22131l0(objM22097O10);
                        }
                        tj3 tj3Var8 = tj3Var2;
                        int i7 = 7;
                        bna.m3942c(str4, (vi3) sg4Var, as4Var, false, null, rpb.f59700g, null, null, null, null, null, false, null, hj4Var, new gj4((vi3) objM22097O10, null, 62), true, 0, 0, null, null, tj3Var8, 1572864, 12779520, 8159160);
                        thb.m22044c(tj3Var8, c99.m4426s(b16Var, ge9.m12515a(tj3Var8).f38952a));
                        String strM23620a0 = vz1.m23620a0(tj3Var8, R$string.ui_paste);
                        Context context2 = context;
                        t66 t66Var3 = t66Var;
                        boolean zM22124i10 = tj3Var8.m22124i(context2) | tj3Var8.m22124i(c2069m4) | tj3Var8.m22120g(t66Var3);
                        Object objM22097O11 = tj3Var8.m22097O();
                        if (zM22124i10 || objM22097O11 == p84Var2) {
                            objM22097O11 = new zg0(context2, c2069m4, t66Var3, i7);
                            tj3Var8.m22131l0(objM22097O11);
                        }
                        lw9.m16554b(strM23620a0, AbstractC3584sr.m21607T(AbstractC0080f.m815b(null, false, (ui3) objM22097O11, b16Var, 15), ge9.m12515a(tj3Var8).f38952a), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var8).f71406j, tj3Var8, 0, 0, 131068);
                        tj3Var8.m22139q(true);
                        e16 e16VarM4412e3 = c99.m4412e(b16Var, 1.0f);
                        float f5 = ge9.m12515a(tj3Var8).f38956e;
                        if (z4) {
                            tj3Var8.m22111b0(-956953486);
                            f3 = ge9.m12515a(tj3Var8).f38954c;
                            z3 = false;
                        } else {
                            z3 = false;
                            tj3Var8.m22111b0(-956952273);
                            f3 = ge9.m12515a(tj3Var8).f38952a;
                        }
                        tj3Var8.m22139q(z3);
                        e16 e16VarM21608U4 = AbstractC3584sr.m21608U(e16VarM4412e3, f5, f3);
                        C3661uu c3661uu = new C3661uu(ge9.m12515a(tj3Var8).f38952a, true, new gm5(28));
                        boolean zM22120g2 = tj3Var8.m22120g(t66Var3) | tj3Var8.m22124i(c2069m4);
                        Object objM22097O12 = tj3Var8.m22097O();
                        if (zM22120g2 || objM22097O12 == p84Var2) {
                            objM22097O12 = new ke2(1, t66Var3, c2069m4);
                            tj3Var8.m22131l0(objM22097O12);
                        }
                        fa4.m11643d(e16VarM21608U4, null, null, c3661uu, null, null, false, null, (vi3) objM22097O12, tj3Var8, 0, 494);
                        tj3 tj3Var9 = tj3Var8;
                        e16 e16VarM4411d = c99.m4411d(b16Var, 1.0f);
                        bb1 bb1VarM230a2 = ab1.m230a(eh0.f37240f, nj0.f52792K, tj3Var9, 54);
                        int iHashCode6 = Long.hashCode(tj3Var9.f62385T);
                        l77 l77VarM22132m6 = tj3Var9.m22132m();
                        e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var9, e16VarM4411d);
                        tj3Var9.m22119f0();
                        if (tj3Var9.f62384S) {
                            tj3Var9.m22130l(ui3Var);
                        } else {
                            tj3Var9.m22137o0();
                        }
                        oha.m18001g(tj3Var9, zi3Var2, bb1VarM230a2);
                        oha.m18001g(tj3Var9, zi3Var5, l77VarM22132m6);
                        AbstractC3393o1.m17747v(iHashCode6, tj3Var9, zi3Var, tj3Var9, vi3Var2);
                        oha.m18001g(tj3Var9, zi3Var3, e16VarM1322c6);
                        if (((lf2) t66Var3.getValue()).f49584c) {
                            tj3Var9.m22111b0(-44747283);
                            dn7.m10492a(null, 0L, 0.0f, 0L, 0, 0.0f, tj3Var9, 0, 63);
                            tj3Var9 = tj3Var9;
                            tj3Var9.m22139q(false);
                        } else {
                            tj3Var9.m22111b0(-44682896);
                            tj3Var9.m22139q(false);
                        }
                        zf2 zf2Var3 = ((lf2) t66Var3.getValue()).f49582a;
                        String str5 = zf2Var3 != null ? zf2Var3.f71485b : null;
                        if (str5 == null) {
                            tj3Var9.m22111b0(-44554898);
                            tj3Var9.m22139q(false);
                        } else {
                            tj3Var9.m22111b0(-44554897);
                            e16 e16VarM4411d2 = c99.m4411d(b16Var, 1.0f);
                            boolean zM22124i11 = tj3Var9.m22124i(c2069m4);
                            Object objM22097O13 = tj3Var9.m22097O();
                            if (zM22124i11 || objM22097O13 == p84Var2) {
                                final int i8 = 0;
                                objM22097O13 = new vi3() { // from class: kf2
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj4) {
                                        int i9 = i8;
                                        C2069m c2069m6 = c2069m4;
                                        switch (i9) {
                                            case 0:
                                                Context context3 = (Context) obj4;
                                                context3.getClass();
                                                WebView webView = new WebView(context3);
                                                webView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                                webView.setWebChromeClient(new WebChromeClient());
                                                webView.setWebViewClient(new C2068l(c2069m6));
                                                webView.getSettings().setJavaScriptEnabled(true);
                                                webView.getSettings().setDomStorageEnabled(true);
                                                webView.getSettings().setUseWideViewPort(true);
                                                webView.getSettings().setLoadWithOverviewMode(true);
                                                webView.setBackgroundColor(0);
                                                return webView;
                                            default:
                                                ((fj4) obj4).getClass();
                                                c2069m6.m8981W2();
                                                return xfa.f68157a;
                                        }
                                    }
                                };
                                tj3Var9.m22131l0(objM22097O13);
                            }
                            vi3 vi3Var3 = (vi3) objM22097O13;
                            boolean zM22120g3 = tj3Var9.m22120g(str5);
                            Object objM22097O14 = tj3Var9.m22097O();
                            if (zM22120g3 || objM22097O14 == p84Var2) {
                                objM22097O14 = new t70(str5, 23);
                                tj3Var9.m22131l0(objM22097O14);
                            }
                            AbstractC0443c.m1891b(vi3Var3, e16VarM4411d2, (vi3) objM22097O14, tj3Var9, 48, 0);
                            tj3Var9.m22139q(false);
                        }
                        tj3Var9.m22139q(true);
                        tj3Var9.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 805306374, 510);
            tj3Var = tj3Var;
            c2069m2 = c2069m3;
        } else {
            tj3Var.m22102U();
            c2069m2 = c2069m;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(str, zf2Var, vi3Var, c2069m2, i, 9);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m8974j(DictionaryData dictionaryData, boolean z, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2023941685);
        int i2 = i | (tj3Var.m22124i(dictionaryData) ? 4 : 2) | (tj3Var.m22122h(z) ? 32 : 16) | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            e16 e16VarM4431x = c99.m4431x(b16.f7762a);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            mn0 mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55822G, 0L, tj3Var);
            boolean zM22124i = tj3Var.m22124i(dictionaryData) | ((i2 & 896) == 256);
            Object objM22097O = tj3Var.m22097O();
            if (zM22124i || objM22097O == we1.f66679a) {
                objM22097O = new ff2(vi3Var, dictionaryData, 1);
                tj3Var.m22131l0(objM22097O);
            }
            r46.m20380e(e16VarM4431x, si8Var, null, mn0VarM21999m, (ui3) objM22097O, ci8.m4703P(464498764, new gf2(z, dictionaryData, context), tj3Var), tj3Var, 196614, 4);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ln0(dictionaryData, z, vi3Var, i, 3);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final void m8975k(e16 e16Var, String str, List list, vi3 vi3Var, ye1 ye1Var, int i) {
        e16 e16Var2;
        t66 t66Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-17187169);
        int i2 = i | 6 | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22124i(list) ? 256 : 128) | (tj3Var.m22124i(vi3Var) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            t66 t66Var2 = (t66) objM22097O;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38965n, 0.0f, 2);
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
            lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.core.p012ui.R$string.lingq_language), null, 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, 0, 0, 131070);
            tj3Var = tj3Var;
            thb.m22044c(tj3Var, new as4(1.0f, true));
            e16 e16VarM4430w = c99.m4430w(b16Var, null, 3);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4430w);
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
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                t66Var = t66Var2;
                objM22097O2 = new C3799yk(14, t66Var);
                tj3Var.m22131l0(objM22097O2);
            } else {
                t66Var = t66Var2;
            }
            t66 t66Var3 = t66Var;
            AbstractC0231g.m1153f(817889334, 380, null, tj3Var, (ui3) objM22097O2, ci8.m4703P(-1819665000, new ik0(str, context, t66Var, 21), tj3Var), c99.m4430w(b16Var, null, 3), AbstractC3584sr.m21622e(0.0f, 0.0f, 2), null, false);
            boolean zBooleanValue = ((Boolean) t66Var3.getValue()).booleanValue();
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new C3799yk(15, t66Var3);
                tj3Var.m22131l0(objM22097O3);
            }
            AbstractC3003fj.m11885a(zBooleanValue, (ui3) objM22097O3, null, 0L, null, null, null, 0L, 0.0f, ci8.m4703P(1280054320, new C3357n2((Object) list, (Object) context, vi3Var, (Object) t66Var3, 5), tj3Var), tj3Var, 48, 2044);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2919d9(e16Var2, str, list, vi3Var, i);
        }
    }

    /* JADX INFO: renamed from: l */
    public static final void m8976l(DictionaryLocale dictionaryLocale, vi3 vi3Var, ye1 ye1Var, int i) {
        Context context;
        zf1 zf1Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1088607520);
        int i2 = (tj3Var.m22124i(dictionaryLocale) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var.m22099R(i2 & 1, (i2 & 19) != 18)) {
            Context context2 = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            boolean zM22124i = ((i2 & 112) == 32) | tj3Var.m22124i(dictionaryLocale);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new C3577sk(14, vi3Var, dictionaryLocale);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O, e16VarM4412e, 15);
            zf1 zf1Var2 = ge9.f40637a;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(e16VarM815b, ((fe9) tj3Var.m22128k(zf1Var2)).f38956e, ((fe9) tj3Var.m22128k(zf1Var2)).f38952a);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21608U);
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
            String str = dictionaryLocale.f19021a;
            boolean zM22120g = tj3Var.m22120g(str);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22120g || objM22097O2 == p84Var) {
                objM22097O2 = Integer.valueOf(AbstractC3423or.m18282v(context2, str));
                tj3Var.m22131l0(objM22097O2);
            }
            int iIntValue = ((Number) objM22097O2).intValue();
            if (iIntValue != 0) {
                tj3Var.m22111b0(1808549900);
                y27 y27VarM18236U = AbstractC3423or.m18236U(iIntValue, tj3Var, 0);
                String str2 = dictionaryLocale.f19021a;
                ((fe9) tj3Var.m22128k(zf1Var2)).getClass();
                zf1Var = zf1Var2;
                context = context2;
                bq1.m4042R(y27VarM18236U, str2, pb1.m19045o(c99.m4422o(b16Var, 32.0f), ui8.f63972a), null, hl1.f42570g, 0.0f, null, tj3Var, 24584, 104);
                tj3Var.m22139q(false);
            } else {
                context = context2;
                zf1Var = zf1Var2;
                tj3Var.m22111b0(1808861574);
                tj3Var.m22139q(false);
            }
            lw9.m16554b(AbstractC3352my.m17093L(context, str), AbstractC3584sr.m21611X(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38956e, 0.0f, 0.0f, 0.0f, 14), 0L, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j, tj3Var, 0, 0, 131068);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new rw1(dictionaryLocale, i, 4, vi3Var);
        }
    }
}
