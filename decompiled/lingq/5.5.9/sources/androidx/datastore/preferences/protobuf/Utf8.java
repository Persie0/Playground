package androidx.datastore.preferences.protobuf;

import androidx.activity.result.C0204c;
import com.kochava.tracker.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class Utf8 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0817b f5816a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i10, int i11) {
            super(C0204c.m851j("Unpaired surrogate at index ", i10, " of ", i11));
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$a */
    public static class C0816a {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static void m3156a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (!m3158c(b11)) {
                if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !m3158c(b12) && !m3158c(b13)) {
                    int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                    cArr[i10] = (char) ((i11 >>> 10) + 55232);
                    cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
                    return;
                }
            }
            throw InvalidProtocolBufferException.m3143a();
        }

        /* JADX INFO: renamed from: b */
        public static void m3157b(byte b10, byte b11, byte b12, char[] cArr, int i10) throws InvalidProtocolBufferException {
            if (!m3158c(b11) && (b10 != -32 || b11 >= -96)) {
                if (b10 != -19 || b11 < -96) {
                    if (!m3158c(b12)) {
                        cArr[i10] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                }
            }
            throw InvalidProtocolBufferException.m3143a();
        }

        /* JADX INFO: renamed from: c */
        public static boolean m3158c(byte b10) {
            return b10 > -65;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$b */
    public static abstract class AbstractC0817b {
        /* JADX INFO: renamed from: a */
        public abstract String mo3159a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException;

        /* JADX INFO: renamed from: b */
        public abstract int mo3160b(CharSequence charSequence, byte[] bArr, int i10, int i11);

        /* JADX INFO: renamed from: c */
        public abstract int mo3161c(int i10, int i11, byte[] bArr);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$c */
    public static final class C0818c extends AbstractC0817b {
        /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0817b
        /* JADX INFO: renamed from: a */
        public final String mo3159a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte b10 = bArr[i10];
                if (!(b10 >= 0)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) b10;
                i13++;
            }
            int i14 = i13;
            while (true) {
                while (i10 < i12) {
                    int i15 = i10 + 1;
                    byte b11 = bArr[i10];
                    if (b11 >= 0) {
                        int i16 = i14 + 1;
                        cArr[i14] = (char) b11;
                        i10 = i15;
                        while (true) {
                            i14 = i16;
                            if (i10 < i12) {
                                byte b12 = bArr[i10];
                                if (b12 >= 0) {
                                    i10++;
                                    i16 = i14 + 1;
                                    cArr[i14] = (char) b12;
                                }
                            }
                        }
                    } else {
                        if (!(b11 < -32)) {
                            if (b11 < -16) {
                                if (i15 >= i12 - 1) {
                                    throw InvalidProtocolBufferException.m3143a();
                                }
                                int i17 = i15 + 1;
                                C0816a.m3157b(b11, bArr[i15], bArr[i17], cArr, i14);
                                i10 = i17 + 1;
                                i14++;
                            } else {
                                if (i15 >= i12 - 2) {
                                    throw InvalidProtocolBufferException.m3143a();
                                }
                                int i18 = i15 + 1;
                                byte b13 = bArr[i15];
                                int i19 = i18 + 1;
                                C0816a.m3156a(b11, b13, bArr[i18], bArr[i19], cArr, i14);
                                i14 = i14 + 1 + 1;
                                i10 = i19 + 1;
                            }
                        } else {
                            if (i15 >= i12) {
                                throw InvalidProtocolBufferException.m3143a();
                            }
                            int i20 = i15 + 1;
                            byte b14 = bArr[i15];
                            int i21 = i14 + 1;
                            if (b11 < -62 || C0816a.m3158c(b14)) {
                                throw InvalidProtocolBufferException.m3143a();
                            }
                            cArr[i14] = (char) (((b11 & 31) << 6) | (b14 & 63));
                            i10 = i20;
                            i14 = i21;
                        }
                    }
                }
                return new String(cArr, 0, i14);
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0817b
        /* JADX INFO: renamed from: b */
        public final int mo3160b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            int i14;
            char cCharAt;
            int length = charSequence.length();
            int i15 = i11 + i10;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i10) < i15 && (cCharAt = charSequence.charAt(i16)) < 128) {
                bArr[i14] = (byte) cCharAt;
                i16++;
            }
            if (i16 == length) {
                return i10 + length;
            }
            int i17 = i10 + i16;
            while (i16 < length) {
                char cCharAt2 = charSequence.charAt(i16);
                if (cCharAt2 >= 128 || i17 >= i15) {
                    if (cCharAt2 >= 2048 || i17 > i15 - 2) {
                        if (cCharAt2 < 55296 || 57343 < cCharAt2) {
                            if (i17 <= i15 - 3) {
                                int i18 = i17 + 1;
                                bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                                int i19 = i18 + 1;
                                bArr[i18] = (byte) (((cCharAt2 >>> 6) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
                                i12 = i19 + 1;
                                bArr[i19] = (byte) ((cCharAt2 & '?') | BuildConfig.SDK_TRUNCATE_LENGTH);
                            }
                        }
                        if (i17 > i15 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i13 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i13)))) {
                                throw new UnpairedSurrogateException(i16, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i17);
                        }
                        int i20 = i16 + 1;
                        if (i20 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i20);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i21 = i17 + 1;
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                int i22 = i21 + 1;
                                bArr[i21] = (byte) (((codePoint >>> 12) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
                                int i23 = i22 + 1;
                                bArr[i22] = (byte) (((codePoint >>> 6) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
                                i17 = i23 + 1;
                                bArr[i23] = (byte) ((codePoint & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
                                i16 = i20;
                            } else {
                                i16 = i20;
                            }
                        }
                        throw new UnpairedSurrogateException(i16 - 1, length);
                    }
                    int i24 = i17 + 1;
                    bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                    i17 = i24 + 1;
                    bArr[i24] = (byte) ((cCharAt2 & '?') | BuildConfig.SDK_TRUNCATE_LENGTH);
                    i16++;
                } else {
                    i12 = i17 + 1;
                    bArr[i17] = (byte) cCharAt2;
                }
                i17 = i12;
                i16++;
            }
            return i17;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0817b
        /* JADX INFO: renamed from: c */
        public final int mo3161c(int i10, int i11, byte[] bArr) {
            while (i10 < i11 && bArr[i10] >= 0) {
                i10++;
            }
            if (i10 < i11) {
                loop1: while (true) {
                    while (true) {
                        if (i10 >= i11) {
                            break loop1;
                        }
                        int i12 = i10 + 1;
                        byte b10 = bArr[i10];
                        if (b10 < 0) {
                            if (b10 < -32) {
                                if (i12 >= i11) {
                                    return b10;
                                }
                                if (b10 >= -62) {
                                    i10 = i12 + 1;
                                    if (bArr[i12] <= -65) {
                                        break;
                                    }
                                }
                                return -1;
                            }
                            if (b10 < -16) {
                                if (i12 < i11 - 1) {
                                    int i13 = i12 + 1;
                                    byte b11 = bArr[i12];
                                    if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                                        i10 = i13 + 1;
                                        if (bArr[i13] <= -65) {
                                            break;
                                        }
                                    }
                                } else {
                                    return Utf8.m3152a(bArr, i12, i11);
                                }
                            } else {
                                if (i12 >= i11 - 2) {
                                    return Utf8.m3152a(bArr, i12, i11);
                                }
                                int i14 = i12 + 1;
                                byte b12 = bArr[i12];
                                if (b12 <= -65) {
                                    if ((((b12 + 112) + (b10 << 28)) >> 30) == 0) {
                                        int i15 = i14 + 1;
                                        if (bArr[i14] <= -65) {
                                            i12 = i15 + 1;
                                            if (bArr[i15] > -65) {
                                            }
                                        }
                                    }
                                }
                            }
                            return -1;
                        }
                        i10 = i12;
                    }
                }
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.Utf8$d */
    public static final class C0819d extends AbstractC0817b {
        /* JADX INFO: renamed from: d */
        public static int m3162d(long j10, byte[] bArr, int i10, int i11) {
            if (i11 == 0) {
                AbstractC0817b abstractC0817b = Utf8.f5816a;
                if (i10 > -12) {
                    i10 = -1;
                }
                return i10;
            }
            if (i11 == 1) {
                return Utf8.m3154c(i10, C0841f1.m3221g(bArr, j10));
            }
            if (i11 == 2) {
                return Utf8.m3155d(i10, C0841f1.m3221g(bArr, j10), C0841f1.m3221g(bArr, j10 + 1));
            }
            throw new AssertionError();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0817b
        /* JADX INFO: renamed from: a */
        public final String mo3159a(byte[] bArr, int i10, int i11) throws InvalidProtocolBufferException {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (i10 < i12) {
                byte bM3221g = C0841f1.m3221g(bArr, i10);
                if (!(bM3221g >= 0)) {
                    break;
                }
                i10++;
                cArr[i13] = (char) bM3221g;
                i13++;
            }
            int i14 = i13;
            while (i10 < i12) {
                int i15 = i10 + 1;
                byte bM3221g2 = C0841f1.m3221g(bArr, i10);
                if (bM3221g2 >= 0) {
                    int i16 = i14 + 1;
                    cArr[i14] = (char) bM3221g2;
                    i10 = i15;
                    while (true) {
                        i14 = i16;
                        if (i10 >= i12) {
                            break;
                        }
                        byte bM3221g3 = C0841f1.m3221g(bArr, i10);
                        if (!(bM3221g3 >= 0)) {
                            break;
                        }
                        i10++;
                        i16 = i14 + 1;
                        cArr[i14] = (char) bM3221g3;
                    }
                } else {
                    if (!(bM3221g2 < -32)) {
                        if (bM3221g2 < -16) {
                            if (i15 >= i12 - 1) {
                                throw InvalidProtocolBufferException.m3143a();
                            }
                            int i17 = i15 + 1;
                            C0816a.m3157b(bM3221g2, C0841f1.m3221g(bArr, i15), C0841f1.m3221g(bArr, i17), cArr, i14);
                            i10 = i17 + 1;
                            i14++;
                        } else {
                            if (i15 >= i12 - 2) {
                                throw InvalidProtocolBufferException.m3143a();
                            }
                            int i18 = i15 + 1;
                            byte bM3221g4 = C0841f1.m3221g(bArr, i15);
                            int i19 = i18 + 1;
                            C0816a.m3156a(bM3221g2, bM3221g4, C0841f1.m3221g(bArr, i18), C0841f1.m3221g(bArr, i19), cArr, i14);
                            i14 = i14 + 1 + 1;
                            i10 = i19 + 1;
                        }
                    } else {
                        if (i15 >= i12) {
                            throw InvalidProtocolBufferException.m3143a();
                        }
                        int i20 = i15 + 1;
                        byte bM3221g5 = C0841f1.m3221g(bArr, i15);
                        int i21 = i14 + 1;
                        if (bM3221g2 < -62 || C0816a.m3158c(bM3221g5)) {
                            throw InvalidProtocolBufferException.m3143a();
                        }
                        cArr[i14] = (char) (((bM3221g2 & 31) << 6) | (bM3221g5 & 63));
                        i10 = i20;
                        i14 = i21;
                    }
                }
            }
            return new String(cArr, 0, i14);
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0817b
        /* JADX INFO: renamed from: b */
        public final int mo3160b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
            long j10;
            char c10;
            long j11;
            long j12;
            char c11;
            int i12;
            char cCharAt;
            long j13 = i10;
            long j14 = ((long) i11) + j13;
            int length = charSequence.length();
            if (length > i11 || bArr.length - i11 < i10) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i10 + i11));
            }
            int i13 = 0;
            while (true) {
                j10 = 1;
                c10 = 128;
                if (i13 >= length || (cCharAt = charSequence.charAt(i13)) >= 128) {
                    break;
                }
                C0841f1.m3230p(bArr, j13, (byte) cCharAt);
                i13++;
                j13 = 1 + j13;
            }
            if (i13 == length) {
                return (int) j13;
            }
            while (i13 < length) {
                char cCharAt2 = charSequence.charAt(i13);
                if (cCharAt2 < c10 && j13 < j14) {
                    long j15 = j13 + j10;
                    C0841f1.m3230p(bArr, j13, (byte) cCharAt2);
                    j12 = j10;
                    j11 = j15;
                    c11 = c10;
                } else if (cCharAt2 < 2048 && j13 <= j14 - 2) {
                    long j16 = j13 + j10;
                    C0841f1.m3230p(bArr, j13, (byte) ((cCharAt2 >>> 6) | 960));
                    long j17 = j16 + j10;
                    C0841f1.m3230p(bArr, j16, (byte) ((cCharAt2 & '?') | BuildConfig.SDK_TRUNCATE_LENGTH));
                    long j18 = j10;
                    c11 = 128;
                    j11 = j17;
                    j12 = j18;
                } else {
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j13 > j14 - 3) {
                        if (j13 > j14 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                                throw new UnpairedSurrogateException(i13, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j13);
                        }
                        int i14 = i13 + 1;
                        if (i14 != length) {
                            char cCharAt3 = charSequence.charAt(i14);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                long j19 = j13 + 1;
                                C0841f1.m3230p(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                                long j20 = j19 + 1;
                                c11 = 128;
                                C0841f1.m3230p(bArr, j19, (byte) (((codePoint >>> 12) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH));
                                long j21 = j20 + 1;
                                C0841f1.m3230p(bArr, j20, (byte) (((codePoint >>> 6) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH));
                                j12 = 1;
                                j11 = j21 + 1;
                                C0841f1.m3230p(bArr, j21, (byte) ((codePoint & 63) | BuildConfig.SDK_TRUNCATE_LENGTH));
                                i13 = i14;
                            } else {
                                i13 = i14;
                            }
                        }
                        throw new UnpairedSurrogateException(i13 - 1, length);
                    }
                    long j22 = j13 + j10;
                    C0841f1.m3230p(bArr, j13, (byte) ((cCharAt2 >>> '\f') | 480));
                    long j23 = j22 + j10;
                    C0841f1.m3230p(bArr, j22, (byte) (((cCharAt2 >>> 6) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH));
                    C0841f1.m3230p(bArr, j23, (byte) ((cCharAt2 & '?') | BuildConfig.SDK_TRUNCATE_LENGTH));
                    j11 = j23 + 1;
                    j12 = 1;
                    c11 = 128;
                }
                i13++;
                c10 = c11;
                long j24 = j12;
                j13 = j11;
                j10 = j24;
            }
            return (int) j13;
        }

        @Override // androidx.datastore.preferences.protobuf.Utf8.AbstractC0817b
        /* JADX INFO: renamed from: c */
        public final int mo3161c(int i10, int i11, byte[] bArr) {
            int i12;
            long j10;
            if ((i10 | i11 | (bArr.length - i11)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
            }
            long j11 = i10;
            int i13 = (int) (((long) i11) - j11);
            if (i13 >= 16) {
                i12 = 0;
                long j12 = j11;
                while (true) {
                    if (i12 >= i13) {
                        i12 = i13;
                        break;
                    }
                    long j13 = j12 + 1;
                    if (C0841f1.m3221g(bArr, j12) < 0) {
                        break;
                    }
                    i12++;
                    j12 = j13;
                }
            } else {
                i12 = 0;
            }
            int i14 = i13 - i12;
            long j14 = j11 + ((long) i12);
            while (true) {
                byte bM3221g = 0;
                while (i14 > 0) {
                    long j15 = j14 + 1;
                    bM3221g = C0841f1.m3221g(bArr, j14);
                    if (bM3221g < 0) {
                        j14 = j15;
                        break;
                    }
                    i14--;
                    j14 = j15;
                }
                if (i14 == 0) {
                    return 0;
                }
                int i15 = i14 - 1;
                if (bM3221g < -32) {
                    if (i15 == 0) {
                        return bM3221g;
                    }
                    i14 = i15 - 1;
                    if (bM3221g >= -62) {
                        j10 = j14 + 1;
                        if (C0841f1.m3221g(bArr, j14) > -65) {
                        }
                        j14 = j10;
                    }
                    return -1;
                }
                if (bM3221g < -16) {
                    if (i15 < 2) {
                        return m3162d(j14, bArr, bM3221g, i15);
                    }
                    i14 = i15 - 2;
                    long j16 = j14 + 1;
                    byte bM3221g2 = C0841f1.m3221g(bArr, j14);
                    if (bM3221g2 <= -65 && ((bM3221g != -32 || bM3221g2 >= -96) && (bM3221g != -19 || bM3221g2 < -96))) {
                        j14 = j16 + 1;
                        if (C0841f1.m3221g(bArr, j16) > -65) {
                        }
                    }
                } else {
                    if (i15 < 3) {
                        return m3162d(j14, bArr, bM3221g, i15);
                    }
                    i14 = i15 - 3;
                    long j17 = j14 + 1;
                    byte bM3221g3 = C0841f1.m3221g(bArr, j14);
                    if (bM3221g3 <= -65 && (((bM3221g3 + 112) + (bM3221g << 28)) >> 30) == 0) {
                        long j18 = j17 + 1;
                        if (C0841f1.m3221g(bArr, j17) <= -65) {
                            j10 = j18 + 1;
                            if (C0841f1.m3221g(bArr, j18) > -65) {
                            }
                            j14 = j10;
                        }
                    }
                }
                return -1;
            }
        }
    }

    static {
        f5816a = (!(C0841f1.f5850f && C0841f1.f5849e) || C0833d.m3200a()) ? new C0818c() : new C0819d();
    }

    /* JADX INFO: renamed from: a */
    public static int m3152a(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            if (b10 > -12) {
                b10 = -1;
            }
            return b10;
        }
        if (i12 == 1) {
            return m3154c(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return m3155d(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static int m3153b(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new UnpairedSurrogateException(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i12) + 4294967296L));
    }

    /* JADX INFO: renamed from: c */
    public static int m3154c(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* JADX INFO: renamed from: d */
    public static int m3155d(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }
}
