package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class k14 implements l14 {

    /* JADX INFO: renamed from: a */
    public final ef0 f46550a;

    public k14(ef0 ef0Var) {
        ef0Var.getClass();
        this.f46550a = ef0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k14) && fa4.m11650l(this.f46550a, ((k14) obj).f46550a);
    }

    public final int hashCode() {
        return this.f46550a.hashCode();
    }

    public final String toString() {
        return "Success(state=" + this.f46550a + ")";
    }
}
