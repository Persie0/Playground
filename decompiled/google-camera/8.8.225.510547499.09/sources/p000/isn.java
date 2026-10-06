package p000;

import com.google.android.apps.camera.zoomui.view.ZoomUi;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class isn extends iuc implements hjq {

    /* JADX INFO: renamed from: a */
    public final hjp f31992a;

    /* JADX INFO: renamed from: b */
    public final hjr f31993b;

    /* JADX INFO: renamed from: c */
    public final hjr f31994c;

    public isn(ZoomUi zoomUi, itx itxVar) {
        super(zoomUi);
        hjr hjrVar = new hjr(new isl(this), new hjn[0]);
        this.f31993b = hjrVar;
        this.f31994c = new hjr(new ism(this), itxVar);
        hjp hjpVar = new hjp(hjrVar, false);
        this.f31992a = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.itz
    /* JADX INFO: renamed from: a */
    public final void mo11692a() {
        if (this.f31992a.m10386a() == null) {
            return;
        }
        ((itz) this.f31992a.m10386a().f28059a).mo11692a();
    }

    @Override // p000.itz
    /* JADX INFO: renamed from: b */
    public final void mo11693b() {
        if (this.f31992a.m10386a() == null) {
            return;
        }
        ((itz) this.f31992a.m10386a().f28059a).mo11693b();
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f31992a.m10387b();
        this.f31993b.mo5710e();
        this.f31994c.mo5710e();
    }

    @Override // p000.itz, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f31992a.m10388c();
    }

    @Override // p000.itz, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f31992a.m10389d();
    }

    @Override // p000.itz, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
