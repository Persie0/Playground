package p502y7;

import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import p173i8.C6205a;

/* JADX INFO: renamed from: y7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10303d {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f51832a = 0;

    static {
        new C10303d();
    }

    /* JADX INFO: renamed from: a */
    public static final void m19298a(C10300a c10300a, C10300a c10300a2) {
        if (C6205a.m12742b(C10303d.class)) {
            return;
        }
        try {
            C5207g.m11111f(c10300a, "x");
            C5207g.m11111f(c10300a2, "b");
            int[] iArr = c10300a.f51815a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            float[] fArr = c10300a.f51817c;
            float[] fArr2 = c10300a2.f51817c;
            if (i10 <= 0) {
                return;
            }
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                if (i11 > 0) {
                    int i15 = 0;
                    while (true) {
                        int i16 = i15 + 1;
                        if (i12 > 0) {
                            int i17 = 0;
                            while (true) {
                                int i18 = i17 + 1;
                                int i19 = (i15 * i12) + (i13 * i11 * i12) + i17;
                                fArr[i19] = fArr[i19] + fArr2[i17];
                                if (i18 >= i12) {
                                    break;
                                } else {
                                    i17 = i18;
                                }
                            }
                        }
                        if (i16 >= i11) {
                            break;
                        } else {
                            i15 = i16;
                        }
                    }
                }
                if (i14 >= i10) {
                    return;
                } else {
                    i13 = i14;
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C10303d.class, th2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final C10300a m19299b(C10300a[] c10300aArr) {
        int i10;
        if (C6205a.m12742b(C10303d.class)) {
            return null;
        }
        int i11 = 0;
        try {
            int i12 = c10300aArr[0].f51815a[0];
            int length = c10300aArr.length - 1;
            if (length >= 0) {
                int i13 = 0;
                i10 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    i10 += c10300aArr[i13].f51815a[1];
                    if (i14 > length) {
                        break;
                    }
                    i13 = i14;
                }
            } else {
                i10 = 0;
            }
            C10300a c10300a = new C10300a(new int[]{i12, i10});
            float[] fArr = c10300a.f51817c;
            if (i12 > 0) {
                int i15 = 0;
                while (true) {
                    int i16 = i15 + 1;
                    int i17 = i15 * i10;
                    int length2 = c10300aArr.length - 1;
                    if (length2 >= 0) {
                        int i18 = i11;
                        while (true) {
                            int i19 = i18 + 1;
                            C10300a c10300a2 = c10300aArr[i18];
                            float[] fArr2 = c10300a2.f51817c;
                            int i20 = c10300a2.f51815a[1];
                            System.arraycopy(fArr2, i15 * i20, fArr, i17, i20);
                            i17 += i20;
                            if (i19 > length2) {
                                break;
                            }
                            i18 = i19;
                        }
                    }
                    if (i16 >= i12) {
                        break;
                    }
                    i15 = i16;
                    i11 = 0;
                }
            }
            return c10300a;
        } catch (Throwable th2) {
            C6205a.m12741a(C10303d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final C10300a m19300c(C10300a c10300a, C10300a c10300a2) {
        Class<C10303d> cls;
        Class<C10303d> cls2;
        C10300a c10300a3;
        Class<C10303d> cls3 = C10303d.class;
        if (C6205a.m12742b(cls3)) {
            return null;
        }
        try {
            C5207g.m11111f(c10300a, "x");
            C5207g.m11111f(c10300a2, "w");
            try {
                int[] iArr = c10300a.f51815a;
                int i10 = 0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = iArr[2];
                int[] iArr2 = c10300a2.f51815a;
                int i14 = iArr2[0];
                int i15 = (i12 - i14) + 1;
                int i16 = iArr2[2];
                C10300a c10300a4 = new C10300a(new int[]{i11, i15, i16});
                float[] fArr = c10300a.f51817c;
                float[] fArr2 = c10300a4.f51817c;
                float[] fArr3 = c10300a2.f51817c;
                if (i11 <= 0) {
                    return c10300a4;
                }
                int i17 = 0;
                while (true) {
                    int i18 = i17 + 1;
                    if (i16 > 0) {
                        int i19 = i10;
                        while (true) {
                            int i20 = i19 + 1;
                            if (i15 > 0) {
                                int i21 = 0;
                                while (true) {
                                    int i22 = i21 + 1;
                                    float f3 = 0.0f;
                                    if (i14 > 0) {
                                        int i23 = 0;
                                        while (true) {
                                            cls2 = cls3;
                                            int i24 = i23 + 1;
                                            if (i13 > 0) {
                                                int i25 = 0;
                                                while (true) {
                                                    c10300a3 = c10300a4;
                                                    int i26 = i25 + 1;
                                                    try {
                                                        f3 = (fArr[((i23 + i21) * i13) + (i12 * i13 * i17) + i25] * fArr3[(((i23 * i13) + i25) * i16) + i19]) + f3;
                                                        if (i26 >= i13) {
                                                            break;
                                                        }
                                                        i25 = i26;
                                                        c10300a4 = c10300a3;
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        cls = cls2;
                                                        C6205a.m12741a(cls, th);
                                                        return null;
                                                    }
                                                }
                                            } else {
                                                c10300a3 = c10300a4;
                                            }
                                            if (i24 >= i14) {
                                                break;
                                            }
                                            i23 = i24;
                                            cls3 = cls2;
                                            c10300a4 = c10300a3;
                                        }
                                    } else {
                                        cls2 = cls3;
                                        c10300a3 = c10300a4;
                                    }
                                    fArr2[(i21 * i16) + (i15 * i16 * i17) + i19] = f3;
                                    if (i22 >= i15) {
                                        break;
                                    }
                                    i21 = i22;
                                    cls3 = cls2;
                                    c10300a4 = c10300a3;
                                }
                            } else {
                                cls2 = cls3;
                                c10300a3 = c10300a4;
                            }
                            if (i20 >= i16) {
                                break;
                            }
                            i19 = i20;
                            cls3 = cls2;
                            c10300a4 = c10300a3;
                        }
                    } else {
                        cls2 = cls3;
                        c10300a3 = c10300a4;
                    }
                    if (i18 >= i11) {
                        return c10300a3;
                    }
                    i17 = i18;
                    cls3 = cls2;
                    c10300a4 = c10300a3;
                    i10 = 0;
                }
            } catch (Throwable th3) {
                th = th3;
                cls2 = cls3;
            }
        } catch (Throwable th4) {
            th = th4;
            cls = cls3;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final C10300a m19301d(C10300a c10300a, C10300a c10300a2, C10300a c10300a3) {
        if (C6205a.m12742b(C10303d.class)) {
            return null;
        }
        try {
            C5207g.m11111f(c10300a, "x");
            C5207g.m11111f(c10300a2, "w");
            C5207g.m11111f(c10300a3, "b");
            int i10 = c10300a.f51815a[0];
            int i11 = c10300a3.f51815a[0];
            C10300a c10300aM19305h = m19305h(c10300a, c10300a2);
            float[] fArr = c10300a3.f51817c;
            float[] fArr2 = c10300aM19305h.f51817c;
            if (i10 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i11 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            int i16 = (i12 * i11) + i14;
                            fArr2[i16] = fArr2[i16] + fArr[i14];
                            if (i15 >= i11) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= i10) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return c10300aM19305h;
        } catch (Throwable th2) {
            C6205a.m12741a(C10303d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static final C10300a m19302e(String[] strArr, C10300a c10300a) {
        if (C6205a.m12742b(C10303d.class)) {
            return null;
        }
        try {
            C5207g.m11111f(c10300a, "w");
            int length = strArr.length;
            int i10 = c10300a.f51815a[1];
            int i11 = 0;
            C10300a c10300a2 = new C10300a(new int[]{length, BuildConfig.SDK_TRUNCATE_LENGTH, i10});
            float[] fArr = c10300a2.f51817c;
            float[] fArr2 = c10300a.f51817c;
            if (length > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    int[] iArrM19312c = C10304e.f51833a.m19312c(strArr[i12]);
                    int i14 = i11;
                    while (true) {
                        int i15 = i14 + 1;
                        System.arraycopy(fArr2, iArrM19312c[i14] * i10, fArr, (i14 * i10) + (i10 * BuildConfig.SDK_TRUNCATE_LENGTH * i12), i10);
                        if (i15 >= 128) {
                            break;
                        }
                        i14 = i15;
                    }
                    if (i13 >= length) {
                        break;
                    }
                    i12 = i13;
                    i11 = 0;
                }
            }
            return c10300a2;
        } catch (Throwable th2) {
            C6205a.m12741a(C10303d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m19303f(C10300a c10300a) {
        int i10;
        if (C6205a.m12742b(C10303d.class)) {
            return;
        }
        try {
            C5207g.m11111f(c10300a, "x");
            int[] iArr = c10300a.f51815a;
            if (1 >= iArr.length) {
                return;
            }
            int length = iArr.length;
            if (1 < length) {
                int i11 = 1;
                i10 = 1;
                while (true) {
                    int i12 = i11 + 1;
                    i10 *= c10300a.f51815a[i11];
                    if (i12 >= length) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            } else {
                i10 = 1;
            }
            int[] iArr2 = {c10300a.f51815a[0], i10};
            c10300a.f51815a = iArr2;
            int iM19296a = C10300a.a.m19296a(iArr2);
            float[] fArr = new float[iM19296a];
            System.arraycopy(c10300a.f51817c, 0, fArr, 0, Math.min(c10300a.f51816b, iM19296a));
            c10300a.f51817c = fArr;
            c10300a.f51816b = iM19296a;
        } catch (Throwable th2) {
            C6205a.m12741a(C10303d.class, th2);
        }
    }

    /* JADX INFO: renamed from: g */
    public static final C10300a m19304g(C10300a c10300a, int i10) {
        int i11;
        if (C6205a.m12742b(C10303d.class)) {
            return null;
        }
        try {
            C5207g.m11111f(c10300a, "x");
            int[] iArr = c10300a.f51815a;
            int i12 = 0;
            int i13 = iArr[0];
            int i14 = iArr[1];
            int i15 = iArr[2];
            int i16 = (i14 - i10) + 1;
            C10300a c10300a2 = new C10300a(new int[]{i13, i16, i15});
            float[] fArr = c10300a.f51817c;
            float[] fArr2 = c10300a2.f51817c;
            if (i13 > 0) {
                int i17 = 0;
                while (true) {
                    int i18 = i17 + 1;
                    if (i15 > 0) {
                        int i19 = i12;
                        while (true) {
                            int i20 = i19 + 1;
                            if (i16 > 0) {
                                int i21 = i12;
                                while (true) {
                                    int i22 = i21 + 1;
                                    int i23 = i21 * i15;
                                    int i24 = (i17 * i16 * i15) + i23 + i19;
                                    int i25 = (i17 * i14 * i15) + i23 + i19;
                                    fArr2[i24] = Float.MIN_VALUE;
                                    if (i10 > 0) {
                                        int i26 = 0;
                                        while (true) {
                                            int i27 = i26 + 1;
                                            i11 = i14;
                                            fArr2[i24] = Math.max(fArr2[i24], fArr[(i26 * i15) + i25]);
                                            if (i27 >= i10) {
                                                break;
                                            }
                                            i26 = i27;
                                            i14 = i11;
                                        }
                                    } else {
                                        i11 = i14;
                                    }
                                    if (i22 >= i16) {
                                        break;
                                    }
                                    i21 = i22;
                                    i14 = i11;
                                }
                            } else {
                                i11 = i14;
                            }
                            if (i20 >= i15) {
                                break;
                            }
                            i19 = i20;
                            i14 = i11;
                            i12 = 0;
                        }
                    } else {
                        i11 = i14;
                    }
                    if (i18 >= i13) {
                        break;
                    }
                    i17 = i18;
                    i14 = i11;
                    i12 = 0;
                }
            }
            return c10300a2;
        } catch (Throwable th2) {
            C6205a.m12741a(C10303d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static final C10300a m19305h(C10300a c10300a, C10300a c10300a2) {
        if (C6205a.m12742b(C10303d.class)) {
            return null;
        }
        try {
            C5207g.m11111f(c10300a, "x");
            C5207g.m11111f(c10300a2, "w");
            int i10 = 0;
            int i11 = c10300a.f51815a[0];
            int[] iArr = c10300a2.f51815a;
            int i12 = iArr[0];
            int i13 = iArr[1];
            C10300a c10300a3 = new C10300a(new int[]{i11, i13});
            float[] fArr = c10300a.f51817c;
            float[] fArr2 = c10300a2.f51817c;
            float[] fArr3 = c10300a3.f51817c;
            if (i11 > 0) {
                int i14 = 0;
                while (true) {
                    int i15 = i14 + 1;
                    if (i13 > 0) {
                        int i16 = i10;
                        while (true) {
                            int i17 = i16 + 1;
                            int i18 = (i14 * i13) + i16;
                            fArr3[i18] = 0.0f;
                            if (i12 > 0) {
                                int i19 = i10;
                                while (true) {
                                    int i20 = i19 + 1;
                                    fArr3[i18] = (fArr[(i14 * i12) + i19] * fArr2[(i19 * i13) + i16]) + fArr3[i18];
                                    if (i20 >= i12) {
                                        break;
                                    }
                                    i19 = i20;
                                }
                            }
                            if (i17 >= i13) {
                                break;
                            }
                            i16 = i17;
                            i10 = 0;
                        }
                    }
                    if (i15 >= i11) {
                        break;
                    }
                    i14 = i15;
                    i10 = 0;
                }
            }
            return c10300a3;
        } catch (Throwable th2) {
            C6205a.m12741a(C10303d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public static final void m19306i(C10300a c10300a) {
        if (C6205a.m12742b(C10303d.class)) {
            return;
        }
        try {
            C5207g.m11111f(c10300a, "x");
            float[] fArr = c10300a.f51817c;
            int length = fArr.length - 1;
            if (length < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (fArr[i10] < 0.0f) {
                    fArr[i10] = 0.0f;
                }
                if (i11 > length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C10303d.class, th2);
        }
    }

    /* JADX INFO: renamed from: j */
    public static final void m19307j(C10300a c10300a) {
        if (C6205a.m12742b(C10303d.class)) {
            return;
        }
        try {
            C5207g.m11111f(c10300a, "x");
            int[] iArr = c10300a.f51815a;
            int i10 = 0;
            int i11 = iArr[0];
            int i12 = iArr[1];
            float[] fArr = c10300a.f51817c;
            if (i11 <= 0) {
                return;
            }
            while (true) {
                int i13 = i10 + 1;
                int i14 = i10 * i12;
                int i15 = i14 + i12;
                float f3 = Float.MIN_VALUE;
                if (i14 < i15) {
                    int i16 = i14;
                    while (true) {
                        int i17 = i16 + 1;
                        float f10 = fArr[i16];
                        if (f10 > f3) {
                            f3 = f10;
                        }
                        if (i17 >= i15) {
                            break;
                        } else {
                            i16 = i17;
                        }
                    }
                }
                float f11 = 0.0f;
                if (i14 < i15) {
                    int i18 = i14;
                    while (true) {
                        int i19 = i18 + 1;
                        float fExp = (float) Math.exp(fArr[i18] - f3);
                        fArr[i18] = fExp;
                        f11 += fExp;
                        if (i19 >= i15) {
                            break;
                        } else {
                            i18 = i19;
                        }
                    }
                }
                if (i14 < i15) {
                    while (true) {
                        int i20 = i14 + 1;
                        fArr[i14] = fArr[i14] / f11;
                        if (i20 >= i15) {
                            break;
                        } else {
                            i14 = i20;
                        }
                    }
                }
                if (i13 >= i11) {
                    return;
                } else {
                    i10 = i13;
                }
            }
        } catch (Throwable th2) {
            C6205a.m12741a(C10303d.class, th2);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final C10300a m19308k(C10300a c10300a) {
        if (C6205a.m12742b(C10303d.class)) {
            return null;
        }
        try {
            int[] iArr = c10300a.f51815a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            C10300a c10300a2 = new C10300a(new int[]{i11, i10});
            float[] fArr = c10300a.f51817c;
            float[] fArr2 = c10300a2.f51817c;
            if (i10 > 0) {
                int i12 = 0;
                while (true) {
                    int i13 = i12 + 1;
                    if (i11 > 0) {
                        int i14 = 0;
                        while (true) {
                            int i15 = i14 + 1;
                            fArr2[(i14 * i10) + i12] = fArr[(i12 * i11) + i14];
                            if (i15 >= i11) {
                                break;
                            }
                            i14 = i15;
                        }
                    }
                    if (i13 >= i10) {
                        break;
                    }
                    i12 = i13;
                }
            }
            return c10300a2;
        } catch (Throwable th2) {
            C6205a.m12741a(C10303d.class, th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static final C10300a m19309l(C10300a c10300a) {
        if (C6205a.m12742b(C10303d.class)) {
            return null;
        }
        try {
            int[] iArr = c10300a.f51815a;
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            C10300a c10300a2 = new C10300a(new int[]{i12, i11, i10});
            float[] fArr = c10300a.f51817c;
            float[] fArr2 = c10300a2.f51817c;
            if (i10 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (i11 > 0) {
                        int i15 = 0;
                        while (true) {
                            int i16 = i15 + 1;
                            if (i12 > 0) {
                                int i17 = 0;
                                while (true) {
                                    int i18 = i17 + 1;
                                    fArr2[(i15 * i10) + (i17 * i10 * i11) + i13] = fArr[(i15 * i12) + (i13 * i11 * i12) + i17];
                                    if (i18 >= i12) {
                                        break;
                                    }
                                    i17 = i18;
                                }
                            }
                            if (i16 >= i11) {
                                break;
                            }
                            i15 = i16;
                        }
                    }
                    if (i14 >= i10) {
                        break;
                    }
                    i13 = i14;
                }
            }
            return c10300a2;
        } catch (Throwable th2) {
            C6205a.m12741a(C10303d.class, th2);
            return null;
        }
    }
}
