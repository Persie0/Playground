package p000;

import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class m72 implements vq6 {

    /* JADX INFO: renamed from: a */
    public final uq6 f50695a;

    /* JADX INFO: renamed from: b */
    public final long f50696b;

    /* JADX INFO: renamed from: c */
    public final long f50697c;

    /* JADX INFO: renamed from: d */
    public final ik9 f50698d;

    /* JADX INFO: renamed from: e */
    public int f50699e;

    /* JADX INFO: renamed from: f */
    public long f50700f;

    /* JADX INFO: renamed from: g */
    public long f50701g;

    /* JADX INFO: renamed from: h */
    public long f50702h;

    /* JADX INFO: renamed from: i */
    public long f50703i;

    /* JADX INFO: renamed from: j */
    public long f50704j;

    /* JADX INFO: renamed from: k */
    public long f50705k;

    /* JADX INFO: renamed from: l */
    public long f50706l;

    public m72(ik9 ik9Var, long j, long j2, long j3, long j4, boolean z) {
        bna.m3969q(j >= 0 && j2 > j);
        this.f50698d = ik9Var;
        this.f50696b = j;
        this.f50697c = j2;
        if (j3 == j2 - j || z) {
            this.f50700f = j4;
            this.f50699e = 4;
        } else {
            this.f50699e = 0;
        }
        this.f50695a = new uq6();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    @Override // p000.vq6
    /* JADX INFO: renamed from: a */
    public final long mo81a(iy2 iy2Var) throws IOException {
        long j;
        long jM22813h;
        int i = this.f50699e;
        long j2 = this.f50697c;
        uq6 uq6Var = this.f50695a;
        if (i == 0) {
            long position = iy2Var.getPosition();
            this.f50701g = position;
            this.f50699e = 1;
            long j3 = j2 - 65307;
            if (j3 > position) {
                return j3;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.f50703i == this.f50704j) {
                    jM22813h = -1;
                } else {
                    long position2 = iy2Var.getPosition();
                    if (uq6Var.m22857b(iy2Var, this.f50704j)) {
                        uq6Var.m22856a(iy2Var, false);
                        iy2Var.mo13080i();
                        long j4 = this.f50702h;
                        long j5 = uq6Var.f64217b;
                        long j6 = j4 - j5;
                        j = 2;
                        int i2 = uq6Var.f64219d + uq6Var.f64220e;
                        if (0 > j6 || j6 >= 72000) {
                            if (j6 < 0) {
                                this.f50704j = position2;
                                this.f50706l = j5;
                            } else {
                                this.f50703i = iy2Var.getPosition() + ((long) i2);
                                this.f50705k = uq6Var.f64217b;
                            }
                            long j7 = this.f50704j;
                            long j8 = this.f50703i;
                            if (j7 - j8 < 100000) {
                                this.f50704j = j8;
                                jM22813h = j8;
                            } else {
                                long position3 = iy2Var.getPosition() - (((long) i2) * (j6 <= 0 ? 2L : 1L));
                                long j9 = this.f50704j;
                                long j10 = this.f50703i;
                                jM22813h = uma.m22813h((((j9 - j10) * j6) / (this.f50706l - this.f50705k)) + position3, j10, j9 - 1);
                            }
                        } else {
                            jM22813h = -1;
                        }
                    } else {
                        jM22813h = this.f50703i;
                        if (jM22813h == position2) {
                            v63.m23133k("No ogg page can be found.");
                            return 0L;
                        }
                    }
                    if (jM22813h != -1) {
                        return jM22813h;
                    }
                    this.f50699e = 3;
                }
                j = 2;
                if (jM22813h != -1) {
                    return jM22813h;
                }
                this.f50699e = 3;
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    uk9.m22770c();
                    return 0L;
                }
                j = 2;
            }
            while (true) {
                uq6Var.m22857b(iy2Var, -1L);
                uq6Var.m22856a(iy2Var, false);
                if (uq6Var.f64217b > this.f50702h) {
                    iy2Var.mo13080i();
                    this.f50699e = 4;
                    return -(this.f50705k + j);
                }
                iy2Var.mo13082k(uq6Var.f64219d + uq6Var.f64220e);
                this.f50703i = iy2Var.getPosition();
                this.f50705k = uq6Var.f64217b;
            }
        }
        uq6Var.f64216a = 0;
        uq6Var.f64217b = 0L;
        uq6Var.f64218c = 0;
        uq6Var.f64219d = 0;
        uq6Var.f64220e = 0;
        if (!uq6Var.m22857b(iy2Var, -1L)) {
            throw new EOFException();
        }
        uq6Var.m22856a(iy2Var, false);
        iy2Var.mo13082k(uq6Var.f64219d + uq6Var.f64220e);
        long j11 = uq6Var.f64217b;
        while ((uq6Var.f64216a & 4) != 4 && uq6Var.m22857b(iy2Var, -1L) && iy2Var.getPosition() < j2 && uq6Var.m22856a(iy2Var, true)) {
            try {
                iy2Var.mo13082k(uq6Var.f64219d + uq6Var.f64220e);
                j11 = uq6Var.f64217b;
            } catch (EOFException unused) {
            }
        }
        this.f50700f = j11;
        this.f50699e = 4;
        return this.f50701g;
    }

    @Override // p000.vq6
    /* JADX INFO: renamed from: d */
    public final st8 mo84d() {
        if (this.f50700f != 0) {
            return new l72(this);
        }
        return null;
    }

    @Override // p000.vq6
    /* JADX INFO: renamed from: f */
    public final void mo86f(long j) {
        this.f50702h = uma.m22813h(j, 0L, this.f50700f - 1);
        this.f50699e = 2;
        this.f50703i = this.f50696b;
        this.f50704j = this.f50697c;
        this.f50705k = 0L;
        this.f50706l = this.f50700f;
    }
}
