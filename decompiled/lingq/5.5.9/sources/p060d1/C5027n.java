package p060d1;

/* JADX INFO: renamed from: d1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5027n {

    /* JADX INFO: renamed from: a */
    public final long f32834a;

    /* JADX INFO: renamed from: a */
    public static final boolean m10711a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static String m10712b(long j10) {
        return "PointerId(value=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5027n) {
            return this.f32834a == ((C5027n) obj).f32834a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32834a);
    }

    public final String toString() {
        return m10712b(this.f32834a);
    }
}
