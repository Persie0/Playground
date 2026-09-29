package p000;

import android.content.Context;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.p012ui.highlightedtext.AbstractC1932c;
import com.lingq.feature.reader.R$drawable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n2d {
    /* JADX INFO: renamed from: a */
    public static final void m17192a(List list, vi3 vi3Var, ui3 ui3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        list.getClass();
        vi3Var.getClass();
        ui3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1452890377);
        int i2 = i | (tj3Var2.m22124i(list) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        int i3 = 0;
        if (tj3Var2.m22099R(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) tj3Var2.m22128k(AbstractC0394f.f4761b);
            tj3Var = tj3Var2;
            q2d.m19625a(ui3Var, nfb.f52688c, null, ci8.m4703P(-2023938451, new C0839c9(i3, ui3Var), tj3Var2), null, nfb.f52690e, ci8.m4703P(739460746, new C2919d9(u91.m22614f1(list, new C2993f9(context, 0)), context, vi3Var, ui3Var, 0), tj3Var2), null, 0L, 0L, 0L, 0L, null, tj3Var, 1772598, 16276);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 0, list, vi3Var, ui3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m17193b(int i, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str, boolean z) {
        tj3 tj3Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(36316651);
        int i2 = i | (tj3Var2.m22122h(z) ? 4 : 2) | (tj3Var2.m22120g(str) ? 32 : 16) | (tj3Var2.m22124i(ui3Var) ? 256 : 128) | (tj3Var2.m22120g(e16Var) ? 2048 : 1024);
        if (tj3Var2.m22099R(i2 & 1, (i2 & 1171) != 1170)) {
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            String strM23620a0 = vz1.m23620a0(tj3Var2, z ? R$string.lesson_hide_notes : R$string.lesson_show_notes);
            vh9 vh9Var = ps5.f56764b;
            vx9 vx9Var = ((ms5) tj3Var2.m22128k(vh9Var)).f51800b.f71409m;
            long j = ((ms5) tj3Var2.m22128k(vh9Var)).f51799a.f55873q;
            b16 b16Var = b16.f7762a;
            lw9.m16554b(strM23620a0, AbstractC3584sr.m21607T(AbstractC0080f.m815b(null, false, ui3Var, b16Var, 15), 8.0f), j, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, vx9Var, tj3Var2, 0, 0, 131064);
            tj3Var = tj3Var2;
            if (z) {
                tj3Var.m22111b0(-886526575);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, 8.0f));
                lw9.m16554b(str, null, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55875s, null, 0L, new wb3(1), null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71407k, tj3Var, (i2 >> 3) & 14, 0, 131034);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-886234431);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qw1(z, str, ui3Var, e16Var, i);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m17194c(ey7 ey7Var, nz9 nz9Var, bx7 bx7Var, final hx8 hx8Var, List list, boolean z, f00 f00Var, AudioUnderlineMode audioUnderlineMode, vi3 vi3Var, ye1 ye1Var, int i) {
        final vi3 vi3Var2;
        int i2;
        int i3;
        final int i4;
        List list2 = hx8Var.f43131l;
        float f = ey7Var.f38081e;
        nz9Var.getClass();
        bx7Var.getClass();
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2091510151);
        int i5 = i | (tj3Var.m22124i(ey7Var) ? 4 : 2) | (tj3Var.m22124i(nz9Var) ? 32 : 16) | (tj3Var.m22124i(bx7Var) ? 256 : 128) | (tj3Var.m22124i(hx8Var) ? 2048 : 1024) | (tj3Var.m22124i(list) ? 16384 : 8192) | (tj3Var.m22122h(z) ? 131072 : 65536) | (tj3Var.m22120g(f00Var) ? 1048576 : 524288) | (tj3Var.m22116e(audioUnderlineMode == null ? -1 : audioUnderlineMode.ordinal()) ? 8388608 : 4194304) | (tj3Var.m22124i(vi3Var) ? 67108864 : 33554432);
        if (tj3Var.m22099R(i5 & 1, (38347923 & i5) != 38347922)) {
            yn8 yn8VarM3972r0 = bna.m3972r0(tj3Var);
            ox7 ox7Var = ey7Var.f38082f;
            int i6 = ox7Var.f55128a;
            String str = ox7Var.f55131d;
            d27 d27Var = ey7Var.f38083g;
            List list3 = d27Var.f34869a;
            List list4 = d27Var.f34870b;
            d87 d87Var = bx7Var.f9139c;
            boolean z2 = bx7Var.f9140d;
            TextHighlightStyle textHighlightStyle = nz9Var.f53462h;
            vs3 vs3Var = nz9Var.f53461g;
            xz7 xz7Var = bx7Var.f9137a;
            Integer numValueOf = xz7Var != null ? Integer.valueOf(xz7Var.f69009f) : null;
            iy7 iy7Var = bx7Var.f9138b;
            Integer numValueOf2 = iy7Var != null ? Integer.valueOf(iy7Var.f44780b) : null;
            int i7 = nz9Var.f53455a;
            double d = nz9Var.f53456b;
            ReaderFont readerFont = nz9Var.f53458d;
            String str2 = ey7Var.f38077a;
            jt3 jt3Var = new jt3(i6, str, list3, list4, d87Var, z2, textHighlightStyle, vs3Var, numValueOf, numValueOf2, true, i7, d, readerFont, str2, AbstractC3184kh.m15194A(str2), false, null, bx7Var.f9141e, f00Var, audioUnderlineMode, null, 0.0f, 14876672);
            b16 b16Var = b16.f7762a;
            e16 e16VarM3912B0 = bna.m3912B0(c99.m4411d(b16Var, 1.0f), yn8VarM3972r0, false, 14);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52792K, tj3Var, 48);
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
            zf1 zf1Var = ge9.f40637a;
            thb.m22044c(tj3Var, c99.m4414g(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38957f));
            p84 p84Var = we1.f66679a;
            if (z) {
                tj3Var.m22111b0(-397764689);
                boolean z3 = hx8Var.f43122c;
                boolean z4 = hx8Var.f43123d;
                float f2 = hx8Var.f43124e;
                i3 = 234881024;
                int i8 = i5 & 234881024;
                boolean zM22124i = (i8 == 67108864) | tj3Var.m22124i(hx8Var);
                Object objM22097O = tj3Var.m22097O();
                if (zM22124i || objM22097O == p84Var) {
                    final int i9 = 0;
                    vi3Var2 = vi3Var;
                    objM22097O = new ui3() { // from class: ix8
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i10 = i9;
                            xfa xfaVar = xfa.f68157a;
                            hx8 hx8Var2 = hx8Var;
                            vi3 vi3Var3 = vi3Var2;
                            switch (i10) {
                                case 0:
                                    vi3Var3.invoke(new ms7(hx8Var2.f43121b, hx8Var2.f43120a, hx8Var2.f43124e));
                                    break;
                                case 1:
                                    vi3Var3.invoke(new et7(hx8Var2.f43120a));
                                    break;
                                case 2:
                                    vi3Var3.invoke(new qs7(hx8Var2.f43120a));
                                    break;
                                default:
                                    vi3Var3.invoke(new dt7(hx8Var2.f43120a));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O);
                } else {
                    vi3Var2 = vi3Var;
                }
                ui3 ui3Var2 = (ui3) objM22097O;
                boolean z5 = i8 == 67108864;
                Object objM22097O2 = tj3Var.m22097O();
                if (z5 || objM22097O2 == p84Var) {
                    objM22097O2 = new cx8(vi3Var2, 6);
                    tj3Var.m22131l0(objM22097O2);
                }
                i2 = 67108864;
                m17195d(z3, z4, f2, list, ui3Var2, (vi3) objM22097O2, null, tj3Var, (i5 >> 3) & 7168);
                tj3Var = tj3Var;
                ux5.m23003z(b16Var, ((fe9) tj3Var.m22128k(zf1Var)).f38957f, tj3Var, false);
            } else {
                jt3Var = jt3Var;
                i2 = 67108864;
                i3 = 234881024;
                vi3Var2 = vi3Var;
                tj3Var.m22111b0(-397115053);
                tj3Var.m22139q(false);
            }
            vx9 vx9Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71406j;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), f, 0.0f, 2);
            int i10 = i5 & i3;
            boolean z6 = i10 == i2;
            Object objM22097O3 = tj3Var.m22097O();
            if (z6 || objM22097O3 == p84Var) {
                objM22097O3 = new qz0(vi3Var2, 2);
                tj3Var.m22131l0(objM22097O3);
            }
            bj3 bj3Var = (bj3) objM22097O3;
            boolean zM22124i2 = tj3Var.m22124i(ey7Var) | (i10 == i2);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O4 == p84Var) {
                objM22097O4 = new px7(ey7Var, vi3Var2, 1);
                tj3Var.m22131l0(objM22097O4);
            }
            aj3 aj3Var = (aj3) objM22097O4;
            boolean z7 = i10 == i2;
            Object objM22097O5 = tj3Var.m22097O();
            if (z7 || objM22097O5 == p84Var) {
                objM22097O5 = new ex8(vi3Var2, 1);
                tj3Var.m22131l0(objM22097O5);
            }
            ui3 ui3Var3 = (ui3) objM22097O5;
            boolean z8 = i10 == i2;
            Object objM22097O6 = tj3Var.m22097O();
            if (z8 || objM22097O6 == p84Var) {
                objM22097O6 = new cx8(vi3Var2, 1);
                tj3Var.m22131l0(objM22097O6);
            }
            vi3 vi3Var3 = (vi3) objM22097O6;
            boolean z9 = i10 == i2;
            Object objM22097O7 = tj3Var.m22097O();
            if (z9 || objM22097O7 == p84Var) {
                objM22097O7 = new cx8(vi3Var2, 2);
                tj3Var.m22131l0(objM22097O7);
            }
            vi3 vi3Var4 = (vi3) objM22097O7;
            boolean z10 = i10 == i2;
            Object objM22097O8 = tj3Var.m22097O();
            if (z10 || objM22097O8 == p84Var) {
                objM22097O8 = new ex8(vi3Var2, 2);
                tj3Var.m22131l0(objM22097O8);
            }
            ui3 ui3Var4 = (ui3) objM22097O8;
            jt3 jt3Var2 = jt3Var;
            tj3 tj3Var2 = tj3Var;
            AbstractC1932c.m8799a(jt3Var2, vx9Var, e16VarM21609V, bj3Var, aj3Var, ui3Var3, vi3Var3, vi3Var4, ui3Var4, null, tj3Var2, 8, 512);
            thb.m22044c(tj3Var2, c99.m4414g(b16Var, 16.0f));
            boolean z11 = hx8Var.f43125f;
            String str3 = hx8Var.f43126g;
            boolean z12 = hx8Var.f43127h;
            boolean zM22124i3 = (i10 == i2) | tj3Var2.m22124i(hx8Var);
            Object objM22097O9 = tj3Var2.m22097O();
            if (zM22124i3 || objM22097O9 == p84Var) {
                final int i11 = 1;
                objM22097O9 = new ui3() { // from class: ix8
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i12 = i11;
                        xfa xfaVar = xfa.f68157a;
                        hx8 hx8Var2 = hx8Var;
                        vi3 vi3Var5 = vi3Var2;
                        switch (i12) {
                            case 0:
                                vi3Var5.invoke(new ms7(hx8Var2.f43121b, hx8Var2.f43120a, hx8Var2.f43124e));
                                break;
                            case 1:
                                vi3Var5.invoke(new et7(hx8Var2.f43120a));
                                break;
                            case 2:
                                vi3Var5.invoke(new qs7(hx8Var2.f43120a));
                                break;
                            default:
                                vi3Var5.invoke(new dt7(hx8Var2.f43120a));
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var2.m22131l0(objM22097O9);
            }
            ui3 ui3Var5 = (ui3) objM22097O9;
            boolean zM22124i4 = (i10 == i2) | tj3Var2.m22124i(hx8Var);
            Object objM22097O10 = tj3Var2.m22097O();
            if (zM22124i4 || objM22097O10 == p84Var) {
                i4 = 2;
                objM22097O10 = new ui3() { // from class: ix8
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        int i12 = i4;
                        xfa xfaVar = xfa.f68157a;
                        hx8 hx8Var2 = hx8Var;
                        vi3 vi3Var5 = vi3Var2;
                        switch (i12) {
                            case 0:
                                vi3Var5.invoke(new ms7(hx8Var2.f43121b, hx8Var2.f43120a, hx8Var2.f43124e));
                                break;
                            case 1:
                                vi3Var5.invoke(new et7(hx8Var2.f43120a));
                                break;
                            case 2:
                                vi3Var5.invoke(new qs7(hx8Var2.f43120a));
                                break;
                            default:
                                vi3Var5.invoke(new dt7(hx8Var2.f43120a));
                                break;
                        }
                        return xfaVar;
                    }
                };
                tj3Var2.m22131l0(objM22097O10);
            } else {
                i4 = 2;
            }
            m17196e(z11, str3, z12, ui3Var5, (ui3) objM22097O10, AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), f, 0.0f, i4), tj3Var2, 0);
            tj3Var = tj3Var2;
            final int i12 = 3;
            if (hx8Var.f43128i.length() > 0) {
                tj3Var.m22111b0(-394970349);
                boolean z13 = hx8Var.f43130k;
                String str4 = hx8Var.f43128i;
                boolean zM22124i5 = (i10 == 67108864) | tj3Var.m22124i(hx8Var);
                Object objM22097O11 = tj3Var.m22097O();
                if (zM22124i5 || objM22097O11 == p84Var) {
                    objM22097O11 = new ui3() { // from class: ix8
                        @Override // p000.ui3
                        /* JADX INFO: renamed from: a */
                        public final Object mo0a() {
                            int i13 = i12;
                            xfa xfaVar = xfa.f68157a;
                            hx8 hx8Var2 = hx8Var;
                            vi3 vi3Var5 = vi3Var2;
                            switch (i13) {
                                case 0:
                                    vi3Var5.invoke(new ms7(hx8Var2.f43121b, hx8Var2.f43120a, hx8Var2.f43124e));
                                    break;
                                case 1:
                                    vi3Var5.invoke(new et7(hx8Var2.f43120a));
                                    break;
                                case 2:
                                    vi3Var5.invoke(new qs7(hx8Var2.f43120a));
                                    break;
                                default:
                                    vi3Var5.invoke(new dt7(hx8Var2.f43120a));
                                    break;
                            }
                            return xfaVar;
                        }
                    };
                    tj3Var.m22131l0(objM22097O11);
                }
                m17193b(0, tj3Var, (ui3) objM22097O11, AbstractC3584sr.m21609V(c99.m4412e(b16Var, 1.0f), f, 0.0f, 2), str4, z13);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-394570573);
                tj3Var.m22139q(false);
            }
            if (list2.isEmpty() || !hx8Var.f43132m) {
                tj3Var.m22111b0(-393496237);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-394415914);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, 16.0f));
                vs3 vs3Var2 = nz9Var.f53461g;
                boolean z14 = hx8Var.f43133n;
                boolean z15 = i10 == 67108864;
                Object objM22097O12 = tj3Var.m22097O();
                if (z15 || objM22097O12 == p84Var) {
                    objM22097O12 = new cx8(vi3Var2, 3);
                    tj3Var.m22131l0(objM22097O12);
                }
                vi3 vi3Var5 = (vi3) objM22097O12;
                boolean z16 = i10 == 67108864;
                Object objM22097O13 = tj3Var.m22097O();
                if (z16 || objM22097O13 == p84Var) {
                    objM22097O13 = new ww8(vi3Var2, 2);
                    tj3Var.m22131l0(objM22097O13);
                }
                zi3 zi3Var = (zi3) objM22097O13;
                boolean z17 = i10 == 67108864;
                Object objM22097O14 = tj3Var.m22097O();
                if (z17 || objM22097O14 == p84Var) {
                    objM22097O14 = new cx8(vi3Var2, 4);
                    tj3Var.m22131l0(objM22097O14);
                }
                vi3 vi3Var6 = (vi3) objM22097O14;
                boolean z18 = i10 == 67108864;
                Object objM22097O15 = tj3Var.m22097O();
                if (z18 || objM22097O15 == p84Var) {
                    objM22097O15 = new ww8(vi3Var2, i12);
                    tj3Var.m22131l0(objM22097O15);
                }
                zi3 zi3Var2 = (zi3) objM22097O15;
                boolean z19 = i10 == 67108864;
                Object objM22097O16 = tj3Var.m22097O();
                if (z19 || objM22097O16 == p84Var) {
                    objM22097O16 = new cx8(vi3Var2, 5);
                    tj3Var.m22131l0(objM22097O16);
                }
                q2d.m19626b(vs3Var2, list2, true, z14, vi3Var5, zi3Var, vi3Var6, zi3Var2, (vi3) objM22097O16, AbstractC3584sr.m21609V(b16Var, f, 0.0f, 2), tj3Var, 384, 0);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            }
            ux5.m23003z(b16Var, 80.0f, tj3Var, true);
        } else {
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new en0(ey7Var, nz9Var, bx7Var, hx8Var, list, z, f00Var, audioUnderlineMode, vi3Var2, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m17195d(final boolean z, final boolean z2, final float f, final List list, final ui3 ui3Var, vi3 vi3Var, e16 e16Var, ye1 ye1Var, final int i) {
        int i2;
        tj3 tj3Var;
        vi3 vi3Var2;
        final e16 e16Var2;
        String strM17732g;
        p84 p84Var;
        b16 b16Var;
        zi3 zi3Var;
        gc0 gc0Var;
        boolean z3;
        vi3 vi3Var3;
        tj3 tj3Var2;
        t66 t66Var;
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(1045308855);
        if ((i & 6) == 0) {
            i2 = (tj3Var3.m22122h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var3.m22122h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var3.m22114d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var3.m22124i(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var3.m22124i(ui3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var3.m22124i(vi3Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (tj3Var3.m22099R(i3 & 1, (599187 & i3) != 599186)) {
            Object objM22097O = tj3Var3.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (objM22097O == p84Var2) {
                objM22097O = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var3.m22131l0(objM22097O);
            }
            t66 t66Var2 = (t66) objM22097O;
            int i4 = (int) f;
            if (f == i4) {
                strM17732g = AbstractC3393o1.m17732g(i4, "x");
            } else {
                strM17732g = f + "x";
            }
            String str = strM17732g;
            b16 b16Var2 = b16.f7762a;
            e16 e16VarM4414g = c99.m4414g(c99.m4426s(b16Var2, 100.0f), 70.0f);
            gc0 gc0Var2 = nj0.f52812g;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var2, false);
            int iHashCode = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m = tj3Var3.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM4414g);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var2);
            } else {
                tj3Var3.m22137o0();
            }
            zi3 zi3Var2 = C0352b.f4303f;
            oha.m18001g(tj3Var3, zi3Var2, ht5VarM19966d);
            zi3 zi3Var3 = C0352b.f4302e;
            oha.m18001g(tj3Var3, zi3Var3, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var4 = C0352b.f4304g;
            oha.m18001g(tj3Var3, zi3Var4, numValueOf);
            vi3 vi3Var4 = C0352b.f4305h;
            oha.m18000f(tj3Var3, vi3Var4);
            zi3 zi3Var5 = C0352b.f4301d;
            oha.m18001g(tj3Var3, zi3Var5, e16VarM1322c);
            e16 e16VarM4422o = c99.m4422o(b16Var2, 60.0f);
            si8 si8Var = ui8.f63972a;
            e16 e16VarM19045o = pb1.m19045o(e16VarM4422o, si8Var);
            long j = p58.m18900f(tj3Var3).f55822G;
            mv3 mv3Var = ss5.f61356d;
            e16 e16VarM815b = AbstractC0080f.m815b(null, false, ui3Var, d32.m10007D(e16VarM19045o, j, mv3Var), 15);
            ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var2, false);
            int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m2 = tj3Var3.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16VarM815b);
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var2);
            } else {
                tj3Var3.m22137o0();
            }
            oha.m18001g(tj3Var3, zi3Var2, ht5VarM19966d2);
            oha.m18001g(tj3Var3, zi3Var3, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var3, zi3Var4, tj3Var3, vi3Var4);
            oha.m18001g(tj3Var3, zi3Var5, e16VarM1322c2);
            if (z2) {
                tj3Var3.m22111b0(993636950);
                e16 e16VarM4422o2 = c99.m4422o(b16Var2, 28.0f);
                long j2 = p58.m18900f(tj3Var3).f55873q;
                p84Var = p84Var2;
                b16Var = b16Var2;
                zi3Var = zi3Var4;
                z3 = false;
                vi3Var3 = vi3Var4;
                gc0Var = gc0Var2;
                dn7.m10492a(e16VarM4422o2, j2, 3.0f, 0L, 0, 0.0f, tj3Var3, 390, 56);
                tj3Var2 = tj3Var3;
                tj3Var2.m22139q(false);
            } else {
                p84Var = p84Var2;
                b16Var = b16Var2;
                zi3Var = zi3Var4;
                gc0Var = gc0Var2;
                z3 = false;
                if (z) {
                    tj3Var3.m22111b0(993945679);
                    vi3Var3 = vi3Var4;
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_sentence_stop, tj3Var3, 0), vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.reader_stop_sentence), c99.m4422o(b16Var, 28.0f), p58.m18900f(tj3Var3).f55873q, tj3Var3, 392, 0);
                    tj3Var2 = tj3Var3;
                    tj3Var2.m22139q(false);
                } else {
                    tj3Var3.m22111b0(994335535);
                    vi3Var3 = vi3Var4;
                    ty3.m22352b(AbstractC3423or.m18236U(R$drawable.ic_sentence_play, tj3Var3, 0), vz1.m23620a0(tj3Var3, com.lingq.feature.reader.R$string.reader_play_sentence), c99.m4422o(b16Var, 28.0f), p58.m18900f(tj3Var3).f55873q, tj3Var3, 392, 0);
                    tj3Var2 = tj3Var3;
                    tj3Var2.m22139q(false);
                }
            }
            tj3Var2.m22139q(true);
            e16 e16VarM10007D = d32.m10007D(pb1.m19045o(c99.m4422o(pvc.m19528x(ci0.f10109a.mo3727a(b16Var, nj0.f52813h), 8.0f, 12.0f), 32.0f), si8Var), p58.m18900f(tj3Var2).f55822G, mv3Var);
            Object objM22097O2 = tj3Var2.m22097O();
            p84 p84Var3 = p84Var;
            if (objM22097O2 == p84Var3) {
                t66Var = t66Var2;
                objM22097O2 = new un7(20, t66Var);
                tj3Var2.m22131l0(objM22097O2);
            } else {
                t66Var = t66Var2;
            }
            e16 e16VarM815b2 = AbstractC0080f.m815b(null, z3, (ui3) objM22097O2, e16VarM10007D, 15);
            ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, z3);
            int iHashCode3 = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m3 = tj3Var2.m22132m();
            e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var2, e16VarM815b2);
            tj3Var2.m22119f0();
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var2);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, zi3Var2, ht5VarM19966d3);
            oha.m18001g(tj3Var2, zi3Var3, l77VarM22132m3);
            AbstractC3393o1.m17747v(iHashCode3, tj3Var2, zi3Var, tj3Var2, vi3Var3);
            oha.m18001g(tj3Var2, zi3Var5, e16VarM1322c3);
            tj3 tj3Var4 = tj3Var2;
            t66 t66Var3 = t66Var;
            lw9.m16554b(str, null, p58.m18900f(tj3Var2).f55873q, null, 0L, null, null, 0L, null, new ks9(3), 0L, 0, false, 1, 0, null, vx9.m23584b(p58.m18902j(tj3Var2).f71411o, 0L, d32.m10018P(9), null, null, null, 0L, null, null, 0, 0L, null, 16777213), tj3Var4, 0, 24576, 113658);
            tj3Var = tj3Var4;
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
            if (((Boolean) t66Var3.getValue()).booleanValue()) {
                tj3Var.m22111b0(-2009024333);
                boolean z4 = (i3 & 458752) == 131072;
                Object objM22097O3 = tj3Var.m22097O();
                if (z4 || objM22097O3 == p84Var3) {
                    vi3Var2 = vi3Var;
                    objM22097O3 = new ix0(vi3Var2, t66Var3, 17);
                    tj3Var.m22131l0(objM22097O3);
                } else {
                    vi3Var2 = vi3Var;
                }
                vi3 vi3Var5 = (vi3) objM22097O3;
                Object objM22097O4 = tj3Var.m22097O();
                if (objM22097O4 == p84Var3) {
                    objM22097O4 = new un7(21, t66Var3);
                    tj3Var.m22131l0(objM22097O4);
                }
                int i5 = i3 >> 6;
                d4d.m10095a(f, list, vi3Var5, (ui3) objM22097O4, tj3Var, (i5 & 14) | 3072 | (i5 & 112));
                tj3Var.m22139q(false);
            } else {
                vi3Var2 = vi3Var;
                tj3Var.m22111b0(-2008724501);
                tj3Var.m22139q(false);
            }
            e16Var2 = b16Var;
        } else {
            tj3Var = tj3Var3;
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
            e16Var2 = e16Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final vi3 vi3Var6 = vi3Var2;
            x18VarM22143u.f67642d = new zi3() { // from class: jx8
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    n2d.m17195d(z, z2, f, list, ui3Var, vi3Var6, e16Var2, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m17196e(boolean z, String str, boolean z2, ui3 ui3Var, ui3 ui3Var2, e16 e16Var, ye1 ye1Var, int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1598441085);
        int i2 = i | (tj3Var.m22122h(z) ? 4 : 2) | (tj3Var.m22120g(str) ? 32 : 16) | (tj3Var.m22122h(z2) ? 256 : 128) | (tj3Var.m22124i(ui3Var) ? 2048 : 1024) | (tj3Var.m22124i(ui3Var2) ? 16384 : 8192) | (tj3Var.m22120g(e16Var) ? 131072 : 65536);
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
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
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52789H, tj3Var, 48);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            b16 b16Var = b16.f7762a;
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, b16Var);
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
            lw9.m16554b(vz1.m23620a0(tj3Var, z ? R$string.lesson_hide_translation : R$string.lesson_show_translation), AbstractC3584sr.m21607T(AbstractC0080f.m815b(null, false, ui3Var, b16Var, 15), 8.0f), p58.m18900f(tj3Var).f55873q, null, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71409m, tj3Var, 0, 0, 131064);
            tj3Var = tj3Var;
            if (z) {
                tj3Var.m22111b0(-1146765988);
                thb.m22044c(tj3Var, c99.m4426s(b16Var, 8.0f));
                omd.m18141c(ui3Var2, c99.m4422o(b16Var, 24.0f), false, null, null, snc.f61077a, tj3Var, ((i2 >> 12) & 14) | 1572912, 60);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1146265307);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
            if (z) {
                tj3Var.m22111b0(1640047188);
                thb.m22044c(tj3Var, c99.m4414g(b16Var, 8.0f));
                if (z2) {
                    tj3Var.m22111b0(1640133523);
                    lw9.m16554b(vz1.m23620a0(tj3Var, com.lingq.feature.reader.R$string.ui_loading), null, p58.m18900f(tj3Var).f55875s, null, 0L, new wb3(1), null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, 0, 0, 131034);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1640446220);
                    lw9.m16554b(str, null, p58.m18900f(tj3Var).f55875s, null, 0L, new wb3(1), null, 0L, null, null, 0L, 0, false, 0, 0, null, p58.m18902j(tj3Var).f71407k, tj3Var, (i2 >> 3) & 14, 0, 131034);
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1640713161);
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new o48(z, str, z2, ui3Var, ui3Var2, e16Var, i);
        }
    }
}
