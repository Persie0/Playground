package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.Locale;
import org.joda.time.DateTimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class v12 implements u94, s94 {

    /* JADX INFO: renamed from: a */
    public final String f64687a;

    /* JADX INFO: renamed from: b */
    public final String f64688b;

    /* JADX INFO: renamed from: c */
    public final boolean f64689c;

    /* JADX INFO: renamed from: d */
    public final int f64690d;

    /* JADX INFO: renamed from: e */
    public final int f64691e;

    public v12(String str, int i, String str2, boolean z) {
        this.f64687a = str;
        this.f64688b = str2;
        this.f64689c = z;
        if (i < 2) {
            ij6.m13959q();
            throw null;
        }
        this.f64690d = 2;
        this.f64691e = i;
    }

    /* JADX INFO: renamed from: a */
    public static int m23040a(CharSequence charSequence, int i, int i2) {
        int i3 = 0;
        for (int iMin = Math.min(charSequence.length() - i, i2); iMin > 0; iMin--) {
            char cCharAt = charSequence.charAt(i + i3);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            i3++;
        }
        return i3;
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return estimatePrintedLength();
    }

    @Override // p000.u94
    public final int estimatePrintedLength() {
        int i = this.f64690d;
        int i2 = (i + 1) << 1;
        if (this.f64689c) {
            i2 += i - 1;
        }
        String str = this.f64687a;
        return (str == null || str.length() <= i2) ? i2 : str.length();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    @Override // p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        boolean z;
        int iM17348d;
        int iM17348d2;
        int iM17348d3;
        char cCharAt;
        boolean z2 = false;
        int length = charSequence.length() - i;
        String str = this.f64688b;
        if (str != null) {
            if (str.length() == 0) {
                if (length <= 0 || ((cCharAt = charSequence.charAt(i)) != '-' && cCharAt != '+')) {
                    b22Var.m3192m(0);
                    return i;
                }
            } else if (y12.m24829p(str, charSequence, i)) {
                b22Var.m3192m(0);
                return str.length() + i;
            }
        }
        if (length <= 1) {
            return ~i;
        }
        char cCharAt2 = charSequence.charAt(i);
        if (cCharAt2 == '-') {
            z = true;
        } else {
            if (cCharAt2 != '+') {
                return ~i;
            }
            z = false;
        }
        int i2 = i + 1;
        if (m23040a(charSequence, i2, 2) >= 2 && (iM17348d = nc3.m17348d(charSequence, i2)) <= 23) {
            int iCharAt = iM17348d * 3600000;
            int i3 = length - 3;
            int i4 = i + 3;
            if (i3 > 0) {
                char cCharAt3 = charSequence.charAt(i4);
                if (cCharAt3 == ':') {
                    i3 = length - 4;
                    i4 = i + 4;
                    z2 = true;
                } else if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                }
                int iM23040a = m23040a(charSequence, i4, 2);
                if (iM23040a != 0 || z2) {
                    if (iM23040a >= 2 && (iM17348d2 = nc3.m17348d(charSequence, i4)) <= 59) {
                        iCharAt += iM17348d2 * 60000;
                        int i5 = i3 - 2;
                        int i6 = i4 + 2;
                        if (i5 > 0) {
                            if (!z2) {
                                i4 = i6;
                            } else if (charSequence.charAt(i6) != ':') {
                                i4 = i6;
                            } else {
                                i5 = i3 - 3;
                                i4 += 3;
                            }
                            int iM23040a2 = m23040a(charSequence, i4, 2);
                            if (iM23040a2 != 0 || z2) {
                                if (iM23040a2 >= 2 && (iM17348d3 = nc3.m17348d(charSequence, i4)) <= 59) {
                                    iCharAt += iM17348d3 * DescriptorProtos.Edition.EDITION_2023_VALUE;
                                    int i7 = i4 + 2;
                                    if (i5 - 2 > 0) {
                                        if (!z2) {
                                            i4 = i7;
                                        } else if (charSequence.charAt(i7) == '.' || charSequence.charAt(i7) == ',') {
                                            i4 += 3;
                                        } else {
                                            i4 = i7;
                                        }
                                        int iM23040a3 = m23040a(charSequence, i4, 3);
                                        if (iM23040a3 != 0 || z2) {
                                            if (iM23040a3 < 1) {
                                                return ~i4;
                                            }
                                            int i8 = i4 + 1;
                                            iCharAt += (charSequence.charAt(i4) - '0') * 100;
                                            if (iM23040a3 > 1) {
                                                int i9 = i4 + 2;
                                                iCharAt += (charSequence.charAt(i8) - '0') * 10;
                                                if (iM23040a3 > 2) {
                                                    i4 += 3;
                                                    iCharAt += charSequence.charAt(i9) - '0';
                                                } else {
                                                    i4 = i9;
                                                }
                                            } else {
                                                i4 = i8;
                                            }
                                        }
                                    } else {
                                        i4 = i7;
                                    }
                                }
                                return ~i4;
                            }
                        } else {
                            i4 = i6;
                        }
                    }
                    return ~i4;
                }
            }
            if (z) {
                iCharAt = -iCharAt;
            }
            b22Var.m3192m(Integer.valueOf(iCharAt));
            return i4;
        }
        return ~i2;
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        String str;
        if (dateTimeZone == null) {
            return;
        }
        if (i == 0 && (str = this.f64687a) != null) {
            ((StringBuilder) appendable).append((CharSequence) str);
            return;
        }
        if (i >= 0) {
            ((StringBuilder) appendable).append('+');
        } else {
            ((StringBuilder) appendable).append('-');
            i = -i;
        }
        int i2 = i / 3600000;
        nc3.m17345a(appendable, i2, 2);
        int i3 = this.f64691e;
        if (i3 == 1) {
            return;
        }
        int i4 = i - (i2 * 3600000);
        int i5 = this.f64690d;
        if (i4 != 0 || i5 > 1) {
            int i6 = i4 / 60000;
            boolean z = this.f64689c;
            if (z) {
                ((StringBuilder) appendable).append(':');
            }
            nc3.m17345a(appendable, i6, 2);
            if (i3 == 2) {
                return;
            }
            int i7 = i4 - (i6 * 60000);
            if (i7 != 0 || i5 > 2) {
                int i8 = i7 / DescriptorProtos.Edition.EDITION_2023_VALUE;
                if (z) {
                    ((StringBuilder) appendable).append(':');
                }
                nc3.m17345a(appendable, i8, 2);
                if (i3 == 3) {
                    return;
                }
                int i9 = i7 - (i8 * DescriptorProtos.Edition.EDITION_2023_VALUE);
                if (i9 != 0 || i5 > 3) {
                    if (z) {
                        ((StringBuilder) appendable).append('.');
                    }
                    nc3.m17345a(appendable, i9, 3);
                }
            }
        }
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, ir7 ir7Var, Locale locale) {
    }
}
