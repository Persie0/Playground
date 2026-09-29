package p000;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class q34 implements wt8 {

    /* JADX INFO: renamed from: a */
    public final long f57185a;

    /* JADX INFO: renamed from: b */
    public final long f57186b;

    /* JADX INFO: renamed from: c */
    public final int f57187c;

    /* JADX INFO: renamed from: d */
    public final p34 f57188d;

    public q34(long j, long j2, long j3) {
        this.f57188d = new p34(j, new long[]{j2}, new long[]{0});
        this.f57185a = j2;
        this.f57186b = j3;
        int i = -2147483647;
        if (j == -9223372036854775807L) {
            this.f57187c = -2147483647;
            return;
        }
        long jM22803H = uma.m22803H(j2 - j3, 8L, j, RoundingMode.HALF_UP);
        if (jM22803H > 0 && jM22803H <= 2147483647L) {
            i = (int) jM22803H;
        }
        this.f57187c = i;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: a */
    public final long mo3539a() {
        return this.f57186b;
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: b */
    public final long mo3540b() {
        return this.f57185a;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        return this.f57188d.mo3541c();
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: d */
    public final long mo3542d(long j) {
        p34 p34Var = this.f57188d;
        ztb ztbVar = p34Var.f55516b;
        if (ztbVar.f72161b == 0) {
            return -9223372036854775807L;
        }
        return ztbVar.m25782d(uma.m22807b(p34Var.f55515a, j));
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        return this.f57188d.mo3543f(j);
    }

    @Override // p000.wt8
    /* JADX INFO: renamed from: g */
    public final int mo3544g() {
        return this.f57187c;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        return this.f57188d.f55517c;
    }
}
