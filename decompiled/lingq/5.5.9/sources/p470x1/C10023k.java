package p470x1;

import p338qd.C8573r0;

/* JADX INFO: renamed from: x1.k */
/* JADX INFO: loaded from: classes.dex */
public final class C10023k {

    /* JADX INFO: renamed from: b */
    public static final C10024l[] f50981b = {new C10024l(0), new C10024l(4294967296L), new C10024l(8589934592L)};

    /* JADX INFO: renamed from: c */
    public static final long f50982c = C8573r0.m16690O0(Float.NaN, 0);

    /* JADX INFO: renamed from: a */
    public final long f50983a;

    /* JADX INFO: renamed from: a */
    public static final boolean m18630a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static final long m18631b(long j10) {
        return f50981b[(int) ((j10 & 1095216660480L) >>> 32)].f50984a;
    }

    /* JADX INFO: renamed from: c */
    public static final float m18632c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static String m18633d(long j10) {
        long jM18631b = m18631b(j10);
        if (C10024l.m18634a(jM18631b, 0L)) {
            return "Unspecified";
        }
        if (C10024l.m18634a(jM18631b, 4294967296L)) {
            return m18632c(j10) + ".sp";
        }
        if (!C10024l.m18634a(jM18631b, 8589934592L)) {
            return "Invalid";
        }
        return m18632c(j10) + ".em";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10023k) {
            return this.f50983a == ((C10023k) obj).f50983a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f50983a);
    }

    public final String toString() {
        return m18633d(this.f50983a);
    }
}
