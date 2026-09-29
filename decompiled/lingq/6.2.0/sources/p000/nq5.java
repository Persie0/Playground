package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class nq5 implements xu5, wu5 {

    /* JADX INFO: renamed from: a */
    public final jv5 f53129a;

    /* JADX INFO: renamed from: b */
    public final long f53130b;

    /* JADX INFO: renamed from: c */
    public final gv5 f53131c;

    /* JADX INFO: renamed from: d */
    public q90 f53132d;

    /* JADX INFO: renamed from: e */
    public xu5 f53133e;

    /* JADX INFO: renamed from: f */
    public wu5 f53134f;

    /* JADX INFO: renamed from: g */
    public long f53135g = -9223372036854775807L;

    public nq5(jv5 jv5Var, gv5 gv5Var, long j) {
        this.f53129a = jv5Var;
        this.f53131c = gv5Var;
        this.f53130b = j;
    }

    @Override // p000.wu5
    /* JADX INFO: renamed from: a */
    public final void mo17593a(xu5 xu5Var) {
        wu5 wu5Var = this.f53134f;
        String str = uma.f64080a;
        wu5Var.mo17593a(this);
    }

    @Override // p000.wu5
    /* JADX INFO: renamed from: b */
    public final void mo17594b(xu5 xu5Var) {
        wu5 wu5Var = this.f53134f;
        String str = uma.f64080a;
        wu5Var.mo17594b(this);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: c */
    public final long mo2544c(C3565s8[] c3565s8Arr, boolean[] zArr, zk8[] zk8VarArr, boolean[] zArr2, long j) {
        long j2 = this.f53135g;
        if (j2 != -9223372036854775807L && j == this.f53130b) {
            j = j2;
        }
        this.f53135g = -9223372036854775807L;
        xu5 xu5Var = this.f53133e;
        String str = uma.f64080a;
        return xu5Var.mo2544c(c3565s8Arr, zArr, zk8VarArr, zArr2, j);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: d */
    public final long mo2545d() {
        xu5 xu5Var = this.f53133e;
        String str = uma.f64080a;
        return xu5Var.mo2545d();
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: e */
    public final long mo2546e(long j, tt8 tt8Var) {
        xu5 xu5Var = this.f53133e;
        String str = uma.f64080a;
        return xu5Var.mo2546e(j, tt8Var);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: f */
    public final void mo2547f() {
        xu5 xu5Var = this.f53133e;
        if (xu5Var != null) {
            xu5Var.mo2547f();
            return;
        }
        q90 q90Var = this.f53132d;
        if (q90Var != null) {
            q90Var.mo16938k();
        }
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: g */
    public final long mo2548g(long j) {
        xu5 xu5Var = this.f53133e;
        String str = uma.f64080a;
        return xu5Var.mo2548g(j);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: h */
    public final void mo2549h(long j) {
        xu5 xu5Var = this.f53133e;
        String str = uma.f64080a;
        xu5Var.mo2549h(j);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: i */
    public final boolean mo2550i() {
        xu5 xu5Var = this.f53133e;
        return xu5Var != null && xu5Var.mo2550i();
    }

    /* JADX INFO: renamed from: j */
    public final void m17595j(jv5 jv5Var) {
        long j = this.f53135g;
        if (j == -9223372036854775807L) {
            j = this.f53130b;
        }
        q90 q90Var = this.f53132d;
        q90Var.getClass();
        xu5 xu5VarMo16936c = q90Var.mo16936c(jv5Var, this.f53131c, j);
        this.f53133e = xu5VarMo16936c;
        if (this.f53134f != null) {
            xu5VarMo16936c.mo2553l(this, j);
        }
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: k */
    public final long mo2552k() {
        xu5 xu5Var = this.f53133e;
        String str = uma.f64080a;
        return xu5Var.mo2552k();
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: l */
    public final void mo2553l(wu5 wu5Var, long j) {
        this.f53134f = wu5Var;
        xu5 xu5Var = this.f53133e;
        if (xu5Var != null) {
            long j2 = this.f53135g;
            if (j2 == -9223372036854775807L) {
                j2 = this.f53130b;
            }
            xu5Var.mo2553l(this, j2);
        }
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: m */
    public final k8a mo2554m() {
        xu5 xu5Var = this.f53133e;
        String str = uma.f64080a;
        return xu5Var.mo2554m();
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: o */
    public final boolean mo2556o(oh5 oh5Var) {
        xu5 xu5Var = this.f53133e;
        return xu5Var != null && xu5Var.mo2556o(oh5Var);
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: p */
    public final long mo2557p() {
        xu5 xu5Var = this.f53133e;
        String str = uma.f64080a;
        return xu5Var.mo2557p();
    }

    @Override // p000.xu5
    /* JADX INFO: renamed from: r */
    public final void mo2559r(long j) {
        xu5 xu5Var = this.f53133e;
        String str = uma.f64080a;
        xu5Var.mo2559r(j);
    }
}
