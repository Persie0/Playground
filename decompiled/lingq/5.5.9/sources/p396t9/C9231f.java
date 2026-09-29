package p396t9;

import p261m9.C7521v;
import p261m9.InterfaceC7520u;
import p479xa.C10134c0;

/* JADX INFO: renamed from: t9.f */
/* JADX INFO: loaded from: classes.dex */
public final class C9231f implements InterfaceC9230e {

    /* JADX INFO: renamed from: a */
    public final long[] f47865a;

    /* JADX INFO: renamed from: b */
    public final long[] f47866b;

    /* JADX INFO: renamed from: c */
    public final long f47867c;

    /* JADX INFO: renamed from: d */
    public final long f47868d;

    public C9231f(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f47865a = jArr;
        this.f47866b = jArr2;
        this.f47867c = j10;
        this.f47868d = j11;
    }

    @Override // p396t9.InterfaceC9230e
    /* JADX INFO: renamed from: a */
    public final long mo17583a() {
        return this.f47868d;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: b */
    public final boolean mo14982b() {
        return true;
    }

    @Override // p396t9.InterfaceC9230e
    /* JADX INFO: renamed from: c */
    public final long mo17584c(long j10) {
        return this.f47865a[C10134c0.m19039f(this.f47866b, j10, true)];
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: h */
    public final InterfaceC7520u.a mo14983h(long j10) {
        long[] jArr = this.f47865a;
        int iM19039f = C10134c0.m19039f(jArr, j10, true);
        long j11 = jArr[iM19039f];
        long[] jArr2 = this.f47866b;
        C7521v c7521v = new C7521v(j11, jArr2[iM19039f]);
        if (j11 >= j10 || iM19039f == jArr.length - 1) {
            return new InterfaceC7520u.a(c7521v, c7521v);
        }
        int i10 = iM19039f + 1;
        return new InterfaceC7520u.a(c7521v, new C7521v(jArr[i10], jArr2[i10]));
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: i */
    public final long mo14984i() {
        return this.f47867c;
    }
}
