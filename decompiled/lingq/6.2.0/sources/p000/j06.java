package p000;

import android.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class j06 implements wt8 {

    /* JADX INFO: renamed from: a */
    public final long[] f44844a;

    /* JADX INFO: renamed from: b */
    public final long[] f44845b;

    /* JADX INFO: renamed from: c */
    public final long f44846c;

    public j06(long j, long[] jArr, long[] jArr2) {
        this.f44844a = jArr;
        this.f44845b = jArr2;
        this.f44846c = j == -9223372036854775807L ? uma.m22797B(jArr2[jArr2.length - 1]) : j;
    }

    /* JADX INFO: renamed from: i */
    public static Pair m14236i(long j, long[] jArr, long[] jArr2) {
        int iM22809d = uma.m22809d(jArr, j, true);
        long j2 = jArr[iM22809d];
        long j3 = jArr2[iM22809d];
        int i = iM22809d + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (j - j2) / (j4 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: a */
    public final long mo3539a() {
        return -1L;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: b */
    public final long mo3540b() {
        return 0L;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        return true;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: d */
    public final long mo3542d(long j) {
        return uma.m22797B(((Long) m14236i(j, this.f44844a, this.f44845b).second).longValue());
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        Pair pairM14236i = m14236i(uma.m22805J(uma.m22813h(j, 0L, this.f44846c)), this.f44845b, this.f44844a);
        ut8 ut8Var = new ut8(uma.m22797B(((Long) pairM14236i.first).longValue()), ((Long) pairM14236i.second).longValue());
        return new rt8(ut8Var, ut8Var);
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: g */
    public final int mo3544g() {
        return -2147483647;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        return this.f44846c;
    }
}
