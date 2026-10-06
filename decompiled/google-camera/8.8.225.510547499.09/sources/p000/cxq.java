package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class cxq extends cxp {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ cxu f9999b;

    public cxq(cxu cxuVar) {
        this.f9999b = cxuVar;
    }

    @Override // p000.cxp
    /* JADX INFO: renamed from: a */
    public void mo5706a() {
    }

    @Override // p000.cxp
    /* JADX INFO: renamed from: b */
    public void mo5707b() {
    }

    @Override // p000.cxp
    /* JADX INFO: renamed from: c */
    public void mo5708c() {
    }

    @Override // p000.cxp, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f9999b.f10003f.mo11763n();
        this.f9999b.f10003f.mo11729J(iug.ALL);
        cxu cxuVar = this.f9999b;
        cxuVar.f10003f.mo11724E(((Float) cxuVar.f10005h.mo6180h(dhh.f11049B).get()).floatValue() / this.f9999b.f10010m.m5673u());
        cxu cxuVar2 = this.f9999b;
        cxuVar2.f10003f.mo11725F(cxuVar2.f10010m.m5674v(cxk.ACTIVE));
        this.f9999b.f10003f.mo11723D(StrictMath.max(this.f9999b.f10003f.mo11754e(), this.f9999b.f10003f.mo11757h() / this.f9999b.f10010m.m5673u()));
        this.f9999b.f10003f.mo11765p();
    }

    @Override // p000.cxp, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f9999b.f10003f.mo11722C();
        this.f9999b.f10003f.mo11774y();
        this.f9999b.f10003f.mo11775z();
        if (this.f9999b.f10007j.m5900i()) {
            float fRound = Math.round((this.f9999b.f10003f.mo11757h() * this.f9999b.f10010m.m5673u()) * 100.0f) / 100.0f;
            if (fRound >= this.f9999b.f10003f.mo11753d()) {
                fRound = this.f9999b.f10003f.mo11753d();
            }
            this.f9999b.f10003f.mo11723D(fRound);
        }
    }
}
