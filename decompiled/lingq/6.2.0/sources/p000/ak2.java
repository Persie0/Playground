package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ak2 {

    /* JADX INFO: renamed from: a */
    public final long f761a;

    /* JADX INFO: renamed from: a */
    public static final float m524a(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: b */
    public static final float m525b(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: c */
    public static String m526c(long j) {
        if (j == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) xj2.m24561c(m524a(j))) + ", " + ((Object) xj2.m24561c(m525b(j))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ak2) {
            return this.f761a == ((ak2) obj).f761a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f761a);
    }

    public final String toString() {
        return m526c(this.f761a);
    }
}
