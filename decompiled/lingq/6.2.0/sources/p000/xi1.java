package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class xi1 implements wt8, st8 {

    /* JADX INFO: renamed from: a */
    public final long f68233a;

    /* JADX INFO: renamed from: b */
    public final long f68234b;

    /* JADX INFO: renamed from: c */
    public final int f68235c;

    /* JADX INFO: renamed from: d */
    public final long f68236d;

    /* JADX INFO: renamed from: e */
    public final int f68237e;

    /* JADX INFO: renamed from: f */
    public final long f68238f;

    /* JADX INFO: renamed from: g */
    public final boolean f68239g;

    /* JADX INFO: renamed from: h */
    public final boolean f68240h;

    /* JADX INFO: renamed from: i */
    public final long f68241i;

    /* JADX INFO: renamed from: j */
    public final int f68242j;

    /* JADX INFO: renamed from: k */
    public final int f68243k;

    /* JADX INFO: renamed from: l */
    public final boolean f68244l;

    /* JADX INFO: renamed from: m */
    public final long f68245m;

    public xi1(long j, long j2, int i, int i2, boolean z, boolean z2) {
        this.f68233a = j;
        this.f68234b = j2;
        this.f68235c = i2 == -1 ? 1 : i2;
        this.f68237e = i;
        this.f68239g = z;
        this.f68240h = z2;
        if (j == -1) {
            this.f68236d = -1L;
            this.f68238f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.f68236d = j3;
            this.f68238f = (Math.max(0L, j3) * 8000000) / ((long) i);
        }
        this.f68241i = j2;
        this.f68242j = i;
        this.f68243k = i2;
        this.f68244l = z;
        this.f68245m = j == -1 ? -1L : j;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: a */
    public final long mo3539a() {
        return this.f68245m;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: b */
    public final long mo3540b() {
        return this.f68241i;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        return this.f68236d != -1 || this.f68239g;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: d */
    public final long mo3542d(long j) {
        return (Math.max(0L, j - this.f68234b) * 8000000) / ((long) this.f68237e);
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: e */
    public final boolean mo21741e() {
        return this.f68240h;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        long j2 = this.f68236d;
        long j3 = this.f68234b;
        if (j2 == -1 && !this.f68239g) {
            ut8 ut8Var = new ut8(0L, j3);
            return new rt8(ut8Var, ut8Var);
        }
        int i = this.f68237e;
        long j4 = this.f68235c;
        long jMin = (((((long) i) * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / ((long) i);
        ut8 ut8Var2 = new ut8(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.f68233a) {
                return new rt8(ut8Var2, new ut8((Math.max(0L, j5 - j3) * 8000000) / ((long) i), j5));
            }
        }
        return new rt8(ut8Var2, ut8Var2);
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: g */
    public final int mo3544g() {
        return this.f68242j;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        return this.f68238f;
    }
}
