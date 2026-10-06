package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hwu extends hwp implements hjq {

    /* JADX INFO: renamed from: a */
    public final BottomBarController f29729a;

    /* JADX INFO: renamed from: b */
    public final igb f29730b;

    /* JADX INFO: renamed from: c */
    public final gfa f29731c;

    /* JADX INFO: renamed from: e */
    public final hjp f29733e;

    /* JADX INFO: renamed from: h */
    public final hjr f29736h;

    /* JADX INFO: renamed from: i */
    public final hjr f29737i;

    /* JADX INFO: renamed from: j */
    public final drj f29738j;

    /* JADX INFO: renamed from: k */
    public final jfs f29739k;

    /* JADX INFO: renamed from: d */
    public final jwf f29732d = new jwf(false);

    /* JADX INFO: renamed from: f */
    public final hjr f29734f = new hjr(new hwe(this), new hjn[0]);

    /* JADX INFO: renamed from: g */
    public final hjr f29735g = new hjr(new hwf(this), new hjn[0]);

    public hwu(BottomBarController bottomBarController, igb igbVar, gfa gfaVar, jfs jfsVar, drj drjVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f29729a = bottomBarController;
        this.f29730b = igbVar;
        this.f29731c = gfaVar;
        this.f29739k = jfsVar;
        this.f29738j = drjVar;
        hjr hjrVar = new hjr(new hwg(this), new hjn[0]);
        this.f29736h = hjrVar;
        this.f29737i = new hjr(new hwh(this), new hjn[0]);
        hjp hjpVar = new hjp(hjrVar, false);
        this.f29733e = hjpVar;
        hjpVar.m10391f();
    }

    @Override // p000.hwp
    /* JADX INFO: renamed from: a */
    public final void mo10783a() {
        if (this.f29733e.m10386a() == null) {
            return;
        }
        ((hwp) this.f29733e.m10386a().f28059a).mo10783a();
    }

    @Override // p000.hwp
    /* JADX INFO: renamed from: b */
    public final void mo10784b() {
        if (this.f29733e.m10386a() == null) {
            return;
        }
        ((hwp) this.f29733e.m10386a().f28059a).mo10784b();
    }

    @Override // p000.hwp
    /* JADX INFO: renamed from: c */
    public final void mo10785c() {
        if (this.f29733e.m10386a() == null) {
            return;
        }
        ((hwp) this.f29733e.m10386a().f28059a).mo10785c();
    }

    @Override // p000.hwp
    /* JADX INFO: renamed from: cd */
    public final void mo10787cd() {
        if (this.f29733e.m10386a() == null) {
            return;
        }
        ((hwp) this.f29733e.m10386a().f28059a).mo10787cd();
    }

    @Override // p000.hwp
    /* JADX INFO: renamed from: d */
    public final void mo10786d() {
        if (this.f29733e.m10386a() == null) {
            return;
        }
        ((hwp) this.f29733e.m10386a().f28059a).mo10786d();
    }

    @Override // p000.hjq
    /* JADX INFO: renamed from: e */
    public final void mo5710e() {
        this.f29733e.m10387b();
        this.f29734f.mo5710e();
        this.f29735g.mo5710e();
        this.f29736h.mo5710e();
        this.f29737i.mo5710e();
    }

    @Override // p000.hwp, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: f */
    public final void mo5711f() {
        this.f29733e.m10388c();
    }

    @Override // p000.hwp, p000.hjn, p000.hjo
    /* JADX INFO: renamed from: g */
    public final void mo5712g() {
        this.f29733e.m10389d();
    }

    @Override // p000.hwp, p000.hjn
    /* JADX INFO: renamed from: h */
    public final void mo5713h() {
        jbx.m12868m(this);
    }
}
