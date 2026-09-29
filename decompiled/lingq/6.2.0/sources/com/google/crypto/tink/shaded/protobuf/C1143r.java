package com.google.crypto.tink.shaded.protobuf;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.R$string;
import java.nio.charset.Charset;
import java.util.Arrays;
import p000.fg2;
import p000.o94;
import p000.qma;
import p000.uk9;
import p000.yga;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.r */
/* JADX INFO: loaded from: classes.dex */
public final class C1143r {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f13626b = 0;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f13627a;

    public /* synthetic */ C1143r(int i) {
        this.f13627a = i;
    }

    /* JADX INFO: renamed from: d */
    public static int m6658d(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            C1143r c1143r = AbstractC1144s.f13628a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return AbstractC1144s.m6665c(i, yga.m25131g(bArr, j));
        }
        if (i2 == 2) {
            return AbstractC1144s.m6666d(i, yga.m25131g(bArr, j), yga.m25131g(bArr, j + 1));
        }
        uk9.m22780o();
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public static String m6659e(Context context) {
        try {
            return context.getResources().getResourcePackageName(R$string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0049  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:2: B:23:0x0054->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:0x004f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:85:0x008d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x006a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x012c A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final String m6660a(byte[] bArr, int i, int i2) {
        int i3;
        byte b;
        int i4;
        byte b2;
        byte b3;
        byte b4;
        switch (this.f13627a) {
            case 0:
                if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
                    uk9.m22777k("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)});
                    return null;
                }
                int i5 = i + i2;
                char[] cArr = new char[i2];
                int i6 = 0;
                while (i < i5) {
                    byte b5 = bArr[i];
                    if (b5 < 0) {
                        while (i < i5) {
                            i3 = i + 1;
                            b = bArr[i];
                            if (b < 0) {
                                i4 = i6 + 1;
                                cArr[i6] = (char) b;
                                while (i3 < i5) {
                                    b2 = bArr[i3];
                                    if (b2 >= 0) {
                                        i3++;
                                        cArr[i4] = (char) b2;
                                        i4++;
                                    } else {
                                        i6 = i4;
                                        i = i3;
                                    }
                                }
                                i6 = i4;
                                i = i3;
                            } else if (b < -32) {
                                if (i3 < i5) {
                                    throw InvalidProtocolBufferException.m6416b();
                                }
                                i += 2;
                                byte b6 = bArr[i3];
                                int i7 = i6 + 1;
                                if (b >= -62 || qma.m20033a(b6)) {
                                    throw InvalidProtocolBufferException.m6416b();
                                }
                                cArr[i6] = (char) ((b6 & 63) | ((b & 31) << 6));
                                i6 = i7;
                            } else {
                                if (b >= -16) {
                                    if (i3 < i5 - 2) {
                                        throw InvalidProtocolBufferException.m6416b();
                                    }
                                    b4 = bArr[i3];
                                    int i8 = i + 3;
                                    byte b7 = bArr[i + 2];
                                    i += 4;
                                    byte b8 = bArr[i8];
                                    int i9 = i6 + 1;
                                    if (!qma.m20033a(b4)) {
                                        if ((((b4 + 112) + (b << 28)) >> 30) != 0 && !qma.m20033a(b7) && !qma.m20033a(b8)) {
                                            int i10 = ((b4 & 63) << 12) | ((b & 7) << 18) | ((b7 & 63) << 6) | (b8 & 63);
                                            cArr[i6] = (char) ((i10 >>> 10) + 55232);
                                            cArr[i9] = (char) ((i10 & 1023) + 56320);
                                            i6 += 2;
                                        }
                                    }
                                    throw InvalidProtocolBufferException.m6416b();
                                }
                                if (i3 < i5 - 1) {
                                    throw InvalidProtocolBufferException.m6416b();
                                }
                                int i11 = i + 2;
                                b3 = bArr[i3];
                                i += 3;
                                byte b9 = bArr[i11];
                                int i12 = i6 + 1;
                                if (!qma.m20033a(b3) || ((b == -32 && b3 < -96) || ((b == -19 && b3 >= -96) || qma.m20033a(b9)))) {
                                    throw InvalidProtocolBufferException.m6416b();
                                }
                                cArr[i6] = (char) (((b3 & 63) << 6) | ((b & 15) << 12) | (b9 & 63));
                                i6 = i12;
                            }
                        }
                        return new String(cArr, 0, i6);
                    }
                    i++;
                    cArr[i6] = (char) b5;
                    i6++;
                }
                while (i < i5) {
                    i3 = i + 1;
                    b = bArr[i];
                    if (b < 0) {
                        if (b < -32) {
                            if (i3 < i5) {
                                throw InvalidProtocolBufferException.m6416b();
                            }
                            i += 2;
                            byte b10 = bArr[i3];
                            int i13 = i6 + 1;
                            if (b >= -62) {
                            }
                            throw InvalidProtocolBufferException.m6416b();
                        }
                        if (b >= -16) {
                            if (i3 < i5 - 1) {
                                throw InvalidProtocolBufferException.m6416b();
                            }
                            int i14 = i + 2;
                            b3 = bArr[i3];
                            i += 3;
                            byte b11 = bArr[i14];
                            int i15 = i6 + 1;
                            if (qma.m20033a(b3)) {
                            }
                            throw InvalidProtocolBufferException.m6416b();
                        }
                        if (i3 < i5 - 2) {
                            throw InvalidProtocolBufferException.m6416b();
                        }
                        b4 = bArr[i3];
                        int i16 = i + 3;
                        byte b12 = bArr[i + 2];
                        i += 4;
                        byte b13 = bArr[i16];
                        int i17 = i6 + 1;
                        if (!qma.m20033a(b4)) {
                            if ((((b4 + 112) + (b << 28)) >> 30) != 0) {
                            }
                        }
                        throw InvalidProtocolBufferException.m6416b();
                    }
                    i4 = i6 + 1;
                    cArr[i6] = (char) b;
                    while (i3 < i5) {
                        b2 = bArr[i3];
                        if (b2 >= 0) {
                            i3++;
                            cArr[i4] = (char) b2;
                            i4++;
                        } else {
                            i6 = i4;
                            i = i3;
                        }
                    }
                    i6 = i4;
                    i = i3;
                }
                return new String(cArr, 0, i6);
            default:
                Charset charset = o94.f54077a;
                String str = new String(bArr, i, i2, charset);
                if (str.contains("�") && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i, i2 + i))) {
                    throw InvalidProtocolBufferException.m6416b();
                }
                return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:68:0x014d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0151  */
    /* JADX WARN: Code duplicated, block: B:71:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX WARN: Code duplicated, block: B:77:0x016a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x0182  */
    /* JADX WARN: Code duplicated, block: B:83:0x0187  */
    /* JADX INFO: renamed from: b */
    public final int m6661b(String str, byte[] bArr, int i, int i2) {
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
        switch (this.f13627a) {
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
                            yga.m25135k(bArr, j3, (byte) cCharAt3);
                            i20++;
                            j3 = 1 + j3;
                        }
                    }
                    if (i20 != length2) {
                        while (i20 < length2) {
                            char cCharAt5 = str.charAt(i20);
                            if (cCharAt5 < 128 && j3 < j4) {
                                yga.m25135k(bArr, j3, (byte) cCharAt5);
                                j2 = j;
                                j3 += j;
                            } else if (cCharAt5 >= c || j3 > j4 - 2) {
                                j2 = j;
                                if ((cCharAt5 < 55296 || c2 < cCharAt5) && j3 <= j4 - 3) {
                                    yga.m25135k(bArr, j3, (byte) ((cCharAt5 >>> '\f') | 480));
                                    long j5 = j3 + 2;
                                    yga.m25135k(bArr, j3 + j2, (byte) (((cCharAt5 >>> 6) & 63) | 128));
                                    j3 += 3;
                                    yga.m25135k(bArr, j5, (byte) ((cCharAt5 & '?') | 128));
                                } else {
                                    if (j3 <= j4 - 4) {
                                        int i21 = i20 + 1;
                                        if (i21 != length2) {
                                            char cCharAt6 = str.charAt(i21);
                                            if (Character.isSurrogatePair(cCharAt5, cCharAt6)) {
                                                int codePoint2 = Character.toCodePoint(cCharAt5, cCharAt6);
                                                yga.m25135k(bArr, j3, (byte) ((codePoint2 >>> 18) | 240));
                                                yga.m25135k(bArr, j3 + j2, (byte) (((codePoint2 >>> 12) & 63) | 128));
                                                long j6 = j3 + 3;
                                                yga.m25135k(bArr, j3 + 2, (byte) (((codePoint2 >>> 6) & 63) | 128));
                                                j3 += 4;
                                                yga.m25135k(bArr, j6, (byte) ((codePoint2 & 63) | 128));
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
                                yga.m25135k(bArr, j3, (byte) ((cCharAt5 >>> 6) | 960));
                                j3 += 2;
                                yga.m25135k(bArr, j7, (byte) ((cCharAt5 & '?') | 128));
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

    /* JADX WARN: Code duplicated, block: B:122:0x0097 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x018e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:129:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0105 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:141:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x009b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00fc  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [int] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14, types: [int] */
    /* JADX WARN: Type inference failed for: r5v16, types: [int] */
    /* JADX WARN: Type inference failed for: r5v2, types: [int] */
    /* JADX WARN: Type inference failed for: r5v21, types: [byte] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX INFO: renamed from: c */
    public boolean m6662c(byte[] bArr, int i, int i2) {
        boolean z;
        ?? M6663a;
        long j;
        int i3;
        int i4;
        long j2;
        byte bM25131g;
        long j3;
        byte bM25131g2;
        long j4;
        int i5 = i;
        switch (this.f13627a) {
            case 0:
                z = false;
                while (i5 < i2 && bArr[i5] >= 0) {
                    i5++;
                }
                if (i5 >= i2) {
                    M6663a = z;
                } else {
                    while (true) {
                        if (i5 >= i2) {
                            M6663a = z;
                        } else {
                            int i6 = i5 + 1;
                            M6663a = bArr[i5];
                            if (M6663a >= 0) {
                                i5 = i6;
                            } else if (M6663a >= -32) {
                                if (M6663a >= -16) {
                                    if (i6 < i2 - 2) {
                                        int i7 = i5 + 2;
                                        int i8 = bArr[i6];
                                        if (i8 <= -65) {
                                            if ((((i8 + 112) + (M6663a << 28)) >> 30) == 0) {
                                                int i9 = i5 + 3;
                                                if (bArr[i7] <= -65) {
                                                    i5 += 4;
                                                    if (bArr[i9] > -65) {
                                                    }
                                                }
                                            }
                                        }
                                        M6663a = -1;
                                    } else {
                                        M6663a = AbstractC1144s.m6663a(bArr, i6, i2);
                                    }
                                } else if (i6 < i2 - 1) {
                                    int i10 = i5 + 2;
                                    byte b = bArr[i6];
                                    if (b <= -65 && ((M6663a != -32 || b >= -96) && (M6663a != -19 || b < -96))) {
                                        i5 += 3;
                                        if (bArr[i10] > -65) {
                                        }
                                    }
                                    M6663a = -1;
                                } else {
                                    M6663a = AbstractC1144s.m6663a(bArr, i6, i2);
                                }
                            } else if (i6 < i2) {
                                if (M6663a >= -62) {
                                    i5 += 2;
                                    if (bArr[i6] > -65) {
                                    }
                                }
                                M6663a = -1;
                            }
                        }
                    }
                }
                break;
            default:
                if ((i5 | i2 | (bArr.length - i2)) >= 0) {
                    long j5 = i5;
                    int i11 = (int) (((long) i2) - j5);
                    if (i11 < 16) {
                        z = false;
                        j = 1;
                        i3 = 0;
                    } else {
                        int i12 = 8 - (((int) j5) & 7);
                        long j6 = j5;
                        j = 1;
                        i3 = 0;
                        while (true) {
                            if (i3 < i12) {
                                long j7 = j6 + 1;
                                if (yga.m25131g(bArr, j6) < 0) {
                                    z = false;
                                } else {
                                    i3++;
                                    j6 = j7;
                                }
                            } else {
                                while (true) {
                                    int i13 = i3 + 8;
                                    if (i13 <= i11) {
                                        z = false;
                                        if ((yga.f69826c.m23275h(bArr, yga.f69829f + j6) & (-9187201950435737472L)) == 0) {
                                            j6 += 8;
                                            i3 = i13;
                                        }
                                    } else {
                                        z = false;
                                    }
                                }
                                while (true) {
                                    if (i3 < i11) {
                                        long j8 = j6 + 1;
                                        if (yga.m25131g(bArr, j6) >= 0) {
                                            i3++;
                                            j6 = j8;
                                        }
                                    } else {
                                        i3 = i11;
                                    }
                                }
                            }
                        }
                    }
                    int i14 = i11 - i3;
                    long j9 = j5 + ((long) i3);
                    while (true) {
                        M6663a = z;
                        while (i14 > 0) {
                            long j10 = j9 + j;
                            M6663a = yga.m25131g(bArr, j9);
                            if (M6663a < 0) {
                                j9 = j10;
                                if (i14 == 0) {
                                    i4 = i14 - 1;
                                    if (M6663a < -32) {
                                        if (M6663a < -16) {
                                            if (i4 < 3) {
                                                i14 -= 4;
                                                j3 = j9 + j;
                                                bM25131g2 = yga.m25131g(bArr, j9);
                                                if (bM25131g2 <= -65) {
                                                    if ((((bM25131g2 + 112) + (M6663a << 28)) >> 30) == 0) {
                                                        j4 = 2 + j9;
                                                        if (yga.m25131g(bArr, j3) <= -65) {
                                                            j9 += 3;
                                                            if (yga.m25131g(bArr, j4) > -65) {
                                                            }
                                                        }
                                                    }
                                                }
                                                M6663a = -1;
                                            } else {
                                                M6663a = m6658d(bArr, M6663a, j9, i4);
                                            }
                                        } else if (i4 < 2) {
                                            i14 -= 3;
                                            long j11 = j9 + j;
                                            bM25131g = yga.m25131g(bArr, j9);
                                            if (bM25131g > -65 && ((M6663a != -32 || bM25131g >= -96) && (M6663a != -19 || bM25131g < -96))) {
                                                j9 += 2;
                                                if (yga.m25131g(bArr, j11) > -65) {
                                                }
                                            }
                                            M6663a = -1;
                                        } else {
                                            M6663a = m6658d(bArr, M6663a, j9, i4);
                                        }
                                    } else if (i4 == 0) {
                                        i14 -= 2;
                                        if (M6663a >= -62) {
                                            j2 = j9 + j;
                                            if (yga.m25131g(bArr, j9) > -65) {
                                                j9 = j2;
                                            }
                                        }
                                        M6663a = -1;
                                    }
                                    break;
                                }
                            } else {
                                i14--;
                                j9 = j10;
                                M6663a = M6663a;
                            }
                        }
                        if (i14 == 0) {
                            i4 = i14 - 1;
                            if (M6663a < -32) {
                                if (M6663a < -16) {
                                    if (i4 < 3) {
                                        i14 -= 4;
                                        j3 = j9 + j;
                                        bM25131g2 = yga.m25131g(bArr, j9);
                                        if (bM25131g2 <= -65) {
                                            if ((((bM25131g2 + 112) + (M6663a << 28)) >> 30) == 0) {
                                                j4 = 2 + j9;
                                                if (yga.m25131g(bArr, j3) <= -65) {
                                                    j9 += 3;
                                                    if (yga.m25131g(bArr, j4) > -65) {
                                                    }
                                                }
                                            }
                                        }
                                        M6663a = -1;
                                    } else {
                                        M6663a = m6658d(bArr, M6663a, j9, i4);
                                    }
                                } else if (i4 < 2) {
                                    i14 -= 3;
                                    long j12 = j9 + j;
                                    bM25131g = yga.m25131g(bArr, j9);
                                    if (bM25131g > -65) {
                                    }
                                    M6663a = -1;
                                } else {
                                    M6663a = m6658d(bArr, M6663a, j9, i4);
                                }
                            } else if (i4 == 0) {
                                i14 -= 2;
                                if (M6663a >= -62) {
                                    j2 = j9 + j;
                                    if (yga.m25131g(bArr, j9) > -65) {
                                        j9 = j2;
                                    }
                                }
                                M6663a = -1;
                            }
                            break;
                        }
                    }
                } else {
                    z = false;
                    uk9.m22777k("Array length=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i5), Integer.valueOf(i2)});
                }
                M6663a = z;
                break;
        }
        if (M6663a == 0) {
            return true;
        }
        return z;
    }
}
