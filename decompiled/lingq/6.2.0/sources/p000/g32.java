package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class g32 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f40105a;

    /* JADX INFO: renamed from: b */
    public final int f40106b;

    public g32(int i, int i2) {
        this.f40105a = i;
        this.f40106b = i2;
        if (i2 >= 0) {
            return;
        }
        C3386nv.m17624j(ux5.m22988k(i2, "Digits must be non-negative, but was "));
        throw null;
    }

    /* JADX INFO: renamed from: a */
    public final int m12309a(int i) {
        int i2 = this.f40105a;
        int i3 = this.f40106b;
        if (i == i3) {
            return i2;
        }
        int[] iArr = ouc.f55020a;
        return i > i3 ? i2 * iArr[i - i3] : i2 / iArr[i3 - i];
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        g32 g32Var = (g32) obj;
        g32Var.getClass();
        int iMax = Math.max(this.f40106b, g32Var.f40106b);
        return fa4.m11651m(m12309a(iMax), g32Var.m12309a(iMax));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g32)) {
            return false;
        }
        g32 g32Var = (g32) obj;
        int iMax = Math.max(this.f40106b, g32Var.f40106b);
        return fa4.m11651m(m12309a(iMax), g32Var.m12309a(iMax)) == 0;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException("DecimalFraction is not supposed to be used as a hash key");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = ouc.f55020a[this.f40106b];
        int i2 = this.f40105a;
        sb.append(i2 / i);
        sb.append('.');
        sb.append(vk9.m23398u0(String.valueOf((i2 % i) + i), "1"));
        return sb.toString();
    }
}
