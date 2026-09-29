package p000;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class gh1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40789a;

    /* JADX INFO: renamed from: b */
    public int f40790b;

    /* JADX INFO: renamed from: c */
    public int f40791c;

    /* JADX INFO: renamed from: d */
    public Object f40792d;

    /* JADX INFO: renamed from: e */
    public Object f40793e;

    public gh1(CharSequence charSequence, int i, Locale locale) {
        this.f40789a = 4;
        this.f40792d = charSequence;
        if (charSequence.length() < 0) {
            j54.m14288a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            j54.m14288a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.f40793e = wordInstance;
        this.f40790b = Math.max(0, -50);
        this.f40791c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new wu0(charSequence, i));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m12622a(Object obj, long j) {
        int i = this.f40791c;
        if (i > 0) {
            if (j <= ((long[]) this.f40792d)[((this.f40790b + i) - 1) % ((Object[]) this.f40793e).length]) {
                m12624c();
            }
        }
        m12626e();
        int i2 = this.f40790b;
        int i3 = this.f40791c;
        Object[] objArr = (Object[]) this.f40793e;
        int length = (i2 + i3) % objArr.length;
        ((long[]) this.f40792d)[length] = j;
        objArr[length] = obj;
        this.f40791c = i3 + 1;
    }

    /* JADX INFO: renamed from: b */
    public void m12623b(int i) {
        int i2 = this.f40790b;
        int i3 = this.f40791c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder sbM22994q = ux5.m22994q(i, i2, "Invalid offset: ", ". Valid range is [", " , ");
        sbM22994q.append(i3);
        sbM22994q.append(']');
        j54.m14288a(sbM22994q.toString());
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m12624c() {
        this.f40790b = 0;
        this.f40791c = 0;
        Arrays.fill((Object[]) this.f40793e, (Object) null);
    }

    /* JADX INFO: renamed from: d */
    public tb7 m12625d() {
        ArrayList arrayList = (ArrayList) this.f40792d;
        if (!arrayList.isEmpty() && this.f40790b < arrayList.size()) {
            return (tb7) arrayList.get(this.f40790b);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        this.f40790b = 0;
        return (tb7) arrayList.get(0);
    }

    /* JADX INFO: renamed from: e */
    public void m12626e() {
        int length = ((Object[]) this.f40793e).length;
        if (this.f40791c < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.f40790b;
        int i3 = length - i2;
        System.arraycopy((long[]) this.f40792d, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.f40793e, this.f40790b, objArr, 0, i3);
        int i4 = this.f40790b;
        if (i4 > 0) {
            System.arraycopy((long[]) this.f40792d, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.f40793e, 0, objArr, i3, this.f40790b);
        }
        this.f40792d = jArr;
        this.f40793e = objArr;
        this.f40790b = 0;
    }

    /* JADX INFO: renamed from: f */
    public int m12627f() {
        pj3 pj3Var = (pj3) this.f40793e;
        String str = (String) this.f40792d;
        if (pj3Var == null) {
            return str.length();
        }
        return (pj3Var.f56311b - pj3Var.m19198d()) + (str.length() - (this.f40791c - this.f40790b));
    }

    /* JADX INFO: renamed from: g */
    public boolean m12628g(int i) {
        CharSequence charSequence = (CharSequence) this.f40792d;
        int i2 = this.f40790b + 1;
        if (i > this.f40791c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
            int i3 = i - 1;
            if (!Character.isSurrogate(charSequence.charAt(i3))) {
                if (!pq2.m19449d()) {
                    return false;
                }
                pq2 pq2VarM19448a = pq2.m19448a();
                if (pq2VarM19448a.m19451c() != 1 || pq2VarM19448a.m19450b(charSequence, i3) == -1) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public boolean m12629h(int i) {
        int i2 = this.f40790b + 1;
        if (i > this.f40791c || i2 > i) {
            return false;
        }
        return uea.m22717b(Character.codePointBefore((CharSequence) this.f40792d, i));
    }

    /* JADX INFO: renamed from: i */
    public boolean m12630i(int i) {
        m12623b(i);
        if (!((BreakIterator) this.f40793e).isBoundary(i)) {
            return false;
        }
        if (m12632k(i) && m12632k(i - 1) && m12632k(i + 1)) {
            return false;
        }
        return i <= 0 || i >= ((CharSequence) this.f40792d).length() - 1 || !(m12631j(i) || m12631j(i + 1));
    }

    /* JADX INFO: renamed from: j */
    public boolean m12631j(int i) {
        CharSequence charSequence = (CharSequence) this.f40792d;
        int i2 = i - 1;
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (fa4.m11650l(unicodeBlockOf, unicodeBlock) && fa4.m11650l(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return fa4.m11650l(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && fa4.m11650l(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA);
    }

    /* JADX INFO: renamed from: k */
    public boolean m12632k(int i) {
        CharSequence charSequence = (CharSequence) this.f40792d;
        int i2 = this.f40790b;
        if (i >= this.f40791c || i2 > i) {
            return false;
        }
        if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
            if (!pq2.m19449d()) {
                return false;
            }
            pq2 pq2VarM19448a = pq2.m19448a();
            if (pq2VarM19448a.m19451c() != 1 || pq2VarM19448a.m19450b(charSequence, i) == -1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public boolean m12633l(int i) {
        int i2 = this.f40790b;
        if (i >= this.f40791c || i2 > i) {
            return false;
        }
        return uea.m22717b(Character.codePointAt((CharSequence) this.f40792d, i));
    }

    /* JADX INFO: renamed from: m */
    public int m12634m(int i) {
        m12623b(i);
        int iFollowing = ((BreakIterator) this.f40793e).following(i);
        return (m12632k(iFollowing + (-1)) && m12632k(iFollowing) && !m12631j(iFollowing)) ? m12634m(iFollowing) : iFollowing;
    }

    /* JADX INFO: renamed from: n */
    public Object m12635n(long j, boolean z) {
        Object objM12638q = null;
        long j2 = Long.MAX_VALUE;
        while (this.f40791c > 0) {
            long j3 = j - ((long[]) this.f40792d)[this.f40790b];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            objM12638q = m12638q();
            j2 = j3;
        }
        return objM12638q;
    }

    /* JADX INFO: renamed from: o */
    public synchronized Object m12636o() {
        return this.f40791c == 0 ? null : m12638q();
    }

    /* JADX INFO: renamed from: p */
    public synchronized Object m12637p(long j) {
        return m12635n(j, true);
    }

    /* JADX INFO: renamed from: q */
    public Object m12638q() {
        bna.m3987z(this.f40791c > 0);
        Object[] objArr = (Object[]) this.f40793e;
        int i = this.f40790b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f40790b = (i + 1) % objArr.length;
        this.f40791c--;
        return obj;
    }

    /* JADX INFO: renamed from: r */
    public int m12639r(int i) {
        m12623b(i);
        int iPreceding = ((BreakIterator) this.f40793e).preceding(i);
        return (m12632k(iPreceding) && m12628g(iPreceding) && !m12631j(iPreceding)) ? m12639r(iPreceding) : iPreceding;
    }

    /* JADX INFO: renamed from: s */
    public void m12640s(int i, String str, int i2) {
        if (i > i2) {
            j54.m14288a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            j54.m14288a("start must be non-negative, but was " + i);
        }
        pj3 pj3Var = (pj3) this.f40793e;
        int i3 = 0;
        if (pj3Var == null) {
            int iMax = Math.max(255, str.length() + 128);
            char[] cArr = new char[iMax];
            int iMin = Math.min(i, 64);
            int iMin2 = Math.min(((String) this.f40792d).length() - i2, 64);
            String str2 = (String) this.f40792d;
            int i4 = i - iMin;
            str2.getClass();
            str2.getChars(i4, i, cArr, 0);
            String str3 = (String) this.f40792d;
            int i5 = iMax - iMin2;
            int i6 = iMin2 + i2;
            str3.getClass();
            str3.getChars(i2, i6, cArr, i5);
            str.getChars(0, str.length(), cArr, iMin);
            int length = str.length() + iMin;
            pj3 pj3Var2 = new pj3(i3);
            pj3Var2.f56311b = iMax;
            pj3Var2.f56314e = cArr;
            pj3Var2.f56312c = length;
            pj3Var2.f56313d = i5;
            this.f40793e = pj3Var2;
            this.f40790b = i4;
            this.f40791c = i6;
            return;
        }
        int i7 = this.f40790b;
        int i8 = i - i7;
        int i9 = i2 - i7;
        if (i8 < 0 || i9 > pj3Var.f56311b - pj3Var.m19198d()) {
            this.f40792d = toString();
            this.f40793e = null;
            this.f40790b = -1;
            this.f40791c = -1;
            m12640s(i, str, i2);
            return;
        }
        int length2 = str.length() - (i9 - i8);
        if (length2 > pj3Var.m19198d()) {
            int iM19198d = length2 - pj3Var.m19198d();
            int i10 = pj3Var.f56311b;
            do {
                i10 *= 2;
            } while (i10 - pj3Var.f56311b < iM19198d);
            char[] cArr2 = new char[i10];
            System.arraycopy((char[]) pj3Var.f56314e, 0, cArr2, 0, pj3Var.f56312c);
            int i11 = pj3Var.f56311b;
            int i12 = pj3Var.f56313d;
            int i13 = i11 - i12;
            int i14 = i10 - i13;
            System.arraycopy((char[]) pj3Var.f56314e, i12, cArr2, i14, (i13 + i12) - i12);
            pj3Var.f56314e = cArr2;
            pj3Var.f56311b = i10;
            pj3Var.f56313d = i14;
        }
        int i15 = pj3Var.f56312c;
        if (i8 < i15 && i9 <= i15) {
            int i16 = i15 - i9;
            char[] cArr3 = (char[]) pj3Var.f56314e;
            System.arraycopy(cArr3, i9, cArr3, pj3Var.f56313d - i16, i16);
            pj3Var.f56312c = i8;
            pj3Var.f56313d -= i16;
        } else if (i8 >= i15 || i9 < i15) {
            int iM19198d2 = pj3Var.m19198d() + i8;
            int iM19198d3 = pj3Var.m19198d() + i9;
            int i17 = pj3Var.f56313d;
            int i18 = iM19198d2 - i17;
            char[] cArr4 = (char[]) pj3Var.f56314e;
            System.arraycopy(cArr4, i17, cArr4, pj3Var.f56312c, i18);
            pj3Var.f56312c += i18;
            pj3Var.f56313d = iM19198d3;
        } else {
            pj3Var.f56313d = pj3Var.m19198d() + i9;
            pj3Var.f56312c = i8;
        }
        str.getChars(0, str.length(), (char[]) pj3Var.f56314e, pj3Var.f56312c);
        pj3Var.f56312c = str.length() + pj3Var.f56312c;
    }

    /* JADX INFO: renamed from: t */
    public synchronized int m12641t() {
        return this.f40791c;
    }

    public String toString() {
        switch (this.f40789a) {
            case 1:
                pj3 pj3Var = (pj3) this.f40793e;
                String str = (String) this.f40792d;
                if (pj3Var == null) {
                    return str;
                }
                StringBuilder sb = new StringBuilder();
                sb.append((CharSequence) str, 0, this.f40790b);
                sb.append((char[]) pj3Var.f56314e, 0, pj3Var.f56312c);
                char[] cArr = (char[]) pj3Var.f56314e;
                int i = pj3Var.f56313d;
                sb.append(cArr, i, pj3Var.f56311b - i);
                String str2 = (String) this.f40792d;
                sb.append((CharSequence) str2, this.f40791c, str2.length());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public gh1(int i) {
        this.f40789a = i;
        switch (i) {
            case 1:
                break;
            case 2:
                this.f40792d = new ArrayList();
                this.f40793e = new ArrayList();
                break;
            case 3:
                this.f40792d = new long[10];
                this.f40793e = new Object[10];
                break;
            default:
                this.f40790b = 4;
                this.f40791c = 20;
                break;
        }
    }
}
