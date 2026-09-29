package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zw9 {

    /* JADX INFO: renamed from: a */
    public final int f72322a;

    public final boolean equals(Object obj) {
        if (obj instanceof zw9) {
            return this.f72322a == ((zw9) obj).f72322a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f72322a);
    }

    public final String toString() {
        int i = this.f72322a;
        if (i == 1) {
            return "Linearity.Linear";
        }
        if (i == 2) {
            return "Linearity.FontHinting";
        }
        return i == 3 ? "Linearity.None" : "Invalid";
    }
}
