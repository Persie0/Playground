package p000;

/* JADX INFO: loaded from: classes.dex */
public final class ca9 {

    /* JADX INFO: renamed from: a */
    public final vi3 f9802a;

    /* JADX INFO: renamed from: b */
    public final l43 f9803b;

    public ca9(l43 l43Var, vi3 vi3Var) {
        this.f9802a = vi3Var;
        this.f9803b = l43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca9)) {
            return false;
        }
        ca9 ca9Var = (ca9) obj;
        return this.f9802a.equals(ca9Var.f9802a) && this.f9803b.equals(ca9Var.f9803b);
    }

    public final int hashCode() {
        return this.f9803b.hashCode() + (this.f9802a.hashCode() * 31);
    }

    public final String toString() {
        return "Slide(slideOffset=" + this.f9802a + ", animationSpec=" + this.f9803b + ')';
    }
}
