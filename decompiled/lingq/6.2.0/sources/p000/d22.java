package p000;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class d22 {
    /* JADX WARN: Code duplicated, block: B:103:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:115:0x0216  */
    /* JADX WARN: Code duplicated, block: B:221:0x0400  */
    /* JADX WARN: Code duplicated, block: B:223:0x0408  */
    /* JADX WARN: Code duplicated, block: B:226:0x040f  */
    /* JADX WARN: Code duplicated, block: B:233:0x0424  */
    /* JADX WARN: Code duplicated, block: B:235:0x0452  */
    /* JADX WARN: Code duplicated, block: B:237:0x0456  */
    /* JADX WARN: Code duplicated, block: B:274:0x04ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x04b2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:301:0x049a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x0490 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:315:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:233:0x0424, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public static e22 m9997a(String str) {
        int i;
        int i2;
        int i3;
        char upperCase;
        int i4;
        int i5;
        int i6;
        char cCharAt;
        char c;
        char cCharAt2;
        int i7;
        int i8;
        str.getClass();
        int i9 = 0;
        char c2 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z = false;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 1;
        while (i9 < str.length()) {
            if (c2 == 0) {
                int i19 = i9 + 1;
                if (i19 >= str.length() && (str.charAt(i9) == '+' || str.charAt(i9) == '-')) {
                    throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i9, ": Unexpected end of string; 'P' designator is required"));
                }
                char cCharAt3 = str.charAt(i9);
                if (cCharAt3 == '+' || cCharAt3 == '-') {
                    if (str.charAt(i9) == '-') {
                        i18 = -1;
                    }
                    if (str.charAt(i19) != 'P') {
                        throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i19, ": ", "Expected 'P', got '" + str.charAt(i19) + '\''));
                    }
                    i9 += 2;
                } else {
                    if (cCharAt3 != 'P') {
                        throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i9, ": ", "Expected '+', '-', 'P', got '" + str.charAt(i9) + '\''));
                    }
                    i9 = i19;
                }
                c2 = 1;
                i10 = i10;
            } else {
                int i20 = i10;
                char cCharAt4 = str.charAt(i9);
                if (cCharAt4 == '+' || cCharAt4 == '-') {
                    int i21 = str.charAt(i9) == '-' ? i18 * (-1) : i18;
                    int i22 = i9 + 1;
                    if (i22 < str.length()) {
                        char cCharAt5 = str.charAt(i22);
                        int i23 = i21;
                        if ('0' <= cCharAt5 && cCharAt5 < ':') {
                            i = i22;
                            i2 = i23;
                            long jAddExact = 0;
                            while (true) {
                                if (i < str.length()) {
                                    i3 = i11;
                                    break;
                                }
                                cCharAt2 = str.charAt(i);
                                i3 = i11;
                                if ('0' > cCharAt2 || cCharAt2 >= ':') {
                                    break;
                                }
                                i7 = i12;
                                i8 = i13;
                                try {
                                    jAddExact = Math.addExact(Math.multiplyExact(jAddExact, 10L), str.charAt(i) - '0');
                                    i++;
                                    i11 = i3;
                                    i12 = i7;
                                    i13 = i8;
                                } catch (ArithmeticException unused) {
                                    throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i9, ": The number is too large"));
                                }
                            }
                            int i24 = i12;
                            i13 = i13;
                            long j = ((long) i2) * jAddExact;
                            if (i != str.length()) {
                                throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Expected a designator after the numerical value"));
                            }
                            upperCase = Character.toUpperCase(str.charAt(i));
                            i4 = i2;
                            int i25 = i14;
                            int i26 = i15;
                            int i27 = i16;
                            if (upperCase != ',' || upperCase == '.') {
                                i5 = i + 1;
                                if (i5 >= str.length()) {
                                    throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i5, ": ", "Expected designator 'S' after " + str.charAt(i)));
                                }
                                i = i5;
                                while (i < str.length() && '0' <= (cCharAt = str.charAt(i)) && cCharAt < ':') {
                                    i++;
                                }
                                i6 = i - i5;
                                if (i6 > 9) {
                                    throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i5, ": Only the nanosecond fractions of a second are supported"));
                                }
                                String str2 = str.substring(i5, i) + cl9.m4837T(9 - i6, "0");
                                ci8.m4727l(10);
                                int i28 = Integer.parseInt(str2, 10) * i4;
                                if (str.charAt(i) != 'S') {
                                    throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Expected the 'S' designator after a fraction"));
                                }
                                if (c2 < '\t' || c2 < 6) {
                                    throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                }
                                if (j < -2147483648L || j > 2147483647L) {
                                    throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i9, ": ", "Value " + j + " does not fit into an Int, which is required for component 'S'"));
                                }
                                int i29 = (int) j;
                                i17 = i28;
                                c2 = '\t';
                                i11 = i3;
                                i12 = i24;
                                i13 = i13;
                                i10 = i20;
                                i14 = i25;
                                i15 = i26;
                                i16 = i29;
                            } else {
                                if (upperCase != 'D') {
                                    if (upperCase != 'H') {
                                        if (upperCase == 'M') {
                                            if (c2 >= 6) {
                                                c = '\b';
                                                if (c2 >= '\b') {
                                                    throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                                }
                                                if (j < -2147483648L || j > 2147483647L) {
                                                    throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i9, ": ", "Value " + j + " does not fit into an Int, which is required for component 'M'"));
                                                }
                                                i15 = (int) j;
                                                i13 = i13;
                                            } else {
                                                c = 3;
                                                if (c2 >= 3) {
                                                    throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                                }
                                                if (j < -2147483648L || j > 2147483647L) {
                                                    throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i9, ": ", "Value " + j + " does not fit into an Int, which is required for component 'M'"));
                                                }
                                                i13 = (int) j;
                                                i15 = i26;
                                            }
                                            c2 = c;
                                            i11 = i3;
                                            i12 = i24;
                                            i10 = i20;
                                            i14 = i25;
                                            i16 = i27;
                                        } else if (upperCase != 'S') {
                                            if (upperCase != 'W') {
                                                if (upperCase != 'Y') {
                                                    throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Expected a designator after the numerical value"));
                                                }
                                                if (c2 >= 2) {
                                                    throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                                }
                                                if (j < -2147483648L || j > 2147483647L) {
                                                    throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i9, ": ", "Value " + j + " does not fit into an Int, which is required for component 'Y'"));
                                                }
                                                i12 = (int) j;
                                                c2 = 2;
                                                i11 = i3;
                                            } else {
                                                if (c2 >= 4) {
                                                    throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                                }
                                                if (j < -2147483648L || j > 2147483647L) {
                                                    throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i9, ": ", "Value " + j + " does not fit into an Int, which is required for component 'W'"));
                                                }
                                                i11 = (int) j;
                                                c2 = 4;
                                                i12 = i24;
                                            }
                                            i10 = i20;
                                        } else {
                                            if (c2 >= '\t' || c2 < 6) {
                                                throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                            }
                                            if (j < -2147483648L || j > 2147483647L) {
                                                throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i9, ": ", "Value " + j + " does not fit into an Int, which is required for component 'S'"));
                                            }
                                            i16 = (int) j;
                                            i11 = i3;
                                            i12 = i24;
                                            i13 = i13;
                                            i10 = i20;
                                            i14 = i25;
                                            i15 = i26;
                                            c2 = '\t';
                                        }
                                    } else {
                                        if (c2 >= 7 || c2 < 6) {
                                            throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                        }
                                        if (j < -2147483648L || j > 2147483647L) {
                                            throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i9, ": ", "Value " + j + " does not fit into an Int, which is required for component 'H'"));
                                        }
                                        i14 = (int) j;
                                        c2 = 7;
                                        i11 = i3;
                                        i12 = i24;
                                        i13 = i13;
                                        i10 = i20;
                                        i15 = i26;
                                        i16 = i27;
                                    }
                                } else {
                                    if (c2 >= 5) {
                                        throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                                    }
                                    if (j < -2147483648L || j > 2147483647L) {
                                        throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i9, ": ", "Value " + j + " does not fit into an Int, which is required for component 'D'"));
                                    }
                                    i10 = (int) j;
                                    c2 = 5;
                                    i11 = i3;
                                    i12 = i24;
                                }
                                i14 = i25;
                                i15 = i26;
                                i16 = i27;
                            }
                            i9 = i + 1;
                            z = true;
                        }
                    }
                    throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i22, ": ", "A number expected after '" + str.charAt(i22) + '\''));
                }
                if (('0' <= cCharAt4 && cCharAt4 < ':') || cCharAt4 != 'T') {
                    i = i9;
                    i2 = i18;
                    long jAddExact2 = 0;
                    while (true) {
                        if (i < str.length()) {
                            i3 = i11;
                            break;
                        }
                        cCharAt2 = str.charAt(i);
                        i3 = i11;
                        if ('0' > cCharAt2) {
                            break;
                        }
                        break;
                        break;
                        i++;
                        i11 = i3;
                        i12 = i7;
                        i13 = i8;
                    }
                    int i210 = i12;
                    i13 = i13;
                    long j2 = ((long) i2) * jAddExact2;
                    if (i != str.length()) {
                        throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Expected a designator after the numerical value"));
                    }
                    upperCase = Character.toUpperCase(str.charAt(i));
                    i4 = i2;
                    int i211 = i14;
                    int i212 = i15;
                    int i213 = i16;
                    if (upperCase != ',') {
                        i5 = i + 1;
                        if (i5 >= str.length()) {
                            throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i5, ": ", "Expected designator 'S' after " + str.charAt(i)));
                        }
                        i = i5;
                        while (i < str.length()) {
                            i++;
                        }
                        i6 = i - i5;
                        if (i6 > 9) {
                            throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i5, ": Only the nanosecond fractions of a second are supported"));
                        }
                        String str3 = str.substring(i5, i) + cl9.m4837T(9 - i6, "0");
                        ci8.m4727l(10);
                        int i214 = Integer.parseInt(str3, 10) * i4;
                        if (str.charAt(i) != 'S') {
                            throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Expected the 'S' designator after a fraction"));
                        }
                        if (c2 < '\t') {
                        }
                        throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                    }
                    i5 = i + 1;
                    if (i5 >= str.length()) {
                        throw new DateTimeFormatException(g9a.m12431h("Parse error at char ", i5, ": ", "Expected designator 'S' after " + str.charAt(i)));
                    }
                    i = i5;
                    while (i < str.length()) {
                        i++;
                    }
                    i6 = i - i5;
                    if (i6 > 9) {
                        throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i5, ": Only the nanosecond fractions of a second are supported"));
                    }
                    String str4 = str.substring(i5, i) + cl9.m4837T(9 - i6, "0");
                    ci8.m4727l(10);
                    int i215 = Integer.parseInt(str4, 10) * i4;
                    if (str.charAt(i) != 'S') {
                        throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Expected the 'S' designator after a fraction"));
                    }
                    if (c2 < '\t') {
                    }
                    throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i, ": Wrong component order: should be 'Y', 'M', 'W', 'D', then designator 'T', then 'H', 'M', 'S'"));
                    i9 = i + 1;
                    z = true;
                } else {
                    if (c2 >= 6) {
                        throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i9, ": Only one 'T' designator is allowed"));
                    }
                    i9++;
                    i10 = i20;
                    c2 = 6;
                }
            }
        }
        if (c2 == 0) {
            throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i9, ": Unexpected end of input; 'P' designator is required"));
        }
        if (c2 == 6) {
            throw new DateTimeFormatException(ux5.m22989l("Parse error at char ", i9, ": Unexpected end of input; at least one time component is required after 'T'"));
        }
        long j3 = ((long) i10) + ((long) (i11 * 7));
        if (-2147483648L > j3 || j3 > 2147483647L) {
            throw new DateTimeFormatException("Parse error at char 0: The total number of days under 'D' and 'W' designators should fit into an Int");
        }
        int i30 = (int) j3;
        if (!z) {
            throw new DateTimeFormatException("Parse error at char 0: At least one component is required, but none were found");
        }
        long j4 = i17;
        long jM17306b = nad.m17306b(i12, i13);
        long j5 = (j4 / 1000000000) + (((((long) i14) * 60) + ((long) i15)) * 60) + ((long) i16);
        try {
            long j6 = j4 % 1000000000;
            if (j5 > 0 && j6 < 0) {
                j5--;
                j6 += 1000000000;
            } else if (j5 < 0 && j6 > 0) {
                j5++;
                j6 -= 1000000000;
            }
            long jAddExact3 = Math.addExact(Math.multiplyExact(j5, 1000000000L), j6);
            return jAddExact3 != 0 ? new f22(i30, jM17306b, jAddExact3) : new c12(i30, jM17306b);
        } catch (ArithmeticException unused2) {
            StringBuilder sbM22994q = ux5.m22994q(i14, i15, "The total number of nanoseconds in ", " hours, ", " minutes, ");
            sbM22994q.append(i16);
            sbM22994q.append(" seconds, and ");
            sbM22994q.append(j4);
            sbM22994q.append(" nanoseconds overflows a Long");
            throw new IllegalArgumentException(sbM22994q.toString());
        }
    }

    public final KSerializer serializer() {
        return h22.f41691b;
    }
}
