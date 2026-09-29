package p000;

/* JADX INFO: loaded from: classes.dex */
final class ik1 extends i16 {

    /* JADX INFO: renamed from: b */
    public final vi3 f44216b;

    /* JADX INFO: renamed from: c */
    public final vi3 f44217c;

    public ik1(vi3 vi3Var, vi3 vi3Var2) {
        this.f44216b = vi3Var;
        this.f44217c = vi3Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ik1) && ((ik1) obj).f44216b == this.f44216b;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        jk1 jk1Var = new jk1();
        jk1Var.f45650L = this.f44216b;
        return jk1Var;
    }

    public final int hashCode() {
        return this.f44216b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f44217c.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        jk1 jk1Var = (jk1) d16Var;
        vi3 vi3Var = jk1Var.f45650L;
        vi3 vi3Var2 = this.f44216b;
        if (vi3Var2 != vi3Var) {
            jk1Var.f45650L = vi3Var2;
        }
    }
}
