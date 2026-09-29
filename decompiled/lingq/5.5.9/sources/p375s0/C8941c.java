package p375s0;

import ae.C0062b;
import p260m8.C7499b;

/* JADX INFO: renamed from: s0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C8941c {

    /* JADX INFO: renamed from: b */
    public static final long f46888b = C7499b.m14932c(0.0f, 0.0f);

    /* JADX INFO: renamed from: c */
    public static final long f46889c = C7499b.m14932c(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: d */
    public static final long f46890d = C7499b.m14932c(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f46891e = 0;

    /* JADX INFO: renamed from: a */
    public final long f46892a;

    public /* synthetic */ C8941c(long j10) {
        this.f46892a = j10;
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m17162a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static final float m17163b(long j10) {
        return (float) Math.sqrt((m17165d(j10) * m17165d(j10)) + (m17164c(j10) * m17164c(j10)));
    }

    /* JADX INFO: renamed from: c */
    public static final float m17164c(long j10) {
        if (j10 != f46890d) {
            return Float.intBitsToFloat((int) (j10 >> 32));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static final float m17165d(long j10) {
        if (j10 != f46890d) {
            return Float.intBitsToFloat((int) (j10 & 4294967295L));
        }
        throw new IllegalStateException("Offset is unspecified".toString());
    }

    /* JADX INFO: renamed from: e */
    public static final long m17166e(long j10, long j11) {
        return C7499b.m14932c(m17164c(j10) - m17164c(j11), m17165d(j10) - m17165d(j11));
    }

    /* JADX INFO: renamed from: f */
    public static final long m17167f(long j10, long j11) {
        return C7499b.m14932c(m17164c(j11) + m17164c(j10), m17165d(j11) + m17165d(j10));
    }

    /* JADX INFO: renamed from: g */
    public static final long m17168g(float f3, long j10) {
        return C7499b.m14932c(m17164c(j10) * f3, m17165d(j10) * f3);
    }

    /* JADX INFO: renamed from: h */
    public static String m17169h(long j10) {
        if (!(j10 != f46890d)) {
            return "Offset.Unspecified";
        }
        return "Offset(" + C0062b.m391r2(m17164c(j10)) + ", " + C0062b.m391r2(m17165d(j10)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C8941c) {
            return this.f46892a == ((C8941c) obj).f46892a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46892a);
    }

    public final String toString() {
        return m17169h(this.f46892a);
    }
}
