package p000;

import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public abstract class q12 implements u94, s94 {

    /* JADX INFO: renamed from: a */
    public final DateTimeFieldType f57123a;

    /* JADX INFO: renamed from: b */
    public final int f57124b;

    /* JADX INFO: renamed from: c */
    public final boolean f57125c;

    public q12(DateTimeFieldType dateTimeFieldType, int i, boolean z) {
        this.f57123a = dateTimeFieldType;
        this.f57124b = i;
        this.f57125c = z;
    }

    @Override // p000.s94
    public final int estimateParsedLength() {
        return this.f57124b;
    }

    public int parseInto(b22 b22Var, CharSequence charSequence, int i) {
        int i2;
        int i3;
        char cCharAt;
        int iMin = Math.min(this.f57124b, charSequence.length() - i);
        int i4 = 0;
        boolean z = false;
        boolean z2 = false;
        while (i4 < iMin) {
            int i5 = i + i4;
            char cCharAt2 = charSequence.charAt(i5);
            if (i4 == 0 && ((cCharAt2 == '-' || cCharAt2 == '+') && this.f57125c)) {
                boolean z3 = cCharAt2 == '-';
                boolean z4 = cCharAt2 == '+';
                int i6 = i4 + 1;
                if (i6 >= iMin || (cCharAt = charSequence.charAt(i5 + 1)) < '0' || cCharAt > '9') {
                    boolean z5 = z3;
                    z2 = z4;
                    z = z5;
                    break;
                }
                iMin = Math.min(iMin + 1, charSequence.length() - i);
                boolean z6 = z3;
                z2 = z4;
                z = z6;
                i4 = i6;
            } else {
                if (cCharAt2 < '0' || cCharAt2 > '9') {
                    break;
                }
                i4++;
            }
        }
        if (i4 == 0) {
            return ~i;
        }
        if (i4 < 9) {
            int i7 = (z || z2) ? i + 1 : i;
            int i8 = i7 + 1;
            try {
                int iCharAt = charSequence.charAt(i7) - '0';
                i2 = i + i4;
                while (i8 < i2) {
                    int i9 = (iCharAt << 3) + (iCharAt << 1);
                    int i10 = i8 + 1;
                    int iCharAt2 = (charSequence.charAt(i8) + i9) - 48;
                    i8 = i10;
                    iCharAt = iCharAt2;
                }
                i3 = z ? -iCharAt : iCharAt;
            } catch (StringIndexOutOfBoundsException unused) {
                return ~i;
            }
        } else if (z2) {
            i2 = i + i4;
            i3 = Integer.parseInt(charSequence.subSequence(i + 1, i2).toString());
        } else {
            int i11 = i + i4;
            i3 = Integer.parseInt(charSequence.subSequence(i, i11).toString());
            i2 = i11;
        }
        b22Var.m3190k(this.f57123a, i3);
        return i2;
    }
}
