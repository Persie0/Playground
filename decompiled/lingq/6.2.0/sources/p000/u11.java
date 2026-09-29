package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class u11 implements st8 {

    /* JADX INFO: renamed from: a */
    public final int f63234a;

    /* JADX INFO: renamed from: b */
    public final int[] f63235b;

    /* JADX INFO: renamed from: c */
    public final long[] f63236c;

    /* JADX INFO: renamed from: d */
    public final long[] f63237d;

    /* JADX INFO: renamed from: e */
    public final long[] f63238e;

    /* JADX INFO: renamed from: f */
    public final long f63239f;

    public u11(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f63235b = iArr;
        this.f63236c = jArr;
        this.f63237d = jArr2;
        this.f63238e = jArr3;
        int length = iArr.length;
        this.f63234a = length;
        if (length <= 0) {
            this.f63239f = 0L;
        } else {
            int i = length - 1;
            this.f63239f = jArr2[i] + jArr3[i];
        }
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        return true;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        long[] jArr = this.f63238e;
        int iM22809d = uma.m22809d(jArr, j, true);
        long j2 = jArr[iM22809d];
        long[] jArr2 = this.f63236c;
        ut8 ut8Var = new ut8(j2, jArr2[iM22809d]);
        if (j2 >= j || iM22809d == this.f63234a - 1) {
            return new rt8(ut8Var, ut8Var);
        }
        int i = iM22809d + 1;
        return new rt8(ut8Var, new ut8(jArr[i], jArr2[i]));
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        return this.f63239f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f63234a + ", sizes=" + Arrays.toString(this.f63235b) + ", offsets=" + Arrays.toString(this.f63236c) + ", timeUs=" + Arrays.toString(this.f63238e) + ", durationsUs=" + Arrays.toString(this.f63237d) + ")";
    }
}
