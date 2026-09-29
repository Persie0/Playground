package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class o84 {

    /* JADX INFO: renamed from: a */
    public int[] f53973a;

    /* JADX INFO: renamed from: b */
    public int f53974b;

    public o84() {
        this.f53973a = new int[10];
    }

    /* JADX INFO: renamed from: a */
    public int m17838a(int i) {
        int i2 = this.f53974b - 1;
        return i2 >= 0 ? this.f53973a[i2] : i;
    }

    /* JADX INFO: renamed from: b */
    public int m17839b() {
        int[] iArr = this.f53973a;
        int i = this.f53974b - 1;
        this.f53974b = i;
        return iArr[i];
    }

    /* JADX INFO: renamed from: c */
    public void m17840c(int i) {
        int[] iArrCopyOf = this.f53973a;
        if (this.f53974b >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f53973a = iArrCopyOf;
        }
        int i2 = this.f53974b;
        this.f53974b = i2 + 1;
        iArrCopyOf[i2] = i;
    }

    /* JADX INFO: renamed from: d */
    public void m17841d(int i, int i2, int i3) {
        int i4 = this.f53974b;
        int[] iArrCopyOf = this.f53973a;
        int i5 = i4 + 3;
        if (i5 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f53973a = iArrCopyOf;
        }
        iArrCopyOf[i4] = i + i3;
        iArrCopyOf[i4 + 1] = i2 + i3;
        iArrCopyOf[i4 + 2] = i3;
        this.f53974b = i5;
    }

    /* JADX INFO: renamed from: e */
    public void m17842e(int i, int i2, int i3, int i4) {
        int i5 = this.f53974b;
        int[] iArrCopyOf = this.f53973a;
        int i6 = i5 + 4;
        if (i6 >= iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length * 2);
            this.f53973a = iArrCopyOf;
        }
        iArrCopyOf[i5] = i;
        iArrCopyOf[i5 + 1] = i2;
        iArrCopyOf[i5 + 2] = i3;
        iArrCopyOf[i5 + 3] = i4;
        this.f53974b = i6;
    }

    /* JADX INFO: renamed from: f */
    public void m17843f(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.f53973a;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    m17844g(i3, i4);
                }
            }
            m17844g(i3 + 3, i2);
            m17843f(i, i3);
            m17843f(i3 + 6, i2);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m17844g(int i, int i2) {
        int[] iArr = this.f53973a;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public o84(int i) {
        this.f53973a = new int[i];
    }
}
