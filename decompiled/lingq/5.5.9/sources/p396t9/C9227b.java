package p396t9;

import p166i1.C6153k;
import p261m9.C7521v;
import p261m9.InterfaceC7520u;
import p479xa.C10134c0;

/* JADX INFO: renamed from: t9.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9227b implements InterfaceC9230e {

    /* JADX INFO: renamed from: a */
    public final long f47837a;

    /* JADX INFO: renamed from: b */
    public final C6153k f47838b;

    /* JADX INFO: renamed from: c */
    public final C6153k f47839c;

    /* JADX INFO: renamed from: d */
    public long f47840d;

    public C9227b(long j10, long j11, long j12) {
        this.f47840d = j10;
        this.f47837a = j12;
        C6153k c6153k = new C6153k(2);
        this.f47838b = c6153k;
        C6153k c6153k2 = new C6153k(2);
        this.f47839c = c6153k2;
        c6153k.m12659a(0L);
        c6153k2.m12659a(j11);
    }

    @Override // p396t9.InterfaceC9230e
    /* JADX INFO: renamed from: a */
    public final long mo17583a() {
        return this.f47837a;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: b */
    public final boolean mo14982b() {
        return true;
    }

    @Override // p396t9.InterfaceC9230e
    /* JADX INFO: renamed from: c */
    public final long mo17584c(long j10) {
        return this.f47838b.m12660b(C10134c0.m19036c(this.f47839c, j10));
    }

    /* JADX INFO: renamed from: d */
    public final boolean m17585d(long j10) {
        C6153k c6153k = this.f47838b;
        return j10 - c6153k.m12660b(c6153k.f35977a - 1) < 100000;
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: h */
    public final InterfaceC7520u.a mo14983h(long j10) {
        C6153k c6153k = this.f47838b;
        int iM19036c = C10134c0.m19036c(c6153k, j10);
        long jM12660b = c6153k.m12660b(iM19036c);
        C6153k c6153k2 = this.f47839c;
        C7521v c7521v = new C7521v(jM12660b, c6153k2.m12660b(iM19036c));
        if (jM12660b == j10 || iM19036c == c6153k.f35977a - 1) {
            return new InterfaceC7520u.a(c7521v, c7521v);
        }
        int i10 = iM19036c + 1;
        return new InterfaceC7520u.a(c7521v, new C7521v(c6153k.m12660b(i10), c6153k2.m12660b(i10)));
    }

    @Override // p261m9.InterfaceC7520u
    /* JADX INFO: renamed from: i */
    public final long mo14984i() {
        return this.f47840d;
    }
}
