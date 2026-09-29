package p000;

/* JADX INFO: loaded from: classes.dex */
final class hs6 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f42889b;

    public hs6(vi3 vi3Var) {
        this.f42889b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hs6) {
            return this.f42889b == ((hs6) obj).f42889b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        is6 is6Var = new is6();
        is6Var.f44510J = this.f42889b;
        is6Var.f44511K = -9223372034707292160L;
        return is6Var;
    }

    public final int hashCode() {
        return this.f42889b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "onSizeChanged";
        y64Var.f69367c.m25511b(this.f42889b, "onSizeChanged");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        is6 is6Var = (is6) d16Var;
        is6Var.f44510J = this.f42889b;
        is6Var.f44511K = -9223372034707292160L;
    }
}
