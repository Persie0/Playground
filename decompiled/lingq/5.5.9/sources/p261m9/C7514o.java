package p261m9;

import p479xa.C10129a;
import p479xa.C10134c0;

/* JADX INFO: renamed from: m9.o */
/* JADX INFO: loaded from: classes.dex */
public final class C7514o implements InterfaceC7520u {

    /* JADX INFO: renamed from: a */
    public final C7515p f41492a;

    /* JADX INFO: renamed from: b */
    public final long f41493b;

    public C7514o(C7515p c7515p, long j10) {
        this.f41492a = c7515p;
        this.f41493b = j10;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: b */
    public final boolean mo14982b() {
        return true;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: h */
    public final InterfaceC7520u.a mo14983h(long j10) {
        C7515p c7515p = this.f41492a;
        C10129a.m18993e(c7515p.f41504k);
        C7515p.a aVar = c7515p.f41504k;
        long[] jArr = aVar.f41506a;
        int iM19039f = C10134c0.m19039f(jArr, C10134c0.m19042i((((long) c7515p.f41498e) * j10) / 1000000, 0L, c7515p.f41503j - 1), false);
        long j11 = iM19039f == -1 ? 0L : jArr[iM19039f];
        long[] jArr2 = aVar.f41507b;
        long j12 = iM19039f != -1 ? jArr2[iM19039f] : 0L;
        int i10 = c7515p.f41498e;
        long j13 = (j11 * 1000000) / ((long) i10);
        long j14 = this.f41493b;
        C7521v c7521v = new C7521v(j13, j12 + j14);
        if (j13 == j10 || iM19039f == jArr.length - 1) {
            return new InterfaceC7520u.a(c7521v, c7521v);
        }
        int i11 = iM19039f + 1;
        return new InterfaceC7520u.a(c7521v, new C7521v((jArr[i11] * 1000000) / ((long) i10), j14 + jArr2[i11]));
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: i */
    public final long mo14984i() {
        return this.f41492a.m15016b();
    }
}
