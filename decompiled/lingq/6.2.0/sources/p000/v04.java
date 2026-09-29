package p000;

/* JADX INFO: loaded from: classes.dex */
public final class v04 {

    /* JADX INFO: renamed from: a */
    public final int f64658a;

    /* JADX INFO: renamed from: a */
    public static String m23037a(int i) {
        if (i == -1) {
            return "Unspecified";
        }
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Default";
        }
        if (i == 2) {
            return "Go";
        }
        if (i == 3) {
            return "Search";
        }
        if (i == 4) {
            return "Send";
        }
        if (i == 5) {
            return "Previous";
        }
        if (i == 6) {
            return "Next";
        }
        return i == 7 ? "Done" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v04) {
            return this.f64658a == ((v04) obj).f64658a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f64658a);
    }

    public final String toString() {
        return m23037a(this.f64658a);
    }
}
