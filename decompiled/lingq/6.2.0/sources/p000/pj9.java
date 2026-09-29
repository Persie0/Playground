package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class pj9 implements qj9 {

    /* JADX INFO: renamed from: a */
    public final dx1 f56324a;

    public pj9(dx1 dx1Var) {
        dx1Var.getClass();
        this.f56324a = dx1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pj9) && fa4.m11650l(this.f56324a, ((pj9) obj).f56324a);
    }

    public final int hashCode() {
        return this.f56324a.hashCode();
    }

    public final String toString() {
        return "Success(currentDay=" + this.f56324a + ")";
    }
}
