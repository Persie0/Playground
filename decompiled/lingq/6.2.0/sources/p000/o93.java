package p000;

/* JADX INFO: loaded from: classes.dex */
public final class o93 {

    /* JADX INFO: renamed from: a */
    public final int f54076a;

    /* JADX INFO: renamed from: a */
    public static String m17871a(int i) {
        if (i == 1) {
            return "Next";
        }
        if (i == 2) {
            return "Previous";
        }
        if (i == 3) {
            return "Left";
        }
        if (i == 4) {
            return "Right";
        }
        if (i == 5) {
            return "Up";
        }
        if (i == 6) {
            return "Down";
        }
        if (i == 7) {
            return "Enter";
        }
        return i == 8 ? "Exit" : "Invalid FocusDirection";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o93) {
            return this.f54076a == ((o93) obj).f54076a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f54076a);
    }

    public final String toString() {
        return m17871a(this.f54076a);
    }
}
