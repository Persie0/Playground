package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x89 {

    /* JADX INFO: renamed from: a */
    public final long f67935a;

    public /* synthetic */ x89(long j) {
        this.f67935a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m24404a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static final float m24405b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: c */
    public static final float m24406c(long j) {
        return Math.min(Float.intBitsToFloat((int) ((j >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j & 2147483647L)));
    }

    /* JADX INFO: renamed from: d */
    public static final float m24407d(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m24408e(long j) {
        return (j == 9205357640488583168L) | (Float.intBitsToFloat((int) (j >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j & 4294967295L)) <= 0.0f);
    }

    /* JADX INFO: renamed from: f */
    public static String m24409f(long j) {
        if (j == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + do7.m10521H(Float.intBitsToFloat((int) (j >> 32))) + ", " + do7.m10521H(Float.intBitsToFloat((int) (j & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x89) {
            return this.f67935a == ((x89) obj).f67935a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f67935a);
    }

    public final String toString() {
        return m24409f(this.f67935a);
    }
}
