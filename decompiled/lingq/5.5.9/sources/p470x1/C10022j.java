package p470x1;

/* JADX INFO: renamed from: x1.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10022j {

    /* JADX INFO: renamed from: a */
    public final long f50980a;

    /* JADX INFO: renamed from: x1.j$a */
    public static final class a {
    }

    static {
        new a();
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m18627a(long j10, long j11) {
        return j10 == j11;
    }

    /* JADX INFO: renamed from: b */
    public static final int m18628b(long j10) {
        return (int) (j10 & 4294967295L);
    }

    /* JADX INFO: renamed from: c */
    public static String m18629c(long j10) {
        return ((int) (j10 >> 32)) + " x " + m18628b(j10);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10022j) {
            return this.f50980a == ((C10022j) obj).f50980a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f50980a);
    }

    public final String toString() {
        return m18629c(this.f50980a);
    }
}
