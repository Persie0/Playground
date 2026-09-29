package p000;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ucd {
    /* JADX INFO: renamed from: a */
    public static void m22677a(String str, boolean z) throws ParserException {
        if (!z) {
            throw ParserException.m2516a(null, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m22678b(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case 17:
                        return 336000;
                    case 18:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m22679c(Object obj, Object obj2, int i, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iM23231b = vcd.m23231b(obj);
        int i2 = iM23231b & i;
        int iM22680d = m22680d(i2, obj3);
        if (iM22680d != 0) {
            int i3 = ~i;
            int i4 = iM23231b & i3;
            int i5 = -1;
            while (true) {
                int i6 = iM22680d - 1;
                int i7 = iArr[i6];
                int i8 = i7 & i;
                if ((i7 & i3) != i4 || !ts3.m22281b(obj, objArr[i6]) || (objArr2 != null && !ts3.m22281b(obj2, objArr2[i6]))) {
                    if (i8 == 0) {
                        break;
                    }
                    i5 = i6;
                    iM22680d = i8;
                } else {
                    if (i5 == -1) {
                        m22682f(i2, obj3, i8);
                        return i6;
                    }
                    iArr[i5] = (iArr[i5] & i3) | (i8 & i);
                    return i6;
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public static int m22680d(int i, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i] & 255;
        }
        return obj instanceof short[] ? (char) ((short[]) obj)[i] : ((int[]) obj)[i];
    }

    /* JADX INFO: renamed from: e */
    public static Object m22681e(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            C3386nv.m17626m(ux5.m22988k(i, "must be power of 2 between 2^1 and 2^30: "));
            return null;
        }
        if (i <= 256) {
            return new byte[i];
        }
        return i <= 65536 ? new short[i] : new int[i];
    }

    /* JADX INFO: renamed from: f */
    public static void m22682f(int i, Object obj, int i2) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i] = (byte) i2;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i] = (short) i2;
        } else {
            ((int[]) obj)[i] = i2;
        }
    }
}
