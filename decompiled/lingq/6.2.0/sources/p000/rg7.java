package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rg7 {

    /* JADX INFO: renamed from: a */
    public final int f59237a;

    /* JADX INFO: renamed from: a */
    public static String m20659a(int i) {
        if (i == 1) {
            return "Touch";
        }
        if (i == 2) {
            return "Mouse";
        }
        if (i != 3) {
            return i != 4 ? "Unknown" : "Eraser";
        }
        return "Stylus";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof rg7) {
            return this.f59237a == ((rg7) obj).f59237a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59237a);
    }

    public final String toString() {
        return m20659a(this.f59237a);
    }
}
