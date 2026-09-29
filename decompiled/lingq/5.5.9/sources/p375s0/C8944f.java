package p375s0;

import ae.C0062b;
import p338qd.C8584v;

/* JADX INFO: renamed from: s0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C8944f {

    /* JADX INFO: renamed from: b */
    public static final long f46906b = C8584v.m16788m(0.0f, 0.0f);

    /* JADX INFO: renamed from: c */
    public static final long f46907c = C8584v.m16788m(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f46908d = 0;

    /* JADX INFO: renamed from: a */
    public final long f46909a;

    public /* synthetic */ C8944f(long j10) {
        this.f46909a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m17174a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static final float m17175b(long j10) {
        if (j10 != f46907c) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* JADX INFO: renamed from: c */
    public static final float m17176c(long j10) {
        return Math.min(Math.abs(m17177d(j10)), Math.abs(m17175b(j10)));
    }

    /* JADX INFO: renamed from: d */
    public static final float m17177d(long j10) {
        if (j10 != f46907c) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Size is unspecified".toString());
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m17178e(long j10) {
        if (m17177d(j10) > 0.0f && m17175b(j10) > 0.0f) {
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public static String m17179f(long j10) {
        if (!(j10 != f46907c)) {
            return "Size.Unspecified";
        }
        return "Size(" + C0062b.m391r2(m17177d(j10)) + ", " + C0062b.m391r2(m17175b(j10)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8944f) {
            return this.f46909a == ((C8944f) obj).f46909a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46909a);
    }

    public final String toString() {
        return m17179f(this.f46909a);
    }
}
