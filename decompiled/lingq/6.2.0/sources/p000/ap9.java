package p000;

import androidx.compose.material3.AbstractC0262s;
import androidx.compose.material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0406r;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ap9 {

    /* JADX INFO: renamed from: a */
    public static final float f7332a;

    /* JADX INFO: renamed from: b */
    public static final float f7333b;

    /* JADX INFO: renamed from: c */
    public static final float f7334c;

    /* JADX INFO: renamed from: d */
    public static final float f7335d;

    /* JADX INFO: renamed from: e */
    public static final float f7336e;

    /* JADX INFO: renamed from: f */
    public static final ic9 f7337f;

    static {
        float f = bp9.f8818p;
        f7332a = f;
        f7333b = bp9.f8828z;
        f7334c = bp9.f8825w;
        float f2 = bp9.f8822t;
        f7335d = f2;
        f7336e = (f2 - f) / 2.0f;
        f7337f = new ic9(0);
    }

    /* JADX INFO: renamed from: a */
    public static final void m2973a(boolean z, vi3 vi3Var, e16 e16Var, boolean z2, xo9 xo9Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        e16 e16Var2;
        boolean z3;
        xo9 xo9Var2;
        xo9 xo9Var3;
        int i3;
        e16 e16VarM10522I;
        e16 e16Var3;
        boolean z4;
        boolean z5;
        int i4;
        v56 v56Var;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-263339167);
        if ((i & 6) == 0) {
            i2 = i | (tj3Var2.m22122h(z) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22124i(vi3Var) ? 32 : 16;
        }
        int i5 = i2 | 28032;
        if ((i & 196608) == 0) {
            i5 = 93568 | i2;
        }
        int i6 = 1572864 | i5;
        if (tj3Var2.m22099R(i6 & 1, (599187 & i6) != 599186)) {
            tj3Var2.m22104W();
            int i7 = i & 1;
            b16 b16Var = b16.f7762a;
            if (i7 == 0 || tj3Var2.m22084B()) {
                pa1 pa1Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a;
                xo9Var3 = pa1Var.f55867m0;
                long j = pa1Var.f55872p;
                if (xo9Var3 == null) {
                    long jM20491d = ra1.m20491d(pa1Var, bp9.f8817o);
                    long jM20491d2 = ra1.m20491d(pa1Var, bp9.f8820r);
                    long j2 = aa1.f411j;
                    long jM20491d3 = ra1.m20491d(pa1Var, bp9.f8819q);
                    long jM20491d4 = ra1.m20491d(pa1Var, bp9.f8827y);
                    long jM20491d5 = ra1.m20491d(pa1Var, bp9.f8802B);
                    long jM20491d6 = ra1.m20491d(pa1Var, bp9.f8826x);
                    long jM20491d7 = ra1.m20491d(pa1Var, bp9.f8801A);
                    long jM10012J = d32.m10012J(aa1.m198b(bp9.f8804b, ra1.m20491d(pa1Var, bp9.f8803a)), j);
                    long jM20491d8 = ra1.m20491d(pa1Var, bp9.f8807e);
                    float f = bp9.f8808f;
                    xo9 xo9Var4 = new xo9(jM20491d, jM20491d2, j2, jM20491d3, jM20491d4, jM20491d5, jM20491d6, jM20491d7, jM10012J, d32.m10012J(aa1.m198b(f, jM20491d8), j), j2, d32.m10012J(aa1.m198b(bp9.f8806d, ra1.m20491d(pa1Var, bp9.f8805c)), j), d32.m10012J(aa1.m198b(bp9.f8810h, ra1.m20491d(pa1Var, bp9.f8809g)), j), d32.m10012J(aa1.m198b(f, ra1.m20491d(pa1Var, bp9.f8813k)), j), d32.m10012J(aa1.m198b(f, ra1.m20491d(pa1Var, bp9.f8814l)), j), d32.m10012J(aa1.m198b(bp9.f8812j, ra1.m20491d(pa1Var, bp9.f8811i)), j));
                    pa1Var.f55867m0 = xo9Var4;
                    xo9Var3 = xo9Var4;
                }
                i3 = i6 & (-458753);
                e16VarM10522I = b16Var;
                e16Var3 = e16VarM10522I;
                z4 = true;
            } else {
                tj3Var2.m22102U();
                e16Var3 = e16Var;
                xo9Var3 = xo9Var;
                i3 = i6 & (-458753);
                e16VarM10522I = b16Var;
                z4 = z2;
            }
            tj3Var2.m22140r();
            tj3Var2.m22111b0(1768510810);
            Object objM22097O = tj3Var2.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = AbstractC3393o1.m17729d(tj3Var2);
            }
            v56 v56Var2 = (v56) objM22097O;
            tj3Var2.m22139q(false);
            if (vi3Var != null) {
                iv3 iv3Var = AbstractC0262s.f3627a;
                i4 = 2;
                e16VarM10522I = do7.m10522I(c06.f9271b, z, v56Var2, null, z4, new uh8(2), vi3Var);
                boolean z6 = z4;
                v56Var = v56Var2;
                z5 = z6;
            } else {
                z5 = z4;
                i4 = 2;
                v56Var = v56Var2;
            }
            e16 e16VarM4430w = c99.m4430w(e16Var3.mo3161g(e16VarM10522I), nj0.f52812g, i4);
            vi3 vi3VarM1816b = AbstractC0406r.m1816b();
            float f2 = f7334c;
            float f3 = f7335d;
            int i8 = i3 << 3;
            tj3Var = tj3Var2;
            xo9 xo9Var5 = xo9Var3;
            m2974b(e16VarM4430w.mo3161g(new b99(f2, f3, f2, f3, false, vi3VarM1816b)), z, z5, xo9Var5, v56Var, x49.m24271b(bp9.f8815m, tj3Var2), tj3Var, (i8 & 57344) | (i8 & 112) | ((i3 >> 6) & 896));
            z3 = z5;
            xo9Var2 = xo9Var5;
            e16Var2 = e16Var3;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z3 = z2;
            xo9Var2 = xo9Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new k04(z, vi3Var, e16Var2, z3, xo9Var2, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2974b(e16 e16Var, boolean z, boolean z2, xo9 xo9Var, v56 v56Var, o39 o39Var, ye1 ye1Var, int i) {
        int i2;
        long j;
        long j2;
        long j3;
        long j4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-670917213);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22122h(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22120g(xo9Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22120g(v56Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var.m22120g(o39Var) ? 1048576 : 524288;
        }
        if (tj3Var.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            if (z2) {
                j = z ? xo9Var.f68446b : xo9Var.f68450f;
            } else {
                j = z ? xo9Var.f68454j : xo9Var.f68458n;
            }
            if (z2) {
                j2 = z ? xo9Var.f68445a : xo9Var.f68449e;
            } else {
                j2 = z ? xo9Var.f68453i : xo9Var.f68457m;
            }
            o39 o39VarM24271b = x49.m24271b(bp9.f8824v, tj3Var);
            zf1 zf1Var = gh8.f40823a;
            sh8 sh8Var = ((th8) tj3Var.m22128k(zf1Var)).f62294a;
            float f = bp9.f8823u;
            if (z2) {
                j3 = j2;
                j4 = z ? xo9Var.f68447c : xo9Var.f68451g;
            } else {
                j3 = j2;
                j4 = z ? xo9Var.f68455k : xo9Var.f68459o;
            }
            e16 e16VarM10007D = d32.m10007D(r46.m20387m(e16Var, f, j4, o39VarM24271b), j, o39VarM24271b);
            b16 b16Var = b16.f7762a;
            e16 e16VarMo3161g = e16VarM10007D.mo3161g(b16Var);
            ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarMo3161g);
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
            e16 e16VarMo3161g2 = ci0.f10109a.mo3727a(b16Var, nj0.f52811f).mo3161g(new a0a(v56Var, z, ss5.m21705c0(MotionSchemeKeyTokens.FastSpatial, tj3Var)));
            float f2 = bp9.f8821s / 2.0f;
            sh8 sh8Var2 = ((th8) tj3Var.m22128k(zf1Var)).f62294a;
            e16 e16VarM10007D2 = d32.m10007D(s34.m21046a(e16VarMo3161g2, v56Var, gh8.m12656a(false, f2, 0L, null, 220)), j3, o39Var);
            ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52812g, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM10007D2);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var, ht5VarM19966d2);
            oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
            tj3Var.m22111b0(1236071411);
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new mh7(e16Var, z, z2, xo9Var, v56Var, o39Var, i, 1);
        }
    }
}
