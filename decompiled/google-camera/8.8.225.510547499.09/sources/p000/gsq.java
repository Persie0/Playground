package p000;

import com.google.android.apps.camera.progressoverlay.ProgressOverlay;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gsq extends gsn implements hjq {

    /* JADX INFO: renamed from: a */
    public final ProgressOverlay f26231a;

    /* JADX INFO: renamed from: b */
    public boolean f26232b;

    /* JADX INFO: renamed from: c */
    public final hjp f26233c;

    /* JADX INFO: renamed from: d */
    public final hjr f26234d;

    /* JADX INFO: renamed from: e */
    public final hjr f26235e;

    public gsq(ProgressOverlay progressOverlay, gsi gsiVar) {
        jvd.m13538a();
        this.f26231a = progressOverlay;
        hjr hjrVar = new hjr(new gsf(this), new hjn[0]);
        this.f26234d = hjrVar;
        this.f26235e = new hjr(new gsg(this), gsiVar);
        hjp hjpVar = new hjp(hjrVar, false);
        this.f26233c = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.gsn
    /* JADX INFO: renamed from: a */
    public final void mo9701a() {
        if (this.f26233c.m10386a() == null) {
            return;
        }
        ((gsn) this.f26233c.m10386a().f28059a).mo9701a();
    }

    @Override // p000.gsn
    /* JADX INFO: renamed from: b */
    public final void mo9702b() {
        if (this.f26233c.m10386a() == null) {
            return;
        }
        ((gsn) this.f26233c.m10386a().f28059a).mo9702b();
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f26233c.m10387b();
        this.f26234d.mo5710e();
        this.f26235e.mo5710e();
    }

    @Override // p000.gsn, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f26233c.m10388c();
    }

    @Override // p000.gsn, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f26233c.m10389d();
    }

    @Override // p000.gsn, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
