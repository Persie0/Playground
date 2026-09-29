package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.network.api.result.ResultTokenCwt;
import kotlin.time.C3205a;
import kotlin.time.C3206b;
import kotlin.time.Instant;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kuc {

    /* JADX INFO: renamed from: a */
    public static final int[] f48441a = {1, 10, 100, DescriptorProtos.Edition.EDITION_2023_VALUE, 10000, 100000, 1000000, 10000000, 100000000, 1000000000};

    /* JADX INFO: renamed from: b */
    public static final int[] f48442b = {1, 2, 4, 5, 7, 8, 10, 11, 13, 14};

    /* JADX INFO: renamed from: c */
    public static final int[] f48443c = {3, 6};

    /* JADX INFO: renamed from: d */
    public static final int[] f48444d = {1, 2, 4, 5, 7, 8};

    /* JADX INFO: renamed from: a */
    public static final String m15695a(Instant instant) {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        instant.getClass();
        long j2 = instant.f47733a;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = instant.f47734b;
        int i12 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - 10000);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        m15697c(sb, sb, i4);
        sb.append('-');
        m15697c(sb, sb, i5);
        sb.append('T');
        m15697c(sb, sb, i7);
        sb.append(':');
        m15697c(sb, sb, i9);
        sb.append(':');
        m15697c(sb, sb, i10);
        if (i11 != 0) {
            sb.append('.');
            while (true) {
                int i13 = i12 + 1;
                iArr = f48441a;
                if (i11 % iArr[i13] != 0) {
                    break;
                }
                i12 = i13;
            }
            int i14 = i12 - (i12 % 3);
            String strValueOf = String.valueOf((i11 / iArr[i14]) + iArr[9 - i14]);
            strValueOf.getClass();
            sb.append(strValueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static final h74 m15696b(CharSequence charSequence) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        char cCharAt;
        char cCharAt2;
        if (charSequence.length() == 0) {
            return new C3205a(charSequence, "An empty string is not a valid Instant");
        }
        char cCharAt3 = charSequence.charAt(0);
        int i6 = 1;
        if (cCharAt3 == '+' || cCharAt3 == '-') {
            i = 1;
        } else {
            i = 0;
            cCharAt3 = ' ';
        }
        int iCharAt = 0;
        int i7 = i;
        while (i7 < charSequence.length() && '0' <= (cCharAt2 = charSequence.charAt(i7)) && cCharAt2 < ':') {
            iCharAt = (iCharAt * 10) + (charSequence.charAt(i7) - '0');
            i7++;
        }
        int i8 = i7 - i;
        if (i8 > 10) {
            return m15699e(charSequence, "Expected at most 10 digits for the year number, got " + i8 + " digits");
        }
        if (i8 == 10 && fa4.m11651m(charSequence.charAt(i), 50) >= 0) {
            return m15699e(charSequence, "Expected at most 9 digits for the year number or year 1000000000, got " + i8 + " digits");
        }
        int i9 = 4;
        if (i8 < 4) {
            return m15699e(charSequence, "The year number must be padded to 4 digits, got " + i8 + " digits");
        }
        if (cCharAt3 == '+' && i8 == 4) {
            return m15699e(charSequence, "The '+' sign at the start is only valid for year numbers longer than 4 digits");
        }
        if (cCharAt3 == ' ' && i8 != 4) {
            return m15699e(charSequence, "A '+' or '-' sign is required for year numbers longer than 4 digits");
        }
        if (cCharAt3 == '-') {
            iCharAt = -iCharAt;
        }
        int i10 = i7 + 16;
        if (charSequence.length() < i10) {
            return m15699e(charSequence, "The input string is too short");
        }
        C3205a c3205aM15698d = m15698d(charSequence, "'-'", i7, new qy3(i6));
        if (c3205aM15698d != null) {
            return c3205aM15698d;
        }
        C3205a c3205aM15698d2 = m15698d(charSequence, "'-'", i7 + 3, new qy3(2));
        if (c3205aM15698d2 != null) {
            return c3205aM15698d2;
        }
        C3205a c3205aM15698d3 = m15698d(charSequence, "'T' or 't'", i7 + 6, new qy3(3));
        if (c3205aM15698d3 != null) {
            return c3205aM15698d3;
        }
        C3205a c3205aM15698d4 = m15698d(charSequence, "':'", i7 + 9, new qy3(i9));
        if (c3205aM15698d4 != null) {
            return c3205aM15698d4;
        }
        C3205a c3205aM15698d5 = m15698d(charSequence, "':'", i7 + 12, new qy3(5));
        if (c3205aM15698d5 != null) {
            return c3205aM15698d5;
        }
        int i11 = 0;
        while (true) {
            int i12 = 6;
            if (i11 >= 10) {
                int iM15700f = m15700f(charSequence, i7 + 1);
                int iM15700f2 = m15700f(charSequence, i7 + 4);
                int iM15700f3 = m15700f(charSequence, i7 + 7);
                int iM15700f4 = m15700f(charSequence, i7 + 10);
                int iM15700f5 = m15700f(charSequence, i7 + 13);
                int i13 = i7 + 15;
                if (charSequence.charAt(i13) == '.') {
                    i13 = i10;
                    int iCharAt2 = 0;
                    while (i13 < charSequence.length() && '0' <= (cCharAt = charSequence.charAt(i13)) && cCharAt < ':') {
                        iCharAt2 = (iCharAt2 * 10) + (charSequence.charAt(i13) - '0');
                        i13++;
                    }
                    int i14 = i13 - i10;
                    if (1 > i14 || i14 >= 10) {
                        return m15699e(charSequence, "1..9 digits are supported for the fraction of the second, got " + i14 + " digits");
                    }
                    i2 = iCharAt2 * f48441a[9 - i14];
                } else {
                    i2 = 0;
                }
                if (i13 >= charSequence.length()) {
                    return m15699e(charSequence, "The UTC offset at the end of the string is missing");
                }
                char cCharAt4 = charSequence.charAt(i13);
                if (cCharAt4 == '+' || cCharAt4 == '-') {
                    int length = charSequence.length() - i13;
                    if (length > 9) {
                        return m15699e(charSequence, "The UTC offset string \"" + m15702h(charSequence.subSequence(i13, charSequence.length()).toString(), 16) + "\" is too long");
                    }
                    if (length % 3 != 0) {
                        return m15699e(charSequence, "Invalid UTC offset string \"" + charSequence.subSequence(i13, charSequence.length()).toString() + '\"');
                    }
                    for (int i15 = 0; i15 < 2 && (i5 = f48443c[i15] + i13) < charSequence.length(); i15++) {
                        if (charSequence.charAt(i5) != ':') {
                            StringBuilder sbM22998u = ux5.m22998u("Expected ':' at index ", i5, ", got '");
                            sbM22998u.append(charSequence.charAt(i5));
                            sbM22998u.append('\'');
                            return m15699e(charSequence, sbM22998u.toString());
                        }
                    }
                    int i16 = 0;
                    while (i16 < 6 && (i4 = f48444d[i16] + i13) < charSequence.length()) {
                        char cCharAt5 = charSequence.charAt(i4);
                        int i17 = i16;
                        if ('0' > cCharAt5 || cCharAt5 >= ':') {
                            StringBuilder sbM22998u2 = ux5.m22998u("Expected an ASCII digit at index ", i4, ", got '");
                            sbM22998u2.append(charSequence.charAt(i4));
                            sbM22998u2.append('\'');
                            return m15699e(charSequence, sbM22998u2.toString());
                        }
                        i16 = i17 + 1;
                    }
                    int iM15700f6 = m15700f(charSequence, i13 + 1);
                    int iM15700f7 = length > 3 ? m15700f(charSequence, i13 + 4) : 0;
                    int iM15700f8 = length > 6 ? m15700f(charSequence, i13 + 7) : 0;
                    if (iM15700f7 > 59) {
                        return m15699e(charSequence, "Expected offset-minute-of-hour in 0..59, got " + iM15700f7);
                    }
                    if (iM15700f8 > 59) {
                        return m15699e(charSequence, "Expected offset-second-of-minute in 0..59, got " + iM15700f8);
                    }
                    if (iM15700f6 > 17 && (iM15700f6 != 18 || iM15700f7 != 0 || iM15700f8 != 0)) {
                        return m15699e(charSequence, "Expected an offset in -18:00..+18:00, got " + charSequence.subSequence(i13, charSequence.length()).toString());
                    }
                    i3 = ((iM15700f7 * 60) + (iM15700f6 * 3600) + iM15700f8) * (cCharAt4 == '-' ? -1 : 1);
                } else {
                    if (cCharAt4 != 'Z' && cCharAt4 != 'z') {
                        return m15699e(charSequence, "Expected the UTC offset at position " + i13 + ", got '" + cCharAt4 + '\'');
                    }
                    int i18 = i13 + 1;
                    if (charSequence.length() != i18) {
                        return m15699e(charSequence, "Extra text after the instant at position " + i18);
                    }
                    i3 = 0;
                }
                if (1 > iM15700f || iM15700f >= 13) {
                    return m15699e(charSequence, "Expected a month number in 1..12, got " + iM15700f);
                }
                if (1 <= iM15700f2) {
                    int i19 = iCharAt & 3;
                    if (iM15700f2 <= (iM15700f != 2 ? (iM15700f == 4 || iM15700f == 6 || iM15700f == 9 || iM15700f == 11) ? 30 : 31 : i19 == 0 && (iCharAt % 100 != 0 || iCharAt % 400 == 0) ? 29 : 28)) {
                        if (iM15700f3 > 23) {
                            return m15699e(charSequence, "Expected hour in 0..23, got " + iM15700f3);
                        }
                        if (iM15700f4 > 59) {
                            return m15699e(charSequence, "Expected minute-of-hour in 0..59, got " + iM15700f4);
                        }
                        if (iM15700f5 > 59) {
                            return m15699e(charSequence, "Expected second-of-minute in 0..59, got " + iM15700f5);
                        }
                        long j = iCharAt;
                        long j2 = 365 * j;
                        long j3 = (j >= 0 ? ((j + 399) / 400) + (((j + 3) / 4) - ((j + 99) / 100)) + j2 : j2 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (((iM15700f * 367) - 362) / 12)) + ((long) (iM15700f2 - 1));
                        if (iM15700f > 2) {
                            j3 = (i19 != 0 || (iCharAt % 100 == 0 && iCharAt % 400 != 0)) ? j3 - 2 : (-1) + j3;
                        }
                        return new C3206b(i2, (((j3 - 719528) * 86400) + ((long) (((iM15700f4 * 60) + (iM15700f3 * 3600)) + iM15700f5))) - ((long) i3));
                    }
                }
                StringBuilder sbM22994q = ux5.m22994q(iM15700f, iCharAt, "Expected a valid day-of-month for month ", " of year ", ", got ");
                sbM22994q.append(iM15700f2);
                return m15699e(charSequence, sbM22994q.toString());
            }
            C3205a c3205aM15698d6 = m15698d(charSequence, "an ASCII digit", f48442b[i11] + i7, new qy3(i12));
            if (c3205aM15698d6 != null) {
                return c3205aM15698d6;
            }
            i11++;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m15697c(StringBuilder sb, StringBuilder sb2, int i) {
        if (i < 10) {
            sb.append('0');
        }
        sb2.append(i);
    }

    /* JADX INFO: renamed from: d */
    public static final C3205a m15698d(CharSequence charSequence, String str, int i, vi3 vi3Var) {
        char cCharAt = charSequence.charAt(i);
        if (((Boolean) vi3Var.invoke(Character.valueOf(cCharAt))).booleanValue()) {
            return null;
        }
        return m15699e(charSequence, "Expected " + str + ", but got '" + cCharAt + "' at position " + i);
    }

    /* JADX INFO: renamed from: e */
    public static final C3205a m15699e(CharSequence charSequence, String str) {
        StringBuilder sbM22999v = ux5.m22999v(str, " when parsing an Instant from \"");
        sbM22999v.append(m15702h(charSequence, 64));
        sbM22999v.append('\"');
        return new C3205a(charSequence, sbM22999v.toString());
    }

    /* JADX INFO: renamed from: f */
    public static final int m15700f(CharSequence charSequence, int i) {
        return (charSequence.charAt(i + 1) - '0') + ((charSequence.charAt(i) - '0') * 10);
    }

    /* JADX INFO: renamed from: g */
    public static final o3a m15701g(ResultTokenCwt resultTokenCwt, int i, int i2, int i3) {
        resultTokenCwt.getClass();
        n3a n3aVar = o3a.Companion;
        String strM23609O = vz1.m23609O(resultTokenCwt.f21582a, resultTokenCwt.f21584c);
        String str = resultTokenCwt.f21584c;
        String str2 = resultTokenCwt.f21585d;
        n3aVar.getClass();
        return new o3a(i, i2, i3, n3a.m17202a(i, i2, i3, strM23609O, str, str2), resultTokenCwt.f21582a, resultTokenCwt.f21583b, resultTokenCwt.f21584c, resultTokenCwt.f21585d, resultTokenCwt.f21586e);
    }

    /* JADX INFO: renamed from: h */
    public static final String m15702h(CharSequence charSequence, int i) {
        if (charSequence.length() <= i) {
            return charSequence.toString();
        }
        return charSequence.subSequence(0, i).toString() + "...";
    }
}
