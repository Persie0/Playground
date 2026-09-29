package p000;

/* JADX INFO: loaded from: classes.dex */
public final class wb3 {

    /* JADX INFO: renamed from: a */
    public final int f66583a;

    public final boolean equals(Object obj) {
        if (obj instanceof wb3) {
            return this.f66583a == ((wb3) obj).f66583a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f66583a);
    }

    public final String toString() {
        int i = this.f66583a;
        if (i == 0) {
            return "Normal";
        }
        return i == 1 ? "Italic" : "Invalid";
    }
}
