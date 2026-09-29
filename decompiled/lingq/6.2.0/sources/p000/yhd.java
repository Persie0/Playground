package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.material3.AbstractC0218a;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.feature.statistics.R$string;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yhd {
    /* JADX INFO: renamed from: a */
    public static final void m25145a(String str, zh9 zh9Var, ui3 ui3Var, zi3 zi3Var, vi3 vi3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        ui3 ui3Var2;
        int i4;
        zi3 zi3Var2;
        int i5;
        vi3 vi3Var2;
        int i6;
        ui3 ui3Var3;
        zi3 zi3Var3;
        vi3 vi3Var3;
        ui3 ui3Var4;
        zi3 zi3Var4;
        vi3 vi3Var4;
        zh9Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(962299990);
        if ((i & 6) == 0) {
            i3 = i | (tj3Var.m22120g(str) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i7 = i3 | (tj3Var.m22120g(zh9Var) ? 32 : 16);
        int i8 = i2 & 4;
        if (i8 != 0) {
            i4 = i7 | 384;
            ui3Var2 = ui3Var;
        } else {
            ui3Var2 = ui3Var;
            i4 = i7 | (tj3Var.m22124i(ui3Var2) ? 256 : 128);
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i5 = i4 | 3072;
            zi3Var2 = zi3Var;
        } else {
            zi3Var2 = zi3Var;
            i5 = i4 | (tj3Var.m22124i(zi3Var2) ? 2048 : 1024);
        }
        int i10 = i2 & 16;
        if (i10 != 0) {
            i6 = i5 | 24576;
            vi3Var2 = vi3Var;
        } else {
            vi3Var2 = vi3Var;
            i6 = i5 | (tj3Var.m22124i(vi3Var2) ? 16384 : 8192);
        }
        int i11 = 0;
        if (tj3Var.m22099R(i6 & 1, (i6 & 9363) != 9362)) {
            p84 p84Var = we1.f66679a;
            if (i8 != 0) {
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new C3288l7(7);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3Var4 = (ui3) objM22097O;
            } else {
                ui3Var4 = ui3Var2;
            }
            if (i9 != 0) {
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = new je1(21);
                    tj3Var.m22131l0(objM22097O2);
                }
                zi3Var4 = (zi3) objM22097O2;
            } else {
                zi3Var4 = zi3Var2;
            }
            if (i10 != 0) {
                Object objM22097O3 = tj3Var.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new qy3(13);
                    tj3Var.m22131l0(objM22097O3);
                }
                vi3Var4 = (vi3) objM22097O3;
            } else {
                vi3Var4 = vi3Var2;
            }
            x17 x17Var = h7a.f41916a;
            rv2 rv2VarM13115b = h7a.m13115b(AbstractC0218a.m1129i(tj3Var), tj3Var);
            b34.m3232b(AbstractC0319c.m1450a(b16.f7762a, rv2VarM13115b.f59847e, null), ci8.m4703P(2016466194, new mn4(rv2VarM13115b, str, ui3Var4, i11), tj3Var), null, null, null, 0, 0L, 0L, null, ci8.m4703P(-2002635673, new ik0(zh9Var, zi3Var4, vi3Var4, 27), tj3Var), tj3Var, 805306416, 508);
            vi3Var3 = vi3Var4;
            zi3Var3 = zi3Var4;
            ui3Var3 = ui3Var4;
        } else {
            tj3Var.m22102U();
            ui3Var3 = ui3Var2;
            zi3Var3 = zi3Var2;
            vi3Var3 = vi3Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ey0(str, zh9Var, ui3Var3, zi3Var3, vi3Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m25146b(e16 e16Var, int i, o39 o39Var, ye1 ye1Var, int i2, int i3) {
        int i4;
        o39 o39Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1485858389);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i2;
        }
        int i6 = i4 | (((i3 & 4) == 0 && tj3Var.m22120g(o39Var)) ? 256 : 128);
        int i7 = 1;
        if (tj3Var.m22099R(i6 & 1, (i6 & 147) != 146)) {
            tj3Var.m22104W();
            if ((i2 & 1) == 0 || tj3Var.m22084B()) {
                if (i5 != 0) {
                    e16Var = c99.m4412e(b16.f7762a, 1.0f);
                }
                if ((i3 & 4) != 0) {
                    o39Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                    i6 &= -897;
                }
            } else {
                tj3Var.m22102U();
                if ((i3 & 4) != 0) {
                    i6 &= -897;
                }
            }
            int i8 = i6;
            e16 e16Var2 = e16Var;
            o39 o39Var3 = o39Var;
            tj3Var.m22140r();
            r46.m20381f(e16Var2, o39Var3, null, null, ci8.m4703P(-576033151, new pe0(i, i7), tj3Var), tj3Var, (i8 & 14) | 24576 | ((i8 >> 3) & 112), 12);
            e16Var = e16Var2;
            o39Var2 = o39Var3;
        } else {
            tj3Var.m22102U();
            o39Var2 = o39Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qa4(e16Var, i, o39Var2, i2, i3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m25147c(t17 t17Var, zh9 zh9Var, zi3 zi3Var, vi3 vi3Var, ye1 ye1Var, int i) {
        int i2;
        zi3 zi3Var2;
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-502858216);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(t17Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tj3Var2.m22120g(zh9Var) : tj3Var2.m22124i(zh9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            zi3Var2 = zi3Var;
            i2 |= tj3Var2.m22124i(zi3Var2) ? 256 : 128;
        } else {
            zi3Var2 = zi3Var;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 2048 : 1024;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O);
            }
            t66 t66Var = (t66) objM22097O;
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
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
            oha.m18001g(tj3Var2, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21610W = AbstractC3584sr.m21610W(b16Var, ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, t17Var.mo14021d(), ((fe9) tj3Var2.m22128k(zf1Var)).f38960i, t17Var.mo14018a());
            boolean z = ((i2 & 112) == 32 || ((i2 & 64) != 0 && tj3Var2.m22124i(zh9Var))) | ((i2 & 7168) == 2048) | ((i2 & 896) == 256);
            Object objM22097O2 = tj3Var2.m22097O();
            if (z || objM22097O2 == p84Var) {
                C3445p2 c3445p2 = new C3445p2((Object) zh9Var, (Object) t66Var, vi3Var, (Object) zi3Var2, 12);
                tj3Var2.m22131l0(c3445p2);
                objM22097O2 = c3445p2;
            }
            fa4.m11642c(e16VarM21610W, null, null, null, null, null, false, null, (vi3) objM22097O2, tj3Var2, 0, 510);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(t17Var, zh9Var, zi3Var, vi3Var, i, 10);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m25148d(e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2049473526);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            e16 e16VarM4422o = c99.m4422o(e16Var, 12.0f);
            p04 p04VarM17721b = mhd.f51343a;
            if (p04VarM17721b == null) {
                o04 o04Var = new o04("Rounded.KeyboardDoubleArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i3 = soa.f61116a;
                long j = aa1.f403b;
                pd9 pd9Var = new pd9(j);
                f57 f57Var = new f57();
                f57Var.m11553h(17.29f, 5.71f);
                f57Var.m11551f(17.29f, 5.71f);
                f57Var.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                f57Var.m11551f(12.0f, 9.58f);
                f57Var.m11551f(8.11f, 5.7f);
                f57Var.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                f57Var.m11552g(0.0f, 0.0f);
                f57Var.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                f57Var.m11552g(4.59f, 4.59f);
                f57Var.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                f57Var.m11552g(4.59f, -4.59f);
                f57Var.m11547b(17.68f, 6.73f, 17.68f, 6.1f, 17.29f, 5.71f);
                f57Var.m11546a();
                o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
                pd9 pd9Var2 = new pd9(j);
                f57 f57Var2 = new f57();
                f57Var2.m11553h(17.29f, 12.3f);
                f57Var2.m11551f(17.29f, 12.3f);
                f57Var2.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                f57Var2.m11551f(12.0f, 16.17f);
                f57Var2.m11552g(-3.88f, -3.88f);
                f57Var2.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                f57Var2.m11552g(0.0f, 0.0f);
                f57Var2.m11548c(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
                f57Var2.m11552g(4.59f, 4.59f);
                f57Var2.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                f57Var2.m11552g(4.59f, -4.59f);
                f57Var2.m11547b(17.68f, 13.32f, 17.68f, 12.69f, 17.29f, 12.3f);
                f57Var2.m11546a();
                o04.m17720a(o04Var, f57Var2.f38440a, pd9Var2);
                p04VarM17721b = o04Var.m17721b();
                mhd.f51343a = p04VarM17721b;
            }
            ty3.m22351a(p04VarM17721b, vz1.m23620a0(tj3Var, R$string.stats_trend_down), e16VarM4422o, ((bx2) tj3Var.m22128k(cx2.f34676a)).m4215h(), tj3Var, 0, 0);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, 10, e16Var);
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m25149e(e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1488369327);
        int i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        if (tj3Var.m22099R(i2 & 1, (i2 & 3) != 2)) {
            e16 e16VarM4422o = c99.m4422o(e16Var, 12.0f);
            p04 p04VarM17721b = nhd.f52746a;
            if (p04VarM17721b == null) {
                o04 o04Var = new o04("Rounded.KeyboardDoubleArrowUp", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i3 = soa.f61116a;
                long j = aa1.f403b;
                pd9 pd9Var = new pd9(j);
                f57 f57Var = new f57();
                f57Var.m11553h(6.7f, 18.29f);
                f57Var.m11551f(6.7f, 18.29f);
                f57Var.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                f57Var.m11551f(12.0f, 14.42f);
                f57Var.m11552g(3.88f, 3.88f);
                f57Var.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                f57Var.m11552g(0.0f, 0.0f);
                f57Var.m11548c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                f57Var.m11552g(-4.59f, -4.59f);
                f57Var.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                f57Var.m11551f(6.7f, 16.88f);
                f57Var.m11547b(6.31f, 17.27f, 6.31f, 17.9f, 6.7f, 18.29f);
                f57Var.m11546a();
                o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
                pd9 pd9Var2 = new pd9(j);
                f57 f57Var2 = new f57();
                f57Var2.m11553h(6.7f, 11.7f);
                f57Var2.m11551f(6.7f, 11.7f);
                f57Var2.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                f57Var2.m11551f(12.0f, 7.83f);
                f57Var2.m11552g(3.88f, 3.88f);
                f57Var2.m11548c(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
                f57Var2.m11552g(0.0f, 0.0f);
                f57Var2.m11548c(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
                f57Var2.m11552g(-4.59f, -4.59f);
                f57Var2.m11548c(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
                f57Var2.m11551f(6.7f, 10.29f);
                f57Var2.m11547b(6.31f, 10.68f, 6.31f, 11.31f, 6.7f, 11.7f);
                f57Var2.m11546a();
                o04.m17720a(o04Var, f57Var2.f38440a, pd9Var2);
                p04VarM17721b = o04Var.m17721b();
                nhd.f52746a = p04VarM17721b;
            }
            bq1.m4041Q(p04VarM17721b, vz1.m23620a0(tj3Var, R$string.stats_trend_up), e16VarM4422o, new qd0(5, ((bx2) tj3Var.m22128k(cx2.f34676a)).m4212e()), tj3Var, 0, 56);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3456pd(i, 9, e16Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m25150f(final boolean z, final boolean z2, final String str, LanguageProgressPeriod languageProgressPeriod, final bh9 bh9Var, e16 e16Var, vi3 vi3Var, ye1 ye1Var, final int i, final int i2) {
        int i3;
        vi3 vi3Var2;
        int i4;
        LanguageProgressPeriod languageProgressPeriod2;
        final e16 e16Var2;
        si8 si8VarM22753b;
        str.getClass();
        languageProgressPeriod.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-342923441);
        if ((i & 6) == 0) {
            i3 = i | (tj3Var.m22122h(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var.m22122h(z2) ? 32 : 16;
        }
        int i5 = i3 | (tj3Var.m22120g(str) ? 256 : 128) | (tj3Var.m22116e(languageProgressPeriod.ordinal()) ? 2048 : 1024) | (tj3Var.m22124i(bh9Var) ? 16384 : 8192);
        int i6 = 196608 | i5;
        int i7 = i2 & 64;
        if (i7 != 0) {
            i4 = i5 | 1769472;
            vi3Var2 = vi3Var;
        } else {
            vi3Var2 = vi3Var;
            i4 = i6 | (tj3Var.m22124i(vi3Var2) ? 1048576 : 524288);
        }
        if (tj3Var.m22099R(i4 & 1, (599187 & i4) != 599186)) {
            p84 p84Var = we1.f66679a;
            if (i7 != 0) {
                Object objM22097O = tj3Var.m22097O();
                if (objM22097O == p84Var) {
                    objM22097O = new qy3(12);
                    tj3Var.m22131l0(objM22097O);
                }
                vi3Var2 = (vi3) objM22097O;
            }
            if (z && z2) {
                tj3Var.m22111b0(1695258561);
                si8VarM22753b = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                tj3Var.m22139q(false);
            } else if (z) {
                tj3Var.m22111b0(1695332496);
                si8VarM22753b = si8.m21397c(((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d, null, null, new yj2(0.0f), new yj2(0.0f), 3);
                tj3Var.m22139q(false);
            } else if (z2) {
                tj3Var.m22111b0(1695552937);
                si8VarM22753b = si8.m21397c(((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d, new yj2(0.0f), new yj2(0.0f), null, null, 12);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1695672163);
                tj3Var.m22139q(false);
                si8VarM22753b = ui8.m22753b(0.0f);
            }
            boolean z3 = bh9Var.f8547a != null;
            boolean zM22124i = tj3Var.m22124i(bh9Var) | ((i4 & 3670016) == 1048576);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new C3577sk(25, bh9Var, vi3Var2);
                tj3Var.m22131l0(objM22097O2);
            }
            b16 b16Var = b16.f7762a;
            languageProgressPeriod2 = languageProgressPeriod;
            r46.m20381f(AbstractC0080f.m815b(null, z3, (ui3) objM22097O2, b16Var, 14), si8VarM22753b, null, null, ci8.m4703P(-1764919751, new ik0(bh9Var, str, languageProgressPeriod2), tj3Var), tj3Var, 24576, 12);
            e16Var2 = b16Var;
        } else {
            languageProgressPeriod2 = languageProgressPeriod;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        final vi3 vi3Var3 = vi3Var2;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final LanguageProgressPeriod languageProgressPeriod3 = languageProgressPeriod2;
            x18VarM22143u.f67642d = new zi3() { // from class: kn4
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    yhd.m25150f(z, z2, str, languageProgressPeriod3, bh9Var, e16Var2, vi3Var3, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: g */
    public static final String m25151g(double d) {
        if (Double.isNaN(d) || Double.isInfinite(d) || d < 0.0d) {
            return "00:00";
        }
        long j = (long) d;
        long j2 = j / 3600;
        return String.format(Locale.getDefault(), "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf((j - TimeUnit.HOURS.toSeconds(j2)) / 60)}, 2));
    }
}
