package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class eoa implements wt8 {

    /* JADX INFO: renamed from: a */
    public final long[] f37634a;

    /* JADX INFO: renamed from: b */
    public final long[] f37635b;

    /* JADX INFO: renamed from: c */
    public final long f37636c;

    /* JADX INFO: renamed from: d */
    public final long f37637d;

    /* JADX INFO: renamed from: e */
    public final long f37638e;

    /* JADX INFO: renamed from: f */
    public final int f37639f;

    public eoa(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.f37634a = jArr;
        this.f37635b = jArr2;
        this.f37636c = j;
        this.f37637d = j2;
        this.f37638e = j3;
        this.f37639f = i;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: a */
    public final long mo3539a() {
        return this.f37638e;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: b */
    public final long mo3540b() {
        return this.f37637d;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        return true;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: d */
    public final long mo3542d(long j) {
        return this.f37634a[uma.m22809d(this.f37635b, j, true)];
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        long[] jArr = this.f37634a;
        int iM22809d = uma.m22809d(jArr, j, true);
        long j2 = jArr[iM22809d];
        long[] jArr2 = this.f37635b;
        ut8 ut8Var = new ut8(j2, jArr2[iM22809d]);
        if (j2 >= j || iM22809d == jArr.length - 1) {
            return new rt8(ut8Var, ut8Var);
        }
        int i = iM22809d + 1;
        return new rt8(ut8Var, new ut8(jArr[i], jArr2[i]));
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: g */
    public final int mo3544g() {
        return this.f37639f;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        return this.f37636c;
    }
}
