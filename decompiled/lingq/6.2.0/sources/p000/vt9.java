package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vt9 {

    /* JADX INFO: renamed from: a */
    public final int f65894a;

    /* JADX INFO: renamed from: a */
    public static String m23544a(int i) {
        if (i == 1) {
            return "Ltr";
        }
        if (i == 2) {
            return "Rtl";
        }
        if (i == 3) {
            return "Content";
        }
        if (i == 4) {
            return "ContentOrLtr";
        }
        if (i == 5) {
            return "ContentOrRtl";
        }
        return i == 0 ? "Unspecified" : "Invalid";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vt9) {
            return this.f65894a == ((vt9) obj).f65894a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f65894a);
    }

    public final String toString() {
        return m23544a(this.f65894a);
    }
}
