package p000;

/* JADX INFO: loaded from: classes.dex */
final class eq4 extends i16 {

    /* JADX INFO: renamed from: b */
    public final Object f37708b;

    public eq4(Object obj) {
        this.f37708b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq4) && fa4.m11650l(this.f37708b, ((eq4) obj).f37708b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        fq4 fq4Var = new fq4();
        fq4Var.f39454J = this.f37708b;
        return fq4Var;
    }

    public final int hashCode() {
        return this.f37708b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "layoutId";
        y64Var.f69366b = this.f37708b;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((fq4) d16Var).f39454J = this.f37708b;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + this.f37708b + ')';
    }
}
