package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.material3.C0228e0;
import androidx.compose.material3.tokens.ColorSchemeKeyTokens;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes2.dex */
public final class la9 {

    /* JADX INFO: renamed from: a */
    public static final la9 f49371a = new la9();

    /* JADX INFO: renamed from: b */
    public static final float f49372b;

    /* JADX INFO: renamed from: c */
    public static final float f49373c;

    /* JADX INFO: renamed from: d */
    public static final C3500qj f49374d;

    static {
        float f = ya9.f69567n;
        f49372b = f;
        f49373c = f;
        f49374d = AbstractC3650uj.m22757a();
    }

    /* JADX INFO: renamed from: f */
    public static fa9 m16039f(ye1 ye1Var) {
        return m16044k(((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51799a);
    }

    /* JADX INFO: renamed from: g */
    public static fa9 m16040g(long j, long j2, long j3, long j4, ye1 ye1Var, int i) {
        long j5 = (i & 1) != 0 ? aa1.f412k : j;
        long j6 = (i & 2) != 0 ? aa1.f412k : j2;
        long j7 = (i & 4) != 0 ? aa1.f412k : j3;
        long j8 = (i & 8) != 0 ? aa1.f412k : j4;
        long j9 = aa1.f412k;
        fa9 fa9VarM16044k = m16044k(((ms5) ((tj3) ye1Var).m22128k(ps5.f56764b)).f51799a);
        if (j5 == 16) {
            j5 = fa9VarM16044k.f38725a;
        }
        long j10 = j5;
        if (j6 == 16) {
            j6 = fa9VarM16044k.f38726b;
        }
        long j11 = j6;
        if (j7 == 16) {
            j7 = fa9VarM16044k.f38727c;
        }
        long j12 = j7;
        if (j8 == 16) {
            j8 = fa9VarM16044k.f38728d;
        }
        long j13 = j8;
        long j14 = j9 != 16 ? j9 : fa9VarM16044k.f38729e;
        long j15 = j9 != 16 ? j9 : fa9VarM16044k.f38730f;
        long j16 = j9 != 16 ? j9 : fa9VarM16044k.f38731g;
        long j17 = j9 != 16 ? j9 : fa9VarM16044k.f38732h;
        long j18 = j9 != 16 ? j9 : fa9VarM16044k.f38733i;
        if (j9 == 16) {
            j9 = fa9VarM16044k.f38734j;
        }
        return new fa9(j10, j11, j12, j13, j14, j15, j16, j17, j18, j9);
    }

    /* JADX INFO: renamed from: h */
    public static void m16041h(InterfaceC0310a interfaceC0310a, long j, float f, long j2) {
        InterfaceC0310a.m1417c0(interfaceC0310a, j2, interfaceC0310a.mo912g0(f) / 2.0f, j, 0.0f, null, 120);
    }

    /* JADX WARN: Code duplicated, block: B:165:0x03d5  */
    /* JADX INFO: renamed from: i */
    public static void m16042i(InterfaceC0310a interfaceC0310a, float[] fArr, float f, float f2, long j, long j2, long j3, long j4, float f3, float f4, float f5, float f6, float f7, float f8, float f9, zi3 zi3Var, aj3 aj3Var, boolean z, Orientation orientation) {
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        long jFloatToRawIntBits;
        int iFloatToRawIntBits;
        long jFloatToRawIntBits2;
        int iFloatToRawIntBits2;
        long jFloatToRawIntBits3;
        long jFloatToRawIntBits4;
        int iFloatToRawIntBits3;
        long jFloatToRawIntBits5;
        int iFloatToRawIntBits4;
        long jFloatToRawIntBits6;
        int iFloatToRawIntBits5;
        long jFloatToRawIntBits7;
        long j5;
        long jFloatToRawIntBits8;
        int iFloatToRawIntBits6;
        long jFloatToRawIntBits9;
        long jFloatToRawIntBits10;
        long jFloatToRawIntBits11;
        int iFloatToRawIntBits7;
        long jFloatToRawIntBits12;
        long jFloatToRawIntBits13;
        int iFloatToRawIntBits8;
        float fMo912g0;
        float fMo912g1;
        float fMo912g2;
        InterfaceC0310a interfaceC0310a2 = interfaceC0310a;
        boolean z2 = orientation == Orientation.Vertical;
        boolean z3 = interfaceC0310a2.getLayoutDirection() == LayoutDirection.Rtl;
        boolean z4 = z3 && !z2;
        float fMo912g3 = interfaceC0310a2.mo912g0(f9);
        long jMo1422h = interfaceC0310a2.mo1422h();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (z2 ? jMo1422h & 4294967295L : jMo1422h >> 32));
        boolean z5 = fa4.m11648j(f, AbstractC3550rv.m20839g0(fArr)) || fa4.m11648j(f, AbstractC3550rv.m20845m0(fArr));
        float fM17726a = (fArr.length == 0 || (fa4.m11648j(f2, AbstractC3550rv.m20839g0(fArr)) || fa4.m11648j(f2, AbstractC3550rv.m20845m0(fArr)))) ? AbstractC3393o1.m17726a(fIntBitsToFloat, 0.0f, f2, 0.0f) : (((fIntBitsToFloat - 0.0f) - (fMo912g3 * 2.0f)) * f2) + 0.0f + fMo912g3;
        float fM17726a2 = (fArr.length == 0 || z5) ? AbstractC3393o1.m17726a(fIntBitsToFloat, 0.0f, f, 0.0f) : (((fIntBitsToFloat - 0.0f) - (fMo912g3 * 2.0f)) * f) + 0.0f + fMo912g3;
        float fMo912g4 = interfaceC0310a2.mo912g0(f8);
        if (xj2.m24559a(f7, 0.0f) > 0) {
            if (z2) {
                fMo912g0 = interfaceC0310a2.mo912g0(f7) + (interfaceC0310a2.mo912g0(f4) / 2.0f);
                fMo912g1 = interfaceC0310a2.mo912g0(f6) / 2.0f;
                fMo912g2 = interfaceC0310a2.mo912g0(f7);
            } else {
                fMo912g0 = interfaceC0310a2.mo912g0(f7) + (interfaceC0310a2.mo912g0(f3) / 2.0f);
                fMo912g1 = interfaceC0310a2.mo912g0(f5) / 2.0f;
                fMo912g2 = interfaceC0310a2.mo912g0(f7);
            }
            f10 = fMo912g0;
            f11 = fMo912g2 + fMo912g1;
        } else {
            f10 = 0.0f;
            f11 = 0.0f;
        }
        long jMo1423z0 = interfaceC0310a2.mo1423z0();
        Float.intBitsToFloat((int) (z2 ? jMo1423z0 & 4294967295L : jMo1423z0 >> 32));
        float f16 = f10 + 0.0f + fMo912g3;
        if (!z || fM17726a2 <= f16) {
            f12 = 0.0f;
            f13 = fIntBitsToFloat;
        } else {
            float f17 = z4 ? fMo912g4 : fMo912g3;
            float f18 = z4 ? fMo912g3 : fMo912g4;
            float f19 = fM17726a2 - f10;
            if (z4) {
                jFloatToRawIntBits11 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)) - f19);
                iFloatToRawIntBits7 = Float.floatToRawIntBits(0.0f);
            } else {
                jFloatToRawIntBits11 = Float.floatToRawIntBits(0.0f);
                iFloatToRawIntBits7 = Float.floatToRawIntBits(0.0f);
            }
            long j6 = (jFloatToRawIntBits11 << 32) | (((long) iFloatToRawIntBits7) & 4294967295L);
            if (z2) {
                f12 = 0.0f;
                jFloatToRawIntBits12 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(f19 - 0.0f)) & 4294967295L);
            } else {
                f12 = 0.0f;
                jFloatToRawIntBits12 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(f19 - 0.0f)) << 32);
            }
            f13 = fIntBitsToFloat;
            m16043j(interfaceC0310a2, orientation, j6, jFloatToRawIntBits12, j, f17, f18);
            if (z2) {
                jFloatToRawIntBits13 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1423z0() >> 32)));
                iFloatToRawIntBits8 = Float.floatToRawIntBits(fMo912g3 + f12);
            } else if (z3) {
                float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)) - f12) - fMo912g3;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (interfaceC0310a2.mo1423z0() & 4294967295L));
                jFloatToRawIntBits13 = Float.floatToRawIntBits(fIntBitsToFloat2);
                iFloatToRawIntBits8 = Float.floatToRawIntBits(fIntBitsToFloat3);
            } else {
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (interfaceC0310a2.mo1423z0() & 4294967295L));
                jFloatToRawIntBits13 = Float.floatToRawIntBits(fMo912g3 + f12);
                iFloatToRawIntBits8 = Float.floatToRawIntBits(fIntBitsToFloat4);
            }
            long j7 = (((long) iFloatToRawIntBits8) & 4294967295L) | (jFloatToRawIntBits13 << 32);
            if (zi3Var != null) {
                zi3Var.invoke(interfaceC0310a2, new gq6(j7));
            }
        }
        if (fM17726a < (f13 - f11) - fMo912g3) {
            float f20 = z4 ? fMo912g3 : fMo912g4;
            float f21 = z4 ? fMo912g4 : fMo912g3;
            float f22 = fM17726a + f11;
            float f23 = f13 - f22;
            if (z2) {
                jFloatToRawIntBits5 = Float.floatToRawIntBits(f12);
                iFloatToRawIntBits4 = Float.floatToRawIntBits(f22);
            } else if (z3) {
                jFloatToRawIntBits5 = Float.floatToRawIntBits(f12);
                iFloatToRawIntBits4 = Float.floatToRawIntBits(f12);
            } else {
                jFloatToRawIntBits5 = Float.floatToRawIntBits(f22);
                iFloatToRawIntBits4 = Float.floatToRawIntBits(f12);
            }
            long j8 = (jFloatToRawIntBits5 << 32) | (((long) iFloatToRawIntBits4) & 4294967295L);
            if (z2) {
                long jFloatToRawIntBits14 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)));
                jFloatToRawIntBits7 = Float.floatToRawIntBits(f23);
                j5 = jFloatToRawIntBits14 << 32;
            } else {
                if (!z3 || z) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L));
                    jFloatToRawIntBits6 = Float.floatToRawIntBits(f23);
                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat5);
                } else {
                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)) - f22;
                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L));
                    jFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat6);
                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat7);
                }
                jFloatToRawIntBits7 = iFloatToRawIntBits5;
                j5 = jFloatToRawIntBits6 << 32;
            }
            long j9 = (jFloatToRawIntBits7 & 4294967295L) | j5;
            interfaceC0310a2 = interfaceC0310a;
            m16043j(interfaceC0310a2, orientation, j8, j9, j, f20, f21);
            if (z2) {
                jFloatToRawIntBits9 = ((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1423z0() >> 32)))) << 32;
                jFloatToRawIntBits10 = ((long) Float.floatToRawIntBits(f13 - fMo912g3)) & 4294967295L;
            } else {
                if (z3) {
                    float fIntBitsToFloat8 = Float.intBitsToFloat((int) (interfaceC0310a2.mo1423z0() & 4294967295L));
                    jFloatToRawIntBits8 = Float.floatToRawIntBits(fMo912g3);
                    iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat8);
                } else {
                    float fIntBitsToFloat9 = Float.intBitsToFloat((int) (interfaceC0310a2.mo1423z0() & 4294967295L));
                    jFloatToRawIntBits8 = Float.floatToRawIntBits(f13 - fMo912g3);
                    iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat9);
                }
                long j10 = iFloatToRawIntBits6;
                jFloatToRawIntBits9 = jFloatToRawIntBits8 << 32;
                jFloatToRawIntBits10 = j10 & 4294967295L;
            }
            long j11 = jFloatToRawIntBits9 | jFloatToRawIntBits10;
            if (zi3Var != null) {
                zi3Var.invoke(interfaceC0310a2, new gq6(j11));
            }
        }
        float f24 = z ? fM17726a2 + f10 : f12;
        float f25 = fM17726a - f11;
        float f26 = (z4 || z) ? fMo912g4 : fMo912g3;
        float f27 = (!z4 || z) ? fMo912g4 : fMo912g3;
        float f28 = (!z4 || z) ? f25 - f24 : f25;
        if (f28 > f26) {
            if (z2) {
                jFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
                iFloatToRawIntBits2 = Float.floatToRawIntBits(f24);
            } else if (z3) {
                jFloatToRawIntBits2 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)) - f25);
                iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
            } else {
                jFloatToRawIntBits2 = Float.floatToRawIntBits(f24);
                iFloatToRawIntBits2 = Float.floatToRawIntBits(f12);
            }
            long j12 = (jFloatToRawIntBits2 << 32) | (((long) iFloatToRawIntBits2) & 4294967295L);
            if (z2) {
                jFloatToRawIntBits4 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)));
                iFloatToRawIntBits3 = Float.floatToRawIntBits(f28);
            } else {
                if (!z3 || z) {
                    jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f28)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L)))) & 4294967295L);
                    interfaceC0310a2 = interfaceC0310a;
                } else {
                    float fIntBitsToFloat10 = Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() & 4294967295L));
                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f25);
                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat10);
                }
                m16043j(interfaceC0310a2, orientation, j12, jFloatToRawIntBits3, j2, f26, f27);
            }
            jFloatToRawIntBits3 = (jFloatToRawIntBits4 << 32) | (((long) iFloatToRawIntBits3) & 4294967295L);
            m16043j(interfaceC0310a2, orientation, j12, jFloatToRawIntBits3, j2, f26, f27);
        }
        float f29 = f12 + fMo912g3;
        float f30 = f13 - fMo912g3;
        float f31 = fM17726a2 - f10;
        float f32 = fM17726a2 + f10;
        float f33 = fM17726a - f11;
        float f34 = fM17726a + f11;
        int length = fArr.length;
        int i = 0;
        int i2 = 0;
        while (i2 < length) {
            float f35 = fArr[i2];
            int i3 = i + 1;
            if (zi3Var == null || !((z && i == 0) || i == fArr.length - 1)) {
                float fM18232Q = AbstractC3423or.m18232Q(f29, f30, f35);
                if ((!z || fM18232Q < f31 || fM18232Q > f32) && (fM18232Q < f33 || fM18232Q > f34)) {
                    if (z2) {
                        f14 = f29;
                        f15 = f31;
                        jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC0310a2.mo1423z0() >> 32)));
                        iFloatToRawIntBits = Float.floatToRawIntBits(fM18232Q);
                    } else {
                        f14 = f29;
                        f15 = f31;
                        if (z3) {
                            float fIntBitsToFloat11 = Float.intBitsToFloat((int) (interfaceC0310a2.mo1422h() >> 32)) - fM18232Q;
                            float fIntBitsToFloat12 = Float.intBitsToFloat((int) (interfaceC0310a2.mo1423z0() & 4294967295L));
                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat11);
                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat12);
                        } else {
                            float fIntBitsToFloat13 = Float.intBitsToFloat((int) (interfaceC0310a2.mo1423z0() & 4294967295L));
                            jFloatToRawIntBits = Float.floatToRawIntBits(fM18232Q);
                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat13);
                        }
                    }
                    aj3Var.invoke(interfaceC0310a2, new gq6((jFloatToRawIntBits << 32) | (((long) iFloatToRawIntBits) & 4294967295L)), new aa1((fM18232Q < f24 || fM18232Q > f25) ? j3 : j4));
                } else {
                    f14 = f29;
                    f15 = f31;
                }
            } else {
                f14 = f29;
                f15 = f31;
            }
            i2++;
            f29 = f14;
            f31 = f15;
            i = i3;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m16043j(InterfaceC0310a interfaceC0310a, Orientation orientation, long j, long j2, long j3, float f, float f2) {
        mi8 mi8Var;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (orientation == Orientation.Vertical) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            e28 e28VarM23907b = wfb.m23907b(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32));
            mi8Var = new mi8(e28VarM23907b.f36620a, e28VarM23907b.f36621b, e28VarM23907b.f36622c, e28VarM23907b.f36623d, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            e28 e28VarM23907b2 = wfb.m23907b(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
            mi8Var = new mi8(e28VarM23907b2.f36620a, e28VarM23907b2.f36621b, e28VarM23907b2.f36622c, e28VarM23907b2.f36623d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        C3500qj c3500qj = f49374d;
        C3500qj.m19986c(c3500qj, mi8Var);
        InterfaceC0310a.m1408A0(interfaceC0310a, c3500qj, j3, 0.0f, null, 60);
        c3500qj.m19992i();
    }

    /* JADX INFO: renamed from: k */
    public static fa9 m16044k(pa1 pa1Var) {
        fa9 fa9Var = pa1Var.f55865l0;
        if (fa9Var != null) {
            return fa9Var;
        }
        long jM20491d = ra1.m20491d(pa1Var, ya9.f69561h);
        ColorSchemeKeyTokens colorSchemeKeyTokens = ya9.f69554a;
        long jM20491d2 = ra1.m20491d(pa1Var, colorSchemeKeyTokens);
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ya9.f69565l;
        long jM20491d3 = ra1.m20491d(pa1Var, colorSchemeKeyTokens2);
        long jM20491d4 = ra1.m20491d(pa1Var, colorSchemeKeyTokens2);
        long jM20491d5 = ra1.m20491d(pa1Var, colorSchemeKeyTokens);
        long jM10012J = d32.m10012J(aa1.m198b(ya9.f69558e, ra1.m20491d(pa1Var, ya9.f69557d)), pa1Var.f55872p);
        ColorSchemeKeyTokens colorSchemeKeyTokens3 = ya9.f69555b;
        long jM20491d6 = ra1.m20491d(pa1Var, colorSchemeKeyTokens3);
        float f = ya9.f69556c;
        long jM198b = aa1.m198b(f, jM20491d6);
        ColorSchemeKeyTokens colorSchemeKeyTokens4 = ya9.f69559f;
        long jM20491d7 = ra1.m20491d(pa1Var, colorSchemeKeyTokens4);
        float f2 = ya9.f69560g;
        fa9 fa9Var2 = new fa9(jM20491d, jM20491d2, jM20491d3, jM20491d4, jM20491d5, jM10012J, jM198b, aa1.m198b(f2, jM20491d7), aa1.m198b(f2, ra1.m20491d(pa1Var, colorSchemeKeyTokens4)), aa1.m198b(f, ra1.m20491d(pa1Var, colorSchemeKeyTokens3)));
        pa1Var.f55865l0 = fa9Var2;
        return fa9Var2;
    }

    /* JADX INFO: renamed from: a */
    public final void m16045a(v56 v56Var, e16 e16Var, fa9 fa9Var, boolean z, long j, ye1 ye1Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        long j2;
        int i5;
        e16 e16Var2;
        boolean z3;
        e16 e16Var3;
        boolean z4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-290277409);
        if ((i & 6) == 0) {
            i3 = i | (tj3Var.m22120g(v56Var) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i6 = i3 | 48 | (tj3Var.m22120g(fa9Var) ? 256 : 128);
        int i7 = i2 & 8;
        if (i7 != 0) {
            i4 = i6 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i4 = i6 | (tj3Var.m22122h(z2) ? 2048 : 1024);
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i5 = i4 | 24576;
            j2 = j;
        } else {
            j2 = j;
            i5 = i4 | (tj3Var.m22118f(j2) ? 16384 : 8192);
        }
        if (tj3Var.m22099R(i5 & 1, (74899 & i5) != 74898)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                boolean z5 = i7 == 0 ? z2 : true;
                e16Var3 = b16.f7762a;
                if (i8 != 0) {
                    j2 = AbstractC0226d0.f3391c;
                }
                z4 = z5;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var;
                z4 = z2;
            }
            tj3Var.m22140r();
            AbstractC0226d0.m1137h(v56Var, e16Var3, fa9Var, z4, j2, tj3Var, (i5 & 14) | 196656 | (i5 & 896) | (i5 & 7168) | (i5 & 57344));
            e16Var2 = e16Var3;
            z3 = z4;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            z3 = z2;
        }
        long j3 = j2;
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new s25(this, v56Var, e16Var2, fa9Var, z3, j3, i, i2);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m16046b(oq7 oq7Var, e16 e16Var, fa9 fa9Var, zi3 zi3Var, aj3 aj3Var, float f, float f2, ye1 ye1Var, int i) {
        int i2;
        e16 e16Var2;
        zi3 zi3Var2;
        aj3 aj3Var2;
        float f3;
        float f4;
        int i3;
        float f5;
        float f6;
        e16 e16Var3;
        zi3 zi3Var3;
        aj3 aj3Var3;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-541824132);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(oq7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= tj3Var.m22122h(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= tj3Var.m22120g(fa9Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= tj3Var.m22120g(this) ? 67108864 : 33554432;
        }
        if (tj3Var.m22099R(i5 & 1, (38347923 & i5) != 38347922)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                boolean z = ((((i5 & 7168) ^ 3072) > 2048 && tj3Var.m22120g(fa9Var)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object objM22097O = tj3Var.m22097O();
                p84 p84Var = we1.f66679a;
                if (z || objM22097O == p84Var) {
                    objM22097O = new ht6(fa9Var, 27);
                    tj3Var.m22131l0(objM22097O);
                }
                zi3 zi3Var4 = (zi3) objM22097O;
                i3 = i5 & (-57345);
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = ka9.f46948b;
                    tj3Var.m22131l0(objM22097O2);
                }
                f5 = AbstractC0226d0.f3392d;
                f6 = AbstractC0226d0.f3393e;
                e16Var3 = b16.f7762a;
                zi3Var3 = zi3Var4;
                aj3Var3 = (aj3) objM22097O2;
            } else {
                tj3Var.m22102U();
                i3 = i5 & (-57345);
                e16Var3 = e16Var;
                zi3Var3 = zi3Var;
                aj3Var3 = aj3Var;
                f5 = f;
                f6 = f2;
            }
            tj3Var.m22140r();
            int i6 = (i3 & 14) | 48;
            int i7 = i3 << 3;
            m16049e(oq7Var, e16Var3, fa9Var, zi3Var3, aj3Var3, f5, f6, tj3Var, i6 | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (3670016 & i7) | (29360128 & i7) | (234881024 & i7) | (i7 & 1879048192));
            e16Var2 = e16Var3;
            f4 = f6;
            f3 = f5;
            aj3Var2 = aj3Var3;
            zi3Var2 = zi3Var3;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            zi3Var2 = zi3Var;
            aj3Var2 = aj3Var;
            f3 = f;
            f4 = f2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ja9(this, oq7Var, e16Var2, fa9Var, zi3Var2, aj3Var2, f3, f4, i, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m16047c(final C0228e0 c0228e0, e16 e16Var, final boolean z, final fa9 fa9Var, zi3 zi3Var, aj3 aj3Var, float f, float f2, ye1 ye1Var, final int i) {
        int i2;
        final e16 e16Var2;
        final zi3 zi3Var2;
        final aj3 aj3Var2;
        final float f3;
        final float f4;
        int i3;
        zi3 zi3Var3;
        float f5;
        aj3 aj3Var3;
        e16 e16Var3;
        float f6;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(49984771);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22124i(c0228e0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= tj3Var.m22122h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= tj3Var.m22120g(fa9Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= tj3Var.m22120g(this) ? 67108864 : 33554432;
        }
        if (tj3Var.m22099R(i5 & 1, (38347923 & i5) != 38347922)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                boolean z2 = ((((i5 & 7168) ^ 3072) > 2048 && tj3Var.m22120g(fa9Var)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object objM22097O = tj3Var.m22097O();
                p84 p84Var = we1.f66679a;
                if (z2 || objM22097O == p84Var) {
                    objM22097O = new f70(fa9Var, z);
                    tj3Var.m22131l0(objM22097O);
                }
                zi3 zi3Var4 = (zi3) objM22097O;
                i3 = i5 & (-57345);
                Object objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = ka9.f46949c;
                    tj3Var.m22131l0(objM22097O2);
                }
                float f7 = AbstractC0226d0.f3392d;
                zi3Var3 = zi3Var4;
                f5 = AbstractC0226d0.f3393e;
                aj3Var3 = (aj3) objM22097O2;
                e16Var3 = b16.f7762a;
                f6 = f7;
            } else {
                tj3Var.m22102U();
                i3 = i5 & (-57345);
                e16Var3 = e16Var;
                zi3Var3 = zi3Var;
                aj3Var3 = aj3Var;
                f6 = f;
                f5 = f2;
            }
            tj3Var.m22140r();
            int i6 = i3 << 3;
            m16048d(c0228e0, e16Var3, z, fa9Var, zi3Var3, aj3Var3, f6, f5, tj3Var, 805306416 | (i3 & 14) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), ((i3 >> 21) & 112) | 6);
            e16Var2 = e16Var3;
            f4 = f5;
            f3 = f6;
            aj3Var2 = aj3Var3;
            zi3Var2 = zi3Var3;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            zi3Var2 = zi3Var;
            aj3Var2 = aj3Var;
            f3 = f;
            f4 = f2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ia9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f43863a.m16047c(c0228e0, e16Var2, z, fa9Var, zi3Var2, aj3Var2, f3, f4, (ye1) obj, pk9.m19383z(i | 1));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m16048d(final C0228e0 c0228e0, final e16 e16Var, final boolean z, final fa9 fa9Var, final zi3 zi3Var, final aj3 aj3Var, final float f, final float f2, ye1 ye1Var, final int i, final int i2) {
        int i3;
        int i4;
        tj3 tj3Var;
        e16 e16Var2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(133396521);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22124i(c0228e0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22114d(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var2.m22120g(e16Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var2.m22122h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var2.m22120g(fa9Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= tj3Var2.m22124i(zi3Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= tj3Var2.m22124i(aj3Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i3 |= tj3Var2.m22114d(f) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= tj3Var2.m22114d(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tj3Var2.m22122h(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (tj3Var2.m22122h(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (tj3Var2.m22099R(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            long jM11666b = fa9Var.m11666b(z, false);
            long jM11666b2 = fa9Var.m11666b(z, true);
            long jM11665a = fa9Var.m11665a(z, false);
            long jM11665a2 = fa9Var.m11665a(z, true);
            sh8 sh8Var = ((th8) tj3Var2.m22128k(gh8.f40823a)).f62294a;
            e16 e16VarM4410c = c0228e0.f3412m == Orientation.Vertical ? c99.m4410c(c99.m4426s(e16Var, AbstractC0226d0.f3389a), 1.0f) : c99.m4414g(c99.m4412e(e16Var, 1.0f), AbstractC0226d0.f3389a);
            int i5 = i3 & 112;
            boolean zM22124i = (i5 == 32) | tj3Var2.m22124i(c0228e0);
            Object objM22097O = tj3Var2.m22097O();
            int i6 = i3;
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new iq8(c0228e0, 2);
                tj3Var2.m22131l0(objM22097O);
            }
            e16 e16VarMo3161g = e16VarM4410c.mo3161g(te1.m21968A(b16.f7762a, (aj3) objM22097O));
            boolean zM22124i2 = (i5 == 32) | tj3Var2.m22124i(c0228e0) | tj3Var2.m22118f(jM11666b) | tj3Var2.m22118f(jM11666b2) | tj3Var2.m22118f(jM11665a) | tj3Var2.m22118f(jM11665a2) | ((i6 & 29360128) == 8388608) | tj3Var2.m22114d(0.0f) | ((i6 & 234881024) == 67108864) | ((i6 & 458752) == 131072) | ((i6 & 3670016) == 1048576) | ((i6 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22124i2 || objM22097O2 == p84Var) {
                e16Var2 = e16VarMo3161g;
                tj3Var = tj3Var2;
                ga9 ga9Var = new ga9(c0228e0, jM11666b, jM11666b2, jM11665a, jM11665a2, f, f2, zi3Var, aj3Var, 0);
                tj3Var.m22131l0(ga9Var);
                objM22097O2 = ga9Var;
            } else {
                e16Var2 = e16VarMo3161g;
                tj3Var = tj3Var2;
            }
            eh0.m11124d(e16Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: ha9
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.f42096a.m16048d(c0228e0, e16Var, z, fa9Var, zi3Var, aj3Var, f, f2, (ye1) obj, pk9.m19383z(i | 1), pk9.m19383z(i2));
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16049e(oq7 oq7Var, e16 e16Var, fa9 fa9Var, zi3 zi3Var, aj3 aj3Var, float f, float f2, ye1 ye1Var, int i) {
        int i2;
        tj3 tj3Var;
        e16 e16Var2;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1719396904);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22124i(oq7Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22114d(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(e16Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var2.m22122h(true) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= tj3Var2.m22120g(fa9Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var2.m22124i(zi3Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var2.m22124i(aj3Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= tj3Var2.m22114d(f) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= tj3Var2.m22114d(f2) ? 67108864 : 33554432;
        }
        if (tj3Var2.m22099R(i2 & 1, (i2 & 38347923) != 38347922)) {
            long j = fa9Var.f38728d;
            int i3 = i2;
            long j2 = fa9Var.f38726b;
            long j3 = fa9Var.f38729e;
            long j4 = fa9Var.f38727c;
            sh8 sh8Var = ((th8) tj3Var2.m22128k(gh8.f40823a)).f62294a;
            e16 e16VarM4414g = c99.m4414g(c99.m4412e(e16Var, 1.0f), AbstractC0226d0.f3389a);
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new ie1(10);
                tj3Var2.m22131l0(objM22097O);
            }
            e16 e16VarM21968A = te1.m21968A(e16VarM4414g, (aj3) objM22097O);
            boolean zM22124i = ((i3 & 29360128) == 8388608) | ((i3 & 112) == 32) | tj3Var2.m22124i(oq7Var) | tj3Var2.m22118f(j) | tj3Var2.m22118f(j2) | tj3Var2.m22118f(j3) | tj3Var2.m22118f(j4) | tj3Var2.m22114d(0.0f) | ((i3 & 234881024) == 67108864) | ((i3 & 458752) == 131072) | ((i3 & 3670016) == 1048576);
            Object objM22097O2 = tj3Var2.m22097O();
            if (zM22124i || objM22097O2 == p84Var) {
                e16Var2 = e16VarM21968A;
                tj3Var = tj3Var2;
                ga9 ga9Var = new ga9(oq7Var, j, j2, j3, j4, f, f2, zi3Var, aj3Var, 1);
                tj3Var.m22131l0(ga9Var);
                objM22097O2 = ga9Var;
            } else {
                tj3Var = tj3Var2;
                e16Var2 = e16VarM21968A;
            }
            eh0.m11124d(e16Var2, (vi3) objM22097O2, tj3Var, 0);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ja9(this, oq7Var, e16Var, fa9Var, zi3Var, aj3Var, f, f2, i, 1);
        }
    }
}
