package p387t0;

/* JADX INFO: renamed from: t0.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9158m0 {

    /* JADX INFO: renamed from: a */
    public final int f47686a;

    /* JADX INFO: renamed from: a */
    public static String m17477a(int i10) {
        if (i10 == 0) {
            return "Butt";
        }
        if (i10 == 1) {
            return "Round";
        }
        return i10 == 2 ? "Square" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9158m0) {
            return this.f47686a == ((C9158m0) obj).f47686a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47686a);
    }

    public final String toString() {
        return m17477a(this.f47686a);
    }
}
