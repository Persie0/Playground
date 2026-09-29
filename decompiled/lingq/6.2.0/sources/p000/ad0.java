package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class ad0 implements Cloneable {

    /* JADX INFO: renamed from: a */
    public final int f503a;

    /* JADX INFO: renamed from: b */
    public final int f504b;

    /* JADX INFO: renamed from: c */
    public final int f505c;

    /* JADX INFO: renamed from: d */
    public final int[] f506d;

    public ad0(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            C3386nv.m17626m("Both dimensions must be greater than 0");
            throw null;
        }
        this.f503a = i;
        this.f504b = i2;
        int i3 = (i + 31) / 32;
        this.f505c = i3;
        this.f506d = new int[i3 * i2];
    }

    /* JADX INFO: renamed from: a */
    public final boolean m272a(int i, int i2) {
        return ((this.f506d[(i / 32) + (i2 * this.f505c)] >>> (i & 31)) & 1) != 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m273b(int i, int i2) {
        int i3 = (i / 32) + (i2 * this.f505c);
        int[] iArr = this.f506d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    /* JADX INFO: renamed from: c */
    public final void m274c(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            C3386nv.m17626m("Left and top must be nonnegative");
            return;
        }
        if (i4 <= 0 || i3 <= 0) {
            C3386nv.m17626m("Height and width must be at least 1");
            return;
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.f504b || i5 > this.f503a) {
            C3386nv.m17626m("The region must fit inside the matrix");
            return;
        }
        while (i2 < i6) {
            int i7 = this.f505c * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int i9 = (i8 / 32) + i7;
                int[] iArr = this.f506d;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public final Object clone() {
        return new ad0(this.f503a, this.f504b, this.f505c, (int[]) this.f506d.clone());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ad0)) {
            return false;
        }
        ad0 ad0Var = (ad0) obj;
        return this.f503a == ad0Var.f503a && this.f504b == ad0Var.f504b && this.f505c == ad0Var.f505c && Arrays.equals(this.f506d, ad0Var.f506d);
    }

    public final int hashCode() {
        int i = this.f503a;
        return Arrays.hashCode(this.f506d) + (((((((i * 31) + i) * 31) + this.f504b) * 31) + this.f505c) * 31);
    }

    public final String toString() {
        int i = this.f503a;
        int i2 = this.f504b;
        StringBuilder sb = new StringBuilder((i + 1) * i2);
        for (int i3 = 0; i3 < i2; i3++) {
            for (int i4 = 0; i4 < i; i4++) {
                sb.append(m272a(i4, i3) ? "X " : "  ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public ad0(int i, int i2, int i3, int[] iArr) {
        this.f503a = i;
        this.f504b = i2;
        this.f505c = i3;
        this.f506d = iArr;
    }
}
