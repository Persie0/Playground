package p000;

/* JADX INFO: loaded from: classes.dex */
final class jl2 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f45666b;

    public jl2(vi3 vi3Var) {
        this.f45666b = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof jl2) {
            return this.f45666b == ((jl2) obj).f45666b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        il2 il2Var = new il2();
        il2Var.f44254J = this.f45666b;
        return il2Var;
    }

    public final int hashCode() {
        return this.f45666b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "drawBehind";
        y64Var.f69367c.m25511b(this.f45666b, "onDraw");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((il2) d16Var).f44254J = this.f45666b;
    }
}
