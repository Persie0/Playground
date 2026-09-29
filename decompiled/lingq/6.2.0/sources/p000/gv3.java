package p000;

/* JADX INFO: loaded from: classes.dex */
public final class gv3 extends i16 {

    /* JADX INFO: renamed from: b */
    public final ec0 f41374b;

    public gv3(ec0 ec0Var) {
        this.f41374b = ec0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        gv3 gv3Var = obj instanceof gv3 ? (gv3) obj : null;
        if (gv3Var == null) {
            return false;
        }
        return this.f41374b.equals(gv3Var.f41374b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        hv3 hv3Var = new hv3();
        hv3Var.f42974J = this.f41374b;
        return hv3Var;
    }

    public final int hashCode() {
        return Float.hashCode(this.f41374b.f36988a);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "align";
        y64Var.f69366b = this.f41374b;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((hv3) d16Var).f42974J = this.f41374b;
    }
}
