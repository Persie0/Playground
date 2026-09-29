package p000;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class l72 implements st8 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ m72 f49243a;

    public l72(m72 m72Var) {
        this.f49243a = m72Var;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: c */
    public final boolean mo3541c() {
        return true;
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: f */
    public final rt8 mo3543f(long j) {
        m72 m72Var = this.f49243a;
        long j2 = (((long) m72Var.f50698d.f44232i) * j) / 1000000;
        long j3 = m72Var.f50696b;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j2);
        long j4 = m72Var.f50697c;
        ut8 ut8Var = new ut8(j, uma.m22813h((bigIntegerValueOf.multiply(BigInteger.valueOf(j4 - j3)).divide(BigInteger.valueOf(m72Var.f50700f)).longValue() + j3) - 30000, m72Var.f50696b, j4 - 1));
        return new rt8(ut8Var, ut8Var);
    }

    @Override // p000.st8
    /* JADX INFO: renamed from: h */
    public final long mo3545h() {
        m72 m72Var = this.f49243a;
        return (m72Var.f50700f * 1000000) / ((long) m72Var.f50698d.f44232i);
    }
}
