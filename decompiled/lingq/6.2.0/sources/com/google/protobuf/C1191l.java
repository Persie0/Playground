package com.google.protobuf;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.crypto.tink.shaded.protobuf.C1143r;
import p000.fg2;
import p000.lda;
import p000.uk9;
import p000.zga;

/* JADX INFO: renamed from: com.google.protobuf.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1191l {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f13962b = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13963a;

    public /* synthetic */ C1191l(int i) {
        this.f13963a = i;
    }

    /* JADX INFO: renamed from: c */
    public static int m6878c(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            C1191l c1191l = AbstractC1192m.f13964a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return AbstractC1192m.m6885c(i, zga.m25607g(bArr, j));
        }
        if (i2 == 2) {
            return AbstractC1192m.m6886d(i, zga.m25607g(bArr, j), zga.m25607g(bArr, j + 1));
        }
        uk9.m22780o();
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static String m6879d(Context context, String str) {
        lda.m16130p(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = C1143r.m6659e(context);
        }
        int identifier = resources.getIdentifier("google_app_id", "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m6880e(String str, String[] strArr, String[] strArr2) {
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < iMin; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX INFO: renamed from: a */
    public final int m6881a(String str, byte[] bArr, int i, int i2) {
        int i3;
        char cCharAt;
        int i4;
        char cCharAt2;
        long j;
        long j2;
        int i5;
        char cCharAt3;
        char c = 2048;
        char c2 = 57343;
        switch (this.f13963a) {
            case 0:
                int length = str.length();
                int i6 = i2 + i;
                int i7 = 0;
                while (i7 < length) {
                    int i8 = i7 + i;
                    if (i8 >= i6 || (cCharAt2 = str.charAt(i7)) >= 128) {
                        if (i7 == length) {
                            return i + length;
                        }
                        i3 = i + i7;
                        while (i7 < length) {
                            cCharAt = str.charAt(i7);
                            if (cCharAt >= 128 && i3 < i6) {
                                bArr[i3] = (byte) cCharAt;
                                i3++;
                            } else if (cCharAt >= 2048 && i3 <= i6 - 2) {
                                int i9 = i3 + 1;
                                bArr[i3] = (byte) ((cCharAt >>> 6) | 960);
                                i3 += 2;
                                bArr[i9] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                if ((cCharAt < 55296 && 57343 >= cCharAt) || i3 > i6 - 3) {
                                    if (i3 > i6 - 4) {
                                        if (55296 <= cCharAt && cCharAt <= 57343 && ((i4 = i7 + 1) == str.length() || !Character.isSurrogatePair(cCharAt, str.charAt(i4)))) {
                                            throw new Utf8$UnpairedSurrogateException(i7, length);
                                        }
                                        uk9.m22772f(cCharAt, i3);
                                        return 0;
                                    }
                                    int i10 = i7 + 1;
                                    if (i10 != str.length()) {
                                        char cCharAt4 = str.charAt(i10);
                                        if (Character.isSurrogatePair(cCharAt, cCharAt4)) {
                                            int codePoint = Character.toCodePoint(cCharAt, cCharAt4);
                                            bArr[i3] = (byte) ((codePoint >>> 18) | 240);
                                            bArr[i3 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                                            int i11 = i3 + 3;
                                            bArr[i3 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                                            i3 += 4;
                                            bArr[i11] = (byte) ((codePoint & 63) | 128);
                                            i7 = i10;
                                        } else {
                                            i7 = i10;
                                        }
                                    }
                                    throw new Utf8$UnpairedSurrogateException(i7 - 1, length);
                                }
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i12 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i12] = (byte) ((cCharAt & '?') | 128);
                            }
                            i7++;
                        }
                        return i3;
                    }
                    bArr[i8] = (byte) cCharAt2;
                    i7++;
                }
                if (i7 == length) {
                    return i + length;
                }
                i3 = i + i7;
                while (i7 < length) {
                    cCharAt = str.charAt(i7);
                    if (cCharAt >= 128) {
                        if (cCharAt >= 2048) {
                            if (cCharAt < 55296) {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i13 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i13] = (byte) ((cCharAt & '?') | 128);
                            } else {
                                bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                                int i14 = i3 + 2;
                                bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                                i3 += 3;
                                bArr[i14] = (byte) ((cCharAt & '?') | 128);
                            }
                        } else if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i15 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i15] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i16 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i16] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt >= 2048) {
                        if (cCharAt < 55296) {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i17 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i17] = (byte) ((cCharAt & '?') | 128);
                        } else {
                            bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                            int i18 = i3 + 2;
                            bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                            i3 += 3;
                            bArr[i18] = (byte) ((cCharAt & '?') | 128);
                        }
                    } else if (cCharAt < 55296) {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i19 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i19] = (byte) ((cCharAt & '?') | 128);
                    } else {
                        bArr[i3] = (byte) ((cCharAt >>> '\f') | 480);
                        int i110 = i3 + 2;
                        bArr[i3 + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                        i3 += 3;
                        bArr[i110] = (byte) ((cCharAt & '?') | 128);
                    }
                    i7++;
                }
                return i3;
            default:
                long j3 = i;
                long j4 = ((long) i2) + j3;
                int length2 = str.length();
                if (length2 <= i2 && bArr.length - i2 >= i) {
                    int i20 = 0;
                    while (true) {
                        j = 1;
                        if (i20 < length2 && (cCharAt3 = str.charAt(i20)) < 128) {
                            zga.m25611k(bArr, j3, (byte) cCharAt3);
                            i20++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i20 != length2) {
                        while (i20 < length2) {
                            char cCharAt5 = str.charAt(i20);
                            if (cCharAt5 < 128 && j3 < j4) {
                                zga.m25611k(bArr, j3, (byte) cCharAt5);
                                j2 = j;
                                j3 += j;
                            } else if (cCharAt5 >= c || j3 > j4 - 2) {
                                j2 = j;
                                if ((cCharAt5 < 55296 || c2 < cCharAt5) && j3 <= j4 - 3) {
                                    zga.m25611k(bArr, j3, (byte) ((cCharAt5 >>> '\f') | 480));
                                    long j5 = j3 + 2;
                                    zga.m25611k(bArr, j3 + j2, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                                    j3 += 3;
                                    zga.m25611k(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i21 = i20 + 1;
                                        if (i21 != length2) {
                                            char cCharAt6 = str.charAt(i21);
                                            if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                                int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                                zga.m25611k(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                                zga.m25611k(bArr, j3 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                long j6 = j3 + 3;
                                                zga.m25611k(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                j3 += 4;
                                                zga.m25611k(bArr, j6, (byte) ((codePoint2 & 63) | 128));
                                                i20 = i21;
                                            } else {
                                                i20 = i21;
                                            }
                                        }
                                        throw new Utf8$UnpairedSurrogateException(i20 - 1, length2);
                                    }
                                    if (55296 <= cCharAt5 && cCharAt5 <= 57343 && ((i5 = i20 + 1) == length2 || !Character.isSurrogatePair(cCharAt5, str.charAt(i5)))) {
                                        throw new Utf8$UnpairedSurrogateException(i20, length2);
                                    }
                                    fg2.m11820i(cCharAt5, j3);
                                }
                            } else {
                                j2 = j;
                                long j7 = j3 + j2;
                                zga.m25611k(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                                j3 += 2;
                                zga.m25611k(bArr, j7, (byte) ((cCharAt5 & '?') | 128));
                            }
                            i20++;
                            j = j2;
                            c = 2048;
                            c2 = 57343;
                        }
                    }
                    return (int) j3;
                }
                fg2.m11823l(str.charAt(length2 - 1), i + i2);
                return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x008e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x00ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x00af A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:130:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:131:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x00f9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0091  */
    /* JADX WARN: Code duplicated, block: B:40:0x0099  */
    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:65:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f0  */
    /* JADX INFO: renamed from: b */
    public final int m6882b(byte[] bArr, int i, int i2) {
        long j;
        int i3;
        int i4;
        long j2;
        byte bM25607g;
        long j3;
        byte bM25607g2;
        long j4;
        int i5 = i;
        switch (this.f13963a) {
            case 0:
                break;
            default:
                if ((i5 | i2 | (bArr.length - i2)) >= 0) {
                    long j5 = i5;
                    int i6 = (int) (((long) i2) - j5);
                    if (i6 < 16) {
                        j = 1;
                        i3 = 0;
                    } else {
                        int i7 = 8 - (((int) j5) & 7);
                        long j6 = j5;
                        j = 1;
                        i3 = 0;
                        while (true) {
                            if (i3 < i7) {
                                long j7 = j6 + 1;
                                if (zga.m25607g(bArr, j6) >= 0) {
                                    i3++;
                                    j6 = j7;
                                }
                            } else {
                                while (true) {
                                    int i8 = i3 + 8;
                                    if (i8 <= i6) {
                                        if ((zga.f71556c.m23937h(bArr, zga.f71559f + j6) & (-9187201950435737472L)) == 0) {
                                            j6 += 8;
                                            i3 = i8;
                                        }
                                    }
                                }
                                while (true) {
                                    if (i3 < i6) {
                                        long j8 = j6 + 1;
                                        if (zga.m25607g(bArr, j6) >= 0) {
                                            i3++;
                                            j6 = j8;
                                        }
                                    } else {
                                        i3 = i6;
                                    }
                                }
                            }
                        }
                    }
                    int i9 = i6 - i3;
                    long j9 = j5 + ((long) i3);
                    while (true) {
                        byte bM25607g3 = 0;
                        while (i9 > 0) {
                            long j10 = j9 + j;
                            bM25607g3 = zga.m25607g(bArr, j9);
                            if (bM25607g3 >= 0) {
                                i9--;
                                j9 = j10;
                            } else {
                                j9 = j10;
                                if (i9 == 0) {
                                    i4 = i9 - 1;
                                    if (bM25607g3 < -32) {
                                        if (i4 == 0) {
                                            return bM25607g3;
                                        }
                                        i9 -= 2;
                                        if (bM25607g3 >= -62) {
                                            j2 = j9 + j;
                                            if (zga.m25607g(bArr, j9) > -65) {
                                                j9 = j2;
                                            }
                                        }
                                    } else if (bM25607g3 < -16) {
                                        if (i4 < 2) {
                                            return m6878c(bArr, bM25607g3, j9, i4);
                                        }
                                        i9 -= 3;
                                        long j11 = j9 + j;
                                        bM25607g = zga.m25607g(bArr, j9);
                                        if (bM25607g > -65 && ((bM25607g3 != -32 || bM25607g >= -96) && (bM25607g3 != -19 || bM25607g < -96))) {
                                            j9 += 2;
                                            if (zga.m25607g(bArr, j11) > -65) {
                                            }
                                        }
                                    } else {
                                        if (i4 < 3) {
                                            return m6878c(bArr, bM25607g3, j9, i4);
                                        }
                                        i9 -= 4;
                                        j3 = j9 + j;
                                        bM25607g2 = zga.m25607g(bArr, j9);
                                        if (bM25607g2 <= -65) {
                                            if ((((bM25607g2 + 112) + (bM25607g3 << 28)) >> 30) == 0) {
                                                j4 = 2 + j9;
                                                if (zga.m25607g(bArr, j3) <= -65) {
                                                    j9 += 3;
                                                    if (zga.m25607g(bArr, j4) > -65) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (i9 == 0) {
                            i4 = i9 - 1;
                            if (bM25607g3 < -32) {
                                if (i4 == 0) {
                                    return bM25607g3;
                                }
                                i9 -= 2;
                                if (bM25607g3 >= -62) {
                                    j2 = j9 + j;
                                    if (zga.m25607g(bArr, j9) > -65) {
                                        j9 = j2;
                                    }
                                }
                            } else if (bM25607g3 < -16) {
                                if (i4 < 2) {
                                    return m6878c(bArr, bM25607g3, j9, i4);
                                }
                                i9 -= 3;
                                long j12 = j9 + j;
                                bM25607g = zga.m25607g(bArr, j9);
                                if (bM25607g > -65) {
                                }
                            } else {
                                if (i4 < 3) {
                                    return m6878c(bArr, bM25607g3, j9, i4);
                                }
                                i9 -= 4;
                                j3 = j9 + j;
                                bM25607g2 = zga.m25607g(bArr, j9);
                                if (bM25607g2 <= -65) {
                                    if ((((bM25607g2 + 112) + (bM25607g3 << 28)) >> 30) == 0) {
                                        j4 = 2 + j9;
                                        if (zga.m25607g(bArr, j3) <= -65) {
                                            j9 += 3;
                                            if (zga.m25607g(bArr, j4) > -65) {
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return -1;
                }
                uk9.m22777k("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)});
                return 0;
        }
        while (i5 < i2 && bArr[i5] >= 0) {
            i5++;
        }
        if (i5 < i2) {
            while (i5 < i2) {
                int i10 = i5 + 1;
                byte b = bArr[i5];
                if (b < 0) {
                    if (b < -32) {
                        if (i10 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i5 += 2;
                            if (bArr[i10] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (b < -16) {
                        if (i10 >= i2 - 1) {
                            return AbstractC1192m.m6883a(bArr, i10, i2);
                        }
                        int i11 = i5 + 2;
                        byte b2 = bArr[i10];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i5 += 3;
                            if (bArr[i11] > -65) {
                            }
                        }
                        return -1;
                    }
                    if (i10 >= i2 - 2) {
                        return AbstractC1192m.m6883a(bArr, i10, i2);
                    }
                    int i12 = i5 + 2;
                    byte b3 = bArr[i10];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                            int i13 = i5 + 3;
                            if (bArr[i12] <= -65) {
                                i5 += 4;
                                if (bArr[i13] > -65) {
                                }
                            }
                        }
                    }
                    return -1;
                }
                i5 = i10;
            }
        }
        return 0;
    }
}
