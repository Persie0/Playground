package p000;

/* JADX INFO: loaded from: classes.dex */
public final class vt0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3571se f65871a;

    /* JADX INFO: renamed from: b */
    public final vi3 f65872b;

    /* JADX INFO: renamed from: c */
    public final l43 f65873c;

    public vt0(InterfaceC3571se interfaceC3571se, l43 l43Var, vi3 vi3Var) {
        this.f65871a = interfaceC3571se;
        this.f65872b = vi3Var;
        this.f65873c = l43Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vt0)) {
            return false;
        }
        vt0 vt0Var = (vt0) obj;
        return fa4.m11650l(this.f65871a, vt0Var.f65871a) && fa4.m11650l(this.f65872b, vt0Var.f65872b) && fa4.m11650l(this.f65873c, vt0Var.f65873c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f65873c.hashCode() + ((this.f65872b.hashCode() + (this.f65871a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.f65871a + ", size=" + this.f65872b + ", animationSpec=" + this.f65873c + ", clip=true)";
    }
}
