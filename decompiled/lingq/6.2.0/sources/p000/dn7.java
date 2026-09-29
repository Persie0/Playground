package p000;

import androidx.compose.animation.core.C0061c;
import androidx.compose.p002ui.graphics.drawscope.InterfaceC0310a;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.datastore.preferences.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes.dex */
public abstract class dn7 {

    /* JADX INFO: renamed from: a */
    public static final zr1 f35899a = u36.f63351a;

    /* JADX INFO: renamed from: b */
    public static final zr1 f35900b = u36.f63353c;

    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:88:0x0210  */
    /* JADX WARN: Code duplicated, block: B:90:0x023c  */
    /* JADX WARN: Code duplicated, block: B:93:0x024f  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m10492a(e16 e16Var, long j, float f, long j2, int i, float f2, ye1 ye1Var, final int i2, final int i3) {
        e16 e16Var2;
        int i4;
        long jM20492e;
        float f3;
        int i5;
        boolean z;
        final e16 e16Var3;
        final long j3;
        final float f4;
        final long j4;
        final int i6;
        final float f5;
        x18 x18VarM22143u;
        e16 e16Var4;
        long j5;
        int i7;
        final float f6;
        final int i8;
        final el9 el9Var;
        final l44 l44VarM21713i;
        final l44 l44VarM21713i2;
        final l44 l44VarM21713i3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zM22120g;
        Object objM22097O;
        final long j6;
        final float f7;
        final long j7;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(333154241);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i2 | 6;
            e16Var2 = e16Var;
        } else if ((i2 & 6) == 0) {
            e16Var2 = e16Var;
            i4 = (tj3Var.m22120g(e16Var2) ? 4 : 2) | i2;
        } else {
            e16Var2 = e16Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            jM20492e = j;
            i4 |= ((i3 & 2) == 0 && tj3Var.m22118f(jM20492e)) ? 32 : 16;
        } else {
            jM20492e = j;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 384) == 0) {
                f3 = f;
                i4 |= tj3Var.m22114d(f3) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= 1024;
            }
            i5 = i4 | 221184;
            if ((74899 & i5) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i5 & 1, z)) {
                tj3Var.m22104W();
                if ((i2 & 1) != 0 || tj3Var.m22084B()) {
                    if (i9 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i3 & 2) != 0) {
                        jM20492e = ra1.m20492e(en7.f37569a, tj3Var);
                        i5 &= -113;
                    }
                    if (i10 != 0) {
                        f3 = 4.0f;
                    }
                    j5 = aa1.f411j;
                    i7 = i5 & (-7169);
                    f6 = 4.0f;
                    i8 = 1;
                } else {
                    tj3Var.m22102U();
                    if ((i3 & 2) != 0) {
                        i5 &= -113;
                    }
                    j5 = j2;
                    i8 = i;
                    f6 = f2;
                    i7 = i5 & (-7169);
                    e16Var4 = e16Var2;
                }
                tj3Var.m22140r();
                el9Var = new el9(((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo912g0(f3), 0.0f, i8, 0, 26);
                C0061c c0061cM21691R = ss5.m21691R(null, tj3Var, 1);
                l44VarM21713i = ss5.m21713i(c0061cM21691R, 0.0f, 1080.0f, ss5.m21687N(ss5.m21703b0(6000, 0, io2.f44352d, 2), null, 0L, 6), null, tj3Var, 4536, 8);
                vp6 vp6Var = new vp6(18);
                pj4 pj4Var = new pj4();
                vp6Var.invoke(pj4Var);
                l44VarM21713i2 = ss5.m21713i(c0061cM21691R, 0.0f, 360.0f, ss5.m21687N(new qj4(pj4Var), null, 0L, 6), null, tj3Var, 4536, 8);
                pj4 pj4Var2 = new pj4();
                pj4Var2.f56315a = 6000;
                pj4Var2.m19201a(3000, Float.valueOf(0.87f)).f54461b = f35900b;
                pj4Var2.m19201a(6000, Float.valueOf(0.1f));
                l44VarM21713i3 = ss5.m21713i(c0061cM21691R, 0.1f, 0.87f, ss5.m21687N(new qj4(pj4Var2), null, 0L, 6), null, tj3Var, 4536, 8);
                e16 e16VarM4422o = c99.m4422o(nv8.m17643c(e16Var4, true, new vp6(19)), 40.0f);
                boolean zM22120g2 = tj3Var.m22120g(l44VarM21713i3);
                e16 e16Var5 = e16Var4;
                if ((i7 & 57344) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z5 = z2 | zM22120g2;
                if ((458752 & i7) == 131072) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z6 = z5 | z3;
                if ((i7 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM22120g = z6 | z4 | tj3Var.m22120g(l44VarM21713i) | tj3Var.m22120g(l44VarM21713i2) | tj3Var.m22118f(j5) | tj3Var.m22124i(el9Var) | ((((i7 & 112) ^ 48) <= 32 && tj3Var.m22118f(jM20492e)) || (i7 & 48) == 32);
                objM22097O = tj3Var.m22097O();
                if (!zM22120g || objM22097O == we1.f66679a) {
                    j6 = jM20492e;
                    f7 = f3;
                    j7 = j5;
                    objM22097O = new vi3() { // from class: an7
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            long j8 = j7;
                            el9 el9Var2 = el9Var;
                            long j9 = j6;
                            InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                            float fFloatValue = ((Number) l44VarM21713i3.getValue()).floatValue() * 360.0f;
                            int i11 = i8;
                            float f8 = f6;
                            if (i11 != 0 && Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))) {
                                f8 += f7;
                            }
                            float fMo906W = (f8 / ((float) (((double) interfaceC0310a.mo906W(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fFloatValue2 = ((Number) l44VarM21713i2.getValue()).floatValue() + ((Number) l44VarM21713i.getValue()).floatValue();
                            long jMo1423z0 = interfaceC0310a.mo1423z0();
                            C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
                            long jM16483A = c3309lsMo603o0.m16483A();
                            c3309lsMo603o0.m16515r().mo17016h();
                            try {
                                ((qn3) c3309lsMo603o0.f50064b).m20052F(fFloatValue2, jMo1423z0);
                                dn7.m10496e(interfaceC0310a, Math.min(fFloatValue, fMo906W) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo906W) * 2.0f), j8, el9Var2);
                                dn7.m10496e(interfaceC0310a, 0.0f, fFloatValue, j9, el9Var2);
                                return xfa.f68157a;
                            } finally {
                                AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
                            }
                        }
                    };
                    tj3Var.m22131l0(objM22097O);
                } else {
                    j6 = jM20492e;
                    f7 = f3;
                    j7 = j5;
                }
                eh0.m11124d(e16VarM4422o, (vi3) objM22097O, tj3Var, 0);
                e16Var3 = e16Var5;
                tj3Var = tj3Var;
                i6 = i8;
                f5 = f6;
                f4 = f7;
                j4 = j7;
                j3 = j6;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                j3 = jM20492e;
                f4 = f3;
                j4 = j2;
                i6 = i;
                f5 = f2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: bn7
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        dn7.m10492a(e16Var3, j3, f4, j4, i6, f5, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 384;
        f3 = f;
        if ((i2 & 3072) == 0) {
            i4 |= 1024;
        }
        i5 = i4 | 221184;
        if ((74899 & i5) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i5 & 1, z)) {
            tj3Var.m22104W();
            if ((i2 & 1) != 0) {
                if (i9 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i3 & 2) != 0) {
                    jM20492e = ra1.m20492e(en7.f37569a, tj3Var);
                    i5 &= -113;
                }
                if (i10 != 0) {
                    f3 = 4.0f;
                }
                j5 = aa1.f411j;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            } else {
                if (i9 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i3 & 2) != 0) {
                    jM20492e = ra1.m20492e(en7.f37569a, tj3Var);
                    i5 &= -113;
                }
                if (i10 != 0) {
                    f3 = 4.0f;
                }
                j5 = aa1.f411j;
                i7 = i5 & (-7169);
                f6 = 4.0f;
                i8 = 1;
            }
            tj3Var.m22140r();
            el9Var = new el9(((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo912g0(f3), 0.0f, i8, 0, 26);
            C0061c c0061cM21691R2 = ss5.m21691R(null, tj3Var, 1);
            l44VarM21713i = ss5.m21713i(c0061cM21691R2, 0.0f, 1080.0f, ss5.m21687N(ss5.m21703b0(6000, 0, io2.f44352d, 2), null, 0L, 6), null, tj3Var, 4536, 8);
            vp6 vp6Var2 = new vp6(18);
            pj4 pj4Var3 = new pj4();
            vp6Var2.invoke(pj4Var3);
            l44VarM21713i2 = ss5.m21713i(c0061cM21691R2, 0.0f, 360.0f, ss5.m21687N(new qj4(pj4Var3), null, 0L, 6), null, tj3Var, 4536, 8);
            pj4 pj4Var4 = new pj4();
            pj4Var4.f56315a = 6000;
            pj4Var4.m19201a(3000, Float.valueOf(0.87f)).f54461b = f35900b;
            pj4Var4.m19201a(6000, Float.valueOf(0.1f));
            l44VarM21713i3 = ss5.m21713i(c0061cM21691R2, 0.1f, 0.87f, ss5.m21687N(new qj4(pj4Var4), null, 0L, 6), null, tj3Var, 4536, 8);
            e16 e16VarM4422o2 = c99.m4422o(nv8.m17643c(e16Var4, true, new vp6(19)), 40.0f);
            boolean zM22120g3 = tj3Var.m22120g(l44VarM21713i3);
            e16 e16Var6 = e16Var4;
            if ((i7 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z7 = z2 | zM22120g3;
            if ((458752 & i7) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z7 | z3;
            if ((i7 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM22120g = z8 | z4 | tj3Var.m22120g(l44VarM21713i) | tj3Var.m22120g(l44VarM21713i2) | tj3Var.m22118f(j5) | tj3Var.m22124i(el9Var) | ((((i7 & 112) ^ 48) <= 32 && tj3Var.m22118f(jM20492e)) || (i7 & 48) == 32);
            objM22097O = tj3Var.m22097O();
            if (zM22120g) {
                j6 = jM20492e;
                f7 = f3;
                j7 = j5;
                objM22097O = new vi3() { // from class: an7
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        long j8 = j7;
                        el9 el9Var2 = el9Var;
                        long j9 = j6;
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        float fFloatValue = ((Number) l44VarM21713i3.getValue()).floatValue() * 360.0f;
                        int i11 = i8;
                        float f8 = f6;
                        if (i11 != 0 && Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))) {
                            f8 += f7;
                        }
                        float fMo906W = (f8 / ((float) (((double) interfaceC0310a.mo906W(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) l44VarM21713i2.getValue()).floatValue() + ((Number) l44VarM21713i.getValue()).floatValue();
                        long jMo1423z0 = interfaceC0310a.mo1423z0();
                        C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
                        long jM16483A = c3309lsMo603o0.m16483A();
                        c3309lsMo603o0.m16515r().mo17016h();
                        try {
                            ((qn3) c3309lsMo603o0.f50064b).m20052F(fFloatValue2, jMo1423z0);
                            dn7.m10496e(interfaceC0310a, Math.min(fFloatValue, fMo906W) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo906W) * 2.0f), j8, el9Var2);
                            dn7.m10496e(interfaceC0310a, 0.0f, fFloatValue, j9, el9Var2);
                            return xfa.f68157a;
                        } finally {
                            AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
                        }
                    }
                };
                tj3Var.m22131l0(objM22097O);
            } else {
                j6 = jM20492e;
                f7 = f3;
                j7 = j5;
                objM22097O = new vi3() { // from class: an7
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        long j8 = j7;
                        el9 el9Var2 = el9Var;
                        long j9 = j6;
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        float fFloatValue = ((Number) l44VarM21713i3.getValue()).floatValue() * 360.0f;
                        int i11 = i8;
                        float f8 = f6;
                        if (i11 != 0 && Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))) {
                            f8 += f7;
                        }
                        float fMo906W = (f8 / ((float) (((double) interfaceC0310a.mo906W(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fFloatValue2 = ((Number) l44VarM21713i2.getValue()).floatValue() + ((Number) l44VarM21713i.getValue()).floatValue();
                        long jMo1423z0 = interfaceC0310a.mo1423z0();
                        C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
                        long jM16483A = c3309lsMo603o0.m16483A();
                        c3309lsMo603o0.m16515r().mo17016h();
                        try {
                            ((qn3) c3309lsMo603o0.f50064b).m20052F(fFloatValue2, jMo1423z0);
                            dn7.m10496e(interfaceC0310a, Math.min(fFloatValue, fMo906W) + fFloatValue, (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo906W) * 2.0f), j8, el9Var2);
                            dn7.m10496e(interfaceC0310a, 0.0f, fFloatValue, j9, el9Var2);
                            return xfa.f68157a;
                        } finally {
                            AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
                        }
                    }
                };
                tj3Var.m22131l0(objM22097O);
            }
            eh0.m11124d(e16VarM4422o2, (vi3) objM22097O, tj3Var, 0);
            e16Var3 = e16Var6;
            tj3Var = tj3Var;
            i6 = i8;
            f5 = f6;
            f4 = f7;
            j4 = j7;
            j3 = j6;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            j3 = jM20492e;
            f4 = f3;
            j4 = j2;
            i6 = i;
            f5 = f2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: bn7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dn7.m10492a(e16Var3, j3, f4, j4, i6, f5, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0164  */
    /* JADX WARN: Code duplicated, block: B:103:0x0166  */
    /* JADX WARN: Code duplicated, block: B:106:0x016e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0170  */
    /* JADX WARN: Code duplicated, block: B:129:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x0137  */
    /* JADX WARN: Code duplicated, block: B:98:0x0159  */
    /* JADX WARN: Code duplicated, block: B:99:0x015b  */
    /* JADX INFO: renamed from: b */
    public static final void m10493b(final ui3 ui3Var, final e16 e16Var, final long j, final float f, long j2, int i, float f2, ye1 ye1Var, final int i2, final int i3) {
        int i4;
        long jM20492e;
        int i5;
        float f3;
        final float f4;
        final int i6;
        final long j3;
        final float f5;
        int i7;
        final long j4;
        boolean z;
        Object objM22097O;
        final ui3 ui3Var2;
        final el9 el9Var;
        boolean zM22120g;
        Object objM22097O2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean zM22124i;
        Object objM22097O3;
        int i8;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1798883595);
        if ((i2 & 6) == 0) {
            i4 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= tj3Var.m22118f(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= tj3Var.m22114d(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            jM20492e = j2;
            i4 |= ((i3 & 16) == 0 && tj3Var.m22118f(jM20492e)) ? 16384 : 8192;
        } else {
            jM20492e = j2;
        }
        int i9 = i3 & 32;
        if (i9 != 0) {
            i4 |= 196608;
            i5 = i;
        } else {
            i5 = i;
            if ((i2 & 196608) == 0) {
                i4 |= tj3Var.m22116e(i5) ? 131072 : 65536;
            }
        }
        int i10 = i3 & 64;
        if (i10 != 0) {
            i4 |= 1572864;
            f3 = f2;
        } else {
            f3 = f2;
            if ((i2 & 1572864) == 0) {
                i4 |= tj3Var.m22114d(f3) ? 1048576 : 524288;
            }
        }
        if (tj3Var.m22099R(i4 & 1, (i4 & 599187) != 599186)) {
            tj3Var.m22104W();
            if ((i2 & 1) == 0 || tj3Var.m22084B()) {
                if ((i3 & 16) != 0) {
                    jM20492e = ra1.m20492e(en7.f37570b, tj3Var);
                    i4 &= -57345;
                }
                if (i9 != 0) {
                    i5 = 1;
                }
                if (i10 != 0) {
                    f5 = 4.0f;
                    i7 = i5;
                }
                j4 = jM20492e;
                tj3Var.m22140r();
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                objM22097O = tj3Var.m22097O();
                p84 p84Var = we1.f66679a;
                if (z || objM22097O == p84Var) {
                    objM22097O = new xa0(27, ui3Var);
                    tj3Var.m22131l0(objM22097O);
                }
                ui3Var2 = (ui3) objM22097O;
                el9Var = new el9(((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo912g0(f), 0.0f, i7, 0, 26);
                zM22120g = tj3Var.m22120g(ui3Var2);
                objM22097O2 = tj3Var.m22097O();
                if (zM22120g || objM22097O2 == p84Var) {
                    objM22097O2 = new sy0(3, ui3Var2);
                    tj3Var.m22131l0(objM22097O2);
                }
                e16 e16VarM4422o = c99.m4422o(nv8.m17643c(e16Var, true, (vi3) objM22097O2), 40.0f);
                boolean zM22120g2 = tj3Var.m22120g(ui3Var2);
                if ((i4 & 458752) == 131072) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                boolean z5 = z2 | zM22120g2;
                if ((3670016 & i4) == 1048576) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z6 = z5 | z3;
                if ((i4 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM22124i = z6 | z4 | ((((57344 & i4) ^ 24576) <= 16384 && tj3Var.m22118f(j4)) || (i4 & 24576) == 16384) | tj3Var.m22124i(el9Var) | ((((i4 & 896) ^ 384) <= 256 && tj3Var.m22118f(j)) || (i4 & 384) == 256);
                objM22097O3 = tj3Var.m22097O();
                if (!zM22124i || objM22097O3 == p84Var) {
                    i8 = 0;
                    final int i11 = i7;
                    vi3 vi3Var = new vi3() { // from class: cn7
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                            float fFloatValue = ((Number) ui3Var2.mo0a()).floatValue() * 360.0f;
                            int i12 = i11;
                            float f6 = f5;
                            if (i12 != 0 && Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))) {
                                f6 += f;
                            }
                            float fMo906W = (f6 / ((float) (((double) interfaceC0310a.mo906W(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)))) * 3.141592653589793d))) * 360.0f;
                            float fMin = Math.min(fFloatValue, fMo906W) + 270.0f + fFloatValue;
                            float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo906W) * 2.0f);
                            long j5 = j4;
                            el9 el9Var2 = el9Var;
                            dn7.m10496e(interfaceC0310a, fMin, fMin2, j5, el9Var2);
                            dn7.m10496e(interfaceC0310a, 270.0f, fFloatValue, j, el9Var2);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(vi3Var);
                    objM22097O3 = vi3Var;
                } else {
                    i8 = 0;
                }
                eh0.m11124d(e16VarM4422o, (vi3) objM22097O3, tj3Var, i8);
                f4 = f5;
                j3 = j4;
                i6 = i7;
            } else {
                tj3Var.m22102U();
                if ((i3 & 16) != 0) {
                    i4 &= -57345;
                }
            }
            i7 = i5;
            f5 = f3;
            j4 = jM20492e;
            tj3Var.m22140r();
            if ((i4 & 14) == 4) {
                z = true;
            } else {
                z = false;
            }
            objM22097O = tj3Var.m22097O();
            p84 p84Var2 = we1.f66679a;
            if (z) {
                objM22097O = new xa0(27, ui3Var);
                tj3Var.m22131l0(objM22097O);
            } else {
                objM22097O = new xa0(27, ui3Var);
                tj3Var.m22131l0(objM22097O);
            }
            ui3Var2 = (ui3) objM22097O;
            el9Var = new el9(((fb2) tj3Var.m22128k(AbstractC0402n.f4816h)).mo912g0(f), 0.0f, i7, 0, 26);
            zM22120g = tj3Var.m22120g(ui3Var2);
            objM22097O2 = tj3Var.m22097O();
            if (zM22120g) {
                objM22097O2 = new sy0(3, ui3Var2);
                tj3Var.m22131l0(objM22097O2);
            } else {
                objM22097O2 = new sy0(3, ui3Var2);
                tj3Var.m22131l0(objM22097O2);
            }
            e16 e16VarM4422o2 = c99.m4422o(nv8.m17643c(e16Var, true, (vi3) objM22097O2), 40.0f);
            boolean zM22120g3 = tj3Var.m22120g(ui3Var2);
            if ((i4 & 458752) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z7 = z2 | zM22120g3;
            if ((3670016 & i4) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z8 = z7 | z3;
            if ((i4 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            zM22124i = z8 | z4 | ((((57344 & i4) ^ 24576) <= 16384 && tj3Var.m22118f(j4)) || (i4 & 24576) == 16384) | tj3Var.m22124i(el9Var) | ((((i4 & 896) ^ 384) <= 256 && tj3Var.m22118f(j)) || (i4 & 384) == 256);
            objM22097O3 = tj3Var.m22097O();
            if (zM22124i) {
                i8 = 0;
                final int i12 = i7;
                vi3 vi3Var2 = new vi3() { // from class: cn7
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        float fFloatValue = ((Number) ui3Var2.mo0a()).floatValue() * 360.0f;
                        int i13 = i12;
                        float f6 = f5;
                        if (i13 != 0 && Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))) {
                            f6 += f;
                        }
                        float fMo906W = (f6 / ((float) (((double) interfaceC0310a.mo906W(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fMin = Math.min(fFloatValue, fMo906W) + 270.0f + fFloatValue;
                        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo906W) * 2.0f);
                        long j5 = j4;
                        el9 el9Var2 = el9Var;
                        dn7.m10496e(interfaceC0310a, fMin, fMin2, j5, el9Var2);
                        dn7.m10496e(interfaceC0310a, 270.0f, fFloatValue, j, el9Var2);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(vi3Var2);
                objM22097O3 = vi3Var2;
            } else {
                i8 = 0;
                final int i13 = i7;
                vi3 vi3Var3 = new vi3() { // from class: cn7
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        float fFloatValue = ((Number) ui3Var2.mo0a()).floatValue() * 360.0f;
                        int i14 = i13;
                        float f6 = f5;
                        if (i14 != 0 && Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))) {
                            f6 += f;
                        }
                        float fMo906W = (f6 / ((float) (((double) interfaceC0310a.mo906W(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)))) * 3.141592653589793d))) * 360.0f;
                        float fMin = Math.min(fFloatValue, fMo906W) + 270.0f + fFloatValue;
                        float fMin2 = (360.0f - fFloatValue) - (Math.min(fFloatValue, fMo906W) * 2.0f);
                        long j5 = j4;
                        el9 el9Var2 = el9Var;
                        dn7.m10496e(interfaceC0310a, fMin, fMin2, j5, el9Var2);
                        dn7.m10496e(interfaceC0310a, 270.0f, fFloatValue, j, el9Var2);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(vi3Var3);
                objM22097O3 = vi3Var3;
            }
            eh0.m11124d(e16VarM4422o2, (vi3) objM22097O3, tj3Var, i8);
            f4 = f5;
            j3 = j4;
            i6 = i7;
        } else {
            tj3Var.m22102U();
            f4 = f3;
            i6 = i5;
            j3 = jM20492e;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: vm7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dn7.m10493b(ui3Var, e16Var, j, f, j3, i6, f4, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0123  */
    /* JADX WARN: Code duplicated, block: B:101:0x0125  */
    /* JADX WARN: Code duplicated, block: B:104:0x012d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x012f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0145  */
    /* JADX WARN: Code duplicated, block: B:110:0x0147  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:118:0x016e  */
    /* JADX WARN: Code duplicated, block: B:121:0x018b  */
    /* JADX WARN: Code duplicated, block: B:122:0x018d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0195  */
    /* JADX WARN: Code duplicated, block: B:126:0x0197  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:150:0x0205  */
    /* JADX WARN: Code duplicated, block: B:153:0x0214  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x0103  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:94:0x0116  */
    /* JADX INFO: renamed from: c */
    public static final void m10494c(final ui3 ui3Var, final e16 e16Var, long j, long j2, int i, float f, vi3 vi3Var, ye1 ye1Var, final int i2, final int i3) {
        int i4;
        final long jM20492e;
        long jM20492e2;
        final int i5;
        int i6;
        float f2;
        int i7;
        boolean z;
        final long j3;
        final float f3;
        final long j4;
        final int i8;
        final vi3 vi3Var2;
        x18 x18VarM22143u;
        int i9;
        boolean z2;
        boolean z3;
        Object objM22097O;
        vi3 vi3Var3;
        int i10;
        final float f4;
        final int i11;
        boolean z4;
        Object objM22097O2;
        final ui3 ui3Var2;
        boolean zM22120g;
        Object objM22097O3;
        boolean z5;
        boolean z6;
        boolean zM22120g2;
        Object objM22097O4;
        final vi3 vi3Var4;
        final long j5;
        final long j6;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-339970038);
        if ((i2 & 6) == 0) {
            i4 = (tj3Var.m22124i(ui3Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var.m22120g(e16Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            jM20492e = j;
            i4 |= ((i3 & 4) == 0 && tj3Var.m22118f(jM20492e)) ? 256 : 128;
        } else {
            jM20492e = j;
        }
        if ((i2 & 3072) == 0) {
            jM20492e2 = j2;
            i4 |= ((i3 & 8) == 0 && tj3Var.m22118f(jM20492e2)) ? 2048 : 1024;
        } else {
            jM20492e2 = j2;
        }
        int i12 = i3 & 16;
        if (i12 == 0) {
            if ((i2 & 24576) == 0) {
                i5 = i;
                i4 |= tj3Var.m22116e(i5) ? 16384 : 8192;
            }
            i6 = i3 & 32;
            if (i6 != 0) {
                i4 |= 196608;
                f2 = f;
            } else {
                f2 = f;
                if ((i2 & 196608) == 0) {
                    if (tj3Var.m22114d(f2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i4 |= i7;
                }
            }
            if ((i2 & 1572864) == 0) {
                i4 |= 524288;
            }
            if ((i4 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i4 & 1, z)) {
                tj3Var.m22104W();
                i9 = i2 & 1;
                p84 p84Var = we1.f66679a;
                if (i9 != 0 || tj3Var.m22084B()) {
                    if ((i3 & 4) != 0) {
                        jM20492e = ra1.m20492e(en7.f37569a, tj3Var);
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        jM20492e2 = ra1.m20492e(en7.f37570b, tj3Var);
                        i4 &= -7169;
                    }
                    if (i12 != 0) {
                        i5 = 1;
                    }
                    if (i6 != 0) {
                        f2 = 4.0f;
                    }
                    boolean z7 = (((i4 & 896) ^ 384) <= 256 && tj3Var.m22118f(jM20492e)) || (i4 & 384) == 256;
                    if ((i4 & 57344) == 16384) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z3 = z7 | z2;
                    objM22097O = tj3Var.m22097O();
                    if (z3 || objM22097O == p84Var) {
                        objM22097O = new vi3() { // from class: um7
                            @Override // p000.vi3
                            public final Object invoke(Object obj) {
                                InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                                float fMin = Math.min(interfaceC0310a.mo912g0(4.0f), Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)));
                                float fMo912g0 = interfaceC0310a.mo912g0(6.0f);
                                float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) - fMin) / 2.0f;
                                float f5 = fIntBitsToFloat > fMo912g0 ? fMo912g0 : fIntBitsToFloat;
                                LayoutDirection layoutDirection = interfaceC0310a.getLayoutDirection();
                                LayoutDirection layoutDirection2 = LayoutDirection.Rtl;
                                long j7 = jM20492e;
                                int i13 = i5;
                                if (layoutDirection == layoutDirection2) {
                                    long jMo1423z0 = interfaceC0310a.mo1423z0();
                                    C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
                                    long jM16483A = c3309lsMo603o0.m16483A();
                                    c3309lsMo603o0.m16515r().mo17016h();
                                    try {
                                        ((qn3) c3309lsMo603o0.f50064b).m20053G(-1.0f, 1.0f, jMo1423z0);
                                        x74.m24358o(interfaceC0310a, i13, j7, fMin, f5);
                                    } finally {
                                        AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
                                    }
                                } else {
                                    x74.m24358o(interfaceC0310a, i13, j7, fMin, f5);
                                }
                                return xfa.f68157a;
                            }
                        };
                        tj3Var.m22131l0(objM22097O);
                    }
                    vi3Var3 = (vi3) objM22097O;
                    i10 = i4 & (-3670017);
                } else {
                    tj3Var.m22102U();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    i10 = i4 & (-3670017);
                    vi3Var3 = vi3Var;
                }
                f4 = f2;
                i11 = i5;
                tj3Var.m22140r();
                if ((i10 & 14) == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM22097O2 = tj3Var.m22097O();
                if (z4 || objM22097O2 == p84Var) {
                    objM22097O2 = new k92(22, ui3Var);
                    tj3Var.m22131l0(objM22097O2);
                }
                ui3Var2 = (ui3) objM22097O2;
                e16 e16VarMo3161g = e16Var.mo3161g(AbstractC3025g4.f40156b);
                zM22120g = tj3Var.m22120g(ui3Var2);
                objM22097O3 = tj3Var.m22097O();
                if (zM22120g || objM22097O3 == p84Var) {
                    objM22097O3 = new C3305lo(4, ui3Var2);
                    tj3Var.m22131l0(objM22097O3);
                }
                e16 e16VarM4423p = c99.m4423p(nv8.m17643c(e16VarMo3161g, true, (vi3) objM22097O3), 240.0f, 4.0f);
                if ((i10 & 57344) == 16384) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((458752 & i10) == 131072) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                zM22120g2 = z6 | z5 | tj3Var.m22120g(ui3Var2) | ((((i10 & 7168) ^ 3072) <= 2048 && tj3Var.m22118f(jM20492e2)) || (i10 & 3072) == 2048) | ((((i10 & 896) ^ 384) <= 256 && tj3Var.m22118f(jM20492e)) || (i10 & 384) == 256) | tj3Var.m22120g(vi3Var3);
                objM22097O4 = tj3Var.m22097O();
                if (!zM22120g2 || objM22097O4 == p84Var) {
                    vi3Var4 = vi3Var3;
                    j5 = jM20492e;
                    j6 = jM20492e2;
                    objM22097O4 = new vi3() { // from class: ym7
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L));
                            int i13 = i11;
                            float fMo906W = f4;
                            if (i13 != 0 && Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))) {
                                fMo906W += interfaceC0310a.mo906W(fIntBitsToFloat);
                            }
                            float fMo906W2 = fMo906W / interfaceC0310a.mo906W(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)));
                            float fFloatValue = ((Number) ui3Var2.mo0a()).floatValue();
                            float fMin = Math.min(fFloatValue, fMo906W2) + fFloatValue;
                            if (fMin <= 1.0f) {
                                dn7.m10497f(interfaceC0310a, fMin, 1.0f, j6, fIntBitsToFloat, i13);
                            }
                            dn7.m10497f(interfaceC0310a, 0.0f, fFloatValue, j5, fIntBitsToFloat, i13);
                            vi3Var4.invoke(interfaceC0310a);
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O4);
                } else {
                    vi3Var4 = vi3Var3;
                    j5 = jM20492e;
                    j6 = jM20492e2;
                }
                eh0.m11124d(e16VarM4423p, (vi3) objM22097O4, tj3Var, 0);
                i8 = i11;
                f3 = f4;
                j4 = j6;
                j3 = j5;
                vi3Var2 = vi3Var4;
            } else {
                tj3Var.m22102U();
                j3 = jM20492e;
                f3 = f2;
                j4 = jM20492e2;
                i8 = i5;
                vi3Var2 = vi3Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: zm7
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        dn7.m10494c(ui3Var, e16Var, j3, j4, i8, f3, vi3Var2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i4 |= 24576;
        i5 = i;
        i6 = i3 & 32;
        if (i6 != 0) {
            i4 |= 196608;
            f2 = f;
        } else {
            f2 = f;
            if ((i2 & 196608) == 0) {
                if (tj3Var.m22114d(f2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i4 |= i7;
            }
        }
        if ((i2 & 1572864) == 0) {
            i4 |= 524288;
        }
        if ((i4 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i4 & 1, z)) {
            tj3Var.m22104W();
            i9 = i2 & 1;
            p84 p84Var2 = we1.f66679a;
            if (i9 != 0) {
                if ((i3 & 4) != 0) {
                    jM20492e = ra1.m20492e(en7.f37569a, tj3Var);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM20492e2 = ra1.m20492e(en7.f37570b, tj3Var);
                    i4 &= -7169;
                }
                if (i12 != 0) {
                    i5 = 1;
                }
                if (i6 != 0) {
                    f2 = 4.0f;
                }
                if (((i4 & 896) ^ 384) <= 256) {
                }
                if ((i4 & 57344) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z7 | z2;
                objM22097O = tj3Var.m22097O();
                if (z3) {
                    objM22097O = new vi3() { // from class: um7
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                            float fMin = Math.min(interfaceC0310a.mo912g0(4.0f), Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)));
                            float fMo912g0 = interfaceC0310a.mo912g0(6.0f);
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) - fMin) / 2.0f;
                            float f5 = fIntBitsToFloat > fMo912g0 ? fMo912g0 : fIntBitsToFloat;
                            LayoutDirection layoutDirection = interfaceC0310a.getLayoutDirection();
                            LayoutDirection layoutDirection2 = LayoutDirection.Rtl;
                            long j7 = jM20492e;
                            int i13 = i5;
                            if (layoutDirection == layoutDirection2) {
                                long jMo1423z0 = interfaceC0310a.mo1423z0();
                                C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
                                long jM16483A = c3309lsMo603o0.m16483A();
                                c3309lsMo603o0.m16515r().mo17016h();
                                try {
                                    ((qn3) c3309lsMo603o0.f50064b).m20053G(-1.0f, 1.0f, jMo1423z0);
                                    x74.m24358o(interfaceC0310a, i13, j7, fMin, f5);
                                } finally {
                                    AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
                                }
                            } else {
                                x74.m24358o(interfaceC0310a, i13, j7, fMin, f5);
                            }
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new vi3() { // from class: um7
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                            float fMin = Math.min(interfaceC0310a.mo912g0(4.0f), Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)));
                            float fMo912g0 = interfaceC0310a.mo912g0(6.0f);
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) - fMin) / 2.0f;
                            float f5 = fIntBitsToFloat > fMo912g0 ? fMo912g0 : fIntBitsToFloat;
                            LayoutDirection layoutDirection = interfaceC0310a.getLayoutDirection();
                            LayoutDirection layoutDirection2 = LayoutDirection.Rtl;
                            long j7 = jM20492e;
                            int i13 = i5;
                            if (layoutDirection == layoutDirection2) {
                                long jMo1423z0 = interfaceC0310a.mo1423z0();
                                C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
                                long jM16483A = c3309lsMo603o0.m16483A();
                                c3309lsMo603o0.m16515r().mo17016h();
                                try {
                                    ((qn3) c3309lsMo603o0.f50064b).m20053G(-1.0f, 1.0f, jMo1423z0);
                                    x74.m24358o(interfaceC0310a, i13, j7, fMin, f5);
                                } finally {
                                    AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
                                }
                            } else {
                                x74.m24358o(interfaceC0310a, i13, j7, fMin, f5);
                            }
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O);
                }
                vi3Var3 = (vi3) objM22097O;
                i10 = i4 & (-3670017);
            } else {
                if ((i3 & 4) != 0) {
                    jM20492e = ra1.m20492e(en7.f37569a, tj3Var);
                    i4 &= -897;
                }
                if ((i3 & 8) != 0) {
                    jM20492e2 = ra1.m20492e(en7.f37570b, tj3Var);
                    i4 &= -7169;
                }
                if (i12 != 0) {
                    i5 = 1;
                }
                if (i6 != 0) {
                    f2 = 4.0f;
                }
                if (((i4 & 896) ^ 384) <= 256) {
                }
                if ((i4 & 57344) == 16384) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z3 = z7 | z2;
                objM22097O = tj3Var.m22097O();
                if (z3) {
                    objM22097O = new vi3() { // from class: um7
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                            float fMin = Math.min(interfaceC0310a.mo912g0(4.0f), Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)));
                            float fMo912g0 = interfaceC0310a.mo912g0(6.0f);
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) - fMin) / 2.0f;
                            float f5 = fIntBitsToFloat > fMo912g0 ? fMo912g0 : fIntBitsToFloat;
                            LayoutDirection layoutDirection = interfaceC0310a.getLayoutDirection();
                            LayoutDirection layoutDirection2 = LayoutDirection.Rtl;
                            long j7 = jM20492e;
                            int i13 = i5;
                            if (layoutDirection == layoutDirection2) {
                                long jMo1423z0 = interfaceC0310a.mo1423z0();
                                C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
                                long jM16483A = c3309lsMo603o0.m16483A();
                                c3309lsMo603o0.m16515r().mo17016h();
                                try {
                                    ((qn3) c3309lsMo603o0.f50064b).m20053G(-1.0f, 1.0f, jMo1423z0);
                                    x74.m24358o(interfaceC0310a, i13, j7, fMin, f5);
                                } finally {
                                    AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
                                }
                            } else {
                                x74.m24358o(interfaceC0310a, i13, j7, fMin, f5);
                            }
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O);
                } else {
                    objM22097O = new vi3() { // from class: um7
                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                            float fMin = Math.min(interfaceC0310a.mo912g0(4.0f), Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)));
                            float fMo912g0 = interfaceC0310a.mo912g0(6.0f);
                            float fIntBitsToFloat = (Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) - fMin) / 2.0f;
                            float f5 = fIntBitsToFloat > fMo912g0 ? fMo912g0 : fIntBitsToFloat;
                            LayoutDirection layoutDirection = interfaceC0310a.getLayoutDirection();
                            LayoutDirection layoutDirection2 = LayoutDirection.Rtl;
                            long j7 = jM20492e;
                            int i13 = i5;
                            if (layoutDirection == layoutDirection2) {
                                long jMo1423z0 = interfaceC0310a.mo1423z0();
                                C3309ls c3309lsMo603o0 = interfaceC0310a.mo603o0();
                                long jM16483A = c3309lsMo603o0.m16483A();
                                c3309lsMo603o0.m16515r().mo17016h();
                                try {
                                    ((qn3) c3309lsMo603o0.f50064b).m20053G(-1.0f, 1.0f, jMo1423z0);
                                    x74.m24358o(interfaceC0310a, i13, j7, fMin, f5);
                                } finally {
                                    AbstractC3393o1.m17751z(c3309lsMo603o0, jM16483A);
                                }
                            } else {
                                x74.m24358o(interfaceC0310a, i13, j7, fMin, f5);
                            }
                            return xfa.f68157a;
                        }
                    };
                    tj3Var.m22131l0(objM22097O);
                }
                vi3Var3 = (vi3) objM22097O;
                i10 = i4 & (-3670017);
            }
            f4 = f2;
            i11 = i5;
            tj3Var.m22140r();
            if ((i10 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            objM22097O2 = tj3Var.m22097O();
            if (z4) {
                objM22097O2 = new k92(22, ui3Var);
                tj3Var.m22131l0(objM22097O2);
            } else {
                objM22097O2 = new k92(22, ui3Var);
                tj3Var.m22131l0(objM22097O2);
            }
            ui3Var2 = (ui3) objM22097O2;
            e16 e16VarMo3161g2 = e16Var.mo3161g(AbstractC3025g4.f40156b);
            zM22120g = tj3Var.m22120g(ui3Var2);
            objM22097O3 = tj3Var.m22097O();
            if (zM22120g) {
                objM22097O3 = new C3305lo(4, ui3Var2);
                tj3Var.m22131l0(objM22097O3);
            } else {
                objM22097O3 = new C3305lo(4, ui3Var2);
                tj3Var.m22131l0(objM22097O3);
            }
            e16 e16VarM4423p2 = c99.m4423p(nv8.m17643c(e16VarMo3161g2, true, (vi3) objM22097O3), 240.0f, 4.0f);
            if ((i10 & 57344) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((458752 & i10) == 131072) {
                z6 = true;
            } else {
                z6 = false;
            }
            zM22120g2 = z6 | z5 | tj3Var.m22120g(ui3Var2) | ((((i10 & 7168) ^ 3072) <= 2048 && tj3Var.m22118f(jM20492e2)) || (i10 & 3072) == 2048) | ((((i10 & 896) ^ 384) <= 256 && tj3Var.m22118f(jM20492e)) || (i10 & 384) == 256) | tj3Var.m22120g(vi3Var3);
            objM22097O4 = tj3Var.m22097O();
            if (zM22120g2) {
                vi3Var4 = vi3Var3;
                j5 = jM20492e;
                j6 = jM20492e2;
                objM22097O4 = new vi3() { // from class: ym7
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L));
                        int i13 = i11;
                        float fMo906W = f4;
                        if (i13 != 0 && Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))) {
                            fMo906W += interfaceC0310a.mo906W(fIntBitsToFloat);
                        }
                        float fMo906W2 = fMo906W / interfaceC0310a.mo906W(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)));
                        float fFloatValue = ((Number) ui3Var2.mo0a()).floatValue();
                        float fMin = Math.min(fFloatValue, fMo906W2) + fFloatValue;
                        if (fMin <= 1.0f) {
                            dn7.m10497f(interfaceC0310a, fMin, 1.0f, j6, fIntBitsToFloat, i13);
                        }
                        dn7.m10497f(interfaceC0310a, 0.0f, fFloatValue, j5, fIntBitsToFloat, i13);
                        vi3Var4.invoke(interfaceC0310a);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O4);
            } else {
                vi3Var4 = vi3Var3;
                j5 = jM20492e;
                j6 = jM20492e2;
                objM22097O4 = new vi3() { // from class: ym7
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L));
                        int i13 = i11;
                        float fMo906W = f4;
                        if (i13 != 0 && Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L)) <= Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))) {
                            fMo906W += interfaceC0310a.mo906W(fIntBitsToFloat);
                        }
                        float fMo906W2 = fMo906W / interfaceC0310a.mo906W(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)));
                        float fFloatValue = ((Number) ui3Var2.mo0a()).floatValue();
                        float fMin = Math.min(fFloatValue, fMo906W2) + fFloatValue;
                        if (fMin <= 1.0f) {
                            dn7.m10497f(interfaceC0310a, fMin, 1.0f, j6, fIntBitsToFloat, i13);
                        }
                        dn7.m10497f(interfaceC0310a, 0.0f, fFloatValue, j5, fIntBitsToFloat, i13);
                        vi3Var4.invoke(interfaceC0310a);
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O4);
            }
            eh0.m11124d(e16VarM4423p2, (vi3) objM22097O4, tj3Var, 0);
            i8 = i11;
            f3 = f4;
            j4 = j6;
            j3 = j5;
            vi3Var2 = vi3Var4;
        } else {
            tj3Var.m22102U();
            j3 = jM20492e;
            f3 = f2;
            j4 = jM20492e2;
            i8 = i5;
            vi3Var2 = vi3Var;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: zm7
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    dn7.m10494c(ui3Var, e16Var, j3, j4, i8, f3, vi3Var2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m10495d(final e16 e16Var, long j, long j2, int i, float f, ye1 ye1Var, final int i2) {
        final long j3;
        final long j4;
        final int i3;
        final float f2;
        int i4;
        long jM20492e;
        long jM20492e2;
        final float f3;
        final int i5;
        long j5;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(567589233);
        int i6 = i2 | 27792;
        if (tj3Var.m22099R(i6 & 1, (i6 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i2 & 1) == 0 || tj3Var.m22084B()) {
                i4 = 1;
                jM20492e = ra1.m20492e(en7.f37569a, tj3Var);
                jM20492e2 = ra1.m20492e(en7.f37570b, tj3Var);
                f3 = 4.0f;
            } else {
                tj3Var.m22102U();
                jM20492e = j;
                jM20492e2 = j2;
                i4 = i;
                f3 = f;
            }
            tj3Var.m22140r();
            C0061c c0061cM21691R = ss5.m21691R(null, tj3Var, 1);
            pj4 pj4Var = new pj4();
            pj4Var.f56315a = 1750;
            oj4 oj4VarM19201a = pj4Var.m19201a(0, fValueOf2);
            zr1 zr1Var = f35899a;
            oj4VarM19201a.f54461b = zr1Var;
            pj4Var.m19201a(DescriptorProtos.Edition.EDITION_2023_VALUE, fValueOf);
            final long j6 = jM20492e2;
            final long j7 = jM20492e;
            final l44 l44VarM21713i = ss5.m21713i(c0061cM21691R, 0.0f, 1.0f, ss5.m21687N(new qj4(pj4Var), null, 0L, 6), null, tj3Var, 4536, 8);
            pj4 pj4Var2 = new pj4();
            pj4Var2.f56315a = 1750;
            pj4Var2.m19201a(250, fValueOf2).f54461b = zr1Var;
            pj4Var2.m19201a(1250, fValueOf);
            final l44 l44VarM21713i2 = ss5.m21713i(c0061cM21691R, 0.0f, 1.0f, ss5.m21687N(new qj4(pj4Var2), null, 0L, 6), null, tj3Var, 4536, 8);
            pj4 pj4Var3 = new pj4();
            pj4Var3.f56315a = 1750;
            pj4Var3.m19201a(650, fValueOf2).f54461b = zr1Var;
            pj4Var3.m19201a(1500, fValueOf);
            final l44 l44VarM21713i3 = ss5.m21713i(c0061cM21691R, 0.0f, 1.0f, ss5.m21687N(new qj4(pj4Var3), null, 0L, 6), null, tj3Var, 4536, 8);
            pj4 pj4Var4 = new pj4();
            pj4Var4.f56315a = 1750;
            pj4Var4.m19201a(DescriptorProtos.Edition.EDITION_LEGACY_VALUE, fValueOf2).f54461b = zr1Var;
            pj4Var4.m19201a(1750, fValueOf);
            final l44 l44VarM21713i4 = ss5.m21713i(c0061cM21691R, 0.0f, 1.0f, ss5.m21687N(new qj4(pj4Var4), null, 0L, 6), null, tj3Var, 4536, 8);
            e16 e16VarM4423p = c99.m4423p(nv8.m17643c(e16Var.mo3161g(AbstractC3025g4.f40156b), true, new vp6(19)), 240.0f, 4.0f);
            boolean zM22120g = tj3Var.m22120g(l44VarM21713i) | tj3Var.m22118f(j6) | tj3Var.m22120g(l44VarM21713i2) | tj3Var.m22118f(j7) | tj3Var.m22120g(l44VarM21713i3) | tj3Var.m22120g(l44VarM21713i4);
            Object objM22097O = tj3Var.m22097O();
            if (zM22120g || objM22097O == we1.f66679a) {
                i5 = i4;
                vi3 vi3Var = new vi3() { // from class: wm7
                    @Override // p000.vi3
                    public final Object invoke(Object obj) {
                        long j8;
                        InterfaceC0310a interfaceC0310a = (InterfaceC0310a) obj;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L));
                        int i7 = i5;
                        float fMo906W = f3;
                        if (i7 != 0 && Float.intBitsToFloat((int) (4294967295L & interfaceC0310a.mo1422h())) <= Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32))) {
                            fMo906W += interfaceC0310a.mo906W(fIntBitsToFloat);
                        }
                        float fMo906W2 = fMo906W / interfaceC0310a.mo906W(Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)));
                        dh9 dh9Var = l44VarM21713i;
                        float fFloatValue = ((Number) dh9Var.getValue()).floatValue();
                        float f4 = 1.0f - fMo906W2;
                        long j9 = j6;
                        if (fFloatValue < f4) {
                            dn7.m10497f(interfaceC0310a, ((Number) dh9Var.getValue()).floatValue() > 0.0f ? ((Number) dh9Var.getValue()).floatValue() + fMo906W2 : 0.0f, 1.0f, j9, fIntBitsToFloat, i7);
                        }
                        long j10 = j9;
                        float fFloatValue2 = ((Number) dh9Var.getValue()).floatValue();
                        dh9 dh9Var2 = l44VarM21713i2;
                        float fFloatValue3 = fFloatValue2 - ((Number) dh9Var2.getValue()).floatValue();
                        long j11 = j7;
                        if (fFloatValue3 > 0.0f) {
                            dn7.m10497f(interfaceC0310a, ((Number) dh9Var.getValue()).floatValue(), ((Number) dh9Var2.getValue()).floatValue(), j11, fIntBitsToFloat, i7);
                            j8 = j11;
                        } else {
                            j8 = j11;
                        }
                        float fFloatValue4 = ((Number) dh9Var2.getValue()).floatValue();
                        dh9 dh9Var3 = l44VarM21713i3;
                        if (fFloatValue4 > fMo906W2) {
                            dn7.m10497f(interfaceC0310a, ((Number) dh9Var3.getValue()).floatValue() > 0.0f ? ((Number) dh9Var3.getValue()).floatValue() + fMo906W2 : 0.0f, ((Number) dh9Var2.getValue()).floatValue() < 1.0f ? ((Number) dh9Var2.getValue()).floatValue() - fMo906W2 : 1.0f, j10, fIntBitsToFloat, i7);
                            j10 = j10;
                        }
                        float fFloatValue5 = ((Number) dh9Var3.getValue()).floatValue();
                        dh9 dh9Var4 = l44VarM21713i4;
                        if (fFloatValue5 - ((Number) dh9Var4.getValue()).floatValue() > 0.0f) {
                            dn7.m10497f(interfaceC0310a, ((Number) dh9Var3.getValue()).floatValue(), ((Number) dh9Var4.getValue()).floatValue(), j8, fIntBitsToFloat, i7);
                            interfaceC0310a = interfaceC0310a;
                            fIntBitsToFloat = fIntBitsToFloat;
                        }
                        if (((Number) dh9Var4.getValue()).floatValue() > fMo906W2) {
                            dn7.m10497f(interfaceC0310a, 0.0f, ((Number) dh9Var4.getValue()).floatValue() < 1.0f ? ((Number) dh9Var4.getValue()).floatValue() - fMo906W2 : 1.0f, j10, fIntBitsToFloat, i7);
                        }
                        return xfa.f68157a;
                    }
                };
                j5 = j6;
                tj3Var.m22131l0(vi3Var);
                objM22097O = vi3Var;
            } else {
                i5 = i4;
                j5 = j6;
            }
            eh0.m11124d(e16VarM4423p, (vi3) objM22097O, tj3Var, 0);
            j3 = j7;
            i3 = i5;
            f2 = f3;
            j4 = j5;
        } else {
            tj3Var.m22102U();
            j3 = j;
            j4 = j2;
            i3 = i;
            f2 = f;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(j3, j4, i3, f2, i2) { // from class: xm7

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ long f68353b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ long f68354c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f68355d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ float f68356e;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(7);
                    dn7.m10495d(this.f68352a, this.f68353b, this.f68354c, this.f68355d, this.f68356e, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m10496e(InterfaceC0310a interfaceC0310a, float f, float f2, long j, el9 el9Var) {
        float f3 = el9Var.f37448a / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32)) - (2.0f * f3);
        InterfaceC0310a.m1419t0(interfaceC0310a, j, f, f2, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f3)) & 4294967295L), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), 0.0f, el9Var, 832);
    }

    /* JADX INFO: renamed from: f */
    public static final void m10497f(InterfaceC0310a interfaceC0310a, float f, float f2, long j, float f3, int i) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC0310a.mo1422h() & 4294967295L));
        float f4 = fIntBitsToFloat2 / 2.0f;
        boolean z = interfaceC0310a.getLayoutDirection() == LayoutDirection.Ltr;
        float f5 = (z ? f : 1.0f - f2) * fIntBitsToFloat;
        float f6 = (z ? f2 : 1.0f - f) * fIntBitsToFloat;
        if (i == 0 || fIntBitsToFloat2 > fIntBitsToFloat) {
            interfaceC0310a.mo604w(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (496 & 16) != 0 ? 0 : 0, (496 & 32) != 0 ? null : null);
            return;
        }
        float f7 = f3 / 2.0f;
        float f8 = fIntBitsToFloat - f7;
        if (f5 < f7) {
            f5 = f7;
        }
        if (f5 > f8) {
            f5 = f8;
        }
        if (f6 < f7) {
            f6 = f7;
        }
        if (f6 <= f8) {
            f8 = f6;
        }
        if (Math.abs(f2 - f) > 0.0f) {
            interfaceC0310a.mo604w(j, (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), (((long) Float.floatToRawIntBits(f8)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L), f3, (496 & 16) != 0 ? 0 : i, (496 & 32) != 0 ? null : null);
        }
    }
}
