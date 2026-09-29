package p478x9;

import p261m9.C7521v;
import p261m9.InterfaceC7520u;
import p479xa.C10134c0;

/* JADX INFO: renamed from: x9.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10128d implements InterfaceC7520u {

    /* JADX INFO: renamed from: a */
    public final C10126b f51344a;

    /* JADX INFO: renamed from: b */
    public final int f51345b;

    /* JADX INFO: renamed from: c */
    public final long f51346c;

    /* JADX INFO: renamed from: d */
    public final long f51347d;

    /* JADX INFO: renamed from: e */
    public final long f51348e;

    public C10128d(C10126b c10126b, int i10, long j10, long j11) {
        this.f51344a = c10126b;
        this.f51345b = i10;
        this.f51346c = j10;
        long j12 = (j11 - j10) / ((long) c10126b.f51339c);
        this.f51347d = j12;
        this.f51348e = m18988d(j12);
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: b */
    public final boolean mo14982b() {
        return true;
    }

    /* JADX INFO: renamed from: d */
    public final long m18988d(long j10) {
        return C10134c0.m19030O(j10 * ((long) this.f51345b), 1000000L, this.f51344a.f51338b);
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: h */
    public final InterfaceC7520u.a mo14983h(long j10) {
        C10126b c10126b = this.f51344a;
        long j11 = (((long) c10126b.f51338b) * j10) / (((long) this.f51345b) * 1000000);
        long j12 = this.f51347d;
        long jM19042i = C10134c0.m19042i(j11, 0L, j12 - 1);
        long j13 = ((long) c10126b.f51339c) * jM19042i;
        long j14 = this.f51346c;
        long jM18988d = m18988d(jM19042i);
        C7521v c7521v = new C7521v(jM18988d, j13 + j14);
        if (jM18988d >= j10 || jM19042i == j12 - 1) {
            return new InterfaceC7520u.a(c7521v, c7521v);
        }
        long j15 = jM19042i + 1;
        return new InterfaceC7520u.a(c7521v, new C7521v(m18988d(j15), (((long) c10126b.f51339c) * j15) + j14));
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: i */
    public final long mo14984i() {
        return this.f51348e;
    }
}
