package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zx9 {

    /* JADX INFO: renamed from: b */
    public static final ay9[] f72358b = {new ay9(0), new ay9(4294967296L), new ay9(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f72359c = d32.m10032c0(Float.NaN, 0);

    /* JADX INFO: renamed from: a */
    public final long f72360a;

    public /* synthetic */ zx9(long j) {
        this.f72360a = j;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m25846a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static final long m25847b(long j) {
        return f72358b[(int) ((j & 1095216660480L) >>> 32)].f7673a;
    }

    /* JADX INFO: renamed from: c */
    public static final float m25848c(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m25849d(long j) {
        return (j & 1095216660480L) == 8589934592L;
    }

    /* JADX INFO: renamed from: e */
    public static String m25850e(long j) {
        long jM25847b = m25847b(j);
        if (ay9.m3127a(jM25847b, 0L)) {
            return "Unspecified";
        }
        if (ay9.m3127a(jM25847b, 4294967296L)) {
            return m25848c(j) + ".sp";
        }
        if (!ay9.m3127a(jM25847b, 8589934592L)) {
            return "Invalid";
        }
        return m25848c(j) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zx9) {
            return this.f72360a == ((zx9) obj).f72360a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f72360a);
    }

    public final String toString() {
        return m25850e(this.f72360a);
    }
}
