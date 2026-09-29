package org.joda.time.format;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: org.joda.time.format.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C8139a {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap<String, C8140b> f44153a = new ConcurrentHashMap<>();

    static {
        new AtomicReferenceArray(25);
    }

    /* JADX WARN: Code duplicated, block: B:144:0x0209 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:65:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0116  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:70:0x015f  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:78:0x0180 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0182  */
    /* JADX WARN: Code duplicated, block: B:82:0x0188  */
    /* JADX WARN: Code duplicated, block: B:83:0x018f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0196  */
    /* JADX WARN: Switch 'out' block B:61:0x00fa for B:40:0x0079 already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: a */
    public static C8140b m16112a() {
        C8140b c8140bM16109q;
        C8140b c8140bPutIfAbsent;
        int i10;
        boolean z10;
        ConcurrentHashMap<String, C8140b> concurrentHashMap = f44153a;
        C8140b c8140b = concurrentHashMap.get("yyyy-MM-dd'T'HH:mm:ss.SSS");
        if (c8140b != null) {
            return c8140b;
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        int[] iArr = new int[1];
        int i11 = 0;
        while (i11 < 25) {
            iArr[0] = i11;
            String strM16114c = m16114c(iArr);
            int i12 = iArr[0];
            int length = strM16114c.length();
            if (length == 0) {
                c8140bM16109q = dateTimeFormatterBuilder.m16109q();
                return (concurrentHashMap.size() >= 500 || (c8140bPutIfAbsent = concurrentHashMap.putIfAbsent("yyyy-MM-dd'T'HH:mm:ss.SSS", c8140bM16109q)) == null) ? c8140bM16109q : c8140bPutIfAbsent;
            }
            char cCharAt = strM16114c.charAt(0);
            if (cCharAt == '\'') {
                String strSubstring = strM16114c.substring(1);
                if (strSubstring.length() == 1) {
                    dateTimeFormatterBuilder.m16103i(strSubstring.charAt(0));
                } else {
                    dateTimeFormatterBuilder.m16102h(new String(strSubstring));
                }
            } else if (cCharAt == 'K') {
                dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43926I, length, 2);
            } else if (cCharAt != 'M') {
                if (cCharAt == 'S') {
                    dateTimeFormatterBuilder.m16101g(DateTimeFieldType.f43932O, length, length);
                } else if (cCharAt == 'a') {
                    dateTimeFormatterBuilder.m16106l(DateTimeFieldType.f43925H);
                } else if (cCharAt == 'h') {
                    dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43927J, length, 2);
                } else if (cCharAt == 'k') {
                    dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43928K, length, 2);
                } else if (cCharAt == 'm') {
                    dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43931N, length, 2);
                } else if (cCharAt == 's') {
                    dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43933P, length, 2);
                } else if (cCharAt == 'G') {
                    dateTimeFormatterBuilder.m16106l(DateTimeFieldType.f43936a);
                } else if (cCharAt == 'H') {
                    dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43929L, length, 2);
                } else if (cCharAt == 'Y') {
                    if (length != 2) {
                        if (i12 + 1 < 25) {
                            iArr[0] = iArr[0] + 1;
                            z10 = !m16113b(m16114c(iArr));
                            iArr[0] = iArr[0] - 1;
                        } else {
                            z10 = true;
                        }
                        if (cCharAt == 'x') {
                            DateTime dateTime = new DateTime();
                            dateTimeFormatterBuilder.m16097c(new DateTimeFormatterBuilder.C8137l(DateTimeFieldType.f43940e, dateTime.mo12598n().mo12543c0().mo12572b(dateTime.mo12597k()) - 30, z10));
                        } else {
                            DateTime dateTime2 = new DateTime();
                            dateTimeFormatterBuilder.m16097c(new DateTimeFormatterBuilder.C8137l(DateTimeFieldType.f43945j, dateTime2.mo12598n().mo12535U().mo12572b(dateTime2.mo12597k()) - 30, z10));
                        }
                    } else {
                        i10 = 9;
                        if (i12 + 1 < 25) {
                            iArr[0] = iArr[0] + 1;
                            i10 = m16113b(m16114c(iArr)) ? length : 9;
                            iArr[0] = iArr[0] - 1;
                        }
                        if (cCharAt != 'Y') {
                            dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43937b, length, i10);
                        } else if (cCharAt != 'x') {
                            dateTimeFormatterBuilder.m16105k(DateTimeFieldType.f43945j, length, i10);
                        } else if (cCharAt != 'y') {
                            dateTimeFormatterBuilder.m16105k(DateTimeFieldType.f43940e, length, i10);
                        }
                    }
                } else if (cCharAt != 'Z') {
                    if (cCharAt == 'd') {
                        dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43943h, length, 2);
                    } else if (cCharAt != 'e') {
                        switch (cCharAt) {
                            case 'C':
                                dateTimeFormatterBuilder.m16105k(DateTimeFieldType.f43938c, length, length);
                                continue;
                            case 'D':
                                dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43941f, length, 3);
                                continue;
                            case 'E':
                                if (length < 4) {
                                    dateTimeFormatterBuilder.m16097c(new DateTimeFormatterBuilder.C8134i(DateTimeFieldType.f43947l, true));
                                } else {
                                    dateTimeFormatterBuilder.m16106l(DateTimeFieldType.f43947l);
                                    continue;
                                }
                                break;
                            default:
                                switch (cCharAt) {
                                    case 'w':
                                        dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43946k, length, 2);
                                        break;
                                    case 'x':
                                    case 'y':
                                        if (length != 2) {
                                            i10 = 9;
                                            if (i12 + 1 < 25) {
                                                iArr[0] = iArr[0] + 1;
                                                if (m16113b(m16114c(iArr))) {
                                                }
                                                iArr[0] = iArr[0] - 1;
                                            }
                                            if (cCharAt != 'Y') {
                                                dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43937b, length, i10);
                                            } else if (cCharAt != 'x') {
                                                dateTimeFormatterBuilder.m16105k(DateTimeFieldType.f43945j, length, i10);
                                            } else if (cCharAt != 'y') {
                                                dateTimeFormatterBuilder.m16105k(DateTimeFieldType.f43940e, length, i10);
                                            }
                                        } else {
                                            if (i12 + 1 < 25) {
                                                iArr[0] = iArr[0] + 1;
                                                z10 = !m16113b(m16114c(iArr));
                                                iArr[0] = iArr[0] - 1;
                                            } else {
                                                z10 = true;
                                            }
                                            if (cCharAt == 'x') {
                                                DateTime dateTime3 = new DateTime();
                                                dateTimeFormatterBuilder.m16097c(new DateTimeFormatterBuilder.C8137l(DateTimeFieldType.f43945j, dateTime3.mo12598n().mo12535U().mo12572b(dateTime3.mo12597k()) - 30, z10));
                                            } else {
                                                DateTime dateTime4 = new DateTime();
                                                dateTimeFormatterBuilder.m16097c(new DateTimeFormatterBuilder.C8137l(DateTimeFieldType.f43940e, dateTime4.mo12598n().mo12543c0().mo12572b(dateTime4.mo12597k()) - 30, z10));
                                            }
                                        }
                                        break;
                                    case 'z':
                                        if (length < 4) {
                                            DateTimeFormatterBuilder.C8135j c8135j = new DateTimeFormatterBuilder.C8135j(1);
                                            dateTimeFormatterBuilder.m16098d(c8135j, c8135j);
                                        } else {
                                            dateTimeFormatterBuilder.m16098d(new DateTimeFormatterBuilder.C8135j(0), null);
                                            continue;
                                        }
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Illegal pattern component: ".concat(strM16114c));
                                }
                                break;
                        }
                    } else {
                        dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43947l, length, 1);
                    }
                } else if (length == 1) {
                    dateTimeFormatterBuilder.m16097c(new DateTimeFormatterBuilder.C8136k(2, null, "Z", false));
                } else if (length == 2) {
                    dateTimeFormatterBuilder.m16097c(new DateTimeFormatterBuilder.C8136k(2, null, "Z", true));
                } else {
                    DateTimeFormatterBuilder.TimeZoneId timeZoneId = DateTimeFormatterBuilder.TimeZoneId.INSTANCE;
                    dateTimeFormatterBuilder.m16098d(timeZoneId, timeZoneId);
                }
            } else if (length < 3) {
                dateTimeFormatterBuilder.m16099e(DateTimeFieldType.f43942g, length, 2);
            } else if (length >= 4) {
                dateTimeFormatterBuilder.m16106l(DateTimeFieldType.f43942g);
            } else {
                dateTimeFormatterBuilder.m16097c(new DateTimeFormatterBuilder.C8134i(DateTimeFieldType.f43942g, true));
            }
            i11 = i12 + 1;
        }
        c8140bM16109q = dateTimeFormatterBuilder.m16109q();
        if (concurrentHashMap.size() >= 500) {
            return c8140bM16109q;
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16113b(String str) {
        int length = str.length();
        if (length > 0) {
            switch (str.charAt(0)) {
                case 'M':
                    if (length <= 2) {
                        break;
                    }
                case 'C':
                case 'D':
                case 'F':
                case 'H':
                case 'K':
                case 'S':
                case 'W':
                case 'Y':
                case 'c':
                case 'd':
                case 'e':
                case 'h':
                case 'k':
                case 'm':
                case 's':
                case 'w':
                case 'x':
                case 'y':
                    return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static String m16114c(int[] iArr) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = iArr[0];
        char cCharAt = "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i10);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb2.append('\'');
            boolean z10 = false;
            while (i10 < 25) {
                char cCharAt2 = "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i10);
                if (cCharAt2 != '\'') {
                    if (!z10 && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i10--;
                        break;
                    }
                    sb2.append(cCharAt2);
                } else {
                    int i11 = i10 + 1;
                    if (i11 >= 25 || "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i11) != '\'') {
                        z10 = !z10;
                    } else {
                        sb2.append(cCharAt2);
                        i10 = i11;
                    }
                }
                i10++;
            }
        } else {
            sb2.append(cCharAt);
            while (true) {
                int i12 = i10 + 1;
                if (i12 >= 25 || "yyyy-MM-dd'T'HH:mm:ss.SSS".charAt(i12) != cCharAt) {
                    break;
                }
                sb2.append(cCharAt);
                i10 = i12;
            }
        }
        iArr[0] = i10;
        return sb2.toString();
    }
}
