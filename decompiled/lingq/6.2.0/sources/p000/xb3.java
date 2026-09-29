package p000;

/* JADX INFO: loaded from: classes.dex */
public final class xb3 {

    /* JADX INFO: renamed from: a */
    public final int f68021a;

    public final boolean equals(Object obj) {
        if (obj instanceof xb3) {
            return this.f68021a == ((xb3) obj).f68021a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f68021a);
    }

    public final String toString() {
        int i = this.f68021a;
        if (i == 0) {
            return "None";
        }
        if (i == 1) {
            return "Weight";
        }
        if (i == 2) {
            return "Style";
        }
        return i == 65535 ? "All" : "Invalid";
    }
}
