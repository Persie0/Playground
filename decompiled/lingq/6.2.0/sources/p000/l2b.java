package p000;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class l2b implements st8 {

    /* JADX INFO: renamed from: a */
    public final l47 f48944a;

    /* JADX INFO: renamed from: b */
    public final int f48945b;

    /* JADX INFO: renamed from: c */
    public final long f48946c;

    /* JADX INFO: renamed from: d */
    public final long f48947d;

    /* JADX INFO: renamed from: e */
    public final long f48948e;

    public l2b(l47 l47Var, int i, long j, long j2) {
        this.f48944a = l47Var;
        this.f48945b = i;
        this.f48946c = j;
        long j3 = (j2 - j) / ((long) l47Var.f49040c);
        this.f48947d = j3;
        this.f48948e = m15749i(j3);
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        return true;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        l47 l47Var = this.f48944a;
        long j2 = (((long) l47Var.f49039b) * j) / (((long) this.f48945b) * 1000000);
        long j3 = this.f48947d - 1;
        long jM22813h = uma.m22813h(j2, 0L, j3);
        int i = l47Var.f49040c;
        long j4 = this.f48946c;
        long jM15749i = m15749i(jM22813h);
        ut8 ut8Var = new ut8(jM15749i, (((long) i) * jM22813h) + j4);
        if (jM15749i >= j || jM22813h == j3) {
            return new rt8(ut8Var, ut8Var);
        }
        long j5 = jM22813h + 1;
        return new rt8(ut8Var, new ut8(m15749i(j5), (((long) i) * j5) + j4));
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        return this.f48948e;
    }

    /* JADX INFO: renamed from: i */
    public final long m15749i(long j) {
        long j2 = j * ((long) this.f48945b);
        long j3 = this.f48944a.f49039b;
        String str = uma.f64080a;
        return uma.m22803H(j2, 1000000L, j3, RoundingMode.DOWN);
    }
}
