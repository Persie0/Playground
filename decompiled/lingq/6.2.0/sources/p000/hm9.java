package p000;

/* JADX INFO: loaded from: classes.dex */
final class hm9 extends i16 {

    /* JADX INFO: renamed from: b */
    public final ui3 f42639b;

    public hm9(ui3 ui3Var) {
        this.f42639b = ui3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hm9) {
            return this.f42639b == ((hm9) obj).f42639b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        return new im9(this.f42639b);
    }

    public final int hashCode() {
        return this.f42639b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "stylusHandwriting";
        y64Var.f69367c.m25511b(this.f42639b, "onHandwritingSlopExceeded");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((im9) d16Var).f44294L = this.f42639b;
    }
}
