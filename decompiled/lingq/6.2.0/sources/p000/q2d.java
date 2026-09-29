package p000;

import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.runtime.internal.C0282a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q2d {

    /* JADX INFO: renamed from: a */
    public static m2d f57178a;

    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:90:0x0149  */
    /* JADX WARN: Code duplicated, block: B:93:0x0165  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x00f3, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static final void m19625a(ui3 ui3Var, C0282a c0282a, e16 e16Var, zi3 zi3Var, zi3 zi3Var2, zi3 zi3Var3, zi3 zi3Var4, o39 o39Var, long j, long j2, long j3, long j4, ge2 ge2Var, ye1 ye1Var, int i, int i2) {
        ui3 ui3Var2;
        int i3;
        zi3 zi3Var5;
        int i4;
        zi3 zi3Var6;
        int i5;
        int i6;
        zi3 zi3Var7;
        int i7;
        boolean z;
        tj3 tj3Var;
        long j5;
        long j6;
        long j7;
        ge2 ge2Var2;
        zi3 zi3Var8;
        zi3 zi3Var9;
        zi3 zi3Var10;
        e16 e16Var2;
        o39 o39Var2;
        long jM20492e;
        x18 x18VarM22143u;
        int i8;
        int i9;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(94478519);
        if ((i & 6) == 0) {
            ui3Var2 = ui3Var;
            i3 = (tj3Var2.m22124i(ui3Var2) ? 4 : 2) | i;
        } else {
            ui3Var2 = ui3Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22124i(c0282a) ? 32 : 16;
        }
        int i10 = i3 | 384;
        int i11 = i2 & 8;
        if (i11 == 0) {
            if ((i & 3072) == 0) {
                zi3Var5 = zi3Var;
                i10 |= tj3Var2.m22124i(zi3Var5) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    zi3Var6 = zi3Var2;
                    if (tj3Var2.m22124i(zi3Var6)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i10 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    if ((196608 & i) == 0) {
                        zi3Var7 = zi3Var3;
                        if (tj3Var2.m22124i(zi3Var7)) {
                            i7 = 131072;
                        } else {
                            i7 = 65536;
                        }
                        i10 |= i7;
                    }
                    if ((1572864 & i) != 0) {
                        if (tj3Var2.m22124i(zi3Var4)) {
                            i9 = 1048576;
                        } else {
                            i9 = 524288;
                        }
                        i10 |= i9;
                    }
                    if ((12582912 & i) == 0) {
                        i10 |= 4194304;
                    }
                    if ((100663296 & i) == 0) {
                        i10 |= 33554432;
                    }
                    if ((805306368 & i) == 0) {
                        i10 |= 268435456;
                    }
                    if ((306783379 & i10) == 306783378) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (tj3Var2.m22099R(i10 & 1, z)) {
                        tj3Var2.m22104W();
                        if ((i & 1) != 0 || tj3Var2.m22084B()) {
                            if (i11 != 0) {
                                zi3Var5 = null;
                            }
                            if (i4 != 0) {
                                zi3Var6 = null;
                            }
                            zi3 zi3Var11 = i6 == 0 ? zi3Var7 : null;
                            x17 x17Var = AbstractC0807be.f8407a;
                            o39 o39VarM24271b = x49.m24271b(he2.f42245d, tj3Var2);
                            jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                            long jM20492e2 = ra1.m20492e(he2.f42250i, tj3Var2);
                            long jM20492e3 = ra1.m20492e(he2.f42246e, tj3Var2);
                            long jM20492e4 = ra1.m20492e(he2.f42248g, tj3Var2);
                            ge2 ge2Var3 = new ge2(7, false, false);
                            zi3Var8 = zi3Var5;
                            e16Var2 = b16.f7762a;
                            j6 = jM20492e3;
                            ge2Var2 = ge2Var3;
                            i8 = i10 & (-2143289345);
                            zi3Var9 = zi3Var6;
                            o39Var2 = o39VarM24271b;
                            zi3Var10 = zi3Var11;
                            j5 = jM20492e2;
                            j7 = jM20492e4;
                        } else {
                            tj3Var2.m22102U();
                            j5 = j2;
                            j6 = j3;
                            j7 = j4;
                            ge2Var2 = ge2Var;
                            zi3Var8 = zi3Var5;
                            i8 = i10 & (-2143289345);
                            zi3Var9 = zi3Var6;
                            zi3Var10 = zi3Var7;
                            e16Var2 = e16Var;
                            o39Var2 = o39Var;
                            jM20492e = j;
                        }
                        tj3Var2.m22140r();
                        tj3Var = tj3Var2;
                        AbstractC3369ne.m17395c(ui3Var2, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, tj3Var, i8 & 2147483646, 3456);
                    } else {
                        tj3Var = tj3Var2;
                        tj3Var.m22102U();
                        j5 = j2;
                        j6 = j3;
                        j7 = j4;
                        ge2Var2 = ge2Var;
                        zi3Var8 = zi3Var5;
                        zi3Var9 = zi3Var6;
                        zi3Var10 = zi3Var7;
                        e16Var2 = e16Var;
                        o39Var2 = o39Var;
                        jM20492e = j;
                    }
                    x18VarM22143u = tj3Var.m22143u();
                    if (x18VarM22143u != null) {
                        x18VarM22143u.f67642d = new C3035ge(ui3Var, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, i, i2, 1);
                    }
                }
                i10 |= 196608;
                zi3Var7 = zi3Var3;
                if ((1572864 & i) != 0) {
                    if (tj3Var2.m22124i(zi3Var4)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i10 |= i9;
                }
                if ((12582912 & i) == 0) {
                    i10 |= 4194304;
                }
                if ((100663296 & i) == 0) {
                    i10 |= 33554432;
                }
                if ((805306368 & i) == 0) {
                    i10 |= 268435456;
                }
                if ((306783379 & i10) == 306783378) {
                    z = false;
                } else {
                    z = true;
                }
                if (tj3Var2.m22099R(i10 & 1, z)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            zi3Var5 = null;
                        }
                        if (i4 != 0) {
                            zi3Var6 = null;
                        }
                        if (i6 == 0) {
                        }
                        x17 x17Var2 = AbstractC0807be.f8407a;
                        o39 o39VarM24271b2 = x49.m24271b(he2.f42245d, tj3Var2);
                        jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                        long jM20492e5 = ra1.m20492e(he2.f42250i, tj3Var2);
                        long jM20492e6 = ra1.m20492e(he2.f42246e, tj3Var2);
                        long jM20492e7 = ra1.m20492e(he2.f42248g, tj3Var2);
                        ge2 ge2Var4 = new ge2(7, false, false);
                        zi3Var8 = zi3Var5;
                        e16Var2 = b16.f7762a;
                        j6 = jM20492e6;
                        ge2Var2 = ge2Var4;
                        i8 = i10 & (-2143289345);
                        zi3Var9 = zi3Var6;
                        o39Var2 = o39VarM24271b2;
                        zi3Var10 = zi3Var11;
                        j5 = jM20492e5;
                        j7 = jM20492e7;
                    } else {
                        if (i11 != 0) {
                            zi3Var5 = null;
                        }
                        if (i4 != 0) {
                            zi3Var6 = null;
                        }
                        if (i6 == 0) {
                        }
                        x17 x17Var3 = AbstractC0807be.f8407a;
                        o39 o39VarM24271b3 = x49.m24271b(he2.f42245d, tj3Var2);
                        jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                        long jM20492e8 = ra1.m20492e(he2.f42250i, tj3Var2);
                        long jM20492e9 = ra1.m20492e(he2.f42246e, tj3Var2);
                        long jM20492e10 = ra1.m20492e(he2.f42248g, tj3Var2);
                        ge2 ge2Var5 = new ge2(7, false, false);
                        zi3Var8 = zi3Var5;
                        e16Var2 = b16.f7762a;
                        j6 = jM20492e9;
                        ge2Var2 = ge2Var5;
                        i8 = i10 & (-2143289345);
                        zi3Var9 = zi3Var6;
                        o39Var2 = o39VarM24271b3;
                        zi3Var10 = zi3Var11;
                        j5 = jM20492e8;
                        j7 = jM20492e10;
                    }
                    tj3Var2.m22140r();
                    tj3Var = tj3Var2;
                    AbstractC3369ne.m17395c(ui3Var2, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, tj3Var, i8 & 2147483646, 3456);
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    j5 = j2;
                    j6 = j3;
                    j7 = j4;
                    ge2Var2 = ge2Var;
                    zi3Var8 = zi3Var5;
                    zi3Var9 = zi3Var6;
                    zi3Var10 = zi3Var7;
                    e16Var2 = e16Var;
                    o39Var2 = o39Var;
                    jM20492e = j;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new C3035ge(ui3Var, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, i, i2, 1);
                }
            }
            i10 |= 24576;
            zi3Var6 = zi3Var2;
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    zi3Var7 = zi3Var3;
                    if (tj3Var2.m22124i(zi3Var7)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i10 |= i7;
                }
                if ((1572864 & i) != 0) {
                    if (tj3Var2.m22124i(zi3Var4)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i10 |= i9;
                }
                if ((12582912 & i) == 0) {
                    i10 |= 4194304;
                }
                if ((100663296 & i) == 0) {
                    i10 |= 33554432;
                }
                if ((805306368 & i) == 0) {
                    i10 |= 268435456;
                }
                if ((306783379 & i10) == 306783378) {
                    z = false;
                } else {
                    z = true;
                }
                if (tj3Var2.m22099R(i10 & 1, z)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            zi3Var5 = null;
                        }
                        if (i4 != 0) {
                            zi3Var6 = null;
                        }
                        if (i6 == 0) {
                        }
                        x17 x17Var4 = AbstractC0807be.f8407a;
                        o39 o39VarM24271b4 = x49.m24271b(he2.f42245d, tj3Var2);
                        jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                        long jM20492e11 = ra1.m20492e(he2.f42250i, tj3Var2);
                        long jM20492e12 = ra1.m20492e(he2.f42246e, tj3Var2);
                        long jM20492e13 = ra1.m20492e(he2.f42248g, tj3Var2);
                        ge2 ge2Var6 = new ge2(7, false, false);
                        zi3Var8 = zi3Var5;
                        e16Var2 = b16.f7762a;
                        j6 = jM20492e12;
                        ge2Var2 = ge2Var6;
                        i8 = i10 & (-2143289345);
                        zi3Var9 = zi3Var6;
                        o39Var2 = o39VarM24271b4;
                        zi3Var10 = zi3Var11;
                        j5 = jM20492e11;
                        j7 = jM20492e13;
                    } else {
                        if (i11 != 0) {
                            zi3Var5 = null;
                        }
                        if (i4 != 0) {
                            zi3Var6 = null;
                        }
                        if (i6 == 0) {
                        }
                        x17 x17Var5 = AbstractC0807be.f8407a;
                        o39 o39VarM24271b5 = x49.m24271b(he2.f42245d, tj3Var2);
                        jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                        long jM20492e14 = ra1.m20492e(he2.f42250i, tj3Var2);
                        long jM20492e15 = ra1.m20492e(he2.f42246e, tj3Var2);
                        long jM20492e16 = ra1.m20492e(he2.f42248g, tj3Var2);
                        ge2 ge2Var7 = new ge2(7, false, false);
                        zi3Var8 = zi3Var5;
                        e16Var2 = b16.f7762a;
                        j6 = jM20492e15;
                        ge2Var2 = ge2Var7;
                        i8 = i10 & (-2143289345);
                        zi3Var9 = zi3Var6;
                        o39Var2 = o39VarM24271b5;
                        zi3Var10 = zi3Var11;
                        j5 = jM20492e14;
                        j7 = jM20492e16;
                    }
                    tj3Var2.m22140r();
                    tj3Var = tj3Var2;
                    AbstractC3369ne.m17395c(ui3Var2, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, tj3Var, i8 & 2147483646, 3456);
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    j5 = j2;
                    j6 = j3;
                    j7 = j4;
                    ge2Var2 = ge2Var;
                    zi3Var8 = zi3Var5;
                    zi3Var9 = zi3Var6;
                    zi3Var10 = zi3Var7;
                    e16Var2 = e16Var;
                    o39Var2 = o39Var;
                    jM20492e = j;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new C3035ge(ui3Var, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, i, i2, 1);
                }
            }
            i10 |= 196608;
            zi3Var7 = zi3Var3;
            if ((1572864 & i) != 0) {
                if (tj3Var2.m22124i(zi3Var4)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i10 |= i9;
            }
            if ((12582912 & i) == 0) {
                i10 |= 4194304;
            }
            if ((100663296 & i) == 0) {
                i10 |= 33554432;
            }
            if ((805306368 & i) == 0) {
                i10 |= 268435456;
            }
            if ((306783379 & i10) == 306783378) {
                z = false;
            } else {
                z = true;
            }
            if (tj3Var2.m22099R(i10 & 1, z)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        zi3Var5 = null;
                    }
                    if (i4 != 0) {
                        zi3Var6 = null;
                    }
                    if (i6 == 0) {
                    }
                    x17 x17Var6 = AbstractC0807be.f8407a;
                    o39 o39VarM24271b6 = x49.m24271b(he2.f42245d, tj3Var2);
                    jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                    long jM20492e17 = ra1.m20492e(he2.f42250i, tj3Var2);
                    long jM20492e18 = ra1.m20492e(he2.f42246e, tj3Var2);
                    long jM20492e19 = ra1.m20492e(he2.f42248g, tj3Var2);
                    ge2 ge2Var8 = new ge2(7, false, false);
                    zi3Var8 = zi3Var5;
                    e16Var2 = b16.f7762a;
                    j6 = jM20492e18;
                    ge2Var2 = ge2Var8;
                    i8 = i10 & (-2143289345);
                    zi3Var9 = zi3Var6;
                    o39Var2 = o39VarM24271b6;
                    zi3Var10 = zi3Var11;
                    j5 = jM20492e17;
                    j7 = jM20492e19;
                } else {
                    if (i11 != 0) {
                        zi3Var5 = null;
                    }
                    if (i4 != 0) {
                        zi3Var6 = null;
                    }
                    if (i6 == 0) {
                    }
                    x17 x17Var7 = AbstractC0807be.f8407a;
                    o39 o39VarM24271b7 = x49.m24271b(he2.f42245d, tj3Var2);
                    jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                    long jM20492e110 = ra1.m20492e(he2.f42250i, tj3Var2);
                    long jM20492e111 = ra1.m20492e(he2.f42246e, tj3Var2);
                    long jM20492e112 = ra1.m20492e(he2.f42248g, tj3Var2);
                    ge2 ge2Var9 = new ge2(7, false, false);
                    zi3Var8 = zi3Var5;
                    e16Var2 = b16.f7762a;
                    j6 = jM20492e111;
                    ge2Var2 = ge2Var9;
                    i8 = i10 & (-2143289345);
                    zi3Var9 = zi3Var6;
                    o39Var2 = o39VarM24271b7;
                    zi3Var10 = zi3Var11;
                    j5 = jM20492e110;
                    j7 = jM20492e112;
                }
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                AbstractC3369ne.m17395c(ui3Var2, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, tj3Var, i8 & 2147483646, 3456);
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                j5 = j2;
                j6 = j3;
                j7 = j4;
                ge2Var2 = ge2Var;
                zi3Var8 = zi3Var5;
                zi3Var9 = zi3Var6;
                zi3Var10 = zi3Var7;
                e16Var2 = e16Var;
                o39Var2 = o39Var;
                jM20492e = j;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new C3035ge(ui3Var, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, i, i2, 1);
            }
        }
        i10 = i3 | 3456;
        zi3Var5 = zi3Var;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                zi3Var6 = zi3Var2;
                if (tj3Var2.m22124i(zi3Var6)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i10 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                if ((196608 & i) == 0) {
                    zi3Var7 = zi3Var3;
                    if (tj3Var2.m22124i(zi3Var7)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i10 |= i7;
                }
                if ((1572864 & i) != 0) {
                    if (tj3Var2.m22124i(zi3Var4)) {
                        i9 = 1048576;
                    } else {
                        i9 = 524288;
                    }
                    i10 |= i9;
                }
                if ((12582912 & i) == 0) {
                    i10 |= 4194304;
                }
                if ((100663296 & i) == 0) {
                    i10 |= 33554432;
                }
                if ((805306368 & i) == 0) {
                    i10 |= 268435456;
                }
                if ((306783379 & i10) == 306783378) {
                    z = false;
                } else {
                    z = true;
                }
                if (tj3Var2.m22099R(i10 & 1, z)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0) {
                        if (i11 != 0) {
                            zi3Var5 = null;
                        }
                        if (i4 != 0) {
                            zi3Var6 = null;
                        }
                        if (i6 == 0) {
                        }
                        x17 x17Var8 = AbstractC0807be.f8407a;
                        o39 o39VarM24271b8 = x49.m24271b(he2.f42245d, tj3Var2);
                        jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                        long jM20492e113 = ra1.m20492e(he2.f42250i, tj3Var2);
                        long jM20492e114 = ra1.m20492e(he2.f42246e, tj3Var2);
                        long jM20492e115 = ra1.m20492e(he2.f42248g, tj3Var2);
                        ge2 ge2Var10 = new ge2(7, false, false);
                        zi3Var8 = zi3Var5;
                        e16Var2 = b16.f7762a;
                        j6 = jM20492e114;
                        ge2Var2 = ge2Var10;
                        i8 = i10 & (-2143289345);
                        zi3Var9 = zi3Var6;
                        o39Var2 = o39VarM24271b8;
                        zi3Var10 = zi3Var11;
                        j5 = jM20492e113;
                        j7 = jM20492e115;
                    } else {
                        if (i11 != 0) {
                            zi3Var5 = null;
                        }
                        if (i4 != 0) {
                            zi3Var6 = null;
                        }
                        if (i6 == 0) {
                        }
                        x17 x17Var9 = AbstractC0807be.f8407a;
                        o39 o39VarM24271b9 = x49.m24271b(he2.f42245d, tj3Var2);
                        jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                        long jM20492e116 = ra1.m20492e(he2.f42250i, tj3Var2);
                        long jM20492e117 = ra1.m20492e(he2.f42246e, tj3Var2);
                        long jM20492e118 = ra1.m20492e(he2.f42248g, tj3Var2);
                        ge2 ge2Var11 = new ge2(7, false, false);
                        zi3Var8 = zi3Var5;
                        e16Var2 = b16.f7762a;
                        j6 = jM20492e117;
                        ge2Var2 = ge2Var11;
                        i8 = i10 & (-2143289345);
                        zi3Var9 = zi3Var6;
                        o39Var2 = o39VarM24271b9;
                        zi3Var10 = zi3Var11;
                        j5 = jM20492e116;
                        j7 = jM20492e118;
                    }
                    tj3Var2.m22140r();
                    tj3Var = tj3Var2;
                    AbstractC3369ne.m17395c(ui3Var2, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, tj3Var, i8 & 2147483646, 3456);
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    j5 = j2;
                    j6 = j3;
                    j7 = j4;
                    ge2Var2 = ge2Var;
                    zi3Var8 = zi3Var5;
                    zi3Var9 = zi3Var6;
                    zi3Var10 = zi3Var7;
                    e16Var2 = e16Var;
                    o39Var2 = o39Var;
                    jM20492e = j;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new C3035ge(ui3Var, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, i, i2, 1);
                }
            }
            i10 |= 196608;
            zi3Var7 = zi3Var3;
            if ((1572864 & i) != 0) {
                if (tj3Var2.m22124i(zi3Var4)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i10 |= i9;
            }
            if ((12582912 & i) == 0) {
                i10 |= 4194304;
            }
            if ((100663296 & i) == 0) {
                i10 |= 33554432;
            }
            if ((805306368 & i) == 0) {
                i10 |= 268435456;
            }
            if ((306783379 & i10) == 306783378) {
                z = false;
            } else {
                z = true;
            }
            if (tj3Var2.m22099R(i10 & 1, z)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        zi3Var5 = null;
                    }
                    if (i4 != 0) {
                        zi3Var6 = null;
                    }
                    if (i6 == 0) {
                    }
                    x17 x17Var10 = AbstractC0807be.f8407a;
                    o39 o39VarM24271b10 = x49.m24271b(he2.f42245d, tj3Var2);
                    jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                    long jM20492e119 = ra1.m20492e(he2.f42250i, tj3Var2);
                    long jM20492e1110 = ra1.m20492e(he2.f42246e, tj3Var2);
                    long jM20492e1111 = ra1.m20492e(he2.f42248g, tj3Var2);
                    ge2 ge2Var12 = new ge2(7, false, false);
                    zi3Var8 = zi3Var5;
                    e16Var2 = b16.f7762a;
                    j6 = jM20492e1110;
                    ge2Var2 = ge2Var12;
                    i8 = i10 & (-2143289345);
                    zi3Var9 = zi3Var6;
                    o39Var2 = o39VarM24271b10;
                    zi3Var10 = zi3Var11;
                    j5 = jM20492e119;
                    j7 = jM20492e1111;
                } else {
                    if (i11 != 0) {
                        zi3Var5 = null;
                    }
                    if (i4 != 0) {
                        zi3Var6 = null;
                    }
                    if (i6 == 0) {
                    }
                    x17 x17Var11 = AbstractC0807be.f8407a;
                    o39 o39VarM24271b11 = x49.m24271b(he2.f42245d, tj3Var2);
                    jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                    long jM20492e1112 = ra1.m20492e(he2.f42250i, tj3Var2);
                    long jM20492e1113 = ra1.m20492e(he2.f42246e, tj3Var2);
                    long jM20492e1114 = ra1.m20492e(he2.f42248g, tj3Var2);
                    ge2 ge2Var13 = new ge2(7, false, false);
                    zi3Var8 = zi3Var5;
                    e16Var2 = b16.f7762a;
                    j6 = jM20492e1113;
                    ge2Var2 = ge2Var13;
                    i8 = i10 & (-2143289345);
                    zi3Var9 = zi3Var6;
                    o39Var2 = o39VarM24271b11;
                    zi3Var10 = zi3Var11;
                    j5 = jM20492e1112;
                    j7 = jM20492e1114;
                }
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                AbstractC3369ne.m17395c(ui3Var2, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, tj3Var, i8 & 2147483646, 3456);
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                j5 = j2;
                j6 = j3;
                j7 = j4;
                ge2Var2 = ge2Var;
                zi3Var8 = zi3Var5;
                zi3Var9 = zi3Var6;
                zi3Var10 = zi3Var7;
                e16Var2 = e16Var;
                o39Var2 = o39Var;
                jM20492e = j;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new C3035ge(ui3Var, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, i, i2, 1);
            }
        }
        i10 |= 24576;
        zi3Var6 = zi3Var2;
        i6 = i2 & 32;
        if (i6 != 0) {
            if ((196608 & i) == 0) {
                zi3Var7 = zi3Var3;
                if (tj3Var2.m22124i(zi3Var7)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i10 |= i7;
            }
            if ((1572864 & i) != 0) {
                if (tj3Var2.m22124i(zi3Var4)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i10 |= i9;
            }
            if ((12582912 & i) == 0) {
                i10 |= 4194304;
            }
            if ((100663296 & i) == 0) {
                i10 |= 33554432;
            }
            if ((805306368 & i) == 0) {
                i10 |= 268435456;
            }
            if ((306783379 & i10) == 306783378) {
                z = false;
            } else {
                z = true;
            }
            if (tj3Var2.m22099R(i10 & 1, z)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i11 != 0) {
                        zi3Var5 = null;
                    }
                    if (i4 != 0) {
                        zi3Var6 = null;
                    }
                    if (i6 == 0) {
                    }
                    x17 x17Var12 = AbstractC0807be.f8407a;
                    o39 o39VarM24271b12 = x49.m24271b(he2.f42245d, tj3Var2);
                    jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                    long jM20492e1115 = ra1.m20492e(he2.f42250i, tj3Var2);
                    long jM20492e1116 = ra1.m20492e(he2.f42246e, tj3Var2);
                    long jM20492e1117 = ra1.m20492e(he2.f42248g, tj3Var2);
                    ge2 ge2Var14 = new ge2(7, false, false);
                    zi3Var8 = zi3Var5;
                    e16Var2 = b16.f7762a;
                    j6 = jM20492e1116;
                    ge2Var2 = ge2Var14;
                    i8 = i10 & (-2143289345);
                    zi3Var9 = zi3Var6;
                    o39Var2 = o39VarM24271b12;
                    zi3Var10 = zi3Var11;
                    j5 = jM20492e1115;
                    j7 = jM20492e1117;
                } else {
                    if (i11 != 0) {
                        zi3Var5 = null;
                    }
                    if (i4 != 0) {
                        zi3Var6 = null;
                    }
                    if (i6 == 0) {
                    }
                    x17 x17Var13 = AbstractC0807be.f8407a;
                    o39 o39VarM24271b13 = x49.m24271b(he2.f42245d, tj3Var2);
                    jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                    long jM20492e1118 = ra1.m20492e(he2.f42250i, tj3Var2);
                    long jM20492e1119 = ra1.m20492e(he2.f42246e, tj3Var2);
                    long jM20492e11110 = ra1.m20492e(he2.f42248g, tj3Var2);
                    ge2 ge2Var15 = new ge2(7, false, false);
                    zi3Var8 = zi3Var5;
                    e16Var2 = b16.f7762a;
                    j6 = jM20492e1119;
                    ge2Var2 = ge2Var15;
                    i8 = i10 & (-2143289345);
                    zi3Var9 = zi3Var6;
                    o39Var2 = o39VarM24271b13;
                    zi3Var10 = zi3Var11;
                    j5 = jM20492e1118;
                    j7 = jM20492e11110;
                }
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                AbstractC3369ne.m17395c(ui3Var2, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, tj3Var, i8 & 2147483646, 3456);
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                j5 = j2;
                j6 = j3;
                j7 = j4;
                ge2Var2 = ge2Var;
                zi3Var8 = zi3Var5;
                zi3Var9 = zi3Var6;
                zi3Var10 = zi3Var7;
                e16Var2 = e16Var;
                o39Var2 = o39Var;
                jM20492e = j;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new C3035ge(ui3Var, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, i, i2, 1);
            }
        }
        i10 |= 196608;
        zi3Var7 = zi3Var3;
        if ((1572864 & i) != 0) {
            if (tj3Var2.m22124i(zi3Var4)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i10 |= i9;
        }
        if ((12582912 & i) == 0) {
            i10 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            i10 |= 33554432;
        }
        if ((805306368 & i) == 0) {
            i10 |= 268435456;
        }
        if ((306783379 & i10) == 306783378) {
            z = false;
        } else {
            z = true;
        }
        if (tj3Var2.m22099R(i10 & 1, z)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0) {
                if (i11 != 0) {
                    zi3Var5 = null;
                }
                if (i4 != 0) {
                    zi3Var6 = null;
                }
                if (i6 == 0) {
                }
                x17 x17Var14 = AbstractC0807be.f8407a;
                o39 o39VarM24271b14 = x49.m24271b(he2.f42245d, tj3Var2);
                jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                long jM20492e11111 = ra1.m20492e(he2.f42250i, tj3Var2);
                long jM20492e11112 = ra1.m20492e(he2.f42246e, tj3Var2);
                long jM20492e11113 = ra1.m20492e(he2.f42248g, tj3Var2);
                ge2 ge2Var16 = new ge2(7, false, false);
                zi3Var8 = zi3Var5;
                e16Var2 = b16.f7762a;
                j6 = jM20492e11112;
                ge2Var2 = ge2Var16;
                i8 = i10 & (-2143289345);
                zi3Var9 = zi3Var6;
                o39Var2 = o39VarM24271b14;
                zi3Var10 = zi3Var11;
                j5 = jM20492e11111;
                j7 = jM20492e11113;
            } else {
                if (i11 != 0) {
                    zi3Var5 = null;
                }
                if (i4 != 0) {
                    zi3Var6 = null;
                }
                if (i6 == 0) {
                }
                x17 x17Var15 = AbstractC0807be.f8407a;
                o39 o39VarM24271b15 = x49.m24271b(he2.f42245d, tj3Var2);
                jM20492e = ra1.m20492e(he2.f42244c, tj3Var2);
                long jM20492e11114 = ra1.m20492e(he2.f42250i, tj3Var2);
                long jM20492e11115 = ra1.m20492e(he2.f42246e, tj3Var2);
                long jM20492e11116 = ra1.m20492e(he2.f42248g, tj3Var2);
                ge2 ge2Var17 = new ge2(7, false, false);
                zi3Var8 = zi3Var5;
                e16Var2 = b16.f7762a;
                j6 = jM20492e11115;
                ge2Var2 = ge2Var17;
                i8 = i10 & (-2143289345);
                zi3Var9 = zi3Var6;
                o39Var2 = o39VarM24271b15;
                zi3Var10 = zi3Var11;
                j5 = jM20492e11114;
                j7 = jM20492e11116;
            }
            tj3Var2.m22140r();
            tj3Var = tj3Var2;
            AbstractC3369ne.m17395c(ui3Var2, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, tj3Var, i8 & 2147483646, 3456);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            j5 = j2;
            j6 = j3;
            j7 = j4;
            ge2Var2 = ge2Var;
            zi3Var8 = zi3Var5;
            zi3Var9 = zi3Var6;
            zi3Var10 = zi3Var7;
            e16Var2 = e16Var;
            o39Var2 = o39Var;
            jM20492e = j;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3035ge(ui3Var, c0282a, e16Var2, zi3Var8, zi3Var9, zi3Var10, zi3Var4, o39Var2, jM20492e, j5, j6, j7, ge2Var2, i, i2, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19626b(final vs3 vs3Var, final List list, final boolean z, final boolean z2, final vi3 vi3Var, final zi3 zi3Var, final vi3 vi3Var2, final zi3 zi3Var2, final vi3 vi3Var3, e16 e16Var, ye1 ye1Var, final int i, final int i2) {
        boolean z3;
        final e16 e16Var2;
        int i3;
        tj3 tj3Var;
        vs3Var.getClass();
        list.getClass();
        vi3Var.getClass();
        zi3Var.getClass();
        vi3Var2.getClass();
        zi3Var2.getClass();
        vi3Var3.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1053807869);
        int i4 = (tj3Var2.m22124i(vs3Var) ? 4 : 2) | i | (tj3Var2.m22124i(list) ? 32 : 16);
        if ((i & 384) == 0) {
            z3 = z;
            i4 |= tj3Var2.m22122h(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        boolean z4 = z2;
        zi3 zi3Var3 = zi3Var;
        int i5 = i4 | (tj3Var2.m22122h(z4) ? 2048 : 1024) | (tj3Var2.m22124i(vi3Var) ? 16384 : 8192) | (tj3Var2.m22124i(zi3Var3) ? 131072 : 65536) | (tj3Var2.m22124i(vi3Var2) ? 1048576 : 524288) | (tj3Var2.m22124i(zi3Var2) ? 8388608 : 4194304) | (tj3Var2.m22124i(vi3Var3) ? 67108864 : 33554432);
        int i6 = i2 & 512;
        if (i6 != 0) {
            i3 = i5 | 805306368;
            e16Var2 = e16Var;
        } else {
            e16Var2 = e16Var;
            i3 = i5 | (tj3Var2.m22120g(e16Var2) ? 536870912 : 268435456);
        }
        if (tj3Var2.m22099R(i3 & 1, (i3 & 306783379) != 306783378)) {
            b16 b16Var = b16.f7762a;
            if (i6 != 0) {
                e16Var2 = b16Var;
            }
            e16 e16VarM4429v = c99.m4429v(c99.m4412e(vz1.m23624c0(e16Var2, "reader_sentence_vocabulary"), 1.0f));
            Object objM22097O = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new ow8(4);
                tj3Var2.m22131l0(objM22097O);
            }
            e16 e16VarM17643c = nv8.m17643c(e16VarM4429v, false, (vi3) objM22097O);
            bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var2, 0);
            int iHashCode = Long.hashCode(tj3Var2.f62385T);
            l77 l77VarM22132m = tj3Var2.m22132m();
            e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var2, e16VarM17643c);
            se1.f60731q.getClass();
            ui3 ui3Var = C0352b.f4299b;
            tj3Var2.m22119f0();
            int i7 = i3;
            if (tj3Var2.f62384S) {
                tj3Var2.m22130l(ui3Var);
            } else {
                tj3Var2.m22137o0();
            }
            oha.m18001g(tj3Var2, C0352b.f4303f, bb1VarM230a);
            oha.m18001g(tj3Var2, C0352b.f4302e, l77VarM22132m);
            oha.m18001g(tj3Var2, C0352b.f4304g, Integer.valueOf(iHashCode));
            oha.m18000f(tj3Var2, C0352b.f4305h);
            oha.m18001g(tj3Var2, C0352b.f4301d, e16VarM1322c);
            pb1.m19031a(1.0f, 54, 4, 0L, tj3Var2, c99.m4412e(b16Var, 1.0f));
            tj3 tj3Var3 = tj3Var2;
            tj3Var3.m22111b0(1045551318);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                w65 w65Var = (w65) it.next();
                boolean zM22124i = ((i7 & 57344) == 16384) | tj3Var3.m22124i(w65Var);
                Object objM22097O2 = tj3Var3.m22097O();
                if (zM22124i || objM22097O2 == p84Var) {
                    objM22097O2 = new ty4(vi3Var, w65Var, 2);
                    tj3Var3.m22131l0(objM22097O2);
                }
                tj3 tj3Var4 = tj3Var3;
                ibd.m13755a(c99.m4412e(AbstractC0080f.m815b(null, false, (ui3) objM22097O2, b16Var, 15), 1.0f), vs3Var, w65Var, z3, z4, zi3Var3, vi3Var2, zi3Var2, vi3Var3, tj3Var4, ((i7 << 3) & 64624) | (i7 & 458752) | (i7 & 3670016) | (i7 & 29360128) | (i7 & 234881024), 0);
                pb1.m19031a(1.0f, 54, 4, 0L, tj3Var4, c99.m4412e(b16Var, 1.0f));
                z3 = z;
                z4 = z2;
                zi3Var3 = zi3Var;
                tj3Var3 = tj3Var4;
            }
            tj3Var = tj3Var3;
            tj3Var.m22139q(false);
            tj3Var.m22139q(true);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: rx8
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    q2d.m19626b(vs3Var, list, z, z2, vi3Var, zi3Var, vi3Var2, zi3Var2, vi3Var3, e16Var2, (ye1) obj, pk9.m19383z(i | 1), i2);
                    return xfa.f68157a;
                }
            };
        }
    }
}
