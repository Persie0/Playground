package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.window.AbstractC0456d;
import androidx.compose.p002ui.window.SecureFlagPolicy;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public abstract class ul1 {

    /* JADX INFO: renamed from: a */
    public static final rl1 f64040a;

    static {
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        zf1 zf1Var = AbstractC0456d.f5291a;
        SecureFlagPolicy secureFlagPolicy2 = SecureFlagPolicy.Inherit;
        SecureFlagPolicy secureFlagPolicy3 = SecureFlagPolicy.Inherit;
        long j = aa1.f406e;
        long j2 = aa1.f403b;
        f64040a = new rl1(j, j2, j2, aa1.m198b(0.38f, j2), aa1.m198b(0.38f, j2));
    }

    /* JADX INFO: renamed from: a */
    public static final void m22785a(rl1 rl1Var, e16 e16Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        e16 e16Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-527864079);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(rl1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            e16Var2 = e16Var;
            i2 |= tj3Var.m22120g(e16Var2) ? 32 : 16;
        } else {
            e16Var2 = e16Var;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 256 : 128;
        }
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            fc0 fc0Var = tl1.f62469a;
            e16 e16VarM3912B0 = bna.m3912B0(AbstractC3584sr.m21609V(AbstractC3423or.m18279s0(d32.m10007D(vz1.m23616X(e16Var2, 3.0f, ui8.m22753b(4.0f), 0L, 0L, 28), rl1Var.f59464a, ss5.f61356d), IntrinsicSize.Max), 0.0f, tl1.f62472d, 1), bna.m3972r0(tj3Var), false, 14);
            int i3 = (i2 << 3) & 7168;
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
            c0282a.invoke(db1.f35347a, tj3Var, Integer.valueOf(((i3 >> 6) & 112) | 6));
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(i, 12, rl1Var, e16Var, c0282a);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m22786b(e16 e16Var, rl1 rl1Var, vi3 vi3Var, ye1 ye1Var, int i, int i2) {
        int i3;
        int i4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-625529233);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (tj3Var.m22120g(rl1Var) ? 32 : 16);
        }
        int i7 = i4 | (tj3Var.m22124i(vi3Var) ? 256 : 128);
        if (tj3Var.m22099R(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                e16Var = b16.f7762a;
            }
            if (i6 != 0) {
                rl1Var = f64040a;
            }
            m22785a(rl1Var, e16Var, ci8.m4703P(-250345048, new C3180kd(9, vi3Var, rl1Var), tj3Var), tj3Var, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            tj3Var.m22102U();
        }
        e16 e16Var2 = e16Var;
        rl1 rl1Var2 = rl1Var;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2956e9(e16Var2, rl1Var2, vi3Var, i, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m22787c(String str, boolean z, rl1 rl1Var, e16 e16Var, aj3 aj3Var, ui3 ui3Var, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-2001167027);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var.m22122h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(rl1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22120g(e16Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var.m22124i(aj3Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22124i(ui3Var) ? 131072 : 65536;
        }
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            fc0 fc0Var = tl1.f62469a;
            float f = tl1.f62471c;
            C3661uu c3661uu = new C3661uu(f, true, new gm5(28));
            boolean z2 = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objM22097O = tj3Var.m22097O();
            if (z2 || objM22097O == we1.f66679a) {
                objM22097O = new ji1(z, ui3Var, 1);
                tj3Var.m22131l0(objM22097O);
            }
            e16 e16VarM21609V = AbstractC3584sr.m21609V(c99.m4424q(c99.m4412e(AbstractC0080f.m815b(str, z, (ui3) objM22097O, e16Var, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            sj8 sj8VarM20003a = qj8.m20003a(c3661uu, fc0Var, tj3Var, 54);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            se1.f60731q.getClass();
            ui3 ui3Var2 = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var2);
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
            if (aj3Var == null) {
                tj3Var.m22111b0(-1597947094);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(-1597947093);
                float f2 = tl1.f62473e;
                e16 e16VarM4420m = c99.m4420m(b16.f7762a, f2, 0.0f, f2, f2, 2);
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52808c, false);
                int iHashCode2 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m2 = tj3Var.m22132m();
                e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM4420m);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var2);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var, ht5VarM19966d);
                oha.m18001g(tj3Var, zi3Var2, l77VarM22132m2);
                AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var3, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var4, e16VarM1322c2);
                aj3Var.invoke(new aa1(z ? rl1Var.f59466c : rl1Var.f59468e), tj3Var, 0);
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            }
            long j = z ? rl1Var.f59465b : rl1Var.f59467d;
            d32.m10031c(str, new as4(1.0f, true), new vx9(j, tl1.f62476h, tl1.f62477i, null, tl1.f62479k, tl1.f62470b, tl1.f62478j, 16613240), null, 0, false, 1, 0, null, tj3Var, (i2 & 14) | 1572864, 952);
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new qb0(str, z, rl1Var, e16Var, aj3Var, ui3Var, i);
        }
    }
}
