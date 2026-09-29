package p000;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.runtime.AbstractC0278f;

/* JADX INFO: loaded from: classes2.dex */
public abstract class g4d {
    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:102:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x0140  */
    /* JADX WARN: Code duplicated, block: B:108:0x0143  */
    /* JADX WARN: Code duplicated, block: B:110:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x0160  */
    /* JADX WARN: Code duplicated, block: B:116:0x016f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0180  */
    /* JADX WARN: Code duplicated, block: B:122:0x019d  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:127:0x0206  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0044  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x011a  */
    /* JADX WARN: Code duplicated, block: B:92:0x011d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0120  */
    /* JADX WARN: Code duplicated, block: B:95:0x0123  */
    /* JADX WARN: Code duplicated, block: B:98:0x0127  */
    /* JADX INFO: renamed from: a */
    public static final void m12360a(final String str, e16 e16Var, long j, ks9 ks9Var, long j2, int i, boolean z, int i2, vx9 vx9Var, bc3 bc3Var, ye1 ye1Var, final int i3, final int i4) {
        int i5;
        e16 e16Var2;
        int i6;
        long j3;
        int i7;
        int i8;
        ks9 ks9Var2;
        int i9;
        int i10;
        int i11;
        int i12;
        vx9 vx9Var2;
        int i13;
        int i14;
        int i15;
        boolean z2;
        tj3 tj3Var;
        final boolean z3;
        final bc3 bc3Var2;
        final e16 e16Var3;
        final long j4;
        final ks9 ks9Var3;
        final vx9 vx9Var3;
        final long j5;
        final int i16;
        final int i17;
        x18 x18VarM22143u;
        e16 e16Var4;
        long j6;
        int i18;
        vx9 vx9Var4;
        bc3 bc3Var3;
        long j7;
        int i19;
        ks9 ks9Var4;
        boolean z4;
        int i20;
        long j8;
        Object objM22097O;
        p84 p84Var;
        t66 t66Var;
        Object objM22097O2;
        t66 t66Var2;
        Object objM22097O3;
        Object objM22097O4;
        str.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-1351272434);
        if ((i3 & 6) == 0) {
            i5 = (tj3Var2.m22120g(str) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i21 = i4 & 2;
        if (i21 == 0) {
            if ((i3 & 48) == 0) {
                e16Var2 = e16Var;
                i5 |= tj3Var2.m22120g(e16Var2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 != 0) {
                if ((i3 & 384) == 0) {
                    j3 = j;
                    if (tj3Var2.m22118f(j3)) {
                        i7 = 256;
                    } else {
                        i7 = 128;
                    }
                    i5 |= i7;
                }
                i8 = i4 & 8;
                if (i8 != 0) {
                    if ((i3 & 3072) == 0) {
                        ks9Var2 = ks9Var;
                        if (tj3Var2.m22120g(ks9Var2)) {
                            i9 = 2048;
                        } else {
                            i9 = 1024;
                        }
                        i5 |= i9;
                    }
                    i10 = 1794048 | i5;
                    i11 = i4 & 128;
                    if (i11 != 0) {
                        if ((12582912 & i3) == 0) {
                            if (tj3Var2.m22116e(i2)) {
                                i12 = 8388608;
                            } else {
                                i12 = 4194304;
                            }
                            i10 |= i12;
                        }
                        if ((100663296 & i3) == 0) {
                            if ((i4 & 256) == 0) {
                                vx9Var2 = vx9Var;
                                int i22 = tj3Var2.m22120g(vx9Var2) ? 67108864 : 33554432;
                                i10 |= i22;
                            } else {
                                vx9Var2 = vx9Var;
                            }
                            i10 |= i22;
                        } else {
                            vx9Var2 = vx9Var;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i10 |= 805306368;
                        } else if ((i3 & 805306368) == 0) {
                            if (tj3Var2.m22120g(bc3Var)) {
                                i14 = 536870912;
                            } else {
                                i14 = 268435456;
                            }
                            i10 |= i14;
                        }
                        i15 = 0;
                        if ((i10 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (tj3Var2.m22099R(i10 & 1, z2)) {
                            tj3Var2.m22104W();
                            if ((i3 & 1) != 0 || tj3Var2.m22084B()) {
                                if (i21 != 0) {
                                    e16Var4 = b16.f7762a;
                                } else {
                                    e16Var4 = e16Var2;
                                }
                                if (i6 != 0) {
                                    j6 = aa1.f412k;
                                } else {
                                    j6 = j3;
                                }
                                if (i8 != 0) {
                                    ks9Var2 = null;
                                }
                                long j9 = zx9.f72359c;
                                if (i11 != 0) {
                                    i18 = Integer.MAX_VALUE;
                                } else {
                                    i18 = i2;
                                }
                                if ((i4 & 256) != 0) {
                                    vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                                    i10 &= -234881025;
                                } else {
                                    vx9Var4 = vx9Var2;
                                }
                                if (i13 != 0) {
                                    bc3Var3 = null;
                                } else {
                                    bc3Var3 = bc3Var;
                                }
                                j7 = j9;
                                i19 = i18;
                                ks9Var4 = ks9Var2;
                                z4 = true;
                                i20 = 2;
                                j8 = j6;
                            } else {
                                tj3Var2.m22102U();
                                if ((i4 & 256) != 0) {
                                    i10 &= -234881025;
                                }
                                j7 = j2;
                                i20 = i;
                                z4 = z;
                                i19 = i2;
                                bc3Var3 = bc3Var;
                                e16Var4 = e16Var2;
                                j8 = j3;
                                ks9Var4 = ks9Var2;
                                vx9Var4 = vx9Var2;
                            }
                            tj3Var2.m22140r();
                            objM22097O = tj3Var2.m22097O();
                            p84Var = we1.f66679a;
                            if (objM22097O == p84Var) {
                                objM22097O = AbstractC0278f.m1260j(vx9Var4);
                                tj3Var2.m22131l0(objM22097O);
                            }
                            t66Var = (t66) objM22097O;
                            objM22097O2 = tj3Var2.m22097O();
                            if (objM22097O2 == p84Var) {
                                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                                tj3Var2.m22131l0(objM22097O2);
                            }
                            t66Var2 = (t66) objM22097O2;
                            objM22097O3 = tj3Var2.m22097O();
                            if (objM22097O3 == p84Var) {
                                objM22097O3 = new C0023al(2, t66Var2);
                                tj3Var2.m22131l0(objM22097O3);
                            }
                            e16 e16VarM23656z = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                            vx9 vx9Var5 = (vx9) t66Var.getValue();
                            objM22097O4 = tj3Var2.m22097O();
                            if (objM22097O4 == p84Var) {
                                objM22097O4 = new n20(t66Var, t66Var2, i15);
                                tj3Var2.m22131l0(objM22097O4);
                            }
                            int i23 = i10 >> 9;
                            tj3Var = tj3Var2;
                            lw9.m16554b(str, e16VarM23656z, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var5, tj3Var, (i10 & 910) | (3670016 & i23), (i23 & 14) | 1572864 | (i23 & 112) | (i23 & 896) | (i23 & 7168) | (i23 & 57344), 33720);
                            e16Var3 = e16Var4;
                            vx9Var3 = vx9Var4;
                            j4 = j8;
                            bc3Var2 = bc3Var3;
                            ks9Var3 = ks9Var4;
                            j5 = j7;
                            i16 = i20;
                            z3 = z4;
                            i17 = i19;
                        } else {
                            tj3Var = tj3Var2;
                            tj3Var.m22102U();
                            z3 = z;
                            bc3Var2 = bc3Var;
                            e16Var3 = e16Var2;
                            j4 = j3;
                            ks9Var3 = ks9Var2;
                            vx9Var3 = vx9Var2;
                            j5 = j2;
                            i16 = i;
                            i17 = i2;
                        }
                        x18VarM22143u = tj3Var.m22143u();
                        if (x18VarM22143u != null) {
                            x18VarM22143u.f67642d = new zi3() { // from class: o20
                                @Override // p000.zi3
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    int iM19383z = pk9.m19383z(i3 | 1);
                                    g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                                    return xfa.f68157a;
                                }
                            };
                        }
                    }
                    i10 = 14376960 | i5;
                    if ((100663296 & i3) == 0) {
                        if ((i4 & 256) == 0) {
                            vx9Var2 = vx9Var;
                            if (tj3Var2.m22120g(vx9Var2)) {
                            }
                            i10 |= i22;
                        } else {
                            vx9Var2 = vx9Var;
                        }
                        i10 |= i22;
                    } else {
                        vx9Var2 = vx9Var;
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                        i10 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        if (tj3Var2.m22120g(bc3Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i10 |= i14;
                    }
                    i15 = 0;
                    if ((i10 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (tj3Var2.m22099R(i10 & 1, z2)) {
                        tj3Var2.m22104W();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                e16Var4 = b16.f7762a;
                            } else {
                                e16Var4 = e16Var2;
                            }
                            if (i6 != 0) {
                                j6 = aa1.f412k;
                            } else {
                                j6 = j3;
                            }
                            if (i8 != 0) {
                                ks9Var2 = null;
                            }
                            long j10 = zx9.f72359c;
                            if (i11 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if ((i4 & 256) != 0) {
                                vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                                i10 &= -234881025;
                            } else {
                                vx9Var4 = vx9Var2;
                            }
                            if (i13 != 0) {
                                bc3Var3 = null;
                            } else {
                                bc3Var3 = bc3Var;
                            }
                            j7 = j10;
                            i19 = i18;
                            ks9Var4 = ks9Var2;
                            z4 = true;
                            i20 = 2;
                            j8 = j6;
                        } else {
                            if (i21 != 0) {
                                e16Var4 = b16.f7762a;
                            } else {
                                e16Var4 = e16Var2;
                            }
                            if (i6 != 0) {
                                j6 = aa1.f412k;
                            } else {
                                j6 = j3;
                            }
                            if (i8 != 0) {
                                ks9Var2 = null;
                            }
                            long j11 = zx9.f72359c;
                            if (i11 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if ((i4 & 256) != 0) {
                                vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                                i10 &= -234881025;
                            } else {
                                vx9Var4 = vx9Var2;
                            }
                            if (i13 != 0) {
                                bc3Var3 = null;
                            } else {
                                bc3Var3 = bc3Var;
                            }
                            j7 = j11;
                            i19 = i18;
                            ks9Var4 = ks9Var2;
                            z4 = true;
                            i20 = 2;
                            j8 = j6;
                        }
                        tj3Var2.m22140r();
                        objM22097O = tj3Var2.m22097O();
                        p84Var = we1.f66679a;
                        if (objM22097O == p84Var) {
                            objM22097O = AbstractC0278f.m1260j(vx9Var4);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        t66Var = (t66) objM22097O;
                        objM22097O2 = tj3Var2.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        t66Var2 = (t66) objM22097O2;
                        objM22097O3 = tj3Var2.m22097O();
                        if (objM22097O3 == p84Var) {
                            objM22097O3 = new C0023al(2, t66Var2);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        e16 e16VarM23656z2 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                        vx9 vx9Var6 = (vx9) t66Var.getValue();
                        objM22097O4 = tj3Var2.m22097O();
                        if (objM22097O4 == p84Var) {
                            objM22097O4 = new n20(t66Var, t66Var2, i15);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        int i24 = i10 >> 9;
                        tj3Var = tj3Var2;
                        lw9.m16554b(str, e16VarM23656z2, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var6, tj3Var, (i10 & 910) | (3670016 & i24), (i24 & 14) | 1572864 | (i24 & 112) | (i24 & 896) | (i24 & 7168) | (i24 & 57344), 33720);
                        e16Var3 = e16Var4;
                        vx9Var3 = vx9Var4;
                        j4 = j8;
                        bc3Var2 = bc3Var3;
                        ks9Var3 = ks9Var4;
                        j5 = j7;
                        i16 = i20;
                        z3 = z4;
                        i17 = i19;
                    } else {
                        tj3Var = tj3Var2;
                        tj3Var.m22102U();
                        z3 = z;
                        bc3Var2 = bc3Var;
                        e16Var3 = e16Var2;
                        j4 = j3;
                        ks9Var3 = ks9Var2;
                        vx9Var3 = vx9Var2;
                        j5 = j2;
                        i16 = i;
                        i17 = i2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: o20
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i3 | 1);
                                g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i5 |= 3072;
                ks9Var2 = ks9Var;
                i10 = 1794048 | i5;
                i11 = i4 & 128;
                if (i11 != 0) {
                    if ((12582912 & i3) == 0) {
                        if (tj3Var2.m22116e(i2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i10 |= i12;
                    }
                    if ((100663296 & i3) == 0) {
                        if ((i4 & 256) == 0) {
                            vx9Var2 = vx9Var;
                            if (tj3Var2.m22120g(vx9Var2)) {
                            }
                            i10 |= i22;
                        } else {
                            vx9Var2 = vx9Var;
                        }
                        i10 |= i22;
                    } else {
                        vx9Var2 = vx9Var;
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                        i10 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        if (tj3Var2.m22120g(bc3Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i10 |= i14;
                    }
                    i15 = 0;
                    if ((i10 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (tj3Var2.m22099R(i10 & 1, z2)) {
                        tj3Var2.m22104W();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                e16Var4 = b16.f7762a;
                            } else {
                                e16Var4 = e16Var2;
                            }
                            if (i6 != 0) {
                                j6 = aa1.f412k;
                            } else {
                                j6 = j3;
                            }
                            if (i8 != 0) {
                                ks9Var2 = null;
                            }
                            long j12 = zx9.f72359c;
                            if (i11 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if ((i4 & 256) != 0) {
                                vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                                i10 &= -234881025;
                            } else {
                                vx9Var4 = vx9Var2;
                            }
                            if (i13 != 0) {
                                bc3Var3 = null;
                            } else {
                                bc3Var3 = bc3Var;
                            }
                            j7 = j12;
                            i19 = i18;
                            ks9Var4 = ks9Var2;
                            z4 = true;
                            i20 = 2;
                            j8 = j6;
                        } else {
                            if (i21 != 0) {
                                e16Var4 = b16.f7762a;
                            } else {
                                e16Var4 = e16Var2;
                            }
                            if (i6 != 0) {
                                j6 = aa1.f412k;
                            } else {
                                j6 = j3;
                            }
                            if (i8 != 0) {
                                ks9Var2 = null;
                            }
                            long j13 = zx9.f72359c;
                            if (i11 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if ((i4 & 256) != 0) {
                                vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                                i10 &= -234881025;
                            } else {
                                vx9Var4 = vx9Var2;
                            }
                            if (i13 != 0) {
                                bc3Var3 = null;
                            } else {
                                bc3Var3 = bc3Var;
                            }
                            j7 = j13;
                            i19 = i18;
                            ks9Var4 = ks9Var2;
                            z4 = true;
                            i20 = 2;
                            j8 = j6;
                        }
                        tj3Var2.m22140r();
                        objM22097O = tj3Var2.m22097O();
                        p84Var = we1.f66679a;
                        if (objM22097O == p84Var) {
                            objM22097O = AbstractC0278f.m1260j(vx9Var4);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        t66Var = (t66) objM22097O;
                        objM22097O2 = tj3Var2.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        t66Var2 = (t66) objM22097O2;
                        objM22097O3 = tj3Var2.m22097O();
                        if (objM22097O3 == p84Var) {
                            objM22097O3 = new C0023al(2, t66Var2);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        e16 e16VarM23656z3 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                        vx9 vx9Var7 = (vx9) t66Var.getValue();
                        objM22097O4 = tj3Var2.m22097O();
                        if (objM22097O4 == p84Var) {
                            objM22097O4 = new n20(t66Var, t66Var2, i15);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        int i25 = i10 >> 9;
                        tj3Var = tj3Var2;
                        lw9.m16554b(str, e16VarM23656z3, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var7, tj3Var, (i10 & 910) | (3670016 & i25), (i25 & 14) | 1572864 | (i25 & 112) | (i25 & 896) | (i25 & 7168) | (i25 & 57344), 33720);
                        e16Var3 = e16Var4;
                        vx9Var3 = vx9Var4;
                        j4 = j8;
                        bc3Var2 = bc3Var3;
                        ks9Var3 = ks9Var4;
                        j5 = j7;
                        i16 = i20;
                        z3 = z4;
                        i17 = i19;
                    } else {
                        tj3Var = tj3Var2;
                        tj3Var.m22102U();
                        z3 = z;
                        bc3Var2 = bc3Var;
                        e16Var3 = e16Var2;
                        j4 = j3;
                        ks9Var3 = ks9Var2;
                        vx9Var3 = vx9Var2;
                        j5 = j2;
                        i16 = i;
                        i17 = i2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: o20
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i3 | 1);
                                g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i10 = 14376960 | i5;
                if ((100663296 & i3) == 0) {
                    if ((i4 & 256) == 0) {
                        vx9Var2 = vx9Var;
                        if (tj3Var2.m22120g(vx9Var2)) {
                        }
                        i10 |= i22;
                    } else {
                        vx9Var2 = vx9Var;
                    }
                    i10 |= i22;
                } else {
                    vx9Var2 = vx9Var;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i10 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    if (tj3Var2.m22120g(bc3Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i10 |= i14;
                }
                i15 = 0;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var2.m22099R(i10 & 1, z2)) {
                    tj3Var2.m22104W();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j14 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j14;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    } else {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j15 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j15;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    }
                    tj3Var2.m22140r();
                    objM22097O = tj3Var2.m22097O();
                    p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC0278f.m1260j(vx9Var4);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    t66Var = (t66) objM22097O;
                    objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    t66Var2 = (t66) objM22097O2;
                    objM22097O3 = tj3Var2.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new C0023al(2, t66Var2);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    e16 e16VarM23656z4 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                    vx9 vx9Var8 = (vx9) t66Var.getValue();
                    objM22097O4 = tj3Var2.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new n20(t66Var, t66Var2, i15);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    int i26 = i10 >> 9;
                    tj3Var = tj3Var2;
                    lw9.m16554b(str, e16VarM23656z4, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var8, tj3Var, (i10 & 910) | (3670016 & i26), (i26 & 14) | 1572864 | (i26 & 112) | (i26 & 896) | (i26 & 7168) | (i26 & 57344), 33720);
                    e16Var3 = e16Var4;
                    vx9Var3 = vx9Var4;
                    j4 = j8;
                    bc3Var2 = bc3Var3;
                    ks9Var3 = ks9Var4;
                    j5 = j7;
                    i16 = i20;
                    z3 = z4;
                    i17 = i19;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    z3 = z;
                    bc3Var2 = bc3Var;
                    e16Var3 = e16Var2;
                    j4 = j3;
                    ks9Var3 = ks9Var2;
                    vx9Var3 = vx9Var2;
                    j5 = j2;
                    i16 = i;
                    i17 = i2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: o20
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i3 | 1);
                            g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i5 |= 384;
            j3 = j;
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    ks9Var2 = ks9Var;
                    if (tj3Var2.m22120g(ks9Var2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = 1794048 | i5;
                i11 = i4 & 128;
                if (i11 != 0) {
                    if ((12582912 & i3) == 0) {
                        if (tj3Var2.m22116e(i2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i10 |= i12;
                    }
                    if ((100663296 & i3) == 0) {
                        if ((i4 & 256) == 0) {
                            vx9Var2 = vx9Var;
                            if (tj3Var2.m22120g(vx9Var2)) {
                            }
                            i10 |= i22;
                        } else {
                            vx9Var2 = vx9Var;
                        }
                        i10 |= i22;
                    } else {
                        vx9Var2 = vx9Var;
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                        i10 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        if (tj3Var2.m22120g(bc3Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i10 |= i14;
                    }
                    i15 = 0;
                    if ((i10 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (tj3Var2.m22099R(i10 & 1, z2)) {
                        tj3Var2.m22104W();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                e16Var4 = b16.f7762a;
                            } else {
                                e16Var4 = e16Var2;
                            }
                            if (i6 != 0) {
                                j6 = aa1.f412k;
                            } else {
                                j6 = j3;
                            }
                            if (i8 != 0) {
                                ks9Var2 = null;
                            }
                            long j16 = zx9.f72359c;
                            if (i11 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if ((i4 & 256) != 0) {
                                vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                                i10 &= -234881025;
                            } else {
                                vx9Var4 = vx9Var2;
                            }
                            if (i13 != 0) {
                                bc3Var3 = null;
                            } else {
                                bc3Var3 = bc3Var;
                            }
                            j7 = j16;
                            i19 = i18;
                            ks9Var4 = ks9Var2;
                            z4 = true;
                            i20 = 2;
                            j8 = j6;
                        } else {
                            if (i21 != 0) {
                                e16Var4 = b16.f7762a;
                            } else {
                                e16Var4 = e16Var2;
                            }
                            if (i6 != 0) {
                                j6 = aa1.f412k;
                            } else {
                                j6 = j3;
                            }
                            if (i8 != 0) {
                                ks9Var2 = null;
                            }
                            long j17 = zx9.f72359c;
                            if (i11 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if ((i4 & 256) != 0) {
                                vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                                i10 &= -234881025;
                            } else {
                                vx9Var4 = vx9Var2;
                            }
                            if (i13 != 0) {
                                bc3Var3 = null;
                            } else {
                                bc3Var3 = bc3Var;
                            }
                            j7 = j17;
                            i19 = i18;
                            ks9Var4 = ks9Var2;
                            z4 = true;
                            i20 = 2;
                            j8 = j6;
                        }
                        tj3Var2.m22140r();
                        objM22097O = tj3Var2.m22097O();
                        p84Var = we1.f66679a;
                        if (objM22097O == p84Var) {
                            objM22097O = AbstractC0278f.m1260j(vx9Var4);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        t66Var = (t66) objM22097O;
                        objM22097O2 = tj3Var2.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        t66Var2 = (t66) objM22097O2;
                        objM22097O3 = tj3Var2.m22097O();
                        if (objM22097O3 == p84Var) {
                            objM22097O3 = new C0023al(2, t66Var2);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        e16 e16VarM23656z5 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                        vx9 vx9Var9 = (vx9) t66Var.getValue();
                        objM22097O4 = tj3Var2.m22097O();
                        if (objM22097O4 == p84Var) {
                            objM22097O4 = new n20(t66Var, t66Var2, i15);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        int i27 = i10 >> 9;
                        tj3Var = tj3Var2;
                        lw9.m16554b(str, e16VarM23656z5, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var9, tj3Var, (i10 & 910) | (3670016 & i27), (i27 & 14) | 1572864 | (i27 & 112) | (i27 & 896) | (i27 & 7168) | (i27 & 57344), 33720);
                        e16Var3 = e16Var4;
                        vx9Var3 = vx9Var4;
                        j4 = j8;
                        bc3Var2 = bc3Var3;
                        ks9Var3 = ks9Var4;
                        j5 = j7;
                        i16 = i20;
                        z3 = z4;
                        i17 = i19;
                    } else {
                        tj3Var = tj3Var2;
                        tj3Var.m22102U();
                        z3 = z;
                        bc3Var2 = bc3Var;
                        e16Var3 = e16Var2;
                        j4 = j3;
                        ks9Var3 = ks9Var2;
                        vx9Var3 = vx9Var2;
                        j5 = j2;
                        i16 = i;
                        i17 = i2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: o20
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i3 | 1);
                                g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i10 = 14376960 | i5;
                if ((100663296 & i3) == 0) {
                    if ((i4 & 256) == 0) {
                        vx9Var2 = vx9Var;
                        if (tj3Var2.m22120g(vx9Var2)) {
                        }
                        i10 |= i22;
                    } else {
                        vx9Var2 = vx9Var;
                    }
                    i10 |= i22;
                } else {
                    vx9Var2 = vx9Var;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i10 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    if (tj3Var2.m22120g(bc3Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i10 |= i14;
                }
                i15 = 0;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var2.m22099R(i10 & 1, z2)) {
                    tj3Var2.m22104W();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j18 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j18;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    } else {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j19 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j19;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    }
                    tj3Var2.m22140r();
                    objM22097O = tj3Var2.m22097O();
                    p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC0278f.m1260j(vx9Var4);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    t66Var = (t66) objM22097O;
                    objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    t66Var2 = (t66) objM22097O2;
                    objM22097O3 = tj3Var2.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new C0023al(2, t66Var2);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    e16 e16VarM23656z6 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                    vx9 vx9Var10 = (vx9) t66Var.getValue();
                    objM22097O4 = tj3Var2.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new n20(t66Var, t66Var2, i15);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    int i28 = i10 >> 9;
                    tj3Var = tj3Var2;
                    lw9.m16554b(str, e16VarM23656z6, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var10, tj3Var, (i10 & 910) | (3670016 & i28), (i28 & 14) | 1572864 | (i28 & 112) | (i28 & 896) | (i28 & 7168) | (i28 & 57344), 33720);
                    e16Var3 = e16Var4;
                    vx9Var3 = vx9Var4;
                    j4 = j8;
                    bc3Var2 = bc3Var3;
                    ks9Var3 = ks9Var4;
                    j5 = j7;
                    i16 = i20;
                    z3 = z4;
                    i17 = i19;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    z3 = z;
                    bc3Var2 = bc3Var;
                    e16Var3 = e16Var2;
                    j4 = j3;
                    ks9Var3 = ks9Var2;
                    vx9Var3 = vx9Var2;
                    j5 = j2;
                    i16 = i;
                    i17 = i2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: o20
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i3 | 1);
                            g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i5 |= 3072;
            ks9Var2 = ks9Var;
            i10 = 1794048 | i5;
            i11 = i4 & 128;
            if (i11 != 0) {
                if ((12582912 & i3) == 0) {
                    if (tj3Var2.m22116e(i2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                if ((100663296 & i3) == 0) {
                    if ((i4 & 256) == 0) {
                        vx9Var2 = vx9Var;
                        if (tj3Var2.m22120g(vx9Var2)) {
                        }
                        i10 |= i22;
                    } else {
                        vx9Var2 = vx9Var;
                    }
                    i10 |= i22;
                } else {
                    vx9Var2 = vx9Var;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i10 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    if (tj3Var2.m22120g(bc3Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i10 |= i14;
                }
                i15 = 0;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var2.m22099R(i10 & 1, z2)) {
                    tj3Var2.m22104W();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j110 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j110;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    } else {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j111 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j111;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    }
                    tj3Var2.m22140r();
                    objM22097O = tj3Var2.m22097O();
                    p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC0278f.m1260j(vx9Var4);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    t66Var = (t66) objM22097O;
                    objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    t66Var2 = (t66) objM22097O2;
                    objM22097O3 = tj3Var2.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new C0023al(2, t66Var2);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    e16 e16VarM23656z7 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                    vx9 vx9Var11 = (vx9) t66Var.getValue();
                    objM22097O4 = tj3Var2.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new n20(t66Var, t66Var2, i15);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    int i29 = i10 >> 9;
                    tj3Var = tj3Var2;
                    lw9.m16554b(str, e16VarM23656z7, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var11, tj3Var, (i10 & 910) | (3670016 & i29), (i29 & 14) | 1572864 | (i29 & 112) | (i29 & 896) | (i29 & 7168) | (i29 & 57344), 33720);
                    e16Var3 = e16Var4;
                    vx9Var3 = vx9Var4;
                    j4 = j8;
                    bc3Var2 = bc3Var3;
                    ks9Var3 = ks9Var4;
                    j5 = j7;
                    i16 = i20;
                    z3 = z4;
                    i17 = i19;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    z3 = z;
                    bc3Var2 = bc3Var;
                    e16Var3 = e16Var2;
                    j4 = j3;
                    ks9Var3 = ks9Var2;
                    vx9Var3 = vx9Var2;
                    j5 = j2;
                    i16 = i;
                    i17 = i2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: o20
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i3 | 1);
                            g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i10 = 14376960 | i5;
            if ((100663296 & i3) == 0) {
                if ((i4 & 256) == 0) {
                    vx9Var2 = vx9Var;
                    if (tj3Var2.m22120g(vx9Var2)) {
                    }
                    i10 |= i22;
                } else {
                    vx9Var2 = vx9Var;
                }
                i10 |= i22;
            } else {
                vx9Var2 = vx9Var;
            }
            i13 = i4 & 512;
            if (i13 != 0) {
                i10 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                if (tj3Var2.m22120g(bc3Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i10 |= i14;
            }
            i15 = 0;
            if ((i10 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var2.m22099R(i10 & 1, z2)) {
                tj3Var2.m22104W();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i6 != 0) {
                        j6 = aa1.f412k;
                    } else {
                        j6 = j3;
                    }
                    if (i8 != 0) {
                        ks9Var2 = null;
                    }
                    long j112 = zx9.f72359c;
                    if (i11 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if ((i4 & 256) != 0) {
                        vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                        i10 &= -234881025;
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i13 != 0) {
                        bc3Var3 = null;
                    } else {
                        bc3Var3 = bc3Var;
                    }
                    j7 = j112;
                    i19 = i18;
                    ks9Var4 = ks9Var2;
                    z4 = true;
                    i20 = 2;
                    j8 = j6;
                } else {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i6 != 0) {
                        j6 = aa1.f412k;
                    } else {
                        j6 = j3;
                    }
                    if (i8 != 0) {
                        ks9Var2 = null;
                    }
                    long j113 = zx9.f72359c;
                    if (i11 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if ((i4 & 256) != 0) {
                        vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                        i10 &= -234881025;
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i13 != 0) {
                        bc3Var3 = null;
                    } else {
                        bc3Var3 = bc3Var;
                    }
                    j7 = j113;
                    i19 = i18;
                    ks9Var4 = ks9Var2;
                    z4 = true;
                    i20 = 2;
                    j8 = j6;
                }
                tj3Var2.m22140r();
                objM22097O = tj3Var2.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j(vx9Var4);
                    tj3Var2.m22131l0(objM22097O);
                }
                t66Var = (t66) objM22097O;
                objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var2.m22131l0(objM22097O2);
                }
                t66Var2 = (t66) objM22097O2;
                objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new C0023al(2, t66Var2);
                    tj3Var2.m22131l0(objM22097O3);
                }
                e16 e16VarM23656z8 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                vx9 vx9Var12 = (vx9) t66Var.getValue();
                objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new n20(t66Var, t66Var2, i15);
                    tj3Var2.m22131l0(objM22097O4);
                }
                int i210 = i10 >> 9;
                tj3Var = tj3Var2;
                lw9.m16554b(str, e16VarM23656z8, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var12, tj3Var, (i10 & 910) | (3670016 & i210), (i210 & 14) | 1572864 | (i210 & 112) | (i210 & 896) | (i210 & 7168) | (i210 & 57344), 33720);
                e16Var3 = e16Var4;
                vx9Var3 = vx9Var4;
                j4 = j8;
                bc3Var2 = bc3Var3;
                ks9Var3 = ks9Var4;
                j5 = j7;
                i16 = i20;
                z3 = z4;
                i17 = i19;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                z3 = z;
                bc3Var2 = bc3Var;
                e16Var3 = e16Var2;
                j4 = j3;
                ks9Var3 = ks9Var2;
                vx9Var3 = vx9Var2;
                j5 = j2;
                i16 = i;
                i17 = i2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: o20
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i3 | 1);
                        g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 |= 48;
        e16Var2 = e16Var;
        i6 = i4 & 4;
        if (i6 != 0) {
            if ((i3 & 384) == 0) {
                j3 = j;
                if (tj3Var2.m22118f(j3)) {
                    i7 = 256;
                } else {
                    i7 = 128;
                }
                i5 |= i7;
            }
            i8 = i4 & 8;
            if (i8 != 0) {
                if ((i3 & 3072) == 0) {
                    ks9Var2 = ks9Var;
                    if (tj3Var2.m22120g(ks9Var2)) {
                        i9 = 2048;
                    } else {
                        i9 = 1024;
                    }
                    i5 |= i9;
                }
                i10 = 1794048 | i5;
                i11 = i4 & 128;
                if (i11 != 0) {
                    if ((12582912 & i3) == 0) {
                        if (tj3Var2.m22116e(i2)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i10 |= i12;
                    }
                    if ((100663296 & i3) == 0) {
                        if ((i4 & 256) == 0) {
                            vx9Var2 = vx9Var;
                            if (tj3Var2.m22120g(vx9Var2)) {
                            }
                            i10 |= i22;
                        } else {
                            vx9Var2 = vx9Var;
                        }
                        i10 |= i22;
                    } else {
                        vx9Var2 = vx9Var;
                    }
                    i13 = i4 & 512;
                    if (i13 != 0) {
                        i10 |= 805306368;
                    } else if ((i3 & 805306368) == 0) {
                        if (tj3Var2.m22120g(bc3Var)) {
                            i14 = 536870912;
                        } else {
                            i14 = 268435456;
                        }
                        i10 |= i14;
                    }
                    i15 = 0;
                    if ((i10 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (tj3Var2.m22099R(i10 & 1, z2)) {
                        tj3Var2.m22104W();
                        if ((i3 & 1) != 0) {
                            if (i21 != 0) {
                                e16Var4 = b16.f7762a;
                            } else {
                                e16Var4 = e16Var2;
                            }
                            if (i6 != 0) {
                                j6 = aa1.f412k;
                            } else {
                                j6 = j3;
                            }
                            if (i8 != 0) {
                                ks9Var2 = null;
                            }
                            long j114 = zx9.f72359c;
                            if (i11 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if ((i4 & 256) != 0) {
                                vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                                i10 &= -234881025;
                            } else {
                                vx9Var4 = vx9Var2;
                            }
                            if (i13 != 0) {
                                bc3Var3 = null;
                            } else {
                                bc3Var3 = bc3Var;
                            }
                            j7 = j114;
                            i19 = i18;
                            ks9Var4 = ks9Var2;
                            z4 = true;
                            i20 = 2;
                            j8 = j6;
                        } else {
                            if (i21 != 0) {
                                e16Var4 = b16.f7762a;
                            } else {
                                e16Var4 = e16Var2;
                            }
                            if (i6 != 0) {
                                j6 = aa1.f412k;
                            } else {
                                j6 = j3;
                            }
                            if (i8 != 0) {
                                ks9Var2 = null;
                            }
                            long j115 = zx9.f72359c;
                            if (i11 != 0) {
                                i18 = Integer.MAX_VALUE;
                            } else {
                                i18 = i2;
                            }
                            if ((i4 & 256) != 0) {
                                vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                                i10 &= -234881025;
                            } else {
                                vx9Var4 = vx9Var2;
                            }
                            if (i13 != 0) {
                                bc3Var3 = null;
                            } else {
                                bc3Var3 = bc3Var;
                            }
                            j7 = j115;
                            i19 = i18;
                            ks9Var4 = ks9Var2;
                            z4 = true;
                            i20 = 2;
                            j8 = j6;
                        }
                        tj3Var2.m22140r();
                        objM22097O = tj3Var2.m22097O();
                        p84Var = we1.f66679a;
                        if (objM22097O == p84Var) {
                            objM22097O = AbstractC0278f.m1260j(vx9Var4);
                            tj3Var2.m22131l0(objM22097O);
                        }
                        t66Var = (t66) objM22097O;
                        objM22097O2 = tj3Var2.m22097O();
                        if (objM22097O2 == p84Var) {
                            objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                            tj3Var2.m22131l0(objM22097O2);
                        }
                        t66Var2 = (t66) objM22097O2;
                        objM22097O3 = tj3Var2.m22097O();
                        if (objM22097O3 == p84Var) {
                            objM22097O3 = new C0023al(2, t66Var2);
                            tj3Var2.m22131l0(objM22097O3);
                        }
                        e16 e16VarM23656z9 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                        vx9 vx9Var13 = (vx9) t66Var.getValue();
                        objM22097O4 = tj3Var2.m22097O();
                        if (objM22097O4 == p84Var) {
                            objM22097O4 = new n20(t66Var, t66Var2, i15);
                            tj3Var2.m22131l0(objM22097O4);
                        }
                        int i211 = i10 >> 9;
                        tj3Var = tj3Var2;
                        lw9.m16554b(str, e16VarM23656z9, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var13, tj3Var, (i10 & 910) | (3670016 & i211), (i211 & 14) | 1572864 | (i211 & 112) | (i211 & 896) | (i211 & 7168) | (i211 & 57344), 33720);
                        e16Var3 = e16Var4;
                        vx9Var3 = vx9Var4;
                        j4 = j8;
                        bc3Var2 = bc3Var3;
                        ks9Var3 = ks9Var4;
                        j5 = j7;
                        i16 = i20;
                        z3 = z4;
                        i17 = i19;
                    } else {
                        tj3Var = tj3Var2;
                        tj3Var.m22102U();
                        z3 = z;
                        bc3Var2 = bc3Var;
                        e16Var3 = e16Var2;
                        j4 = j3;
                        ks9Var3 = ks9Var2;
                        vx9Var3 = vx9Var2;
                        j5 = j2;
                        i16 = i;
                        i17 = i2;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new zi3() { // from class: o20
                            @Override // p000.zi3
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                int iM19383z = pk9.m19383z(i3 | 1);
                                g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                                return xfa.f68157a;
                            }
                        };
                    }
                }
                i10 = 14376960 | i5;
                if ((100663296 & i3) == 0) {
                    if ((i4 & 256) == 0) {
                        vx9Var2 = vx9Var;
                        if (tj3Var2.m22120g(vx9Var2)) {
                        }
                        i10 |= i22;
                    } else {
                        vx9Var2 = vx9Var;
                    }
                    i10 |= i22;
                } else {
                    vx9Var2 = vx9Var;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i10 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    if (tj3Var2.m22120g(bc3Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i10 |= i14;
                }
                i15 = 0;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var2.m22099R(i10 & 1, z2)) {
                    tj3Var2.m22104W();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j116 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j116;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    } else {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j117 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j117;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    }
                    tj3Var2.m22140r();
                    objM22097O = tj3Var2.m22097O();
                    p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC0278f.m1260j(vx9Var4);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    t66Var = (t66) objM22097O;
                    objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    t66Var2 = (t66) objM22097O2;
                    objM22097O3 = tj3Var2.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new C0023al(2, t66Var2);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    e16 e16VarM23656z10 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                    vx9 vx9Var14 = (vx9) t66Var.getValue();
                    objM22097O4 = tj3Var2.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new n20(t66Var, t66Var2, i15);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    int i212 = i10 >> 9;
                    tj3Var = tj3Var2;
                    lw9.m16554b(str, e16VarM23656z10, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var14, tj3Var, (i10 & 910) | (3670016 & i212), (i212 & 14) | 1572864 | (i212 & 112) | (i212 & 896) | (i212 & 7168) | (i212 & 57344), 33720);
                    e16Var3 = e16Var4;
                    vx9Var3 = vx9Var4;
                    j4 = j8;
                    bc3Var2 = bc3Var3;
                    ks9Var3 = ks9Var4;
                    j5 = j7;
                    i16 = i20;
                    z3 = z4;
                    i17 = i19;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    z3 = z;
                    bc3Var2 = bc3Var;
                    e16Var3 = e16Var2;
                    j4 = j3;
                    ks9Var3 = ks9Var2;
                    vx9Var3 = vx9Var2;
                    j5 = j2;
                    i16 = i;
                    i17 = i2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: o20
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i3 | 1);
                            g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i5 |= 3072;
            ks9Var2 = ks9Var;
            i10 = 1794048 | i5;
            i11 = i4 & 128;
            if (i11 != 0) {
                if ((12582912 & i3) == 0) {
                    if (tj3Var2.m22116e(i2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                if ((100663296 & i3) == 0) {
                    if ((i4 & 256) == 0) {
                        vx9Var2 = vx9Var;
                        if (tj3Var2.m22120g(vx9Var2)) {
                        }
                        i10 |= i22;
                    } else {
                        vx9Var2 = vx9Var;
                    }
                    i10 |= i22;
                } else {
                    vx9Var2 = vx9Var;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i10 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    if (tj3Var2.m22120g(bc3Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i10 |= i14;
                }
                i15 = 0;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var2.m22099R(i10 & 1, z2)) {
                    tj3Var2.m22104W();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j118 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j118;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    } else {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j119 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j119;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    }
                    tj3Var2.m22140r();
                    objM22097O = tj3Var2.m22097O();
                    p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC0278f.m1260j(vx9Var4);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    t66Var = (t66) objM22097O;
                    objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    t66Var2 = (t66) objM22097O2;
                    objM22097O3 = tj3Var2.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new C0023al(2, t66Var2);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    e16 e16VarM23656z11 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                    vx9 vx9Var15 = (vx9) t66Var.getValue();
                    objM22097O4 = tj3Var2.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new n20(t66Var, t66Var2, i15);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    int i213 = i10 >> 9;
                    tj3Var = tj3Var2;
                    lw9.m16554b(str, e16VarM23656z11, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var15, tj3Var, (i10 & 910) | (3670016 & i213), (i213 & 14) | 1572864 | (i213 & 112) | (i213 & 896) | (i213 & 7168) | (i213 & 57344), 33720);
                    e16Var3 = e16Var4;
                    vx9Var3 = vx9Var4;
                    j4 = j8;
                    bc3Var2 = bc3Var3;
                    ks9Var3 = ks9Var4;
                    j5 = j7;
                    i16 = i20;
                    z3 = z4;
                    i17 = i19;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    z3 = z;
                    bc3Var2 = bc3Var;
                    e16Var3 = e16Var2;
                    j4 = j3;
                    ks9Var3 = ks9Var2;
                    vx9Var3 = vx9Var2;
                    j5 = j2;
                    i16 = i;
                    i17 = i2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: o20
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i3 | 1);
                            g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i10 = 14376960 | i5;
            if ((100663296 & i3) == 0) {
                if ((i4 & 256) == 0) {
                    vx9Var2 = vx9Var;
                    if (tj3Var2.m22120g(vx9Var2)) {
                    }
                    i10 |= i22;
                } else {
                    vx9Var2 = vx9Var;
                }
                i10 |= i22;
            } else {
                vx9Var2 = vx9Var;
            }
            i13 = i4 & 512;
            if (i13 != 0) {
                i10 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                if (tj3Var2.m22120g(bc3Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i10 |= i14;
            }
            i15 = 0;
            if ((i10 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var2.m22099R(i10 & 1, z2)) {
                tj3Var2.m22104W();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i6 != 0) {
                        j6 = aa1.f412k;
                    } else {
                        j6 = j3;
                    }
                    if (i8 != 0) {
                        ks9Var2 = null;
                    }
                    long j1110 = zx9.f72359c;
                    if (i11 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if ((i4 & 256) != 0) {
                        vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                        i10 &= -234881025;
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i13 != 0) {
                        bc3Var3 = null;
                    } else {
                        bc3Var3 = bc3Var;
                    }
                    j7 = j1110;
                    i19 = i18;
                    ks9Var4 = ks9Var2;
                    z4 = true;
                    i20 = 2;
                    j8 = j6;
                } else {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i6 != 0) {
                        j6 = aa1.f412k;
                    } else {
                        j6 = j3;
                    }
                    if (i8 != 0) {
                        ks9Var2 = null;
                    }
                    long j1111 = zx9.f72359c;
                    if (i11 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if ((i4 & 256) != 0) {
                        vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                        i10 &= -234881025;
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i13 != 0) {
                        bc3Var3 = null;
                    } else {
                        bc3Var3 = bc3Var;
                    }
                    j7 = j1111;
                    i19 = i18;
                    ks9Var4 = ks9Var2;
                    z4 = true;
                    i20 = 2;
                    j8 = j6;
                }
                tj3Var2.m22140r();
                objM22097O = tj3Var2.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j(vx9Var4);
                    tj3Var2.m22131l0(objM22097O);
                }
                t66Var = (t66) objM22097O;
                objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var2.m22131l0(objM22097O2);
                }
                t66Var2 = (t66) objM22097O2;
                objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new C0023al(2, t66Var2);
                    tj3Var2.m22131l0(objM22097O3);
                }
                e16 e16VarM23656z12 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                vx9 vx9Var16 = (vx9) t66Var.getValue();
                objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new n20(t66Var, t66Var2, i15);
                    tj3Var2.m22131l0(objM22097O4);
                }
                int i214 = i10 >> 9;
                tj3Var = tj3Var2;
                lw9.m16554b(str, e16VarM23656z12, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var16, tj3Var, (i10 & 910) | (3670016 & i214), (i214 & 14) | 1572864 | (i214 & 112) | (i214 & 896) | (i214 & 7168) | (i214 & 57344), 33720);
                e16Var3 = e16Var4;
                vx9Var3 = vx9Var4;
                j4 = j8;
                bc3Var2 = bc3Var3;
                ks9Var3 = ks9Var4;
                j5 = j7;
                i16 = i20;
                z3 = z4;
                i17 = i19;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                z3 = z;
                bc3Var2 = bc3Var;
                e16Var3 = e16Var2;
                j4 = j3;
                ks9Var3 = ks9Var2;
                vx9Var3 = vx9Var2;
                j5 = j2;
                i16 = i;
                i17 = i2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: o20
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i3 | 1);
                        g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 |= 384;
        j3 = j;
        i8 = i4 & 8;
        if (i8 != 0) {
            if ((i3 & 3072) == 0) {
                ks9Var2 = ks9Var;
                if (tj3Var2.m22120g(ks9Var2)) {
                    i9 = 2048;
                } else {
                    i9 = 1024;
                }
                i5 |= i9;
            }
            i10 = 1794048 | i5;
            i11 = i4 & 128;
            if (i11 != 0) {
                if ((12582912 & i3) == 0) {
                    if (tj3Var2.m22116e(i2)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i10 |= i12;
                }
                if ((100663296 & i3) == 0) {
                    if ((i4 & 256) == 0) {
                        vx9Var2 = vx9Var;
                        if (tj3Var2.m22120g(vx9Var2)) {
                        }
                        i10 |= i22;
                    } else {
                        vx9Var2 = vx9Var;
                    }
                    i10 |= i22;
                } else {
                    vx9Var2 = vx9Var;
                }
                i13 = i4 & 512;
                if (i13 != 0) {
                    i10 |= 805306368;
                } else if ((i3 & 805306368) == 0) {
                    if (tj3Var2.m22120g(bc3Var)) {
                        i14 = 536870912;
                    } else {
                        i14 = 268435456;
                    }
                    i10 |= i14;
                }
                i15 = 0;
                if ((i10 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (tj3Var2.m22099R(i10 & 1, z2)) {
                    tj3Var2.m22104W();
                    if ((i3 & 1) != 0) {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j1112 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j1112;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    } else {
                        if (i21 != 0) {
                            e16Var4 = b16.f7762a;
                        } else {
                            e16Var4 = e16Var2;
                        }
                        if (i6 != 0) {
                            j6 = aa1.f412k;
                        } else {
                            j6 = j3;
                        }
                        if (i8 != 0) {
                            ks9Var2 = null;
                        }
                        long j1113 = zx9.f72359c;
                        if (i11 != 0) {
                            i18 = Integer.MAX_VALUE;
                        } else {
                            i18 = i2;
                        }
                        if ((i4 & 256) != 0) {
                            vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                            i10 &= -234881025;
                        } else {
                            vx9Var4 = vx9Var2;
                        }
                        if (i13 != 0) {
                            bc3Var3 = null;
                        } else {
                            bc3Var3 = bc3Var;
                        }
                        j7 = j1113;
                        i19 = i18;
                        ks9Var4 = ks9Var2;
                        z4 = true;
                        i20 = 2;
                        j8 = j6;
                    }
                    tj3Var2.m22140r();
                    objM22097O = tj3Var2.m22097O();
                    p84Var = we1.f66679a;
                    if (objM22097O == p84Var) {
                        objM22097O = AbstractC0278f.m1260j(vx9Var4);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    t66Var = (t66) objM22097O;
                    objM22097O2 = tj3Var2.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                        tj3Var2.m22131l0(objM22097O2);
                    }
                    t66Var2 = (t66) objM22097O2;
                    objM22097O3 = tj3Var2.m22097O();
                    if (objM22097O3 == p84Var) {
                        objM22097O3 = new C0023al(2, t66Var2);
                        tj3Var2.m22131l0(objM22097O3);
                    }
                    e16 e16VarM23656z13 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                    vx9 vx9Var17 = (vx9) t66Var.getValue();
                    objM22097O4 = tj3Var2.m22097O();
                    if (objM22097O4 == p84Var) {
                        objM22097O4 = new n20(t66Var, t66Var2, i15);
                        tj3Var2.m22131l0(objM22097O4);
                    }
                    int i215 = i10 >> 9;
                    tj3Var = tj3Var2;
                    lw9.m16554b(str, e16VarM23656z13, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var17, tj3Var, (i10 & 910) | (3670016 & i215), (i215 & 14) | 1572864 | (i215 & 112) | (i215 & 896) | (i215 & 7168) | (i215 & 57344), 33720);
                    e16Var3 = e16Var4;
                    vx9Var3 = vx9Var4;
                    j4 = j8;
                    bc3Var2 = bc3Var3;
                    ks9Var3 = ks9Var4;
                    j5 = j7;
                    i16 = i20;
                    z3 = z4;
                    i17 = i19;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    z3 = z;
                    bc3Var2 = bc3Var;
                    e16Var3 = e16Var2;
                    j4 = j3;
                    ks9Var3 = ks9Var2;
                    vx9Var3 = vx9Var2;
                    j5 = j2;
                    i16 = i;
                    i17 = i2;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new zi3() { // from class: o20
                        @Override // p000.zi3
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iM19383z = pk9.m19383z(i3 | 1);
                            g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                            return xfa.f68157a;
                        }
                    };
                }
            }
            i10 = 14376960 | i5;
            if ((100663296 & i3) == 0) {
                if ((i4 & 256) == 0) {
                    vx9Var2 = vx9Var;
                    if (tj3Var2.m22120g(vx9Var2)) {
                    }
                    i10 |= i22;
                } else {
                    vx9Var2 = vx9Var;
                }
                i10 |= i22;
            } else {
                vx9Var2 = vx9Var;
            }
            i13 = i4 & 512;
            if (i13 != 0) {
                i10 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                if (tj3Var2.m22120g(bc3Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i10 |= i14;
            }
            i15 = 0;
            if ((i10 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var2.m22099R(i10 & 1, z2)) {
                tj3Var2.m22104W();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i6 != 0) {
                        j6 = aa1.f412k;
                    } else {
                        j6 = j3;
                    }
                    if (i8 != 0) {
                        ks9Var2 = null;
                    }
                    long j1114 = zx9.f72359c;
                    if (i11 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if ((i4 & 256) != 0) {
                        vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                        i10 &= -234881025;
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i13 != 0) {
                        bc3Var3 = null;
                    } else {
                        bc3Var3 = bc3Var;
                    }
                    j7 = j1114;
                    i19 = i18;
                    ks9Var4 = ks9Var2;
                    z4 = true;
                    i20 = 2;
                    j8 = j6;
                } else {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i6 != 0) {
                        j6 = aa1.f412k;
                    } else {
                        j6 = j3;
                    }
                    if (i8 != 0) {
                        ks9Var2 = null;
                    }
                    long j1115 = zx9.f72359c;
                    if (i11 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if ((i4 & 256) != 0) {
                        vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                        i10 &= -234881025;
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i13 != 0) {
                        bc3Var3 = null;
                    } else {
                        bc3Var3 = bc3Var;
                    }
                    j7 = j1115;
                    i19 = i18;
                    ks9Var4 = ks9Var2;
                    z4 = true;
                    i20 = 2;
                    j8 = j6;
                }
                tj3Var2.m22140r();
                objM22097O = tj3Var2.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j(vx9Var4);
                    tj3Var2.m22131l0(objM22097O);
                }
                t66Var = (t66) objM22097O;
                objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var2.m22131l0(objM22097O2);
                }
                t66Var2 = (t66) objM22097O2;
                objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new C0023al(2, t66Var2);
                    tj3Var2.m22131l0(objM22097O3);
                }
                e16 e16VarM23656z14 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                vx9 vx9Var18 = (vx9) t66Var.getValue();
                objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new n20(t66Var, t66Var2, i15);
                    tj3Var2.m22131l0(objM22097O4);
                }
                int i216 = i10 >> 9;
                tj3Var = tj3Var2;
                lw9.m16554b(str, e16VarM23656z14, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var18, tj3Var, (i10 & 910) | (3670016 & i216), (i216 & 14) | 1572864 | (i216 & 112) | (i216 & 896) | (i216 & 7168) | (i216 & 57344), 33720);
                e16Var3 = e16Var4;
                vx9Var3 = vx9Var4;
                j4 = j8;
                bc3Var2 = bc3Var3;
                ks9Var3 = ks9Var4;
                j5 = j7;
                i16 = i20;
                z3 = z4;
                i17 = i19;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                z3 = z;
                bc3Var2 = bc3Var;
                e16Var3 = e16Var2;
                j4 = j3;
                ks9Var3 = ks9Var2;
                vx9Var3 = vx9Var2;
                j5 = j2;
                i16 = i;
                i17 = i2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: o20
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i3 | 1);
                        g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i5 |= 3072;
        ks9Var2 = ks9Var;
        i10 = 1794048 | i5;
        i11 = i4 & 128;
        if (i11 != 0) {
            if ((12582912 & i3) == 0) {
                if (tj3Var2.m22116e(i2)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i10 |= i12;
            }
            if ((100663296 & i3) == 0) {
                if ((i4 & 256) == 0) {
                    vx9Var2 = vx9Var;
                    if (tj3Var2.m22120g(vx9Var2)) {
                    }
                    i10 |= i22;
                } else {
                    vx9Var2 = vx9Var;
                }
                i10 |= i22;
            } else {
                vx9Var2 = vx9Var;
            }
            i13 = i4 & 512;
            if (i13 != 0) {
                i10 |= 805306368;
            } else if ((i3 & 805306368) == 0) {
                if (tj3Var2.m22120g(bc3Var)) {
                    i14 = 536870912;
                } else {
                    i14 = 268435456;
                }
                i10 |= i14;
            }
            i15 = 0;
            if ((i10 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (tj3Var2.m22099R(i10 & 1, z2)) {
                tj3Var2.m22104W();
                if ((i3 & 1) != 0) {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i6 != 0) {
                        j6 = aa1.f412k;
                    } else {
                        j6 = j3;
                    }
                    if (i8 != 0) {
                        ks9Var2 = null;
                    }
                    long j1116 = zx9.f72359c;
                    if (i11 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if ((i4 & 256) != 0) {
                        vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                        i10 &= -234881025;
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i13 != 0) {
                        bc3Var3 = null;
                    } else {
                        bc3Var3 = bc3Var;
                    }
                    j7 = j1116;
                    i19 = i18;
                    ks9Var4 = ks9Var2;
                    z4 = true;
                    i20 = 2;
                    j8 = j6;
                } else {
                    if (i21 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if (i6 != 0) {
                        j6 = aa1.f412k;
                    } else {
                        j6 = j3;
                    }
                    if (i8 != 0) {
                        ks9Var2 = null;
                    }
                    long j1117 = zx9.f72359c;
                    if (i11 != 0) {
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i2;
                    }
                    if ((i4 & 256) != 0) {
                        vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                        i10 &= -234881025;
                    } else {
                        vx9Var4 = vx9Var2;
                    }
                    if (i13 != 0) {
                        bc3Var3 = null;
                    } else {
                        bc3Var3 = bc3Var;
                    }
                    j7 = j1117;
                    i19 = i18;
                    ks9Var4 = ks9Var2;
                    z4 = true;
                    i20 = 2;
                    j8 = j6;
                }
                tj3Var2.m22140r();
                objM22097O = tj3Var2.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = AbstractC0278f.m1260j(vx9Var4);
                    tj3Var2.m22131l0(objM22097O);
                }
                t66Var = (t66) objM22097O;
                objM22097O2 = tj3Var2.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                    tj3Var2.m22131l0(objM22097O2);
                }
                t66Var2 = (t66) objM22097O2;
                objM22097O3 = tj3Var2.m22097O();
                if (objM22097O3 == p84Var) {
                    objM22097O3 = new C0023al(2, t66Var2);
                    tj3Var2.m22131l0(objM22097O3);
                }
                e16 e16VarM23656z15 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
                vx9 vx9Var19 = (vx9) t66Var.getValue();
                objM22097O4 = tj3Var2.m22097O();
                if (objM22097O4 == p84Var) {
                    objM22097O4 = new n20(t66Var, t66Var2, i15);
                    tj3Var2.m22131l0(objM22097O4);
                }
                int i217 = i10 >> 9;
                tj3Var = tj3Var2;
                lw9.m16554b(str, e16VarM23656z15, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var19, tj3Var, (i10 & 910) | (3670016 & i217), (i217 & 14) | 1572864 | (i217 & 112) | (i217 & 896) | (i217 & 7168) | (i217 & 57344), 33720);
                e16Var3 = e16Var4;
                vx9Var3 = vx9Var4;
                j4 = j8;
                bc3Var2 = bc3Var3;
                ks9Var3 = ks9Var4;
                j5 = j7;
                i16 = i20;
                z3 = z4;
                i17 = i19;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                z3 = z;
                bc3Var2 = bc3Var;
                e16Var3 = e16Var2;
                j4 = j3;
                ks9Var3 = ks9Var2;
                vx9Var3 = vx9Var2;
                j5 = j2;
                i16 = i;
                i17 = i2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: o20
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i3 | 1);
                        g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i10 = 14376960 | i5;
        if ((100663296 & i3) == 0) {
            if ((i4 & 256) == 0) {
                vx9Var2 = vx9Var;
                if (tj3Var2.m22120g(vx9Var2)) {
                }
                i10 |= i22;
            } else {
                vx9Var2 = vx9Var;
            }
            i10 |= i22;
        } else {
            vx9Var2 = vx9Var;
        }
        i13 = i4 & 512;
        if (i13 != 0) {
            i10 |= 805306368;
        } else if ((i3 & 805306368) == 0) {
            if (tj3Var2.m22120g(bc3Var)) {
                i14 = 536870912;
            } else {
                i14 = 268435456;
            }
            i10 |= i14;
        }
        i15 = 0;
        if ((i10 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (tj3Var2.m22099R(i10 & 1, z2)) {
            tj3Var2.m22104W();
            if ((i3 & 1) != 0) {
                if (i21 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if (i6 != 0) {
                    j6 = aa1.f412k;
                } else {
                    j6 = j3;
                }
                if (i8 != 0) {
                    ks9Var2 = null;
                }
                long j1118 = zx9.f72359c;
                if (i11 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if ((i4 & 256) != 0) {
                    vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                    i10 &= -234881025;
                } else {
                    vx9Var4 = vx9Var2;
                }
                if (i13 != 0) {
                    bc3Var3 = null;
                } else {
                    bc3Var3 = bc3Var;
                }
                j7 = j1118;
                i19 = i18;
                ks9Var4 = ks9Var2;
                z4 = true;
                i20 = 2;
                j8 = j6;
            } else {
                if (i21 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if (i6 != 0) {
                    j6 = aa1.f412k;
                } else {
                    j6 = j3;
                }
                if (i8 != 0) {
                    ks9Var2 = null;
                }
                long j1119 = zx9.f72359c;
                if (i11 != 0) {
                    i18 = Integer.MAX_VALUE;
                } else {
                    i18 = i2;
                }
                if ((i4 & 256) != 0) {
                    vx9Var4 = (vx9) tj3Var2.m22128k(lw9.f50220a);
                    i10 &= -234881025;
                } else {
                    vx9Var4 = vx9Var2;
                }
                if (i13 != 0) {
                    bc3Var3 = null;
                } else {
                    bc3Var3 = bc3Var;
                }
                j7 = j1119;
                i19 = i18;
                ks9Var4 = ks9Var2;
                z4 = true;
                i20 = 2;
                j8 = j6;
            }
            tj3Var2.m22140r();
            objM22097O = tj3Var2.m22097O();
            p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = AbstractC0278f.m1260j(vx9Var4);
                tj3Var2.m22131l0(objM22097O);
            }
            t66Var = (t66) objM22097O;
            objM22097O2 = tj3Var2.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC0278f.m1260j(Boolean.FALSE);
                tj3Var2.m22131l0(objM22097O2);
            }
            t66Var2 = (t66) objM22097O2;
            objM22097O3 = tj3Var2.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = new C0023al(2, t66Var2);
                tj3Var2.m22131l0(objM22097O3);
            }
            e16 e16VarM23656z16 = vz1.m23656z(e16Var4, (vi3) objM22097O3);
            vx9 vx9Var110 = (vx9) t66Var.getValue();
            objM22097O4 = tj3Var2.m22097O();
            if (objM22097O4 == p84Var) {
                objM22097O4 = new n20(t66Var, t66Var2, i15);
                tj3Var2.m22131l0(objM22097O4);
            }
            int i218 = i10 >> 9;
            tj3Var = tj3Var2;
            lw9.m16554b(str, e16VarM23656z16, j8, null, 0L, null, bc3Var3, 0L, null, ks9Var4, j7, i20, z4, i19, 0, (vi3) objM22097O4, vx9Var110, tj3Var, (i10 & 910) | (3670016 & i218), (i218 & 14) | 1572864 | (i218 & 112) | (i218 & 896) | (i218 & 7168) | (i218 & 57344), 33720);
            e16Var3 = e16Var4;
            vx9Var3 = vx9Var4;
            j4 = j8;
            bc3Var2 = bc3Var3;
            ks9Var3 = ks9Var4;
            j5 = j7;
            i16 = i20;
            z3 = z4;
            i17 = i19;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            z3 = z;
            bc3Var2 = bc3Var;
            e16Var3 = e16Var2;
            j4 = j3;
            ks9Var3 = ks9Var2;
            vx9Var3 = vx9Var2;
            j5 = j2;
            i16 = i;
            i17 = i2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: o20
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i3 | 1);
                    g4d.m12360a(str, e16Var3, j4, ks9Var3, j5, i16, z3, i17, vx9Var3, bc3Var2, (ye1) obj, iM19383z, i4);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final StaticLayout m12361b(CharSequence charSequence, TextPaint textPaint, int i, float f, boolean z, boolean z2) {
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        charSequence.getClass();
        alignment.getClass();
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i);
        builderObtain.setAlignment(alignment);
        builderObtain.setLineSpacing(0.0f, f);
        builderObtain.setIncludePad(z);
        builderObtain.setHyphenationFrequency(0);
        builderObtain.setBreakStrategy(0);
        if (z2) {
            builderObtain.setTextDirection(TextDirectionHeuristics.ANYRTL_LTR);
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        staticLayoutBuild.getClass();
        return staticLayoutBuild;
    }
}
