package p000;

/* JADX INFO: loaded from: classes.dex */
public final class opa extends i16 {

    /* JADX INFO: renamed from: b */
    public final fc0 f54703b;

    public opa(fc0 fc0Var) {
        this.f54703b = fc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        opa opaVar = obj instanceof opa ? (opa) obj : null;
        if (opaVar == null) {
            return false;
        }
        return this.f54703b.equals(opaVar.f54703b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        ppa ppaVar = new ppa();
        ppaVar.f56638J = this.f54703b;
        return ppaVar;
    }

    public final int hashCode() {
        return Float.hashCode(this.f54703b.f38829a);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "align";
        y64Var.f69366b = this.f54703b;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((ppa) d16Var).f56638J = this.f54703b;
    }
}
