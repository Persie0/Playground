package p000;

/* JADX INFO: loaded from: classes.dex */
public final class kx3 {

    /* JADX INFO: renamed from: a */
    public final int f48540a;

    /* JADX INFO: renamed from: a */
    public static String m15711a(int i) {
        if (i == 1) {
            return "Hyphens.None";
        }
        if (i == 2) {
            return "Hyphens.Auto";
        }
        return i == 0 ? "Hyphens.Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kx3) {
            return this.f48540a == ((kx3) obj).f48540a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f48540a);
    }

    public final String toString() {
        return m15711a(this.f48540a);
    }
}
