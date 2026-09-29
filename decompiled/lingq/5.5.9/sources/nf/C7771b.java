package nf;

import java.util.Arrays;

/* JADX INFO: renamed from: nf.b */
/* JADX INFO: loaded from: classes.dex */
public final class C7771b implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final int f42694a;

    /* JADX INFO: renamed from: b */
    public final int f42695b;

    /* JADX INFO: renamed from: c */
    public final int f42696c;

    /* JADX INFO: renamed from: d */
    public final int[] f42697d;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public C7771b(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f42694a = i10;
        this.f42695b = i11;
        int i12 = (i10 + 31) / 32;
        this.f42696c = i12;
        this.f42697d = new int[i12 * i11];
    }

    public C7771b(int i10, int i11, int i12, int[] iArr) {
        this.f42694a = i10;
        this.f42695b = i11;
        this.f42696c = i12;
        this.f42697d = iArr;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m15476b(int i10, int i11) {
        return ((this.f42697d[(i10 / 32) + (i11 * this.f42696c)] >>> (i10 & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: c */
    public final void m15477c(int i10, int i11) {
        int i12 = (i10 / 32) + (i11 * this.f42696c);
        int[] iArr = this.f42697d;
        iArr[i12] = (1 << (i10 & 31)) | iArr[i12];
    }

    public final Object clone() throws CloneNotSupportedException {
        int[] iArr = (int[]) this.f42697d.clone();
        return new C7771b(this.f42694a, this.f42695b, this.f42696c, iArr);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public final void m15478d(int i10, int i11, int i12, int i13) {
        if (i11 < 0 || i10 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i13 <= 0 || i12 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i14 = i12 + i10;
        int i15 = i13 + i11;
        if (i15 > this.f42695b || i14 > this.f42694a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i11 < i15) {
            int i16 = this.f42696c * i11;
            for (int i17 = i10; i17 < i14; i17++) {
                int i18 = (i17 / 32) + i16;
                int[] iArr = this.f42697d;
                iArr[i18] = iArr[i18] | (1 << (i17 & 31));
            }
            i11++;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7771b)) {
            return false;
        }
        C7771b c7771b = (C7771b) obj;
        return this.f42694a == c7771b.f42694a && this.f42695b == c7771b.f42695b && this.f42696c == c7771b.f42696c && Arrays.equals(this.f42697d, c7771b.f42697d);
    }

    public final int hashCode() {
        int i10 = this.f42694a;
        return Arrays.hashCode(this.f42697d) + (((((((i10 * 31) + i10) * 31) + this.f42695b) * 31) + this.f42696c) * 31);
    }

    public final String toString() {
        int i10 = this.f42694a;
        int i11 = this.f42695b;
        StringBuilder sb2 = new StringBuilder((i10 + 1) * i11);
        for (int i12 = 0; i12 < i11; i12++) {
            for (int i13 = 0; i13 < i10; i13++) {
                sb2.append(m15476b(i13, i12) ? "X " : "  ");
            }
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
