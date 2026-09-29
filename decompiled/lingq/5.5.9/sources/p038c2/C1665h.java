package p038c2;

import java.util.Arrays;

/* JADX INFO: renamed from: c2.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1665h {

    /* JADX INFO: renamed from: a */
    public float[] f9335a = new float[0];

    /* JADX INFO: renamed from: b */
    public double[] f9336b = new double[0];

    /* JADX INFO: renamed from: c */
    public double[] f9337c;

    /* JADX INFO: renamed from: d */
    public C1664g f9338d;

    /* JADX INFO: renamed from: e */
    public int f9339e;

    /* JADX INFO: renamed from: a */
    public final void m5395a(double d10, float f3) {
        int length = this.f9335a.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.f9336b, d10);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.f9336b = Arrays.copyOf(this.f9336b, length);
        this.f9335a = Arrays.copyOf(this.f9335a, length);
        this.f9337c = new double[length];
        double[] dArr = this.f9336b;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.f9336b[iBinarySearch] = d10;
        this.f9335a[iBinarySearch] = f3;
    }

    public final String toString() {
        return "pos =" + Arrays.toString(this.f9336b) + " period=" + Arrays.toString(this.f9335a);
    }
}
