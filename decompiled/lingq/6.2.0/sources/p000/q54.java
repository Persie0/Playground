package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class q54 {

    /* JADX INFO: renamed from: a */
    public final String f57290a;

    /* JADX INFO: renamed from: b */
    public final he9 f57291b;

    public q54(String str, he9 he9Var) {
        this.f57290a = str;
        this.f57291b = he9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q54)) {
            return false;
        }
        q54 q54Var = (q54) obj;
        return this.f57290a.equals(q54Var.f57290a) && this.f57291b.equals(q54Var.f57291b);
    }

    public final int hashCode() {
        return this.f57291b.hashCode() + (this.f57290a.hashCode() * 31);
    }

    public final String toString() {
        return "InlineMarker(delimiter=" + this.f57290a + ", style=" + this.f57291b + ")";
    }
}
