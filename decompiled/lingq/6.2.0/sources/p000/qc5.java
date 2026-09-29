package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qc5 {

    /* JADX INFO: renamed from: a */
    public final int f57565a;

    public final boolean equals(Object obj) {
        if (obj instanceof qc5) {
            return this.f57565a == ((qc5) obj).f57565a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f57565a);
    }

    public final String toString() {
        int i = this.f57565a;
        if (i == 1) {
            return "LineHeightStyle.Trim.FirstLineTop";
        }
        if (i == 16) {
            return "LineHeightStyle.Trim.LastLineBottom";
        }
        if (i == 17) {
            return "LineHeightStyle.Trim.Both";
        }
        return i == 0 ? "LineHeightStyle.Trim.None" : "Invalid";
    }
}
