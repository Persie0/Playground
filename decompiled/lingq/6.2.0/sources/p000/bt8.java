package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class bt8 extends ct8 {

    /* JADX INFO: renamed from: a */
    public final dq8 f8992a;

    public bt8(dq8 dq8Var) {
        dq8Var.getClass();
        this.f8992a = dq8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bt8) && fa4.m11650l(this.f8992a, ((bt8) obj).f8992a);
    }

    public final int hashCode() {
        return this.f8992a.hashCode();
    }

    public final String toString() {
        return "OnSelectionPageAction(action=" + this.f8992a + ")";
    }
}
