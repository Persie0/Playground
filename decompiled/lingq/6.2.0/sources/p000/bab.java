package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class bab implements wt8 {

    /* JADX INFO: renamed from: a */
    public final long f8252a;

    /* JADX INFO: renamed from: b */
    public final int f8253b;

    /* JADX INFO: renamed from: c */
    public final long f8254c;

    /* JADX INFO: renamed from: d */
    public final int f8255d;

    /* JADX INFO: renamed from: e */
    public final long f8256e;

    /* JADX INFO: renamed from: f */
    public final long f8257f;

    /* JADX INFO: renamed from: g */
    public final long[] f8258g;

    public bab(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f8252a = j;
        this.f8253b = i;
        this.f8254c = j2;
        this.f8255d = i2;
        this.f8256e = j3;
        this.f8258g = jArr;
        this.f8257f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: a */
    public final long mo3539a() {
        return this.f8257f;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: b */
    public final long mo3540b() {
        return this.f8252a + ((long) this.f8253b);
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        return this.f8258g != null;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: d */
    public final long mo3542d(long j) {
        long j2 = j - this.f8252a;
        if (!mo3541c() || j2 <= this.f8253b) {
            return 0L;
        }
        long[] jArr = this.f8258g;
        jArr.getClass();
        double d = (j2 * 256.0d) / this.f8256e;
        int iM22809d = uma.m22809d(jArr, (long) d, true);
        long j3 = this.f8254c;
        long j4 = (((long) iM22809d) * j3) / 100;
        long j5 = jArr[iM22809d];
        int i = iM22809d + 1;
        long j6 = (j3 * ((long) i)) / 100;
        long j7 = iM22809d == 99 ? 256L : jArr[i];
        return Math.round((j5 == j7 ? 0.0d : (d - j5) / (j7 - j5)) * (j6 - j4)) + j4;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        double d;
        double d2;
        boolean zMo3541c = mo3541c();
        int i = this.f8253b;
        long j2 = this.f8252a;
        if (!zMo3541c) {
            ut8 ut8Var = new ut8(0L, j2 + ((long) i));
            return new rt8(ut8Var, ut8Var);
        }
        long jM22813h = uma.m22813h(j, 0L, this.f8254c);
        double d3 = (jM22813h * 100.0d) / this.f8254c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.f8258g;
            jArr.getClass();
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - ((double) i2))) + d5;
        }
        long j3 = this.f8256e;
        ut8 ut8Var2 = new ut8(jM22813h, j2 + uma.m22813h(Math.round((d4 / d) * j3), i, j3 - 1));
        return new rt8(ut8Var2, ut8Var2);
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: g */
    public final int mo3544g() {
        return this.f8255d;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        return this.f8254c;
    }
}
