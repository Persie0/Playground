package p000;

/* JADX INFO: loaded from: classes.dex */
public final class bk2 {

    /* JADX INFO: renamed from: a */
    public final long f8632a;

    /* JADX INFO: renamed from: a */
    public static final float m3805a(long j) {
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    /* JADX INFO: renamed from: b */
    public static final float m3806b(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static String m3807c(long j) {
        if (j == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) xj2.m24561c(m3806b(j))) + " x " + ((Object) xj2.m24561c(m3805a(j)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bk2) {
            return this.f8632a == ((bk2) obj).f8632a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f8632a);
    }

    public final String toString() {
        return m3807c(this.f8632a);
    }
}
