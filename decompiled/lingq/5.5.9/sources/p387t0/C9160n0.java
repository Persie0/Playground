package p387t0;

/* JADX INFO: renamed from: t0.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C9160n0 {

    /* JADX INFO: renamed from: a */
    public final int f47688a;

    /* JADX INFO: renamed from: a */
    public static String m17479a(int i10) {
        boolean z10 = false;
        if (i10 == 0) {
            return "Miter";
        }
        if (i10 == 1) {
            return "Round";
        }
        if (i10 == 2) {
            z10 = true;
        }
        return z10 ? "Bevel" : "Unknown";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C9160n0) {
            return this.f47688a == ((C9160n0) obj).f47688a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f47688a);
    }

    public final String toString() {
        return m17479a(this.f47688a);
    }
}
