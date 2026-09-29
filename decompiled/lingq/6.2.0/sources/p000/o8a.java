package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class o8a {

    /* JADX INFO: renamed from: a */
    public final g8a f54015a;

    /* JADX INFO: renamed from: b */
    public final int f54016b;

    /* JADX INFO: renamed from: c */
    public final long[] f54017c;

    /* JADX INFO: renamed from: d */
    public final int[] f54018d;

    /* JADX INFO: renamed from: e */
    public final int f54019e;

    /* JADX INFO: renamed from: f */
    public final long[] f54020f;

    /* JADX INFO: renamed from: g */
    public final int[] f54021g;

    /* JADX INFO: renamed from: h */
    public final int[] f54022h;

    /* JADX INFO: renamed from: i */
    public final long f54023i;

    /* JADX INFO: renamed from: j */
    public final boolean f54024j;

    public o8a(g8a g8aVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, int[] iArr3, boolean z, long j, int i2) {
        bna.m3969q(iArr.length == jArr2.length);
        bna.m3969q(jArr.length == jArr2.length);
        bna.m3969q(iArr2.length == jArr2.length);
        this.f54015a = g8aVar;
        this.f54017c = jArr;
        this.f54018d = iArr;
        this.f54019e = i;
        this.f54020f = jArr2;
        this.f54021g = iArr2;
        this.f54022h = iArr3;
        this.f54024j = z;
        this.f54023i = j;
        this.f54016b = i2;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m17854a(long j) {
        boolean z = this.f54024j;
        int i = 0;
        long[] jArr = this.f54020f;
        if (z) {
            return uma.m22809d(jArr, j, false);
        }
        int[] iArr = this.f54022h;
        int length = iArr.length - 1;
        int i2 = -1;
        while (i <= length) {
            int i3 = ((length - i) / 2) + i;
            if (jArr[iArr[i3]] <= j) {
                i = i3 + 1;
                i2 = i3;
            } else {
                length = i3 - 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 > 0 && jArr[iArr[i2 - 1]] == j2) {
                i2--;
            }
        }
        return iArr[i2];
    }

    /* JADX INFO: renamed from: b */
    public final int m17855b(long j) {
        boolean z = this.f54024j;
        long[] jArr = this.f54020f;
        if (z) {
            return uma.m22806a(jArr, j, true);
        }
        int[] iArr = this.f54022h;
        int length = iArr.length - 1;
        int i = 0;
        int i2 = -1;
        while (i <= length) {
            int i3 = ((length - i) / 2) + i;
            if (jArr[iArr[i3]] >= j) {
                length = i3 - 1;
                i2 = i3;
            } else {
                i = i3 + 1;
            }
        }
        if (i2 == -1) {
            return -1;
        }
        long j2 = jArr[iArr[i2]];
        if (j2 == j) {
            while (i2 < iArr.length - 1) {
                int i4 = i2 + 1;
                if (jArr[iArr[i4]] != j2) {
                    break;
                }
                i2 = i4;
            }
        }
        return iArr[i2];
    }
}
