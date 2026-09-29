package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ch5 {

    /* JADX INFO: renamed from: a */
    public final int f10091a;

    public final boolean equals(Object obj) {
        if (obj instanceof ch5) {
            return this.f10091a == ((ch5) obj).f10091a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f10091a);
    }

    public final String toString() {
        int i = this.f10091a;
        if (i == 0) {
            return "Polite";
        }
        return i == 1 ? "Assertive" : "Unknown";
    }
}
