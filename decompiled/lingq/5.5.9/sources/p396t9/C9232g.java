package p396t9;

import p261m9.C7521v;
import p261m9.InterfaceC7520u;
import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: t9.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9232g implements InterfaceC9230e {

    /* JADX INFO: renamed from: a */
    public final long f47869a;

    /* JADX INFO: renamed from: b */
    public final int f47870b;

    /* JADX INFO: renamed from: c */
    public final long f47871c;

    /* JADX INFO: renamed from: d */
    public final long f47872d;

    /* JADX INFO: renamed from: e */
    public final long f47873e;

    /* JADX INFO: renamed from: f */
    public final long[] f47874f;

    public C9232g(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f47869a = j10;
        this.f47870b = i10;
        this.f47871c = j11;
        this.f47874f = jArr;
        this.f47872d = j12;
        this.f47873e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // p396t9.InterfaceC9230e
    /* JADX INFO: renamed from: a */
    public final long mo17583a() {
        return this.f47873e;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: b */
    public final boolean mo14982b() {
        return this.f47874f != null;
    }

    @Override // p396t9.InterfaceC9230e
    /* JADX INFO: renamed from: c */
    public final long mo17584c(long j10) {
        long j11 = j10 - this.f47869a;
        if (!mo14982b() || j11 <= this.f47870b) {
            return 0L;
        }
        long[] jArr = this.f47874f;
        C10129a.m18993e(jArr);
        double d10 = (j11 * 256.0d) / this.f47872d;
        int iM19039f = C10134c0.m19039f(jArr, (long) d10, true);
        long j12 = this.f47871c;
        long j13 = (((long) iM19039f) * j12) / 100;
        long j14 = jArr[iM19039f];
        int i10 = iM19039f + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        long j16 = iM19039f == 99 ? 256L : jArr[i10];
        return Math.round((j14 == j16 ? 0.0d : (d10 - j14) / (j16 - j14)) * (j15 - j13)) + j13;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: h */
    public final InterfaceC7520u.a mo14983h(long j10) {
        double d10;
        boolean zMo14982b = mo14982b();
        int i10 = this.f47870b;
        long j11 = this.f47869a;
        if (!zMo14982b) {
            C7521v c7521v = new C7521v(0L, j11 + ((long) i10));
            return new InterfaceC7520u.a(c7521v, c7521v);
        }
        long jM19042i = C10134c0.m19042i(j10, 0L, this.f47871c);
        double d11 = (jM19042i * 100.0d) / this.f47871c;
        double d12 = 0.0d;
        if (d11 <= 0.0d) {
            d10 = 256.0d;
        } else if (d11 >= 100.0d) {
            d10 = 256.0d;
            d12 = 256.0d;
        } else {
            int i11 = (int) d11;
            long[] jArr = this.f47874f;
            C10129a.m18993e(jArr);
            double d13 = jArr[i11];
            d12 = (((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d13) * (d11 - ((double) i11))) + d13;
            d10 = 256.0d;
        }
        double d14 = d12 / d10;
        long j12 = this.f47872d;
        C7521v c7521v2 = new C7521v(jM19042i, j11 + C10134c0.m19042i(Math.round(d14 * j12), i10, j12 - 1));
        return new InterfaceC7520u.a(c7521v2, c7521v2);
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: i */
    public final long mo14984i() {
        return this.f47871c;
    }
}
