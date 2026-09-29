package p000;

/* JADX INFO: loaded from: classes.dex */
final class rba extends i16 {

    /* JADX INFO: renamed from: b */
    public final lu4 f59032b;

    public rba(lu4 lu4Var) {
        this.f59032b = lu4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rba) && fa4.m11650l(this.f59032b, ((rba) obj).f59032b);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        sba sbaVar = new sba();
        sbaVar.f60628J = this.f59032b;
        return sbaVar;
    }

    public final int hashCode() {
        return this.f59032b.hashCode();
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        y64Var.f69365a = "traversablePrefetchState";
        y64Var.f69366b = this.f59032b;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        ((sba) d16Var).f60628J = this.f59032b;
    }

    public final String toString() {
        return "TraversablePrefetchStateModifierElement(prefetchState=" + this.f59032b + ')';
    }
}
