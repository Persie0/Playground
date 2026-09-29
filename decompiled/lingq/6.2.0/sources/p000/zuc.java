package p000;

import androidx.media3.common.C0713b;
import com.google.common.collect.ImmutableList;
import com.lingq.core.database.entity.CardEntity;
import com.lingq.core.network.api.result.CardLessonTransliteration;
import com.lingq.core.network.api.result.ResultTokenMeaning;
import com.lingq.core.network.api.result.ResultVocabularyCard;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zuc {

    /* JADX INFO: renamed from: a */
    public static final byte[] f72211a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f72212b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f72213c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f72214d = new int[10];

    /* JADX INFO: renamed from: a */
    public static void m25793a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: b */
    public static int m25794b(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        bna.m3987z(i3 >= 0);
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m25793a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m25793a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m25793a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m25793a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX INFO: renamed from: c */
    public static String m25795c(C0713b c0713b) {
        String str = c0713b.f6406o;
        String str2 = c0713b.f6402k;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (str2.startsWith("dva1") || str2.startsWith("dvav")) {
                return "video/avc";
            }
            if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                return "video/hevc";
            }
        }
        return c0713b.f6406o;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m25796d(byte[] bArr, int i, C0713b c0713b) {
        int i2;
        if (Objects.equals(c0713b.f6406o, "video/avc")) {
            byte b = bArr[4];
            if (((b & 96) >> 5) == 0 && ((i2 = b & 31) == 1 || i2 == 9 || i2 == 14)) {
                return false;
            }
        } else if (Objects.equals(c0713b.f6406o, "video/hevc")) {
            C3283l2 c3283l2M25798f = m25798f(new l47(bArr, 4, i + 4));
            int i3 = c3283l2M25798f.f48908a;
            if (i3 == 35) {
                return false;
            }
            if (i3 <= 14 && i3 % 2 == 0 && c3283l2M25798f.f48910c == c0713b.f6380F - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static int m25797e(C0713b c0713b) {
        String strM25795c = m25795c(c0713b);
        if (Objects.equals(strM25795c, "video/avc")) {
            return 1;
        }
        return (Objects.equals(strM25795c, "video/hevc") || Objects.equals(strM25795c, "video/vvc")) ? 2 : 0;
    }

    /* JADX INFO: renamed from: f */
    public static C3283l2 m25798f(l47 l47Var) {
        l47Var.m15787i();
        return new C3283l2(l47Var.m15783e(6), l47Var.m15783e(6), l47Var.m15783e(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static g76 m25799g(l47 l47Var, boolean z, int i, g76 g76Var) {
        int[] iArr;
        int i2;
        boolean z2;
        int i3;
        int i4;
        boolean zM15782d;
        int iM15783e;
        int i5;
        int i6;
        int[] iArr2 = new int[6];
        if (!z) {
            if (g76Var != null) {
                int i7 = g76Var.f40325a;
                zM15782d = g76Var.f40326b;
                iM15783e = g76Var.f40327c;
                i5 = g76Var.f40328d;
                iArr2 = g76Var.f40329e;
                i2 = i7;
            } else {
                iArr = iArr2;
                i2 = 0;
                z2 = false;
                i3 = 0;
                i4 = 0;
            }
            int iM15783e2 = l47Var.m15783e(8);
            i6 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                if (l47Var.m15782d()) {
                    i6 += 88;
                }
                if (l47Var.m15782d()) {
                    i6 += 8;
                }
            }
            l47Var.m15788j(i6);
            if (i > 0) {
                l47Var.m15788j((8 - i) * 2);
            }
            return new g76(i2, z2, i3, i4, iArr, iM15783e2);
        }
        int iM15783e3 = l47Var.m15783e(2);
        zM15782d = l47Var.m15782d();
        iM15783e = l47Var.m15783e(5);
        i5 = 0;
        for (int i9 = 0; i9 < 32; i9++) {
            if (l47Var.m15782d()) {
                i5 |= 1 << i9;
            }
        }
        for (int i10 = 0; i10 < 6; i10++) {
            iArr2[i10] = l47Var.m15783e(8);
        }
        i2 = iM15783e3;
        iArr = iArr2;
        z2 = zM15782d;
        i3 = iM15783e;
        i4 = i5;
        int iM15783e4 = l47Var.m15783e(8);
        i6 = 0;
        while (i8 < i) {
            if (l47Var.m15782d()) {
                i6 += 88;
            }
            if (l47Var.m15782d()) {
                i6 += 8;
            }
        }
        l47Var.m15788j(i6);
        if (i > 0) {
            l47Var.m15788j((8 - i) * 2);
        }
        return new g76(i2, z2, i3, i4, iArr, iM15783e4);
    }

    /* JADX INFO: renamed from: h */
    public static cp3 m25800h(byte[] bArr, int i, int i2) {
        byte b;
        int i3 = i + 2;
        int i4 = 1;
        int i5 = i2 - 1;
        while (true) {
            b = bArr[i5];
            if (b != 0 || i5 <= i3) {
                break;
            }
            i5--;
        }
        if (b == 0 || i5 <= i3) {
            return null;
        }
        l47 l47Var = new l47(bArr, i3, i5 + 1);
        while (l47Var.m15780b(16)) {
            int iM15783e = l47Var.m15783e(8);
            int i6 = 0;
            while (iM15783e == 255) {
                i6 += 255;
                iM15783e = l47Var.m15783e(8);
            }
            int i7 = i6 + iM15783e;
            int iM15783e2 = l47Var.m15783e(8);
            int i8 = 0;
            while (iM15783e2 == 255) {
                i8 += 255;
                iM15783e2 = l47Var.m15783e(8);
            }
            int i9 = i8 + iM15783e2;
            if (i9 == 0 || !l47Var.m15780b(i9)) {
                return null;
            }
            if (i7 == 176) {
                int iM15784f = l47Var.m15784f();
                boolean zM15782d = l47Var.m15782d();
                int iM15784f2 = zM15782d ? l47Var.m15784f() : 0;
                int iM15784f3 = l47Var.m15784f();
                int iM15784f4 = -1;
                for (int i10 = 0; i10 <= iM15784f3; i10++) {
                    iM15784f4 = l47Var.m15784f();
                    l47Var.m15784f();
                    int iM15783e3 = l47Var.m15783e(6);
                    if (iM15783e3 == 63) {
                        return null;
                    }
                    l47Var.m15783e(iM15783e3 == 0 ? Math.max(0, iM15784f - 30) : Math.max(0, (iM15783e3 + iM15784f) - 31));
                    if (zM15782d) {
                        int iM15783e4 = l47Var.m15783e(6);
                        if (iM15783e4 == 63) {
                            return null;
                        }
                        l47Var.m15783e(iM15783e4 == 0 ? Math.max(0, iM15784f2 - 30) : Math.max(0, (iM15783e4 + iM15784f2) - 31));
                    }
                    if (l47Var.m15782d()) {
                        l47Var.m15788j(10);
                    }
                }
                return new cp3(iM15784f4, i4);
            }
            l47Var.m15788j(i9 * 8);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004a  */
    /* JADX WARN: Code duplicated, block: B:202:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    public static j76 m25801i(byte[] bArr, int i, int i2, C3329mb c3329mb) {
        int i3;
        int i4;
        int i5;
        int i6;
        int iM15784f;
        int i7;
        int iM15784f2;
        int i8;
        int i9;
        int iMax;
        int i10;
        int i11;
        int i12;
        int iM12450f;
        int iM12451g;
        int i13;
        h76 h76Var;
        h76 h76Var2;
        C3283l2 c3283l2M25798f = m25798f(new l47(bArr, i, i2));
        l47 l47Var = new l47(bArr, i + 2, i2);
        int i14 = 4;
        l47Var.m15788j(4);
        int iM15783e = l47Var.m15783e(3);
        int i15 = c3283l2M25798f.f48909b;
        boolean z = i15 != 0 && iM15783e == 7;
        if (c3329mb != null) {
            ImmutableList immutableList = (ImmutableList) c3329mb.f50860b;
            if (immutableList.isEmpty()) {
                i3 = 0;
            } else {
                i3 = ((f76) immutableList.get(Math.min(i15, immutableList.size() - 1))).f38573a;
            }
        } else {
            i3 = 0;
        }
        g76 g76VarM25799g = null;
        if (!z) {
            l47Var.m15787i();
            g76VarM25799g = m25799g(l47Var, true, iM15783e, null);
        } else if (c3329mb != null) {
            h76 h76Var3 = (h76) c3329mb.f50861c;
            int[] iArr = h76Var3.f41884b;
            ImmutableList immutableList2 = h76Var3.f41883a;
            int i16 = iArr[i3];
            if (immutableList2.size() > i16) {
                g76VarM25799g = (g76) immutableList2.get(i16);
            }
        }
        l47Var.m15784f();
        if (z) {
            int iM15783e2 = l47Var.m15782d() ? l47Var.m15783e(8) : -1;
            if (c3329mb == null || (h76Var2 = (h76) c3329mb.f50862d) == null) {
                iM15784f = 0;
                iM15784f2 = 0;
                i7 = 0;
                i9 = 0;
                i6 = 0;
                i8 = 0;
            } else {
                ImmutableList immutableList3 = h76Var2.f41883a;
                if (iM15783e2 == -1) {
                    iM15783e2 = h76Var2.f41884b[i3];
                }
                if (iM15783e2 == -1 || immutableList3.size() <= iM15783e2) {
                    iM15784f = 0;
                    iM15784f2 = 0;
                    i7 = 0;
                    i9 = 0;
                    i6 = 0;
                    i8 = 0;
                } else {
                    i76 i76Var = (i76) immutableList3.get(iM15783e2);
                    int i17 = i76Var.f43623a;
                    i7 = i76Var.f43626d;
                    int i18 = i76Var.f43627e;
                    iM15784f = i76Var.f43624b;
                    iM15784f2 = i76Var.f43625c;
                    i6 = i18;
                    i8 = i6;
                    i9 = i7;
                }
            }
        } else {
            int iM15784f3 = l47Var.m15784f();
            if (iM15784f3 == 3) {
                l47Var.m15787i();
            }
            int iM15784f4 = l47Var.m15784f();
            int iM15784f5 = l47Var.m15784f();
            if (l47Var.m15782d()) {
                int iM15784f6 = l47Var.m15784f();
                int iM15784f7 = l47Var.m15784f();
                int iM15784f8 = l47Var.m15784f();
                int iM15784f9 = l47Var.m15784f();
                i4 = iM15784f4 - ((iM15784f6 + iM15784f7) * ((iM15784f3 == 1 || iM15784f3 == 2) ? 2 : 1));
                i5 = iM15784f5 - ((iM15784f8 + iM15784f9) * (iM15784f3 == 1 ? 2 : 1));
            } else {
                i4 = iM15784f4;
                i5 = iM15784f5;
            }
            i6 = i5;
            iM15784f = l47Var.m15784f();
            i7 = i4;
            iM15784f2 = l47Var.m15784f();
            i8 = iM15784f5;
            i9 = iM15784f4;
        }
        int iM15784f10 = l47Var.m15784f();
        if (z) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i19 = l47Var.m15782d() ? 0 : iM15783e; i19 <= iM15783e; i19++) {
                l47Var.m15784f();
                iMax = Math.max(l47Var.m15784f(), iMax);
                l47Var.m15784f();
            }
        }
        l47Var.m15784f();
        l47Var.m15784f();
        l47Var.m15784f();
        l47Var.m15784f();
        l47Var.m15784f();
        l47Var.m15784f();
        if (l47Var.m15782d()) {
            int i20 = 6;
            if (z ? l47Var.m15782d() : false) {
                l47Var.m15788j(6);
            } else if (l47Var.m15782d()) {
                int i21 = 0;
                while (i21 < i14) {
                    int i22 = 0;
                    while (i22 < i20) {
                        if (l47Var.m15782d()) {
                            int iMin = Math.min(64, 1 << ((i21 << 1) + 4));
                            if (i21 > 1) {
                                l47Var.m15785g();
                            }
                            for (int i23 = 0; i23 < iMin; i23++) {
                                l47Var.m15785g();
                            }
                        } else {
                            l47Var.m15784f();
                        }
                        i22 += i21 == 3 ? 3 : 1;
                        i20 = 6;
                    }
                    i21++;
                    i14 = 4;
                    i20 = 6;
                }
            }
        }
        l47Var.m15788j(2);
        if (l47Var.m15782d()) {
            l47Var.m15788j(8);
            l47Var.m15784f();
            l47Var.m15784f();
            l47Var.m15787i();
        }
        int iM15784f11 = l47Var.m15784f();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i24 = 0;
        int iM15784f12 = -1;
        int i25 = -1;
        while (i24 < iM15784f11) {
            if (i24 == 0 || !l47Var.m15782d()) {
                int iM15784f13 = l47Var.m15784f();
                iM15784f12 = l47Var.m15784f();
                int[] iArr3 = new int[iM15784f13];
                int i26 = 0;
                while (i26 < iM15784f13) {
                    iArr3[i26] = (i26 > 0 ? iArr3[i26 - 1] : 0) - (l47Var.m15784f() + 1);
                    l47Var.m15787i();
                    i26++;
                }
                int[] iArr4 = new int[iM15784f12];
                int i27 = 0;
                while (i27 < iM15784f12) {
                    iArr4[i27] = l47Var.m15784f() + 1 + (i27 > 0 ? iArr4[i27 - 1] : 0);
                    l47Var.m15787i();
                    i27++;
                }
                i25 = iM15784f13;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i28 = i25 + iM15784f12;
                int iM15784f14 = (1 - ((l47Var.m15782d() ? 1 : 0) * 2)) * (l47Var.m15784f() + 1);
                int i29 = i28 + 1;
                boolean[] zArr = new boolean[i29];
                for (int i30 = 0; i30 <= i28; i30++) {
                    if (l47Var.m15782d()) {
                        zArr[i30] = true;
                    } else {
                        zArr[i30] = l47Var.m15782d();
                    }
                }
                int[] iArr5 = new int[i29];
                int[] iArr6 = new int[i29];
                int i31 = 0;
                for (int i32 = iM15784f12 - 1; i32 >= 0; i32--) {
                    int i33 = iArrCopyOf[i32] + iM15784f14;
                    if (i33 < 0 && zArr[i25 + i32]) {
                        iArr5[i31] = i33;
                        i31++;
                    }
                }
                if (iM15784f14 < 0 && zArr[i28]) {
                    iArr5[i31] = iM15784f14;
                    i31++;
                }
                int i34 = i31;
                int[] iArr7 = iArr2;
                for (int i35 = 0; i35 < i25; i35++) {
                    int i36 = iArr7[i35] + iM15784f14;
                    if (i36 < 0 && zArr[i35]) {
                        iArr5[i34] = i36;
                        i34++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i34);
                int i37 = 0;
                for (int i38 = i25 - 1; i38 >= 0; i38--) {
                    int i39 = iArr7[i38] + iM15784f14;
                    if (i39 > 0 && zArr[i38]) {
                        iArr6[i37] = i39;
                        i37++;
                    }
                }
                if (iM15784f14 > 0 && zArr[i28]) {
                    iArr6[i37] = iM15784f14;
                    i37++;
                }
                int i40 = i34;
                int i41 = i37;
                for (int i42 = 0; i42 < iM15784f12; i42++) {
                    int i43 = iArrCopyOf[i42] + iM15784f14;
                    if (i43 > 0 && zArr[i25 + i42]) {
                        iArr6[i41] = i43;
                        i41++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i41);
                iM15784f12 = i41;
                i25 = i40;
                iArr2 = iArrCopyOf2;
            }
            i24++;
            iM15784f11 = iM15784f11;
            i3 = i3;
        }
        int i44 = i3;
        if (l47Var.m15782d()) {
            int iM15784f15 = l47Var.m15784f();
            for (int i45 = 0; i45 < iM15784f15; i45++) {
                l47Var.m15788j(iM15784f10 + 5);
            }
        }
        l47Var.m15788j(2);
        float f = 1.0f;
        if (l47Var.m15782d()) {
            if (l47Var.m15782d()) {
                int iM15783e3 = l47Var.m15783e(8);
                if (iM15783e3 == 255) {
                    int iM15783e4 = l47Var.m15783e(16);
                    int iM15783e5 = l47Var.m15783e(16);
                    if (iM15783e4 != 0 && iM15783e5 != 0) {
                        f = iM15783e4 / iM15783e5;
                    }
                } else if (iM15783e3 < 17) {
                    f = f72212b[iM15783e3];
                } else {
                    hn1.m13364n("Unexpected aspect_ratio_idc value: ", iM15783e3, "NalUnitUtil");
                }
            }
            if (l47Var.m15782d()) {
                l47Var.m15787i();
            }
            if (l47Var.m15782d()) {
                l47Var.m15788j(3);
                i13 = l47Var.m15782d() ? 1 : 2;
                if (l47Var.m15782d()) {
                    int iM15783e6 = l47Var.m15783e(8);
                    int iM15783e7 = l47Var.m15783e(8);
                    l47Var.m15788j(8);
                    iM12450f = ga1.m12450f(iM15783e6);
                    iM12451g = ga1.m12451g(iM15783e7);
                } else {
                    iM12450f = -1;
                    iM12451g = -1;
                }
            } else if (c3329mb == null || (h76Var = (h76) c3329mb.f50863e) == null) {
                iM12450f = -1;
                iM12451g = -1;
                i13 = -1;
            } else {
                ImmutableList immutableList4 = h76Var.f41883a;
                int i46 = h76Var.f41884b[i44];
                if (immutableList4.size() > i46) {
                    k76 k76Var = (k76) immutableList4.get(i46);
                    int i47 = k76Var.f46814a;
                    int i48 = k76Var.f46815b;
                    iM12451g = k76Var.f46816c;
                    iM12450f = i47;
                    i13 = i48;
                } else {
                    iM12450f = -1;
                    iM12451g = -1;
                    i13 = -1;
                }
            }
            if (l47Var.m15782d()) {
                l47Var.m15784f();
                l47Var.m15784f();
            }
            l47Var.m15787i();
            if (l47Var.m15782d()) {
                i6 *= 2;
            }
            i10 = iM12450f;
            i12 = iM12451g;
            i11 = i13;
        } else {
            i10 = -1;
            i11 = -1;
            i12 = -1;
        }
        return new j76(iM15783e, g76VarM25799g, iM15784f, iM15784f2, i7, i6, i9, i8, f, iMax, i10, i11, i12);
    }

    /* JADX WARN: Code duplicated, block: B:472:0x0159 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0122  */
    /* JADX WARN: Code duplicated, block: B:65:0x0128  */
    /* JADX WARN: Code duplicated, block: B:67:0x012e  */
    /* JADX WARN: Code duplicated, block: B:69:0x013b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:76:0x0153  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static C3329mb m25802j(byte[] bArr, int i, int i2) {
        int[] iArr;
        h76 h76Var;
        int iM15783e;
        int iM15783e2;
        int iM15783e3;
        ImmutableList immutableList;
        boolean[][] zArr;
        int i3;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        int i4;
        boolean zM15782d;
        int i5;
        int i6;
        int i7;
        boolean zM15782d2;
        boolean zM15782d3;
        int iM15784f;
        int i8;
        int i9;
        int i10;
        boolean z;
        boolean z2;
        l47 l47Var = new l47(bArr, i, i2);
        m25798f(l47Var);
        l47Var.m15788j(4);
        boolean zM15782d4 = l47Var.m15782d();
        boolean zM15782d5 = l47Var.m15782d();
        int iM15783e4 = l47Var.m15783e(6);
        int i11 = iM15783e4 + 1;
        int iM15783e5 = l47Var.m15783e(3);
        l47Var.m15788j(17);
        g76 g76VarM25799g = m25799g(l47Var, true, iM15783e5, null);
        for (int i12 = l47Var.m15782d() ? 0 : iM15783e5; i12 <= iM15783e5; i12++) {
            l47Var.m15784f();
            l47Var.m15784f();
            l47Var.m15784f();
        }
        int iM15783e6 = l47Var.m15783e(6);
        int iM15784f2 = l47Var.m15784f() + 1;
        int i13 = 6;
        h76 h76Var2 = new h76(ImmutableList.m6291y(g76VarM25799g), new int[1], 0);
        boolean z3 = i11 >= 2 && iM15784f2 >= 2;
        boolean z4 = zM15782d4 && zM15782d5;
        int i14 = iM15783e6 + 1;
        boolean z5 = i14 >= i11;
        if (!z3 || !z4 || !z5) {
            return new C3329mb(null, h76Var2, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iM15784f2, i14);
        int i15 = 1;
        int[] iArr5 = new int[iM15784f2];
        int[] iArr6 = new int[iM15784f2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i16 = 1; i16 < iM15784f2; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 <= iM15783e6; i18++) {
                if (l47Var.m15782d()) {
                    iArr4[i16][i17] = i18;
                    iArr6[i16] = i18;
                    i17++;
                }
                iArr5[i16] = i17;
            }
        }
        if (l47Var.m15782d()) {
            l47Var.m15788j(64);
            if (l47Var.m15782d()) {
                l47Var.m15784f();
            }
            int iM15784f3 = l47Var.m15784f();
            int i19 = 0;
            while (i19 < iM15784f3) {
                l47Var.m15784f();
                if (i19 == 0 || l47Var.m15782d()) {
                    boolean zM15782d6 = l47Var.m15782d();
                    boolean zM15782d7 = l47Var.m15782d();
                    z2 = zM15782d6;
                    z = zM15782d7;
                    if (zM15782d6 || zM15782d7) {
                        zM15782d = l47Var.m15782d();
                        if (zM15782d) {
                            l47Var.m15788j(19);
                        }
                        l47Var.m15788j(8);
                        if (zM15782d) {
                            l47Var.m15788j(4);
                        }
                        l47Var.m15788j(15);
                        i6 = zM15782d6;
                        i5 = zM15782d7;
                    }
                    i7 = 0;
                    while (i7 <= iM15783e5) {
                        zM15782d2 = l47Var.m15782d();
                        if (!zM15782d2) {
                            zM15782d2 = l47Var.m15782d();
                        }
                        if (zM15782d2) {
                            l47Var.m15784f();
                            zM15782d3 = false;
                        } else {
                            zM15782d3 = l47Var.m15782d();
                        }
                        if (zM15782d3) {
                            iM15784f = 0;
                        } else {
                            iM15784f = l47Var.m15784f();
                        }
                        int[][] iArr7 = iArr4;
                        i8 = i6 + i5;
                        int[] iArr8 = iArr6;
                        i9 = 0;
                        while (i9 < i8) {
                            int i20 = i8;
                            for (i10 = 0; i10 <= iM15784f; i10++) {
                                l47Var.m15784f();
                                l47Var.m15784f();
                                if (zM15782d) {
                                    l47Var.m15784f();
                                    l47Var.m15784f();
                                }
                                l47Var.m15787i();
                            }
                            i9++;
                            i8 = i20;
                        }
                        i7++;
                        i19 = i19;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i19++;
                } else {
                    z2 = false;
                    z = false;
                }
                zM15782d = false;
                i6 = z2;
                i5 = z;
                i7 = 0;
                while (i7 <= iM15783e5) {
                    zM15782d2 = l47Var.m15782d();
                    if (!zM15782d2) {
                        zM15782d2 = l47Var.m15782d();
                    }
                    if (zM15782d2) {
                        l47Var.m15784f();
                        zM15782d3 = false;
                    } else {
                        zM15782d3 = l47Var.m15782d();
                    }
                    if (zM15782d3) {
                        iM15784f = l47Var.m15784f();
                    } else {
                        iM15784f = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i8 = i6 + i5;
                    int[] iArr10 = iArr6;
                    i9 = 0;
                    while (i9 < i8) {
                        int i21 = i8;
                        while (i10 <= iM15784f) {
                            l47Var.m15784f();
                            l47Var.m15784f();
                            if (zM15782d) {
                                l47Var.m15784f();
                                l47Var.m15784f();
                            }
                            l47Var.m15787i();
                        }
                        i9++;
                        i8 = i21;
                    }
                    i7++;
                    i19 = i19;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i19++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!l47Var.m15782d()) {
            return new C3329mb(null, h76Var2, null, null);
        }
        int i22 = l47Var.f49041d;
        if (i22 > 0) {
            l47Var.m15788j(8 - i22);
        }
        g76 g76VarM25799g2 = m25799g(l47Var, false, iM15783e5, g76VarM25799g);
        boolean zM15782d8 = l47Var.m15782d();
        boolean[] zArr3 = new boolean[16];
        int i23 = 0;
        for (int i24 = 0; i24 < 16; i24++) {
            boolean zM15782d9 = l47Var.m15782d();
            zArr3[i24] = zM15782d9;
            if (zM15782d9) {
                i23++;
            }
        }
        if (i23 == 0 || !zArr3[1]) {
            return new C3329mb(null, h76Var2, null, null);
        }
        int[] iArr13 = new int[i23];
        for (int i25 = 0; i25 < i23 - (zM15782d8 ? 1 : 0); i25++) {
            iArr13[i25] = l47Var.m15783e(3);
        }
        int[] iArr14 = new int[i23 + 1];
        if (zM15782d8) {
            int i26 = 1;
            while (i26 < i23) {
                int[] iArr15 = iArr14;
                for (int i27 = 0; i27 < i26; i27++) {
                    iArr15[i26] = iArr13[i27] + 1 + iArr15[i26];
                }
                i26++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i23] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i11, i23);
        int[] iArr17 = new int[i11];
        iArr17[0] = 0;
        boolean zM15782d10 = l47Var.m15782d();
        int i28 = 1;
        while (i28 < i11) {
            if (zM15782d10) {
                i4 = i28;
                iArr17[i4] = l47Var.m15783e(i13);
            } else {
                i4 = i28;
                iArr17[i4] = i4;
            }
            if (zM15782d8) {
                int i29 = 0;
                while (i29 < i23) {
                    int i30 = i29 + 1;
                    iArr16[i4][i29] = (iArr17[i4] & ((1 << iArr[i30]) - 1)) >> iArr[i29];
                    i29 = i30;
                }
            } else {
                int i31 = 0;
                while (i31 < i23) {
                    int i32 = i31;
                    iArr16[i4][i32] = l47Var.m15783e(iArr13[i31] + 1);
                    i31 = i32 + 1;
                }
            }
            i28 = i4 + 1;
            i13 = 6;
        }
        int[] iArr18 = new int[i14];
        int i33 = 1;
        int i34 = 0;
        while (i34 < i11) {
            iArr18[iArr17[i34]] = -1;
            int[] iArr19 = iArr18;
            int i35 = 0;
            int i36 = 0;
            while (i35 < 16) {
                if (zArr3[i35]) {
                    if (i35 == i15) {
                        iArr19[iArr17[i34]] = iArr16[i34][i36];
                    }
                    i36++;
                }
                i35++;
                i15 = 1;
            }
            if (i34 > 0) {
                int i37 = 0;
                while (true) {
                    if (i37 >= i34) {
                        i33++;
                        break;
                    }
                    int i38 = i37;
                    if (iArr19[iArr17[i34]] == iArr19[iArr17[i37]]) {
                        break;
                    }
                    i37 = i38 + 1;
                }
            }
            i34++;
            iArr18 = iArr19;
            i15 = 1;
        }
        int[] iArr20 = iArr18;
        int iM15783e7 = l47Var.m15783e(4);
        if (i33 < 2 || iM15783e7 == 0) {
            return new C3329mb(null, h76Var2, null, null);
        }
        int[] iArr21 = new int[i33];
        for (int i39 = 0; i39 < i33; i39++) {
            iArr21[i39] = l47Var.m15783e(iM15783e7);
        }
        int[] iArr22 = new int[i14];
        for (int i40 = 0; i40 < i11; i40++) {
            iArr22[Math.min(iArr17[i40], iM15783e6)] = i40;
        }
        c14 c14VarM6284m = ImmutableList.m6284m();
        int i41 = 0;
        while (i41 <= iM15783e6) {
            int[] iArr23 = iArr22;
            int i42 = i33;
            int iMin = Math.min(iArr20[i41], i42 - 1);
            c14VarM6284m.m3157b(new f76(iArr23[i41], iMin >= 0 ? iArr21[iMin] : -1));
            i41++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i33 = i42;
        }
        int[] iArr24 = iArr17;
        ImmutableList immutableListM4280g = c14VarM6284m.m4280g();
        if (((f76) immutableListM4280g.get(0)).f38574b == -1) {
            return new C3329mb(null, h76Var2, null, null);
        }
        int i43 = 1;
        while (true) {
            if (i43 > iM15783e6) {
                i43 = -1;
                break;
            }
            if (((f76) immutableListM4280g.get(i43)).f38574b != -1) {
                break;
            }
            i43++;
        }
        if (i43 == -1) {
            return new C3329mb(null, h76Var2, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i11, i11);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i11, i11);
        for (int i44 = 1; i44 < i11; i44++) {
            for (int i45 = 0; i45 < i44; i45++) {
                boolean[] zArr6 = zArr4[i44];
                boolean[] zArr7 = zArr5[i44];
                boolean zM15782d11 = l47Var.m15782d();
                zArr7[i45] = zM15782d11;
                zArr6[i45] = zM15782d11;
            }
        }
        for (int i46 = 1; i46 < i11; i46++) {
            int i47 = 0;
            while (i47 < iM15783e4) {
                boolean[][] zArr8 = zArr4;
                for (int i48 = 0; i48 < i46; i48++) {
                    boolean[] zArr9 = zArr5[i46];
                    if (zArr9[i48] && zArr5[i48][i47]) {
                        zArr9[i47] = true;
                        break;
                    }
                }
                i47++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i14];
        for (int i49 = 0; i49 < i11; i49++) {
            int i50 = 0;
            for (int i51 = 0; i51 < i49; i51++) {
                i50 += zArr10[i49][i51] ? 1 : 0;
            }
            iArr25[iArr24[i49]] = i50;
        }
        int i52 = 0;
        for (int i53 = 0; i53 < i11; i53++) {
            if (iArr25[iArr24[i53]] == 0) {
                i52++;
            }
        }
        if (i52 > 1) {
            return new C3329mb(null, h76Var2, null, null);
        }
        int[] iArr26 = new int[i11];
        int[] iArr27 = new int[iM15784f2];
        if (l47Var.m15782d()) {
            int i54 = 0;
            while (i54 < i11) {
                int i55 = i54;
                iArr26[i55] = l47Var.m15783e(3);
                i54 = i55 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i11, iM15783e5);
        }
        int i56 = 0;
        while (i56 < iM15784f2) {
            int i57 = i56;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i58 = 0; i58 < iArr5[i57]; i58++) {
                iMax = Math.max(iMax, iArr28[((f76) immutableListM4280g.get(iArr11[i57][i58])).f38573a]);
            }
            iArr27[i57] = iMax + 1;
            i56 = i57 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (l47Var.m15782d()) {
            int i59 = 0;
            while (i59 < iM15783e4) {
                int i60 = i59 + 1;
                int i61 = i60;
                while (i61 < i11) {
                    if (zArr10[i61][i59]) {
                        l47Var.m15788j(3);
                    }
                    i61++;
                    iM15783e4 = iM15783e4;
                }
                i59 = i60;
            }
        }
        l47Var.m15787i();
        int iM15784f4 = l47Var.m15784f() + 1;
        c14 c14VarM6284m2 = ImmutableList.m6284m();
        c14VarM6284m2.m3157b(g76VarM25799g);
        if (iM15784f4 > 1) {
            c14VarM6284m2.m3157b(g76VarM25799g2);
            for (int i62 = 2; i62 < iM15784f4; i62++) {
                g76VarM25799g2 = m25799g(l47Var, l47Var.m15782d(), iM15783e5, g76VarM25799g2);
                c14VarM6284m2.m3157b(g76VarM25799g2);
            }
        }
        ImmutableList immutableListM4280g2 = c14VarM6284m2.m4280g();
        int iM15784f5 = l47Var.m15784f() + iM15784f2;
        if (iM15784f5 > iM15784f2) {
            return new C3329mb(null, h76Var2, null, null);
        }
        int iM15783e8 = l47Var.m15783e(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM15784f5, i14);
        int[] iArr29 = new int[iM15784f5];
        int i63 = 0;
        int[] iArr30 = new int[iM15784f5];
        int i64 = 0;
        while (i64 < iM15784f2) {
            iArr29[i64] = i63;
            iArr30[i64] = iArr12[i64];
            if (iM15783e8 == 0) {
                i3 = i64;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i3], i63, iArr5[i3], true);
                iArr2[i3] = iArr5[i3];
            } else {
                i3 = i64;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (iM15783e8 == 1) {
                    int i65 = iArr12[i3];
                    for (int i66 = 0; i66 < iArr5[i3]; i66++) {
                        zArr2[i3][i66] = iArr11[i3][i66] == i65;
                    }
                    iArr2[i3] = 1;
                } else {
                    i63 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i64 = i3 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i63 = 0;
            i64 = i3 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i14];
        int i67 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i14;
        iArr34[i63] = iM15784f5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i68 = 1;
        int i69 = 0;
        while (i68 < iM15784f5) {
            if (iM15783e8 == i67) {
                for (int i70 = 0; i70 < iArr5[i68]; i70++) {
                    zArr14[i68][i70] = l47Var.m15782d();
                    int i71 = iArr31[i68];
                    boolean z6 = zArr14[i68][i70];
                    iArr31[i68] = i71 + (z6 ? 1 : 0);
                    if (z6) {
                        iArr30[i68] = iArr11[i68][i70];
                    }
                }
            }
            if (i69 == 0 && iArr11[i68][0] == 0 && zArr14[i68][0]) {
                for (int i72 = 1; i72 < iArr5[i68]; i72++) {
                    if (iArr11[i68][i72] == i43 && zArr14[i68][i43]) {
                        i69 = i68;
                    }
                }
            }
            int i73 = 0;
            while (i73 < iArr5[i68]) {
                if (iM15784f4 > 1) {
                    zArr15[i68][i73] = zArr14[i68][i73];
                    immutableList = immutableListM4280g2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iM4771c = cj2.m4771c(iM15784f4);
                    if (!zArr[i68][i73]) {
                        int i74 = ((f76) immutableListM4280g.get(iArr11[i68][i73])).f38573a;
                        int i75 = 0;
                        while (i75 < i73) {
                            int i76 = i75;
                            if (zArr12[i74][((f76) immutableListM4280g.get(iArr11[i68][i76])).f38573a]) {
                                zArr[i68][i73] = true;
                                break;
                            }
                            i75 = i76 + 1;
                        }
                    }
                    if (zArr[i68][i73]) {
                        if (i69 <= 0 || i68 != i69) {
                            l47Var.m15788j(iM4771c);
                        } else {
                            iArr33[i73] = l47Var.m15783e(iM4771c);
                        }
                    }
                } else {
                    immutableList = immutableListM4280g2;
                    zArr = zArr15;
                }
                i73++;
                immutableListM4280g2 = immutableList;
                zArr15 = zArr;
            }
            ImmutableList immutableList2 = immutableListM4280g2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i68] == 1 && iArr25[iArr30[i68]] > 0) {
                l47Var.m15787i();
            }
            i68++;
            immutableListM4280g2 = immutableList2;
            zArr15 = zArr16;
            i67 = 2;
        }
        ImmutableList immutableList3 = immutableListM4280g2;
        boolean[][] zArr17 = zArr15;
        if (i69 == 0) {
            return new C3329mb(null, h76Var2, null, null);
        }
        int iM15784f6 = l47Var.m15784f();
        int i77 = iM15784f6 + 1;
        c14 c14VarM6285n = ImmutableList.m6285n(i77);
        int[] iArr35 = new int[i11];
        for (int i78 = 0; i78 < i77; i78++) {
            int iM15783e9 = l47Var.m15783e(16);
            int iM15783e10 = l47Var.m15783e(16);
            if (l47Var.m15782d()) {
                iM15783e = l47Var.m15783e(2);
                if (iM15783e == 3) {
                    l47Var.m15787i();
                }
                iM15783e2 = l47Var.m15783e(4);
                iM15783e3 = l47Var.m15783e(4);
            } else {
                iM15783e = 0;
                iM15783e2 = 0;
                iM15783e3 = 0;
            }
            if (l47Var.m15782d()) {
                int iM15784f7 = l47Var.m15784f();
                int iM15784f8 = l47Var.m15784f();
                int iM15784f9 = l47Var.m15784f();
                int iM15784f10 = l47Var.m15784f();
                iM15783e9 -= (iM15784f7 + iM15784f8) * ((iM15783e == 1 || iM15783e == 2) ? 2 : 1);
                iM15783e10 -= (iM15784f9 + iM15784f10) * (iM15783e == 1 ? 2 : 1);
            }
            c14VarM6285n.m3157b(new i76(iM15783e, iM15783e2, iM15783e3, iM15783e9, iM15783e10));
        }
        if (i77 <= 1 || !l47Var.m15782d()) {
            for (int i79 = 1; i79 < i11; i79++) {
                iArr35[i79] = Math.min(i79, iM15784f6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iM4771c2 = cj2.m4771c(i77);
            for (int i80 = 1; i80 < i11; i80++) {
                iArr35[i80] = l47Var.m15783e(iM4771c2);
            }
        }
        h76 h76Var3 = new h76(c14VarM6285n.m4280g(), iArr35, 1);
        l47Var.m15788j(2);
        for (int i81 = 1; i81 < i11; i81++) {
            if (iArr25[iArr24[i81]] == 0) {
                l47Var.m15787i();
            }
        }
        for (int i82 = 1; i82 < iM15784f5; i82++) {
            boolean zM15782d12 = l47Var.m15782d();
            int i83 = 0;
            while (i83 < iArr32[i82]) {
                if ((i83 <= 0 || !zM15782d12) ? i83 == 0 : l47Var.m15782d()) {
                    for (int i84 = 0; i84 < iArr5[i82]; i84++) {
                        if (zArr17[i82][i84]) {
                            l47Var.m15784f();
                        }
                    }
                    l47Var.m15784f();
                    l47Var.m15784f();
                }
                i83++;
            }
        }
        int iM15784f11 = l47Var.m15784f() + 2;
        if (l47Var.m15782d()) {
            l47Var.m15788j(iM15784f11);
        } else {
            for (int i85 = 1; i85 < i11; i85++) {
                for (int i86 = 0; i86 < i85; i86++) {
                    if (zArr10[i85][i86]) {
                        l47Var.m15788j(iM15784f11);
                    }
                }
            }
        }
        int iM15784f12 = l47Var.m15784f();
        for (int i87 = 1; i87 <= iM15784f12; i87++) {
            l47Var.m15788j(8);
        }
        if (l47Var.m15782d()) {
            int i88 = l47Var.f49041d;
            if (i88 > 0) {
                l47Var.m15788j(8 - i88);
            }
            if (!l47Var.m15782d() ? l47Var.m15782d() : true) {
                l47Var.m15787i();
            }
            boolean zM15782d13 = l47Var.m15782d();
            boolean zM15782d14 = l47Var.m15782d();
            if (zM15782d13 || zM15782d14) {
                for (int i89 = 0; i89 < iM15784f2; i89++) {
                    for (int i90 = 0; i90 < iArr32[i89]; i90++) {
                        boolean zM15782d15 = zM15782d13 ? l47Var.m15782d() : false;
                        boolean zM15782d16 = zM15782d14 ? l47Var.m15782d() : false;
                        if (zM15782d15) {
                            l47Var.m15788j(32);
                        }
                        if (zM15782d16) {
                            l47Var.m15788j(18);
                        }
                    }
                }
            }
            boolean zM15782d17 = l47Var.m15782d();
            int iM15783e11 = zM15782d17 ? l47Var.m15783e(4) + 1 : i11;
            c14 c14VarM6285n2 = ImmutableList.m6285n(iM15783e11);
            int[] iArr36 = new int[i11];
            for (int i91 = 0; i91 < iM15783e11; i91++) {
                l47Var.m15788j(3);
                int i92 = l47Var.m15782d() ? 1 : 2;
                int iM12450f = ga1.m12450f(l47Var.m15783e(8));
                int iM12451g = ga1.m12451g(l47Var.m15783e(8));
                l47Var.m15788j(8);
                c14VarM6285n2.m3157b(new k76(iM12450f, i92, iM12451g));
            }
            if (zM15782d17 && iM15783e11 > 1) {
                for (int i93 = 0; i93 < i11; i93++) {
                    iArr36[i93] = l47Var.m15783e(4);
                }
            }
            h76Var = new h76(c14VarM6285n2.m4280g(), iArr36, 2);
        } else {
            h76Var = null;
        }
        return new C3329mb(immutableListM4280g, new h76(immutableList3, iArr33, 0), h76Var3, h76Var);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ae A[PHI: r19
      0x01ae: PHI (r19v6 float) = (r19v3 float), (r19v9 float), (r19v3 float), (r19v3 float), (r19v10 float) binds: [B:94:0x0190, B:104:0x01b5, B:98:0x01a6, B:99:0x01a8, B:100:0x01aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:114:0x01de  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:122:0x0208  */
    /* JADX WARN: Code duplicated, block: B:125:0x0214  */
    /* JADX WARN: Code duplicated, block: B:128:0x021f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0228  */
    /* JADX WARN: Code duplicated, block: B:134:0x022f  */
    /* JADX WARN: Code duplicated, block: B:137:0x023b  */
    /* JADX WARN: Code duplicated, block: B:139:0x0261  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0140  */
    /* JADX WARN: Code duplicated, block: B:67:0x0143 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0145  */
    /* JADX WARN: Code duplicated, block: B:69:0x0148  */
    /* JADX WARN: Code duplicated, block: B:71:0x014c  */
    /* JADX WARN: Code duplicated, block: B:72:0x014f  */
    /* JADX WARN: Code duplicated, block: B:93:0x018c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    /* JADX INFO: renamed from: k */
    public static m76 m25803k(byte[] bArr, int i, int i2) {
        int iM15784f;
        int iM15784f2;
        int i3;
        boolean z;
        int i4;
        int iM15784f3;
        boolean z2;
        boolean zM15782d;
        int i5;
        int i6;
        int i7;
        int iM15784f4;
        int iM12450f;
        float f;
        int i8;
        int i9;
        int i10;
        float f2;
        int i11;
        int i12;
        int iM12451g;
        boolean zM15782d2;
        boolean zM15782d3;
        int iM15783e;
        int iM15783e2;
        int iM15783e3;
        int i13;
        int i14;
        l47 l47Var = new l47(bArr, i + 1, i2);
        int iM15783e4 = l47Var.m15783e(8);
        int iM15783e5 = l47Var.m15783e(8);
        int iM15783e6 = l47Var.m15783e(8);
        int iM15784f5 = l47Var.m15784f();
        if (iM15783e4 == 100 || iM15783e4 == 110 || iM15783e4 == 122 || iM15783e4 == 244 || iM15783e4 == 44 || iM15783e4 == 83 || iM15783e4 == 86 || iM15783e4 == 118 || iM15783e4 == 128 || iM15783e4 == 138) {
            iM15784f = l47Var.m15784f();
            boolean zM15782d4 = iM15784f == 3 ? l47Var.m15782d() : false;
            int iM15784f6 = l47Var.m15784f();
            iM15784f2 = l47Var.m15784f();
            l47Var.m15787i();
            if (l47Var.m15782d()) {
                int i15 = iM15784f != 3 ? 8 : 12;
                i3 = 16;
                int i16 = 0;
                while (i16 < i15) {
                    if (l47Var.m15782d()) {
                        int i17 = i16 < 6 ? 16 : 64;
                        int iM15785g = 8;
                        int i18 = 8;
                        for (int i19 = 0; i19 < i17; i19++) {
                            if (iM15785g != 0) {
                                iM15785g = ((l47Var.m15785g() + i18) + 256) % 256;
                            }
                            if (iM15785g != 0) {
                                i18 = iM15785g;
                            }
                        }
                    }
                    i16++;
                }
            } else {
                i3 = 16;
            }
            z = zM15782d4;
            i4 = iM15784f6;
        } else {
            iM15784f = 1;
            i3 = 16;
            i4 = 0;
            z = false;
            iM15784f2 = 0;
        }
        int iM15784f7 = l47Var.m15784f() + 4;
        int iM15784f8 = l47Var.m15784f();
        if (iM15784f8 != 0) {
            if (iM15784f8 == 1) {
                boolean zM15782d5 = l47Var.m15782d();
                l47Var.m15785g();
                l47Var.m15785g();
                iM15783e4 = iM15783e4;
                long jM15784f = l47Var.m15784f();
                iM15784f8 = iM15784f8;
                for (int i20 = 0; i20 < jM15784f; i20++) {
                    l47Var.m15784f();
                }
                iM15784f2 = iM15784f2;
                z2 = zM15782d5;
                iM15784f3 = 0;
            } else {
                iM15784f3 = 0;
            }
            l47Var.m15784f();
            l47Var.m15787i();
            int iM15784f9 = l47Var.m15784f() + 1;
            int iM15784f10 = l47Var.m15784f() + 1;
            zM15782d = l47Var.m15782d();
            i5 = 2 - (zM15782d ? 1 : 0);
            int i21 = iM15784f10 * i5;
            if (!zM15782d) {
                l47Var.m15787i();
            }
            l47Var.m15787i();
            i6 = iM15784f9 * 16;
            i7 = i21 * 16;
            if (l47Var.m15782d()) {
                int iM15784f11 = l47Var.m15784f();
                int iM15784f12 = l47Var.m15784f();
                int iM15784f13 = l47Var.m15784f();
                int iM15784f14 = l47Var.m15784f();
                if (iM15784f == 0) {
                    i13 = 1;
                } else {
                    if (iM15784f == 3) {
                        i13 = 1;
                    } else {
                        i13 = 2;
                    }
                    if (iM15784f == 1) {
                        i14 = 2;
                    } else {
                        i14 = 1;
                    }
                    i5 *= i14;
                }
                i6 -= (iM15784f11 + iM15784f12) * i13;
                i7 -= (iM15784f13 + iM15784f14) * i5;
            }
            int i22 = i7;
            int i23 = i6;
            int i24 = iM15783e4;
            iM15784f4 = ((i24 != 44 || i24 == 86 || i24 == 100 || i24 == 110 || i24 == 122 || i24 == 244) && (iM15783e5 & 16) != 0) ? 0 : i3;
            iM12450f = -1;
            f = 1.0f;
            if (l47Var.m15782d()) {
                if (!l47Var.m15782d()) {
                    iM15783e = l47Var.m15783e(8);
                    if (iM15783e == 255) {
                        int i25 = i3;
                        iM15783e2 = l47Var.m15783e(i25);
                        iM15783e3 = l47Var.m15783e(i25);
                        if (iM15783e2 != 0 && iM15783e3 != 0) {
                            f = iM15783e2 / iM15783e3;
                        }
                    } else if (iM15783e < 17) {
                        f = f72212b[iM15783e];
                    } else {
                        hn1.m13364n("Unexpected aspect_ratio_idc value: ", iM15783e, "NalUnitUtil");
                    }
                }
                if (l47Var.m15782d()) {
                    l47Var.m15787i();
                }
                if (l47Var.m15782d()) {
                    l47Var.m15788j(3);
                    if (l47Var.m15782d()) {
                        i12 = 1;
                    } else {
                        i12 = 2;
                    }
                    if (l47Var.m15782d()) {
                        int iM15783e7 = l47Var.m15783e(8);
                        int iM15783e8 = l47Var.m15783e(8);
                        l47Var.m15788j(8);
                        iM12450f = ga1.m12450f(iM15783e7);
                        iM12451g = ga1.m12451g(iM15783e8);
                    } else {
                        iM12451g = -1;
                    }
                } else {
                    i12 = -1;
                    iM12451g = -1;
                }
                if (l47Var.m15782d()) {
                    l47Var.m15784f();
                    l47Var.m15784f();
                }
                if (l47Var.m15782d()) {
                    l47Var.m15788j(65);
                }
                zM15782d2 = l47Var.m15782d();
                if (zM15782d2) {
                    m25804l(l47Var);
                }
                zM15782d3 = l47Var.m15782d();
                if (zM15782d3) {
                    m25804l(l47Var);
                }
                if (zM15782d2 || zM15782d3) {
                    l47Var.m15787i();
                }
                l47Var.m15787i();
                if (l47Var.m15782d()) {
                    l47Var.m15787i();
                    l47Var.m15784f();
                    l47Var.m15784f();
                    l47Var.m15784f();
                    l47Var.m15784f();
                    iM15784f4 = l47Var.m15784f();
                    l47Var.m15784f();
                }
                f2 = f;
                i11 = iM12450f;
                i9 = i12;
                i10 = iM12451g;
                i8 = iM15784f4;
            } else {
                iM15784f7 = iM15784f7;
                i8 = iM15784f4;
                i9 = -1;
                i10 = -1;
                f2 = 1.0f;
                i11 = -1;
            }
            return new m76(i24, iM15783e5, iM15783e6, iM15784f5, i23, i22, f2, i4, iM15784f2, z, zM15782d, iM15784f7, iM15784f8, iM15784f3, z2, i11, i9, i10, i8);
        }
        iM15784f3 = l47Var.m15784f() + 4;
        z2 = false;
        l47Var.m15784f();
        l47Var.m15787i();
        int iM15784f15 = l47Var.m15784f() + 1;
        int iM15784f16 = l47Var.m15784f() + 1;
        zM15782d = l47Var.m15782d();
        i5 = 2 - (zM15782d ? 1 : 0);
        int i26 = iM15784f16 * i5;
        if (!zM15782d) {
            l47Var.m15787i();
        }
        l47Var.m15787i();
        i6 = iM15784f15 * 16;
        i7 = i26 * 16;
        if (l47Var.m15782d()) {
            int iM15784f17 = l47Var.m15784f();
            int iM15784f18 = l47Var.m15784f();
            int iM15784f19 = l47Var.m15784f();
            int iM15784f110 = l47Var.m15784f();
            if (iM15784f == 0) {
                i13 = 1;
            } else {
                if (iM15784f == 3) {
                    i13 = 1;
                } else {
                    i13 = 2;
                }
                if (iM15784f == 1) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                i5 *= i14;
            }
            i6 -= (iM15784f17 + iM15784f18) * i13;
            i7 -= (iM15784f19 + iM15784f110) * i5;
        }
        int i27 = i7;
        int i28 = i6;
        int i29 = iM15783e4;
        if (i29 != 44) {
        }
        iM12450f = -1;
        f = 1.0f;
        if (l47Var.m15782d()) {
            if (!l47Var.m15782d()) {
                iM15783e = l47Var.m15783e(8);
                if (iM15783e == 255) {
                    int i210 = i3;
                    iM15783e2 = l47Var.m15783e(i210);
                    iM15783e3 = l47Var.m15783e(i210);
                    if (iM15783e2 != 0) {
                        f = iM15783e2 / iM15783e3;
                    }
                } else if (iM15783e < 17) {
                    f = f72212b[iM15783e];
                } else {
                    hn1.m13364n("Unexpected aspect_ratio_idc value: ", iM15783e, "NalUnitUtil");
                }
            }
            if (l47Var.m15782d()) {
                l47Var.m15787i();
            }
            if (l47Var.m15782d()) {
                l47Var.m15788j(3);
                if (l47Var.m15782d()) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                if (l47Var.m15782d()) {
                    int iM15783e9 = l47Var.m15783e(8);
                    int iM15783e10 = l47Var.m15783e(8);
                    l47Var.m15788j(8);
                    iM12450f = ga1.m12450f(iM15783e9);
                    iM12451g = ga1.m12451g(iM15783e10);
                } else {
                    iM12451g = -1;
                }
            } else {
                i12 = -1;
                iM12451g = -1;
            }
            if (l47Var.m15782d()) {
                l47Var.m15784f();
                l47Var.m15784f();
            }
            if (l47Var.m15782d()) {
                l47Var.m15788j(65);
            }
            zM15782d2 = l47Var.m15782d();
            if (zM15782d2) {
                m25804l(l47Var);
            }
            zM15782d3 = l47Var.m15782d();
            if (zM15782d3) {
                m25804l(l47Var);
            }
            if (zM15782d2) {
                l47Var.m15787i();
            } else {
                l47Var.m15787i();
            }
            l47Var.m15787i();
            if (l47Var.m15782d()) {
                l47Var.m15787i();
                l47Var.m15784f();
                l47Var.m15784f();
                l47Var.m15784f();
                l47Var.m15784f();
                iM15784f4 = l47Var.m15784f();
                l47Var.m15784f();
            }
            f2 = f;
            i11 = iM12450f;
            i9 = i12;
            i10 = iM12451g;
            i8 = iM15784f4;
        } else {
            iM15784f7 = iM15784f7;
            i8 = iM15784f4;
            i9 = -1;
            i10 = -1;
            f2 = 1.0f;
            i11 = -1;
        }
        return new m76(i29, iM15783e5, iM15783e6, iM15784f5, i28, i27, f2, i4, iM15784f2, z, zM15782d, iM15784f7, iM15784f8, iM15784f3, z2, i11, i9, i10, i8);
    }

    /* JADX INFO: renamed from: l */
    public static void m25804l(l47 l47Var) {
        int iM15784f = l47Var.m15784f() + 1;
        l47Var.m15788j(8);
        for (int i = 0; i < iM15784f; i++) {
            l47Var.m15784f();
            l47Var.m15784f();
            l47Var.m15787i();
        }
        l47Var.m15788j(20);
    }

    /* JADX INFO: renamed from: m */
    public static final CardEntity m25805m(ResultVocabularyCard resultVocabularyCard, String str, boolean z, int i) {
        List list;
        List list2;
        z88 z88Var;
        List list3;
        z88 z88Var2;
        List list4;
        List list5;
        List list6;
        List list7;
        List list8;
        List list9;
        CardLessonTransliteration cardLessonTransliteration = resultVocabularyCard.f21690p;
        int i2 = resultVocabularyCard.f21676b;
        String str2 = resultVocabularyCard.f21675a;
        String str3 = resultVocabularyCard.f21684j;
        List list10 = resultVocabularyCard.f21686l;
        ArrayList arrayList = new ArrayList(v91.m23189q0(list10, 10));
        Iterator it = list10.iterator();
        while (it.hasNext()) {
            arrayList.add(ouc.m18521a((ResultTokenMeaning) it.next()));
        }
        List list11 = resultVocabularyCard.f21687m;
        ArrayList arrayList2 = new ArrayList(v91.m23189q0(list11, 10));
        Iterator it2 = list11.iterator();
        while (it2.hasNext()) {
            String lowerCase = ((String) it2.next()).toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            arrayList2.add(lowerCase);
        }
        List listM22622n1 = u91.m22622n1(u91.m22626r1(arrayList2));
        List list12 = resultVocabularyCard.f21688n;
        ArrayList arrayList3 = new ArrayList(v91.m23189q0(list12, 10));
        Iterator it3 = list12.iterator();
        while (it3.hasNext()) {
            String lowerCase2 = ((String) it3.next()).toLowerCase(Locale.ROOT);
            lowerCase2.getClass();
            arrayList3.add(lowerCase2);
        }
        List listM22622n2 = u91.m22622n1(u91.m22626r1(arrayList3));
        String strM22596N0 = null;
        String strM22596N1 = (cardLessonTransliteration == null || (list9 = cardLessonTransliteration.f20509b) == null) ? null : u91.m22596N0(list9, null, null, null, null, 63);
        String strM22596N2 = (cardLessonTransliteration == null || (list8 = cardLessonTransliteration.f20508a) == null) ? null : u91.m22596N0(list8, null, null, null, null, 63);
        String strM22596N3 = (cardLessonTransliteration == null || (list7 = cardLessonTransliteration.f20510c) == null) ? null : u91.m22596N0(list7, null, null, null, null, 63);
        String strM22596N4 = (cardLessonTransliteration == null || (list6 = cardLessonTransliteration.f20511d) == null) ? null : u91.m22596N0(list6, null, null, null, null, 63);
        String strM22596N5 = (cardLessonTransliteration == null || (list5 = cardLessonTransliteration.f20512e) == null) ? null : u91.m22596N0(list5, null, null, null, null, 63);
        String strM22596N6 = (cardLessonTransliteration == null || (list4 = cardLessonTransliteration.f20513f) == null) ? null : u91.m22596N0(list4, null, null, null, null, 63);
        String str4 = (cardLessonTransliteration == null || (list3 = cardLessonTransliteration.f20514g) == null || (z88Var2 = (z88) u91.m22591I0(list3)) == null) ? null : z88Var2.f71092a;
        String str5 = (cardLessonTransliteration == null || (list2 = cardLessonTransliteration.f20514g) == null || (z88Var = (z88) u91.m22591I0(list2)) == null) ? null : z88Var.f71093b;
        if (cardLessonTransliteration != null && (list = cardLessonTransliteration.f20515h) != null) {
            strM22596N0 = u91.m22596N0(list, null, null, null, null, 63);
        }
        int i3 = resultVocabularyCard.f21679e;
        Integer num = resultVocabularyCard.f21680f;
        return new CardEntity(str2, str, i2, resultVocabularyCard.f21677c, resultVocabularyCard.f21678d, i3, num, resultVocabularyCard.f21681g, resultVocabularyCard.f21682h, resultVocabularyCard.f21683i, str3, i, arrayList, listM22622n1, listM22622n2, strM22596N1, strM22596N2, strM22596N3, strM22596N4, strM22596N5, strM22596N6, str4, str5, strM22596N0, z, resultVocabularyCard.f21691q, 73728);
    }

    /* JADX INFO: renamed from: n */
    public static int m25806n(int i, byte[] bArr) {
        int i2;
        synchronized (f72213c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f72214d;
                    if (iArr.length <= i4) {
                        f72214d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f72214d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f72214d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }
}
