package p000;

/* JADX INFO: loaded from: classes.dex */
final class zr6 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f72006b;

    public zr6(vi3 vi3Var) {
        this.f72006b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zr6) {
            return this.f72006b == ((zr6) obj).f72006b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        as6 as6Var = new as6();
        as6Var.f7428J = this.f72006b;
        return as6Var;
    }

    public final int hashCode() {
        return this.f72006b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "onGloballyPositioned";
        y64Var.f69367c.m25511b(this.f72006b, "onGloballyPositioned");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((as6) d16Var).f7428J = this.f72006b;
    }
}
