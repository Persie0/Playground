package p396t9;

import android.util.Pair;
import p261m9.C7521v;
import p261m9.InterfaceC7520u;
import p479xa.C10134c0;

/* JADX INFO: renamed from: t9.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9228c implements InterfaceC9230e {

    /* JADX INFO: renamed from: a */
    public final long[] f47841a;

    /* JADX INFO: renamed from: b */
    public final long[] f47842b;

    /* JADX INFO: renamed from: c */
    public final long f47843c;

    public C9228c(long j10, long[] jArr, long[] jArr2) {
        this.f47841a = jArr;
        this.f47842b = jArr2;
        this.f47843c = j10 == -9223372036854775807L ? C10134c0.m19026K(jArr2[jArr2.length - 1]) : j10;
    }

    /* JADX INFO: renamed from: d */
    public static Pair<Long, Long> m17586d(long j10, long[] jArr, long[] jArr2) {
        int iM19039f = C10134c0.m19039f(jArr, j10, true);
        long j11 = jArr[iM19039f];
        long j12 = jArr2[iM19039f];
        int i10 = iM19039f + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j11), Long.valueOf(j12));
        }
        long j13 = jArr[i10];
        return Pair.create(Long.valueOf(j10), Long.valueOf(((long) ((j13 == j11 ? 0.0d : (j10 - j11) / (j13 - j11)) * (jArr2[i10] - j12))) + j12));
    }

    @Override // p396t9.InterfaceC9230e
    /* JADX INFO: renamed from: a */
    public final long mo17583a() {
        return -1L;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: b */
    public final boolean mo14982b() {
        return true;
    }

    @Override // p396t9.InterfaceC9230e
    /* JADX INFO: renamed from: c */
    public final long mo17584c(long j10) {
        return C10134c0.m19026K(((Long) m17586d(j10, this.f47841a, this.f47842b).second).longValue());
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: h */
    public final InterfaceC7520u.a mo14983h(long j10) {
        Pair<Long, Long> pairM17586d = m17586d(C10134c0.m19033R(C10134c0.m19042i(j10, 0L, this.f47843c)), this.f47842b, this.f47841a);
        C7521v c7521v = new C7521v(C10134c0.m19026K(((Long) pairM17586d.first).longValue()), ((Long) pairM17586d.second).longValue());
        return new InterfaceC7520u.a(c7521v, c7521v);
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: i */
    public final long mo14984i() {
        return this.f47843c;
    }
}
