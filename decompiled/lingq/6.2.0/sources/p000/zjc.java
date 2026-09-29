package p000;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.p012ui.highlightedtext.AbstractC1932c;
import java.util.List;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zjc {

    /* JADX INFO: renamed from: a */
    public static final C0282a f71663a = new C0282a(-924326735, false, new ce1(15));

    static {
        new C0282a(2032849685, false, new ce1(16));
        new C0282a(-525772272, false, new ce1(17));
    }

    /* JADX INFO: renamed from: a */
    public static final void m25679a(String str, String str2, String str3, e16 e16Var, ye1 ye1Var, int i, int i2) {
        e16 e16Var2;
        int i3;
        e16 e16Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1384256529);
        int i4 = i | (tj3Var.m22120g(str) ? 4 : 2) | (tj3Var.m22120g(str2) ? 32 : 16) | (tj3Var.m22120g(str3) ? 256 : 128);
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 = i4 | 3072;
            e16Var2 = e16Var;
        } else {
            e16Var2 = e16Var;
            i3 = i4 | (tj3Var.m22120g(e16Var2) ? 2048 : 1024);
        }
        int i6 = i3;
        if (tj3Var.m22099R(i6 & 1, (i6 & 1171) != 1170)) {
            b16 b16Var = b16.f7762a;
            e16 e16Var4 = i5 != 0 ? b16Var : e16Var2;
            e16 e16VarM4412e = c99.m4412e(e16Var4, 1.0f);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
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
            ss5.m21702b(str, null, pb1.m19045o(c99.m4422o(b16Var, 65.0f), ui8.m22753b(8.0f)), null, hl1.f42564a, tj3Var, (i6 & 14) | 1572912, 4024);
            thb.m22044c(tj3Var, c99.m4426s(b16Var, 12.0f));
            as4 as4Var = new as4(1.0f, true);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, as4Var);
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
            vh9 vh9Var = ps5.f56764b;
            lw9.m16554b(str2, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, tj3Var, (i6 >> 3) & 14, 24960, 110586);
            lw9.m16554b(str3, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, (i6 >> 6) & 14, 24960, 110586);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            e16Var3 = e16Var4;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3522r4(str, str2, str3, e16Var3, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m25680b(ey7 ey7Var, nz9 nz9Var, bx7 bx7Var, f00 f00Var, AudioUnderlineMode audioUnderlineMode, vi3 vi3Var, zi3 zi3Var, ye1 ye1Var, int i) {
        float f;
        int i2;
        ox7 ox7Var = ey7Var.f38082f;
        nz9Var.getClass();
        bx7Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-569633544);
        int i3 = i | (tj3Var.m22124i(ey7Var) ? 4 : 2) | (tj3Var.m22124i(nz9Var) ? 32 : 16) | (tj3Var.m22124i(bx7Var) ? 256 : 128) | (tj3Var.m22120g(f00Var) ? 2048 : 1024) | (tj3Var.m22116e(audioUnderlineMode == null ? -1 : audioUnderlineMode.ordinal()) ? 16384 : 8192) | (tj3Var.m22124i(vi3Var) ? 131072 : 65536) | (tj3Var.m22124i(zi3Var) ? 1048576 : 524288);
        if (tj3Var.m22099R(i3 & 1, (599187 & i3) != 599186)) {
            zf1 zf1Var = ge9.f40637a;
            float f2 = ((fe9) tj3Var.m22128k(zf1Var)).f38961j;
            yn8 yn8VarM3972r0 = bna.m3972r0(tj3Var);
            int i4 = ox7Var.f55128a;
            String str = ox7Var.f55131d;
            d27 d27Var = ey7Var.f38083g;
            List list = d27Var.f34869a;
            List list2 = d27Var.f34870b;
            d87 d87Var = bx7Var.f9139c;
            boolean z = bx7Var.f9140d;
            TextHighlightStyle textHighlightStyle = nz9Var.f53462h;
            vs3 vs3Var = nz9Var.f53461g;
            xz7 xz7Var = bx7Var.f9137a;
            Integer numValueOf = xz7Var != null ? Integer.valueOf(xz7Var.f69009f) : null;
            iy7 iy7Var = bx7Var.f9138b;
            Integer numValueOf2 = iy7Var != null ? Integer.valueOf(iy7Var.f44780b) : null;
            int i5 = nz9Var.f53455a;
            double d = nz9Var.f53456b;
            ReaderFont readerFont = nz9Var.f53458d;
            String str2 = ey7Var.f38077a;
            boolean zM15194A = AbstractC3184kh.m15194A(str2);
            boolean z2 = nz9Var.f53466l;
            jt3 jt3Var = new jt3(i4, str, list, list2, d87Var, z, textHighlightStyle, vs3Var, numValueOf, numValueOf2, true, i5, d, readerFont, str2, zM15194A, z2, z2 ? ey7Var.f38084h : AbstractC3194a.m15360M(), bx7Var.f9141e, f00Var, audioUnderlineMode, ox7Var.f55140m, 0.0f, 10485760);
            b16 b16Var = b16.f7762a;
            e16 e16VarM3912B0 = bna.m3912B0(c99.m4411d(b16Var, 1.0f), yn8VarM3972r0, false, 14);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM3912B0);
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
            if (ox7Var.f55129b) {
                tj3Var.m22111b0(648569275);
                i2 = 131072;
                f = 1.0f;
                m25679a(ey7Var.f38080d, ey7Var.f38078b, ey7Var.f38079c, AbstractC3584sr.m21608U(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38960i, ((fe9) tj3Var.m22128k(zf1Var)).f38963l), tj3Var, 0, 0);
                tj3Var.m22139q(false);
            } else {
                f = 1.0f;
                i2 = 131072;
                tj3Var.m22111b0(648973856);
                tj3Var.m22139q(false);
            }
            vx9 vx9Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j;
            e16 e16VarM21608U = AbstractC3584sr.m21608U(c99.m4412e(b16Var, f), ey7Var.f38081e, f2);
            int i6 = i3 & 458752;
            boolean z3 = i6 == i2;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (z3 || objM22097O == p84Var) {
                objM22097O = new qz0(vi3Var, 1);
                tj3Var.m22131l0(objM22097O);
            }
            bj3 bj3Var = (bj3) objM22097O;
            boolean zM22124i = tj3Var.m22124i(ey7Var) | (i6 == i2);
            Object objM22097O2 = tj3Var.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                objM22097O2 = new px7(ey7Var, vi3Var, 0);
                tj3Var.m22131l0(objM22097O2);
            }
            aj3 aj3Var = (aj3) objM22097O2;
            boolean z4 = i6 == i2;
            Object objM22097O3 = tj3Var.m22097O();
            if (z4 || objM22097O3 == p84Var) {
                objM22097O3 = new th7(vi3Var, 25);
                tj3Var.m22131l0(objM22097O3);
            }
            ui3 ui3Var2 = (ui3) objM22097O3;
            boolean z5 = i6 == i2;
            Object objM22097O4 = tj3Var.m22097O();
            if (z5 || objM22097O4 == p84Var) {
                objM22097O4 = new wh7(vi3Var, 7);
                tj3Var.m22131l0(objM22097O4);
            }
            vi3 vi3Var2 = (vi3) objM22097O4;
            boolean z6 = i6 == i2;
            Object objM22097O5 = tj3Var.m22097O();
            int i7 = 8;
            if (z6 || objM22097O5 == p84Var) {
                objM22097O5 = new wh7(vi3Var, i7);
                tj3Var.m22131l0(objM22097O5);
            }
            vi3 vi3Var3 = (vi3) objM22097O5;
            boolean z7 = i6 == i2;
            Object objM22097O6 = tj3Var.m22097O();
            if (z7 || objM22097O6 == p84Var) {
                objM22097O6 = new th7(vi3Var, 26);
                tj3Var.m22131l0(objM22097O6);
            }
            AbstractC1932c.m8799a(jt3Var, vx9Var, e16VarM21608U, bj3Var, aj3Var, ui3Var2, vi3Var2, vi3Var3, (ui3) objM22097O6, zi3Var, tj3Var, 8 | ((i3 << 9) & 1879048192), 0);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new sx0(ey7Var, nz9Var, bx7Var, f00Var, audioUnderlineMode, vi3Var, zi3Var, i, 3);
        }
    }
}
