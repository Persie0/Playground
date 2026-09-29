package p000;

/* JADX INFO: loaded from: classes.dex */
public final class n84 {

    /* JADX INFO: renamed from: a */
    public final long f52482a;

    /* JADX INFO: renamed from: a */
    public static final boolean m17279a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static String m17280b(long j) {
        return ((int) (j >> 32)) + " x " + ((int) (j & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n84) {
            return this.f52482a == ((n84) obj).f52482a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f52482a);
    }

    public final String toString() {
        return m17280b(this.f52482a);
    }
}
