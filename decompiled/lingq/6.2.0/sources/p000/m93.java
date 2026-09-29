package p000;

/* JADX INFO: loaded from: classes.dex */
final class m93 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f50811b;

    public m93(vi3 vi3Var) {
        this.f50811b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m93) {
            return this.f50811b == ((m93) obj).f50811b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        n93 n93Var = new n93();
        n93Var.f52506J = this.f50811b;
        return n93Var;
    }

    public final int hashCode() {
        return this.f50811b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "onFocusChanged";
        y64Var.f69367c.m25511b(this.f50811b, "onFocusChanged");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((n93) d16Var).f52506J = this.f50811b;
    }
}
