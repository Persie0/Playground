package p470x1;

/* JADX INFO: renamed from: x1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C10024l {

    /* JADX INFO: renamed from: a */
    public final long f50984a;

    /* JADX INFO: renamed from: a */
    public static final boolean m18634a(long j10, long j11) {
        return j10 == j11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10024l) {
            return this.f50984a == ((C10024l) obj).f50984a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f50984a);
    }

    public final String toString() {
        long j10 = this.f50984a;
        if (m18634a(j10, 0L)) {
            return "Unspecified";
        }
        if (m18634a(j10, 4294967296L)) {
            return "Sp";
        }
        return m18634a(j10, 8589934592L) ? "Em" : "Invalid";
    }
}
