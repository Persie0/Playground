package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ioe extends iob implements hjq {

    /* JADX INFO: renamed from: a */
    public final oju f31630a;

    /* JADX INFO: renamed from: b */
    public final hjp f31631b;

    /* JADX INFO: renamed from: c */
    public final hjr f31632c;

    /* JADX INFO: renamed from: d */
    public final hjr f31633d;

    public ioe(oju ojuVar) {
        this.f31630a = ojuVar;
        hjr hjrVar = new hjr(new iof(this), new hjn[0]);
        this.f31632c = hjrVar;
        this.f31633d = new hjr(new iog(this), new hjn[0]);
        hjp hjpVar = new hjp(hjrVar, false);
        this.f31631b = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.iob
    /* JADX INFO: renamed from: a */
    public final void mo11559a() {
        if (this.f31631b.m10386a() == null) {
            return;
        }
        ((iob) this.f31631b.m10386a().f28059a).mo11559a();
    }

    @Override // p000.iob
    /* JADX INFO: renamed from: b */
    public final void mo11560b() {
        if (this.f31631b.m10386a() == null) {
            return;
        }
        ((iob) this.f31631b.m10386a().f28059a).mo11560b();
    }

    @Override // p000.iob
    /* JADX INFO: renamed from: c */
    public final void mo11561c() {
        if (this.f31631b.m10386a() == null) {
            return;
        }
        ((iob) this.f31631b.m10386a().f28059a).mo11561c();
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f31631b.m10387b();
        this.f31632c.mo5710e();
        this.f31633d.mo5710e();
    }

    @Override // p000.iob, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f31631b.m10388c();
    }

    @Override // p000.iob, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f31631b.m10389d();
    }

    @Override // p000.iob, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
