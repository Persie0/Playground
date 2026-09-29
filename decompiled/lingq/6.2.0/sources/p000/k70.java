package p000;

/* JADX INFO: loaded from: classes.dex */
final class k70 extends i16 {

    /* JADX INFO: renamed from: b */
    public final long f46801b;

    /* JADX INFO: renamed from: c */
    public final vi0 f46802c;

    /* JADX INFO: renamed from: d */
    public final float f46803d;

    /* JADX INFO: renamed from: e */
    public final o39 f46804e;

    /* JADX INFO: renamed from: f */
    public final vi3 f46805f;

    public k70(long j, xc5 xc5Var, o39 o39Var, vi3 vi3Var, int i) {
        j = (i & 1) != 0 ? aa1.f412k : j;
        xc5Var = (i & 2) != 0 ? null : xc5Var;
        this.f46801b = j;
        this.f46802c = xc5Var;
        this.f46803d = 1.0f;
        this.f46804e = o39Var;
        this.f46805f = vi3Var;
    }

    public final boolean equals(Object obj) {
        k70 k70Var = obj instanceof k70 ? (k70) obj : null;
        return k70Var != null && aa1.m199c(this.f46801b, k70Var.f46801b) && fa4.m11650l(this.f46802c, k70Var.f46802c) && this.f46803d == k70Var.f46803d && fa4.m11650l(this.f46804e, k70Var.f46804e);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: h */
    public final d16 mo21h() {
        p70 p70Var = new p70();
        p70Var.f55676J = this.f46801b;
        p70Var.f55677K = this.f46802c;
        p70Var.f55678L = this.f46803d;
        p70Var.f55679M = this.f46804e;
        p70Var.f55680N = 9205357640488583168L;
        return p70Var;
    }

    public final int hashCode() {
        int i = aa1.f413l;
        int iHashCode = Long.hashCode(this.f46801b) * 31;
        vi0 vi0Var = this.f46802c;
        return this.f46804e.hashCode() + wq1.m24105a((iHashCode + (vi0Var != null ? vi0Var.hashCode() : 0)) * 31, this.f46803d, 31);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: n */
    public final void mo22n(y64 y64Var) {
        this.f46805f.invoke(y64Var);
    }

    @Override // p000.i16
    /* JADX INFO: renamed from: o */
    public final void mo23o(d16 d16Var) {
        p70 p70Var = (p70) d16Var;
        p70Var.f55676J = this.f46801b;
        p70Var.f55677K = this.f46802c;
        p70Var.f55678L = this.f46803d;
        o39 o39Var = p70Var.f55679M;
        o39 o39Var2 = this.f46804e;
        if (!fa4.m11650l(o39Var, o39Var2)) {
            p70Var.f55679M = o39Var2;
            thb.m22062u(p70Var);
        }
        AbstractC3489q9.m19789s(p70Var);
    }
}
