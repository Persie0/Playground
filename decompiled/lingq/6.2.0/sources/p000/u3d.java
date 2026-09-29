package p000;

import android.media.AudioAttributes;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u3d {
    /* JADX INFO: renamed from: a */
    public static final void m22439a(C0282a c0282a, zi3 zi3Var, zi3 zi3Var2, vx9 vx9Var, long j, long j2, ye1 ye1Var, int i) {
        zi3 zi3Var3;
        vx9 vx9Var2;
        zi3 zi3Var4;
        boolean z;
        boolean z2;
        long j3 = j2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-321841045);
        int i2 = i | (tj3Var.m22124i(c0282a) ? 4 : 2) | (tj3Var.m22124i(zi3Var) ? 32 : 16) | (tj3Var.m22124i(zi3Var2) ? 256 : 128) | (tj3Var.m22120g(vx9Var) ? 2048 : 1024) | (tj3Var.m22118f(j) ? 16384 : 8192) | (tj3Var.m22118f(j3) ? 131072 : 65536);
        int i3 = 1;
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            float f = zi3Var2 == null ? 8.0f : 0.0f;
            b16 b16Var = b16.f7762a;
            e16 e16VarM21611X = AbstractC3584sr.m21611X(b16Var, 16.0f, 0.0f, f, 0.0f, 10);
            Object objM22097O = tj3Var.m22097O();
            if (objM22097O == we1.f66679a) {
                objM22097O = new C3798yj(i3);
                tj3Var.m22131l0(objM22097O);
            }
            ht5 ht5Var = (ht5) objM22097O;
            int iHashCode = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m = tj3Var.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var, e16VarM21611X);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            zi3 zi3Var5 = C0352b.f4303f;
            oha.m18001g(tj3Var, zi3Var5, ht5Var);
            zi3 zi3Var6 = C0352b.f4302e;
            oha.m18001g(tj3Var, zi3Var6, l77VarM22132m);
            Integer numValueOf = Integer.valueOf(iHashCode);
            zi3 zi3Var7 = C0352b.f4304g;
            oha.m18001g(tj3Var, zi3Var7, numValueOf);
            vi3 vi3Var = C0352b.f4305h;
            oha.m18000f(tj3Var, vi3Var);
            zi3 zi3Var8 = C0352b.f4301d;
            oha.m18001g(tj3Var, zi3Var8, e16VarM1322c);
            e16 e16VarM21609V = AbstractC3584sr.m21609V(l70.m15961x(b16Var, "text"), 0.0f, 6.0f, 1);
            gc0 gc0Var = nj0.f52808c;
            ht5 ht5VarM19966d = qh0.m19966d(gc0Var, false);
            int iHashCode2 = Long.hashCode(tj3Var.f62385T);
            l77 l77VarM22132m2 = tj3Var.m22132m();
            e16 e16VarM1322c2 = AbstractC0287b.m1322c(tj3Var, e16VarM21609V);
            tj3Var.m22119f0();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(ui3Var);
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, zi3Var5, ht5VarM19966d);
            oha.m18001g(tj3Var, zi3Var6, l77VarM22132m2);
            AbstractC3393o1.m17747v(iHashCode2, tj3Var, zi3Var7, tj3Var, vi3Var);
            oha.m18001g(tj3Var, zi3Var8, e16VarM1322c2);
            wq1.m24128x(i2 & 14, c0282a, tj3Var, true);
            if (zi3Var != null) {
                tj3Var.m22111b0(989211000);
                e16 e16VarM15961x = l70.m15961x(b16Var, "action");
                ht5 ht5VarM19966d2 = qh0.m19966d(gc0Var, false);
                int iHashCode3 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m3 = tj3Var.m22132m();
                e16 e16VarM1322c3 = AbstractC0287b.m1322c(tj3Var, e16VarM15961x);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var5, ht5VarM19966d2);
                oha.m18001g(tj3Var, zi3Var6, l77VarM22132m3);
                AbstractC3393o1.m17747v(iHashCode3, tj3Var, zi3Var7, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var8, e16VarM1322c3);
                vx9Var2 = vx9Var;
                zi3Var4 = zi3Var;
                pvc.m19508d(new a02[]{AbstractC3393o1.m17727b(j, sk1.f60948a), lw9.f50220a.mo1265a(vx9Var2)}, zi3Var4, tj3Var, (i2 & 112) | 8);
                tj3Var.m22139q(true);
                z = false;
                tj3Var.m22139q(false);
            } else {
                vx9Var2 = vx9Var;
                z = false;
                zi3Var4 = zi3Var;
                tj3Var.m22111b0(989526208);
                tj3Var.m22139q(false);
            }
            if (zi3Var2 != null) {
                tj3Var.m22111b0(989574568);
                e16 e16VarM15961x2 = l70.m15961x(b16Var, "dismissAction");
                ht5 ht5VarM19966d3 = qh0.m19966d(gc0Var, z);
                int iHashCode4 = Long.hashCode(tj3Var.f62385T);
                l77 l77VarM22132m4 = tj3Var.m22132m();
                e16 e16VarM1322c4 = AbstractC0287b.m1322c(tj3Var, e16VarM15961x2);
                tj3Var.m22119f0();
                if (tj3Var.f62384S) {
                    tj3Var.m22130l(ui3Var);
                } else {
                    tj3Var.m22137o0();
                }
                oha.m18001g(tj3Var, zi3Var5, ht5VarM19966d3);
                oha.m18001g(tj3Var, zi3Var6, l77VarM22132m4);
                AbstractC3393o1.m17747v(iHashCode4, tj3Var, zi3Var7, tj3Var, vi3Var);
                oha.m18001g(tj3Var, zi3Var8, e16VarM1322c4);
                j3 = j2;
                zi3Var3 = zi3Var2;
                pvc.m19507c(AbstractC3393o1.m17727b(j3, sk1.f60948a), zi3Var3, tj3Var, 8 | ((i2 >> 3) & 112));
                z2 = true;
                tj3Var.m22139q(true);
                tj3Var.m22139q(false);
            } else {
                zi3Var3 = zi3Var2;
                z2 = true;
                j3 = j2;
                tj3Var.m22111b0(989843648);
                tj3Var.m22139q(z);
            }
            tj3Var.m22139q(z2);
        } else {
            zi3Var3 = zi3Var2;
            vx9Var2 = vx9Var;
            zi3Var4 = zi3Var;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ac9(c0282a, zi3Var4, zi3Var3, vx9Var2, j, j3, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m22440b(final e16 e16Var, final zi3 zi3Var, final zi3 zi3Var2, final o39 o39Var, final long j, final long j2, final long j3, final long j4, final C0282a c0282a, ye1 ye1Var, final int i) {
        int i2;
        zi3 zi3Var3;
        zi3 zi3Var4;
        o39 o39Var2;
        long j5;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1218779924);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            zi3Var3 = zi3Var;
            i2 |= tj3Var.m22124i(zi3Var3) ? 32 : 16;
        } else {
            zi3Var3 = zi3Var;
        }
        if ((i & 384) == 0) {
            zi3Var4 = zi3Var2;
            i2 |= tj3Var.m22124i(zi3Var4) ? 256 : 128;
        } else {
            zi3Var4 = zi3Var2;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22122h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            o39Var2 = o39Var;
            i2 |= tj3Var.m22120g(o39Var2) ? 16384 : 8192;
        } else {
            o39Var2 = o39Var;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22118f(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var.m22118f(j2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            j5 = j3;
            i2 |= tj3Var.m22118f(j5) ? 8388608 : 4194304;
        } else {
            j5 = j3;
        }
        if ((100663296 & i) == 0) {
            i2 |= tj3Var.m22118f(j4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= tj3Var.m22124i(c0282a) ? 536870912 : 268435456;
        }
        if (tj3Var.m22099R(i2 & 1, (306783379 & i2) != 306783378)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            final zi3 zi3Var5 = zi3Var3;
            final zi3 zi3Var6 = zi3Var4;
            final long j6 = j5;
            int i3 = (i2 & 14) | 12779520;
            int i4 = i2 >> 9;
            ho9.m13414a(e16Var, o39Var2, j, j2, 0.0f, dc9.f35402d, null, ci8.m4703P(-1343524879, new zi3() { // from class: yb9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var2 = (tj3) ye1Var2;
                    if (tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        pvc.m19507c(lw9.f50220a.mo1265a(cea.m4600a(dc9.f35406h, tj3Var2)), ci8.m4703P(969655473, new ac9(zi3Var5, c0282a, zi3Var6, cea.m4600a(dc9.f35400b, tj3Var2), j6, j4), tj3Var2), tj3Var2, 56);
                    } else {
                        tj3Var2.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, i3 | (i4 & 112) | (i4 & 896) | (i4 & 7168), 80);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: zb9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    u3d.m22440b(e16Var, zi3Var, zi3Var2, o39Var, j, j2, j3, j4, c0282a, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m22441c(final sb9 sb9Var, e16 e16Var, o39 o39Var, long j, long j2, long j3, long j4, long j5, ye1 ye1Var, final int i) {
        int i2;
        tj3 tj3Var;
        final e16 e16Var2;
        final o39 o39Var2;
        final long j6;
        final long j7;
        final long j8;
        final long j9;
        final long j10;
        long jM20492e;
        e16 e16Var3;
        long j11;
        long j12;
        long j13;
        long j14;
        o39 o39Var3;
        int i3;
        C0282a c0282a;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(274621471);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(sb9Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 432;
        if ((i & 3072) == 0) {
            i4 = i2 | 1456;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((196608 & i) == 0) {
            i4 |= 65536;
        }
        if ((1572864 & i) == 0) {
            i4 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i4 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if (tj3Var2.m22099R(i4 & 1, (38347923 & i4) != 38347922)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                o39 o39VarM24271b = x49.m24271b(dc9.f35403e, tj3Var2);
                long jM20492e2 = ra1.m20492e(dc9.f35401c, tj3Var2);
                long jM20492e3 = ra1.m20492e(dc9.f35405g, tj3Var2);
                ColorSchemeKeyTokens colorSchemeKeyTokens = dc9.f35399a;
                jM20492e = ra1.m20492e(colorSchemeKeyTokens, tj3Var2);
                long jM20492e4 = ra1.m20492e(colorSchemeKeyTokens, tj3Var2);
                long jM20492e5 = ra1.m20492e(dc9.f35404f, tj3Var2);
                e16Var3 = b16.f7762a;
                j11 = jM20492e2;
                j12 = jM20492e3;
                j13 = jM20492e4;
                j14 = jM20492e5;
                o39Var3 = o39VarM24271b;
                i3 = i4 & (-268434433);
            } else {
                tj3Var2.m22102U();
                i3 = i4 & (-268434433);
                e16Var3 = e16Var;
                o39Var3 = o39Var;
                j11 = j;
                j12 = j2;
                jM20492e = j3;
                j13 = j4;
                j14 = j5;
            }
            tj3Var2.m22140r();
            String str = ((vb9) sb9Var).f65169a.f66596b;
            if (str != null) {
                tj3Var2.m22111b0(-663827885);
                C0282a c0282aM4703P = ci8.m4703P(-1378313599, new gv0(jM20492e, sb9Var, str), tj3Var2);
                tj3Var2.m22139q(false);
                c0282a = c0282aM4703P;
            } else {
                tj3Var2.m22111b0(-663528921);
                tj3Var2.m22139q(false);
                c0282a = null;
            }
            ((vb9) sb9Var).f65169a.getClass();
            tj3Var2.m22111b0(-662598425);
            tj3Var2.m22139q(false);
            tj3Var = tj3Var2;
            m22440b(AbstractC3584sr.m21607T(e16Var3, 12.0f), c0282a, null, o39Var3, j11, j12, j13, j14, ci8.m4703P(-1266389126, new ht6(sb9Var, 28), tj3Var2), tj3Var, ((i3 << 3) & 7168) | 805306368);
            e16Var2 = e16Var3;
            j8 = jM20492e;
            o39Var2 = o39Var3;
            j6 = j11;
            j7 = j12;
            j9 = j13;
            j10 = j14;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
            o39Var2 = o39Var;
            j6 = j;
            j7 = j2;
            j8 = j3;
            j9 = j4;
            j10 = j5;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: xb9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    u3d.m22441c(sb9Var, e16Var2, o39Var2, j6, j7, j8, j9, j10, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m22442d(AudioAttributes.Builder builder) {
        builder.setHapticChannelsMuted(true);
    }

    /* JADX INFO: renamed from: e */
    public static void m22443e(AudioAttributes.Builder builder) {
        builder.setAllowedCapturePolicy(1);
    }
}
