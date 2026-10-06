package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class muy extends muz {
    private static final long serialVersionUID = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public muy(Comparable comparable) {
        super(comparable);
        comparable.getClass();
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: c */
    public final Comparable mo17002c(mve mveVar) {
        return mveVar.mo17023f(this.f41672b);
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: d */
    public final Comparable mo17003d(mve mveVar) {
        return this.f41672b;
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: e */
    public final void mo17004e(StringBuilder sb) {
        sb.append('[');
        sb.append(this.f41672b);
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: f */
    public final void mo17005f(StringBuilder sb) {
        sb.append(this.f41672b);
        sb.append(')');
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: g */
    public final boolean mo17006g(Comparable comparable) {
        return mzj.m17172b(this.f41672b, comparable) <= 0;
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: h */
    public final muz mo17007h(mve mveVar) {
        return this;
    }

    @Override // p000.muz
    public final int hashCode() {
        return this.f41672b.hashCode();
    }

    @Override // p000.muz
    /* JADX INFO: renamed from: i */
    public final muz mo17008i(mve mveVar) {
        Comparable comparableMo17023f = mveVar.mo17023f(this.f41672b);
        return comparableMo17023f == null ? muv.f41670a : new muw(comparableMo17023f);
    }

    public final String toString() {
        return "\\" + this.f41672b + "/";
    }
}
