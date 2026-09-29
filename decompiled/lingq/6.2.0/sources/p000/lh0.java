package p000;

/* JADX INFO: loaded from: classes.dex */
final class lh0 extends i16 {

    /* JADX INFO: renamed from: b */
    public final gc0 f49649b;

    /* JADX INFO: renamed from: c */
    public final boolean f49650c;

    /* JADX INFO: renamed from: d */
    public final vi3 f49651d;

    public lh0(gc0 gc0Var, boolean z, vi3 vi3Var) {
        this.f49649b = gc0Var;
        this.f49650c = z;
        this.f49651d = vi3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        lh0 lh0Var = obj instanceof lh0 ? (lh0) obj : null;
        return lh0Var != null && this.f49649b.equals(lh0Var.f49649b) && this.f49650c == lh0Var.f49650c;
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        mh0 mh0Var = new mh0();
        mh0Var.f51318J = this.f49649b;
        mh0Var.f51319K = this.f49650c;
        return mh0Var;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f49650c) + (this.f49649b.hashCode() * 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f49651d.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        mh0 mh0Var = (mh0) d16Var;
        mh0Var.f51318J = this.f49649b;
        mh0Var.f51319K = this.f49650c;
    }
}
