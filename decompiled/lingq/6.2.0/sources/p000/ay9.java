package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ay9 {

    /* JADX INFO: renamed from: a */
    public final long f7673a;

    /* JADX INFO: renamed from: a */
    public static final boolean m3127a(long j, long j2) {
        return j == j2;
    }

    /* JADX INFO: renamed from: b */
    public static String m3128b(long j) {
        if (m3127a(j, 0L)) {
            return "Unspecified";
        }
        if (m3127a(j, 4294967296L)) {
            return "Sp";
        }
        return m3127a(j, 8589934592L) ? "Em" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ay9) {
            return this.f7673a == ((ay9) obj).f7673a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f7673a);
    }

    public final String toString() {
        return m3128b(this.f7673a);
    }
}
