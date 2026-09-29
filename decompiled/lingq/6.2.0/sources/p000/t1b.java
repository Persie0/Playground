package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class t1b extends v1b {

    /* JADX INFO: renamed from: a */
    public final w65 f61755a;

    public t1b(w65 w65Var) {
        w65Var.getClass();
        this.f61755a = w65Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1b) && fa4.m11650l(this.f61755a, ((t1b) obj).f61755a);
    }

    public final int hashCode() {
        return this.f61755a.hashCode();
    }

    public final String toString() {
        return "TokenClicked(token=" + this.f61755a + ")";
    }
}
