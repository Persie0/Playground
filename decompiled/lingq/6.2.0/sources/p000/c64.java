package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c64 {

    /* JADX INFO: renamed from: a */
    public final int f9630a;

    public final boolean equals(Object obj) {
        if (obj instanceof c64) {
            return this.f9630a == ((c64) obj).f9630a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f9630a);
    }

    public final String toString() {
        int i = this.f9630a;
        if (i == 1) {
            return "Touch";
        }
        return i == 2 ? "Keyboard" : "Error";
    }
}
