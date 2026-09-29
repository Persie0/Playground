package p000;

/* JADX INFO: loaded from: classes.dex */
public final class i73 {

    /* JADX INFO: renamed from: a */
    public final long f43618a;

    /* JADX INFO: renamed from: a */
    public static long m13710a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static String m13711b(long j) {
        return "(" + Float.intBitsToFloat((int) (j >> 32)) + ", " + Float.intBitsToFloat((int) (j & 4294967295L)) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i73) {
            return this.f43618a == ((i73) obj).f43618a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43618a);
    }

    public final String toString() {
        return m13711b(this.f43618a);
    }
}
