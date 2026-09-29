package com.lingq.feature.edit.components;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.feature.edit.R$string;
import com.lingq.feature.edit.components.AbstractC2078a;
import java.util.Arrays;
import java.util.Locale;
import kotlin.text.Regex;
import p000.AbstractC3393o1;
import p000.AbstractC3584sr;
import p000.C0023al;
import p000.C2956e9;
import p000.C3353mz;
import p000.C3390nz;
import p000.C3441oz;
import p000.C3478pz;
import p000.C3516qz;
import p000.C3592sz;
import p000.C3661uu;
import p000.C3849zx;
import p000.ab1;
import p000.as4;
import p000.b16;
import p000.bb1;
import p000.bna;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.e16;
import p000.eh0;
import p000.fe9;
import p000.ge9;
import p000.gj4;
import p000.gm5;
import p000.hj4;
import p000.l77;
import p000.lda;
import p000.nj0;
import p000.oha;
import p000.omd;
import p000.p84;
import p000.qj8;
import p000.se1;
import p000.sj8;
import p000.t66;
import p000.tj3;
import p000.ui3;
import p000.umb;
import p000.vi3;
import p000.vv9;
import p000.vz1;
import p000.we1;
import p000.x18;
import p000.ye1;
import p000.zf1;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.edit.components.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2078a {

    /* JADX INFO: renamed from: a */
    public static final Regex f25963a = new Regex("\\d{2}:\\d{2}\\.\\d");

    /* JADX INFO: renamed from: a */
    public static final void m8990a(String str, ui3 ui3Var, ui3 ui3Var2, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-37001213);
        int i2 = i | (tj3Var.m22124i(ui3Var) ? 32 : 16) | (tj3Var.m22124i(ui3Var2) ? 256 : 128);
        int i3 = 0;
        int i4 = 1;
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, b16Var);
            se1.f60731q.getClass();
            ui3 ui3Var3 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var3);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            omd.m18141c(ui3Var, c99.m4422o(b16Var, 28.0f), false, null, null, ci8.m4703P(417837975, new C3441oz(str, i3), tj3Var), tj3Var, ((i2 >> 3) & 14) | 1572912, 60);
            omd.m18141c(ui3Var2, c99.m4422o(b16Var, 28.0f), false, null, null, ci8.m4703P(-793363186, new C3441oz(str, i4), tj3Var), tj3Var, ((i2 >> 6) & 14) | 1572912, 60);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3478pz(str, ui3Var, ui3Var2, i, 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m8991b(C3849zx c3849zx, vi3 vi3Var, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        e16 e16Var2;
        c3849zx.getClass();
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-2108135103);
        int i2 = i | (tj3Var2.m22120g(c3849zx) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
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
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var3, numValueOf);
            vi3 vi3Var2 = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var2);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
            int i4 = ((i3 << 6) & 7168) | 384;
            m8992c(vz1.m23620a0(tj3Var2, R$string.lesson_edit_start_time), c3849zx.f72327a, 0, vi3Var, tj3Var2, i4);
            m8992c(vz1.m23620a0(tj3Var2, R$string.lesson_edit_end_time), c3849zx.f72328b, 1, vi3Var, tj3Var2, i4);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4412e2, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a, 0.0f, 0.0f, 13);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38952a, true, new gm5(28)), nj0.f52817l, tj3Var2, 0);
            int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m2 = tj3Var2.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var2);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (z || objM22097O == p84Var) {
                objM22097O = new C3353mz(vi3Var, 0);
                tj3Var2.m22131l0(objM22097O);
            }
            AbstractC0231g.m1153f(805306368, 510, null, tj3Var2, (ui3) objM22097O, umb.f64089a, null, null, null, false);
            boolean z2 = i5 == 32;
            Object objM22097O2 = tj3Var2.m22097O();
            if (z2 || objM22097O2 == p84Var) {
                objM22097O2 = new C3353mz(vi3Var, 1);
                tj3Var2.m22131l0(objM22097O2);
            }
            AbstractC0231g.m1153f(805306368, 510, null, tj3Var2, (ui3) objM22097O2, umb.f64090b, null, null, null, false);
            tj3Var = tj3Var2;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            e16Var2 = b16Var;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 2, c3849zx, vi3Var, e16Var2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m8992c(final String str, final double d, int i, vi3 vi3Var, ye1 ye1Var, final int i2) {
        int i3;
        vi3 vi3Var2;
        int i4;
        tj3 tj3Var;
        t66 t66Var;
        int i5;
        boolean z;
        boolean z2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1482071599);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var2.m22120g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var2.m22112c(d) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var2.m22116e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= tj3Var2.m22124i(vi3Var) ? 2048 : 1024;
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            InterfaceC0300b interfaceC0300b = (InterfaceC0300b) tj3Var2.m22128k(AbstractC0402n.f4817i);
            boolean z3 = (i3 & 112) == 32;
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (z3 || objM22097O == p84Var) {
                int iRound = (int) Math.round(10.0d * d);
                objM22097O = String.format(Locale.getDefault(), "%02d:%02d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(iRound / 600), Integer.valueOf((iRound % 600) / 10), Integer.valueOf(iRound % 10)}, 3));
                tj3Var2.m22131l0(objM22097O);
            }
            String str2 = (String) objM22097O;
            Object objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(new vv9(str2, 6, 0L));
                tj3Var2.m22131l0(objM22097O2);
            }
            t66 t66Var2 = (t66) objM22097O2;
            Object objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O3);
            }
            t66 t66Var3 = (t66) objM22097O3;
            boolean zM22120g = tj3Var2.m22120g(str2);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22120g || objM22097O4 == p84Var) {
                objM22097O4 = new AudioTimestampEditorKt$TimestampRow$1$1(str2, t66Var3, t66Var2, null);
                tj3Var2.m22131l0(objM22097O4);
            }
            d32.m10047k(tj3Var2, (zi3) objM22097O4, str2);
            b16 b16Var = b16.f7762a;
            e16 e16VarM4412e = c99.m4412e(b16Var, 1.0f);
            zf1 zf1Var = ge9.f40637a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(e16VarM4412e, 0.0f, ((fe9) tj3Var2.m22128k(zf1Var)).f38952a, 0.0f, 0.0f, 13);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM21611X);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            zi3 zi3Var = C0352b.f4303f;
            oha.m18001g(tj3Var2, zi3Var, bb1VarM230a);
            zi3 zi3Var2 = C0352b.f4302e;
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var3 = C0352b.f4304g;
            oha.m18001g(tj3Var2, zi3Var3, numValueOf);
            vi3 vi3Var3 = C0352b.f4305h;
            oha.m18000f(tj3Var2, vi3Var3);
            zi3 zi3Var4 = C0352b.f4301d;
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c);
            e16 e16VarM4412e2 = c99.m4412e(b16Var, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(new C3661uu(((fe9) tj3Var2.m22128k(zf1Var)).f38955d, true, new gm5(28)), nj0.f52789H, tj3Var2, 48);
            int iHashCode2 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m2 = tj3Var2.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var2, e16VarM4412e2);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var, sj8VarM20003a);
            oha.m18001g(tj3Var2, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var2, zi3Var3, tj3Var2, vi3Var3);
            oha.m18001g(tj3Var2, zi3Var4, e16VarM1322c2);
            vv9 vv9Var = (vv9) t66Var2.getValue();
            as4 as4Var = new as4(1.0f, true);
            int i6 = i3 & 7168;
            int i7 = i3 & 896;
            boolean zM22120g2 = (i6 == 2048) | (i7 == 256) | tj3Var2.m22120g(str2);
            Object objM22097O5 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O5 == p84Var) {
                t66Var = t66Var2;
                i5 = 0;
                C3516qz c3516qz = new C3516qz(vi3Var, i, str2, t66Var3, t66Var, 0);
                tj3Var2.m22131l0(c3516qz);
                objM22097O5 = c3516qz;
            } else {
                t66Var = t66Var2;
                i5 = 0;
            }
            e16 e16VarM16108H = lda.m16108H(as4Var, (vi3) objM22097O5);
            hj4 hj4Var = new hj4(i5, 7, null, 119);
            boolean zM22124i = tj3Var2.m22124i(r23);
            Object objM22097O6 = tj3Var2.m22097O();
            if (zM22124i || objM22097O6 == p84Var) {
                objM22097O6 = new C3592sz(interfaceC0300b, i5);
                tj3Var2.m22131l0(objM22097O6);
            }
            gj4 gj4Var = new gj4((vi3) objM22097O6, null, 62);
            Object objM22097O7 = tj3Var2.m22097O();
            if (objM22097O7 == p84Var) {
                objM22097O7 = new C0023al(1, t66Var);
                tj3Var2.m22131l0(objM22097O7);
            }
            bna.m3940b(vv9Var, (vi3) objM22097O7, e16VarM16108H, false, null, ci8.m4703P(1767819835, new C3441oz(str, 2), tj3Var2), null, null, null, hj4Var, gj4Var, true, 0, 0, null, null, tj3Var2, 1572912, 12779520, 8159160);
            tj3Var = tj3Var2;
            boolean z4 = (i7 == 256) | (i6 == 2048);
            Object objM22097O8 = tj3Var.m22097O();
            if (z4 || objM22097O8 == p84Var) {
                i4 = i;
                vi3Var2 = vi3Var;
                objM22097O8 = new C3390nz(vi3Var2, i4, 4);
                tj3Var.m22131l0(objM22097O8);
            } else {
                i4 = i;
                vi3Var2 = vi3Var;
            }
            ui3 ui3Var2 = (ui3) objM22097O8;
            boolean z5 = (i7 == 256) | (i6 == 2048);
            Object objM22097O9 = tj3Var.m22097O();
            if (z5 || objM22097O9 == p84Var) {
                objM22097O9 = new C3390nz(vi3Var2, i4, 5);
                tj3Var.m22131l0(objM22097O9);
            }
            m8990a("M", ui3Var2, (ui3) objM22097O9, tj3Var, 6);
            boolean z6 = (i6 == 2048) | (i7 == 256);
            Object objM22097O10 = tj3Var.m22097O();
            if (z6 || objM22097O10 == p84Var) {
                z = false;
                objM22097O10 = new C3390nz(vi3Var2, i4, 0);
                tj3Var.m22131l0(objM22097O10);
            } else {
                z = false;
            }
            ui3 ui3Var3 = (ui3) objM22097O10;
            boolean z7 = (i6 == 2048 ? true : z) | (i7 == 256 ? true : z);
            Object objM22097O11 = tj3Var.m22097O();
            if (z7 || objM22097O11 == p84Var) {
                z2 = true;
                objM22097O11 = new C3390nz(vi3Var2, i4, 1);
                tj3Var.m22131l0(objM22097O11);
            } else {
                z2 = true;
            }
            m8990a("S", ui3Var3, (ui3) objM22097O11, tj3Var, 6);
            boolean z8 = (i6 == 2048 ? z2 : z) | (i7 == 256 ? z2 : z);
            Object objM22097O12 = tj3Var.m22097O();
            if (z8 || objM22097O12 == p84Var) {
                objM22097O12 = new C3390nz(vi3Var2, i4, 2);
                tj3Var.m22131l0(objM22097O12);
            }
            ui3 ui3Var4 = (ui3) objM22097O12;
            boolean z9 = i6 == 2048 ? z2 : z;
            if (i7 == 256) {
                z = z2;
            }
            boolean z10 = z9 | z;
            Object objM22097O13 = tj3Var.m22097O();
            if (z10 || objM22097O13 == p84Var) {
                objM22097O13 = new C3390nz(vi3Var2, i4, 3);
                tj3Var.m22131l0(objM22097O13);
            }
            m8990a("C", ui3Var4, (ui3) objM22097O13, tj3Var, 6);
            tj3Var.m22139q(z2);
            tj3Var.m22139q(z2);
        } else {
            vi3Var2 = vi3Var;
            i4 = i;
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final int i8 = i4;
            final vi3 vi3Var4 = vi3Var2;
            x18VarM22143u.f67642d = new zi3() { // from class: rz
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC2078a.m8992c(str, d, i8, vi3Var4, (ye1) obj, pk9.m19383z(i2 | 1));
                    return xfa.f68157a;
                }
            };
        }
    }
}
