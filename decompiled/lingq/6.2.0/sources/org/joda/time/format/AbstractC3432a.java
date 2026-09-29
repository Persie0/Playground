package org.joda.time.format;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.joda.time.DateTime;
import org.joda.time.DateTimeFieldType;
import p000.C3386nv;
import p000.k12;
import p000.t12;
import p000.u12;
import p000.v12;
import p000.w12;
import p000.y12;

/* JADX INFO: renamed from: org.joda.time.format.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3432a {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f54925a = new ConcurrentHashMap();

    static {
        new AtomicReferenceArray(25);
    }

    /* JADX WARN: Code duplicated, block: B:160:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:68:0x010c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0114 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0116 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:73:0x0118  */
    /* JADX WARN: Code duplicated, block: B:75:0x0120  */
    /* JADX WARN: Code duplicated, block: B:77:0x0123  */
    /* JADX WARN: Code duplicated, block: B:78:0x0146  */
    /* JADX WARN: Code duplicated, block: B:79:0x0169  */
    /* JADX WARN: Code duplicated, block: B:81:0x016f  */
    /* JADX WARN: Code duplicated, block: B:83:0x017e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0186 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0188 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:91:0x0192 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0194  */
    /* JADX WARN: Code duplicated, block: B:95:0x019a  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01a8  */
    /* JADX WARN: Switch 'out' block B:62:0x00f5 for B:41:0x0076 already processed. Defaulting to fallback option. */
    /* JADX INFO: renamed from: a */
    public static k12 m18451a(String str) {
        k12 k12Var;
        int i;
        String strM18452b;
        int length;
        boolean z;
        String strM18452b2;
        int length2;
        boolean z2;
        if (str.length() == 0) {
            C3386nv.m17626m("Invalid pattern specification: Pattern is null or empty");
            return null;
        }
        ConcurrentHashMap concurrentHashMap = f54925a;
        k12 k12Var2 = (k12) concurrentHashMap.get(str);
        if (k12Var2 != null) {
            return k12Var2;
        }
        y12 y12Var = new y12();
        int length3 = str.length();
        int[] iArr = new int[1];
        int i2 = 0;
        while (i2 < length3) {
            iArr[0] = i2;
            String strM18452b3 = m18452b(str, iArr);
            int i3 = iArr[0];
            int length4 = strM18452b3.length();
            if (length4 == 0) {
                k12 k12VarM24844r = y12Var.m24844r();
                return (concurrentHashMap.size() < 500 || (k12Var = (k12) concurrentHashMap.putIfAbsent(str, k12VarM24844r)) == null) ? k12VarM24844r : k12Var;
            }
            char cCharAt = strM18452b3.charAt(0);
            if (cCharAt == '\'') {
                String strSubstring = strM18452b3.substring(1);
                if (strSubstring.length() == 1) {
                    y12Var.m24838i(strSubstring.charAt(0));
                } else {
                    y12Var.m24839j(new String(strSubstring));
                }
            } else if (cCharAt == 'K') {
                y12Var.m24835f(DateTimeFieldType.f54806I, length4, 2);
            } else if (cCharAt != 'M') {
                if (cCharAt == 'S') {
                    y12Var.m24837h(DateTimeFieldType.f54812O, length4, length4);
                } else if (cCharAt == 'a') {
                    y12Var.m24842m(DateTimeFieldType.f54805H);
                } else if (cCharAt == 'h') {
                    y12Var.m24835f(DateTimeFieldType.f54807J, length4, 2);
                } else if (cCharAt == 'k') {
                    y12Var.m24835f(DateTimeFieldType.f54808K, length4, 2);
                } else if (cCharAt == 'm') {
                    y12Var.m24835f(DateTimeFieldType.f54811N, length4, 2);
                } else if (cCharAt == 's') {
                    y12Var.m24835f(DateTimeFieldType.f54813P, length4, 2);
                } else if (cCharAt == 'G') {
                    y12Var.m24842m(DateTimeFieldType.f54816a);
                } else if (cCharAt == 'H') {
                    y12Var.m24835f(DateTimeFieldType.f54809L, length4, 2);
                } else if (cCharAt == 'Y') {
                    if (length4 != 2) {
                        if (i3 + 1 < length3) {
                            iArr[0] = iArr[0] + 1;
                            strM18452b2 = m18452b(str, iArr);
                            length2 = strM18452b2.length();
                            if (length2 > 0) {
                                switch (strM18452b2.charAt(0)) {
                                    case 'M':
                                        if (length2 <= 2) {
                                            z2 = false;
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
                                        z2 = true;
                                        break;
                                    default:
                                        z2 = false;
                                        break;
                                }
                            } else {
                                z2 = false;
                            }
                            z = !z2;
                            iArr[0] = iArr[0] - 1;
                        } else {
                            z = true;
                        }
                        if (cCharAt == 'x') {
                            DateTime dateTime = new DateTime();
                            y12Var.m24834e(new w12(DateTimeFieldType.f54820e, dateTime.mo18365a().mo18386I().mo3734b(dateTime.mo18366b()) - 30, z));
                        } else {
                            DateTime dateTime2 = new DateTime();
                            y12Var.m24834e(new w12(DateTimeFieldType.f54825j, dateTime2.mo18365a().mo18383D().mo3734b(dateTime2.mo18366b()) - 30, z));
                        }
                    } else {
                        i = 9;
                        if (i3 + 1 < length3) {
                            iArr[0] = iArr[0] + 1;
                            strM18452b = m18452b(str, iArr);
                            length = strM18452b.length();
                            if (length > 0) {
                                switch (strM18452b.charAt(0)) {
                                    case 'M':
                                        if (length <= 2) {
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
                                        i = length4;
                                        break;
                                }
                            }
                            iArr[0] = iArr[0] - 1;
                        }
                        if (cCharAt != 'Y') {
                            y12Var.m24835f(DateTimeFieldType.f54817b, length4, i);
                        } else if (cCharAt != 'x') {
                            y12Var.m24841l(DateTimeFieldType.f54825j, length4, i);
                        } else if (cCharAt != 'y') {
                            y12Var.m24841l(DateTimeFieldType.f54820e, length4, i);
                        }
                    }
                } else if (cCharAt != 'Z') {
                    if (cCharAt == 'd') {
                        y12Var.m24835f(DateTimeFieldType.f54823h, length4, 2);
                    } else if (cCharAt != 'e') {
                        switch (cCharAt) {
                            case 'C':
                                y12Var.m24841l(DateTimeFieldType.f54818c, length4, length4);
                                continue;
                            case 'D':
                                y12Var.m24835f(DateTimeFieldType.f54821f, length4, 3);
                                continue;
                            case 'E':
                                if (length4 < 4) {
                                    y12Var.m24834e(new t12(DateTimeFieldType.f54827l, true));
                                } else {
                                    y12Var.m24842m(DateTimeFieldType.f54827l);
                                    continue;
                                }
                                break;
                            default:
                                switch (cCharAt) {
                                    case 'w':
                                        y12Var.m24835f(DateTimeFieldType.f54826k, length4, 2);
                                        break;
                                    case 'x':
                                    case 'y':
                                        if (length4 != 2) {
                                            i = 9;
                                            if (i3 + 1 < length3) {
                                                iArr[0] = iArr[0] + 1;
                                                strM18452b = m18452b(str, iArr);
                                                length = strM18452b.length();
                                                if (length > 0) {
                                                    switch (strM18452b.charAt(0)) {
                                                        case 'M':
                                                            if (length <= 2) {
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
                                                            i = length4;
                                                            break;
                                                    }
                                                }
                                                iArr[0] = iArr[0] - 1;
                                            }
                                            if (cCharAt != 'Y') {
                                                y12Var.m24835f(DateTimeFieldType.f54817b, length4, i);
                                            } else if (cCharAt != 'x') {
                                                y12Var.m24841l(DateTimeFieldType.f54825j, length4, i);
                                            } else if (cCharAt != 'y') {
                                                y12Var.m24841l(DateTimeFieldType.f54820e, length4, i);
                                            }
                                        } else {
                                            if (i3 + 1 < length3) {
                                                iArr[0] = iArr[0] + 1;
                                                strM18452b2 = m18452b(str, iArr);
                                                length2 = strM18452b2.length();
                                                if (length2 > 0) {
                                                    switch (strM18452b2.charAt(0)) {
                                                        case 'M':
                                                            if (length2 <= 2) {
                                                                z2 = false;
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
                                                            z2 = true;
                                                            break;
                                                        default:
                                                            z2 = false;
                                                            break;
                                                    }
                                                } else {
                                                    z2 = false;
                                                }
                                                z = !z2;
                                                iArr[0] = iArr[0] - 1;
                                            } else {
                                                z = true;
                                            }
                                            if (cCharAt == 'x') {
                                                DateTime dateTime3 = new DateTime();
                                                y12Var.m24834e(new w12(DateTimeFieldType.f54825j, dateTime3.mo18365a().mo18383D().mo3734b(dateTime3.mo18366b()) - 30, z));
                                            } else {
                                                DateTime dateTime4 = new DateTime();
                                                y12Var.m24834e(new w12(DateTimeFieldType.f54820e, dateTime4.mo18365a().mo18386I().mo3734b(dateTime4.mo18366b()) - 30, z));
                                            }
                                        }
                                        break;
                                    case 'z':
                                        if (length4 < 4) {
                                            u12 u12Var = new u12(1);
                                            y12Var.m24833d(u12Var, u12Var);
                                        } else {
                                            y12Var.m24833d(new u12(0), null);
                                            continue;
                                        }
                                        break;
                                    default:
                                        C3386nv.m17626m("Illegal pattern component: ".concat(strM18452b3));
                                        return null;
                                }
                                break;
                        }
                    } else {
                        y12Var.m24835f(DateTimeFieldType.f54827l, length4, 1);
                    }
                } else if (length4 == 1) {
                    y12Var.m24834e(new v12(null, 2, "Z", false));
                } else if (length4 == 2) {
                    y12Var.m24834e(new v12(null, 2, "Z", true));
                } else {
                    DateTimeFormatterBuilder$TimeZoneId dateTimeFormatterBuilder$TimeZoneId = DateTimeFormatterBuilder$TimeZoneId.INSTANCE;
                    y12Var.m24833d(dateTimeFormatterBuilder$TimeZoneId, dateTimeFormatterBuilder$TimeZoneId);
                }
            } else if (length4 < 3) {
                y12Var.m24835f(DateTimeFieldType.f54822g, length4, 2);
            } else if (length4 >= 4) {
                y12Var.m24842m(DateTimeFieldType.f54822g);
            } else {
                y12Var.m24834e(new t12(DateTimeFieldType.f54822g, true));
            }
            i2 = i3 + 1;
        }
        k12 k12VarM24844r2 = y12Var.m24844r();
        if (concurrentHashMap.size() < 500) {
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m18452b(String str, int[] iArr) {
        StringBuilder sb = new StringBuilder();
        int i = iArr[0];
        int length = str.length();
        char cCharAt = str.charAt(i);
        if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
            sb.append('\'');
            boolean z = false;
            while (i < length) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 != '\'') {
                    if (!z && ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || (cCharAt2 >= 'a' && cCharAt2 <= 'z'))) {
                        i--;
                        break;
                    }
                    sb.append(cCharAt2);
                } else {
                    int i2 = i + 1;
                    if (i2 >= length || str.charAt(i2) != '\'') {
                        z = !z;
                    } else {
                        sb.append(cCharAt2);
                        i = i2;
                    }
                }
                i++;
            }
        } else {
            sb.append(cCharAt);
            while (true) {
                int i3 = i + 1;
                if (i3 >= length || str.charAt(i3) != cCharAt) {
                    break;
                }
                sb.append(cCharAt);
                i = i3;
            }
        }
        iArr[0] = i;
        return sb.toString();
    }
}
