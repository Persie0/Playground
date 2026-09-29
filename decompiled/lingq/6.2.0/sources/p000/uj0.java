package p000;

/* JADX INFO: loaded from: classes.dex */
public final class uj0 {

    /* JADX INFO: renamed from: a */
    public final oa1 f63984a;

    /* JADX INFO: renamed from: b */
    public final oa1 f63985b;

    public uj0(oa1 oa1Var, oa1 oa1Var2) {
        this.f63984a = oa1Var;
        this.f63985b = oa1Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!uj0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        uj0 uj0Var = (uj0) obj;
        return fa4.m11650l(this.f63984a, uj0Var.f63984a) && fa4.m11650l(this.f63985b, uj0Var.f63985b);
    }

    public final int hashCode() {
        return this.f63985b.hashCode() + (this.f63984a.hashCode() * 31);
    }
}
