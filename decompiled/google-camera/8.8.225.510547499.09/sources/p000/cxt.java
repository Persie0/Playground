package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
class cxt extends cxp {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ cxu f10002b;

    public cxt(cxu cxuVar) {
        this.f10002b = cxuVar;
    }

    @Override // p000.cxp
    /* JADX INFO: renamed from: a */
    public void mo5706a() {
        if (this.f10002b.f10003f.mo11757h() == this.f10002b.f10010m.m5674v(cxk.LOCKED)) {
            this.f10002b.f10003f.mo11721B(false);
        }
    }

    @Override // p000.cxp
    /* JADX INFO: renamed from: b */
    public void mo5707b() {
        cxu cxuVar = this.f10002b;
        if (cxuVar.f10008k) {
            cxuVar.f10003f.mo11763n();
            if (this.f10002b.f10003f.mo11757h() == this.f10002b.f10010m.m5674v(cxk.LOCKED)) {
                iuj iujVar = this.f10002b.f10003f;
                iujVar.mo11740U(iujVar.mo11752c(false, ikw.VIDEO));
            }
        }
    }

    @Override // p000.cxp
    /* JADX INFO: renamed from: d */
    public void mo5709d() {
        if (this.f10002b.f10003f.mo11757h() == this.f10002b.f10010m.m5674v(cxk.LOCKED)) {
            this.f10002b.f10003f.mo11721B(false);
        }
    }

    @Override // p000.cxp, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f10002b.f10003f.mo11763n();
        this.f10002b.f10003f.mo11729J(iug.OFF);
        float fM5674v = this.f10002b.f10010m.m5674v(cxk.LOCKED);
        if (this.f10002b.f10003f.mo11757h() < fM5674v) {
            this.f10002b.f10003f.mo11740U(fM5674v);
        }
        cxu cxuVar = this.f10002b;
        cxuVar.f10003f.mo11725F(cxuVar.f10010m.m5674v(cxk.LOCKED));
        mrm mrmVar = this.f10002b.f10006i;
        if (mrmVar.mo16813g()) {
            ((dax) mrmVar.mo16809c()).mo5859n();
            this.f10002b.f10009l.m10723a(htd.IDLE);
        }
    }

    @Override // p000.cxp, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f10002b.f10009l.m10723a(htd.HIDDEN);
        this.f10002b.f10003f.mo11722C();
        this.f10002b.f10003f.mo11775z();
        mrm mrmVar = this.f10002b.f10006i;
        if (mrmVar.mo16813g()) {
            ((dax) mrmVar.mo16809c()).mo5847b();
        }
    }
}
