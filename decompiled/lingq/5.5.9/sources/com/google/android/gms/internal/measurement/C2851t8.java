package com.google.android.gms.internal.measurement;

import com.kochava.tracker.BuildConfig;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2851t8 {

    /* JADX INFO: renamed from: a */
    public static final C2838s8 f14444a;

    static {
        if (C2812q8.f14403e && C2812q8.f14402d) {
            int i10 = C2783o5.f14362a;
        }
        f14444a = new C2838s8();
    }

    /* JADX INFO: renamed from: a */
    public static /* bridge */ /* synthetic */ int m8261a(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 != 0) {
            if (i12 == 1) {
                byte b11 = bArr[i10];
                if (b10 <= -12 && b11 <= -65) {
                    return b10 ^ (b11 << 8);
                }
            } else {
                if (i12 != 2) {
                    throw new AssertionError();
                }
                byte b12 = bArr[i10];
                byte b13 = bArr[i10 + 1];
                if (b10 <= -12 && b12 <= -65 && b13 <= -65) {
                    return ((b12 << 8) ^ b10) ^ (b13 << 16);
                }
            }
        } else if (b10 <= -12) {
            return b10;
        }
        return -1;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: b */
    public static int m8262b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        char cCharAt;
        int length = charSequence.length();
        int i16 = 0;
        while (true) {
            i12 = i10 + i11;
            if (i16 >= length || (i15 = i16 + i10) >= i12 || (cCharAt = charSequence.charAt(i16)) >= 128) {
                break;
            }
            bArr[i15] = (byte) cCharAt;
            i16++;
        }
        if (i16 == length) {
            return i10 + length;
        }
        int i17 = i10 + i16;
        while (i16 < length) {
            char cCharAt2 = charSequence.charAt(i16);
            if (cCharAt2 >= 128 || i17 >= i12) {
                if (cCharAt2 >= 2048 || i17 > i12 - 2) {
                    if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                        if (i17 <= i12 - 3) {
                            int i18 = i17 + 1;
                            bArr[i17] = (byte) ((cCharAt2 >>> '\f') | 480);
                            int i19 = i18 + 1;
                            bArr[i18] = (byte) (((cCharAt2 >>> 6) & 63) | BuildConfig.SDK_TRUNCATE_LENGTH);
                            i13 = i19 + 1;
                            bArr[i19] = (byte) ((cCharAt2 & '?') | BuildConfig.SDK_TRUNCATE_LENGTH);
                        }
                    }
                    if (i17 > i12 - 4) {
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i14 = i16 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i14)))) {
                            throw new zzny(i16, length);
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
                    throw new zzny(i16 - 1, length);
                }
                int i24 = i17 + 1;
                bArr[i17] = (byte) ((cCharAt2 >>> 6) | 960);
                i17 = i24 + 1;
                bArr[i24] = (byte) ((cCharAt2 & '?') | BuildConfig.SDK_TRUNCATE_LENGTH);
                i16++;
            } else {
                i13 = i17 + 1;
                bArr[i17] = (byte) cCharAt2;
            }
            i17 = i13;
            i16++;
        }
        return i17;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: c */
    public static int m8263c(CharSequence charSequence) {
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
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new zzny(i11, length2);
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

    /* JADX INFO: renamed from: d */
    public static boolean m8264d(byte[] bArr, int i10, int i11) {
        f14444a.getClass();
        return AbstractC2825r8.m8240a(bArr, i10, i11);
    }
}
