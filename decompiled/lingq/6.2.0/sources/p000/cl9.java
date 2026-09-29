package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class cl9 extends bl9 {
    /* JADX INFO: renamed from: P */
    public static boolean m4833P(String str, String str2, boolean z) {
        str.getClass();
        return !z ? str.endsWith(str2) : str.regionMatches(true, str.length() - str2.length(), str2, 0, str2.length());
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m4834Q(String str, String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        return !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: R */
    public static final void m4835R(String str) {
        throw new NumberFormatException(ux5.m22986i('\'', "Invalid number format: '", str));
    }

    /* JADX INFO: renamed from: S */
    public static boolean m4836S(String str, int i, int i2, int i3, boolean z, String str2) {
        str.getClass();
        str2.getClass();
        return !z ? str.regionMatches(i, str2, i2, i3) : str.regionMatches(z, i, str2, i2, i3);
    }

    /* JADX INFO: renamed from: T */
    public static String m4837T(int i, String str) {
        str.getClass();
        if (i < 0) {
            C3386nv.m17624j(wq1.m24114j("Count 'n' must be non-negative, but was ", i, '.'));
            return null;
        }
        if (i == 0) {
            return "";
        }
        int i2 = 1;
        if (i == 1) {
            return str.toString();
        }
        int length = str.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb = new StringBuilder(str.length() * i);
            if (1 <= i) {
                while (true) {
                    sb.append((CharSequence) str);
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            return sb.toString();
        }
        char cCharAt = str.charAt(0);
        char[] cArr = new char[i];
        for (int i3 = 0; i3 < i; i3++) {
            cArr[i3] = cCharAt;
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: U */
    public static String m4838U(String str, char c, char c2) {
        str.getClass();
        String strReplace = str.replace(c, c2);
        strReplace.getClass();
        return strReplace;
    }

    /* JADX INFO: renamed from: V */
    public static String m4839V(String str, String str2, String str3) {
        ux5.m22974A(str, str2, str3);
        int iM23386i0 = vk9.m23386i0(str, str2, 0, false);
        if (iM23386i0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        int i2 = 0;
        do {
            sb.append((CharSequence) str, i2, iM23386i0);
            sb.append(str3);
            i2 = iM23386i0 + length;
            if (iM23386i0 >= str.length()) {
                break;
            }
            iM23386i0 = vk9.m23386i0(str, str2, iM23386i0 + i, false);
        } while (iM23386i0 > 0);
        sb.append((CharSequence) str, i2, str.length());
        return sb.toString();
    }

    /* JADX INFO: renamed from: W */
    public static String m4840W(String str, char c, char c2) {
        str.getClass();
        int iM23388k0 = vk9.m23388k0(str, c, 0, 2);
        return iM23388k0 < 0 ? str : vk9.m23400w0(str, iM23388k0, iM23388k0 + 1, String.valueOf(c2)).toString();
    }

    /* JADX INFO: renamed from: X */
    public static boolean m4841X(String str, int i, String str2, boolean z) {
        str.getClass();
        return !z ? str.startsWith(str2, i) : m4836S(str, i, 0, str2.length(), z, str2);
    }

    /* JADX INFO: renamed from: Y */
    public static boolean m4842Y(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        return !z ? str.startsWith(str2) : m4836S(str, 0, 0, str2.length(), z, str2);
    }

    /* JADX INFO: renamed from: a0 */
    public static Integer m4844a0(String str) {
        boolean z;
        int i;
        int i2;
        str.getClass();
        ci8.m4727l(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        int i4 = -2147483647;
        if (fa4.m11651m(cCharAt, 48) < 0) {
            i = 1;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                i4 = Integer.MIN_VALUE;
                z = true;
            }
        } else {
            z = false;
            i = 0;
        }
        int i5 = -59652323;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if ((i3 < i5 && (i5 != -59652323 || i3 < (i5 = i4 / 10))) || (i2 = i3 * 10) < i4 + iDigit) {
                return null;
            }
            i3 = i2 - iDigit;
            i++;
        }
        return z ? Integer.valueOf(i3) : Integer.valueOf(-i3);
    }

    /* JADX INFO: renamed from: b0 */
    public static Long m4845b0(String str) {
        boolean z;
        str.getClass();
        ci8.m4727l(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        long j = -9223372036854775807L;
        if (fa4.m11651m(cCharAt, 48) < 0) {
            z = true;
            if (length == 1) {
                return null;
            }
            if (cCharAt == '+') {
                z = false;
                i = 1;
            } else {
                if (cCharAt != '-') {
                    return null;
                }
                j = Long.MIN_VALUE;
                i = 1;
            }
        } else {
            z = false;
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = iDigit;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i++;
        }
        return z ? Long.valueOf(j2) : Long.valueOf(-j2);
    }
}
