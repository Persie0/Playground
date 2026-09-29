package p000;

/* JADX INFO: loaded from: classes.dex */
public final class fb1 implements on3 {

    /* JADX INFO: renamed from: a */
    public final on3 f38764a;

    /* JADX INFO: renamed from: b */
    public final on3 f38765b;

    public fb1(on3 on3Var, on3 on3Var2) {
        this.f38764a = on3Var;
        this.f38765b = on3Var2;
    }

    @Override // p000.on3
    /* JADX INFO: renamed from: a */
    public final Object mo11685a(Object obj, zi3 zi3Var) {
        return this.f38765b.mo11685a(this.f38764a.mo11685a(obj, zi3Var), zi3Var);
    }

    @Override // p000.on3
    /* JADX INFO: renamed from: b */
    public final boolean mo11686b(qy3 qy3Var) {
        return this.f38764a.mo11686b(qy3Var) && this.f38765b.mo11686b(qy3Var);
    }

    @Override // p000.on3
    /* JADX INFO: renamed from: c */
    public final boolean mo11687c(vi3 vi3Var) {
        return this.f38764a.mo11687c(vi3Var) || this.f38765b.mo11687c(vi3Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fb1)) {
            return false;
        }
        fb1 fb1Var = (fb1) obj;
        return this.f38764a.equals(fb1Var.f38764a) && fa4.m11650l(this.f38765b, fb1Var.f38765b);
    }

    public final int hashCode() {
        return (this.f38765b.hashCode() * 31) + this.f38764a.hashCode();
    }

    public final String toString() {
        return ux5.m22992o(new StringBuilder("["), (String) mo11685a("", new jx0(10)), ']');
    }
}
