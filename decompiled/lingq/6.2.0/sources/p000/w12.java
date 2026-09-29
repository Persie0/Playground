package p000;

import java.util.Locale;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes3.dex */
public final class w12 implements u94, s94 {

    /* JADX INFO: renamed from: a */
    public final DateTimeFieldType f66215a;

    /* JADX INFO: renamed from: b */
    public final int f66216b;

    /* JADX INFO: renamed from: c */
    public final boolean f66217c;

    public w12(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
        this.f66215a = dateTimeFieldType;
        this.f66216b = i;
        this.f66217c = z;
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return this.f66217c ? 4 : 2;
    }

    @Override // p000.u94
    public final int estimatePrintedLength() {
        return 2;
    }

    @Override // p000.s94
    public final int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        int iCharAt;
        int i2;
        int i3 = i;
        int length = charSequence.length() - i3;
        boolean z = this.f66217c;
        DateTimeFieldType dateTimeFieldType = this.f66215a;
        if (z) {
            int i4 = 0;
            boolean z2 = false;
            boolean z3 = false;
            while (i4 < length) {
                char cCharAt = charSequence.charAt(i3 + i4);
                if (i4 == 0 && (cCharAt == '-' || cCharAt == '+')) {
                    z3 = cCharAt == '-';
                    if (z3) {
                        i4++;
                    } else {
                        i3++;
                        length--;
                    }
                    z2 = true;
                } else {
                    if (cCharAt < '0' || cCharAt > '9') {
                        break;
                    }
                    i4++;
                }
            }
            if (i4 == 0) {
                return ~i3;
            }
            if (z2 || i4 != 2) {
                if (i4 >= 9) {
                    i2 = i4 + i3;
                    iCharAt = Integer.parseInt(charSequence.subSequence(i3, i2).toString());
                } else {
                    int i5 = z3 ? i3 + 1 : i3;
                    int i6 = i5 + 1;
                    try {
                        iCharAt = charSequence.charAt(i5) - '0';
                        i2 = i4 + i3;
                        while (i6 < i2) {
                            int iCharAt2 = (charSequence.charAt(i6) + ((iCharAt << 3) + (iCharAt << 1))) - 48;
                            i6++;
                            iCharAt = iCharAt2;
                        }
                        if (z3) {
                            iCharAt = -iCharAt;
                        }
                    } catch (StringIndexOutOfBoundsException unused) {
                        return ~i3;
                    }
                }
                b22Var.m3190k(dateTimeFieldType, iCharAt);
                return i2;
            }
        } else if (Math.min(2, length) < 2) {
            return ~i3;
        }
        char cCharAt2 = charSequence.charAt(i3);
        if (cCharAt2 < '0' || cCharAt2 > '9') {
            return ~i3;
        }
        int i7 = cCharAt2 - '0';
        char cCharAt3 = charSequence.charAt(i3 + 1);
        if (cCharAt3 < '0' || cCharAt3 > '9') {
            return ~i3;
        }
        int i8 = (((i7 << 3) + (i7 << 1)) + cCharAt3) - 48;
        int i9 = this.f66216b;
        int i10 = i9 - 50;
        int i11 = i10 >= 0 ? i10 % 100 : ((i9 - 49) % 100) + 99;
        b22Var.m3190k(dateTimeFieldType, ((i10 + (i8 < i11 ? 100 : 0)) - i11) + i8);
        return i3 + 2;
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, ir7 ir7Var, Locale locale) {
        int i;
        LocalDateTime localDateTime = (LocalDateTime) ir7Var;
        DateTimeFieldType dateTimeFieldType = this.f66215a;
        if (localDateTime.m18371e(dateTimeFieldType)) {
            try {
                int iM18368b = localDateTime.m18368b(dateTimeFieldType);
                if (iM18368b < 0) {
                    iM18368b = -iM18368b;
                }
                i = iM18368b % 100;
            } catch (RuntimeException unused) {
                i = -1;
            }
        } else {
            i = -1;
        }
        if (i >= 0) {
            nc3.m17345a(appendable, i, 2);
            return;
        }
        StringBuilder sb = (StringBuilder) appendable;
        sb.append((char) 65533);
        sb.append((char) 65533);
    }

    @Override // p000.u94
    public final void printTo(Appendable appendable, long j, s11 s11Var, int i, DateTimeZone dateTimeZone, Locale locale) {
        int i2;
        try {
            int iMo3734b = this.f66215a.mo18335b(s11Var).mo3734b(j);
            if (iMo3734b < 0) {
                iMo3734b = -iMo3734b;
            }
            i2 = iMo3734b % 100;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 < 0) {
            StringBuilder sb = (StringBuilder) appendable;
            sb.append((char) 65533);
            sb.append((char) 65533);
            return;
        }
        nc3.m17345a(appendable, i2, 2);
    }
}
