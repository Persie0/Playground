package p000;

/* JADX INFO: loaded from: classes.dex */
final class i47 extends i16 {

    /* JADX INFO: renamed from: b */
    public final dh9 f43517b;

    public i47(dh9 dh9Var) {
        this.f43517b = dh9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i47) && this.f43517b == ((i47) obj).f43517b;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        j47 j47Var = new j47();
        j47Var.f45044J = 0.4f;
        j47Var.f45045K = this.f43517b;
        return j47Var;
    }

    public final int hashCode() {
        return Float.hashCode(0.4f) + (this.f43517b.hashCode() * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "fillParentMaxHeight";
        y64Var.f69366b = Float.valueOf(0.4f);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        j47 j47Var = (j47) d16Var;
        j47Var.f45044J = 0.4f;
        j47Var.f45045K = this.f43517b;
    }
}
