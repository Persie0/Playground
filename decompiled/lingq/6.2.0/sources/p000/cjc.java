package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.tooltips.components.AbstractC1915b;
import com.lingq.feature.reader.R$string;

/* JADX INFO: loaded from: classes3.dex */
public abstract class cjc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f10184a = new C0282a(543849799, false, new yd1(29));

    /* JADX INFO: renamed from: b */
    public static final C0282a f10185b = new C0282a(-1319418600, false, new be1(0));

    /* JADX INFO: renamed from: c */
    public static final C0282a f10186c = new C0282a(-625697357, false, new zd1(27));

    /* JADX INFO: renamed from: a */
    public static final void m4785a(final jy7 jy7Var, final boolean z, final int i, final boolean z2, final boolean z3, final boolean z4, final ui3 ui3Var, final ui3 ui3Var2, final ui3 ui3Var3, ui3 ui3Var4, final vi3 vi3Var, final vi3 vi3Var2, final vi3 vi3Var3, e16 e16Var, ye1 ye1Var, final int i2) {
        int i3;
        final ui3 ui3Var5;
        final e16 e16Var2;
        int i4;
        b16 b16Var;
        float f;
        boolean z5;
        boolean z6;
        float f2;
        zi3 zi3Var;
        ec0 ec0Var;
        float f3;
        boolean z7;
        C3587su c3587su = eh0.f37238d;
        ec0 ec0Var2 = nj0.f52792K;
        jy7Var.getClass();
        InterfaceC3055gy interfaceC3055gy = jy7Var.f46404l;
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        ui3Var4.getClass();
        C3587su c3587su2 = c3587su;
        tj3 tj3Var = (tj3) ye1Var;
        ec0 ec0Var3 = ec0Var2;
        tj3Var.m22115d0(-1990957778);
        if ((i2 & 6) == 0) {
            i3 = i2 | (tj3Var.m22124i(jy7Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22116e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= tj3Var.m22122h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= tj3Var.m22122h(z3) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= tj3Var.m22122h(z4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= tj3Var.m22124i(ui3Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= tj3Var.m22124i(ui3Var2) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= tj3Var.m22124i(ui3Var3) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= tj3Var.m22124i(ui3Var4) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if (tj3Var.m22099R(i5 & 1, ((i5 & 306783379) == 306783378 && (((((tj3Var.m22124i(vi3Var) ? (char) 4 : (char) 2) | (tj3Var.m22124i(vi3Var2) ? ' ' : (char) 16)) | (tj3Var.m22124i(vi3Var3) ? (char) 256 : (char) 128)) | 3072) & 1171) == 1170) ? false : true)) {
            float f4 = z4 ? 0.38f : 1.0f;
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4414g(c99.m4412e(vz1.m23624c0(b16Var2, "reader_bottom_bar"), 1.0f), 64.0f), 16.0f, 0.0f, 2);
            fc0 fc0Var = nj0.f52789H;
            C3549ru c3549ru = eh0.f37236b;
            sj8 sj8VarM20003a = qj8.m20003a(c3549ru, fc0Var, tj3Var, 48);
            float f5 = f4;
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var6 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var6);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var2 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var2, sj8VarM20003a);
            zi3 zi3Var3 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var4 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var4, numValueOf);
            vi3 vi3Var4 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var4);
            zi3 zi3Var5 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c);
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            as4 as4Var = new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            sj8 sj8VarM20003a2 = qj8.m20003a(c3549ru, fc0Var, tj3Var, 54);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, as4Var);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var6);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var2, sj8VarM20003a2);
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var4, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var5, e16VarM1322c2);
            if (z3) {
                fc0Var = fc0Var;
                i4 = 14;
                b16Var = b16Var2;
                c3587su2 = c3587su2;
                ec0Var3 = ec0Var3;
                f = f5;
                z5 = false;
                z6 = true;
                f2 = 16.0f;
                zi3Var = zi3Var5;
                tj3Var.m22111b0(1041511596);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1038020283);
                if (jy7Var.f46399g || (jy7Var.f46400h && !z2)) {
                    tj3Var.m22111b0(1038435869);
                    if ((interfaceC3055gy instanceof C2981ey) || (interfaceC3055gy instanceof C2907cy)) {
                        b16Var = b16Var2;
                        z5 = false;
                        f2 = 16.0f;
                        tj3Var.m22111b0(1038708607);
                        e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, c99.m4422o(vz1.m23624c0(b16Var, "reader_bottom_bar_play_progress"), 48.0f), 15);
                        ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                        int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                        l77 l77VarM22132m3 = tj3Var.m22132m();
                        e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM815b);
                        tj3Var.m22119f0();
                        if (tj3Var.f62384S) {
                            tj3Var.m22130l(ui3Var6);
                        } else {
                            tj3Var.m22137o0();
                        }
                        oha.m18001g(tj3Var, zi3Var2, ht5VarM19966d);
                        oha.m18001g(tj3Var, zi3Var3, l77VarM22132m3);
                        AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var4, tj3Var, vi3Var4);
                        zi3Var = zi3Var5;
                        oha.m18001g(tj3Var, zi3Var, e16VarM1322c3);
                        if (interfaceC3055gy instanceof C2907cy) {
                            tj3Var.m22111b0(1142271566);
                            e16 e16VarM4422o = c99.m4422o(b16Var, 24.0f);
                            long j = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55842a;
                            boolean zM22124i = tj3Var.m22124i(jy7Var);
                            Object objM22097O = tj3Var.m22097O();
                            if (zM22124i || objM22097O == we1.f66679a) {
                                objM22097O = new hz4(jy7Var, 17);
                                tj3Var.m22131l0(objM22097O);
                            }
                            dn7.m10493b((ui3) objM22097O, e16VarM4422o, j, 2.0f, 0L, 0, 0.0f, tj3Var, 3120, 112);
                            tj3Var.m22139q(false);
                        } else {
                            tj3Var.m22111b0(1142694158);
                            dn7.m10492a(c99.m4422o(b16Var, 24.0f), ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55842a, 2.0f, 0L, 0, 0.0f, tj3Var, 390, 56);
                            tj3Var.m22139q(false);
                        }
                        z6 = true;
                        tj3Var.m22139q(true);
                        tj3Var.m22139q(false);
                    } else {
                        tj3Var.m22111b0(1040026045);
                        b16Var = b16Var2;
                        z5 = false;
                        f2 = 16.0f;
                        omd.m18141c(ui3Var, AbstractC1915b.m8793f(vz1.m23624c0(b16Var2, "reader_bottom_bar_play"), vi3Var), !z4, null, null, ci8.m4703P(440781486, new C2961ee(jy7Var, f5), tj3Var), tj3Var, ((i5 >> 18) & 14) | 1572864, 56);
                        tj3Var.m22139q(false);
                        z6 = true;
                        zi3Var = zi3Var5;
                    }
                    tj3Var.m22139q(z5);
                } else {
                    tj3Var.m22111b0(1040818188);
                    tj3Var.m22139q(false);
                    z5 = false;
                    fc0Var = fc0Var;
                    zi3Var = zi3Var5;
                    b16Var = b16Var2;
                    c3587su2 = c3587su2;
                    ec0Var3 = ec0Var3;
                    z6 = true;
                    f2 = 16.0f;
                }
                if (z2) {
                    tj3Var.m22111b0(1040941692);
                    f = f5;
                    i4 = 14;
                    omd.m18141c(ui3Var2, vz1.m23624c0(b16Var, "reader_bottom_bar_video"), !z4, null, null, ci8.m4703P(-412889599, new fn5(2, f), tj3Var), tj3Var, ((i5 >> 21) & 14) | 1572912, 56);
                    tj3Var.m22139q(z5);
                } else {
                    f = f5;
                    i4 = 14;
                    tj3Var.m22111b0(1041497708);
                    tj3Var.m22139q(z5);
                }
                tj3Var.m22139q(z5);
            }
            tj3Var.m22139q(z6);
            if (z3 || z) {
                ec0Var = ec0Var3;
                tj3Var.m22111b0(-728961936);
                tj3Var.m22139q(z5);
            } else {
                tj3Var.m22111b0(-729921324);
                e16 e16VarM815b2 = AbstractC0080f.m815b(null, !z4, ui3Var3, AbstractC1915b.m8793f(vz1.m23624c0(b16Var, "reader_bottom_bar_sentence_mode"), vi3Var2), i4);
                ec0Var = ec0Var3;
                bb1 bb1VarM230a = ab1.m230a(c3587su2, ec0Var, tj3Var, 48);
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM815b2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var6);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var2, bb1VarM230a);
                oha.m18001g(tj3Var, zi3Var3, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var4, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var, e16VarM1322c4);
                y27 y27VarM18236U = AbstractC3423or.m18236U(R$drawable.ic_sentence_mode, tj3Var, 0);
                String strM23620a0 = vz1.m23620a0(tj3Var, R$string.reader_sentence_mode);
                vh9 vh9Var = ps5.f56764b;
                ty3.m22352b(y27VarM18236U, strM23620a0, c99.m4422o(b16Var, 24.0f), aa1.m198b(f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q), tj3Var, 392, 0);
                lw9.m16554b(vz1.m23620a0(tj3Var, R$string.lesson_view_sentence), null, aa1.m198b(f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71410n, tj3Var, 0, 0, 131066);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            if (1.0f <= 0.0d) {
                g54.m12362a("invalid weight; must be greater than zero");
            }
            e16 e16VarM4428u = c99.m4428u(new as4(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 60.0f, 0.0f, 2);
            C3549ru c3549ru2 = eh0.f37237c;
            fc0 fc0Var2 = fc0Var;
            sj8 sj8VarM20003a3 = qj8.m20003a(c3549ru2, fc0Var2, tj3Var, 54);
            float f6 = f;
            int iHashCode5 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m5 = tj3Var.m22132m();
            e16 e16VarM1322c5 = AbstractC0287b.m1322c(tj3Var, e16VarM4428u);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var6);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var2, sj8VarM20003a3);
            oha.m18001g(tj3Var, zi3Var3, l77VarM22132m5);
            AbstractC3393o1.m17747v(iHashCode5, tj3Var, zi3Var4, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var, e16VarM1322c5);
            if (!z3 || z) {
                f3 = f6;
                tj3Var.m22111b0(-624927531);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-625941820);
                e16 e16VarM21611X = AbstractC3584sr.m21611X(AbstractC0080f.m815b(null, !z4, ui3Var3, vz1.m23624c0(b16Var, "reader_bottom_bar_sentence_mode"), 14), 0.0f, 0.0f, f2, 0.0f, 11);
                bb1 bb1VarM230a2 = ab1.m230a(c3587su2, ec0Var, tj3Var, 48);
                int iHashCode6 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m6 = tj3Var.m22132m();
                e16 e16VarM1322c6 = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var6);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var2, bb1VarM230a2);
                oha.m18001g(tj3Var, zi3Var3, l77VarM22132m6);
                AbstractC3393o1.m17747v(iHashCode6, tj3Var, zi3Var4, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var, e16VarM1322c6);
                y27 y27VarM18236U2 = AbstractC3423or.m18236U(R$drawable.ic_sentence_mode, tj3Var, 0);
                String strM23620a1 = vz1.m23620a0(tj3Var, R$string.reader_sentence_mode);
                vh9 vh9Var2 = ps5.f56764b;
                f3 = f6;
                ty3.m22352b(y27VarM18236U2, strM23620a1, c99.m4422o(b16Var, 24.0f), aa1.m198b(f3, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55873q), tj3Var, 392, 0);
                lw9.m16554b(vz1.m23620a0(tj3Var, R$string.lesson_view_sentence), null, aa1.m198b(f3, ((ms5) tj3Var.m22128k(vh9Var2)).f51799a.f55873q), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var2)).f51800b.f71410n, tj3Var, 0, 0, 131066);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            if (z) {
                ui3Var5 = ui3Var4;
                if (i > 0) {
                    tj3Var.m22111b0(-623603397);
                    e16 e16VarM815b3 = AbstractC0080f.m815b(null, !z4, ui3Var5, c99.m4428u(vz1.m23624c0(b16Var, "reader_bottom_bar_review"), 40.0f, 0.0f, 2), 14);
                    sj8 sj8VarM20003a4 = qj8.m20003a(c3549ru2, fc0Var2, tj3Var, 54);
                    int iHashCode7 = Long.hashCode(tj3Var.f62385T);
                    l77 l77VarM22132m7 = tj3Var.m22132m();
                    e16 e16VarM1322c7 = AbstractC0287b.m1322c(tj3Var, e16VarM815b3);
                    tj3Var.m22119f0();
                    if (tj3Var.f62384S) {
                        tj3Var.m22130l(ui3Var6);
                    } else {
                        tj3Var.m22137o0();
                    }
                    oha.m18001g(tj3Var, zi3Var2, sj8VarM20003a4);
                    oha.m18001g(tj3Var, zi3Var3, l77VarM22132m7);
                    AbstractC3393o1.m17747v(iHashCode7, tj3Var, zi3Var4, tj3Var, vi3Var4);
                    oha.m18001g(tj3Var, zi3Var, e16VarM1322c7);
                    ty3.m22352b(AbstractC3423or.m18236U(com.lingq.feature.reader.R$drawable.ic_sentence_review, tj3Var, 0), vz1.m23620a0(tj3Var, R$string.reader_sentence_review), null, aa1.m198b(f3, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55873q), tj3Var, 8, 4);
                    z7 = true;
                    tj3Var.m22139q(true);
                    tj3Var.m22139q(false);
                } else {
                    z7 = true;
                    tj3Var.m22111b0(-622887979);
                    tj3Var.m22139q(false);
                }
            } else {
                tj3Var.m22111b0(-624837755);
                ui3Var5 = ui3Var4;
                e16 e16VarM815b4 = AbstractC0080f.m815b(null, !z4, ui3Var5, AbstractC1915b.m8793f(c99.m4428u(vz1.m23624c0(b16Var, "reader_bottom_bar_review"), 60.0f, 0.0f, 2), vi3Var3), 14);
                sj8 sj8VarM20003a5 = qj8.m20003a(c3549ru2, fc0Var2, tj3Var, 54);
                int iHashCode8 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m8 = tj3Var.m22132m();
                e16 e16VarM1322c8 = AbstractC0287b.m1322c(tj3Var, e16VarM815b4);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var6);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var2, sj8VarM20003a5);
                oha.m18001g(tj3Var, zi3Var3, l77VarM22132m8);
                AbstractC3393o1.m17747v(iHashCode8, tj3Var, zi3Var4, tj3Var, vi3Var4);
                oha.m18001g(tj3Var, zi3Var, e16VarM1322c8);
                y27 y27VarM18236U3 = AbstractC3423or.m18236U(com.lingq.feature.reader.R$drawable.ic_review, tj3Var, 0);
                String strM23620a2 = vz1.m23620a0(tj3Var, R$string.stats_review);
                vh9 vh9Var3 = ps5.f56764b;
                ty3.m22352b(y27VarM18236U3, strM23620a2, null, aa1.m198b(f3, ((ms5) tj3Var.m22128k(vh9Var3)).f51799a.f55873q), tj3Var, 8, 4);
                thb.m22044c(tj3Var, c99.m4426s(b16Var, 4.0f));
                lw9.m16554b(i > 0 ? String.valueOf(i) : "", c99.m4428u(b16Var, 20.0f, 0.0f, 2), aa1.m198b(f3, ((ms5) tj3Var.m22128k(vh9Var3)).f51799a.f55873q), null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var3)).f51800b.f71410n, tj3Var, 48, 0, 131064);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
                z7 = true;
            }
            tj3Var.m22139q(z7);
            tj3Var.m22139q(z7);
            e16Var2 = b16Var;
        } else {
            ui3Var5 = ui3Var4;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: fu7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i2 | 1);
                    cjc.m4785a(jy7Var, z, i, z2, z3, z4, ui3Var, ui3Var2, ui3Var3, ui3Var5, vi3Var, vi3Var2, vi3Var3, e16Var2, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m4786b(boolean z, ui3 ui3Var, ui3 ui3Var2, ui3 ui3Var3, ui3 ui3Var4, e16 e16Var, ye1 ye1Var, int i) {
        ui3Var.getClass();
        ui3Var2.getClass();
        ui3Var3.getClass();
        ui3Var4.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2090900065);
        int i2 = i | (tj3Var.m22122h(z) ? 4 : 2) | (tj3Var.m22124i(ui3Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var2) ? 256 : 128) | (tj3Var.m22124i(ui3Var3) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var4) ? 16384 : 8192) | (tj3Var.m22120g(e16Var) ? 131072 : 65536);
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            bq1.m4039O(vz1.m23624c0(e16Var, "reader_mini_player"), ui8.m22753b(32.0f), te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var), te1.m22000n(62, 0.0f), null, ci8.m4703P(1828309423, new C3484q4(ui3Var3, ui3Var2, ui3Var, ui3Var4, z, 1), tj3Var), tj3Var, 196608, 16);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new py3(z, ui3Var, ui3Var2, ui3Var3, ui3Var4, e16Var, i);
        }
    }
}
