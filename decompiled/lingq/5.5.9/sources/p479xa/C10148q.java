package p479xa;

import android.support.v4.media.C0141b;
import java.util.Arrays;

/* JADX INFO: renamed from: xa.q */
/* JADX INFO: loaded from: classes.dex */
public final class C10148q {

    /* JADX INFO: renamed from: a */
    public static final byte[] f51402a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f51403b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f51404c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f51405d = new int[10];

    /* JADX INFO: renamed from: xa.q$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final int f51406a;

        /* JADX INFO: renamed from: b */
        public final boolean f51407b;

        /* JADX INFO: renamed from: c */
        public final int f51408c;

        /* JADX INFO: renamed from: d */
        public final int f51409d;

        /* JADX INFO: renamed from: e */
        public final int[] f51410e;

        /* JADX INFO: renamed from: f */
        public final int f51411f;

        /* JADX INFO: renamed from: g */
        public final float f51412g;

        public a(int i10, boolean z10, int i11, int i12, int[] iArr, int i13, int i14, int i15, float f3) {
            this.f51406a = i10;
            this.f51407b = z10;
            this.f51408c = i11;
            this.f51409d = i12;
            this.f51410e = iArr;
            this.f51411f = i13;
            this.f51412g = f3;
        }
    }

    /* JADX INFO: renamed from: xa.q$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final int f51413a;

        /* JADX INFO: renamed from: b */
        public final boolean f51414b;

        public b(int i10, int i11, boolean z10) {
            this.f51413a = i11;
            this.f51414b = z10;
        }
    }

    /* JADX INFO: renamed from: xa.q$c */
    public static final class c {

        /* JADX INFO: renamed from: a */
        public final int f51415a;

        /* JADX INFO: renamed from: b */
        public final int f51416b;

        /* JADX INFO: renamed from: c */
        public final int f51417c;

        /* JADX INFO: renamed from: d */
        public final int f51418d;

        /* JADX INFO: renamed from: e */
        public final int f51419e;

        /* JADX INFO: renamed from: f */
        public final int f51420f;

        /* JADX INFO: renamed from: g */
        public final float f51421g;

        /* JADX INFO: renamed from: h */
        public final boolean f51422h;

        /* JADX INFO: renamed from: i */
        public final boolean f51423i;

        /* JADX INFO: renamed from: j */
        public final int f51424j;

        /* JADX INFO: renamed from: k */
        public final int f51425k;

        /* JADX INFO: renamed from: l */
        public final int f51426l;

        /* JADX INFO: renamed from: m */
        public final boolean f51427m;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, float f3, boolean z10, boolean z11, int i16, int i17, int i18, boolean z12) {
            this.f51415a = i10;
            this.f51416b = i11;
            this.f51417c = i12;
            this.f51418d = i13;
            this.f51419e = i14;
            this.f51420f = i15;
            this.f51421g = f3;
            this.f51422h = z10;
            this.f51423i = z11;
            this.f51424j = i16;
            this.f51425k = i17;
            this.f51426l = i18;
            this.f51427m = z12;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m19113a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX INFO: renamed from: b */
    public static int m19114b(byte[] bArr, int i10, int i11, boolean[] zArr) {
        boolean z10;
        int i12 = i11 - i10;
        C10129a.m18992d(i12 >= 0);
        if (i12 == 0) {
            return i11;
        }
        if (zArr[0]) {
            m19113a(zArr);
            return i10 - 3;
        }
        if (i12 > 1 && zArr[1] && bArr[i10] == 1) {
            m19113a(zArr);
            return i10 - 2;
        }
        if (i12 > 2 && zArr[2] && bArr[i10] == 0 && bArr[i10 + 1] == 1) {
            m19113a(zArr);
            return i10 - 1;
        }
        int i13 = i11 - 1;
        int i14 = i10 + 2;
        while (i14 < i13) {
            byte b10 = bArr[i14];
            if ((b10 & 254) == 0) {
                int i15 = i14 - 2;
                if (bArr[i15] == 0 && bArr[i14 - 1] == 0 && b10 == 1) {
                    m19113a(zArr);
                    return i15;
                }
                i14 -= 2;
            }
            i14 += 3;
        }
        if (i12 > 2) {
            if (bArr[i11 - 3] == 0 && bArr[i11 - 2] == 0 && bArr[i13] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (i12 == 2) {
            if (zArr[2] && bArr[i11 - 2] == 0 && bArr[i13] == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (zArr[1] && bArr[i13] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr[0] = z10;
        zArr[1] = i12 <= 1 ? zArr[2] && bArr[i13] == 0 : bArr[i11 + (-2)] == 0 && bArr[i13] == 0;
        zArr[2] = bArr[i13] == 0;
        return i11;
    }

    /* JADX INFO: renamed from: c */
    public static a m19115c(byte[] bArr, int i10, int i11) {
        int i12 = 2;
        C10152u c10152u = new C10152u(bArr, i10 + 2, i11);
        c10152u.m19161j(4);
        int iM19156e = c10152u.m19156e(3);
        c10152u.m19160i();
        int iM19156e2 = c10152u.m19156e(2);
        boolean zM19155d = c10152u.m19155d();
        int iM19156e3 = c10152u.m19156e(5);
        int i13 = 0;
        for (int i14 = 0; i14 < 32; i14++) {
            if (c10152u.m19155d()) {
                i13 |= 1 << i14;
            }
        }
        int i15 = 6;
        int[] iArr = new int[6];
        for (int i16 = 0; i16 < 6; i16++) {
            iArr[i16] = c10152u.m19156e(8);
        }
        int iM19156e4 = c10152u.m19156e(8);
        int i17 = 0;
        for (int i18 = 0; i18 < iM19156e; i18++) {
            if (c10152u.m19155d()) {
                i17 += 89;
            }
            if (c10152u.m19155d()) {
                i17 += 8;
            }
        }
        c10152u.m19161j(i17);
        if (iM19156e > 0) {
            c10152u.m19161j((8 - iM19156e) * 2);
        }
        c10152u.m19157f();
        int iM19157f = c10152u.m19157f();
        if (iM19157f == 3) {
            c10152u.m19160i();
        }
        int iM19157f2 = c10152u.m19157f();
        int iM19157f3 = c10152u.m19157f();
        if (c10152u.m19155d()) {
            int iM19157f4 = c10152u.m19157f();
            int iM19157f5 = c10152u.m19157f();
            int iM19157f6 = c10152u.m19157f();
            int iM19157f7 = c10152u.m19157f();
            iM19157f2 -= (iM19157f4 + iM19157f5) * ((iM19157f == 1 || iM19157f == 2) ? 2 : 1);
            iM19157f3 -= (iM19157f6 + iM19157f7) * (iM19157f == 1 ? 2 : 1);
        }
        c10152u.m19157f();
        c10152u.m19157f();
        int iM19157f8 = c10152u.m19157f();
        for (int i19 = c10152u.m19155d() ? 0 : iM19156e; i19 <= iM19156e; i19++) {
            c10152u.m19157f();
            c10152u.m19157f();
            c10152u.m19157f();
        }
        c10152u.m19157f();
        c10152u.m19157f();
        c10152u.m19157f();
        c10152u.m19157f();
        c10152u.m19157f();
        c10152u.m19157f();
        if (c10152u.m19155d() && c10152u.m19155d()) {
            int i20 = 0;
            int i21 = 4;
            while (i20 < i21) {
                int i22 = 0;
                while (i22 < i15) {
                    if (c10152u.m19155d()) {
                        int iMin = Math.min(64, 1 << ((i20 << 1) + 4));
                        if (i20 > 1) {
                            c10152u.m19158g();
                        }
                        for (int i23 = 0; i23 < iMin; i23++) {
                            c10152u.m19158g();
                        }
                    } else {
                        c10152u.m19157f();
                    }
                    i22 += i20 == 3 ? 3 : 1;
                    i15 = 6;
                }
                i20++;
                i21 = 4;
                i15 = 6;
                i12 = 2;
            }
        }
        c10152u.m19161j(i12);
        if (c10152u.m19155d()) {
            c10152u.m19161j(8);
            c10152u.m19157f();
            c10152u.m19157f();
            c10152u.m19160i();
        }
        int iM19157f9 = c10152u.m19157f();
        int i24 = 0;
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i25 = -1;
        boolean z10 = true;
        int i26 = -1;
        while (i24 < iM19157f9) {
            if (i24 == 0 || !c10152u.m19155d()) {
                z10 = false;
            }
            if (z10) {
                int i27 = i25 + i26;
                int iM19157f10 = (1 - ((c10152u.m19155d() ? 1 : 0) * 2)) * (c10152u.m19157f() + 1);
                int i28 = i27 + 1;
                boolean[] zArr = new boolean[i28];
                for (int i29 = 0; i29 <= i27; i29++) {
                    if (c10152u.m19155d()) {
                        zArr[i29] = true;
                    } else {
                        zArr[i29] = c10152u.m19155d();
                    }
                }
                int[] iArr3 = new int[i28];
                int[] iArr4 = new int[i28];
                int i30 = 0;
                for (int i31 = i26 - 1; i31 >= 0; i31--) {
                    int i32 = iArrCopyOf[i31] + iM19157f10;
                    if (i32 < 0 && zArr[i25 + i31]) {
                        iArr3[i30] = i32;
                        i30++;
                    }
                }
                if (iM19157f10 < 0 && zArr[i27]) {
                    iArr3[i30] = iM19157f10;
                    i30++;
                }
                int i33 = i30;
                for (int i34 = 0; i34 < i25; i34++) {
                    int i35 = iArr2[i34] + iM19157f10;
                    if (i35 < 0 && zArr[i34]) {
                        iArr3[i33] = i35;
                        i33++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr3, i33);
                int i36 = 0;
                for (int i37 = i25 - 1; i37 >= 0; i37--) {
                    int i38 = iArr2[i37] + iM19157f10;
                    if (i38 > 0 && zArr[i37]) {
                        iArr4[i36] = i38;
                        i36++;
                    }
                }
                if (iM19157f10 > 0 && zArr[i27]) {
                    iArr4[i36] = iM19157f10;
                    i36++;
                }
                int i39 = i36;
                for (int i40 = 0; i40 < i26; i40++) {
                    int i41 = iArrCopyOf[i40] + iM19157f10;
                    if (i41 > 0 && zArr[i25 + i40]) {
                        iArr4[i39] = i41;
                        i39++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr4, i39);
                i26 = i39;
                i25 = i33;
                iArr2 = iArrCopyOf2;
            } else {
                int iM19157f11 = c10152u.m19157f();
                int iM19157f12 = c10152u.m19157f();
                int[] iArr5 = new int[iM19157f11];
                for (int i42 = 0; i42 < iM19157f11; i42++) {
                    iArr5[i42] = c10152u.m19157f() + 1;
                    c10152u.m19160i();
                }
                int i43 = 1;
                int[] iArr6 = new int[iM19157f12];
                int i44 = 0;
                while (i44 < iM19157f12) {
                    iArr6[i44] = c10152u.m19157f() + i43;
                    c10152u.m19160i();
                    i44++;
                    i43 = 1;
                }
                i25 = iM19157f11;
                i26 = iM19157f12;
                iArr2 = iArr5;
                iArrCopyOf = iArr6;
            }
            i24++;
            z10 = true;
            iM19157f9 = iM19157f9;
            iM19157f2 = iM19157f2;
            iM19156e4 = iM19156e4;
            iM19156e3 = iM19156e3;
            iArr = iArr;
            i13 = i13;
        }
        int i45 = iM19156e3;
        int i46 = i13;
        int[] iArr7 = iArr;
        int i47 = iM19156e4;
        int i48 = iM19157f2;
        if (c10152u.m19155d()) {
            for (int i49 = 0; i49 < c10152u.m19157f(); i49++) {
                c10152u.m19161j(iM19157f8 + 4 + 1);
            }
        }
        c10152u.m19161j(2);
        float f3 = 1.0f;
        if (c10152u.m19155d()) {
            if (c10152u.m19155d()) {
                int iM19156e5 = c10152u.m19156e(8);
                if (iM19156e5 == 255) {
                    int iM19156e6 = c10152u.m19156e(16);
                    int iM19156e7 = c10152u.m19156e(16);
                    if (iM19156e6 != 0 && iM19156e7 != 0) {
                        f3 = iM19156e6 / iM19156e7;
                    }
                } else if (iM19156e5 < 17) {
                    f3 = f51403b[iM19156e5];
                } else {
                    C0141b.m620p("Unexpected aspect_ratio_idc value: ", iM19156e5, "NalUnitUtil");
                }
            }
            if (c10152u.m19155d()) {
                c10152u.m19160i();
            }
            if (c10152u.m19155d()) {
                c10152u.m19161j(4);
                if (c10152u.m19155d()) {
                    c10152u.m19161j(24);
                }
            }
            if (c10152u.m19155d()) {
                c10152u.m19157f();
                c10152u.m19157f();
            }
            c10152u.m19160i();
            if (c10152u.m19155d()) {
                iM19157f3 *= 2;
            }
        }
        return new a(iM19156e2, zM19155d, i45, i46, iArr7, i47, i48, iM19157f3, f3);
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0106  */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:69:0x0128  */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0131  */
    /* JADX WARN: Code duplicated, block: B:73:0x0136  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Code duplicated, block: B:94:0x018d  */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x012b, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public static c m19116d(byte[] bArr, int i10, int i11) {
        int iM19157f;
        boolean z10;
        int iM19157f2;
        boolean z11;
        int i12;
        boolean zM19155d;
        int i13;
        int i14;
        int i15;
        float f3;
        float f10;
        int i16;
        int i17;
        C10152u c10152u = new C10152u(bArr, i10 + 1, i11);
        int iM19156e = c10152u.m19156e(8);
        int iM19156e2 = c10152u.m19156e(8);
        int iM19156e3 = c10152u.m19156e(8);
        int iM19157f3 = c10152u.m19157f();
        if (iM19156e == 100 || iM19156e == 110 || iM19156e == 122 || iM19156e == 244 || iM19156e == 44 || iM19156e == 83 || iM19156e == 86 || iM19156e == 118 || iM19156e == 128 || iM19156e == 138) {
            iM19157f = c10152u.m19157f();
            boolean zM19155d2 = iM19157f == 3 ? c10152u.m19155d() : false;
            c10152u.m19157f();
            c10152u.m19157f();
            c10152u.m19160i();
            if (c10152u.m19155d()) {
                int i18 = iM19157f != 3 ? 8 : 12;
                int i19 = 0;
                while (i19 < i18) {
                    if (c10152u.m19155d()) {
                        int i20 = i19 < 6 ? 16 : 64;
                        int iM19158g = 8;
                        int i21 = 8;
                        for (int i22 = 0; i22 < i20; i22++) {
                            if (iM19158g != 0) {
                                iM19158g = ((c10152u.m19158g() + i21) + 256) % 256;
                            }
                            if (iM19158g != 0) {
                                i21 = iM19158g;
                            }
                        }
                    }
                    i19++;
                }
            }
            z10 = zM19155d2;
        } else {
            iM19157f = 1;
            z10 = false;
        }
        int iM19157f4 = c10152u.m19157f() + 4;
        int iM19157f5 = c10152u.m19157f();
        if (iM19157f5 != 0) {
            if (iM19157f5 == 1) {
                boolean zM19155d3 = c10152u.m19155d();
                c10152u.m19158g();
                c10152u.m19158g();
                long jM19157f = c10152u.m19157f();
                for (int i23 = 0; i23 < jM19157f; i23++) {
                    c10152u.m19157f();
                }
                z11 = zM19155d3;
                i12 = 0;
            } else {
                iM19157f2 = 0;
            }
            c10152u.m19157f();
            c10152u.m19160i();
            int iM19157f6 = c10152u.m19157f() + 1;
            int iM19157f7 = c10152u.m19157f() + 1;
            zM19155d = c10152u.m19155d();
            i13 = 2 - (zM19155d ? 1 : 0);
            int i24 = iM19157f7 * i13;
            if (!zM19155d) {
                c10152u.m19160i();
            }
            c10152u.m19160i();
            i14 = iM19157f6 * 16;
            i15 = i24 * 16;
            if (c10152u.m19155d()) {
                int iM19157f8 = c10152u.m19157f();
                int iM19157f9 = c10152u.m19157f();
                int iM19157f10 = c10152u.m19157f();
                int iM19157f11 = c10152u.m19157f();
                if (iM19157f == 0) {
                    i17 = 1;
                } else {
                    if (iM19157f == 3) {
                        i16 = 1;
                    } else {
                        i16 = 2;
                    }
                    i13 *= iM19157f != 1 ? 1 : 2;
                    i17 = i16;
                }
                i14 -= (iM19157f8 + iM19157f9) * i17;
                i15 -= (iM19157f10 + iM19157f11) * i13;
            }
            int i25 = i15;
            int i26 = i14;
            if (c10152u.m19155d() || !c10152u.m19155d()) {
                f3 = 1.0f;
                f10 = f3;
            } else {
                int iM19156e4 = c10152u.m19156e(8);
                if (iM19156e4 == 255) {
                    int iM19156e5 = c10152u.m19156e(16);
                    int iM19156e6 = c10152u.m19156e(16);
                    if (iM19156e5 != 0 && iM19156e6 != 0) {
                        f10 = iM19156e5 / iM19156e6;
                    }
                } else {
                    if (iM19156e4 < 17) {
                        f3 = f51403b[iM19156e4];
                    } else {
                        C0141b.m620p("Unexpected aspect_ratio_idc value: ", iM19156e4, "NalUnitUtil");
                    }
                    f10 = f3;
                }
                f3 = 1.0f;
                f10 = f3;
            }
            return new c(iM19156e, iM19156e2, iM19156e3, iM19157f3, i26, i25, f10, z10, zM19155d, iM19157f4, iM19157f5, i12, z11);
        }
        iM19157f2 = c10152u.m19157f() + 4;
        z11 = false;
        i12 = iM19157f2;
        c10152u.m19157f();
        c10152u.m19160i();
        int iM19157f12 = c10152u.m19157f() + 1;
        int iM19157f13 = c10152u.m19157f() + 1;
        zM19155d = c10152u.m19155d();
        i13 = 2 - (zM19155d ? 1 : 0);
        int i27 = iM19157f13 * i13;
        if (!zM19155d) {
            c10152u.m19160i();
        }
        c10152u.m19160i();
        i14 = iM19157f12 * 16;
        i15 = i27 * 16;
        if (c10152u.m19155d()) {
            int iM19157f14 = c10152u.m19157f();
            int iM19157f15 = c10152u.m19157f();
            int iM19157f16 = c10152u.m19157f();
            int iM19157f17 = c10152u.m19157f();
            if (iM19157f == 0) {
                i17 = 1;
            } else {
                if (iM19157f == 3) {
                    i16 = 1;
                } else {
                    i16 = 2;
                }
                i13 *= iM19157f != 1 ? 1 : 2;
                i17 = i16;
            }
            i14 -= (iM19157f14 + iM19157f15) * i17;
            i15 -= (iM19157f16 + iM19157f17) * i13;
        }
        int i28 = i15;
        int i29 = i14;
        if (c10152u.m19155d()) {
            f3 = 1.0f;
            f10 = f3;
        } else {
            f3 = 1.0f;
            f10 = f3;
        }
        return new c(iM19156e, iM19156e2, iM19156e3, iM19157f3, i29, i28, f10, z10, zM19155d, iM19157f4, iM19157f5, i12, z11);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static int m19117e(byte[] bArr, int i10) {
        int i11;
        synchronized (f51404c) {
            int i12 = 0;
            int i13 = 0;
            loop0: while (true) {
                while (true) {
                    if (i12 >= i10) {
                        break loop0;
                    }
                    while (true) {
                        if (i12 >= i10 - 2) {
                            i12 = i10;
                            break;
                        }
                        try {
                            if (bArr[i12] == 0 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 3) {
                                break;
                            }
                            i12++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    if (i12 < i10) {
                        int[] iArr = f51405d;
                        if (iArr.length <= i13) {
                            f51405d = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        f51405d[i13] = i12;
                        i12 += 3;
                        i13++;
                    }
                    throw th2;
                }
            }
            i11 = i10 - i13;
            int i14 = 0;
            int i15 = 0;
            for (int i16 = 0; i16 < i13; i16++) {
                int i17 = f51405d[i16] - i15;
                System.arraycopy(bArr, i15, bArr, i14, i17);
                int i18 = i14 + i17;
                int i19 = i18 + 1;
                bArr[i18] = 0;
                i14 = i19 + 1;
                bArr[i19] = 0;
                i15 += i17 + 3;
            }
            System.arraycopy(bArr, i15, bArr, i14, i11 - i14);
        }
        return i11;
    }
}
