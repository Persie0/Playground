package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class g34 implements z02, n0a, nm1 {

    /* JADX INFO: renamed from: a */
    public final f34 f40110a;

    /* JADX INFO: renamed from: b */
    public final h34 f40111b;

    public g34(f34 f34Var, h34 h34Var) {
        this.f40110a = f34Var;
        this.f40111b = h34Var;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: a */
    public final void mo12312a(g32 g32Var) {
        this.f40111b.mo12312a(g32Var);
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: b */
    public final void mo12313b(Integer num) {
        this.f40111b.f41754f = num;
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: c */
    public final void mo11512c(Integer num) {
        this.f40110a.f38337a.f46618b = num;
    }

    @Override // p000.nm1
    public final Object copy() {
        f34 f34Var = this.f40110a;
        k34 k34Var = f34Var.f38337a;
        f34 f34Var2 = new f34(new k34(k34Var.f46617a, k34Var.f46618b), f34Var.f38338b, f34Var.f38339c, f34Var.f38340d);
        h34 h34Var = this.f40111b;
        return new g34(f34Var2, new h34(h34Var.f41749a, h34Var.f41750b, h34Var.f41751c, h34Var.f41752d, h34Var.f41753e, h34Var.f41754f));
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: d */
    public final Integer mo12314d() {
        return this.f40111b.f41752d;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: e */
    public final void mo12315e(Integer num) {
        this.f40111b.f41752d = num;
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: f */
    public final Integer mo11513f() {
        return this.f40110a.f38337a.f46617a;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: g */
    public final g32 mo12316g() {
        return this.f40111b.mo12316g();
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: h */
    public final Integer mo12317h() {
        return this.f40111b.f41754f;
    }

    @Override // p000.z02
    /* JADX INFO: renamed from: i */
    public final Integer mo11514i() {
        return this.f40110a.f38338b;
    }

    @Override // p000.z02
    /* JADX INFO: renamed from: j */
    public final void mo11515j(Integer num) {
        this.f40110a.f38338b = num;
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: k */
    public final void mo11516k(Integer num) {
        this.f40110a.f38337a.f46617a = num;
    }

    @Override // p000.iab
    /* JADX INFO: renamed from: l */
    public final Integer mo11517l() {
        return this.f40110a.f38337a.f46618b;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: m */
    public final void mo12318m(Integer num) {
        this.f40111b.f41749a = num;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: n */
    public final Integer mo12319n() {
        return this.f40111b.f41749a;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: o */
    public final Integer mo12320o() {
        return this.f40111b.f41753e;
    }

    @Override // p000.n0a
    /* JADX INFO: renamed from: p */
    public final void mo12321p(Integer num) {
        this.f40111b.f41753e = num;
    }
}
