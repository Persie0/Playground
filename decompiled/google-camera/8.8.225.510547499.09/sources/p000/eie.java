package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class eie extends eka implements hjq {

    /* JADX INFO: renamed from: a */
    public final hjp f14125a;

    /* JADX INFO: renamed from: b */
    public final hjr f14126b;

    /* JADX INFO: renamed from: c */
    public final hjr f14127c;

    public eie(igb igbVar, BottomBarController bottomBarController, gfa gfaVar, eiw eiwVar, jfs jfsVar, byte[] bArr, byte[] bArr2) {
        super(igbVar, bottomBarController, gfaVar, eiwVar, jfsVar, null, null);
        hjr hjrVar = new hjr(new eic(this), new hjn[0]);
        this.f14126b = hjrVar;
        this.f14127c = new hjr(new eid(this), new hjn[0]);
        hjp hjpVar = new hjp(hjrVar, false);
        this.f14125a = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.ejx
    /* JADX INFO: renamed from: a */
    public final void mo7350a() {
        if (this.f14125a.m10386a() == null) {
            return;
        }
        ((ejx) this.f14125a.m10386a().f28059a).mo7350a();
    }

    @Override // p000.ejx
    /* JADX INFO: renamed from: b */
    public final void mo7351b() {
        if (this.f14125a.m10386a() == null) {
            return;
        }
        ((ejx) this.f14125a.m10386a().f28059a).mo7351b();
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f14125a.m10387b();
        this.f14126b.mo5710e();
        this.f14127c.mo5710e();
    }

    @Override // p000.eka, p000.ejx, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        super.mo5711f();
        this.f14125a.m10388c();
    }

    @Override // p000.eka, p000.ejx, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        super.mo5712g();
        this.f14125a.m10389d();
    }

    @Override // p000.ejx, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
