package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gwn extends gwg implements hjq {

    /* JADX INFO: renamed from: a */
    public final fcp f26594a;

    /* JADX INFO: renamed from: b */
    public final ohb f26595b;

    /* JADX INFO: renamed from: c */
    public final hjp f26596c;

    /* JADX INFO: renamed from: d */
    public final hjr f26597d = new hjr(new gvz(this), new hjn[0]);

    /* JADX INFO: renamed from: e */
    public final hjr f26598e = new hjr(new gwa(this), new hjn[0]);

    /* JADX INFO: renamed from: f */
    public final hjr f26599f;

    /* JADX INFO: renamed from: g */
    public final hjr f26600g;

    /* JADX INFO: renamed from: h */
    private final BottomBarController f26601h;

    /* JADX INFO: renamed from: i */
    private final jwn f26602i;

    /* JADX INFO: renamed from: j */
    private final hai f26603j;

    /* JADX INFO: renamed from: k */
    private final ilo f26604k;

    /* JADX INFO: renamed from: l */
    private final hmy f26605l;

    public gwn(fcp fcpVar, BottomBarController bottomBarController, ohb ohbVar, ilo iloVar, hmy hmyVar, jww jwwVar, hai haiVar) {
        this.f26594a = fcpVar;
        this.f26595b = ohbVar;
        this.f26601h = bottomBarController;
        this.f26604k = iloVar;
        this.f26605l = hmyVar;
        this.f26602i = jwwVar;
        this.f26603j = haiVar;
        hjr hjrVar = new hjr(new gwb(this), new hjn[0]);
        this.f26599f = hjrVar;
        this.f26600g = new hjr(new gwc(this), new hjn[0]);
        hjp hjpVar = new hjp(hjrVar, false);
        this.f26596c = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.gwg
    /* JADX INFO: renamed from: a */
    public final void mo9814a() {
        if (this.f26596c.m10386a() == null) {
            return;
        }
        ((gwg) this.f26596c.m10386a().f28059a).mo9814a();
    }

    @Override // p000.gwg
    /* JADX INFO: renamed from: b */
    public final void mo9815b() {
        if (this.f26596c.m10386a() == null) {
            return;
        }
        ((gwg) this.f26596c.m10386a().f28059a).mo9815b();
    }

    @Override // p000.gwg
    /* JADX INFO: renamed from: c */
    public final void mo9847c() {
        if (this.f26596c.m10386a() == null) {
            return;
        }
        ((gwg) this.f26596c.m10386a().f28059a).mo9847c();
    }

    @Override // p000.gwg
    /* JADX INFO: renamed from: d */
    public final void mo9848d() {
        if (this.f26596c.m10386a() == null) {
            return;
        }
        ((gwg) this.f26596c.m10386a().f28059a).mo9848d();
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f26596c.m10387b();
        this.f26597d.mo5710e();
        this.f26598e.mo5710e();
        this.f26599f.mo5710e();
        this.f26600g.mo5710e();
    }

    @Override // p000.gwg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f26596c.m10388c();
    }

    @Override // p000.gwg, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f26596c.m10389d();
    }

    @Override // p000.gwg, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }

    /* JADX INFO: renamed from: i */
    public final void m9855i() {
        this.f26601h.setSelfieFlashState(true);
        this.f26603j.mo10033e(gzy.f27062u, true);
        if (m9857k()) {
            this.f26604k.m11439b(((gwq) this.f26595b.get()).mo9859a());
        } else {
            this.f26604k.m11440c();
        }
        this.f26605l.m10480a(1812);
        ((gwq) this.f26595b.get()).mo9863e(m9857k());
    }

    /* JADX INFO: renamed from: j */
    public final void m9856j() {
        this.f26601h.setSelfieFlashState(false);
        this.f26604k.m11438a();
        ((gwq) this.f26595b.get()).mo9862d();
        this.f26603j.mo10033e(gzy.f27062u, false);
        this.f26605l.m10480a(1797);
    }

    /* JADX INFO: renamed from: k */
    public final boolean m9857k() {
        return ((ikw) this.f26602i.mo3831be()) == ikw.LONG_EXPOSURE;
    }
}
