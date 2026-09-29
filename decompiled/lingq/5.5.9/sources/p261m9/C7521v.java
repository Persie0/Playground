package p261m9;

/* JADX INFO: renamed from: m9.v */
/* JADX INFO: loaded from: classes.dex */
public final class C7521v {

    /* JADX INFO: renamed from: c */
    public static final C7521v f41521c = new C7521v(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f41522a;

    /* JADX INFO: renamed from: b */
    public final long f41523b;

    public C7521v(long j10, long j11) {
        this.f41522a = j10;
        this.f41523b = j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C7521v.class == obj.getClass()) {
            C7521v c7521v = (C7521v) obj;
            return this.f41522a == c7521v.f41522a && this.f41523b == c7521v.f41523b;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f41522a) * 31) + ((int) this.f41523b);
    }

    public final String toString() {
        return "[timeUs=" + this.f41522a + ", position=" + this.f41523b + "]";
    }
}
