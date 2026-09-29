package p000;

/* JADX INFO: loaded from: classes.dex */
public final class pc5 {

    /* JADX INFO: renamed from: a */
    public final int f55947a;

    public final boolean equals(Object obj) {
        if (obj instanceof pc5) {
            return this.f55947a == ((pc5) obj).f55947a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f55947a);
    }

    public final String toString() {
        int i = this.f55947a;
        if (i == 0) {
            return "LineHeightStyle.Mode.Fixed";
        }
        if (i == 1) {
            return "LineHeightStyle.Mode.Minimum";
        }
        return i == 2 ? "LineHeightStyle.Mode.Tight" : "Invalid";
    }
}
