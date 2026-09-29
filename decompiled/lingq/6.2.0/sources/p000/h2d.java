package p000;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.AbstractC0070i;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0394f;
import androidx.compose.p002ui.platform.AbstractC0402n;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.p012ui.highlightedtext.AbstractC1932c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h2d {

    /* JADX INFO: renamed from: a */
    public static p04 f41732a;

    /* JADX WARN: Code duplicated, block: B:177:0x042f  */
    /* JADX WARN: Code duplicated, block: B:178:0x0432  */
    /* JADX WARN: Code duplicated, block: B:182:0x0442  */
    /* JADX WARN: Code duplicated, block: B:185:0x0452  */
    /* JADX WARN: Code duplicated, block: B:186:0x0454  */
    /* JADX WARN: Code duplicated, block: B:190:0x0464  */
    /* JADX WARN: Code duplicated, block: B:193:0x047a  */
    /* JADX WARN: Code duplicated, block: B:197:0x048b  */
    /* JADX INFO: renamed from: a */
    public static final void m13015a(e37 e37Var, wz7 wz7Var, qx8 qx8Var, String str, nz9 nz9Var, vi3 vi3Var, ye1 ye1Var, int i) {
        final vi3 vi3Var2;
        String str2;
        boolean z;
        vi3 vi3Var3;
        boolean z2;
        p84 p84Var;
        boolean z3;
        boolean zM22116e;
        Object objM22097O;
        boolean z4;
        boolean zM22116e2;
        Object objM22097O2;
        boolean zM22120g;
        Object objM22097O3;
        nz9 nz9Var2 = nz9Var;
        wz7Var.getClass();
        nz9Var2.getClass();
        ReaderFont readerFont = nz9Var2.f53458d;
        boolean z5 = nz9Var2.f53466l;
        vi3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2110326541);
        int i2 = i | (tj3Var.m22120g(e37Var) ? 4 : 2) | (tj3Var.m22120g(wz7Var) ? 32 : 16) | (tj3Var.m22120g(qx8Var) ? 256 : 128) | (tj3Var.m22120g(str) ? 2048 : 1024) | (tj3Var.m22124i(nz9Var2) ? 16384 : 8192) | (tj3Var.m22124i(vi3Var) ? 131072 : 65536);
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            lw8 lw8Var = (lw8) u91.m22591I0(e37Var.f36654c);
            int i3 = lw8Var != null ? lw8Var.f50212a : 0;
            Integer num = wz7Var.f67564a;
            boolean z6 = num != null && i3 == num.intValue();
            if (str == null) {
                str2 = qx8Var != null ? qx8Var.f58342c : null;
            } else {
                str2 = str;
            }
            boolean z7 = str2 != null && (z5 || (qx8Var != null && qx8Var.f58340a));
            Context context = (Context) tj3Var.m22128k(AbstractC0394f.f4761b);
            boolean zM22116e3 = tj3Var.m22116e(readerFont.ordinal());
            Object objM22097O4 = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (zM22116e3 || objM22097O4 == p84Var2) {
                objM22097O4 = mjc.m16862d(readerFont, context);
                tj3Var.m22131l0(objM22097O4);
            }
            Typeface typeface = (Typeface) objM22097O4;
            boolean zM22120g2 = tj3Var.m22120g(typeface);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22120g2 || objM22097O5 == p84Var2) {
                if (typeface != null) {
                    Typeface typefaceCreate = Typeface.create(typeface, 2);
                    typefaceCreate.getClass();
                    objM22097O5 = new fh5(new m58(typefaceCreate, 8));
                } else {
                    objM22097O5 = null;
                }
                tj3Var.m22131l0(objM22097O5);
            }
            xa3 xa3Var = (xa3) objM22097O5;
            vh9 vh9Var = ps5.f56764b;
            final long jM198b = aa1.m198b(0.4f, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55874r);
            zf1 zf1Var = ge9.f40637a;
            fe9 fe9Var = (fe9) tj3Var.m22128k(zf1Var);
            String str3 = str2;
            vh9 vh9Var2 = AbstractC0402n.f4816h;
            final float fMo912g0 = ((fb2) tj3Var.m22128k(vh9Var2)).mo912g0(fe9Var.f38952a);
            final float fMo912g1 = ((fb2) tj3Var.m22128k(vh9Var2)).mo912g0(fe9Var.f38956e);
            final float fMo912g2 = ((fb2) tj3Var.m22128k(vh9Var2)).mo912g0(fe9Var.f38952a);
            f00 f00Var = wz7Var.f67568e;
            f00 f00Var2 = (f00Var == null || i3 != f00Var.f38127a) ? null : f00Var;
            final int i4 = i3;
            int i5 = 1;
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4412e(b16.f7762a, 1.0f), 0.0f, ((fe9) tj3Var.m22128k(zf1Var)).f38952a, 1);
            Object objM22097O6 = tj3Var.m22097O();
            if (objM22097O6 == p84Var2) {
                objM22097O6 = new ow8(i5);
                tj3Var.m22131l0(objM22097O6);
            }
            e16 e16VarM1406a = AbstractC0309d.m1406a(e16VarM21609V, (vi3) objM22097O6);
            boolean zM22122h = tj3Var.m22122h(z6) | tj3Var.m22118f(jM198b) | tj3Var.m22114d(fMo912g0) | tj3Var.m22114d(fMo912g1) | tj3Var.m22114d(fMo912g2);
            Object objM22097O7 = tj3Var.m22097O();
            if (zM22122h || objM22097O7 == p84Var2) {
                final boolean z8 = z6;
                objM22097O7 = new vi3() { // from class: bx8
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        interfaceC0310a.getClass();
                        if (z8) {
                            float f = fMo912g0;
                            float f2 = fMo912g1;
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(-f)) << 32) | (((long) Float.floatToRawIntBits(-f2)) & 4294967295L);
                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits((f * 2.0f) + Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits((f2 * 2.0f) + Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)))) & 4294967295L);
                            float f3 = fMo912g2;
                            interfaceC0310a.mo598h0(jM198b, (240 & 2) != 0 ? 0L : jFloatToRawIntBits, jFloatToRawIntBits2, (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), (240 & 16) != 0 ? w33.f66328a : null, (240 & 128) != 0 ? 3 : 0);
                        }
                        return xfa.f68157a;
                    }
                };
                z = z8;
                tj3Var.m22131l0(objM22097O7);
            } else {
                z = z6;
            }
            e16 e16VarM23654x = vz1.m23654x(e16VarM1406a, (vi3) objM22097O7);
            sj8 sj8VarM20003a = qj8.m20003a(eh0.f37236b, nj0.f52817l, tj3Var, 48);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM23654x);
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
            vi3 vi3Var4 = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var4);
            zi3 zi3Var4 = C0352b.f4301d;
            as4 as4VarM10871c = e65.m10871c(tj3Var, e16VarM1322c, zi3Var4, 1.0f, true);
            boolean z9 = z;
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var, 0);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, as4VarM10871c);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, bb1VarM230a);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var4);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            jt3 jt3Var = new jt3(e37Var.f36652a, e37Var.f36653b, e37Var.f36655d, e37Var.f36656e, null, false, nz9Var.f53462h, nz9Var.f53461g, wz7Var.f67566c, wz7Var.f67567d, true, nz9Var.f53455a, nz9Var.f53456b, nz9Var.f53458d, wz7Var.f67571h, wz7Var.f67572i, false, null, false, f00Var2, wz7Var.f67569f, null, 0.0f, 14876720);
            vx9 vx9VarM23584b = vx9.m23584b(((ms5) tj3Var.m22128k(vh9Var)).f51800b.f71406j, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, 0L, null, null, null, 0L, null, null, 0, 0L, null, 16777214);
            int i6 = i2 & 458752;
            int i7 = i2 & 14;
            boolean z10 = (i6 == 131072) | (i7 == 4);
            Object objM22097O8 = tj3Var.m22097O();
            if (z10 || objM22097O8 == p84Var2) {
                vi3Var3 = vi3Var;
                objM22097O8 = new in0(1, vi3Var3, e37Var);
                tj3Var.m22131l0(objM22097O8);
            } else {
                vi3Var3 = vi3Var;
            }
            bj3 bj3Var = (bj3) objM22097O8;
            boolean z11 = (i6 == 131072) | (i7 == 4);
            Object objM22097O9 = tj3Var.m22097O();
            if (z11 || objM22097O9 == p84Var2) {
                z2 = true;
                objM22097O9 = new jn0(1, vi3Var3, e37Var);
                tj3Var.m22131l0(objM22097O9);
            } else {
                z2 = true;
            }
            aj3 aj3Var = (aj3) objM22097O9;
            boolean z12 = i6 == 131072 ? z2 : false;
            Object objM22097O10 = tj3Var.m22097O();
            if (z12 || objM22097O10 == p84Var2) {
                objM22097O10 = new nc8(vi3Var3, 29);
                tj3Var.m22131l0(objM22097O10);
            }
            ui3 ui3Var2 = (ui3) objM22097O10;
            boolean z13 = i6 == 131072 ? z2 : false;
            Object objM22097O11 = tj3Var.m22097O();
            if (z13 || objM22097O11 == p84Var2) {
                objM22097O11 = new cx8(vi3Var3, 0);
                tj3Var.m22131l0(objM22097O11);
            }
            vi3 vi3Var5 = (vi3) objM22097O11;
            Object objM22097O12 = tj3Var.m22097O();
            if (objM22097O12 == p84Var2) {
                objM22097O12 = new ow8(2);
                tj3Var.m22131l0(objM22097O12);
            }
            vi3 vi3Var6 = (vi3) objM22097O12;
            Object objM22097O13 = tj3Var.m22097O();
            if (objM22097O13 == p84Var2) {
                objM22097O13 = new C3288l7(7);
                tj3Var.m22131l0(objM22097O13);
            }
            ui3 ui3Var3 = (ui3) objM22097O13;
            nz9Var2 = nz9Var;
            AbstractC1932c.m8799a(jt3Var, vx9VarM23584b, null, bj3Var, aj3Var, ui3Var2, vi3Var5, vi3Var6, ui3Var3, null, tj3Var, 113246216, 516);
            AbstractC0054a.m731f(z7, null, AbstractC0070i.m772g(null, 0.0f, 3), AbstractC0070i.m773h(null, 3), null, ci8.m4703P(644191935, new a05(str3, nz9Var2, xa3Var, 15), tj3Var), tj3Var, 1600518, 18);
            tj3Var.m22139q(true);
            final boolean z14 = z9 && wz7Var.f67570g;
            boolean z15 = lw8Var != null && (lw8Var.f50218g.isEmpty() ^ true);
            boolean z16 = qx8Var != null && qx8Var.f58341b;
            boolean z17 = !z5 || str3 == null;
            boolean zM22122h2 = tj3Var.m22122h(z14) | (i6 == 131072) | tj3Var.m22116e(i4);
            Object objM22097O14 = tj3Var.m22097O();
            if (zM22122h2) {
                p84Var = p84Var2;
            } else {
                p84Var = p84Var2;
                if (objM22097O14 != p84Var) {
                    vi3Var2 = vi3Var;
                }
                ui3 ui3Var4 = (ui3) objM22097O14;
                if (i6 == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                zM22116e = z3 | tj3Var.m22116e(i4);
                objM22097O = tj3Var.m22097O();
                if (zM22116e || objM22097O == p84Var) {
                    objM22097O = new C3390nz(vi3Var2, i4, 9);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3 ui3Var5 = (ui3) objM22097O;
                if (i6 == 131072) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM22116e2 = z4 | tj3Var.m22116e(i4);
                objM22097O2 = tj3Var.m22097O();
                if (zM22116e2 || objM22097O2 == p84Var) {
                    objM22097O2 = new C3390nz(vi3Var2, i4, 10);
                    tj3Var.m22131l0(objM22097O2);
                }
                ui3 ui3Var6 = (ui3) objM22097O2;
                zM22120g = tj3Var.m22120g(lw8Var) | (i6 == 131072) | tj3Var.m22116e(i4);
                objM22097O3 = tj3Var.m22097O();
                if (zM22120g || objM22097O3 == p84Var) {
                    objM22097O3 = new im3(lw8Var, i4, 3, vi3Var2);
                    tj3Var.m22131l0(objM22097O3);
                }
                b2d.m3203b(z9, z14, z16, z17, z15, ui3Var4, ui3Var5, ui3Var6, (ui3) objM22097O3, tj3Var, 0);
                tj3Var = tj3Var;
                tj3Var.m22139q(true);
            }
            vi3Var2 = vi3Var;
            objM22097O14 = new ui3() { // from class: ax8
                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    boolean z18 = z14;
                    vi3 vi3Var7 = vi3Var2;
                    if (z18) {
                        vi3Var7.invoke(new ora(ua7.f63643e));
                    } else {
                        vi3Var7.invoke(new sqa(i4));
                    }
                    return xfa.f68157a;
                }
            };
            tj3Var.m22131l0(objM22097O14);
            ui3 ui3Var7 = (ui3) objM22097O14;
            if (i6 == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            zM22116e = z3 | tj3Var.m22116e(i4);
            objM22097O = tj3Var.m22097O();
            if (zM22116e) {
                objM22097O = new C3390nz(vi3Var2, i4, 9);
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = new C3390nz(vi3Var2, i4, 9);
                tj3Var.m22131l0(objM22097O);
            }
            ui3 ui3Var8 = (ui3) objM22097O;
            if (i6 == 131072) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM22116e2 = z4 | tj3Var.m22116e(i4);
            objM22097O2 = tj3Var.m22097O();
            if (zM22116e2) {
                objM22097O2 = new C3390nz(vi3Var2, i4, 10);
                tj3Var.m22131l0(objM22097O2);
            } else {
                objM22097O2 = new C3390nz(vi3Var2, i4, 10);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3 ui3Var9 = (ui3) objM22097O2;
            zM22120g = tj3Var.m22120g(lw8Var) | (i6 == 131072) | tj3Var.m22116e(i4);
            objM22097O3 = tj3Var.m22097O();
            if (zM22120g) {
                objM22097O3 = new im3(lw8Var, i4, 3, vi3Var2);
                tj3Var.m22131l0(objM22097O3);
            } else {
                objM22097O3 = new im3(lw8Var, i4, 3, vi3Var2);
                tj3Var.m22131l0(objM22097O3);
            }
            b2d.m3203b(z9, z14, z16, z17, z15, ui3Var7, ui3Var8, ui3Var9, (ui3) objM22097O3, tj3Var, 0);
            tj3Var = tj3Var;
            tj3Var.m22139q(true);
        } else {
            vi3Var2 = vi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zs0(e37Var, wz7Var, qx8Var, str, nz9Var2, vi3Var2, i, 6);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final p04 m13016b() {
        p04 p04Var = f41732a;
        if (p04Var != null) {
            return p04Var;
        }
        o04 o04Var = new o04("Rounded.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = soa.f61116a;
        pd9 pd9Var = new pd9(aa1.f403b);
        f57 f57Var = new f57();
        f57Var.m11553h(18.0f, 13.0f);
        f57Var.m11550e(-5.0f);
        f57Var.m11557l(5.0f);
        f57Var.m11548c(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        f57Var.m11555j(-1.0f, -0.45f, -1.0f, -1.0f);
        f57Var.m11557l(-5.0f);
        f57Var.m11549d(6.0f);
        f57Var.m11548c(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        f57Var.m11555j(0.45f, -1.0f, 1.0f, -1.0f);
        f57Var.m11550e(5.0f);
        f57Var.m11556k(6.0f);
        f57Var.m11548c(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        f57Var.m11555j(1.0f, 0.45f, 1.0f, 1.0f);
        f57Var.m11557l(5.0f);
        f57Var.m11550e(5.0f);
        f57Var.m11548c(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        f57Var.m11555j(-0.45f, 1.0f, -1.0f, 1.0f);
        f57Var.m11546a();
        o04.m17720a(o04Var, f57Var.f38440a, pd9Var);
        p04 p04VarM17721b = o04Var.m17721b();
        f41732a = p04VarM17721b;
        return p04VarM17721b;
    }
}
