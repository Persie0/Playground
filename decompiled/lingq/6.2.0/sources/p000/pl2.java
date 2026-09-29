package p000;

/* JADX INFO: loaded from: classes.dex */
final class pl2 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f56399b;

    public pl2(vi3 vi3Var) {
        this.f56399b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pl2) {
            return this.f56399b == ((pl2) obj).f56399b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        ql2 ql2Var = new ql2();
        ql2Var.f57896J = this.f56399b;
        return ql2Var;
    }

    public final int hashCode() {
        return this.f56399b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "drawWithContent";
        y64Var.f69367c.m25511b(this.f56399b, "onDraw");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((ql2) d16Var).f57896J = this.f56399b;
    }
}
