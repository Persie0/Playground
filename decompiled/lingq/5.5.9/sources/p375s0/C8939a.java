package p375s0;

import ae.C0062b;
import p338qd.C8573r0;

/* JADX INFO: renamed from: s0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8939a {

    /* JADX INFO: renamed from: a */
    public static final long f46882a = C8573r0.m16741n(0.0f, 0.0f);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f46883b = 0;

    /* JADX INFO: renamed from: a */
    public static final boolean m17156a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static final float m17157b(long j10) {
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static final float m17158c(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static String m17159d(long j10) {
        if (m17157b(j10) == m17158c(j10)) {
            return "CornerRadius.circular(" + C0062b.m391r2(m17157b(j10)) + ')';
        }
        return "CornerRadius.elliptical(" + C0062b.m391r2(m17157b(j10)) + ", " + C0062b.m391r2(m17158c(j10)) + ')';
    }
}
