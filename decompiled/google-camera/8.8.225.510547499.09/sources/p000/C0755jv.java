package p000;

/* JADX INFO: renamed from: jv */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0755jv {

    /* JADX INFO: renamed from: a */
    long f34870a = 0;

    /* JADX INFO: renamed from: b */
    C0755jv f34871b;

    /* JADX INFO: renamed from: h */
    private final void m13528h() {
        if (this.f34871b == null) {
            this.f34871b = new C0755jv();
        }
    }

    /* JADX INFO: renamed from: a */
    final int m13529a(int i) {
        C0755jv c0755jv = this.f34871b;
        if (c0755jv == null) {
            return i >= 64 ? Long.bitCount(this.f34870a) : Long.bitCount(this.f34870a & ((1 << i) - 1));
        }
        return i < 64 ? Long.bitCount(this.f34870a & ((1 << i) - 1)) : c0755jv.m13529a(i - 64) + Long.bitCount(this.f34870a);
    }

    /* JADX INFO: renamed from: b */
    final void m13530b(int i) {
        if (i < 64) {
            this.f34870a &= (1 << i) ^ (-1);
            return;
        }
        C0755jv c0755jv = this.f34871b;
        if (c0755jv != null) {
            c0755jv.m13530b(i - 64);
        }
    }

    /* JADX INFO: renamed from: c */
    final void m13531c(int i, boolean z) {
        if (i >= 64) {
            m13528h();
            this.f34871b.m13531c(i - 64, z);
            return;
        }
        long j = this.f34870a;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        long j3 = j & j2;
        long j4 = j & (j2 ^ (-1));
        this.f34870a = (j4 + j4) | j3;
        if (z) {
            m13533e(i);
        } else {
            m13530b(i);
        }
        if (z2 || this.f34871b != null) {
            m13528h();
            this.f34871b.m13531c(0, z2);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m13532d() {
        this.f34870a = 0L;
        C0755jv c0755jv = this.f34871b;
        if (c0755jv != null) {
            c0755jv.m13532d();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m13533e(int i) {
        if (i < 64) {
            this.f34870a |= 1 << i;
        } else {
            m13528h();
            this.f34871b.m13533e(i - 64);
        }
    }

    /* JADX INFO: renamed from: f */
    final boolean m13534f(int i) {
        if (i < 64) {
            return (this.f34870a & (1 << i)) != 0;
        }
        m13528h();
        return this.f34871b.m13534f(i - 64);
    }

    /* JADX INFO: renamed from: g */
    final boolean m13535g(int i) {
        if (i >= 64) {
            m13528h();
            return this.f34871b.m13535g(i - 64);
        }
        long j = 1 << i;
        long j2 = this.f34870a;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (j ^ (-1));
        this.f34870a = j3;
        long j4 = j - 1;
        this.f34870a = (j4 & j3) | Long.rotateRight(((-1) ^ j4) & j3, 1);
        C0755jv c0755jv = this.f34871b;
        if (c0755jv != null) {
            if (c0755jv.m13534f(0)) {
                m13533e(63);
            }
            this.f34871b.m13535g(0);
        }
        return z;
    }

    public final String toString() {
        if (this.f34871b == null) {
            return Long.toBinaryString(this.f34870a);
        }
        return this.f34871b.toString() + "xx" + Long.toBinaryString(this.f34870a);
    }
}
