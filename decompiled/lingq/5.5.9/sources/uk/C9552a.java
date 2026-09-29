package uk;

import androidx.activity.result.C0204c;
import com.squareup.moshi.JsonDataException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: uk.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C9552a {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f49128a = TimeZone.getTimeZone("GMT");

    /* JADX INFO: renamed from: a */
    public static boolean m17995a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    /* JADX INFO: renamed from: b */
    public static String m17996b(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(f49128a, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(24);
        m17997c(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        m17997c(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        m17997c(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        m17997c(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        m17997c(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        m17997c(sb2, gregorianCalendar.get(13), 2);
        sb2.append('.');
        m17997c(sb2, gregorianCalendar.get(14), 3);
        sb2.append('Z');
        return sb2.toString();
    }

    /* JADX INFO: renamed from: c */
    public static void m17997c(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    /* JADX INFO: renamed from: d */
    public static Date m17998d(String str) {
        int i10;
        int iM17999e;
        int iM17999e2;
        int iPow;
        char cCharAt;
        try {
            int iM17999e3 = m17999e(str, 0, 4);
            int i11 = m17995a(str, 4, '-') ? 5 : 4;
            int i12 = i11 + 2;
            int iM17999e4 = m17999e(str, i11, i12);
            if (m17995a(str, i12, '-')) {
                i12++;
            }
            int i13 = i12 + 2;
            int iM17999e5 = m17999e(str, i12, i13);
            boolean zM17995a = m17995a(str, i13, 'T');
            if (!zM17995a && str.length() <= i13) {
                return new GregorianCalendar(iM17999e3, iM17999e4 - 1, iM17999e5).getTime();
            }
            if (zM17995a) {
                int i14 = i13 + 1;
                int i15 = i14 + 2;
                int iM17999e6 = m17999e(str, i14, i15);
                if (m17995a(str, i15, ':')) {
                    i15++;
                }
                int i16 = i15 + 2;
                iM17999e = m17999e(str, i15, i16);
                if (m17995a(str, i16, ':')) {
                    i16++;
                }
                if (str.length() <= i16 || (cCharAt = str.charAt(i16)) == 'Z' || cCharAt == '+' || cCharAt == '-') {
                    iM17999e2 = 0;
                    iPow = 0;
                    i10 = iM17999e6;
                    i13 = i16;
                } else {
                    int i17 = i16 + 2;
                    iM17999e2 = m17999e(str, i16, i17);
                    if (iM17999e2 > 59 && iM17999e2 < 63) {
                        iM17999e2 = 59;
                    }
                    if (m17995a(str, i17, '.')) {
                        int i18 = i17 + 1;
                        int length = i18 + 1;
                        while (true) {
                            if (length >= str.length()) {
                                length = str.length();
                                break;
                            }
                            char cCharAt2 = str.charAt(length);
                            if (cCharAt2 < '0' || cCharAt2 > '9') {
                                break;
                                break;
                            }
                            length++;
                        }
                        int iMin = Math.min(length, i18 + 3);
                        int iM17999e7 = m17999e(str, i18, iMin);
                        double d10 = 3 - (iMin - i18);
                        i17 = length;
                        iPow = (int) (Math.pow(10.0d, d10) * ((double) iM17999e7));
                    } else {
                        iPow = 0;
                    }
                    i13 = i17;
                    i10 = iM17999e6;
                }
            } else {
                i10 = 0;
                iM17999e = 0;
                iM17999e2 = 0;
                iPow = 0;
            }
            if (str.length() <= i13) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            char cCharAt3 = str.charAt(i13);
            TimeZone timeZone = f49128a;
            if (cCharAt3 != 'Z') {
                if (cCharAt3 != '+' && cCharAt3 != '-') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt3 + "'");
                }
                String strSubstring = str.substring(i13);
                if (!"+0000".equals(strSubstring) && !"+00:00".equals(strSubstring)) {
                    String str2 = "GMT" + strSubstring;
                    timeZone = TimeZone.getTimeZone(str2);
                    String id2 = timeZone.getID();
                    if (!id2.equals(str2) && !id2.replace(":", "").equals(str2)) {
                        throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str2 + " given, resolves to " + timeZone.getID());
                    }
                }
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, iM17999e3);
            gregorianCalendar.set(2, iM17999e4 - 1);
            gregorianCalendar.set(5, iM17999e5);
            gregorianCalendar.set(11, i10);
            gregorianCalendar.set(12, iM17999e);
            gregorianCalendar.set(13, iM17999e2);
            gregorianCalendar.set(14, iPow);
            return gregorianCalendar.getTime();
        } catch (IllegalArgumentException | IndexOutOfBoundsException e10) {
            throw new JsonDataException(C0204c.m852k("Not an RFC 3339 date: ", str), e10);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: e */
    public static int m17999e(String str, int i10, int i11) throws NumberFormatException {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }
}
