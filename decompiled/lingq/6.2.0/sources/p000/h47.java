package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class h47 extends i16 {

    /* JADX INFO: renamed from: b */
    public final C3485q5 f41782b;

    public h47(C3485q5 c3485q5) {
        this.f41782b = c3485q5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h47) {
            return this.f41782b == ((h47) obj).f41782b;
        }
        return false;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        g47 g47Var = new g47();
        g47Var.f40183J = this.f41782b;
        return g47Var;
    }

    public final int hashCode() {
        return this.f41782b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "parentSemantics";
        y64Var.f69367c.m25511b(this.f41782b, "properties");
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        g47 g47Var = (g47) d16Var;
        g47Var.f40183J = this.f41782b;
        thb.m22062u(g47Var);
    }
}
