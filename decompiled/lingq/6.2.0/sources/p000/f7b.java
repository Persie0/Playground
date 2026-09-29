package p000;

/* JADX INFO: loaded from: classes.dex */
public final class f7b extends i16 {

    /* JADX INFO: renamed from: b */
    public final AbstractC3608te f38602b;

    public f7b(AbstractC3608te abstractC3608te) {
        this.f38602b = abstractC3608te;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        f7b f7bVar = obj instanceof f7b ? (f7b) obj : null;
        if (f7bVar == null) {
            return false;
        }
        return fa4.m11650l(this.f38602b, f7bVar.f38602b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        m69 m69Var = new m69();
        m69Var.f50670J = this.f38602b;
        return m69Var;
    }

    public final int hashCode() {
        return this.f38602b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "alignBy";
        y64Var.f69366b = this.f38602b;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((m69) d16Var).f50670J = this.f38602b;
    }
}
