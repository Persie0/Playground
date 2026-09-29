package p387t0;

import dm.C5212l;

/* JADX INFO: renamed from: t0.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9162o0 {

    /* JADX INFO: renamed from: b */
    public static final long f47689b = C5212l.m11167m(0.5f, 0.5f);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f47690c = 0;

    /* JADX INFO: renamed from: a */
    public final long f47691a;

    /* JADX INFO: renamed from: a */
    public static final float m17480a(long j10) {
        return Float.intBitsToFloat((int) (j10 & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public static String m17481b(long j10) {
        return "TransformOrigin(packedValue=" + j10 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9162o0) {
            return this.f47691a == ((C9162o0) obj).f47691a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f47691a);
    }

    public final String toString() {
        return m17481b(this.f47691a);
    }
}
