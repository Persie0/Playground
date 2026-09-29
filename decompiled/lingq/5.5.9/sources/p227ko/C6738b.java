package p227ko;

/* JADX INFO: renamed from: ko.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6738b<V> {

    /* JADX INFO: renamed from: f */
    public static final C6738b<Object> f38003f = new C6738b<>();

    /* JADX INFO: renamed from: a */
    public final long f38004a;

    /* JADX INFO: renamed from: b */
    public final V f38005b;

    /* JADX INFO: renamed from: c */
    public final C6738b<V> f38006c;

    /* JADX INFO: renamed from: d */
    public final C6738b<V> f38007d;

    /* JADX INFO: renamed from: e */
    public final int f38008e;

    public C6738b() {
        this.f38008e = 0;
        this.f38004a = 0L;
        this.f38005b = null;
        this.f38006c = null;
        this.f38007d = null;
    }

    public C6738b(long j10, V v10, C6738b<V> c6738b, C6738b<V> c6738b2) {
        this.f38004a = j10;
        this.f38005b = v10;
        this.f38006c = c6738b;
        this.f38007d = c6738b2;
        this.f38008e = c6738b.f38008e + 1 + c6738b2.f38008e;
    }

    /* JADX INFO: renamed from: a */
    public final V m13359a(long j10) {
        if (this.f38008e == 0) {
            return null;
        }
        long j11 = this.f38004a;
        if (j10 < j11) {
            return this.f38006c.m13359a(j10 - j11);
        }
        return j10 > j11 ? this.f38007d.m13359a(j10 - j11) : this.f38005b;
    }

    /* JADX INFO: renamed from: b */
    public final C6738b m13360b(long j10, C6737a c6737a) {
        if (this.f38008e == 0) {
            return new C6738b(j10, c6737a, this, this);
        }
        long j11 = this.f38004a;
        C6738b<V> c6738b = this.f38007d;
        C6738b<V> c6738b2 = this.f38006c;
        if (j10 < j11) {
            return m13361c(c6738b2.m13360b(j10 - j11, c6737a), c6738b);
        }
        if (j10 > j11) {
            return m13361c(c6738b2, c6738b.m13360b(j10 - j11, c6737a));
        }
        return c6737a == this.f38005b ? this : new C6738b(j10, c6737a, c6738b2, c6738b);
    }

    /* JADX INFO: renamed from: c */
    public final C6738b<V> m13361c(C6738b<V> c6738b, C6738b<V> c6738b2) {
        C6738b<V> c6738b3;
        if (c6738b == this.f38006c && c6738b2 == this.f38007d) {
            return this;
        }
        long j10 = this.f38004a;
        V v10 = this.f38005b;
        int i10 = c6738b.f38008e;
        int i11 = c6738b2.f38008e;
        if (i10 + i11 > 1) {
            if (i10 >= i11 * 5) {
                C6738b<V> c6738b4 = c6738b.f38007d;
                int i12 = c6738b4.f38008e;
                C6738b<V> c6738b5 = c6738b.f38006c;
                int i13 = c6738b5.f38008e * 2;
                long j11 = c6738b.f38004a;
                long j12 = c6738b4.f38004a;
                if (i12 < i13) {
                    return new C6738b<>(j11 + j10, c6738b.f38005b, c6738b5, new C6738b(-j11, v10, c6738b4.m13362d(j12 + j11), c6738b2));
                }
                long j13 = j12 + j11 + j10;
                V v11 = c6738b4.f38005b;
                V v12 = c6738b.f38005b;
                C6738b<V> c6738b6 = c6738b4.f38006c;
                C6738b c6738b7 = new C6738b(-j12, v12, c6738b5, c6738b6.m13362d(c6738b6.f38004a + j12));
                C6738b<V> c6738b8 = c6738b4.f38007d;
                return new C6738b<>(j13, v11, c6738b7, new C6738b((-j11) - j12, v10, c6738b8.m13362d(c6738b8.f38004a + j12 + j11), c6738b2));
            }
            if (i11 >= i10 * 5) {
                C6738b<V> c6738b9 = c6738b2.f38006c;
                int i14 = c6738b9.f38008e;
                C6738b<V> c6738b10 = c6738b2.f38007d;
                int i15 = c6738b10.f38008e * 2;
                long j14 = c6738b2.f38004a;
                long j15 = c6738b9.f38004a;
                if (i14 < i15) {
                    c6738b3 = new C6738b<>(j14 + j10, c6738b2.f38005b, new C6738b(-j14, v10, c6738b, c6738b9.m13362d(j15 + j14)), c6738b10);
                } else {
                    long j16 = j15 + j14 + j10;
                    V v13 = c6738b9.f38005b;
                    C6738b<V> c6738b11 = c6738b9.f38006c;
                    C6738b c6738b12 = new C6738b((-j14) - j15, v10, c6738b, c6738b11.m13362d(c6738b11.f38004a + j15 + j14));
                    V v14 = c6738b2.f38005b;
                    C6738b<V> c6738b13 = c6738b9.f38007d;
                    c6738b3 = new C6738b<>(j16, v13, c6738b12, new C6738b(-j15, v14, c6738b13.m13362d(c6738b13.f38004a + j15), c6738b10));
                }
                return c6738b3;
            }
        }
        return new C6738b<>(j10, v10, c6738b, c6738b2);
    }

    /* JADX INFO: renamed from: d */
    public final C6738b<V> m13362d(long j10) {
        return (this.f38008e == 0 || j10 == this.f38004a) ? this : new C6738b<>(j10, this.f38005b, this.f38006c, this.f38007d);
    }
}
