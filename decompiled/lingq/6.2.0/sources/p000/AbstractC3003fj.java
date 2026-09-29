package p000;

import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.window.AbstractC0456d;
import androidx.compose.runtime.AbstractC0278f;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: renamed from: fj */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3003fj {

    /* JADX INFO: renamed from: a */
    public static final qh7 f39169a = new qh7(30, true);

    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:71:0x0120  */
    /* JADX WARN: Code duplicated, block: B:78:0x0163  */
    /* JADX WARN: Code duplicated, block: B:80:0x016f  */
    /* JADX WARN: Code duplicated, block: B:83:0x018d  */
    /* JADX WARN: Code duplicated, block: B:84:0x018f  */
    /* JADX WARN: Code duplicated, block: B:87:0x019b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:90:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x020f  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static final void m11885a(boolean z, final ui3 ui3Var, e16 e16Var, long j, yn8 yn8Var, qh7 qh7Var, o39 o39Var, long j2, float f, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        final boolean z2;
        int i3;
        ui3 ui3Var2;
        e16 e16Var2;
        int i4;
        int i5;
        o39 o39VarM24271b;
        int i6;
        int i7;
        boolean z3;
        final long jFloatToRawIntBits;
        final long j3;
        final float f2;
        final e16 e16Var3;
        final o39 o39Var2;
        final yn8 yn8Var2;
        final qh7 qh7Var2;
        x18 x18VarM22143u;
        e16 e16Var4;
        int i8;
        int i9;
        qh7 qh7Var3;
        e16 e16Var5;
        yn8 yn8Var3;
        float f3;
        long j4;
        o39 o39Var3;
        Object objM22097O;
        p84 p84Var;
        w66 w66Var;
        Object objM22097O2;
        t66 t66Var;
        fb2 fb2Var;
        boolean z4;
        boolean zM22120g;
        Object objM22097O3;
        t66 t66Var2;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1725609375);
        if ((i & 6) == 0) {
            z2 = z;
            i3 = (tj3Var.m22122h(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            ui3Var2 = ui3Var;
            i3 |= tj3Var.m22124i(ui3Var2) ? 32 : 16;
        } else {
            ui3Var2 = ui3Var;
        }
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                e16Var2 = e16Var;
                i3 |= tj3Var.m22120g(e16Var2) ? 256 : 128;
            }
            i4 = i3 | 3072;
            if ((i & 24576) == 0) {
                i4 = i3 | 11264;
            }
            i5 = 196608 | i4;
            if ((1572864 & i) == 0) {
                if ((i2 & 64) == 0) {
                    o39VarM24271b = o39Var;
                    int i11 = tj3Var.m22120g(o39VarM24271b) ? 1048576 : 524288;
                    i5 |= i11;
                } else {
                    o39VarM24271b = o39Var;
                }
                i5 |= i11;
            } else {
                o39VarM24271b = o39Var;
            }
            if ((12582912 & i) == 0) {
                i5 |= 4194304;
            }
            i6 = i5 | 905969664;
            i7 = 0;
            if ((306783379 & i6) == 306783378) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (tj3Var.m22099R(i6 & 1, z3)) {
                tj3Var.m22104W();
                if ((i & 1) != 0 || tj3Var.m22084B()) {
                    if (i10 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    e16 e16Var6 = e16Var4;
                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                    yn8 yn8VarM3972r0 = bna.m3972r0(tj3Var);
                    i8 = i6 & (-57345);
                    if ((i2 & 64) != 0) {
                        float f4 = iw5.f44705a;
                        o39VarM24271b = x49.m24271b(gx5.f41474c, tj3Var);
                        i8 = i6 & (-3727361);
                    }
                    float f5 = iw5.f44705a;
                    long jM20492e = ra1.m20492e(gx5.f41472a, tj3Var);
                    i9 = i8 & (-29360129);
                    float f6 = iw5.f44705a;
                    qh7Var3 = f39169a;
                    e16Var5 = e16Var6;
                    yn8Var3 = yn8VarM3972r0;
                    f3 = f6;
                    j4 = jM20492e;
                } else {
                    tj3Var.m22102U();
                    int i12 = i6 & (-57345);
                    if ((i2 & 64) != 0) {
                        i12 = i6 & (-3727361);
                    }
                    i9 = i12 & (-29360129);
                    jFloatToRawIntBits = j;
                    yn8Var3 = yn8Var;
                    qh7Var3 = qh7Var;
                    j4 = j2;
                    f3 = f;
                    e16Var5 = e16Var2;
                }
                o39Var3 = o39VarM24271b;
                tj3Var.m22140r();
                objM22097O = tj3Var.m22097O();
                p84Var = we1.f66679a;
                if (objM22097O == p84Var) {
                    objM22097O = new w66(Boolean.FALSE);
                    tj3Var.m22131l0(objM22097O);
                }
                w66Var = (w66) objM22097O;
                ((xc9) w66Var.f66458c).setValue(Boolean.valueOf(z2));
                if (!((Boolean) ((xc9) w66Var.f66457b).getValue()).booleanValue() || ((Boolean) ((xc9) w66Var.f66458c).getValue()).booleanValue()) {
                    tj3Var.m22111b0(1165893498);
                    objM22097O2 = tj3Var.m22097O();
                    if (objM22097O2 == p84Var) {
                        objM22097O2 = AbstractC0278f.m1260j(new k9a(k9a.f46915b));
                        tj3Var.m22131l0(objM22097O2);
                    }
                    t66Var = (t66) objM22097O2;
                    fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                    if ((i9 & 7168) == 2048) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    zM22120g = z4 | tj3Var.m22120g(fb2Var);
                    objM22097O3 = tj3Var.m22097O();
                    if (!zM22120g || objM22097O3 == p84Var) {
                        objM22097O3 = new zm2(t66Var, jFloatToRawIntBits, fb2Var, new C0812bj(i7, t66Var));
                        t66Var2 = t66Var;
                        tj3Var.m22131l0(objM22097O3);
                    } else {
                        t66Var2 = t66Var;
                    }
                    AbstractC0456d.m1897a((zm2) objM22097O3, ui3Var2, qh7Var3, ci8.m4703P(-917492520, new C0849cj(e16Var5, w66Var, t66Var2, yn8Var3, o39Var3, j4, f3, c0282a), tj3Var), tj3Var, ((i9 >> 9) & 896) | (i9 & 112) | 3072, 0);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(1167162979);
                    tj3Var.m22139q(false);
                }
                qh7Var2 = qh7Var3;
                e16Var3 = e16Var5;
                yn8Var2 = yn8Var3;
                o39Var2 = o39Var3;
                j3 = j4;
                f2 = f3;
            } else {
                tj3Var.m22102U();
                jFloatToRawIntBits = j;
                j3 = j2;
                f2 = f;
                e16Var3 = e16Var2;
                o39Var2 = o39VarM24271b;
                yn8Var2 = yn8Var;
                qh7Var2 = qh7Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new zi3() { // from class: dj
                    @Override // p000.zi3
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int iM19383z = pk9.m19383z(i | 1);
                        AbstractC3003fj.m11885a(z2, ui3Var, e16Var3, jFloatToRawIntBits, yn8Var2, qh7Var2, o39Var2, j3, f2, c0282a, (ye1) obj, iM19383z, i2);
                        return xfa.f68157a;
                    }
                };
            }
        }
        i3 |= 384;
        e16Var2 = e16Var;
        i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 = i3 | 11264;
        }
        i5 = 196608 | i4;
        if ((1572864 & i) == 0) {
            if ((i2 & 64) == 0) {
                o39VarM24271b = o39Var;
                if (tj3Var.m22120g(o39VarM24271b)) {
                }
                i5 |= i11;
            } else {
                o39VarM24271b = o39Var;
            }
            i5 |= i11;
        } else {
            o39VarM24271b = o39Var;
        }
        if ((12582912 & i) == 0) {
            i5 |= 4194304;
        }
        i6 = i5 | 905969664;
        i7 = 0;
        if ((306783379 & i6) == 306783378) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (tj3Var.m22099R(i6 & 1, z3)) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                if (i10 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                e16 e16Var7 = e16Var4;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                yn8 yn8VarM3972r1 = bna.m3972r0(tj3Var);
                i8 = i6 & (-57345);
                if ((i2 & 64) != 0) {
                    float f7 = iw5.f44705a;
                    o39VarM24271b = x49.m24271b(gx5.f41474c, tj3Var);
                    i8 = i6 & (-3727361);
                }
                float f8 = iw5.f44705a;
                long jM20492e2 = ra1.m20492e(gx5.f41472a, tj3Var);
                i9 = i8 & (-29360129);
                float f9 = iw5.f44705a;
                qh7Var3 = f39169a;
                e16Var5 = e16Var7;
                yn8Var3 = yn8VarM3972r1;
                f3 = f9;
                j4 = jM20492e2;
            } else {
                if (i10 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                e16 e16Var8 = e16Var4;
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                yn8 yn8VarM3972r2 = bna.m3972r0(tj3Var);
                i8 = i6 & (-57345);
                if ((i2 & 64) != 0) {
                    float f10 = iw5.f44705a;
                    o39VarM24271b = x49.m24271b(gx5.f41474c, tj3Var);
                    i8 = i6 & (-3727361);
                }
                float f11 = iw5.f44705a;
                long jM20492e3 = ra1.m20492e(gx5.f41472a, tj3Var);
                i9 = i8 & (-29360129);
                float f12 = iw5.f44705a;
                qh7Var3 = f39169a;
                e16Var5 = e16Var8;
                yn8Var3 = yn8VarM3972r2;
                f3 = f12;
                j4 = jM20492e3;
            }
            o39Var3 = o39VarM24271b;
            tj3Var.m22140r();
            objM22097O = tj3Var.m22097O();
            p84Var = we1.f66679a;
            if (objM22097O == p84Var) {
                objM22097O = new w66(Boolean.FALSE);
                tj3Var.m22131l0(objM22097O);
            }
            w66Var = (w66) objM22097O;
            ((xc9) w66Var.f66458c).setValue(Boolean.valueOf(z2));
            if (((Boolean) ((xc9) w66Var.f66457b).getValue()).booleanValue()) {
                tj3Var.m22111b0(1165893498);
                objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC0278f.m1260j(new k9a(k9a.f46915b));
                    tj3Var.m22131l0(objM22097O2);
                }
                t66Var = (t66) objM22097O2;
                fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                if ((i9 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM22120g = z4 | tj3Var.m22120g(fb2Var);
                objM22097O3 = tj3Var.m22097O();
                if (zM22120g) {
                    objM22097O3 = new zm2(t66Var, jFloatToRawIntBits, fb2Var, new C0812bj(i7, t66Var));
                    t66Var2 = t66Var;
                    tj3Var.m22131l0(objM22097O3);
                } else {
                    objM22097O3 = new zm2(t66Var, jFloatToRawIntBits, fb2Var, new C0812bj(i7, t66Var));
                    t66Var2 = t66Var;
                    tj3Var.m22131l0(objM22097O3);
                }
                AbstractC0456d.m1897a((zm2) objM22097O3, ui3Var2, qh7Var3, ci8.m4703P(-917492520, new C0849cj(e16Var5, w66Var, t66Var2, yn8Var3, o39Var3, j4, f3, c0282a), tj3Var), tj3Var, ((i9 >> 9) & 896) | (i9 & 112) | 3072, 0);
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1165893498);
                objM22097O2 = tj3Var.m22097O();
                if (objM22097O2 == p84Var) {
                    objM22097O2 = AbstractC0278f.m1260j(new k9a(k9a.f46915b));
                    tj3Var.m22131l0(objM22097O2);
                }
                t66Var = (t66) objM22097O2;
                fb2Var = (fb2) tj3Var.m22128k(AbstractC0402n.f4816h);
                if ((i9 & 7168) == 2048) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                zM22120g = z4 | tj3Var.m22120g(fb2Var);
                objM22097O3 = tj3Var.m22097O();
                if (zM22120g) {
                    objM22097O3 = new zm2(t66Var, jFloatToRawIntBits, fb2Var, new C0812bj(i7, t66Var));
                    t66Var2 = t66Var;
                    tj3Var.m22131l0(objM22097O3);
                } else {
                    objM22097O3 = new zm2(t66Var, jFloatToRawIntBits, fb2Var, new C0812bj(i7, t66Var));
                    t66Var2 = t66Var;
                    tj3Var.m22131l0(objM22097O3);
                }
                AbstractC0456d.m1897a((zm2) objM22097O3, ui3Var2, qh7Var3, ci8.m4703P(-917492520, new C0849cj(e16Var5, w66Var, t66Var2, yn8Var3, o39Var3, j4, f3, c0282a), tj3Var), tj3Var, ((i9 >> 9) & 896) | (i9 & 112) | 3072, 0);
                tj3Var.m22139q(false);
            }
            qh7Var2 = qh7Var3;
            e16Var3 = e16Var5;
            yn8Var2 = yn8Var3;
            o39Var2 = o39Var3;
            j3 = j4;
            f2 = f3;
        } else {
            tj3Var.m22102U();
            jFloatToRawIntBits = j;
            j3 = j2;
            f2 = f;
            e16Var3 = e16Var2;
            o39Var2 = o39VarM24271b;
            yn8Var2 = yn8Var;
            qh7Var2 = qh7Var;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: dj
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    AbstractC3003fj.m11885a(z2, ui3Var, e16Var3, jFloatToRawIntBits, yn8Var2, qh7Var2, o39Var2, j3, f2, c0282a, (ye1) obj, iM19383z, i2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:63:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x012b  */
    /* JADX WARN: Code duplicated, block: B:69:0x013e  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m11886b(zi3 zi3Var, ui3 ui3Var, e16 e16Var, zi3 zi3Var2, zi3 zi3Var3, boolean z, kw5 kw5Var, t17 t17Var, ye1 ye1Var, int i, int i2) {
        int i3;
        zi3 zi3Var4;
        int i4;
        zi3 zi3Var5;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        boolean z3;
        tj3 tj3Var;
        e16 e16Var2;
        t17 t17Var2;
        zi3 zi3Var6;
        boolean z4;
        kw5 kw5Var2;
        x18 x18VarM22143u;
        pa1 pa1Var;
        kw5 kw5Var3;
        kw5 kw5Var4;
        int i10;
        t17 t17Var3;
        kw5 kw5Var5;
        e16 e16Var3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-532959117);
        if ((i & 48) == 0) {
            i3 = (tj3Var2.m22124i(ui3Var) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        int i11 = i3 | 384;
        int i12 = i2 & 8;
        if (i12 == 0) {
            if ((i & 3072) == 0) {
                zi3Var4 = zi3Var2;
                i11 |= tj3Var2.m22124i(zi3Var4) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    zi3Var5 = zi3Var3;
                    if (tj3Var2.m22124i(zi3Var5)) {
                        i5 = 16384;
                    } else {
                        i5 = 8192;
                    }
                    i11 |= i5;
                }
                i6 = i2 & 32;
                if (i6 != 0) {
                    i8 = i11 | 196608;
                    z2 = z;
                } else {
                    z2 = z;
                    if (tj3Var2.m22122h(z2)) {
                        i7 = 131072;
                    } else {
                        i7 = 65536;
                    }
                    i8 = i11 | i7;
                }
                i9 = i8 | 113770496;
                if ((38347923 & i9) != 38347922) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (tj3Var2.m22099R(i9 & 1, z3)) {
                    tj3Var2.m22104W();
                    if ((i & 1) != 0 || tj3Var2.m22084B()) {
                        if (i12 != 0) {
                            zi3Var4 = null;
                        }
                        if (i4 != 0) {
                            zi3Var5 = null;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        float f = iw5.f44705a;
                        pa1Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a;
                        kw5Var3 = pa1Var.f55861j0;
                        if (kw5Var3 == null) {
                            kw5Var4 = new kw5(ra1.m20491d(pa1Var, fg5.f39058n), ra1.m20491d(pa1Var, fg5.f39060p), ra1.m20491d(pa1Var, fg5.f39041D), aa1.m198b(fg5.f39049e, ra1.m20491d(pa1Var, fg5.f39048d)), aa1.m198b(fg5.f39051g, ra1.m20491d(pa1Var, fg5.f39050f)), aa1.m198b(fg5.f39057m, ra1.m20491d(pa1Var, fg5.f39056l)));
                            pa1Var.f55861j0 = kw5Var4;
                        } else {
                            kw5Var4 = kw5Var3;
                        }
                        i10 = i9 & (-3670017);
                        t17Var3 = iw5.f44706b;
                        kw5Var5 = kw5Var4;
                        e16Var3 = b16.f7762a;
                    } else {
                        tj3Var2.m22102U();
                        i10 = i9 & (-3670017);
                        e16Var3 = e16Var;
                        kw5Var5 = kw5Var;
                        t17Var3 = t17Var;
                    }
                    zi3 zi3Var7 = zi3Var4;
                    zi3 zi3Var8 = zi3Var5;
                    boolean z5 = z2;
                    tj3Var2.m22140r();
                    tj3Var = tj3Var2;
                    tw5.m22327b(zi3Var, ui3Var, e16Var3, zi3Var7, zi3Var8, z5, kw5Var5, t17Var3, tj3Var, i10 & 268435454);
                    e16Var2 = e16Var3;
                    zi3Var6 = zi3Var7;
                    zi3Var5 = zi3Var8;
                    z4 = z5;
                    kw5Var2 = kw5Var5;
                    t17Var2 = t17Var3;
                } else {
                    tj3Var = tj3Var2;
                    tj3Var.m22102U();
                    e16Var2 = e16Var;
                    t17Var2 = t17Var;
                    zi3Var6 = zi3Var4;
                    z4 = z2;
                    kw5Var2 = kw5Var;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new C2966ej(zi3Var, ui3Var, e16Var2, zi3Var6, zi3Var5, z4, kw5Var2, t17Var2, i, i2);
                }
            }
            i11 |= 24576;
            zi3Var5 = zi3Var3;
            i6 = i2 & 32;
            if (i6 != 0) {
                i8 = i11 | 196608;
                z2 = z;
            } else {
                z2 = z;
                if (tj3Var2.m22122h(z2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i8 = i11 | i7;
            }
            i9 = i8 | 113770496;
            if ((38347923 & i9) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i9 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        zi3Var4 = null;
                    }
                    if (i4 != 0) {
                        zi3Var5 = null;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    float f2 = iw5.f44705a;
                    pa1Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a;
                    kw5Var3 = pa1Var.f55861j0;
                    if (kw5Var3 == null) {
                        kw5Var4 = new kw5(ra1.m20491d(pa1Var, fg5.f39058n), ra1.m20491d(pa1Var, fg5.f39060p), ra1.m20491d(pa1Var, fg5.f39041D), aa1.m198b(fg5.f39049e, ra1.m20491d(pa1Var, fg5.f39048d)), aa1.m198b(fg5.f39051g, ra1.m20491d(pa1Var, fg5.f39050f)), aa1.m198b(fg5.f39057m, ra1.m20491d(pa1Var, fg5.f39056l)));
                        pa1Var.f55861j0 = kw5Var4;
                    } else {
                        kw5Var4 = kw5Var3;
                    }
                    i10 = i9 & (-3670017);
                    t17Var3 = iw5.f44706b;
                    kw5Var5 = kw5Var4;
                    e16Var3 = b16.f7762a;
                } else {
                    if (i12 != 0) {
                        zi3Var4 = null;
                    }
                    if (i4 != 0) {
                        zi3Var5 = null;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    float f3 = iw5.f44705a;
                    pa1Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a;
                    kw5Var3 = pa1Var.f55861j0;
                    if (kw5Var3 == null) {
                        kw5Var4 = new kw5(ra1.m20491d(pa1Var, fg5.f39058n), ra1.m20491d(pa1Var, fg5.f39060p), ra1.m20491d(pa1Var, fg5.f39041D), aa1.m198b(fg5.f39049e, ra1.m20491d(pa1Var, fg5.f39048d)), aa1.m198b(fg5.f39051g, ra1.m20491d(pa1Var, fg5.f39050f)), aa1.m198b(fg5.f39057m, ra1.m20491d(pa1Var, fg5.f39056l)));
                        pa1Var.f55861j0 = kw5Var4;
                    } else {
                        kw5Var4 = kw5Var3;
                    }
                    i10 = i9 & (-3670017);
                    t17Var3 = iw5.f44706b;
                    kw5Var5 = kw5Var4;
                    e16Var3 = b16.f7762a;
                }
                zi3 zi3Var9 = zi3Var4;
                zi3 zi3Var10 = zi3Var5;
                boolean z6 = z2;
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                tw5.m22327b(zi3Var, ui3Var, e16Var3, zi3Var9, zi3Var10, z6, kw5Var5, t17Var3, tj3Var, i10 & 268435454);
                e16Var2 = e16Var3;
                zi3Var6 = zi3Var9;
                zi3Var5 = zi3Var10;
                z4 = z6;
                kw5Var2 = kw5Var5;
                t17Var2 = t17Var3;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                e16Var2 = e16Var;
                t17Var2 = t17Var;
                zi3Var6 = zi3Var4;
                z4 = z2;
                kw5Var2 = kw5Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new C2966ej(zi3Var, ui3Var, e16Var2, zi3Var6, zi3Var5, z4, kw5Var2, t17Var2, i, i2);
            }
        }
        i11 = i3 | 3456;
        zi3Var4 = zi3Var2;
        i4 = i2 & 16;
        if (i4 != 0) {
            if ((i & 24576) == 0) {
                zi3Var5 = zi3Var3;
                if (tj3Var2.m22124i(zi3Var5)) {
                    i5 = 16384;
                } else {
                    i5 = 8192;
                }
                i11 |= i5;
            }
            i6 = i2 & 32;
            if (i6 != 0) {
                i8 = i11 | 196608;
                z2 = z;
            } else {
                z2 = z;
                if (tj3Var2.m22122h(z2)) {
                    i7 = 131072;
                } else {
                    i7 = 65536;
                }
                i8 = i11 | i7;
            }
            i9 = i8 | 113770496;
            if ((38347923 & i9) != 38347922) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (tj3Var2.m22099R(i9 & 1, z3)) {
                tj3Var2.m22104W();
                if ((i & 1) != 0) {
                    if (i12 != 0) {
                        zi3Var4 = null;
                    }
                    if (i4 != 0) {
                        zi3Var5 = null;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    float f4 = iw5.f44705a;
                    pa1Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a;
                    kw5Var3 = pa1Var.f55861j0;
                    if (kw5Var3 == null) {
                        kw5Var4 = new kw5(ra1.m20491d(pa1Var, fg5.f39058n), ra1.m20491d(pa1Var, fg5.f39060p), ra1.m20491d(pa1Var, fg5.f39041D), aa1.m198b(fg5.f39049e, ra1.m20491d(pa1Var, fg5.f39048d)), aa1.m198b(fg5.f39051g, ra1.m20491d(pa1Var, fg5.f39050f)), aa1.m198b(fg5.f39057m, ra1.m20491d(pa1Var, fg5.f39056l)));
                        pa1Var.f55861j0 = kw5Var4;
                    } else {
                        kw5Var4 = kw5Var3;
                    }
                    i10 = i9 & (-3670017);
                    t17Var3 = iw5.f44706b;
                    kw5Var5 = kw5Var4;
                    e16Var3 = b16.f7762a;
                } else {
                    if (i12 != 0) {
                        zi3Var4 = null;
                    }
                    if (i4 != 0) {
                        zi3Var5 = null;
                    }
                    if (i6 != 0) {
                        z2 = true;
                    }
                    float f5 = iw5.f44705a;
                    pa1Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a;
                    kw5Var3 = pa1Var.f55861j0;
                    if (kw5Var3 == null) {
                        kw5Var4 = new kw5(ra1.m20491d(pa1Var, fg5.f39058n), ra1.m20491d(pa1Var, fg5.f39060p), ra1.m20491d(pa1Var, fg5.f39041D), aa1.m198b(fg5.f39049e, ra1.m20491d(pa1Var, fg5.f39048d)), aa1.m198b(fg5.f39051g, ra1.m20491d(pa1Var, fg5.f39050f)), aa1.m198b(fg5.f39057m, ra1.m20491d(pa1Var, fg5.f39056l)));
                        pa1Var.f55861j0 = kw5Var4;
                    } else {
                        kw5Var4 = kw5Var3;
                    }
                    i10 = i9 & (-3670017);
                    t17Var3 = iw5.f44706b;
                    kw5Var5 = kw5Var4;
                    e16Var3 = b16.f7762a;
                }
                zi3 zi3Var11 = zi3Var4;
                zi3 zi3Var12 = zi3Var5;
                boolean z7 = z2;
                tj3Var2.m22140r();
                tj3Var = tj3Var2;
                tw5.m22327b(zi3Var, ui3Var, e16Var3, zi3Var11, zi3Var12, z7, kw5Var5, t17Var3, tj3Var, i10 & 268435454);
                e16Var2 = e16Var3;
                zi3Var6 = zi3Var11;
                zi3Var5 = zi3Var12;
                z4 = z7;
                kw5Var2 = kw5Var5;
                t17Var2 = t17Var3;
            } else {
                tj3Var = tj3Var2;
                tj3Var.m22102U();
                e16Var2 = e16Var;
                t17Var2 = t17Var;
                zi3Var6 = zi3Var4;
                z4 = z2;
                kw5Var2 = kw5Var;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new C2966ej(zi3Var, ui3Var, e16Var2, zi3Var6, zi3Var5, z4, kw5Var2, t17Var2, i, i2);
            }
        }
        i11 |= 24576;
        zi3Var5 = zi3Var3;
        i6 = i2 & 32;
        if (i6 != 0) {
            i8 = i11 | 196608;
            z2 = z;
        } else {
            z2 = z;
            if (tj3Var2.m22122h(z2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i8 = i11 | i7;
        }
        i9 = i8 | 113770496;
        if ((38347923 & i9) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (tj3Var2.m22099R(i9 & 1, z3)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0) {
                if (i12 != 0) {
                    zi3Var4 = null;
                }
                if (i4 != 0) {
                    zi3Var5 = null;
                }
                if (i6 != 0) {
                    z2 = true;
                }
                float f6 = iw5.f44705a;
                pa1Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a;
                kw5Var3 = pa1Var.f55861j0;
                if (kw5Var3 == null) {
                    kw5Var4 = new kw5(ra1.m20491d(pa1Var, fg5.f39058n), ra1.m20491d(pa1Var, fg5.f39060p), ra1.m20491d(pa1Var, fg5.f39041D), aa1.m198b(fg5.f39049e, ra1.m20491d(pa1Var, fg5.f39048d)), aa1.m198b(fg5.f39051g, ra1.m20491d(pa1Var, fg5.f39050f)), aa1.m198b(fg5.f39057m, ra1.m20491d(pa1Var, fg5.f39056l)));
                    pa1Var.f55861j0 = kw5Var4;
                } else {
                    kw5Var4 = kw5Var3;
                }
                i10 = i9 & (-3670017);
                t17Var3 = iw5.f44706b;
                kw5Var5 = kw5Var4;
                e16Var3 = b16.f7762a;
            } else {
                if (i12 != 0) {
                    zi3Var4 = null;
                }
                if (i4 != 0) {
                    zi3Var5 = null;
                }
                if (i6 != 0) {
                    z2 = true;
                }
                float f7 = iw5.f44705a;
                pa1Var = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51799a;
                kw5Var3 = pa1Var.f55861j0;
                if (kw5Var3 == null) {
                    kw5Var4 = new kw5(ra1.m20491d(pa1Var, fg5.f39058n), ra1.m20491d(pa1Var, fg5.f39060p), ra1.m20491d(pa1Var, fg5.f39041D), aa1.m198b(fg5.f39049e, ra1.m20491d(pa1Var, fg5.f39048d)), aa1.m198b(fg5.f39051g, ra1.m20491d(pa1Var, fg5.f39050f)), aa1.m198b(fg5.f39057m, ra1.m20491d(pa1Var, fg5.f39056l)));
                    pa1Var.f55861j0 = kw5Var4;
                } else {
                    kw5Var4 = kw5Var3;
                }
                i10 = i9 & (-3670017);
                t17Var3 = iw5.f44706b;
                kw5Var5 = kw5Var4;
                e16Var3 = b16.f7762a;
            }
            zi3 zi3Var13 = zi3Var4;
            zi3 zi3Var14 = zi3Var5;
            boolean z8 = z2;
            tj3Var2.m22140r();
            tj3Var = tj3Var2;
            tw5.m22327b(zi3Var, ui3Var, e16Var3, zi3Var13, zi3Var14, z8, kw5Var5, t17Var3, tj3Var, i10 & 268435454);
            e16Var2 = e16Var3;
            zi3Var6 = zi3Var13;
            zi3Var5 = zi3Var14;
            z4 = z8;
            kw5Var2 = kw5Var5;
            t17Var2 = t17Var3;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            e16Var2 = e16Var;
            t17Var2 = t17Var;
            zi3Var6 = zi3Var4;
            z4 = z2;
            kw5Var2 = kw5Var;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C2966ej(zi3Var, ui3Var, e16Var2, zi3Var6, zi3Var5, z4, kw5Var2, t17Var2, i, i2);
        }
    }
}
