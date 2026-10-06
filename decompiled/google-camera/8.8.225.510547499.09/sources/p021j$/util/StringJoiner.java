package p021j$.util;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class StringJoiner {

    /* JADX INFO: renamed from: a */
    private final String f33158a;

    /* JADX INFO: renamed from: b */
    private final String f33159b;

    /* JADX INFO: renamed from: c */
    private final String f33160c;

    /* JADX INFO: renamed from: d */
    private String[] f33161d;

    /* JADX INFO: renamed from: e */
    private int f33162e;

    /* JADX INFO: renamed from: f */
    private int f33163f;

    public StringJoiner(CharSequence charSequence) {
        this(charSequence, "", "");
    }

    /* JADX INFO: renamed from: a */
    private void m12508a() {
        String[] strArr;
        if (this.f33162e > 1) {
            char[] cArr = new char[this.f33163f];
            int iM12509b = m12509b(this.f33161d[0], cArr, 0);
            int i = 1;
            do {
                int iM12509b2 = iM12509b + m12509b(this.f33159b, cArr, iM12509b);
                iM12509b = iM12509b2 + m12509b(this.f33161d[i], cArr, iM12509b2);
                strArr = this.f33161d;
                strArr[i] = null;
                i++;
            } while (i < this.f33162e);
            this.f33162e = 1;
            strArr[0] = new String(cArr);
        }
    }

    /* JADX INFO: renamed from: b */
    private static int m12509b(String str, char[] cArr, int i) {
        int length = str.length();
        str.getChars(0, length, cArr, i);
        return length;
    }

    public StringJoiner add(CharSequence charSequence) {
        String strValueOf = String.valueOf(charSequence);
        String[] strArr = this.f33161d;
        if (strArr == null) {
            this.f33161d = new String[8];
        } else {
            int i = this.f33162e;
            if (i == strArr.length) {
                this.f33161d = (String[]) Arrays.copyOf(strArr, i * 2);
            }
            this.f33163f = this.f33159b.length() + this.f33163f;
        }
        this.f33163f = strValueOf.length() + this.f33163f;
        String[] strArr2 = this.f33161d;
        int i2 = this.f33162e;
        this.f33162e = i2 + 1;
        strArr2[i2] = strValueOf;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final StringJoiner m12510c(StringJoiner stringJoiner) {
        stringJoiner.getClass();
        if (stringJoiner.f33161d == null) {
            return this;
        }
        stringJoiner.m12508a();
        return add(stringJoiner.f33161d[0]);
    }

    public int length() {
        int i = this.f33162e;
        return this.f33160c.length() + this.f33158a.length() + this.f33163f;
    }

    public String toString() {
        String[] strArr = this.f33161d;
        int i = this.f33162e;
        String str = this.f33158a;
        int length = str.length();
        String str2 = this.f33160c;
        int length2 = str2.length() + length;
        if (length2 == 0) {
            m12508a();
            return i == 0 ? "" : strArr[0];
        }
        char[] cArr = new char[this.f33163f + length2];
        int iM12509b = m12509b(str, cArr, 0);
        if (i > 0) {
            iM12509b += m12509b(strArr[0], cArr, iM12509b);
            for (int i2 = 1; i2 < i; i2++) {
                int iM12509b2 = iM12509b + m12509b(this.f33159b, cArr, iM12509b);
                iM12509b = iM12509b2 + m12509b(strArr[i2], cArr, iM12509b2);
            }
        }
        m12509b(str2, cArr, iM12509b);
        return new String(cArr);
    }

    public StringJoiner(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (charSequence2 == null) {
            throw new NullPointerException("The prefix must not be null");
        }
        if (charSequence == null) {
            throw new NullPointerException("The delimiter must not be null");
        }
        if (charSequence3 == null) {
            throw new NullPointerException("The suffix must not be null");
        }
        this.f33158a = charSequence2.toString();
        this.f33159b = charSequence.toString();
        this.f33160c = charSequence3.toString();
    }
}
