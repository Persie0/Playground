package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import com.airbnb.lottie.compose.AbstractC0871a;
import com.airbnb.lottie.compose.C0872b;
import com.airbnb.lottie.compose.C0874d;
import com.lingq.core.p012ui.R$drawable;
import com.lingq.core.p012ui.R$raw;

/* JADX INFO: loaded from: classes2.dex */
public abstract class m1d {
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x0136  */
    /* JADX WARN: Code duplicated, block: B:74:0x016c  */
    /* JADX WARN: Code duplicated, block: B:77:0x017f  */
    /* JADX WARN: Code duplicated, block: B:79:0x018f  */
    /* JADX WARN: Code duplicated, block: B:82:0x019a  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX INFO: renamed from: a */
    public static final void m16596a(final e16 e16Var, final int i, final int i2, final int i3, final boolean z, boolean z2, ye1 ye1Var, final int i4, final int i5) {
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        final boolean z5;
        tj3 tj3Var;
        x18 x18VarM22143u;
        boolean z6;
        int i8;
        ui3 ui3Var;
        ci0 ci0Var;
        b16 b16Var;
        tj3 tj3Var2;
        C0872b c0872bM5022b;
        boolean zM22120g;
        Object objM22097O;
        ?? r4;
        tj3 tj3Var3 = (tj3) ye1Var;
        tj3Var3.m22115d0(-2067501817);
        if ((i4 & 6) == 0) {
            i6 = (tj3Var3.m22120g(e16Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= tj3Var3.m22116e(i) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= tj3Var3.m22116e(i2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i7 = i3;
            i6 |= tj3Var3.m22116e(i7) ? 2048 : 1024;
        } else {
            i7 = i3;
        }
        if ((i4 & 24576) == 0) {
            i6 |= tj3Var3.m22122h(z) ? 16384 : 8192;
        }
        int i9 = i5 & 32;
        if (i9 == 0) {
            if ((196608 & i4) == 0) {
                z3 = z2;
                i6 |= tj3Var3.m22122h(z3) ? 131072 : 65536;
            }
            if ((74899 & i6) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (tj3Var3.m22099R(i6 & 1, z4)) {
                if (i9 != 0) {
                    z6 = true;
                } else {
                    z6 = z3;
                }
                if (i2 != 0) {
                    i8 = i / i2;
                } else {
                    i8 = 0;
                }
                ht5 ht5VarM19966d = qh0.m19966d(nj0.f52812g, false);
                int iHashCode = Long.hashCode(tj3Var3.f62385T);
                l77 l77VarM22132m = tj3Var3.m22132m();
                e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16Var);
                se1.f60731q.getClass();
                ui3Var = C0352b.f4299b;
                tj3Var3.m22119f0();
                if (tj3Var3.f62384S) {
                    tj3Var3.m22130l(ui3Var);
                } else {
                    tj3Var3.m22137o0();
                }
                oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d);
                oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                oha.m18000f(tj3Var3, C0352b.f4305h);
                oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                y27 y27VarM18236U = AbstractC3423or.m18236U(ss5.m21727y(i3, z), tj3Var3, 0);
                ci0Var = ci0.f10109a;
                b16Var = b16.f7762a;
                tj3Var2 = tj3Var3;
                int i10 = i6;
                bq1.m4042R(y27VarM18236U, null, ci0Var.m4674b(b16Var), null, null, 0.0f, null, tj3Var2, 56, 120);
                boolean z7 = z6;
                m16597b(c99.m4411d(b16Var, 0.4f), i8, i7, z7, tj3Var2, ((i10 >> 3) & 896) | 6 | ((i10 >> 6) & 7168));
                if (z) {
                    tj3Var2.m22111b0(1787560750);
                    C0874d c0874dM5025e = AbstractC0871a.m5025e(new nl5(R$raw.flashing_coin), tj3Var2);
                    c0872bM5022b = AbstractC0871a.m5022b((gl5) c0874dM5025e.getValue(), tj3Var2);
                    e16 e16VarM4674b = ci0Var.m4674b(b16Var);
                    gl5 gl5Var = (gl5) c0874dM5025e.getValue();
                    zM22120g = tj3Var2.m22120g(c0872bM5022b);
                    objM22097O = tj3Var2.m22097O();
                    if (!zM22120g || objM22097O == we1.f66679a) {
                        r4 = 0;
                        objM22097O = new C3361n6(c0872bM5022b, 0);
                        tj3Var2.m22131l0(objM22097O);
                    } else {
                        r4 = 0;
                    }
                    AbstractC0871a.m5021a(gl5Var, (ui3) objM22097O, e16VarM4674b, tj3Var2, r4);
                    tj3Var2.m22139q(r4);
                } else {
                    tj3Var2.m22111b0(1788009537);
                    tj3Var2.m22139q(false);
                }
                tj3Var2.m22139q(true);
                z5 = z7;
                tj3Var = tj3Var2;
            } else {
                tj3 tj3Var4 = tj3Var3;
                tj3Var4.m22102U();
                z5 = z3;
                tj3Var = tj3Var4;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: o6
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        m1d.m16596a(e16Var, i, i2, i3, z, z5, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i6 |= 196608;
        z3 = z2;
        if ((74899 & i6) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (tj3Var3.m22099R(i6 & 1, z4)) {
            if (i9 != 0) {
                z6 = true;
            } else {
                z6 = z3;
            }
            if (i2 != 0) {
                i8 = i / i2;
            } else {
                i8 = 0;
            }
            ht5 ht5VarM19966d2 = qh0.m19966d(nj0.f52812g, false);
            int iHashCode2 = Long.hashCode(tj3Var3.f62385T);
            l77 l77VarM22132m2 = tj3Var3.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var3, e16Var);
            se1.f60731q.getClass();
            ui3Var = C0352b.f4299b;
            tj3Var3.m22119f0();
            if (tj3Var3.f62384S) {
                tj3Var3.m22130l(ui3Var);
            } else {
                tj3Var3.m22137o0();
            }
            oha.m18001g(tj3Var3, C0352b.f4303f, ht5VarM19966d2);
            oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m2);
            oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode2));
            oha.m18000f(tj3Var3, C0352b.f4305h);
            oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c2);
            y27 y27VarM18236U2 = AbstractC3423or.m18236U(ss5.m21727y(i3, z), tj3Var3, 0);
            ci0Var = ci0.f10109a;
            b16Var = b16.f7762a;
            tj3Var2 = tj3Var3;
            int i11 = i6;
            bq1.m4042R(y27VarM18236U2, null, ci0Var.m4674b(b16Var), null, null, 0.0f, null, tj3Var2, 56, 120);
            boolean z8 = z6;
            m16597b(c99.m4411d(b16Var, 0.4f), i8, i7, z8, tj3Var2, ((i11 >> 3) & 896) | 6 | ((i11 >> 6) & 7168));
            if (z) {
                tj3Var2.m22111b0(1787560750);
                C0874d c0874dM5025e2 = AbstractC0871a.m5025e(new nl5(R$raw.flashing_coin), tj3Var2);
                c0872bM5022b = AbstractC0871a.m5022b((gl5) c0874dM5025e2.getValue(), tj3Var2);
                e16 e16VarM4674b2 = ci0Var.m4674b(b16Var);
                gl5 gl5Var2 = (gl5) c0874dM5025e2.getValue();
                zM22120g = tj3Var2.m22120g(c0872bM5022b);
                objM22097O = tj3Var2.m22097O();
                if (zM22120g) {
                    r4 = 0;
                    objM22097O = new C3361n6(c0872bM5022b, 0);
                    tj3Var2.m22131l0(objM22097O);
                } else {
                    r4 = 0;
                    objM22097O = new C3361n6(c0872bM5022b, 0);
                    tj3Var2.m22131l0(objM22097O);
                }
                AbstractC0871a.m5021a(gl5Var2, (ui3) objM22097O, e16VarM4674b2, tj3Var2, r4);
                tj3Var2.m22139q(r4);
            } else {
                tj3Var2.m22111b0(1788009537);
                tj3Var2.m22139q(false);
            }
            tj3Var2.m22139q(true);
            z5 = z8;
            tj3Var = tj3Var2;
        } else {
            tj3 tj3Var5 = tj3Var3;
            tj3Var5.m22102U();
            z5 = z3;
            tj3Var = tj3Var5;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: o6
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m1d.m16596a(e16Var, i, i2, i3, z, z5, (ye1) obj, pk9.m19383z(i4 | 1), i5);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m16597b(final e16 e16Var, final int i, final int i2, final boolean z, ye1 ye1Var, final int i3) {
        int i4;
        int i5;
        boolean z2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(436453122);
        if ((i3 & 6) == 0) {
            i4 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= tj3Var.m22116e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 = i2;
            i4 |= tj3Var.m22116e(i5) ? 256 : 128;
        } else {
            i5 = i2;
        }
        if ((i3 & 3072) == 0) {
            i4 |= tj3Var.m22122h(z) ? 2048 : 1024;
        }
        if (tj3Var.m22099R(i4 & 1, (i4 & 1171) != 1170)) {
            gc0 gc0Var = nj0.f52812g;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            b16 b16Var = b16.f7762a;
            if (i < 2) {
                tj3Var.m22111b0(1979820995);
                bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_coin_lingq, tj3Var, 0), null, c99.m4411d(b16Var, 0.8f), null, null, 0.0f, new qd0(5, ss5.m21677B(i5)), tj3Var, 440, 56);
                if (z) {
                    tj3Var.m22111b0(1980193119);
                    z2 = false;
                    bq1.m4042R(AbstractC3423or.m18236U(R$drawable.ic_coin_lingq, tj3Var, 0), null, pvc.m19528x(c99.m4411d(b16Var, 0.8f), 2.0f, 2.0f), null, null, 0.0f, new qd0(5, aa1.m198b(0.2f, ss5.m21677B(i2))), tj3Var, 440, 56);
                    tj3Var.m22139q(false);
                } else {
                    z2 = false;
                    tj3Var.m22111b0(1980632730);
                    tj3Var.m22139q(false);
                }
                tj3Var.m22139q(z2);
            } else {
                tj3Var.m22111b0(1980674487);
                long jM21677B = ss5.m21677B(i2);
                vx9 vx9Var = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51800b.f71398b;
                ci0 ci0Var = ci0.f10109a;
                g4d.m12360a(i + "x", AbstractC3584sr.m21607T(ci0Var.m4674b(ci0Var.mo3727a(b16Var, gc0Var)), 2.0f), jM21677B, null, 0L, 0, false, 0, vx9Var, bc3.f8325k, tj3Var, 805306368, 248);
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            }
            tj3Var.m22139q(true);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: p6
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m1d.m16597b(e16Var, i, i2, z, (ye1) obj, pk9.m19383z(i3 | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m16598c(int i, int i2, ye1 ye1Var, ui3 ui3Var, e16 e16Var, String str) {
        int i3;
        ui3 ui3Var2;
        str.getClass();
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(700680297);
        if ((i2 & 6) == 0) {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22120g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22116e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            ui3Var2 = ui3Var;
            i3 |= tj3Var.m22124i(ui3Var2) ? 2048 : 1024;
        } else {
            ui3Var2 = ui3Var;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 1171) != 1170)) {
            e16 e16VarM14092f = AbstractC3122is.m14092f(e16Var, null, 3);
            float f = ((fe9) tj3Var.m22128k(ge9.f40637a)).f38952a;
            x17 x17Var = new x17(f, f, f, f);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64857c;
            x17 x17Var2 = wj0.f66899a;
            AbstractC0231g.m1148a(ui3Var2, e16VarM14092f, false, si8Var, wj0.m23996a(((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55821F, ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55873q, 0L, tj3Var, 12), wj0.m23997b(30), null, x17Var, ci8.m4703P(2133603417, new u75(i, str, 1), tj3Var), tj3Var, ((i3 >> 9) & 14) | 805306368, 324);
            tj3Var = tj3Var;
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new dz1(i, i2, ui3Var, e16Var, str);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m16599d(final e16 e16Var, final int i, final int i2, final int i3, float f, ye1 ye1Var, final int i4) {
        int i5;
        final float f2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-255828995);
        if ((i4 & 6) == 0) {
            i5 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= tj3Var.m22116e(i) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= tj3Var.m22116e(i2) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= tj3Var.m22116e(i3) ? 2048 : 1024;
        }
        int i6 = i5 | 24576;
        if (tj3Var.m22099R(i6 & 1, (i6 & 9363) != 9362)) {
            int iMax = Math.max(0, i);
            gc0 gc0Var = nj0.f52812g;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16Var);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, C0352b.f4303f, ht5VarM19966d);
            oha.m18001g(tj3Var, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var, C0352b.f4305h);
            oha.m18001g(tj3Var, C0352b.f4301d, e16VarM1322c);
            b16 b16Var = b16.f7762a;
            AbstractC3122is.m14090d(ci0.f10109a.mo3727a(c99.m4411d(te1.m21995i(1.0f, b16Var, false), 1.0f), gc0Var), iMax, i2, 8.0f, i3 == 8, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55823H, ss5.m21678C(i3), aa1.f411j, tj3Var, ((i6 >> 3) & 7168) | 100663296);
            tj3Var = tj3Var;
            m16596a(c99.m4411d(b16Var, 0.4f), iMax, i2, i3, false, false, tj3Var, (i6 & 896) | 24582 | (i6 & 7168), 32);
            tj3Var.m22139q(true);
            f2 = 8.0f;
        } else {
            tj3Var.m22102U();
            f2 = f;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: m6
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    m1d.m16599d(e16Var, i, i2, i3, f2, (ye1) obj, pk9.m19383z(i4 | 1));
                    return xfa.f68157a;
                }
            };
        }
    }
}
