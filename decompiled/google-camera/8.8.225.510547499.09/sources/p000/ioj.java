package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ioj extends ior implements hjq {

    /* JADX INFO: renamed from: a */
    public final hjp f31638a;

    /* JADX INFO: renamed from: b */
    public final hjr f31639b;

    /* JADX INFO: renamed from: c */
    public final hjr f31640c;

    public ioj() {
        hjr hjrVar = new hjr(new ioh(this), new hjn[0]);
        this.f31639b = hjrVar;
        this.f31640c = new hjr(new ioi(this), new hjn[0]);
        hjp hjpVar = new hjp(hjrVar, false);
        this.f31638a = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.ioo
    /* JADX INFO: renamed from: a */
    public final void mo11562a() {
        if (this.f31638a.m10386a() == null) {
            return;
        }
        ((ioo) this.f31638a.m10386a().f28059a).mo11562a();
    }

    @Override // p000.ioo
    /* JADX INFO: renamed from: b */
    public final void mo11563b() {
        if (this.f31638a.m10386a() == null) {
            return;
        }
        ((ioo) this.f31638a.m10386a().f28059a).mo11563b();
    }

    @Override // p000.ior, p000.ioo
    /* JADX INFO: renamed from: c */
    public final void mo11564c(ioz iozVar, jwl jwlVar) {
        if (this.f31638a.m10386a() != null) {
            ((ioo) this.f31638a.m10386a().f28059a).mo11564c(iozVar, jwlVar);
        } else {
            this.f31649d = ((ipb) iozVar).f31677f;
            this.f31650e = jwlVar;
        }
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f31638a.m10387b();
        this.f31639b.mo5710e();
        this.f31640c.mo5710e();
    }

    @Override // p000.ioo, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f31638a.m10388c();
    }

    @Override // p000.ioo, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f31638a.m10389d();
    }

    @Override // p000.ioo, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
